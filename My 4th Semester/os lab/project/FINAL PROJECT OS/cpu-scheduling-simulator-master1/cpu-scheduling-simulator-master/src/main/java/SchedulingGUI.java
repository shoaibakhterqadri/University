import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;
import java.io.File;
import java.util.Random;

public class SchedulingGUI extends JFrame {
    private String[] algorithms = {"FCFS", "Round Robin", "Shortest Job First", "Priority Scheduling"};
    private String sourcePath = new String();
    public static int NUM_OF_PROCESSES = 0;
    static String selectedAlgo = new String();
    
    public SchedulingGUI() {
        initComponents();
        jLabel7.setIcon(new javax.swing.ImageIcon("src\\main\\java\\dark-abstract-tech-background_53876-90630.jpg")); 
        setResizable(false);
        setTitle("CPU Scheduling Simulator");
        jComboBox1.setModel(new DefaultComboBoxModel<>(algorithms));
        addWindowListener(new WindowListener());
        setLocationRelativeTo(null);
    }
    
    private class WindowListener extends WindowAdapter {
        public void windowOpened(WindowEvent e) {
            TitleThread thread = new TitleThread("Simulation", jLabel1, 200);
            thread.start();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        nextStep2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(35, 48, 44));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 0));
        jLabel2.setText("# of Process:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 130, 30));

        jComboBox1.setBackground(new java.awt.Color(204, 204, 204));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, 140, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 0));
        jLabel3.setText("Algorithm:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 100, 30));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setText("Browse");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, 140, 30));

        jButton2.setBackground(new java.awt.Color(255, 102, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(35, 48, 44));
        jButton2.setText("Team Info");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 110, 30));

        jLabel4.setFont(new java.awt.Font("Bookman Old Style", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 0));
        jLabel4.setText("CPU Scheduling");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 420, 80));

        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setText("Simulation");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 120, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 102, 0));
        jLabel5.setText("Source:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 70, 30));

        jTextField1.setBackground(new java.awt.Color(204, 204, 204));
        jTextField1.setText("0");
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, 140, 30));

        nextStep2.setBackground(new java.awt.Color(255, 102, 0));
        nextStep2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nextStep2.setForeground(new java.awt.Color(35, 48, 44));
        nextStep2.setText("Start");
        nextStep2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextStep2ActionPerformed(evt);
            }
        });
        jPanel1.add(nextStep2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 390, 130, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 102, 0));
        jLabel6.setText("(0 <= N <= 10)");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 290, 120, 30));

        jLabel7.setBackground(new java.awt.Color(35, 48, 44));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 10, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 957, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.getAccessibleContext().setAccessibleName("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.showOpenDialog(null);
        File file = fileChooser.getSelectedFile();
        sourcePath = file.getAbsolutePath();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JOptionPane.showMessageDialog(null, "MUHAMMAD MOHSIN ANJUM, BSCS-IV.\nMUHAMMAD NADEEM ASHRAF, BSCS-IV.\n. SHIFA JAN SIDDIQUI");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void nextStep2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextStep2ActionPerformed
        int numOfProcesses = Integer.parseInt(jTextField1.getText());
        if(sourcePath.isEmpty())
            JOptionPane.showMessageDialog(null, "ERROR: Please input the source of computation");
        else if(numOfProcesses <= 0)
            JOptionPane.showMessageDialog(null, "ERROR: Please input the appropriate number of processes");
        else {
            selectedAlgo = jComboBox1.getSelectedItem().toString();
            NUM_OF_PROCESSES = Integer.parseInt(jTextField1.getText());
            Job[] jobs = new Job[NUM_OF_PROCESSES];
            for(int i = 1; i <= NUM_OF_PROCESSES; i++) {
                String processID = "P"+i;
                long arrivalTime = (new java.util.Random().nextInt(9) + 1) * 300;
                long burstTime = (new java.util.Random().nextInt(3) + 1) * 100;
                long STRTTIME = System.nanoTime();
                
                Job newJob = new Job(processID, arrivalTime, burstTime, STRTTIME);
                jobs[(i-1)] = newJob;
            }
                CalcSimulation sim = 
                        new CalcSimulation(jobs, NUM_OF_PROCESSES, sourcePath, selectedAlgo);
            sim.start();
            this.dispose();
        }
    }//GEN-LAST:event_nextStep2ActionPerformed


    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SchedulingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SchedulingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SchedulingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SchedulingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SchedulingGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton nextStep2;
    // End of variables declaration//GEN-END:variables
}
