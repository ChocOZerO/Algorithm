import Foundation

/*
 * Complete the birthdayCakeCandles function below.
 */
func birthdayCakeCandles(n: Int, ar: [Int]) -> Int {
    /*
     * Write your code here.
     */
    if n == 0 { return 0 }
    var result = 0
    var arr = ar
    arr.sort(by: <)
    var beforeIndex = n-1
    var count = 0
    for index in stride(from: n-1, through: 0, by: -1) {
        if arr[beforeIndex] == arr[index] {
            count += 1
            result = count
        } else {
            result = count
            break
        }
        beforeIndex = index
    }
    return result
}

/* Autofill for HackerRank
let fileName = ProcessInfo.processInfo.environment["OUTPUT_PATH"]!
FileManager.default.createFile(atPath: fileName, contents: nil, attributes: nil)
let fileHandle = FileHandle(forWritingAtPath: fileName)!

guard let n = Int((readLine()?.trimmingCharacters(in: .whitespacesAndNewlines))!)
    else { fatalError("Bad input") }

guard let arTemp = readLine() else { fatalError("Bad input") }
let ar: [Int] = arTemp.split(separator: " ").map {
    if let arItem = Int($0.trimmingCharacters(in: .whitespacesAndNewlines)) {
        return arItem
    } else { fatalError("Bad input") }
}

guard ar.count == n else { fatalError("Bad input") }
*/

// Tester
let n = 4
let ar = [3, 2, 1, 3]
//

let result = birthdayCakeCandles(n: n, ar: ar)
/* Autofill for HackerRank
fileHandle.write(String(result).data(using: .utf8)!)
fileHandle.write("\n".data(using: .utf8)!)
*/
