/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.clinicamedica_persistencia;

import br.edu.ifnmg.clinicamedica_logicaapp.Medico;
import br.edu.ifnmg.clinicamedica_logicaapp.MedicoRepositorio;
import java.util.Hashtable;
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
        String jpql = "select med from Medico med";
        
        String filtros = "";
        
        Hashtable<String, Object> parametros = new Hashtable<>();
        
        if(objeto.getCrm().length() > 0){
            filtros += "med.crm like :crm"; 
            parametros.put("crm", objeto.getCrm()+"%");
        }
        
        if(objeto.getCrm().length() > 0){
            filtros += "med.especializacao like :especializacao"; 
            parametros.put("especializacao", objeto.getEspecializacao()+"%");
        }
        
        if(filtros.length() > 0)
            jpql = jpql + " where " + filtros;
        
        var query = this.manager.createQuery(jpql);
        
        for(String chave : parametros.keySet()){
            query.setParameter(chave, parametros.get(chave));
        }
        
        return query.getResultList();
    }
    
}