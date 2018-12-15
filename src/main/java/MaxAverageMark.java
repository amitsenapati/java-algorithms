import java.util.*;
import java.util.stream.Collectors;

public class MaxAverageMark {

    public static void main(String[] args){
        Map<String, List<Integer>> markMap = new HashMap<>();;
        markMap.put("abc", Arrays.asList(10,12));
        markMap.put("bcd", Arrays.asList(15,18));
        markMap.put("def", Collections.singletonList(20));
        System.out.println(maxAverageMark(markMap));
    }

    static Double maxAverageMark(Map<String, List<Integer>> markMap){
        List<Double> averageMarks = markMap.keySet().stream()
                .map((k) -> averageOfList(markMap.get(k)))
                .collect(Collectors.toList());
        Double maxAverage = 0.0;
        for(Double mark : averageMarks){
            if(mark > maxAverage)
                maxAverage = mark;
        }
        return maxAverage;
    }

    static Double averageOfList(List<Integer> list){
        Double sum = 0.0;
        for(int i : list){
            sum += i;
        }
        return sum / list.size();
    }
}
