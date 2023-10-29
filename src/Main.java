import com.example.cards.Cards;
import com.example.cards.TypeOfCards;
import com.example.date.Date;
import com.example.fitness.Fitnes;
import com.example.person.Person;

import java.text.ParseException;


public class Main {
    public static void main(String[] args) throws ParseException {
        Person person =new Person("Alex","Drozdov","2000-01-01");
        Cards cards = new Cards("2024-01-01",person, TypeOfCards.ONCE);
        Cards cards1 = new Cards("2024-01-01",person, TypeOfCards.ONCE);
        Fitnes fit = new Fitnes();
        fit.fill(fit.getGroupExercises(),cards);
        fit.addToTask(fit.getGym(),cards1);
        fit.addToTask(fit.getWaterFall(),cards);
        fit.getAllTracks();
    }
}
