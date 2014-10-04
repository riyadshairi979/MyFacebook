/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * UpdatePanel.java
 *
 * Created on Apr 27, 2012, 4:53:23 AM
 */
package myfacebook;

/**
 *
 * @author Riyad
 */
public class UpdatePanel extends javax.swing.JPanel {

    /** Creates new form UpdatePanel */
    public UpdatePanel(String senderDate, String comment) {
        initComponents();
        senderDateLabel.setText(senderDate);
        commentLabel.setText(comment);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        senderDateLabel = new javax.swing.JLabel();
        commentLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 153));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        setMaximumSize(new java.awt.Dimension(750, 83));

        senderDateLabel.setFont(new java.awt.Font("Tahoma", 1, 11));
        senderDateLabel.setText("<html>Riyad<br>April 20 near Dhaka</html>");
        senderDateLabel.setName("senderDateLabel"); // NOI18N

        commentLabel.setFont(new java.awt.Font("Tahoma", 0, 13));
        commentLabel.setText("jLabel2");
        commentLabel.setName("commentLabel"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(commentLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 724, Short.MAX_VALUE)
                    .addComponent(senderDateLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 724, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(senderDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(commentLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel commentLabel;
    private javax.swing.JLabel senderDateLabel;
    // End of variables declaration//GEN-END:variables
}