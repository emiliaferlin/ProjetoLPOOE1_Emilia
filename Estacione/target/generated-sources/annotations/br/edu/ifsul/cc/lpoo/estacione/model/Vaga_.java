package br.edu.ifsul.cc.lpoo.estacione.model;

import br.edu.ifsul.cc.lpoo.estacione.model.Carro;
import br.edu.ifsul.cc.lpoo.estacione.model.Estacionamento;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-07-16T09:20:26", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Vaga.class)
public class Vaga_ { 

    public static volatile SingularAttribute<Vaga, Estacionamento> estacionamento;
    public static volatile SingularAttribute<Vaga, Carro> carro;
    public static volatile SingularAttribute<Vaga, Integer> numero;
    public static volatile SingularAttribute<Vaga, Boolean> disponivel;
    public static volatile SingularAttribute<Vaga, Integer> id;

}