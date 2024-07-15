/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.estacione.model;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

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
    
    @Column(name = "valor_total", columnDefinition = "decimal(12,2)")
    private float valorTotal;
    
    @OneToOne
    @JoinColumn(name = "carro_id")
    private Carro carro;
    
    @Column(name = "hora_entrada", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar horaEntrada;
    
    //A data de saída não tem como ser obrigatória, porque não tem como saber que horas o carro sai
    //só sabemos de fato quando a vaga é desocupada
    @Column(name = "hora_saida")
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar horaSaida;

    public Ticket() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
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
