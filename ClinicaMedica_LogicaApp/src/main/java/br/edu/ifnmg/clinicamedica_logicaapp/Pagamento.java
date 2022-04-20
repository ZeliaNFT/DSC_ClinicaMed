/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.clinicamedica_logicaapp;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author alexs
 */
@Entity
@Table(name = "Pagamentos")
public class Pagamento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "dataPagamento", nullable = true)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataPagamento;

    @Enumerated (EnumType.ORDINAL)
    private FormaPagamento pagamento;
    
    @Column(name = "qtdParcelas", nullable = false)
    private int qtdParcelas;
    
    @Column(name = "dataVencimento", nullable = true)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataVencimento;
    
    @ManyToOne
    @JoinColumn(name = "atedimento_fk")
    private Atendimento atendimento;
    
    @ManyToOne
    @JoinColumn(name = "usuario_fk")
    private Usuario usuario;
    
    @ManyToOne
    @JoinColumn(name = "convenio_fk")
    private Convenio convenio;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public FormaPagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(FormaPagamento pagamento) {
        this.pagamento = pagamento;
    }

    public int getQtdParcelas() {
        return qtdParcelas;
    }

    public void setQtdParcelas(int qtdParcelas) {
        this.qtdParcelas = qtdParcelas;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Atendimento getAtendimento() {
        return atendimento;
    }

    public void setAtendimento(Atendimento atendimento) {
        this.atendimento = atendimento;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Convenio getConvenio() {
        return convenio;
    }

    public void setConvenio(Convenio convenio) {
        this.convenio = convenio;
    }
    
     public Pagamento() {
        this.id = 0L;
        this.dataPagamento = new Date();
        this.pagamento = FormaPagamento.Dinheiro;
        this.qtdParcelas = 0;
        this.dataVencimento = new Date();
        this.atendimento = null;
        this.usuario = null;
        this.convenio = null;
    }

    public Pagamento(Long id, Date dataPagamento, FormaPagamento pagamento, int qtdParcelas, Date dataVencimento, Atendimento atendimento, Usuario usuario, Convenio convenio) {
        this.id = id;
        this.dataPagamento = dataPagamento;
        this.pagamento = pagamento;
        this.qtdParcelas = qtdParcelas;
        this.dataVencimento = dataVencimento;
        this.atendimento = atendimento;
        this.usuario = usuario;
        this.convenio = convenio;
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
        if (!(object instanceof Pagamento)) {
            return false;
        }
        Pagamento other = (Pagamento) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.ifnmg.clinicamedica_logicaapp.Pagamento[ id=" + id + " ]";
    }
}
