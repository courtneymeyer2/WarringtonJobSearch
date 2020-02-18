
import java.io.File;
import java.util.LinkedList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Liwen
 */
public class StudentAccount extends javax.swing.JFrame {

    /**
     * Creates new form StudentAccount
     */
    public StudentAccount() {
        initComponents();
    }
    
    public StudentAccount(Student student) {
        this();
        this.student = student;
        n.setText(student.getName() );
        e.setText(student.getEmail());
        m.setText(student.getMajor());
        g.setText(student.getGraduatingYear()+ "");
        i.setText(student.getId() + "");
        r.setText(student.getResume().getName());
        if(student.getPositionType().equals("Internship"))
        {
            t.setSelectedIndex(1);
        }
        else
        {
            t.setSelectedIndex(0);
        }
        t.setEditable(false);
            
        
        if(student instanceof Undergraduate)
        {
            ug.setText(student.getGPA() +"");
        }
        else
        {
           gg.setText(((Graduate)student).getGPA()+"");
           gug.setText(((Graduate)student).getUndergradGPA()+"");
           ud.setText(((Graduate)student).getUndergradMajor());
         //  System.out.println(((Graduate)student).getUndergradMajor());
        }
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
       applicants = JobSearchSystem.getApplicants(student);
       for(int i = 0; i < applicants.size(); i++)
       {
           try
           {
             model.addRow(new Object[]{"" +applicants.get(i).getJob().getJobTitle() , ""+ JobSearchSystem.getCompanyByJob(applicants.get(i).getJob()).getCompanyName() , "" + applicants.get(i).getJob().getDeadline() , "" + applicants.get(i).getStatus() ,"" + applicants.get(i).getInterview().getDate() , "" +applicants.get(i).getInterview().getFeedback()});

           }
           catch (NullPointerException e)
           {
            model.addRow(new Object[]{"" +applicants.get(i).getJob().getJobTitle() , ""+ JobSearchSystem.getCompanyByJob(applicants.get(i).getJob()).getCompanyName() , "" + applicants.get(i).getJob().getDeadline() , "" + applicants.get(i).getStatus() , "" , "" });
 
           }
       }
           jTable2.setModel(model); 
           
           
       DefaultTableModel model2 = (DefaultTableModel) jTable3.getModel();
       
       for(int i = 0; i < student.getAddedJobs().size(); i++)
       {
             model2.addRow(new Object[]{"" +student.getAddedJobs().get(i).getJobTitle() , ""+ JobSearchSystem.getCompanyByJob(student.getAddedJobs().get(i)).getCompanyName() , "" + student.getAddedJobs().get(i).getDeadline()});

       }
           jTable3.setModel(model2); 
        
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
        jLabel9 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        n = new javax.swing.JLabel();
        e = new javax.swing.JLabel();
        m = new javax.swing.JLabel();
        g = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        i = new javax.swing.JLabel();
        t = new javax.swing.JComboBox<>();
        Update = new javax.swing.JButton();
        r = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        gg = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        gug = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        ud = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        ug = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel31 = new javax.swing.JLabel();
        intJobDetail = new javax.swing.JButton();
        interviewTimes = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        apply = new javax.swing.JButton();
        jobDetail = new javax.swing.JButton();
        export = new javax.swing.JButton();
        viewFeedback = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 255));
        jLabel9.setText("My Account");

        back.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel78.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 11)); // NOI18N
        jLabel78.setText("Name");

        jLabel79.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 11)); // NOI18N
        jLabel79.setText("Email");

        jLabel80.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 11)); // NOI18N
        jLabel80.setText("Major");

        jLabel81.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 11)); // NOI18N
        jLabel81.setText("Graduating Year");

        n.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 11)); // NOI18N
        n.setText("***");

        e.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 11)); // NOI18N
        e.setText("***");

        m.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 11)); // NOI18N
        m.setText("***");

        g.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 11)); // NOI18N
        g.setText("2020");

        jLabel18.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 11)); // NOI18N
        jLabel18.setText("UF ID");

        jLabel19.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 11)); // NOI18N
        jLabel19.setText("Position Type");

        jLabel20.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 11)); // NOI18N
        jLabel20.setText("Resume");

        i.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 11)); // NOI18N
        i.setText("***");

        t.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 11)); // NOI18N
        t.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Full-time", "Internship" }));
        t.setEnabled(false);

        Update.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 11)); // NOI18N
        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        r.setText(" ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel78)
                    .addComponent(jLabel79)
                    .addComponent(jLabel80)
                    .addComponent(jLabel81))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(n)
                    .addComponent(e)
                    .addComponent(m)
                    .addComponent(g))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 334, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20))
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(r)
                    .addComponent(i)
                    .addComponent(t, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(Update)
                .addGap(42, 42, 42))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(i))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(t, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(Update)
                            .addComponent(r, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel78)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel79)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel80)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel81))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(n)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(e)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(m)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(g))))
                .addGap(16, 16, 16))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Graduate", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Franklin Gothic Demi", 0, 14))); // NOI18N
        jPanel3.setToolTipText("");

        jLabel24.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 11)); // NOI18N
        jLabel24.setText("Grad-GPA");

        gg.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 11)); // NOI18N
        gg.setText(" ");

        jLabel27.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 11)); // NOI18N
        jLabel27.setText("Undergrad-GPA");

        gug.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 11)); // NOI18N
        gug.setText(" ");

        jLabel29.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 11)); // NOI18N
        jLabel29.setText("Undergrad-degree");

        ud.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 11)); // NOI18N
        ud.setText(" ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ud, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(gg, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(188, 188, 188))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addGap(18, 18, 18)
                        .addComponent(gug, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(206, 206, 206))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(gg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(gug))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(ud))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Undergraduate", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Franklin Gothic Demi", 0, 14))); // NOI18N
        jPanel4.setToolTipText("");

        jLabel21.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 11)); // NOI18N
        jLabel21.setText("Undergradate GPA");

        jLabel22.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 11)); // NOI18N

        ug.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 11)); // NOI18N
        ug.setText(" ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addComponent(jLabel22)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel21)
                .addGap(30, 30, 30)
                .addComponent(ug, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ug)
                    .addComponent(jLabel22))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                " Job Title", "Company", "Deadline", "Status", "Interview Time", "Feedback"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jLabel31.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        jLabel31.setText("Applied Jobs");

        intJobDetail.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 11)); // NOI18N
        intJobDetail.setText("View Job Detail");
        intJobDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                intJobDetailActionPerformed(evt);
            }
        });

        interviewTimes.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 11)); // NOI18N
        interviewTimes.setText("Select Interview Time");
        interviewTimes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                interviewTimesActionPerformed(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        jLabel32.setText("Interested Jobs");

        jTable3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                " Job Title", "Company", "Deadline"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable3);

        apply.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 11)); // NOI18N
        apply.setText("Apply");
        apply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyActionPerformed(evt);
            }
        });

        jobDetail.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 11)); // NOI18N
        jobDetail.setText("View Job Detail");
        jobDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jobDetailActionPerformed(evt);
            }
        });

        export.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 11)); // NOI18N
        export.setText("Export");
        export.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportActionPerformed(evt);
            }
        });

        viewFeedback.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 11)); // NOI18N
        viewFeedback.setText("View Feedback");
        viewFeedback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewFeedbackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jobDetail)
                        .addGap(41, 41, 41)
                        .addComponent(interviewTimes)
                        .addGap(42, 42, 42)
                        .addComponent(export)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(viewFeedback))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(intJobDetail)
                        .addGap(18, 18, 18)
                        .addComponent(apply)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(60, 60, 60)
                            .addComponent(back)
                            .addGap(293, 293, 293)
                            .addComponent(jLabel9))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel31)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel32)
                                .addGap(160, 160, 160)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(back))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(jLabel32))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jobDetail)
                            .addComponent(interviewTimes)
                            .addComponent(export)
                            .addComponent(viewFeedback)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(intJobDetail)
                            .addComponent(apply))))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jobDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jobDetailActionPerformed
               int index = jTable2.getSelectedRow();
               
               if(index == -1)
                {
                     JOptionPane.showMessageDialog(null, "You must select a job");
                }
               else
               {
                   StudentJobGUI sjg = new StudentJobGUI(applicants.get(index).getJob(), student, 1);
                   sjg.setVisible(true);
                   this.dispose();
               }
               

    }//GEN-LAST:event_jobDetailActionPerformed

    private void interviewTimesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_interviewTimesActionPerformed
               int index = jTable2.getSelectedRow();
               if(index == -1)
               {
                   JOptionPane.showMessageDialog(null, "You must select a job");
               }
               else
               {
                   // LinkedList <Interview> interviews = new LinkedList <Interview>();
                    if(applicants.get(index).getInterview() == null)
                    {
                          if(applicants.get(index).getStatus().equals("Interview Requested"))
                        {
                       // interviews = applicants.get(index).getJob().getInterviewList();

                        SelectInterviewTimeGUI sit = new SelectInterviewTimeGUI(applicants.get(index), applicants.get(index).getJob());
                        sit.setVisible(true);
                        this.dispose();

                        }
                    else
                        {
                        JOptionPane.showMessageDialog(null,"An interview has not been requested");
                        }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "An interview time has already been selected");
                    }
             
               }
              

    }//GEN-LAST:event_interviewTimesActionPerformed

    private void intJobDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_intJobDetailActionPerformed
       int index = jTable3.getSelectedRow();
       if(index == -1)
       {
           JOptionPane.showMessageDialog(null, "You must select a job");
       }
       else
       {
            Job j = student.getAddedJobs().get(index);
            StudentJobGUI sjg = new StudentJobGUI(j, student, 1);
            // StudentAccount sa = new StudentAccount(student);
            sjg.setVisible(true);
            this.dispose();
       }
      

    }//GEN-LAST:event_intJobDetailActionPerformed

    private void applyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applyActionPerformed
       int index = jTable3.getSelectedRow();
       if(index == -1)
       {
           JOptionPane.showMessageDialog(null, "You must select a job");
       }
       else
       {
           Job j = student.getAddedJobs().get(index);
            JobSearchSystem.applytoJob(new Application(student, j, "Pending"));
            JOptionPane.showMessageDialog(null, "Applied Successfully");
            StudentAccount sa = new StudentAccount(student);
            sa.setVisible(true);
            this.dispose();
       }
       
               

    }//GEN-LAST:event_applyActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        StudentSearchJobGUI sa = new StudentSearchJobGUI(student);
        sa.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void viewFeedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewFeedbackActionPerformed
        int index = jTable2.getSelectedRow();
        if(index == -1)
        {
          JOptionPane.showMessageDialog(null, "You must select a job");
        }
        else if(applicants.get(index).getInterview() == null)
        {
           JOptionPane.showMessageDialog(null,"An interview has not been created" );
        }
        else if(applicants.get(index).getStatus().equals("Offer") ||applicants.get(index).getStatus().equals("Rejected") )
        {
           JOptionPane.showMessageDialog(null,applicants.get(index).getInterview().getFeedback());
        }
        else
        {
           JOptionPane.showMessageDialog(null, "Feedback has not been created");
        }
        
    }//GEN-LAST:event_viewFeedbackActionPerformed

    private void exportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exportActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        JFileChooser chooser = new JFileChooser();	
        chooser.showOpenDialog(null);	
        f = chooser.getSelectedFile();	
        String filename = f.getName();	
        r.setText(filename);	
        student.setResume(f);
    }//GEN-LAST:event_UpdateActionPerformed

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
            java.util.logging.Logger.getLogger(StudentAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentAccount().setVisible(true);
            }
        });
    }
    private File f;
    private Student student;
    private LinkedList <Application> applicants;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Update;
    private javax.swing.JButton apply;
    private javax.swing.JButton back;
    private javax.swing.JLabel e;
    private javax.swing.JButton export;
    private javax.swing.JLabel g;
    private javax.swing.JLabel gg;
    private javax.swing.JLabel gug;
    private javax.swing.JLabel i;
    private javax.swing.JButton intJobDetail;
    private javax.swing.JButton interviewTimes;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JButton jobDetail;
    private javax.swing.JLabel m;
    private javax.swing.JLabel n;
    private javax.swing.JTextField r;
    private javax.swing.JComboBox<String> t;
    private javax.swing.JLabel ud;
    private javax.swing.JLabel ug;
    private javax.swing.JButton viewFeedback;
    // End of variables declaration//GEN-END:variables
}
