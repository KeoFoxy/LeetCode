class Solution {
    fun numberOfEmployeesWhoMetTarget(hours: IntArray, target: Int): Int {
        var result = 0

    for (i in hours) {
        if (i >= target)
            result += 1;
    }

        return result;
    }
}