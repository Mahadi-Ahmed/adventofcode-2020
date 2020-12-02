
/**
 * Advent of code day 1
 */
import java.util.*;
import java.io.*;

class expenseReport {

    public static ArrayList<Integer> data(String path) throws FileNotFoundException {
        ArrayList<Integer> input = new ArrayList<Integer>();
        File file = new File(path);
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine()) {
            Integer n = Integer.parseInt(sc.nextLine());
            input.add(n);
        }
        return input;
    }

    public static Integer sum2020(ArrayList<Integer> expenses) {
        for (int i = 0; i < expenses.size(); i++) {
            for (int j = 1; j < expenses.size(); j++) {
                if (expenses.get(i) + expenses.get(j) == 2020) {
                    return expenses.get(i) * expenses.get(j);
                }
            }
        }
        return 0;
    }

    public static Integer threefactorSum2020(ArrayList<Integer> expenses) {
        for (int i = 0; i < expenses.size(); i++) {
            for (int j = 1; j < expenses.size(); j++) {
                for (int k = 2; k < expenses.size(); k++) {
                    if (expenses.get(i) + expenses.get(j) + expenses.get(k) == 2020) {
                        System.out.println(expenses.get(i));
                        System.out.println(expenses.get(j));
                        System.out.println(expenses.get(k));
                        return expenses.get(i) * expenses.get(j) * expenses.get(k);
                    }
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Integer> expenses = data("input.txt");

        Integer result1 = sum2020(expenses);
        System.out.println("result part 1: " + result1);

        Integer result2 = threefactorSum2020(expenses);
        System.out.println("result part 2: " + result2);

    }
}