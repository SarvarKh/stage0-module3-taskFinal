package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int first = number / 1000;
        int second = (number % 1000) / 100;
        int third = ((number % 1000) % 100) / 10;
        int last = number % 10;
        int summ = first + second + third + last;

        System.out.println(summ);
    }
}
