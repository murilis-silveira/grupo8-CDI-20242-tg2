/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.bean;

/**
 *
 * @author franc
 */
public class Consultas {
    
    private String consulta;
    private String cliente;
    private String totalGasto;
    private String Venda;
    private String Data;
    private String Filial;
    private String Cidade;

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public String getConsulta() {
        return consulta;
    }

    public void setConsulta(String consulta) {
        this.consulta = consulta;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getTotalGasto() {
        return totalGasto;
    }

    public void setTotalGasto(String totalGasto) {
        this.totalGasto = totalGasto;
    }

    public String getVenda() {
        return Venda;
    }

    public void setVenda(String Venda) {
        this.Venda = Venda;
    }

    public String getData() {
        return Data;
    }

    public void setData(String Data) {
        this.Data = Data;
    }
    
    public String getFilial() {
        return Filial;
    }

    public void setFilial(String Filial) {
        this.Filial = Filial;
    }
    
    
    
    
}
