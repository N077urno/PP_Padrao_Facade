/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pp_facade;

/**
 *
 * @author nando
 */
public class SistemaDePerifericos {
    
    public void configuraTeclado(){
        System.out.println("Teclado configurado");
    }
    
    public void configuraJoystick(){
        System.out.println("Joystick configurado");
    }
    
    public void configuraMouse(){
        System.out.println("Mouse configurado");
    }
    
    public void configuraTelaTouch(){
        System.out.println("Tela Touch configurada");
    }
    
    public void lerDispositivoDeEntrada(String dispositivo){
        System.out.println("Dispositivo Selecionado..: "+ dispositivo);
    }
    
}
