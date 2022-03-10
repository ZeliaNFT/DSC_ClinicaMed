/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.ifnmg.clinicamedica_apresentacao_console;

import br.edu.ifnmg.clinicamedica_logicaapp.Usuario;
import br.edu.ifnmg.clinicamedica_logicaapp.UsuarioRepositorio;
import br.edu.ifnmg.clinicamedica_persistencia.UsuarioDAO;

/**
 *
 * @author alexs
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        
        UsuarioRepositorio repo = new UsuarioDAO();
        Usuario u = new Usuario();
        u.setLogin("teste");
        u.setSenha("123");
        
        if(repo.Salvar(u)){
            System.out.println("Sucesso");
        }else{
            System.out.println("Falha");
        }
        
        u = repo.Abrir(1L);
        System.out.println(u.getLogin());
    }
}
