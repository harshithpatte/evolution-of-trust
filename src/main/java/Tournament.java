public class Tournament {

    Player a;
    Player b;
    Player c;


    private void initializePlayers(){

        a = new CooperativeBot("AKASH");
        b = new CooperativeBot("Copyplayer");
        c = new CooperativeBot("Cooperative");

    }


    public void startTournament(int i) {
        initializePlayers();
        while(i > 0) {
            playRound();
            i--;
        }

        System.out.println(getWinner().score);


    }



    public void playRound(){

        Game game1 = new Game(a,b);
        game1.play();
        Game game2 = new Game(b,c);
        game2.play();
        Game game3 = new Game(c,a);
        game3.play();


    }


    public Player getWinner(){


        if(a.score > Math.max(b.score,c.score)){
            return a;
        }
        else{

            if(b.score > c.score){
                return b;
            }

            else {
                return c;
            }
        }


    }

}
