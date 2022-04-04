/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.clinicamedica_logicaapp;

import java.io.Serializable;
import java.util.Date;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "crm", length = 500, nullable = false)
    private String crm;
    
    @ManyToOne
    @JoinColumn(name = "especializacao_fk")
    private Especialidade especializacao;

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

    public Medico(TipoGenero genero, String nome, String cpf, String email, String telefone, String endereco, String crm, Especialidade especializacao) {
        this.setGenero(genero);
        this.setNome(nome);
        this.setCpf(cpf);
        this.setEmail(email);
        this.setTelefone(telefone);
        this.setEndereco(endereco);
        this.crm = crm;
        this.especializacao = especializacao;
    }
    
    public Medico() {
        this.id = 0L;
        this.getGenero();
        this.getNome();
        this.getCpf();
        this.getEmail();
        this.getTelefone();
        this.getEndereco();
        this.crm = "";
        this.especializacao = null;
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