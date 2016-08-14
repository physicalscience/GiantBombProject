package com.gb.gamevisualizer.json

import java.io.{BufferedReader, InputStreamReader, Reader}
import java.net.URL
import java.nio.charset.Charset

import org.json.JSONObject

/**
  * Created by blanthrip on 8/14/2016.
  */
class JsonGrab {

  def readJsonFromUrl(url: String) {
    val connection = new URL(url).openConnection()
    connection.addRequestProperty("User-Agent", "PhysicalScienceIsACoolGuy")
    val is = connection.getInputStream

    try {
      val rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")))
      val jsonText = readAll(rd)
      val json = new JSONObject(jsonText)
    } finally {
      is.close()
    }

  }
  private def readAll(rd: Reader) {
    val sb = new StringBuilder()
    var cp: Int = 0

    while((cp = rd.read()) != -1) {
      sb.append(cp.toChar)
    }

    sb.toString()
  }



}
