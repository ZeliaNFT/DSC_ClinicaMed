/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.clinicamedica_persistencia;

import br.edu.ifnmg.clinicamedica_logicaapp.Convenio;
import br.edu.ifnmg.clinicamedica_logicaapp.ConvenioRepositorio;
import java.util.Hashtable;
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
        String jpql = "select conv from Convenio conv";
        
        String filtros = "";
        
        Hashtable<String, Object> parametros = new Hashtable<>();
        
        if(objeto != null){
            if(objeto.getNomeConvenio().length() > 0){
                filtros += "conv.nomeConvenio like :nomeConvenio"; 
                parametros.put("nomeConvenio", objeto.getNomeConvenio()+"%");
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