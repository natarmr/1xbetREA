package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class s4u0 extends pm80 {
    public final pz40 f = androidx.compose.runtime.e.e(new h7k0(0));
    public final pz40 g = androidx.compose.runtime.e.e(Boolean.FALSE);
    public final y3u0 h;
    public mld i;
    public final pz40 j;
    public float k;
    public a4d l;

    public s4u0(wgv wgvVar) {
        y3u0 y3u0Var = new y3u0(wgvVar);
        y3u0Var.f = new rbt0(this, (byte) 7);
        this.h = y3u0Var;
        this.j = androidx.compose.runtime.e.d(Unit.f46060a, m2a.v);
        this.k = 1.0f;
    }

    @Override // a.pm80
    public final boolean a(float f) {
        this.k = f;
        return true;
    }

    @Override // a.pm80
    public final boolean b(a4d a4dVar) {
        this.l = a4dVar;
        return true;
    }

    @Override // a.pm80
    public final long i() {
        return ((h7k0) ((hgk0) this.f).getValue()).f12579a;
    }

    @Override // a.pm80
    public final void j(fhl fhlVar) {
        a4d a4dVar = this.l;
        y3u0 y3u0Var = this.h;
        if (a4dVar == null) {
            a4dVar = (a4d) ((hgk0) y3u0Var.g).getValue();
        }
        if (((Boolean) ((hgk0) this.g).getValue()).booleanValue() && fhlVar.getLayoutDirection() == k6z.b) {
            long jE0 = fhlVar.E0();
            nr nrVarA0 = fhlVar.A0();
            long jP = nrVarA0.p();
            nrVarA0.i().l();
            try {
                ((fvt0) nrVarA0.b).z(-1.0f, 1.0f, jE0);
                y3u0Var.e(fhlVar, this.k, a4dVar);
                defpackage.c.g(nrVarA0, jP);
            } catch (Throwable th) {
                defpackage.c.g(nrVarA0, jP);
                throw th;
            }
        } else {
            y3u0Var.e(fhlVar, this.k, a4dVar);
        }
        ((hgk0) this.j).getValue();
    }
}
