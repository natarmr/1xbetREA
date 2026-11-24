package a;

import android.widget.Magnifier;

/* JADX INFO: loaded from: classes.dex */
public class zv90 implements xv90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Magnifier f45045a;

    public zv90(Magnifier magnifier) {
        this.f45045a = magnifier;
    }

    @Override // a.xv90
    public void a(float f, long j, long j2) {
        this.f45045a.show(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    public final void b() {
        this.f45045a.dismiss();
    }

    public final long c() {
        return (((long) this.f45045a.getWidth()) << 32) | (((long) this.f45045a.getHeight()) & 4294967295L);
    }

    public final void d() {
        this.f45045a.update();
    }
}
