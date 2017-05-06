package test;

import java.util.*;

/**
 * 京东
 * 采购单
 */

public class Test2 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        List<Integer> priceList = new ArrayList<>();
        List<Integer> countList = new ArrayList<>();
        Map<String,Integer> toBuyMap = new HashMap<>();

        while (in.hasNext()){
            int n = in.nextInt();
            int m = in.nextInt();

            for (int i=0;i<n;i++){
                priceList.add(in.nextInt());
            }

            for (int j=0;j<m;j++){
                String name = in.next();
                if (toBuyMap.containsKey(name)){
                    int count = toBuyMap.get(name);
                    toBuyMap.put(name,++count);
                }else {
                    toBuyMap.put(name,1);
                }
            }

            Set<Map.Entry<String,Integer>> entrySet = toBuyMap.entrySet();

            for(Map.Entry<String, Integer> entry_:entrySet){
                countList.add(entry_.getValue());
            }

            int max = 0;
            int min = 0;
            Collections.sort(countList);
            Collections.sort(priceList);
            Collections.reverse(countList);
            Collections.reverse(priceList);

            for (int i =0;i<countList.size();i++){
                max += countList.get(i) * priceList.get(i);
            }

            Collections.reverse(priceList);
            for (int i =0;i<countList.size();i++){
                min += countList.get(i) * priceList.get(i);
            }

            System.out.println(min+" "+max);

            toBuyMap.clear();
            countList.clear();
            priceList.clear();
        }

    }
}


