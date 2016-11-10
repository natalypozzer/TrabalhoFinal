/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.filechooser.FileNameExtensionFilter;
import model.Arquivo;
import model.Moeda;
import model.tablemodel.MoedaCellRenderer;
import model.tablemodel.MoedaHeaderRenderer;
import model.tablemodel.MoedaTableModel;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
      
/**
 *
 * @author aluno
 */
public class frmPrincipal extends javax.swing.JFrame {
    private Arquivo moedas=new Arquivo();
    private MoedaTableModel modeltal;
    /**
     * Creates new form frmPrincipal
     */
    public frmPrincipal() {
        initComponents();
        //jTable1.setModel(new MoedaTableModel(new Arquivo().listarTodasMoedas()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jLabel1 = new javax.swing.JLabel();
        jFrmDataInicial = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jFrmDataFinal = new javax.swing.JFormattedTextField();
        jBtnImportar = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLblGrafico = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jnomeArquivo = new javax.swing.JLabel();
        jCheckTodas = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Trabalho Final Moedas");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Data inicial:");

        jFrmDataInicial.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        jFrmDataInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFrmDataInicialActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Data final:");

        jFrmDataFinal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));

        jBtnImportar.setText("Importar CSV");
        jBtnImportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnImportarActionPerformed(evt);
            }
        });

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Moeda", "Data", "Valor Compra", "Valor Venda"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jTabbedPane1.addTab("Tabela", jScrollPane1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLblGrafico, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLblGrafico, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Gráfico", jPanel1);

        jButton1.setText("Buscar por Data");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Arquivo Utilizado:");

        jnomeArquivo.setText("Não Importado");

        jCheckTodas.setText("Mostrar todas as moedas do arquivo");
        jCheckTodas.setEnabled(false);
        jCheckTodas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckTodasActionPerformed(evt);
            }
        });

        jLabel4.setText("<html><b>Desenvolvedores:</b> Douglas Kihara <i>(krenjix)</i>, Nataly Pozzer <i>(natalypozzer)</i> e Volmar Madrid <i>(volspeed)</i>.</html>");

        jButton3.setText("Baixar Arquivo");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTabbedPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jFrmDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jFrmDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(1, 1, 1)
                                .addComponent(jnomeArquivo)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCheckTodas)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jBtnImportar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3))))
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jFrmDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnImportar)
                    .addComponent(jButton3))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jFrmDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jnomeArquivo)
                    .addComponent(jCheckTodas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
                .addGap(11, 11, 11)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jFrmDataInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFrmDataInicialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFrmDataInicialActionPerformed

    private void jBtnImportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnImportarActionPerformed
        // TODO add your handling code here:
        jFileChooser1.addChoosableFileFilter(new FileNameExtensionFilter("Arquivo de csv(*.csv)","csv"));
        jFileChooser1.setAcceptAllFileFilterUsed(false);
        jFileChooser1.setMultiSelectionEnabled(false);
        
        if(jFileChooser1.showOpenDialog(this)==jFileChooser1.APPROVE_OPTION)
        {
            moedas.setLocalarquivo(jFileChooser1.getSelectedFile().getPath());
            System.out.println(jFileChooser1.getSelectedFile().getPath());
            modeltal=new MoedaTableModel(moedas.listarTodasMoedas());
            jnomeArquivo.setText(jFileChooser1.getSelectedFile().getName());
            atualizarTab();
            jCheckTodas.setSelected(true);
        }
    }//GEN-LAST:event_jBtnImportarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.out.println(jFrmDataInicial.getValue()+"--"+jFrmDataFinal.getValue());
        if(!moedas.getLocalarquivo().equals(""))
        {SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
         try {
            Date data_inicial = new Date(formato.parse(jFrmDataInicial.getText()).getTime());
            Date data_final = new Date(formato.parse(jFrmDataFinal.getText()).getTime());
            List<Moeda> listafiltro=moedas.listarFiltro(data_inicial, data_final);
            modeltal=new MoedaTableModel(listafiltro);
            jCheckTodas.setSelected(false);
            jCheckTodas.setEnabled(true);
         } catch (ParseException ex) {
            Logger.getLogger(frmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        atualizarTab();}
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCheckTodasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckTodasActionPerformed
        // TODO add your handling code here:
        if(jCheckTodas.isSelected()){
          modeltal=new MoedaTableModel(moedas.listarTodasMoedas());
          jFrmDataFinal.setValue(null);
          jFrmDataInicial.setValue(null);
          atualizarTab();
          jCheckTodas.setEnabled(false);
        }
    }//GEN-LAST:event_jCheckTodasActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
     
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       Desktop d = Desktop.getDesktop();
      try {
         d.browse( new URI( "http://www4.bcb.gov.br/pec/taxas/port/ptaxnpesq.asp?id=txcotacao" ) );
      }
      catch ( IOException e ) {
         System.out.println(e);
      }
      catch ( URISyntaxException e ) {
         System.out.println(e);
      }    // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    private void atualizarTab(){
        jTable1.setModel(modeltal);
        for(int i=0; i < jTable1.getColumnCount(); i++){
            jTable1.getColumnModel().getColumn(i).setCellRenderer(new MoedaCellRenderer(modeltal.getLista()));
            jTable1.getColumnModel().getColumn(i).setHeaderRenderer(new MoedaHeaderRenderer());
        }
    }
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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnImportar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckTodas;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JFormattedTextField jFrmDataFinal;
    private javax.swing.JFormattedTextField jFrmDataInicial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLblGrafico;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel jnomeArquivo;
    // End of variables declaration//GEN-END:variables
}
             
