import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;

class RoundedTextField extends JTextField {
    private int arcWidth;
    private int arcHeight;

    public RoundedTextField() {
        this(10, 10, 10); // default arcWidth and arcHeight
    }

    public RoundedTextField(int columns, int arcWidth, int arcHeight) {
        super(columns);
        this.arcWidth = arcWidth;
        this.arcHeight = arcHeight;
        setOpaque(false); // Make sure the component is not opaque
    }

    @Override
    protected void paintBorder(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getForeground());
        g2.draw(new RoundRectangle2D.Double(0, 0, getWidth() - 1, getHeight() - 1, arcWidth, arcHeight));
        g2.dispose();
    }

    @Override
    public Insets getInsets() {
        return new Insets(4, 10, 4, 10); // Adjust insets for text spacing
    }
}
