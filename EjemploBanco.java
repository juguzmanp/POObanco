package com.mycompany.ejemplobanco;

/**
 *
 * @author luren
 */
import java.util.*;
public class EjemploBanco {
  public static void main(String[] args) {
        Cliente Nestor = new Cliente();
        Cuenta cuentaN = new Cuenta(Nestor);
        Cliente Juan = new Cliente();
        Cuenta cuentaJ = new Cuenta(Juan); 
        int operacion;
        operacion = Nestor.bienvenida();
        if(operacion == 1){
        double saldo = cuentaN.getSaldo();
        double nuevoSaldo = Nestor.retirar(saldo);
        }
        if(operacion == 2){
        Nestor.consignar();}
        else{Nestor.Transferir();}
    }
}
