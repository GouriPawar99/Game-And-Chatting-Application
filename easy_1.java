package project;


import java.awt.Color;
import java.awt.Component;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.ImageIcon;
import java.lang.Math;
import static java.time.Clock.system;
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class easy_1 extends javax.swing.JFrame {
    
    /**
     * Creates new form easy
     */
    int yn,rn,bn,gn;
    static int[] bmoves=new int[4];
    static int[] rmoves=new int[4];
    static int[] ymoves=new int[4];
    static int[] gmoves=new int[4];
    
    static int bipo[]=new int[4];
    static int bpo[]=new int[4];
   
    static int ripo[]=new int[4];
    static int rpo[]=new int[4];
    
    static int yipo[]=new int[4];
    static int ypo[]=new int[4];
    
    static int gipo[]=new int[4];
    static int gpo[]=new int[4];
    
    static int gf[]=new int[4];
    static int bf[]=new int[4];
    static int yf[]=new int[4];
    static int rf[]=new int[4];
    
    static int turn[]=new int[4];
    
    static String declarew[]=new String[4];
    
    int gr[]=new int[4];
    int br[]=new int[4];
    int rr[]=new int[4];
    int yr[]=new int[4];
    
 
    int pranali,re,ruhi=0;
    static int flag,winner;
    public easy_1() {
        //jPanel1.setVisible(false);
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gm2 = new javax.swing.JPanel();
        gt2 = new javax.swing.JButton();
        ym4 = new javax.swing.JPanel();
        yt4 = new javax.swing.JButton();
        rm1 = new javax.swing.JPanel();
        rt1 = new javax.swing.JButton();
        bm4 = new javax.swing.JPanel();
        bt4 = new javax.swing.JButton();
        rd = new javax.swing.JButton();
        gd = new javax.swing.JButton();
        bd = new javax.swing.JButton();
        yd = new javax.swing.JButton();
        rm2 = new javax.swing.JPanel();
        rt2 = new javax.swing.JButton();
        rm3 = new javax.swing.JPanel();
        rt3 = new javax.swing.JButton();
        rm4 = new javax.swing.JPanel();
        rt4 = new javax.swing.JButton();
        bm2 = new javax.swing.JPanel();
        bt2 = new javax.swing.JButton();
        gm3 = new javax.swing.JPanel();
        gt3 = new javax.swing.JButton();
        bm3 = new javax.swing.JPanel();
        bt3 = new javax.swing.JButton();
        bm1 = new javax.swing.JPanel();
        bt1 = new javax.swing.JButton();
        gm4 = new javax.swing.JPanel();
        gt4 = new javax.swing.JButton();
        gm1 = new javax.swing.JPanel();
        gt1 = new javax.swing.JButton();
        ym3 = new javax.swing.JPanel();
        yt3 = new javax.swing.JButton();
        ym1 = new javax.swing.JPanel();
        yt1 = new javax.swing.JButton();
        ym2 = new javax.swing.JPanel();
        yt2 = new javax.swing.JButton();
        glabel = new javax.swing.JLabel();
        blabel = new javax.swing.JLabel();
        rlabel = new javax.swing.JLabel();
        ylabel = new javax.swing.JLabel();
        MENU1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 255, 255));
        setSize(new java.awt.Dimension(1900, 800));

        gm2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        gm2.setMinimumSize(new java.awt.Dimension(50, 50));

        gt2.setEnabled(false);
        gt2.setMaximumSize(new java.awt.Dimension(40, 40));
        gt2.setMinimumSize(new java.awt.Dimension(40, 40));
        gt2.setPreferredSize(new java.awt.Dimension(40, 40));
        gt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gt2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout gm2Layout = new javax.swing.GroupLayout(gm2);
        gm2.setLayout(gm2Layout);
        gm2Layout.setHorizontalGroup(
            gm2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gm2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(gt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        gm2Layout.setVerticalGroup(
            gm2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gm2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(gt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        ym4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        yt4.setEnabled(false);
        yt4.setMaximumSize(new java.awt.Dimension(40, 40));
        yt4.setMinimumSize(new java.awt.Dimension(40, 40));
        yt4.setPreferredSize(new java.awt.Dimension(40, 40));
        yt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yt4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ym4Layout = new javax.swing.GroupLayout(ym4);
        ym4.setLayout(ym4Layout);
        ym4Layout.setHorizontalGroup(
            ym4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ym4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(yt4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        ym4Layout.setVerticalGroup(
            ym4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ym4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(yt4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        rm1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        rm1.setMinimumSize(new java.awt.Dimension(50, 50));

        rt1.setEnabled(false);
        rt1.setMaximumSize(new java.awt.Dimension(40, 40));
        rt1.setMinimumSize(new java.awt.Dimension(40, 40));
        rt1.setPreferredSize(new java.awt.Dimension(40, 40));
        rt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rt1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout rm1Layout = new javax.swing.GroupLayout(rm1);
        rm1.setLayout(rm1Layout);
        rm1Layout.setHorizontalGroup(
            rm1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rm1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        rm1Layout.setVerticalGroup(
            rm1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rm1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bm4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bm4.setMinimumSize(new java.awt.Dimension(50, 50));

        bt4.setEnabled(false);
        bt4.setMaximumSize(new java.awt.Dimension(40, 40));
        bt4.setMinimumSize(new java.awt.Dimension(40, 40));
        bt4.setPreferredSize(new java.awt.Dimension(40, 40));
        bt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bm4Layout = new javax.swing.GroupLayout(bm4);
        bm4.setLayout(bm4Layout);
        bm4Layout.setHorizontalGroup(
            bm4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bm4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bt4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bm4Layout.setVerticalGroup(
            bm4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bm4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        rd.setPreferredSize(new java.awt.Dimension(50, 50));
        rd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdActionPerformed(evt);
            }
        });

        gd.setPreferredSize(new java.awt.Dimension(50, 50));
        gd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gdActionPerformed(evt);
            }
        });

        bd.setPreferredSize(new java.awt.Dimension(50, 50));
        bd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdActionPerformed(evt);
            }
        });

        yd.setPreferredSize(new java.awt.Dimension(50, 50));
        yd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ydActionPerformed(evt);
            }
        });

        rm2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        rm2.setMinimumSize(new java.awt.Dimension(50, 50));

        rt2.setEnabled(false);
        rt2.setMaximumSize(new java.awt.Dimension(40, 40));
        rt2.setMinimumSize(new java.awt.Dimension(40, 40));
        rt2.setPreferredSize(new java.awt.Dimension(40, 40));
        rt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rt2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout rm2Layout = new javax.swing.GroupLayout(rm2);
        rm2.setLayout(rm2Layout);
        rm2Layout.setHorizontalGroup(
            rm2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rm2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        rm2Layout.setVerticalGroup(
            rm2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rm2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        rm3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        rm3.setMinimumSize(new java.awt.Dimension(50, 50));

        rt3.setEnabled(false);
        rt3.setMaximumSize(new java.awt.Dimension(40, 40));
        rt3.setMinimumSize(new java.awt.Dimension(40, 40));
        rt3.setPreferredSize(new java.awt.Dimension(40, 40));
        rt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rt3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout rm3Layout = new javax.swing.GroupLayout(rm3);
        rm3.setLayout(rm3Layout);
        rm3Layout.setHorizontalGroup(
            rm3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rm3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        rm3Layout.setVerticalGroup(
            rm3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rm3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        rm4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        rm4.setMinimumSize(new java.awt.Dimension(50, 50));

        rt4.setEnabled(false);
        rt4.setMaximumSize(new java.awt.Dimension(40, 40));
        rt4.setMinimumSize(new java.awt.Dimension(40, 40));
        rt4.setPreferredSize(new java.awt.Dimension(40, 40));
        rt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rt4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout rm4Layout = new javax.swing.GroupLayout(rm4);
        rm4.setLayout(rm4Layout);
        rm4Layout.setHorizontalGroup(
            rm4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rm4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rt4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        rm4Layout.setVerticalGroup(
            rm4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rm4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rt4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bm2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bm2.setMinimumSize(new java.awt.Dimension(50, 50));

        bt2.setEnabled(false);
        bt2.setMaximumSize(new java.awt.Dimension(40, 40));
        bt2.setMinimumSize(new java.awt.Dimension(40, 40));
        bt2.setPreferredSize(new java.awt.Dimension(40, 40));
        bt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bm2Layout = new javax.swing.GroupLayout(bm2);
        bm2.setLayout(bm2Layout);
        bm2Layout.setHorizontalGroup(
            bm2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bm2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        bm2Layout.setVerticalGroup(
            bm2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bm2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        gm3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        gm3.setMinimumSize(new java.awt.Dimension(50, 50));

        gt3.setEnabled(false);
        gt3.setMaximumSize(new java.awt.Dimension(40, 40));
        gt3.setMinimumSize(new java.awt.Dimension(40, 40));
        gt3.setPreferredSize(new java.awt.Dimension(40, 40));
        gt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gt3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout gm3Layout = new javax.swing.GroupLayout(gm3);
        gm3.setLayout(gm3Layout);
        gm3Layout.setHorizontalGroup(
            gm3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gm3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        gm3Layout.setVerticalGroup(
            gm3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gm3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bm3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bm3.setMinimumSize(new java.awt.Dimension(50, 50));

        bt3.setEnabled(false);
        bt3.setMaximumSize(new java.awt.Dimension(40, 40));
        bt3.setMinimumSize(new java.awt.Dimension(40, 40));
        bt3.setPreferredSize(new java.awt.Dimension(40, 40));
        bt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bm3Layout = new javax.swing.GroupLayout(bm3);
        bm3.setLayout(bm3Layout);
        bm3Layout.setHorizontalGroup(
            bm3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bm3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bt3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        bm3Layout.setVerticalGroup(
            bm3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bm3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bt3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        bm1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bm1.setMinimumSize(new java.awt.Dimension(50, 50));

        bt1.setEnabled(false);
        bt1.setMaximumSize(new java.awt.Dimension(40, 40));
        bt1.setMinimumSize(new java.awt.Dimension(40, 40));
        bt1.setPreferredSize(new java.awt.Dimension(40, 40));
        bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bm1Layout = new javax.swing.GroupLayout(bm1);
        bm1.setLayout(bm1Layout);
        bm1Layout.setHorizontalGroup(
            bm1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bm1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bm1Layout.setVerticalGroup(
            bm1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bm1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gm4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        gm4.setMinimumSize(new java.awt.Dimension(50, 50));

        gt4.setEnabled(false);
        gt4.setMaximumSize(new java.awt.Dimension(40, 40));
        gt4.setMinimumSize(new java.awt.Dimension(40, 40));
        gt4.setPreferredSize(new java.awt.Dimension(40, 40));
        gt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gt4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout gm4Layout = new javax.swing.GroupLayout(gm4);
        gm4.setLayout(gm4Layout);
        gm4Layout.setHorizontalGroup(
            gm4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gm4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gt4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        gm4Layout.setVerticalGroup(
            gm4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gm4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(gt4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        gm1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        gm1.setMinimumSize(new java.awt.Dimension(50, 50));

        gt1.setEnabled(false);
        gt1.setMaximumSize(new java.awt.Dimension(40, 40));
        gt1.setMinimumSize(new java.awt.Dimension(40, 40));
        gt1.setPreferredSize(new java.awt.Dimension(40, 40));
        gt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gt1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout gm1Layout = new javax.swing.GroupLayout(gm1);
        gm1.setLayout(gm1Layout);
        gm1Layout.setHorizontalGroup(
            gm1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gm1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        gm1Layout.setVerticalGroup(
            gm1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gm1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ym3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ym3.setMinimumSize(new java.awt.Dimension(50, 50));

        yt3.setEnabled(false);
        yt3.setMaximumSize(new java.awt.Dimension(40, 40));
        yt3.setMinimumSize(new java.awt.Dimension(40, 40));
        yt3.setPreferredSize(new java.awt.Dimension(40, 40));
        yt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yt3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ym3Layout = new javax.swing.GroupLayout(ym3);
        ym3.setLayout(ym3Layout);
        ym3Layout.setHorizontalGroup(
            ym3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ym3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(yt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        ym3Layout.setVerticalGroup(
            ym3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ym3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(yt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ym1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ym1.setMinimumSize(new java.awt.Dimension(50, 50));

        yt1.setEnabled(false);
        yt1.setMaximumSize(new java.awt.Dimension(40, 40));
        yt1.setMinimumSize(new java.awt.Dimension(40, 40));
        yt1.setPreferredSize(new java.awt.Dimension(40, 40));
        yt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yt1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ym1Layout = new javax.swing.GroupLayout(ym1);
        ym1.setLayout(ym1Layout);
        ym1Layout.setHorizontalGroup(
            ym1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ym1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(yt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        ym1Layout.setVerticalGroup(
            ym1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ym1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(yt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        ym2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ym2.setMinimumSize(new java.awt.Dimension(50, 50));

        yt2.setEnabled(false);
        yt2.setMaximumSize(new java.awt.Dimension(40, 40));
        yt2.setMinimumSize(new java.awt.Dimension(40, 40));
        yt2.setPreferredSize(new java.awt.Dimension(40, 40));
        yt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yt2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ym2Layout = new javax.swing.GroupLayout(ym2);
        ym2.setLayout(ym2Layout);
        ym2Layout.setHorizontalGroup(
            ym2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ym2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(yt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ym2Layout.setVerticalGroup(
            ym2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ym2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(yt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        glabel.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        glabel.setText("Pranali");

        blabel.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        blabel.setText("Rutu");

        rlabel.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        rlabel.setText("Mihir");

        ylabel.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        ylabel.setText("Aman");

        MENU1.setText("EXIT ");
        MENU1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MENU1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(446, 446, 446)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(rm3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rm2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(rm1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rm4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(gm1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(gm3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(gm2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(gm4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(405, 405, 405)
                        .addComponent(rd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(rlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(339, 339, 339)
                        .addComponent(gd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(glabel, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(432, 432, 432)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bm1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bm2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bm3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bm4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 361, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ym2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ym1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ym3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ym4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addGap(388, 388, 388))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(391, 391, 391)
                        .addComponent(bd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(blabel, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(326, 326, 326)
                        .addComponent(yd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(ylabel, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(MENU1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(gm1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(gm2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(gm4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(gm3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rm1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(rm3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rm4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(rm2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(gd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(glabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(243, 243, 243))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(MENU1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ym3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ym2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ym4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ym1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(yd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ylabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(69, 69, 69))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bm2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bm1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(bm4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bm3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(blabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48))))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void startgame()
{
        int j=700,k=0,f1=0,f2=0;
       this.setSize(1900,800);
       Border bl=BorderFactory.createLineBorder(Color.black, 1);
       Border blp=BorderFactory.createLineBorder(Color.blue, 40);
       Border grp=BorderFactory.createLineBorder(Color.green, 40);
       Border ylp=BorderFactory.createLineBorder(Color.yellow, 40);
       Border rep=BorderFactory.createLineBorder(Color.red, 40);
        /*rd=new JButton();
        rd.setSize(60,60);
        rd.setLocation(350,150);
       this.add(rd); 
        bd=new JButton();
        bd.setSize(60,60);
        bd.setLocation(350,600);
      //  bd.addActionListener(l);
        this.add(bd); 
        gd=new JButton();
        gd.setSize(60,60);
        gd.setLocation(800,150);
        this.add(gd); 
        yd=new JButton();
        yd.setSize(60,60);
        yd.setLocation(800,600);
        this.add(yd);8*/ 
       for(int i=0;i<53;i++)
        {    
            p[i]=new JPanel();
            p[i].setSize(50,50);
            p[i].setBorder(bl);
            if(i>=0&&i<6)
            {
                p[i].setLocation(j, k);
                this.add(p[i]);
                k=k+50;
                if(i==1)
                {
                      p[i].setBackground(Color.GREEN);
                }
            }
            if(i==6)
            {
                j=j+50;
            }
            if(i>=6&&i<12)
            {
                 p[i].setLocation(j, k);
                this.add(p[i]);
                 j=j+50;
            }
            if(i==12)
            {
                k=k+50;
                j=j-50;
                p[i].setLocation(j, k);
                this.add(p[i]);
                k=k+50;
            }
            if(i>=13&&i<19)
            {
                 p[i].setLocation(j, k);
                  if(i==14)
                {
                      p[i].setBackground(Color.yellow);
                }
                this.add(p[i]);
                 j=j-50;
            }
            if(i==19)
            {
                k=k+50;
            }
            if(i>=19&&i<25)
            {
                p[i].setLocation(j, k);
                this.add(p[i]);
                 k=k+50;
            }
            if(i==25)
            {
                k=k-50;
                j=j-50;
                p[i].setLocation(j, k);
                this.add(p[i]);
                j=j-50;
            }
            if(i>=26&&i<32)
            {
                 p[i].setLocation(j, k);
                if(i==27)
                {
                      p[i].setBackground(Color.blue);
                }
                 this.add(p[i]);
                 k=k-50; 
            }
            if(i==32)
            {
                j=j-50;
            }
            if(i>=32&&i<38)
            {
              p[i].setLocation(j, k);
              this.add(p[i]);
              j=j-50;   
            }
             if(i==38)
            {
                k=k-50;
                j=j+50;
                p[i].setLocation(j, k);
                this.add(p[i]);
                k=k-50;
            }
            if(i>=39&&i<45)
            {
              p[i].setLocation(j, k);
               if(i==40)
                {
                      p[i].setBackground(Color.red);
                }
              this.add(p[i]);
              j=j+50;     
            }
            if(i==45)
            {
                k=k-50;
            }
            if(i>=45&&i<51)
            {
                p[i].setLocation(j, k);
                this.add(p[i]);
               // p[47].setBackground(Color.black);
                k=k-50;     
            }
            if(i==51)
            {
                p[i].setLocation(650, 0);
                this.add(p[i]);
            }
            
        }
        int l=650,m=50;
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
        l=950;
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
        c=new JPanel();
            c.setSize(150, 150);
            c.setLocation(600, 300);
            c.setBorder(bl);
            this.add(c);    
           gp=new JPanel();
            gp.setSize(300, 300);
            gp.setLocation(750,0);
            gp.setBorder(grp);
            this.add(gp);   
             yp=new JPanel();
            yp.setSize(300, 300);
            yp.setLocation(750,450);
            yp.setBorder(ylp);
            this.add(yp);
            bp=new JPanel();
            bp.setSize(300, 300);
            bp.setLocation(300,450);
            bp.setBorder(blp);
            this.add(bp);   
            rp=new JPanel();
            rp.setSize(300, 300);
            rp.setLocation(300,0);
            rp.setBorder(rep);
            this.add(rp);
            gm2.setVisible(true);
            ym4.setVisible(true);
            rm1.setVisible(true);
            bm4.setVisible(true);
            for(int i=0;i<4;i++)
            {
                bpo[i]=0;
                rpo[i]=0;
                gpo[i]=0;
                bpo[i]=0;
            }
        for(int i=1;i<4;i++)
        {
            int praali=bmoves.length;
        //    jTextField1.setText(String.valueOf(praali));
                    
            bmoves[i]=0;
            gmoves[i]=0;
            rmoves[i]=0;
            ymoves[i]=0;
        }
            //this.setSize(1900, 800);

    }                                        
    private void gt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gt1ActionPerformed
                                   
        // TODO add your handling code here:
         //static int pra;
         int pra;
        //jTextField1.setText(String.valueOf(gpo[0]));
        int i=0,j=0;
        //p[51].setBackground(Color.red);
        if(gpo[0]==0)
        {   i=i+1;
            gt1.setSize(40, 40);
            gm1.setSize(50,50);
            gm1.repaint();
            gm1.revalidate();
            p[i].add(gt1);
            p[i].repaint();
            p[i].revalidate();
            gpo[0]=1;
      //      jTextField1.setText(String.valueOf(gpo[0]));
            gmoves[0]=1;
            turn[0]=1;
            yd.setEnabled(true);
        }
        else if(gpo[0]!=0)
        {
            //i=gpo[1];
            pra=gpo[0]+gn;
    //        jTextField1.setText("hi...pranali");
            gmoves[0]=gmoves[0]+gn;
            if(gf[0]==1)
            {
  //              jTextField1.setText("hi...Kiran");
                if(gn<=gr[0])
                { 
//                    jTextField1.setText("hi...pagal");
                    //flag=0;
                    re=0;
                    //re=gipo[0]+n;
                }
            }
            for(i=gpo[0];i<=pra;i++)
            {  
                if(i<=51)
                {
                    gt1.setSize(40, 40);
                    if(i==pra)
                    {
                        this.dieg(i);
                    }
                    p[i].add(gt1);
                    p[i].repaint();
                    p[i].revalidate();
                    re=gmoves[0]-51;
                }
                else if(gmoves[0]>=51)
                {
                    //jTextField1.setText("hi...aman");
                    for(int in=gipo[0];in<re;in++)
                    {
                        int rem=gipo[0]+gn;
                        if(gf[0]==0 && re!=0)
                        {
                        //    jTextField1.setText("hi...ruhi");
                            gt1.setSize(40, 40);                 
                            g[in].add(gt1);
                            g[in].repaint();
                            g[in].revalidate();
                            if(in==re-1)
                            {
                      //          jTextField1.setText("hi...rutu");
                                gf[0]=1;
                                gipo[0]=gipo[0]+re;
                    //            jTextField1.setText(String.valueOf(gipo[0]));
                                gr[0]=6-gipo[0];
                            }
                        }
                   
                    }
                }
                    //jTextField1.setText(String.valueOf(flag));
            }
            if(gf[0]==1 && re==0)
            {
               
          //      jTextField1.setText("hi ruhaan");
                           if(gn<=gr[0])
                            {
            //                     jTextField1.setText("hi akhil");
              //                   jTextField1.setText(String.valueOf(gipo[0]));
                                int  pran=gipo[0];
                                g[gipo[0]-1].remove(gt1);
                                g[gipo[0]-1].repaint();
                                g[gipo[0]-1].revalidate();
                                int panu=0;
                //                jTextField1.setText(String.valueOf(pran));
                                while(panu<gn)
                                {
                  //                  jTextField1.setText("juhi");
                                    gt1.setSize(40, 40);
                                    g[pran+panu].add(gt1);
                                    g[pran+panu].repaint();
                                    g[pran+panu].revalidate(); 
                                    panu++;
                                }
                                gipo[0]=gn+gipo[0];
                                gr[0]=6-gipo[0];
                            }
                        }
            gpo[0]=gpo[0]+gn;
            turn[0]=1;
            yd.setEnabled(true);
        }
        if(gn==6)
        {
            this.secondchanceg();
        }
        gn=0;
        this.makeactiveg();
        this.wing();
    }//GEN-LAST:event_gt1ActionPerformed

    private void gt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gt3ActionPerformed
        // TODO add your handling code here:
        int pra;
        //jTextField1.setText(String.valueOf(gpo[2]));
        int i=0,j=0;
        
        if(gpo[2]==0)
        {   i=i+1;
            gt3.setSize(40, 40);
            p[i].add(gt3);
            p[i].repaint();
            p[i].revalidate();
            gpo[2]=1;
      //      jTextField1.setText(String.valueOf(gpo[2]));
            gmoves[2]=1;
            turn[0]=0;
            yd.setEnabled(true);
        }
        else if(gpo[2]!=0)
        {
            //i=gpo[1];
            pra=gpo[2]+gn;
    //        jTextField1.setText("hi...pranali");
            gmoves[2]=gmoves[2]+gn;
            if(gf[2]==1)
            {
  //              jTextField1.setText("hi...Kiran");
                if(gn<=gr[2])
                { 
//                        jTextField1.setText("hi...pagal");
                    //flag=0;
                    re=0;
                    //re=gipo[0]+n;
                }
            }
            for(i=gpo[2];i<=pra;i++)
            {  
                if(i<=51)
                {
                    gt3.setSize(40, 40);
                    if(i==pra)
                    {
                        this.dieg(i);
                    }
                    p[i].add(gt3);
                    p[i].repaint();
                    p[i].revalidate();
                    re=gmoves[2]-51;
                }
                else if(gmoves[2]>=51)
                {
                    //jTextField1.setText("hi...aman");
                    for(int in=gipo[2];in<re;in++)
                    {
                        int rem=gipo[2]+gn;
                        if(gf[2]==0 && re!=0)
                        {
              //              jTextField1.setText("hi...ruhi");
                            gt3.setSize(40, 40);
                            g[in].add(gt3);
                            g[in].repaint();
                            g[in].revalidate();
                            if(in==re-1)
                            {
            //                    jTextField1.setText("hi...rutu");
                                gf[2]=1;
                                gipo[2]=gipo[2]+re;
          //                      jTextField1.setText(String.valueOf(gipo[2]));
                                gr[1]=6-gipo[2];
                            }
                        }
                   
                    }
                }
                    //jTextField1.setText(String.valueOf(flag));
            }
            if(gf[2]==1 && re==0)
            {
               
        //        jTextField1.setText("hi ruhaan");
                           if(gn<=gr[2])
                            {
      //                           jTextField1.setText("hi akhil");
    //                             jTextField1.setText(String.valueOf(gipo[2]));
                                int  pran=gipo[2];
                                g[gipo[2]-1].remove(gt3);
                                g[gipo[2]-1].repaint();
                                g[gipo[2]-1].revalidate();
                                int panu=0;
  //                              jTextField1.setText(String.valueOf(pran));
                                while(panu<gn)
                                {
//                                    jTextField1.setText("juhi");
                                    gt3.setSize(40, 40);
                                    g[pran+panu].add(gt3);
                                    g[pran+panu].repaint();
                                    g[pran+panu].revalidate(); 
                                    panu++;
                                }
                                gipo[2]=gn+gipo[2];
                                gr[2]=6-gipo[2];
                            }
                        }
            //}
             gpo[2]=gpo[2]+gn;
             turn[0]=0;
            yd.setEnabled(true);
        }
        if(gn==6)
        {
            this.secondchanceg();
        }
        gn=0;
        this.makeactiveg();
        this.wing();
    }//GEN-LAST:event_gt3ActionPerformed

    private void gt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gt2ActionPerformed
        // TODO add your handling code here:
        int pra;
        //jTextField1.setText(String.valueOf(gpo[1]));
        int i=0,j=0;
        
        if(gpo[1]==0)
        {   i=i+1;
            gt2.setSize(40, 40);
            p[i].add(gt2);
            p[i].repaint();
            p[i].revalidate();
            gpo[1]=1;
            //jTextField1.setText(String.valueOf(gpo[1]));
            gmoves[1]=1;
            turn[0]=0;
            yd.setEnabled(true);
        }
        else if(gpo[1]!=0)
        {
            //i=gpo[1];
            pra=gpo[1]+gn;
      //      jTextField1.setText("hi...pranali");
            gmoves[1]=gmoves[1]+gn;
            if(gf[1]==1)
            {
        //        jTextField1.setText("hi...Kiran");
                if(gn<=gr[1])
                { 
          //          jTextField1.setText("hi...pagal");
                    //flag=0;
                    re=0;
                    //re=gipo[0]+n;
                }
            }
            for(i=gpo[1];i<=pra;i++)
            {  
                if(i<=51)
                {
                    gt2.setSize(40, 40);
                    if(i==pra)
                    {
                        this.dieg(i);
                    }
                    p[i].add(gt2);
                    p[i].repaint();
                    p[i].revalidate();
                    re=gmoves[1]-51;
                }
                else if(gmoves[1]>=51)
                {
                    //jTextField1.setText("hi...aman");
                    for(int in=gipo[1];in<re;in++)
                    {
                        int rem=gipo[1]+gn;
                        if(gf[1]==0 && re!=0)
                        {
    //                        jTextField1.setText("hi...ruhi");
                            gt2.setSize(40, 40);
                            g[in].add(gt2);
                            g[in].repaint();
                            g[in].revalidate();
                            if(in==re-1)
                            {
  //                              jTextField1.setText("hi...rutu");
                                gf[1]=1;
                                gipo[1]=gipo[1]+re;
//                                jTextField1.setText(String.valueOf(gipo[1]));
                                gr[1]=6-gipo[1];
                            }
                        }
                   
                    }
                }
                    //jTextField1.setText(String.valueOf(flag));
            }
            if(gf[1]==1 && re==0)
            {
               
                //jTextField1.setText("hi ruhaan");
                           if(gn<=gr[1])
                            {
              //                   jTextField1.setText("hi akhil");
            //                     jTextField1.setText(String.valueOf(gipo[0]));
                                int  pran=gipo[1];
                                g[gipo[1]-1].remove(gt2);
                                g[gipo[1]-1].repaint();
                                g[gipo[1]-1].revalidate();
                                int panu=0;
          //                      jTextField1.setText(String.valueOf(pran));
                                while(panu<gn)
                                {
        //                            jTextField1.setText("juhi");
                                    gt2.setSize(40, 40);
                                    g[pran+panu].add(gt2);
                                    g[pran+panu].repaint();
                                    g[pran+panu].revalidate(); 
                                    panu++;
                                }
                                gipo[1]=gn+gipo[1];
                                gr[1]=6-gipo[1];
                            }
                        }
            //}
             gpo[1]=gpo[1]+gn;
             turn[0]=0;
            yd.setEnabled(true);
        }
        if(gn==6)
        {
            this.secondchanceg();
        }
        gn=0;
        this.makeactiveg();
        this.wing();
    }//GEN-LAST:event_gt2ActionPerformed

    private void gt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gt4ActionPerformed
        // TODO add your handling code here:
        int pra;
      //  jTextField1.setText(String.valueOf(gpo[0]));
        int i=0,j=0;
        
        if(gpo[3]==0)
        {   i=i+1;
            gt4.setSize(40, 40);
            p[i].add(gt4);
            p[i].repaint();
            p[i].revalidate();
            gpo[3]=1;
    //        jTextField1.setText(String.valueOf(gpo[3]));
            gmoves[3]=1;
            turn[0]=0;
            yd.setEnabled(true);
            
        }
        else if(gpo[3]!=0)
        {
            //i=gpo[1];
            pra=gpo[3]+gn;
  //          jTextField1.setText("hi...pranali");
            gmoves[3]=gmoves[3]+gn;
            if(gf[3]==1)
            {
//                jTextField1.setText("hi...Kiran");
                if(gn<=gr[3])
                { 
                  //  jTextField1.setText("hi...pagal");
                    //flag=0;
                    re=0;
                    //re=gipo[0]+n;
                }
            }
            for(i=gpo[3];i<=pra;i++)
            {  
                if(i<=51)
                {
                    gt4.setSize(40, 40);
                    if(i==pra)
                    {
                        this.dieg(i);
                    }
                    p[i].add(gt4);
                    p[i].repaint();
                    p[i].revalidate();
                    re=gmoves[3]-51;
                }
                else if(gmoves[3]>=51)
                {
                    //jTextField1.setText("hi...aman");
                    for(int in=gipo[3];in<re;in++)
                    {
                        int rem=gipo[3]+gn;
                        if(gf[3]==0 && re!=0)
                        {
                //            jTextField1.setText("hi...ruhi");
                            gt4.setSize(40, 40);
                            g[in].add(gt4);
                            g[in].repaint();
                            g[in].revalidate();
                            if(in==re-1)
                            {
              //                  jTextField1.setText("hi...rutu");
                                gf[3]=1;
                                gipo[3]=gipo[3]+re;
            //                    jTextField1.setText(String.valueOf(gipo[3]));
                                gr[3]=6-gipo[3];
                            }
                        }
                   
                    }
                }
                    //jTextField1.setText(String.valueOf(flag));
            }
            if(gf[3]==1 && re==0)
            {               
          //      jTextField1.setText("hi ruhaan");
                  if(gn<=gr[3])
                  {
        //                jTextField1.setText("hi akhil");
      //                  jTextField1.setText(String.valueOf(gipo[3]));
                        int  pran=gipo[3];
                        g[gipo[3]-1].remove(gt4);
                        g[gipo[3]-1].repaint();
                        g[gipo[3]-1].revalidate();
                        int panu=0;
    //                    jTextField1.setText(String.valueOf(pran));
                                while(panu<gn)
                                {
  //                                  jTextField1.setText("juhi");
                                    gt4.setSize(40, 40);
                                    g[pran+panu].add(gt4);
                                    g[pran+panu].repaint();
                                    g[pran+panu].revalidate(); 
                                    panu++;
                                }
                                gipo[3]=gn+gipo[3];
                                gr[3]=6-gipo[3];
                            }
                        }
            //}
             gpo[3]=gpo[3]+gn;
             turn[0]=0;
            yd.setEnabled(true);
        }
        if(gn==6)
        {
            this.secondchanceg();
        }
        gn=0;
        this.makeactiveg();
        this.wing();
    }//GEN-LAST:event_gt4ActionPerformed

    private void yt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yt1ActionPerformed
        // TODO add your handling code here:
        int pra;
        //jTextField1.setText(String.valueOf(re));
        int i=14,j=0;
        
        if(ypo[0]==0 && ymoves[0]==0)
        {   
            yt1.setSize(40, 40);
            ym1.setSize(50,50);
            ym1.repaint();
            ym1.revalidate();
            p[i].add(yt1);
            p[i].repaint();
            p[i].revalidate();
            ypo[0]=14;
            ym4.remove(yt1);
//            jTextField1.setText(String.valueOf(ypo[0]));
            ymoves[0]=0;
            turn[1]=0;
            bd.setEnabled(true);
        }
        else if(ypo[0]!=0 || ymoves[0]!=0)
        {
            //i=gpo[1];
            pra=ypo[0]+yn;
            //jTextField1.setText("hi...pranali");
            ruhi=ymoves[0];
            ymoves[0]=ymoves[0]+yn;
            if(yf[0]==1)
            {
                //jTextField1.setText("hi...Kiran");
                if(yn<=yr[0])
                { 
                    //jTextField1.setText("hi...pagal");
                    //flag=0;
                    re=0;
                    //re=gipo[0]+n;
                }
            }
            for(i=ypo[0];i<=pra;i++)
            {  
                if(ruhi<=51)
                {
                    //jTextField1.setText("hi...pagal..11");
                    if(i==51)
                    {
                        //jTextField1.setText("hi...pagal2222");
                        pra=pra-i;
                        pra=pra-1;
                        i=0;
                        yn=pra;
                        ypo[0]=0;
                    }
                    yt1.setSize(40, 40);
                    if(i==pra)
                    {
                    this.diey(i);
                    }
                    if(i==-1)
                    {
                        i=0;
                    }
                    p[i].add(yt1);
                    p[i].repaint();
                    p[i].revalidate();
            //        jTextField1.setText(String.valueOf(i));
                    if(i==12)
                    {
                        re=ymoves[0]-51;
                        this.diey(re);
                        //jTextField1.setText("hi///////");
                        yipo[0]=0;
                    }
                    if(i==51)
                    {
                        i=-1;
                    }
                }
                else if(ymoves[0]>=51)
                {
                    //jTextField1.setText("hi...aman");
                    for(int in=yipo[0];in<re;in++)
                    {
                        int rem=yipo[0]+yn;
                        if(yf[0]==0 && re!=0)
                        {
                            //jTextField1.setText("hi...ruhi");
                            yt1.setSize(40, 40);
                            y[in].add(yt1);
                            y[in].repaint();
                            y[in].revalidate();
                            if(in==re-1)
                            {
                                //jTextField1.setText("hi...rutu");
                                yf[0]=1;
                                yipo[0]=yipo[0]+re;
          //                      jTextField1.setText(String.valueOf(yipo[0]));
                                yr[0]=6-yipo[0];
                            }
                        }
                   
                    }
                }
                 ruhi++;   //jTextField1.setText(String.valueOf(flag));
            }
            if(yf[0]==1 && re==0)
            {
               
                //jTextField1.setText("hi ruhaan");
                           if(yn<=yr[0])
                            {
        //                        jTextField1.setText("hi akhil");
      //                          jTextField1.setText(String.valueOf(yipo[0]));
                                int  pran=yipo[0];
                                y[yipo[0]-1].remove(yt1);
                                y[yipo[0]-1].repaint();
                                y[yipo[0]-1].revalidate();
                                int panu=0;
    //                            jTextField1.setText(String.valueOf(pran));
                                while(panu<yn)
                                {
  //                                  jTextField1.setText("juhi");
                                    yt1.setSize(40, 40);
                                    y[pran+panu].add(yt1);
                                    y[pran+panu].repaint();
                                    y[pran+panu].revalidate(); 
                                    panu++;
                                }
                                yipo[0]=yn+yipo[0];
                                yr[0]=6-yipo[0];
                            }
                        }
            //}
                ypo[0]=ypo[0]+yn;
            this.makeactivey();
            turn[1]=0;
            bd.setEnabled(true);
        }
        if(yn==6)
        {
            this.secondchancey();
        }
        yn=0;
        this.winy();
    }//GEN-LAST:event_yt1ActionPerformed

    private void yt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yt3ActionPerformed
        // TODO add your handling code here:
        int pra;
        //jTextField1.setText(String.valueOf(re));
        int i=14,j=0;
        
        if(ypo[2]==0 && ymoves[2]==0)
        {   
            yt3.setSize(40, 40);
            p[i].add(yt3);
            p[i].repaint();
            p[i].revalidate();
            ypo[2]=14;
            ym4.remove(yt3);
//            jTextField1.setText(String.valueOf(ypo[2]));
            ymoves[2]=1;
            turn[1]=0;
            bd.setEnabled(true);
        }
        else if(ypo[2]!=0 || ymoves[2]!=0)
        {
            //i=gpo[1];
            pra=ypo[2]+yn;
            //jTextField1.setText("hi...pranali");
            ruhi=ymoves[2];
            ymoves[2]=ymoves[2]+yn;
            if(yf[2]==1)
            {
                //jTextField1.setText("hi...Kiran");
                if(yn<=yr[2])
                { 
                    //jTextField1.setText("hi...pagal");
                    //flag=0;
                    re=0;
                    //re=gipo[0]+n;
                }
            }
            for(i=ypo[2];i<=pra;i++)
            {  
                if(ruhi<=51)
                {
                    //jTextField1.setText("hi...pagal..11");
                    if(i==51)
                    {
                        //jTextField1.setText("hi...pagal2222");
                        pra=pra-i;
                        pra=pra-1;
                        i=0;
                        yn=pra;
                        ypo[2]=0;
                    }
                    yt3.setSize(40, 40);
                    if(i==pra)
                    {
                    this.diey(i);
                    }
                    if(i==-1)
                    {
                        i=0;
                    }
                    p[i].add(yt3);
                    p[i].repaint();
                    p[i].revalidate();
            //        jTextField1.setText(String.valueOf(i));
                    if(i==12)
                    {
                        re=ymoves[2]-51;
                        this.diey(re);
                        //jTextField1.setText("hi///////");
                        yipo[2]=0;
                    }
                    if(i==51)
                    {
                        i=-1;
                    }
                }
                else if(ymoves[2]>=51)
                {
                    //jTextField1.setText("hi...aman");
                    for(int in=yipo[2];in<re;in++)
                    {
                        int rem=yipo[2]+yn;
                        if(yf[2]==0 && re!=0)
                        {
                            //jTextField1.setText("hi...ruhi");
                            yt3.setSize(40, 40);
                            y[in].add(yt3);
                            y[in].repaint();
                            y[in].revalidate();
                            if(in==re-1)
                            {
                                //jTextField1.setText("hi...rutu");
                                yf[2]=1;
                                yipo[2]=yipo[2]+re;
          //                      jTextField1.setText(String.valueOf(yipo[2]));
                                yr[2]=6-yipo[2];
                            }
                        }
                   
                    }
                }
                 ruhi++;   //jTextField1.setText(String.valueOf(flag));
            }
            if(yf[2]==1 && re==0)
            {
               
                //jTextField1.setText("hi ruhaan");
                           if(yn<=yr[2])
                            {
        //                        jTextField1.setText("hi akhil");
      //                          jTextField1.setText(String.valueOf(yipo[0]));
                                int  pran=yipo[2];
                                y[yipo[0]-1].remove(yt3);
                                y[yipo[0]-1].repaint();
                                y[yipo[0]-1].revalidate();
                                int panu=0;
    //                            jTextField1.setText(String.valueOf(pran));
                                while(panu<yn)
                                {
  //                                  jTextField1.setText("juhi");
                                    yt3.setSize(40, 40);
                                    y[pran+panu].add(yt3);
                                    y[pran+panu].repaint();
                                    y[pran+panu].revalidate(); 
                                    panu++;
                                }
                                yipo[2]=yn+yipo[2];
                                yr[2]=6-yipo[2];
                            }
                        }
            //}
                ypo[2]=ypo[2]+yn;
                turn[1]=0;
            bd.setEnabled(true);
        }
        if(rn==6)
        {
            this.secondchancey();
        }
        this.makeactivey();
        yn=0;
        this.winy();
    }//GEN-LAST:event_yt3ActionPerformed

    private void yt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yt2ActionPerformed
        // TODO add your handling code here:
        int pra;
        //jTextField1.setText(String.valueOf(re));
        int i=14,j=0;
        
        if(ypo[1]==0 && ymoves[1]==0)
        {   
            yt2.setSize(40, 40);
            p[i].add(yt2);
            p[i].repaint();
            p[i].revalidate();
            ypo[1]=14;
            ym4.remove(yt2);
//            jTextField1.setText(String.valueOf(ypo[1]));
            ymoves[1]=1;
            turn[1]=0;
            bd.setEnabled(true);
        }
        else if(ypo[1]!=0 || ymoves[1]!=0)
        {
            //i=gpo[1];
            pra=ypo[1]+yn;
            //jTextField1.setText("hi...pranali");
            ruhi=ymoves[1];
            ymoves[1]=ymoves[1]+yn;
            if(yf[1]==1)
            {
                //jTextField1.setText("hi...Kiran");
                if(yn<=yr[1])
                { 
                    //jTextField1.setText("hi...pagal");
                    //flag=0;
                    re=0;
                    //re=gipo[0]+n;
                }
            }
            for(i=ypo[1];i<=pra;i++)
            {  
                if(ruhi<=51)
                {
                    //jTextField1.setText("hi...pagal..11");
                    if(i==51)
                    {
                        //jTextField1.setText("hi...pagal2222");
                        pra=pra-i;
                        pra=pra-1;
                        i=0;
                        yn=pra;
                        ypo[1]=0;
                    }
                    yt2.setSize(40, 40);
                    if(i==pra)
                    {
                    this.diey(i);
                    }
                    if(i==-1)
                    {
                        i=0;
                    }
                    p[i].add(yt2);
                    p[i].repaint();
                    p[i].revalidate();
            //        jTextField1.setText(String.valueOf(i));
                    if(i==12)
                    {
                        re=ymoves[1]-51;
                        this.diey(re);
                        //jTextField1.setText("hi///////");
                        yipo[1]=0;
                    }
                }
                else if(ymoves[1]>=51)
                {
                    //jTextField1.setText("hi...aman");
                    for(int in=yipo[1];in<re;in++)
                    {
                        int rem=yipo[1]+yn;
                        if(yf[1]==0 && re!=0)
                        {
                            //jTextField1.setText("hi...ruhi");
                            yt2.setSize(40, 40);
                            y[in].add(yt2);
                            y[in].repaint();
                            y[in].revalidate();
                            if(in==re-1)
                            {
                                //jTextField1.setText("hi...rutu");
                                yf[1]=1;
                                yipo[1]=yipo[1]+re;
          //                      jTextField1.setText(String.valueOf(yipo[1]));
                                yr[1]=6-yipo[1];
                            }
                        }
                   
                    }
                }
                 ruhi++;   //jTextField1.setText(String.valueOf(flag));
            }
            if(yf[1]==1 && re==0)
            {
                           if(yn<=yr[1])
                            {
        //                        jTextField1.setText("hi akhil");
      //                          jTextField1.setText(String.valueOf(yipo[1]));
                                int  pran=yipo[1];
                                y[yipo[1]-1].remove(yt1);
                                y[yipo[1]-1].repaint();
                                y[yipo[1]-1].revalidate();
                                int panu=0;
    //                            jTextField1.setText(String.valueOf(pran));
                                while(panu<yn)
                                {
  //                                  jTextField1.setText("juhi");
                                    yt2.setSize(40, 40);
                                    y[pran+panu].add(yt2);
                                    y[pran+panu].repaint();
                                    y[pran+panu].revalidate(); 
                                    panu++;
                                }
                                yipo[1]=yn+yipo[1];
                                yr[1]=6-yipo[1];
                            }
                        }
            //}
                ypo[1]=ypo[1]+yn;
                turn[1]=0;
            bd.setEnabled(true);
        }
        if(yn==6)
        {
            this.secondchancey();
        }
        yn=0;
        this.makeactivey();
        this.winy();
    }//GEN-LAST:event_yt2ActionPerformed

    private void yt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yt4ActionPerformed
        // TODO add your handling code here:
        int pra;
        //jTextField1.setText(String.valueOf(re));
        int i=14,j=0;
        
        if(ypo[3]==0 && ymoves[3]==0)
        {   
            yt4.setSize(40, 40);
            p[i].add(yt4);
            p[i].repaint();
            p[i].revalidate();
            ypo[3]=14;
            ym4.remove(yt4);
//            jTextField1.setText(String.valueOf(ypo[3]));
            ymoves[1]=1;
            turn[1]=0;
            bd.setEnabled(true);
        }
        else if(ypo[3]!=0 || ymoves[3]!=0)
        {
            //i=gpo[1];
            pra=ypo[3]+yn;
            //jTextField1.setText("hi...pranali");
            ruhi=ymoves[3];
            ymoves[3]=ymoves[3]+yn;
            if(yf[3]==1)
            {
                //jTextField1.setText("hi...Kiran");
                if(yn<=yr[3])
                { 
                    //jTextField1.setText("hi...pagal");
                    //flag=0;
                    re=0;
                    //re=gipo[0]+n;
                }
            }
            for(i=ypo[3];i<=pra;i++)
            {  
                if(ruhi<=51)
                {
                    //jTextField1.setText("hi...pagal..11");
                    if(i==51)
                    {
                        //jTextField1.setText("hi...pagal2222");
                        pra=pra-i;
                        pra=pra-1;
                        i=0;
                        yn=pra;
                        //ym.remove(yt4);
                        ypo[3]=0;
                    }
                    yt4.setSize(40, 40);
                    if(i==pra)
                    {
                    this.diey(i);
                    }
                    if(i==-1)
                    {
                        i=0;
                    }
                    p[i].add(yt4);
                    p[i].repaint();
                    p[i].revalidate();
            //        jTextField1.setText(String.valueOf(i));
                    if(i==12)
                    {
                        re=ymoves[3]-51;
                        this.diey(re);
                        //jTextField1.setText("hi///////");
                        yipo[3]=0;
                    }
                    if(i==51)
                    {
                        i=-1;
                    }
                }
                else if(ymoves[3]>=51)
                {
                    //jTextField1.setText("hi...aman");
                    for(int in=yipo[3];in<re;in++)
                    {
                        int rem=yipo[3]+yn;
                        if(yf[3]==0 && re!=0)
                        {
                            //jTextField1.setText("hi...ruhi");
                            yt4.setSize(40, 40);
                            y[in].add(yt4);
                            y[in].repaint();
                            y[in].revalidate();
                            if(in==re-1)
                            {
                                //jTextField1.setText("hi...rutu");
                                yf[3]=1;
                                yipo[3]=yipo[3]+re;
          //                      jTextField1.setText(String.valueOf(yipo[3]));
                                yr[3]=6-yipo[3];
                            }
                        }
                   
                    }
                }
                 ruhi++;   //jTextField1.setText(String.valueOf(flag));
            }
            if(yf[3]==1 && re==0)
            {
               
                //jTextField1.setText("hi ruhaan");
                           if(yn<=yr[3])
                            {
        //                        jTextField1.setText("hi akhil");
      //                          jTextField1.setText(String.valueOf(gipo[3]));
                                int  pran=yipo[3];
                                y[yipo[3]-1].remove(yt4);
                                y[yipo[3]-1].repaint();
                                y[yipo[3]-1].revalidate();
                                int panu=0;
    //                            jTextField1.setText(String.valueOf(pran));
                                while(panu<yn)
                                {
  //                                  jTextField1.setText("juhi");
                                    yt4.setSize(40, 40);
                                    y[pran+panu].add(yt4);
                                    y[pran+panu].repaint();
                                    y[pran+panu].revalidate(); 
                                    panu++;
                                }
                                yipo[3]=yn+yipo[3];
                                yr[3]=6-yipo[3];
                            }
                        }
            //}
                ypo[3]=ypo[3]+yn;
                turn[1]=0;
            bd.setEnabled(true);
        }
        if(yn==6)
        {
            this.secondchancey();
        }
        this.makeactivey();
        yn=0;
        this.winy();
    }//GEN-LAST:event_yt4ActionPerformed

    private void rt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rt1ActionPerformed
        // TODO add your handling code here:
        int pra;
        int i=40,j=0;
        if(rpo[0]==0 && rmoves[0]==0)
        {   
            rt1.setSize(40, 40);
            p[i].add(rt1);
            p[i].repaint();
            p[i].revalidate();
            rpo[0]=40;
//            jTextField1.setText(String.valueOf(rpo[0]));
            rmoves[0]=1;
            turn[3]=0;
            gd.setEnabled(true);
        }
        else if(rpo[0]!=0 || rmoves[0]!=0)
        {
            pra=rpo[0]+rn;
            //jTextField1.setText("hi...pranali");
            ruhi=rmoves[0];
            rmoves[0]=rmoves[0]+rn;
            //jTextField1.setText(String.valueOf(rmoves[0]));
            if(rf[0]==1)
            {
                //jTextField1.setText("hi...Kiran");
                if(rn<=rr[0])
                { 
                    re=0;
                }
            }
            for(i=rpo[0];i<=pra;i++)
            {  
                if(ruhi<=51)
                {
                    if(i==51)
                    {
                        pra=pra-i;
                        pra=pra-1;
                        rn=pra;
                        rpo[0]=0;
                    }
                    rt1.setSize(40, 40);
                    if(i==pra)
                    {
                        this.dier(i);
                    }
              //      jTextField1.setText(String.valueOf(i));
                    if(i==-1)
                    {
                        i=0;
                    }
                    p[i].add(rt1);
                    p[i].repaint();
                    p[i].revalidate();
                    //jTextField1.setText(String.valueOf(i));
                    if(i==38)
                    {
                        re=rmoves[0]-51;
                        this.dier(re);
            //            jTextField1.setText(String.valueOf(rmoves[0]));
                        ripo[0]=0;
                    }
                    if(i==51)
                    {
                        i=-1;
                    }
                }
                else if(rmoves[0]>=51)
                {
                    //jTextField1.setText("hi...aman");
                    for(int in=ripo[0];in<re;in++)
                    {
                        int rem=ripo[0]+rn;
                        if(rf[0]==0 && re!=0)
                        {
                            //jTextField1.setText("hi...ruhi");
                            rt1.setSize(40, 40);
                            r[in].add(rt1);
                            r[in].repaint();
                            r[in].revalidate();
                            if(in==re-1)
                            {
                                rf[0]=1;
                                ripo[0]=ripo[0]+re;
                                //jTextField1.setText(String.valueOf(ripo[0]));
                                rr[0]=6-ripo[0];
                            }
                        }
                   
                    }
                }
                 ruhi++;   //jTextField1.setText(String.valueOf(flag));
            }
            if(rf[0]==1 && re==0)
            {
               
                //jTextField1.setText("hi ruhaan");
                           if(rn<=rr[0])
                            {
                                //jTextField1.setText("hi akhil");
                                //jTextField1.setText(String.valueOf(ripo[0]));
                                int  pran=ripo[0];
                                r[ripo[0]-1].remove(rt1);
                                r[ripo[0]-1].repaint();
                                r[ripo[0]-1].revalidate();
                                int panu=0;
                                //jTextField1.setText(String.valueOf(pran));
                                while(panu<rn)
                                {
          //                          jTextField1.setText("juhi");
                                    rt1.setSize(40, 40);
                                    r[pran+panu].add(rt1);
                                    r[pran+panu].repaint();
                                    r[pran+panu].revalidate(); 
                                    panu++;
                                }
                                ripo[0]=rn+ripo[0];
                                rr[0]=6-ripo[0];
                            }
                        }
            //}
                 //jTextField1.setText(String.valueOf(rpo[1]));
                rpo[0]=rpo[0]+rn;            
                turn[3]=0;
            gd.setEnabled(true);
        }
        if(rn==6)
        {
            this.secondchancer();
        }
        this.makeactiver();
        rn=0;
         //jTextField1.setText(String.valueOf(rpo[1]));
        this.winr();
    }//GEN-LAST:event_rt1ActionPerformed

    private void rt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rt3ActionPerformed
        // TODO add your handling code here:
        int pra;
        int i=40,j=0;
        if(rpo[2]==0 && rmoves[2]==0)
        {   
            rt3.setSize(40, 40);
            p[i].add(rt3);
            p[i].repaint();
            p[i].revalidate();
            rpo[2]=40;
        //    jTextField1.setText(String.valueOf(rpo[2]));
            rmoves[2]=1;
            turn[3]=0;
            gd.setEnabled(true);
        }
        else if(rpo[2]!=0 || rmoves[2]!=0)
        {
            pra=rpo[2]+rn;
            //jTextField1.setText("hi...pranali");
            ruhi=rmoves[2];
            rmoves[2]=rmoves[2]+rn;
            //jTextField1.setText(String.valueOf(rmoves[0]));
            if(rf[2]==1)
            {
                //jTextField1.setText("hi...Kiran");
                if(rn<=rr[2])
                { 
                    re=0;
                }
            }
            for(i=rpo[2];i<=pra;i++)
            {  
                if(ruhi<=51)
                {
                    if(i==51)
                    {
                        pra=pra-i;
                        pra=pra-1;
                        rn=pra;
                        rpo[2]=0;
                    }
                    rt3.setSize(40, 40);
                    if(i==pra)
                    {
                        this.dier(i);
                    }
              //      jTextField1.setText(String.valueOf(i));
                    if(i==-1)
                    {
                        i=0;
                    }
                    p[i].add(rt3);
                    p[i].repaint();
                    p[i].revalidate();
                    //jTextField1.setText(String.valueOf(i));
                    if(i==38)
                    {
                        re=rmoves[2]-51;
                        this.dier(re);
            //            jTextField1.setText(String.valueOf(rmoves[2]));
                        ripo[2]=0;
                    }
                    if(i==51)
                    {
                        i=-1;
                    }
                }
                else if(rmoves[2]>=51)
                {
                    //jTextField1.setText("hi...aman");
                    for(int in=ripo[2];in<re;in++)
                    {
                        int rem=ripo[2]+rn;
                        if(rf[2]==0 && re!=0)
                        {
                            //jTextField1.setText("hi...ruhi");
                            rt3.setSize(40, 40);
                            r[in].add(rt3);
                            r[in].repaint();
                            r[in].revalidate();
                            if(in==re-1)
                            {
                                rf[2]=1;
                                ripo[2]=ripo[2]+re;
                                //jTextField1.setText(String.valueOf(ripo[0]));
                                rr[2]=6-ripo[2];
                            }
                        }
                   
                    }
                }
                 ruhi++;   //jTextField1.setText(String.valueOf(flag));
            }
            if(rf[2]==1 && re==0)
            {
               
                //jTextField1.setText("hi ruhaan");
                           if(rn<=rr[2])
                            {
                                //jTextField1.setText("hi akhil");
                                //jTextField1.setText(String.valueOf(ripo[0]));
                                int  pran=ripo[2];
                                r[ripo[2]-1].remove(rt3);
                                r[ripo[2]-1].repaint();
                                r[ripo[2]-1].revalidate();
                                int panu=0;
                                //jTextField1.setText(String.valueOf(pran));
                                while(panu<rn)
                                {
          //                          jTextField1.setText("juhi");
                                    rt3.setSize(40, 40);
                                    r[pran+panu].add(rt3);
                                    r[pran+panu].repaint();
                                    r[pran+panu].revalidate(); 
                                    panu++;
                                }
                                ripo[2]=rn+ripo[2];
                                rr[2]=6-ripo[2];
                            }
                        }
            //}
                 //jTextField1.setText(String.valueOf(rpo[1]));
                rpo[2]=rpo[2]+rn;            
                turn[3]=0;
            gd.setEnabled(true);
        }
        if(rn==6)
        {
            this.secondchancer();
        }
        this.makeactiver();
        rn=0;
         //jTextField1.setText(String.valueOf(rpo[1]));
        this.winr();
        //rt2.setEnabled(true);

    }//GEN-LAST:event_rt3ActionPerformed

    private void rt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rt2ActionPerformed
        // TODO add your handling code here:
        int pra;
        int i=40,j=0;
        if(rpo[1]==0 && rmoves[1]==0)
        {   
            rt2.setSize(40, 40);
            p[i].add(rt2);
            p[i].repaint();
            p[i].revalidate();
            rpo[1]=40;
        //    jTextField1.setText(String.valueOf(rpo[1]));
            rmoves[1]=1;
            turn[3]=0;
            gd.setEnabled(true);
        }
        else if(rpo[1]!=0 || rmoves[1]!=0)
        {
            pra=rpo[1]+rn;
            //jTextField1.setText("hi...pranali");
            ruhi=rmoves[1];
            rmoves[1]=rmoves[1]+rn;
            //jTextField1.setText(String.valueOf(rmoves[0]));
            if(rf[1]==1)
            {
                //jTextField1.setText("hi...Kiran");
                if(rn<=rr[1])
                { 
                    re=0;
                }
            }
            for(i=rpo[1];i<=pra;i++)
            {  
                if(ruhi<=51)
                {
                    if(i==51)
                    {
                        pra=pra-i;
                        pra=pra-1;
                        rn=pra;
                        rpo[1]=0;
                    }
                    rt2.setSize(40, 40);
                    if(i==pra)
                    {
                        this.dier(i);
                    }
      //              jTextField1.setText(String.valueOf(i));
                    if(i==-1)
                    {
                        i=0;
                    }
                    p[i].add(rt2);
                    p[i].repaint();
                    p[i].revalidate();
                    //jTextField1.setText(String.valueOf(i));
                    if(i==38)
                    {
                        re=rmoves[1]-51;
                        this.dier(re);
    //                    jTextField1.setText(String.valueOf(rmoves[1]));
                        ripo[1]=0;
                    }
                    if(i==51)
                    {
                        i=-1;
                    }
                }
                else if(rmoves[1]>=51)
                {
                    //jTextField1.setText("hi...aman");
                    for(int in=ripo[1];in<re;in++)
                    {
                        int rem=ripo[1]+rn;
                        if(rf[1]==0 && re!=0)
                        {
                            //jTextField1.setText("hi...ruhi");
                            rt2.setSize(40, 40);
                            r[in].add(rt2);
                            r[in].repaint();
                            r[in].revalidate();
                            if(in==re-1)
                            {
                                rf[1]=1;
                                ripo[1]=ripo[1]+re;
                                //jTextField1.setText(String.valueOf(ripo[0]));
                                rr[1]=6-ripo[1];
                            }
                        }
                   
                    }
                }
                 ruhi++;   //jTextField1.setText(String.valueOf(flag));
            }
            if(rf[1]==1 && re==0)
            {
               
                //jTextField1.setText("hi ruhaan");
                           if(rn<=rr[1])
                            {
                                //jTextField1.setText("hi akhil");
                                //jTextField1.setText(String.valueOf(ripo[0]));
                                int  pran=ripo[1];
                                r[ripo[1]-1].remove(rt2);
                                r[ripo[1]-1].repaint();
                                r[ripo[1]-1].revalidate();
                                int panu=0;
                                //jTextField1.setText(String.valueOf(pran));
                                while(panu<rn)
                                {
  //                                  jTextField1.setText("juhi");
                                    rt2.setSize(40, 40);
                                    r[pran+panu].add(rt2);
                                    r[pran+panu].repaint();
                                    r[pran+panu].revalidate(); 
                                    panu++;
                                }
                                ripo[1]=rn+ripo[1];
                                rr[1]=6-ripo[1];
                            }
                        }
            //}
                 //jTextField1.setText(String.valueOf(rpo[1]));
                rpo[1]=rpo[1]+rn;            
                turn[3]=0;
            gd.setEnabled(true);
        }
        if(rn==6)
        {
            this.secondchancer();
        }
        this.makeactiver();
        rn=0;
         //jTextField1.setText(String.valueOf(rpo[1]));
        this.winr();
        //rt2.setEnabled(true);
        
    }//GEN-LAST:event_rt2ActionPerformed

    private void rt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rt4ActionPerformed
        // TODO add your handling code here:
        int pra;
        int i=40,j=0;
        if(rpo[3]==0 && rmoves[3]==0)
        {   
            rt4.setSize(40, 40);
            p[i].add(rt4);
            p[i].repaint();
            p[i].revalidate();
            rpo[3]=40;
//            jTextField1.setText(String.valueOf(rpo[3]));
            rmoves[3]=1;
            turn[3]=0;
            gd.setEnabled(true);
        }
        else if(rpo[3]!=0 || rmoves[3]!=0)
        {
            pra=rpo[3]+rn;
            //jTextField1.setText("hi...pranali");
            ruhi=rmoves[3];
            rmoves[3]=rmoves[3]+rn;
            //jTextField1.setText(String.valueOf(rmoves[0]));
            if(rf[3]==1)
            {
                //jTextField1.setText("hi...Kiran");
                if(rn<=rr[3])
                { 
                    re=0;
                }
            }
            for(i=rpo[3];i<=pra;i++)
            {  
                if(ruhi<=51)
                {
                    if(i==51)
                    {
                        pra=pra-i;
                        pra=pra-1;
                        rn=pra;
                        rpo[3]=0;
                    }
                    rt4.setSize(40, 40);
                    if(i==pra)
                    {
                        this.dier(i);
                    }
              //      jTextField1.setText(String.valueOf(i));
                    if(i==-1)
                    {
                        i=0;
                    }
                    p[i].add(rt4);
                    p[i].repaint();
                    p[i].revalidate();
                    //jTextField1.setText(String.valueOf(i));
                    if(i==38)
                    {
                        re=rmoves[3]-51;
                        this.dier(re);
            //            jTextField1.setText(String.valueOf(rmoves[3]));
                        ripo[3]=0;
                    }
                    if(i==51)
                    {
                        i=-1;
                    }
                }
                else if(rmoves[3]>=51)
                {
                    //jTextField1.setText("hi...aman");
                    for(int in=ripo[3];in<re;in++)
                    {
                        int rem=ripo[3]+rn;
                        if(rf[3]==0 && re!=0)
                        {
                            //jTextField1.setText("hi...ruhi");
                            rt4.setSize(40, 40);
                            r[in].add(rt4);
                            r[in].repaint();
                            r[in].revalidate();
                            if(in==re-1)
                            {
                                rf[3]=1;
                                ripo[3]=ripo[3]+re;
                                //jTextField1.setText(String.valueOf(ripo[0]));
                                rr[3]=6-ripo[3];
                            }
                        }
                   
                    }
                }
                 ruhi++;   //jTextField1.setText(String.valueOf(flag));
            }
            if(rf[3]==1 && re==0)
            {
               
                //jTextField1.setText("hi ruhaan");
                           if(rn<=rr[3])
                            {
                                //jTextField1.setText("hi akhil");
                                //jTextField1.setText(String.valueOf(ripo[0]));
                                int  pran=ripo[3];
                                r[ripo[3]-1].remove(rt4);
                                r[ripo[3]-1].repaint();
                                r[ripo[3]-1].revalidate();
                                int panu=0;
                                //jTextField1.setText(String.valueOf(pran));
                                while(panu<rn)
                                {
          //                          jTextField1.setText("juhi");
                                    rt4.setSize(40, 40);
                                    r[pran+panu].add(rt4);
                                    r[pran+panu].repaint();
                                    r[pran+panu].revalidate(); 
                                    panu++;
                                }
                                ripo[3]=rn+ripo[3];
                                rr[3]=6-ripo[3];
                            }
                        }
            //}
                 //jTextField1.setText(String.valueOf(rpo[1]));
                rpo[3]=rpo[3]+rn;            
                turn[3]=0;
            gd.setEnabled(true);
        }
        if(rn==6)
        {
            this.secondchancer();
        }
        this.makeactiver();
        rn=0;
         //jTextField1.setText(String.valueOf(rpo[1]));
        this.winr();
        //rt2.setEnabled(true);
    }//GEN-LAST:event_rt4ActionPerformed

    private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt1ActionPerformed
        // TODO add your handling code here:
        int pra;
        int i=27,j=0;
        if(bpo[0]==0 && bmoves[0]==0)
        {   
            bt1.setSize(40, 40);
            p[i].add(bt1);
            p[i].repaint();
            p[i].revalidate();
            bpo[0]=27;
        //    jTextField1.setText(String.valueOf(bpo[0]));
            bmoves[0]=1;
            turn[2]=0;
            rd.setEnabled(true);
        }
        else if(bpo[0]!=0 || bmoves[0]!=0)
        {
            pra=bpo[0]+bn;
            //jTextField1.setText("hi...pranali");
            ruhi=bmoves[0];
            bmoves[0]=bmoves[0]+bn;
            //jTextField1.setText(String.valueOf(rmoves[0]));
            if(bf[0]==1)
            {
                //jTextField1.setText("hi...Kiran");
                if(bn<=br[0])
                { 
                    re=0;
                }
            }
            for(i=bpo[0];i<=pra;i++)
            {  
                if(ruhi<=51)
                {
                    if(i==51)
                    {
                        pra=pra-i;
                        pra=pra-1;
                        bn=pra;
                        bpo[0]=0;
                    }
                    bt1.setSize(40, 40);
                    if(i==pra)
                    {
                    this.dieb(i);
                    }
                    if(i==-1)
                    {
                        i=0;
                    }
                    p[i].add(bt1);
                    p[i].repaint();
                    p[i].revalidate();
      //              jTextField1.setText(String.valueOf(i));
                    if(i==25)
                    {
                        re=bmoves[0]-51;
                        this.dieb(re);
    //                    jTextField1.setText(String.valueOf(bmoves[0]));
                        bipo[0]=0;
                    }
                    if(i==51)
                    {
                        i=-1;
                    }
                }
                else if(bmoves[0]>=51)
                {
                    //jTextField1.setText("hi...aman");
                    for(int in=bipo[0];in<re;in++)
                    {
                        int rem=bipo[0]+bn;
                        if(bf[0]==0 && re!=0)
                        {
                            //jTextField1.setText("hi...ruhi");
                            bt1.setSize(40, 40);
                            b[in].add(bt1);
                            b[in].repaint();
                            b[in].revalidate();
                            if(in==re-1)
                            {
                                bf[0]=1;
                                bipo[0]=bipo[0]+re;
                                //jTextField1.setText(String.valueOf(ripo[0]));
                                br[0]=6-bipo[0];
                            }
                        }
                   
                    }
                }
                 ruhi++;   //jTextField1.setText(String.valueOf(flag));
            }
            if(bf[0]==1 && re==0)
            {
               
                //jTextField1.setText("hi ruhaan");
                           if(bn<=br[0])
                            {
                                //jTextField1.setText("hi akhil");
                                //jTextField1.setText(String.valueOf(ripo[0]));
                                int  pran=bipo[0];
                                b[bipo[0]-1].remove(bt1);
                                b[bipo[0]-1].repaint();
                                b[bipo[0]-1].revalidate();
                                int panu=0;
                                //jTextField1.setText(String.valueOf(pran));
                                while(panu<bn)
                                {
  //                                  jTextField1.setText("juhi");
                                    bt1.setSize(40, 40);
                                    b[pran+panu].add(bt1);
                                    b[pran+panu].repaint();
                                    b[pran+panu].revalidate(); 
                                    panu++;
                                }
                                bipo[0]=bn+bipo[0];
                                br[0]=6-bipo[0];
                            }
                        }
            //}
                bpo[0]=bpo[0]+bn;
                turn[2]=0;
            rd.setEnabled(true);
        }
        if(bn==6)
        {
            this.secondchanceb();
        }
        this.makeactiveb();
        bn=0;
        this.winb();
    }//GEN-LAST:event_bt1ActionPerformed

    private void bt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt3ActionPerformed
        // TODO add your handling code here:
        int pra;
        int i=27,j=0;
        if(bpo[2]==0 && bmoves[2]==0)
        {   
            bt3.setSize(40, 40);
            p[i].add(bt3);
            p[i].repaint();
            p[i].revalidate();
            bpo[2]=27;
//            jTextField1.setText(String.valueOf(bpo[2]));
            bmoves[2]=1;
            turn[2]=0;
            rd.setEnabled(true);
        }
        else if(bpo[2]!=0 ||bmoves[2]!=0)
        {
            pra=bpo[2]+bn;
            //jTextField1.setText("hi...pranali");
            ruhi=bmoves[2];
            bmoves[2]=bmoves[2]+bn;
            //jTextField1.setText(String.valueOf(rmoves[0]));
            if(bf[2]==1)
            {
                //jTextField1.setText("hi...Kiran");
                if(bn<=br[2])
                { 
                    re=0;
                }
            }
            for(i=bpo[2];i<=pra;i++)
            {  
                if(ruhi<=51)
                {
                    if(i==51)
                    {
                        pra=pra-i;
                        pra=pra-1;
                        bn=pra;
                        bpo[2]=0;
                    }
                    bt3.setSize(40, 40);
                    if(i==pra)
                    {
                    this.dieb(i);
                    }
                    if(i==-1)
                    {
                        i=0;
                    }
                    p[i].add(bt3);
                    p[i].repaint();
                    p[i].revalidate();
              //      jTextField1.setText(String.valueOf(i));
                    if(i==25)
                    {
                        re=bmoves[2]-51;
                        this.dieb(re);
            //            jTextField1.setText(String.valueOf(bmoves[2]));
                        bipo[2]=0;
                    }
                    if(i==51)
                    {
                        i=-1;
                    }
                }
                else if(bmoves[2]>=51)
                {
                    //jTextField1.setText("hi...aman");
                    for(int in=bipo[2];in<re;in++)
                    {
                        int rem=bipo[2]+bn;
                        if(bf[2]==0 && re!=0)
                        {
                            //jTextField1.setText("hi...ruhi");
                            bt3.setSize(40, 40);
                            b[in].add(bt3);
                            b[in].repaint();
                            b[in].revalidate();
                            if(in==re-1)
                            {
                                bf[2]=1;
                                bipo[2]=bipo[2]+re;
                                //jTextField1.setText(String.valueOf(ripo[0]));
                                br[2]=6-bipo[2];
                            }
                        }
                   
                    }
                }
                 ruhi++;   //jTextField1.setText(String.valueOf(flag));
            }
            if(bf[2]==1 && re==0)
            {
               
                //jTextField1.setText("hi ruhaan");
                           if(bn<=br[2])
                            {
                                //jTextField1.setText("hi akhil");
                                //jTextField1.setText(String.valueOf(ripo[0]));
                                int  pran=bipo[2];
                                b[bipo[2]-1].remove(bt3);
                                b[bipo[2]-1].repaint();
                                b[bipo[2]-1].revalidate();
                                int panu=0;
                                //jTextField1.setText(String.valueOf(pran));
                                while(panu<bn)
                                {
          //                          jTextField1.setText("juhi");
                                    bt3.setSize(40, 40);
                                    b[pran+panu].add(bt3);
                                    b[pran+panu].repaint();
                                    b[pran+panu].revalidate(); 
                                    panu++;
                                }
                                bipo[2]=bn+bipo[2];
                                br[2]=6-bipo[2];
                            }
                        }
            //}
                bpo[2]=bpo[2]+bn;
                turn[2]=0;
            rd.setEnabled(true);
        }
        if(bn==6)
        {
            this.secondchanceb();
        }
                this.makeactiveb();
        bn=0;
        this.winb();
    }//GEN-LAST:event_bt3ActionPerformed

    private void bt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt2ActionPerformed
        // TODO add your handling code here:
        int pra;
        int i=27,j=0;
        if(bpo[1]==0 && bmoves[1]==0)
        {   
            bt2.setSize(40, 40);
            p[i].add(bt2);
            p[i].repaint();
            p[i].revalidate();
            bpo[1]=27;
        //    jTextField1.setText(String.valueOf(bpo[1]));
            bmoves[1]=1;
            turn[2]=0;
            rd.setEnabled(true);
        }
        else if(bpo[1]!=0 ||bmoves[1]!=0)
        {
            pra=bpo[1]+bn;
            //jTextField1.setText("hi...pranali");
            ruhi=bmoves[1];
            bmoves[1]=bmoves[1]+bn;
            //jTextField1.setText(String.valueOf(rmoves[0]));
            if(bf[1]==1)
            {
                //jTextField1.setText("hi...Kiran");
                if(bn<=pranali)
                { 
                    re=0;
                }
            }
            for(i=bpo[1];i<=pra;i++)
            {  
                if(ruhi<=51)
                {
                    if(i==51)
                    {
                        pra=pra-i;
                        pra=pra-1;
                        bn=pra;
                        bpo[1]=0;
                    }
                    bt2.setSize(40, 40);
                    if(i==pra)
                    {
                        this.dieb(i);
                    }
                    if(i==-1)
                    {
                        i=0;
                    }
                    p[i].add(bt2);
                    p[i].repaint();
                    p[i].revalidate();
                  //  jTextField1.setText(String.valueOf(i));
                    if(i==25)
                    {
                        re=bmoves[1]-51;
                        this.dieb(re);
                //        jTextField1.setText(String.valueOf(bmoves[1]));
                        bipo[1]=0;
                    }
                    if(i==51)
                    {
                        i=-1;
                    }
                }
                else if(bmoves[1]>=51)
                {
                    //jTextField1.setText("hi...aman");
                    for(int in=bipo[1];in<re;in++)
                    {
                        int rem=bipo[1]+bn;
                        if(bf[1]==0 && re!=0)
                        {
                            //jTextField1.setText("hi...ruhi");
                            bt2.setSize(40, 40);
                            b[in].add(bt2);
                            b[in].repaint();
                            b[in].revalidate();
                            if(in==re-1)
                            {
                                bf[1]=1;
                                bipo[1]=bipo[1]+re;
                                //jTextField1.setText(String.valueOf(ripo[0]));
                                pranali=6-bipo[1];
                            }
                        }
                    }
                }
                 ruhi++;   //jTextField1.setText(String.valueOf(flag));
            }
            if(bf[1]==1 && re==0)
            {
               
                //jTextField1.setText("hi ruhaan");
                           if(bn<=pranali)
                            {
                                //jTextField1.setText("hi akhil");
                                //jTextField1.setText(String.valueOf(ripo[0]));
                                int  pran=bipo[1];
                                b[bipo[1]-1].remove(bt2);
                                b[bipo[1]-1].repaint();
                                b[bipo[1]-1].revalidate();
                                int panu=0;
                                //jTextField1.setText(String.valueOf(pran));
                                while(panu<bn)
                                {
              //                      jTextField1.setText("juhi");
                                    bt2.setSize(40, 40);
                                    b[pran+panu].add(bt2);
                                    b[pran+panu].repaint();
                                    b[pran+panu].revalidate(); 
                                    panu++;
                                }
                                bipo[1]=bn+bipo[1];
                                pranali=6-bipo[1];
                            }
                        }
            //}
                bpo[1]=bpo[1]+bn;
                turn[2]=0;
            rd.setEnabled(true);
        }
        if(bn==6)
        {
            this.secondchanceb();
        }
        this.makeactiveb();
        bn=0;
        this.winb();
    }//GEN-LAST:event_bt2ActionPerformed

    public void winb()
    {
        int de=0;
        for(int pa=0;pa<4;pa++)
        {
           if(bipo[pa]!=5)
           {
               de=1;
           }
        }
        if(de==0)
        {
            winner=winner+1;
            if(winner==1)
            {
                declarew[winner-1]=blabel.getText();
                JOptionPane.showMessageDialog(null," First winner is"+blabel.getText());
            }else if(winner==2)
            {
                declarew[winner-1]=blabel.getText();
                JOptionPane.showMessageDialog(null," Second winner is"+blabel.getText());
            }
            else if(winner==3)
            {
                declarew[winner-1]=blabel.getText();
                JOptionPane.showMessageDialog(null," third winner is"+blabel.getText());
                this.dispose();
            }
            else if(winner==4)
            {
                declarew[winner-1]=blabel.getText();
                JOptionPane.showMessageDialog(null," Fourth winner is"+blabel.getText());
            }
        }

    }
    public void wing()
    {
        int de=0;
        for(int pa=0;pa<4;pa++)
        {
           if(gipo[pa]!=5)
           {
               de=1;
           }
        }
        if(de==0)
        {
            winner=winner+1;
            if(winner==1)
            {
                    declarew[winner-1]=glabel.getText();
               JOptionPane.showMessageDialog(null," First winner is"+glabel.getText());
            }else if(winner==2)
            {
                declarew[winner-1]=glabel.getText();
                JOptionPane.showMessageDialog(null," Second  winner is"+glabel.getText());
            }
            else if(winner==3)
            {
                declarew[winner-1]=glabel.getText();
                JOptionPane.showMessageDialog(null," Third winner is"+glabel.getText());
                this.dispose();
            }
            else if(winner==4)
            {
                declarew[winner-1]=glabel.getText();
                JOptionPane.showMessageDialog(null," Fourth winner is"+glabel.getText());
            }
        }
        
    }
    public void winr()
    {
        int de=0;
        for(int pa=0;pa<4;pa++)
        {
           if(ripo[pa]!=5)
           {
               de=1;
           }
        }
        if(de==0)
        {
            winner=winner+1;
            if(winner==1)
            {
                declarew[winner-1]=rlabel.getText();
                JOptionPane.showMessageDialog(null," First winner is"+rlabel.getText());
            }else if(winner==2)
            {
                declarew[winner-1]=rlabel.getText();
                JOptionPane.showMessageDialog(null,"Second  winner is"+rlabel.getText());
            }
            else if(winner==3)
            {
                declarew[winner-1]=rlabel.getText();
                JOptionPane.showMessageDialog(null," tird winner is"+rlabel.getText());
                this.dispose();
            }
            else if(winner==4)
            {
                declarew[winner-1]=rlabel.getText();
                JOptionPane.showMessageDialog(null,"Fourth winner is"+rlabel.getText());
            }
        }

    }
    public void winy()
    {
        int de=0;
        for(int pa=0;pa<4;pa++)
        {
           if(yipo[pa]!=5)
           {
               de=1;
           }
        }
        if(de==0)
        {
            winner=winner+1;
            if(winner==1)
            {
                declarew[winner-1]=ylabel.getText();
                JOptionPane.showMessageDialog(null," First winner is"+ylabel.getText());
            }else if(winner==2)
            {
                declarew[winner-1]=ylabel.getText();
                JOptionPane.showMessageDialog(null," Second winner is"+ylabel.getText());
            }
            else if(winner==3)
            {
                declarew[winner-1]=ylabel.getText();
                JOptionPane.showMessageDialog(null," Third winner is"+ylabel.getText());
                Score s=new Score();
                s.setVisible(true);
                s.pa(declarew);
                this.dispose();
            }
            else if(winner==4)
            {
                declarew[winner-1]=ylabel.getText();
                JOptionPane.showMessageDialog(null," Fourth winner is"+ylabel.getText());
            }
        }

    }
    public void Rename(String b,String g,String y,String r)
    {
        glabel.setText(g);
        blabel.setText(b);
        rlabel.setText(r);
        ylabel.setText(y);
    }
    private void bt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt4ActionPerformed
        // TODO add your handling code here:
        int pra;
        int i=27,j=0;
        if(bpo[3]==0 && bmoves[3]==0)
        {   
            bt4.setSize(40, 40);
            p[i].add(bt4);
            p[i].repaint();
            p[i].revalidate();
            bpo[3]=27;
            //jTextField1.setText(String.valueOf(bpo[3]));
            bmoves[3]=1;
            turn[2]=0;
            rd.setEnabled(true);
        }
        else if(bpo[3]!=0 || bmoves[3]!=0)
        {
            pra=bpo[3]+bn;
            //jTextField1.setText("hi...pranali");
            ruhi=bmoves[3];
            bmoves[3]=bmoves[3]+bn;
            //jTextField1.setText(String.valueOf(rmoves[0]));
            if(bf[3]==1)
            {
                //jTextField1.setText("hi...Kiran");
                if(bn<=br[3])
                { 
                    re=0;
                }
            }
            for(i=bpo[3];i<=pra;i++)
            {  
                if(ruhi<=51)
                {
                    if(i==51)
                    {
                        pra=pra-i;
                        pra=pra-1;
                        bn=pra;
                        bpo[3]=0;
                    }
                    bt4.setSize(40, 40);
                    if(i==pra)
                    {
                    this.dieb(i);
                    }
                    if(i==-1)
                    {
                        i=0;
                    }
                    p[i].add(bt4);
                    p[i].repaint();
                    p[i].revalidate();
                    //jTextField1.setText(String.valueOf(i));
                    if(i==25)
                    {
                        re=bmoves[3]-51;
                        this.dieb(re);
                        //jTextField1.setText(String.valueOf(bmoves[3]));
                        bipo[3]=0;
                    }
                    if(i==51)
                    {
                        i=-1;
                    }
                }
                else if(bmoves[3]>=51)
                {
                    //jTextField1.setText("hi...aman");
                    for(int in=bipo[3];in<re;in++)
                    {
                        int rem=bipo[3]+bn;
                        if(bf[3]==0 && re!=0)
                        {
                            //jTextField1.setText("hi...ruhi");
                            bt4.setSize(40, 40);
                            b[in].add(bt4);
                            b[in].repaint();
                            b[in].revalidate();
                            if(in==re-1)
                            {
                                bf[3]=1;
                                bipo[3]=bipo[3]+re;
                                //jTextField1.setText(String.valueOf(ripo[0]));
                                br[3]=6-bipo[3];
                            }
                        }
                    }
                }
                 ruhi++;   //jTextField1.setText(String.valueOf(flag));
            }
            if(bf[3]==1 && re==0)
            {
               
                //jTextField1.setText("hi ruhaan");
                           if(bn<=pranali)
                            {
                                //jTextField1.setText("hi akhil");
                                //jTextField1.setText(String.valueOf(ripo[0]));
                                int  pran=bipo[3];
                                b[bipo[3]-1].remove(bt4);
                                b[bipo[3]-1].repaint();
                                b[bipo[3]-1].revalidate();
                                int panu=0;
                                //jTextField1.setText(String.valueOf(pran));
                                while(panu<bn)
                                {
                                    //jTextField1.setText("juhi");
                                    bt4.setSize(40, 40);
                                    b[pran+panu].add(bt4);
                                    b[pran+panu].repaint();
                                    b[pran+panu].revalidate(); 
                                    panu++;
                                }
                                bipo[3]=bn+bipo[3];
                                br[3]=6-bipo[3];
                            }
                        }
            //}
                bpo[3]=bpo[3]+bn;        
                turn[2]=0;
            rd.setEnabled(true);
        }
        if(bn==6)
        {
            this.secondchanceb();
        }
        this.makeactiveb();
        bn=0;
        this.winb();
    }//GEN-LAST:event_bt4ActionPerformed

    private void rdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdActionPerformed
        // TODO add your handling code here:
        ImageIcon Micon=new ImageIcon("E:\\r.jpg");
        ImageIcon ficon=new ImageIcon("E:\\1.jpg");
        ImageIcon sicon=new ImageIcon("E:\\2.jpg");
        ImageIcon ticon=new ImageIcon("E:\\3.jpg");
        ImageIcon foicon=new ImageIcon("E:\\4.jpg");
        ImageIcon fiicon=new ImageIcon("E:\\5.jpg");
        ImageIcon siicon=new ImageIcon("E:\\6.jpg");
        int r=(int)(Math.random()*6)+1;
        //jTextField1.setText(String.valueOf(r));
         rn=r;
        switch(r)
        {
            case 1:
                rd.setIcon(ficon);
                break;
            case 2:
                rd.setIcon(sicon);
                break;
            case 3:
                rd.setIcon(ticon);
                break;
            case 4:
                rd.setIcon(foicon);
                break;
            case 5:
                rd.setIcon(fiicon);
                break;
            case 6:
                rd.setIcon(siicon);
                break;
            default :
                rd.setIcon(Micon);
        }
        this.makeactiver();
        int j;
        for(int i=1;i<=4;i++)
        {
          j=i-1;
            if(rpo[j]==0)
            {
                if(r==6)
                {
                    if(i==1)
                        rt1.setEnabled(true);
                        turn[3]=1;
                    if(i==2)
                            rt2.setEnabled(true);
                            turn[3]=1;
                    if(i==3)
                            rt3.setEnabled(true);
                            turn[3]=1;
                    if(i==4)
                            rt4.setEnabled(true);
                    turn[3]=1;
                }
            }
            else
            {
                   if(i==1)
                        rt1.setEnabled(true);
                        turn[3]=1;
                   if(i==2)
                       rt2.setEnabled(true);
                   turn[3]=1;
                   if(i==3)
                       rt3.setEnabled(true);
                   turn[3]=1;
                   if(i==4)
                       rt4.setEnabled(true);
                   turn[3]=1;
            }
        }
        if(turn[3]==0)
        {
            bd.setEnabled(false);
            yd.setEnabled(false);
            gd.setEnabled(true);
            rd.setEnabled(false);
        }
        else
        {
            bd.setEnabled(false);
            yd.setEnabled(false);
            gd.setEnabled(false);
            rd.setEnabled(false);
        }
        //rd.setEnabled(true);
        for(int i=0;i<4;i++)
        {
            if(rpo[i]==0 && rmoves[i]!=0)
            {
                if(i==0)
                    rt1.setEnabled(true);
                if(i==1)
                    rt2.setEnabled(true);
                if(i==2)
                    rt3.setEnabled(true);
                if(i==3)
                    rt4.setEnabled(true);
            }
        }
        //rd.setEnabled(true);
    }//GEN-LAST:event_rdActionPerformed

    private void gdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gdActionPerformed
        // TODO add your handling code here:
        gt1.setEnabled(false);
        gt2.setEnabled(false);
        gt3.setEnabled(false);
        gt4.setEnabled(false);
        ImageIcon Micon=new ImageIcon("E:\\r.jpg");
        ImageIcon ficon=new ImageIcon("E:\\1.jpg");
        ImageIcon sicon=new ImageIcon("E:\\2.jpg");
        ImageIcon ticon=new ImageIcon("E:\\3.jpg");
        ImageIcon foicon=new ImageIcon("E:\\4.jpg");
        ImageIcon fiicon=new ImageIcon("E:\\5.jpg");
        ImageIcon siicon=new ImageIcon("E:\\6.jpg");
        int r=(int)(Math.random()*6)+1;
        /*for(int i=0;i<4;i++)
        {
            bmoves[i]=1;
        }*/
        //jTextField1.setText(String.valueOf(r));
         gn=r;
        switch(r)
        {
            case 1:
                gd.setIcon(ficon);
                break;
            case 2:
                gd.setIcon(sicon);
                break;
            case 3:
                gd.setIcon(ticon);
                break;
            case 4:
                gd.setIcon(foicon);
                break;
            case 5:
                gd.setIcon(fiicon);
                break;
            case 6:
                gd.setIcon(siicon);
                break;
            default :
                gd.setIcon(Micon);
        }
        this.makeactiver();
        int j;
        for(int i=1;i<=4;i++)
        {
          j=i-1;
            if(gpo[j]==0)
            {
                if(r==6)
                {
                    if(i==1)
                        gt1.setEnabled(true);
                        turn[0]=1;
                        if(i==2)
                            gt2.setEnabled(true);
                        turn[0]=1;
                        if(i==3)
                            gt3.setEnabled(true);
                            turn[0]=1;
                        if(i==4)
                            gt4.setEnabled(true);
                        turn[0]=1;
                }
            }
            else
            {
                   if(i==1)
                        gt1.setEnabled(true);
                        turn[0]=1;
                   if(i==2)
                       gt2.setEnabled(true);
                       turn[0]=1;
                   if(i==3)
                       gt3.setEnabled(true);
                       turn[0]=1;
                   if(i==4)
                       gt4.setEnabled(true);
                       turn[0]=1;
            }
        }
        if(turn[0]==0)
        {
            bd.setEnabled(false);
            yd.setEnabled(true);
            gd.setEnabled(false);
            bd.setEnabled(false);
        }
        else
        {
            bd.setEnabled(false);
            yd.setEnabled(false);
            gd.setEnabled(false);
            bd.setEnabled(false);
        }
        for(int i=0;i<4;i++)
        {
            if(gpo[i]==0 && gmoves[i]!=0)
            {
                if(i==0)
                    gt1.setEnabled(true);
                if(i==1)
                    gt2.setEnabled(true);
                if(i==2)
                    gt3.setEnabled(true);
                if(i==3)
                    gt4.setEnabled(true);
            }
        }
    }//GEN-LAST:event_gdActionPerformed

    private void ydActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ydActionPerformed
        // TODO add your handling code here:
          ImageIcon Micon=new ImageIcon("E:\\r.jpg");
        ImageIcon ficon=new ImageIcon("E:\\1.jpg");
        ImageIcon sicon=new ImageIcon("E:\\2.jpg");
        ImageIcon ticon=new ImageIcon("E:\\3.jpg");
        ImageIcon foicon=new ImageIcon("E:\\4.jpg");
        ImageIcon fiicon=new ImageIcon("E:\\5.jpg");
        ImageIcon siicon=new ImageIcon("E:\\6.jpg");
        int r=(int)(Math.random()*6)+1;
        //jTextField1.setText(String.valueOf(r));
        yn=r;
        switch(r)
        {
            case 1:
                yd.setIcon(ficon);
                break;
            case 2:
                yd.setIcon(sicon);
                break;
            case 3:
                yd.setIcon(ticon);
                break;
            case 4:
                yd.setIcon(foicon);
                break;
            case 5:
                yd.setIcon(fiicon);
                break;
            case 6:
                yd.setIcon(siicon);
                break;
            default :
                yd.setIcon(Micon);
        }
        this.makeactivey();
        int j;
        for(int i=1;i<=4;i++)
        {
          j=i-1;
            if(ypo[j]==0)
            {
                if(r==6)
                {
                    if(i==1)
                        yt1.setEnabled(true);
                        turn[1]=1;
                     if(i==2)
                            yt2.setEnabled(true);
                            turn[1]=1;
                    if(i==3)
                            yt3.setEnabled(true);
                            turn[1]=1;
                    if(i==4)
                            yt4.setEnabled(true);
                            turn[1]=1;
                }
            }
            else
            {
                   if(i==1)
                        yt1.setEnabled(true);
                        turn[1]=1;
                   if(i==2)
                       yt2.setEnabled(true);
                       turn[1]=1;
                   if(i==3)
                       yt3.setEnabled(true);
                       turn[1]=1;
                   if(i==4)
                       yt4.setEnabled(true);
                       turn[1]=1;
            }
        }
        if(turn[1]==0)
        {
            bd.setEnabled(true);
            yd.setEnabled(false);
            gd.setEnabled(false);
            rd.setEnabled(false);
        }
        else
        {
            bd.setEnabled(false);
            yd.setEnabled(false);
            gd.setEnabled(false);
            rd.setEnabled(false);
        }
        for(int i=0;i<4;i++)
        {
            if(ypo[i]==0 && ymoves[i]!=0)
            {
                if(i==0)
                    yt1.setEnabled(true);
                if(i==1)
                    yt2.setEnabled(true);
                if(i==2)
                    yt3.setEnabled(true);
                if(i==3)
                    yt4.setEnabled(true);
            }
        }
        //yd.setEnabled(true);
    }//GEN-LAST:event_ydActionPerformed

    private void bdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdActionPerformed
        // TODO add your handling code here:
        bt1.setEnabled(false);
        bt2.setEnabled(false);
        bt3.setEnabled(false);
        bt4.setEnabled(false);
        ImageIcon Micon=new ImageIcon("E:\\r.jpg");
        ImageIcon ficon=new ImageIcon("E:\\1.jpg");
        ImageIcon sicon=new ImageIcon("E:\\2.jpg");
        ImageIcon ticon=new ImageIcon("E:\\3.jpg");
        ImageIcon foicon=new ImageIcon("E:\\4.jpg");
        ImageIcon fiicon=new ImageIcon("E:\\5.jpg");
        ImageIcon siicon=new ImageIcon("E:\\6.jpg");
        int r=(int)(Math.random()*6)+1;
        //jTextField1.setText(String.valueOf(r));
         bn=r;
        switch(r)
        {
            case 1:
                bd.setIcon(ficon);
                break;
            case 2:
                bd.setIcon(sicon);
                break;
            case 3:
                bd.setIcon(ticon);
                break;
            case 4:
                bd.setIcon(foicon);
                break;
            case 5:
                bd.setIcon(fiicon);
                break;
            case 6:
                bd.setIcon(siicon);
                break;
            default :
                bd.setIcon(Micon);
        }
        this.makeactivey();
        int j;
        for(int i=1;i<=4;i++)
        {
          j=i-1;
            if(bpo[j]==0)
            {
                if(r==6)
                {
                    if(i==1)
                        bt1.setEnabled(true);
                        turn[2]=1;
                        if(i==2)
                            bt2.setEnabled(true);
                            turn[2]=1;
                        if(i==3)
                            bt3.setEnabled(true);
                            turn[2]=1;
                        if(i==4)
                            bt4.setEnabled(true);
                            turn[2]=1;
                }
            }
            else
            {
                   if(i==1)
                        bt1.setEnabled(true);
                        turn[2]=1;
                   if(i==2)
                       bt2.setEnabled(true);
                       turn[2]=1;
                   if(i==3)
                       bt3.setEnabled(true);
                       turn[2]=1;
                   if(i==4)
                       bt4.setEnabled(true);
                       turn[2]=1;
            }
        }
        if(turn[2]==0)
        {
        bd.setEnabled(false);
        yd.setEnabled(false);
        gd.setEnabled(false);
        rd.setEnabled(true);
        }
        else
        {
            bd.setEnabled(false);
        yd.setEnabled(false);
        gd.setEnabled(false);
        rd.setEnabled(false);
        }
        for(int i=0;i<4;i++)
        {
            if(bpo[i]==0 && bmoves[i]!=0)
            {
                if(i==0)
                    bt1.setEnabled(true);
                if(i==1)
                    bt2.setEnabled(true);
                if(i==2)
                    bt3.setEnabled(true);
                if(i==3)
                    bt4.setEnabled(true);
            }
        }
        //bd.setEnabled(true);
    }//GEN-LAST:event_bdActionPerformed

    private void MENU1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MENU1ActionPerformed
        // TODO add your handling code here:

        if(JOptionPane.showConfirmDialog(null,"Are you sure you want to exit","LUDO",JOptionPane.YES_NO_OPTION ) == JOptionPane.YES_NO_OPTION)
        {
            this.dispose();
            ludo_menu m= new ludo_menu();
            m.setVisible(true);

        }
        // TODO add your handling code here:
    }//GEN-LAST:event_MENU1ActionPerformed
    public void makeactiveb()
    {
        for(int i=0;i<4;i++)
        {
            if(bpo[i]==0)
            {
                if(i==0)
                    bt1.setEnabled(false);
                if(i==1)
                    bt2.setEnabled(false);
                if(i==2)
                    bt3.setEnabled(false);
                if(i==3)
                    bt4.setEnabled(false);
            }
        }
    }
     public void makeactiveg()
    {
        for(int i=0;i<4;i++)
        {
            if(gpo[i]==0)
            {
                if(i==0)
                    gt1.setEnabled(false);
                if(i==1)
                    gt2.setEnabled(false);
                if(i==2)
                    gt3.setEnabled(false);
                if(i==3)
                    gt4.setEnabled(false);
            }
        }
    }
      public void makeactiver()
    {
        for(int i=0;i<4;i++)
        {
            if(rpo[i]==0)
            {
                if(i==0)
                    rt1.setEnabled(false);
                if(i==1)
                    rt2.setEnabled(false);
                if(i==2)
                    rt3.setEnabled(false);
                if(i==3)
                    rt4.setEnabled(false);
            }
        }
    }
     public void makeactivey()
    {
        for(int i=0;i<4;i++)
        {
            if(ypo[i]==0)
            {
                if(i==0)
                    yt1.setEnabled(false);
                if(i==1)
                    yt2.setEnabled(false);
                if(i==2)
                    yt3.setEnabled(false);
                if(i==3)
                    yt4.setEnabled(false);
            }
        }
    }
     public void secondchanceg()
     {
            gd.setEnabled(true);
            bd.setEnabled(false);
            rd.setEnabled(false);
            yd.setEnabled(false);
     }
     public void secondchancey()
     {
            gd.setEnabled(false);
            bd.setEnabled(false);
            rd.setEnabled(false);
            yd.setEnabled(true);
     }
     public void secondchanceb()
     {
            gd.setEnabled(false);
            bd.setEnabled(true);
            rd.setEnabled(false);
            yd.setEnabled(false);
     }
     public void secondchancer()
     {
            gd.setEnabled(false);
            bd.setEnabled(false);
            rd.setEnabled(true);
            yd.setEnabled(false);
     }
     public void dieg(int d)
     {
          for(int i=0;i<p[d].getComponentCount();i++)
                              {
                                Component c=p[d].getComponent(i);
                                if(c==bt1)
                                {
                                    p[d].remove(c);
                                    bm1.setSize(60,60);
                                    bm1.repaint();
                                     bm1.add(c);
                                     bm1.repaint();
                                     bm1.revalidate();
                                     bpo[0]=0;
                                     bmoves[0]=0;
                                }
                                if(c==bt2)
                                {
                                    p[d].remove(c);
                                    bm2.setSize(60,60);
                                    bm2.repaint();
                                      bm2.add(c);
                                        bm2.repaint();
                                     bm2.revalidate();
                                     bpo[1]=0;
                                     bmoves[1]=0;
                                }
                                if(c==bt3)
                                {
                                    p[d].remove(c);
                                    bm3.setSize(60,60);
                                    bm3.repaint();
                                    bm3.add(c);
                                    bm3.repaint();
                                    bm3.revalidate();
                                     bpo[2]=0;
                                     bmoves[2]=0;
                                }
                                if(c==bt4)
                                {
                                    p[d].remove(c);
                                    bm4.setSize(60,60);
                                    bm4.repaint();
                                    bm4.add(c);
                                    bm4.repaint();
                                    bm4.revalidate();
                                     bpo[3]=0;
                                     bmoves[3]=0;
                                }
                                if(c==rt1)
                                {
                                    p[d].remove(c);
                                    rm1.setSize(60,60);
                                    rm1.repaint();
                                      rm1.add(c);
                                        rm1.repaint();
                                     rm1.revalidate();
                                     rpo[0]=0;
                                     rmoves[0]=0;
                                }
                                if(c==rt2)
                                {
                                    p[d].remove(c);
                                    rm2.setSize(60,60);
                                    rm2.repaint();
                                    rm2.add(c);
                                        rm2.repaint();
                                     rm2.revalidate();
                                     rpo[1]=0;
                                     rmoves[1]=0;
                                }
                                if(c==rt3)
                                {
                                    p[d].remove(c);
                                    rm3.setSize(50, 50);
                                      rm3.add(c);
                                        rm3.repaint();
                                     rm3.revalidate();
                                     rpo[2]=0;
                                     rmoves[2]=0;
                                }
                                if(c==rt4)
                                {
                                    p[d].remove(c);
                                    rm4.setSize(50, 50);
                                      rm4.add(c);
                                        rm4.repaint();
                                     rm4.revalidate();
                                     rpo[3]=0;
                                     rmoves[3]=0;
                                }
                                if(c==yt1)
                                {
                                    p[d].remove(c);
                                    ym1.setSize(50, 50);
                                      ym1.add(c);
                                        ym1.repaint();
                                     ym1.revalidate();
                                     ypo[0]=0;
                                     ymoves[0]=0;
                                }
                                if(c==yt2)
                                {
                                    p[d].remove(c);
                                    ym2.setSize(50, 50);
                                    ym2.repaint();
                                      ym2.add(c);
                                        ym2.repaint();
                                     ym2.revalidate();
                                     ypo[1]=0;
                                     ymoves[1]=0;
                                }
                                if(c==yt3)
                                {
                                    p[d].remove(c);
                                    ym3.setSize(50, 50);
                                    ym3.repaint();
                                      ym3.add(c);
                                        ym3.repaint();
                                     ym3.revalidate();
                                     ypo[2]=0;
                                     ymoves[2]=0;
                                }
                                if(c==yt4)
                                {
                                    p[d].remove(c);
                                    ym4.setSize(50, 50);
                                    ym4.repaint();
                                      ym4.add(c);
                                        ym4.repaint();
                                     ym4.revalidate();
                                     ypo[3]=0;
                                     ymoves[3]=0;
                                }
                                p[d].repaint();
                                p[d].revalidate();
                                this.secondchanceg();
                              }
     }
     public void dieb(int d)
     {
          for(int i=0;i<p[d].getComponentCount();i++)
                              {
                                Component c=p[d].getComponent(i);
                                if(c==gt1)
                                {
                                    p[d].remove(c);
                                    gm1.setSize(50, 50);
                                    gm1.repaint();
                                      gm1.add(c);
                                        gm1.repaint();
                                     gm1.revalidate();
                                     gpo[0]=0;
                                     gmoves[0]=0;
                                }
                                if(c==gt2)
                                {
                                    p[d].remove(c);
                                    gm2.setSize(50, 50);
                                    gm2.repaint();
                                      gm2.add(c);
                                        gm2.repaint();
                                     gm2.revalidate();
                                     gpo[1]=0;
                                     gmoves[1]=0;
                                }
                                if(c==gt3)
                                {
                                    p[d].remove(c);
                                    gm3.setSize(50, 50);
                                    gm3.repaint();
                                      gm3.add(c);
                                        gm3.repaint();
                                     gm3.revalidate();
                                     gpo[2]=0;
                                     gmoves[2]=0;

                                }
                                if(c==gt4)
                                {
                                    p[d].remove(c);
                                    gm4.setSize(50, 50);
                                    gm4.repaint();
                                    gm4.add(c);
                                        gm4.repaint();
                                     gm4.revalidate();
                                     gpo[3]=0;
                                     gmoves[3]=0;

                                }
                                if(c==rt1)
                                {
                                    p[d].remove(c);
                                    rm1.setSize(50, 50);
                                    rm1.repaint();
                                      rm1.add(c);
                                        rm1.repaint();
                                     rm1.revalidate();
                                     rpo[0]=0;
                                     rmoves[0]=0;

                                }
                                if(c==rt2)
                                {
                                    p[d].remove(c);
                                    rm2.setSize(50, 50);
                                    rm2.repaint();
                                    rm2.add(c);
                                        rm2.repaint();
                                     rm2.revalidate();
                                     rpo[1]=0;
                                     rmoves[1]=0;
                                }
                                if(c==rt3)
                                {
                                    p[d].remove(c);
                                    rm3.setSize(50, 50);
                                    rm3.repaint();
                                      rm3.add(c);
                                        rm3.repaint();
                                     rm3.revalidate();
                                     rpo[2]=0;
                                     rmoves[2]=0;
                                }
                                if(c==rt4)
                                {
                                    p[d].remove(c);
                                    rm4.setSize(50, 50);
                                    rm4.repaint();
                                      rm4.add(c);
                                        rm4.repaint();
                                     rm4.revalidate();
                                     rpo[3]=0;
                                     rmoves[3]=0;
                                }
                                if(c==yt1)
                                {
                                    p[d].remove(c);
                                    ym1.setSize(50, 50);
                                    ym1.repaint();
                                      ym1.add(c);
                                        ym1.repaint();
                                     ym1.revalidate();
                                     ypo[0]=0;
                                     ymoves[0]=0;
                                }
                                if(c==yt2)
                                {
                                    p[d].remove(c);
                                    ym2.setSize(50, 50);
                                    ym2.repaint();
                                      ym2.add(c);
                                        ym2.repaint();
                                     ym2.revalidate();
                                     ypo[1]=0;
                                     ymoves[1]=0;
                                }
                                if(c==yt3)
                                {
                                    p[d].remove(c);
                                    ym3.setSize(50, 50);
                                    ym3.repaint();
                                      ym3.add(c);
                                        ym3.repaint();
                                     ym3.revalidate();
                                     ypo[2]=0;
                                     ymoves[2]=0;
                                }
                                if(c==yt4)
                                {
                                    p[d].remove(c);
                                    ym4.setSize(50, 50);
                                    ym4.repaint();
                                      ym4.add(c);
                                        ym4.repaint();
                                     ym4.revalidate();
                                     ypo[3]=0;
                                     ymoves[3]=0;
                                }
                                p[d].repaint();
                                p[d].revalidate();
                                this.secondchanceb();
                              }
     }
     public void diey(int d)
     {
          for(int i=0;i<p[d].getComponentCount();i++)
                              {
                                Component c=p[d].getComponent(i);
                                if(c==bt1)
                                {
                                    p[d].remove(c);
                                      bm1.add(c);
                                        bm1.repaint();
                                     bm1.revalidate();
                                     bpo[0]=0;
                                     bmoves[0]=0;
                                }
                                if(c==bt2)
                                {
                                    p[d].remove(c);
                                      bm2.add(c);
                                        bm2.repaint();
                                     bm2.revalidate();
                                     bpo[1]=0;
                                     bmoves[1]=0;
                                }
                                if(c==bt3)
                                {
                                    p[d].remove(c);
                                      bm3.add(c);
                                        bm3.repaint();
                                     bm3.revalidate();
                                     bpo[2]=0;
                                     bmoves[2]=0;
                                }
                                if(c==bt4)
                                {
                                    p[d].remove(c);
                                     bm4.add(c);
                                     bm4.repaint();
                                     bm4.revalidate();
                                     bpo[3]=0;
                                     bmoves[3]=0;
                                }
                                if(c==rt1)
                                {
                                    p[d].remove(c);
                                      rm2.add(c);
                                        rm2.repaint();
                                     rm2.revalidate();
                                     rpo[0]=0;
                                     rmoves[0]=0;
                                }
                                if(c==rt2)
                                {
                                    p[d].remove(c);
                                      rm2.add(c);
                                        rm2.repaint();
                                     rm2.revalidate();
                                     rpo[1]=0;
                                     rmoves[1]=0;
                                }
                                if(c==rt3)
                                {
                                    p[d].remove(c);
                                      rm3.add(c);
                                        rm3.repaint();
                                     rm3.revalidate();
                                     rpo[2]=0;
                                     rmoves[2]=0;
                                }
                                if(c==rt4)
                                {
                                    p[d].remove(c);
                                      rm4.add(c);
                                        rm4.repaint();
                                     rm4.revalidate();
                                     rpo[3]=0;
                                     rmoves[3]=0;
                                }
                                if(c==gt1)
                                {
                                    p[d].remove(c);
                                      gm1.add(c);
                                     gm1.repaint();
                                     gm1.revalidate();
                                     gpo[0]=0;
                                     gmoves[0]=0;
                                }
                                if(c==gt2)
                                {
                                    p[d].remove(c);
                                    
                                     gm2.add(c);
                                     gm2.repaint();
                                     gm2.revalidate();
                                     gpo[1]=0;
                                     gmoves[1]=0;
                                }
                                if(c==gt3)
                                {
                                    p[d].remove(c);
                                    gm3.add(c);
                                    gm3.repaint();
                                     gm3.revalidate();
                                     gpo[2]=0;
                                     gmoves[2]=0;
                                }
                                if(c==gt4)
                                {
                                    p[d].remove(c);
                                      gm4.add(c);
                                        gm4.repaint();
                                     gm4.revalidate();
                                     gpo[3]=0;
                                     gmoves[3]=0;
                                }
                                p[d].repaint();
                                p[d].revalidate();
                                this.secondchancey();
                              }
          
     }
     public void dier(int d)
     {
          for(int i=0;i<p[d].getComponentCount();i++)
                              {
                                Component c=p[d].getComponent(i);
                                if(c==bt1)
                                {
                                    p[d].remove(c);
                                      bm1.add(c);
                                        bm1.repaint();
                                     bm1.revalidate();
                                     bpo[0]=0;
                                     bmoves[0]=0;
                                }
                                if(c==bt2)
                                {
                                    p[d].remove(c);
                                      bm2.add(c);
                                        bm2.repaint();
                                     bm2.revalidate();
                                     bpo[1]=0;
                                     bmoves[1]=0;
                                }
                                if(c==bt3)
                                {
                                    p[d].remove(c);
                                      bm3.add(c);
                                        bm3.repaint();
                                     bm3.revalidate();
                                     bpo[2]=0;
                                     bmoves[2]=0;
                                }
                                if(c==bt4)
                                {
                                    p[d].remove(c);
                                      bm4.add(c);
                                        bm4.repaint();
                                     bm4.revalidate();
                                     bpo[3]=0;
                                     bmoves[3]=0;
                                }
                                if(c==gt1)
                                {
                                    p[d].remove(c);
                                      gm1.add(c);
                                        gm1.repaint();
                                     gm1.revalidate();
                                     gpo[0]=0;
                                     gmoves[0]=0;
                                }
                                if(c==rt2)
                                {
                                    p[d].remove(c);
                                      gm2.add(c);
                                        gm2.repaint();
                                     gm2.revalidate();
                                     gpo[1]=0;
                                     gmoves[1]=0;
                                }
                                if(c==gt3)
                                {
                                    p[d].remove(c);
                                      gm3.add(c);
                                        gm3.repaint();
                                     gm3.revalidate();
                                     gpo[2]=0;
                                     gmoves[2]=0;
                                }
                                if(c==gt4)
                                {
                                    p[d].remove(c);
                                      gm4.add(c);
                                        gm4.repaint();
                                     gm4.revalidate();
                                     gpo[3]=0;
                                     gmoves[3]=0;
                                }
                                if(c==yt1)
                                {
                                    p[d].remove(c);
                                      ym1.add(c);
                                        ym1.repaint();
                                     ym1.revalidate();
                                     ypo[0]=0;
                                     ymoves[0]=0;
                                }
                                if(c==yt2)
                                {
                                    p[d].remove(c);
                                      ym2.add(c);
                                        ym2.repaint();
                                     ym2.revalidate();
                                     ypo[1]=0;
                                     ymoves[1]=0;
                                }
                                if(c==yt3)
                                {
                                    p[d].remove(c);
                                      ym3.add(c);
                                        ym3.repaint();
                                     ym3.revalidate();
                                     ypo[2]=0;
                                     ymoves[2]=0;
                                }
                                if(c==yt4)
                                {
                                    p[d].remove(c);
                                      ym4.add(c);
                                        ym4.repaint();
                                     ym4.revalidate();
                                     ypo[3]=0;
                                     ymoves[3]=0;
                                }
                                p[d].repaint();
                                p[d].revalidate();
                                this.secondchancer();
                              }
     }
             public static void main(String args[]) 
    {
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
            java.util.logging.Logger.getLogger(easy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(easy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(easy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(easy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        easy e=new easy();
//        e.visibility();
//new easy().visibility();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
                new easy().setVisible(true);
                //new easy().visibility();
            }
        });
    }
    //private javax.swing.JButton bd,rd,gd,yd;
    //private javax.swing.JButton yt[]=new javax.swing.JButton[4];
    //private javax.swing.JButton rt[]=new javax.swing.JButton[4];
    //private javax.swing.JButton bt[]=new javax.swing.JButton[4];
    //private javax.swing.JButton gt[]=new javax.swing.JButton[4];
    private javax.swing.JPanel b[]=new javax.swing.JPanel[6];
    private javax.swing.JPanel r[]=new javax.swing.JPanel[6];
    private javax.swing.JPanel g[]=new javax.swing.JPanel[6];
    private javax.swing.JPanel y[]=new javax.swing.JPanel[6];
    private javax.swing.JPanel c,bp,rp,gp,yp;
    //private javax.swing.JButton bd;    
     private javax.swing.JPanel p[]=new javax.swing.JPanel[53];
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MENU1;
    private javax.swing.JButton bd;
    private javax.swing.JLabel blabel;
    private javax.swing.JPanel bm1;
    private javax.swing.JPanel bm2;
    private javax.swing.JPanel bm3;
    private javax.swing.JPanel bm4;
    private javax.swing.JButton bt1;
    private javax.swing.JButton bt2;
    private javax.swing.JButton bt3;
    private javax.swing.JButton bt4;
    private javax.swing.JButton gd;
    private javax.swing.JLabel glabel;
    private javax.swing.JPanel gm1;
    private javax.swing.JPanel gm2;
    private javax.swing.JPanel gm3;
    private javax.swing.JPanel gm4;
    private javax.swing.JButton gt1;
    private javax.swing.JButton gt2;
    private javax.swing.JButton gt3;
    private javax.swing.JButton gt4;
    private javax.swing.JButton rd;
    private javax.swing.JLabel rlabel;
    private javax.swing.JPanel rm1;
    private javax.swing.JPanel rm2;
    private javax.swing.JPanel rm3;
    private javax.swing.JPanel rm4;
    private javax.swing.JButton rt1;
    private javax.swing.JButton rt2;
    private javax.swing.JButton rt3;
    private javax.swing.JButton rt4;
    private javax.swing.JButton yd;
    private javax.swing.JLabel ylabel;
    private javax.swing.JPanel ym1;
    private javax.swing.JPanel ym2;
    private javax.swing.JPanel ym3;
    private javax.swing.JPanel ym4;
    private javax.swing.JButton yt1;
    private javax.swing.JButton yt2;
    private javax.swing.JButton yt3;
    private javax.swing.JButton yt4;
    // End of variables declaration//GEN-END:variables
}
