package br.edu.ifnmg.clinicamedica_logicaapp;

import br.edu.ifnmg.clinicamedica_logicaapp.Atendimento;
import br.edu.ifnmg.clinicamedica_logicaapp.FormaPagamento;
import br.edu.ifnmg.clinicamedica_logicaapp.Usuario;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-02-24T19:46:40", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Pagamento.class)
public class Pagamento_ { 

    public static volatile SingularAttribute<Pagamento, Date> dataPagamento;
    public static volatile SingularAttribute<Pagamento, Integer> qtdParcelas;
    public static volatile SingularAttribute<Pagamento, Date> dataVencimento;
    public static volatile SingularAttribute<Pagamento, Usuario> usuario;
    public static volatile SingularAttribute<Pagamento, Long> id;
    public static volatile SingularAttribute<Pagamento, Atendimento> atendimento;
    public static volatile SingularAttribute<Pagamento, FormaPagamento> pagamento;

}