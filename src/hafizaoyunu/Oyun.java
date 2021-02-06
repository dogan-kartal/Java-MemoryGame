package hafizaoyunu;

import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;


public class Oyun extends JFrame {

    public Oyun(){ 
        super("Hafıza Oyunu");
            
             setSize(1500,1000); 
        setLayout(new GridLayout(3,3,4,4)); 
       
       
        
        JButton buton1= new JButton("1");
        JButton buton2= new JButton("2");
        JButton buton3= new JButton("3");
        JButton buton4= new JButton("4");
        JButton buton5= new JButton("5");
        JButton buton6= new JButton("6");
        JButton buton7= new JButton("7");
        JButton buton8= new JButton("8");
        JButton buton9= new JButton("9");
        JButton buton10= new JButton("10");
        JButton buton11= new JButton("11");
        JButton buton12= new JButton("12");
        JButton buton13= new JButton("13");
        JButton buton14= new JButton("14");
        JButton buton15= new JButton("15");
        JButton buton16= new JButton("16");
        JButton buton17= new JButton("17");
        JButton buton18= new JButton("18");
        
        
        
        buton1.setIcon(new ImageIcon(getClass().getResource("/icon/arka.jpg")));
        buton2.setIcon(new ImageIcon(getClass().getResource("/icon/arka.jpg")));
        buton3.setIcon(new ImageIcon(getClass().getResource("/icon/arka.jpg")));
        buton4.setIcon(new ImageIcon(getClass().getResource("/icon/arka.jpg")));
        buton5.setIcon(new ImageIcon(getClass().getResource("/icon/arka.jpg")));
        buton6.setIcon(new ImageIcon(getClass().getResource("/icon/arka.jpg")));
        buton7.setIcon(new ImageIcon(getClass().getResource("/icon/arka.jpg")));
        buton8.setIcon(new ImageIcon(getClass().getResource("/icon/arka.jpg")));
        buton9.setIcon(new ImageIcon(getClass().getResource("/icon/arka.jpg")));
        buton10.setIcon(new ImageIcon(getClass().getResource("/icon/arka.jpg")));
        buton11.setIcon(new ImageIcon(getClass().getResource("/icon/arka.jpg")));
        buton12.setIcon(new ImageIcon(getClass().getResource("/icon/arka.jpg")));
        buton13.setIcon(new ImageIcon(getClass().getResource("/icon/arka.jpg")));
        buton14.setIcon(new ImageIcon(getClass().getResource("/icon/arka.jpg")));
        buton15.setIcon(new ImageIcon(getClass().getResource("/icon/arka.jpg")));
        buton16.setIcon(new ImageIcon(getClass().getResource("/icon/arka.jpg")));
        buton17.setIcon(new ImageIcon(getClass().getResource("/icon/arka.jpg")));
        buton18.setIcon(new ImageIcon(getClass().getResource("/icon/arka.jpg")));
        
        
        add(buton1);
        add(buton2);
        add(buton3);
        add(buton4);
        add(buton5);
        add(buton6);
        add(buton7);
        add(buton8);
        add(buton9);
        add(buton10);
        add(buton11);
        add(buton12);
        add(buton13);
        add(buton14);
        add(buton15);
        add(buton16);
        add(buton17);
        add(buton18);
        
        
        
        Butonlar action = new Butonlar();
        
        
        
         buton1.addActionListener(action);
         buton2.addActionListener(action);
         buton3.addActionListener(action);
         buton4.addActionListener(action);
         buton5.addActionListener(action);
         buton6.addActionListener(action);
         buton7.addActionListener(action);
         buton8.addActionListener(action);
         buton9.addActionListener(action);
         buton10.addActionListener(action);
         buton11.addActionListener(action);
         buton12.addActionListener(action);
         buton13.addActionListener(action);
         buton14.addActionListener(action);
         buton15.addActionListener(action);
         buton16.addActionListener(action);
         buton17.addActionListener(action);
         buton18.addActionListener(action);     
    }
   
}
