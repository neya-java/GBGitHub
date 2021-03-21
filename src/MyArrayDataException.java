public class MyArrayDataException extends RuntimeException{
    int i;
    int j;
    MyArrayDataException(String m, int i, int j){
    super(m);
    }
}
