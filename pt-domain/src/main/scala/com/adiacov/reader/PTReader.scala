package com.adiacov.reader

import com.adiacov.model.RawData

import scala.concurrent.Future

trait PTReader {
  def read[T](): Future[RawData[T]]
}
