package li.jesse.question.leetcode;

/*
342. Power of Four
Easy

Given an integer (signed 32 bits), write a function to check whether it is a power of 4.

Example:
Given num = 16, return true. Given num = 5, return false.

Follow up: Could you solve it without loops/recursion?
 */

public class PowerOfFour
{
    public static boolean isPowerOfFour(int num)
    {
        // 0x55555555 == 0101 0101 0101 0101 0101 0101 0101 0101
        return (num & num - 1) == 0 && (num & 0x55555555) == num;
    }
}
