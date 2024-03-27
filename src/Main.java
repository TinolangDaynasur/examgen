import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main
{
    public static void main(String[] args)
    {

        JFrame frame = new JFrame();
        JPanel cardPanel = new JPanel(new CardLayout());

        JPanel splashPanel = createSplashPanel();
        cardPanel.add(splashPanel, "splash");

        HomePage homePage = new HomePage();
        cardPanel.add(homePage, "homePage");

        //FRAME
        frame.setTitle("QuizForge");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1300,800);
        frame.getContentPane().setBackground(new Color(0xFCF6F5));
        ImageIcon image = new ImageIcon("bulb.png");
        frame.setIconImage(image.getImage());

        //SPLASHSCREEN TIMER
        Timer timer = new Timer(0000, new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                CardLayout cardLayout = (CardLayout) cardPanel.getLayout();
                cardLayout.show(cardPanel, "homePage");
            }
        });
        timer.setRepeats(false); // Only fire once
        timer.start();

        frame.add(cardPanel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
    //SPLASH SCREEN METHOD
    private static JPanel createSplashPanel() {
        JPanel splashPanel = new JPanel();
        splashPanel.setBackground(new Color(0xFCF6F5));

        // BOX LAYOUT FOR LOGO ALIGNMENT
        splashPanel.setLayout(new BoxLayout(splashPanel, BoxLayout.Y_AXIS));

        // LOGO
        ImageIcon originalLogo = new ImageIcon("logo.png");
        Image img = originalLogo.getImage();
        Image scaledImg = img.getScaledInstance(410, 400, Image.SCALE_SMOOTH);
        ImageIcon scaledLogo = new ImageIcon(scaledImg);
        JLabel logoLabel = new JLabel(scaledLogo);
        logoLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        // TITLE
        JLabel titleLabel = new JLabel("QUIZ FORGE");
        titleLabel.setFont(new Font("Cooper Black", Font.PLAIN, 70));
        titleLabel.setForeground(new Color(0xEABD8C));
        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        // ADD THE LOGO AND TITLE
        splashPanel.add(Box.createVerticalGlue());
        splashPanel.add(logoLabel);
        splashPanel.add(Box.createVerticalStrut(20));
        splashPanel.add(titleLabel);
        splashPanel.add(Box.createVerticalGlue());

        return splashPanel;
    }

}
