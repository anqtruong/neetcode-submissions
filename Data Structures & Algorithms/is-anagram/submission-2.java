class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length()!=t.length())
            return false;

        HashMap<Character,Integer> sMap = new HashMap<>();
        HashMap<Character,Integer> tMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (sMap.get(s.charAt(i)) != null) {
                sMap.put(s.charAt(i), sMap.get(s.charAt(i)) + 1);
                continue;
            }
            sMap.put(s.charAt(i), 0);
        }
        for (int i = 0; i < t.length(); i++) {
            if (tMap.get(t.charAt(i)) != null) {
                tMap.put(t.charAt(i), tMap.get(t.charAt(i)) + 1);
                continue;
            }
            tMap.put(t.charAt(i), 0);
        }

        return sMap.equals(tMap);

    }
}