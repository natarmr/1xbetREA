package a;

import androidx.media3.common.MediaItem;

/* JADX INFO: loaded from: classes.dex */
public abstract class hrv0 extends gld {
    public final e06 k;

    public hrv0(e06 e06Var) {
        this.k = e06Var;
    }

    @Override // a.e06
    public final bmq0 f() {
        return this.k.f();
    }

    @Override // a.e06
    public final MediaItem g() {
        return this.k.g();
    }

    @Override // a.e06
    public final boolean h() {
        return this.k.h();
    }

    @Override // a.e06
    public final void k(rsj rsjVar) {
        this.j = vtt0.n(null);
        z();
    }

    @Override // a.gld
    public final vn30 s(Object obj, vn30 vn30Var) {
        return x(vn30Var);
    }

    @Override // a.gld
    public final long t(Object obj, long j) {
        return j;
    }

    @Override // a.gld
    public final int u(int i, Object obj) {
        return i;
    }

    @Override // a.gld
    public final void v(Object obj, e06 e06Var, bmq0 bmq0Var) {
        y(bmq0Var);
    }

    public abstract void y(bmq0 bmq0Var);

    public void z() {
        w(null, this.k);
    }

    public vn30 x(vn30 vn30Var) {
        return vn30Var;
    }
}
