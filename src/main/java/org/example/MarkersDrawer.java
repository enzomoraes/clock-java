package org.example;

import java.awt.*;

public class MarkersDrawer {

    public void execute(Graphics g) {

        g.setColor(Color.WHITE);

        int centerX = Constants.WIDTH / 2;
        int centerY = Constants.HEIGHT / 2;
        int OFFSET = 25;
        for (int i = 0; i < 360; i += 30) {
            int x1 = (int) (centerX + ((Constants.RADIUS - OFFSET) * Math.cos(Math.toRadians(i))));
            int y1 = (int) (centerY + ((Constants.RADIUS - OFFSET) * Math.sin(Math.toRadians(i))));
            int x2 = (int) (centerX + ((Constants.RADIUS - OFFSET - 20) * Math.cos(Math.toRadians(i))));
            int y2 = (int) (centerY + ((Constants.RADIUS - OFFSET - 20) * Math.sin(Math.toRadians(i))));

            g.drawLine(x1, y1, x2, y2);

        }

        for (int i = 0; i < 360; i += 6) {
            int x1 = (int) (centerX + ((Constants.RADIUS - OFFSET) * Math.cos(Math.toRadians(i))));
            int y1 = (int) (centerY + ((Constants.RADIUS - OFFSET) * Math.sin(Math.toRadians(i))));
            int x2 = (int) (centerX + ((Constants.RADIUS - OFFSET - 4) * Math.cos(Math.toRadians(i))));
            int y2 = (int) (centerY + ((Constants.RADIUS - OFFSET - 4) * Math.sin(Math.toRadians(i))));

            g.drawLine(x1, y1, x2, y2);
        }
    }

}
