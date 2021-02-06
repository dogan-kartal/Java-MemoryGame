package hafizaoyunu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class Butonlar implements ActionListener { 
   
        static int tiklama;
        static int saybakalim;
        static int hak;
        private Timer t;
        private Random random;
        
       JButton butonlar;
    String[] icon = {"/icon/resim8.png", "/icon/resim2.png", "/icon/resim3.png", "/icon/resim4.png", "/icon/resim5.png", "/icon/resim6.png", 
            "/icon/resim2.png", "/icon/resim5.png", "/icon/resim8.png", "/icon/resim6.png","/icon/resim3.png","/icon/resim7.png", "/icon/resim4.png", "/icon/resim1.png", 
     "/icon/resim9.jpg",  "/icon/resim1.png","/icon/resim9.jpg","/icon/resim7.png",};
     public Butonlar()
     {
         karıstır();
     }
    
    
    public void karıstır() {
    random = new Random();
    for (int i = 0; i < icon.length; i++) {
        int pos = random.nextInt(icon.length);
        String temp = icon[i];
        icon[i] = icon[pos];
        icon[pos] = temp;
    }
}
    
    JButton eskiler; 
    
    static int count = 0;
    int deger;
    
    
    @Override 
    public void actionPerformed(ActionEvent e) { 
        
        butonlar = (JButton) e.getSource(); 
        
         
                       
                                            
                                            
         if(butonlar.equals(eskiler))
        {
            
            return;
        }
        
        deger = Integer.parseInt(butonlar.getText()) -1; 
        butonlar.setIcon(new ImageIcon(getClass().getResource(icon[deger]))); 
        

        
        if(count == 0) 
        {
            count = 1;
            tiklama++;
        }
        else           
        {              
            
            kontroller();
            
            count = 0;
            tiklama++;
            
        }

          
        System.out.println(tiklama+" "+".denemeniz");
        
        if(saybakalim > 8) 
        {
            if(tiklama <=15)
            {
            JOptionPane.showMessageDialog(butonlar,+tiklama+ " denemede oyunu bitirmeyi başardınız. Mükemmel!");
            System.exit(0);
            }
            else if(tiklama <=25)
            {
            JOptionPane.showMessageDialog(butonlar,+tiklama+ " denemede oyunu bitirmeyi başardınız. Gayet iyiydin!");
            System.exit(0);
            }
            else if(tiklama <=35)
            {
            JOptionPane.showMessageDialog(butonlar,+tiklama+ " denemede oyunu bitirmeyi başardınız. Yeterli!");
            System.exit(0);
            }
            else {
                JOptionPane.showMessageDialog(butonlar,+tiklama+ " denemede oyunu bitirmeyi başardınız. Daha fazla Omega3 alman lazım!");
            System.exit(0);
            }
        }
        eskiler = butonlar;     
    }
    
    
    
    public void kontroller() { 
    
        
        if(butonlar.getIcon().toString().equals(eskiler.getIcon().toString())) {
           
            eskiler.setVisible(false);
            butonlar.setVisible(false);
            saybakalim++; 
          
        }
        
        else {
            
            eskiler.setIcon(new ImageIcon(getClass().getResource("/icon/arka.jpg"))); 
            butonlar.setIcon(new ImageIcon(getClass().getResource("/icon/arka.jpg")));
            hak++;
        }
    }
}

