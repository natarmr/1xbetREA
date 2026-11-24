package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class g7r0 extends i3t0 {
    public static final /* synthetic */ int L = 0;
    public final r9u A;
    public final yo4 B;
    public final zr1 C;
    public final s31 D;
    public final cyu E;
    public final bby F;
    public c4m0 G;
    public bby H;
    public bby I;
    public bby J;
    public bby K;
    public final vzg0 o;
    public final mne p;
    public final i1w0 q;
    public final m1e r;
    public final pru s;
    public final zpu t;
    public final wdu u;
    public final hjd v;
    public final j3c w;
    public final luu x;
    public final lbu y;
    public final epi0 z;

    /* JADX WARN: Illegal instructions before constructor call */
    public g7r0(vzg0 vzg0Var, mne mneVar, g2v g2vVar, i1w0 i1w0Var, y78 y78Var, m7r0 m7r0Var, ctf0 ctf0Var, m1e m1eVar, pru pruVar, zpu zpuVar, wdu wduVar, hjd hjdVar, j3c j3cVar, luu luuVar, lbu lbuVar, xsu xsuVar, epi0 epi0Var, r9u r9uVar, yo4 yo4Var, zr1 zr1Var, s31 s31Var, cyu cyuVar) {
        ctf0Var.getClass();
        m1eVar.getClass();
        r9uVar.getClass();
        rwj rwjVar = mneVar.f22085a;
        g090 g090VarP = cvm0.p(rwjVar, rwjVar);
        yje yjeVar = null;
        super(new ng0(pruVar, (Object) vzg0Var, (Object) m7r0Var, (Object) g2vVar, (Object) y78Var, (byte) 16), g090VarP, new h0j0(ctf0Var, (byte) 20), (yzn0) null);
        this.o = vzg0Var;
        this.p = mneVar;
        this.q = i1w0Var;
        this.r = m1eVar;
        this.s = pruVar;
        this.t = zpuVar;
        this.u = wduVar;
        this.v = hjdVar;
        this.w = j3cVar;
        this.x = luuVar;
        this.y = lbuVar;
        this.z = epi0Var;
        this.A = r9uVar;
        this.B = yo4Var;
        this.C = zr1Var;
        this.D = s31Var;
        this.E = cyuVar;
        bby bbyVar = this.F;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.F = sac.V(jiu0.a(this), a7r0.f387a, null, rwjVar, new meq0((Object) this, yjeVar, (byte) 10), 10);
        }
        bby bbyVar2 = this.K;
        if (bbyVar2 != null) {
            bbyVar2.cancel(null);
        }
        this.K = i3t0.F(this, hjdVar, null, null, new shq0((byte) 15), 119);
        slb.U(new fnq(((m8l0) ((lef0) xsuVar.f41434a).f19899a).f21376a, new e7r0(this, yjeVar, (byte) 0), (byte) 4), d5c.S(jiu0.a(this), rwjVar));
    }

    public final void M(boolean z) {
        if (z || ((w6r0) D()).n) {
            int iOrdinal = ((w6r0) D()).d.ordinal();
            yje yjeVar = null;
            mne mneVar = this.p;
            final byte b = 1;
            if (iOrdinal == 0) {
                v3c.N(this.I);
                bby bbyVar = this.H;
                if (z) {
                    v3c.N(bbyVar);
                } else if (bbyVar != null && bbyVar.isActive()) {
                    return;
                }
                this.H = sac.V(jiu0.a(this), new Function1(this) { // from class: a.z6r0
                    public final /* synthetic */ g7r0 b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Object value;
                        Object value2;
                        byte b2 = b;
                        g7r0 g7r0Var = this.b;
                        switch (b2) {
                            case 0:
                                Throwable th = (Throwable) obj;
                                th.getClass();
                                p7m0 p7m0Var = g7r0Var.i.f25029a;
                                do {
                                    value = p7m0Var.getValue();
                                    value.getClass();
                                    g7r0Var.f.getClass();
                                } while (!p7m0Var.m(value, w6r0.a((w6r0) value, false, false, null, null, null, null, null, null, null, null, null, false, false, null, null, new ddt(th), false, false, false, 7733247)));
                                break;
                            default:
                                Throwable th2 = (Throwable) obj;
                                th2.getClass();
                                p7m0 p7m0Var2 = g7r0Var.i.f25029a;
                                do {
                                    value2 = p7m0Var2.getValue();
                                    value2.getClass();
                                    g7r0Var.f.getClass();
                                } while (!p7m0Var2.m(value2, w6r0.a((w6r0) value2, false, false, null, null, null, null, null, null, null, null, null, false, false, null, new ddt(th2), null, false, false, false, 8060927)));
                                break;
                        }
                        return Unit.f46060a;
                    }
                }, null, mneVar.b, new c7r0(this, z, yjeVar, b), 10);
                return;
            }
            if (iOrdinal != 1) {
                t9f.b();
                return;
            }
            v3c.N(this.H);
            bby bbyVar2 = this.I;
            if (z) {
                v3c.N(bbyVar2);
            } else if (bbyVar2 != null && bbyVar2.isActive()) {
                return;
            }
            final byte b2 = 0;
            this.I = sac.V(jiu0.a(this), new Function1(this) { // from class: a.z6r0
                public final /* synthetic */ g7r0 b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Object value;
                    Object value2;
                    byte b3 = b2;
                    g7r0 g7r0Var = this.b;
                    switch (b3) {
                        case 0:
                            Throwable th = (Throwable) obj;
                            th.getClass();
                            p7m0 p7m0Var = g7r0Var.i.f25029a;
                            do {
                                value = p7m0Var.getValue();
                                value.getClass();
                                g7r0Var.f.getClass();
                            } while (!p7m0Var.m(value, w6r0.a((w6r0) value, false, false, null, null, null, null, null, null, null, null, null, false, false, null, null, new ddt(th), false, false, false, 7733247)));
                            break;
                        default:
                            Throwable th2 = (Throwable) obj;
                            th2.getClass();
                            p7m0 p7m0Var2 = g7r0Var.i.f25029a;
                            do {
                                value2 = p7m0Var2.getValue();
                                value2.getClass();
                                g7r0Var.f.getClass();
                            } while (!p7m0Var2.m(value2, w6r0.a((w6r0) value2, false, false, null, null, null, null, null, null, null, null, null, false, false, null, new ddt(th2), null, false, false, false, 8060927)));
                            break;
                    }
                    return Unit.f46060a;
                }
            }, null, mneVar.b, new c7r0(this, z, yjeVar, b2), 10);
        }
    }

    public final void N(String str) {
        if (!((w6r0) D()).c) {
            return;
        }
        String str2 = str;
        this.o.e("SAVED_QUERY_STATE_HANDLE_KEY", str2);
        boolean z = !Intrinsics.d(StringsKt.u0(str2).toString(), StringsKt.u0(((w6r0) D()).m).toString());
        p7m0 p7m0Var = this.i.f25029a;
        while (true) {
            Object value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
            if (p7m0Var.m(value, w6r0.a((w6r0) value, false, false, null, null, null, null, null, null, null, null, str2, false, z, null, null, null, false, false, false, 8368127))) {
                return;
            } else {
                str2 = str;
            }
        }
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        wgh0 wgh0Var;
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        Object value6;
        Object value7;
        n6r0 n6r0Var = (n6r0) obj;
        n6r0Var.getClass();
        if (n6r0Var.equals(a6r0.f331a)) {
            E();
            return;
        }
        yje yjeVar = null;
        byte b = 1;
        if (n6r0Var.equals(b6r0.f2069a)) {
            c4m0 c4m0Var = this.G;
            mne mneVar = this.p;
            if (c4m0Var == null || !c4m0Var.isActive()) {
                byte b2 = 3;
                this.G = slb.U(new dnq(new fnq(this.r.b(), new e7r0(this, yjeVar, b), (byte) 4), new pyn0(b2, yjeVar, b2), (byte) 1), d5c.S(jiu0.a(this), mneVar.b));
            }
            bby bbyVar = this.J;
            if (bbyVar == null || !bbyVar.isActive()) {
                this.J = sac.V(jiu0.a(this), f7r0.f9071a, null, mneVar.f22085a, new wup0(this, yjeVar, (byte) 2), 10);
            }
            bby bbyVar2 = this.K;
            if (bbyVar2 != null) {
                bbyVar2.cancel(null);
            }
            this.K = i3t0.F(this, this.v, null, null, new shq0((byte) 15), 119);
            return;
        }
        if (n6r0Var.equals(c6r0.f3833a)) {
            bby bbyVar3 = this.J;
            if (bbyVar3 != null) {
                bbyVar3.cancel(null);
            }
            bby bbyVar4 = this.H;
            if (bbyVar4 != null) {
                bbyVar4.cancel(null);
            }
            bby bbyVar5 = this.I;
            if (bbyVar5 != null) {
                bbyVar5.cancel(null);
            }
            c4m0 c4m0Var2 = this.G;
            if (c4m0Var2 != null) {
                c4m0Var2.cancel(null);
            }
            bby bbyVar6 = this.K;
            if (bbyVar6 != null) {
                bbyVar6.cancel(null);
                return;
            }
            return;
        }
        boolean zEquals = n6r0Var.equals(d6r0.f5565a);
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        vzg0 vzg0Var = this.o;
        if (!zEquals) {
            if (n6r0Var instanceof g6r0) {
                N(((g6r0) n6r0Var).f10782a);
                return;
            }
            if (n6r0Var instanceof l6r0) {
                m7r0 m7r0Var = ((l6r0) n6r0Var).f19522a ? m7r0.f21334a : m7r0.b;
                vzg0Var.e("SAVED_CURRENT_TAB_KEY", m7r0Var);
                p7m0 p7m0Var = ocjVar.f25029a;
                do {
                    value6 = p7m0Var.getValue();
                    value6.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var.m(value6, w6r0.a((w6r0) value6, false, false, m7r0Var, null, null, null, null, null, null, null, null, false, false, null, null, null, false, false, false, 8388599)));
                M(false);
                return;
            }
            if (n6r0Var.equals(h6r0.f12543a)) {
                int iOrdinal = ((w6r0) D()).d.ordinal();
                if (iOrdinal == 0) {
                    p7m0 p7m0Var2 = ocjVar.f25029a;
                    do {
                        value4 = p7m0Var2.getValue();
                        value4.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var2.m(value4, w6r0.a((w6r0) value4, false, false, null, null, null, null, null, null, null, null, null, false, false, null, null, null, true, false, false, 8126463)));
                    bby bbyVar7 = this.H;
                    if (bbyVar7 != null) {
                        bbyVar7.cancel(null);
                    }
                } else {
                    if (iOrdinal != 1) {
                        t9f.b();
                        return;
                    }
                    p7m0 p7m0Var3 = ocjVar.f25029a;
                    do {
                        value5 = p7m0Var3.getValue();
                        value5.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var3.m(value5, w6r0.a((w6r0) value5, false, false, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, true, false, 7864319)));
                    bby bbyVar8 = this.I;
                    if (bbyVar8 != null) {
                        bbyVar8.cancel(null);
                    }
                }
                M(true);
                return;
            }
            if (n6r0Var.equals(i6r0.f14256a)) {
                p7m0 p7m0Var4 = ocjVar.f25029a;
                do {
                    value3 = p7m0Var4.getValue();
                    value3.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var4.m(value3, w6r0.a((w6r0) value3, false, false, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, false, false, 8372223)));
                return;
            }
            if (n6r0Var.equals(e6r0.f7301a)) {
                M(true);
                return;
            }
            if (n6r0Var.equals(k6r0.f17785a)) {
                boolean z = !((w6r0) D()).b;
                vzg0Var.e("SAVED_VIDEO_FILTER_KEY", Boolean.valueOf(z));
                this.B.e(z, dt2.MATCHES, ct2.LIVE);
                this.C.g(g1p.MATCHES, z, f1p.LIVE);
                p7m0 p7m0Var5 = ocjVar.f25029a;
                do {
                    value2 = p7m0Var5.getValue();
                    value2.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var5.m(value2, w6r0.a((w6r0) value2, z, false, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, false, false, 8388605)));
                ((m8l0) ((lef0) this.z.b).f19899a).f21376a.o(null, Boolean.valueOf(z));
                return;
            }
            if (n6r0Var.equals(j6r0.f16002a)) {
                int iOrdinal2 = ((w6r0) D()).d.ordinal();
                if (iOrdinal2 == 0) {
                    wgh0Var = wgh0.SPORT_LIVE;
                } else {
                    if (iOrdinal2 != 1) {
                        t9f.b();
                        return;
                    }
                    wgh0Var = wgh0.SPORT_LINE;
                }
                this.D.g(wgh0Var);
                this.E.C(wgh0Var.f39117a);
                vzg0Var.e("SAVED_SEARCH_IS_ACTIVE_KEY", Boolean.TRUE);
                p7m0 p7m0Var6 = ocjVar.f25029a;
                do {
                    value = p7m0Var6.getValue();
                    value.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var6.m(value, w6r0.a((w6r0) value, false, true, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, false, false, 8388603)));
                return;
            }
            boolean zEquals2 = n6r0Var.equals(f6r0.f9027a);
            t6r0 t6r0Var = t6r0.f33433a;
            if (zEquals2) {
                G(t6r0Var);
                return;
            }
            if (n6r0Var instanceof y5r0) {
                i3t0.A(this, this.v, ((y5r0) n6r0Var).f42063a, null, null, 6);
                return;
            }
            if (n6r0Var.equals(m6r0.f21286a)) {
                G(t6r0Var);
                return;
            } else if (n6r0Var instanceof z5r0) {
                i3t0.A(this, this.v, ebc.n0(((z5r0) n6r0Var).f43833a), null, null, 6);
                return;
            } else {
                t9f.b();
                return;
            }
        }
        if (((w6r0) D()).c) {
            N("");
            vzg0Var.e("SAVED_SEARCH_IS_ACTIVE_KEY", Boolean.FALSE);
            p7m0 p7m0Var7 = ocjVar.f25029a;
            do {
                value7 = p7m0Var7.getValue();
                value7.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var7.m(value7, w6r0.a((w6r0) value7, false, false, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, false, false, 8388603)));
            return;
        }
        i1w0 i1w0Var = this.q;
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
