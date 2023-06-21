
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;



/**
 *
 * @author vedant
 */
public class UserPannel implements ActionListener {

  JFrame jf;
  JLabel jl1,jl2;
  JButton jb;
  JTextField jt1,jt2;
  
  UserPannel(){
     jf = new JFrame();
     jf.setSize(600,500);
     jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     jf.setLayout(null);
     
     jl1 = new JLabel("Entre Player one : (x)");
     jl1.setBounds(50,50,120,30);
     jf.add(jl1);
     
     jt1 = new JTextField();
     jt1.setBounds(200, 50,250, 40);
     jf.add(jt1);
     
     jl2 = new JLabel("entre playe two : (y)");
     jl2.setBounds(50, 150, 120, 30);
     jf.add(jl2);
     
     jt2 = new JTextField();
     jt2.setBounds(200,140,250,40);
     jf.add(jt2);
     
     jb = new JButton("start game");
     jb.setBounds(200, 280, 150, 50);
     jb.addActionListener(this);
     jf.add(jb);
     
     
     jf.setVisible(true);
     
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== jb){
        String player_1 = jt1.getText();
        String player_2 = jt2.getText();
        
        
       Gamepannel gp = new Gamepannel(player_1,player_2);
       gp.openGamePanel();
       jf.setVisible(false);
        
        }
    }
  
}
