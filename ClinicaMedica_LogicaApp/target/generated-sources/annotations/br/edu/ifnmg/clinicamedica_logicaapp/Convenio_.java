package br.edu.ifnmg.clinicamedica_logicaapp;

import br.edu.ifnmg.clinicamedica_logicaapp.Pagamento;
import java.math.BigDecimal;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-03-14T22:55:40", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Convenio.class)
public class Convenio_ extends Pagamento_ {

    public static volatile SingularAttribute<Convenio, BigDecimal> valorDesconto;
    public static volatile SingularAttribute<Convenio, String> nomeConvenio;
    public static volatile SingularAttribute<Convenio, Pagamento> convenio;

}