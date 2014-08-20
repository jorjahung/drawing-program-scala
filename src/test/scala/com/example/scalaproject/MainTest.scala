package com.example.scalaproject

import org.scalatest.{FunSpec, Matchers}

/**
 * Created by jorjahung on 19/08/2014.
 */
class CanvasTest extends FunSpec with Matchers {
  it("returns a canvas with a specified size") {
    val canvas = new Canvas(2,2)
    canvas.draft should equal(Seq(
                        Seq(Point(1,1),Point(1,2)),
                        Seq(Point(2,1),Point(2,2))
    ))
  }
}