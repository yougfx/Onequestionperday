package Leetcode.October;

public class day23_492 {
    public int[] constructRectangle(int area) {
        for (int i = (int)(Math.sqrt(area)); ;i--) {
            if (area % i == 0) return new int[]{area / i, i};
        }
    }

}
