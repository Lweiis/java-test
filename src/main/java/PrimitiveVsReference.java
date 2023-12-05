import java.util.concurrent.ThreadPoolExecutor;

public class PrimitiveVsReference {
    public static void main(String[] args) {
        // 原始类型
        int intValue = 1;
        System.out.println(intValue);
        add(intValue);
        System.out.println(intValue);

        // 包装类型
        Integer integerValue = 1;
        System.out.println(integerValue);
        add(integerValue);
        System.out.println(integerValue);
    }

    private static void add(Integer integer) {
        integer = integer + 1;
    }
}
