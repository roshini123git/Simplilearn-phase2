package org.data.virtualkey.entity;
import java.util.*;
import java.io.File;
import java.nio.file.FileSystems;
import java.nio.file.Path;
public class FileDirectory {
           public static final  String name = "C:/Users/Acer/Desktop/VirtualKeyProject--master/src/directory";
           private ArrayList<File> files = new ArrayList<>();
          // Path path = FileSystems.getDefault().getPath(name).toAbsolutePath();
           File file = new File(name);
          
           public ArrayList<File>addFiles(){
        	   File downloadDir[] = file.listFiles();
        	   files.clear();
        	   for(File e : downloadDir) {
        		   if(e.isFile()) {
        			   files.add(e);
        		   }
        	   }
        	   Collections.sort(files);
        	   return files;
           }
           public ArrayList<File>getFiles(){
        	   addFiles();
        	   return files;
           }
}
