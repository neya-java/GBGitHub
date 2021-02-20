import java.util.Random;
import java.util.Scanner;

public class Lesson4Task1 {
    public static char[][] map;
    public static final int SIZE = 5;
    public static final int DOT_TO_WIN = 4;
    public static final int SIZE_MINUS_DOT= SIZE-DOT_TO_WIN;
    public static final char DOT_EMPTY = '.';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static int counter_for_the_number_of_chips_on_a_single_line = 0;

    public static void main(String[] args) {
        initMap();
        printMap();

        while (true) {
            humanTurn();
            //printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Чел победил");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            //printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Комп победил");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("GameOver");

    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static Scanner sc = new Scanner(System.in);

    public static void humanTurn() {
        int x;
        int y;

        do {
            System.out.println("Ввдедите X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (isCellValid(x, y));
        map[y][x] = DOT_X;
        printMap();
    }

    public static Random rand = new Random();

    public static void aiTurn() {
        int x;
        int y;

        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (isCellValid(x, y));
        System.out.println("Компьютер ходил " + (x+1) + " " + (y+1));
        map[y][x] = DOT_O;
        printMap();
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
            return true;
        }
        if (map[y][x] == DOT_EMPTY){
            return false;
        }
        return false;
    }

//    public static boolean checkWin ( char symb ) {
//        if ( map [ 0 ][ 0 ] == symb && map [ 0 ][ 1 ] == symb && map [ 0 ][ 2 ] == symb ) return true ;
//        if ( map [ 1 ][ 0 ] == symb && map [ 1 ][ 1 ] == symb && map [ 1 ][ 2 ] == symb ) return true ;
//        if ( map [ 2 ][ 0 ] == symb && map [ 2 ][ 1 ] == symb && map [ 2 ][ 2 ] == symb ) return true ;
//        if ( map [ 0 ][ 0 ] == symb && map [ 1 ][ 0 ] == symb && map [ 2 ][ 0 ] == symb ) return true ;
//        if ( map [ 0 ][ 1 ] == symb && map [ 1 ][ 1 ] == symb && map [ 2 ][ 1 ] == symb ) return true ;
//        if ( map [ 0 ][ 2 ] == symb && map [ 1 ][ 2 ] == symb && map [ 2 ][ 2 ] == symb ) return true ;
//        if ( map [ 0 ][ 0 ] == symb && map [ 1 ][ 1 ] == symb && map [ 2 ][ 2 ] == symb ) return true ;
//        if ( map [ 2 ][ 0 ] == symb && map [ 1 ][ 1 ] == symb && map [ 0 ][ 2 ] == symb ) return true ;
//        return false ;
//    }

    /*public static boolean checkWin(char symb) {
        int counter_for_the_number_of_chips_on_a_single_line = 0;

        for (int i = 0; i < SIZE; i++) {
            counter_for_the_number_of_chips_on_a_single_line = 0;
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == symb) {
                    counter_for_the_number_of_chips_on_a_single_line++;
                }
                if (counter_for_the_number_of_chips_on_a_single_line == DOT_TO_WIN) {
                    return true;
                }
            }
        }

        for (int i = 0; i < SIZE; i++) {
            counter_for_the_number_of_chips_on_a_single_line = 0;
            for (int j = 0; j < SIZE; j++) {
                if (map[j][i] == symb) {
                    counter_for_the_number_of_chips_on_a_single_line++;
                }
                if (counter_for_the_number_of_chips_on_a_single_line == DOT_TO_WIN) {
                    return true;
                }
            }
        }

        counter_for_the_number_of_chips_on_a_single_line = 0;
        for (int i = 0; i< SIZE; i++) {
            if (map[i][i] == symb) {
                counter_for_the_number_of_chips_on_a_single_line++;
            }
            if (counter_for_the_number_of_chips_on_a_single_line == DOT_TO_WIN) {
                return true;
            }
        }

        counter_for_the_number_of_chips_on_a_single_line = 0;
        for (int i = 0; i< SIZE; i++) {
            if (map[i][SIZE-1-i] == symb) {
                counter_for_the_number_of_chips_on_a_single_line++;
            }
            if (counter_for_the_number_of_chips_on_a_single_line == DOT_TO_WIN) {
                return true;
            }
        }
        return false;
    }*/

    public static boolean checkWin(char symb) {


        for (int y = 0; y <= SIZE_MINUS_DOT; y++) {
            for (int z = 0; z <= SIZE_MINUS_DOT; z++) {
                for (int i = 0; i < SIZE - SIZE_MINUS_DOT; i++) {
                    counter_for_the_number_of_chips_on_a_single_line = 0;
                    for (int j = 0; j < SIZE - SIZE_MINUS_DOT; j++) {
                        if (map[i + y][j + z] == symb) {
                            counter_for_the_number_of_chips_on_a_single_line++;
                        }
                        if (counter_for_the_number_of_chips_on_a_single_line == DOT_TO_WIN) {
                            return true;
                        }
                    }

                }
            }
        }
        for (int y = 0; y <= SIZE_MINUS_DOT; y++) {
            for (int z = 0; z <= SIZE_MINUS_DOT; z++) {
                for (int j = 0; j < SIZE - SIZE_MINUS_DOT; j++) {
                    counter_for_the_number_of_chips_on_a_single_line = 0;
                    for (int i = 0; i < SIZE - SIZE_MINUS_DOT; i++) {
                        if (map[i + y][j + z] == symb) {
                            counter_for_the_number_of_chips_on_a_single_line++;
                        }
                        if (counter_for_the_number_of_chips_on_a_single_line == DOT_TO_WIN) {
                            return true;
                        }
                    }
                }
            }
        }

        for (int y = 0; y <= SIZE_MINUS_DOT; y++) {
            for (int z = 0; z <= SIZE_MINUS_DOT; z++) {
                counter_for_the_number_of_chips_on_a_single_line = 0;
                for (int i = 0; i < SIZE - SIZE_MINUS_DOT; i++) {
                    if (map[i + y][i + z] == symb) {
                        counter_for_the_number_of_chips_on_a_single_line++;
                    }
                    if (counter_for_the_number_of_chips_on_a_single_line == DOT_TO_WIN) {
                        return true;
                    }
                }
            }
        }

        for (int y = 0; y <= SIZE_MINUS_DOT; y++) {
            for (int z = 0; z <= SIZE_MINUS_DOT; z++) {
                counter_for_the_number_of_chips_on_a_single_line = 0;
                for (int i = 0; i < SIZE - SIZE_MINUS_DOT; i++) {
                    if (map[i + y][SIZE - SIZE_MINUS_DOT - 1 - i + z] == symb) {
                        counter_for_the_number_of_chips_on_a_single_line++;
                    }
                    if (counter_for_the_number_of_chips_on_a_single_line == DOT_TO_WIN) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean isMapFull() {
        for ( int i = 0 ; i < SIZE-1 ; i ++) {
            for ( int j = 0 ; j < SIZE-1 ; j ++) {
                if ( map [ i ][ j ] == DOT_EMPTY ) return false ;
            }
        }
        return true ;
    }
}