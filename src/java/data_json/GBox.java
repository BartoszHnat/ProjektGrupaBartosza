/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 *
 * @author Browar
 * @param <T>
 */
public class GBox<T>{
    private T t;
    public void set(T t) { this.t = t; }
    public T get() { return t; }
    public static String json_this(GBox tt) throws JsonProcessingException{
        ObjectMapper om = new ObjectMapper();
        return om.writeValueAsString(tt.get());
    }
}

/*
    GBox<KartagraficznaParametry> t = new GBox<KartagraficznaParametry>;
    t.getCena();
*/
