public class Solution{
    public static int maxDistance(List<List<Integer>> arrays) {
        int min=arrays.get(0).get(0);
        int max=arrays.get(0).get(arrays.get(0).size()-1);
        int maxDistance=0;
        for (int i = 1; i <arrays.size() ; i++) {
            int currentmin=arrays.get(i).get(0);
            int currentmax=arrays.get(i).get(arrays.get(i).size()-1);
            maxDistance=Math.max(maxDistance,Math.abs(currentmin-max));
            maxDistance=Math.max(maxDistance,Math.abs(currentmax-min));
            min=Math.min(min,currentmin);
            max=Math.max(max,currentmax);
        }
        return maxDistance;
    }

    public static void main(String[] args) {
        List<List<Integer>> arrays = new ArrayList<>();
        List<Integer> firstList = new ArrayList<>();
        firstList.add(1);
        firstList.add(2);
        firstList.add(3);
        arrays.add(firstList);
        List<Integer> secondList = new ArrayList<>();
        secondList.add(4);
        secondList.add(5);
        arrays.add(secondList);
        List<Integer> thirdList = new ArrayList<>();
        thirdList.add(1);
        thirdList.add(2);
        thirdList.add(3);
        arrays.add(thirdList);
        System.out.println(maxDistance(arrays));
    }}