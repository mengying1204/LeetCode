package Java_Study;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestHashMap {
    public static void main(String[] args) {
        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("01","蝈蝈");
        hashMap.put("02","帅帅");

        //使用keySet采用Iterator遍历HashMap
        Set<String> set = hashMap.keySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            String num = (String) iterator.next();
            String name = hashMap.get(num);
            System.out.println("num:"+num+" , name:"+name);
        }
        //使用EntrySet遍历HashMap
        Set<Map.Entry<String,String>> set1 = hashMap.entrySet();
        for (Map.Entry<String,String> entry: set1) {
            String num1 = entry.getKey();
            String name1 = entry.getValue();
            System.out.println("num1:"+num1+" , name1:"+name1);
        }
    }
}
