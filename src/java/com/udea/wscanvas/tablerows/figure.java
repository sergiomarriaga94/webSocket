/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.wscanvas.tablerows;

import java.io.StringWriter;
import javax.json.Json;
import javax.json.JsonObject;

/**
 *
 * @author sergio.marriaga
 */
public class figure {
    private JsonObject json;

    /**
     * @return the json
     */
    public JsonObject getJson() {
        return json;
    }

    /**
     * @param json the json to set
     */
    public void setJson(JsonObject json) {
        this.json = json;
    }

    @Override
    public String toString() {
        
        StringWriter writer=new StringWriter();
        Json.createWriter(writer).write(json);
        return writer.toString();
    }
    
    
}
