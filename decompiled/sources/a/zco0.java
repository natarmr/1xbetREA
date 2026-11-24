package a;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class zco0 extends i3t0 {
    public static final /* synthetic */ int r0 = 0;
    public final lbu A;
    public final m1e B;
    public final mne C;
    public final tzi D;
    public final e1u E;
    public final tjb0 F;
    public final bn6 G;
    public final je H;
    public final z7z I;
    public final luu J;
    public final puu K;
    public final jc0 L;
    public final gg5 M;
    public final zg N;
    public final r2u O;
    public final r9u P;
    public final tzi Q;
    public final spc R;
    public final rdd S;
    public final lhf0 T;
    public final pv00 U;
    public final bzu V;
    public final iqt W;
    public final ieu X;
    public final rdd Y;
    public final a6u Z;
    public final fvt0 a0;
    public final nv20 b0;
    public final ivn c0;
    public final vjp d0;
    public final bwl e0;
    public final n0o0 f0;
    public c4m0 g0;
    public c4m0 h0;
    public final bby i0;
    public bby j0;
    public bby k0;
    public bby l0;
    public bby m0;
    public bby n0;
    public final i1w0 o;
    public bby o0;
    public final duj p;
    public c4m0 p0;
    public final yuu q;
    public bby q0;
    public final pru r;
    public final rrc s;
    public final pzu t;
    public final hnu u;
    public final j3c v;
    public final wdu w;
    public final rrd x;
    public final ivn y;
    public final ctf0 z;

    /* JADX WARN: Illegal instructions before constructor call */
    public zco0(i1w0 i1w0Var, g2v g2vVar, duj dujVar, yuu yuuVar, pru pruVar, rrc rrcVar, pzu pzuVar, hnu hnuVar, j3c j3cVar, wdu wduVar, rrd rrdVar, ivn ivnVar, ctf0 ctf0Var, y78 y78Var, lbu lbuVar, m1e m1eVar, mne mneVar, tzi tziVar, e1u e1uVar, tjb0 tjb0Var, vzg0 vzg0Var, l0s l0sVar, bn6 bn6Var, je jeVar, z7z z7zVar, luu luuVar, puu puuVar, jc0 jc0Var, gg5 gg5Var, zg zgVar, r2u r2uVar, r9u r9uVar, tzi tziVar2, spc spcVar, rdd rddVar, lhf0 lhf0Var, pv00 pv00Var, bzu bzuVar, iqt iqtVar, ieu ieuVar, rdd rddVar2, a6u a6uVar, fvt0 fvt0Var, nv20 nv20Var, ivn ivnVar2, vjp vjpVar, bwl bwlVar) {
        rwj rwjVar;
        i1w0Var.getClass();
        ctf0Var.getClass();
        m1eVar.getClass();
        z7zVar.getClass();
        r9uVar.getClass();
        rwj rwjVar2 = mneVar.f22085a;
        g090 g090VarP = cvm0.p(rwjVar2, rwjVar2);
        yje yjeVar = null;
        super(new ng0((Object) puuVar, (Object) lbuVar, (Object) y78Var, (Object) g2vVar, ctf0Var, (byte) 15), g090VarP, new rgn0((byte) 28), (yzn0) null);
        this.o = i1w0Var;
        this.p = dujVar;
        this.q = yuuVar;
        this.r = pruVar;
        this.s = rrcVar;
        this.t = pzuVar;
        this.u = hnuVar;
        this.v = j3cVar;
        this.w = wduVar;
        this.x = rrdVar;
        this.y = ivnVar;
        this.z = ctf0Var;
        this.A = lbuVar;
        this.B = m1eVar;
        this.C = mneVar;
        this.D = tziVar;
        this.E = e1uVar;
        this.F = tjb0Var;
        this.G = bn6Var;
        this.H = jeVar;
        this.I = z7zVar;
        this.J = luuVar;
        this.K = puuVar;
        this.L = jc0Var;
        this.M = gg5Var;
        this.N = zgVar;
        this.O = r2uVar;
        this.P = r9uVar;
        this.Q = tziVar2;
        this.R = spcVar;
        this.S = rddVar;
        this.T = lhf0Var;
        this.U = pv00Var;
        this.V = bzuVar;
        this.W = iqtVar;
        this.X = ieuVar;
        this.Y = rddVar2;
        this.Z = a6uVar;
        this.a0 = fvt0Var;
        this.b0 = nv20Var;
        this.c0 = ivnVar2;
        this.d0 = vjpVar;
        this.e0 = bwlVar;
        this.f0 = maz.b(new jfm0(this, (byte) 24));
        l0sVar.z = new kr2();
        bby bbyVar = this.i0;
        byte b = 1;
        if (bbyVar == null || !bbyVar.isActive()) {
            rwjVar = rwjVar2;
            this.i0 = sac.V(jiu0.a(this), hco0.f12833a, null, rwjVar2, new ico0(this, yjeVar, (byte) 0), 10);
        } else {
            rwjVar = rwjVar2;
        }
        i3t0.K(this, null, null, new gco0(this, yjeVar, b), 3);
        sac.V(jiu0.a(this), null, null, null, new ico0(this, yjeVar, b), 15);
        T();
        sac.T(new fnq(new l0f(vtb.N(((tj60) rddVar.f30285a.f24171a).b), (byte) 4), new kco0(this, yjeVar, (byte) 3), (byte) 4), d5c.S(jiu0.a(this), rwjVar), foe.h);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object M(zje zjeVar) throws IOException {
        eco0 eco0Var;
        if (zjeVar instanceof eco0) {
            eco0Var = (eco0) zjeVar;
            int i = eco0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                eco0Var.k = i - Integer.MIN_VALUE;
            } else {
                eco0Var = new eco0(this, zjeVar);
            }
        } else {
            eco0Var = new eco0(this, zjeVar);
        }
        Object objX = eco0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = eco0Var.k;
        if (i2 == 0) {
            z1x.P(objX);
            eco0Var.k = 1;
            objX = this.T.x(eco0Var);
            if (objX == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objX);
        }
        H(new abn0((kj60) objX, (byte) 13));
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0076 A[PHI: r9
  0x0076: PHI (r9v8 java.lang.Object) = (r9v7 java.lang.Object), (r9v1 java.lang.Object) binds: [B:26:0x0072, B:18:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:30:0x007e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0089 A[PHI: r9
  0x0089: PHI (r9v11 java.lang.Object) = (r9v10 java.lang.Object), (r9v1 java.lang.Object) binds: [B:31:0x0085, B:17:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x0091  */
    /* JADX WARN: Code duplicated, block: B:38:0x009b A[PHI: r9
  0x009b: PHI (r9v14 java.lang.Object) = (r9v13 java.lang.Object), (r9v1 java.lang.Object) binds: [B:36:0x0098, B:16:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ad A[PHI: r9
  0x00ad: PHI (r9v17 java.lang.Object) = (r9v16 java.lang.Object), (r9v1 java.lang.Object) binds: [B:41:0x00aa, B:15:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c1 A[PHI: r9
  0x00c1: PHI (r9v20 java.lang.Object) = (r9v19 java.lang.Object), (r9v1 java.lang.Object) binds: [B:48:0x00be, B:14:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e2 A[PHI: r9
  0x00e2: PHI (r9v26 java.lang.Object) = (r9v25 java.lang.Object), (r9v1 java.lang.Object) binds: [B:55:0x00df, B:13:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0101, code lost:
    
        if (r9 == r1) goto L63;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object N(a.zje r9) {
        /*
            Method dump skipped, instruction units count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.zco0.N(a.zje):java.lang.Object");
    }

    public final kxv O(long j) {
        rn00 rn00Var = ((glb0) D()).v;
        Object obj = null;
        jn00 jn00Var = rn00Var instanceof jn00 ? (jn00) rn00Var : null;
        List list = jn00Var != null ? (List) jn00Var.f16791a : null;
        if (list == null) {
            list = iun.f15405a;
        }
        for (Object obj2 : list) {
            if (((kxv) obj2).f19077a == j) {
                obj = obj2;
                break;
            }
        }
        return (kxv) obj;
    }

    public final sff0 P() {
        return (sff0) this.f0.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object Q(sh60 sh60Var, zje zjeVar) {
        jco0 jco0Var;
        Object value;
        rk60 rk60Var;
        if (zjeVar instanceof jco0) {
            jco0Var = (jco0) zjeVar;
            int i = jco0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                jco0Var.l = i - Integer.MIN_VALUE;
            } else {
                jco0Var = new jco0(this, zjeVar);
            }
        } else {
            jco0Var = new jco0(this, zjeVar);
        }
        Object objL = jco0Var.j;
        wne wneVar = wne.f39444a;
        int i2 = jco0Var.l;
        if (i2 == 0) {
            z1x.P(objL);
            if (((glb0) D()).b) {
                ygp ygpVar = ygp.D1;
                r9u r9uVar = this.P;
                r9uVar.getClass();
                j1q0 j1q0Var = r9uVar.f30104a;
                j1q0Var.getClass();
                if (j1q0Var.f15748a.d(ygpVar) && !this.A.j() && this.W.f15225a.a()) {
                    jco0Var.i = sh60Var;
                    jco0Var.l = 1;
                    objL = this.X.l(sh60Var, jco0Var);
                    if (objL == wneVar) {
                        return wneVar;
                    }
                }
            }
            return Boolean.FALSE;
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        sh60Var = jco0Var.i;
        z1x.P(objL);
        if (((Boolean) objL).booleanValue()) {
            bzu bzuVar = this.V;
            bzuVar.getClass();
            sh60Var.getClass();
            tj60 tj60Var = (tj60) ((nv20) bzuVar.b).f24171a;
            tj60Var.getClass();
            List list = sh60Var.f32197a;
            p7m0 p7m0Var = tj60Var.b;
            do {
                value = p7m0Var.getValue();
                tk60 tk60Var = (tk60) value;
                if (Intrinsics.d(tk60Var, qk60.f28870a)) {
                    rk60Var = new rk60(sh60Var, (skb0) CollectionsKt.U(list));
                } else {
                    if (!(tk60Var instanceof rk60)) {
                        t9f.b();
                        return null;
                    }
                    rk60Var = (rk60) tk60Var;
                    if (rk60Var.f30634a != sh60Var) {
                        rk60Var = new rk60(sh60Var, (skb0) CollectionsKt.U(list));
                    }
                }
            } while (!p7m0Var.m(value, rk60Var));
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public final void R(qnf0 qnf0Var) {
        bby bbyVar = this.k0;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.k0 = sac.V(jiu0.a(this), new ndn0(1, this, zco0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 27), null, this.C.f22085a, new agn0(this, qnf0Var, (yje) null), 10);
        }
    }

    public final void S(y1p y1pVar, nlb0 nlb0Var) {
        int iOrdinal = nlb0Var.ordinal();
        zg zgVar = this.N;
        if (iOrdinal == 0) {
            i8i.D("option", "champ_live", zgVar.f44322a, "popular_sport_all_click");
        } else if (iOrdinal == 1) {
            i8i.D("option", "champ_line", zgVar.f44322a, "popular_sport_all_click");
        } else if (iOrdinal == 2) {
            i8i.D("option", "popular_live", zgVar.f44322a, "popular_sport_all_click");
        } else if (iOrdinal == 3) {
            i8i.D("option", "popular_line", zgVar.f44322a, "popular_sport_all_click");
        } else if (iOrdinal == 4) {
            i8i.D("option", "daily_express_live", zgVar.f44322a, "popular_sport_all_click");
        } else {
            if (iOrdinal != 5) {
                t9f.b();
                return;
            }
            i8i.D("option", "daily_express_line", zgVar.f44322a, "popular_sport_all_click");
        }
        gg5 gg5Var = this.M;
        gg5Var.getClass();
        y1pVar.getClass();
        s1p s1pVar = gg5Var.f11237a;
        yni0 yni0Var = new yni0();
        yni0Var.add(new j1p(y1pVar.f41868a, (byte) 0));
        s1pVar.a(cui0.a(yni0Var), 10625L);
    }

    public final void T() {
        v3c.N(this.l0);
        v3c.N(this.m0);
        v3c.N(this.n0);
        v3c.N(this.o0);
        this.l0 = i3t0.F(this, this.L, null, null, new acm0((byte) 27), 119);
        this.m0 = i3t0.F(this, this.F, null, null, new acm0((byte) 28), 119);
        this.n0 = i3t0.B(this, this.F, new c5l0[]{new o4l0("popular_new_sport", iun.f15405a, amb0.SPORT, new kr2())});
        Object obj = this.I.get();
        obj.getClass();
        this.o0 = i3t0.F(this, (j3t0) obj, null, null, new acm0((byte) 29), 119);
    }

    public final void U() {
        bby bbyVar = this.j0;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
        c4m0 c4m0Var = this.h0;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
        bby bbyVar2 = this.k0;
        if (bbyVar2 != null) {
            bbyVar2.cancel(null);
        }
        bby bbyVar3 = this.q0;
        if (bbyVar3 != null) {
            bbyVar3.cancel(null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        boolean z;
        Object next;
        pkb0 pkb0Var = (pkb0) obj;
        pkb0Var.getClass();
        super.x(pkb0Var);
        boolean z2 = pkb0Var instanceof okb0;
        byte b = 0;
        akb0 akb0Var = akb0.f1015a;
        dkb0 dkb0Var = dkb0.f6223a;
        fkb0 fkb0Var = fkb0.f9683a;
        bkb0 bkb0Var = bkb0.f2740a;
        boolean z3 = true;
        if (z2) {
            z = true;
        } else if (pkb0Var instanceof ckb0) {
            z = ((ckb0) pkb0Var).f4498a instanceof xfj;
        } else {
            if (!(pkb0Var instanceof ekb0) && !pkb0Var.equals(bkb0Var) && !pkb0Var.equals(fkb0Var) && !pkb0Var.equals(dkb0Var) && !pkb0Var.equals(akb0Var)) {
                t9f.b();
                return;
            }
            z = false;
        }
        Object obj2 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        if (z) {
            i3t0.K(this, null, null, new gco0(this, objArr7 == true ? 1 : 0, (byte) 9), 3);
        }
        if (pkb0Var.equals(akb0Var)) {
            i3t0.K(this, null, null, new gco0(this, objArr6 == true ? 1 : 0, b), 3);
            return;
        }
        if (pkb0Var.equals(bkb0Var)) {
            c4m0 c4m0Var = this.g0;
            byte b2 = 4;
            mne mneVar = this.C;
            if (c4m0Var == null || !c4m0Var.isActive()) {
                byte b3 = 23;
                this.g0 = slb.U(new dnq(new fnq(new i89(this.B.b(), b3), new kco0(this, objArr2 == true ? 1 : 0, (byte) 5), b2), new jgb0((Object) this, (yje) (objArr == true ? 1 : 0), b3), (byte) 1), d5c.S(jiu0.a(this), mneVar.b));
            }
            T();
            v3c.N(this.p0);
            iun iunVar = iun.f15405a;
            tzi tziVar = this.Q;
            tziVar.getClass();
            iunVar.getClass();
            this.p0 = J(new fnq(i120.W(aoq.c(new vsg0(new u5u((Object) tziVar, (yje) (objArr5 == true ? 1 : 0), (byte) 22)), new erx(objArr4 == true ? 1 : 0, tziVar, z3, iunVar, (byte) 0))), new kco0(this, objArr3 == true ? 1 : 0, b2), b2), mneVar.f22085a, xco0.f40656a);
            return;
        }
        if (pkb0Var.equals(fkb0Var)) {
            c4m0 c4m0Var2 = this.g0;
            if (c4m0Var2 != null) {
                c4m0Var2.cancel(null);
            }
            c4m0 c4m0Var3 = this.p0;
            if (c4m0Var3 != null) {
                c4m0Var3.cancel(null);
            }
            U();
            v3c.N(this.l0);
            v3c.N(this.m0);
            v3c.N(this.n0);
            v3c.N(this.o0);
            return;
        }
        boolean z4 = pkb0Var instanceof ikb0;
        tjb0 tjb0Var = this.F;
        if (z4) {
            long j = ((ikb0) pkb0Var).f14918a;
            rn00 rn00Var = ((glb0) D()).r;
            jn00 jn00Var = rn00Var instanceof jn00 ? (jn00) rn00Var : null;
            List list = jn00Var != null ? (List) jn00Var.f16791a : null;
            if (list == null) {
                list = iun.f15405a;
            }
            rn00 rn00Var2 = ((glb0) D()).s;
            jn00 jn00Var2 = rn00Var2 instanceof jn00 ? (jn00) rn00Var2 : null;
            List list2 = jn00Var2 != null ? (List) jn00Var2.f16791a : null;
            if (list2 == null) {
                list2 = iun.f15405a;
            }
            Iterator it = CollectionsKt.q0(list, list2).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((rbb) next).f30176a != j);
            rbb rbbVar = (rbb) next;
            if (rbbVar == null) {
                return;
            }
            long j2 = rbbVar.f30176a;
            List listA = this.J.f20692a.a();
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : listA) {
                List list3 = ((lok0) obj3).t;
                if (list3 == null || !list3.isEmpty()) {
                    Iterator it2 = list3.iterator();
                    while (it2.hasNext()) {
                        if (((Number) it2.next()).intValue() == 1) {
                            arrayList.add(obj3);
                            break;
                        }
                    }
                }
            }
            for (Object obj4 : arrayList) {
                if (((lok0) obj4).f20396a == ((int) rbbVar.b)) {
                    obj2 = obj4;
                    break;
                }
            }
            lok0 lok0Var = (lok0) obj2;
            if (lok0Var != null) {
                i3t0.A(this, this.F, new a5l0(lok0Var.f20396a, lok0Var.b), null, null, 6);
                return;
            }
            if (rbbVar.f == 1) {
                long j3 = rbbVar.n;
                ygs ygsVar = (ygs) CollectionsKt.firstOrNull(rbbVar.p);
                long j4 = ygsVar != null ? ygsVar.B : 0L;
                long j5 = rbbVar.f30176a;
                boolean z5 = rbbVar.m;
                this.G.d(j3, j4, j5, "popular_new_sport", z5);
                this.H.f(j3, j4, j5, "popular_new_sport", z5);
            } else {
                boolean z6 = rbbVar.m;
                this.N.i(z6, j2);
                this.M.h("popular_new_sport", j2, z6);
            }
            i3t0.B(this, tjb0Var, new c5l0[]{new w4l0(j2)});
            return;
        }
        if (pkb0Var instanceof mkb0) {
            mkb0 mkb0Var = (mkb0) pkb0Var;
            i3t0.A(this, this.F, new a5l0(mkb0Var.f21937a, mkb0Var.b), null, null, 6);
            return;
        }
        if (pkb0Var instanceof ckb0) {
            i3t0.A(this, this.L, ((ckb0) pkb0Var).f4498a, null, null, 6);
            return;
        }
        boolean z7 = pkb0Var instanceof kkb0;
        i1w0 i1w0Var = this.o;
        if (z7) {
            lcb0 lcb0Var = ((kkb0) pkb0Var).f18428a;
            kcb0 kcb0Var = lcb0Var.b;
            boolean z8 = lcb0Var.f19791a;
            if (kcb0Var.equals(gcb0.f11052a)) {
                Pair pair = z8 ? new Pair(y1p.CHAMP_LIVE, nlb0.f23718a) : new Pair(y1p.CHAMP_LINE, nlb0.b);
                S((y1p) pair.f46059a, (nlb0) pair.b);
                i3t0.A(this, this.F, new v4l0(z8), null, null, 6);
                return;
            } else if (kcb0Var.equals(icb0.f14529a)) {
                Pair pair2 = z8 ? new Pair(y1p.POPULAR_LIVE, nlb0.c) : new Pair(y1p.POPULAR_LINE, nlb0.d);
                S((y1p) pair2.f46059a, (nlb0) pair2.b);
                i1w0Var.d(new ij90((Object) this, z8, (byte) 11));
                return;
            } else if (kcb0Var.equals(hcb0.f12814a)) {
                Pair pair3 = z8 ? new Pair(y1p.DAILY_EXPRESS_LIVE, nlb0.e) : new Pair(y1p.DAILY_EXPRESS_LINE, nlb0.f);
                S((y1p) pair3.f46059a, (nlb0) pair3.b);
                i3t0.A(this, this.L, new tfj(z8), null, null, 6);
                return;
            } else {
                if (kcb0Var.equals(jcb0.f16268a)) {
                    return;
                }
                t9f.b();
                return;
            }
        }
        if (pkb0Var instanceof nkb0) {
            i3t0.A(this, this.F, ((nkb0) pkb0Var).f23674a, null, null, 6);
            return;
        }
        boolean z9 = pkb0Var instanceof yjb0;
        z7z z7zVar = this.I;
        if (z9) {
            Object obj5 = z7zVar.get();
            obj5.getClass();
            i3t0.A(this, (j3t0) obj5, ((yjb0) pkb0Var).f42733a, null, null, 6);
            return;
        }
        if (pkb0Var instanceof zjb0) {
            Object obj6 = z7zVar.get();
            obj6.getClass();
            i3t0.A(this, (j3t0) obj6, ebc.n0(((zjb0) pkb0Var).f44476a), null, null, 6);
            return;
        }
        if (pkb0Var.equals(lkb0.f20193a)) {
            U();
            R(qnf0.f29025a);
            return;
        }
        if (pkb0Var instanceof jkb0) {
            i3t0.B(this, tjb0Var, new c5l0[]{new x4l0(((jkb0) pkb0Var).f16660a)});
            return;
        }
        if (pkb0Var instanceof ekb0) {
            this.U.m(((ekb0) pkb0Var).f7945a);
            return;
        }
        if (pkb0Var instanceof hkb0) {
            kxv kxvVarO = O(((hkb0) pkb0Var).f13199a);
            if (kxvVarO == null) {
                return;
            }
            i1w0Var.d(new itn0(this, kxvVarO, (byte) 6));
            return;
        }
        if (pkb0Var instanceof gkb0) {
            i1w0Var.d(new qi4((Object) this, ((gkb0) pkb0Var).f11437a, (byte) 17));
        } else if (pkb0Var.equals(dkb0Var)) {
            this.Y.a(sh60.b);
        } else {
            t9f.b();
        }
    }
}
