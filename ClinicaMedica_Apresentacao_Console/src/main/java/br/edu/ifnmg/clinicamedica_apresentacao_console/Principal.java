/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.ifnmg.clinicamedica_apresentacao_console;

import br.edu.ifnmg.clinicamedica_logicaapp.Especialidade;
import br.edu.ifnmg.clinicamedica_logicaapp.EspecialidadeRepositorio;
import br.edu.ifnmg.clinicamedica_logicaapp.Medico;
import br.edu.ifnmg.clinicamedica_logicaapp.Paciente;
import br.edu.ifnmg.clinicamedica_logicaapp.MedicoRepositorio;
import br.edu.ifnmg.clinicamedica_logicaapp.PacienteRepositorio;
import br.edu.ifnmg.clinicamedica_logicaapp.Repositorio;
import br.edu.ifnmg.clinicamedica_logicaapp.Usuario;
import br.edu.ifnmg.clinicamedica_logicaapp.UsuarioRepositorio;
import br.edu.ifnmg.clinicamedica_persistencia.EspecialidadeDAO;
import br.edu.ifnmg.clinicamedica_persistencia.MedicoDAO;
import br.edu.ifnmg.clinicamedica_persistencia.PacienteDAO;
import br.edu.ifnmg.clinicamedica_persistencia.UsuarioDAO;

/**
 *
 * @author alexs
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    
    public static void criarBase(){
        
        UsuarioRepositorio repou = new UsuarioDAO();
        repou.Salvar(new Usuario("Medico", "12345"));
        repou.Salvar(new Usuario("Paciente", "12345"));
        
        EspecialidadeRepositorio repoe = new EspecialidadeDAO();
        repoe.Salvar(new Especialidade("Cardiologista"));
        repoe.Salvar(new Especialidade("Oftalmologista"));
        repoe.Salvar(new Especialidade("Dermatologista"));
        
        var espec1 = repoe.Abrir(1L);
        var espec2 = repoe.Abrir(2L);
        var espec3 = repoe.Abrir(3L);
        
        MedicoRepositorio repom = new MedicoDAO();
        repom.Salvar(new Medico("João","crmteste1", espec1));
        repom.Salvar(new Medico("José","crmteste2", espec2));
        repom.Salvar(new Medico("Joana","crmteste3", espec3));
        
        PacienteRepositorio repop = new PacienteDAO();
        repop.Salvar(new Paciente("Marcos","Glicose alta"));
        repop.Salvar(new Paciente("Maria","Colesterol alto"));
        repop.Salvar(new Paciente("Matheus","Hipertensão"));
        
    }
    public static void main(String[] args){
        
       /*UsuarioRepositorio repo = new UsuarioDAO();
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
        */
       
       criarBase();
    }
}
