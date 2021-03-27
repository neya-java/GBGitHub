public class Main{
    private Object lock = new Object();

    public static void main(String[] args)  {
        final int SIZE = 10000000;
        final int HALF = SIZE / 2;

        metod1(SIZE,HALF);

        Main e = new Main();
        new Thread(() -> e.metod2(SIZE, HALF)).start();
        new Thread(() -> e.metod2(SIZE, HALF)).start();
    }

    static void metod1(int SIZE, int HALF){
        float[] arr1 = new float[SIZE];
        for (int i = 0; i < SIZE ; i++) {
            arr1[i] = 1;
        }
        long a = System.currentTimeMillis();
        System.out.println(a);
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (float)(arr1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) *
                    Math.cos(0.4f + i / 2));
        }
        long b = System.currentTimeMillis();
        System.out.println("medod1: " + (b - a));
        System.out.println();
    }

    public void metod2(int SIZE, int HALF){
        float[] arr2 = new float[SIZE];
        for (int i = 0; i < SIZE ; i++) {
            arr2[i] = 1;
        }
        long a = System.currentTimeMillis();
        System.out.println(a);

        synchronized (lock) {

            float[] arr2to1 = new float[HALF];
            float[] arr2to2 = new float[HALF];

            System.arraycopy(arr2, 0,
                    arr2to1, 0,
                    HALF);
            System.arraycopy(arr2, 500,
                    arr2to2, 0,
                    HALF);

            for (int i = 0; i < arr2to1.length; i++) {
                arr2to1[i] = (float) (arr2to1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) *
                        Math.cos(0.4f + i / 2));
            }
            for (int i = 0; i < arr2to2.length; i++) {
                arr2to2[i] = (float) (arr2to2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) *
                        Math.cos(0.4f + i / 2));
            }

            System.arraycopy(arr2to1, 0,
                    arr2, 0,
                    HALF);
            System.arraycopy(arr2to2, 0,
                    arr2, 500,
                    HALF);
            System.out.println("тест");
        }
        long b = System.currentTimeMillis();
        System.out.println("medod2: " + (b - a));

//        System.out.println(arr2to1.length + " " + arr2to2.length);
//        System.out.println(arr2.length);
    }


}