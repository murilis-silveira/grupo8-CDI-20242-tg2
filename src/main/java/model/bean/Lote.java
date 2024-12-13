/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.bean;

import java.sql.Date;

/**
 *
 * @author franc
 */
public class Lote {
    
    private int CodLT;
    private Date DataFab;
    private Date DataVal;
    private int CodForn;            

    public int getCodLT() {
        return CodLT;
    }

    public void setCodLT(int CodLT) {
        this.CodLT = CodLT;
    }

    public Date getDataFab() {
        return DataFab;
    }

    public void setDataFab(Date DataFab) {
        this.DataFab = DataFab;
    }

    public Date getDataVal() {
        return DataVal;
    }

    public void setDataVal(Date DataVal) {
        this.DataVal = DataVal;
    }

    public int getCodForn() {
        return CodForn;
    }

    public void setCodForn(int CodForn) {
        this.CodForn = CodForn;
    }
            
}
