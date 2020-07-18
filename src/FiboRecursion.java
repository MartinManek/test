/**************************

 Online C Compiler.
 Code, Compile, Run and Debug C program online.
 Write your code in this editor and press "Run" button to compile and execute it.

 **************************
#include<stdio.h>

        int main(void) {
        int i,n;
        printf("Input n:");
        scanf("%d",&n);
        for(i=1;i<=n;i++)
            printf("Fib (%d)=%d\n",i, Fib(n-(n-i)));
        return 0;
        }

        int Fib(int n){
        int f;
        printf("n: %d\n", n);
        if(n==0)
        f=0;
        else if(n==1)
        f=1;
        else
        f= Fib(n-1) + Fib(n-2);
        return f;
        }
 */
public class FiboRecursion {
    int coutner = 0;

    String fiboRecursionStart(int n) {
//        System.out.println("Input n: ");                   //printf("Input n:");
//        Scanner sc = new Scanner(System.in);               //scanf("%d",&n);
//        final int n = Integer.parseInt(sc.next());;        //scanf("%d",&n);

        for (int i = 1; i <= n; i++) {                      //for(i=1;i<=n;i++)
            System.out.printf(" Fib(%d)=%d\n", i, fib(n - (n - i)));            //printf("Fib (%d)=%d\n",i, Fib(n-(n-i)));

        }

        System.out.println("fib runned " + coutner + "times.");

        return "Fib Recursion runned " + coutner + "times.";
    }

    int fib(final int n) {
        coutner++;

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
//            System.out.println("fib(" + n + " - 1) + fib(" + n + " - 2) ");
        }

        return f;
    }
}
