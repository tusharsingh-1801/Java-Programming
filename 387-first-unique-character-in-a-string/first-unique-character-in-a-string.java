class Solution {
    public int firstUniqChar(String s) {
        
        HashMap<Character,Integer> m = new HashMap<>();
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<s.length();i++){
            if(!m.containsKey(s.charAt(i))){
                q.add(i);
            }
            m.put(s.charAt(i), m.getOrDefault(s.charAt(i), 0) + 1);

            while(q.size() > 0 && m.get(s.charAt(q.peek())) > 1){
                q.poll();
            }
        }
        
        if(q.isEmpty()){
            return -1;
        }else{
            return q.peek();
        }
    }
}