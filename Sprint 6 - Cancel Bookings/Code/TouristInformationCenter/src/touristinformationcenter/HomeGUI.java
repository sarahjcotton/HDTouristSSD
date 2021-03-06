/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package touristinformationcenter;

/**
 *
 * @author Sarah
 */
public class HomeGUI extends javax.swing.JFrame {

    /**
     * Creates new form HomeGUI
     */
    public HomeGUI() {
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
        btnAdd = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        btnAddAcc = new javax.swing.JButton();
        btnSearchAcc = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tourist Information Center");

        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel1.setText("TouristInformation Center");

        btnAdd.setText("Add Customer");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel2.setText("Main Menu");

        btnSearch.setText("Search Customer");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnAddAcc.setText("Add Accommodation");
        btnAddAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAccActionPerformed(evt);
            }
        });

        btnSearchAcc.setText("Search Accommodation");
        btnSearchAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchAccActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(116, 116, 116))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAddAcc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSearchAcc))
                .addGap(84, 84, 84))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(btnAdd)
                .addGap(28, 28, 28)
                .addComponent(btnSearch)
                .addGap(32, 32, 32)
                .addComponent(btnAddAcc)
                .addGap(30, 30, 30)
                .addComponent(btnSearchAcc)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-333)/2, (screenSize.height-338)/2, 333, 338);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAccActionPerformed
        // TODO add your handling code here:
        AddHotelGUI addHotel = new AddHotelGUI();
        addHotel.setVisible(true);
        addHotel.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnAddAccActionPerformed

    private void btnSearchAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchAccActionPerformed
        // TODO add your handling code here:
        SearchHotelGUI searchHGUI = new SearchHotelGUI(null, null, null);
        searchHGUI.setVisible(true);
        searchHGUI.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnSearchAccActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        AddCustomerGUI addGUI = new AddCustomerGUI();
        addGUI.setVisible(true);
        addGUI.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        SearchCustGUI searchGUI = new SearchCustGUI(null, null, null);
        searchGUI.setVisible(true);
        searchGUI.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnSearchActionPerformed

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
            java.util.logging.Logger.getLogger(HomeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new HomeGUI().setVisible(true);
                
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAddAcc;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSearchAcc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
