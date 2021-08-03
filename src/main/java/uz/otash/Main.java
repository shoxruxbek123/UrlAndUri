package uz.otash;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

public class Main {
    public static void main(String[] args) {
//        try {
//            URL url = new URL("https://kun.uz/news/list");
////            System.out.println("Protocol : " +  url.getProtocol());
////            System.out.println("Host : " + url.getHost());
////            System.out.println("Port : " + url.getPort());
////            System.out.println("Path : " + url.getPath());
////            System.out.println("File : " + url.getFile());
////            System.out.println("Query : " + url.getQuery());
//
//            URLConnection connection = url.openConnection();
//            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
//            FileWriter fileWriter = new FileWriter("D:\\kun.uz\\newList.txt");
//            while ((reader.readLine()!=null)){
//                fileWriter.write(String.valueOf(reader));
//            }
//            reader.close();
//            fileWriter.close();
//
//            System.out.println(reader);
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
        try {
            URL url = new URL("https://kun.uz/news/list");
            URLConnection conn = url.openConnection();
            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            File file = new File("D:\\newlist.txt");
            file.getParentFile().mkdirs();
            file.createNewFile();
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            String inputLine;
            while ((inputLine = br.readLine()) != null) {
                bw.write(inputLine + System.getProperty("D:\\newlist.txt") + '\n');
            }
            br.close();
        } catch (Exception ioe) {
            ioe.printStackTrace();
        }
    }
}

