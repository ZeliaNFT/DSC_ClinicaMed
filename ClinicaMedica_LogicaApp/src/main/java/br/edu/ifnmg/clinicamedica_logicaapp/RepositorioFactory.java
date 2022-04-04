
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.clinicamedica_logicaapp;

import java.io.Console;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alexs
 */
public class RepositorioFactory {
    
    private static Properties propriedades = new Properties();
    
    private static AtendimentoRepositorio atendimento;
    private static ConvenioRepositorio convenio;
    private static EspecialidadeRepositorio especialidade;
    private static MedicoRepositorio medico;
    private static PacienteRepositorio paciente;
    private static PagamentoRepositorio pagamento;
    private static UsuarioRepositorio usuario;
    
    static {
        
        FileReader leitorArquivo = null;
        
        try {            
            File arquivoPropriedades = new File("config.properties");
            leitorArquivo = new FileReader(arquivoPropriedades);    
            propriedades.load(leitorArquivo);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(RepositorioFactory.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(RepositorioFactory.class.getName()).log(Level.SEVERE, null, ex);
        }finally {
            try {
                leitorArquivo.close();
            } catch (IOException ex) {
                Logger.getLogger(Console.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    private static Object getInstancia(String nomeclasse){
        try {
            Class classe = Class.forName(nomeclasse);
            Object instancia = classe.getDeclaredConstructor().newInstance();
            
            return instancia;
            
        } catch(ClassNotFoundException | NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex){
            Logger.getLogger(Console.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public static AtendimentoRepositorio getAtendimentoRepositorio() {
        if(atendimento == null){
            String nomeclasse = propriedades.getProperty("AtendimentoRepositorio");
            atendimento = (AtendimentoRepositorio) getInstancia(nomeclasse);
        }
        return atendimento;
    }
    
    public static ConvenioRepositorio getConvenioRepositorio() {
        if(convenio == null){
            String nomeclasse = propriedades.getProperty("ConvenioRepositorio");
            convenio = (ConvenioRepositorio) getInstancia(nomeclasse);
        }
        return convenio;
    }
    
    public static EspecialidadeRepositorio getEspecialidadeRepositorio() {
        if(especialidade == null){
            String nomeclasse = propriedades.getProperty("EspecialidadeRepositorio");
            especialidade = (EspecialidadeRepositorio) getInstancia(nomeclasse);
        }
        return especialidade;
    }
    
    public static MedicoRepositorio getMedicoRepositorio() {
        if(medico == null){
            String nomeclasse = propriedades.getProperty("MedicoRepositorio");
            medico = (MedicoRepositorio) getInstancia(nomeclasse);
        }
        return medico;
    }
    
    public static PacienteRepositorio getPacienteRepositorio() {
        if(paciente == null){
            String nomeclasse = propriedades.getProperty("PacienteRepositorio");
            paciente = (PacienteRepositorio) getInstancia(nomeclasse);
        }
        return paciente;
    }
    
    public static PagamentoRepositorio getPagamentoRepositorio() {
        if(pagamento == null){
            String nomeclasse = propriedades.getProperty("PagamentoRepositorio");
            pagamento = (PagamentoRepositorio) getInstancia(nomeclasse);
        }
        return pagamento;
    }
    
    public static UsuarioRepositorio getUsuarioRepositorio() {
        if(usuario == null){
            String nomeclasse = propriedades.getProperty("UsuarioRepositorio");
            usuario = (UsuarioRepositorio) getInstancia(nomeclasse);
        }
        return usuario;
    }
    
}