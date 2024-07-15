package br.edu.ifsul.cc.lpoo.estacione.model;

import br.edu.ifsul.cc.lpoo.estacione.model.Carro;
import java.util.Calendar;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-07-14T21:37:14", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Ticket.class)
public class Ticket_ { 

    public static volatile SingularAttribute<Ticket, Carro> carro;
    public static volatile SingularAttribute<Ticket, Integer> numero;
    public static volatile SingularAttribute<Ticket, Calendar> horaEntrada;
    public static volatile SingularAttribute<Ticket, Float> valorTotal;
    public static volatile SingularAttribute<Ticket, Calendar> horaSaida;
    public static volatile SingularAttribute<Ticket, Integer> id;

}