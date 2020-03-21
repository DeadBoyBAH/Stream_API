/**
 * Этот класс запускает программу.
 * Здесь генерируется строка и выводится, сколько раз встречается каждая буква в ней
 *
 * @version 21.03.2020
 * @author Pukin Alexey
 */
import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        String Strochka = generateStroka(60);
        System.out.println(Strochka);

        Character[] stroka = new Character[60];

        for (int i = 0; i < 60; i++) {      // присваиваю каждый элемент строки в массив, чтобы пользоваться им в StreamApi
            stroka[i] = Strochka.charAt(i);
        }

        int[] count = new int[26]; // создаю массив с кол-вом букв алфавита, куда буду записывать их кол-во в строке

        Arrays.stream(stroka).forEach(x -> count[(int) x - (int) 'a']++);  //записываю в массив алфавита кол-во встречающихся букв

        // вывод кол-ва букв в строке
        for (int i = 0; i < 26; i++) {
            System.out.println("Символ " + (char) ('a' + i) + " встречается в строке: " + count[i]);
        }

    }

    // метод генерации строки
    public static String generateStroka(int n) {
        String res = "";
        for (int i = 1; i <= n; i++) {
            char iter = 'a';
            res += (char) (iter + ((int) (Math.random() * 26)));
        }

        return res;
    }
}
