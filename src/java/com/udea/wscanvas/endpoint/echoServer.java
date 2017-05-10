/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.wscanvas.endpoint;

import com.udea.wscanvas.encoders.figureDecoder;
import com.udea.wscanvas.encoders.figureEncoder;
import com.udea.wscanvas.tablerows.Figure;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import javax.websocket.EncodeException;
import javax.websocket.OnMessage;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

/**
 *
 * @author sergio.marriaga
 */
@ServerEndpoint( value="/echo",
        encoders = {figureEncoder.class},
        decoders = {figureDecoder.class}
)
public class echoServer {

        private static final Set<Session> peers=Collections.synchronizedSet(new HashSet<Session>());
        
    @OnMessage
    public void broadcastFigure(Figure figure, Session session)throws IOException, EncodeException{
        for(Session peer:peers){
            if(!peer.equals(session)){
                peer.getBasicRemote().sendObject(figure);
            }
        }
    }
    
}
