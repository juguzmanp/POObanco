/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplobanco;

/**
 *
 * @author luren
 */
import java.util.*;
public class Cuenta {
    
    private String Titular;
    private double ID;
    private double Saldo;

    long countid = 1
    
    public Cuenta(Cliente x){
        this.Titular = x.Nombre;
        this.ID = countid
        this.Saldo = 0;
        countid++
    }
    public double getSaldo(){
        return Saldo;
    }
    public void setSaldo(double saldo){
        this.Saldo = saldo;
    }
}
