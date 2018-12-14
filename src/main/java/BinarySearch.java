import java.util.*;

public class BinarySearch {

    public static void main(String args[] ) throws Exception {
        BinarySearch binarySearch = new BinarySearch();
        Scanner s = new Scanner(System.in);
        Integer cnt = s.nextInt();
        s.nextLine();
        String input = s.nextLine();
        List<String> arr = new ArrayList<String>();
        arr = Arrays.asList(input.split("\\s+"));
        Integer[] array = new Integer[cnt];
        for(int i = 0; i < arr.size(); i++){
            array[i] = Integer.parseInt(arr.get(i));
        }
        Arrays.sort(array);
        cnt = s.nextInt();
        while(cnt > 0){
            Integer q = s.nextInt();
            cnt--;
            int lower = 0;
            int higher = arr.size() - 1;
            System.out.println(binarySearch.findIndex(lower,higher,q,array));
        }
    }

    public int findIndex(int lower,int higher,int key, Integer[] array){
        while(lower < higher){
            int median = (int) Math.floor((lower + higher) / 2);
            if(array[lower] == key){
                return lower + 1;
            }else if(array[higher] == key){
                return higher + 1;
            }else if(array[median] < key){
                lower = median;
            }else if(array[median] > key){
                higher = median;
            }else{
                return median + 1;
            }
        }
        return -1;
    }
}
