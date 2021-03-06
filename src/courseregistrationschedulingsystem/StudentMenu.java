/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courseregistrationschedulingsystem;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Subham Guha(sjg5441)
 */
public class StudentMenu extends javax.swing.JFrame {
    MainMenu menu = new MainMenu();
    /**
     * Creates new form StudentMenuFrame
     */
    public StudentMenu() {
        initComponents();
         DefaultTableModel model = (DefaultTableModel) displayTable.getModel();
        for(int i = 0; i<menu.students.size();i++)
        {
            model.addRow(new Object[]{menu.students.get(i).getFirstName(), menu.students.get(i).getLastName(), menu.students.get(i).getPhoneNumber()});
        }
    }

    public String getFirstName()
    {
        return firstNameText.getText();
    }
    
    public String getLastName()
    {
        return lastNameText.getText();
    }
    
    public String getPhoneNumber()
    {
        return phoneNumberText.getText();
    }
    
    public boolean checkInputs()
    {
        // checks to see if nothing is inputted 
        if(firstNameText.getText().equals("")||
                lastNameText.getText().equals("")||
                phoneNumberText.getText().equals(""))
        {
            // shows an error
            JOptionPane.showMessageDialog(this, "Enter a valid first name and last name followed by the phone number in the right format. ", 
            "Error" , 
                JOptionPane.WARNING_MESSAGE);
            return false;
        }
        // checks to see if a name is inputted in correctly and not an int inputted
        if(firstNameText.getText().matches("-?\\d+(\\.\\d+)?") || lastNameText.getText().matches("-?\\d+(\\.\\d+)?"))
         {
             JOptionPane.showMessageDialog(this, "Enter a valid name. ", "Error", JOptionPane.WARNING_MESSAGE);
             return false;
         }
        // checks to see if the number is entered in the format XXX-XXX-XXXX
        if(!phoneNumberText.getText().matches("\\d{3}-\\d{3}-\\d{4}"))
        {
            JOptionPane.showMessageDialog(this, "Incorrect phone number format. \n Use XXX-XXX-XXXX ", 
                "Phone Format" , 
                JOptionPane.WARNING_MESSAGE);
            return false;
        }
        for(int i = 0; i<menu.students.size();i++)
        {
            if(menu.students.get(i).getFirstName().equals(firstNameText.getText()))
            {
                if(menu.students.get(i).getLastName().equals(lastNameText.getText()))
                {
                    if(menu.students.get(i).getPhoneNumber().equals(phoneNumberText.getText()))
                    {
                         JOptionPane.showMessageDialog(this, "Student has already been added. ", 
                        "Error" , 
                         JOptionPane.WARNING_MESSAGE);
                         return false;
                    }
                }
            }
            if(menu.students.get(i).getPhoneNumber().equals(phoneNumberText.getText()))
            {
                 JOptionPane.showMessageDialog(this, "Can't have duplicate phone numbers. ", 
                        "Error" , 
                         JOptionPane.WARNING_MESSAGE);
                         return false;
            }
            
        }
       
        return true;
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        firstNameText = new javax.swing.JTextField();
        lastNameText = new javax.swing.JTextField();
        phoneNumberText = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        mainButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        displayTable = new javax.swing.JTable();
        removeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("First Name ");

        jLabel2.setText("Last Name");

        jLabel3.setText("Phone Number ");

        addButton.setText("Add Student");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        mainButton.setText("Main Menu");
        mainButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainButtonActionPerformed(evt);
            }
        });

        displayTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First Name", "Last Name", "Phone Number"
            }
        ));
        jScrollPane1.setViewportView(displayTable);

        removeButton.setText("Remove Student");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(firstNameText)
                            .addComponent(lastNameText)
                            .addComponent(phoneNumberText, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(addButton)
                        .addGap(60, 60, 60)
                        .addComponent(removeButton)
                        .addGap(58, 58, 58)
                        .addComponent(mainButton, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(firstNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lastNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(phoneNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton)
                    .addComponent(removeButton)
                    .addComponent(mainButton))
                .addGap(57, 57, 57)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        boolean success = checkInputs();
        if(!success)
        {
            
        }
        else
        {
            menu.students.add(new Student(getFirstName(), getLastName(), getPhoneNumber()));
            DefaultTableModel model = (DefaultTableModel) displayTable.getModel();
            model.addRow(new Object[]{firstNameText.getText(), lastNameText.getText(), phoneNumberText.getText()});
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void mainButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainButtonActionPerformed
        this.setVisible(true);
        dispose();
    }//GEN-LAST:event_mainButtonActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
         DefaultTableModel model = (DefaultTableModel) displayTable.getModel();
        int counter = -1;
        for(int i = 0; i<menu.students.size();i++)
        {
           
            if(menu.students.get(i).getFirstName().equals(firstNameText.getText()))
            {
                if(menu.students.get(i).getLastName().equals(lastNameText.getText()))
                {
                    menu.students.remove(i);
                    model.removeRow(i);
                    counter=i;
                    
                    }
            }
            
        }
          if(counter == -1)
            {
                JOptionPane.showMessageDialog(this, "Student does not exist ", "Error", JOptionPane.WARNING_MESSAGE);
            }
    }//GEN-LAST:event_removeButtonActionPerformed

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
            java.util.logging.Logger.getLogger(StudentMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton addButton;
    public javax.swing.JTable displayTable;
    public javax.swing.JTextField firstNameText;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextField lastNameText;
    public javax.swing.JButton mainButton;
    public javax.swing.JTextField phoneNumberText;
    public javax.swing.JButton removeButton;
    // End of variables declaration//GEN-END:variables
}
