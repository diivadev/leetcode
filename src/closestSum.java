import java.util.*;

public class closestSum {
    public void findSum(List<List<Integer>> lista, List<List<Integer>> listb, int target){
       List<List<Integer>> list = new ArrayList<>();
       int delta = Integer.MAX_VALUE;

       for (List<Integer> list1 : lista){
           int num1 = list1.get(1);
            for (List<Integer> list2: listb){
                int num2 = list2.get(1);
                if ((num1 + num2) < target){
                    if (target - (num1 + num2) < delta){
                        list.clear();
                        list.add(new ArrayList<Integer>(Arrays.asList(list1.get(0), list2.get(0))));
                        delta = target - (num1 + num2);
                    } else {
                        list.add(new ArrayList<Integer>(Arrays.asList(list1.get(0), list2.get(0))));
                    }

                }
            }

       }
       System.out.println(list);
    }

    public static void main(String [] args){
        List<List<Integer>> listA = new ArrayList<>();
        List<List<Integer>> listB = new ArrayList<>();
        listA.add(new ArrayList<Integer>(Arrays.asList(1, 8)));
        listA.add(new ArrayList<Integer>(Arrays.asList(2, 15)));
        listA.add(new ArrayList<Integer>(Arrays.asList(3, 9)));
        listB.add(new ArrayList<Integer>(Arrays.asList(1, 8)));
        listB.add(new ArrayList<Integer>(Arrays.asList(2, 11)));
        listB.add(new ArrayList<Integer>(Arrays.asList(3, 12)));
        System.out.println("a = " + listA);
        System.out.println("b = " + listB);
        int target = 18;
        System.out.println("target is " + target);
        closestSum c = new closestSum();
        c.findSum(listA, listB, target);
    }
}