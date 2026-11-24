package a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;

/* JADX INFO: loaded from: classes.dex */
public final class rfv extends lls0 {
    public static final ColorMatrixColorFilter c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f30406a;
    public final String b;

    static {
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        c = new ColorMatrixColorFilter(colorMatrix);
    }

    public rfv() {
        Paint paint = new Paint(3);
        paint.setColorFilter(c);
        this.f30406a = paint;
        this.b = rfv.class.getName();
    }

    @Override // a.lls0
    public final String a() {
        return this.b;
    }

    @Override // a.lls0
    public final Bitmap b(Bitmap bitmap, f7k0 f7k0Var) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, config);
        new Canvas(bitmapCreateBitmap).drawBitmap(bitmap, 0.0f, 0.0f, this.f30406a);
        return bitmapCreateBitmap;
    }

    @Override // a.lls0
    public final boolean equals(Object obj) {
        return obj instanceof rfv;
    }

    @Override // a.lls0
    public final int hashCode() {
        return rfv.class.hashCode();
    }

    @Override // a.lls0
    public final String toString() {
        return "GrayscaleTransformation()";
    }
}
