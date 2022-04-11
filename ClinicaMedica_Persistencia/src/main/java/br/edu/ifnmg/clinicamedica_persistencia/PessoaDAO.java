/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.clinicamedica_persistencia;

import br.edu.ifnmg.clinicamedica_logicaapp.Pessoa;
import br.edu.ifnmg.clinicamedica_logicaapp.PessoaRepositorio;
import java.util.Hashtable;
import java.util.List;

/**
 *
 * @author alexs
 */
public class PessoaDAO extends DataAccessObject<Pessoa> implements PessoaRepositorio{

    public PessoaDAO() {
        super(Pessoa.class);
    }

    @Override
    public List<Pessoa> Buscar(Pessoa objeto) {
        String jpql = "select a from Pessoa a";
        
        String filtros = "";
        
        Hashtable<String, Object> parametros = new Hashtable<>();
        
        if(objeto != null){
            if(objeto.getNome().length() > 0){
                filtros += "a.nome like :nome"; 
                parametros.put("nome", objeto.getNome()+"%");
            }

            if(objeto.getTipo() != null){
                if(filtros.length() > 0)
                    filtros += " and ";
                filtros += "a.tipo = :tipo"; 
                parametros.put("tipo", objeto.getTipo());
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