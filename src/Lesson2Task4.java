public class Lesson2Task4 {
    public static void main(String[] args) {
        /* Создать квадратный двумерный целочисленный массив (количество строк и столбцов
            одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами
            (можно только одну из диагоналей, если обе сложно). Определить элементы одной из
            диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0],
            [1][1], [2][2], …, [n][n];*/
        System.out.println("Lesson2 #4");

        int [] [] arrayArray = new int[5][5];
        for ( int x = 0 ; x < 5 ; x ++) {
            for ( int y = 0 ; y < 5 ; y ++) {
                arrayArray [ x ][ y ] = 0 ;
                System.out.print (arrayArray [ x ][ y ] + "  " );
            }
            System.out.println ();
        }

        for ( int x = 0; x < 5; x++) {
            arrayArray[x] [x] = 1;
        }
        System.out.println(" ");

        int y = 4;
        for (int x = 0; x < 5 ; x++) {
            arrayArray [ x ][ y ] = 1;
            y--;
        }
        for ( int x = 0 ; x < 5 ; x ++) {
            for ( y = 0 ; y < 5 ; y ++) {
                System.out.print (arrayArray [ x ][ y ] + "  " );
            }
            System.out.println ();
        }
    }
}
