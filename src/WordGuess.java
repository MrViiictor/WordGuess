public class WordGuess {
    private static final int MAX_NUM_FALL = 10;
    private static final String[] WORDS = {"agua", "árbol", "arena", "azúcar", "banco", "barco", "bosque", "brisa",
            "camino", "cielo", "ciudad", "cocina", "computadora", "corazón", "cuaderno", "cuerpo", "desierto",
            "día", "dinero", "estrella", "fuego", "fuerza", "gato", "guitarra", "historia", "invierno", "jardín",
            "lago", "lápiz", "libro", "lluvia", "luna", "luz", "madera", "mar", "mesa", "montaña", "música", "noche",
            "nube", "pájaro", "papel", "perro", "piedra", "puerta", "reloj", "río", "sol", "tierra", "viento"};
    private String hiddenWord;
    private boolean[] correctLetters;
    private int fails;

    public WordGuess(){
        fails = 0;
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

    public String getHiddenWord() {
        return hiddenWord;
    }

    public void shoot(String wordOrLetter){
        boolean acierto = false;
        if (wordOrLetter.length() == 1){
            for (int i = 0; i < hiddenWord.length(); i++){
                if (hiddenWord.charAt(i) == wordOrLetter.charAt(0)){
                    correctLetters[i] = true;
                    acierto = true;
                }

            }
            if (!acierto){
                fails++;
            }
        } else {
            if (hiddenWord.equals(wordOrLetter)){
            for (int i = 0; i < hiddenWord.length(); i++){
                correctLetters[i] = true;
                }



            }

        }
    }

    public boolean wins(){
    for (int i = 0; i < correctLetters.length; i++){
        if (!correctLetters[i]){
            return false;
        }
    }
    return true;
    }

    public boolean looses(){
        return fails > MAX_NUM_FALL;
    }



}
