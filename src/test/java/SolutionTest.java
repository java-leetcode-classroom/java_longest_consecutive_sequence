import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  final private Solution sol = new Solution();
  @Test
  void longestConsecutiveExample1() {
    assertEquals(4, sol.longestConsecutive(new int[]{100,4,200,1,3,2}));
  }
  @Test
  void longestConsecutiveExample2() {
    assertEquals(9, sol.longestConsecutive(new int[]{0,3,7,2,5,8,4,6,0,1}));
  }
}