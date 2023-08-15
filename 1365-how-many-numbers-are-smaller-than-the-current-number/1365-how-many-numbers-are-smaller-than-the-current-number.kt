class Solution {
    fun smallerNumbersThanCurrent(nums: IntArray): IntArray {

    val sorted = nums.withIndex().sortedBy { it.value }

    val result = mutableMapOf<Int, Int>()
    var prevCount = -1  
    var prevNum = -1    

    for ((count, pair) in sorted.withIndex()) {
        if (pair.value != prevNum) {
            result[pair.index] = count
            prevCount = count
        } else {
            result[pair.index] = prevCount
        }
        prevNum = pair.value
    }

    return nums.indices.map { result[it]!! }.toIntArray()
    }
}