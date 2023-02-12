package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int reverter = 0;
        while (number % 10 != 0) {
            reverter = reverter * 10 + number % 10;
            number /= 10;
        }
        System.out.println(reverter);
    }
}
