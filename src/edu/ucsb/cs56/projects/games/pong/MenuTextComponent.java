package edu.ucsb.cs56.projects.games.pong;

import javax.swing.JComponent;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 * Created by angel on 2/20/16.
 */
public class MenuTextComponent extends MainMenuComponent implements MouseMotionListener {

    private boolean mouseEntered;
    private boolean mouseClicked;
    private boolean mousePrssed;
    private boolean mouseExited;
    private final int fontHeight;
    private final String title;
    private Color textColor = Color.WHITE;
    private Color backgroundColor;

    public MenuTextComponent(String title, Color backgroundColor) {
        super();
        fontHeight = 28;
        this.title = title;
        this.setPreferredSize(new Dimension(fontHeight*title.length(),fontHeight));
        this.backgroundColor = backgroundColor;

    }

    public String getTitle() {
        return title;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(backgroundColor);
        g.fillRect(0,0,600,480);
        g.setColor(textColor);
        g.setFont(new Font(Font.SANS_SERIF, Font.BOLD, fontHeight));
        TextArea text = new TextArea(title);
        // TextComponent
        g.drawString(title,0,fontHeight);
    }

    @Override
    public void mouseDragged(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseMoved(MouseEvent mouseEvent) {
        if((mouseEvent.getY() - this.getY()) < 28)
            textColor = Color.RED;
        else
            textColor = Color.BLUE;
        repaint();
    }


//    @Override
//    public void mouseEntered(MouseEvent mouseEvent) {
//        if(mouseEvent.getY()-this.getY() < 28) {
//            textColor = Color.RED;
//        } else {
//            textColor = Color.BLUE;
//        }
//        repaint();
//
//    }

}
