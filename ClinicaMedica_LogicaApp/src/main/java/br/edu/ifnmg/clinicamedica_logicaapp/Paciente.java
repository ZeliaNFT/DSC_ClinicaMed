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
import javax.persistence.Table;

/**
 *
 * @author alexs
 */
@Entity
@Table(name = "Pacientes")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorValue(value = "2")
public class Paciente extends Pessoa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "historico", length = 500, nullable = false)
    private String historico;
    
    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }
    
    public Paciente(){
        this.getGenero();
        this.getNome();
        this.getCpf();
        this.getEmail();
        this.getTelefone();
        this.getEndereco();
        this.id = 0L;
        this.historico = "";
    }
    public Paciente(TipoGenero genero, String nome, String cpf, String email, String telefone, String endereco, String historico){
        this.setGenero(genero);
        this.setNome(nome);
        this.setCpf(cpf);
        this.setEmail(email);
        this.setTelefone(telefone);
        this.setEndereco(endereco);
        this.historico = historico;
    }
    
    public Paciente(String nome){
        this.setNome(nome);
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
        if (!(object instanceof Paciente)) {
            return false;
        }
        Paciente other = (Paciente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.ifnmg.clinicamedica_logicaapp.Paciente[ id=" + id + " ]";
    }
    
}