package a;

import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class dy60 extends i3t0 {
    public static final /* synthetic */ int S = 0;
    public final ctf0 A;
    public final foi0 B;
    public final mne C;
    public final nn60 D;
    public final oeg0 E;
    public final ih5 F;
    public final bn6 G;
    public final gg5 H;
    public final s64 I;
    public final cmt J;
    public final p7m0 K;
    public final p7m0 L;
    public c4m0 M;
    public c4m0 N;
    public bby O;
    public bby P;
    public final c4m0 Q;
    public bby R;
    public final i1w0 o;
    public final ouu p;
    public final wsf0 q;
    public final ali r;
    public final yoc s;
    public final yoc t;
    public final m1e u;
    public final ih5 v;
    public final l7k w;
    public final v88 x;
    public final dmt y;
    public final duj z;

    /* JADX WARN: Illegal instructions before constructor call */
    public dy60(i1w0 i1w0Var, ouu ouuVar, wsf0 wsf0Var, ali aliVar, yoc yocVar, yoc yocVar2, m1e m1eVar, ih5 ih5Var, l7k l7kVar, v88 v88Var, pru pruVar, dmt dmtVar, duj dujVar, g2v g2vVar, ctf0 ctf0Var, foi0 foi0Var, mne mneVar, nn60 nn60Var, jqt jqtVar, oeg0 oeg0Var, ih5 ih5Var2, bn6 bn6Var, gg5 gg5Var, s64 s64Var, cmt cmtVar, bzt bztVar) {
        m1eVar.getClass();
        ctf0Var.getClass();
        oeg0Var.getClass();
        g090 g090VarP = cvm0.p(mneVar.c, mneVar.b);
        yje yjeVar = null;
        super(new b6u(pruVar, (byte) 25), g090VarP, new o20(ctf0Var, g2vVar, (byte) 16), (yzn0) null);
        this.o = i1w0Var;
        this.p = ouuVar;
        this.q = wsf0Var;
        this.r = aliVar;
        this.s = yocVar;
        this.t = yocVar2;
        this.u = m1eVar;
        this.v = ih5Var;
        this.w = l7kVar;
        this.x = v88Var;
        this.y = dmtVar;
        this.z = dujVar;
        this.A = ctf0Var;
        this.B = foi0Var;
        this.C = mneVar;
        this.D = nn60Var;
        this.E = oeg0Var;
        this.F = ih5Var2;
        this.G = bn6Var;
        this.H = gg5Var;
        this.I = s64Var;
        this.J = cmtVar;
        kat katVar = kat.f17982a;
        this.K = q7m0.a(katVar);
        this.L = q7m0.a(katVar);
        P();
        G(lx60.f20800a);
        c4m0 c4m0Var = this.Q;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            this.Q = i3t0.L(this, new fnq(jqtVar.a(), new wx60(this, yjeVar, (byte) 0), (byte) 4), null, null, 3);
        }
    }

    public final void M(Throwable th) {
        Throwable th2;
        Object value;
        Object value2;
        Object value3;
        boolean z = ((qx60) D()).c.f4274a == null;
        if (((qx60) D()).h instanceof sq60) {
            return;
        }
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        if (th == null) {
            th2 = th;
        } else if (th instanceof j7t0) {
            p7m0 p7m0Var = ocjVar.f25029a;
            while (true) {
                Object value4 = p7m0Var.getValue();
                value4.getClass();
                oyg0Var.getClass();
                Throwable th3 = th;
                if (p7m0Var.m(value4, qx60.a((qx60) value4, null, null, false, false, false, th3, 95))) {
                    return;
                } else {
                    th = th3;
                }
            }
        } else {
            th2 = th;
            if (th2 instanceof sq60) {
                p7m0 p7m0Var2 = ocjVar.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var2.m(value2, qx60.a((qx60) value2, null, null, false, false, false, th2, 127)));
                return;
            }
            if ((th2 instanceof SocketTimeoutException) || (th2 instanceof UnknownHostException)) {
                if (z) {
                    p7m0 p7m0Var3 = ocjVar.f25029a;
                    do {
                        value = p7m0Var3.getValue();
                        value.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var3.m(value, qx60.a((qx60) value, null, null, false, false, false, th2, 127)));
                    return;
                }
                return;
            }
        }
        this.z.b(th2, new cr60((byte) 11));
        if (z) {
            p7m0 p7m0Var4 = ocjVar.f25029a;
            do {
                value3 = p7m0Var4.getValue();
                value3.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var4.m(value3, qx60.a((qx60) value3, null, null, false, false, false, th2, 127)));
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0025  */
    public final void N() {
        c4m0 c4m0Var = this.N;
        if (c4m0Var != null) {
            v3c.N(c4m0Var);
        }
        p7m0 p7m0Var = this.K;
        pat patVar = (pat) p7m0Var.getValue();
        patVar.getClass();
        boolean z = patVar instanceof kat;
        p7m0 p7m0Var2 = this.L;
        if (z) {
            G(lx60.f20800a);
        } else {
            pat patVar2 = (pat) p7m0Var2.getValue();
            patVar2.getClass();
            if (patVar2 instanceof kat) {
                G(lx60.f20800a);
            }
        }
        byte b = 1;
        xu3 xu3Var = new xu3(new p6d(p7m0Var, p7m0Var2, zx60.h, b), (byte) 8);
        yje yjeVar = null;
        byte b2 = 0;
        ay60 ay60Var = new ay60(this, yjeVar, b2);
        int i = aoq.f1214a;
        this.N = slb.U(ulb.L(new dnq(new fnq(new i89(new fnq(xu3Var, ay60Var, (byte) 3), (byte) 21), new ay60(this, yjeVar, b), (byte) 4), new by60(this, yjeVar, b2), (byte) 1), this.C.b), jiu0.a(this));
    }

    public final void O() {
        i1w0 i1w0Var = this.o;
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

    public final void P() {
        bby bbyVar = this.R;
        if (bbyVar != null) {
            v3c.N(bbyVar);
        }
        i3t0.B(this, this.D, new en60[]{new wm60(zn60.OneXFavourite)});
        this.R = i3t0.F(this, this.D, null, null, new cr60((byte) 10), 119);
    }

    public final void Q() {
        if (((qx60) D()).f) {
            bby bbyVar = this.O;
            yje yjeVar = null;
            if (bbyVar != null) {
                bbyVar.cancel(null);
            }
            this.O = sac.V(jiu0.a(this), new cy60(1, this, dy60.class, "handleThrowable", "handleThrowable(Ljava/lang/Throwable;)V", 0, (byte) 1), null, this.C.b, new ku60((diu0) this, yjeVar, (byte) 3), 10);
        }
    }

    public final void R(List list) {
        bby bbyVar = this.P;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.P = sac.f0(jiu0.a(this), this.t.a(), TimeUnit.MILLISECONDS, this.C.f22085a, new cy60(1, this, dy60.class, "handleThrowable", "handleThrowable(Ljava/lang/Throwable;)V", 0, (byte) 2), new ku60(this, list, null, (byte) 4), 32);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        Object value2;
        Object value3;
        qx60 qx60Var;
        List list;
        Object value4;
        bx60 bx60Var = (bx60) obj;
        bx60Var.getClass();
        super.x(bx60Var);
        boolean z = bx60Var instanceof ww60;
        byte b = 1;
        mne mneVar = this.C;
        Object obj2 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        if (z) {
            P();
            c4m0 c4m0Var = this.M;
            if (c4m0Var != null) {
                c4m0Var.cancel(null);
            }
            this.M = sac.T(new dnq(new fnq(this.u.b(), new wx60(this, objArr3 == true ? 1 : 0, b), (byte) 4), new by60(this, objArr2 == true ? 1 : 0, b), (byte) 1), d5c.S(jiu0.a(this), mneVar.b), foe.h);
            Q();
            return;
        }
        if (bx60Var instanceof vw60) {
            c4m0 c4m0Var2 = this.M;
            if (c4m0Var2 != null) {
                c4m0Var2.cancel(null);
            }
            bby bbyVar = this.P;
            if (bbyVar != null) {
                v3c.N(bbyVar);
            }
            bby bbyVar2 = this.R;
            if (bbyVar2 != null) {
                bbyVar2.cancel(null);
                return;
            }
            return;
        }
        if (bx60Var instanceof pw60) {
            O();
            return;
        }
        if (bx60Var instanceof iw60) {
            this.F.c("games_favor");
            this.H.i("games_favor");
            G(ox60.f25997a);
            return;
        }
        boolean z2 = bx60Var instanceof uw60;
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        if (z2) {
            if (!((qx60) D()).d) {
                p7m0 p7m0Var = ocjVar.f25029a;
                do {
                    value4 = p7m0Var.getValue();
                    value4.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var.m(value4, qx60.a((qx60) value4, null, null, false, false, false, new SocketTimeoutException(), 127)));
                return;
            }
            p7m0 p7m0Var2 = ocjVar.f25029a;
            do {
                value3 = p7m0Var2.getValue();
                value3.getClass();
                qx60Var = (qx60) value3;
                oyg0Var.getClass();
                list = qx60Var.c.b;
                list.getClass();
            } while (!p7m0Var2.m(value3, qx60.a(qx60Var, null, new cfp(null, list), false, false, false, null, 123)));
            G(mx60.f22538a);
            N();
            return;
        }
        if (bx60Var instanceof yw60) {
            this.p.q(new bb50(false), true);
            O();
            return;
        }
        boolean z3 = bx60Var instanceof ow60;
        oeg0 oeg0Var = this.E;
        s64 s64Var = this.I;
        bn6 bn6Var = this.G;
        if (z3) {
            i8i.D("screen", "games_favor", bn6Var.b, "login_page_call");
            s64Var.c("games_favor");
            i1w0 i1w0VarC = oeg0Var.c();
            i1w0VarC.getClass();
            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
            ListIterator listIteratorP = rz4.p(wez.b, rz4.g(copyOnWriteArrayList, new c8d(y7d.f42146a, n0w0.f22721a)), i1w0VarC, copyOnWriteArrayList, 0);
            while (true) {
                paw pawVar = (paw) listIteratorP;
                if (!pawVar.hasNext()) {
                    return;
                } else {
                    i1w0VarC.a((oe50) pawVar.next());
                }
            }
        } else {
            boolean z4 = bx60Var instanceof tw60;
            cmt cmtVar = this.J;
            if (!z4) {
                if (bx60Var instanceof rw60) {
                    this.v.f(k7k.OneXFavor);
                    y1p y1pVar = y1p.MAIN;
                    this.w.b("games_favor", cmtVar.g());
                    sac.V(jiu0.a(this), new cy60(1, this, dy60.class, "handleThrowable", "handleThrowable(Ljava/lang/Throwable;)V", 0, (byte) 0), null, mneVar.b, new wx60(this, objArr == true ? 1 : 0, (byte) 2), 10);
                    return;
                }
                if (bx60Var instanceof zw60) {
                    Q();
                    return;
                }
                if (bx60Var instanceof xw60) {
                    ql5 ql5Var = ((xw60) bx60Var).f41595a;
                    wsf0 wsf0Var = this.q;
                    ot otVarB = wsf0Var.b();
                    bm5 bm5Var = bm5.d;
                    otVarB.a(bm5Var, ql5Var);
                    wsf0Var.q().f17359a.z(bm5Var, ql5Var.f28916a);
                    Q();
                    return;
                }
                boolean z5 = bx60Var instanceof lw60;
                nn60 nn60Var = this.D;
                if (z5) {
                    lw60 lw60Var = (lw60) bx60Var;
                    List list2 = ((qx60) D()).c.f4274a;
                    if (list2 != null) {
                        for (Object obj3 : list2) {
                            if (((pbv) obj3).f26728a == lw60Var.f20749a) {
                                obj2 = obj3;
                                break;
                            }
                        }
                        pbv pbvVar = (pbv) obj2;
                        if (pbvVar == null) {
                            return;
                        }
                        i3t0.B(this, nn60Var, new en60[]{new bn60(pbvVar, lw60Var.b, -1)});
                        return;
                    }
                    return;
                }
                if (bx60Var instanceof kw60) {
                    kw60 kw60Var = (kw60) bx60Var;
                    long j = kw60Var.f18986a;
                    boolean z6 = kw60Var.b;
                    if (((qx60) D()).d) {
                        i3t0.B(this, nn60Var, new en60[]{new zm60(-1, j, z6)});
                        return;
                    }
                    return;
                }
                if (bx60Var instanceof jw60) {
                    this.K.n(((jw60) bx60Var).f17237a);
                    return;
                }
                if (bx60Var instanceof sw60) {
                    this.L.n(((sw60) bx60Var).f32906a);
                    return;
                }
                if (bx60Var instanceof ax60) {
                    i3t0.B(this, nn60Var, new en60[]{((ax60) bx60Var).f1609a});
                    return;
                }
                if (!(bx60Var instanceof qw60)) {
                    if (bx60Var instanceof mw60) {
                        R(kotlin.collections.a.c(Long.valueOf(((mw60) bx60Var).f22489a)));
                        return;
                    }
                    if (!(bx60Var instanceof nw60)) {
                        if (bx60Var instanceof hw60) {
                            E();
                            return;
                        } else {
                            t9f.b();
                            return;
                        }
                    }
                    sq60 sq60Var = new sq60();
                    p7m0 p7m0Var3 = ocjVar.f25029a;
                    do {
                        value = p7m0Var3.getValue();
                        value.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var3.m(value, qx60.a((qx60) value, null, null, false, false, false, sq60Var, 127)));
                    return;
                }
                if (!((qw60) bx60Var).f29421a.equals(on60.f25532a)) {
                    t9f.b();
                    return;
                }
                if (((qx60) D()).h instanceof sq60) {
                    return;
                }
                c4m0 c4m0Var3 = this.M;
                if (c4m0Var3 != null) {
                    c4m0Var3.cancel(null);
                }
                c4m0 c4m0Var4 = this.N;
                if (c4m0Var4 != null) {
                    v3c.N(c4m0Var4);
                }
                SocketTimeoutException socketTimeoutException = new SocketTimeoutException();
                p7m0 p7m0Var4 = ocjVar.f25029a;
                do {
                    value2 = p7m0Var4.getValue();
                    value2.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var4.m(value2, qx60.a((qx60) value2, null, null, false, false, false, socketTimeoutException, 127)));
                return;
            }
            i8i.D("screen", "games_favor", bn6Var.b, "reg_page_call");
            s64Var.d(y1p.ONE_X_FAVOR, cmtVar.g());
            i1w0 i1w0VarC2 = oeg0Var.c();
            i1w0VarC2.getClass();
            CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
            ListIterator listIteratorP2 = rz4.p(wez.b, rz4.g(copyOnWriteArrayList2, new c8d(y7d.f42146a, o0w0.f24450a)), i1w0VarC2, copyOnWriteArrayList2, 0);
            while (true) {
                paw pawVar2 = (paw) listIteratorP2;
                if (!pawVar2.hasNext()) {
                    return;
                } else {
                    i1w0VarC2.a((oe50) pawVar2.next());
                }
            }
        }
    }
}
