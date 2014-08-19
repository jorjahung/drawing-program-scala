package com.example.scalaproject

import org.scalatest.{Matchers, FunSpec}
import util.Success

class ProgramTest extends FunSpec with Matchers {
  it("should work") {
    true should be(true)
  }
}
