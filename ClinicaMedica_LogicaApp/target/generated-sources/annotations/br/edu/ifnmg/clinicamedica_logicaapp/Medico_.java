package br.edu.ifnmg.clinicamedica_logicaapp;

import br.edu.ifnmg.clinicamedica_logicaapp.Especialidade;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-03-09T19:19:35", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Medico.class)
public class Medico_ extends Pessoa_ {

    public static volatile SingularAttribute<Medico, Especialidade> especializacao;
    public static volatile SingularAttribute<Medico, String> crm;

}