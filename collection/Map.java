package collection;
import java.util.Set;
import java.util.TreeMap;
import java.util.*;
import java.lang.*;

public class Map {
    public static void main(String[] args) {
        String str = "aababcabcdabcde";
        TreeMap<Character,Integer> map = new TreeMap<Character,Integer>();
        char[] chs = str.toCharArray();
        for(Character ch:chs){
            Integer value = map.get(ch);
            if(value==null){
                map.put(ch, 1);
            }else{
                value++;
                map.put(ch, value);
            }
        }

        Set<Character> set = map.keySet();
        StringBuilder sb =  new StringBuilder();
        for(Character s:set){
            Integer value = map.get(s);
            sb.append(s).append("(").append(value).append(")");
        }

        System.out.println(sb.toString());






        Set<String> set_ = new HashSet();

        set_.add("a");
        set_.add("b");
        set_.add("c");
        set_.add("d");
        set_.add("e");
        set_.add("e");

        for(Iterator<String> iterator = set_.iterator();iterator.hasNext();){
            System.out.print(iterator.next()+" ");
        }

    }
}
//import java.util.*;
////Strawberry2013-04-29
//class MapDemo
//{
//    public static void main(String[] args)
//    {
//        Map<String, String> mp = new HashMap<String, String>();
//        mp.put("02", "zhangsan");
//        mp.put("01", "lisi");
//        mp.put("04", "wangwu");
//        //System.out.println(mp.put("01", "lisi"));     如果key已存在，在关联后，返回替换前该key对应的value值
//        //System.out.println(mp.put("01", "li33si"));   如果不存在，则返回null
//        ////////////////////////////////////////////////////
//        Set<String> setmap = mp.keySet();             //**(1)keySet()取出方式
//        Iterator<String> it = setmap.iterator();
//        while(it.hasNext())
//        {
//            System.out.println(mp.get(it.next()));  //有了键值key=it.next()，再使用get()方法获得value值
//        }
//
//        ////////////////////////////////////////////////////
//        Set<Map.Entry<String, String>> entrySet = mp.entrySet();//**(2)entrySet()取出方式
//        Iterator<Map.Entry<String, String>> it2 = entrySet.iterator();//Entry是Map接口中的内部接口
//        while(it2.hasNext())
//        {
//            Map.Entry<String, String> e = it2.next();
//            System.out.println(e.getKey() +":"+ e.getValue());  //getKey(),getValue是Map.Entry接口提供的方法
//        }
//    }
//}
//[java] view plain copy
///*
//要求：
//每个学生都有属性，姓名 年龄（姓名年龄作为主键）对应有归属地
//    Strawberry2013-4-29
//*/
//        import java.util.*;
//
//class Student
//{
//    private int age;
//    private String name;
//    Student(String name, int age)
//    {
//        this.name = name;
//        this.age = age;
//    }
//    public String getName()
//    {
//        return name;
//    }
//    public int getAge()
//    {
//        return age;
//    }
//    public int hashCode()
//    {
//        return name.hashCode()+age*17;
//    }
//    public boolean equals(Object obj)
//    {
//        if(!(obj instanceof Student))
//            throw new ClassCastException("error!");
//        Student s = (Student)obj;
//        return this.age==s.age && this.name.equals(s.name);
//    }
//}
//class MapDemo2
//{
//    public static void main(String[] args)
//    {
//        HashMap<Student, String> hm = new HashMap<Student, String>();
//        hm.put(new Student("java02", 10), "Beijing");
//        hm.put(new Student("java04", 40), "Wuhan");
//        hm.put(new Student("java01", 4), "Zhengzhou");
//
//        Set<Student> s1 = hm.keySet();                        //keySet()取出方式
//        Iterator<Student> it1 = s1.iterator();
//        while(it1.hasNext())
//        {
//            Student t1 = it1.next();
//            System.out.println(t1.getName()+" "+ t1.getAge() +" "+ hm.get(t1));
//        }
//
//        Set<Map.Entry<Student, String>> s2 = hm.entrySet(); //entrySet()取出方式
//        Iterator<Map.Entry<Student, String>> it2 = s2.iterator();
//        while(it2.hasNext())
//        {
//            Map.Entry<Student, String> mp = it2.next();
//            System.out.println(mp.getKey().getName()+".."+ mp.getKey().getAge() +".."+ mp.getValue());
//        }                       //获取key值    和value值
//    }
//}
//[java] view plain copy
///*
//要求：
//一字符串分别输出该字符串每个字符出现的次数
//    Strawberry2013-4-29
//*/
//        import java.util.*;
//
//class MapDemo2
//{
//    public static void main(String[] args)
//    {
//        String str = "abddkdsadjljasdak";
//        char[] ch = str.toCharArray();
//
//        TreeMap<Character, Integer> hm = new TreeMap<Character, Integer>(new Comp());
//        //此处泛型应该使用类名，不可以使用TreeMap<char, int>
//        for(int i=0; i<str.length(); i++)
//        {
//            if(hm.get(ch[i]) == null)
//                hm.put(ch[i], 1);
//            else
//                hm.put(ch[i], hm.get(ch[i])+1);
//        }
//
//        Set<Character> s = hm.keySet();
//        Iterator<Character> it = s.iterator();
//        while(it.hasNext())
//        {
//            char c = it.next();
//            System.out.print(c +"("+ hm.get(c) +") ");
//        }
//    }
//}
//class Comp implements Comparator<Character>   //定义一个比较器，使其按降序排列
//{
//    public int compare(Character c1, Character c2)
//    {
//        return c2.compareTo(c1);
//    }
//}
//[java] view plain copy
///*
//要求：
//    一个学校 有n多个教室， 一个教室有n多个学生
//    Strawberry2013-4-29
//分析：
//    一个学校和n多个教室是实际存在的事先必须定义完全，在使用school.put()来关联学校和教室
//*/
//        import java.util.*;
//
//class MapDemo2
//{
//    public static void main(String[] args)
//    {
//        Comp comp = new Comp();         //定义一个比较器，降序排列
//        TreeMap<String, TreeMap<String, String>> school = new TreeMap<String, TreeMap<String, String>>();   //默认序列
//
//        TreeMap<String, String> room1 = new TreeMap<String, String>(comp);  //降序
//        TreeMap<String, String> room2 = new TreeMap<String, String>(comp);
//        TreeMap<String, String> room3 = new TreeMap<String, String>(comp);
//
//        school.put("class01", room1);   //关联教室与学校
//        school.put("class02", room2);
//        school.put("class03", room3);
//
//        room1.put("04","zhang");        //关联学生和教室
//        room1.put("02","li");
//
//        room2.put("01","liu");
//        room2.put("02","zhang");
//
//        room3.put("07","wang");
//        room3.put("03","zhao");
//
//        Iterator<String> it1 = school.keySet().iterator();    //遍历教室
//        while(it1.hasNext())
//        {
//            String className = it1.next();
//            TreeMap<String, String> c = school.get(className);
//
//            System.out.println(className +"....");
//            Iterator<String> it2 = c.keySet().iterator(); //遍历学生
//            while(it2.hasNext())
//            {
//                String studentId = it2.next();
//                System.out.println(studentId +","+ c.get(studentId));
//            }
//        }
//    }
//}
//class Comp implements Comparator<String>                  //String比较器类
//{
//    public int compare(String s1, String s2)
//    {
//        return s2.compareTo(s1);
//    }
//}