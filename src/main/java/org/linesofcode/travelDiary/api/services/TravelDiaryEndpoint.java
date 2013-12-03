package org.linesofcode.travelDiary.api.services;

import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;

/**
 * @author Dominik Eckelmann
 */
@ServerEndpoint("/travelDiary")
public class TravelDiaryEndpoint {

    @OnMessage
    public void message(Session session, String msg) {

    }

}
