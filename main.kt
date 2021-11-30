fun helpingTheRobot(purchases: Map<String, Int>, addition: Map<String, Int>) : MutableMap<String, Int> {
    val completeMap = purchases.toMutableMap()
    for ((keyP, valP) in purchases){
        for ((keyA, valA) in addition){
            if (keyP == keyA) {
                completeMap.put(keyP, valA + valP)
            } else {
                completeMap.put(keyA, valA)
            }
        }
    }
    return completeMap
}
