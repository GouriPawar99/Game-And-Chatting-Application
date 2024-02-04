package project;


import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
//import javax.swing.border;
//import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class ora extends javax.swing.JFrame {
public ora() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.setText("j");

        jTextField2.setText("k");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)))
                .addContainerGap(302, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(jButton1)
                .addContainerGap(128, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        b1=new JButton();
        b1.setSize(45,45);
        b1.setLocation(100, 150);
        this.add(b1);
       Border bl=BorderFactory.createLineBorder(Color.black, 1);
       Border blp=BorderFactory.createLineBorder(Color.blue, 40);
       Border grp=BorderFactory.createLineBorder(Color.green, 40);
       Border ylp=BorderFactory.createLineBorder(Color.yellow, 40);
       Border rep=BorderFactory.createLineBorder(Color.red, 40);
       int j=700,k=0,l=650,m=50;
         for(int i=0;i<6;i++)
        {    
            g[i]=new JPanel();
            g[i].setSize(50,50);
            g[i].setLocation(l,m );
            g[i].setBackground(Color.GREEN);
            g[i].setBorder(bl);
            this.add(g[i]);
            m=m+50;
        }
        for(int i=0;i<6;i++)
        {    
            p[i]=new JPanel();
            p[i].setSize(50,50);
            p[i].setLocation(j, k);
            if(i==1)
            {
                  p[i].setBackground(Color.GREEN);
            }
            p[i].setBorder(bl);
            this.add(p[i]);
            k=k+50;
        }
        j=j+50;
         for(int i=6;i<12;i++)
        {    
            p[i]=new JPanel();
            p[i].setSize(50, 50);
            p[i].setLocation(j, k);
  //      p[i].setBackground(Color.blue);
            p[i].setBorder(bl);
            this.add(p[i]);
            j=j+50;
        }
         l=950;
         m=350;
         for(int i=0;i<6;i++)
        {    
            y[i]=new JPanel();
            y[i].setSize(50,50);
            y[i].setLocation(l,m );
            y[i].setBackground(Color.YELLOW);
            y[i].setBorder(bl);
            this.add(y[i]);
            l=l-50;
        }
        l=350;
         m=350;
         for(int i=0;i<6;i++)
        {    
            r[i]=new JPanel();
            r[i].setSize(50,50);
            r[i].setLocation(l,m );
            r[i].setBackground(Color.red);
            r[i].setBorder(bl);
            this.add(r[i]);
            l=l+50;
        }

         k=k+50;
         j=j-50;
        for(int i=12;i<14;i++)
        {    
            p[i]=new JPanel();
            p[i].setSize(50, 50);
            p[i].setLocation(j, k);
  //      p[i].setBackground(Color.blue);
            p[i].setBorder(bl);
            this.add(p[i]);
            k=k+50;
        }
          j=j-50;
          k=k-50;
           for(int i=14;i<19;i++)
        {    
            p[i]=new JPanel();
            p[i].setSize(50, 50);
            p[i].setLocation(j, k);
            if(i==14)
            {
                p[i].setBackground(Color.YELLOW);
            }
            p[i].setBorder(bl);
            this.add(p[i]);
            j=j-50;
        }
         k=k+50;
         //j=j-45;
          for(int i=19;i<25;i++)
        {    
            p[i]=new JPanel();
            p[i].setSize(50, 50);
            p[i].setLocation(j, k);
  //      p[i].setBackground(Color.blue);
            p[i].setBorder(bl);
            this.add(p[i]);
            k=k+50;
        } 
        l=650;
        m=650;
        for(int i=0;i<6;i++)
        {    
            b[i]=new JPanel();
            b[i].setSize(50,50);
            b[i].setLocation(l,m );
            b[i].setBackground(Color.BLUE);
            b[i].setBorder(bl);
            this.add(b[i]);
            m=m-50;
        }
         k=k-50;
         j=j-50;
          for(int i=25;i<27;i++)
        {    
            p[i]=new JPanel();
            p[i].setSize(50, 50);
            p[i].setLocation(j, k);
  //      p[i].setBackground(Color.blue);
            p[i].setBorder(bl);
            this.add(p[i]);
            j=j-50;
        }
          k=k-50;
          j=j+50;
             for(int i=27;i<32;i++)
        {    
            p[i]=new JPanel();
            p[i].setSize(50, 50);
            p[i].setLocation(j, k);
  //      p[i].setBackground(Color.blue);
            p[i].setBorder(bl);
            this.add(p[i]);
            k=k-50;
        }
         j=j-50;
         //k=k-50;
           for(int i=32;i<38;i++)
        {    
            p[i]=new JPanel();
            p[i].setSize(50, 50);
            p[i].setLocation(j, k);
  //      p[i].setBackground(Color.blue);
            p[i].setBorder(bl);
            this.add(p[i]);
            j=j-50;
        }
           j=j+50;
           k=k-50;
             for(int i=38;i<40;i++)
        {    
            p[i]=new JPanel();
            p[i].setSize(50, 50);
            p[i].setLocation(j, k);
  //      p[i].setBackground(Color.blue);
            p[i].setBorder(bl);
            this.add(p[i]);
            k=k-50;
        }
        k=k+50;
        j=j+50;
         for(int i=40;i<45;i++)
        {    
            p[i]=new JPanel();
            p[i].setSize(50, 50);
            p[i].setLocation(j, k);
  //      p[i].setBackground(Color.blue);
            p[i].setBorder(bl);
            this.add(p[i]);
            j=j+50;
        }
         k=k-50;
         //j=j+50;
         for(int i=45;i<51;i++)
        {    
            p[i]=new JPanel();
            p[i].setSize(50, 50);
            p[i].setLocation(j, k);
  //      p[i].setBackground(Color.blue);
            p[i].setBorder(bl);
            this.add(p[i]);
            k=k-50;
        }
         
         j=j+50;
         int i=51;
         p[i]=new JPanel();
            p[i].setSize(50, 50);
            p[i].setLocation(j, 0);
  //      p[i].setBackground(Color.blue);
            p[i].setBorder(bl);
            this.add(p[i]);
        c=new JPanel();
            c.setSize(150, 150);
            c.setLocation(600, 300);
      //c.setBackground(Color.blue);
            c.setBorder(bl);
            this.add(c);    
         gp=new JPanel();
            gp.setSize(300, 300);
            gp.setLocation(750,0);
      //gp.setBackground(Color.green);
            gp.setBorder(grp);
            this.add(gp);   
             yp=new JPanel();
            yp.setSize(300, 300);
            yp.setLocation(750,450);
      //yp.setBackground(Color.yellow);
            yp.setBorder(ylp);
            this.add(yp);
         bp=new JPanel();
            bp.setSize(300, 300);
            bp.setLocation(300,450);
      //bp.setBackground(Color.blue);
            bp.setBorder(blp);
            this.add(bp);   
         rp=new JPanel();
            rp.setSize(300, 300);
            rp.setLocation(300,0);
      //rp.setBackground(Color.red);
            rp.setBorder(rep);
            this.add(rp);
            
        ImageIcon con=new ImageIcon("E:\\center.jpg");
        jTextField1.setText(String.valueOf(j));
        jTextField2.setText(String.valueOf(k));
       /* for(int i=0;i<5;i++)
        {
            p[i]=new JPanel();
            p[i].setSize(100, 100);
            p[i].setLocation(20, 20);
            this.add(p[i]);
        }*/
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args thee  command line arguments
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
            java.util.logging.Logger.getLogger(ora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ora().setVisible(true);
            }
        });
    }
    private javax.swing.JPanel b[]=new javax.swing.JPanel[6];
    private javax.swing.JPanel r[]=new javax.swing.JPanel[6];
    private javax.swing.JPanel g[]=new javax.swing.JPanel[6];
    private javax.swing.JPanel y[]=new javax.swing.JPanel[6];
    private javax.swing.JPanel c,bp, rp,gp,yp;    
   private javax.swing.JPanel p[]=new javax.swing.JPanel[52];
   private javax.swing.JButton bt[]=new javax.swing.JButton[4];
    private javax.swing.JButton b1,b2;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
