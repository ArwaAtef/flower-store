package com.example.myapplicationflower;

import android.content.Context;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;

public class blurbuilder {
    private static final float BITMAP_SCALE = 0.4f;
    private static final float BLUR_RADIUS = 7.5f;

    public static Bitmap blur(Context context, Bitmap image) {
        // Calculate the new width and height based on the scale factor
        int width = Math.round(image.getWidth() * BITMAP_SCALE);
        int height = Math.round(image.getHeight() * BITMAP_SCALE);

        // Create a scaled version of the input Bitmap
        Bitmap inputBitmap = Bitmap.createScaledBitmap(image, width, height, false);

        // Create an output Bitmap with the same dimensions as the scaled input
        Bitmap outputBitmap = Bitmap.createBitmap(inputBitmap);

        // Create a RenderScript instance
        RenderScript rs = RenderScript.create(context);

        // Create a ScriptIntrinsicBlur object
        ScriptIntrinsicBlur theIntrinsic = ScriptIntrinsicBlur.create(rs, Element.U8_4(rs));

        // Create Allocations for the input and output Bitmaps
        Allocation tmpIn = Allocation.createFromBitmap(rs, inputBitmap);
        Allocation tmpOut = Allocation.createFromBitmap(rs, outputBitmap);

        // Set the blur radius
        theIntrinsic.setRadius(BLUR_RADIUS);

        // Set the input allocation for the blur operation
        theIntrinsic.setInput(tmpIn);

        // Apply the blur effect and store the result in tmpOut
        theIntrinsic.forEach(tmpOut);

        // Copy the blurred result back to the output Bitmap
        tmpOut.copyTo(outputBitmap);

        // Release resources associated with RenderScript
        rs.destroy();

        // Return the blurred Bitmap
        return outputBitmap;
    }
}
