package a;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* JADX INFO: loaded from: classes6.dex */
public abstract class lut0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Bitmap.Config[] f20691a;
    public static final Bitmap.Config b;

    static {
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        int i = Build.VERSION.SDK_INT;
        f20691a = i >= 26 ? new Bitmap.Config[]{config, Bitmap.Config.RGBA_F16} : new Bitmap.Config[]{config};
        if (i >= 26) {
            config = Bitmap.Config.HARDWARE;
        }
        b = config;
    }

    public static final int a(Drawable drawable) {
        Bitmap bitmap;
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        return (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) ? drawable.getIntrinsicHeight() : bitmap.getHeight();
    }

    public static final int b(Drawable drawable) {
        Bitmap bitmap;
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        return (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) ? drawable.getIntrinsicWidth() : bitmap.getWidth();
    }
}
