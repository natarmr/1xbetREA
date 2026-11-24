package a;

import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;

/* JADX INFO: loaded from: classes4.dex */
public final class n270 extends i3t0 {
    public static final /* synthetic */ int Z = 0;
    public final bzt A;
    public final kyg0 B;
    public final hs60 C;
    public final ih5 D;
    public final ih5 E;
    public final x20 F;
    public final l7k G;
    public final cmt H;
    public final gg5 I;
    public final uf3 J;
    public final i1w0 K;
    public final ouu L;
    public final duj M;
    public final m1e N;
    public final mne O;
    public final oeg0 P;
    public final v88 Q;
    public final p7m0 R;
    public final p7m0 S;
    public c4m0 T;
    public bby U;
    public c4m0 V;
    public bby W;
    public bby X;
    public bby Y;
    public final vzg0 o;
    public final oif0 p;
    public final ahu q;
    public final trm0 r;
    public final ot s;
    public final jyg0 t;
    public final lbu u;
    public final yoc v;
    public final yoc w;
    public final ls x;
    public final dmt y;
    public final jqt z;

    /* JADX WARN: Illegal instructions before constructor call */
    public n270(vzg0 vzg0Var, oif0 oif0Var, ahu ahuVar, trm0 trm0Var, ot otVar, jyg0 jyg0Var, lbu lbuVar, yoc yocVar, yoc yocVar2, ls lsVar, dmt dmtVar, jqt jqtVar, bzt bztVar, ntu ntuVar, kyg0 kyg0Var, hs60 hs60Var, ih5 ih5Var, ih5 ih5Var2, x20 x20Var, l7k l7kVar, cmt cmtVar, gg5 gg5Var, uf3 uf3Var, i1w0 i1w0Var, ouu ouuVar, duj dujVar, ctf0 ctf0Var, g2v g2vVar, m1e m1eVar, mne mneVar, oeg0 oeg0Var, v88 v88Var) {
        ctf0Var.getClass();
        m1eVar.getClass();
        oeg0Var.getClass();
        vs10 vs10Var = mneVar.c;
        dvj dvjVar = mneVar.b;
        g090 g090VarP = cvm0.p(vs10Var, dvjVar);
        super(new fq60((byte) 20), g090VarP, new jl40((Object) ctf0Var, (Object) ntuVar, (Object) g2vVar, (byte) 14), (yzn0) null);
        this.o = vzg0Var;
        this.p = oif0Var;
        this.q = ahuVar;
        this.r = trm0Var;
        this.s = otVar;
        this.t = jyg0Var;
        this.u = lbuVar;
        this.v = yocVar;
        this.w = yocVar2;
        this.x = lsVar;
        this.y = dmtVar;
        this.z = jqtVar;
        this.A = bztVar;
        this.B = kyg0Var;
        this.C = hs60Var;
        this.D = ih5Var;
        this.E = ih5Var2;
        this.F = x20Var;
        this.G = l7kVar;
        this.H = cmtVar;
        this.I = gg5Var;
        this.J = uf3Var;
        this.K = i1w0Var;
        this.L = ouuVar;
        this.M = dujVar;
        this.N = m1eVar;
        this.O = mneVar;
        this.P = oeg0Var;
        this.Q = v88Var;
        kat katVar = kat.f17982a;
        this.R = q7m0.a(katVar);
        this.S = q7m0.a(katVar);
        sac.V(jiu0.a(this), null, null, dvjVar, new j270(this, null, (byte) 0), 11);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object M(zje zjeVar) {
        g270 g270Var;
        if (zjeVar instanceof g270) {
            g270Var = (g270) zjeVar;
            int i = g270Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                g270Var.k = i - Integer.MIN_VALUE;
            } else {
                g270Var = new g270(this, zjeVar);
            }
        } else {
            g270Var = new g270(this, zjeVar);
        }
        Object objB = g270Var.i;
        wne wneVar = wne.f39444a;
        int i2 = g270Var.k;
        if (i2 == 0) {
            z1x.P(objB);
            bm5 bm5Var = bm5.d;
            g270Var.k = 1;
            objB = this.q.b(bm5Var, g270Var);
            if (objB == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objB);
        }
        this.r.l(bm5.d, (ql5) objB);
        return objB;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b0, code lost:
    
        if (r1 == r3) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object N(a.zje r19) {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.n270.N(a.zje):java.lang.Object");
    }

    public final void O() {
        bby bbyVar = this.U;
        if ((bbyVar == null || !bbyVar.isActive()) && ((c270) D()).c != d270.LUCKY_WHEEL) {
            this.U = sac.V(jiu0.a(this), new cy60(1, this, n270.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 8), null, this.O.b, new i270(this, null, (byte) 3), 10);
        }
    }

    public final void P(d270 d270Var) {
        int iOrdinal = d270Var.ordinal();
        byte b = 4;
        byte b2 = 1;
        if (iOrdinal == 0) {
            bby bbyVar = this.Y;
            if (bbyVar == null || !bbyVar.isActive()) {
                this.Y = sac.V(jiu0.a(this), new cy60(1, this, n270.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 9), null, this.O.b, new i270(this, null, b), 10);
                return;
            }
            return;
        }
        byte b3 = 0;
        i1w0 i1w0Var = this.K;
        if (iOrdinal == 1) {
            i1w0Var.d(new f270(this, b3));
            return;
        }
        byte b4 = 3;
        if (iOrdinal == 3) {
            i1w0Var.d(new f270(this, (byte) 2));
            return;
        }
        if (iOrdinal != 4 && iOrdinal != 5) {
            if (iOrdinal == 6) {
                i1w0Var.d(new f270(this, b2));
                return;
            } else {
                if (iOrdinal != 7) {
                    return;
                }
                i1w0Var.d(new f270(this, b4));
                return;
            }
        }
        k0w0 k0w0VarI = cs0.i(i1w0Var, i1w0Var);
        i1w0Var.d(new rw40(this, d270Var, (byte) 27));
        ListIterator listIteratorO = b1j.o(i1w0Var, k0w0VarI.f17489a, 0);
        while (true) {
            paw pawVar = (paw) listIteratorO;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0Var.a((oe50) pawVar.next());
            }
        }
    }

    public final void Q(List list) {
        bby bbyVar = this.W;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.W = sac.f0(jiu0.a(this), this.w.a(), TimeUnit.MILLISECONDS, this.O.f22085a, new f270(this, (byte) 4), new er60(this, list, null, (byte) 2), 32);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Pair pair;
        Object value;
        j170 j170Var = (j170) obj;
        j170Var.getClass();
        if (j170Var instanceof x070) {
            H(new ds60(this.o, (byte) 5));
            return;
        }
        boolean z = j170Var instanceof y070;
        mne mneVar = this.O;
        byte b = 1;
        Object obj2 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (z) {
            this.T = slb.U(new fnq(this.N.b(), new i270(this, objArr2 == true ? 1 : 0, b), (byte) 4), d5c.S(jiu0.a(this), mneVar.c));
            return;
        }
        if (j170Var instanceof w070) {
            e3c.n(this.T);
            e3c.n(this.U);
            e3c.n(this.V);
            e3c.n(this.W);
            e3c.n(this.X);
            return;
        }
        if (j170Var instanceof r070) {
            E();
            return;
        }
        if (j170Var instanceof s070) {
            this.R.n(((s070) j170Var).f31400a);
            return;
        }
        if (j170Var instanceof v070) {
            this.S.n(((v070) j170Var).f36568a);
            return;
        }
        if (j170Var instanceof t070) {
            Q(kotlin.collections.a.c(Long.valueOf(((t070) j170Var).f33106a)));
            return;
        }
        if (j170Var instanceof u070) {
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
            } while (!p7m0Var.m(value, c270.a((c270) value, null, null, null, false, false, m170.c, null, null, 223)));
            return;
        }
        byte b2 = 0;
        if (j170Var instanceof c170) {
            int i = ((c170) j170Var).f3561a;
            for (Object obj3 : ((c270) D()).h) {
                if (((q170) obj3).f27939a.f5344a == i) {
                    obj2 = obj3;
                    break;
                }
            }
            q170 q170Var = (q170) obj2;
            if (q170Var != null) {
                d270 d270Var = q170Var.f27939a;
                int iOrdinal = d270Var.ordinal();
                if (iOrdinal == 0) {
                    pair = new Pair(fw60.e, qoc0.LUCKY_WHEEL);
                } else if (iOrdinal == 1) {
                    pair = new Pair(fw60.f, qoc0.BONUS);
                } else if (iOrdinal == 3) {
                    pair = new Pair(fw60.h, qoc0.WEEKLY_REWARD);
                } else if (iOrdinal == 4) {
                    pair = new Pair(fw60.i, qoc0.DAILY_TOURNAMENT);
                } else {
                    if (iOrdinal != 6) {
                        if (iOrdinal == 7) {
                            pair = new Pair(fw60.g, qoc0.BONUS_INFO);
                        }
                        P(d270Var);
                        return;
                    }
                    pair = new Pair(fw60.j, qoc0.JACKPOT);
                }
                fw60 fw60Var = (fw60) pair.f46059a;
                qoc0 qoc0Var = (qoc0) pair.b;
                this.C.f(fw60Var);
                x20 x20Var = this.F;
                x20Var.getClass();
                qoc0Var.getClass();
                x20Var.f40143a.a(cui0.b(new j1p(qoc0Var.f29068a, (byte) 0)), 3013L);
                P(d270Var);
                return;
            }
            return;
        }
        if (j170Var instanceof d170) {
            G(b270.b);
            return;
        }
        boolean z2 = j170Var instanceof h170;
        p0w0 p0w0Var = p0w0.f26173a;
        i1w0 i1w0Var = this.K;
        if (z2) {
            this.L.q(new bb50(false), true);
            i1w0Var.getClass();
            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
            ListIterator listIteratorP = b1j.p(copyOnWriteArrayList, new c8d(y7d.f42146a, p0w0Var), i1w0Var, copyOnWriteArrayList, 0);
            while (true) {
                paw pawVar = (paw) listIteratorP;
                if (!pawVar.hasNext()) {
                    return;
                } else {
                    i1w0Var.a((oe50) pawVar.next());
                }
            }
        } else {
            boolean z3 = j170Var instanceof a170;
            oeg0 oeg0Var = this.P;
            if (z3) {
                i1w0 i1w0VarC = oeg0Var.c();
                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0VarC);
                ListIterator listIteratorP2 = rz4.p(wez.b, rz4.g(copyOnWriteArrayListQ, new c8d(y7d.f42146a, n0w0.f22721a)), i1w0VarC, copyOnWriteArrayListQ, 0);
                while (true) {
                    paw pawVar2 = (paw) listIteratorP2;
                    if (!pawVar2.hasNext()) {
                        return;
                    } else {
                        i1w0VarC.a((oe50) pawVar2.next());
                    }
                }
            } else if (j170Var instanceof g170) {
                i1w0 i1w0VarC2 = oeg0Var.c();
                CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0VarC2);
                ListIterator listIteratorP3 = rz4.p(wez.b, rz4.g(copyOnWriteArrayListQ2, new c8d(y7d.f42146a, o0w0.f24450a)), i1w0VarC2, copyOnWriteArrayListQ2, 0);
                while (true) {
                    paw pawVar3 = (paw) listIteratorP3;
                    if (!pawVar3.hasNext()) {
                        return;
                    } else {
                        i1w0VarC2.a((oe50) pawVar3.next());
                    }
                }
            } else {
                if (!(j170Var instanceof b170)) {
                    if (j170Var instanceof z070) {
                        this.E.c("games_bonuses");
                        this.I.i("games_bonuses");
                        G(b270.c);
                        return;
                    }
                    if (j170Var instanceof f170) {
                        bby bbyVar = this.X;
                        if ((bbyVar == null || !bbyVar.isActive()) && ((c270) D()).g.f17507a) {
                            this.D.f(k7k.OneXPromo);
                            y1p y1pVar = y1p.MAIN;
                            this.G.b("games_bonuses", this.H.g());
                            this.X = sac.V(jiu0.a(this), new cy60(1, this, n270.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 7), null, mneVar.b, new i270(this, objArr == true ? 1 : 0, b2), 10);
                            return;
                        }
                        return;
                    }
                    if (!(j170Var instanceof e170)) {
                        if (!(j170Var instanceof i170)) {
                            t9f.b();
                            return;
                        } else {
                            e3c.n(this.U);
                            O();
                            return;
                        }
                    }
                    ql5 ql5Var = ((e170) j170Var).f7025a;
                    long j = ql5Var.f28916a;
                    this.B.a(j);
                    bm5 bm5Var = bm5.d;
                    this.s.a(bm5Var, ql5Var);
                    jyg0 jyg0Var = this.t;
                    jyg0Var.getClass();
                    jyg0Var.f17359a.z(bm5Var, j);
                    e3c.n(this.U);
                    O();
                    return;
                }
                CopyOnWriteArrayList copyOnWriteArrayListQ3 = b1j.q(i1w0Var);
                ListIterator listIteratorP4 = b1j.p(copyOnWriteArrayListQ3, new c8d(y7d.f42146a, p0w0Var), i1w0Var, copyOnWriteArrayListQ3, 0);
                while (true) {
                    paw pawVar4 = (paw) listIteratorP4;
                    if (!pawVar4.hasNext()) {
                        return;
                    } else {
                        i1w0Var.a((oe50) pawVar4.next());
                    }
                }
            }
        }
    }
}
