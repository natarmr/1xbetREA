package a;

/* JADX INFO: loaded from: classes6.dex */
public final class ojy extends lm40 implements g6z {
    public xcz o;
    public int p;
    public int q;
    public int r;
    public int s;
    public rzf0 t;

    @Override // a.lm40
    public final void R0() {
        Z0();
    }

    public final void Z0() {
        this.p = this.o.h();
        int i = this.o.i();
        this.q = i;
        this.r = -1;
        this.s = -1;
        this.t = (this.p == 0 && i == 0) ? rzf0.f31357a : rzf0.b;
    }

    @Override // a.g6z, a.xj30
    public final void a(long j) {
        if (this.t != rzf0.b) {
            return;
        }
        int iH = this.o.h();
        int i = this.o.i();
        boolean z = false;
        boolean z2 = iH == this.p && i == this.q;
        if (iH == this.r && i == this.s) {
            z = true;
        }
        if (this.o.j.a() || z2 || z) {
            this.t = rzf0.c;
            return;
        }
        this.r = iH;
        this.s = i;
        int i2 = this.o.j().o;
        int i3 = this.p;
        if (i2 > i3) {
            this.o.k(i3, this.q);
        }
    }
}
