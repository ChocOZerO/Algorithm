//: Playground - noun: a place where people can play

import Foundation

// Enter your code here
func numberOfTransmitters(arr: Array<Int>, range: Int) -> Int {
    let realRange = range * 2
    if arr.count == 1 { return 1 }
    var count = 1
    var firstInRange = arr[0]
    var centerInRage = arr[0]
    for index in stride(from: arr.startIndex + 1, to: arr.endIndex, by: 1) {
        if arr[index] - realRange > firstInRange {
            count += 1
            firstInRange = arr[index]
            centerInRage = arr[index]
            continue
        }
        if arr[index] - range == firstInRange || arr[index] - range < firstInRange {
            centerInRage = arr[index]
        } else if arr[index] - range > centerInRage {
            count += 1
            firstInRange = arr[index]
            centerInRage = arr[index]
            continue
        }
    }
    return count
}

//let input1 = (readLine() ?? "").split(separator: " ")
// let input1 = "5 1".split(separator: " ")
 let input1 = "8 2".split(separator: " ")
let n = Int(input1[0]) ?? 0, range = Int(input1[1]) ?? 0
//let input2 = (readLine() ?? "").split(separator: " ").map { Int($0) ?? 0 }.sorted(by: <)
// let input2 = "1 2 3 4 5".split(separator: " ").map { Int($0) ?? 0 }.sorted(by: <)
 let input2 = "7 2 4 6 5 9 12 11".split(separator: " ").map { Int($0) ?? 0 }.sorted(by: <)
print(numberOfTransmitters(arr: input2, range: range))
