/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.clinicamedica_logicaapp;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author alexs
 */
@Entity
@Table(name = "Convenios")
public class Convenio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    @Column(name = "nomeConvenio", length = 500, nullable = true)
    private String nomeConvenio;
    
    @Column(name = "valorDesconto", nullable = false)
    private BigDecimal valorDesconto;

    public String getNomeConvenio() {
        return nomeConvenio;
    }

    public void setNomeConvenio(String nomeConvenio) {
        this.nomeConvenio = nomeConvenio;
    }

    public BigDecimal getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(BigDecimal valorDesconto) {
        this.valorDesconto = valorDesconto;
    }
    
    public Convenio(Long id, String nomeConvenio, BigDecimal valorDesconto) {
        this.id = id;
        this.nomeConvenio = nomeConvenio;
        this.valorDesconto = valorDesconto;
    }
    
    public Convenio(){
        this.id = 0L;
        this.nomeConvenio = "";
        this.valorDesconto = new BigDecimal("0.00");
    }
    
    public Convenio(String nomeConvenio, String valorDesconto){
        this.id = 0L;
        this.nomeConvenio = nomeConvenio;
        this.valorDesconto = new BigDecimal(valorDesconto);
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
        if (!(object instanceof Convenio)) {
            return false;
        }
        Convenio other = (Convenio) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.ifnmg.clinicamedica_logicaapp.Convenio[ id=" + id + " ]";
    }
    
}
