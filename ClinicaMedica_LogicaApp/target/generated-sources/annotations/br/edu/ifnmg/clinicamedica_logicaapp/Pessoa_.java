package br.edu.ifnmg.clinicamedica_logicaapp;

import br.edu.ifnmg.clinicamedica_logicaapp.PessoaTipo;
import br.edu.ifnmg.clinicamedica_logicaapp.TipoGenero;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-02-24T19:46:40", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Pessoa.class)
public class Pessoa_ { 

    public static volatile SingularAttribute<Pessoa, String> telefone;
    public static volatile SingularAttribute<Pessoa, PessoaTipo> tipo;
    public static volatile SingularAttribute<Pessoa, String> endereco;
    public static volatile SingularAttribute<Pessoa, TipoGenero> genero;
    public static volatile SingularAttribute<Pessoa, String> cpf;
    public static volatile SingularAttribute<Pessoa, String> nome;
    public static volatile SingularAttribute<Pessoa, Long> id;
    public static volatile SingularAttribute<Pessoa, Date> dataNascimento;
    public static volatile SingularAttribute<Pessoa, String> email;

}