package a;

import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class arn0 extends w46 {
    public final i1w0 b;
    public final ctf0 c;
    public final edu d;
    public final boolean e;
    public final wyu f;
    public final ali g;
    public final mne h;
    public final z7u i;
    public final zri j;
    public final uii k;
    public final mrt l;
    public final duj m;
    public final m6m0 n;
    public final zx10 o;
    public final j1q0 p;
    public final pru q;
    public final r9u r;
    public final n0o0 s;
    public final p7m0 t;
    public final p7m0 u;
    public final ol60 v;
    public bby w;
    public bby x;
    public bby y;
    public ksn0 z;

    public arn0(vzg0 vzg0Var, i1w0 i1w0Var, ctf0 ctf0Var, edu eduVar, boolean z, wyu wyuVar, ali aliVar, mne mneVar, z7u z7uVar, zri zriVar, uii uiiVar, mrt mrtVar, duj dujVar, m6m0 m6m0Var, zx10 zx10Var, j1q0 j1q0Var, pru pruVar, r9u r9uVar) {
        ctf0Var.getClass();
        wyuVar.getClass();
        j1q0Var.getClass();
        r9uVar.getClass();
        this.b = i1w0Var;
        this.c = ctf0Var;
        this.d = eduVar;
        this.e = z;
        this.f = wyuVar;
        this.g = aliVar;
        this.h = mneVar;
        this.i = z7uVar;
        this.j = zriVar;
        this.k = uiiVar;
        this.l = mrtVar;
        this.m = dujVar;
        this.n = m6m0Var;
        this.o = zx10Var;
        this.p = j1q0Var;
        this.q = pruVar;
        this.r = r9uVar;
        this.s = maz.b(new jfm0(this, (byte) 17));
        this.t = q7m0.a(new oqn0(iun.f15405a));
        this.u = q7m0.a(qqn0.f29175a);
        this.v = new ol60(3);
        Class<arn0> cls = arn0.class;
        sac.V(jiu0.a(this), new ndn0(1, this, cls, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 11), null, mneVar.f22085a, new xqn0(this, null, (byte) 0), 10);
        sac.V(jiu0.a(this), new ndn0(1, this, cls, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 12), null, mneVar.b, new yqn0(this, null), 10);
    }

    public final void w(Throwable th) {
        this.m.b(th, new abn0(this, (byte) 10));
    }

    public final void x() {
        byte b = 0;
        bqn0 bqn0Var = new bqn0(false);
        ol60 ol60Var = this.v;
        ol60Var.f(bqn0Var);
        uqn0 uqn0Var = (uqn0) CollectionsKt.firstOrNull(this.u.d());
        if (uqn0Var != null) {
            boolean z = uqn0Var instanceof pqn0;
            yje yjeVar = null;
            mne mneVar = this.h;
            if (z) {
                v3c.N(this.y);
                byte b2 = 1;
                sac.V(jiu0.a(this), new ndn0(b2, this, arn0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 14), null, mneVar.f22085a, new xqn0(this, yjeVar, b2), 10);
                return;
            }
            if (uqn0Var instanceof sqn0) {
                v3c.N(this.w);
                this.x = sac.V(jiu0.a(this), new ndn0(1, this, arn0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 16), null, mneVar.f22085a, new zqn0(this, yjeVar, (byte) 2), 10);
                return;
            }
            if (uqn0Var instanceof tqn0) {
                v3c.N(this.x);
                this.y = sac.V(jiu0.a(this), new ndn0(1, this, arn0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 13), null, mneVar.f22085a, new zqn0(this, yjeVar, b), 10);
                return;
            }
        }
        ol60Var.f(kqn0.f18732a);
    }
}
