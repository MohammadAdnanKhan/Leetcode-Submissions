public class Solution{
public static int maxDistance(List<List<Integer>> arrays) {
    // Initialize min and max values with the first array's first and last elements
    int min = arrays.get(0).get(0);
    int max = arrays.get(0).get(arrays.get(0).size() - 1);
    int maxDistance = 0;

    // Traverse through the rest of the arrays
    for (int i = 1; i < arrays.size(); i++) {
        int currentMin = arrays.get(i).get(0);
        int currentMax = arrays.get(i).get(arrays.get(i).size() - 1);

        // Calculate the possible max distance using the current min and max with previous values
        maxDistance = Math.max(maxDistance, Math.abs(currentMax - min));
        maxDistance = Math.max(maxDistance, Math.abs(max - currentMin));

        // Update the global min and max
        min = Math.min(min, currentMin);
        max = Math.max(max, currentMax);
    }

    return maxDistance;
}}
