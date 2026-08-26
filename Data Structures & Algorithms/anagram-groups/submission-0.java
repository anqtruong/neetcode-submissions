class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {

            char[] sortedArray = strs[i].toCharArray();
            Arrays.sort(sortedArray);
            String curr = new String(sortedArray);
            
            if (!map.containsKey(curr))
                map.put(curr, new ArrayList<>());

            map.get(curr).add(strs[i]);

        }

        return new ArrayList<>(map.values());

    }
}
