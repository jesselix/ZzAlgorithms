package li.jesse.leetcode;

import org.junit.jupiter.api.Test;

public class MaxConsecutiveOnesTest
{
    int[] testArray =  {0, 1, 0, 0, 0, 1, 1, 1};

    @Test
    public void testMaxConsecutiveOnes()
    {
        int result = MaxConsecutiveOnes.maxConsecutiveOnes(testArray);

        System.out.println(result);
    }
}
