class Solution {
    fun smallerNumbersThanCurrent(nums: IntArray): IntArray {
        return nums.map { value -> 
            nums.filter { num -> num < value}.size
        }.toIntArray()
    }
}