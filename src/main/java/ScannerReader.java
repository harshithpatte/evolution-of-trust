import java.util.Scanner;

public class ScannerReader implements Strategy {

    Scanner scanner = new Scanner(System.in);
    @Override
    public boolean isChoiceCooperative() {
        return scanner.nextBoolean();
    }
}
