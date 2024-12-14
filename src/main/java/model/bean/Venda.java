/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.bean;


/**
 *
 * @author franc
 */
public class Venda {
    
    private int CodNF;
    private String DataVenda;
    private String Hora;
    private Float Valor;
    private int NrItens;
    private int CodCliente;
    private int CodFilial;

    public int getCodNF() {
        return CodNF;
    }

    public void setCodNF(int CodNF) {
        this.CodNF = CodNF;
    }

    public String getDataVenda() {
        return DataVenda;
    }

    public void setDataVenda(String DataVenda) {
        this.DataVenda = DataVenda;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String Hora) {
        this.Hora = Hora;
    }

    public Float getValor() {
        return Valor;
    }

    public void setValor(Float Valor) {
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
