/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.clinicamedica_persistencia;

import br.edu.ifnmg.clinicamedica_logicaapp.Especialidade;
import br.edu.ifnmg.clinicamedica_logicaapp.EspecialidadeRepositorio;
import java.util.List;

/**
 *
 * @author alexs
 */
public class EspecialidadeDAO extends DataAccessObject<Especialidade> implements EspecialidadeRepositorio{

    public EspecialidadeDAO() {
        super(Especialidade.class);
    }

    @Override
    public List<Especialidade> Buscar(Especialidade objeto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}