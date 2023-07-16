package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;


public class ClockDrawer extends JPanel {


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.WHITE);

        Graphics2D g2d = ((Graphics2D) g);

        // Rotating 90 degrees backwards
        AffineTransform transform = new AffineTransform();
        transform.rotate(Math.toRadians(-90), Constants.WIDTH / 2, Constants.HEIGHT / 2);
        g2d.setTransform(transform);

        CircleDrawer circleDrawer = new CircleDrawer();
        MarkersDrawer markersDrawer = new MarkersDrawer();
        PointersDrawer pointersDrawers = new PointersDrawer();

        circleDrawer.execute(g);
        markersDrawer.execute(g);
        pointersDrawers.execute(g);

    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(Constants.WIDTH, Constants.HEIGHT);
    }


}
