package Prometheus;

public class MatrixPrint {
    public static void main(String args[]) {
        int size = 5;

        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size; j++)
            {
                int count = size * i + j + 1;

                if (j == i || j == size - 1 - i)
                {
                    System.out.print(' ');
                    System.out.print('*');
                }
                else
                {
                    if (count < 10) {
                        System.out.print(' ');
                    }
                    System.out.print(count);
                }

                System.out.print(' ');
            }
            System.out.println();
        }
    }
}