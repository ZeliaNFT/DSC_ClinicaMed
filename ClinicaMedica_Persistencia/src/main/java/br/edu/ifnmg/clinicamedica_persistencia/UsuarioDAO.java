/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.clinicamedica_persistencia;

import br.edu.ifnmg.clinicamedica_logicaapp.Usuario;
import br.edu.ifnmg.clinicamedica_logicaapp.UsuarioRepositorio;
import java.util.HashMap;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author alexs
 */
public class UsuarioDAO extends DataAccessObject<Usuario> implements UsuarioRepositorio{

    public UsuarioDAO() {
        super(Usuario.class);
    }

    @Override
    public boolean autenticar(String login, String senha) {
        Query sql =  this.manager.createQuery("select o from Usuario o where o.login = :login and o.senha = :senha");
        sql.setParameter("login", login);
        sql.setParameter("senha", senha);
        
        if(sql.getResultList().size() > 0)
            return true;
        
        return false;
    }

    @Override
    public List<Usuario> Buscar(Usuario objeto) {

        String jpql = "select user from Usuario user";
        
        HashMap<String, Object> parametros = new HashMap<>();
        
        if(objeto != null){
            if(objeto.getLogin() != null & !objeto.getLogin().isEmpty())
                parametros.put("login", objeto.getLogin());
            if(objeto.getId() > 0)
                parametros.put("id", objeto.getId());
        }
        
        if(!parametros.isEmpty()){
            String filtros = "";
            jpql += " where ";
            for(String campo : parametros.keySet()){
                if(!filtros.isEmpty())
                    filtros += " and ";
                jpql += "user." + campo + " = :" + campo;
            }
            jpql += filtros;
        }
        
        Query sql = this.manager.createQuery(jpql);
        
        if(!parametros.isEmpty())
            for(String campo : parametros.keySet())
                sql.setParameter(campo, parametros.get(campo));
            
        
        return sql.getResultList();
    }
    
}