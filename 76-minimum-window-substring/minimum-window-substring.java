class Solution {
    public String minWindow(String s, String t) {
        int[] target = new int[256];

        for(char ch : t.toCharArray()){
            target[ch]++;
        }
        int n =s.length();
        int i=0,j=0;
        int count =0;
        int required = t.length();
        int start =0;
        int minLength = Integer.MAX_VALUE;

        while(j<n){
            if(target[s.charAt(j)]>0){
                count++;
            }
            target[s.charAt(j)]--;

            while(count == required){
                if(minLength > j-i+1){
                    minLength = j-i+1;
                    start = i;
                }
                target[s.charAt(i)]++;
                if(target[s.charAt(i)]>0){
                    count--;
                }
                i++;
            }
            j++;
        }
        return (minLength == Integer.MAX_VALUE)?"":s.substring(start,start+minLength);
    }
}