/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.clinicamedica_persistencia;

import br.edu.ifnmg.clinicamedica_logicaapp.Pagamento;
import br.edu.ifnmg.clinicamedica_logicaapp.PagamentoRepositorio;
import java.util.Hashtable;
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
        String jpql = "select pag from Pagamento pag";
        
        String filtros = "";
        
        Hashtable<String, Object> parametros = new Hashtable<>();
        
        if(objeto != null){
            if(objeto.getDataPagamento() != null){
                filtros += "pag.dataPagemento like :dataPagamento"; 
                parametros.put("dataPagamento", objeto.getDataPagamento()+"%");
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