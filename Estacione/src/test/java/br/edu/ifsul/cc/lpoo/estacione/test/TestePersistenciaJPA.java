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
        // Instâncias Estacionamento
        Estacionamento estacione = new Estacionamento();
        
        // Instâncias Carros
        Carro fiesta = new Carro();
        Carro uno = new Carro();
        Carro fusca = new Carro();
        
        // Instâncias Vagas
        Vaga primeiraVaga = new Vaga();
        Vaga segundaVaga = new Vaga();
        Vaga terceiraVaga = new Vaga();
        Vaga quartaVaga = new Vaga();

        // Instâncias Ticket
        Ticket ticket1 = new Ticket();
        Ticket ticket2 = new Ticket();
        Ticket ticket3 = new Ticket();
        
        // Horas
        Calendar calendarInicio = Calendar.getInstance();
        Calendar calendarFinal = Calendar.getInstance();
        int horaInicio = calendarInicio.get(Calendar.HOUR_OF_DAY);
        calendarFinal.add(Calendar.HOUR, 2);
        int horaFinal = calendarFinal.get(Calendar.HOUR_OF_DAY);
        
        // set Estacionamento
        estacione.setNome("Estacione Bem");
        estacione.setCapacidade(10);
        
        // set Carro
        //Fiesta
        fiesta.setPlaca("AAA1111");
        fiesta.setModelo("New Fiesta");
        fiesta.setCor("Prata");
        fiesta.setEstacionamento(estacione);
        //Uno
        uno.setPlaca("AAA2222");
        uno.setModelo("Uno");
        uno.setCor("Preto");
        uno.setEstacionamento(estacione);
        //Fusca
        fusca.setPlaca("BB1A22");
        fusca.setModelo("Fusca");
        fusca.setCor("Amarelo");
        fusca.setEstacionamento(estacione);
        

        // set Ticket
        //Ticket1
        ticket1.setNumero(100);
        ticket1.setHoraEntrada(horaInicio);
        ticket1.setHoraSaida(horaFinal);
        ticket1.setValorHora(3.50);
        ticket1.setValorTotal(ticket1.calcularValorTotalTicket());
        ticket1.setCarro(fiesta);
        //Ticket2
        ticket2.setNumero(200);
        ticket2.setHoraEntrada(horaInicio);
        ticket2.setHoraSaida(horaFinal);
        ticket2.setValorHora(4.00);
        ticket2.setValorTotal(ticket2.calcularValorTotalTicket());
        ticket2.setCarro(uno);
        //Ticket3
        ticket3.setNumero(300);
        ticket3.setHoraEntrada(horaInicio);
        ticket3.setHoraSaida(horaFinal);
        ticket3.setValorHora(3.25);
        ticket3.setValorTotal(ticket3.calcularValorTotalTicket());
        ticket3.setCarro(fusca);
        
        // set Vaga
        //Primeira Vaga
        primeiraVaga.setNumero(10);
        primeiraVaga.setDisponivel(false);
        primeiraVaga.setEstacionamento(estacione);
        primeiraVaga.setCarro(fiesta);
        //Segunda Vaga
        segundaVaga.setNumero(11);
        segundaVaga.setDisponivel(false);
        segundaVaga.setEstacionamento(estacione);
        segundaVaga.setCarro(uno);
        //Terceira Vaga
        terceiraVaga.setNumero(12);
        terceiraVaga.setDisponivel(false);
        terceiraVaga.setEstacionamento(estacione);
        terceiraVaga.setCarro(fusca);
        //Quarta Vaga
        quartaVaga.setNumero(13);
        quartaVaga.setDisponivel(true);
        quartaVaga.setEstacionamento(estacione);
        
        
        // Persistência
        jpa.persist(estacione);
        jpa.persist(fiesta);
        jpa.persist(uno);
        jpa.persist(fusca);
        jpa.persist(primeiraVaga);
        jpa.persist(segundaVaga);
        jpa.persist(terceiraVaga);
        jpa.persist(quartaVaga);
        jpa.persist(ticket1);
        jpa.persist(ticket2);
        jpa.persist(ticket3);
       

        // buscar objeto persistido
        //Estacionamento persistidoModalidade = (Estacionamento) jpa.find(Estacionamento.class, estacione.getId());//ver se tem necessidade de fazer o mesmo pro m2 e m3

        // verificar se objeto persistido é igual ao criado
        //Assert.assertEquals(estacione.getNome(), persistidoModalidade.getNome());

    }
    
}
