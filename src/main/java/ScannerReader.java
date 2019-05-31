import java.util.Scanner;

public class ScannerReader implements Reader {

    Scanner scanner = new Scanner(System.in);
    @Override
    public boolean isChoiceCooperative() {
        return scanner.nextBoolean();
    }
}
