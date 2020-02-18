
import java.awt.Color;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Liwen
 */
public class StudentJobGUI extends javax.swing.JFrame {

    /**
     * Creates new form StudentJobGUI
     */
    public StudentJobGUI() {
        initComponents();
        
    }
    
    public StudentJobGUI(Job job, Student student, int page) throws ParseException{
        this();
        this.page = page;
        this.student = student;
        this.job = job;
        companyAndPosition.setText(JobSearchSystem.getCompanyByJob(job).getCompanyName() + ": " + job.getJobTitle());
        deadline.setText(job.getDeadline());
        if(job.checkTime())
        {
            deadline.setForeground(Color.red);
        }
        description.setText("Description: " + job.getDescription());
        quali.setText("Qualifications: " + job.getQualifications());
        require.setText("Requirements: " + job.getRequirement());
        degree.setText("Degree Required: " + job.getDegreeRequired());
        position.setText("Position Type: " + job.getPostitonType());
        location.setText("Location: " +job.getLocation());
        applied = JobSearchSystem.applicationExists(job, student);
        if(applied)
        {
            apply.setEnabled(false);
            apply.setText("Applied");
            Added.setEnabled(false);
        }
        added = student.jobInList(job);
        if(added)
        {
            Added.setText("Remove from List");
        }
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
        companyAndPosition = new javax.swing.JLabel();
        apply = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        deadline = new javax.swing.JLabel();
        description = new javax.swing.JLabel();
        degree = new javax.swing.JLabel();
        location = new javax.swing.JLabel();
        position = new javax.swing.JLabel();
        quali = new javax.swing.JLabel();
        require = new javax.swing.JLabel();
        Added = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(871, 535));

        companyAndPosition.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        companyAndPosition.setForeground(new java.awt.Color(0, 0, 255));
        companyAndPosition.setText("Company and Position");

        apply.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        apply.setText("Apply");
        apply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyActionPerformed(evt);
            }
        });

        back.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 11)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        jButton3.setText("Add to List");

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 11)); // NOI18N
        jLabel1.setText("Deadline:");

        deadline.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 11)); // NOI18N
        deadline.setText("Jan 19, 2020");

        description.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        description.setText("Description: ");

        degree.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 11)); // NOI18N
        degree.setText("Degree Type:  ");

        location.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 11)); // NOI18N
        location.setText("Location: ");

        position.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 11)); // NOI18N
        position.setText("Position Type:");

        quali.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 11)); // NOI18N
        quali.setText("Qualifications: ");

        require.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 11)); // NOI18N
        require.setText("Requirements:");

        Added.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        Added.setText("Add to List");
        Added.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(231, 231, 231)
                .addComponent(companyAndPosition)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(degree, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(location, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(position, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(require, javax.swing.GroupLayout.PREFERRED_SIZE, 1122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(deadline, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(description, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Added, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3))
                            .addComponent(apply))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(quali, javax.swing.GroupLayout.PREFERRED_SIZE, 798, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(back)
                    .addComponent(companyAndPosition))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(deadline))
                    .addComponent(apply))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jButton3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(description, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Added))))
                .addGap(18, 18, 18)
                .addComponent(degree)
                .addGap(34, 34, 34)
                .addComponent(location)
                .addGap(36, 36, 36)
                .addComponent(position)
                .addGap(62, 62, 62)
                .addComponent(quali, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(require, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        if(page == 0)
        {
        StudentSearchJobGUI sj = new StudentSearchJobGUI(student);
        sj.setVisible(true);
        this.dispose();
        }
        else
        {
            StudentAccount sa = new StudentAccount(student);
            sa.setVisible(true);
            this.dispose();
        }
       
    }//GEN-LAST:event_backActionPerformed

    private void applyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applyActionPerformed
        
        if(apply.getText().equals("Apply"))
        {
            Application applicant = new Application(student, job, "Pending");
            JobSearchSystem.applytoJob(applicant);
            JOptionPane.showMessageDialog(null, "Application Successful!");
            apply.setEnabled(false);
            apply.setText("Applied");
//            if(added)
//            {
//                student.removeFromJobList(job);
//            }

        }
        StudentJobGUI s;
        try {
            s = new StudentJobGUI(job, student, 0);
             s.setVisible(true);
        this.dispose();
        } catch (ParseException ex) {
            Logger.getLogger(StudentJobGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
       
   
       
    }//GEN-LAST:event_applyActionPerformed

    private void AddedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddedActionPerformed
        if(added == false)
        {
            student.addJob(job);
            JOptionPane.showMessageDialog(null, "Added to Interested Job List!");
            Added.setText("Remove from List");
        }
        else
        {

            student.removeFromJobList(job);
            JOptionPane.showMessageDialog(null, "Removed from Interested Job List");
             Added.setText("Add to List");
        }
        StudentJobGUI s;
        try {
            s = new StudentJobGUI(job, student, 0);
              s.setVisible(true);
        this.dispose();
        } catch (ParseException ex) {
            Logger.getLogger(StudentJobGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
      
     
    }//GEN-LAST:event_AddedActionPerformed

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
            java.util.logging.Logger.getLogger(StudentJobGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentJobGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentJobGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentJobGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentJobGUI().setVisible(true);
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Added;
    private javax.swing.JButton apply;
    private javax.swing.JButton back;
    private javax.swing.JLabel companyAndPosition;
    private javax.swing.JLabel deadline;
    private javax.swing.JLabel degree;
    private javax.swing.JLabel description;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel location;
    private javax.swing.JLabel position;
    private javax.swing.JLabel quali;
    private javax.swing.JLabel require;
    // End of variables declaration//GEN-END:variables
    private Student student;
    private Job job;
    private boolean applied;
    private boolean added;
    private int page;
}
