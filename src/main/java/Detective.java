//public class Detective extends Player {
//    private int turnNumber = 1;
//    public Detective(String name, Strategy strategy) {
//        super(name, () -> true);
//    }
//
//    @Override
//    public boolean chooseToCooperate() {
//        turnNumber++;
//        if (turnNumber == 2) {
//            strategy = () -> false;
//        }
//        if (turnNumber == 3) {
//            strategy = () ->  true;
//        }
//        return super.chooseToCooperate();
//    }
//
//    @Override
//    public void subtractCoins(int coins) {
//        strategy = () -> false;
//        super.subtractCoins(coins);
//    }


//}
