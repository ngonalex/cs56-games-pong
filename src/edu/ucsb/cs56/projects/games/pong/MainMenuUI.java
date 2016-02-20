package edu.ucsb.cs56.projects.games.pong;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by angel on 2/20/16.
 */
//TODO: Change MainMenuUI to MainMenu, they are the same thing
public class MainMenuUI {
    protected JFrame frame;
    protected JPanel panel;
    protected final int WIDTH = 640;
    protected final int HEIGHT = 480;

    private GridLayout gridLayout = new GridLayout(3,1);
    private InstructionsComponent instructionsComponent;
//    private HighScoreComponent highScoreComponent;
//    private PlayComponent playComponent;

    public MainMenuUI() {
        frame = new JFrame( "Main Menu" );
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel = new JPanel();
        frame.setSize( WIDTH, HEIGHT );
        frame.setLocationRelativeTo( null );
        frame.add(panel);
        ArrayList<MainMenuComponent> menuItems = new ArrayList<MainMenuComponent>();
        instructionsComponent = new InstructionsComponent();
        menuItems.add(instructionsComponent);
        panel.setSize(WIDTH, HEIGHT);
        panel.setBackground(Color.BLACK);
        panel.setOpaque(true);

        panel.setVisible(true);
        for(MainMenuComponent component: menuItems) {
            gridLayout.addLayoutComponent(component.getTitle(),instructionsComponent);
        }
        panel.setLayout(gridLayout);
        panel.add(instructionsComponent);
        frame.add(panel);
//        frame.setLayout(gridLayout);
//        frame.repaint();
        frame.setVisible(true);


    }

    public static void main(String[] args){
        MainMenuUI menu = new MainMenuUI();
    }

}
