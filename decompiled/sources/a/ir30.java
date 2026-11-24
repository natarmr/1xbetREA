package a;

import kotlin.Pair;

/* JADX INFO: loaded from: classes4.dex */
public final class ir30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lne f15237a;
    public final int b;
    public final p7m0 c;
    public final qoj0 d;
    public final a8z e;
    public c4m0 f;

    public ir30(lne lneVar, long j) {
        lneVar.getClass();
        this.f15237a = lneVar;
        this.b = (int) j;
        this.c = q7m0.a(null);
        this.d = roj0.a(0, 1, i99.b);
        this.e = maz.a(wez.b, new np30(this, (byte) 1));
    }

    public final void a() {
        this.c.n(null);
        v3c.N(this.f);
    }

    public final Object b() {
        Pair pair = (Pair) this.c.getValue();
        if (pair != null) {
            return pair.b;
        }
        return null;
    }

    public final p6d c() {
        yje yjeVar = null;
        return new p6d(this.c, new vsg0(new fhq(this, yjeVar, (byte) 26)), new sot((Object) this, yjeVar, (byte) 27), (byte) 1);
    }

    public final void d(Object obj) {
        v3c.N(this.f);
        Pair pair = new Pair(Long.valueOf(System.currentTimeMillis()), obj);
        p7m0 p7m0Var = this.c;
        p7m0Var.getClass();
        yje yjeVar = null;
        p7m0Var.o(null, pair);
        c4m0 c4m0Var = this.f;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            this.f = qjj.W((vne) this.e.getValue(), null, null, new e3p(this, yjeVar, (byte) 18), 3);
        }
    }
}
