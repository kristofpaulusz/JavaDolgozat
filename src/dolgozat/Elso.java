package dolgozat;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;

public class Elso extends javax.swing.JFrame {
    private Integer[] szamok = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
    private Integer[] rndSzamok = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
    private JButton[] myTomb = new JButton[10];
    private JButton[] amobaTomb;
    private static boolean xKezdo = true;
    
    public Elso() {
        initComponents();
        gombok();
        amobaSetUp(3);
        amobaStart();
        buttonListener();
        alaphelyzet();
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new WindowBelsoListener());
    }
    public void setNumbers(Integer[] szamok) {
//        JButton[] myTomb = {jButton1, jButton2, jButton3, jButton4, jButton5, jButton6, jButton7, jButton8, jButton9, jButton10};
        int index = 0;
        for (JButton jButton : myTomb) {
            jButton.setText(szamok[index].toString());
            index +=1;
            
        }
    }
    public void buttonListener() {
//        JButton[] myTomb = {jButton1, jButton2, jButton3, jButton4, jButton5, jButton6, jButton7, jButton8, jButton9, jButton10};
        for (JButton jButton : myTomb) {
            jButton.addActionListener(new CyanListener());
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        myJTP = new javax.swing.JTabbedPane();
        loginPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jatekPanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        myMenuBar = new javax.swing.JMenuBar();
        programMenu = new javax.swing.JMenu();
        ujraMenuItem = new javax.swing.JMenuItem();
        mySep = new javax.swing.JPopupMenu.Separator();
        kilepesMenuItem = new javax.swing.JMenuItem();
        jatekElrendezMenu = new javax.swing.JMenu();
        vizszintesMenuItem = new javax.swing.JRadioButtonMenuItem();
        fuggolegesMenuItem = new javax.swing.JRadioButtonMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 410, 350));
        setName("myFrame"); // NOI18N
        setPreferredSize(new java.awt.Dimension(410, 350));

        myJTP.setName("Bejelentkez??s"); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Pin k??d"));
        jPanel1.setToolTipText("");
        jPanel1.setLayout(new java.awt.GridLayout(4, 3, 2, 2));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Be??ll??t??s"));
        jPanel2.setMaximumSize(new java.awt.Dimension(350, 400));

        jCheckBox1.setText("kever");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jLabel1.setText("k??d:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jCheckBox1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(107, 107, 107))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(90, Short.MAX_VALUE))
        );

        myJTP.addTab("Bejelentkez??s", loginPanel);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Am??ba"));
        jPanel3.setLayout(new java.awt.GridLayout(3, 3, 10, 10));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Be??ll??t??s"));
        jPanel4.setLayout(new javax.swing.BoxLayout(jPanel4, javax.swing.BoxLayout.Y_AXIS));

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "3*3", "4*4", "5*5", "6*6" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jPanel4.add(jScrollPane1);

        buttonGroup2.add(jRadioButton1);
        jRadioButton1.setText("\"X\" kezd");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jRadioButton1);

        buttonGroup2.add(jRadioButton2);
        jRadioButton2.setText("\"O\" kezd");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jRadioButton2);

        javax.swing.GroupLayout jatekPanelLayout = new javax.swing.GroupLayout(jatekPanel);
        jatekPanel.setLayout(jatekPanelLayout);
        jatekPanelLayout.setHorizontalGroup(
            jatekPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jatekPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(170, Short.MAX_VALUE))
        );
        jatekPanelLayout.setVerticalGroup(
            jatekPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jatekPanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jatekPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jatekPanelLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(110, Short.MAX_VALUE))
        );

        myJTP.addTab("J??t??k", jatekPanel);

        programMenu.setText("Program");

        ujraMenuItem.setText("??jra");
        ujraMenuItem.setToolTipText("");
        ujraMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ujraMenuItemActionPerformed(evt);
            }
        });
        programMenu.add(ujraMenuItem);
        programMenu.add(mySep);

        kilepesMenuItem.setText("Kil??p??s");
        kilepesMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kilepesMenuItemActionPerformed(evt);
            }
        });
        programMenu.add(kilepesMenuItem);

        myMenuBar.add(programMenu);

        jatekElrendezMenu.setText("J??t??k elrendez??se");

        buttonGroup1.add(vizszintesMenuItem);
        vizszintesMenuItem.setSelected(true);
        vizszintesMenuItem.setText("v??zszintes");
        vizszintesMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vizszintesMenuItemActionPerformed(evt);
            }
        });
        jatekElrendezMenu.add(vizszintesMenuItem);

        buttonGroup1.add(fuggolegesMenuItem);
        fuggolegesMenuItem.setText("f??gg??leges");
        jatekElrendezMenu.add(fuggolegesMenuItem);

        myMenuBar.add(jatekElrendezMenu);

        setJMenuBar(myMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(myJTP)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(myJTP)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void vizszintesMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vizszintesMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vizszintesMenuItemActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        JCheckBox myCB = (JCheckBox) evt.getSource();
        if (myCB.isSelected()) {
        

        
		Random rand = new Random();
		
		for (int i = 0; i < rndSzamok.length; i++) {
			int randomIndexToSwap = rand.nextInt(rndSzamok.length);
			int temp = rndSzamok[randomIndexToSwap];
			rndSzamok[randomIndexToSwap] = rndSzamok[i];
			rndSzamok[i] = temp;
		}
        
        setNumbers(rndSzamok);
        }
        else setNumbers(szamok);

    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void ujraMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ujraMenuItemActionPerformed
       alaphelyzet();
    }//GEN-LAST:event_ujraMenuItemActionPerformed

    private void kilepesMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kilepesMenuItemActionPerformed
        kilepes();
    }//GEN-LAST:event_kilepesMenuItemActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        xKezdo = true;
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        xKezdo = false;
    }//GEN-LAST:event_jRadioButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Elso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Elso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Elso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Elso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Elso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JRadioButtonMenuItem fuggolegesMenuItem;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JMenu jatekElrendezMenu;
    private javax.swing.JPanel jatekPanel;
    private javax.swing.JMenuItem kilepesMenuItem;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JTabbedPane myJTP;
    private javax.swing.JMenuBar myMenuBar;
    private javax.swing.JPopupMenu.Separator mySep;
    private javax.swing.JMenu programMenu;
    private javax.swing.JMenuItem ujraMenuItem;
    private javax.swing.JRadioButtonMenuItem vizszintesMenuItem;
    // End of variables declaration//GEN-END:variables

    private void alaphelyzet() {
        jTextField1.setText(" ");
        setNumbers(szamok);
//        JButton[] myTomb = {jButton1, jButton2, jButton3, jButton4, jButton5, jButton6, jButton7, jButton8, jButton9, jButton10};
        jCheckBox1.setSelected(false);
        int index = 0;
        for (JButton jButton : myTomb) {
            jButton.setBackground(null);
            index += 1;
        }
        for (JButton jButton : amobaTomb) {
            jButton.setText("");
            xKezdo = true;
        }
    }
    private void kilepes() {
            int v = JOptionPane.showConfirmDialog(this, "Biztos kil??psz?", "Kil??p??s", JOptionPane.YES_NO_OPTION);
            if (v == JOptionPane.YES_OPTION) {
                System.exit(0);   
            }
    }

    private void gombok() {
        for (int i = 0; i < 10; i++) {
            myTomb[i] = new JButton();
            jPanel1.add(myTomb[i]);
        }
    }

    private void amobaSetUp(int buttonok) {
    amobaTomb = new JButton[buttonok*buttonok];
        for (int i = 0; i < amobaTomb.length; i++) {
             amobaTomb[i] = new JButton();
            jPanel3.add(amobaTomb[i]);
        }
    }

    private void amobaStart() {
        for (JButton jButton : amobaTomb) {
            jButton.addActionListener(new AmobaListener());
        }
    
    }

    private static class AmobaListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
                JButton myButton = (JButton) e.getSource();
            if (xKezdo) {
                myButton.setText("X");
            }
            else if (!xKezdo) {
                myButton.setText("O");
            }
            xKezdo = !xKezdo;}
    }

    class WindowBelsoListener extends WindowAdapter {
    @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                kilepes();
            }
    }
    class CyanListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
        JButton myButton = (JButton) e.getSource();
        myButton.setBackground(Color.CYAN);
//        System.out.println("EL??Z??: " +jTextField1.getText());
//        System.out.println("??J: " + myButton.getText());
        String textT = jTextField1.getText() + myButton.getText();
//        System.out.println("EL??Z??+??J: " + textT+"\n");
        jTextField1.setText(textT);
        
        }
    };
}
