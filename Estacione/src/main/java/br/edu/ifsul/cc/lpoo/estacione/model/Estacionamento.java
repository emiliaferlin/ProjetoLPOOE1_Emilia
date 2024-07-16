/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.estacione.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Mili
 */
@Entity
@Table(name = "tb_estacionamento")
public class Estacionamento implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    
    @Column(name = "nome_estacionamento", nullable = false, length = 60)
    private String nome;
    
    @Column(name = "capacidade_veiculos", nullable = false)
    private int capacidade;
    
    @OneToMany(mappedBy = "estacionamento")
    private List<Vaga> vagas = new ArrayList();
     
    @OneToMany(mappedBy = "estacionamento")
    private List<Carro> carrosEstacionados = new ArrayList();

    public Estacionamento() {
    }

    public int encontrarVagaDisponivel(Collection<Vaga> lista) {
        for (Vaga vaga : lista) {
            if (vaga.isDisponivel()) {
                return vaga.getNumero();
            }
        }
        System.out.println("Não há vagas disponíveis.");
        return 0;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public List<Vaga> getVagas() {
        return vagas;
    }

    public void setVagas(List<Vaga> vagas) {
        this.vagas = vagas;
    }

    public List<Carro> getCarrosEstacionados() {
        return carrosEstacionados;
    }

    public void setCarrosEstacionados(List<Carro> carrosEstacionados) {
        this.carrosEstacionados = carrosEstacionados;
    }
    
    
    
    
}
