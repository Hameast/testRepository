package CGV;

import java.util.ArrayList;
import java.util.List;

public class CGV {
    private List<Movie> movies;
    private List<ScreenRoom> screenRooms;

    public CGV(List<Movie> movies, List<ScreenRoom> screenRooms) {
        this.movies = movies;
        this.screenRooms = screenRooms;
    }

    public void ChoiceMovie(){};
    public void ChoiceTime(){};
    public void Q_howmany(){};
    public void Q_age(){};
    public void ChoiceSeat(){};
    public void PrintReceipt(){};

    public void kiosk(){};
}
