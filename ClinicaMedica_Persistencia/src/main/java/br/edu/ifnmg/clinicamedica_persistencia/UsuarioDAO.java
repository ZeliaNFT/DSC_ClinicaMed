/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.clinicamedica_persistencia;

import br.edu.ifnmg.clinicamedica_logicaapp.Usuario;
import br.edu.ifnmg.clinicamedica_logicaapp.UsuarioRepositorio;
import java.util.List;

/**
 *
 * @author alexs
 */
public class UsuarioDAO extends DataAccessObject<Usuario> implements UsuarioRepositorio{

    public UsuarioDAO() {
        super(Usuario.class);
    }

    @Override
    public boolean autenticar(String login, String senha) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Usuario> Buscar(Usuario filtro) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}