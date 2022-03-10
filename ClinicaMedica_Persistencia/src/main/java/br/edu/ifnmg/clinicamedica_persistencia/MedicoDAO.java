/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.clinicamedica_persistencia;

import br.edu.ifnmg.clinicamedica_logicaapp.Medico;
import br.edu.ifnmg.clinicamedica_logicaapp.MedicoRepositorio;
import java.util.List;

/**
 *
 * @author alexs
 */
public class MedicoDAO extends DataAccessObject<Medico> implements MedicoRepositorio{

    public MedicoDAO() {
        super(Medico.class);
    }

    @Override
    public List<Medico> Buscar(Medico objeto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}