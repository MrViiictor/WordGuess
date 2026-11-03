public class Main {
    public static void main(String[] args) {
        boolean gameOver  = false;
        WordGuess word = new WordGuess();

        while (!gameOver){
            System.out.println(word);
            System.out.println("Introduce una letra o palabra");
            String s = Input.readString();
            word.shoot(s);
        }
    }
}

