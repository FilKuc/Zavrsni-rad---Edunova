/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kucko.zavrsnirad.pomocno;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Filip
 */
public class Slike {
    
    private static JFileChooser dohvatiPutanju(String naziv,String datotekaOpis, String datotekaExtenzija, String naslov) {
        FileNameExtensionFilter filter = new FileNameExtensionFilter(datotekaOpis, datotekaExtenzija);

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(filter);
        fileChooser.setDialogTitle(naslov);
        fileChooser.setSelectedFile(new File(naziv));
        
        return fileChooser;
        
        

    }

    
    
    public static BufferedImage dohvatiSliku() {
        
    JFileChooser fileChooser = dohvatiPutanju("","Slikovna datoteka","jpg","Odaberite datoteku");
        int userSelection = fileChooser.showSaveDialog(null);
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            try {
                return ImageIO.read(fileChooser.getSelectedFile());
            } catch (IOException ex) {
                return null;
            }
        }
        
        return null;
    }
}
    

