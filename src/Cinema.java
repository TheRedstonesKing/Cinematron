import java.util.List;

/**
 * Created by Florian on 01/07/2017.
 */
public class Cinema {

    private int room;

    private String name;

    private List<Film> filmList;

    private  Horaire horaire;

    public Cinema(int room,String name, List<Film> filmList, Horaire horaire) {

        this.room = room;
        this.name = name;
        this.filmList = filmList;
        this.horaire = horaire;
    }

    public int getRoom() {
        return room;
    }

    public String getName() {
        return name;
    }

    public int getTimeopened() {
        int closed = horaire.getClosed();
        int opened = horaire.getOpened();
        int timeopened = closed-opened;
        return timeopened;
    }

    public List<Film> getFilmList() {
        return filmList;
    }

    public int getDuree(){
        int duree = 0;
        for(Film film : filmList){
            duree += film.getDuree();
        }
        return duree;
    }

    public Horaire getHoraire() {
        return horaire;
    }

    @Override
    public String toString() {
        return "Cinema{" +
                "room=" + room +
                ", name='" + name + '\'' +
                ", filmList=" + filmList +
                ", horaire=" + horaire +
                '}';
    }
}
