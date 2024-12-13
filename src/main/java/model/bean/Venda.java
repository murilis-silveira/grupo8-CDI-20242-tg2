/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.bean;
import java.sql.Date;
import java.sql.Time;
import java.math.BigDecimal;

/**
 *
 * @author franc
 */
public class Venda {
    
    private int CodNF;
    private Date DataVenda;
    private Time Hora;
    private BigDecimal Valor;
    private int NrItens;
    private int CodCliente;
    private int CodFilial;

    public int getCodNF() {
        return CodNF;
    }

    public void setCodNF(int CodNF) {
        this.CodNF = CodNF;
    }

    public Date getDataVenda() {
        return DataVenda;
    }

    public void setDataVenda(Date DataVenda) {
        this.DataVenda = DataVenda;
    }

    public Time getHora() {
        return Hora;
    }

    public void setHora(Time Hora) {
        this.Hora = Hora;
    }

    public BigDecimal getValor() {
        return Valor;
    }

    public void setValor(BigDecimal Valor) {
        this.Valor = Valor;
    }

    public int getNrItens() {
        return NrItens;
    }

    public void setNrItens(int NrItens) {
        this.NrItens = NrItens;
    }

    public int getCodCliente() {
        return CodCliente;
    }

    public void setCodCliente(int CodCliente) {
        this.CodCliente = CodCliente;
    }

    public int getCodFilial() {
        return CodFilial;
    }

    public void setCodFilial(int CodFilial) {
        this.CodFilial = CodFilial;
    }
    
    
    
    
}
