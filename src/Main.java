import bean.Car;
import jdk.internal.org.objectweb.asm.tree.analysis.Value;

import java.security.Key;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Car> cars = new ArrayList<Car>();
        cars.add(new Car(1,"法拉利A","红色"));
//        cars.add(new Car(1,"法拉利B","绿色"));
//        cars.add(new Car(1,"法拉利C","橙色"));
//        cars.add(new Car(2,"保时捷A","红色"));
//        cars.add(new Car(2,"保时捷B","绿色"));
        cars.add(new Car(2,"保时捷B","橙色"));


//        Map<Integer, List<Car>> collectMap = cars.stream().collect(Collectors.groupingBy(Car::getId));
//        System.out.println("转成Map<Integer, List<Car>>模式");
//        Set<Map.Entry<Integer, List<Car>>> entries = collectMap.entrySet();
//        for (Map.Entry<Integer, List<Car>> entry : entries) {
//            System.out.println(entry.getKey()+"::"+entry.getValue());
//        }
//        List<Car> cars1 = collectMap.get(cars.get(0).getId());
//        System.out.println("获取到对应分组的汽车集合"+cars1.toString());

        // 通过id进行list转成value是object的，要注意key的唯一性，否则会报错。
        Map<Integer, Car> collect = cars.stream().collect(Collectors.toMap(Car::getId, car -> car));
        collect.forEach((Key, Value) ->
                System.out.println(Key +"::"+ Value));

    }
}
