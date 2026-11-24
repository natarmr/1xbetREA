package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class oe0 extends i3t0 {
    public static final /* synthetic */ int I = 0;
    public final pru A;
    public final x4u B;
    public final u58 C;
    public c4m0 D;
    public c4m0 E;
    public c4m0 F;
    public c4m0 G;
    public final p7m0 H;
    public final ouu o;
    public final duj p;
    public final uyu q;
    public final peg0 r;
    public final i1w0 s;
    public final m1e t;
    public final mne u;
    public final au0 v;
    public final s31 w;
    public final cyu x;
    public final wti y;
    public final wyu z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oe0(vzg0 vzg0Var, ouu ouuVar, duj dujVar, uyu uyuVar, peg0 peg0Var, i1w0 i1w0Var, m1e m1eVar, mne mneVar, au0 au0Var, s31 s31Var, cyu cyuVar, wti wtiVar, wyu wyuVar, pru pruVar, x4u x4uVar, u58 u58Var, bzt bztVar) {
        super(new hc0(pruVar, (byte) 1), cvm0.p(mneVar.c, mneVar.f22085a), new ce0(bztVar, (byte) 0), (yzn0) null);
        m1eVar.getClass();
        wyuVar.getClass();
        this.o = ouuVar;
        this.p = dujVar;
        this.q = uyuVar;
        this.r = peg0Var;
        this.s = i1w0Var;
        this.t = m1eVar;
        this.u = mneVar;
        this.v = au0Var;
        this.w = s31Var;
        this.x = cyuVar;
        this.y = wtiVar;
        this.z = wyuVar;
        this.A = pruVar;
        this.B = x4uVar;
        this.C = u58Var;
        this.H = q7m0.a("");
    }

    public final void M(boolean z) {
        hie0 hie0Var = new hie0();
        hie0Var.f13108a = z;
        hie0 hie0Var2 = new hie0();
        hie0Var2.f13108a = true;
        c4m0 c4m0Var = this.E;
        if (c4m0Var != null) {
            e3c.n(c4m0Var);
        }
        this.E = sac.T(new p6d(this.H, this.t.b(), new fe0(hie0Var2, this, hie0Var, (yje) null), (byte) 1), jiu0.a(this), ge0.h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        gd0 gd0Var = (gd0) obj;
        gd0Var.getClass();
        super.x(gd0Var);
        if (gd0Var.equals(ad0.f654a)) {
            E();
            return;
        }
        byte b = 1;
        Object obj2 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        if (gd0Var.equals(bd0.f2377a)) {
            c4m0 c4m0Var = this.G;
            byte b2 = 0;
            if (c4m0Var == null || !c4m0Var.isActive()) {
                this.G = sac.T(new fnq(new lr(i120.W(new le0(new eu4(new ymq(new b5((byte) 21), ((n8v) ((g2v) this.B.f40284a).f10580a).f23108a, objArr2 == true ? 1 : 0, b2), (byte) 9), (byte) 0)), (byte) 4), new me0(this, objArr == true ? 1 : 0, b2), (byte) 4), jiu0.a(this), ne0.h);
            }
            M(false);
            c4m0 c4m0Var2 = this.F;
            if (c4m0Var2 == null || !c4m0Var2.isActive()) {
                this.F = sac.T(new fnq(dtb.z(this.q.f36509a.h(), 1), new de0(this, objArr4 == true ? 1 : 0, b), (byte) 4), d5c.S(jiu0.a(this), this.u.c), new me0(this, objArr3 == true ? 1 : 0, b));
                return;
            }
            return;
        }
        if (gd0Var.equals(cd0.f4136a)) {
            c4m0 c4m0Var3 = this.F;
            if (c4m0Var3 != null) {
                c4m0Var3.cancel(null);
            }
            c4m0 c4m0Var4 = this.G;
            if (c4m0Var4 != null) {
                c4m0Var4.cancel(null);
                return;
            }
            return;
        }
        if (gd0Var.equals(ed0.f7593a)) {
            M(true);
            return;
        }
        if (gd0Var.equals(fd0.f9335a)) {
            G(vd0.f37209a);
            return;
        }
        if (!(gd0Var instanceof dd0)) {
            t9f.b();
            return;
        }
        String str = ((dd0) gd0Var).f5870a.f8144a;
        this.C.b("search_aggregator_providers", str);
        for (Object obj3 : ((wd0) D()).b) {
            if (Intrinsics.d(((s5d0) obj3).f31650a, str)) {
                obj2 = obj3;
                break;
            }
        }
        s5d0 s5d0Var = (s5d0) obj2;
        if (s5d0Var == null) {
            return;
        }
        this.v.a("search_aggregator_providers", s5d0Var.f31650a);
        this.s.d(new on((Object) this, (Object) s5d0Var, (Object) this.A.a(), (byte) 2));
    }
}
