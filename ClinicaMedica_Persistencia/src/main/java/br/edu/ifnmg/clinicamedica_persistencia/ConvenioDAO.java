/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.clinicamedica_persistencia;

import br.edu.ifnmg.clinicamedica_logicaapp.Convenio;
import br.edu.ifnmg.clinicamedica_logicaapp.ConvenioRepositorio;
import java.util.List;

/**
 *
 * @author alexs
 */
public class ConvenioDAO extends DataAccessObject<Convenio> implements ConvenioRepositorio{

    public ConvenioDAO() {
        super(Convenio.class);
    }

    @Override
    public List<Convenio> Buscar(Convenio objeto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}