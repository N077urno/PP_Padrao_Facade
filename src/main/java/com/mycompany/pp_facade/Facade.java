/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pp_facade;

/**
 *
 * @author nando
 */
public class Facade {
    protected SistemaDeAudio audio;
    protected SistemaDePerifericos perifericos;
    protected SistemaDeVideo video;
    
    public void configuraSistemas(){
        audio = new SistemaDeAudio();
        audio.configuraBalanco();
        audio.configuraCanais();
        audio.configuraTimbre();
        audio.configuraVolume();
        
        perifericos = new SistemaDePerifericos();
        perifericos.configuraJoystick();
        perifericos.configuraMouse();
        perifericos.configuraTeclado();
        perifericos.configuraTelaTouch();
        
        video = new SistemaDeVideo();
        video.configurarResolucaoDoMonitor();
    }
    
    public void reproduzirAudio(String arquivoDeAudio){
        audio.reproduzirAudio(arquivoDeAudio);
    }
    
    public void tipoDeDispositivo(String tipo){
        perifericos.lerDispositivoDeEntrada(tipo);
    }
    
    public void numeroDeMonitores(String numero){
        video.configurarNumeroDeMonitores(numero);
    }
    
}
