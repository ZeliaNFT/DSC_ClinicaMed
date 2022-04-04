/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.clinicamedica_logicaapp;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
//import javax.persistence.DiscriminatorColumn;
//import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 *
 * @author alexs
 */
@Entity
@Table(name = "Pessoas")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(discriminatorType = DiscriminatorType.INTEGER, name = "tipo")

public class Pessoa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "nome", length = 500, nullable = false)
    private String nome;
    
    @Column(name = "cpf", length = 11, nullable = false)
    private String cpf;
    
    @Enumerated (EnumType.ORDINAL)
    private TipoGenero genero;
    
    //Importação SQL ou Util
    @Column(name = "dataNascimento", nullable = true)
    //Recomendação do NetBeans @Temporal
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataNascimento;
    
    @Column(name = "email", nullable = true)
    private String email;
    
    @Column(name = "telefone", length = 11, nullable = true)
    private String telefone;
    
    @Column(name = "endereco", length = 100, nullable = true)
    private String endereco;
    
    @Enumerated(EnumType.ORDINAL)
    private PessoaTipo tipo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public TipoGenero getGenero() {
        return genero;
    }

    public void setGenero(TipoGenero genero) {
        this.genero = genero;
    }

    public PessoaTipo getTipo() {
        return tipo;
    }

    public void setTipo(PessoaTipo tipo) {
        this.tipo = tipo;
    }

    public Pessoa(Long id, String nome, String cpf, TipoGenero genero, Date dataNascimento, String email, String telefone, String endereco, PessoaTipo tipo) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.genero = genero;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
        this.tipo = tipo;
    }
    public Pessoa() {
        this.id = 0L;
        this.nome = "";
        this.cpf = "";
        this.genero = TipoGenero.Masculino;
        this.dataNascimento = new Date();
        this.email = "";
        this.telefone = "";
        this.endereco = "";
        this.tipo = PessoaTipo.Medico;
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
        if (!(object instanceof Pessoa)) {
            return false;
        }
        Pessoa other = (Pessoa) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.ifnmg.teste.Pessoa[ id=" + id + " ]";
    }
    
}