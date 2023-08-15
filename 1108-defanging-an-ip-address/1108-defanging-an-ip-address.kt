class Solution {
    fun defangIPaddr(address: String): String {
        // return address.replace(".", "[.]")
        var resultString = StringBuilder("")
        
        for(i in 0..address.length - 1){
            if(address[i] == '.')
                resultString.append("[.]")
            else 
                resultString.append(address[i])
        }
        
        return resultString.toString()
    }
}