package com.serializer;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by sbt-kazakova-nv on 16.05.2017.
 */
public class Deposit extends Product implements Serializable {
        String code;


    public Deposit (String code) {
        super(code+new Date().getTime());


        this.code = code;}
    };

   public String tostring()
   {}



}
