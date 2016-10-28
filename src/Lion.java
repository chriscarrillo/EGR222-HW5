import java.awt.*;
import java.util.*;

/**
 * Created by Chris on 10/27/16.
 */
public class Lion extends Critter {
    private Color color;
    private int count;

    // constructor of a Lion class
    public Lion() {
        setColor();
    }

    private Color setColor() {
        Random rand = new Random();
        int num = rand.nextInt(3);

        if (num == 0)
            return Color.RED;
        else if (num == 1)
            return Color.GREEN;
        else
            return Color.BLUE;
    }

    @Override
    public Action getMove(CritterInfo info) {
        if (info.getFront() == Neighbor.OTHER)
            return Action.INFECT;
        else if (info.getFront() == Neighbor.WALL || info.getRight() == Neighbor.WALL)
            return Action.LEFT;
        else if (info.getFront() == Neighbor.SAME)
            return Action.RIGHT;
        else
            return Action.HOP;
    }

    @Override
    public Color getColor() {
        this.count++;
        if ((this.count - 1) % 3 == 0) {
            Color someColor = setColor();
            this.color = someColor;
            return someColor;
        } else {
            return color;
        }
    }

    @Override
    public String toString() {
        return "L";
    }
}