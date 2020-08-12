import java.util.*;

class Program {
  public static List<List<String>> groupAnagrams(List<String> words) {
    // Write your code here.
		Map<String, List<String>> anagrams = new  HashMap<String, List<String>>();
		for(String word: words){
			char[] charArray =  word.toCharArray();
			Arrays.sort(charArray);
			String sortedStr = new String(charArray);
				
			if(anagrams.containsKey(sortedStr)){
				anagrams.get(sortedStr).add(word);
			}else{
				anagrams.put(sortedStr, new ArrayList<String>(Arrays.asList(word)) );
			}
			
		}
    return new ArrayList<>(anagrams.values());
  }
}
