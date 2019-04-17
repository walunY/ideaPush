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
	// 使用lambda表达式实现多线程
        new Thread(()-> System.out.println(Thread.currentThread().getName())).start();
    }
}
