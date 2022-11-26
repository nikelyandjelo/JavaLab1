public class lab3 {
    static String FirstLetter(String str)
    {

        // Розділння рядку на основі пробілу
        String[] arrayOfString = str.split(" ");

        // Рядок для збереження отриманого рядка
        String resultantString = "";

        // Видалення першої літери
        for (String a : arrayOfString) {
            resultantString += a.substring(1) + " ";
        }

        return resultantString;
    }
    public static void main(String[] args) {
        String actualString = "Hello. My name is Veronika!";
        System.out.println("Actual string: " + actualString);
        System.out.println("Resultant string: " + FirstLetter(actualString));
    }
}
