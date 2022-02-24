/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.ifnmg.clinicamedica_logicaapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author alexs
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("UP");
        EntityManager em = emf.createEntityManager();
        
        Paciente p = new Paciente();
        p.setNome("Alex");
        p.setCpf("11111111111");
        p.setHistorico("abd");
        EntityTransaction transacao = em.getTransaction();
        transacao.begin();
        em.persist(p);
        transacao.commit();
        
        Paciente p1 = em.find(Paciente.class,1L);
        System.out.println(p1.getNome());
    }
}
