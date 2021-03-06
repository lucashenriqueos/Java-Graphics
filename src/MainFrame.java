
import java.awt.event.ItemListener;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;

import org.lucashos.computaca.grafica.DesenhaArray;
import org.lucashos.computaca.grafica.util.Geometria;
import org.lucashos.computaca.grafica.util.Obj3D;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author curso
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
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

        jPanel1 = new javax.swing.JPanel();
        txtTheta = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtPhi = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtRho = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtD = new javax.swing.JTextField();
        btnGO = new javax.swing.JButton();
        addTheta = new javax.swing.JButton();
        rmTheta = new javax.swing.JButton();
        addPhi = new javax.swing.JButton();
        rmPhi = new javax.swing.JButton();
        rmRho = new javax.swing.JButton();
        addRho = new javax.swing.JButton();
        rmD = new javax.swing.JButton();
        addD = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        boxObjetos = new javax.swing.JComboBox<>();
        addObject = new javax.swing.JButton();
        panelDesenho = new DesenhaArray();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel12.setText("Theta");

        jLabel13.setText("Phi");

        jLabel14.setText("Rho");
        jLabel14.setToolTipText("");

        jLabel15.setText("d");

        btnGO.setText("Go!");
        btnGO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGOActionPerformed(evt);
            }
        });

        addTheta.setLabel(">>");
        addTheta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addThetaActionPerformed(evt);
            }
        });

        rmTheta.setLabel("<<");
        rmTheta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rmThetaActionPerformed(evt);
            }
        });

        addPhi.setLabel(">>");
        addPhi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPhiActionPerformed(evt);
            }
        });

        rmPhi.setLabel("<<");
        rmPhi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rmPhiActionPerformed(evt);
            }
        });

        rmRho.setLabel("<<");
        rmRho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rmRhoActionPerformed(evt);
            }
        });

        addRho.setText(">>");
        addRho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRhoActionPerformed(evt);
            }
        });

        rmD.setLabel("<<");
        rmD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rmDActionPerformed(evt);
            }
        });

        addD.setText(">>");
        addD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDActionPerformed(evt);
            }
        });

        jLabel1.setText("Objetos");

        boxObjetos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxObjetosActionPerformed(evt);
            }
        });

        addObject.setText("Adicionar");
        addObject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addObjectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnGO, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                        .addGap(760, 760, 760))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtD, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtRho, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtPhi, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(txtTheta, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rmPhi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(addPhi))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rmRho)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(addRho))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rmD)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(addD))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rmTheta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(addTheta)
                                .addGap(48, 48, 48)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(boxObjetos, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(addObject, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtTheta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addTheta)
                    .addComponent(rmTheta)
                    .addComponent(jLabel1)
                    .addComponent(boxObjetos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(addPhi)
                        .addComponent(rmPhi))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(txtPhi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtRho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rmRho)
                    .addComponent(addRho))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rmD)
                        .addComponent(addD)))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGO)
                    .addComponent(addObject))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        addTheta.getAccessibleContext().setAccessibleName("addTheta");
        addTheta.getAccessibleContext().setAccessibleDescription("");
        rmTheta.getAccessibleContext().setAccessibleDescription("");
        jLabel1.getAccessibleContext().setAccessibleName("");
        jLabel1.getAccessibleContext().setAccessibleDescription("Objetos");

        javax.swing.GroupLayout panelDesenhoLayout = new javax.swing.GroupLayout(panelDesenho);
        panelDesenho.setLayout(panelDesenhoLayout);
        panelDesenhoLayout.setHorizontalGroup(
            panelDesenhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1040, Short.MAX_VALUE)
        );
        panelDesenhoLayout.setVerticalGroup(
            panelDesenhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 248, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelDesenho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelDesenho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGOActionPerformed
        //((DesenhaArray) panelDesenho).atualizaDados(txtTheta.getText(), txtPhi.getText(), txtRho.getText(), txtD.getText());
        ((DesenhaArray) panelDesenho).iniciarAnimacao();
    }//GEN-LAST:event_btnGOActionPerformed

    private void addPhiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPhiActionPerformed
        incrementalFunction(evt, "phi");
        txtPhi.setText(((DesenhaArray) panelDesenho).getMod("phi").toString());
    }//GEN-LAST:event_addPhiActionPerformed

    private void rmThetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rmThetaActionPerformed
        decrementalFunction(evt, "theta");
        txtTheta.setText(((DesenhaArray) panelDesenho).getMod("theta").toString());
    }//GEN-LAST:event_rmThetaActionPerformed

    private void addThetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addThetaActionPerformed
        incrementalFunction(evt, "theta");
        txtTheta.setText(((DesenhaArray) panelDesenho).getMod("theta").toString());
    }//GEN-LAST:event_addThetaActionPerformed

    private void rmPhiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rmPhiActionPerformed
        decrementalFunction(evt, "phi");
        txtPhi.setText(((DesenhaArray) panelDesenho).getMod("phi").toString());
    }//GEN-LAST:event_rmPhiActionPerformed

    private void rmRhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rmRhoActionPerformed
        decrementalFunction(evt, "rho");
        txtRho.setText(((DesenhaArray) panelDesenho).getMod("rho").toString());
    }//GEN-LAST:event_rmRhoActionPerformed

    private void addRhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRhoActionPerformed
        incrementalFunction(evt, "rho");
        txtRho.setText(((DesenhaArray) panelDesenho).getMod("rho").toString());
    }//GEN-LAST:event_addRhoActionPerformed

    private void rmDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rmDActionPerformed
        decrementalFunction(evt, "d");
        txtD.setText(((DesenhaArray) panelDesenho).getMod("d").toString());
    }//GEN-LAST:event_rmDActionPerformed

    private void addDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDActionPerformed
        incrementalFunction(evt, "d");
        txtD.setText(((DesenhaArray) panelDesenho).getMod("d").toString());
    }//GEN-LAST:event_addDActionPerformed

    private void boxObjetosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxObjetosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxObjetosActionPerformed

    private void addObjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addObjectActionPerformed
        try {
            ((DesenhaArray) panelDesenho).CarregaObjetos(this);
        } catch (IOException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        boxObjetos.removeAllItems();
        objetos = ((DesenhaArray) panelDesenho).objetos;
        objetos.forEach(obj -> {
            boxObjetos.addItem(obj.nome);
        });
    }//GEN-LAST:event_addObjectActionPerformed


    private void incrementalFunction(java.awt.event.ActionEvent evt, String id) {
        if(id.equals("d")){
            ((DesenhaArray) panelDesenho).addMod(20, "d");
        } else if (id.equals("rho")){
            ((DesenhaArray) panelDesenho).addMod(0.3, "rho");
        } else if (id.equals("phi")){
            ((DesenhaArray) panelDesenho).addMod(0.1, "phi");
        } else if (id.equals("theta")){
            ((DesenhaArray) panelDesenho).addMod(0.1, "theta");
        }            
    }

    private void decrementalFunction(java.awt.event.ActionEvent evt, String id) {
        if(id.equals("d")){
            ((DesenhaArray) panelDesenho).rmMod(20, "d");
        } else if (id.equals("rho")){
            ((DesenhaArray) panelDesenho).rmMod(0.3, "rho");
        } else if (id.equals("phi")){
            ((DesenhaArray) panelDesenho).rmMod(0.1, "phi");
        } else if (id.equals("theta")){
            ((DesenhaArray) panelDesenho).rmMod(0.1, "theta");
        }         
    }

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addD;
    private javax.swing.JButton addObject;
    private javax.swing.JButton addPhi;
    private javax.swing.JButton addRho;
    private javax.swing.JButton addTheta;
    private javax.swing.JComboBox<String> boxObjetos;
    private javax.swing.JButton btnGO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelDesenho;
    private javax.swing.JButton rmD;
    private javax.swing.JButton rmPhi;
    private javax.swing.JButton rmRho;
    private javax.swing.JButton rmTheta;
    private javax.swing.JTextField txtD;
    private javax.swing.JTextField txtPhi;
    private javax.swing.JTextField txtRho;
    private javax.swing.JTextField txtTheta;
    // End of variables declaration//GEN-END:variables
    private List<Obj3D> objetos;
}
