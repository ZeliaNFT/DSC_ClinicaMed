/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.clinicamedica_persistencia;

import br.edu.ifnmg.clinicamedica_logicaapp.Repositorio;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author alexs
 */
public abstract class DataAccessObject<T> implements Repositorio<T>{
    
    EntityManager manager;
    private Class type;
    
    public DataAccessObject(Class type){
        var factory = Persistence.createEntityManagerFactory("UP");
        this.manager = factory.createEntityManager();
        this.type = type;
    }
    
    @Override
    public boolean Salvar(T objeto) {
        EntityTransaction transacao = this.manager.getTransaction();
        try{
            transacao.begin();
            this.manager.persist(objeto);
            transacao.commit();
            return true;
        }catch(Exception ex){
            transacao.rollback();
            System.out.println(ex);
            return false;
        }
    }

    @Override
    public boolean Apagar(T objeto) {
        EntityTransaction transacao = this.manager.getTransaction();
        try{
            transacao.begin();
            this.manager.remove(objeto);
            transacao.commit();
            return true;
        }catch(Exception ex){
            transacao.rollback();
            return false;
        }
    }

    @Override
    public T Abrir(Long id) {
        try{
            T objeto = (T)this.manager.find(this.type, id);
            return objeto;
        }catch(Exception ex){
            return null;
        }
    }
    
    public abstract List<T> Buscar(T objeto);
}