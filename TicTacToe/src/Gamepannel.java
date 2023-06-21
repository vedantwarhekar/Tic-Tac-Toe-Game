import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author er. v.G.warhekar................
 */
public class Gamepannel implements ActionListener
{
    JFrame jf;
    JButton jb1, jb2, jb3, jb4, jb5, jb6, jb7, jb8, jb9;
    
    int count=0;
    String str="", title_str="";
    boolean win=false;
    Color color1;
    
    String player1, player2;
    String player;
    
    boolean first_turn=true;
    
    Gamepannel(String player1, String player2)
    {
        this.player1=player1;
        this.player2=player2;
    }
    
    void openGamePanel()
    {
        jf=new JFrame();
        jf.setTitle(player1+" (X) turns");
        jf.setSize(500,500);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(new GridLayout(3, 3));
        
        jb1=new JButton();
        jb1.addActionListener(this);
        jf.add(jb1);
        
        jb2=new JButton();
        jb2.addActionListener(this);
        jf.add(jb2);
        
        jb3=new JButton();
        jb3.addActionListener(this);
        jf.add(jb3);
        
        jb4=new JButton();
        jb4.addActionListener(this);
        jf.add(jb4);
        
        jb5=new JButton();
        jb5.addActionListener(this);
        jf.add(jb5);
        
        jb6=new JButton();
        jb6.addActionListener(this);
        jf.add(jb6);
        
        jb7=new JButton();
        jb7.addActionListener(this);
        jf.add(jb7);
        
        jb8=new JButton();
        jb8.addActionListener(this);
        jf.add(jb8);
        
        jb9=new JButton();
        jb9.addActionListener(this);
        jf.add(jb9);
        
        jf.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        count=count+1;
        if(first_turn==true)
        {
            color1=Color.yellow;
            str="X";
            title_str="0";
            jf.setTitle(player2+" ("+title_str+") turns");
            
            first_turn=false;
        }
        else
        {
            str="0";
            color1=Color.red;
            title_str="X";
            jf.setTitle(player1+" ("+title_str+") turns");
            
            first_turn=true;
        }
        
        if(e.getSource()==jb1)
        {
            jb1.setBackground(color1);
            jb1.setFont(new Font("Arial", 1, 50));
            jb1.setText(str);
            jb1.setEnabled(false);
        }
        if(e.getSource()==jb2)
        {
            jb2.setBackground(color1);
            jb2.setFont(new Font("Arial", 1, 50));
            jb2.setText(str);
            jb2.setEnabled(false);
        }
        if(e.getSource()==jb3)
        {
            jb3.setBackground(color1);
            jb3.setFont(new Font("Arial", 1, 50));
            jb3.setText(str);
            jb3.setEnabled(false);
        }
        if(e.getSource()==jb4)
        {
            jb4.setBackground(color1);
            jb4.setFont(new Font("Arial", 1, 50));
            jb4.setText(str);
            jb4.setEnabled(false);
        }
        if(e.getSource()==jb5)
        {
            jb5.setBackground(color1);
            jb5.setFont(new Font("Arial", 1, 50));
            jb5.setText(str);
            jb5.setEnabled(false);
        }
        if(e.getSource()==jb6)
        {
            jb6.setBackground(color1);
            jb6.setFont(new Font("Arial", 1, 50));
            jb6.setText(str);
            jb6.setEnabled(false);
        }
        if(e.getSource()==jb7)
        {
            jb7.setBackground(color1);
            jb7.setFont(new Font("Arial", 1, 50));
            jb7.setText(str);
            jb7.setEnabled(false);
        }
        if(e.getSource()==jb8)
        {
            jb8.setBackground(color1);
            jb8.setFont(new Font("Arial", 1, 50));
            jb8.setText(str);
            jb8.setEnabled(false);
        }
        if(e.getSource()==jb9)
        {
            jb9.setBackground(color1);
            jb9.setFont(new Font("Arial", 1, 50));
            jb9.setText(str);
            jb9.setEnabled(false);
        }
        winningPossibilities();
        whoWins();
    }
    
    void winningPossibilities()
    {
        //horizontal winning possibilities
        if(jb1.getText()==jb2.getText() && jb2.getText()==jb3.getText() && jb3.getText() != "")
        {
            win=true;
        }
        else if(jb4.getText()==jb5.getText() && jb5.getText()==jb6.getText() && jb6.getText() != "")
        {
            win=true;
        }
        else if(jb7.getText()==jb8.getText() && jb8.getText()==jb9.getText() && jb9.getText() != "")
        {
            win=true;
        }
        //vertical winning possibilities
        else if(jb1.getText()==jb4.getText() && jb4.getText()==jb7.getText() && jb7.getText() != "")
        {
            win=true;
        }
        else if(jb2.getText()==jb5.getText() && jb5.getText()==jb8.getText() && jb8.getText() != "")
        {
            win=true;
        }
        else if(jb3.getText()==jb6.getText() && jb6.getText()==jb9.getText() && jb9.getText() != "")
        {
            win=true;
        }
        //diagonal winning possibilities
        else if(jb1.getText()==jb5.getText() && jb5.getText()==jb9.getText() && jb9.getText() != "")
        {
            win=true;
        }
        else if(jb3.getText()==jb5.getText() && jb5.getText()==jb7.getText() && jb7.getText() != "")
        {
            win=true;
        }
        //game draw
        else
        {
            win=false;
        }
    }
    void whoWins()
    {
        if(win==true)
        {
            if(str.equals("X"))
            {
                player=player1;
            }
            else 
            {
                player=player2;
            }
            
            String win_title=player+" ("+str+")"+" wins";
            jf.setTitle(win_title);
            JOptionPane.showMessageDialog(jf, win_title);
            restartGame();
        }
        else if(win==false && count==10)
        {
            JOptionPane.showMessageDialog(jf, "Match Draw");
            restartGame();
        }
        else if(win==false && count==9)
        {
            JOptionPane.showMessageDialog(jf, "Match Draw");
            restartGame();
        }
    }
    void restartGame()
    {
        int i=JOptionPane.showConfirmDialog(jf, "Do you want to restart the game ?");
        if(i==0)
        {
            jb1.setText("");
            jb2.setText("");
            jb3.setText("");
            jb4.setText("");
            jb5.setText("");
            jb6.setText("");
            jb7.setText("");
            jb8.setText("");
            jb9.setText("");
            
            jb1.setBackground(null);
            jb2.setBackground(null);
            jb3.setBackground(null);
            jb4.setBackground(null);
            jb5.setBackground(null);
            jb6.setBackground(null);
            jb7.setBackground(null);
            jb8.setBackground(null);
            jb9.setBackground(null);
            
            btnSetEnabling(true);
            count=0;
            
            if(player.equals(player1))
            {
                first_turn=true;
            }
            else
            {
                first_turn=false;
            }
            
            jf.setTitle(player+" ("+str+") turns");
            win=false;
        }
        else if(i==1)
        {
            System.exit(0);
        }
        else
        {
            btnSetEnabling(false);
        }
    }
    void btnSetEnabling(boolean b)
    {
        jb1.setEnabled(b);
        jb2.setEnabled(b);
        jb3.setEnabled(b);
        jb4.setEnabled(b);
        jb5.setEnabled(b);
        jb6.setEnabled(b);
        jb7.setEnabled(b);
        jb8.setEnabled(b);
        jb9.setEnabled(b);
    }
}




/*import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/*
 *
 * @vedant warhekar
 
 
public class Gamepannel implements ActionListener{
    JFrame jf;
    JButton jb1,jb2,jb3,jb4,jb5,jb6,jb7,jb8,jb9;
    String str = "",title_str = "";
    int count = 0;
    boolean win = false;
    Color color1;
    String player_1,player_2;
    String player;
    boolean first_turn = true;
   
    
     Gamepannel(String player_1,String player_2){
         this.player_1 = player_1;
         this.player_2 = player_2;
     
     }
    void openGamePannel(){
     jf = new JFrame();
      jf.setSize(500,500);
      jf.setTitle(player_1+"(x) turns");
      jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      jf.setLayout(new GridLayout(3,3));
      
      jb1 = new JButton();
      jb1.addActionListener(this);
      jf.add(jb1);
      
      jb2 = new JButton();
      jb2.addActionListener(this);
      jf.add(jb2);
      
      jb3 = new JButton();
      jb3.addActionListener(this);
      jf.add(jb3);
      
      jb4 = new JButton();
      jb4.addActionListener(this);
      jf.add(jb4);
      
      jb5 = new JButton();
      jb5.addActionListener(this);
      jf.add(jb5);
      
      jb6 = new JButton();
      jb6.addActionListener(this);
      jf.add(jb6);
      
      jb7 = new JButton();
      jb7.addActionListener(this);
      jf.add(jb7);
      
      jb8 = new JButton();
      jb8.addActionListener(this);
      jf.add(jb8);
      
      jb9 = new JButton();
      jb9.addActionListener(this);
      jf.add(jb9);
      
      jf.setVisible(true);
      
       
     }

    @Override
    public void actionPerformed(ActionEvent e) {
        count = count+1;
        if(first_turn == true){    
         color1 = Color.yellow;
        str = "X";
       title_str = "0";
       jf.setTitle(player_2+"("+title_str+") turn");
       first_turn = false;
        }
        else{ 
            str = "0";
            color1 = Color.red;
            title_str = "x";
            jf.setTitle(player_1+" ("+title_str+") turns");
            first_turn = true;
        }
        if(e.getSource()==jb1){
        jb1.setBackground(color1);
        jb1.setFont(new Font("Arial",1,50));
        jb1.setText(str);
        jb1.setEnabled(false);
        }
        else if(e.getSource()==jb2){
         jb2.setBackground(color1);
         jb2.setFont(new Font("Arial",1,50));
         jb2.setText(str);
         jb2.setEnabled(false);
          }
        else if(e.getSource()==jb3){
         jb3.setBackground(color1);
         jb3.setFont(new Font("Arial",1,50));
         jb3.setText(str);
         jb3.setEnabled(false);
         }
        else if(e.getSource()==jb4){
         jb4.setBackground(color1);
         jb4.setFont(new Font("Arial",1,50));
         jb4.setText(str);
         jb4.setEnabled(false);
        } 
        else if(e.getSource()==jb5){
          jb5.setBackground(color1);
          jb5.setFont(new Font("Arial",1,50));
          jb5.setText(str);
          jb5.setEnabled(false);
               }
        else if(e.getSource()==jb6){
          jb6.setBackground(color1);
          jb6.setFont(new Font("Arial",1,50));
          jb6.setText(str);
          jb6.setEnabled(false);
               }
        else if(e.getSource()==jb7){
          jb7.setBackground(color1);
          jb7.setFont(new Font("Arial",1,50));
          jb7.setText(str);
          jb7.setEnabled(false);
               }
        else if(e.getSource()==jb8){
          jb8.setBackground(color1);
          jb8.setFont(new Font("Arial",1,50));
          jb8.setText(str);
          jb8.setEnabled(false);
               }
        else if(e.getSource()==jb9){
          jb9.setBackground(color1);
          jb9.setFont(new Font("Arial",1,50));
          jb9.setText(str);
          jb9.setEnabled(false);
               }
    
    winningPossiblities();
    whoWins();
    
}
void winningPossiblities(){
 if(jb1.getText()==jb2.getText() && jb2.getText()==jb3.getText() &&  jb3.getText()!= ""){
 win = true;
  }
else if(jb4.getText()==jb5.getText() && jb5.getText()==jb6.getText() &&  jb6.getText()!= ""){
 win = true;
  }
else if(jb7.getText()==jb8.getText() && jb8.getText()==jb9.getText() &&  jb9.getText()!= ""){
 win = true;
  }
else if(jb3.getText()==jb5.getText() && jb5.getText()==jb7.getText() &&  jb7.getText()!= ""){
 win = true;
  }
else if(jb1.getText()==jb5.getText() && jb5.getText()==jb9.getText() &&  jb9.getText()!= ""){
 win = true;
  }
else if(jb1.getText()==jb4.getText() && jb4.getText()==jb7.getText() &&  jb7.getText()!= ""){
 win = true;
  }
else if(jb2.getText()==jb5.getText() && jb5.getText()==jb8.getText() &&  jb8.getText()!= ""){
 win = true;
  }
else if(jb3.getText()==jb6.getText() && jb6.getText()==jb9.getText() &&  jb9.getText()!= ""){
 win = true;
  }
 else{
  win = false;
  }
}
void whoWins(){
if(win == true){
    if(str.equals("x")){
      player = player_1;    
       }
    else{
     player = player_2;
     }
    String win_title = player+"("+str+")"+"wins";
    jf.setTitle(win_title);
    JOptionPane.showMessageDialog(jf,win_title);
    reStartGame();
}
else if(win==false && count==10)
        {
            JOptionPane.showMessageDialog(jf, "Match Draw");
            reStartGame();
        }
else if(win == false && count == 9 ){
    JOptionPane.showMessageDialog(jf, "Match Draw");
    reStartGame();
    }
   }
void reStartGame(){
 int i = JOptionPane.showConfirmDialog(jf,"do you want a restart a game");
 if(i==0){
   jb1.setText("");
   jb2.setText("");
   jb3.setText("");
   jb4.setText("");
   jb5.setText("");
   jb6.setText("");
   jb7.setText("");
   jb8.setText("");
   jb9.setText("");
   
   jb1.setBackground(null);
   jb2.setBackground(null);
   jb3.setBackground(null);
   jb4.setBackground(null);
   jb5.setBackground(null);
   jb6.setBackground(null);
   jb7.setBackground(null);
   jb8.setBackground(null);
   jb9.setBackground(null);
   
   btnSetEnabling(true);
    count = 0;
   if(player.equals(player_1)){
    first_turn = true;
    }
    else{
   first_turn = false; 
    }
   jf.setTitle(player+" ("+str+") turns");
    win=false;
        
   
   }
 else if(i ==1){
  System.exit(0);
  }
 else{
  btnSetEnabling(false);
  }
  }
void btnSetEnabling(boolean b)
    {
        jb1.setEnabled(b);
        jb2.setEnabled(b);
        jb3.setEnabled(b);
        jb4.setEnabled(b);
        jb5.setEnabled(b);
        jb6.setEnabled(b);
        jb7.setEnabled(b);
        jb8.setEnabled(b);
        jb9.setEnabled(b);
    }
}

*/
