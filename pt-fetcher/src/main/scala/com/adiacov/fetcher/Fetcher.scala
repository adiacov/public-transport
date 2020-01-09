package com.adiacov.fetcher

import scala.concurrent.Future

trait Fetcher[T] {
  def fetch(): Future[T]
}
