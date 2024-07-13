/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.estacione.model;

import java.util.ArrayList;

/**
 *
 * @author Mili
 */
public class Estacionamento {
    
    private String nome;
    private int capacidade;
    private ArrayList<Vaga> vagas;
    private ArrayList<Carro> carrosEstacionados;

    public Estacionamento() {
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
