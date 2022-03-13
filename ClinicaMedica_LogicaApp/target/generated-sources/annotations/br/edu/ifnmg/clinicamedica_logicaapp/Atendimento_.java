package br.edu.ifnmg.clinicamedica_logicaapp;

import br.edu.ifnmg.clinicamedica_logicaapp.Atendimento;
import br.edu.ifnmg.clinicamedica_logicaapp.AtendimentoSituacoes;
import br.edu.ifnmg.clinicamedica_logicaapp.Especialidade;
import br.edu.ifnmg.clinicamedica_logicaapp.Medico;
import br.edu.ifnmg.clinicamedica_logicaapp.Paciente;
import br.edu.ifnmg.clinicamedica_logicaapp.TipoAtendimento;
import br.edu.ifnmg.clinicamedica_logicaapp.Usuario;
import java.math.BigDecimal;
import java.sql.Time;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-03-12T23:39:16", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Atendimento.class)
public class Atendimento_ { 

    public static volatile SingularAttribute<Atendimento, Integer> qtdDiasRetorno;
    public static volatile SingularAttribute<Atendimento, AtendimentoSituacoes> situacao;
    public static volatile SingularAttribute<Atendimento, String> prescricao;
    public static volatile SingularAttribute<Atendimento, Especialidade> especialidade;
    public static volatile SingularAttribute<Atendimento, BigDecimal> valor;
    public static volatile SingularAttribute<Atendimento, String> motivoCancel;
    public static volatile SingularAttribute<Atendimento, Time> horaInicio;
    public static volatile SingularAttribute<Atendimento, Atendimento> atendimentoPai;
    public static volatile SingularAttribute<Atendimento, Time> horaFim;
    public static volatile ListAttribute<Atendimento, Atendimento> retornos;
    public static volatile SingularAttribute<Atendimento, Date> dataAtendimento;
    public static volatile SingularAttribute<Atendimento, Paciente> paciente;
    public static volatile SingularAttribute<Atendimento, Medico> medico;
    public static volatile SingularAttribute<Atendimento, TipoAtendimento> atendimentoTipo;
    public static volatile SingularAttribute<Atendimento, String> motivoRetorno;
    public static volatile SingularAttribute<Atendimento, Usuario> usuario;
    public static volatile SingularAttribute<Atendimento, Long> id;

}