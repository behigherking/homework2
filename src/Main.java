import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    /*1. Функция для нахождения максимума
        Напишите функцию, которая принимает два числа и возвращает максимальное из них. Если числа равны, выбрасывайте исключение с сообщением об ошибке.*/
    static public int Bol(int x,int y){
        try{
            if(x==y) throw new Exception("Ошибка, числа равны");

            return Math.max(x,y);
        }
        catch(Exception ex){
            throw new RuntimeException(ex);

        }

    }

    /*    2. Калькулятор деления
Создайте функцию для деления двух чисел. Если делитель равен нулю, выбрасывайте ArithmeticException с сообщением о недопустимости деления на ноль.*/
    static public double calcDel(double x,double y){
        if (y==0) throw new ArithmeticException("Недопустимо делить на ноль");
        return x/y;
    }

    /*   3. Конвертер строк в числа
Напишите функцию, которая принимает строку и пытается конвертировать её в целое число. Если строка не может быть конвертирована, выбрасывайте NumberFormatException.*/
    public static int convert(String a){
        try{
            return Integer.parseInt(a);
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }

    }

    /*4. Проверка возраста
        Создайте функцию, которая принимает возраст и выбрасывает IllegalArgumentException, если возраст меньше нуля или больше 150.*/
    static public int ageS(int x){
        if (x <0|x>150) throw new IllegalArgumentException("Неверный возраст");
        return x;
    }
    /*  5. Нахождение корня
Реализуйте функцию, которая находит корень из числа. Если число отрицательное, выбрасывайте IllegalArgumentException.*/
    static public double kor(double x){
        if (x <0) throw new IllegalArgumentException("x меньше нуля");

        return Math.sqrt(x);
    }
    /*6. Факториал
Напишите функцию, которая вычисляет факториал числа. Если число отрицательное, выбрасывайте исключение.*/
    static public int factorio(int x){
        if (x <0) throw new IllegalArgumentException("x меньше нуля");
        if (x >1) return x*factorio(x-1);
        else return x;
    }
    /*7. Проверка массива на нули
Создайте функцию, которая проверяет массив на наличие нулей. Если в массиве есть нули, выбрасывайте исключение.*/
    static public Boolean checkMas(int[] x){
        for(int i:x){
            if (i == 0) throw new IllegalArgumentException("В массиве есть ноль");
        }
        return true;
    }
    /*8. Калькулятор возведения в степень
Реализуйте функцию, которая возводит число в степень. Если степень отрицательная, выбрасывайте исключение.
*/
    static  public double step(double x,double y){
        if (y<0) throw new IllegalArgumentException("Степень не может быть отрицательной");
        return Math.pow(x, y);
    }
    /* 9. Обрезка строки
Напишите функцию, которая принимает строку и число символов. Функция должна возвращать строку, обрезанную до указанного числа символов. Если число символов больше длины строки, выбрасывайте исключение.*/
    static  public String rezStr(String x,int y){
        if (y>x.length()) throw new IllegalArgumentException("Число символов больше длины строки");
        return x.substring(0,y);
    }
    /*10. Поиск элемента в массиве
        Напишите функцию, которая ищет элемент в массиве. Если элемент не найден, выбрасывайте исключение с сообщением об ошибке.*/
    static public Boolean serchI(int x[],int y){
        boolean g=false;
        for(int i:x){
            if (i == y) g=!g;
        }
        if(!g)throw new IllegalArgumentException("В массиве нет символа");
        return g;
    }
    /*11. Конвертация в двоичную систему
        Создайте функцию, которая конвертирует целое число в двоичную строку. Если число отрицательное, выбрасывайте исключение.*/
    static public String dobConv(int x){
        String str="";
        if(x<0)throw new IllegalArgumentException("Отрицательная степень");
        while(x>1){
            str+=Integer.toString(x%2);
            x=x/2;
        }
        str+=x;
        str=new StringBuilder(str).reverse().toString();
        return str;
    }
    /*12. Проверка делимости
Реализуйте функцию, которая принимает два числа и проверяет, делится ли первое число на второе. Если второе число равно нулю, выбрасывайте ArithmeticException.*/
    static  public Boolean deliCheck(int x,int y){
        if(y==0)throw new ArithmeticException("Делить на ноль нельзя");
        if(x%y==0)return true;
        else return false;
    }
    /*13. Чтение элемента списка
Напишите функцию, которая возвращает элемент списка по индексу. Если индекс выходит за пределы списка, выбрасывайте IndexOutOfBoundsException.*/
    static public int chekMass(int[] x, int y){
        if(x.length<=y)throw new IndexOutOfBoundsException("Индекс выходит за пределы");
        return x[y];
    }

    //
    static public class WeakPasswordException extends RuntimeException {
        public WeakPasswordException(String message) {
            super(message);    //To change body of overridden methods use File | Settings | File Templates.
        }}

    /*14. Парольная проверка
        Создайте функцию для проверки сложности пароля. Если пароль содержит менее 8 символов, выбрасывайте исключение WeakPasswordException.*/
    static public Boolean pasCheck(String x){
        if (x.length()<8) throw new WeakPasswordException("Пароль содержит менее 8 символов");
        return true;
    }
    /*15. Проверка даты
        Напишите функцию, которая проверяет, является ли строка корректной датой в формате "dd.MM.yyyy". Если формат неверен, выбрасывайте DateTimeParseException.*/
    static public LocalDate CheckDate(String x){
        DateTimeFormatter sp = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate c;
        try {
            c = LocalDate.parse(x,sp);
        }
        catch (DateTimeParseException ex){
            throw ex;
        }
        return c;
    }
    /*16. Конкатенация строк
Реализуйте функцию, которая объединяет две строки. Если одна из строк равна null, выбрасывайте NullPointerException.*/
    static public String nullCheckString(String x,String y){
        if(x==null|y==null) throw new NullPointerException("Нулевая строка");
        return x+y;
    }
    /*17. Остаток от деления
Создайте функцию, которая возвращает остаток от деления двух чисел. Если второе число равно нулю, выбрасывайте исключение.*/
    static public int restDivision(int x,int y){
        if (y==0) throw new ArithmeticException("Недопустимо делить на ноль");
        return x%y;
    }
    /*18. Квадратный корень
Реализуйте функцию, которая находит квадратный корень числа. Если число отрицательное, выбрасывайте исключение.*/
    static public double sqrtNew(int x){
        if (x <0) throw new IllegalArgumentException("x меньше нуля");

        return Math.sqrt(x);
    }
    /*19. Конвертер температуры
Напишите функцию, которая переводит температуру из Цельсия в Фаренгейт. Если температура меньше абсолютного нуля, выбрасывайте исключение.*/
    static public double celci(double x){
        if (x <-273.16) throw new IllegalArgumentException("температура меньше абсолютного нуля");
        return x*33.8;
    }
    /* 20. Проверка строки на пустоту
Создайте функцию, которая проверяет, является ли строка пустой или null. Если строка пустая или равна null, выбрасывайте исключение.*/
    static public String nullEmptyCheckString(String x){
        if(x==null|x=="") throw new NullPointerException("Нулевая строка");
        return x;
    }




    public static void main(String[] args) {


        //Задача 1
        //System.out.println(Bol(5, 5));
        //Задача 2
        //System.out.println(calcDel(5 , 0));
        //Задача 3
        //System.out.println(convert("4"));
        //Задача 4
        //System.out.println(ageS(1701));
        //Задача 5
        //System.out.println(kor(-1));
        //Задача 6
        //System.out.println(factorio(10));
        //Задача 7
        int[] m=new int[]{4,5,1};
        //System.out.println(checkMas(m));
        //Задача 8
        //System.out.println(step(4, -2));
        //Задача 9
        //System.out.println(rezStr("hiiii", 5));
        //Задача 10
        //System.out.println(serchI(m, 3));
        //Задача 11
        //System.out.println(dobConv(2));
        //Задача 12
        //System.out.println(deliCheck(10, 5));
        //Задача 13
        //System.out.println(chekMass(m,3));
        //Задача 14
        //System.out.println(pasCheck("12345670"));
        //Задача 15
        //System.out.println(CheckDate("22.08.2012"));
        //Задача 16
        //System.out.println(nullCheckString("y",null ));
        //Задача 17
        //System.out.println(restDivision(4, 0));
        //Задача 18
        //System.out.println(sqrtNew(-1));
        //Задача 19
        //System.out.println(celci(-273.17));
        //Задача 20
        //System.out.println(nullEmptyCheckString("12"));
    }
}