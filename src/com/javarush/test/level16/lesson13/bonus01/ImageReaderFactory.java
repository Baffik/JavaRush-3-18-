package com.javarush.test.level16.lesson13.bonus01;

import com.javarush.test.level16.lesson13.bonus01.common.*;

/**
 * Created by Nika on 24.11.2016.
 */
public class ImageReaderFactory {

    public static ImageReader getReader(ImageTypes razshurenei) {

            if (razshurenei == ImageTypes.JPG) {
                return new JpgReader();
            } else if (razshurenei == ImageTypes.BMP) {
                return new BmpReader();
            } else if (razshurenei == ImageTypes.PNG) {

                return new PngReader();
            }
        else throw new IllegalArgumentException("Неизвестный тип картинки");

    }
}
