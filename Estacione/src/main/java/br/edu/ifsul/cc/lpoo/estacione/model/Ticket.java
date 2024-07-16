/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.estacione.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Mili
 */
@Entity
@Table(name = "tb_ticket")
public class Ticket implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    
    @Column(name = "numero_ticket", nullable = false, length = 10)
    private int numero;
    
    @Column(name = "valor_hora", columnDefinition = "decimal(12,2)")
    private double valorHora;
    
    @Column(name = "valor_total", columnDefinition = "decimal(12,2)")
    private double valorTotal;
    
    @OneToOne
    @JoinColumn(name = "carro_id")
    private Carro carro;
    
    @Column(name = "hora_entrada", nullable = false)
    private int horaEntrada;
    

    @Column(name = "hora_saida", nullable = false)
    private int horaSaida;

    public Ticket() {
    }
    
    
    public double calcularValorTotalTicket() {
        int horas = this.horaSaida - this.horaEntrada;
        double valorTot = horas * this.valorHora;
        return valorTot;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public int getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(int horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public int getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(int horaSaida) {
        this.horaSaida = horaSaida;
    }
    
    
    
}
