package a;

import android.widget.Magnifier;

/* JADX INFO: loaded from: classes.dex */
public final class bw90 extends zv90 {
    @Override // a.zv90, a.xv90
    public final void a(float f, long j, long j2) {
        if (!Float.isNaN(f)) {
            this.f45045a.setZoom(f);
        }
        long j3 = 9223372034707292159L & j2;
        Magnifier magnifier = this.f45045a;
        if (j3 != 9205357640488583168L) {
            magnifier.show(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)));
        } else {
            magnifier.show(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }
}
