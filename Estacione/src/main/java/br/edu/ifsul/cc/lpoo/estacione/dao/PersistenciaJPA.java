/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.estacione.dao;

import br.edu.ifsul.cc.lpoo.estacione.model.Vaga;
import java.util.Collection;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Mili
 */
public class PersistenciaJPA implements InterfacePersistencia{
    
    EntityManagerFactory factory; //fabrica de gerenciadores de entidades
    EntityManager entity; //gerenciador de entidades JPA
    
    public PersistenciaJPA(){
        //parametro: é o nome da unidade de persistencia
        factory = Persistence.createEntityManagerFactory("pu_Estacione");
        entity = factory.createEntityManager();    // estabelece a conexão com o banco de dados e executa a estratégia de geração
    }

    @Override
    public Boolean conexaoAberta() {
        return entity.isOpen();
    }

    @Override
    public void fecharConexao() {
        entity.close(); 
    }

    @Override
    public Object find(Class c, Object id) throws Exception {
       
        return entity.find(c, id);//encontra um determinado registro              
    }

    @Override
    public void persist(Object o) throws Exception {
        
        entity.getTransaction().begin();// abrir a transacao.
        entity.persist(o); //realiza o insert ou update.
        entity.getTransaction().commit(); //comita a transacao (comando sql)                
    }

    @Override
    public void remover(Object o) throws Exception {
        
        entity.getTransaction().begin();// abrir a transacao.
        entity.remove(o); //realiza o delete
        entity.getTransaction().commit(); //comita a transacao (comando sql)                
    }
    
    public Collection<Vaga> listaVagas() throws Exception {
        return entity.createNamedQuery("Vaga.orderbyid").getResultList();
    }
    
}
