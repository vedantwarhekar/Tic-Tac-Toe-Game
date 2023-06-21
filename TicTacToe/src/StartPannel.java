import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;



/**
 *
 * @author vedant
 */
public class StartPannel implements ActionListener {

  JFrame jf;
  JLabel jl1;
  JButton jb;
  
  
  StartPannel(){
     jf = new JFrame();
     jf.setSize(600,500);
     jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     jf.setLayout(null);
     
     jl1 = new JLabel("Welcome to my game");
     jl1.setBounds(230,100,220,130);
     jf.add(jl1);
     
    
     
     jb = new JButton("start game");
     jb.setBounds(220, 280, 150, 30);
     jb.addActionListener(this);
     jf.add(jb);
     
     
     jf.setVisible(true);
     
    }

    @Override
    public void actionPerformed(ActionEvent e) {    
     UserPannel us = new UserPannel();
       jf.setVisible(false);
        
        }
    }