package com.adiacov.fetcher.rtec

import com.adiacov.fetcher.Fetcher
import com.typesafe.config.ConfigFactory
import net.ruippeixotog.scalascraper.browser.{Browser, JsoupBrowser}

import scala.concurrent.Future

/** A Fetcher for RTEC public transport.
 *
 * Fetches timetables in form of PDF files and store each Routes in separate folders for
 * further processing.
 */
object RtecFetcher extends Fetcher[Vector[String]] {

  lazy val config = ConfigFactory.load()
  lazy val rtec = config.getConfig("rtec")

  override def fetch(): Future[Vector[String]] = {
    // go to main url (main-url application.conf)
    val browser: Browser = JsoupBrowser()
    val timeTablesPages: browser.DocumentType = browser.get(rtec.getString("timetables-main-url"))

    // count how many pages with timetables (page-url application.conf)
    val lastPageNo = timeTablesPages
//    val pagesCount =

    // for each found page:
    //    1) find link which starts with "Ruta nr..."
    //    2) create folder from link name -> folder Ruta-NO
    //    3) access the link and find all links to PDF files
    //    4) depending on whether the separator for tur/retur exists, save pdf files with tur/retur appended

    throw new NotImplementedError("RtecFetcher fetch not implemented yet.")
  }
}
