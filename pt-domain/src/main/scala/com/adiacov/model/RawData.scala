package com.adiacov.model

trait RawData[T] {
  def id: String

  def items: Vector[RawDataItem[T]]
}
