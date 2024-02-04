/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
/**
 *
 * @author Lenovo
 */
public class TicTacToe extends javax.swing.JFrame {
    private String startGame ="X";
    static int i=1;
    public String X,O;
    private int xcount=0;
    private int ocount=0;
    private int gcount=0;
        public int flag1=0;
        public int flag2=0;
        public int flag3=0;
        public int flag4=0;
        public int flag5=0; 
        public int flag6=0;
        public int flag7=0;
        public int flag8=0;
        public int flag9=0;
       
    /**
     * Creates new form TicTacToe
     */
    public TicTacToe() {
        initComponents();

        setSize(400,300);
        setLocationRelativeTo(null);
    }
    public void winx()
    {         String o=oplayer.getText();
              String x=xplayer.getText();
   
     try
        {
            String url="jdbc:mysql://127.0.0.1:3306/proj";
            Connection con= DriverManager.getConnection(url,"root","system");
            String q="Insert into  ttt(first,second) values(?,?)";
            PreparedStatement ps=con.prepareStatement(q);
            //ps.setInt(1,i);
            //i++;
            ps.setString(1,x);
            ps.setString(2,o);
            ps.executeUpdate();
           // JOptionPane.showMessageDialog(null,"REGISTRATION SUCCESFULL");
        }
        catch(Exception e)
        {
        System.out.println(e);
        }
    }
    public void wino()
        {         String o=oplayer.getText();
         String x=xplayer.getText();
   
     try
        {
            String url="jdbc:mysql://127.0.0.1:3306/proj";
            Connection con= DriverManager.getConnection(url,"root","system");
            String q="Insert into  ttt values(?,?,?)";
            PreparedStatement ps=con.prepareStatement(q);
            ps.setInt(1,i);
            i++;
            ps.setString(2,o);
            ps.setString(3,x);
            ps.executeUpdate();
           // JOptionPane.showMessageDialog(null,"REGISTRATION SUCCESFULL");
        }
        catch(Exception e)
        {
        System.out.println(e);
        }
    }

    public void setvalue()
    {
             button1.setText(null);
             button2.setText(null);
             button3.setText(null);
             button4.setText(null);
             button5.setText(null);
             button6.setText(null);
             button7.setText(null);
             button8.setText(null);
             button9.setText(null);
                flag1=0;       
                flag2=0;
                flag3=0;
                flag4=0;
                flag5=0; 
                flag6=0;
                flag7=0;
                flag8=0;
                flag9=0;
                

             button1.setBackground(Color.LIGHT_GRAY);
             button2.setBackground(Color.LIGHT_GRAY);
             button3.setBackground(Color.LIGHT_GRAY);
             button4.setBackground(Color.LIGHT_GRAY);
             button5.setBackground(Color.LIGHT_GRAY);
             button6.setBackground(Color.LIGHT_GRAY);
             button7.setBackground(Color.LIGHT_GRAY);
             button8.setBackground(Color.LIGHT_GRAY);
             button9.setBackground(Color.LIGHT_GRAY);    }
     private void gameScore()
     {
         xscore.setText(String.valueOf(xcount));
         oscore.setText(String.valueOf(ocount));
     }
     private void Choose_a_player()
     {
        
         if(startGame.equalsIgnoreCase("x"))
         {
             startGame="O";
         }
         else
         {
             startGame="X";
         }
     }
     public void rename(String x,String o)
     {
         this.oplayer.setText(o);
         this.xplayer.setText(x);
     }
     private void win()
     {
         String o=oplayer.getText();
         String x=xplayer.getText();
         String b1=button1.getText();
         String b2=button2.getText();
         String b3=button3.getText();
         
         String b4=button4.getText();
         String b5=button5.getText();
         String b6=button6.getText();
         
         String b7=button7.getText();
         String b8=button8.getText();
         String b9=button9.getText();
         if(flag1==1 && flag2==1 && flag3==1 && flag4==1 && flag5==1 && flag6==1 && flag7==1 && flag8==1 && flag9==1)
         {
             JOptionPane.showMessageDialog(this,"Draw","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
             setvalue();
         }
         else if(b1==("X")&& b2==("X")&& b3==("X"))
         {
             button1.setBackground(Color.black);
             button2.setBackground(Color.black);
             button3.setBackground(Color.black);
             JOptionPane.showMessageDialog(this,"Player "+x+" WINS","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
             xcount++;
             gcount++;
             gameScore();     
		flag1=1;       
		flag2=1;
		flag3=1;
		flag4=1;
		flag5=1;		 
		flag6=1;
		flag7=1;	
		flag8=1;
		flag9=1;
                if(gcount==3)
                {
                    if(xcount>ocount)
                    {
                         JOptionPane.showMessageDialog(null,"Player "+x+" Wins the Match","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                         winx();
                         //JOptionPane.showMessageDialog(null,"Player X Wins the Match","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null,"RESET if you want to continue playing...Else EXIT");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"Player "+o+" Wins the Match","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                        wino();
                        JOptionPane.showMessageDialog(null,"RESET if you want to continue playing...Else EXIT");
                    }    
                }
                else
                {
                    setvalue();
                }
         }
         else if(b4==("X")&& b5==("X")&& b6==("X"))
         {
             button4.setBackground(Color.black);
             button5.setBackground(Color.black);
             button6.setBackground(Color.black);
             JOptionPane.showMessageDialog(this,"Player "+x+" WINS","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
             xcount++;
             gcount++;
             gameScore();    
             		flag1=1;       
		flag2=1;
		flag3=1;
		flag4=1;
		flag5=1;		 
		flag6=1;
		flag7=1;	
		flag8=1;
		flag9=1;                  
                if(gcount==3)
                {
                    if(xcount>ocount)
                    {
                         JOptionPane.showMessageDialog(null,"Player "+x+" Wins the Match","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                         winx();//JOptionPane.showMessageDialog(null,"Player X Wins the Match","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null,"RESET if you want to continue playing...Else EXIT");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"Player "+o+" Wins the Match","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
wino();                        //JOptionPane.showMessageDialog(null,"Player O Wins the Match","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null,"RESET if you want to continue playing...Else EXIT");
                    }    
                }
                else
                {
                    setvalue();
                }
                     
         }
         else if(b7==("X")&& b8==("X")&& b9==("X"))
         {
             button7.setBackground(Color.black);
             button8.setBackground(Color.black);
             button9.setBackground(Color.black);
            JOptionPane.showMessageDialog(this,"Player "+x+" WINS","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
             xcount++;
             gcount++;
             gameScore();     
                        		flag1=1;       
		flag2=1;
		flag3=1;
		flag4=1;
		flag5=1;		 
		flag6=1;
		flag7=1;	
		flag8=1;
		flag9=1; 
                if(gcount==3)
                {
                    if(xcount>ocount)
                    {
                         JOptionPane.showMessageDialog(null,"Player "+x+" Wins the Match","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                       winx();  //JOptionPane.showMessageDialog(null,"Player X Wins the Match","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null,"RESET if you want to continue playing...Else EXIT");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"Player "+o+" Wins the Match","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                        //JOptionPane.showMessageDialog(null,"Player O Wins the Match","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
wino();                        JOptionPane.showMessageDialog(null,"RESET if you want to continue playing...Else EXIT");
                    }    
                }
                else
                {
                    setvalue();
                }
         }
         else if(b1==("X")&& b4==("X")&& b7==("X"))
         {
             button1.setBackground(Color.black);
             button4.setBackground(Color.black);
             button7.setBackground(Color.black);
            JOptionPane.showMessageDialog(this,"Player "+x+" WINS","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
             xcount++;
             gcount++;
             gameScore();     
       		flag1=1;       
		flag2=1;
		flag3=1;
		flag4=1;
		flag5=1;		 
		flag6=1;
		flag7=1;	
		flag8=1;
		flag9=1;
                if(gcount==3)
                {
                    if(xcount>ocount)
                    {
                         JOptionPane.showMessageDialog(null,"Player "+x+" Wins the Match","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                       winx();  //JOptionPane.showMessageDialog(null,"Player X Wins the Match","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null,"RESET if you want to continue playing...Else EXIT");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"Player "+o+" Wins the Match","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
wino();                        //JOptionPane.showMessageDialog(null,"Player O Wins the Match","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null,"RESET if you want to continue playing...Else EXIT");
                    }    
                }
                else
                {
                    setvalue();
                }
         }
         else if(b2==("X")&& b5==("X")&& b8==("X"))
         {
             button2.setBackground(Color.black);
             button5.setBackground(Color.black);
             button8.setBackground(Color.black);
            JOptionPane.showMessageDialog(this,"Player "+x+" WINS","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
             xcount++;
             gcount++;
             gameScore();
      		flag1=1;       
		flag2=1;
		flag3=1;
		flag4=1;
		flag5=1;		 
		flag6=1;
		flag7=1;	
		flag8=1;
		flag9=1;
                if(gcount==3)
                {
                    if(xcount>ocount)
                    {
                      JOptionPane.showMessageDialog(null,"Player "+x+" Wins the Match","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                       winx(); //JOptionPane.showMessageDialog(null,"Player X Wins the Match","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null,"RESET if you want to continue playing...Else EXIT");
                    }
                    else
                    {
                       JOptionPane.showMessageDialog(null,"Player "+o+" Wins the Match","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
wino();                       //JOptionPane.showMessageDialog(null,"Player O Wins the Match","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null,"RESET if you want to continue playing...Else EXIT");
                    }    
                }
                else
                {
                    setvalue();
                }
         }
         else if(b3==("X")&& b6==("X")&& b9==("X"))
         {
             button3.setBackground(Color.black);
             button6.setBackground(Color.black);
             button9.setBackground(Color.black);
            JOptionPane.showMessageDialog(this,"Player "+x+" WINS","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
             xcount++;
             gcount++;
             gameScore();     
      
		flag1=1;       
		flag2=1;
		flag3=1;
		flag4=1;
		flag5=1;		 
		flag6=1;
		flag7=1;	
		flag8=1;
		flag9=1;
                if(gcount==3)
                {
                    if(xcount>ocount)
                    {
                        JOptionPane.showMessageDialog(null,"Player "+x+" Wins the Match","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                       winx(); //JOptionPane.showMessageDialog(null,"Player X Wins the Match","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null,"RESET if you want to continue playing...Else EXIT");
                    }
                    else
                    {
                       JOptionPane.showMessageDialog(null,"Player "+o+" Wins the Match","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
wino();                       //JOptionPane.showMessageDialog(null,"Player O Wins the Match","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null,"RESET if you want to continue playing...Else EXIT");
                    }    
                }
                else
                {
                    setvalue();
                }
     }
         else if(b1==("X")&& b5==("X")&& b9==("X"))
         {
             button1.setBackground(Color.black);
             button5.setBackground(Color.black);
             button9.setBackground(Color.black);
            JOptionPane.showMessageDialog(this,"Player "+x+" WINS","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
             xcount++;
             gcount++;
             gameScore();   
      		flag1=1;       
		flag2=1;
		flag3=1;
		flag4=1;
		flag5=1;		 
		flag6=1;
		flag7=1;	
		flag8=1;
		flag9=1;
                if(gcount==3)
                {
                    if(xcount>ocount)
                    {
                     JOptionPane.showMessageDialog(null,"Player "+x+" Wins the Match","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                    winx(); //JOptionPane.showMessageDialog(null,"Player X Wins the Match","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null,"RESET if you want to continue playing...Else EXIT");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"Player "+o+" Wins the Match","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
wino();                        //JOptionPane.showMessageDialog(null,"Player O Wins the Match","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null,"RESET if you want to continue playing...Else EXIT");
                    }    
                }
                else
                {
                    setvalue();
                }
         }
         else if(b3==("X")&& b5==("X")&& b7==("X"))
         {
             button3.setBackground(Color.black);
             button5.setBackground(Color.black);
             button7.setBackground(Color.black);
            JOptionPane.showMessageDialog(this,"Player "+x+" WINS","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
             xcount++;
             gcount++;
             gameScore();     
    		flag1=1;       
		flag2=1;
		flag3=1;
		flag4=1;
		flag5=1;		 
		flag6=1;
		flag7=1;	
		flag8=1;
		flag9=1;              
                if(gcount==3)
                {
                    if(xcount>ocount)
                    {
                         JOptionPane.showMessageDialog(null,"Player "+x+" Wins the Match","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                        winx(); //JOptionPane.showMessageDialog(null,"Player X Wins the Match","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null,"RESET if you want to continue playing...Else EXIT");
                    }
                    else
                    {
                       JOptionPane.showMessageDialog(null,"Player "+o+" Wins the Match","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
wino();                       //JOptionPane.showMessageDialog(null,"Player O Wins the Match","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null,"RESET if you want to continue playing...Else EXIT");
                    }    
                }
                else
                {
                    setvalue();
                }
         }
         else if(b1==("O")&& b2==("O")&& b3==("O"))
         {
             button1.setBackground(Color.red);
             button2.setBackground(Color.red);
             button3.setBackground(Color.red);

            JOptionPane.showMessageDialog(this,"Player "+o+" WINS","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
             ocount++;
             gcount++;
             gameScore();     
    		flag1=1;       
		flag2=1;
		flag3=1;
		flag4=1;
		flag5=1;		 
		flag6=1;
		flag7=1;	
		flag8=1;
		flag9=1;                     
                if(gcount==3)
                {
                    if(xcount>ocount)
                    {
                         JOptionPane.showMessageDialog(null,"Player "+x+" Wins the Match","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                        winx(); //JOptionPane.showMessageDialog(null,"Player X Wins the Match","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null,"RESET if you want to continue playing...Else EXIT");
                    }
                    else
                    {
                       JOptionPane.showMessageDialog(null,"Player "+o+" Wins the Match","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
wino();                       //JOptionPane.showMessageDialog(null,"Player O Wins the Match","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null,"RESET if you want to continue playing...Else EXIT");
                    }    
                }
                else
                {
                    setvalue();
                }
         }
         else if(b4==("O")&& b5==("O")&& b6==("O"))
         {
             button4.setBackground(Color.red);
             button5.setBackground(Color.red);
             button6.setBackground(Color.red);
            JOptionPane.showMessageDialog(this,"Player "+o+" WINS","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
             ocount++;
             gcount++;
             gameScore();     
    		flag1=1;       
		flag2=1;
		flag3=1;
		flag4=1;
		flag5=1;		 
		flag6=1;
		flag7=1;	
		flag8=1;
		flag9=1;
                if(gcount==3)
                {
                    if(xcount>ocount)
                    {
                         JOptionPane.showMessageDialog(null,"Player "+x+" Wins the Match","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                        winx(); //JOptionPane.showMessageDialog(null,"Player X Wins the Match","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null,"RESET if you want to continue playing...Else EXIT");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"Player "+o+" Wins the Match","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
wino();                        //JOptionPane.showMessageDialog(null,"Player O Wins the Match","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null,"RESET if you want to continue playing...Else EXIT");
                    }    
                }
                else
                {
                    setvalue();
                }
         }
         else if(b7==("O")&& b8==("O")&& b9==("O"))
         {
             button7.setBackground(Color.red);
             button8.setBackground(Color.red);
             button9.setBackground(Color.red);
            JOptionPane.showMessageDialog(this,"Player "+o+" WINS","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
             ocount++;
             gcount++;
             gameScore();     
              		flag1=1;       
		flag2=1;
		flag3=1;
		flag4=1;
		flag5=1;		 
		flag6=1;
		flag7=1;	
		flag8=1;
		flag9=1;
                if(gcount==3)
                {
                    if(xcount>ocount)
                    {
                         JOptionPane.showMessageDialog(null,"Player "+x+" Wins the Match","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                        winx(); //JOptionPane.showMessageDialog(null,"Player X Wins the Match","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null,"RESET if you want to continue playing...Else EXIT");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"Player "+o+" Wins the Match","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
wino();                        //JOptionPane.showMessageDialog(null,"Player O Wins the Match","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null,"RESET if you want to continue playing...Else EXIT");
                    }    
                }
                else
                {
                    setvalue();
                }
         }
         else if(b1==("O")&& b4==("O")&& b7==("O"))
         {
             button1.setBackground(Color.red);
             button4.setBackground(Color.red);
             button7.setBackground(Color.red);

            JOptionPane.showMessageDialog(this,"Player "+o+" WINS","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
             ocount++;
             gcount++;
             gameScore();
                flag1=1;       
		flag2=1;
		flag3=1;
		flag4=1;
		flag5=1;		 
		flag6=1;
		flag7=1;	
		flag8=1;
		flag9=1;
                if(gcount==3)
                {
                    if(xcount>ocount)
                    {
                         JOptionPane.showMessageDialog(null,"Player "+x+" Wins the Match","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                        winx(); //JOptionPane.showMessageDialog(null,"Player X Wins the Match","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null,"RESET if you want to continue playing...Else EXIT");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"Player "+o+" Wins the Match","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
wino();                        //JOptionPane.showMessageDialog(null,"Player O Wins the Match","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null,"RESET if you want to continue playing...Else EXIT");
                    }    
                }
                else
                {
                    setvalue();
                }
         }
         else if(b2==("O")&& b5==("O")&& b8==("O"))
         {
             button2.setBackground(Color.red);
             button5.setBackground(Color.red);
             button8.setBackground(Color.red);

            JOptionPane.showMessageDialog(this,"Player "+o+" WINS","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
             ocount++;
             gcount++;
             gameScore();     
       		flag1=1;       
		flag2=1;
		flag3=1;
		flag4=1;
		flag5=1;		 
		flag6=1;
		flag7=1;	
		flag8=1;
		flag9=1;
                if(gcount==3)
                {
                    if(xcount>ocount)
                    {
                         JOptionPane.showMessageDialog(null,"Player "+x+" Wins the Match","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                        winx(); //JOptionPane.showMessageDialog(null,"Player X Wins the Match","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null,"RESET if you want to continue playing...Else EXIT");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"Player "+o+" Wins the Match","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
wino();                        //JOptionPane.showMessageDialog(null,"Player O Wins the Match","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null,"RESET if you want to continue playing...Else EXIT");
                    }    
                }
                else
                {
                    setvalue();
                }
         }
         else if(b3==("O")&& b6==("O")&& b9==("O"))
         {
                          button3.setBackground(Color.red);
             button6.setBackground(Color.red);
             button9.setBackground(Color.red);
            JOptionPane.showMessageDialog(this,"Player "+o+" WINS","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
             ocount++;
             gcount++;
             gameScore();     
		flag1=1;       
		flag2=1;
		flag3=1;
		flag4=1;
		flag5=1;		 
		flag6=1;
		flag7=1;	
		flag8=1;
		flag9=1;     
                if(gcount==3)
                {
                    if(xcount>ocount)
                    {
                         JOptionPane.showMessageDialog(null,"Player "+x+" Wins the Match","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                         winx();
//JOptionPane.showMessageDialog(null,"Player X Wins the Match","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null,"RESET if you want to continue playing...Else EXIT");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"Player "+o+" Wins the Match","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                    wino();//    JOptionPane.showMessageDialog(null,"Player O Wins the Match","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null,"RESET if you want to continue playing...Else EXIT");
                    }    
                }
                else
                {
                    setvalue();
                }
         }
         else if(b1==("O")&& b5==("O")&& b9==("O"))
         {
             
             button1.setBackground(Color.red);
             button5.setBackground(Color.red);
             button9.setBackground(Color.red);

            JOptionPane.showMessageDialog(this,"Player "+o+" WINS","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
             ocount++;
             gcount++;
             gameScore();  
              
          		flag1=1;       
		flag2=1;
		flag3=1;
		flag4=1;
		flag5=1;		 
		flag6=1;
		flag7=1;	
		flag8=1;
		flag9=1;
                if(gcount==3)
                {
                    if(xcount>ocount)
                    {
                        JOptionPane.showMessageDialog(null,"Player "+x+" Wins the Match","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                        winx();
                        JOptionPane.showMessageDialog(null,"RESET if you want to continue playing...Else EXIT");
                    }
                    else
                    {
                            JOptionPane.showMessageDialog(null,"Player "+o+" Wins the Match","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                      wino();  //JOptionPane.showMessageDialog(null,"Player O Wins the Match","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null,"RESET if you want to continue playing...Else EXIT");
                    }    
                }
                else
                {
                    setvalue();
                }
         }
         else if(b3==("O")&& b5==("O")&& b7==("O"))
         {
               button3.setBackground(Color.red);
             button5.setBackground(Color.red);
             button7.setBackground(Color.red);
          JOptionPane.showMessageDialog(this,"Player "+o+" WINS","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
             ocount++;
             gcount++;
             gameScore();     
		flag1=1;       
		flag2=1;
		flag3=1;
		flag4=1;
		flag5=1;		 
		flag6=1;
		flag7=1;	
		flag8=1;
		flag9=1;
                if(gcount==3)
                {
                    if(xcount>ocount)
                    {
                    JOptionPane.showMessageDialog(null,"Player "+x+" Wins the Match","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                    winx();
                        //JOptionPane.showMessageDialog(null,"Player X Wins the Match","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null,"RESET if you want to continue playing...Else EXIT");
                    }
                    else
                    {
                      JOptionPane.showMessageDialog(null,"Player "+o+" Wins the Match","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                      wino();
                        //JOptionPane.showMessageDialog(null,"Player O Wins the Match","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null,"RESET if you want to continue playing...Else EXIT");
                    }    
                }
                else
                {
                    setvalue();
                }
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

        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        button1 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        button2 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        button3 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        oplayer = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        xplayer = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        button4 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        button5 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        button6 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        oscore = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        xscore = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        button7 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        button8 = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        button9 = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel19 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe");
        setPreferredSize(new java.awt.Dimension(1200, 600));

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel3.setLayout(new java.awt.GridLayout(1, 0));
        jPanel1.add(jPanel3, java.awt.BorderLayout.LINE_END);

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tic Tac Toe");
        jPanel1.add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jPanel4.setLayout(new java.awt.GridLayout(1, 0));
        jPanel1.add(jPanel4, java.awt.BorderLayout.LINE_END);
        jPanel1.add(jLabel2, java.awt.BorderLayout.LINE_START);

        jPanel2.setLayout(new java.awt.GridLayout(3, 5));

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        button1.setBackground(new java.awt.Color(153, 153, 153));
        button1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(button1, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(button1, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel5);

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        button2.setBackground(new java.awt.Color(153, 153, 153));
        button2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(button2, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(button2, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel6);

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        button3.setBackground(new java.awt.Color(153, 153, 153));
        button3.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(button3, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(button3, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel7);

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        oplayer.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(oplayer, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(oplayer, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel8);

        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        xplayer.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(xplayer, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(xplayer, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel9);

        jPanel10.setBackground(new java.awt.Color(204, 204, 204));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        button4.setBackground(new java.awt.Color(153, 153, 153));
        button4.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(button4, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(button4, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel10);

        jPanel11.setBackground(new java.awt.Color(204, 204, 204));
        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        button5.setBackground(new java.awt.Color(153, 153, 153));
        button5.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(button5, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(button5, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel11);

        jPanel12.setBackground(new java.awt.Color(204, 204, 204));
        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        button6.setBackground(new java.awt.Color(153, 153, 153));
        button6.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(button6, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(button6, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel12);

        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setText("PLAYER O");

        oscore.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(oscore, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(oscore, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel13);

        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        xscore.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(xscore, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(xscore, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel14);

        jPanel15.setBackground(new java.awt.Color(204, 204, 204));
        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        button7.setBackground(new java.awt.Color(153, 153, 153));
        button7.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(button7, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(button7, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel15);

        jPanel16.setBackground(new java.awt.Color(204, 204, 204));
        jPanel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        button8.setBackground(new java.awt.Color(153, 153, 153));
        button8.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(button8, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(button8, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel16);

        jPanel17.setBackground(new java.awt.Color(204, 204, 204));
        jPanel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        button9.setBackground(new java.awt.Color(153, 153, 153));
        button9.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(button9, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(button9, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel17);

        jPanel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton1.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jButton1.setText("RESET");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel18);

        jPanel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton2.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jButton2.setText("EXIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel19);

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
   private Jframe frame;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
             button1.setText(null);
             button2.setText(null);
             button3.setText(null);
             button4.setText(null);
             button5.setText(null);
             button6.setText(null);
             button7.setText(null);
             button8.setText(null);
             button9.setText(null);
             oscore.setText("0");
             xscore.setText("0");

                flag1=0;       
                flag2=0;
                flag3=0;
                flag4=0;
                flag5=0; 
                flag6=0;
                flag7=0;
                flag8=0;
                flag9=0;
                ocount=0;
                xcount=0;
                gcount=0;
             button1.setBackground(Color.LIGHT_GRAY);
             button2.setBackground(Color.LIGHT_GRAY);
             button3.setBackground(Color.LIGHT_GRAY);
             button4.setBackground(Color.LIGHT_GRAY);
             button5.setBackground(Color.LIGHT_GRAY);
             button6.setBackground(Color.LIGHT_GRAY);
             button7.setBackground(Color.LIGHT_GRAY);
             button8.setBackground(Color.LIGHT_GRAY);
             button9.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        frame=new Jframe("Exit");
       
        if(JOptionPane.showConfirmDialog(null,"Confirm if you want to exit","Tic Tac Toe",JOptionPane.YES_NO_OPTION ) == JOptionPane.YES_NO_OPTION)
        {
            this.dispose();
            tictactoe_menu m= new tictactoe_menu();
            m.setVisible(true);
       
            
            
        } 
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
    if(flag1==0){
        flag1=1;
        button1.setText(startGame);
        
         if(startGame.equalsIgnoreCase("x"))
         {
            button1.setForeground(Color.red);
         }
            else
            {
             button1.setForeground(Color.black);
            }
        Choose_a_player();
        win();
    }
   //TODO add your handling code here:
    }//GEN-LAST:event_button1ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
    if(flag2==0){
        flag2=1;    
        button2.setText(startGame);
        if(startGame.equalsIgnoreCase("x"))
        {
            button2.setForeground(Color.red);
        }
        else
        {
            button2.setForeground(Color.black);
        }
        Choose_a_player();
        win();
    }
    // TODO add your handling code hereनोूा
    }//GEN-LAST:event_button2ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
     if(flag3==0){
        flag3=1;
        button3.setText(startGame);
     
         if(startGame.equalsIgnoreCase("x"))
         {
             button3.setForeground(Color.red);
         }
         else
         {
             button3.setForeground(Color.black);

         }
        Choose_a_player();
        win();
     }                // TODO add your handling code here:
    }//GEN-LAST:event_button3ActionPerformed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
     if(flag4==0){
        flag4=1;
        button4.setText(startGame);
     
         if(startGame.equalsIgnoreCase("x"))
         {
             button4.setForeground(Color.red);
         }
         else
         {
             button4.setForeground(Color.black);

         }
         Choose_a_player();
        win();
     }                // TODO add your handling code here:
    }//GEN-LAST:event_button4ActionPerformed

    private void button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button5ActionPerformed
 if(flag5==0){
        flag5=1;
        button5.setText(startGame);
     
         if(startGame.equalsIgnoreCase("x"))
         {
             button5.setForeground(Color.red);
         }
         else
         {
             button5.setForeground(Color.black);

         }
         Choose_a_player();
         win();
     }                // TODO add your handling code here:
    }//GEN-LAST:event_button5ActionPerformed

    private void button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button6ActionPerformed
     if(flag6==0){
        flag6=1;
        button6.setText(startGame);
     
         if(startGame.equalsIgnoreCase("x"))
         {
             button6.setForeground(Color.red);
         }
         else
         {
             button6.setForeground(Color.black);

         }
         Choose_a_player();
    win();
     }                // TODO add your handling code here:
    }//GEN-LAST:event_button6ActionPerformed

    private void button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button7ActionPerformed
 if(flag7==0){
        flag7=1;
        button7.setText(startGame);
     
         if(startGame.equalsIgnoreCase("x"))
         {
             button7.setForeground(Color.red);
         }
         else
         {
             button7.setForeground(Color.black);

         }
        Choose_a_player();
        win();
     }                // TODO add your handling code here:
    }//GEN-LAST:event_button7ActionPerformed

    private void button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button8ActionPerformed
 if(flag8==0){
        flag8=1;
        button8.setText(startGame);
     
         if(startGame.equalsIgnoreCase("x"))
         {
             button8.setForeground(Color.red);
         }
         else
         {
             button8.setForeground(Color.black);

         }
         Choose_a_player();
     win();
     }                // TODO add your handling code here:
    }//GEN-LAST:event_button8ActionPerformed

    private void button9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button9ActionPerformed
 if(flag9==0){
        flag9=1;
        button9.setText(startGame);
     
         if(startGame.equalsIgnoreCase("x"))
         {
             button9.setForeground(Color.red);
         }
         else
         {
             button9.setForeground(Color.black);

         }
         Choose_a_player();
         win();
        }                // TODO add your handling code here:
    }//GEN-LAST:event_button9ActionPerformed

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
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button1;
    private javax.swing.JButton button2;
    private javax.swing.JButton button3;
    private javax.swing.JButton button4;
    private javax.swing.JButton button5;
    private javax.swing.JButton button6;
    private javax.swing.JButton button7;
    private javax.swing.JButton button8;
    private javax.swing.JButton button9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel oplayer;
    private javax.swing.JLabel oscore;
    private javax.swing.JLabel xplayer;
    private javax.swing.JLabel xscore;
    // End of variables declaration//GEN-END:variables

    private static class Jframe {

        public Jframe(String exit) {
        }
    }
}
