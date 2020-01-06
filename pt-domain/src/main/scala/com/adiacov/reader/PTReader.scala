package com.adiacov.reader

import com.adiacov.model.RawData

trait PTReader {
  def read[T]: RawData[T]
}
