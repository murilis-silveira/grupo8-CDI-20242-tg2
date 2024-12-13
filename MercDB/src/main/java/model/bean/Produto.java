/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.bean;

import java.math.BigDecimal;

/**
 *
 * @author franc
 */
public class Produto {
    
    private int CodProd;
    private int CodBarras;
    private BigDecimal Preco;
    private int CodLT;
    private int CodNF;

    public int getCodProd() {
        return CodProd;
    }

    public void setCodProd(int CodProd) {
        this.CodProd = CodProd;
    }

    public int getCodBarras() {
        return CodBarras;
    }

    public void setCodBarras(int CodBarras) {
        this.CodBarras = CodBarras;
    }

    public BigDecimal getPreco() {
        return Preco;
    }

    public void setPreco(BigDecimal Preco) {
        this.Preco = Preco;
    }

    public int getCodLT() {
        return CodLT;
    }

    public void setCodLT(int CodLT) {
        this.CodLT = CodLT;
    }

    public int getCodNF() {
        return CodNF;
    }

    public void setCodNF(int CodNF) {
        this.CodNF = CodNF;
    }

    
    
    
}
