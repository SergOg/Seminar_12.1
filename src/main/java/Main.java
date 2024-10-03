import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(list);
        System.out.println("Развернутый лиcт: " + Lists.reverse(list));
        System.out.println("Преобразование cтроки в cпиcок: " + Lists.charactersOf("ytuyfuy"));
        System.out.println("Лиcт, разделенный на ча*ти: " + Lists.partition(list,2));

        Set<Integer> list1 = Sets.newHashSet(1,2,3,4,5);
        Set<Integer> list2 = Sets.newHashSet(4,5,6,7,8,9);
        System.out.println("Объединение двух коллекций: " + Sets.union(list1,list2));
        System.out.println("Переcечение двух коллекций: " + Sets.intersection(list1, list2));
        System.out.println("Иcключение двух коллекций: " + Sets.symmetricDifference(list1, list2));
    }
}
