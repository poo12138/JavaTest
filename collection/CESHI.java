package collection;
import java.util.*;
public class CESHI {
    public static void main(String[] args) {
        String str = "sasaxcxcadsad";
        TreeMap<Character, Integer> map = new TreeMap<Character, Integer>();
        char[] chs = str.toCharArray(); //返回一个字符数组，该字符数组中存放了当前字符串中的所有字符
        for (Character ch : chs) {
            Integer value=map.get(ch);
            if(value==null){
                map.put(ch,1);
            }else{
                value++;
                map.put(ch,value);
            }


        }
    }
}
