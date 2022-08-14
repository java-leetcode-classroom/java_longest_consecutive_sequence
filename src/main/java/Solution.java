import java.util.HashSet;

public class Solution {
  public int longestConsecutive(int[] nums) {
    HashSet<Integer> hash = new HashSet<>();
    for (int num : nums ){
      if (!hash.contains(num)) {
        hash.add(num);
      }
    }
    if (hash.size() == 1) {
      return 1;
    }
    int maxLen = 0;
    for (int num : hash) {
      if (!hash.contains(num-1)) {
        int currentNum = num;
        int currentLen = 1;
        while(hash.contains(currentNum+1)) {
          currentNum++;
          currentLen++;
        }
        maxLen = Math.max(maxLen, currentLen);
      }
    }
    return maxLen;
  }
}
