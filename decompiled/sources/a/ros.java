package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ros {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nmo f30853a;
    public final zks b;
    public final knf0 c;
    public final n530 d;
    public final us3 e;
    public final eio f;
    public final he1 g;
    public final bs20 h;
    public final vby i;
    public final List j;

    public ros(nmo nmoVar, zks zksVar, knf0 knf0Var, n530 n530Var, us3 us3Var, eio eioVar, he1 he1Var, bs20 bs20Var, vby vbyVar) {
        zksVar.getClass();
        knf0Var.getClass();
        n530Var.getClass();
        us3Var.getClass();
        bs20Var.getClass();
        vbyVar.getClass();
        this.f30853a = nmoVar;
        this.b = zksVar;
        this.c = knf0Var;
        this.d = n530Var;
        this.e = us3Var;
        this.f = eioVar;
        this.g = he1Var;
        this.h = bs20Var;
        this.i = vbyVar;
        this.j = q3d.j(Long.valueOf(ntg.d.b), Long.valueOf(ewg.d.b), Long.valueOf(yrg.d.b), Long.valueOf(lug.d.b), Long.valueOf(xrg.d.b), Long.valueOf(cug.d.b), Long.valueOf(fsg.d.b), Long.valueOf(ovg.d.b), Long.valueOf(lxg.d.b), Long.valueOf(awg.d.b), Long.valueOf(qtg.d.b));
    }

    public final long a(zos zosVar) {
        long j = zosVar.c;
        if (j == qtg.d.b) {
            uen uenVar = wen.b;
            return ibc.w0(5L, bfn.SECONDS);
        }
        if (!this.j.contains(Long.valueOf(j))) {
            return kpb.v(zosVar.b);
        }
        uen uenVar2 = wen.b;
        return ibc.w0(4L, bfn.SECONDS);
    }

    public final void b(gps gpsVar) {
        Object value;
        zks zksVar = this.b;
        zksVar.getClass();
        p7m0 p7m0Var = zksVar.f44549a;
        do {
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, gpsVar));
    }
}
