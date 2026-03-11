package Exercicio03;

import java.util.Random;

public class BilheteUnico {

    int numero;
    String usuario;
    double saldo;
    final static double valorBase=5.50;
    String tipoTarifa;


    public BilheteUnico(String usuario,String tipoTarifa){
        Random rd= new Random(10000);

        this.numero = rd.nextInt(0, 999999);
        this.usuario=usuario;
        this.tipoTarifa=tipoTarifa;
        this. saldo= saldo;
    }

    public boolean passarNaCatraca(){
        double valor= valorBase;
        if (tipoTarifa.equalsIgnoreCase("professor") || tipoTarifa.equalsIgnoreCase("estudante")){
            valor=valorBase/2;
        }
        if (saldo < valor){
            return false;
        }

        saldo-=valor;
        return true;

    }

}