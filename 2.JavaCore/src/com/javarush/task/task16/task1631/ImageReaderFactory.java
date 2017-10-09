package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

/**
 * Created by Игорь on 07.10.2017.
 */
public class ImageReaderFactory {

    static ImageReader obj;
    public static ImageReader getImageReader(ImageTypes x) throws IllegalArgumentException {
       if ( x== ImageTypes.JPG) {
           obj = new JpgReader();
       }
       else if ( x== ImageTypes.BMP) {
            obj = new BmpReader();
        }
       else if ( x== ImageTypes.PNG) {
           obj = new PngReader();
       }
       else {
           throw new IllegalArgumentException();
       }
        return obj;
    }
}
