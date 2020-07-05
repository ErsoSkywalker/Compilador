
package UI;

import Logica.Lector;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author conti
 */
public class MainUI extends javax.swing.JFrame {
//
    /**
     * @return the txtAreaOmg
     */
    public javax.swing.JTextArea getTxtAreaOmg() {
        return txtAreaOmg;
    }

    /**
     * @param txtAreaOmg the txtAreaOmg to set
     */
    public void setTxtAreaOmg(javax.swing.JTextArea txtAreaOmg) {
        this.txtAreaOmg = txtAreaOmg;
    }

    int VariableValidadorMensajeInicio= 0;
    public MainUI() throws IOException {
        initComponents();
        txtAreaOmg.setEditable(false);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlShadow = new rojeru_san.RSPanelShadow();
        pnlBarraNavegacion = new javax.swing.JPanel();
        btnExit = new rojeru_san.RSButtonRiple();
        jLabel1 = new javax.swing.JLabel();
        pnlMain = new javax.swing.JPanel();
        txtArchivoACompilar = new rojeru_san.RSMTextFull();
        btnCompilar = new rojeru_san.RSButtonRiple();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaOmg = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlBarraNavegacion.setBackground(new java.awt.Color(102, 204, 255));
        pnlBarraNavegacion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnExit.setBackground(new java.awt.Color(102, 204, 255));
        btnExit.setText("Cerrar");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Bienvenido al Himalaya :D");

        javax.swing.GroupLayout pnlBarraNavegacionLayout = new javax.swing.GroupLayout(pnlBarraNavegacion);
        pnlBarraNavegacion.setLayout(pnlBarraNavegacionLayout);
        pnlBarraNavegacionLayout.setHorizontalGroup(
            pnlBarraNavegacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBarraNavegacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlBarraNavegacionLayout.setVerticalGroup(
            pnlBarraNavegacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBarraNavegacionLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(pnlBarraNavegacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlShadow.add(pnlBarraNavegacion, java.awt.BorderLayout.PAGE_START);

        txtArchivoACompilar.setPlaceholder("Inserta Archivo :D");

        btnCompilar.setText("Compilar");
        btnCompilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompilarActionPerformed(evt);
            }
        });

        txtAreaOmg.setColumns(20);
        txtAreaOmg.setRows(5);
        jScrollPane2.setViewportView(txtAreaOmg);

        javax.swing.GroupLayout pnlMainLayout = new javax.swing.GroupLayout(pnlMain);
        pnlMain.setLayout(pnlMainLayout);
        pnlMainLayout.setHorizontalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addComponent(txtArchivoACompilar, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCompilar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlMainLayout.setVerticalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtArchivoACompilar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCompilar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        pnlShadow.add(pnlMain, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlShadow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlShadow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        
        
        System.exit(0);
        
        
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnCompilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompilarActionPerformed
       txtAreaOmg.setText("");
       
    if(!txtArchivoACompilar.getText().trim().equalsIgnoreCase("")){
        if(VariableValidadorMensajeInicio == 0){
                getTxtAreaOmg().setText("Compilando el siguiente Archivo: ");
        }
        
        VariableValidadorMensajeInicio ++;
        
        
        
        try {
            Lector lc = new Lector(txtArchivoACompilar.getText(), txtAreaOmg);
            //getTxtAreaOmg().setText(getTxtAreaOmg().getText() + "\n" + txtArchivoACompilar.getText());
        } catch (IOException ex) {
            Logger.getLogger(MainUI.class.getName()).log(Level.SEVERE, null, ex);
        }
            
                
        
    }else{
        // Agregar mensajito
        JOptionPane.showMessageDialog(null, "¡Debes insertar un archivo a compilar :D!", "Aviso", JOptionPane.ERROR_MESSAGE);
    }
        
        
        txtArchivoACompilar.setText("");
    }//GEN-LAST:event_btnCompilarActionPerformed

    
    public javax.swing.JTextArea getTextArea(){
        return txtAreaOmg;
    }
    
    
   
    public static void main(String args[]) throws IOException {
       
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                try {
                    new MainUI().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(MainUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.RSButtonRiple btnCompilar;
    private rojeru_san.RSButtonRiple btnExit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel pnlBarraNavegacion;
    private javax.swing.JPanel pnlMain;
    private rojeru_san.RSPanelShadow pnlShadow;
    private rojeru_san.RSMTextFull txtArchivoACompilar;
    private javax.swing.JTextArea txtAreaOmg;
    // End of variables declaration//GEN-END:variables
}
