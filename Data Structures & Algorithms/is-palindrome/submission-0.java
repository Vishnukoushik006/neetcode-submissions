class Solution {
    public boolean isPalindrome(String s) {
        String s1 =  s.toLowerCase();
        char[] ch = s1.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<ch.length;i++){
          if(Character.isLetterOrDigit(ch[i])){
            sb.append(ch[i]);
          } 
        }
        String filtered = sb.toString();
        String reversed = sb.reverse().toString();
        
        return filtered.equals(reversed);
    }
}