/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Entity.LinkEntity;
import static View.DiffResult.diff_resp_delete;
import static View.DiffResult.diff_resp_header_delete;
import static View.DiffResult.diff_resp_header_insert;
import static View.DiffResult.diff_resp_insert;
import static View.DiffResult.root_resp;
import static View.DiffResult.root_resp_header;
import static View.DiffResult.vuln_resp;
import static View.DiffResult.vuln_resp_header;
import fun.mike.dmp.Diff;
import fun.mike.dmp.DiffMatchPatch;
import java.awt.Color;
import java.util.LinkedList;

/**
 *
 * @author Shaco JX
 */
public class FuzzOut3 extends javax.swing.JDialog {

    /**
     * Creates new form FuzzOut3
     */
    DiffResult diffresult;
    String root_resp_heaer = "";
    String root_resp = "";

    public FuzzOut3(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        diffresult = new DiffResult(parent, true);

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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Response = new javax.swing.JTextArea();
        link = new javax.swing.JTextField();
        pay = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Diff = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Header_response = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Response Link");

        Response.setBackground(new java.awt.Color(0, 0, 0));
        Response.setColumns(20);
        Response.setForeground(new java.awt.Color(51, 255, 51));
        Response.setLineWrap(true);
        Response.setRows(5);
        Response.setWrapStyleWord(true);
        jScrollPane1.setViewportView(Response);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Payload");

        Diff.setBackground(new java.awt.Color(255, 51, 0));
        Diff.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Diff.setText("Diff");
        Diff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiffActionPerformed(evt);
            }
        });

        Header_response.setBackground(new java.awt.Color(0, 0, 0));
        Header_response.setColumns(20);
        Header_response.setForeground(new java.awt.Color(51, 255, 51));
        Header_response.setLineWrap(true);
        Header_response.setRows(5);
        Header_response.setWrapStyleWord(true);
        jScrollPane2.setViewportView(Header_response);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Header Response");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Diff, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pay, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
                    .addComponent(link)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Diff, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(102, 102, 102))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(link, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pay, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DiffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiffActionPerformed
        // TODO add your handling code here:

        diffresult.root_resp.removeAll();
        diffresult.root_resp_header.removeAll();
        diffresult.vuln_resp.removeAll();
        diffresult.vuln_resp_header.removeAll();
        diffresult.diff_resp_delete.removeAll();
        diffresult.diff_resp_header_delete.removeAll();
        diffresult.diff_resp_insert.removeAll();
        diffresult.diff_resp_header_insert.removeAll();

        diffresult.vuln_resp_header.setText(this.Header_response.getText());
        diffresult.vuln_resp.setText(Response.getText());

        for (LinkEntity le : View.VSH.LinkEntt) {
            if (le.getLink().equalsIgnoreCase(link.getText())) {
                root_resp_heaer = le.getHeader_response();
                root_resp = le.getResponse();
            }
        }
        diffresult.root_resp_header.setText(root_resp_heaer);
        diffresult.root_resp.setText(root_resp);

        DiffMatchPatch dmp = new DiffMatchPatch();
        LinkedList<Diff> diff_header = dmp.diff_main(root_resp_heaer, this.Header_response.getText());
        LinkedList<Diff> diff_resp = dmp.diff_main(root_resp, Response.getText());

        diffresult.diff_resp_header_delete.setText("");
        diffresult.diff_resp_header_insert.setText("");
        diffresult.diff_resp_delete.setText("");
        diffresult.diff_resp_insert.setText("");
        dmp.diff_cleanupEfficiency(diff_header);
        for (int i = 0; i < diff_header.size(); i++) {
            if (diff_header.get(i).toString().contains("DELETE")) {
                diffresult.diff_resp_header_delete.append(diff_header.get(i).toString() + "\n");
            } else if (diff_header.get(i).toString().contains("INSERT")) {
                diffresult.diff_resp_header_insert.append(diff_header.get(i).toString() + "\n");
            }
        }
        dmp.diff_cleanupEfficiency(diff_resp);
        for (int i = 0; i < diff_resp.size(); i++) {
            if (diff_resp.get(i).toString().contains("DELETE")) {
                diffresult.diff_resp_delete.append(diff_resp.get(i).toString() + "\n");
            } else if (diff_resp.get(i).toString().contains("INSERT")) {
                diffresult.diff_resp_insert.append(diff_resp.get(i).toString() + "\n");
            }
        }
        diffresult.setVisible(true);
    }//GEN-LAST:event_DiffActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(FuzzOut3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(FuzzOut3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(FuzzOut3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(FuzzOut3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                FuzzOut3 dialog = new FuzzOut3(new javax.swing.JFrame(), true);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                    @Override
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
//                dialog.setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Diff;
    public static javax.swing.JTextArea Header_response;
    public static javax.swing.JTextArea Response;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTextField link;
    public static javax.swing.JTextField pay;
    // End of variables declaration//GEN-END:variables
}
