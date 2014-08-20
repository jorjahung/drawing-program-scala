package com.example.scalaproject

/**
 * Created by jorjahung on 19/08/2014.
 */
class Canvas(val height: Int, val width: Int) {
  def draft = {
    for (x <- 1 to height) yield for (y <- 1 to width) yield Point(x,y)
  }
}
