
/*
 * в заданном интервале найти наибольшее число, которое делится на сумму цифр этого числа
 * (условие модифицировано на втором семинаре)
 */

 public class Task2DZ {
    
    public static int number(int min, int max) {
        int result = 0;
        for (int i = max; i > min; i--) {
            int bufferNumber = i;
            int divider = 0;
            while (bufferNumber > 0) {
                divider += bufferNumber % 10;
                bufferNumber /= 10;
            }
            if (i % divider == 0) {
                result = i;
                break;
            }
        }
        return result;
        
    }
    public static void main(String[] args) {
        System.out.println(number(15, 1569));
    }
}


