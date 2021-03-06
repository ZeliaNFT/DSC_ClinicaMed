/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.ifnmg.clinicamedica_apresentacao_console;

import br.edu.ifnmg.clinicamedica_logicaapp.Atendimento;
import br.edu.ifnmg.clinicamedica_logicaapp.AtendimentoRepositorio;
import br.edu.ifnmg.clinicamedica_logicaapp.Convenio;
import br.edu.ifnmg.clinicamedica_logicaapp.ConvenioRepositorio;
import br.edu.ifnmg.clinicamedica_logicaapp.Especialidade;
import br.edu.ifnmg.clinicamedica_logicaapp.EspecialidadeRepositorio;
import br.edu.ifnmg.clinicamedica_logicaapp.FormaPagamento;
import br.edu.ifnmg.clinicamedica_logicaapp.Medico;
import br.edu.ifnmg.clinicamedica_logicaapp.Paciente;
import br.edu.ifnmg.clinicamedica_logicaapp.MedicoRepositorio;
import br.edu.ifnmg.clinicamedica_logicaapp.PacienteRepositorio;
import br.edu.ifnmg.clinicamedica_logicaapp.Pagamento;
import br.edu.ifnmg.clinicamedica_logicaapp.PagamentoRepositorio;
import br.edu.ifnmg.clinicamedica_logicaapp.Pessoa;
import br.edu.ifnmg.clinicamedica_logicaapp.TipoAtendimento;
import br.edu.ifnmg.clinicamedica_logicaapp.TipoGenero;
import br.edu.ifnmg.clinicamedica_logicaapp.Usuario;
import br.edu.ifnmg.clinicamedica_logicaapp.UsuarioRepositorio;
import br.edu.ifnmg.clinicamedica_persistencia.AtendimentoDAO;
import br.edu.ifnmg.clinicamedica_persistencia.ConvenioDAO;
import br.edu.ifnmg.clinicamedica_persistencia.EspecialidadeDAO;
import br.edu.ifnmg.clinicamedica_persistencia.MedicoDAO;
import br.edu.ifnmg.clinicamedica_persistencia.PacienteDAO;
import br.edu.ifnmg.clinicamedica_persistencia.PagamentoDAO;
import br.edu.ifnmg.clinicamedica_persistencia.UsuarioDAO;
import java.util.Date;

/**
 *
 * @author alexs
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    
    public static void criarBase(){
        
        /*UsuarioRepositorio repou = new UsuarioDAO();
        repou.Salvar(new Usuario("Medico", "12345"));
        repou.Salvar(new Usuario("Paciente", "12345"));
        
        var user1 = repou.Abrir(1L);
        var user2 = repou.Abrir(2L);
        
        EspecialidadeRepositorio repoe = new EspecialidadeDAO();
        repoe.Salvar(new Especialidade("Cardiologista"));
        repoe.Salvar(new Especialidade("Oftalmologista"));
        repoe.Salvar(new Especialidade("Dermatologista"));
        
        var espec1 = repoe.Abrir(1L);
        var espec2 = repoe.Abrir(2L);
        var espec3 = repoe.Abrir(3L);
        
        MedicoRepositorio repom = new MedicoDAO();
        repom.Salvar(new Medico(TipoGenero.Masculino,"Jo??o","111","joao@mail.com","999","Rua 1","crmteste1", espec1));
        repom.Salvar(new Medico(TipoGenero.Masculino,"Jos??","222","jose@mail.com","888","Rua 2","crmteste2", espec2));
        repom.Salvar(new Medico(TipoGenero.Feminino,"Joana","333","joana@mail.com","777","Rua 3","crmteste3", espec3));
        
        var med1 = repom.Abrir(1L);
        var med2 = repom.Abrir(2L);
        var med3 = repom.Abrir(3L);
        
        PacienteRepositorio repop = new PacienteDAO();
        repop.Salvar(new Paciente(TipoGenero.Masculino,"Marcos","444","marcos@mail.com","666","Rua 4","Glicose alta"));
        repop.Salvar(new Paciente(TipoGenero.Feminino,"Maria","555","maria@mail.com","555","Rua 5","Colesterol alto"));
        repop.Salvar(new Paciente(TipoGenero.Masculino,"Matheus","666","matheus@mail.com","444","Rua 6","Hipertens??o"));
        
        var pac1 = repop.Abrir(4L);
        var pac2 = repop.Abrir(5L);
        var pac3 = repop.Abrir(6L);
        
        AtendimentoRepositorio repoa = new AtendimentoDAO();
        repoa.Salvar(new Atendimento(med1, pac1, user1, TipoAtendimento.Consulta));
        repoa.Salvar(new Atendimento(med2, pac2, user1, TipoAtendimento.Consulta));
        repoa.Salvar(new Atendimento(med3, pac3, user2, TipoAtendimento.Retorno));
        
        var atend1 = repoa.Abrir(1L);
        var atend2 = repoa.Abrir(2L);
        var atend3 = repoa.Abrir(3L);
        
        ConvenioRepositorio repoc = new ConvenioDAO();
        repoc.Salvar(new Convenio("MedCenter", "50"));
        
        var conv1 = repoc.Abrir(1L);
        
        PagamentoRepositorio repopa = new PagamentoDAO();
        repopa.Salvar(new Pagamento(user1, atend1, FormaPagamento.Dinheiro));
        repopa.Salvar(new Pagamento(user1, atend2, FormaPagamento.Pix));
        repopa.Salvar(new Pagamento(user2, atend3, FormaPagamento.Convenio, conv1));
        
        var pag1 = repopa.Abrir(1L);
        var pag2 = repopa.Abrir(2L);
        var pag3 = repopa.Abrir(3L);*/
        
    }
    public static void main(String[] args){
        criarBase();
        PacienteRepositorio repopa = new PacienteDAO();
        for(Pessoa p: repopa.Buscar(new Paciente("Jos"))){
            System.out.println(p.getNome());
        }
    }
}
