import java.util.Arrays;
import java.util.HashMap;

public class IntersectionOfTwoArrays_350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] res = new int[Math.min(nums1.length, nums2.length)];
        HashMap<Integer, Integer> freq = new HashMap<>(Math.max(nums1.length, nums2.length));

        for (int i : nums1.length > nums2.length ? nums1 : nums2) {
            if (freq.putIfAbsent(i, 1) != null) {
                freq.put(i, freq.get(i) + 1);
            }
        }
        int filled = 0;
        for (int i : nums1.length > nums2.length ? nums2 : nums1) {
            if (freq.get(i) != null && freq.get(i) > 0) {
                res[filled] = i;
                filled++;
                freq.put(i, freq.get(i) - 1);
            }
        }
        return Arrays.copyOfRange(res, 0, filled);
    }
}