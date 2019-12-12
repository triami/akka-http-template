package com.triami.starter.web

import com.sun.net.httpserver.Authenticator.Success
import org.junit.runner.RunWith
import org.scalatest.FunSpec
import org.scalatest.junit.JUnitRunner

import scala.util.{Failure, Success, Try}

/**
  * Created by amit on 12/11/19.
  */

@RunWith(classOf[JUnitRunner])
class ServerTests extends FunSpec {

  describe("The Server") {

    it("should start"){
      Try(Server.startUp()) match {
        case Failure(e) => fail(e)
        case _ =>
      }
    }
  }

}
