package com.genaro.FileIO;


import java.io.*;

public class CopyFileBuffered {
    public static void main(String[] args) throws IOException {
        BufferedReader inputStream = null;
        BufferedWriter outputStream = null;
        try {
            inputStream =
                    new BufferedReader(new FileReader("myfile01.txt"));
            outputStream =
                    new BufferedWriter(new FileWriter("lineOut.txt"));
            String l;
            while ((l = inputStream.readLine()) != null) {
                outputStream.write(l);
                outputStream.write("\n");
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}
