package com.gb.gamevisualizer.game

import com.gb.gamevisualizer.constants.Constants
import com.gb.gamevisualizer.constants.Constants.GiantBombInfo
import com.gb.gamevisualizer.json.JsonGrab
import org.json.JSONObject


/**
  * Created by blanthrip on 8/14/2016.
  */
class GameRetrieve {

  val constants = new Constants
  val baseUrl = GiantBombInfo.URL.getVal

  def searchGames(id: String): JSONObject = {
    val redo = id.replace(" ", "-")
    val search = baseUrl + GiantBombInfo.SEARCH.getVal + GiantBombInfo.API_CODE.getVal + GiantBombInfo.JSON.getVal +
      GiantBombInfo.QUERY.getVal + redo + GiantBombInfo.NAME_ONLY.getVal
    val json = new JsonGrab

    json.readJsonFromUrl(search)
  }




}
