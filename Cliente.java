/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejemplobanco;

/**
 *
 * @author luren
 */
import java.util.*;
public class Cliente {
    public String nombre;
    private long identificacion;
    Scanner s = new Scanner(System.in);
    public int bienvenida(){
        int opcion;
        System.out.println("Bienvenido usuario.");
        System.out.println("Seleccione la opcion de lo que desea realizar");
        while (true){
            try {
                System.out.println("1.Retirar\n2.Consignar\n3.Transferir");
                opcion = s.nextInt();
                if (opcion < 1 || opcion > 3) {
                    throw new IllegalArgumentException("La opción debe ser entre 1 y 3.");
                }
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Error: Debe ingresar un número.");
                s.nextLine();
            }
        }
        return opcion;
    }

    public double retirar(double Saldo){
        s.nextLine();
        System.out.println("Ingrese el valor que desea retirar");
        double x = s.nextDouble();
        double cuatropormil = x*4/1000;
        double totalretiro = x + cuatropormil;
        if (Saldo < totalretiro){
            System.out.println("Su saldo es insuficiente");
                   }
        else{
            Saldo = Saldo - totalretiro;
            System.out.println("Se realizo exitosamente el retiro");
        }
        return Saldo;
    }
    public void consignar(){}
    public void Transferir(){}
 }
