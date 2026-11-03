public class WordGuess {
    private static final String[] WORDS = {"agua", "árbol", "arena", "azúcar", "banco", "barco", "bosque", "brisa",
            "camino", "cielo", "ciudad", "cocina", "computadora", "corazón", "cuaderno", "cuerpo", "desierto",
            "día", "dinero", "estrella", "fuego", "fuerza", "gato", "guitarra", "historia", "invierno", "jardín",
            "lago", "lápiz", "libro", "lluvia", "luna", "luz", "madera", "mar", "mesa", "montaña", "música", "noche",
            "nube", "pájaro", "papel", "perro", "piedra", "puerta", "reloj", "río", "sol", "tierra", "viento"};
    private String hiddenWord;
    private boolean[] correctLetters;

    public WordGuess(){
        int alea =(int)(Math.random()*WORDS.length);
        hiddenWord = WORDS[alea];
        correctLetters = new boolean[hiddenWord.length()];
        for (int i = 0; i < correctLetters.length; i++){
            correctLetters[i] = false;
        }
}

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < hiddenWord.length(); i++){
            if (correctLetters[i]){
                s = s + hiddenWord.charAt(i);
            } else {
                s = s + "-";
            }
        }
        return s;
    }

    public void shoot(String wordOrLetter){
        if (wordOrLetter.length() == 1){
            for (int i = 0; i < hiddenWord.length(); i++){
                if (hiddenWord.charAt(i) == wordOrLetter.charAt(0)){
                    correctLetters[i] = true;
                }

            } System.out.println("Has fallado, intentalo de nuevo");
        } else {
            if (hiddenWord.equals(wordOrLetter)){
            for (int i = 0; i < hiddenWord.length(); i++){
                correctLetters[i] = true;
                }

                } else {
                System.out.println("Te has equivocado, intenta de nuevo");
            }

        }
    }



}
