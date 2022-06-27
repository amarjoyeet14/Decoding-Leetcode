class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char x = s.charAt(i), y = t.charAt(i);
            if(map.containsKey(x)){
                if(map.get(x)!=y)
                    return false;      
            }
            else{
                if(map.containsValue(y))
                    return false;
                else
                    map.put(x,y);
            }
        }
        return true;

    }
}