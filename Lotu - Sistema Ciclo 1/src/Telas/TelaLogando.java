
/**
 *
 * @author Rafael Zurawski
 */
package Telas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.SwingUtilities;

public class TelaLogando extends JPanel {

    JProgressBar pbar;
    static final int MY_MINIMUM = 0;
    static final int MY_MAXIMUM = 200;

    public TelaLogando() {
        pbar = new JProgressBar();
        pbar.setMinimum(MY_MINIMUM);
        pbar.setMaximum(MY_MAXIMUM);
        pbar.setValue(100);
        pbar.setString("                  Logando-se no sistema                      ");
        pbar.setStringPainted(true);
        add(pbar);
        
    }

    public void atualizaBarra(int valor) {
        pbar.setValue(valor);
    }

    public static void main(final String login, final String reg) {

        final TelaLogando barra = new TelaLogando();

        JFrame frame = new JFrame("Logando no Sistema");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(barra);
        frame.setLocation(550, 370);
       
        //frame.setLocationRelativeTo(null);
        frame.setSize(280, 70);

 frame.pack();
        frame.setVisible(true);
        for (int i = MY_MINIMUM; i <= MY_MAXIMUM; i++) {
            final int percent = i;

            if (i >= 200) {
                frame.setVisible(false);
            }

            try {
                SwingUtilities.invokeLater(new Runnable() {

                    public void run() {
                        barra.atualizaBarra(percent);
                    }
                });
                Thread.sleep(4);
                } catch (InterruptedException e) {
            }
        }
        new Thread(new Runnable(){

            public void run() {
                //throw new UnsupportedOperationException("Not supported yet.");
                TelaLogado.main(login,reg);
            }
            
                                 }).start();
    }
}
