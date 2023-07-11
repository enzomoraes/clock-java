package org.example;

import java.awt.*;
import java.awt.geom.Line2D;
import java.time.LocalDateTime;

public class PointersDrawer {

    public void execute(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        int centerX = Constants.WIDTH / 2;
        int centerY = Constants.HEIGHT / 2;

        int SECONDS_POINTER_SIZE = Constants.RADIUS - 60;
        int MINUTES_POINTER_SIZE = Constants.RADIUS - 80;
        int HOURS_POINTER_SIZE = Constants.RADIUS - 120;

        LocalDateTime time = LocalDateTime.now();

        int hours = time.getHour();
        int minutes = time.getMinute();
        int seconds = time.getSecond();

        int xSeconds = (int) (centerX + Math.cos(Math.toRadians(seconds * 6)) * SECONDS_POINTER_SIZE);
        int ySeconds = (int) (centerY + Math.sin(Math.toRadians(seconds * 6)) * SECONDS_POINTER_SIZE);

        g2d.setColor(Color.red);
        g2d.drawLine(centerX, centerY, xSeconds, ySeconds);

        double xMinutes = (centerX + Math.cos(Math.toRadians(minutes + (double) seconds / 60 * 6)) * MINUTES_POINTER_SIZE);
        double yMinutes = (centerY + Math.sin(Math.toRadians(minutes + (double) seconds / 60 * 6)) * MINUTES_POINTER_SIZE);

        g2d.setColor(Color.black);
        g2d.draw(new Line2D.Double(centerX, centerY, xMinutes, yMinutes));

        double xHours = (centerX + Math.cos(Math.toRadians((hours + (double) minutes / 60) * 30)) * HOURS_POINTER_SIZE);
        double yHours = (centerY + Math.sin(Math.toRadians((hours + (double) minutes / 60) * 30)) * HOURS_POINTER_SIZE);

        g2d.setColor(Color.white);

        g2d.draw(new Line2D.Double(centerX, centerY, xHours, yHours));

    }

}
