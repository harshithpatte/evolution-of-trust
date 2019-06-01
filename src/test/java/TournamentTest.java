import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TournamentTest {

   private Tournament tournament = new Tournament();

    @Test
    public void checkScoreAfterRound1(){
        tournament.startTournament(1);


        assertEquals(tournament.a.score, 4);
        assertEquals(tournament.b.score, 4);
        assertEquals(tournament.c.score, 4);
    }
    @Test
    public void checkScoreAfterRound2(){
        tournament.startTournament(20);


        assertEquals(tournament.a.score, 80);
        assertEquals(tournament.b.score, 80);
        assertEquals(tournament.c.score, 80);
    }
}