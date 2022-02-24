/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.edu.ifnmg.clinicamedica_logicaapp;

import java.util.List;

/**
 *
 * @author alexs
 */
public interface Repositorio<T>{
    
    public boolean Salvar(T objeto);
    
    public boolean Apagar(T objeto);
    
    public T Abrir(Long id);
    
    public List<T> Buscar(T filtro);
}
