/*2 * Создать массив из слов
String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
"cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
"peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"}.
При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
сравнивает его с загаданным словом и сообщает, правильно ли ответил пользователь. Если
слово не угадано, компьютер показывает буквы, которые стоят на своих местах.
apple – загаданное
apricot - ответ игрока
ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
Угаданные в прошлые ответы буквы запоминать не надо. То есть при следующем ответе:
carpet (ковер, не фрукт, но это всего лишь пример), будет выведено:
####e##########
*/

import java.util.Random;
import java.util.Scanner;

public class Lesson3Task2 {
    public static void main(String[] args) {
        String [] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
                "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        Random rd = new Random();
        int index_word_in_massive = rd.nextInt(words.length);
        String random_word = words[index_word_in_massive];
        //System.out.println(random_word);

        System.out.println("Игра. Угадай слово. Перед вами список слов: ");
        System.out.println("\"apple\", \"orange\", \"lemon\", \"banana\", \"apricot\", \"avocado\", \"broccoli\", \"carrot\",\n" +
                "\"cherry\", \"garlic\", \"grape\", \"melon\", \"leak\", \"kiwi\", \"mango\", \"mushroom\", \"nut\", \"olive\", \"pea\",\n" +
                "\"peanut\", \"pear\", \"pepper\", \"pineapple\", \"pumpkin\", \"potato\"");

        gameStart(random_word);
    }

    static void gameStart(String random_word) {
        System.out.println("Введите понравившееся слово из списка: ");
        Scanner sc = new Scanner(System.in);
        String word_interred = sc.next();
        //System.out.println(word_interred);

        char[] word_char = {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'};
        for (int i = 0; i < random_word.length(); i++) {
            word_char[i] = random_word.charAt(i);
        }

        if (word_interred.equals(random_word)) {
            System.out.println("Поздравлямба. Вы угадали слово");
        } else {
            System.out.println("Ты не угадали. Ты лузер. ");
            System.out.println("Вот тебе подсказка. Откроем одну букву: ");
            Random rd1 = new Random();
            int rd_index_char_word = rd1.nextInt(random_word.length());
            for (int i = 0; i <= 14; i++) {
                if (i != rd_index_char_word) {
                    word_char[i] = '#';
                } else {
                    word_char[i] = random_word.charAt(i);
                }
                System.out.print(word_char[i]);
            }
            System.out.println(" ");
            gameStart(random_word);
        }

    }
}