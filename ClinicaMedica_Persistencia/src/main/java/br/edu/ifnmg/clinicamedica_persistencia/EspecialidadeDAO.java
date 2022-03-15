/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.clinicamedica_persistencia;

import br.edu.ifnmg.clinicamedica_logicaapp.Especialidade;
import br.edu.ifnmg.clinicamedica_logicaapp.EspecialidadeRepositorio;
import java.util.Hashtable;
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
        String jpql = "select espec from Especialidade espec";
        
        String filtros = "";
        
        Hashtable<String, Object> parametros = new Hashtable<>();
        
        if(objeto.getEspecializacao().length() > 0){
            filtros += "espec.especializacao like :especializacao"; 
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