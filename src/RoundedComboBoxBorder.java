import javax.swing.*;
import javax.swing.plaf.basic.BasicComboBoxUI;
import javax.swing.border.*;
import java.awt.*;
import java.awt.geom.*;

public class RoundedComboBoxBorder extends AbstractBorder {
    private int radius;

    public RoundedComboBoxBorder(int radius) {
        this.radius = radius;
    }

    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        Graphics2D g2 = (Graphics2D) g.create();

        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        Shape border = new RoundRectangle2D.Double(x, y, width - 1, height - 1, radius, radius);
        g2.setColor(UIManager.getColor("ComboBox.background"));
        g2.fill(border);

        g2.setColor(UIManager.getColor("ComboBox.foreground"));
        g2.draw(border);

        g2.dispose();
    }

    @Override
    public Insets getBorderInsets(Component c) {
        return new Insets(this.radius, this.radius, this.radius, this.radius);
    }

    @Override
    public Insets getBorderInsets(Component c, Insets insets) {
        insets.left = insets.top = insets.right = insets.bottom = this.radius;
        return insets;
    }

    public static void applyRoundedBorder(JComponent component, int radius) {
        Border border = new RoundedComboBoxBorder(radius);
        component.setBorder(border);
    }
}