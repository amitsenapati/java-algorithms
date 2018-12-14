public class ReachNumber {
    public static void main(String[] args){
        ReachNumber classReach = new ReachNumber();
        System.out.println("Number of steps : " + classReach.reachNumber(-1));
    }
    public int reachNumber(int target){
        Integer start = 0;
        Integer loop = 0;
        for(int i = 1; start != target && loop <= 100; i++){
            loop++;
            System.out.println(start);
            int startpI = start + i;
            int startmi = start - i;
            int tagretP = startpI - target;
            int targetM = startmi - target;
            //boolean add = true;
            if((targetM == 0) ||((Math.abs(targetM) < Math.abs(tagretP)) && !((startpI + i + 1 == target) || (startpI - (i + 1)) == target))){
                start -= i;
            }else{
                start += i;
            }
        }
        return loop;
    }
}
