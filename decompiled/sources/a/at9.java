package a;

import android.gov.nist.javax.sip.header.ims.AuthorizationHeaderIms;

/* JADX INFO: loaded from: classes3.dex */
public final class at9 extends i3t0 {
    public static final /* synthetic */ int z = 0;
    public final vzg0 o;
    public final ctf0 p;
    public final mne q;
    public final a7q r;
    public final a1d s;
    public final m1e t;
    public final duj u;
    public final ehf0 v;
    public c4m0 w;
    public bby x;
    public final p7m0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public at9(long j, vzg0 vzg0Var, ctf0 ctf0Var, mne mneVar, a7q a7qVar, a1d a1dVar, m1e m1eVar, ocl oclVar, duj dujVar, ehf0 ehf0Var) {
        super(null, new zt(vzg0Var, j, (byte) 4), new cz(ctf0Var, oclVar, (byte) 9), cvm0.p(mneVar.c, mneVar.f22085a), null);
        ctf0Var.getClass();
        m1eVar.getClass();
        this.o = vzg0Var;
        this.p = ctf0Var;
        this.q = mneVar;
        this.r = a7qVar;
        this.s = a1dVar;
        this.t = m1eVar;
        this.u = dujVar;
        this.v = ehf0Var;
        this.y = q7m0.a(Boolean.FALSE);
    }

    public final void M() {
        v3c.N(this.x);
        Boolean bool = Boolean.TRUE;
        p7m0 p7m0Var = this.y;
        p7m0Var.getClass();
        p7m0Var.o(null, bool);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        Object value2;
        Object value3;
        nq9 nq9Var = (nq9) obj;
        nq9Var.getClass();
        boolean z2 = nq9Var instanceof dq9;
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        if (z2) {
            this.o.e("ANIMATED_ITEM_SAVED_KEY", -1L);
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value3 = p7m0Var.getValue();
                value3.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var.m(value3, cs9.a((cs9) value3, null, null, false, null, 23)));
            return;
        }
        boolean z3 = nq9Var instanceof fq9;
        byte b = 1;
        yje yjeVar = null;
        mne mneVar = this.q;
        if (z3) {
            c4m0 c4m0Var = this.w;
            if (c4m0Var == null || !c4m0Var.isActive()) {
                this.w = sac.T(new p6d(this.t.b(), this.y, new jr9(this, yjeVar, b), (byte) 1), d5c.S(jiu0.a(this), mneVar.c), ys9.h);
                return;
            }
            return;
        }
        if (nq9Var instanceof eq9) {
            v3c.N(this.w);
            return;
        }
        if (nq9Var instanceof cq9) {
            E();
            return;
        }
        if (nq9Var instanceof kq9) {
            G(new wr9(((kq9) nq9Var).f18710a));
            return;
        }
        boolean z4 = nq9Var instanceof iq9;
        ehf0 ehf0Var = this.v;
        if (z4) {
            long j = ((iq9) nq9Var).f15198a;
            ehf0Var.o();
            H(new a21((byte) 4, j));
            G(xr9.f41358a);
            return;
        }
        if (nq9Var instanceof gq9) {
            ehf0Var.p(AuthorizationHeaderIms.YES);
            p7m0 p7m0Var2 = ocjVar.f25029a;
            do {
                value2 = p7m0Var2.getValue();
                value2.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var2.m(value2, cs9.a((cs9) value2, null, null, true, null, 27)));
            sac.V(jiu0.a(this), new vs9(this, (byte) 0), new vb8(this, (byte) 26), mneVar.c, new fr9(this, yjeVar, (byte) 2), 8);
            return;
        }
        if (nq9Var instanceof hq9) {
            ehf0Var.p(AuthorizationHeaderIms.NO);
            p7m0 p7m0Var3 = ocjVar.f25029a;
            do {
                value = p7m0Var3.getValue();
                value.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var3.m(value, cs9.a((cs9) value, null, null, false, null, 15)));
            return;
        }
        if (nq9Var instanceof jq9) {
            M();
            return;
        }
        if (nq9Var instanceof mq9) {
            sac.V(jiu0.a(this), zs9.f44895a, null, mneVar.c, new xs9(this, yjeVar, b), 10);
        } else if (nq9Var instanceof lq9) {
            M();
        } else {
            t9f.b();
        }
    }
}
