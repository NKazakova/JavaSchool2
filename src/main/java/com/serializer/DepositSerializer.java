package com.serializer;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created by sbt-kazakova-nv on 16.05.2017.
 */
public class DepositSerializer {
    public static void serialize(String filename; Deposit deposit) throws IOException
    {try (FileOutputStream fileOutputStream=new FileOutputStream(filename);
          ObjectOutputStream objectOutputStream= new ObjectOutputStream(fileOutputStream);

    };

    public static void deserialize(String filename) {

    }

}
