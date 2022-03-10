/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.clinicamedica_persistencia;

import br.edu.ifnmg.clinicamedica_logicaapp.Pagamento;
import br.edu.ifnmg.clinicamedica_logicaapp.PagamentoRepositorio;
import java.util.List;

/**
 *
 * @author alexs
 */
public class PagamentoDAO extends DataAccessObject<Pagamento> implements PagamentoRepositorio{

    public PagamentoDAO() {
        super(Pagamento.class);
    }

    @Override
    public List<Pagamento> Buscar(Pagamento objeto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}