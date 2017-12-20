package ceshi;
import java.util.*;



    //自定一个类使用增强for循环
    class MyList implements Iterable<String>{

        Object[] arr = new Object[10];

        int index = 0 ; //当前的指针

        public void add(Object o){
            arr[index++] = o;  // 1
        }

        public int size(){
            return index;
        }

        @Override
        public Iterator<String> iterator() {


            return new Iterator<String>() {

                int cursor  = 0;

                @Override
                public boolean hasNext() {
                    return cursor<index;
                }

                @Override
                public String next() {
                    return (String) arr[cursor++];
                }

                @Override
                public void remove() {

                }
            };
        }
    }


public class form {
        public static void main(String[] args) {
            MyList list = new MyList();
            list.add("张三");
            list.add("李四");
            list.add("王五");

            for(String item :list){
                System.out.println(item);
            }

            List<String> list1 = new ArrayList();
            list1.add("qqyumidi");
            list1.add("corn");
            list1.add("100");

                     for (int i = 0; i < list1.size(); i++) {
                             String name = (String) list1.get(i); // 1
                             System.out.println("name:" + name);
                        }

        }

    }
