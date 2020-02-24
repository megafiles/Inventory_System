/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ta.inventory;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javafx.scene.layout.Border;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class TaInventory implements ActionListener {
   JFrame frame=new JFrame();
   JPanel mnave=new JPanel();
   JPanel Display=new JPanel();
  
    TaInventory(){
        
 frame.setVisible(true);
 frame.setDefaultCloseOperation(3);
 frame.setLayout(null);
 frame.setBounds(0,0,1200,900);
 
 
 
 //===========Main Screen==============
 Display.setBounds(150,0,1200,900);
Display.setLayout(null);
 frame.add(Display);

 
 
 
// ------------------------Side bar Nave---------------------
mnave.setBounds(0,0,150,900);
mnave.setLayout(null);
mnave.setBackground(Color.DARK_GRAY);
 frame.add(mnave);

// --------Buttons------
String[] nav_buttons = {"Deshbord", "Add New Client"};
JButton[] NB=new JButton[nav_buttons.length];
for(int i=0;i<nav_buttons.length;i++){
    NB[i]=new JButton(nav_buttons[i]); 
    NB[i].setBounds(0,30*i,150,30);
    NB[i].addActionListener(this);
    NB[i].setBackground(null);
    NB[i].setForeground(Color.white);
    mnave.add(NB[i]);
    }
   }
   public static void main(String[] args) {new TaInventory(); }

    
   
   
   
   void Dashbord(){//==============================Dashbor===================
        Display.removeAll();
          Display.updateUI();
      }

  
String[] Add_texfield = {"Name", "Phone Number","Address","TextField 1","TextField 2","TextField 3","TextField 4","TextField 5","TextField 6"};
          JTextField[] TF=new JTextField[Add_texfield.length];
    void ADD_Client(){//==============================ADD_Client===================
       
        System.out.println("Yahoo");
       JPanel jp=new JPanel();
       Display.add(jp);
       jp.setBackground(Color.CYAN);
       jp.setLayout(null);
        jp.setBounds(100,80,400,280);   
       
        
        JPanel OTXTF=new JPanel();
        
        OTXTF.setBounds(550,80,400,500);   
       OTXTF.setBackground(Color.LIGHT_GRAY);
       OTXTF.setLayout(null);
      Display.add(OTXTF);
        
        
        
          String[] Add_texfield = {"Name", "Phone Number","Address","TextField 1","TextField 2","TextField 3","TextField 4","TextField 5","TextField 6"};
          JTextField[] TF=new JTextField[Add_texfield.length];
for(int i=0;i<Add_texfield.length;i++){
    TF[i]=new JTextField(); 
   TF[i].setBounds(100,70*i+50,150,28);   
    JLabel jb=new JLabel(Add_texfield[i]);
     jb.setBounds(10,70*i+50,150,28);
    if(i<3){jp.add(jb);jp.add(TF[i]);}
    if(i>=3){//Display.add(jb);Display.add(TF[i]);
    OTXTF.add(jb);OTXTF.add(TF[i]);
    jb.setBounds(20,60*i-120,100,28);
    TF[i].setBounds(120,60*i-120,150,28);   
    }
}
    
    



JButton save=new JButton("Save");
save.setBounds(800,650,150,35);
save.addActionListener(this);
save.setForeground(Color.BLUE);
Display.add(save);
    Display.updateUI();
    
    JButton Clear=new JButton("Clear");
Clear.setBounds(620,650,150,35);
Clear.addActionListener(this);
Display.add(Clear);

Clear.setForeground(Color.RED);


    Display.updateUI();
    
    
    
    }
    
    
    
    
    
    
    public void actionPerformed(ActionEvent e){ 
       
       
    //   System.out.println(e.getSourcTe().hashCode());
       if(e.getActionCommand()=="Deshbord")Dashbord();
       if(e.getActionCommand()=="Add New Client")ADD_Client();
              if(e.getActionCommand()=="Clear")ADD_Client();
              if(e.getActionCommand()=="Save"){ 
               TF[0]=new JTextField(); 
                 String v1=TF[0].getText(); 
                    System.out.print(v1);
              }
              
    System.out.println(e.getActionCommand());
    }
    
    
    
    
    
    
    
    
}
