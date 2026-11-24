package a;

import java.util.Collections;
import org.xplatform.ufc.api.championship.UfcChampionshipParams;

/* JADX INFO: loaded from: classes5.dex */
public final class eci {
    public final n5d0 A;
    public final n5d0 B;
    public final n5d0 C;
    public final dci D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UfcChampionshipParams f7567a;
    public final i1w0 b;
    public final pru c;
    public final iip d;
    public final b3c0 e;
    public final gst0 f;
    public final lsn g;
    public final knf0 h;
    public final gii0 i;
    public final uzc j;
    public final g2v k;
    public final ctf0 l;
    public final x0u m;
    public final m1e n;
    public final itr o;
    public final zx10 p;
    public final cad q;
    public final ugf0 r;
    public final y78 s;
    public final xri t;
    public final r9u u;
    public final lbu v;
    public final wiu w;
    public final kys0 x;
    public final uxs0 y;
    public final n5d0 z;

    public eci(cad cadVar, iip iipVar, lsn lsnVar, itr itrVar, ugf0 ugf0Var, xri xriVar, zx10 zx10Var, UfcChampionshipParams ufcChampionshipParams, i1w0 i1w0Var, gii0 gii0Var, g2v g2vVar, m1e m1eVar, ctf0 ctf0Var, pru pruVar, b3c0 b3c0Var, knf0 knf0Var, uzc uzcVar, gst0 gst0Var, y78 y78Var, r9u r9uVar, lbu lbuVar, wiu wiuVar, x0u x0uVar, kys0 kys0Var, uxs0 uxs0Var) {
        this.f7567a = ufcChampionshipParams;
        this.b = i1w0Var;
        this.c = pruVar;
        this.d = iipVar;
        this.e = b3c0Var;
        this.f = gst0Var;
        this.g = lsnVar;
        this.h = knf0Var;
        this.i = gii0Var;
        this.j = uzcVar;
        this.k = g2vVar;
        this.l = ctf0Var;
        this.m = x0uVar;
        this.n = m1eVar;
        this.o = itrVar;
        this.p = zx10Var;
        this.q = cadVar;
        this.r = ugf0Var;
        this.s = y78Var;
        this.t = xriVar;
        this.u = r9uVar;
        this.v = lbuVar;
        this.w = wiuVar;
        this.x = kys0Var;
        this.y = uxs0Var;
        byte b = 0;
        this.z = mbl.b(new dci(this, 1, b));
        this.A = mbl.b(new dci(this, 2, b));
        this.B = mbl.b(new dci(this, 3, b));
        this.C = mbl.b(new dci(this, 4, b));
        this.D = new dci(this, b, b);
    }

    public final void a(xjb xjbVar) {
        xjbVar.K1 = new fiu0(Collections.singletonMap(plb.class, this.D));
        ujd ujdVarD = this.o.d();
        x1x.x(ujdVarD);
        xjbVar.L1 = ujdVarD;
        xjbVar.M1 = ((g45) this.p.f45137a).K();
    }
}
