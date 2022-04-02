/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIO_PRACTICO6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Armando
 */
public class FormatoFecha {
    private String Fecha;

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }
    public void imprimir(){
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        Date fecha;
        java.util.Date nfecha = formato.parse(this.getFecha());
    }
}
        
       
