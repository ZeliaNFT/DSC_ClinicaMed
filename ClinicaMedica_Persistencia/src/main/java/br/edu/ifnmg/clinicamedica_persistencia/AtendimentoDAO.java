/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.clinicamedica_persistencia;

import br.edu.ifnmg.clinicamedica_logicaapp.Atendimento;
import br.edu.ifnmg.clinicamedica_logicaapp.AtendimentoRepositorio;
import java.util.Hashtable;
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
        String jpql = "select at from Atendimento at";
        
        String filtros = "";
        
        Hashtable<String, Object> parametros = new Hashtable<>();
        
        if(objeto != null){
            if(objeto.getAtendimentoTipo()!= null){
                filtros += "at.tipoAtendimento like :tipoAtendimento"; 
                parametros.put("tipoAtendimento", objeto.getAtendimentoTipo()+"%");
            }

            if(filtros.length() > 0)
                jpql = jpql + " where " + filtros;
        }
        
        var query = this.manager.createQuery(jpql);
        
        for(String chave : parametros.keySet()){
            query.setParameter(chave, parametros.get(chave));
        }
        
        return query.getResultList();
    }
    
}