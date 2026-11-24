package a;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class qo0 extends i3t0 {
    public static final /* synthetic */ int V = 0;
    public final erc A;
    public final eyg0 B;
    public final pru C;
    public final s31 D;
    public final cyu E;
    public final s91 F;
    public final xr G;
    public final kd30 H;
    public final phf0 I;
    public final cmt J;
    public final c4m0 K;
    public c4m0 L;
    public c4m0 M;
    public bby N;
    public bby O;
    public bby P;
    public bby Q;
    public bby R;
    public bby S;
    public c4m0 T;
    public fk80 U;
    public final String o;
    public final soc p;
    public final wdu q;
    public final a6u r;
    public final pw70 s;
    public final a6u t;
    public final duj u;
    public final mne v;
    public final u58 w;
    public final ctf0 x;
    public final kb0 y;
    public final ix0 z;

    /* JADX WARN: Illegal instructions before constructor call */
    public qo0(String str, mdp mdpVar, kc60 kc60Var, soc socVar, wdu wduVar, a6u a6uVar, pw70 pw70Var, a6u a6uVar2, m1e m1eVar, duj dujVar, mne mneVar, u58 u58Var, ctf0 ctf0Var, iqt iqtVar, kb0 kb0Var, ix0 ix0Var, erc ercVar, eyg0 eyg0Var, pru pruVar, s31 s31Var, cyu cyuVar, s91 s91Var, xr xrVar, bzt bztVar, dmt dmtVar, kd30 kd30Var, phf0 phf0Var, cmt cmtVar) {
        pw70Var.getClass();
        m1eVar.getClass();
        ctf0Var.getClass();
        s91Var.getClass();
        g090 g090VarP = cvm0.p(mneVar.c, mneVar.f22085a);
        yje yjeVar = null;
        super(new co0((Object) pruVar, (Object) bztVar, (Object) mdpVar, (Object) iqtVar, (Object) dmtVar, (Object) str, (byte) 0), g090VarP, new uc(ctf0Var, (byte) 3), (yzn0) null);
        this.o = str;
        this.p = socVar;
        this.q = wduVar;
        this.r = a6uVar;
        this.s = pw70Var;
        this.t = a6uVar2;
        this.u = dujVar;
        this.v = mneVar;
        this.w = u58Var;
        this.x = ctf0Var;
        this.y = kb0Var;
        this.z = ix0Var;
        this.A = ercVar;
        this.B = eyg0Var;
        this.C = pruVar;
        this.D = s31Var;
        this.E = cyuVar;
        this.F = s91Var;
        this.G = xrVar;
        this.H = kd30Var;
        this.I = phf0Var;
        this.J = cmtVar;
        dvj dvjVar = mneVar.b;
        i3t0.A(this, kb0Var, bb0.f2283a, dvjVar, null, 4);
        byte b = 0;
        i3t0.F(this, kb0Var, null, new do0(this, b), new g20((byte) 18), 117);
        c4m0 c4m0Var = this.K;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
        this.K = sac.T(new p6d(m1eVar.b(), kc60Var.a(), new ko0(this, yjeVar, b), (byte) 1), d5c.S(jiu0.a(this), dvjVar), new jo0(this, yjeVar, (byte) 2));
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009c  */
    /* JADX WARN: Code duplicated, block: B:42:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:53:0x00f4 A[LOOP:0: B:51:0x00ee->B:53:0x00f4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:56:0x010e  */
    /* JADX WARN: Code duplicated, block: B:60:0x011e A[LOOP:1: B:58:0x0118->B:60:0x011e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:63:0x0136  */
    /* JADX WARN: Code duplicated, block: B:68:0x016d  */
    /* JADX WARN: Code duplicated, block: B:70:0x0170  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:82:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ae, code lost:
    
        if (a.qcc.O(r12 - r14, r4) == r5) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00df, code lost:
    
        if (r3 == r5) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object M(boolean r21, boolean r22, a.yk0 r23, a.zje r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.qo0.M(boolean, boolean, a.yk0, a.zje):java.lang.Object");
    }

    public final j8b N(mlr mlrVar, long j) {
        s0s s0sVar = s0s.ONE_X_LIVE_AGGREGATOR;
        Object obj = null;
        if (j == -1) {
            for (Object obj2 : ((ln0) D()).l) {
                long j2 = ((j8b) obj2).f16074a;
                s0s s0sVar2 = s0s.ONE_X_LIVE_AGGREGATOR;
                if (j2 == -1) {
                    obj = obj2;
                    break;
                }
            }
            return (j8b) obj;
        }
        loop1: for (Object obj3 : ((ln0) D()).l) {
            List list = ((j8b) obj3).c;
            if (list == null || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((mlr) it.next()).f22006a == mlrVar.f22006a) {
                        obj = obj3;
                        break loop1;
                    }
                }
            }
        }
        return (j8b) obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object O(boolean z, boolean z2, zje zjeVar) {
        go0 go0Var;
        Object objZ;
        Object value;
        if (zjeVar instanceof go0) {
            go0Var = (go0) zjeVar;
            int i = go0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                go0Var.k = i - Integer.MIN_VALUE;
            } else {
                go0Var = new go0(this, zjeVar);
            }
        } else {
            go0Var = new go0(this, zjeVar);
        }
        Object obj = go0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = go0Var.k;
        if (i2 == 0) {
            z1x.P(obj);
            if (((ln0) D()).p) {
                return ((ln0) D()).l;
            }
            boolean z3 = ((ln0) D()).f;
            go0Var.k = 1;
            objZ = this.q.z(z3, false, z, 8, false, z2, go0Var);
            if (objZ == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
            objZ = ((j0g0) obj).f15681a;
        }
        iun iunVar = iun.f15405a;
        e0g0 e0g0Var = j0g0.b;
        if (objZ instanceof g0g0) {
            objZ = iunVar;
        }
        List list = (List) objZ;
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
        } while (!p7m0Var.m(value, ln0.a((ln0) value, null, false, null, null, null, list, null, null, 0L, true, 30719)));
        return list;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0097 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x0099  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ba A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x00c7  */
    public final String P(mlr mlrVar, long j, yk0 yk0Var) {
        String str;
        List listR;
        lu0 lu0Var;
        String str2;
        String str3;
        String str4;
        long j2;
        long j3;
        long j4;
        List list;
        long j5 = mlrVar.f22006a;
        un0 un0VarS = S(yk0Var);
        List list2 = un0VarS instanceof rn0 ? ((rn0) un0VarS).f30764a : iun.f15405a;
        String str5 = "favor_aggregator";
        int i = -1;
        int i2 = 0;
        long j6 = 0;
        if (list2.isEmpty()) {
            j8b j8bVarN = N(mlrVar, j);
            if (j8bVarN == null || (list = j8bVarN.c) == null) {
                str2 = "favor_aggregator";
                str3 = null;
            } else {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        str2 = str5;
                        str3 = null;
                        break;
                    }
                    str2 = str5;
                    str3 = null;
                    if (((mlr) it.next()).f22006a == j5) {
                        i = i2;
                        break;
                    }
                    i2++;
                    str5 = str2;
                }
                i2 = i + 1;
            }
            Integer numValueOf = Integer.valueOf(i2);
            int iOrdinal = yk0Var.ordinal();
            if (iOrdinal == 0) {
                str4 = str2;
            } else {
                if (iOrdinal != 1) {
                    t9f.b();
                    return str3;
                }
                str4 = "favor_aggregator_viewed";
            }
            g3z g3zVar = new g3z(0L, ((ln0) D()).b ? "placeholder_auth" : "placeholder_unauth");
            if (j8bVarN != null) {
                long j7 = j8bVarN.f16074a;
                s0s s0sVar = s0s.ONE_X_LIVE_AGGREGATOR;
                if (j7 == -1) {
                    j2 = 824;
                } else {
                    if (j8bVarN != null) {
                        j3 = j8bVarN.f;
                        s0s s0sVar2 = s0s.ONE_X_LIVE_AGGREGATOR;
                        if (j3 == -1) {
                            j2 = 824;
                        }
                    }
                    if (j8bVarN != null) {
                        j2 = j8bVarN.f;
                    } else {
                        j2 = 0;
                    }
                }
            } else {
                if (j8bVarN != null) {
                    j3 = j8bVarN.f;
                    s0s s0sVar3 = s0s.ONE_X_LIVE_AGGREGATOR;
                    if (j3 == -1) {
                        j2 = 824;
                    }
                }
                if (j8bVarN != null) {
                    j2 = j8bVarN.f;
                } else {
                    j2 = 0;
                }
            }
            g3z g3zVar2 = new g3z(j2, "category");
            if (j8bVarN != null) {
                long j8 = j8bVarN.f16074a;
                s0s s0sVar4 = s0s.ONE_X_LIVE_AGGREGATOR;
                if (j8 != -1) {
                    if (j8bVarN != null) {
                        j4 = j8bVarN.f;
                        s0s s0sVar5 = s0s.ONE_X_LIVE_AGGREGATOR;
                        if (j4 != -1) {
                            if (j8bVarN != null) {
                                j6 = j8bVarN.d;
                            }
                        }
                    } else if (j8bVarN != null) {
                        j6 = j8bVarN.d;
                    }
                }
            } else if (j8bVarN != null) {
                j4 = j8bVarN.f;
                s0s s0sVar6 = s0s.ONE_X_LIVE_AGGREGATOR;
                if (j4 != -1) {
                    if (j8bVarN != null) {
                        j6 = j8bVarN.d;
                    }
                }
            } else if (j8bVarN != null) {
                j6 = j8bVarN.d;
            }
            lu0Var = new lu0(0L, numValueOf, str4, q3d.j(g3zVar, g3zVar2, new g3z(j6, "partition")));
        } else {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                if (((mlr) it2.next()).f22006a == j5) {
                    i = i2;
                    break;
                }
                i2++;
            }
            Integer numValueOf2 = Integer.valueOf(i + 1);
            int iOrdinal2 = yk0Var.ordinal();
            if (iOrdinal2 == 0) {
                str = "favor_aggregator";
            } else {
                if (iOrdinal2 != 1) {
                    t9f.b();
                    return null;
                }
                str = "favor_aggregator_viewed";
            }
            int iOrdinal3 = yk0Var.ordinal();
            if (iOrdinal3 == 0) {
                listR = hne.r(825L, "category");
            } else {
                if (iOrdinal3 != 1) {
                    t9f.b();
                    return null;
                }
                listR = hne.r(0L, "recent");
            }
            lu0Var = new lu0(0L, numValueOf2, str, listR);
        }
        return this.B.k(lu0Var);
    }

    public final List Q() {
        return q3d.j(this.N, this.O, this.P, this.Q, this.R, this.S);
    }

    public final String R(long j, String str) {
        s0s s0sVar = s0s.ONE_X_LIVE_AGGREGATOR;
        ctf0 ctf0Var = this.x;
        if (j == 37) {
            return ctf0Var.b.a(R.string.live_casino_title, Arrays.copyOf(new Object[0], 0));
        }
        return j == 1 ? ctf0Var.b.a(R.string.array_slots, Arrays.copyOf(new Object[0], 0)) : str;
    }

    public final un0 S(yk0 yk0Var) {
        int iOrdinal = yk0Var.ordinal();
        if (iOrdinal == 0) {
            return ((ln0) D()).m;
        }
        if (iOrdinal == 1) {
            return ((ln0) D()).n;
        }
        t9f.b();
        return null;
    }

    public final void T(boolean z, boolean z2) {
        c4m0 c4m0Var = this.L;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
        V();
        this.p.b();
        sac.V(jiu0.a(this), new do0(this, (byte) 1), null, this.v.b, new no0(z2, this, z, null), 10);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0063, code lost:
    
        if (r1.W(r2, false, r4, r5, r6) == r0) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object U(boolean r9, a.zje r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof a.oo0
            if (r0 == 0) goto L14
            r0 = r10
            a.oo0 r0 = (a.oo0) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.l = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            a.oo0 r0 = new a.oo0
            r0.<init>(r8, r10)
            goto L12
        L1a:
            java.lang.Object r10 = r6.j
            a.wne r0 = a.wne.f39444a
            int r1 = r6.l
            r7 = 2
            r2 = 1
            if (r1 == 0) goto L3b
            if (r1 == r2) goto L33
            if (r1 != r7) goto L2c
            a.z1x.P(r10)
            goto L66
        L2c:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r8)
            r8 = 0
            return r8
        L33:
            boolean r9 = r6.i
            a.z1x.P(r10)
            r1 = r8
            r5 = r9
            goto L56
        L3b:
            a.z1x.P(r10)
            a.yk0 r4 = a.yk0.FAVORITES
            a.sn0 r10 = a.sn0.f32471a
            r8.X(r4, r10)
            r10 = r2
            a.iun r2 = a.iun.f15405a
            r6.i = r9
            r6.l = r10
            r3 = 0
            r1 = r8
            r5 = r9
            java.lang.Object r8 = r1.W(r2, r3, r4, r5, r6)
            if (r8 != r0) goto L56
            goto L65
        L56:
            a.iun r2 = a.iun.f15405a
            a.yk0 r4 = a.yk0.VIEWED
            r6.i = r5
            r6.l = r7
            r3 = 0
            java.lang.Object r8 = r1.W(r2, r3, r4, r5, r6)
            if (r8 != r0) goto L66
        L65:
            return r0
        L66:
            kotlin.Unit r8 = kotlin.Unit.f46060a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a.qo0.U(boolean, a.zje):java.lang.Object");
    }

    public final void V() {
        c4m0 c4m0Var = this.M;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
        c4m0 c4m0Var2 = this.T;
        if (c4m0Var2 != null) {
            c4m0Var2.cancel(null);
        }
        fk80 fk80Var = this.U;
        if (fk80Var != null) {
            fk80Var.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object W(List list, boolean z, yk0 yk0Var, boolean z2, zje zjeVar) throws Throwable {
        po0 po0Var;
        un0 rn0Var;
        if (zjeVar instanceof po0) {
            po0Var = (po0) zjeVar;
            int i = po0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                po0Var.l = i - Integer.MIN_VALUE;
            } else {
                po0Var = new po0(this, zjeVar);
            }
        } else {
            po0Var = new po0(this, zjeVar);
        }
        Object objM = po0Var.j;
        Object obj = wne.f39444a;
        int i2 = po0Var.l;
        if (i2 == 0) {
            z1x.P(objM);
            if (list.isEmpty()) {
                po0Var.i = yk0Var;
                po0Var.l = 1;
                objM = M(z, z2, yk0Var, po0Var);
                if (objM == obj) {
                    return obj;
                }
            } else {
                H(new bo0(list, (byte) 0));
                rn0Var = new rn0(list);
            }
            X(yk0Var, rn0Var);
            return Unit.f46060a;
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        yk0Var = po0Var.i;
        z1x.P(objM);
        rn0Var = (un0) objM;
        X(yk0Var, rn0Var);
        return Unit.f46060a;
    }

    public final void X(yk0 yk0Var, un0 un0Var) {
        H(new mz7(yk0Var, un0Var, (byte) 22));
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        yk0 yk0Var;
        Object value;
        c4m0 c4m0Var;
        c4m0 c4m0Var2;
        ql0 ql0Var = (ql0) obj;
        ql0Var.getClass();
        super.x(ql0Var);
        byte b = 1;
        yje yjeVar = null;
        byte b2 = 0;
        if (ql0Var instanceof cl0) {
            cl0 cl0Var = (cl0) ql0Var;
            if (cl0Var.equals(zk0.f44505a)) {
                E();
                return;
            }
            boolean zEquals = cl0Var.equals(al0.f1046a);
            erc ercVar = this.A;
            if (zEquals) {
                ercVar.a(true);
                c4m0 c4m0Var3 = this.L;
                boolean z = c4m0Var3 != null && c4m0Var3.isActive();
                boolean z2 = !this.C.a().L1 ? (c4m0Var = this.M) == null || !c4m0Var.isActive() : (c4m0Var2 = this.T) == null || !c4m0Var2.isActive();
                if (z && z2) {
                    return;
                }
                T(true, false);
                return;
            }
            if (!cl0Var.equals(bl0.f2773a)) {
                t9f.b();
                return;
            }
            ercVar.a(false);
            c4m0 c4m0Var4 = this.L;
            if (c4m0Var4 != null) {
                c4m0Var4.cancel(null);
            }
            V();
            return;
        }
        if (!(ql0Var instanceof pl0)) {
            t9f.b();
            return;
        }
        pl0 pl0Var = (pl0) ql0Var;
        dl0 dl0Var = dl0.f6256a;
        boolean zEquals2 = pl0Var.equals(dl0Var);
        eb0 eb0Var = eb0.f7494a;
        ol0 ol0Var = ol0.f25431a;
        kl0 kl0Var = kl0.f18463a;
        mne mneVar = this.v;
        if (zEquals2 || pl0Var.equals(kl0Var) || pl0Var.equals(ol0Var)) {
            if (pl0Var.equals(dl0Var)) {
                this.N = bww.R(jiu0.a(this), this.N, Q(), mneVar.b, null, null, new ho0(this, yjeVar, b2), 56);
                return;
            } else if (pl0Var.equals(kl0Var)) {
                i3t0.A(this, this.y, eb0Var, mneVar.b, null, 4);
                return;
            } else {
                if (pl0Var.equals(ol0Var)) {
                    this.O = bww.R(jiu0.a(this), this.O, Q(), mneVar.b, null, null, new ho0(this, yjeVar, b), 56);
                    return;
                }
                return;
            }
        }
        boolean z3 = pl0Var instanceof hl0;
        byte b3 = 2;
        il0 il0Var = il0.f14953a;
        if (z3 || pl0Var.equals(il0Var)) {
            if (z3) {
                hl0 hl0Var = (hl0) pl0Var;
                this.P = bww.R(jiu0.a(this), this.P, Q(), mneVar.f22085a, null, null, new tr(this, hl0Var.f13232a, hl0Var.b, null, (byte) 2), 56);
                return;
            } else {
                if (pl0Var.equals(il0Var)) {
                    i3t0.A(this, this.y, eb0Var, mneVar.b, null, 4);
                    sac.V(jiu0.a(this), new eo0(b2), null, mneVar.b, new ho0(this, yjeVar, b3), 10);
                    return;
                }
                return;
            }
        }
        if (pl0Var.equals(fl0.f9718a)) {
            this.Q = bww.R(jiu0.a(this), this.Q, Q(), mneVar.f22085a, null, null, new lo0(this, yjeVar, b2), 56);
            return;
        }
        if (pl0Var.equals(jl0.f16694a)) {
            fk80 fk80Var = this.U;
            if (fk80Var != null) {
                fk80Var.a(false);
                return;
            }
            return;
        }
        if (pl0Var.equals(ml0.f21966a)) {
            this.R = bww.R(jiu0.a(this), this.R, Q(), mneVar.f22085a, null, null, new lo0(this, yjeVar, b), 56);
            return;
        }
        if (pl0Var instanceof nl0) {
            int i = ((nl0) pl0Var).f23705a;
            if (i != 0) {
                yk0Var = i != 1 ? ((ln0) D()).f20321a : yk0.VIEWED;
            } else {
                yk0Var = yk0.FAVORITES;
            }
            yk0 yk0Var2 = yk0Var;
            if (((ln0) D()).f20321a != yk0Var2) {
                p7m0 p7m0Var = this.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    this.f.getClass();
                } while (!p7m0Var.m(value, ln0.a((ln0) value, yk0Var2, false, null, null, null, null, null, null, 0L, false, 65534)));
                return;
            }
            return;
        }
        if (pl0Var instanceof el0) {
            this.S = bww.R(jiu0.a(this), this.S, Q(), mneVar.f22085a, null, null, new qa(((el0) pl0Var).f7976a, this, yjeVar, (byte) 11), 56);
            return;
        }
        if (pl0Var instanceof gl0) {
            gl0 gl0Var = (gl0) pl0Var;
            sac.V(jiu0.a(this), new do0(this, b3), null, mneVar.b, new mo0(this, gl0Var.f11469a, gl0Var.c, gl0Var.b, null, (byte) 0), 10);
            return;
        }
        if (pl0Var.equals(ll0.f20225a)) {
            T(true, true);
        } else {
            t9f.b();
        }
    }
}
