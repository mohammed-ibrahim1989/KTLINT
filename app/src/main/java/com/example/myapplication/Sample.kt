package com.example.myapplication

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flowOf

fun main(): Unit = runBlocking{

    val list = mutableListOf<Int>(2,3,4,5,6,7,8,9,10)
    var sortedlist = list.filter { v -> 0 == v%2
    }

    val flow = flowOf(1..10)
    flow.collect {
    }
    calculate(10,20, { f, s ->
        f+s
    })
    calculate(10,20, { f, s ->

        f*s
    })
}

fun calculate(first : Int, second : Int, action : (Int, Int) -> Int) {
    action(first,second)
}