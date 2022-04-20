/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.edu.ifnmg.clinicamedica_apresentacao_desktop;

import br.edu.ifnmg.clinicamedica_logicaapp.Atendimento;
import br.edu.ifnmg.clinicamedica_logicaapp.Pagamento;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author alexs
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }
    
     private void carregarRelatorio(String caminho_relatorio, Map parametros) {
        try {
            // Carrega o Driver do MySQL
            Class.forName("com.mysql.jdbc.Driver");
            
            // Cria uma conexão com o SGBD
            Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/ClinicaMedica","root","gl.maestro.118");
            
            // Abrindo e compilando o arquivo do relatório
            JasperReport relatorio = JasperCompileManager.compileReport(caminho_relatorio);
            
            // Preencher com dados o relatório
            JasperPrint relatorio_preenchido = JasperFillManager.fillReport(relatorio, parametros, conexao);
            
            // Mostra a tela de visualização do relatório
            JasperViewer.viewReport(relatorio_preenchido);
            
            // Fechar a conexão com o SGBD
            conexao.close();
        } catch (JRException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(rootPane, "Erro ao carregar relatório!");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(rootPane, "Erro ao carregar Driver do Banco de Dados!");
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(rootPane, "Erro ao carregar dados do relatório!");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        icoMedico = new javax.swing.JLabel();
        icoPaciente = new javax.swing.JLabel();
        icoAgenda = new javax.swing.JLabel();
        icoConvenio = new javax.swing.JLabel();
        icoPagamento = new javax.swing.JLabel();
        icoUsuario = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Clinica Medica");
        setPreferredSize(new java.awt.Dimension(1150, 720));

        icoMedico.setIcon(new javax.swing.ImageIcon("C:\\Users\\alexs\\Downloads\\Webp.net-resizeimage (1).png")); // NOI18N
        icoMedico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icoMedicoMouseClicked(evt);
            }
        });

        icoPaciente.setIcon(new javax.swing.ImageIcon("C:\\Users\\alexs\\Downloads\\Webp.net-resizeimage (5).png")); // NOI18N
        icoPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icoPacienteMouseClicked(evt);
            }
        });

        icoAgenda.setIcon(new javax.swing.ImageIcon("C:\\Users\\alexs\\Downloads\\Webp.net-resizeimage (3).png")); // NOI18N
        icoAgenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icoAgendaMouseClicked(evt);
            }
        });

        icoConvenio.setIcon(new javax.swing.ImageIcon("C:\\Users\\alexs\\Downloads\\599f3922046be200019f134d_icon-home-convenios.png")); // NOI18N
        icoConvenio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icoConvenioMouseClicked(evt);
            }
        });

        icoPagamento.setIcon(new javax.swing.ImageIcon("C:\\Users\\alexs\\Downloads\\Webp.net-resizeimage (4).png")); // NOI18N
        icoPagamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icoPagamentoMouseClicked(evt);
            }
        });

        icoUsuario.setIcon(new javax.swing.ImageIcon("C:\\Users\\alexs\\Downloads\\Webp.net-resizeimage (8).png")); // NOI18N
        icoUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icoUsuarioMouseClicked(evt);
            }
        });

        jMenu1.setText("Clinica");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Cadastros");

        jMenuItem1.setText("Usuários");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem4.setText("Médicos");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("Pacientes");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem2.setText("Especialidades");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem3.setText("Convênios");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Relatórios");

        jMenuItem6.setText("Atendimentos");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(icoMedico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(icoPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(icoAgenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(icoPagamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(28, 28, 28)
                .addComponent(icoUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(icoConvenio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(icoConvenio)
                    .addComponent(icoPaciente)
                    .addComponent(icoMedico)
                    .addComponent(icoAgenda)
                    .addComponent(icoPagamento)
                    .addComponent(icoUsuario))
                .addContainerGap(380, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        UsuarioBuscar tela = new UsuarioBuscar();
        tela.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        EspecialidadeBuscar tela = new EspecialidadeBuscar();
        this.setVisible(false);
        tela.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        ConvenioBuscar tela = new ConvenioBuscar();
        this.setVisible(false);
        tela.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        MedicoBuscar tela = new MedicoBuscar();
        this.setVisible(false);
        tela.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        PacienteBuscar tela = new PacienteBuscar();
        this.setVisible(false);
        tela.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void icoMedicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoMedicoMouseClicked
        // TODO add your handling code here:
        MedicoBuscar tela = new MedicoBuscar();
        this.setVisible(false);
        tela.setVisible(true);
    }//GEN-LAST:event_icoMedicoMouseClicked

    private void icoPacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoPacienteMouseClicked
        // TODO add your handling code here:
        PacienteBuscar tela = new PacienteBuscar();
        this.setVisible(false);
        tela.setVisible(true);
    }//GEN-LAST:event_icoPacienteMouseClicked

    private void icoAgendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoAgendaMouseClicked
        // TODO add your handling code here:
        AtendimentoNovo tela = new AtendimentoNovo( new Atendimento());
        tela.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_icoAgendaMouseClicked

    private void icoPagamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoPagamentoMouseClicked
        // TODO add your handling code here:
        PagamentoNovo tela = new PagamentoNovo( new Pagamento());
        tela.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_icoPagamentoMouseClicked

    private void icoConvenioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoConvenioMouseClicked
        // TODO add your handling code here:
        UsuarioBuscar tela = new UsuarioBuscar();
        tela.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_icoConvenioMouseClicked

    private void icoUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoUsuarioMouseClicked
        // TODO add your handling code here:
        ConvenioBuscar tela = new ConvenioBuscar();
        tela.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_icoUsuarioMouseClicked

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        carregarRelatorio("Relatorios/Consultas.jrxml", null);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel icoAgenda;
    private javax.swing.JLabel icoConvenio;
    private javax.swing.JLabel icoMedico;
    private javax.swing.JLabel icoPaciente;
    private javax.swing.JLabel icoPagamento;
    private javax.swing.JLabel icoUsuario;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    // End of variables declaration//GEN-END:variables
}