import java.util.Scanner;

public class Day16 {
    //Task11
    public static void Matrix(int n, int m) {
        int[][] array = new int[n][m];
        for (int i = 0; i < n * m; i++) {
            int row = i / m;
            int col = i % m;
            array[row][col] = row * col;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }


    //Task11
    public static int[][] f(int n, int m, int arr[][]) {
        arr[n][m] = n * m;
        if (n == 0 || m == 0)
            return arr;
        f(n - 1, m, arr);
        f(n, m - 1, arr);
        return arr;
    }

    public static void matrix(int n, int m) {
        int[][] array = new int[n][m];
        f(n - 1, m - 1, array);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }

    //Task6
    static int Palindrome(int n) {
        int rev = 0;
        for (int i = n; i > 0; i /= 10)
            rev = rev * 10 + i % 10;

        return (n == rev) ? 1 : 0;
    }

    static void palindromenum(int min, int max) {
        for (int i = min; i <= max; i++)
            if (Palindrome(i) == 1)
                System.out.print(i + " ");

    }

    //Task13
    public static void snakeArray(int n, int m) {
        int[][] array = new int[n][m];
        int val = 0;

        for (int i = 0; i < array.length; i++) {
            val = val + 1;
            if (i % 2 == 0) {
                for (int j = 0; j < m - 1; j++) {

                    array[i][j] = val;
                    val = val + 1;

                }

            }
            if (i % 2 == 1) {
                for (int j = m - 1; j >= 0; j--) {

                    array[i][j] = val;
                    val = val + 1;

                }
            }
            val = val - 1;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < m - 1; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }

    //Task5
    public static void primeFactors(int n) {
        while (n % 2 == 0) {
            System.out.print(2 + " ");
            n /= 2;
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                System.out.print(i + "*");
                n /= i;
            }
        }
        if (n > 2)
            System.out.println(n + "*");
    }

    //Task1
    public static void powerofN(int n) {
        int num = 1;
        if (n >= 1 && n <= 15) {
            for (int i = 1; i <= n; i++) {
                num = 2 * num;
            }
            System.out.println(num);
        } else
            System.out.println("Number in invalid");

    }

    public static void Task8(int x) {
        for (int i = 1; i <= x; i++) {
            System.out.print("\t");
            for (int j = 1; j <= x; j++) {
                if (i % 2 == 1 && j % 2 == 1 || i % 2 == 0 && j % 2 == 0) {
                    System.out.print("O");
                } else
                    System.out.print("X");
            }
            System.out.println();
        }
    }

    public static void Task5(int n) {
        boolean b = false;
        for (int i = 2; i <= n / 2; ++i) {
            if (n % i == 0)
                b = true;
            break;

        }
        if (!b) {
            System.out.println("the number is prime");
        } else
            System.out.println("The number is not prime");
    }

    public static void Task11(int n, int m) {
        int[][] array = new int[n][m];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = i * j;
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        powerofN(n);
        int x = sc.nextInt();
        Task8(x);
        Task5(n);
        primeFactors(n);
        int m = sc.nextInt();
        Task11(n, m);
        snakeArray(n, m);
        palindromenum(1600, 2100);
        matrix(n, m);
        Matrix(n, m);
    }
}


