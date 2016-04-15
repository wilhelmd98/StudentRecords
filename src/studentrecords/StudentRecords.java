/*
 * This program can take in names entered by the user and store them in an ArrayList.
 */
package studentrecords;

import java.util.*;  //Inports various built in utilities for Java (ArrayList comes from here).

/**
 *
 * @author wilheld
 */
public class StudentRecords extends javax.swing.JFrame {
    
    //An ArrayList of the student names
    ArrayList <String> names = new ArrayList();

    /**
     * Creates new form StudentRecords
     */
    public StudentRecords() {
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

        TitleLabel = new javax.swing.JLabel();
        NameLabel = new javax.swing.JLabel();
        NameInput = new javax.swing.JTextField();
        AddButton = new javax.swing.JButton();
        RemoveButton = new javax.swing.JButton();
        SortButton = new javax.swing.JButton();
        ListButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();
        OutputTextPane = new javax.swing.JScrollPane();
        OutputTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TitleLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        TitleLabel.setForeground(new java.awt.Color(0, 0, 204));
        TitleLabel.setText("Student Records");

        NameLabel.setText("Name:");

        AddButton.setText("Add");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        RemoveButton.setText("Remove");
        RemoveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveButtonActionPerformed(evt);
            }
        });

        SortButton.setText("Sort");
        SortButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SortButtonActionPerformed(evt);
            }
        });

        ListButton.setText("List");
        ListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListButtonActionPerformed(evt);
            }
        });

        ExitButton.setText("Exit");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        OutputTextArea.setColumns(20);
        OutputTextArea.setRows(5);
        OutputTextArea.setWrapStyleWord(true);
        OutputTextPane.setViewportView(OutputTextArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(OutputTextPane, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RemoveButton, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(AddButton)
                            .addComponent(SortButton)
                            .addComponent(ListButton)
                            .addComponent(ExitButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(NameLabel)
                        .addGap(18, 18, 18)
                        .addComponent(NameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TitleLabel)
                .addGap(80, 80, 80))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TitleLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameLabel)
                    .addComponent(NameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(AddButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RemoveButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SortButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ListButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ExitButton)
                .addContainerGap(12, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(OutputTextPane)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /* This method takes the name from the screen and adds it to the ArrayList */
    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        String temp;
        temp = NameInput.getText();
        names.add(temp);
    }//GEN-LAST:event_AddButtonActionPerformed

    /* This method removes a given name from the ArrayList */
    private void RemoveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveButtonActionPerformed
        String temp;
        temp = NameInput.getText();
        names.remove(temp);
    }//GEN-LAST:event_RemoveButtonActionPerformed

    /* This is a method to sort the ArrayList of student names */
    private void SortButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SortButtonActionPerformed
        Collections.sort(names);
        /* ArrayList is a type of Collection.  The collection class has a sorting 
        method that will automatically sort the ArrayList for you. */
    }//GEN-LAST:event_SortButtonActionPerformed

    /* This method will go through the list of student names and display them in the text area */
    private void ListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListButtonActionPerformed
        String a;
        String temp="";
        
        Iterator stepper = names.iterator();
        //Iterator is used to go through a collection, ini this case, an ArrayList
        for (int i=0;i<names.size();i++){
            a = (String) stepper.next();
            temp = temp + a +"\n";
        }
        OutputTextArea.setText(temp);
    }//GEN-LAST:event_ListButtonActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitButtonActionPerformed

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
            java.util.logging.Logger.getLogger(StudentRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentRecords().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JButton ExitButton;
    private javax.swing.JButton ListButton;
    private javax.swing.JTextField NameInput;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JTextArea OutputTextArea;
    private javax.swing.JScrollPane OutputTextPane;
    private javax.swing.JButton RemoveButton;
    private javax.swing.JButton SortButton;
    private javax.swing.JLabel TitleLabel;
    // End of variables declaration//GEN-END:variables
}
