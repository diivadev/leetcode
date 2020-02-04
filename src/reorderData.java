import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class reorderData {
    public String[] reorderLogFiles(String[] logs) {
        List<String> letterList = new ArrayList<>();
        List<String> digitList = new ArrayList<>();

        for (String i : logs){
            String [] l = i.split(" ");
            String c = l[1];
            if (Character.isDigit(c.trim().charAt(0))){
                digitList.add(i);
            } else {
                letterList.add(i);
            }

        }

        Collections.sort(letterList, new Comparator<String>() {
            public int compare(String o1, String o2) {
                String s1 = o1.substring(o1.indexOf(" ") + 1);
                String s2 = o2.substring(o2.indexOf(" ") + 1);

                if (s1.equals(s2)) {
                   return o1.compareTo(o2);
                }
                int x = s1.compareTo(s2);
                return s1.compareTo(s2);

            }
        });

        List<String> output = new ArrayList<>();
        for (String i : letterList) {
            output.add(i);
        }

        for (String i : digitList){
            output.add(i);
        }
        System.out.print(output);
        return output.toArray(new String [0]);
    }

    public static void main(String [] args){
        String [] logs =  {"dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"};
        reorderData d = new reorderData();
        d.reorderLogFiles(logs);
    }
}