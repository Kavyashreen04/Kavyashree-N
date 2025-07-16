import java.util.*;

public class Problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the list of numbers separated by spaces:");
        String numList = scanner.nextLine();

        String[] numArray = numList.trim().split(" ");
        int[] numbers = new int[numArray.length];
        for (int i = 0; i < numArray.length; i++) {
            numbers[i] = Integer.parseInt(numArray[i]);
        }


        Map<Integer, Integer> result = new LinkedHashMap<>();
        for (int i = 1; i <= 9; i++) {
            result.put(i, 0);
        }

        for (int num : numbers) {
            for (int i = 1; i <= 9; i++) {
                if (num % i == 0) {
                    result.put(i, result.get(i) + 1);
                }
            }
        }

        System.out.print("{ ");
        for (int i = 1; i <= 9; i++) {
            if(i<9)
            System.out.print(i+":"+result.get(i)+" ,");
            else
            System.out.print(i+":"+result.get(i));
        }
        System.out.println(" }");
    }
}
