import java.awt.*;

/**
 * Created by Chris on 10/27/16.
 */
public class Bear extends Critter {
    private int count;
    private boolean polar;

    public Bear(boolean polar) {
        this.count = 0;
        this.polar = polar;
    }

    @Override
    public Action getMove(CritterInfo info) {
        if (info.getFront() == Neighbor.OTHER)
            return Action.INFECT;
        else if (info.getFront() == Neighbor.EMPTY)
            return Action.HOP;
        else
            return Action.LEFT;
    }

    @Override
    public Color getColor() {
        if (this.polar)
            return Color.WHITE;
        else
            return Color.BLACK;
    }

    @Override
    public String toString() {
        this.count++;
        if (count % 2 == 1) {
            return "/";
        } else {
            return "\\";
        }
    }
}