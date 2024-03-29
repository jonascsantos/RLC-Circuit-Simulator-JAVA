
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.text.DecimalFormat;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jonas-ws
 */
public class ParaleloDeg1 extends javax.swing.JFrame {
    RLCparaleloDeg c4 =new RLCparaleloDeg();
    
    /**
     * Creates new form Menu
     */
    public ParaleloDeg1() {
        initComponents();
        Dimension size = new Dimension(1280,700 );
        this.setSize(1280, 700);
        this.setPreferredSize(size);
        String path1 = "/imagens/8,45semNum.png";
        imgSe.setIcon(new javax.swing.ImageIcon(new javax.swing.ImageIcon(getClass().getResource(path1)).getImage().getScaledInstance(imgSe.getWidth(),imgSe.getHeight(), Image.SCALE_SMOOTH)));

        imgSe.add(fonteCorrente);
        imgSe.add(R1);
        imgSe.add(L);
        imgSe.add(C);
        
        fonteCorrente.setLocation((int)(imgSe.getWidth()*0.03), (int)(imgSe.getHeight()*0.47));
        R1.setLocation((int)(imgSe.getWidth()*0.35), (int)(imgSe.getHeight()*0.47));
        L.setLocation((int)(imgSe.getWidth()*0.85), (int)(imgSe.getHeight()*0.47));
        C.setLocation((int)(imgSe.getWidth()*0.63), (int)(imgSe.getHeight()*0.47));
        
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
        jButton7 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        imgSe = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        R1 = new javax.swing.JLabel();
        L = new javax.swing.JLabel();
        C = new javax.swing.JLabel();
        fonteCorrente = new javax.swing.JLabel();
        V0 = new javax.swing.JLabel();
        I0 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Circuitos RLC - Projeto");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 700));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1453, 747));

        jButton7.setBackground(new java.awt.Color(0, 153, 153));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("ALTERAR VALORES");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setLabelFor(this);
        jLabel2.setText("Paralelo (Com resposta a um Degrau)");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(444, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(343, 343, 343))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        imgSe.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton8.setBackground(new java.awt.Color(0, 153, 153));
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("RESOLVER QUESTÃO");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        R1.setFont(new java.awt.Font("Cambria Math", 0, 36)); // NOI18N
        R1.setText("2 Ω");

        L.setFont(new java.awt.Font("Cambria Math", 0, 36)); // NOI18N
        L.setText("1 H");

        C.setFont(new java.awt.Font("Cambria Math", 0, 36)); // NOI18N
        C.setText("0,5 F");

        fonteCorrente.setFont(new java.awt.Font("Cambria Math", 0, 36)); // NOI18N
        fonteCorrente.setText("4u(t) A");

        V0.setFont(new java.awt.Font("Cambria Math", 0, 36)); // NOI18N
        V0.setText("V(0) = 0 V");

        I0.setFont(new java.awt.Font("Cambria Math", 0, 36)); // NOI18N
        I0.setText("I(0) = 1 A");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(206, Short.MAX_VALUE)
                        .addComponent(imgSe, javax.swing.GroupLayout.PREFERRED_SIZE, 751, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(246, 246, 246))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(357, 357, 357)
                        .addComponent(V0)
                        .addGap(129, 129, 129)
                        .addComponent(I0)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(R1)
                    .addComponent(L)
                    .addComponent(C)
                    .addComponent(fonteCorrente))
                .addContainerGap(138, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(314, 314, 314)
                .addComponent(jButton8)
                .addGap(212, 212, 212)
                .addComponent(jButton7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(R1)
                        .addGap(56, 56, 56)
                        .addComponent(L)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(C))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(imgSe, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(fonteCorrente))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(V0)
                            .addComponent(I0))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(155, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    public int fontSize(javax.swing.JLabel Label){
        String labelText = (Label.getText());
        int componentWidth = Label.getWidth();
        Font labelFont = Label.getFont();
        int stringWidth = Label.getFontMetrics(labelFont).stringWidth(labelText);
        double widthRatio = (double)componentWidth / (double)stringWidth;
        int newFontSize = (int)(labelFont.getSize() * widthRatio);
        int componentHeight = Label.getHeight();
        return Math.min(newFontSize, componentHeight);
    }
    
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        DecimalFormat nf = new DecimalFormat("#.####");
        
        String R1in = JOptionPane.showInputDialog(null, "Insira o valor de R1: (Ω)", "Alterar Valores",JOptionPane.QUESTION_MESSAGE);
        double R1val = Double.parseDouble(R1in.replaceAll(",","."));
        c4.R1 = R1val;
        R1.setText(nf.format(c4.R1) + " Ω");
        R1.setFont(new Font(R1.getFont().getName(), Font.PLAIN, fontSize(R1)));   
        
        String fonteCin = JOptionPane.showInputDialog(null, "Insira o valor da fonte de Corrente: (C)", "Alterar Valores",JOptionPane.QUESTION_MESSAGE);
        double fonteCval = Double.parseDouble(fonteCin.replaceAll(",","."));
        c4.fonteCorrente = fonteCval;
        fonteCorrente.setText(nf.format(c4.fonteCorrente) + "u(t)A");
        fonteCorrente.setFont(new Font(fonteCorrente.getFont().getName(), Font.PLAIN, fontSize(fonteCorrente)));   
        
        
        String Cin = JOptionPane.showInputDialog(null, "Insira a Capacitância: (F)", "Alterar Valores",JOptionPane.QUESTION_MESSAGE);
        double Cval = Double.parseDouble(Cin.replaceAll(",","."));    
        c4.C1 = Cval;
        C.setText(nf.format(c4.C1) + " F");
        C.setFont(new Font(C.getFont().getName(), Font.PLAIN, fontSize(C)));   
        
        String Lin = JOptionPane.showInputDialog(null, "Insira a Indutância: (H)", "Alterar Valores",JOptionPane.QUESTION_MESSAGE);
        double Lval = Double.parseDouble(Lin.replaceAll(",","."));
        c4.L1 = Lval;
        L.setText(nf.format(c4.L1) + " H");
        L.setFont(new Font(L.getFont().getName(), Font.PLAIN, fontSize(L)));  
        
        String I0in = JOptionPane.showInputDialog(null, "Insira o valor de I(0): (A)", "Alterar Valores",JOptionPane.QUESTION_MESSAGE);
        double I0val = Double.parseDouble(I0in.replaceAll(",","."));
        c4.I0 = I0val;
        I0.setText("I(0) = " +nf.format(c4.I0) + " A");
        I0.setFont(new Font(fonteCorrente.getFont().getName(), Font.PLAIN, fontSize(I0))); 
        
        String V0in = JOptionPane.showInputDialog(null, "Insira o valor de V(0): (V)", "Alterar Valores",JOptionPane.QUESTION_MESSAGE);
        double V0val = Double.parseDouble(I0in.replaceAll(",","."));
        c4.V0 = V0val;
        V0.setText("V(0) = " +nf.format(c4.V0) + " V");
        V0.setFont(new Font(V0.getFont().getName(), Font.PLAIN, fontSize(V0))); 
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        new ParaleloDeg1RES(c4).setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel C;
    private javax.swing.JLabel I0;
    private javax.swing.JLabel L;
    private javax.swing.JLabel R1;
    private javax.swing.JLabel V0;
    private javax.swing.JLabel fonteCorrente;
    private javax.swing.JLabel imgSe;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
