class Solution {
    public int scoreOfString(String s) {
        char[] arr = s.toCharArray();
        ArrayList<Integer>ls = new ArrayList<>();
        int j = 0;
        for(int i=1;i<s.length();i++){
            int a = (int)arr[j];
            int b = (int)arr[i];
            int res = Math.abs(b-a);
            ls.add(res);
            j++;
        }
        int sum = 0;
        for(int i=0;i<ls.size();i++){
            sum += ls.get(i);
        }
        return sum;
    }
}