/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.wscanvas.encoders;

import com.udea.wscanvas.tablerows.Figure;
import javax.websocket.EncodeException;
import javax.websocket.Encoder;
import javax.websocket.EndpointConfig;

/**
 *
 * @author sergio.marriaga
 */
public class figureEncoder implements Encoder.Text<Figure>{

    @Override
    public String encode(Figure figure) throws EncodeException {
        
        return figure.getJson().toString();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void init(EndpointConfig config) {
        
        System.out.println("iniciando");
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void destroy() {
        System.out.println("Destruyendo");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
