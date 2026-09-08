class Solution {
    public String toGoatLatin(String sentence) {
        String words[] = sentence.split(" ");
        String result = "";
        for(int i=0;i<words.length;i++){
            String word = words[i];
            Character firstChar = word.charAt(0);
            String transformed ="";
            if(firstChar=='a'||firstChar=='e'||firstChar=='i'||firstChar=='o'||firstChar=='u'||firstChar=='A'||firstChar=='E'||firstChar=='I'||firstChar=='O'||firstChar=='U'){
                transformed = word+"ma";
            }else{
                transformed = word.substring(1)+firstChar+"ma";
            }
            for(int j =0;j<=i;j++){
                transformed += 'a';
            }
            if(i==0){
                result = transformed;
            }else{
            result = result +" "+transformed;
        }
    }
        return result;
    }
   
}