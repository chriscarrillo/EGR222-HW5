import java.awt.*;

/**
 * Created by Chris on 10/27/16.
 */
public class Giant extends Critter {
    private int count;
    private int index;
    private String[] words = {"fee", "fie", "foe", "fum"};

    public Giant () {
        this.count = 0;
        this.index = 0;
    }

    public Action getMove(CritterInfo info) {
        if (info.getFront() == Neighbor.OTHER)
            return Action.INFECT;
        else if (info.getFront() == Neighbor.EMPTY)
            return Action.HOP;
        else
            return Action.RIGHT;
    }

    @Override
    public Color getColor() {
        return Color.GRAY;
    }

    @Override
    public String toString() {
        this.count++;
        if ((this.count - 1) % 6 == 0) {
            if (index == 4)
                this.index = 0;
            this.index++;
            return words[index - 1];
        } else {
            return words[index - 1];
        }
    }
}