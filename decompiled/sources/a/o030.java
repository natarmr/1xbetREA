package a;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class o030 extends x2t0 {
    public static final /* synthetic */ int U = 0;
    public final k7u A;
    public final n660 B;
    public final reu C;
    public final ali D;
    public final cl5 E;
    public final hpc F;
    public final duj G;
    public final lbu H;
    public final gud I;
    public final xzp J;
    public final esg0 K;
    public final x20 L;
    public final v88 M;
    public final hmt0 N;
    public final cr O;
    public final drc P;
    public final fht0 Q;
    public final nou R;
    public final pru S;
    public c4m0 T;
    public final i1w0 h;
    public final e1u i;
    public final jtj j;
    public final pq k;
    public final npx l;
    public final ctf0 m;
    public final mii0 n;
    public final x20 o;
    public final je p;
    public final bn6 q;
    public final ywq0 r;
    public final ouu s;
    public final yk50 t;
    public final m0u u;
    public final ahu v;
    public final z220 w;
    public final xru x;
    public final oif0 y;
    public final vyt z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o030(i1w0 i1w0Var, e1u e1uVar, jtj jtjVar, pq pqVar, npx npxVar, ctf0 ctf0Var, mii0 mii0Var, x20 x20Var, je jeVar, bn6 bn6Var, ywq0 ywq0Var, ouu ouuVar, yk50 yk50Var, m0u m0uVar, ahu ahuVar, z220 z220Var, xru xruVar, oif0 oif0Var, vyt vytVar, k7u k7uVar, n660 n660Var, reu reuVar, ali aliVar, cl5 cl5Var, hpc hpcVar, duj dujVar, lbu lbuVar, gud gudVar, xzp xzpVar, esg0 esg0Var, x20 x20Var2, v88 v88Var, hmt0 hmt0Var, cr crVar, drc drcVar, fht0 fht0Var, nou nouVar, pru pruVar) {
        super(new b6u(pruVar, (byte) 20));
        i1w0Var.getClass();
        ctf0Var.getClass();
        ouuVar.getClass();
        dujVar.getClass();
        v88Var.getClass();
        this.h = i1w0Var;
        this.i = e1uVar;
        this.j = jtjVar;
        this.k = pqVar;
        this.l = npxVar;
        this.m = ctf0Var;
        this.n = mii0Var;
        this.o = x20Var;
        this.p = jeVar;
        this.q = bn6Var;
        this.r = ywq0Var;
        this.s = ouuVar;
        this.t = yk50Var;
        this.u = m0uVar;
        this.v = ahuVar;
        this.w = z220Var;
        this.x = xruVar;
        this.y = oif0Var;
        this.z = vytVar;
        this.A = k7uVar;
        this.B = n660Var;
        this.C = reuVar;
        this.D = aliVar;
        this.E = cl5Var;
        this.F = hpcVar;
        this.G = dujVar;
        this.H = lbuVar;
        this.I = gudVar;
        this.J = xzpVar;
        this.K = esg0Var;
        this.L = x20Var2;
        this.M = v88Var;
        this.N = hmt0Var;
        this.O = crVar;
        this.P = drcVar;
        this.Q = fht0Var;
        this.R = nouVar;
        this.S = pruVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(w030 w030Var, zje zjeVar) {
        e030 e030Var;
        if (zjeVar instanceof e030) {
            e030Var = (e030) zjeVar;
            int i = e030Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                e030Var.k = i - Integer.MIN_VALUE;
            } else {
                e030Var = new e030(this, zjeVar);
            }
        } else {
            e030Var = new e030(this, zjeVar);
        }
        Object objB = e030Var.i;
        wne wneVar = wne.f39444a;
        int i2 = e030Var.k;
        if (i2 == 0) {
            z1x.P(objB);
            m0k0 m0k0Var = w030Var.f38330a;
            zxj0 zxj0Var = w030Var.b;
            gwe gweVarI0 = vcc.i0(((z130) d()).j);
            e030Var.k = 1;
            objB = this.O.b(m0k0Var, zxj0Var, gweVarI0, hrs.f13547a, e030Var);
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
        g(new i130((aud) objB, ctc.b, ((z130) d()).j));
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object j(l9s l9sVar, hao haoVar, boolean z, gwe gweVar, ctc ctcVar, zje zjeVar) {
        f030 f030Var;
        Object next;
        Object next2;
        ctc ctcVar2;
        Integer intOrNull;
        Integer intOrNull2;
        jts jtsVar;
        jts jtsVar2;
        if (zjeVar instanceof f030) {
            f030Var = (f030) zjeVar;
            int i = f030Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                f030Var.l = i - Integer.MIN_VALUE;
            } else {
                f030Var = new f030(this, zjeVar);
            }
        } else {
            f030Var = new f030(this, zjeVar);
        }
        Object objF = f030Var.j;
        wne wneVar = wne.f39444a;
        int i2 = f030Var.l;
        if (i2 == 0) {
            z1x.P(objF);
            if (!this.H.j()) {
                String strS = s(haoVar);
                l9sVar.getClass();
                long jC = l9sVar.c();
                String strN = l9sVar.N();
                Long l = (Long) CollectionsKt.firstOrNull(l9sVar.p());
                long jLongValue = l != null ? l.longValue() : 0L;
                String strJ = l9sVar.j();
                String str = (String) CollectionsKt.firstOrNull(l9sVar.G());
                if (str == null) {
                    str = "";
                }
                String str2 = (String) CollectionsKt.W(1, l9sVar.G());
                if (str2 == null) {
                    str2 = "";
                }
                Long l2 = (Long) CollectionsKt.firstOrNull(l9sVar.m());
                long jLongValue2 = l2 != null ? l2.longValue() : 0L;
                String strG = l9sVar.g();
                String str3 = (String) CollectionsKt.firstOrNull(l9sVar.v());
                String str4 = str3 == null ? "" : str3;
                String str5 = (String) CollectionsKt.W(1, l9sVar.v());
                String str6 = str5 == null ? "" : str5;
                int iMax = Math.max(l9sVar.p().size(), l9sVar.m().size());
                pqs pqsVarZ = l9sVar.z();
                String str7 = pqsVarZ != null ? pqsVarZ.b : null;
                String str8 = str7 == null ? "" : str7;
                String strO = l9sVar.o();
                if (strS.length() == 0) {
                    strS = l9sVar.M();
                }
                String str9 = strS;
                String strL = l9sVar.L();
                long jA = l9sVar.a();
                boolean zE = l9sVar.e();
                long jU = l9sVar.u();
                long jB = l9sVar.b();
                long jD = l9sVar.d();
                boolean zE2 = l9sVar.E();
                String strI = l9sVar.i();
                pqs pqsVarZ2 = l9sVar.z();
                int i3 = pqsVarZ2 != null ? pqsVarZ2.f : -1;
                pqs pqsVarZ3 = l9sVar.z();
                int i4 = pqsVarZ3 != null ? pqsVarZ3.g : -1;
                pqs pqsVarZ4 = l9sVar.z();
                String str10 = (pqsVarZ4 == null || (jtsVar2 = pqsVarZ4.i) == null) ? null : jtsVar2.f17115a;
                String str11 = str10 == null ? "" : str10;
                pqs pqsVarZ5 = l9sVar.z();
                String str12 = (pqsVarZ5 == null || (jtsVar = pqsVarZ5.i) == null) ? null : jtsVar.b;
                String str13 = str12 == null ? "" : str12;
                List listP = l9sVar.P();
                ano0 ano0Var = ano0.c;
                String str14 = str2;
                ArrayList arrayList = new ArrayList(r3d.q(listP, 10));
                Iterator it = listP.iterator();
                while (it.hasNext()) {
                    arrayList.add(((cno0) it.next()).f4666a);
                }
                Iterator it2 = r3d.r(arrayList).iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (((bno0) next).f2894a != ano0Var);
                bno0 bno0Var = (bno0) next;
                int iIntValue = (bno0Var == null || (intOrNull2 = StringsKt.toIntOrNull(bno0Var.c)) == null) ? 0 : intOrNull2.intValue();
                List listP2 = l9sVar.P();
                ano0 ano0Var2 = ano0.c;
                ArrayList arrayList2 = new ArrayList(r3d.q(listP2, 10));
                Iterator it3 = listP2.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(((cno0) it3.next()).f4666a);
                }
                Iterator it4 = r3d.r(arrayList2).iterator();
                do {
                    if (!it4.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it4.next();
                } while (((bno0) next2).f2894a != ano0Var2);
                bno0 bno0Var2 = (bno0) next2;
                m0k0 m0k0Var = new m0k0(jC, strN, jLongValue, strJ, str, str14, jLongValue2, strG, str4, str6, iMax, str8, i3, i4, str11, str13, iIntValue, (bno0Var2 == null || (intOrNull = StringsKt.toIntOrNull(bno0Var2.d)) == null) ? 0 : intOrNull.intValue(), strO, str9, "", strL, jA, zE, jU, jB, zE2, jD, 0L, strI, z, false, l9sVar.A() != boh.UNKNOWN, 268435456, 0);
                zxj0 zxj0VarX = kcx.X(haoVar);
                f030Var.i = ctcVar;
                f030Var.l = 1;
                objF = gud.f(this.I, m0k0Var, zxj0VarX, gweVar, f030Var);
                if (objF == wneVar) {
                    return wneVar;
                }
                ctcVar2 = ctcVar;
            }
            return Unit.f46060a;
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ctcVar2 = f030Var.i;
        z1x.P(objF);
        g(new i130((aud) objF, ctcVar2, ((z130) d()).j));
        return Unit.f46060a;
    }

    public final void k(hao haoVar, l9s l9sVar) {
        long j = haoVar.c;
        long jC = l9sVar.c();
        long jD = l9sVar.d();
        mii0 mii0Var = this.n;
        if (jD != 0) {
            mii0Var.K(jC, j, jD);
        } else {
            mii0Var.J(jC, j);
        }
        this.o.g(jC, j, jD);
        this.r.s(new yx6(l9sVar.c(), l9sVar.o(), haoVar.c, l9sVar.b(), l9sVar.j(), l9sVar.g(), l9sVar.e(), l9sVar.u(), ((z130) d()).f, l9sVar.G(), l9sVar.v()), zgc.P(haoVar));
        ((qe50) this.s.b).a(new za50(0, 7, 0L, 0L), false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l(zje zjeVar) {
        g030 g030Var;
        if (zjeVar instanceof g030) {
            g030Var = (g030) zjeVar;
            int i = g030Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                g030Var.k = i - Integer.MIN_VALUE;
            } else {
                g030Var = new g030(this, zjeVar);
            }
        } else {
            g030Var = new g030(this, zjeVar);
        }
        Object obj = g030Var.i;
        wne wneVar = wne.f39444a;
        int i2 = g030Var.k;
        if (i2 == 0) {
            z1x.P(obj);
            g030Var.k = 1;
            if (this.K.Y(g030Var) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        g(n130.f22729a);
        return Unit.f46060a;
    }

    public final Object m(hao haoVar, l9s l9sVar, boolean z, l030 l030Var) {
        zfa0 xfa0Var;
        Object g0g0Var;
        int i;
        long j = haoVar.c;
        if (this.i.f()) {
            ose oseVarH = this.j.h();
            boolean zA = this.k.a(zgc.P(haoVar));
            ctf0 ctf0Var = this.m;
            if (zA) {
                lsm0 lsm0Var = ctf0Var.b;
                lsm0 lsm0Var2 = ctf0Var.b;
                g(new m130(lsm0Var.a(R.string.attention, Arrays.copyOf(new Object[0], 0)), lsm0Var2.a(R.string.coupon_record_already_exists, Arrays.copyOf(new Object[0], 0)), lsm0Var2.a(R.string.ok, Arrays.copyOf(new Object[0], 0))));
            } else if (this.l.a(j)) {
                lsm0 lsm0Var3 = ctf0Var.b;
                lsm0 lsm0Var4 = ctf0Var.b;
                g(new o130(lsm0Var3.a(R.string.attention, Arrays.copyOf(new Object[0], 0)), lsm0Var4.a(R.string.dependent_events, Arrays.copyOf(new Object[0], 0)), lsm0Var4.a(R.string.ok, Arrays.copyOf(new Object[0], 0)), lsm0Var4.a(R.string.cancel, Arrays.copyOf(new Object[0], 0))));
            } else if (oseVarH instanceof lse) {
                lsm0 lsm0Var5 = ctf0Var.b;
                lsm0 lsm0Var6 = ctf0Var.b;
                g(new j130(lsm0Var5.a(R.string.attention, Arrays.copyOf(new Object[0], 0)), lsm0Var6.a(R.string.coupon_max_items_limit_exceed, Arrays.copyOf(new Object[0], 0)), lsm0Var6.a(R.string.ok, Arrays.copyOf(new Object[0], 0))));
            } else if (oseVarH instanceof mse) {
                q4f q4fVar = ((mse) oseVarH).f22315a;
                ctf0Var.getClass();
                try {
                    e0g0 e0g0Var = j0g0.b;
                    int iOrdinal = q4fVar.ordinal();
                    if (iOrdinal == 2) {
                        i = R.string.express;
                    } else if (iOrdinal == 3) {
                        i = R.string.system;
                    } else if (iOrdinal == 4) {
                        i = R.string.chain;
                    } else if (iOrdinal != 8) {
                        i = iOrdinal != 9 ? 0 : R.string.patent;
                    } else {
                        i = R.string.lucky;
                    }
                    g0g0Var = ctf0Var.b.a(i, Arrays.copyOf(new Object[0], 0));
                } catch (Throwable th) {
                    e0g0 e0g0Var2 = j0g0.b;
                    g0g0Var = new g0g0(th);
                }
                if (j0g0.a(g0g0Var) != null) {
                    g0g0Var = "";
                }
                q4f.f28094a.getClass();
                Object[] objArr = {g0g0Var, Integer.valueOf(nwd.c(q4fVar))};
                lsm0 lsm0Var7 = ctf0Var.b;
                g(new k130(lsm0Var7.a(R.string.attention, Arrays.copyOf(new Object[0], 0)), lsm0Var7.a(R.string.coupon_type_max_items_limit_exceed_v2, Arrays.copyOf(objArr, 2)), lsm0Var7.a(R.string.yes, Arrays.copyOf(new Object[0], 0)), lsm0Var7.a(R.string.no, Arrays.copyOf(new Object[0], 0))));
            } else {
                k(haoVar, l9sVar);
            }
        } else {
            if (this.t.g()) {
                Object objV = v(false, l030Var);
                return objV == wne.f39444a ? objV : Unit.f46060a;
            }
            if (((z130) d()).h) {
                Object objJ = j(l9sVar, haoVar, z, vcc.i0(((z130) d()).j), ctc.f4929a, l030Var);
                return objJ == wne.f39444a ? objJ : Unit.f46060a;
            }
            zfa0 zfa0Var = ((z130) d()).f43600a;
            if (zfa0Var instanceof xfa0) {
                xfa0 xfa0Var2 = (xfa0) zfa0Var;
                xfa0Var = new xfa0(xfa0Var2.b, xfa0Var2.c);
            } else {
                xfa0Var = yfa0.INSTANCE;
            }
            zfa0 zfa0Var2 = xfa0Var;
            zfa0Var2.getClass();
            long j2 = haoVar.c;
            boolean z2 = haoVar.h;
            rh7 rh7Var = haoVar.m;
            long j3 = rh7Var.f30476a;
            String str = rh7Var.b;
            long j4 = haoVar.b;
            long j5 = haoVar.e;
            double d = haoVar.f;
            m97 m97Var = new m97(j2, (int) haoVar.q.f36034a, (izc) null, z2, false, j3, str, j4, j5, d, d, haoVar.d, haoVar.i, haoVar.j, haoVar.l, haoVar.k, false, haoVar.p, false, 0L, false, zfa0Var2, false, 0.0d, (String) null, 62717972);
            m0k0 m0k0VarH0 = x0x.h0(l9sVar, s(haoVar), j, z);
            ms2 ms2Var = ((z130) d()).j;
            ds2 ds2Var = ms2Var instanceof ds2 ? (ds2) ms2Var : null;
            String strV = ds2Var != null ? g1x.v((ds2) ms2Var) : kpb.v0(ms2Var);
            long j6 = m0k0VarH0.f20959a;
            long j7 = m0k0VarH0.z;
            long j8 = m0k0VarH0.B;
            if (j8 <= 0) {
                j8 = -1;
            }
            this.n.L(j6, j8, m97Var.i, ds2Var != null ? j7 : -1L, strV, m0k0VarH0.x);
            this.L.h(m0k0VarH0.f20959a, j8 > 0 ? j8 : -1L, m97Var.i, ds2Var != null ? j7 : -1L, strV, m0k0VarH0.x);
            g(new p130(((z130) d()).j, m97Var, m0k0VarH0));
        }
        return Unit.f46060a;
    }

    public final Serializable n(m97 m97Var, boolean z, double d, h030 h030Var) {
        return this.w.y(xru.a(this.x), m97Var, z, d, this.z.a().f8665a, ((z130) d()).f43600a, vcc.i0(((z130) d()).j), this.A.f17841a.b().getId(), h030Var);
    }

    /* JADX WARN: Code duplicated, block: B:112:0x028c  */
    /* JADX WARN: Code duplicated, block: B:114:0x0296  */
    /* JADX WARN: Code duplicated, block: B:115:0x029b  */
    /* JADX WARN: Code duplicated, block: B:117:0x029f  */
    /* JADX WARN: Code duplicated, block: B:118:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:120:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:123:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:126:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:128:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:131:0x0307  */
    /* JADX WARN: Code duplicated, block: B:133:0x0323  */
    /* JADX WARN: Code duplicated, block: B:135:0x0329  */
    /* JADX WARN: Code duplicated, block: B:140:0x0333  */
    /* JADX WARN: Code duplicated, block: B:143:0x034b  */
    /* JADX WARN: Code duplicated, block: B:145:0x0355  */
    /* JADX WARN: Code duplicated, block: B:146:0x0380  */
    /* JADX WARN: Code duplicated, block: B:49:0x010c  */
    /* JADX WARN: Code duplicated, block: B:50:0x010e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0126  */
    /* JADX WARN: Code duplicated, block: B:54:0x0128  */
    /* JADX WARN: Code duplicated, block: B:58:0x013f A[Catch: all -> 0x003d, TRY_ENTER, TryCatch #3 {all -> 0x003d, blocks: (B:14:0x0038, B:91:0x023c, B:93:0x024b, B:94:0x0250, B:96:0x0262, B:98:0x0268, B:19:0x0052, B:87:0x0234, B:22:0x006c, B:25:0x0087, B:66:0x0180, B:28:0x009c, B:61:0x0158, B:31:0x00ab, B:55:0x012d, B:58:0x013f, B:63:0x0167, B:35:0x00b8, B:51:0x010f, B:38:0x00c4, B:47:0x00f7, B:43:0x00da), top: B:155:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0156  */
    /* JADX WARN: Code duplicated, block: B:61:0x0158 A[Catch: all -> 0x003d, PHI: r0 r2 r3 r4 r5 r7 r8 r12
  0x0158: PHI (r0v38 java.lang.Object) = (r0v37 java.lang.Object), (r0v1 java.lang.Object) binds: [B:59:0x0154, B:28:0x009c] A[DONT_GENERATE, DONT_INLINE]
  0x0158: PHI (r2v30 boolean) = (r2v28 boolean), (r2v31 boolean) binds: [B:59:0x0154, B:28:0x009c] A[DONT_GENERATE, DONT_INLINE]
  0x0158: PHI (r3v21 boolean) = (r3v19 boolean), (r3v22 boolean) binds: [B:59:0x0154, B:28:0x009c] A[DONT_GENERATE, DONT_INLINE]
  0x0158: PHI (r4v15 a.m97) = (r4v12 a.m97), (r4v16 a.m97) binds: [B:59:0x0154, B:28:0x009c] A[DONT_GENERATE, DONT_INLINE]
  0x0158: PHI (r5v22 a.cit0) = (r5v20 a.cit0), (r5v23 a.cit0) binds: [B:59:0x0154, B:28:0x009c] A[DONT_GENERATE, DONT_INLINE]
  0x0158: PHI (r7v10 a.m97) = (r7v8 a.m97), (r7v11 a.m97) binds: [B:59:0x0154, B:28:0x009c] A[DONT_GENERATE, DONT_INLINE]
  0x0158: PHI (r8v9 a.xuf) = (r8v7 a.xuf), (r8v11 a.xuf) binds: [B:59:0x0154, B:28:0x009c] A[DONT_GENERATE, DONT_INLINE]
  0x0158: PHI (r12v3 a.hao) = (r12v1 a.hao), (r12v4 a.hao) binds: [B:59:0x0154, B:28:0x009c] A[DONT_GENERATE, DONT_INLINE], TryCatch #3 {all -> 0x003d, blocks: (B:14:0x0038, B:91:0x023c, B:93:0x024b, B:94:0x0250, B:96:0x0262, B:98:0x0268, B:19:0x0052, B:87:0x0234, B:22:0x006c, B:25:0x0087, B:66:0x0180, B:28:0x009c, B:61:0x0158, B:31:0x00ab, B:55:0x012d, B:58:0x013f, B:63:0x0167, B:35:0x00b8, B:51:0x010f, B:38:0x00c4, B:47:0x00f7, B:43:0x00da), top: B:155:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0167 A[Catch: all -> 0x003d, TryCatch #3 {all -> 0x003d, blocks: (B:14:0x0038, B:91:0x023c, B:93:0x024b, B:94:0x0250, B:96:0x0262, B:98:0x0268, B:19:0x0052, B:87:0x0234, B:22:0x006c, B:25:0x0087, B:66:0x0180, B:28:0x009c, B:61:0x0158, B:31:0x00ab, B:55:0x012d, B:58:0x013f, B:63:0x0167, B:35:0x00b8, B:51:0x010f, B:38:0x00c4, B:47:0x00f7, B:43:0x00da), top: B:155:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x017e  */
    /* JADX WARN: Code duplicated, block: B:66:0x0180 A[Catch: all -> 0x003d, PHI: r0 r2 r3 r4 r5 r7 r8 r12
  0x0180: PHI (r0v43 java.lang.Object) = (r0v36 java.lang.Object), (r0v1 java.lang.Object) binds: [B:64:0x017c, B:25:0x0087] A[DONT_GENERATE, DONT_INLINE]
  0x0180: PHI (r2v37 boolean) = (r2v28 boolean), (r2v38 boolean) binds: [B:64:0x017c, B:25:0x0087] A[DONT_GENERATE, DONT_INLINE]
  0x0180: PHI (r3v24 boolean) = (r3v19 boolean), (r3v25 boolean) binds: [B:64:0x017c, B:25:0x0087] A[DONT_GENERATE, DONT_INLINE]
  0x0180: PHI (r4v21 a.m97) = (r4v12 a.m97), (r4v22 a.m97) binds: [B:64:0x017c, B:25:0x0087] A[DONT_GENERATE, DONT_INLINE]
  0x0180: PHI (r5v26 a.cit0) = (r5v20 a.cit0), (r5v27 a.cit0) binds: [B:64:0x017c, B:25:0x0087] A[DONT_GENERATE, DONT_INLINE]
  0x0180: PHI (r7v15 a.m97) = (r7v8 a.m97), (r7v16 a.m97) binds: [B:64:0x017c, B:25:0x0087] A[DONT_GENERATE, DONT_INLINE]
  0x0180: PHI (r8v14 a.xuf) = (r8v7 a.xuf), (r8v16 a.xuf) binds: [B:64:0x017c, B:25:0x0087] A[DONT_GENERATE, DONT_INLINE]
  0x0180: PHI (r12v7 a.hao) = (r12v1 a.hao), (r12v8 a.hao) binds: [B:64:0x017c, B:25:0x0087] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #3 {all -> 0x003d, blocks: (B:14:0x0038, B:91:0x023c, B:93:0x024b, B:94:0x0250, B:96:0x0262, B:98:0x0268, B:19:0x0052, B:87:0x0234, B:22:0x006c, B:25:0x0087, B:66:0x0180, B:28:0x009c, B:61:0x0158, B:31:0x00ab, B:55:0x012d, B:58:0x013f, B:63:0x0167, B:35:0x00b8, B:51:0x010f, B:38:0x00c4, B:47:0x00f7, B:43:0x00da), top: B:155:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:74:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:81:0x020c  */
    /* JADX WARN: Code duplicated, block: B:82:0x020d  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code duplicated, block: B:90:0x023b  */
    /* JADX WARN: Code duplicated, block: B:93:0x024b A[Catch: all -> 0x003d, TryCatch #3 {all -> 0x003d, blocks: (B:14:0x0038, B:91:0x023c, B:93:0x024b, B:94:0x0250, B:96:0x0262, B:98:0x0268, B:19:0x0052, B:87:0x0234, B:22:0x006c, B:25:0x0087, B:66:0x0180, B:28:0x009c, B:61:0x0158, B:31:0x00ab, B:55:0x012d, B:58:0x013f, B:63:0x0167, B:35:0x00b8, B:51:0x010f, B:38:0x00c4, B:47:0x00f7, B:43:0x00da), top: B:155:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x0262 A[Catch: all -> 0x003d, TryCatch #3 {all -> 0x003d, blocks: (B:14:0x0038, B:91:0x023c, B:93:0x024b, B:94:0x0250, B:96:0x0262, B:98:0x0268, B:19:0x0052, B:87:0x0234, B:22:0x006c, B:25:0x0087, B:66:0x0180, B:28:0x009c, B:61:0x0158, B:31:0x00ab, B:55:0x012d, B:58:0x013f, B:63:0x0167, B:35:0x00b8, B:51:0x010f, B:38:0x00c4, B:47:0x00f7, B:43:0x00da), top: B:155:0x0027 }] */
    public final Object o(boolean z, zje zjeVar) {
        h030 h030Var;
        boolean z2;
        duj dujVar;
        ctf0 ctf0Var;
        zhi0 zhi0Var;
        kuw kuwVar;
        i2o i2oVar;
        Object x130Var;
        String message;
        Object u130Var;
        m0u m0uVar;
        hao haoVar;
        boolean z3;
        hao haoVar2;
        xuf xufVar;
        m97 m97VarF0;
        Object objT;
        xuf xufVar2;
        hao haoVar3;
        m97 m97Var;
        boolean z4;
        cit0 cit0Var;
        m97 m97Var2;
        boolean z5;
        oif0 oif0Var;
        double dDoubleValue;
        boolean z6;
        hao haoVar4;
        cit0 cit0Var2;
        double d;
        m97 m97Var3;
        Serializable serializableN;
        cit0 cit0Var3;
        xuf xufVar3;
        hao haoVar5;
        boolean z7;
        boolean z8;
        double d2;
        zh7 zh7Var;
        n660 n660Var;
        long j;
        hg7 hg7Var;
        xuf xufVar4;
        zh7 zh7Var2;
        boolean z9;
        double d3;
        xuf xufVar5;
        String str;
        hao haoVar6;
        lt2 lt2Var;
        String str2;
        o030 o030Var = this;
        if (zjeVar instanceof h030) {
            h030Var = (h030) zjeVar;
            int i = h030Var.t;
            if ((i & Integer.MIN_VALUE) != 0) {
                h030Var.t = i - Integer.MIN_VALUE;
            } else {
                h030Var = new h030(o030Var, zjeVar);
            }
        } else {
            h030Var = new h030(o030Var, zjeVar);
        }
        h030 h030Var2 = h030Var;
        Object objC = h030Var2.r;
        wne wneVar = wne.f39444a;
        String strA = null;
        try {
            switch (h030Var2.t) {
                case 0:
                    z1x.P(objC);
                    hao haoVar7 = ((z130) o030Var.d()).d;
                    if (haoVar7 != null) {
                        o030Var.g(v130.f36610a);
                        m0uVar = o030Var.u;
                        ahu ahuVar = o030Var.v;
                        h030Var2.k = haoVar7;
                        h030Var2.l = m0uVar;
                        h030Var2.i = z;
                        h030Var2.t = 1;
                        Serializable serializableB = ahuVar.b(bm5.f2822a, h030Var2);
                        if (serializableB != wneVar) {
                            haoVar = haoVar7;
                            objC = serializableB;
                            z3 = z;
                            long j2 = ((ql5) objC).e;
                            h030Var2.k = haoVar;
                            h030Var2.l = null;
                            h030Var2.i = z3;
                            h030Var2.t = 2;
                            objC = m0uVar.f20973a.c(j2, h030Var2);
                            if (objC == wneVar) {
                                haoVar2 = haoVar;
                                xufVar = (xuf) objC;
                                m97VarF0 = uc9.f0(haoVar2);
                                h030Var2.k = haoVar2;
                                h030Var2.l = xufVar;
                                h030Var2.m = m97VarF0;
                                h030Var2.i = z3;
                                h030Var2.t = 3;
                                objT = o030Var.t(m97VarF0, h030Var2);
                                if (objT != wneVar) {
                                    xufVar2 = xufVar;
                                    haoVar3 = haoVar2;
                                    m97Var = m97VarF0;
                                    objC = objT;
                                    z4 = z3;
                                    cit0Var = (cit0) objC;
                                    m97Var2 = (m97) CollectionsKt.U(cit0Var.e);
                                    z5 = cit0Var.f0;
                                    oif0Var = o030Var.y;
                                    if (!z5) {
                                        h030Var2.k = haoVar3;
                                        h030Var2.l = xufVar2;
                                        h030Var2.m = m97Var;
                                        h030Var2.n = cit0Var;
                                        h030Var2.o = m97Var2;
                                        h030Var2.i = z4;
                                        h030Var2.j = z5;
                                        h030Var2.t = 5;
                                        objC = oif0Var.z(h030Var2);
                                        if (objC == wneVar) {
                                            dDoubleValue = ((Number) objC).doubleValue();
                                            z6 = z5;
                                            m97 m97Var4 = m97Var;
                                            haoVar4 = haoVar3;
                                            cit0Var2 = cit0Var;
                                            d = dDoubleValue;
                                            m97Var3 = m97Var4;
                                            m97 m97VarA = m97.a(m97Var3, null, false, 0L, 0.0d, null, null, null, null, m97Var2.y, m97Var2.z, 16777215);
                                            h030Var2.k = haoVar4;
                                            h030Var2.l = xufVar2;
                                            h030Var2.m = m97Var3;
                                            h030Var2.n = cit0Var2;
                                            h030Var2.o = null;
                                            h030Var2.i = z4;
                                            h030Var2.j = z6;
                                            h030Var2.q = d;
                                            h030Var2.t = 6;
                                            serializableN = o030Var.n(m97VarA, z4, d, h030Var2);
                                            if (serializableN == wneVar) {
                                                xuf xufVar6 = xufVar2;
                                                cit0Var3 = cit0Var2;
                                                xufVar3 = xufVar6;
                                                haoVar5 = haoVar4;
                                                z7 = z6;
                                                objC = serializableN;
                                                z8 = z4;
                                                d2 = d;
                                                zh7Var = (zh7) objC;
                                                n660Var = o030Var.B;
                                                j = Long.parseLong(zh7Var.b);
                                                hg7Var = hg7.f13004a;
                                                h030Var2.k = haoVar5;
                                                h030Var2.l = xufVar3;
                                                h030Var2.m = m97Var3;
                                                h030Var2.n = cit0Var3;
                                                xufVar4 = xufVar3;
                                                h030Var2.o = null;
                                                h030Var2.p = zh7Var;
                                                h030Var2.i = z8;
                                                h030Var2.j = z7;
                                                h030Var2.q = d2;
                                                h030Var2.t = 7;
                                                if (n660Var.x(j, hg7Var, h030Var2) != wneVar) {
                                                    double d4 = d2;
                                                    zh7Var2 = zh7Var;
                                                    z9 = z7;
                                                    d3 = d4;
                                                    xufVar5 = xufVar4;
                                                    str = xufVar5.f;
                                                    h030Var2.k = haoVar5;
                                                    strA = null;
                                                    h030Var2.l = null;
                                                    h030Var2.m = null;
                                                    h030Var2.n = null;
                                                    h030Var2.o = null;
                                                    h030Var2.p = zh7Var2;
                                                    h030Var2.i = z8;
                                                    h030Var2.j = z9;
                                                    h030Var2.q = d3;
                                                    h030Var2.t = 8;
                                                    o030Var = this;
                                                    if (o030Var.x(zh7Var2, d3, m97Var3, cit0Var3, str, h030Var2) != wneVar) {
                                                        haoVar6 = haoVar5;
                                                        o030Var.z(haoVar6, zh7Var2);
                                                        lt2Var = ((m0w) o030Var.F.f13434a.g).f;
                                                        if (lt2Var == null) {
                                                            lt2Var = new lt2("", "");
                                                        }
                                                        str2 = lt2Var.f20609a;
                                                        if (o030Var.s.t().f4046a.equals("HISTORY")) {
                                                            o030Var.n.M(str2);
                                                        }
                                                    }
                                                    break;
                                                }
                                            }
                                        }
                                    } else {
                                        h030Var2.k = haoVar3;
                                        h030Var2.l = xufVar2;
                                        h030Var2.m = m97Var;
                                        h030Var2.n = cit0Var;
                                        h030Var2.o = m97Var2;
                                        h030Var2.i = z4;
                                        h030Var2.j = z5;
                                        h030Var2.t = 4;
                                        objC = oif0Var.z(h030Var2);
                                        if (objC == wneVar) {
                                            dDoubleValue = ((Number) objC).doubleValue() * 2.0d;
                                            z6 = z5;
                                            m97 m97Var5 = m97Var;
                                            haoVar4 = haoVar3;
                                            cit0Var2 = cit0Var;
                                            try {
                                                d = dDoubleValue;
                                                m97Var3 = m97Var5;
                                                m97 m97VarA2 = m97.a(m97Var3, null, false, 0L, 0.0d, null, null, null, null, m97Var2.y, m97Var2.z, 16777215);
                                                h030Var2.k = haoVar4;
                                                h030Var2.l = xufVar2;
                                                h030Var2.m = m97Var3;
                                                h030Var2.n = cit0Var2;
                                                try {
                                                    h030Var2.o = null;
                                                    h030Var2.i = z4;
                                                    h030Var2.j = z6;
                                                    h030Var2.q = d;
                                                    h030Var2.t = 6;
                                                    serializableN = o030Var.n(m97VarA2, z4, d, h030Var2);
                                                    if (serializableN == wneVar) {
                                                        xuf xufVar7 = xufVar2;
                                                        cit0Var3 = cit0Var2;
                                                        xufVar3 = xufVar7;
                                                        haoVar5 = haoVar4;
                                                        z7 = z6;
                                                        objC = serializableN;
                                                        z8 = z4;
                                                        d2 = d;
                                                        zh7Var = (zh7) objC;
                                                        n660Var = o030Var.B;
                                                        j = Long.parseLong(zh7Var.b);
                                                        try {
                                                            hg7Var = hg7.f13004a;
                                                            h030Var2.k = haoVar5;
                                                            h030Var2.l = xufVar3;
                                                            h030Var2.m = m97Var3;
                                                            h030Var2.n = cit0Var3;
                                                            xufVar4 = xufVar3;
                                                            try {
                                                                h030Var2.o = null;
                                                                h030Var2.p = zh7Var;
                                                                h030Var2.i = z8;
                                                                h030Var2.j = z7;
                                                                h030Var2.q = d2;
                                                                h030Var2.t = 7;
                                                                if (n660Var.x(j, hg7Var, h030Var2) != wneVar) {
                                                                    double d5 = d2;
                                                                    zh7Var2 = zh7Var;
                                                                    z9 = z7;
                                                                    d3 = d5;
                                                                    xufVar5 = xufVar4;
                                                                    str = xufVar5.f;
                                                                    h030Var2.k = haoVar5;
                                                                    strA = null;
                                                                    try {
                                                                        h030Var2.l = null;
                                                                        h030Var2.m = null;
                                                                        h030Var2.n = null;
                                                                        h030Var2.o = null;
                                                                        h030Var2.p = zh7Var2;
                                                                        h030Var2.i = z8;
                                                                        h030Var2.j = z9;
                                                                        h030Var2.q = d3;
                                                                        h030Var2.t = 8;
                                                                        o030Var = this;
                                                                        if (o030Var.x(zh7Var2, d3, m97Var3, cit0Var3, str, h030Var2) != wneVar) {
                                                                            haoVar6 = haoVar5;
                                                                            o030Var.z(haoVar6, zh7Var2);
                                                                            lt2Var = ((m0w) o030Var.F.f13434a.g).f;
                                                                            if (lt2Var == null) {
                                                                                lt2Var = new lt2("", "");
                                                                            }
                                                                            str2 = lt2Var.f20609a;
                                                                            if (o030Var.s.t().f4046a.equals("HISTORY") && str2.length() > 0) {
                                                                                o030Var.n.M(str2);
                                                                            }
                                                                        }
                                                                        break;
                                                                    } catch (Throwable th) {
                                                                        th = th;
                                                                        o030Var = this;
                                                                        z2 = th instanceof zhi0;
                                                                        dujVar = o030Var.G;
                                                                        ctf0Var = o030Var.m;
                                                                        if (z2) {
                                                                            zhi0Var = th;
                                                                            kuwVar = zhi0Var.c;
                                                                            i2oVar = i2o.NeedToConfirmEula;
                                                                            x130Var = l130.f19229a;
                                                                            if (kuwVar == i2oVar) {
                                                                                dujVar.d();
                                                                            } else if (kuwVar == i2o.IdentificationNotPassed2) {
                                                                                dujVar.f6698a.m(new nu00(jwb.G(zhi0Var, dujVar.b)));
                                                                            } else {
                                                                                if (kuwVar == i2o.BetExistsError) {
                                                                                    lsm0 lsm0Var = ctf0Var.b;
                                                                                    lsm0 lsm0Var2 = ctf0Var.b;
                                                                                    String strA2 = lsm0Var.a(R.string.error, Arrays.copyOf(new Object[0], 0));
                                                                                    String message2 = zhi0Var.getMessage();
                                                                                    u130Var = new s130(strA2, message2 != null ? message2 : "", lsm0Var2.a(R.string.ok_new, Arrays.copyOf(new Object[0], 0)), lsm0Var2.a(R.string.cancel, Arrays.copyOf(new Object[0], 0)));
                                                                                } else if (kuwVar == i2o.q) {
                                                                                    lsm0 lsm0Var3 = ctf0Var.b;
                                                                                    lsm0 lsm0Var4 = ctf0Var.b;
                                                                                    String strA3 = lsm0Var3.a(R.string.error, Arrays.copyOf(new Object[0], 0));
                                                                                    String message3 = zhi0Var.getMessage();
                                                                                    u130Var = new u130(strA3, message3 != null ? message3 : "", lsm0Var4.a(R.string.replenish, Arrays.copyOf(new Object[0], 0)), lsm0Var4.a(R.string.cancel, Arrays.copyOf(new Object[0], 0)));
                                                                                } else {
                                                                                    message = zhi0Var.getMessage();
                                                                                    if (message != null) {
                                                                                        strA = message;
                                                                                    }
                                                                                    if (strA == null) {
                                                                                        strA = ctf0Var.b.a(R.string.error_something_went_wrong, Arrays.copyOf(new Object[0], 0));
                                                                                    }
                                                                                    x130Var = new x130(strA);
                                                                                }
                                                                                x130Var = u130Var;
                                                                            }
                                                                            o030Var.g(x130Var);
                                                                        } else if (th instanceof UnknownHostException) {
                                                                            String strA4 = ctf0Var.b.a(R.string.attention, Arrays.copyOf(new Object[0], 0));
                                                                            lsm0 lsm0Var5 = ctf0Var.b;
                                                                            o030Var.g(new t130(strA4, lsm0Var5.a(R.string.quick_bet_network_error, Arrays.copyOf(new Object[0], 0)), lsm0Var5.a(R.string.ok_new, Arrays.copyOf(new Object[0], 0))));
                                                                        } else {
                                                                            dujVar.a(th);
                                                                            String strA5 = ctf0Var.b.a(R.string.attention, Arrays.copyOf(new Object[0], 0));
                                                                            lsm0 lsm0Var6 = ctf0Var.b;
                                                                            o030Var.g(new t130(strA5, lsm0Var6.a(R.string.quick_bet_network_error, Arrays.copyOf(new Object[0], 0)), lsm0Var6.a(R.string.ok_new, Arrays.copyOf(new Object[0], 0))));
                                                                        }
                                                                    }
                                                                }
                                                            } catch (Throwable th2) {
                                                                th = th2;
                                                                o030Var = this;
                                                                strA = null;
                                                                z2 = th instanceof zhi0;
                                                                dujVar = o030Var.G;
                                                                ctf0Var = o030Var.m;
                                                                if (z2) {
                                                                    zhi0Var = th;
                                                                    kuwVar = zhi0Var.c;
                                                                    i2oVar = i2o.NeedToConfirmEula;
                                                                    x130Var = l130.f19229a;
                                                                    if (kuwVar == i2oVar) {
                                                                        dujVar.d();
                                                                    } else if (kuwVar == i2o.IdentificationNotPassed2) {
                                                                        dujVar.f6698a.m(new nu00(jwb.G(zhi0Var, dujVar.b)));
                                                                    } else {
                                                                        if (kuwVar == i2o.BetExistsError) {
                                                                            lsm0 lsm0Var7 = ctf0Var.b;
                                                                            lsm0 lsm0Var8 = ctf0Var.b;
                                                                            String strA6 = lsm0Var7.a(R.string.error, Arrays.copyOf(new Object[0], 0));
                                                                            String message4 = zhi0Var.getMessage();
                                                                            u130Var = new s130(strA6, message4 != null ? message4 : "", lsm0Var8.a(R.string.ok_new, Arrays.copyOf(new Object[0], 0)), lsm0Var8.a(R.string.cancel, Arrays.copyOf(new Object[0], 0)));
                                                                        } else if (kuwVar == i2o.q) {
                                                                            lsm0 lsm0Var9 = ctf0Var.b;
                                                                            lsm0 lsm0Var10 = ctf0Var.b;
                                                                            String strA7 = lsm0Var9.a(R.string.error, Arrays.copyOf(new Object[0], 0));
                                                                            String message5 = zhi0Var.getMessage();
                                                                            u130Var = new u130(strA7, message5 != null ? message5 : "", lsm0Var10.a(R.string.replenish, Arrays.copyOf(new Object[0], 0)), lsm0Var10.a(R.string.cancel, Arrays.copyOf(new Object[0], 0)));
                                                                        } else {
                                                                            message = zhi0Var.getMessage();
                                                                            if (message != null) {
                                                                                strA = message;
                                                                            }
                                                                            if (strA == null) {
                                                                                strA = ctf0Var.b.a(R.string.error_something_went_wrong, Arrays.copyOf(new Object[0], 0));
                                                                            }
                                                                            x130Var = new x130(strA);
                                                                        }
                                                                        x130Var = u130Var;
                                                                    }
                                                                    o030Var.g(x130Var);
                                                                } else if (th instanceof UnknownHostException) {
                                                                    String strA8 = ctf0Var.b.a(R.string.attention, Arrays.copyOf(new Object[0], 0));
                                                                    lsm0 lsm0Var11 = ctf0Var.b;
                                                                    o030Var.g(new t130(strA8, lsm0Var11.a(R.string.quick_bet_network_error, Arrays.copyOf(new Object[0], 0)), lsm0Var11.a(R.string.ok_new, Arrays.copyOf(new Object[0], 0))));
                                                                } else {
                                                                    dujVar.a(th);
                                                                    String strA9 = ctf0Var.b.a(R.string.attention, Arrays.copyOf(new Object[0], 0));
                                                                    lsm0 lsm0Var12 = ctf0Var.b;
                                                                    o030Var.g(new t130(strA9, lsm0Var12.a(R.string.quick_bet_network_error, Arrays.copyOf(new Object[0], 0)), lsm0Var12.a(R.string.ok_new, Arrays.copyOf(new Object[0], 0))));
                                                                }
                                                            }
                                                        } catch (Throwable th3) {
                                                            th = th3;
                                                            strA = null;
                                                            o030Var = this;
                                                            z2 = th instanceof zhi0;
                                                            dujVar = o030Var.G;
                                                            ctf0Var = o030Var.m;
                                                            if (z2) {
                                                                zhi0Var = th;
                                                                kuwVar = zhi0Var.c;
                                                                i2oVar = i2o.NeedToConfirmEula;
                                                                x130Var = l130.f19229a;
                                                                if (kuwVar == i2oVar) {
                                                                    dujVar.d();
                                                                } else if (kuwVar == i2o.IdentificationNotPassed2) {
                                                                    dujVar.f6698a.m(new nu00(jwb.G(zhi0Var, dujVar.b)));
                                                                } else {
                                                                    if (kuwVar == i2o.BetExistsError) {
                                                                        lsm0 lsm0Var13 = ctf0Var.b;
                                                                        lsm0 lsm0Var14 = ctf0Var.b;
                                                                        String strA10 = lsm0Var13.a(R.string.error, Arrays.copyOf(new Object[0], 0));
                                                                        String message6 = zhi0Var.getMessage();
                                                                        u130Var = new s130(strA10, message6 != null ? message6 : "", lsm0Var14.a(R.string.ok_new, Arrays.copyOf(new Object[0], 0)), lsm0Var14.a(R.string.cancel, Arrays.copyOf(new Object[0], 0)));
                                                                    } else if (kuwVar == i2o.q) {
                                                                        lsm0 lsm0Var15 = ctf0Var.b;
                                                                        lsm0 lsm0Var16 = ctf0Var.b;
                                                                        String strA11 = lsm0Var15.a(R.string.error, Arrays.copyOf(new Object[0], 0));
                                                                        String message7 = zhi0Var.getMessage();
                                                                        u130Var = new u130(strA11, message7 != null ? message7 : "", lsm0Var16.a(R.string.replenish, Arrays.copyOf(new Object[0], 0)), lsm0Var16.a(R.string.cancel, Arrays.copyOf(new Object[0], 0)));
                                                                    } else {
                                                                        message = zhi0Var.getMessage();
                                                                        if (message != null && message.length() != 0) {
                                                                            strA = message;
                                                                        }
                                                                        if (strA == null) {
                                                                            strA = ctf0Var.b.a(R.string.error_something_went_wrong, Arrays.copyOf(new Object[0], 0));
                                                                        }
                                                                        x130Var = new x130(strA);
                                                                    }
                                                                    x130Var = u130Var;
                                                                }
                                                                o030Var.g(x130Var);
                                                            } else if (th instanceof UnknownHostException) {
                                                                String strA12 = ctf0Var.b.a(R.string.attention, Arrays.copyOf(new Object[0], 0));
                                                                lsm0 lsm0Var17 = ctf0Var.b;
                                                                o030Var.g(new t130(strA12, lsm0Var17.a(R.string.quick_bet_network_error, Arrays.copyOf(new Object[0], 0)), lsm0Var17.a(R.string.ok_new, Arrays.copyOf(new Object[0], 0))));
                                                            } else {
                                                                dujVar.a(th);
                                                                String strA13 = ctf0Var.b.a(R.string.attention, Arrays.copyOf(new Object[0], 0));
                                                                lsm0 lsm0Var18 = ctf0Var.b;
                                                                o030Var.g(new t130(strA13, lsm0Var18.a(R.string.quick_bet_network_error, Arrays.copyOf(new Object[0], 0)), lsm0Var18.a(R.string.ok_new, Arrays.copyOf(new Object[0], 0))));
                                                            }
                                                            return Unit.f46060a;
                                                        }
                                                    }
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                    strA = null;
                                                    z2 = th instanceof zhi0;
                                                    dujVar = o030Var.G;
                                                    ctf0Var = o030Var.m;
                                                    if (z2) {
                                                        zhi0Var = th;
                                                        kuwVar = zhi0Var.c;
                                                        i2oVar = i2o.NeedToConfirmEula;
                                                        x130Var = l130.f19229a;
                                                        if (kuwVar == i2oVar) {
                                                            dujVar.d();
                                                        } else if (kuwVar == i2o.IdentificationNotPassed2) {
                                                            dujVar.f6698a.m(new nu00(jwb.G(zhi0Var, dujVar.b)));
                                                        } else {
                                                            if (kuwVar == i2o.BetExistsError) {
                                                                lsm0 lsm0Var19 = ctf0Var.b;
                                                                lsm0 lsm0Var110 = ctf0Var.b;
                                                                String strA14 = lsm0Var19.a(R.string.error, Arrays.copyOf(new Object[0], 0));
                                                                String message8 = zhi0Var.getMessage();
                                                                u130Var = new s130(strA14, message8 != null ? message8 : "", lsm0Var110.a(R.string.ok_new, Arrays.copyOf(new Object[0], 0)), lsm0Var110.a(R.string.cancel, Arrays.copyOf(new Object[0], 0)));
                                                            } else if (kuwVar == i2o.q) {
                                                                lsm0 lsm0Var111 = ctf0Var.b;
                                                                lsm0 lsm0Var112 = ctf0Var.b;
                                                                String strA15 = lsm0Var111.a(R.string.error, Arrays.copyOf(new Object[0], 0));
                                                                String message9 = zhi0Var.getMessage();
                                                                u130Var = new u130(strA15, message9 != null ? message9 : "", lsm0Var112.a(R.string.replenish, Arrays.copyOf(new Object[0], 0)), lsm0Var112.a(R.string.cancel, Arrays.copyOf(new Object[0], 0)));
                                                            } else {
                                                                message = zhi0Var.getMessage();
                                                                if (message != null) {
                                                                    strA = message;
                                                                }
                                                                if (strA == null) {
                                                                    strA = ctf0Var.b.a(R.string.error_something_went_wrong, Arrays.copyOf(new Object[0], 0));
                                                                }
                                                                x130Var = new x130(strA);
                                                            }
                                                            x130Var = u130Var;
                                                        }
                                                        o030Var.g(x130Var);
                                                    } else if (th instanceof UnknownHostException) {
                                                        String strA16 = ctf0Var.b.a(R.string.attention, Arrays.copyOf(new Object[0], 0));
                                                        lsm0 lsm0Var113 = ctf0Var.b;
                                                        o030Var.g(new t130(strA16, lsm0Var113.a(R.string.quick_bet_network_error, Arrays.copyOf(new Object[0], 0)), lsm0Var113.a(R.string.ok_new, Arrays.copyOf(new Object[0], 0))));
                                                    } else {
                                                        dujVar.a(th);
                                                        String strA17 = ctf0Var.b.a(R.string.attention, Arrays.copyOf(new Object[0], 0));
                                                        lsm0 lsm0Var114 = ctf0Var.b;
                                                        o030Var.g(new t130(strA17, lsm0Var114.a(R.string.quick_bet_network_error, Arrays.copyOf(new Object[0], 0)), lsm0Var114.a(R.string.ok_new, Arrays.copyOf(new Object[0], 0))));
                                                    }
                                                    return Unit.f46060a;
                                                }
                                            } catch (Throwable th5) {
                                                th = th5;
                                                strA = null;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return wneVar;
                    }
                    return Unit.f46060a;
                case 1:
                    z3 = h030Var2.i;
                    m0uVar = (m0u) h030Var2.l;
                    haoVar = h030Var2.k;
                    z1x.P(objC);
                    long j3 = ((ql5) objC).e;
                    h030Var2.k = haoVar;
                    h030Var2.l = null;
                    h030Var2.i = z3;
                    h030Var2.t = 2;
                    objC = m0uVar.f20973a.c(j3, h030Var2);
                    if (objC == wneVar) {
                        haoVar2 = haoVar;
                        xufVar = (xuf) objC;
                        m97VarF0 = uc9.f0(haoVar2);
                        h030Var2.k = haoVar2;
                        h030Var2.l = xufVar;
                        h030Var2.m = m97VarF0;
                        h030Var2.i = z3;
                        h030Var2.t = 3;
                        objT = o030Var.t(m97VarF0, h030Var2);
                        if (objT != wneVar) {
                            xufVar2 = xufVar;
                            haoVar3 = haoVar2;
                            m97Var = m97VarF0;
                            objC = objT;
                            z4 = z3;
                            cit0Var = (cit0) objC;
                            m97Var2 = (m97) CollectionsKt.U(cit0Var.e);
                            z5 = cit0Var.f0;
                            oif0Var = o030Var.y;
                            if (!z5) {
                                h030Var2.k = haoVar3;
                                h030Var2.l = xufVar2;
                                h030Var2.m = m97Var;
                                h030Var2.n = cit0Var;
                                h030Var2.o = m97Var2;
                                h030Var2.i = z4;
                                h030Var2.j = z5;
                                h030Var2.t = 4;
                                objC = oif0Var.z(h030Var2);
                                if (objC == wneVar) {
                                    dDoubleValue = ((Number) objC).doubleValue() * 2.0d;
                                    z6 = z5;
                                    m97 m97Var6 = m97Var;
                                    haoVar4 = haoVar3;
                                    cit0Var2 = cit0Var;
                                    d = dDoubleValue;
                                    m97Var3 = m97Var6;
                                    m97 m97VarA3 = m97.a(m97Var3, null, false, 0L, 0.0d, null, null, null, null, m97Var2.y, m97Var2.z, 16777215);
                                    h030Var2.k = haoVar4;
                                    h030Var2.l = xufVar2;
                                    h030Var2.m = m97Var3;
                                    h030Var2.n = cit0Var2;
                                    h030Var2.o = null;
                                    h030Var2.i = z4;
                                    h030Var2.j = z6;
                                    h030Var2.q = d;
                                    h030Var2.t = 6;
                                    serializableN = o030Var.n(m97VarA3, z4, d, h030Var2);
                                    if (serializableN == wneVar) {
                                        xuf xufVar8 = xufVar2;
                                        cit0Var3 = cit0Var2;
                                        xufVar3 = xufVar8;
                                        haoVar5 = haoVar4;
                                        z7 = z6;
                                        objC = serializableN;
                                        z8 = z4;
                                        d2 = d;
                                        zh7Var = (zh7) objC;
                                        n660Var = o030Var.B;
                                        j = Long.parseLong(zh7Var.b);
                                        hg7Var = hg7.f13004a;
                                        h030Var2.k = haoVar5;
                                        h030Var2.l = xufVar3;
                                        h030Var2.m = m97Var3;
                                        h030Var2.n = cit0Var3;
                                        xufVar4 = xufVar3;
                                        h030Var2.o = null;
                                        h030Var2.p = zh7Var;
                                        h030Var2.i = z8;
                                        h030Var2.j = z7;
                                        h030Var2.q = d2;
                                        h030Var2.t = 7;
                                        if (n660Var.x(j, hg7Var, h030Var2) != wneVar) {
                                            double d6 = d2;
                                            zh7Var2 = zh7Var;
                                            z9 = z7;
                                            d3 = d6;
                                            xufVar5 = xufVar4;
                                            str = xufVar5.f;
                                            h030Var2.k = haoVar5;
                                            strA = null;
                                            h030Var2.l = null;
                                            h030Var2.m = null;
                                            h030Var2.n = null;
                                            h030Var2.o = null;
                                            h030Var2.p = zh7Var2;
                                            h030Var2.i = z8;
                                            h030Var2.j = z9;
                                            h030Var2.q = d3;
                                            h030Var2.t = 8;
                                            o030Var = this;
                                            if (o030Var.x(zh7Var2, d3, m97Var3, cit0Var3, str, h030Var2) != wneVar) {
                                                haoVar6 = haoVar5;
                                                o030Var.z(haoVar6, zh7Var2);
                                                lt2Var = ((m0w) o030Var.F.f13434a.g).f;
                                                if (lt2Var == null) {
                                                    lt2Var = new lt2("", "");
                                                }
                                                str2 = lt2Var.f20609a;
                                                if (o030Var.s.t().f4046a.equals("HISTORY")) {
                                                    o030Var.n.M(str2);
                                                    break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        }
                                    }
                                }
                            } else {
                                h030Var2.k = haoVar3;
                                h030Var2.l = xufVar2;
                                h030Var2.m = m97Var;
                                h030Var2.n = cit0Var;
                                h030Var2.o = m97Var2;
                                h030Var2.i = z4;
                                h030Var2.j = z5;
                                h030Var2.t = 5;
                                objC = oif0Var.z(h030Var2);
                                if (objC == wneVar) {
                                    dDoubleValue = ((Number) objC).doubleValue();
                                    z6 = z5;
                                    m97 m97Var7 = m97Var;
                                    haoVar4 = haoVar3;
                                    cit0Var2 = cit0Var;
                                    d = dDoubleValue;
                                    m97Var3 = m97Var7;
                                    m97 m97VarA4 = m97.a(m97Var3, null, false, 0L, 0.0d, null, null, null, null, m97Var2.y, m97Var2.z, 16777215);
                                    h030Var2.k = haoVar4;
                                    h030Var2.l = xufVar2;
                                    h030Var2.m = m97Var3;
                                    h030Var2.n = cit0Var2;
                                    h030Var2.o = null;
                                    h030Var2.i = z4;
                                    h030Var2.j = z6;
                                    h030Var2.q = d;
                                    h030Var2.t = 6;
                                    serializableN = o030Var.n(m97VarA4, z4, d, h030Var2);
                                    if (serializableN == wneVar) {
                                        xuf xufVar9 = xufVar2;
                                        cit0Var3 = cit0Var2;
                                        xufVar3 = xufVar9;
                                        haoVar5 = haoVar4;
                                        z7 = z6;
                                        objC = serializableN;
                                        z8 = z4;
                                        d2 = d;
                                        zh7Var = (zh7) objC;
                                        n660Var = o030Var.B;
                                        j = Long.parseLong(zh7Var.b);
                                        hg7Var = hg7.f13004a;
                                        h030Var2.k = haoVar5;
                                        h030Var2.l = xufVar3;
                                        h030Var2.m = m97Var3;
                                        h030Var2.n = cit0Var3;
                                        xufVar4 = xufVar3;
                                        h030Var2.o = null;
                                        h030Var2.p = zh7Var;
                                        h030Var2.i = z8;
                                        h030Var2.j = z7;
                                        h030Var2.q = d2;
                                        h030Var2.t = 7;
                                        if (n660Var.x(j, hg7Var, h030Var2) != wneVar) {
                                            double d7 = d2;
                                            zh7Var2 = zh7Var;
                                            z9 = z7;
                                            d3 = d7;
                                            xufVar5 = xufVar4;
                                            str = xufVar5.f;
                                            h030Var2.k = haoVar5;
                                            strA = null;
                                            h030Var2.l = null;
                                            h030Var2.m = null;
                                            h030Var2.n = null;
                                            h030Var2.o = null;
                                            h030Var2.p = zh7Var2;
                                            h030Var2.i = z8;
                                            h030Var2.j = z9;
                                            h030Var2.q = d3;
                                            h030Var2.t = 8;
                                            o030Var = this;
                                            if (o030Var.x(zh7Var2, d3, m97Var3, cit0Var3, str, h030Var2) != wneVar) {
                                                haoVar6 = haoVar5;
                                                o030Var.z(haoVar6, zh7Var2);
                                                lt2Var = ((m0w) o030Var.F.f13434a.g).f;
                                                if (lt2Var == null) {
                                                    lt2Var = new lt2("", "");
                                                }
                                                str2 = lt2Var.f20609a;
                                                if (o030Var.s.t().f4046a.equals("HISTORY")) {
                                                    o030Var.n.M(str2);
                                                    break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return wneVar;
                case 2:
                    z3 = h030Var2.i;
                    haoVar2 = h030Var2.k;
                    z1x.P(objC);
                    xufVar = (xuf) objC;
                    m97VarF0 = uc9.f0(haoVar2);
                    h030Var2.k = haoVar2;
                    h030Var2.l = xufVar;
                    h030Var2.m = m97VarF0;
                    h030Var2.i = z3;
                    h030Var2.t = 3;
                    objT = o030Var.t(m97VarF0, h030Var2);
                    if (objT != wneVar) {
                        xufVar2 = xufVar;
                        haoVar3 = haoVar2;
                        m97Var = m97VarF0;
                        objC = objT;
                        z4 = z3;
                        cit0Var = (cit0) objC;
                        m97Var2 = (m97) CollectionsKt.U(cit0Var.e);
                        z5 = cit0Var.f0;
                        oif0Var = o030Var.y;
                        if (!z5) {
                            h030Var2.k = haoVar3;
                            h030Var2.l = xufVar2;
                            h030Var2.m = m97Var;
                            h030Var2.n = cit0Var;
                            h030Var2.o = m97Var2;
                            h030Var2.i = z4;
                            h030Var2.j = z5;
                            h030Var2.t = 4;
                            objC = oif0Var.z(h030Var2);
                            if (objC == wneVar) {
                                dDoubleValue = ((Number) objC).doubleValue() * 2.0d;
                                z6 = z5;
                                m97 m97Var8 = m97Var;
                                haoVar4 = haoVar3;
                                cit0Var2 = cit0Var;
                                d = dDoubleValue;
                                m97Var3 = m97Var8;
                                m97 m97VarA5 = m97.a(m97Var3, null, false, 0L, 0.0d, null, null, null, null, m97Var2.y, m97Var2.z, 16777215);
                                h030Var2.k = haoVar4;
                                h030Var2.l = xufVar2;
                                h030Var2.m = m97Var3;
                                h030Var2.n = cit0Var2;
                                h030Var2.o = null;
                                h030Var2.i = z4;
                                h030Var2.j = z6;
                                h030Var2.q = d;
                                h030Var2.t = 6;
                                serializableN = o030Var.n(m97VarA5, z4, d, h030Var2);
                                if (serializableN == wneVar) {
                                    xuf xufVar10 = xufVar2;
                                    cit0Var3 = cit0Var2;
                                    xufVar3 = xufVar10;
                                    haoVar5 = haoVar4;
                                    z7 = z6;
                                    objC = serializableN;
                                    z8 = z4;
                                    d2 = d;
                                    zh7Var = (zh7) objC;
                                    n660Var = o030Var.B;
                                    j = Long.parseLong(zh7Var.b);
                                    hg7Var = hg7.f13004a;
                                    h030Var2.k = haoVar5;
                                    h030Var2.l = xufVar3;
                                    h030Var2.m = m97Var3;
                                    h030Var2.n = cit0Var3;
                                    xufVar4 = xufVar3;
                                    h030Var2.o = null;
                                    h030Var2.p = zh7Var;
                                    h030Var2.i = z8;
                                    h030Var2.j = z7;
                                    h030Var2.q = d2;
                                    h030Var2.t = 7;
                                    if (n660Var.x(j, hg7Var, h030Var2) != wneVar) {
                                        double d8 = d2;
                                        zh7Var2 = zh7Var;
                                        z9 = z7;
                                        d3 = d8;
                                        xufVar5 = xufVar4;
                                        str = xufVar5.f;
                                        h030Var2.k = haoVar5;
                                        strA = null;
                                        h030Var2.l = null;
                                        h030Var2.m = null;
                                        h030Var2.n = null;
                                        h030Var2.o = null;
                                        h030Var2.p = zh7Var2;
                                        h030Var2.i = z8;
                                        h030Var2.j = z9;
                                        h030Var2.q = d3;
                                        h030Var2.t = 8;
                                        o030Var = this;
                                        if (o030Var.x(zh7Var2, d3, m97Var3, cit0Var3, str, h030Var2) != wneVar) {
                                            haoVar6 = haoVar5;
                                            o030Var.z(haoVar6, zh7Var2);
                                            lt2Var = ((m0w) o030Var.F.f13434a.g).f;
                                            if (lt2Var == null) {
                                                lt2Var = new lt2("", "");
                                            }
                                            str2 = lt2Var.f20609a;
                                            if (o030Var.s.t().f4046a.equals("HISTORY")) {
                                                o030Var.n.M(str2);
                                                break;
                                            }
                                            return Unit.f46060a;
                                        }
                                    }
                                }
                            }
                        } else {
                            h030Var2.k = haoVar3;
                            h030Var2.l = xufVar2;
                            h030Var2.m = m97Var;
                            h030Var2.n = cit0Var;
                            h030Var2.o = m97Var2;
                            h030Var2.i = z4;
                            h030Var2.j = z5;
                            h030Var2.t = 5;
                            objC = oif0Var.z(h030Var2);
                            if (objC == wneVar) {
                                dDoubleValue = ((Number) objC).doubleValue();
                                z6 = z5;
                                m97 m97Var9 = m97Var;
                                haoVar4 = haoVar3;
                                cit0Var2 = cit0Var;
                                d = dDoubleValue;
                                m97Var3 = m97Var9;
                                m97 m97VarA6 = m97.a(m97Var3, null, false, 0L, 0.0d, null, null, null, null, m97Var2.y, m97Var2.z, 16777215);
                                h030Var2.k = haoVar4;
                                h030Var2.l = xufVar2;
                                h030Var2.m = m97Var3;
                                h030Var2.n = cit0Var2;
                                h030Var2.o = null;
                                h030Var2.i = z4;
                                h030Var2.j = z6;
                                h030Var2.q = d;
                                h030Var2.t = 6;
                                serializableN = o030Var.n(m97VarA6, z4, d, h030Var2);
                                if (serializableN == wneVar) {
                                    xuf xufVar11 = xufVar2;
                                    cit0Var3 = cit0Var2;
                                    xufVar3 = xufVar11;
                                    haoVar5 = haoVar4;
                                    z7 = z6;
                                    objC = serializableN;
                                    z8 = z4;
                                    d2 = d;
                                    zh7Var = (zh7) objC;
                                    n660Var = o030Var.B;
                                    j = Long.parseLong(zh7Var.b);
                                    hg7Var = hg7.f13004a;
                                    h030Var2.k = haoVar5;
                                    h030Var2.l = xufVar3;
                                    h030Var2.m = m97Var3;
                                    h030Var2.n = cit0Var3;
                                    xufVar4 = xufVar3;
                                    h030Var2.o = null;
                                    h030Var2.p = zh7Var;
                                    h030Var2.i = z8;
                                    h030Var2.j = z7;
                                    h030Var2.q = d2;
                                    h030Var2.t = 7;
                                    if (n660Var.x(j, hg7Var, h030Var2) != wneVar) {
                                        double d9 = d2;
                                        zh7Var2 = zh7Var;
                                        z9 = z7;
                                        d3 = d9;
                                        xufVar5 = xufVar4;
                                        str = xufVar5.f;
                                        h030Var2.k = haoVar5;
                                        strA = null;
                                        h030Var2.l = null;
                                        h030Var2.m = null;
                                        h030Var2.n = null;
                                        h030Var2.o = null;
                                        h030Var2.p = zh7Var2;
                                        h030Var2.i = z8;
                                        h030Var2.j = z9;
                                        h030Var2.q = d3;
                                        h030Var2.t = 8;
                                        o030Var = this;
                                        if (o030Var.x(zh7Var2, d3, m97Var3, cit0Var3, str, h030Var2) != wneVar) {
                                            haoVar6 = haoVar5;
                                            o030Var.z(haoVar6, zh7Var2);
                                            lt2Var = ((m0w) o030Var.F.f13434a.g).f;
                                            if (lt2Var == null) {
                                                lt2Var = new lt2("", "");
                                            }
                                            str2 = lt2Var.f20609a;
                                            if (o030Var.s.t().f4046a.equals("HISTORY")) {
                                                o030Var.n.M(str2);
                                                break;
                                            }
                                            return Unit.f46060a;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return wneVar;
                case 3:
                    z3 = h030Var2.i;
                    m97 m97Var10 = h030Var2.m;
                    xuf xufVar12 = (xuf) h030Var2.l;
                    hao haoVar8 = h030Var2.k;
                    z1x.P(objC);
                    m97Var = m97Var10;
                    xufVar2 = xufVar12;
                    haoVar3 = haoVar8;
                    z4 = z3;
                    cit0Var = (cit0) objC;
                    m97Var2 = (m97) CollectionsKt.U(cit0Var.e);
                    z5 = cit0Var.f0;
                    oif0Var = o030Var.y;
                    if (!z5) {
                        h030Var2.k = haoVar3;
                        h030Var2.l = xufVar2;
                        h030Var2.m = m97Var;
                        h030Var2.n = cit0Var;
                        h030Var2.o = m97Var2;
                        h030Var2.i = z4;
                        h030Var2.j = z5;
                        h030Var2.t = 4;
                        objC = oif0Var.z(h030Var2);
                        if (objC == wneVar) {
                            dDoubleValue = ((Number) objC).doubleValue() * 2.0d;
                            z6 = z5;
                            m97 m97Var11 = m97Var;
                            haoVar4 = haoVar3;
                            cit0Var2 = cit0Var;
                            d = dDoubleValue;
                            m97Var3 = m97Var11;
                            m97 m97VarA7 = m97.a(m97Var3, null, false, 0L, 0.0d, null, null, null, null, m97Var2.y, m97Var2.z, 16777215);
                            h030Var2.k = haoVar4;
                            h030Var2.l = xufVar2;
                            h030Var2.m = m97Var3;
                            h030Var2.n = cit0Var2;
                            h030Var2.o = null;
                            h030Var2.i = z4;
                            h030Var2.j = z6;
                            h030Var2.q = d;
                            h030Var2.t = 6;
                            serializableN = o030Var.n(m97VarA7, z4, d, h030Var2);
                            if (serializableN == wneVar) {
                                xuf xufVar13 = xufVar2;
                                cit0Var3 = cit0Var2;
                                xufVar3 = xufVar13;
                                haoVar5 = haoVar4;
                                z7 = z6;
                                objC = serializableN;
                                z8 = z4;
                                d2 = d;
                                zh7Var = (zh7) objC;
                                n660Var = o030Var.B;
                                j = Long.parseLong(zh7Var.b);
                                hg7Var = hg7.f13004a;
                                h030Var2.k = haoVar5;
                                h030Var2.l = xufVar3;
                                h030Var2.m = m97Var3;
                                h030Var2.n = cit0Var3;
                                xufVar4 = xufVar3;
                                h030Var2.o = null;
                                h030Var2.p = zh7Var;
                                h030Var2.i = z8;
                                h030Var2.j = z7;
                                h030Var2.q = d2;
                                h030Var2.t = 7;
                                if (n660Var.x(j, hg7Var, h030Var2) != wneVar) {
                                    double d10 = d2;
                                    zh7Var2 = zh7Var;
                                    z9 = z7;
                                    d3 = d10;
                                    xufVar5 = xufVar4;
                                    str = xufVar5.f;
                                    h030Var2.k = haoVar5;
                                    strA = null;
                                    h030Var2.l = null;
                                    h030Var2.m = null;
                                    h030Var2.n = null;
                                    h030Var2.o = null;
                                    h030Var2.p = zh7Var2;
                                    h030Var2.i = z8;
                                    h030Var2.j = z9;
                                    h030Var2.q = d3;
                                    h030Var2.t = 8;
                                    o030Var = this;
                                    if (o030Var.x(zh7Var2, d3, m97Var3, cit0Var3, str, h030Var2) != wneVar) {
                                        haoVar6 = haoVar5;
                                        o030Var.z(haoVar6, zh7Var2);
                                        lt2Var = ((m0w) o030Var.F.f13434a.g).f;
                                        if (lt2Var == null) {
                                            lt2Var = new lt2("", "");
                                        }
                                        str2 = lt2Var.f20609a;
                                        if (o030Var.s.t().f4046a.equals("HISTORY")) {
                                            o030Var.n.M(str2);
                                            break;
                                        }
                                        return Unit.f46060a;
                                    }
                                }
                            }
                        }
                    } else {
                        h030Var2.k = haoVar3;
                        h030Var2.l = xufVar2;
                        h030Var2.m = m97Var;
                        h030Var2.n = cit0Var;
                        h030Var2.o = m97Var2;
                        h030Var2.i = z4;
                        h030Var2.j = z5;
                        h030Var2.t = 5;
                        objC = oif0Var.z(h030Var2);
                        if (objC == wneVar) {
                            dDoubleValue = ((Number) objC).doubleValue();
                            z6 = z5;
                            m97 m97Var12 = m97Var;
                            haoVar4 = haoVar3;
                            cit0Var2 = cit0Var;
                            d = dDoubleValue;
                            m97Var3 = m97Var12;
                            m97 m97VarA8 = m97.a(m97Var3, null, false, 0L, 0.0d, null, null, null, null, m97Var2.y, m97Var2.z, 16777215);
                            h030Var2.k = haoVar4;
                            h030Var2.l = xufVar2;
                            h030Var2.m = m97Var3;
                            h030Var2.n = cit0Var2;
                            h030Var2.o = null;
                            h030Var2.i = z4;
                            h030Var2.j = z6;
                            h030Var2.q = d;
                            h030Var2.t = 6;
                            serializableN = o030Var.n(m97VarA8, z4, d, h030Var2);
                            if (serializableN == wneVar) {
                                xuf xufVar14 = xufVar2;
                                cit0Var3 = cit0Var2;
                                xufVar3 = xufVar14;
                                haoVar5 = haoVar4;
                                z7 = z6;
                                objC = serializableN;
                                z8 = z4;
                                d2 = d;
                                zh7Var = (zh7) objC;
                                n660Var = o030Var.B;
                                j = Long.parseLong(zh7Var.b);
                                hg7Var = hg7.f13004a;
                                h030Var2.k = haoVar5;
                                h030Var2.l = xufVar3;
                                h030Var2.m = m97Var3;
                                h030Var2.n = cit0Var3;
                                xufVar4 = xufVar3;
                                h030Var2.o = null;
                                h030Var2.p = zh7Var;
                                h030Var2.i = z8;
                                h030Var2.j = z7;
                                h030Var2.q = d2;
                                h030Var2.t = 7;
                                if (n660Var.x(j, hg7Var, h030Var2) != wneVar) {
                                    double d11 = d2;
                                    zh7Var2 = zh7Var;
                                    z9 = z7;
                                    d3 = d11;
                                    xufVar5 = xufVar4;
                                    str = xufVar5.f;
                                    h030Var2.k = haoVar5;
                                    strA = null;
                                    h030Var2.l = null;
                                    h030Var2.m = null;
                                    h030Var2.n = null;
                                    h030Var2.o = null;
                                    h030Var2.p = zh7Var2;
                                    h030Var2.i = z8;
                                    h030Var2.j = z9;
                                    h030Var2.q = d3;
                                    h030Var2.t = 8;
                                    o030Var = this;
                                    if (o030Var.x(zh7Var2, d3, m97Var3, cit0Var3, str, h030Var2) != wneVar) {
                                        haoVar6 = haoVar5;
                                        o030Var.z(haoVar6, zh7Var2);
                                        lt2Var = ((m0w) o030Var.F.f13434a.g).f;
                                        if (lt2Var == null) {
                                            lt2Var = new lt2("", "");
                                        }
                                        str2 = lt2Var.f20609a;
                                        if (o030Var.s.t().f4046a.equals("HISTORY")) {
                                            o030Var.n.M(str2);
                                            break;
                                        }
                                        return Unit.f46060a;
                                    }
                                }
                            }
                        }
                    }
                    return wneVar;
                case 4:
                    z5 = h030Var2.j;
                    z4 = h030Var2.i;
                    m97Var2 = h030Var2.o;
                    cit0Var = h030Var2.n;
                    m97Var = h030Var2.m;
                    xufVar2 = (xuf) h030Var2.l;
                    haoVar3 = h030Var2.k;
                    z1x.P(objC);
                    dDoubleValue = ((Number) objC).doubleValue() * 2.0d;
                    z6 = z5;
                    m97 m97Var13 = m97Var;
                    haoVar4 = haoVar3;
                    cit0Var2 = cit0Var;
                    d = dDoubleValue;
                    m97Var3 = m97Var13;
                    m97 m97VarA9 = m97.a(m97Var3, null, false, 0L, 0.0d, null, null, null, null, m97Var2.y, m97Var2.z, 16777215);
                    h030Var2.k = haoVar4;
                    h030Var2.l = xufVar2;
                    h030Var2.m = m97Var3;
                    h030Var2.n = cit0Var2;
                    h030Var2.o = null;
                    h030Var2.i = z4;
                    h030Var2.j = z6;
                    h030Var2.q = d;
                    h030Var2.t = 6;
                    serializableN = o030Var.n(m97VarA9, z4, d, h030Var2);
                    if (serializableN == wneVar) {
                        xuf xufVar15 = xufVar2;
                        cit0Var3 = cit0Var2;
                        xufVar3 = xufVar15;
                        haoVar5 = haoVar4;
                        z7 = z6;
                        objC = serializableN;
                        z8 = z4;
                        d2 = d;
                        zh7Var = (zh7) objC;
                        n660Var = o030Var.B;
                        j = Long.parseLong(zh7Var.b);
                        hg7Var = hg7.f13004a;
                        h030Var2.k = haoVar5;
                        h030Var2.l = xufVar3;
                        h030Var2.m = m97Var3;
                        h030Var2.n = cit0Var3;
                        xufVar4 = xufVar3;
                        h030Var2.o = null;
                        h030Var2.p = zh7Var;
                        h030Var2.i = z8;
                        h030Var2.j = z7;
                        h030Var2.q = d2;
                        h030Var2.t = 7;
                        if (n660Var.x(j, hg7Var, h030Var2) != wneVar) {
                            double d12 = d2;
                            zh7Var2 = zh7Var;
                            z9 = z7;
                            d3 = d12;
                            xufVar5 = xufVar4;
                            str = xufVar5.f;
                            h030Var2.k = haoVar5;
                            strA = null;
                            h030Var2.l = null;
                            h030Var2.m = null;
                            h030Var2.n = null;
                            h030Var2.o = null;
                            h030Var2.p = zh7Var2;
                            h030Var2.i = z8;
                            h030Var2.j = z9;
                            h030Var2.q = d3;
                            h030Var2.t = 8;
                            o030Var = this;
                            if (o030Var.x(zh7Var2, d3, m97Var3, cit0Var3, str, h030Var2) != wneVar) {
                                haoVar6 = haoVar5;
                                o030Var.z(haoVar6, zh7Var2);
                                lt2Var = ((m0w) o030Var.F.f13434a.g).f;
                                if (lt2Var == null) {
                                    lt2Var = new lt2("", "");
                                }
                                str2 = lt2Var.f20609a;
                                if (o030Var.s.t().f4046a.equals("HISTORY")) {
                                    o030Var.n.M(str2);
                                    break;
                                }
                                return Unit.f46060a;
                            }
                        }
                    }
                    return wneVar;
                case 5:
                    z5 = h030Var2.j;
                    z4 = h030Var2.i;
                    m97Var2 = h030Var2.o;
                    cit0Var = h030Var2.n;
                    m97Var = h030Var2.m;
                    xufVar2 = (xuf) h030Var2.l;
                    haoVar3 = h030Var2.k;
                    z1x.P(objC);
                    dDoubleValue = ((Number) objC).doubleValue();
                    z6 = z5;
                    m97 m97Var14 = m97Var;
                    haoVar4 = haoVar3;
                    cit0Var2 = cit0Var;
                    d = dDoubleValue;
                    m97Var3 = m97Var14;
                    m97 m97VarA10 = m97.a(m97Var3, null, false, 0L, 0.0d, null, null, null, null, m97Var2.y, m97Var2.z, 16777215);
                    h030Var2.k = haoVar4;
                    h030Var2.l = xufVar2;
                    h030Var2.m = m97Var3;
                    h030Var2.n = cit0Var2;
                    h030Var2.o = null;
                    h030Var2.i = z4;
                    h030Var2.j = z6;
                    h030Var2.q = d;
                    h030Var2.t = 6;
                    serializableN = o030Var.n(m97VarA10, z4, d, h030Var2);
                    if (serializableN == wneVar) {
                        xuf xufVar16 = xufVar2;
                        cit0Var3 = cit0Var2;
                        xufVar3 = xufVar16;
                        haoVar5 = haoVar4;
                        z7 = z6;
                        objC = serializableN;
                        z8 = z4;
                        d2 = d;
                        zh7Var = (zh7) objC;
                        n660Var = o030Var.B;
                        j = Long.parseLong(zh7Var.b);
                        hg7Var = hg7.f13004a;
                        h030Var2.k = haoVar5;
                        h030Var2.l = xufVar3;
                        h030Var2.m = m97Var3;
                        h030Var2.n = cit0Var3;
                        xufVar4 = xufVar3;
                        h030Var2.o = null;
                        h030Var2.p = zh7Var;
                        h030Var2.i = z8;
                        h030Var2.j = z7;
                        h030Var2.q = d2;
                        h030Var2.t = 7;
                        if (n660Var.x(j, hg7Var, h030Var2) != wneVar) {
                            double d13 = d2;
                            zh7Var2 = zh7Var;
                            z9 = z7;
                            d3 = d13;
                            xufVar5 = xufVar4;
                            str = xufVar5.f;
                            h030Var2.k = haoVar5;
                            strA = null;
                            h030Var2.l = null;
                            h030Var2.m = null;
                            h030Var2.n = null;
                            h030Var2.o = null;
                            h030Var2.p = zh7Var2;
                            h030Var2.i = z8;
                            h030Var2.j = z9;
                            h030Var2.q = d3;
                            h030Var2.t = 8;
                            o030Var = this;
                            if (o030Var.x(zh7Var2, d3, m97Var3, cit0Var3, str, h030Var2) != wneVar) {
                                haoVar6 = haoVar5;
                                o030Var.z(haoVar6, zh7Var2);
                                lt2Var = ((m0w) o030Var.F.f13434a.g).f;
                                if (lt2Var == null) {
                                    lt2Var = new lt2("", "");
                                }
                                str2 = lt2Var.f20609a;
                                if (o030Var.s.t().f4046a.equals("HISTORY")) {
                                    o030Var.n.M(str2);
                                    break;
                                }
                                return Unit.f46060a;
                            }
                        }
                    }
                    return wneVar;
                case 6:
                    d2 = h030Var2.q;
                    z7 = h030Var2.j;
                    z8 = h030Var2.i;
                    cit0 cit0Var4 = h030Var2.n;
                    m97 m97Var15 = h030Var2.m;
                    xuf xufVar17 = (xuf) h030Var2.l;
                    haoVar5 = h030Var2.k;
                    z1x.P(objC);
                    cit0Var3 = cit0Var4;
                    xufVar3 = xufVar17;
                    m97Var3 = m97Var15;
                    zh7Var = (zh7) objC;
                    n660Var = o030Var.B;
                    j = Long.parseLong(zh7Var.b);
                    hg7Var = hg7.f13004a;
                    h030Var2.k = haoVar5;
                    h030Var2.l = xufVar3;
                    h030Var2.m = m97Var3;
                    h030Var2.n = cit0Var3;
                    xufVar4 = xufVar3;
                    h030Var2.o = null;
                    h030Var2.p = zh7Var;
                    h030Var2.i = z8;
                    h030Var2.j = z7;
                    h030Var2.q = d2;
                    h030Var2.t = 7;
                    if (n660Var.x(j, hg7Var, h030Var2) != wneVar) {
                        double d14 = d2;
                        zh7Var2 = zh7Var;
                        z9 = z7;
                        d3 = d14;
                        xufVar5 = xufVar4;
                        str = xufVar5.f;
                        h030Var2.k = haoVar5;
                        strA = null;
                        h030Var2.l = null;
                        h030Var2.m = null;
                        h030Var2.n = null;
                        h030Var2.o = null;
                        h030Var2.p = zh7Var2;
                        h030Var2.i = z8;
                        h030Var2.j = z9;
                        h030Var2.q = d3;
                        h030Var2.t = 8;
                        o030Var = this;
                        if (o030Var.x(zh7Var2, d3, m97Var3, cit0Var3, str, h030Var2) != wneVar) {
                            haoVar6 = haoVar5;
                            o030Var.z(haoVar6, zh7Var2);
                            lt2Var = ((m0w) o030Var.F.f13434a.g).f;
                            if (lt2Var == null) {
                                lt2Var = new lt2("", "");
                            }
                            str2 = lt2Var.f20609a;
                            if (o030Var.s.t().f4046a.equals("HISTORY")) {
                                o030Var.n.M(str2);
                                break;
                            }
                            return Unit.f46060a;
                        }
                    }
                    return wneVar;
                case 7:
                    double d15 = h030Var2.q;
                    boolean z10 = h030Var2.j;
                    z8 = h030Var2.i;
                    zh7 zh7Var3 = h030Var2.p;
                    cit0Var3 = h030Var2.n;
                    m97Var3 = h030Var2.m;
                    xuf xufVar18 = (xuf) h030Var2.l;
                    hao haoVar9 = h030Var2.k;
                    z1x.P(objC);
                    z9 = z10;
                    xufVar5 = xufVar18;
                    haoVar5 = haoVar9;
                    d3 = d15;
                    zh7Var2 = zh7Var3;
                    str = xufVar5.f;
                    h030Var2.k = haoVar5;
                    strA = null;
                    h030Var2.l = null;
                    h030Var2.m = null;
                    h030Var2.n = null;
                    h030Var2.o = null;
                    h030Var2.p = zh7Var2;
                    h030Var2.i = z8;
                    h030Var2.j = z9;
                    h030Var2.q = d3;
                    h030Var2.t = 8;
                    o030Var = this;
                    if (o030Var.x(zh7Var2, d3, m97Var3, cit0Var3, str, h030Var2) != wneVar) {
                        haoVar6 = haoVar5;
                        o030Var.z(haoVar6, zh7Var2);
                        lt2Var = ((m0w) o030Var.F.f13434a.g).f;
                        if (lt2Var == null) {
                            lt2Var = new lt2("", "");
                        }
                        str2 = lt2Var.f20609a;
                        if (o030Var.s.t().f4046a.equals("HISTORY")) {
                            o030Var.n.M(str2);
                            break;
                        }
                        return Unit.f46060a;
                    }
                    return wneVar;
                case 8:
                    zh7Var2 = h030Var2.p;
                    haoVar6 = h030Var2.k;
                    z1x.P(objC);
                    o030Var.z(haoVar6, zh7Var2);
                    lt2Var = ((m0w) o030Var.F.f13434a.g).f;
                    if (lt2Var == null) {
                        lt2Var = new lt2("", "");
                    }
                    str2 = lt2Var.f20609a;
                    if (o030Var.s.t().f4046a.equals("HISTORY")) {
                        o030Var.n.M(str2);
                        break;
                    }
                    return Unit.f46060a;
                default:
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }

    public final hao p(xgl0 xgl0Var, long j) {
        List list = (List) ((z130) d()).k.get(Long.valueOf(j));
        Object obj = null;
        if (list == null) {
            return null;
        }
        for (Object obj2 : list) {
            hao haoVar = (hao) obj2;
            if (haoVar.e == xgl0Var.f && haoVar.b == xgl0Var.f40846a && haoVar.f12733a == xgl0Var.e && haoVar.f == xgl0Var.b && haoVar.q.f36034a == xgl0Var.g && haoVar.c == xgl0Var.h) {
                obj = obj2;
                break;
            }
        }
        return (hao) obj;
    }

    public final hao q(xgl0 xgl0Var) {
        Object next;
        Iterator it = ((z130) d()).b.iterator();
        while (it.hasNext()) {
            next = it.next();
            hao haoVar = (hao) next;
            if (haoVar.e == xgl0Var.f && haoVar.b == xgl0Var.f40846a && haoVar.f12733a == xgl0Var.e && haoVar.f == xgl0Var.b && haoVar.q.f36034a == xgl0Var.g && haoVar.c == xgl0Var.h) {
                return (hao) next;
            }
        }
        next = null;
        return (hao) next;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object r(double d, double d2, m97 m97Var, zje zjeVar) {
        i030 i030Var;
        double d3;
        double d4;
        if (zjeVar instanceof i030) {
            i030Var = (i030) zjeVar;
            int i = i030Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                i030Var.m = i - Integer.MIN_VALUE;
            } else {
                i030Var = new i030(this, zjeVar);
            }
        } else {
            i030Var = new i030(this, zjeVar);
        }
        Object objQ = i030Var.k;
        wne wneVar = wne.f39444a;
        int i2 = i030Var.m;
        if (i2 == 0) {
            z1x.P(objQ);
            long jA = xru.a(this.x);
            String.valueOf(d);
            i030Var.i = d;
            i030Var.j = d2;
            i030Var.m = 1;
            objQ = this.D.q(m97Var, jA, i030Var);
            if (objQ == wneVar) {
                return wneVar;
            }
            d3 = d;
            d4 = d2;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            double d5 = i030Var.j;
            d3 = i030Var.i;
            z1x.P(objQ);
            d4 = d5;
        }
        vf7 vf7Var = (vf7) objQ;
        boolean z = vf7Var.j && this.A.f17841a.b() == jvn.f;
        double d6 = vf7Var.i;
        q4f q4fVar = q4f.c;
        this.E.getClass();
        return new Double(cl5.t(d3, d4, d6, z, 0, q4fVar));
    }

    public final String s(hao haoVar) {
        Long l = ((z130) d()).i;
        if (l == null || l.longValue() != -746) {
            return ((z130) d()).f;
        }
        String str = (String) ((z130) d()).g.get(Long.valueOf(haoVar.e));
        return (str == null || str.length() <= 0) ? this.m.b.a(R.string.main_game, Arrays.copyOf(new Object[0], 0)) : str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object t(m97 m97Var, zje zjeVar) {
        j030 j030Var;
        m97 m97Var2;
        fht0 fht0Var;
        Object objA;
        if (zjeVar instanceof j030) {
            j030Var = (j030) zjeVar;
            int i = j030Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                j030Var.m = i - Integer.MIN_VALUE;
            } else {
                j030Var = new j030(this, zjeVar);
            }
        } else {
            j030Var = new j030(this, zjeVar);
        }
        Object objJ = j030Var.k;
        wne wneVar = wne.f39444a;
        int i2 = j030Var.m;
        if (i2 != 0) {
            if (i2 == 1) {
                fht0Var = j030Var.j;
                m97 m97Var3 = j030Var.i;
                z1x.P(objJ);
                objA = objJ;
                m97Var2 = m97Var3;
            } else {
                if (i2 != 2) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(objJ);
            }
            return CollectionsKt.U((List) objJ);
        }
        z1x.P(objJ);
        m97Var2 = m97Var;
        j030Var.i = m97Var2;
        fht0Var = this.Q;
        j030Var.j = fht0Var;
        j030Var.m = 1;
        objA = this.R.a(tl5.c, j030Var);
        if (objA == wneVar) {
            return wneVar;
        }
        long j = ((ql5) objA).f28916a;
        long jA = xru.a(this.x);
        List listC = kotlin.collections.a.c(xia0.d0(m97Var2, vcc.i0(((z130) d()).j).f12022a));
        iun iunVar = iun.f15405a;
        q4f q4fVar = q4f.c;
        int iA = q4fVar.a();
        byte b = ((z130) d()).l;
        j030Var.i = null;
        j030Var.j = null;
        j030Var.m = 2;
        objJ = fht0Var.j(j, jA, listC, iunVar, 0L, q4fVar, iA, false, false, false, null, null, b, false, j030Var);
        if (objJ == wneVar) {
            return wneVar;
        }
        return CollectionsKt.U((List) objJ);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object u(long j, zje zjeVar) {
        k030 k030Var;
        if (zjeVar instanceof k030) {
            k030Var = (k030) zjeVar;
            int i = k030Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                k030Var.k = i - Integer.MIN_VALUE;
            } else {
                k030Var = new k030(this, zjeVar);
            }
        } else {
            k030Var = new k030(this, zjeVar);
        }
        Object obj = k030Var.i;
        wne wneVar = wne.f39444a;
        int i2 = k030Var.k;
        if (i2 == 0) {
            z1x.P(obj);
            List list = ((z130) d()).b;
            ArrayList<hao> arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (((hao) obj2).e == j) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
            for (hao haoVar : arrayList) {
                haoVar.getClass();
                arrayList2.add(new yv20(haoVar.l, haoVar.f12733a, haoVar.v));
            }
            k030Var.k = 1;
            xv20 xv20Var = (xv20) this.P.f6553a.f23980a;
            xv20Var.getClass();
            xv20Var.f41537a.o(null, arrayList2);
            if (Unit.f46060a == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        g(r130.f29658a);
        return Unit.f46060a;
    }

    public final Object v(boolean z, l030 l030Var) {
        c4m0 c4m0Var = this.T;
        if (c4m0Var != null && c4m0Var.isActive()) {
            return Unit.f46060a;
        }
        Object objJ = d5c.J(l030Var, new mq10(this, z, (yje) null));
        return objJ == wne.f39444a ? objJ : Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:102:0x01da  */
    /* JADX WARN: Code duplicated, block: B:106:0x0204  */
    /* JADX WARN: Code duplicated, block: B:108:0x0208  */
    /* JADX WARN: Code duplicated, block: B:110:0x0213 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:111:0x0215 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:112:0x0217 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:113:0x0219 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x021b  */
    /* JADX WARN: Code duplicated, block: B:116:0x0223  */
    /* JADX WARN: Code duplicated, block: B:118:0x0227  */
    /* JADX WARN: Code duplicated, block: B:119:0x022d  */
    /* JADX WARN: Code duplicated, block: B:120:0x0233  */
    /* JADX WARN: Code duplicated, block: B:121:0x0239  */
    /* JADX WARN: Code duplicated, block: B:126:0x026b  */
    /* JADX WARN: Code duplicated, block: B:128:0x0273  */
    /* JADX WARN: Code duplicated, block: B:129:0x0278  */
    /* JADX WARN: Code duplicated, block: B:131:0x027c  */
    /* JADX WARN: Code duplicated, block: B:135:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:137:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:142:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:144:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:149:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:151:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:153:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:154:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:157:0x0302 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:158:0x0304 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:159:0x0306 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:160:0x0308  */
    /* JADX WARN: Code duplicated, block: B:165:0x0319  */
    /* JADX WARN: Code duplicated, block: B:167:0x031d  */
    /* JADX WARN: Code duplicated, block: B:168:0x0345  */
    /* JADX WARN: Code duplicated, block: B:169:0x036d  */
    /* JADX WARN: Code duplicated, block: B:170:0x0395  */
    /* JADX WARN: Code duplicated, block: B:172:0x0399  */
    /* JADX WARN: Code duplicated, block: B:176:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:178:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:190:0x0421  */
    /* JADX WARN: Code duplicated, block: B:195:0x042a  */
    /* JADX WARN: Code duplicated, block: B:197:0x042e  */
    /* JADX WARN: Code duplicated, block: B:209:0x049d  */
    /* JADX WARN: Code duplicated, block: B:214:0x04a5 A[LOOP:7: B:204:0x0456->B:214:0x04a5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:215:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:217:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:222:0x04d7  */
    /* JADX WARN: Code duplicated, block: B:224:0x015c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:240:0x047f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x007b  */
    /* JADX WARN: Code duplicated, block: B:35:0x0098  */
    /* JADX WARN: Code duplicated, block: B:37:0x009f  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:56:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:70:0x0140  */
    /* JADX WARN: Code duplicated, block: B:72:0x0145  */
    /* JADX WARN: Code duplicated, block: B:77:0x0154  */
    /* JADX WARN: Code duplicated, block: B:82:0x0171  */
    /* JADX WARN: Code duplicated, block: B:84:0x0175  */
    /* JADX WARN: Code duplicated, block: B:89:0x0187  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code duplicated, block: B:91:0x018b  */
    /* JADX WARN: Code duplicated, block: B:93:0x0197  */
    /* JADX WARN: Code duplicated, block: B:94:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:96:0x01ac  */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02b5, code lost:
    
        if (r0.i((a.w030) r1, r6) == r7) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02cd, code lost:
    
        if (r0.l(r6) == r7) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0312, code lost:
    
        if (r0.u(r10, r6) == r7) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0423, code lost:
    
        if (r0 == r7) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x049f, code lost:
    
        if (r0 == r7) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f0, code lost:
    
        if (r0 == r7) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0139, code lost:
    
        if (r0 == r7) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x014d, code lost:
    
        if (r0.v(true, r6) == r7) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0180, code lost:
    
        if (r0.y((a.e130) r1, r6) == r7) goto L211;
     */
    @Override // a.j3t0
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(a.h130 r25, a.yje r26) {
        /*
            Method dump skipped, instruction units count: 1270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.o030.a(a.h130, a.yje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    public final Object x(zh7 zh7Var, double d, m97 m97Var, cit0 cit0Var, String str, zje zjeVar) {
        m030 m030Var;
        String str2;
        o030 o030Var;
        zh7 zh7Var2;
        zh7 zh7Var3;
        boolean z;
        pn40 pn40Var;
        int i;
        int i2;
        String str3;
        if (zjeVar instanceof m030) {
            m030Var = (m030) zjeVar;
            int i3 = m030Var.r;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                m030Var.r = i3 - Integer.MIN_VALUE;
            } else {
                m030Var = new m030(this, zjeVar);
            }
        } else {
            m030Var = new m030(this, zjeVar);
        }
        m030 m030Var2 = m030Var;
        Object objR = m030Var2.p;
        wne wneVar = wne.f39444a;
        int i4 = m030Var2.r;
        if (i4 == 0) {
            z1x.P(objR);
            boolean z2 = cit0Var.f0;
            String str4 = zh7Var.g;
            double dDoubleValue = zh7Var.c;
            if (str4 == null) {
                str4 = "";
            }
            int i5 = str4.length() > 0 ? 1 : 0;
            if (z2) {
                Double d2 = new Double(cit0Var.e0);
                if (d2.doubleValue() == 0.0d) {
                    d2 = null;
                }
                if (d2 != null) {
                    dDoubleValue = d2.doubleValue();
                }
            }
            double d3 = z2 ? d / 2.0d : d;
            pn40 pn40Var2 = pn40.f27267a;
            m030Var2.i = zh7Var;
            m030Var2.j = this;
            m030Var2.k = zh7Var;
            m030Var2.l = str;
            m030Var2.m = pn40Var2;
            m030Var2.n = z2;
            m030Var2.o = i5;
            m030Var2.r = 1;
            objR = r(d3, dDoubleValue, m97Var, m030Var2);
            if (objR == wneVar) {
                return wneVar;
            }
            str2 = str;
            o030Var = this;
            zh7Var2 = zh7Var;
            zh7Var3 = zh7Var2;
            z = z2;
            pn40Var = pn40Var2;
            i = i5;
        } else {
            if (i4 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = m030Var2.o;
            z = m030Var2.n;
            pn40Var = m030Var2.m;
            String str5 = m030Var2.l;
            zh7 zh7Var4 = m030Var2.k;
            o030Var = m030Var2.j;
            zh7Var2 = m030Var2.i;
            z1x.P(objR);
            str2 = str5;
            zh7Var3 = zh7Var4;
        }
        double dDoubleValue2 = ((Number) objR).doubleValue();
        pn40Var.getClass();
        String strO = pn40.o(dDoubleValue2);
        long jA = xru.a(this.x);
        reu reuVar = this.C;
        boolean z3 = reuVar.c().f24244a;
        ctf0 ctf0Var = this.m;
        String strA = ctf0Var.b.a(R.string.bet_processed_successfully, Arrays.copyOf(new Object[0], 0));
        String strR = kotlin.text.c.r(ctf0Var.b.a(lgb.V(zh7Var2.f), Arrays.copyOf(new Object[0], 0)), Separators.COLON, "", false);
        String strA2 = ctf0Var.b.a(i != 0 ? R.string.maximum_coef : R.string.coefficient, Arrays.copyOf(new Object[0], 0));
        if (reuVar.c().f24244a) {
            i2 = R.string.summary_possible_win;
        } else {
            i2 = z ? R.string.make_bet_max_possible_win : R.string.history_possible_win;
        }
        String strR2 = kotlin.text.c.r(ctf0Var.b.a(i2, Arrays.copyOf(new Object[0], 0)), Separators.COLON, "", false);
        String strA3 = ctf0Var.b.a(R.string.bet_sum, Arrays.copyOf(new Object[0], 0));
        String strA4 = i != 0 ? ctf0Var.b.a(R.string.optional_coef, Arrays.copyOf(new Object[0], 0)) : null;
        if (i != 0) {
            String str6 = zh7Var2.g;
            str3 = str6 == null ? "" : str6;
        } else {
            str3 = null;
        }
        o030Var.g(new w130(zh7Var3, str2, strO, jA, z3, strA, strR, strA2, strR2, strA3, strA4, str3, this.S.a().f32117a.c.h ? ctf0Var.b.a(R.string.share, Arrays.copyOf(new Object[0], 0)) : null));
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object y(e130 e130Var, zje zjeVar) {
        n030 n030Var;
        if (zjeVar instanceof n030) {
            n030Var = (n030) zjeVar;
            int i = n030Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                n030Var.k = i - Integer.MIN_VALUE;
            } else {
                n030Var = new n030(this, zjeVar);
            }
        } else {
            n030Var = new n030(this, zjeVar);
        }
        Object objN = n030Var.i;
        wne wneVar = wne.f39444a;
        int i2 = n030Var.k;
        if (i2 == 0) {
            z1x.P(objN);
            m0k0 m0k0Var = e130Var.f7019a;
            zxj0 zxj0Var = e130Var.b;
            gwe gweVarI0 = vcc.i0(((z130) d()).j);
            n030Var.k = 1;
            objN = this.J.N(m0k0Var, zxj0Var, gweVarI0, n030Var);
            if (objN == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objN);
        }
        g(new i130((vtd) objN, ctc.b, ((z130) d()).j));
        return Unit.f46060a;
    }

    public final void z(hao haoVar, zh7 zh7Var) {
        l9s l9sVar = ((z130) d()).c;
        long jC = l9sVar != null ? l9sVar.c() : 0L;
        long j = haoVar.e;
        String str = zh7Var.b;
        bn6 bn6Var = this.q;
        bn6Var.getClass();
        str.getClass();
        kt2 kt2Var = bn6Var.b;
        Pair pair = new Pair("sport_id", Long.valueOf(jC));
        Pair pair2 = new Pair("option", Long.valueOf(j));
        Pair pair3 = new Pair("id_user", String.valueOf(bn6Var.f2867a.e()));
        Pair pair4 = new Pair("bet_id", str);
        Pair pair5 = new Pair("af_id", bn6Var.c.a());
        bn6Var.d.i();
        kt2Var.a("bet_oneclick_done", xp20.f(pair, pair2, pair3, pair4, pair5, new Pair("af_dev_key", "iGjRWepvHRRUkVX6DYuTPC")));
        l9s l9sVar2 = ((z130) d()).c;
        long jC2 = l9sVar2 != null ? l9sVar2.c() : 0L;
        int i = (int) haoVar.e;
        String str2 = zh7Var.b;
        je jeVar = this.p;
        jeVar.getClass();
        str2.getClass();
        jeVar.f16351a.a(tx3.l0(new k1p[]{new i1p((int) jC2, (byte) 2), new i1p(i, (byte) 0), new j1p(str2, (byte) 2)}), 3090L);
    }
}
