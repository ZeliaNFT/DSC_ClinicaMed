/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.clinicamedica_logicaapp;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author alexs
 */
@Entity
@Table(name = "Atendimentos")
public class Atendimento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "dataAtendimento", nullable = true)
    //Recomendação do NetBeans @Temporal
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataAtendimento;
    
    @Column(name = "horaInicio", nullable = true)
    private Time horaInicio;
    
    @Column(name = "horaFim", nullable = true)
    private Time horaFim;
    
    @Enumerated (EnumType.ORDINAL)
    private AtendimentoSituacoes situacao;
    
    @Enumerated (EnumType.ORDINAL)
    private TipoAtendimento atendimentoTipo;
    
    @Column(name = "motivoCancel", length = 5000, nullable = true)
    private String motivoCancel;
    
    @Column(name = "valor", nullable = false)
    private BigDecimal valor;
    
    @Column(name = "motivoRetorno", length = 5000, nullable = true)
    private String motivoRetorno;
    
    @Column(name = "qtdDiasRetorno", nullable = true)
    private int qtdDiasRetorno;
    
    @Column(name = "prescricao", length = 5000, nullable = true)
    private String prescricao;
    
    @ManyToOne
    @JoinColumn(name = "atendimentoPai_fk")
    private Atendimento atendimentoPai;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "atendimentoPai")
    private List<Atendimento> retornos;    
    
    @ManyToOne
    @JoinColumn(name = "medico_fk")
    private Medico medico;
    
    @ManyToOne
    @JoinColumn(name = "paciente_fk")
    private Paciente paciente;
    
    @ManyToOne
    @JoinColumn(name = "usuario_fk")
    private Usuario usuario;
    
    @ManyToOne
    @JoinColumn(name = "especialidade_fk")
    private Especialidade especialidade;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDataAtendimento() {
        return dataAtendimento;
    }

    public void setDataAtendimento(Date dataAtendimento) {
        this.dataAtendimento = dataAtendimento;
    }

    public Time getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Time horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Time getHoraFim() {
        return horaFim;
    }

    public void setHoraFim(Time horaFim) {
        this.horaFim = horaFim;
    }

    public AtendimentoSituacoes getSituacao() {
        return situacao;
    }

    public void setSituacao(AtendimentoSituacoes situacao) {
        this.situacao = situacao;
    }

    public TipoAtendimento getAtendimentoTipo() {
        return atendimentoTipo;
    }

    public void setAtendimentoTipo(TipoAtendimento atendimentoTipo) {
        this.atendimentoTipo = atendimentoTipo;
    }

    public String getMotivoCancel() {
        return motivoCancel;
    }

    public void setMotivoCancel(String motivoCancel) {
        this.motivoCancel = motivoCancel;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public String getMotivoRetorno() {
        return motivoRetorno;
    }

    public void setMotivoRetorno(String motivoRetorno) {
        this.motivoRetorno = motivoRetorno;
    }

    public int getQtdDiasRetorno() {
        return qtdDiasRetorno;
    }

    public void setQtdDiasRetorno(int qtdDiasRetorno) {
        this.qtdDiasRetorno = qtdDiasRetorno;
    }

    public String getPrescricao() {
        return prescricao;
    }

    public void setPrescricao(String prescricao) {
        this.prescricao = prescricao;
    }

    public Atendimento getAtendimentoPai() {
        return atendimentoPai;
    }

    public void setAtendimentoPai(Atendimento atendimentoPai) {
        this.atendimentoPai = atendimentoPai;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Atendimento> getRetornos() {
        return retornos;
    }

    public void setRetornos(List<Atendimento> retornos) {
        this.retornos = retornos;
    }

    public Atendimento(Long id, Date dataAtendimento, Time horaInicio, Time horaFim, AtendimentoSituacoes situacao, TipoAtendimento atendimentoTipo, String motivoCancel, BigDecimal valor, String motivoRetorno, int qtdDiasRetorno, String prescricao, Atendimento atendimentoPai, List<Atendimento> retornos, Medico medico, Paciente paciente, Usuario usuario, Especialidade especialidade) {
        this.id = id;
        this.dataAtendimento = dataAtendimento;
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
        this.situacao = situacao;
        this.atendimentoTipo = atendimentoTipo;
        this.motivoCancel = motivoCancel;
        this.valor = valor;
        this.motivoRetorno = motivoRetorno;
        this.qtdDiasRetorno = qtdDiasRetorno;
        this.prescricao = prescricao;
        this.atendimentoPai = atendimentoPai;
        this.retornos = retornos;
        this.medico = medico;
        this.paciente = paciente;
        this.usuario = usuario;
        this.especialidade = especialidade;
    }
    
    public Atendimento(){
        this.id = 0L;
        this.dataAtendimento = new Date();
        this.horaInicio = new Time(0L);
        this.horaFim = new Time(0L);
        this.situacao = AtendimentoSituacoes.Agendado;
        this.atendimentoTipo = TipoAtendimento.Consulta;
        this.motivoCancel = "";
        this.valor = new BigDecimal("0.00");
        this.motivoRetorno = "";
        this.qtdDiasRetorno = 0;
        this.prescricao = "";
        this.atendimentoPai = Atendimento.this;
        this.medico = null;
        this.paciente = null;
        this.usuario = null;
        this.retornos = new ArrayList<>();
    }
    
    public Atendimento(Medico medico, Paciente paciente, Usuario usuario, TipoAtendimento atendimentoTipo){
        this.id = 0L;
        this.dataAtendimento = new Date();
        this.horaInicio = new Time(0L);
        this.horaFim = new Time(0L);
        this.situacao = AtendimentoSituacoes.Agendado;
        this.atendimentoTipo = atendimentoTipo;
        this.motivoCancel = "";
        this.valor = new BigDecimal("0.00");
        this.motivoRetorno = "";
        this.qtdDiasRetorno = 0;
        this.prescricao = "";
        this.atendimentoPai = Atendimento.this;
        this.medico = medico;
        this.paciente = paciente;
        this.usuario = usuario;
        this.retornos = new ArrayList<>();
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
        if (!(object instanceof Atendimento)) {
            return false;
        }
        Atendimento other = (Atendimento) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.valor.toString();
    }
    
}
