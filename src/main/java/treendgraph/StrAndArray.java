package treendgraph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StrAndArray {

  public String removeChars(String str, String remove){
    StringBuilder sb = new StringBuilder();
    HashMap<Character, Character> map = StrAndArray.getMapFromString(remove);

    for(int i = 0; i < str.length(); i++){

      if(!map.containsKey(str.charAt(i))){
        sb.append(str.charAt(i));
      }
    }

    return sb.toString();

  }


  public static HashMap<Character, Character> getMapFromString(String str){
    HashMap<Character, Character> hm = new HashMap<>();

    for (int i = 0; i < str.length(); i++){
        hm.put(str.charAt(i), str.charAt(i));
    }
    return  hm;
  }


  public String reverseWords(String str){

    String [] wordMap = str.split(" ");
    StringBuilder sb = new StringBuilder();

    int len = wordMap.length -1;
    for(int i = len; i > 0; i--){
      sb.append(wordMap[i]);
      sb.append(" ");
    }

    sb.append(wordMap[0]);
    return sb.toString();
  }

  public List<String> permutations(String str){
    List<String> result = new ArrayList<>();

    for(int i = 0; i < str.length(); i++){
        char x = str.charAt(i);
    }
  }
}
