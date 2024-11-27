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
        double saldo = cuentaN.getSaldo();
        if(operacion == 1){
          double nuevoSaldo = Nestor.retirar(saldo);
          cuentaN.setSaldo(nuevosaldo);
        }
        if(operacion == 2){
          double nuevoSaldo = Nestor.consignar(saldo);
          cuentaN.setSaldo(nuevosaldo);
        }
        else{double nuevoSaldo = Nestor.Transferir(saldo);
                        
            }
    }
}
