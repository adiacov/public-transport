package com.adiacov.processor

import com.adiacov.model.{RawData, TimeTable}

trait PTProcessor {
  def process[T](data: RawData[T]): TimeTable
}
