public class CopyCatStrategy implements Strategy {
    private boolean shouldCooperate = true;
    @Override
    public boolean isChoiceCooperative() {
        return shouldCooperate;
    }

//    @Override
//    public void setBehaviour(boolean isCooperativeBehaviour) {
//        shouldCooperate = isCooperativeBehaviour;
//    }

}
