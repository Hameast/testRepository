import CGV.CGV;
import CGV.Movie;
import CGV.ScreenRoom;

import java.util.ArrayList;

public class MainFile {
    public static void main(String[] args) {
        ArrayList<Movie> movies = new ArrayList<Movie>();
        ArrayList<ScreenRoom> screenRooms = new ArrayList<ScreenRoom>();

        movies.add(new Movie("1917", 15, "A"));
        movies.add(new Movie("무간도", 12, "B"));
        movies.add(new Movie("타짜", 18, "A"));
        movies.add(new Movie("스폰지밥 극장판", -1, "B"));

        screenRooms.add(new ScreenRoom("A", 6, 15));
        screenRooms.add(new ScreenRoom("B", 7, 20));

        CGV cgv = new CGV(movies, screenRooms);

        cgv.kiosk();
    }
}
