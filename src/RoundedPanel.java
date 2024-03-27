import javax.swing.*;
import java.awt.*;

public class RoundedPanel extends JPanel {
    private int cornerRadius;

    public RoundedPanel(int cornerRadius) {
        this.cornerRadius = cornerRadius;
        setOpaque(false); // Make panel transparent
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int width = getWidth();
        int height = getHeight();

        // Draw rounded corners
        Graphics2D graphics = (Graphics2D) g.create();
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        graphics.setColor(getBackground());
        graphics.fillRoundRect(0, 0, width - 1, height - 1, cornerRadius, cornerRadius);
        graphics.dispose();
    }

    // Optional: Set corner radius dynamically
    public void setCornerRadius(int cornerRadius) {
        this.cornerRadius = cornerRadius;
        repaint();
    }
}
