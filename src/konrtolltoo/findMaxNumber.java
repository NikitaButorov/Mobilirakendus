


// *****************
//Дано целое число любой значности. Найти максимальную цифру в этом числе. Например, в числе 451212342 максимальной является 5.
// *****************




public class findMaxNumber {
    public static int findMaxNumber(long number) {
        // Преобразуем число в строку
        String numString = Long.toString(Math.abs(number));

        int maxDigit = 0;

        // Проходимся по каждому символу в строке
        for (int i = 0; i < numString.length(); i++) {
            // Получаем текущий символ
            char currentChar = numString.charAt(i);

            // Преобразуем символ в цифру
            int digit = Character.getNumericValue(currentChar);

            // Если текущая цифра больше максимальной, обновляем максимальную цифру
            if (digit > maxDigit) {
                maxDigit = digit;
            }
        }

        return maxDigit;
    }

    
}
