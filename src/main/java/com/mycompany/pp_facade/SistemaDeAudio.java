/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pp_facade;

/**
 *
 * @author nando
 */
public class SistemaDeAudio {
    
    public void configuraBalanco(){
        System.out.println("*-----B-----* Balanco configurado");
    }
    
    public void configuraTimbre(){
        System.out.println("*-----T-----* Timbre configurado");
    }
    
    public void configuraVolume(){
        System.out.println("*-----V-----* Volume configurado");
    }
    
    public void configuraCanais(){
        System.out.println("Canal 1 configurado, Canal 2 configurado");
    }
    
    public void reproduzirAudio(String arquivo){
        System.out.println("reproduzindo: "+arquivo);
    }
}
