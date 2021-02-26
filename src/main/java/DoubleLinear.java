import java.util.*;

class DoubleLinear {

    public static int dblLinear(int n) {
        if (n == 0) return 1;
        //creat a sorted list (always sorted)
        SortedSet<Integer> resultList = new TreeSet<Integer>();
        //Codewar condition  u(0)=1
        resultList.add(1);
        for (int i = 0; i < n; i++) {
            //get the first element of our treeset
            int firstElement = resultList.first();
            resultList.add(firstElement * 2 + 1);
            resultList.add(firstElement * 3 + 1);
            resultList.remove(firstElement);
        }
        return resultList.first();
    }

}
