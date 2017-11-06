package com.shurik.company;

import java.io.*;
import java.util.Calendar;

public class Main {

    public static void main(String[] args) {
        String filename = "datetime.res";

        PersistentTime datetime = new PersistentTime();

        FileOutputStream    fos = null;
        ObjectOutputStream  objectOutputStream  = null;

        try {
            fos = new FileOutputStream(filename);
            objectOutputStream  = new ObjectOutputStream(fos);
            objectOutputStream.writeObject(datetime);
            objectOutputStream.close();
            fos.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {

        }

        ///////////////////////

        PersistentTime datetime2    = null;

        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;

        try {

            fileInputStream = new FileInputStream(filename);
            objectInputStream   = new ObjectInputStream(fileInputStream);

            datetime2   = (PersistentTime) objectInputStream.readObject();

            objectInputStream.close();
            fileInputStream.close();

        } catch (IOException ioex){
            ioex.printStackTrace();
        } catch (ClassNotFoundException cnfe){
            cnfe.printStackTrace();
        }
        System.out.print("Время разложения: " + datetime2.getDatetime());
        System.out.println();
        System.out.print("Текущее время: " + Calendar.getInstance().getTime());



    }
}
