/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.estacione.test;

import br.edu.ifsul.cc.lpoo.estacione.dao.PersistenciaJPA;
import br.edu.ifsul.cc.lpoo.estacione.model.Carro;
import br.edu.ifsul.cc.lpoo.estacione.model.Estacionamento;
import br.edu.ifsul.cc.lpoo.estacione.model.Ticket;
import br.edu.ifsul.cc.lpoo.estacione.model.Vaga;
import java.util.Calendar;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Mili
 */
public class TestePersistenciaJPA {
    
    PersistenciaJPA jpa = new PersistenciaJPA();
    
    public TestePersistenciaJPA() {
    }
    
   
    @Before // o que fazer antes da persistencia
    public void setUp() {
        jpa.conexaoAberta();
    }
    
    @After
    public void tearDown() {
        jpa.fecharConexao();
    }
    
    
    @Test
    public void testeEstacione() throws Exception {
        //Instancias Estacionamento
        Estacionamento estacione = new Estacionamento();
        
        //Instancias Carros
        Carro fiesta = new Carro();
        
        //Instancias Vagas
        Vaga primeira = new Vaga();

        //Instancias Ticket
        Ticket ticket1 = new Ticket();
        
        //Horas
        Calendar calendarInicio = Calendar.getInstance();
        Calendar calendarFinal = Calendar.getInstance();
        int horaInicio = calendarInicio.get(Calendar.HOUR);
        int horaFinal = calendarFinal.get(Calendar.HOUR + 2);
        
        //set Estacionamento
        estacione.setNome("Estacione Bem");
        estacione.setCapacidade(10);
       
        
        //set Carro
        fiesta.setPlaca("AAA1111");
        fiesta.setModelo("New Fiesta");
        fiesta.setCor("Prata");
        fiesta.setEstacionamento(estacione);

        
        //set Ticket
        ticket1.setNumero(100);
        ticket1.setHoraEntrada(horaInicio);
        ticket1.setHoraSaida(horaFinal);
        ticket1.setValorTotal(12.00);
        ticket1.setCarro(fiesta);
        
        //set Vaga
        primeira.setNumero(10);
        primeira.setDisponivel(true);
        primeira.setEstacionamento(estacione);
        primeira.setCarro(fiesta);

        
        jpa.persist(estacione);
        jpa.persist(fiesta);
        jpa.persist(primeira);
        jpa.persist(ticket1);

        // buscar objeto persistido
        //Estacionamento persistidoModalidade = (Estacionamento) jpa.find(Estacionamento.class, estacione.getId());//ver se tem necessidade de fazer o mesmo pro m2 e m3

        // verificar se objeto persistido é igual ao criado
        //Assert.assertEquals(estacione.getNome(), persistidoModalidade.getNome());

    }
    
}
