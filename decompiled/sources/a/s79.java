package a;

import com.huawei.hms.framework.common.BundleUtil;
import org.xplatform.game_broadcasting.api.presentation.models.BroadcastingZoneLandscapeParams;

/* JADX INFO: loaded from: classes4.dex */
public final class s79 extends i3t0 {
    public static final /* synthetic */ int A = 0;
    public final BroadcastingZoneLandscapeParams o;
    public final m1e p;
    public final mne q;
    public final ali r;
    public final a5v s;
    public final sdi0 t;
    public final fuj0 u;
    public final nw20 v;
    public final chf0 w;
    public final xex x;
    public c4m0 y;
    public bby z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s79(BroadcastingZoneLandscapeParams broadcastingZoneLandscapeParams, m1e m1eVar, mne mneVar, ali aliVar, a5v a5vVar, sdi0 sdi0Var, fuj0 fuj0Var, nw20 nw20Var, chf0 chf0Var, xex xexVar, wgu wguVar, bdu bduVar, ctf0 ctf0Var) {
        super(new kk0(broadcastingZoneLandscapeParams, bduVar, wguVar, (byte) 14), cvm0.p(mneVar.c, mneVar.f22085a), new ep4(ctf0Var, (byte) 12), (yzn0) null);
        m1eVar.getClass();
        ctf0Var.getClass();
        this.o = broadcastingZoneLandscapeParams;
        this.p = m1eVar;
        this.q = mneVar;
        this.r = aliVar;
        this.s = a5vVar;
        this.t = sdi0Var;
        this.u = fuj0Var;
        this.v = nw20Var;
        this.w = chf0Var;
        this.x = xexVar;
        String str = s79.class.getSimpleName() + BundleUtil.UNDERLINE_TAG + ((o79) D()).f24775a;
        p7m0 p7m0Var = this.i.f25029a;
        while (true) {
            Object value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
            String str2 = str;
            if (p7m0Var.m(value, o79.a((o79) value, false, false, false, false, null, null, false, str2, 16383))) {
                return;
            } else {
                str = str2;
            }
        }
    }

    public final void M() {
        Object value;
        if (this.o.e) {
            O();
            return;
        }
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
        } while (!p7m0Var.m(value, o79.a((o79) value, false, false, false, false, null, null, false, null, 24575)));
        G(l79.f19547a);
        this.r.d();
        i3t0.K(this, this.q.f22085a, null, new r79(this, null, (byte) 0), 2);
    }

    @Override // a.i3t0, a.k3t0
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public final void x(e79 e79Var) {
        Object value;
        o79 o79Var;
        w3w0 w3w0Var;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        Object value6;
        Object value7;
        Object value8;
        Object value9;
        e79Var.getClass();
        boolean z = e79Var instanceof v69;
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        if (z) {
            boolean z2 = ((v69) e79Var).f36864a;
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value9 = p7m0Var.getValue();
                value9.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var.m(value9, o79.a((o79) value9, false, false, false, false, null, null, z2, null, 28671)));
            return;
        }
        byte b = 1;
        if (e79Var instanceof w69) {
            w3w0 w3w0Var2 = ((w69) e79Var).f38615a == 1 ? w3w0.b : w3w0.f38519a;
            p7m0 p7m0Var2 = ocjVar.f25029a;
            do {
                value8 = p7m0Var2.getValue();
                value8.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var2.m(value8, o79.a((o79) value8, false, false, false, false, w3w0Var2, w3w0Var2, false, null, 29695)));
            return;
        }
        boolean zEquals = e79Var.equals(u69.f35127a);
        byte b2 = 2;
        mne mneVar = this.q;
        yje yjeVar = null;
        if (zEquals) {
            c4m0 c4m0Var = this.y;
            if (c4m0Var == null || !c4m0Var.isActive()) {
                this.y = i3t0.L(this, new fnq(this.p.b(), new qv3(this, yjeVar, (byte) 21), (byte) 4), mneVar.f22085a, null, 2);
                return;
            }
            return;
        }
        boolean zEquals2 = e79Var.equals(t69.f33405a);
        nw20 nw20Var = this.v;
        if (zEquals2) {
            c4m0 c4m0Var2 = this.y;
            if (c4m0Var2 != null) {
                c4m0Var2.cancel(null);
            }
            p7m0 p7m0Var3 = ocjVar.f25029a;
            do {
                value7 = p7m0Var3.getValue();
                value7.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var3.m(value7, o79.a((o79) value7, false, false, false, false, null, w3w0.b, false, null, 30527)));
            nw20Var.o(((o79) D()).o);
            return;
        }
        if (e79Var.equals(r69.f29924a)) {
            p7m0 p7m0Var4 = ocjVar.f25029a;
            do {
                value6 = p7m0Var4.getValue();
                value6.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var4.m(value6, o79.a((o79) value6, true, true, false, false, null, null, false, null, 32575)));
            P();
            return;
        }
        if (e79Var.equals(q69.f28190a)) {
            p7m0 p7m0Var5 = ocjVar.f25029a;
            do {
                value5 = p7m0Var5.getValue();
                value5.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var5.m(value5, o79.a((o79) value5, false, false, false, true, null, null, false, null, 32127)));
            nw20Var.o(((o79) D()).o);
            return;
        }
        if (e79Var.equals(s69.f31692a)) {
            p7m0 p7m0Var6 = ocjVar.f25029a;
            do {
                value4 = p7m0Var6.getValue();
                value4.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var6.m(value4, o79.a((o79) value4, false, false, false, false, null, w3w0.b, false, null, 30591)));
            return;
        }
        if (e79Var.equals(p69.f26444a)) {
            E();
            return;
        }
        if (e79Var.equals(x69.f40351a)) {
            M();
            return;
        }
        if (e79Var.equals(y69.f42085a)) {
            M();
            return;
        }
        if (e79Var.equals(a79.f355a)) {
            G(m79.f21308a);
            i3t0.K(this, mneVar.f22085a, null, new r79(this, yjeVar, b), 2);
            this.r.d();
            return;
        }
        if (e79Var.equals(b79.f2094a)) {
            O();
            return;
        }
        if (e79Var.equals(z69.f43854a)) {
            if (((o79) D()).g) {
                p7m0 p7m0Var7 = ocjVar.f25029a;
                do {
                    value3 = p7m0Var7.getValue();
                    value3.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var7.m(value3, o79.a((o79) value3, false, false, false, false, null, w3w0.b, false, null, 30527)));
                nw20Var.o(((o79) D()).o);
                return;
            }
            p7m0 p7m0Var8 = ocjVar.f25029a;
            do {
                value2 = p7m0Var8.getValue();
                value2.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var8.m(value2, o79.a((o79) value2, true, false, false, false, null, null, false, null, 32703)));
            P();
            return;
        }
        if (!e79Var.equals(d79.f5585a)) {
            if (!e79Var.equals(c79.f3850a)) {
                t9f.b();
                return;
            }
            bby bbyVar = this.z;
            if (bbyVar == null || !bbyVar.isActive()) {
                this.z = i3t0.K(this, mneVar.c, null, new r79(this, yjeVar, b2), 2);
                return;
            }
            return;
        }
        if (((o79) D()).m) {
            p7m0 p7m0Var9 = ocjVar.f25029a;
            do {
                value = p7m0Var9.getValue();
                value.getClass();
                o79Var = (o79) value;
                oyg0Var.getClass();
                w3w0 w3w0Var3 = o79Var.k;
                w3w0Var = w3w0.b;
                if (w3w0Var3 == w3w0Var) {
                    w3w0Var = w3w0.f38519a;
                }
            } while (!p7m0Var9.m(value, o79.a(o79Var, false, false, false, false, w3w0Var, null, false, null, 31743)));
        }
    }

    public final void O() {
        Object value;
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
        } while (!p7m0Var.m(value, o79.a((o79) value, false, false, false, false, null, null, false, null, 24575)));
        i3t0.K(this, null, null, new r79(this, null, (byte) 3), 3);
        G(new k79(new vb8(this, (byte) 18)));
    }

    public final void P() {
        this.u.A(((o79) D()).f24775a, ((o79) D()).b, ((o79) D()).d, v39.ZONE, String.valueOf(((o79) D()).c), ((o79) D()).o);
    }

    @Override // a.diu0
    public final void v() {
        if (((o79) D()).n) {
            b49 b49VarM = this.w.M(((o79) D()).o);
            if (b49VarM instanceof a49) {
                a49 a49Var = (a49) b49VarM;
                this.x.O(a49Var.b, a49Var.c, a49Var.f212a, a49Var.d, a49Var.e);
            }
        }
    }
}
