/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Artemis_Expanded_Skyboxes;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

/**
 *
 * @author Andy
 */
public class System02 {
    
    static String sourceDir = "D:/Artemis/art/Expanded_Skyboxes/System02/";
    static String dirName = "sb";
    static String targetDir = "D:/Artemis/art/";
    static String dirNo = "";
    
    
    public static void system02() {
        
        
       // Path copyfrom = FileSystems.getDefault().getPath(dirRoot + systemNo + "/" + dirName + "/");
        //Path target = FileSystems.getDefault().getPath("D:/Artemis/art/sb12/");
        //Path target_dir = FileSystems.getDefault().getPath("D:/Artemis/art/sb12");
        for (int x = 12; x <= 29; x++){
            dirNo = Integer.toString(x);
            
        File source = new File(sourceDir + dirName + dirNo + "/");
        File dest = new File(targetDir + dirName + dirNo + "/");
        try {
             FileUtils.copyDirectory(source, dest);
        } catch (IOException e) {
         e.printStackTrace();
        }
        
        }

    }
    
}
