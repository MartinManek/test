import java.io.IOException;

public class FiboSeq {

    public static void main(String[] args) throws IOException {
        FiboRecursion fiboRecursion = new FiboRecursion();
        FibiMemory fibiMemory = new FibiMemory();
        int n = 20;


        long startTime = System.currentTimeMillis();
        final String recursionResult = fiboRecursion.fiboRecursionStart(n);
        long endTime = System.currentTimeMillis();

        long duration = (endTime - startTime);

        long startTime2 = System.currentTimeMillis();
        final String memoryResult = fibiMemory.fiboRecursionStart(n);
        long endTime2 = System.currentTimeMillis();

        long duration2 = (endTime2 - startTime2);

        System.out.println(recursionResult);
        System.out.println(memoryResult);
        System.out.println("fiboRecursion runned for " + duration);
        System.out.println("fibiMemory runned for " + duration2);
    }


}
