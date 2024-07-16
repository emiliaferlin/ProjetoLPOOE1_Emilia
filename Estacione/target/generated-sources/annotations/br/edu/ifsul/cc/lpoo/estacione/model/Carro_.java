package br.edu.ifsul.cc.lpoo.estacione.model;

import br.edu.ifsul.cc.lpoo.estacione.model.Estacionamento;
import br.edu.ifsul.cc.lpoo.estacione.model.Ticket;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-07-16T11:06:50", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Carro.class)
public class Carro_ { 

    public static volatile SingularAttribute<Carro, Estacionamento> estacionamento;
    public static volatile SingularAttribute<Carro, Ticket> ticket;
    public static volatile SingularAttribute<Carro, String> cor;
    public static volatile SingularAttribute<Carro, Integer> id;
    public static volatile SingularAttribute<Carro, String> modelo;
    public static volatile SingularAttribute<Carro, String> placa;

}