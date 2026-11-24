package a;

import android.javax.sip.message.Response;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class ul2 extends i3t0 {
    public static final /* synthetic */ int S = 0;
    public final kd30 A;
    public final bzu B;
    public final abu C;
    public final a6u D;
    public final hjd E;
    public final m1e F;
    public final svu G;
    public final mne H;
    public final duj I;
    public final mii0 J;
    public final x20 K;
    public final r9u L;
    public final bn6 M;
    public final je N;
    public final hsj O;
    public c4m0 P;
    public bby Q;
    public bby R;
    public final vzg0 o;
    public final i1w0 p;
    public final pru q;
    public final prc r;
    public final j3c s;
    public final lbu t;
    public final luu u;
    public final h3c v;
    public final qv2 w;
    public final y78 x;
    public final g2v y;
    public final vsc z;

    /* JADX WARN: Illegal instructions before constructor call */
    public ul2(vzg0 vzg0Var, i1w0 i1w0Var, pru pruVar, prc prcVar, j3c j3cVar, lbu lbuVar, luu luuVar, h3c h3cVar, qv2 qv2Var, y78 y78Var, g2v g2vVar, vsc vscVar, kd30 kd30Var, bzu bzuVar, abu abuVar, a6u a6uVar, hjd hjdVar, m1e m1eVar, svu svuVar, mne mneVar, ctf0 ctf0Var, duj dujVar, mii0 mii0Var, x20 x20Var, r9u r9uVar, bn6 bn6Var, je jeVar, hsj hsjVar) {
        i1w0Var.getClass();
        m1eVar.getClass();
        ctf0Var.getClass();
        r9uVar.getClass();
        rwj rwjVar = mneVar.f22085a;
        g090 g090VarP = cvm0.p(rwjVar, rwjVar);
        yje yjeVar = null;
        super(new wg2(vzg0Var, (byte) 1), g090VarP, new uc(ctf0Var, (byte) 25), (yzn0) null);
        this.o = vzg0Var;
        this.p = i1w0Var;
        this.q = pruVar;
        this.r = prcVar;
        this.s = j3cVar;
        this.t = lbuVar;
        this.u = luuVar;
        this.v = h3cVar;
        this.w = qv2Var;
        this.x = y78Var;
        this.y = g2vVar;
        this.z = vscVar;
        this.A = kd30Var;
        this.B = bzuVar;
        this.C = abuVar;
        this.D = a6uVar;
        this.E = hjdVar;
        this.F = m1eVar;
        this.G = svuVar;
        this.H = mneVar;
        this.I = dujVar;
        this.J = mii0Var;
        this.K = x20Var;
        this.L = r9uVar;
        this.M = bn6Var;
        this.N = jeVar;
        this.O = hsjVar;
        i3t0.K(this, null, null, new za(this, yjeVar, (byte) 10), 3);
        i3t0.K(this, null, null, new pl2(this, yjeVar, (byte) 0), 3);
    }

    public final void M() {
        Object value;
        bby bbyVar = this.Q;
        byte b = 1;
        if (bbyVar == null || !bbyVar.isActive()) {
            if ((((nl2) D()).d instanceof cds0) && ((nl2) D()).g) {
                p7m0 p7m0Var = this.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    this.f.getClass();
                } while (!p7m0Var.m(value, nl2.a((nl2) value, null, false, false, dds0.f5911a, false, false, false, null, null, Response.SERVICE_UNAVAILABLE)));
            }
            this.Q = i3t0.K(this, null, new bk2(1, this, ul2.class, "onDataLoadingError", "onDataLoadingError(Ljava/lang/Throwable;)V", 0, (byte) 1), new pl2(this, null, b), 1);
        }
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        qbs0 qbs0Var;
        List list;
        Object next;
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        Object value6;
        Object value7;
        xk2 xk2Var = (xk2) obj;
        xk2Var.getClass();
        super.x(xk2Var);
        if (xk2Var.equals(hk2.f13189a)) {
            E();
            return;
        }
        boolean zEquals = xk2Var.equals(gk2.f11426a);
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        yje yjeVar = null;
        if (zEquals) {
            c4m0 c4m0Var = this.P;
            if (c4m0Var != null) {
                c4m0Var.cancel(null);
            }
            bby bbyVar = this.Q;
            if (bbyVar != null) {
                bbyVar.cancel(null);
            }
            bby bbyVar2 = this.R;
            if (bbyVar2 != null) {
                bbyVar2.cancel(null);
            }
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value7 = p7m0Var.getValue();
                value7.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var.m(value7, nl2.a((nl2) value7, null, false, false, null, false, false, false, null, null, 479)));
            return;
        }
        if (xk2Var.equals(ik2.f14904a)) {
            c4m0 c4m0Var2 = this.P;
            byte b = 1;
            if (c4m0Var2 == null || !c4m0Var2.isActive()) {
                this.P = slb.U(new dnq(new fnq(this.F.b(), new pa((Object) this, yjeVar, (byte) 26), (byte) 4), new rj(this, yjeVar, b), (byte) 1), d5c.S(jiu0.a(this), this.H.f22085a));
            }
            v3c.N(this.R);
            this.R = i3t0.F(this, this.E, null, null, new ma2((byte) 14), 119);
            return;
        }
        if (xk2Var instanceof jk2) {
            i3t0.A(this, this.E, ebc.n0(((jk2) xk2Var).f16644a), null, null, 6);
            return;
        }
        if (xk2Var.equals(rk2.f30626a)) {
            p7m0 p7m0Var2 = ocjVar.f25029a;
            do {
                value6 = p7m0Var2.getValue();
                value6.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var2.m(value6, nl2.a((nl2) value6, null, false, false, null, false, false, true, null, null, 447)));
            M();
            return;
        }
        if (xk2Var.equals(sk2.f32327a)) {
            v3c.N(this.Q);
            p7m0 p7m0Var3 = ocjVar.f25029a;
            do {
                value5 = p7m0Var3.getValue();
                value5.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var3.m(value5, nl2.a((nl2) value5, null, false, false, null, false, true, true, null, null, Response.UNSUPPORTED_MEDIA_TYPE)));
            M();
            return;
        }
        if (xk2Var.equals(vk2.f37555a)) {
            p7m0 p7m0Var4 = ocjVar.f25029a;
            do {
                value4 = p7m0Var4.getValue();
                value4.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var4.m(value4, nl2.a((nl2) value4, null, false, false, null, true, false, false, null, null, 495)));
            return;
        }
        if (xk2Var.equals(uk2.f35806a)) {
            p7m0 p7m0Var5 = ocjVar.f25029a;
            do {
                value3 = p7m0Var5.getValue();
                value3.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var5.m(value3, nl2.a((nl2) value3, null, false, false, null, false, false, false, null, null, 495)));
            return;
        }
        if (xk2Var.equals(kk2.f18416a)) {
            i1w0 i1w0Var = this.p;
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
        } else {
            if (xk2Var instanceof wk2) {
                boolean z = ((wk2) xk2Var).f39288a;
                p7m0 p7m0Var6 = ocjVar.f25029a;
                do {
                    value2 = p7m0Var6.getValue();
                    value2.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var6.m(value2, nl2.a((nl2) value2, null, false, z, null, false, false, false, null, null, 507)));
                return;
            }
            boolean z2 = xk2Var instanceof mk2;
            vzg0 vzg0Var = this.o;
            if (z2) {
                qbs0 qbs0Var2 = ((mk2) xk2Var).f21922a;
                long j = qbs0Var2.f28453a.f2368a;
                mbs0 mbs0Var = qbs0Var2.b;
                s4i0 s4i0Var = new s4i0(j, mbs0Var.h);
                p7m0 p7m0Var7 = ocjVar.f25029a;
                do {
                    value = p7m0Var7.getValue();
                    value.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var7.m(value, nl2.a((nl2) value, null, false, false, null, false, false, false, s4i0Var, null, 383)));
                vzg0Var.e("SELECTED_TRACK_COEF_KEY", s4i0Var);
                m0k0 m0k0VarZ = q0x.Z(ycm0.A(qbs0Var2.f28453a));
                m97 m97VarC0 = dj8.c0(mbs0Var);
                long j2 = m0k0VarZ.f20959a;
                long j3 = m0k0VarZ.B;
                this.J.L(j2, j3 > 0 ? j3 : -1L, m97VarC0.i, -1L, kpb.v0(new fq2()), m0k0VarZ.x);
                this.K.h(m0k0VarZ.f20959a, j3 > 0 ? j3 : -1L, m97VarC0.i, -1L, kpb.v0(new fq2()), m0k0VarZ.x);
                G(new kl2(m0k0VarZ, m97VarC0));
                return;
            }
            if (xk2Var instanceof nk2) {
                i3t0.K(this, null, null, new za(this, ((nk2) xk2Var).f23662a, yjeVar, (byte) 11), 3);
                return;
            }
            if (!(xk2Var instanceof tk2)) {
                if (xk2Var.equals(ok2.f25386a)) {
                    s4i0 s4i0Var2 = ((nl2) D()).i;
                    if (s4i0Var2 != null) {
                        gds0 gds0Var = ((nl2) D()).d;
                        fds0 fds0Var = gds0Var instanceof fds0 ? (fds0) gds0Var : null;
                        if (fds0Var == null || (list = fds0Var.f9372a) == null) {
                            qbs0Var = null;
                        } else {
                            Iterator it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it.next();
                                qbs0 qbs0Var3 = (qbs0) next;
                                if (qbs0Var3.f28453a.f2368a == s4i0Var2.f31607a && qbs0Var3.b.h == s4i0Var2.b) {
                                    break;
                                }
                            }
                            qbs0Var = (qbs0) next;
                        }
                        if (qbs0Var == null) {
                            return;
                        }
                        i3t0.K(this, null, null, new r72(qbs0Var, this, yjeVar, (byte) 2), 3);
                        return;
                    }
                    return;
                }
                if (!(xk2Var instanceof lk2)) {
                    if (xk2Var.equals(qk2.f28866a)) {
                        G(il2.f14956a);
                        return;
                    }
                    if (!xk2Var.equals(pk2.f27116a)) {
                        t9f.b();
                        return;
                    }
                    oj9 oj9Var = this.z.f37943a.f28826a;
                    iun iunVar = iun.f15405a;
                    qz40 qz40VarA = oj9Var.a();
                    gj9 gj9Var = new gj9(iunVar);
                    p7m0 p7m0Var8 = (p7m0) qz40VarA;
                    p7m0Var8.getClass();
                    p7m0Var8.o(null, gj9Var);
                    oj9Var.c(iunVar);
                    return;
                }
                lk2 lk2Var = (lk2) xk2Var;
                zia ziaVar = lk2Var.f20177a;
                long j4 = lk2Var.b;
                if (ziaVar instanceof xia) {
                    f680[] f680VarArr = f680.f8998a;
                    this.J.T(j4, "bet_favor_watched");
                    this.K.u(j4, "bet_favor_watched");
                    G(hl2.f13235a);
                    return;
                }
                if (ziaVar instanceof yia) {
                    G(jl2.f16696a);
                    return;
                } else if (ziaVar instanceof via) {
                    G(gl2.f11471a);
                    return;
                } else {
                    if (ziaVar.equals(wia.f39205a)) {
                        return;
                    }
                    t9f.b();
                    return;
                }
            }
            qbs0 qbs0Var4 = ((tk2) xk2Var).f34073a;
            s4i0 s4i0Var3 = new s4i0(qbs0Var4.f28453a.f2368a, qbs0Var4.b.h);
            p7m0 p7m0Var9 = ocjVar.f25029a;
            while (true) {
                Object value8 = p7m0Var9.getValue();
                value8.getClass();
                oyg0Var.getClass();
                s4i0 s4i0Var4 = s4i0Var3;
                if (p7m0Var9.m(value8, nl2.a((nl2) value8, null, false, false, null, false, false, false, null, s4i0Var4, 255))) {
                    vzg0Var.e("REMOVING_TRACK_COEF_KEY", s4i0Var4);
                    G(ll2.f20227a);
                    return;
                }
                s4i0Var3 = s4i0Var4;
            }
        }
    }
}
