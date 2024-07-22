class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        // HashMap<String, Integer> map=new HashMap<>();
        // for(int i=0; i<names.length; i++){
        // map.put(names[i], heights[i]);
        // }
        // List<Map.Entry<String, Integer>> list=new ArrayList<>(map.entrySet());
        // list.sort((a, b)->b.getValue().compareTo(a.getValue()));
        // String ans[]=new String[names.length];
        // for(int i=0; i<list.size(); i++){
        // ans[i]=list.get(i).getKey();
        // }
        // return ans;

        int n = names.length;
        String[] ans = new String[n];
        Integer[] indices = new Integer[n];
        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }

        Arrays.sort(indices, (a, b) -> Integer.compare(heights[b], heights[a]));

        for (int i = 0; i < n; i++) {

            ans[i] = names[indices[i]];
        }

        return ans;
    }
}
