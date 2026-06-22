class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> hp=new HashMap<>();
        for(char ch:s.toCharArray()){
            hp.put(ch,hp.getOrDefault(ch,0)+1);
        }
        LinkedHashMap<Character, Integer> sortedMap = hp.entrySet()
        .stream()
        .sorted(Map.Entry.<Character, Integer>comparingByValue().reversed())
        .collect(Collectors.toMap(
            Map.Entry::getKey,
            Map.Entry::getValue,
            (e1, e2) -> e1,
            LinkedHashMap::new
        ));
        StringBuilder str=new StringBuilder();
        for(Map.Entry<Character,Integer> e:sortedMap.entrySet()){
            int c=e.getValue();
            while(c!=0){
                str.append(e.getKey());
                c--;
            }
        }
        return str.toString();
    }
}