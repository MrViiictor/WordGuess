public class Main {
    public static void main(String[] args) {
        boolean gameOver  = false;
        WordGuess word = new WordGuess();

        while (!gameOver){
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println(word);
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Introduce una letra o palabra:");
            String s = Input.readString();
            word.shoot(s);
            if (word.wins()){
                System.out.println("La palabra era:");
                System.out.println("~~~~~~~~~~~~~~");
                System.out.println(word);
                System.out.println("~~~~~~~~~~~~~~");
                System.out.println("Has ganado!");
                gameOver = true;
            } else {
                if (word.looses()){
                    System.out.println("~~~~~~~~~~~~~~");
                    System.out.println("Has perdido. La palabra era: " + word.getHiddenWord());
                    System.out.println("~~~~~~~~~~~~~~");
                    gameOver = true;
                }
            }
        }
    }
}

