/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.clinicamedica_logicaapp;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author alexs
 */
@Entity
@Table(name = "Medicos")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorValue(value = "1")
public class Medico extends Pessoa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name = "crm", length = 500, nullable = false)
    private String crm;
    
    @ManyToOne
    @JoinColumn(name = "especializacao_fk")
    private Especialidade especializacao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public Especialidade getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(Especialidade especializacao) {
        this.especializacao = especializacao;
    }

    public Medico(Long id, String crm, Especialidade especializacao) {
        this.id = id;
        this.crm = crm;
        this.especializacao = especializacao;
    }
    
    public Medico() {
        this.id = 0L;
        this.crm = "";
        this.especializacao = null;
    }
    
    public Medico(String nome, String crm, Especialidade especializacao) {
        this.id = 0L;
        this.setNome(nome);
        this.crm = "";
        this.especializacao = especializacao;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Medico)) {
            return false;
        }
        Medico other = (Medico) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.ifnmg.clinicamedica_logicaapp.Medico[ id=" + id + " ]";
    }
    
}