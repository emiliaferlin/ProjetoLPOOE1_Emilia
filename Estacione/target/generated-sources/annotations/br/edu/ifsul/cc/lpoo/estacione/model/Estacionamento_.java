package br.edu.ifsul.cc.lpoo.estacione.model;

import br.edu.ifsul.cc.lpoo.estacione.model.Carro;
import br.edu.ifsul.cc.lpoo.estacione.model.Vaga;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-07-16T09:20:26", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Estacionamento.class)
public class Estacionamento_ { 

    public static volatile ListAttribute<Estacionamento, Vaga> vagas;
    public static volatile SingularAttribute<Estacionamento, Integer> capacidade;
    public static volatile SingularAttribute<Estacionamento, String> nome;
    public static volatile ListAttribute<Estacionamento, Carro> carrosEstacionados;
    public static volatile SingularAttribute<Estacionamento, Integer> id;

}