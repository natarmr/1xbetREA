package a;

import android.media.ImageWriter;

/* JADX INFO: loaded from: classes.dex */
public final class yz2 implements ImageWriter.OnImageReleasedListener, kft0, AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageWriter f43496a;
    public final int b;
    public final c14 c = o2e.Z(null);

    public yz2(ImageWriter imageWriter, int i) {
        this.f43496a = imageWriter;
        this.b = i;
        imageWriter.getMaxImages();
        imageWriter.getFormat();
    }

    @Override // a.kft0
    public final Object H(sgy sgyVar) {
        sgyVar.getClass();
        if (sgyVar.equals(sre0.f32672a.b(ImageWriter.class))) {
            return this.f43496a;
        }
        return null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f43496a.close();
    }

    @Override // android.media.ImageWriter.OnImageReleasedListener
    public final void onImageReleased(ImageWriter imageWriter) {
        if (this.c.f3556a == null) {
            return;
        }
        hny.b();
    }

    public final String toString() {
        return "ImageWriter-" + grm0.a(this.f43496a.getFormat()) + '-' + ((Object) ("Input-" + this.b));
    }
}
