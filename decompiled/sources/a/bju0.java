package a;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class bju0 extends eju0 {
    public float[] g;
    public x2e h;

    @Override // a.cky
    public final void b(Object obj) {
        this.h = (x2e) obj;
    }

    @Override // a.eju0
    public final void f(View view, float f) {
        float[] fArr = this.g;
        fArr[0] = a(f);
        dyb.k0(this.h, view, fArr);
    }
}
