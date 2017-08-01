/**
 * Created by Florian on 01/08/2017.
 */
public class Horaire {

    private int opened;

    private int closed;


    public Horaire(int opened, int closed) {
        this.opened = opened;
        this.closed = closed;
    }

    public int getOpened() {
        return opened;
    }

    public int getClosed() {
        return closed;
    }


    @Override
    public String toString() {
        return "Horaire{" +
                "opened=" + opened +
                ", closed=" + closed +
                '}';
    }
}
