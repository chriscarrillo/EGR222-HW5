import java.awt.*;
import java.util.*;

/**
 * Created by Chris on 10/29/16.
 */
public class LancerChris extends Critter {
    private Color colors[] = {Color.RED, Color.BLUE, Color.GRAY, Color.MAGENTA};
    private int count;
    private int index;
    private String chars[] = {":D", ":)", ":|", ":("};

    public LancerChris() {
        this.count = 0;
        this.index = 0;
    }

    @Override
    public Action getMove(CritterInfo info) {
        if (info.getFront() == Neighbor.OTHER) {
            return Action.INFECT;
        } else if (info.getFront() == Neighbor.WALL || info.getLeft() == Neighbor.WALL) {
            return Action.RIGHT;
        } else if (info.getFront() == Neighbor.EMPTY) {
            return Action.HOP;
        } else {
            return Action.LEFT;
        }
    }

    @Override
    public Color getColor() {
        this.count++;
        if (this.count > 4) {
            this.count = 1;
        }
        return colors[count - 1];
    }

    @Override
    public String toString() {
        this.index++;
        if (this.index > 4) {
            this.index = 1;
        }
        return chars[index - 1];
    }
}
