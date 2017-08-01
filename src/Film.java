/**
 * Created by Florian on 01/07/2017.
 */
public class Film {

    private String titre;
    private int duree;

    public Film(String titre, int duree) {
        this.titre = titre;
        this.duree = duree;
    }


    public String getTitre() {
        return titre;
    }

    public int getDuree() {
        return duree;
    }

    @Override
    public String toString() {
        return "Film{" +
                "titre='" + titre + '\'' +
                ", duree=" + duree +
                '}';
    }

}