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
    
    boolean consignacion(int x){
        
        boolean peticion = true;
        
        if(peticion == true){
                Saldo = Saldo + x;
                System.out.println("Se se realizo existosamente la consignacion");
                return true;
        }else{
            return false;
        }  
    }
    Scanner s = new Scanner(System.in);
    
    
    boolean transferencia(int x){
        
        boolean peticion = true;
        
        if(peticion == true){
                
            System.out.println("Ingresar el ID de la cuenta a la que se quiere transferir");
            double IDtransferencia = s.nextDouble(); 
            Saldo = Saldo - x;
            double cuatropormil = x*4/1000;
            Saldo = Saldo - cuatropormil;
            return true;
        }else{
            return false;
        }  
    }
    
    boolean retiro(int x){
        
        boolean peticion = true;
        
        if(peticion == true){    
            double cuatropormil = x*4/1000;
            double totalretiro = x + cuatropormil;
            if (Saldo< totalretiro){
                System.out.printl("Su saldo no es suficiente")
            }else{
                Saldo = Saldo - totalretiro;
                System.out.printl("Se realizo exitosamente el retiro");
                return true;
        }else{
            return false;
        }  
    }
    
    boolean interes(int x){
        
        boolean peticion = true;
        
        if(peticion == true){
            Saldo = Saldo * 1.1;
            System.out.printl("Se genero interes");
            return true;
        }else{
            return false;
        }  
    }
    int getSaldo() {
        
        return this.Saldo;
    }
    
}
