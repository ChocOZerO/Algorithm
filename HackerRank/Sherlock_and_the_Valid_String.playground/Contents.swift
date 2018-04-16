//: Playground - noun: a place where people can play

import Foundation

func isValid(input: String) -> Bool {
    if input.count < 3 { return true }
    let characterCounter = getCharacterCounter(input: input)
    let counts = getCounts(from: characterCounter)
    var differentCount = 0
    var sameCounts = [Int: Int]()
    for index in 1..<counts.count {
        if counts[index] != counts[index-1] {
            differentCount += 1
            if sameCounts[counts[index-1]] == nil {
                sameCounts[counts[index-1]] = 1
            }
            if sameCounts[counts[index]] == nil {
                sameCounts[counts[index]] = 1
            }
        } else {
            if sameCounts[counts[index]] == nil {
                sameCounts[counts[index]] = 2
            } else {
                sameCounts[counts[index]]! += 1
            }
        }
    }
    return validate(differentCount: differentCount, sameCounts: sameCounts)
}

private func getCharacterCounter(input: String) -> [Character: Int] {
    var characterCounter: [Character: Int] = [:]
    for character in input {
        if characterCounter[character] == nil {
            characterCounter[character] = 1
        } else {
            characterCounter[character]! += 1
        }
    }
    return characterCounter
}

private func getCounts(from characterCounter: [Character: Int]) -> [Int] {
    var counts = [Int]()
    for character in characterCounter.keys {
        counts.append(characterCounter[character]!)
    }
    counts.sort(by: <)
    return counts
}

private func validate(differentCount: Int, sameCounts: [Int: Int]) -> Bool {
    if differentCount > 1 {
        return false
    } else if differentCount == 1 {
        let keys = getKeys(from: sameCounts)
        if keys.contains(1), sameCounts[1]! == 1 { return true }
        if keys[1] == keys[0] + 1, sameCounts[keys[1]]! == 1 { return true }
        return false
    } else {
        return true
    }
}

private func getKeys(from sameCounts: [Int: Int]) -> [Int] {
    var keys = [Int]()
    for key in sameCounts.keys {
        keys.append(key)
    }
    keys.sort(by: <)
    return keys
}

let validation = isValid(input: readLine() ?? "")
if validation {
    print("YES")
} else {
    print("NO")
}
