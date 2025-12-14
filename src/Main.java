//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
            int[] inputArray1 = {15000, 20000, 12000, 18000, 22000};
            double[] outputArray1 = new double[4];
            int sum = 0;
            int max = inputArray1[0];
            int min = inputArray1[0];
            for (int payment : inputArray1) {
                sum += payment;
                if (payment > max) {
                    max = payment;
                }
                if (payment < min) {
                    min = payment;
                }
            }
            double average = (double) sum / inputArray1.length;
            outputArray1[0] = sum;
            outputArray1[1] = max;
            outputArray1[2] = min;
            outputArray1[3] = average;
            System.out.println("inputArray1: " + java.util.Arrays.toString(inputArray1));
            System.out.println("outputArray1: " + java.util.Arrays.toString(outputArray1));

            int[] inputArray2 = {50000, 60000, 75000, 80000, 90000};
            double[] outputArray2 = new double[inputArray2.length];
            for (int o = 0; o < inputArray2.length; o++) {
                outputArray2[o] = inputArray2[o] * 0.13;
            }
            System.out.println("inputArray2: " + java.util.Arrays.toString(inputArray2));
            System.out.println("outputArray2: " + java.util.Arrays.toString(outputArray2));

            int[] inputArray3 = {3000, 7000, 15000, 4000, 6000};
            boolean[] outputArray3 = new boolean[inputArray3.length];
            for (int o = 0; o < inputArray3.length; o++) {
                outputArray3[o] = inputArray3[o] > 5000;
            }
            System.out.println("inputArray3: " + java.util.Arrays.toString(inputArray3));
            System.out.println("outputArray3: " + java.util.Arrays.toString(outputArray3));

            int[] inputArray4 = {3000, 2500, 4000, 1500, -200};
            boolean outputArray4;
            outputArray4 = true;
            for (int balance : inputArray4) {
                if (balance < 0) {
                    outputArray4 = false; // Если найден отрицательный баланс, устанавливаем false
                    break; // Выходим из цикла, так как больше проверять не нужно
                }
            }
            System.out.println("inputArray4: " + java.util.Arrays.toString(inputArray4));
            System.out.println("outputArray4: " + outputArray4);

            for (int o = 1; o <= 5; o++) {
                //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
                // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
                System.out.println("o = " + o);
                int[] inputArray5 = {5000, -2000, 3000, 7000, 1000};
                int profitableMonthsCount = 0;
                for (int profit : inputArray5) {
                    if (profit > 0) {
                        profitableMonthsCount++;
                    }
                }
                int[] outputArray5 = new int[1];
                outputArray5[0] = profitableMonthsCount;
                System.out.println("inputArray5: " + java.util.Arrays.toString(inputArray5));
                System.out.println("outputArray5: " + java.util.Arrays.toString(outputArray5));
            }
        }
    }
}
