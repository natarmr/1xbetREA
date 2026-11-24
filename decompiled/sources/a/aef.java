package a;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes4.dex */
public final class aef extends lls0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f724a = aef.class.getName().concat("-0");

    @Override // a.lls0
    public final String a() {
        return this.f724a;
    }

    @Override // a.lls0
    public final Bitmap b(Bitmap bitmap, f7k0 f7k0Var) {
        int iMin = Math.min(bitmap.getWidth(), bitmap.getHeight());
        float f = iMin;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, Math.abs(iMin - ((int) (Math.max(f / bitmap.getWidth(), f / bitmap.getHeight()) * bitmap.getWidth()))) / 2, 0, iMin, iMin);
        bitmapCreateBitmap.getClass();
        return bitmapCreateBitmap;
    }
}
