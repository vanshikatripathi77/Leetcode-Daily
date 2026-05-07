class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> unsortedmap=new HashMap<>();
        for(int i=0;i<s.length();i++){
            unsortedmap.put(s.charAt(i),unsortedmap.getOrDefault(s.charAt(i),0)+1);
        }
        Map<Character,Integer> sortedMap=unsortedmap.entrySet()
        .stream()
        .sorted(Map.Entry.comparingByValue
        (Comparator.reverseOrder()))
        .collect(Collectors.toMap(
            Map.Entry::getKey,
            Map.Entry::getValue,
            (e1,e2)->e1,
            LinkedHashMap::new 
        ));
        StringBuilder sb=new StringBuilder();
        for(Map.Entry<Character,Integer>entry:sortedMap.entrySet()){
            Character ch=entry.getKey();
            Integer value=entry.getValue();
            while(value!=0){
                sb.append(ch);
                value--;
            }
        }
        String res=sb.toString();
        return res;
    }
}