import java.util.HashMap;
import java.util.Map;

public class FibiMemory {

    int calculationCounter = 0;
    int cacheAccessCounter = 0;
    Map<Integer, Integer> resultCache = new HashMap<>();

    String fiboRecursionStart(int n) {
//        System.out.println("Input n: ");
//        Scanner sc = new Scanner(System.in);
//        final int n = Integer.parseInt(sc.next());;

        for (int i = 1; i <= n; i++) {
            System.out.printf("    Fib(%d)=%d\n", i, fib(n - (n - i)));
        }
//        System.out.println("Calculation runned " + calculationCounter + "times.");
//        System.out.println("Cache access runned " + cacheAccessCounter + "times.");

        return  "Calculation runned " + calculationCounter + "times." + "\nCache access runned " + cacheAccessCounter + "times.";
    }

    int fib(final int n) {
        final Integer result = resultCache.get(n);
        if (result != null) {
            System.out.println("        Result found: " + result + " for: " + n);
            cacheAccessCounter++;
            return result;
        }

        calculationCounter++;
        int f;
//        printf("n: %d\n", n);
        if (n == 0) {
            f = 0;
//            System.out.println("fib(0)");
        }
        else if (n == 1) {
            f = 1;
//            System.out.println("fib(1)");
        }

        else {
            f = fib(n - 1) + fib(n - 2);
//            System.out.println("      fib(" + n + " - 1) + fib(" + n + " - 2) ");
        }
        resultCache.put(n, f);

        return f;
    }
}
