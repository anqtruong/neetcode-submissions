class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            char[] characters = strs[i].toCharArray();
            Arrays.sort(characters);
            String sol = new String(characters);

            if (!map.containsKey(sol))
                map.put(sol, new ArrayList<String>());
            
            map.get(sol).add(strs[i]);
        }
        return new ArrayList<>(map.values());

    }
}
