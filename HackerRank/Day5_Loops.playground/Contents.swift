//: Playground - noun: a place where people can play

import Foundation

// Enter your code here
private func multiple(n: Int, index: Int) -> Int {
    return n * index
}

private func printMultiple(n: Int, index: Int) {
    print("\(n) x \(index) = \(multiple(n: n, index: index))")
}

private func loop(n: Int) {
    for index in Array(1...10) {
        printMultiple(n: n, index: index)
    }
}
/*
let input = readLine()
let n = Int(input!) ?? 0
*/
let n = 2
loop(n: n)
