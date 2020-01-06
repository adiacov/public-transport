package com.adiacov.repository

import com.adiacov.model.TimeTable

import scala.concurrent.Future

trait PTRepository {
  def saveOrUpdate(timeTable: TimeTable): Future[TimeTable]

  def get(id: String): Future[TimeTable]

  def delete(id: String): Unit
}
