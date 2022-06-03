/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pp_facade;

/**
 *
 * @author nando
 */
public class PP_Facade {

    public static void main(String[] args) {
        /* Sem o Padrao Facade */
        
        System.out.println("Uso de Subsistemas sem o padrao FACADE");
        SistemaDeAudio audio = new SistemaDeAudio();
        audio.configuraBalanco();
        audio.configuraCanais();
        audio.configuraTimbre();
        audio.configuraVolume();
        audio.reproduzirAudio("musica.mp3");
        
        SistemaDePerifericos perifericos = new SistemaDePerifericos();
        perifericos.configuraJoystick();
        perifericos.configuraMouse();
        perifericos.configuraTeclado();
        perifericos.configuraTelaTouch();
        perifericos.lerDispositivoDeEntrada("Teclado");
        
        SistemaDeVideo video = new SistemaDeVideo();
        video.configurarResolucaoDoMonitor();
        video.configurarNumeroDeMonitores("2");
        
        /*Usando o padrao FACADE */
        /*
        System.out.println("------Configurando subsistemas com o Padrao FACADE------");
        
        Facade facade = new Facade();
        facade.configuraSistemas();
        
        System.out.println("------Definicoes do usuario------");
        facade.numeroDeMonitores("2");
        facade.reproduzirAudio("musica.mp3");
        facade.tipoDeDispositivo("Teclado");*/
    } 
}
