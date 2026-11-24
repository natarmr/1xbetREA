package a;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final class nff0 extends vw5 {
    public final ro00 d;
    public final lpi0 e;
    public final mne f;
    public final pru g;
    public final dzt h;
    public final xyu i;
    public final k7u j;
    public final xoi0 k;
    public final kh3 l;
    public final gsd m;
    public final List n;
    public final p7m0 o;
    public Function0 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nff0(o8f o8fVar, nkt nktVar, ro00 ro00Var, lpi0 lpi0Var, mne mneVar, rqt rqtVar, sqt sqtVar, pru pruVar, dzt dztVar, xyu xyuVar, k7u k7uVar, xoi0 xoi0Var, duj dujVar) {
        super(o8fVar, mneVar, dujVar);
        o8fVar.getClass();
        nktVar.getClass();
        lpi0Var.getClass();
        k7uVar.getClass();
        xoi0Var.getClass();
        this.d = ro00Var;
        this.e = lpi0Var;
        this.f = mneVar;
        this.g = pruVar;
        this.h = dztVar;
        this.i = xyuVar;
        this.j = k7uVar;
        this.k = xoi0Var;
        this.l = kh3.CONFIG;
        this.m = gsd.REMOTE_CONFIG;
        this.n = kotlin.collections.a.c(nktVar);
        this.o = q7m0.a(i8d.f14333a);
        this.p = new b4f0((byte) 6);
    }

    @Override // a.vw5
    public final void a(sje sjeVar) {
        sjeVar.getClass();
        this.o.o(null, i8d.b);
        long jA = this.h.f6956a.a();
        sac.V(sjeVar, new dff0(this, sjeVar, (byte) 4), new pe1((Object) sjeVar, (Object) this, jA, (byte) 5), this.f.c, new coc0(this, null, (byte) 21), 8);
    }

    @Override // a.vw5
    public final kh3 b() {
        return this.l;
    }

    @Override // a.vw5
    public final p7m0 c() {
        return this.o;
    }

    @Override // a.vw5
    public final List d() {
        return this.n;
    }

    @Override // a.vw5
    public final fnf0 e() {
        return this.m;
    }
}
