/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.estacione.model;

import java.util.Calendar;

/**
 *
 * @author Mili
 */
public class Ticket {

    private int numero;
    private Carro carro;
    private Calendar horaEntrada;
    private Calendar horaSaida;

    public Ticket() {
    }
    

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public Calendar getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(Calendar horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public Calendar getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(Calendar horaSaida) {
        this.horaSaida = horaSaida;
    }
    
    
    
}
