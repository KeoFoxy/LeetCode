class Solution {
   fun medianSlidingWindow(nums: IntArray, k: Int): DoubleArray {

    val leftQueue = PriorityQueue<Int>(Collections.reverseOrder())
    val rightQueue = PriorityQueue<Int>()
    val result = ArrayList<Double>()
    var currNum = 0

    for (i in 0 until nums.size){
            currNum = nums[i]
            if (leftQueue.isEmpty()){
                leftQueue.offer(currNum)
            }else{
                if (nums[i]>leftQueue.peek()){
                    rightQueue.offer(currNum)
                }else{
                    leftQueue.offer(currNum)
                }
            }
            if (leftQueue.size>rightQueue.size+1 || leftQueue.size + 1 < rightQueue.size) rebalanceQueues(leftQueue, rightQueue)

            if (i>=k-1){
                if (leftQueue.size == rightQueue.size) result.add((leftQueue.peek().toDouble() + rightQueue.peek()) /2)
                else if (leftQueue.size>rightQueue.size) result.add(leftQueue.peek().toDouble())
                else result.add(rightQueue.peek().toDouble())

                if(!leftQueue.remove(nums[i-k+1])) rightQueue.remove(nums[i-k+1])
                if (leftQueue.size>rightQueue.size+1 || leftQueue.size + 1 < rightQueue.size) rebalanceQueues(leftQueue, rightQueue)
            }
        }
        return result.toDoubleArray()
    }
    fun rebalanceQueues(leftQueue: PriorityQueue<Int>, rightQueue: PriorityQueue<Int>){
        if (leftQueue.size>rightQueue.size+1){
            rightQueue.offer(leftQueue.poll())
        }else{
            leftQueue.offer(rightQueue.poll())
        }
    }
}