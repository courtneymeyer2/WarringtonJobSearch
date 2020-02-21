
import java.awt.Color;
import java.text.ParseException;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Courtney
 */
public class CompanyJobGUI extends javax.swing.JFrame {

    /**
     * Creates new form CompanyJobGUI
     */
    public CompanyJobGUI() {
        initComponents();
    }
    public CompanyJobGUI(Job job, Company company) throws ParseException {
        this();
        this.company = company;
        this.job = job;
        CompanyWithPosition.setText(company.getCompanyName() + ": " + job.getJobTitle());
        deadline.setText(job.getDeadline());
        if(job.checkTime())
        {
            deadline.setForeground(Color.red);
        }
        Description.setText(job.getDescription());
        Qualifications.setText( job.getQualifications());
        Requirements.setText(job.getRequirement());
        degree.setText("Degree Required: " + job.getDegreeRequired());
        position.setText("Position Type: " + job.getPostitonType());
        location.setText("Location: " +job.getLocation());
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
      // Student student = new Graduate(3, "Courtney", "Courtneymeyer2@gmail.com", "info", 2019, "Internship", "resume", 3.19, "password", "Isom", 3.7);
      // Application application = new Application(student, job, null, "Pending");
       //JobSearchSystem.applytoJob(application);
       applicants = JobSearchSystem.getApplicants(job);
       for(int i = 0; i < applicants.size(); i++)
       {
           try
           {
               System.out.println("status" +applicants.get(i).getStatus());
               model.addRow(new Object[]{"" +applicants.get(i).getStudent().getName(), "" +applicants.get(i).getStatus(), "" +applicants.get(i).getInterview().getDate(), "" + applicants.get(i).getInterview().getFeedback()});
           }
           catch(NullPointerException e)
           {
               model.addRow(new Object[]{"" +applicants.get(i).getStudent().getName(), "" +applicants.get(i).getStatus(), "" , ""});
           }
        
     
       }
           jTable2.setModel(model); 

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        CompanyWithPosition = new javax.swing.JLabel();
        location = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        deadline = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        backButton = new javax.swing.JButton();
        interviewTimes = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        addFeedback = new javax.swing.JButton();
        viewProfile = new javax.swing.JButton();
        applicantStatus = new javax.swing.JButton();
        degree = new javax.swing.JLabel();
        position = new javax.swing.JLabel();
        location1 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        Description = new javax.swing.JTextArea();
        location2 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        Qualifications = new javax.swing.JTextArea();
        location3 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        Requirements = new javax.swing.JTextArea();

        jInternalFrame1.setTitle("*** Company - *** Job");
        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 762, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 334, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 139, Short.MAX_VALUE)
        );

        jButton1.setText("Create Interview Times");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(312, 312, 312)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(478, 478, 478)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(871, 536));

        CompanyWithPosition.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        CompanyWithPosition.setText("*** Company - *** Position");

        location.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 11)); // NOI18N
        location.setText("Location: ");

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 11)); // NOI18N
        jLabel1.setText("Deadline:");

        deadline.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 11)); // NOI18N
        deadline.setText("Jan 19, 2020");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Applicant Name ", "Status", "Interview Time", "Feedback"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        backButton.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        interviewTimes.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        interviewTimes.setText("Create Interview Times");
        interviewTimes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                interviewTimesActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 255));
        jLabel9.setText("View Job Listing");

        addFeedback.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        addFeedback.setText("Add Feedback");
        addFeedback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFeedbackActionPerformed(evt);
            }
        });

        viewProfile.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        viewProfile.setText("View Applicant's Profile");
        viewProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewProfileActionPerformed(evt);
            }
        });

        applicantStatus.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        applicantStatus.setText("Change Applicant's Status");
        applicantStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applicantStatusActionPerformed(evt);
            }
        });

        degree.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 11)); // NOI18N
        degree.setText("Degree Type:  ");

        position.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 11)); // NOI18N
        position.setText("Position Type:");

        location1.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 11)); // NOI18N
        location1.setText("Description:");

        Description.setColumns(20);
        Description.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 11)); // NOI18N
        Description.setLineWrap(true);
        Description.setRows(5);
        Description.setBorder(null);
        jScrollPane5.setViewportView(Description);

        location2.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 11)); // NOI18N
        location2.setText("Qualifications:");

        Qualifications.setColumns(20);
        Qualifications.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 11)); // NOI18N
        Qualifications.setLineWrap(true);
        Qualifications.setRows(5);
        Qualifications.setBorder(null);
        jScrollPane6.setViewportView(Qualifications);

        location3.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 11)); // NOI18N
        location3.setText("Requirements:");

        Requirements.setColumns(20);
        Requirements.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 11)); // NOI18N
        Requirements.setLineWrap(true);
        Requirements.setRows(5);
        Requirements.setBorder(null);
        jScrollPane7.setViewportView(Requirements);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(backButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(position, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(viewProfile)
                                        .addGap(93, 93, 93)
                                        .addComponent(applicantStatus)
                                        .addGap(90, 90, 90)
                                        .addComponent(addFeedback))))
                            .addComponent(degree, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(deadline, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(location, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(location2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                    .addComponent(location3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(73, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(location1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addComponent(CompanyWithPosition, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(interviewTimes)))
                        .addGap(55, 55, 55))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(backButton))
                .addGap(13, 13, 13)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CompanyWithPosition)
                    .addComponent(interviewTimes))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(deadline))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(location1)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(location)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(position)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(degree)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(location2)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(location3)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewProfile)
                    .addComponent(applicantStatus)
                    .addComponent(addFeedback))
                .addGap(48, 48, 48))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 867, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void applicantStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applicantStatusActionPerformed
        int index = jTable2.getSelectedRow();
        if(index == -1)
        {
            JOptionPane.showMessageDialog(null, "You must select an applicant");
        }
        else
        {
            //TableModel model2 = jTable2.getModel();
            Student student = applicants.get(index).getStudent();
            AddFeedback af = new AddFeedback(applicants.get(index), company, job);
            af.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_applicantStatusActionPerformed

    private void viewProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewProfileActionPerformed
        int index = jTable2.getSelectedRow();
        if(index == -1)
        {
            JOptionPane.showMessageDialog(null, "You must select an applicant");
        }
        else
        {
            //TableModel model2 = jTable2.getModel();
            Student student = applicants.get(index).getStudent();
            CompanyViewofStudentProfile cvosp= new CompanyViewofStudentProfile(student, company, job);
            cvosp.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_viewProfileActionPerformed

    private void addFeedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFeedbackActionPerformed
        int index = jTable2.getSelectedRow();

        if(index == -1)
        {
            JOptionPane.showMessageDialog(null, "You must select an applicant");
        }
        else if(applicants.get(index).getStatus().equals("Offer") ||applicants.get(index).getStatus().equals("Rejected"))
        {
            AddFeedback af = new AddFeedback(applicants.get(index), company, job);
            af.setVisible(true);
            this.dispose();
        }

        else
        {
            JOptionPane.showMessageDialog(null, "You must first change the applicant's status to Offer or Rejected");

            //TableModel model2 = jTable2.getModel();
            //Student student = applicants.get(index).getStudent();

        }
    }//GEN-LAST:event_addFeedbackActionPerformed

    private void interviewTimesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_interviewTimesActionPerformed
        int numOfInterviews = 0;
        int alreadyMadeInterviews = 0;
        for(int i = 0; i < applicants.size(); i++)
        {
            if(applicants.get(i).getStatus().equals("Interview Requested") && applicants.get(i).getInterview()== null)
            {
                numOfInterviews ++;
            }
            else if(applicants.get(i).getStatus().equals("Interview Requested"))
            {
                alreadyMadeInterviews ++;
            }
        }

        if(alreadyMadeInterviews > 0 && numOfInterviews == 0)
        {
            JOptionPane.showMessageDialog(null, "You have already created interviews for your applicants with Interview Requested status");
        }
        else if( numOfInterviews == 0)
        {
            JOptionPane.showMessageDialog(null, "There are no applicants with Interview Requested status");
        }
        else
        {
            System.out.println("num of interviews" +numOfInterviews);
            System.out.println("already made" +alreadyMadeInterviews);

            CreateInterviewTimesGUI citg = new CreateInterviewTimesGUI(company, job, numOfInterviews);
            citg.setVisible(true);
            this.dispose();

        }
    }//GEN-LAST:event_interviewTimesActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        CompanyPageGUI cpg = new CompanyPageGUI(company);
        cpg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

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
            java.util.logging.Logger.getLogger(CompanyJobGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CompanyJobGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CompanyJobGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CompanyJobGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CompanyJobGUI().setVisible(true);
            }
        });
    }
    private LinkedList <Application> applicants = new LinkedList <Application>();
    private Job job;
    private Company company;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CompanyWithPosition;
    private javax.swing.JTextArea Description;
    private javax.swing.JTextArea Qualifications;
    private javax.swing.JTextArea Requirements;
    private javax.swing.JButton addFeedback;
    private javax.swing.JButton applicantStatus;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel deadline;
    private javax.swing.JLabel degree;
    private javax.swing.JButton interviewTimes;
    private javax.swing.JButton jButton1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel location;
    private javax.swing.JLabel location1;
    private javax.swing.JLabel location2;
    private javax.swing.JLabel location3;
    private javax.swing.JLabel position;
    private javax.swing.JButton viewProfile;
    // End of variables declaration//GEN-END:variables
}
