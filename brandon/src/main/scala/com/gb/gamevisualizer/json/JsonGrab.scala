package com.gb.gamevisualizer.json

import java.io.{BufferedReader, InputStreamReader, Reader}
import java.net.URL
import java.nio.charset.Charset

import scala.util.control.Breaks._
import org.json.JSONObject

import scala.util.control.Breaks

/**
  * Created by blanthrip on 8/14/2016.
  */
class JsonGrab {

  def readJsonFromUrl(url: String): JSONObject = {
    val connection = new URL(url).openConnection()
    connection.addRequestProperty("User-Agent", "PhysicalScienceIsACoolGuy")
    val is = connection.getInputStream

    try {
      val rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")))
      val jsonText = readAll(rd)
      println(jsonText)
      new JSONObject(jsonText)
    } finally {
      is.close()
    }

  }
  private def readAll(rd: Reader): String = {
    val sb = new StringBuilder()
    var cp: Int = 0
    val break = Breaks

    while(true) {
      cp = rd.read()
      if(cp == -1) {
        return sb.toString()
      }
      sb.append(cp.toChar)
    }
    return null
  }



}
