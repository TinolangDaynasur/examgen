import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class RoundedButton extends JButton {
    private int radius;
    private boolean pressed;

    public RoundedButton(String text, int radius) {
        super(text);
        this.radius = radius;
        setContentAreaFilled(false);
        setOpaque(false);
        setBorderPainted(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        if (getModel().isPressed()) {
            g2.setColor(getBackground().darker());
        } else {
            g2.setColor(getBackground());
        }

        g2.fillRoundRect(0, 0, getWidth(), getHeight(), radius, radius);

        // Draw the text
        g2.setColor(getForeground());
        FontMetrics metrics = g2.getFontMetrics(getFont());
        int x = (getWidth() - metrics.stringWidth(getText())) / 2;
        int y = ((getHeight() - metrics.getHeight()) / 2) + metrics.getAscent();
        g2.drawString(getText(), x, y);

        g2.dispose();
    }

    @Override
    protected void paintBorder(Graphics g)
    {
    }
}
