/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fii.pa.lab6;

import static java.awt.BorderLayout.CENTER;
import static java.awt.BorderLayout.NORTH;
import static java.awt.BorderLayout.SOUTH;
import javax.swing.JFrame;

/**
 *
 * @author mike
 */
public class MainFrame extends JFrame {

    ConfigPanel configPanel;
    DrawingPanel canvas;
    ControlPanel controlPanel;

    public MainFrame() {
        super("My Drawing Application");
        init();
    }

    private void init() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //create the components
        configPanel = new ConfigPanel(this);
        canvas = new DrawingPanel(this);
        controlPanel = new ControlPanel(this);

        //arrange the components in the container (frame)
        //JFrame uses a BorderLayout by default
        add(configPanel, NORTH);
        add(canvas, CENTER); //this is BorderLayout.CENTER
        add(controlPanel, SOUTH);

        //invoke the layout manager
        pack();
    }
}
