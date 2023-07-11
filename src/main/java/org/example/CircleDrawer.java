package org.example;

import java.awt.*;

public class CircleDrawer {

    public void execute(Graphics g) {

        g.setColor(Color.GRAY);

        // Define circle center's coordinates
        int centerX = Constants.WIDTH / 2;
        int centerY = Constants.HEIGHT / 2;

        g.fillOval(centerX - Constants.RADIUS, centerY - Constants.RADIUS, Constants.RADIUS * 2, Constants.RADIUS * 2);
    }

}
