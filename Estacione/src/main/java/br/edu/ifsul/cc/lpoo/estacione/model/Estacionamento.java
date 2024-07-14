/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.estacione.model;

import java.io.Serializable;
import java.util.ArrayList;
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
    private ArrayList<Vaga> vagas;
     
    @OneToMany(mappedBy = "estacionamento")
    private ArrayList<Carro> carrosEstacionados;

    public Estacionamento() {
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

    public ArrayList<Vaga> getVagas() {
        return vagas;
    }

    public void setVagas(ArrayList<Vaga> vagas) {
        this.vagas = vagas;
    }

    public ArrayList<Carro> getCarrosEstacionados() {
        return carrosEstacionados;
    }

    public void setCarrosEstacionados(ArrayList<Carro> carrosEstacionados) {
        this.carrosEstacionados = carrosEstacionados;
    }
    
    
    
    
}
