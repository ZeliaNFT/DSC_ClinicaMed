/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package br.edu.ifnmg.clinicamedica_apresentacao_desktop;

import br.edu.ifnmg.clinicamedica_logicaapp.Medico;
import br.edu.ifnmg.clinicamedica_logicaapp.MedicoRepositorio;
import br.edu.ifnmg.clinicamedica_logicaapp.RepositorioFactory;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alexs
 */
public class MedicoBuscar extends javax.swing.JInternalFrame {
    
    MedicoRepositorio repositorio;
    
    Medico medico;

    /**
     * Creates new form MedicoBuscar
     */
    public MedicoBuscar() {
        
        repositorio = RepositorioFactory.getMedicoRepositorio();
        medico = new Medico();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtMedico = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblResultado = new javax.swing.JTable();

        setClosable(true);

        jLabel1.setText("Médico");
        jLabel1.setMaximumSize(new java.awt.Dimension(550, 512));
        jLabel1.setMinimumSize(new java.awt.Dimension(550, 512));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        tblResultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Gênero", "CPF", "Endereço", "CRM", "Especialidade", "Telefone", "Data Nasc.", "E-mail"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblResultado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblResultadoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblResultado);
        if (tblResultado.getColumnModel().getColumnCount() > 0) {
            tblResultado.getColumnModel().getColumn(0).setMaxWidth(40);
            tblResultado.getColumnModel().getColumn(2).setMaxWidth(60);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtMedico))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 305, Short.MAX_VALUE)
                        .addComponent(btnCadastrar)
                        .addGap(300, 300, 300)
                        .addComponent(btnLimpar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(btnCadastrar)
                    .addComponent(btnLimpar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        // TODO add your handling code here:
        MedicoEditar tela = new MedicoEditar(new Medico());
        this.getParent().add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        medico.setCrm(txtMedico.getText());
        List<Medico> resultado = repositorio.Buscar(medico);
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Nome");
        modelo.addColumn("Gênero");
        modelo.addColumn("CPF");
        modelo.addColumn("Endereço");
        modelo.addColumn("CRM");
        modelo.addColumn("Especialidade");
        modelo.addColumn("Telefone");
        modelo.addColumn("Data Nasc.");
        modelo.addColumn("E-mail");
        
        for(Medico u : resultado){
            Vector linha = new Vector();
            linha.add(u.getId());
            linha.add(u.getNome());
            linha.add(u.getGenero());
            linha.add(u.getCpf());
            linha.add(u.getEndereco());
            linha.add(u.getCrm());
            linha.add(u.getEspecializacao().getEspecializacao());
            linha.add(u.getTelefone());
            linha.add(u.getDataNascimento());
            linha.add(u.getEmail());
            
            modelo.addRow(linha);
            
        }
        
        tblResultado.setModel(modelo);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        // TODO add your handling code here:
        if(JOptionPane.showConfirmDialog(this, "Desejar realmente limpar a busca?", "Confirmação",JOptionPane.YES_NO_OPTION)== JOptionPane.YES_OPTION){
        
            txtMedico.setText("");

            DefaultTableModel modelo = new DefaultTableModel();

            modelo.addColumn("ID");
            modelo.addColumn("Nome");
            modelo.addColumn("Gênero");
            modelo.addColumn("CPF");
            modelo.addColumn("Endereço");
            modelo.addColumn("CRM");
            modelo.addColumn("Especialidade");
            modelo.addColumn("Telefone");
            modelo.addColumn("Data Nasc.");
            modelo.addColumn("E-mail");

            tblResultado.setModel(modelo);
        }
    }//GEN-LAST:event_btnLimparActionPerformed

    private void tblResultadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblResultadoMouseClicked
        // TODO add your handling code here:
        int linha = tblResultado.getSelectedRow();
        
        Long id = Long.parseLong(tblResultado.getValueAt(linha, 0).toString() );
        
        Medico u = repositorio.Abrir(id);
        
        MedicoEditar tela = new MedicoEditar(u);
        this.getParent().add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_tblResultadoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblResultado;
    private javax.swing.JTextField txtMedico;
    // End of variables declaration//GEN-END:variables
}