/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.clinicamedica_persistencia;

import br.edu.ifnmg.clinicamedica_logicaapp.Paciente;
import br.edu.ifnmg.clinicamedica_logicaapp.PacienteRepositorio;
import java.util.List;

/**
 *
 * @author alexs
 */
public class PacienteDAO extends DataAccessObject<Paciente> implements PacienteRepositorio{

    public PacienteDAO() {
        super(Paciente.class);
    }

    @Override
    public List<Paciente> Buscar(Paciente objeto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}