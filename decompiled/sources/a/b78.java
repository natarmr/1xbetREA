package a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class b78 implements dyw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bitmap f2092a;

    public b78(Bitmap bitmap) {
        this.f2092a = bitmap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b78) && Intrinsics.d(this.f2092a, ((b78) obj).f2092a);
    }

    @Override // a.dyw
    public final int f() {
        return this.f2092a.getHeight();
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.f2092a.hashCode() * 31);
    }

    @Override // a.dyw
    public final int j() {
        return this.f2092a.getWidth();
    }

    @Override // a.dyw
    public final void k(Canvas canvas) {
        canvas.drawBitmap(this.f2092a, 0.0f, 0.0f, (Paint) null);
    }

    @Override // a.dyw
    public final boolean l() {
        return true;
    }

    @Override // a.dyw
    public final long m() {
        int i;
        int allocationByteCount;
        Bitmap bitmap = this.f2092a;
        if (!bitmap.isRecycled()) {
            try {
                allocationByteCount = bitmap.getAllocationByteCount();
            } catch (Exception unused) {
                int height = bitmap.getHeight() * bitmap.getWidth();
                Bitmap.Config config = bitmap.getConfig();
                if (config == Bitmap.Config.ALPHA_8) {
                    i = 1;
                } else if (config == Bitmap.Config.RGB_565 || config == Bitmap.Config.ARGB_4444) {
                    i = 2;
                } else {
                    i = (Build.VERSION.SDK_INT < 26 || config != Bitmap.Config.RGBA_F16) ? 4 : 8;
                }
                allocationByteCount = i * height;
            }
            return allocationByteCount;
        }
        throw new IllegalStateException(("Cannot obtain size for recycled bitmap: " + bitmap + " [" + bitmap.getWidth() + " x " + bitmap.getHeight() + "] + " + bitmap.getConfig()).toString());
    }

    public final String toString() {
        return "BitmapImage(bitmap=" + this.f2092a + ", shareable=true)";
    }
}
