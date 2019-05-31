public class CopyCat extends Player {
    private boolean isCooperative = true;
    private Player player;

    public CopyCat(String name, Player player) {
        super(name, () -> true);
        this.player = player;
    }

    @Override
    public boolean chooseToCooperate() {
        return isCooperative;
    }

    //    @Override
//    public void subtractCoins(int coins) {
//        if (isCooperative) {
//            reader = () -> false;
//            isCooperative = false;
//        }
//        score -= coins;
//    }
//
//    @Override
//    public void addCoins(int coins) {
//        if (!isCooperative) {
//            reader = () -> true;
//            isCooperative = true;
//        } else {
//
//        }
//        score += coins;
//    }
}

//consider state diagram