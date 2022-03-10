/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.clinicamedica_persistencia;

import br.edu.ifnmg.clinicamedica_logicaapp.Atendimento;
import br.edu.ifnmg.clinicamedica_logicaapp.AtendimentoRepositorio;
import java.util.List;

/**
 *
 * @author alexs
 */
public class AtendimentoDAO extends DataAccessObject<Atendimento> implements AtendimentoRepositorio{

    public AtendimentoDAO() {
        super(Atendimento.class);
    }

    @Override
    public List<Atendimento> Buscar(Atendimento objeto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}