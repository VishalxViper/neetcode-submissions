class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> mp = new HashMap<>();

        for (String ele : strs) {
            int[] freq = new int[26];

            for (char val : ele.toCharArray()) {
                freq[val - 'a']++;
            }
            String value = Arrays.toString(freq);
            if (!mp.containsKey(value)) {
                mp.put(value, new ArrayList<>());
            }
            mp.get(value).add(ele);
        }

        List<List<String>> res = new ArrayList<>();
        res.addAll(mp.values());

        return res;
    }
}