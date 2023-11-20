import javax.swing.*;
import java.awt.*;
public class rr extends JFrame  { private JProgressBar progressBar1;
    private JPanel t;private JLabel e;
    private JProgressBar progressBar2;
    private JProgressBar progressBar3;private JLabel rty;private JLabel re;
    public static void main(String[] args) {
        try {
            // set look and feel
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
      int t =  JOptionPane.showConfirmDialog(null, "long loading \nscreen"
              ,"message"
              ,JOptionPane.YES_NO_OPTION,JOptionPane.ERROR_MESSAGE
        );if (t == 1)  {
            System.out.println("yu");
            JOptionPane.showMessageDialog(null,"too bad");
    }else if (t == 0){
        System.out.println("ryr");
        JOptionPane.showMessageDialog(null,"0-1000");
    }rr g = new rr();
        g.setContentPane(g.t);
        g.setVisible(true);
        g.setSize(400, 265);
        g.setDefaultCloseOperation(EXIT_ON_CLOSE);
        g.progressBar1.setPreferredSize(new Dimension( 30 ,40));
        g.progressBar2.setPreferredSize(new Dimension( 30 ,40));
        g.progressBar3.setPreferredSize(new Dimension( 30 ,40));
        g.setTitle("initializing~");
        rr c = new rr();
        if (1==2){
            System.out.println("a");
        } else {
            System.err.println("uu");
            int i = 0;
            try {//
                while (i <= 1000) {
                    // fill the menu bar
                    g.progressBar1.setValue(i + 0);
                    g.progressBar2.setValue((i+8-5));
                    g.progressBar3.setValue(i+2);
                    g.rty.setText(String.valueOf(g.progressBar2.getValue()) + "%");
                    g.re.setText(String.valueOf(g.progressBar3.getValue()) + "%");
                    g.e.setText(i + 0 + "%");
                    System.out.println(i);// delay the thread
                    Thread.sleep(500);
                    i += 1;
                    int ert = g.progressBar1.getValue();
                    int tre = g.progressBar2.getValue();
                    if(ert == 1000){g.   e.setText("Δ");
                    }if (tre == 500){
                        g.rty.setText("Δ" + "%");}
                }
            } catch (Exception d) {
                System.err.print(d);
            }}
    }
}


