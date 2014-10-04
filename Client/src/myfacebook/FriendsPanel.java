/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FriendsPanel.java
 *
 * Created on Apr 21, 2012, 2:33:34 AM
 */
package myfacebook;

import stubs.Post;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import stubs.UserProfileStub;

/**
 *
 * @author Riyad
 */
public class FriendsPanel extends javax.swing.JPanel {

    private final MainFrame mainFrame;
    CommModule commModule;
    ArrayList<UserProfileStub> friendsArray = null;
    HashMap<String, ChatFrame> chatWindowMap = new HashMap<String, ChatFrame>();

    /** Creates new form FriendsPanel */
    public FriendsPanel(MainFrame mainFrame, CommModule commModule) {
        this.mainFrame = mainFrame;
        this.commModule = commModule;
        initComponents();
        initializeFriendList();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        friendsList = new javax.swing.JList();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        friendsProfileLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        collegetf = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        nametf = new javax.swing.JTextField();
        gradyeartf = new javax.swing.JTextField();
        professiontf = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        citytf = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        companytf = new javax.swing.JTextField();
        postContenttf = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        postButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        nameCriteria = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        cityCriteria = new javax.swing.JTextField();
        collegeCriteria = new javax.swing.JTextField();

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance().getContext().getResourceMap(FriendsPanel.class);
        setBackground(resourceMap.getColor("Form.background")); // NOI18N
        setName("Form"); // NOI18N
        setPreferredSize(new java.awt.Dimension(750, 450));

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        friendsList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        friendsList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        friendsList.setName("friendsList"); // NOI18N
        friendsList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                friendsListMouseClicked(evt);
            }
        });
        friendsList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                friendsListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(friendsList);

        jButton1.setText(resourceMap.getString("jButton1.text")); // NOI18N
        jButton1.setName("jButton1"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel9.setFont(resourceMap.getFont("jLabel9.font")); // NOI18N
        jLabel9.setText(resourceMap.getString("jLabel9.text")); // NOI18N
        jLabel9.setName("jLabel9"); // NOI18N

        jLabel10.setFont(resourceMap.getFont("jLabel10.font")); // NOI18N
        jLabel10.setText(resourceMap.getString("jLabel10.text")); // NOI18N
        jLabel10.setName("jLabel10"); // NOI18N

        friendsProfileLabel.setFont(resourceMap.getFont("friendsProfileLabel.font")); // NOI18N
        friendsProfileLabel.setText(resourceMap.getString("friendsProfileLabel.text")); // NOI18N
        friendsProfileLabel.setName("friendsProfileLabel"); // NOI18N

        jPanel1.setBackground(resourceMap.getColor("jPanel1.background")); // NOI18N
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setName("jPanel1"); // NOI18N

        jLabel4.setText(resourceMap.getString("jLabel4.text")); // NOI18N
        jLabel4.setName("jLabel4"); // NOI18N

        collegetf.setEditable(false);
        collegetf.setText(resourceMap.getString("collegetf.text")); // NOI18N
        collegetf.setName("collegetf"); // NOI18N

        jLabel2.setFont(resourceMap.getFont("jLabel7.font")); // NOI18N
        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N

        nametf.setEditable(false);
        nametf.setText(resourceMap.getString("nametf.text")); // NOI18N
        nametf.setName("nametf"); // NOI18N

        gradyeartf.setEditable(false);
        gradyeartf.setText(resourceMap.getString("gradyeartf.text")); // NOI18N
        gradyeartf.setName("gradyeartf"); // NOI18N

        professiontf.setEditable(false);
        professiontf.setText(resourceMap.getString("professiontf.text")); // NOI18N
        professiontf.setName("professiontf"); // NOI18N

        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        jLabel5.setText(resourceMap.getString("jLabel5.text")); // NOI18N
        jLabel5.setName("jLabel5"); // NOI18N

        jLabel7.setFont(resourceMap.getFont("jLabel7.font")); // NOI18N
        jLabel7.setText(resourceMap.getString("jLabel7.text")); // NOI18N
        jLabel7.setName("jLabel7"); // NOI18N

        jLabel3.setText(resourceMap.getString("jLabel3.text")); // NOI18N
        jLabel3.setName("jLabel3"); // NOI18N

        jLabel8.setText(resourceMap.getString("jLabel8.text")); // NOI18N
        jLabel8.setName("jLabel8"); // NOI18N

        citytf.setEditable(false);
        citytf.setText(resourceMap.getString("citytf.text")); // NOI18N
        citytf.setName("citytf"); // NOI18N

        jLabel6.setText(resourceMap.getString("jLabel6.text")); // NOI18N
        jLabel6.setName("jLabel6"); // NOI18N

        companytf.setEditable(false);
        companytf.setText(resourceMap.getString("companytf.text")); // NOI18N
        companytf.setName("companytf"); // NOI18N

        postContenttf.setEditable(false);
        postContenttf.setText(resourceMap.getString("postContenttf.text")); // NOI18N
        postContenttf.setName("postContenttf"); // NOI18N
        postContenttf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postContenttfActionPerformed(evt);
            }
        });

        jLabel15.setFont(resourceMap.getFont("jLabel15.font")); // NOI18N
        jLabel15.setText(resourceMap.getString("jLabel15.text")); // NOI18N
        jLabel15.setName("jLabel15"); // NOI18N

        postButton.setText(resourceMap.getString("postButton.text")); // NOI18N
        postButton.setName("postButton"); // NOI18N
        postButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postButtonActionPerformed(evt);
            }
        });

        jSeparator1.setName("jSeparator1"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(postContenttf, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(postButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7)
                        .addComponent(jLabel8)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(jLabel3)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2))
                            .addGap(28, 28, 28)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(professiontf, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(companytf, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(collegetf, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(gradyeartf, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(nametf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                                .addComponent(citytf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {collegetf, companytf, gradyeartf, nametf, professiontf});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(postContenttf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(postButton)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nametf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(professiontf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(companytf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(collegetf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gradyeartf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(33, 33, 33)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(citytf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        nameCriteria.setText(resourceMap.getString("nameCriteria.text")); // NOI18N
        nameCriteria.setName("nameCriteria"); // NOI18N

        jLabel12.setText(resourceMap.getString("jLabel12.text")); // NOI18N
        jLabel12.setName("jLabel12"); // NOI18N

        jLabel13.setText(resourceMap.getString("jLabel13.text")); // NOI18N
        jLabel13.setName("jLabel13"); // NOI18N

        jLabel14.setText(resourceMap.getString("jLabel14.text")); // NOI18N
        jLabel14.setName("jLabel14"); // NOI18N

        cityCriteria.setText(resourceMap.getString("cityCriteria.text")); // NOI18N
        cityCriteria.setName("cityCriteria"); // NOI18N

        collegeCriteria.setText(resourceMap.getString("collegeCriteria.text")); // NOI18N
        collegeCriteria.setName("collegeCriteria"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel12)
                                        .addGap(16, 16, 16))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel13)
                                            .addComponent(jLabel14))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton1)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nameCriteria, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cityCriteria, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(collegeCriteria, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(friendsProfileLabel)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel10))
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nameCriteria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cityCriteria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(collegeCriteria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1))
                            .addComponent(jLabel9)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(friendsProfileLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String nameC = nameCriteria.getText();
        String cityC = cityCriteria.getText();
        String collegeC = collegeCriteria.getText();

        ArrayList<UserProfileStub> userArray = null;
        try {
            userArray = commModule.getServantStub().searchForFriends(nameC, cityC, collegeC);
            if (userArray.isEmpty()) {
                JOptionPane.showMessageDialog(this, "No match found", "Search Result", JOptionPane.OK_OPTION);
                return;
            }
        } catch (RemoteException ex) {
            Logger.getLogger(FriendsPanel.class.getName()).log(Level.SEVERE, null, ex);
        }

        JFrame f = new JFrame(mainFrame.getUserID() + " - Search Result");
        SearchPanel searchPanel = new SearchPanel(f, mainFrame, commModule, userArray);
        f.setResizable(false);
        f.add(searchPanel);
        f.pack();
        f.setLocationRelativeTo(mainFrame);
        f.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void friendsListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_friendsListValueChanged
        try {
            int index = friendsList.getSelectedIndex();
            if (index < 0) {
                postContenttf.setEditable(false);
                postButton.setEnabled(false);
                return;
            }

            postContenttf.setEditable(true);
            postButton.setEnabled(true);

            String username = ((UserProfileStub) friendsArray.get(index)).getUserName();
            if (username == null || username.length() == 0) {
                username = ((UserProfileStub) friendsArray.get(index)).getUserID();
            }

            friendsProfileLabel.setText(username + "'s Profile");
            nametf.setText(username);
            professiontf.setText(((UserProfileStub) friendsArray.get(index)).getProfession());
            companytf.setText(((UserProfileStub) friendsArray.get(index)).getCompany());
            collegetf.setText(((UserProfileStub) friendsArray.get(index)).getCollege());
            gradyeartf.setText(((UserProfileStub) friendsArray.get(index)).getGraduationYear());
            citytf.setText(((UserProfileStub) friendsArray.get(index)).getCity());
        } catch (RemoteException ex) {
            JOptionPane.showMessageDialog(this, "Network failure, close the application and re-login", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_friendsListValueChanged

    private void friendsListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_friendsListMouseClicked
        if (evt.getClickCount() == 2) {
            try {
                int index = friendsList.getSelectedIndex();
                if (index < 0) {
                    return;
                }
                String friendID = ((UserProfileStub) friendsArray.get(index)).getUserID();

                // chat functionality will be added here
                if (commModule.getServantStub().isOnline(friendID)) {
                    ChatFrame cf = chatWindowMap.get(friendID);
                    if (cf == null) {
                        cf = new ChatFrame(friendID, this, mainFrame, commModule);
                        cf.setLocationRelativeTo(mainFrame);
                        chatWindowMap.put(friendID, cf);
                    }
                    cf.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(this, "Friend is not online, you cannot chat now", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (RemoteException ex) {
                Logger.getLogger(FriendsPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_friendsListMouseClicked

    private void postButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postButtonActionPerformed
        postOnWall();
    }//GEN-LAST:event_postButtonActionPerformed

    private void postOnWall() {
        try {
            int index = friendsList.getSelectedIndex();
            if (index < 0 || postContenttf.getText().length() == 0) {
                return;
            }
            String userID = ((UserProfileStub) friendsArray.get(index)).getUserID();
            Post p = new Post();
            p.setSender(mainFrame.getUserID());
            p.setReceiver(userID);
            p.setContent(postContenttf.getText());
            p.setDate(System.currentTimeMillis());
            String response = mainFrame.userAccount.postUpdates(p);
            postContenttf.setText("");
            JOptionPane.showMessageDialog(this, response, "Confirmation", JOptionPane.INFORMATION_MESSAGE);
        } catch (RemoteException ex) {
            Logger.getLogger(FriendsPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void postContenttfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postContenttfActionPerformed
        postOnWall();
    }//GEN-LAST:event_postContenttfActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cityCriteria;
    private javax.swing.JTextField citytf;
    private javax.swing.JTextField collegeCriteria;
    private javax.swing.JTextField collegetf;
    private javax.swing.JTextField companytf;
    private javax.swing.JList friendsList;
    private javax.swing.JLabel friendsProfileLabel;
    private javax.swing.JTextField gradyeartf;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField nameCriteria;
    private javax.swing.JTextField nametf;
    private javax.swing.JButton postButton;
    private javax.swing.JTextField postContenttf;
    private javax.swing.JTextField professiontf;
    // End of variables declaration//GEN-END:variables

    // this will take friend list from user account
    public void initializeFriendList() {
        try {
            friendsArray = mainFrame.userAccount.getFriendsList();
        } catch (RemoteException ex) {
            Logger.getLogger(FriendsPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        showFriendListInUI();
    }

    // this will update friend list from server
    public void updateFriendList() {
        try {
            friendsArray = commModule.getServantStub().getFriends(mainFrame.getUserID());
        } catch (RemoteException ex) {
            Logger.getLogger(FriendsPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        showFriendListInUI();
    }

    private void showFriendListInUI() {
        ListIterator itr = friendsArray.listIterator();
        Vector userNameVector = new Vector();

        while (itr.hasNext()) {
            try {
                UserProfileStub temp = (UserProfileStub) itr.next();
                String username = temp.getUserName();
                if (username == null || username.length() == 0) {
                    username = temp.getUserID();
                }
                userNameVector.add(" " + username);
            } catch (RemoteException ex) {
                Logger.getLogger(SearchPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        friendsList.setListData(userNameVector);
        postButton.setEnabled(false);
    }

    void showMessage(String friendID, String text) {
        ChatFrame cf = chatWindowMap.get(friendID);
        if (cf == null) {
            cf = new ChatFrame(friendID, this, mainFrame, commModule);
            cf.setLocationRelativeTo(mainFrame);
            chatWindowMap.put(friendID, cf);
        }
        cf.appendMessageToFullChatArea(friendID, text);
        cf.setVisible(true);
    }
}
