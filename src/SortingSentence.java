class SortingSentence {
    public static String removeLastChars(String str, int chars) {
        return str.substring(0, str.length() - chars);
    }
    public String sortSentence(String s) {
        String[] sentence = new String[4];
        sentence = s.split("\\s");
        System.out.print(sentence);


        for(int i=0;i<sentence.length;i++){
            for(int j=i+1;j<sentence.length;j++){

                if(sentence[i].charAt(sentence[i].length()-1) < sentence[j].charAt(sentence[j].length()-1))
                {
                    String word = sentence[i];
                    sentence[i] = sentence[j];
                    sentence[j] = word;

                }
            }
        }

        String newSentence = "";

        for( int i=0;i<sentence.length;i++){
            newSentence = removeLastChars(sentence[i],1) + " " + newSentence;
        }

        return newSentence.trim();


    }
}