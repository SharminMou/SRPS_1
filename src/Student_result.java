
import java.awt.Component;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
;

public class Student_result extends javax.swing.JFrame {

    public Student_result() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtxtSurname = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jtxtAverage = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jtxtTotalScore = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jtxtRanking = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jtxtStudentId = new javax.swing.JTextField();
        jtxtFirstName = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jtxtDLD = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jtxtOOC = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jtxtArabic = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jtxtDiscrete = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jtxtBPC = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jtxtOOCLab = new javax.swing.JTextField();
        jcmbPrograms = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        jtxtIntegralCalculus = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jtxtAccounting = new javax.swing.JTextField();
        jtxtDLDLab = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxtTranscript = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jbtnReset = new javax.swing.JButton();
        jbtnExit = new javax.swing.JButton();
        jbtnDelete = new javax.swing.JButton();
        jbtnTranscript = new javax.swing.JButton();
        jbtnRanking1 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Result Processing System");
        setFont(new java.awt.Font("AcadEref", 1, 24)); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 4), "Student Records", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 36), new java.awt.Color(0, 102, 102))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(0, 102, 102));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 102));
        jLabel3.setText("First Name:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 102));
        jLabel7.setText("Surname:");

        jtxtSurname.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 102));
        jLabel8.setText("Programs:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 102));
        jLabel9.setText("Average:");

        jtxtAverage.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 102));
        jLabel10.setText("Total Score:");

        jtxtTotalScore.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 51, 102));
        jLabel12.setText("Division:");

        jtxtRanking.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 51, 102));
        jLabel13.setText("Student Id:");

        jtxtStudentId.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jtxtFirstName.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 51, 102));
        jLabel14.setText("Digital Logic Design:");

        jtxtDLD.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jtxtDLD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtDLDKeyTyped(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 51, 102));
        jLabel15.setText("Discrete Mathematics:");

        jtxtOOC.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jtxtOOC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtOOCActionPerformed(evt);
            }
        });
        jtxtOOC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtOOCKeyTyped(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 51, 102));
        jLabel16.setText("Intregal Calculus:");

        jtxtArabic.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jtxtArabic.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtArabicKeyTyped(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 51, 102));
        jLabel17.setText("Object Oriented Concept Lab:");

        jtxtDiscrete.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jtxtDiscrete.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtDiscreteKeyTyped(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 51, 102));
        jLabel18.setText("Accounting:");

        jtxtBPC.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jtxtBPC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtBPCKeyTyped(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 51, 102));
        jLabel19.setText("Business Psychology:");

        jtxtOOCLab.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jtxtOOCLab.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtOOCLabKeyTyped(evt);
            }
        });

        jcmbPrograms.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jcmbPrograms.setForeground(new java.awt.Color(0, 153, 153));
        jcmbPrograms.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CSE", "EEE", "MCE", "CEE" }));
        jcmbPrograms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbProgramsActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 51, 102));
        jLabel21.setText("Digital Logic Design Lab:");

        jtxtIntegralCalculus.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jtxtIntegralCalculus.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtIntegralCalculusKeyTyped(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 51, 102));
        jLabel22.setText("Arabic:");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 51, 102));
        jLabel23.setText("Object Oriented Concept:");

        jtxtAccounting.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jtxtAccounting.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtAccountingKeyTyped(evt);
            }
        });

        jtxtDLDLab.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jtxtDLDLab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtDLDLabActionPerformed(evt);
            }
        });
        jtxtDLDLab.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtDLDLabKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jcmbPrograms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxtSurname)
                                    .addComponent(jtxtFirstName)
                                    .addComponent(jtxtStudentId)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(70, 70, 70)
                                .addComponent(jtxtAverage, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtxtTotalScore, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxtRanking, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(56, 56, 56)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtxtDLD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                                    .addComponent(jtxtDiscrete, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jtxtOOC, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jtxtIntegralCalculus, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jtxtAccounting)
                                    .addComponent(jtxtBPC)
                                    .addComponent(jtxtArabic)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtxtOOCLab)
                                    .addComponent(jtxtDLDLab)))))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtStudentId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtIntegralCalculus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtxtOOC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtxtSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jtxtDLD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxtDiscrete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(jtxtBPC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtxtAccounting, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxtArabic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxtOOCLab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcmbPrograms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxtAverage, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxtTotalScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtRanking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxtDLDLab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(106, 106, 106))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 680));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 4), "Grades", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24), new java.awt.Color(0, 102, 102))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(0, 102, 102));
        jPanel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N

        jtxtTranscript.setColumns(20);
        jtxtTranscript.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jtxtTranscript.setForeground(new java.awt.Color(102, 102, 255));
        jtxtTranscript.setRows(5);
        jScrollPane1.setViewportView(jtxtTranscript);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 631, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 10, 420, 670));

        jTable2.setForeground(new java.awt.Color(51, 51, 0));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student ID", "Programs", "Discrete Mathematics", "Digital Logic Design", "Object Oriented Concept", "Integral Calculus", "Business Psychology", "Accounting", "Arabic", "Digital Logic Design Lab ", "Object Oriented Concept Lab", "Total Score", "Division", "Average"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 690, 1360, 160));

        jbtnReset.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtnReset.setForeground(new java.awt.Color(0, 102, 102));
        jbtnReset.setText("Reset");
        jbtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 860, -1, -1));

        jbtnExit.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtnExit.setForeground(new java.awt.Color(0, 102, 102));
        jbtnExit.setText("Exit");
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 860, 130, -1));

        jbtnDelete.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtnDelete.setForeground(new java.awt.Color(0, 102, 102));
        jbtnDelete.setText("Delete");
        jbtnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 860, -1, -1));

        jbtnTranscript.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtnTranscript.setForeground(new java.awt.Color(0, 102, 102));
        jbtnTranscript.setText("Transcript");
        jbtnTranscript.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTranscriptActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnTranscript, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 860, -1, -1));

        jbtnRanking1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtnRanking1.setForeground(new java.awt.Color(0, 102, 102));
        jbtnRanking1.setText("Ranking");
        jbtnRanking1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRanking1ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnRanking1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 860, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResetActionPerformed
        JTextField temp = null;
        for(Component c:jPanel1.getComponents()){
            if(c.getClass().toString().contains("javax.swing.JTextField")){
                temp = (JTextField)c;
                temp.setText(null);
            }
        }
    }//GEN-LAST:event_jbtnResetActionPerformed

    private void jcmbProgramsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbProgramsActionPerformed

    }//GEN-LAST:event_jcmbProgramsActionPerformed
 private JFrame frame;
    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed
       frame = new JFrame("Exit");
       if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit","Student Result Processing System",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
           System.exit(0);
       }
    }//GEN-LAST:event_jbtnExitActionPerformed

    private void jbtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDeleteActionPerformed
      DefaultTableModel model= (DefaultTableModel) jTable2.getModel();
      if(jTable2.getSelectedRow()==-1){
          if(jTable2.getRowCount()==0){
              JOptionPane.showMessageDialog(null,"No Data to delete","Student Result System",JOptionPane.OK_OPTION);
          }
      }
      else{
          model.removeRow(jTable2.getSelectedRow());
      }  
        
    }//GEN-LAST:event_jbtnDeleteActionPerformed

    private void jtxtDLDLabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtDLDLabActionPerformed

    }//GEN-LAST:event_jtxtDLDLabActionPerformed

    private void jtxtIntegralCalculusKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtIntegralCalculusKeyTyped
       char iNumber = evt.getKeyChar();
       if(!(Character.isDigit(iNumber))
       ||(iNumber == KeyEvent.VK_BACK_SPACE)
       ||(iNumber == KeyEvent.VK_DELETE)){
           evt.consume();
       }
    }//GEN-LAST:event_jtxtIntegralCalculusKeyTyped

    private void jtxtOOCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtOOCActionPerformed
      
    }//GEN-LAST:event_jtxtOOCActionPerformed

    private void jtxtOOCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtOOCKeyTyped
          char iNumber = evt.getKeyChar();
       if(!(Character.isDigit(iNumber))
       ||(iNumber == KeyEvent.VK_BACK_SPACE)
       ||(iNumber == KeyEvent.VK_DELETE)){
           evt.consume();
       }
    }//GEN-LAST:event_jtxtOOCKeyTyped

    private void jtxtDLDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtDLDKeyTyped
          char iNumber = evt.getKeyChar();
       if(!(Character.isDigit(iNumber))
       ||(iNumber == KeyEvent.VK_BACK_SPACE)
       ||(iNumber == KeyEvent.VK_DELETE)){
           evt.consume();
       }
    }//GEN-LAST:event_jtxtDLDKeyTyped

    private void jtxtDiscreteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtDiscreteKeyTyped
       char iNumber = evt.getKeyChar();
       if(!(Character.isDigit(iNumber))
       ||(iNumber == KeyEvent.VK_BACK_SPACE)
       ||(iNumber == KeyEvent.VK_DELETE)){
           evt.consume();
       }
    }//GEN-LAST:event_jtxtDiscreteKeyTyped

    private void jtxtBPCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtBPCKeyTyped
         char iNumber = evt.getKeyChar();
       if(!(Character.isDigit(iNumber))
       ||(iNumber == KeyEvent.VK_BACK_SPACE)
       ||(iNumber == KeyEvent.VK_DELETE)){
           evt.consume();
       }
    }//GEN-LAST:event_jtxtBPCKeyTyped

    private void jtxtAccountingKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtAccountingKeyTyped
           char iNumber = evt.getKeyChar();
       if(!(Character.isDigit(iNumber))
       ||(iNumber == KeyEvent.VK_BACK_SPACE)
       ||(iNumber == KeyEvent.VK_DELETE)){
           evt.consume();
       }
    }//GEN-LAST:event_jtxtAccountingKeyTyped

    private void jtxtArabicKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtArabicKeyTyped
          char iNumber = evt.getKeyChar();
       if(!(Character.isDigit(iNumber))
       ||(iNumber == KeyEvent.VK_BACK_SPACE)
       ||(iNumber == KeyEvent.VK_DELETE)){
           evt.consume();
       }
    }//GEN-LAST:event_jtxtArabicKeyTyped

    private void jtxtOOCLabKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtOOCLabKeyTyped
          char iNumber = evt.getKeyChar();
       if(!(Character.isDigit(iNumber))
       ||(iNumber == KeyEvent.VK_BACK_SPACE)
       ||(iNumber == KeyEvent.VK_DELETE)){
           evt.consume();
       }
    }//GEN-LAST:event_jtxtOOCLabKeyTyped

    private void jtxtDLDLabKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtDLDLabKeyTyped
          char iNumber = evt.getKeyChar();
       if(!(Character.isDigit(iNumber))
       ||(iNumber == KeyEvent.VK_BACK_SPACE)
       ||(iNumber == KeyEvent.VK_DELETE)){
           evt.consume();
       }
    }//GEN-LAST:event_jtxtDLDLabKeyTyped

    private void jbtnTranscriptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTranscriptActionPerformed
    jtxtTranscript.append("Student Result Processing System\n"
          +"===========================\n"
            +"\nStudent Id:\t\t"+jtxtStudentId.getText()
          +"\nIntegral Calculus:\t\t" + jtxtIntegralCalculus.getText()
          +"\nObject Oriented Concept:\t" + jtxtOOC.getText()
          +"\nDigital Logic Design:\t\t" + jtxtDLD.getText()
          +"\nDiscrete Mathematics:\t\t" + jtxtDiscrete.getText()
          +"\nBusiness Psychology:\t\t" + jtxtBPC.getText()
          +"\nAccounting:\t\t\t" + jtxtAccounting.getText()
          +"\nArabic:\t\t\t" + jtxtOOCLab.getText()
          +"\nObject Oriented Concept Lab:\t" + jtxtArabic.getText()
          +"\nDigital Logic Design Lab:\t" + jtxtDLDLab.getText()
          +"\nTotal Score:\t\t" + jtxtTotalScore.getText()
          +"\nAverage:\t\t" + jtxtAverage.getText()
          +"\nRanking:\t\t" + jtxtRanking.getText()
            
    );
     
    }//GEN-LAST:event_jbtnTranscriptActionPerformed

    private void jbtnRanking1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRanking1ActionPerformed
        double[] R= new double[14];
        R[0]= Double.parseDouble(jtxtIntegralCalculus.getText());
        R[1]= Double.parseDouble(jtxtOOC.getText());
        R[2]= Double.parseDouble(jtxtDLD.getText());
        R[3]= Double.parseDouble(jtxtDiscrete.getText());
        R[4]= Double.parseDouble(jtxtBPC.getText());
        R[5]= Double.parseDouble(jtxtAccounting.getText());
        R[6]= Double.parseDouble(jtxtArabic.getText());
        R[7]= Double.parseDouble(jtxtOOCLab.getText());
        R[8]= Double.parseDouble(jtxtDLDLab.getText());
        
        R[9]= (R[0]+R[1]+R[2]+R[3]+R[4]+R[5]+R[6]+R[7]+R[8])/9;
        R[10]= R[0]+R[1]+R[2]+R[3]+R[4]+R[5]+R[6]+R[7]+R[8];
        
        String Average=String.format("%.0f",R[9]);
        jtxtAverage.setText(Average);
        
        String TotalScore = String.format("%.0f",R[10]);
        jtxtTotalScore.setText(TotalScore);
        
        if(R[9]>=60)
        {
            jtxtRanking.setText("1st Division");
        }
        else if(R[9]>=45)
        {
            jtxtRanking.setText("2nd Division");
        }
        else if(R[9]>=33)
        {
            jtxtRanking.setText("3rd Division");
        }
        /**if(R[10]>=400)
        {
            jtxtRanking.setText("3");
        }
        if(R[10]>=300)
        {
            jtxtRanking.setText("CoHE");
        }*/
        else
        {
            jtxtRanking.setText("Fail");
        }
        
        DefaultTableModel model= (DefaultTableModel) jTable2.getModel();
        model.addRow(new Object[]{
            jtxtStudentId.getText(),
            jcmbPrograms.getSelectedItem(),
            jtxtIntegralCalculus.getText(),
            jtxtOOC.getText(),
            jtxtDLD.getText(),
            jtxtDiscrete.getText(),
            jtxtBPC.getText(),
            jtxtAccounting.getText(),
            jtxtArabic.getText(),
            jtxtOOCLab.getText(),
            jtxtDLDLab.getText(),
            jtxtAverage.getText(),
            jtxtTotalScore.getText(),
            jtxtRanking.getText(),
        });
        
    }//GEN-LAST:event_jbtnRanking1ActionPerformed

    public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
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
            java.util.logging.Logger.getLogger(Student_result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student_result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student_result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student_result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
          UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
          JFrame frame = new JFrame();
          frame.setSize(300, 300); // Set the size of the window
          //frame.add(Student_Result);
          frame.setVisible(true);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student_result().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton jbtnDelete;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnRanking1;
    private javax.swing.JButton jbtnReset;
    private javax.swing.JButton jbtnTranscript;
    private javax.swing.JComboBox<String> jcmbPrograms;
    private javax.swing.JTextField jtxtAccounting;
    private javax.swing.JTextField jtxtArabic;
    private javax.swing.JTextField jtxtAverage;
    private javax.swing.JTextField jtxtBPC;
    private javax.swing.JTextField jtxtDLD;
    private javax.swing.JTextField jtxtDLDLab;
    private javax.swing.JTextField jtxtDiscrete;
    private javax.swing.JTextField jtxtFirstName;
    private javax.swing.JTextField jtxtIntegralCalculus;
    private javax.swing.JTextField jtxtOOC;
    private javax.swing.JTextField jtxtOOCLab;
    private javax.swing.JTextField jtxtRanking;
    private javax.swing.JTextField jtxtStudentId;
    private javax.swing.JTextField jtxtSurname;
    private javax.swing.JTextField jtxtTotalScore;
    private javax.swing.JTextArea jtxtTranscript;
    // End of variables declaration//GEN-END:variables
}
