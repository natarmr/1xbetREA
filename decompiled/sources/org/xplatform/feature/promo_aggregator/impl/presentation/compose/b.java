package org.xplatform.feature.promo_aggregator.impl.presentation.compose;

import a.a1g;
import a.a9c0;
import a.b1j;
import a.b4j;
import a.b9c0;
import a.bby;
import a.c4m0;
import a.c8d;
import a.ck60;
import a.ctf0;
import a.cu;
import a.cvm0;
import a.dtb;
import a.duj;
import a.eld0;
import a.fnq;
import a.fuj0;
import a.g4u;
import a.h9c0;
import a.i1w0;
import a.i3t0;
import a.i9c0;
import a.iac0;
import a.iv80;
import a.ix0;
import a.je;
import a.jiu0;
import a.k9c0;
import a.kc60;
import a.kki;
import a.l8c0;
import a.m1e;
import a.mne;
import a.n660;
import a.nmt;
import a.ocj;
import a.oe50;
import a.oyg0;
import a.p0w0;
import a.p6b0;
import a.p7m0;
import a.paw;
import a.peg0;
import a.ppb0;
import a.pru;
import a.q9c0;
import a.r7a0;
import a.r9c0;
import a.rpt;
import a.s8c0;
import a.sac;
import a.ssa0;
import a.t8c0;
import a.t9c0;
import a.t9f;
import a.u8c0;
import a.u9c0;
import a.v8c0;
import a.vzg0;
import a.wg0;
import a.x8c0;
import a.y7d;
import a.yje;
import a.yzn0;
import a.z8b0;
import a.z8c0;
import a.zga0;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends i3t0 {
    public static final /* synthetic */ int Q = 0;
    public final kc60 A;
    public final nmt B;
    public final g4u C;
    public final g4u D;
    public final n660 E;
    public final cu F;
    public final kki G;
    public bby H;
    public c4m0 I;
    public bby J;
    public c4m0 K;
    public bby L;
    public c4m0 M;
    public bby N;
    public bby O;
    public bby P;
    public final eld0 o;
    public final vzg0 p;
    public final fuj0 q;
    public final mne r;
    public final i1w0 s;
    public final duj t;
    public final m1e u;
    public final b4j v;
    public final ix0 w;
    public final peg0 x;
    public final b4j y;
    public final je z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(eld0 eld0Var, vzg0 vzg0Var, fuj0 fuj0Var, mne mneVar, i1w0 i1w0Var, duj dujVar, m1e m1eVar, b4j b4jVar, ctf0 ctf0Var, ix0 ix0Var, peg0 peg0Var, b4j b4jVar2, je jeVar, kc60 kc60Var, nmt nmtVar, g4u g4uVar, g4u g4uVar2, n660 n660Var, cu cuVar, kki kkiVar, pru pruVar) {
        super(new ck60(ctf0Var, vzg0Var, pruVar, (byte) 11), cvm0.p(mneVar.c, mneVar.b), new iv80(ctf0Var, (byte) 7), (yzn0) null);
        m1eVar.getClass();
        ctf0Var.getClass();
        this.o = eld0Var;
        this.p = vzg0Var;
        this.q = fuj0Var;
        this.r = mneVar;
        this.s = i1w0Var;
        this.t = dujVar;
        this.u = m1eVar;
        this.v = b4jVar;
        this.w = ix0Var;
        this.x = peg0Var;
        this.y = b4jVar2;
        this.z = jeVar;
        this.A = kc60Var;
        this.B = nmtVar;
        this.C = g4uVar;
        this.D = g4uVar2;
        this.E = n660Var;
        this.F = cuVar;
        this.G = kkiVar;
    }

    public final void M() {
        bby bbyVar = this.O;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.O = sac.V(jiu0.a(this), q9c0.f28340a, null, this.r.b, new r9c0(this, null, (byte) 0), 10);
        }
    }

    public final void N() {
        c4m0 c4m0Var = this.M;
        byte b = 1;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            this.M = sac.T(new fnq(this.u.b(), new t9c0(this, null, b), (byte) 4), jiu0.a(this), new p6b0(2, this, b.class, "onError", "onError(Ljava/lang/Throwable;)V", 4, (byte) 25));
        }
    }

    public final void O() {
        if (((iac0) D()).h) {
            return;
        }
        bby bbyVar = this.J;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.J = sac.V(jiu0.a(this), new l8c0(1, this, b.class, "onError", "onError(Ljava/lang/Throwable;)V", 0, (byte) 8), null, this.r.b, new z8b0(this, null, (byte) 2), 10);
        }
    }

    public final void P(Throwable th) {
        this.t.b(th, new r7a0(this, th, (byte) 19));
    }

    public final void Q(long j) {
        bby bbyVar = this.L;
        yje yjeVar = null;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
        this.L = sac.V(jiu0.a(this), new l8c0(1, this, b.class, "onError", "onError(Ljava/lang/Throwable;)V", 0, (byte) 9), null, this.r.b, new wg0(j, this, yjeVar, (byte) 9), 10);
    }

    @Override // a.diu0
    public final void v() {
        c4m0 c4m0Var = this.I;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
        c4m0 c4m0Var2 = this.K;
        if (c4m0Var2 != null) {
            c4m0Var2.cancel(null);
        }
        c4m0 c4m0Var3 = this.M;
        if (c4m0Var3 != null) {
            c4m0Var3.cancel(null);
        }
        M();
        bby bbyVar = this.O;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
        bby bbyVar2 = this.P;
        if (bbyVar2 != null) {
            bbyVar2.cancel(null);
        }
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        Object value2;
        Object value3;
        yje yjeVar;
        int i;
        Object value4;
        Object value5;
        Object value6;
        k9c0 k9c0Var = (k9c0) obj;
        k9c0Var.getClass();
        boolean zEquals = k9c0Var.equals(b9c0.f2203a);
        byte b = 0;
        i1w0 i1w0Var = this.s;
        if (!zEquals) {
            if (k9c0Var.equals(z8c0.f43961a)) {
                E();
                return;
            }
            boolean z = k9c0Var instanceof s8c0;
            PromoCodeCacheContentState.Empty empty = PromoCodeCacheContentState.Empty.f46657a;
            oyg0 oyg0Var = this.f;
            ocj ocjVar = this.i;
            if (z) {
                String str = ((s8c0) k9c0Var).f31794a;
                p7m0 p7m0Var = ocjVar.f25029a;
                do {
                    value5 = p7m0Var.getValue();
                    value5.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var.m(value5, iac0.a((iac0) value5, empty, false, null, null, null, null, false, false, false, 8189)));
                if (str.length() == 0) {
                    return;
                }
                bby bbyVar = this.H;
                if (bbyVar == null || !bbyVar.isActive()) {
                    p7m0 p7m0Var2 = ocjVar.f25029a;
                    do {
                        value6 = p7m0Var2.getValue();
                        value6.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var2.m(value6, iac0.a((iac0) value6, null, true, null, null, null, null, false, false, false, 8187)));
                    ix0 ix0Var = this.w;
                    ix0Var.getClass();
                    b1j.v(str, ix0Var.f15516a, 3292L);
                    this.v.f1961a.c("promocode_activate_call");
                    this.H = sac.V(jiu0.a(this), new zga0((Object) this, (Object) str, (byte) 29), new ssa0(this, (byte) 18), this.r.f22085a, new a(this, str, null), 8);
                    return;
                }
                return;
            }
            if (k9c0Var.equals(x8c0.f40456a)) {
                i1w0Var.d(new ppb0(this, (byte) 10));
                return;
            }
            boolean zEquals2 = k9c0Var.equals(v8c0.f36975a);
            vzg0 vzg0Var = this.p;
            if (zEquals2) {
                p7m0 p7m0Var3 = ocjVar.f25029a;
                do {
                    value4 = p7m0Var3.getValue();
                    value4.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var3.m(value4, iac0.a((iac0) value4, empty, false, null, "", null, null, false, false, false, 8173)));
                vzg0Var.e("CONTENT_STATE_KEY", ((iac0) D()).b);
                return;
            }
            if (k9c0Var.equals(a9c0.f469a)) {
                c4m0 c4m0Var = this.I;
                if (c4m0Var == null || !c4m0Var.isActive()) {
                    cu cuVar = this.F;
                    yjeVar = null;
                    i = 1;
                    this.I = sac.T(new a1g(((rpt) cuVar.b).f(), cuVar, (byte) 4), jiu0.a(this), new p6b0(2, this, b.class, "onError", "onError(Ljava/lang/Throwable;)V", 4, (byte) 26));
                } else {
                    yjeVar = null;
                    i = 1;
                }
                O();
                N();
                sac.T(new fnq(dtb.z(this.A.a(), i), new u9c0(this, yjeVar, b), (byte) 4), jiu0.a(this), new p6b0(2, this, b.class, "onError", "onError(Ljava/lang/Throwable;)V", 4, (byte) 24));
                return;
            }
            if (k9c0Var.equals(u8c0.f35226a)) {
                c4m0 c4m0Var2 = this.I;
                if (c4m0Var2 != null) {
                    c4m0Var2.cancel(null);
                }
                c4m0 c4m0Var3 = this.K;
                if (c4m0Var3 != null) {
                    c4m0Var3.cancel(null);
                }
                c4m0 c4m0Var4 = this.M;
                if (c4m0Var4 != null) {
                    c4m0Var4.cancel(null);
                }
                M();
                return;
            }
            if (k9c0Var instanceof h9c0) {
                p7m0 p7m0Var4 = ocjVar.f25029a;
                do {
                    value3 = p7m0Var4.getValue();
                    value3.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var4.m(value3, iac0.a((iac0) value3, null, false, null, null, null, ((h9c0) k9c0Var).f12668a, false, false, false, 8127)));
                return;
            }
            if (k9c0Var instanceof t8c0) {
                p7m0 p7m0Var5 = ocjVar.f25029a;
                do {
                    value2 = p7m0Var5.getValue();
                    value2.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var5.m(value2, iac0.a((iac0) value2, null, false, null, ((t8c0) k9c0Var).f33507a, null, null, false, false, false, 8175)));
                return;
            }
            if (!(k9c0Var instanceof i9c0)) {
                t9f.b();
                return;
            }
            p7m0 p7m0Var6 = ocjVar.f25029a;
            do {
                value = p7m0Var6.getValue();
                value.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var6.m(value, iac0.a((iac0) value, null, false, null, null, null, null, false, false, ((i9c0) k9c0Var).f14379a, 4095)));
            vzg0Var.e("KEY_WAS_KEYBOARD_OPEN", Boolean.valueOf(((i9c0) k9c0Var).f14379a));
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorP;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0Var.a((oe50) pawVar.next());
            }
        }
    }
}
