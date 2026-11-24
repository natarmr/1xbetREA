package a;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class f1b0 extends i3t0 {
    public static final /* synthetic */ int w0 = 0;
    public final jc0 A;
    public final sd60 B;
    public final uzc0 C;
    public final ix0 D;
    public final je E;
    public final hsj F;
    public final es G;
    public final pyg0 H;
    public final lbu I;
    public final erc J;
    public final kc60 K;
    public final cmt L;
    public final n660 M;
    public final pyt N;
    public final qyg0 O;
    public final xr P;
    public final wsf0 Q;
    public final abu R;
    public final ouu S;
    public final r8i T;
    public final ali U;
    public final bek V;
    public final nmt W;
    public final eyg0 X;
    public final g4u Y;
    public final cu Z;
    public final kki a0;
    public final g4u b0;
    public final xmt c0;
    public final ytt d0;
    public final khf0 e0;
    public final es f0;
    public c4m0 g0;
    public bby h0;
    public bby i0;
    public bby j0;
    public c4m0 k0;
    public c4m0 l0;
    public c4m0 m0;
    public c4m0 n0;
    public final i1w0 o;
    public bby o0;
    public final duj p;
    public c4m0 p0;
    public final yo4 q;
    public bby q0;
    public final jlx r;
    public bby r0;
    public final bn6 s;
    public bby s0;
    public final ctf0 t;
    public bby t0;
    public final m1e u;
    public final c4m0 u0;
    public final gg5 v;
    public bby v0;
    public final b4j w;
    public final mne x;
    public final u58 y;
    public final peg0 z;

    /* JADX WARN: Illegal instructions before constructor call */
    public f1b0(i1w0 i1w0Var, duj dujVar, yo4 yo4Var, jlx jlxVar, bn6 bn6Var, ctf0 ctf0Var, m1e m1eVar, gg5 gg5Var, b4j b4jVar, mne mneVar, u58 u58Var, peg0 peg0Var, jc0 jc0Var, sd60 sd60Var, uzc0 uzc0Var, ix0 ix0Var, je jeVar, wyu wyuVar, hsj hsjVar, uyu uyuVar, es esVar, bzt bztVar, pru pruVar, pyg0 pyg0Var, lbu lbuVar, erc ercVar, kc60 kc60Var, cmt cmtVar, n660 n660Var, pyt pytVar, qyg0 qyg0Var, xrt xrtVar, xr xrVar, wsf0 wsf0Var, abu abuVar, ouu ouuVar, iqt iqtVar, r8i r8iVar, ali aliVar, bek bekVar, nmt nmtVar, eyg0 eyg0Var, g4u g4uVar, cu cuVar, kki kkiVar, g4u g4uVar2, xmt xmtVar, ytt yttVar, khf0 khf0Var, es esVar2) {
        i1w0Var.getClass();
        ctf0Var.getClass();
        m1eVar.getClass();
        wyuVar.getClass();
        g090 g090VarP = cvm0.p(mneVar.c, mneVar.f22085a);
        yje yjeVar = null;
        super(new ng0(pruVar, (Object) xrtVar, (Object) bztVar, iqtVar, (Object) wyuVar, (byte) 12), g090VarP, new iv80(ctf0Var, (byte) 3), (yzn0) null);
        this.o = i1w0Var;
        this.p = dujVar;
        this.q = yo4Var;
        this.r = jlxVar;
        this.s = bn6Var;
        this.t = ctf0Var;
        this.u = m1eVar;
        this.v = gg5Var;
        this.w = b4jVar;
        this.x = mneVar;
        this.y = u58Var;
        this.z = peg0Var;
        this.A = jc0Var;
        this.B = sd60Var;
        this.C = uzc0Var;
        this.D = ix0Var;
        this.E = jeVar;
        this.F = hsjVar;
        this.G = esVar;
        this.H = pyg0Var;
        this.I = lbuVar;
        this.J = ercVar;
        this.K = kc60Var;
        this.L = cmtVar;
        this.M = n660Var;
        this.N = pytVar;
        this.O = qyg0Var;
        this.P = xrVar;
        this.Q = wsf0Var;
        this.R = abuVar;
        this.S = ouuVar;
        this.T = r8iVar;
        this.U = aliVar;
        this.V = bekVar;
        this.W = nmtVar;
        this.X = eyg0Var;
        this.Y = g4uVar;
        this.Z = cuVar;
        this.a0 = kkiVar;
        this.b0 = g4uVar2;
        this.c0 = xmtVar;
        this.d0 = yttVar;
        this.e0 = khf0Var;
        this.f0 = esVar2;
        Y();
        byte b = 4;
        fnq fnqVar = new fnq(dtb.z(kc60Var.a(), 1), new z0b0(this, yjeVar, (byte) 1), b);
        bvc bvcVarA = jiu0.a(this);
        dvj dvjVar = mneVar.b;
        this.u0 = sac.T(fnqVar, d5c.S(bvcVarA, dvjVar), c1b0.h);
        sac.T(new fnq(uyuVar.f36509a.h(), new x0b0(this, yjeVar, (byte) 5), b), d5c.S(jiu0.a(this), dvjVar), e1b0.h);
        i3t0.F(this, jc0Var, null, null, new jfa0((byte) 13), 119);
        R(false);
    }

    public static void T(f1b0 f1b0Var, long j, int i, int i2) {
        String str;
        String str2 = (i2 & 8) != 0 ? null : "game_banner";
        if (((d0b0) f1b0Var.D()).f.f3516a) {
            y1p y1pVar = y1p.MAIN;
            str = "popular_new_virtual";
        } else {
            y1p y1pVar2 = y1p.MAIN;
            str = "popular_new_aggregator";
        }
        String str3 = ((d0b0) f1b0Var.D()).f.f3516a ? "popular_new_virtual" : "popular_new_aggregator";
        f1b0Var.D.a((int) j, i, null, str, str2);
        f1b0Var.y.q(str3, i, j, null, str2);
    }

    public final void M() {
        bby bbyVar = this.s0;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.s0 = sac.V(jiu0.a(this), q0b0.f27889a, null, this.x.b, new r0b0(this, null, (byte) 0), 10);
        }
    }

    public final String N(long j, long j2, fza0 fza0Var) {
        nza0 nza0VarO = O(j2, fza0Var);
        if (nza0VarO == null) {
            return "";
        }
        Iterator it = nza0VarO.c.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (((mlr) it.next()).f22006a == j) {
                break;
            }
            i++;
        }
        Integer numValueOf = Integer.valueOf(i);
        if (i < 0) {
            numValueOf = null;
        }
        Integer numE = numValueOf != null ? kng0.e(1, numValueOf) : null;
        lc00 lc00VarB = kotlin.collections.a.b();
        lc00VarB.add(new g3z(j2, "partition"));
        if (!((d0b0) D()).f.f3516a) {
            this.V.getClass();
            long jB = fza0Var.B();
            if (jB == 0) {
                jB = Long.MAX_VALUE;
            }
            lc00VarB.add(new g3z(jB, "category"));
        }
        return this.X.k(new lu0(0L, numE, "popular_new_aggregator", kotlin.collections.a.a(lc00VarB)));
    }

    public final nza0 O(long j, fza0 fza0Var) {
        List list = ((d0b0) D()).b.c;
        Object obj = null;
        if (list == null) {
            return null;
        }
        for (Object obj2 : list) {
            nza0 nza0Var = (nza0) obj2;
            if (nza0Var.f24363a.f37408a == j && nza0Var.b == fza0Var) {
                obj = obj2;
                break;
            }
        }
        return (nza0) obj;
    }

    public final jic0 P(long j) {
        uhc0 uhc0Var = ((d0b0) D()).d.c;
        if (uhc0Var == null) {
            return null;
        }
        jic0 jic0Var = uhc0Var.f35671a;
        if (jic0Var.d == j) {
            return jic0Var;
        }
        jic0 jic0Var2 = uhc0Var.b;
        if (jic0Var2.d == j) {
            return jic0Var2;
        }
        return null;
    }

    public final void Q(Throwable th) {
        this.p.b(th, new yr0(th, (byte) 19));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00a5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:37:0x00e4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ea  */
    public final void R(boolean z) {
        List list;
        List list2;
        bby bbyVar;
        bby bbyVar2;
        List list3;
        boolean z2 = ((d0b0) D()).f.g;
        byte b = 1;
        byte b2 = 4;
        byte b3 = 0;
        mne mneVar = this.x;
        yje yjeVar = null;
        if (z2) {
            xza0 xza0Var = ((d0b0) D()).f5260a;
            if (xza0Var.b || xza0Var.c == null || z) {
                c4m0 c4m0Var = this.g0;
                if (c4m0Var != null) {
                    c4m0Var.cancel(null);
                }
                this.g0 = sac.T(new fnq(u1c.I(((d0b0) D()).f.b ? new wk30(this.N.b(mvc.CMS_CODE_OFFERS_CASINO), (byte) 17) : new wk30(this.c0.a(nw80.u.getId()), (byte) 18), new w0b0(this, yjeVar, b3)), new x0b0(this, yjeVar, b3), b2), d5c.S(jiu0.a(this), mneVar.b), new x0b0(this, yjeVar, b));
            }
        }
        if (!((d0b0) D()).f.f3516a) {
            zza0 zza0Var = ((d0b0) D()).b;
            if (zza0Var.b || (list3 = zza0Var.c) == null || list3.isEmpty()) {
                bbyVar2 = this.h0;
                if (bbyVar2 != null) {
                    bbyVar2.cancel(null);
                }
                this.h0 = sac.V(jiu0.a(this), new o0b0(this, b2), null, mneVar.b, new y0b0(this, yjeVar, b), 10);
            } else if (z) {
                bbyVar2 = this.h0;
                if (bbyVar2 != null) {
                    bbyVar2.cancel(null);
                }
                this.h0 = sac.V(jiu0.a(this), new o0b0(this, b2), null, mneVar.b, new y0b0(this, yjeVar, b), 10);
            }
        } else if (z) {
            bbyVar2 = this.h0;
            if (bbyVar2 != null) {
                bbyVar2.cancel(null);
            }
            this.h0 = sac.V(jiu0.a(this), new o0b0(this, b2), null, mneVar.b, new y0b0(this, yjeVar, b), 10);
        }
        byte b4 = 2;
        if (!((d0b0) D()).f.f3516a) {
            yza0 yza0Var = ((d0b0) D()).c;
            if (yza0Var.b || yza0Var.c == null) {
                bbyVar = this.i0;
                if (bbyVar != null) {
                    bbyVar.cancel(null);
                }
                this.i0 = sac.V(jiu0.a(this), new o0b0(this, b4), null, mneVar.b, new y0b0(this, yjeVar, b3), 10);
            } else if (z) {
                bbyVar = this.i0;
                if (bbyVar != null) {
                    bbyVar.cancel(null);
                }
                this.i0 = sac.V(jiu0.a(this), new o0b0(this, b4), null, mneVar.b, new y0b0(this, yjeVar, b3), 10);
            }
        } else if (z) {
            bbyVar = this.i0;
            if (bbyVar != null) {
                bbyVar.cancel(null);
            }
            this.i0 = sac.V(jiu0.a(this), new o0b0(this, b4), null, mneVar.b, new y0b0(this, yjeVar, b3), 10);
        }
        if (((d0b0) D()).f.f3516a) {
            yza0 yza0Var2 = ((d0b0) D()).c;
            if (yza0Var2.b || yza0Var2.c == null || z) {
                bby bbyVar3 = this.i0;
                if (bbyVar3 != null) {
                    bbyVar3.cancel(null);
                }
                this.i0 = sac.V(jiu0.a(this), new o0b0(this, (byte) 5), null, mneVar.b, new wg0(this, yjeVar, (byte) 8), 10);
            } else {
                yza0 yza0Var3 = ((d0b0) D()).c;
                if (!yza0Var3.b && yza0Var3.c != null) {
                    zza0 zza0Var2 = ((d0b0) D()).b;
                    if ((zza0Var2.b || (list2 = zza0Var2.c) == null || list2.isEmpty()) && (list = ((d0b0) D()).c.c) != null) {
                        S(list);
                    }
                }
            }
        }
        if (((d0b0) D()).f.f3516a) {
            return;
        }
        b0b0 b0b0Var = ((d0b0) D()).d;
        if (b0b0Var.b || b0b0Var.c == null || z) {
            bby bbyVar4 = this.j0;
            if (bbyVar4 != null) {
                bbyVar4.cancel(null);
            }
            this.j0 = sac.V(jiu0.a(this), new o0b0(this, (byte) 6), null, mneVar.b, new y0b0(this, yjeVar, b4), 10);
        }
    }

    public final void S(List list) {
        bby bbyVar = this.h0;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
        this.h0 = sac.V(jiu0.a(this), new o0b0(this, (byte) 1), null, this.x.b, new jc1(this, list, (yje) null), 10);
    }

    public final void U() {
        if (((d0b0) D()).l) {
            return;
        }
        bby bbyVar = this.o0;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.o0 = sac.V(jiu0.a(this), new wma0(1, this, f1b0.class, "handleBasicThrowable", "handleBasicThrowable(Ljava/lang/Throwable;)V", 0, (byte) 7), null, this.x.b, new e3p(this, null, (byte) 29), 10);
        }
    }

    public final void V(int i, mlr mlrVar, String str, boolean z) {
        f1b0 f1b0Var = this;
        p7m0 p7m0Var = f1b0Var.i.f25029a;
        while (true) {
            Object value = p7m0Var.getValue();
            value.getClass();
            f1b0Var.f.getClass();
            if (p7m0Var.m(value, d0b0.a((d0b0) value, null, null, null, null, null, false, false, false, false, new a0b0(mlrVar, i, str), false, 3071))) {
                sac.V(jiu0.a(f1b0Var), new wma0(1, this, f1b0.class, "handleBasicThrowable", "handleBasicThrowable(Ljava/lang/Throwable;)V", 0, (byte) 14), null, f1b0Var.x.b, new kza0(this, mlrVar, i, str, z, (yje) null), 10);
                return;
            }
            f1b0Var = this;
        }
    }

    public final void W(long j) {
        bby bbyVar = this.q0;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
        this.q0 = sac.V(jiu0.a(this), new wma0(1, this, f1b0.class, "handleBasicThrowable", "handleBasicThrowable(Ljava/lang/Throwable;)V", 0, (byte) 16), null, this.x.b, new y0b0(j, this, (yje) null), 10);
    }

    public final void X() {
        c4m0 c4m0Var = this.p0;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            this.p0 = sac.T(dub.f0(this.K.a(), this.W.a(), ((o0j) this.b0.f10686a.c).f, new fl9(this, null, (byte) 10)), d5c.S(jiu0.a(this), this.x.b), new hi70(2, this, f1b0.class, "handleBasicThrowable", "handleBasicThrowable(Ljava/lang/Throwable;)V", 4, (byte) 25));
        }
    }

    public final void Y() {
        c4m0 c4m0Var = this.k0;
        yje yjeVar = null;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
        byte b = 4;
        this.k0 = sac.T(new fnq(this.U.o(), new x0b0(this, yjeVar, b), b), d5c.S(jiu0.a(this), this.x.b), d1b0.h);
    }

    @Override // a.diu0
    public final void v() {
        c4m0 c4m0Var = this.u0;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
        M();
        d5c.G((sje) this.B.h, null);
    }

    /* JADX WARN: Code duplicated, block: B:190:0x0540  */
    /* JADX WARN: Code duplicated, block: B:191:0x0547  */
    /* JADX WARN: Code duplicated, block: B:210:0x0584  */
    /* JADX WARN: Code duplicated, block: B:213:0x0590  */
    /* JADX WARN: Code duplicated, block: B:216:0x0596  */
    /* JADX WARN: Code duplicated, block: B:217:0x0599  */
    /* JADX WARN: Code duplicated, block: B:220:0x05bc  */
    /* JADX WARN: Code duplicated, block: B:222:0x05c5  */
    /* JADX WARN: Code duplicated, block: B:248:0x0665  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [a.yje] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        int i;
        String str;
        int iIntValue;
        nza0 nza0VarO;
        Integer numE;
        int i2;
        int iIntValue2;
        List list;
        int i3;
        Object next;
        dvj dvjVar;
        aza0 aza0Var = (aza0) obj;
        aza0Var.getClass();
        super.x(aza0Var);
        if (aza0Var.equals(jya0.f17350a)) {
            E();
            return;
        }
        boolean zEquals = aza0Var.equals(nya0.f24322a);
        byte b = 3;
        erc ercVar = this.J;
        byte b2 = 0;
        byte b3 = 1;
        mne mneVar = this.x;
        ?? r13 = 0;
        Object obj2 = null;
        Object obj3 = null;
        vh0Var = null;
        vh0 vh0Var = null;
        String str2 = null;
        if (zEquals) {
            kc60 kc60Var = this.K;
            byte b4 = 4;
            fnq fnqVar = new fnq(kc60Var.a(), new z0b0(this, r13, b2), b4);
            bvc bvcVarA = jiu0.a(this);
            dvj dvjVar2 = mneVar.b;
            this.l0 = sac.T(fnqVar, d5c.S(bvcVarA, dvjVar2), a1b0.h);
            this.m0 = sac.T(new fnq(this.u.b(), new r0b0(this, r13, b), b4), d5c.S(jiu0.a(this), dvjVar2), b1b0.h);
            c4m0 c4m0Var = this.n0;
            if (c4m0Var == null || !c4m0Var.isActive()) {
                cu cuVar = this.Z;
                dvjVar = dvjVar2;
                this.n0 = sac.T(new a1g(((rpt) cuVar.b).f(), cuVar, b4), d5c.S(jiu0.a(this), dvjVar2), new hi70(2, this, f1b0.class, "handleBasicThrowable", "handleBasicThrowable(Ljava/lang/Throwable;)V", 4, (byte) 24));
            } else {
                dvjVar = dvjVar2;
            }
            U();
            sac.T(new fnq(dtb.z(kc60Var.a(), 1), new x0b0(this, r13, (byte) 2), (byte) 4), d5c.S(jiu0.a(this), dvjVar), new hi70(2, this, f1b0.class, "handleBasicThrowable", "handleBasicThrowable(Ljava/lang/Throwable;)V", 4, (byte) 23));
            X();
            bby bbyVar = this.v0;
            if (bbyVar == null || !bbyVar.isActive()) {
                this.v0 = sac.V(jiu0.a(this), new o0b0(this, (byte) 0), null, mneVar.f22085a, new w0b0(this, r13, (byte) 2), 10);
            }
            ercVar.a(true);
            return;
        }
        if (aza0Var.equals(mya0.f22594a)) {
            ercVar.a(false);
            c4m0 c4m0Var2 = this.l0;
            if (c4m0Var2 != null) {
                c4m0Var2.cancel(null);
            }
            c4m0 c4m0Var3 = this.m0;
            if (c4m0Var3 != null) {
                c4m0Var3.cancel(null);
            }
            c4m0 c4m0Var4 = this.n0;
            if (c4m0Var4 != null) {
                c4m0Var4.cancel(null);
            }
            c4m0 c4m0Var5 = this.p0;
            if (c4m0Var5 != null) {
                c4m0Var5.cancel(null);
            }
            M();
            return;
        }
        if (aza0Var instanceof kya0) {
            long j = ((kya0) aza0Var).f19098a;
            List list2 = ((d0b0) D()).f5260a.c;
            if (list2 != null) {
                for (Object obj4 : list2) {
                    if (phu0.U((lr5) obj4).equals(String.valueOf(j))) {
                        obj2 = obj4;
                        break;
                    }
                }
                lr5 lr5Var = (lr5) obj2;
                if (lr5Var != null) {
                    sac.V(jiu0.a(this), new wma0(1, this, f1b0.class, "handleBasicThrowable", "handleBasicThrowable(Ljava/lang/Throwable;)V", 0, (byte) 13), null, mneVar.b, new ir((Object) this, j, (Object) lr5Var, (yje) null, (byte) 25), 10);
                    return;
                }
                return;
            }
            return;
        }
        if (aza0Var instanceof oya0) {
            sac.V(jiu0.a(this), new wma0(1, this, f1b0.class, "handleBasicThrowable", "handleBasicThrowable(Ljava/lang/Throwable;)V", 0, (byte) 12), null, mneVar.b, new defpackage.e(this, ((oya0) aza0Var).f26053a, r13, (byte) 5), 10);
            return;
        }
        boolean z = aza0Var instanceof lya0;
        i1w0 i1w0Var = this.o;
        if (!z) {
            if (aza0Var.equals(zya0.f45197a)) {
                R(false);
                return;
            }
            boolean z2 = aza0Var instanceof qya0;
            int i4 = -1;
            u58 u58Var = this.y;
            if (z2) {
                qya0 qya0Var = (qya0) aza0Var;
                int i5 = qya0Var.f29523a;
                String str3 = qya0Var.b;
                List list3 = ((d0b0) D()).f5260a.c;
                if (list3 != null) {
                    Iterator it = list3.iterator();
                    int i6 = 0;
                    while (it.hasNext()) {
                        if (((lr5) it.next()).f20512a == i5) {
                            i4 = i6;
                            break;
                        }
                        i6++;
                    }
                    Integer numValueOf = Integer.valueOf(i4);
                    if (i4 < 0) {
                        numValueOf = null;
                    }
                    if (numValueOf != null) {
                        int iIntValue3 = numValueOf.intValue();
                        lr5 lr5Var2 = (lr5) list3.get(iIntValue3);
                        String strY = c3x.y(lr5Var2.h, lr5Var2.j);
                        Integer numA = ks60.a(lr5Var2.k, str3);
                        String str4 = ((d0b0) D()).f.f3516a ? "popular_new_virtual" : "popular_new_aggregator";
                        y1p y1pVar = ((d0b0) D()).f.f3516a ? y1p.POPULAR_NEW_VIRTUAL : y1p.POPULAR_NEW_AGGREGATOR;
                        u58Var.h(Integer.valueOf(lr5Var2.f20512a), numValueOf, "aggregator_category");
                        this.v.e(lr5Var2.f20512a, strY, iIntValue3, y1pVar, numA != null ? Float.valueOf(numA.intValue()) : null);
                        this.q.o(lr5Var2.f20512a, iIntValue3, numA, strY, str4);
                        z(this.A, new rq5(lr5Var2, iIntValue3, true), mneVar.c, new wma0(1, this, f1b0.class, "handleBasicThrowable", "handleBasicThrowable(Ljava/lang/Throwable;)V", 0, (byte) 8));
                        return;
                    }
                    return;
                }
                return;
            }
            boolean zEquals2 = aza0Var.equals(vya0.f38239a);
            ix0 ix0Var = this.D;
            if (zEquals2) {
                if (!((d0b0) D()).f.f3516a) {
                    y1p y1pVar2 = y1p.MAIN;
                    ix0Var.getClass();
                    b1j.v("popular_new_aggregator", ix0Var.f15516a, 3052L);
                    i8i.D("screen", "popular_new_aggregator", u58Var.f35083a, "my_aggregator_call");
                }
                sac.V(jiu0.a(this), new wma0(1, this, f1b0.class, "handleBasicThrowable", "handleBasicThrowable(Ljava/lang/Throwable;)V", 0, (byte) 10), null, mneVar.b, new r0b0(this, r13, b3), 10);
                return;
            }
            boolean zEquals3 = aza0Var.equals(pya0.f27794a);
            gg5 gg5Var = this.v;
            if (zEquals3) {
                if (!((d0b0) D()).f.f3516a) {
                    u58Var.d("popular_new_aggregator");
                    gg5Var.g(y1p.POPULAR_NEW_AGGREGATOR);
                }
                i1w0Var.d(new o0b0(this, b));
                return;
            }
            boolean z3 = aza0Var instanceof rya0;
            eyg0 eyg0Var = this.X;
            if (z3) {
                long j2 = ((rya0) aza0Var).f31304a;
                List list4 = ((d0b0) D()).c.c;
                if (list4 != null) {
                    for (Object obj5 : list4) {
                        if (((vh0) obj5).f37408a == j2) {
                            obj3 = obj5;
                            break;
                        }
                    }
                    vh0 vh0Var2 = (vh0) obj3;
                    if (vh0Var2 != null) {
                        long j3 = vh0Var2.f37408a;
                        if (!((d0b0) D()).f.f3516a) {
                            int i7 = (int) j3;
                            int i8 = (int) vh0Var2.g;
                            u58Var.c(i7, i8, "popular_new_aggregator");
                            gg5Var.f(i7, i8, y1p.POPULAR_NEW_AGGREGATOR);
                        }
                        if (((d0b0) D()).f.f3516a || vh0Var2.f != 3) {
                            i1w0Var.d(new zga0((Object) this, (Object) vh0Var2, (byte) 9));
                            return;
                        } else {
                            iun iunVar = iun.f15405a;
                            V(0, mlr.a(new mlr(0L, 0L, 0L, 0L, "", "", "", (String) null, false, false, false, false, false, false, false, (List) iunVar, false, 131200), vh0Var2.g, vh0Var2.h, 0L, vh0Var2.b, vh0Var2.i, vh0Var2.j, false, 255964), eyg0Var.k(new lu0(3L, null, "popular_new_aggregator", iunVar)), true);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            if (aza0Var instanceof sya0) {
                sya0 sya0Var = (sya0) aza0Var;
                long j4 = sya0Var.f33017a;
                fza0 fza0Var = sya0Var.b;
                this.V.getClass();
                long jB = fza0Var.B();
                if (jB == 0) {
                    jB = Long.MAX_VALUE;
                }
                long j5 = jB;
                List list5 = ((d0b0) D()).b.c;
                if (list5 != null) {
                    Iterator it2 = list5.iterator();
                    do {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                    } while (((nza0) next).f24363a.f37408a != j4);
                    nza0 nza0Var = (nza0) next;
                    if (nza0Var != null) {
                        vh0Var = nza0Var.f24363a;
                    }
                }
                if (!((d0b0) D()).f.f3516a) {
                    this.s.i(String.valueOf(j5), "popular_new_aggregator");
                    if (j5 != fza0.c.B()) {
                        y1p y1pVar3 = y1p.MAIN;
                        gg5Var.d((int) j5);
                    } else if (j4 != nw80.t.getId()) {
                        gg5Var.c((int) j5, ((d0b0) D()).f.f3516a ? y1p.POPULAR_NEW_VIRTUAL : y1p.POPULAR_NEW_AGGREGATOR);
                    }
                }
                i1w0Var.d(new zm8((i3t0) this, (Object) vh0Var, j4, j5, (byte) 3));
                return;
            }
            if (aza0Var.equals(yya0.f43457a)) {
                uhc0 uhc0Var = ((d0b0) D()).d.c;
                if (uhc0Var != null) {
                    eoc0 eoc0Var = uhc0Var.c;
                    if (!((d0b0) D()).f.f3516a) {
                        u58Var.f("popular_new_aggregator");
                        gg5Var.p(y1p.POPULAR_NEW_AGGREGATOR);
                    }
                    i1w0Var.d(new zga0((Object) this, (Object) eoc0Var, (byte) 8));
                    return;
                }
                return;
            }
            if (!(aza0Var instanceof tya0)) {
                if (aza0Var instanceof uya0) {
                    uya0 uya0Var = (uya0) aza0Var;
                    long j6 = uya0Var.f36479a;
                    long j7 = uya0Var.b;
                    fza0 fza0Var2 = uya0Var.c;
                    Integer num = uya0Var.d;
                    nza0 nza0VarO2 = O(j7, fza0Var2);
                    if (nza0VarO2 == null) {
                        return;
                    }
                    for (Object obj6 : nza0VarO2.c) {
                        if (((mlr) obj6).f22006a == j6) {
                            r13 = obj6;
                            break;
                        }
                    }
                    mlr mlrVar = (mlr) r13;
                    if (mlrVar == null) {
                        return;
                    }
                    sac.V(jiu0.a(this), new wma0(1, this, f1b0.class, "handleFavoritesThrowable", "handleFavoritesThrowable(Ljava/lang/Throwable;)V", 0, (byte) 9), null, mneVar.b, new e3z(this, mlrVar, ((d0b0) D()).e.contains(Long.valueOf(j6)), num, j6, j7, fza0Var2, null), 10);
                    return;
                }
                if (!(aza0Var instanceof wya0)) {
                    if (!(aza0Var instanceof xya0)) {
                        t9f.b();
                        return;
                    }
                    long j8 = ((xya0) aza0Var).f41698a;
                    jic0 jic0VarP = P(j8);
                    if (jic0VarP == null) {
                        return;
                    }
                    sac.V(jiu0.a(this), new wma0(1, this, f1b0.class, "handleFavoritesThrowable", "handleFavoritesThrowable(Ljava/lang/Throwable;)V", 0, (byte) 11), null, mneVar.b, new lv1(this, jic0VarP, ((d0b0) D()).e.contains(Long.valueOf(j8)), j8, null), 10);
                    return;
                }
                long j9 = ((wya0) aza0Var).f39965a;
                jic0 jic0VarP2 = P(j9);
                if (jic0VarP2 == null) {
                    return;
                }
                uhc0 uhc0Var2 = ((d0b0) D()).d.c;
                if (uhc0Var2 == null) {
                    i = 0;
                } else if (j9 == uhc0Var2.f35671a.d) {
                    i = 8191;
                } else if (j9 == uhc0Var2.b.d) {
                    i = 8190;
                } else {
                    i = 0;
                }
                T(this, j9, i, 48);
                V(i, vdb.o0(jic0VarP2), eyg0Var.k(new lu0(0L, null, "popular_new_aggregator", hne.r(0L, "weekly_game"))), false);
                return;
            }
            tya0 tya0Var = (tya0) aza0Var;
            long j10 = tya0Var.f34744a;
            String str5 = "popular_new_virtual";
            long j11 = tya0Var.b;
            fza0 fza0Var3 = tya0Var.c;
            Integer num2 = tya0Var.d;
            Serializable serializableI = this.L.i(j10);
            e0g0 e0g0Var = j0g0.b;
            if (serializableI instanceof g0g0) {
                return;
            }
            mlr mlrVar2 = (mlr) serializableI;
            if (!((d0b0) D()).f.f3516a) {
                if (fza0Var3 == fza0.b) {
                    str5 = "brand_live";
                } else {
                    str = "popular_new_aggregator";
                }
                if (num2 != null) {
                    iIntValue = num2.intValue();
                } else {
                    iIntValue = 0;
                }
                nza0VarO = O(j11, fza0Var3);
                if (nza0VarO != null || (list = nza0VarO.c) == null) {
                    numE = null;
                } else {
                    Iterator it3 = list.iterator();
                    int i9 = 0;
                    while (true) {
                        if (!it3.hasNext()) {
                            i3 = -1;
                            break;
                        }
                        i3 = i9;
                        if (((mlr) it3.next()).f22006a == j10) {
                            break;
                        } else {
                            i9 = i3 + 1;
                        }
                    }
                    Integer numValueOf2 = Integer.valueOf(i3);
                    if (i3 < 0) {
                        numValueOf2 = null;
                    }
                    if (numValueOf2 != null) {
                        numE = kng0.e(1, numValueOf2);
                    } else {
                        numE = null;
                    }
                }
                i2 = p0b0.f26141a[fza0Var3.ordinal()];
                if (i2 != 1) {
                    str2 = "slots_popular";
                } else if (i2 == 2) {
                    str2 = "live_aggregator_popular";
                }
                String str6 = str2;
                String str7 = str;
                ix0Var.a((int) j10, iIntValue, numE, str7, str6);
                this.y.q(str7, iIntValue, j10, numE, str6);
                if (num2 != null) {
                    iIntValue2 = num2.intValue();
                } else {
                    iIntValue2 = 0;
                }
                V(iIntValue2, mlrVar2, N(j10, j11, fza0Var3), false);
                return;
            }
            y1p y1pVar4 = y1p.MAIN;
            str = str5;
            if (num2 != null) {
                iIntValue = num2.intValue();
            } else {
                iIntValue = 0;
            }
            nza0VarO = O(j11, fza0Var3);
            if (nza0VarO != null) {
                numE = null;
            } else {
                numE = null;
            }
            i2 = p0b0.f26141a[fza0Var3.ordinal()];
            if (i2 != 1) {
                str2 = "slots_popular";
            } else if (i2 == 2) {
                str2 = "live_aggregator_popular";
            }
            String str8 = str2;
            String str9 = str;
            ix0Var.a((int) j10, iIntValue, numE, str9, str8);
            this.y.q(str9, iIntValue, j10, numE, str8);
            if (num2 != null) {
                iIntValue2 = num2.intValue();
            } else {
                iIntValue2 = 0;
            }
            V(iIntValue2, mlrVar2, N(j10, j11, fza0Var3), false);
            return;
        }
        lya0 lya0Var = (lya0) aza0Var;
        kr5 kr5Var = lya0Var.f20854a;
        int i10 = lya0Var.b;
        if (kr5Var.n != oo5.ACTION_ONE_X_GAME) {
            this.r.a(this.C.a(kr5Var, i10, false));
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, new a1w0(new bh1((Object) this, (Object) kr5Var, i10, (byte) 6))), i1w0Var, copyOnWriteArrayListQ, 0);
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
