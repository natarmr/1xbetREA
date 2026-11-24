package a;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.media.Image;

/* JADX INFO: loaded from: classes.dex */
public final class wz2 implements b1x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Image f40000a;
    public final wsf0[] b;
    public final a45 c;

    public wz2(Image image) {
        this.f40000a = image;
        Image.Plane[] planes = image.getPlanes();
        if (planes != null) {
            this.b = new wsf0[planes.length];
            for (int i = 0; i < planes.length; i++) {
                this.b[i] = new wsf0(planes[i], (byte) 6);
            }
        } else {
            this.b = new wsf0[0];
        }
        this.c = new a45(eoo0.b, image.getTimestamp(), 0, new Matrix(), 0);
    }

    @Override // a.b1x
    public final f0x K0() {
        return this.c;
    }

    @Override // a.b1x
    public final Image b() {
        return this.f40000a;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f40000a.close();
    }

    @Override // a.b1x
    public final int f() {
        return this.f40000a.getHeight();
    }

    @Override // a.b1x
    public final int getFormat() {
        return this.f40000a.getFormat();
    }

    @Override // a.b1x
    public final int j() {
        return this.f40000a.getWidth();
    }

    @Override // a.b1x
    public final wsf0[] l0() {
        return this.b;
    }

    @Override // a.b1x
    public final Rect u0() {
        return this.f40000a.getCropRect();
    }
}
