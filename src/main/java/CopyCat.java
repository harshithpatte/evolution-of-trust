public class CopyCat extends Player {

    public CopyCat(String name) {
        super(name, new CopyCatStrategy());

    }

    @Override
    public void subtractCoins(int coins) {
//        strategy.setBehaviour(false);
        score -= coins;
    }

    @Override
    public void addCoins(int coins) {
//        strategy.setBehaviour(true);
        score += coins;
    }
}

//consider state diagram