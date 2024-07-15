/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.estacione.test;

import br.edu.ifsul.cc.lpoo.estacione.dao.PersistenciaJPA;
import br.edu.ifsul.cc.lpoo.estacione.model.Estacionamento;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

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

       Estacionamento estacione = new Estacionamento();
       
        jpa.persist(estacione);

        // buscar objeto persistido
        Estacionamento persistidoModalidade = (Estacionamento) jpa.find(Estacionamento.class, estacione.getId());//ver se tem necessidade de fazer o mesmo pro m2 e m3

        // verificar se objeto persistido é igual ao criado
        Assert.assertEquals(estacione.getNome(), persistidoModalidade.getNome());

    }
    
}
