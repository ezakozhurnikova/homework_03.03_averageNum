import java.io.*;

public class Main {
    public static void main(String[] args) {

        /*Задача 1
Написать метод, читающий текстовый файл и возвращающий строку, состояшую из всех прочитанных строчек.
Пример: В файле имеется
aaa
bbbb
cc
Метод вернет aaa bbbb cc*/

string("input1.txt");

/*Задача 2
Есть не пустой текстовый файл такого вида:
1
2
3
4
5
Написать метод, возвращаюший среднее арифметическое всех этих чисел.

Присылайте ссылки на решения в Вашем гитхабе!*/

        averageNum("numbers.txt");


    }

    public static void string(String fileIn) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileIn))) {

            String a = br.readLine();
            String b = br.readLine();
            String c = br.readLine();

            System.out.println(a + " " + b + " " + " " + c);

        } catch (IOException e) {
            e.getMessage();
        }

    }

    public static void averageNum(String fileIn) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileIn))) {

            String num1 = br.readLine();
            String num2 = br.readLine();
            String num3 = br.readLine();
            String num4 = br.readLine();
            String num5 = br.readLine();
            int x = Integer.parseInt(num1);
            int y = Integer.parseInt(num2);
            int i = Integer.parseInt(num3);
            int j = Integer.parseInt(num4);
            int k = Integer.parseInt(num5);
            int averageNum = ((x + y + i + j + k) / 5);

            System.out.println(averageNum);

        } catch (IOException e) {
            e.getMessage();
        }

    }
}