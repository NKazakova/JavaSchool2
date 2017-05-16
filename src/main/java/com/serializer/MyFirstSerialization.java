package com.serializer;

import java.io.IOException;

/**
 * Created by sbt-kazakova-nv on 16.05.2017.
 */
public class MyFirstSerialization {
    public static void main(String[] args) throws IOException {
        Deposit deposit=new Deposit("vklad99");
        System.out.println(deposit);

        DepositSerializer.serialize("MyFirst",deposit);
        Deposit depositnew

    }
}
