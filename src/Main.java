import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Film f1, f2, f3, f4, f5, f6;
        f1 = new Film("Harry et les septs nains", 1);
        f2 = new Film("Michel aux pays des dinos", 3);
        f3 = new Film("Je suis pas fort", 4);
        f4 = new Film("Je suis pas très fort", 2);
        f5 = new Film("Je suis fort pour le peuple", 1);
        f6 = new Film("Test", 5);

        Horaire c1, c2, c3;
        c1 = new Horaire(11, 23);
        c2 = new Horaire(3,14);
        c3 = new Horaire(10 ,20);


        List<Film> listc1 = new ArrayList<>();
        listc1.add(f1);
        listc1.add(f2);
        listc1.add(f3);
        listc1.add(f6);

        List<Film> listc2 = new ArrayList<>();
        listc2.add(f1);
        listc2.add(f4);
        listc2.add(f5);

        List<Film> listc3 = new ArrayList<>();
        listc3.add(f2);
        listc3.add(f3);
        listc3.add(f5);

        Cinema un = new Cinema(5, "Cinématoche", listc1, c1);
        System.out.println(un);
        System.out.println("Durée : " + un.getDuree());
        System.out.println("Temps d'ouverture : " + un.getTimeopened());

        Cinema deux = new Cinema(3, "Toiles en papier maché", listc2, c2);
        System.out.println(deux);
        System.out.println("Durée : " + deux.getDuree());
        System.out.println("Temps d'ouverture : " + deux.getTimeopened());

        Cinema trois = new Cinema(1, "Le grand 154", listc3, c3);
        System.out.println(trois);
        System.out.println("Durée : " + trois.getDuree());
        System.out.println("Temps d'ouverture : " + trois.getTimeopened());

    }
}

/*
Sujet : http://i.imgur.com/w8fNm0k.png
 */