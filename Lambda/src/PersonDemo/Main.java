package PersonDemo;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    /**
     * lambda的标准格式
     * 三部分组成
     *      a.一些参数
     *      b.一个箭头
     *      c.一段代码
     *    格式
     *    (参数列表) -> {一些重写方法的代码}
     *    说明：
     *      ():接口抽象方法的参数列表，没参就是空着，多参就逗号隔开
     *      ->传递参数给方法体
     *      {}重写接口的抽象方法
     * @param args
     */
    public static void main(String[] args) {
        Person[] arr = {
                new Person(11,"a"),
                new Person(22,"b"),
                new Person(33,"c"),
        };

//         升序排序就是前面-后面
        Arrays.sort(arr, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge()-o2.getAge();
            }
        });
//        Arrays.sort(arr,(Person o1, Person o2)->{
//            return o1.getAge()-o2.getAge();
//        });
        for (Person p :
                arr) {
            System.out.println(p);
        }
    }
}
