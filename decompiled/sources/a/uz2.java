package a;

import android.media.Image;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class uz2 implements b3x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Image f36516a;
    public final int b;
    public final int c;
    public final int d;
    public final long e;

    public uz2(Image image) {
        this.f36516a = image;
        this.b = image.getFormat();
        this.c = image.getWidth();
        this.d = image.getHeight();
        this.e = image.getTimestamp();
    }

    @Override // a.kft0
    public final Object H(sgy sgyVar) {
        sgyVar.getClass();
        tre0 tre0Var = sre0.f32672a;
        boolean zEquals = sgyVar.equals(tre0Var.b(Image.class));
        Image image = this.f36516a;
        if (zEquals) {
            return image;
        }
        if (Build.VERSION.SDK_INT <= 27 || !sgyVar.equals(tre0Var.b(y6.k()))) {
            return null;
        }
        return image.getHardwareBuffer();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f36516a.close();
    }

    public final String toString() {
        return "Image-" + grm0.a(this.b) + "-w" + this.c + 'h' + this.d + "-t" + this.e;
    }
}
