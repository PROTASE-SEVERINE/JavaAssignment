import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;

public class SplashScreen {

    public static void main(String[] args) {
        JFrame splashFrame = new JFrame("Splash Screen");
        splashFrame.setUndecorated(true); 
        splashFrame.setSize(600, 400);  
        splashFrame.setLocationRelativeTo(null);  

        JPanel panel = new JPanel() {
            private Image image;

            {
                try {
                    URL computerImageUrl = getClass().getResource("/images/splash.jpeg");
                    if (computerImageUrl != null) {
                        image = new ImageIcon(computerImageUrl).getImage();
                    } else {
                        System.err.println("Image not found at the specified path!");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.setColor(new Color(255, 223, 186)); 
                g.fillRect(0, 0, getWidth(), getHeight());

                if (image != null) {
                    int imageWidth = image.getWidth(null);
                    int imageHeight = image.getHeight(null);
                    int x = (getWidth() - imageWidth) / 2;
                    int y = 150;  
                    g.drawImage(image, x, y, null);
                }

                g.setColor(new Color(100, 102, 204));  
                Font font = new Font("Arial", Font.BOLD, 20);
                g.setFont(font);
                String title = "Fashion Finder for Every Event";
                FontMetrics metrics = g.getFontMetrics(font);
                int x = (getWidth() - metrics.stringWidth(title)) / 2;
                int y = getHeight() - 370;  
                g.drawString(title, x, y);
            }
        };

        splashFrame.add(panel);

        splashFrame.setVisible(true);

        Timer timer = new Timer(5000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                splashFrame.setVisible(false);  
                splashFrame.dispose();  
                SwingUtilities.invokeLater(() -> Dashboard.main(new String[]{}));
            }
        });
        timer.setRepeats(false);  
        timer.start();
    }

    
    
}
