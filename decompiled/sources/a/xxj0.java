package a;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.make_bet.impl.presentation.model.AutoMaxUiModel;
import org.xplatform.make_bet.impl.presentation.model.StepInputUiModel;

/* JADX INFO: loaded from: classes5.dex */
public final class xxj0 extends w46 {
    public final dzu A;
    public final p7m0 A0;
    public final lbu B;
    public final p7m0 B0;
    public final f3c C;
    public final p7m0 C0;
    public final loi0 D;
    public final p7m0 D0;
    public final mpt E;
    public final p7m0 E0;
    public final clc F;
    public final ctj F0;
    public final ouu G;
    public final p7m0 G0;
    public final nou H;
    public final ol60 H0;
    public final loi0 I;
    public final uyn J;
    public final rpt K;
    public final sd60 L;
    public final vzg0 M;
    public final e1u N;
    public final ms2 O;
    public final fl70 P;
    public final bst Q;
    public final pmi R;
    public final mii0 S;
    public final gg5 T;
    public final ih5 U;
    public final ih5 V;
    public final l7k W;
    public final x20 X;
    public final yo4 Y;
    public final vqc Z;
    public final m0u a0;
    public final m0k0 b;
    public final rou b0;
    public final duj c;
    public final h3c c0;
    public final mne d;
    public final cl5 d0;
    public final v88 e;
    public final k7u e0;
    public final khf0 f;
    public final x1u f0;
    public final ot g;
    public final edo g0;
    public final i1w0 h;
    public final jru h0;
    public final phf0 i;
    public final cmt i0;
    public final pyu j;
    public bby j0;
    public final q4u k;
    public bby k0;
    public final zlt0 l;
    public final c4m0 l0;
    public final ctf0 m;
    public bby m0;
    public final g320 n;
    public c4m0 n0;
    public final pru o;
    public final nwo0 o0;
    public final nw20 p;
    public final ol60 p0;
    public final nhf0 q;
    public final ol60 q0;
    public final r4v r;
    public final p7m0 r0;
    public final nvu s;
    public final p7m0 s0;
    public final m1e t;
    public final qoj0 t0;
    public final b8u u;
    public final ol60 u0;
    public final yk5 v;
    public final p7m0 v0;
    public final u4a w;
    public final p7m0 w0;
    public final hru x;
    public final p7m0 x0;
    public final pyu y;
    public final ol60 y0;
    public final tmt z;
    public final p7m0 z0;

    public xxj0(m0k0 m0k0Var, duj dujVar, mne mneVar, v88 v88Var, khf0 khf0Var, ot otVar, i1w0 i1w0Var, phf0 phf0Var, pyu pyuVar, q4u q4uVar, zlt0 zlt0Var, ctf0 ctf0Var, g320 g320Var, pru pruVar, nw20 nw20Var, nhf0 nhf0Var, r4v r4vVar, nvu nvuVar, m1e m1eVar, b8u b8uVar, yk5 yk5Var, u4a u4aVar, hru hruVar, pyu pyuVar2, tmt tmtVar, b8u b8uVar2, dzu dzuVar, lbu lbuVar, f3c f3cVar, loi0 loi0Var, a7q a7qVar, mpt mptVar, clc clcVar, ouu ouuVar, nou nouVar, loi0 loi0Var2, uyn uynVar, rpt rptVar, reu reuVar, sd60 sd60Var, vzg0 vzg0Var, e1u e1uVar, rxu rxuVar, ms2 ms2Var, fl70 fl70Var, bst bstVar, pmi pmiVar, mii0 mii0Var, gg5 gg5Var, ih5 ih5Var, ih5 ih5Var2, l7k l7kVar, x20 x20Var, yo4 yo4Var, vqc vqcVar, m0u m0uVar, rou rouVar, h3c h3cVar, cl5 cl5Var, k7u k7uVar, x1u x1uVar, edo edoVar, jru jruVar, cmt cmtVar) {
        dvj dvjVar = mneVar.b;
        i1w0Var.getClass();
        ctf0Var.getClass();
        m1eVar.getClass();
        edoVar.getClass();
        this.b = m0k0Var;
        this.c = dujVar;
        this.d = mneVar;
        this.e = v88Var;
        this.f = khf0Var;
        this.g = otVar;
        this.h = i1w0Var;
        this.i = phf0Var;
        this.j = pyuVar;
        this.k = q4uVar;
        this.l = zlt0Var;
        this.m = ctf0Var;
        this.n = g320Var;
        this.o = pruVar;
        this.p = nw20Var;
        this.q = nhf0Var;
        this.r = r4vVar;
        this.s = nvuVar;
        this.t = m1eVar;
        this.u = b8uVar;
        this.v = yk5Var;
        this.w = u4aVar;
        this.x = hruVar;
        this.y = pyuVar2;
        this.z = tmtVar;
        this.A = dzuVar;
        this.B = lbuVar;
        this.C = f3cVar;
        this.D = loi0Var;
        this.E = mptVar;
        this.F = clcVar;
        this.G = ouuVar;
        this.H = nouVar;
        this.I = loi0Var2;
        this.J = uynVar;
        this.K = rptVar;
        this.L = sd60Var;
        this.M = vzg0Var;
        this.N = e1uVar;
        this.O = ms2Var;
        this.P = fl70Var;
        this.Q = bstVar;
        this.R = pmiVar;
        this.S = mii0Var;
        this.T = gg5Var;
        this.U = ih5Var;
        this.V = ih5Var2;
        this.W = l7kVar;
        this.X = x20Var;
        this.Y = yo4Var;
        this.Z = vqcVar;
        this.a0 = m0uVar;
        this.b0 = rouVar;
        this.c0 = h3cVar;
        this.d0 = cl5Var;
        this.e0 = k7uVar;
        this.f0 = x1uVar;
        this.g0 = edoVar;
        this.h0 = jruVar;
        this.i0 = cmtVar;
        nwo0 nwo0VarC = reuVar.c();
        this.o0 = nwo0VarC;
        byte b = 3;
        this.p0 = new ol60(3);
        this.q0 = new ol60(3);
        this.r0 = q7m0.a(jm5.f16748a);
        this.s0 = q7m0.a(0L);
        byte b2 = 0;
        byte b3 = 1;
        this.t0 = roj0.a(0, 1, i99.b);
        this.u0 = new ol60(3);
        this.v0 = q7m0.a(new a40("", -1.0d));
        this.w0 = q7m0.a(Boolean.FALSE);
        this.x0 = q7m0.a(k40.f17643a);
        this.y0 = new ol60(3);
        this.z0 = q7m0.a(nwo0VarC.f24244a ? bwo0.f3335a : zvo0.f45068a);
        this.A0 = q7m0.a(Boolean.TRUE);
        this.B0 = q7m0.a(onb0.f25539a);
        StepInputUiModel stepInputUiModel = (StepInputUiModel) vzg0Var.a("SAVED_STATE_STEP_INPUT_KEY");
        p7m0 p7m0VarA = q7m0.a(stepInputUiModel == null ? new StepInputUiModel(0.0d, 0.0d, 1.0d, -1.0d, -1.0d, "", false, false, new AutoMaxUiModel(-1.0d, false), true, true, false, true, false, false, true, false) : stepInputUiModel);
        this.C0 = p7m0VarA;
        this.D0 = q7m0.a(new exo(new hxo("", 0.0d), new hxo("", 0.0d), new hxo("", 0.0d), false, false, false, true, false));
        this.E0 = q7m0.a(zg5.f44327a);
        ctj ctjVar = new ctj(0.0d, false);
        this.F0 = ctjVar;
        this.G0 = q7m0.a(ctjVar);
        ol60 ol60Var = new ol60(3);
        this.H0 = ol60Var;
        bm5 bm5Var = bm5.b;
        yje yjeVar = null;
        sac.T(new p6d(new fnq(b8uVar2.a(bm5Var), new kpb0(this, yjeVar, (byte) 14)), m1eVar.b(), new kh1((Object) this, yjeVar, (byte) 16), b3), d5c.S(jiu0.a(this), dvjVar), new fxj0(this, yjeVar, b2));
        c4m0 c4m0Var = this.l0;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            this.l0 = sac.T(dub.d0(new h2c(p7m0VarA, (byte) 20), new xp90(new i89(((nb7) ((h03) a7qVar.f384a).b).f23225a, (byte) 22), (byte) 9), uynVar.h(), rxuVar.a(), ol60Var, new rxj0(this, null)), d5c.S(jiu0.a(this), dvjVar), new fxj0(this, yjeVar, b3));
        }
        U();
        sac.T(new p6d(p7m0VarA, b8uVar2.a(bm5Var), new p4b0(this, yjeVar, b), b3), jiu0.a(this), lxj0.h);
    }

    public static ank0 A(txu txuVar, StepInputUiModel stepInputUiModel) {
        ArrayList arrayList = new ArrayList();
        huh0 huh0Var = new huh0(txuVar, stepInputUiModel, (byte) 17);
        bnk0 bnk0Var = new bnk0();
        huh0Var.invoke(bnk0Var);
        return w6x.l(arrayList, bnk0Var.f2888a, arrayList);
    }

    public static boolean G(StepInputUiModel stepInputUiModel) {
        double d = stepInputUiModel.d;
        double dB = stepInputUiModel.b();
        double d2 = stepInputUiModel.f46773a;
        if ((d > d2 || d2 > dB) && d2 != stepInputUiModel.b) {
            return (stepInputUiModel.g || stepInputUiModel.n) && d2 > stepInputUiModel.b();
        }
        return true;
    }

    public static double T(double d, double d2, double d3, boolean z) {
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(d));
        BigDecimal bigDecimal2 = new BigDecimal(String.valueOf(d2));
        BigDecimal bigDecimal3 = new BigDecimal(String.valueOf(d3));
        BigDecimal bigDecimalAdd = bigDecimal.add(bigDecimal2);
        bigDecimalAdd.getClass();
        return (bigDecimalAdd.compareTo(bigDecimal3) <= 0 || z) ? bigDecimalAdd.doubleValue() : d3;
    }

    public final boolean B() {
        return this.o.a().f32117a.f12063a.h && this.l.k() && !((nb7) ((h03) this.N.b).b).c;
    }

    public final void C(Throwable th) {
        this.c.b(th, new jwj0(this, (byte) 0));
        this.u0.f(uq00.f36094a);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a6, code lost:
    
        if (E((a.oa20) r16, r20, r8, r17, r19, r1, r10) == r3) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object D(a.pa20 r16, boolean r17, a.m97 r18, java.lang.String r19, long r20, a.zje r22) throws a.zhi0 {
        /*
            r15 = this;
            r0 = r16
            r1 = r18
            r2 = r22
            boolean r3 = r2 instanceof a.cxj0
            if (r3 == 0) goto L1a
            r3 = r2
            a.cxj0 r3 = (a.cxj0) r3
            int r4 = r3.l
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L1a
            int r4 = r4 - r5
            r3.l = r4
        L18:
            r10 = r3
            goto L20
        L1a:
            a.cxj0 r3 = new a.cxj0
            r3.<init>(r15, r2)
            goto L18
        L20:
            java.lang.Object r2 = r10.j
            a.wne r3 = a.wne.f39444a
            int r4 = r10.l
            r5 = 2
            r6 = 1
            r12 = 0
            if (r4 == 0) goto L40
            if (r4 == r6) goto L3a
            if (r4 != r5) goto L34
            a.z1x.P(r2)
            goto La9
        L34:
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r15)
            return r12
        L3a:
            a.pa20 r15 = r10.i
            a.z1x.P(r2)
            goto L7c
        L40:
            a.z1x.P(r2)
            if (r0 == 0) goto Lac
            boolean r2 = r0 instanceof a.na20
            if (r2 == 0) goto L8a
            long r4 = r1.i
            r2 = r0
            a.na20 r2 = (a.na20) r2
            a.i2o r2 = r2.b
            long r8 = r1.f
            r10.i = r0
            r10.l = r6
            if (r17 == 0) goto L5c
            java.lang.String r1 = "fast"
        L5a:
            r11 = r1
            goto L5f
        L5c:
            java.lang.String r1 = "custom"
            goto L5a
        L5f:
            a.x20 r1 = r15.X
            int r6 = r2.getErrorCode()
            r1.p(r6)
            int r1 = r2.getErrorCode()
            r6 = r4
            r4 = r15
            r5 = r1
            java.lang.Object r15 = r4.I(r5, r6, r8, r10, r11)
            if (r15 != r3) goto L76
            goto L78
        L76:
            kotlin.Unit r15 = kotlin.Unit.f46060a
        L78:
            if (r15 != r3) goto L7b
            goto La8
        L7b:
            r15 = r0
        L7c:
            a.zhi0 r0 = new a.zhi0
            a.na20 r15 = (a.na20) r15
            java.lang.String r1 = r15.c
            a.i2o r15 = r15.b
            r2 = 12
            r0.<init>(r1, r15, r12, r2)
            throw r0
        L8a:
            boolean r2 = r0 instanceof a.oa20
            if (r2 == 0) goto Lac
            a.oa20 r0 = (a.oa20) r0
            long r8 = r1.i
            long r1 = r1.f
            r10.i = r12
            r10.l = r5
            r4 = r15
            r11 = r19
            r6 = r20
            r5 = r0
            r12 = r1
            r14 = r10
            r10 = r17
            java.lang.Object r15 = r4.E(r5, r6, r8, r10, r11, r12, r14)
            if (r15 != r3) goto La9
        La8:
            return r3
        La9:
            kotlin.Unit r15 = kotlin.Unit.f46060a
            return r15
        Lac:
            a.t9f.b()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: a.xxj0.D(a.pa20, boolean, a.m97, java.lang.String, long, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0119  */
    /* JADX WARN: Code duplicated, block: B:35:0x0124  */
    /* JADX WARN: Code duplicated, block: B:44:0x0198  */
    /* JADX WARN: Code duplicated, block: B:48:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:51:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:55:0x01f2 A[PHI: r1 r2 r4 r5 r7 r9
  0x01f2: PHI (r1v16 a.xxj0) = (r1v14 a.xxj0), (r1v18 a.xxj0) binds: [B:53:0x01ef, B:14:0x0035] A[DONT_GENERATE, DONT_INLINE]
  0x01f2: PHI (r2v21 long) = (r2v19 long), (r2v23 long) binds: [B:53:0x01ef, B:14:0x0035] A[DONT_GENERATE, DONT_INLINE]
  0x01f2: PHI (r4v12 boolean) = (r4v10 boolean), (r4v13 boolean) binds: [B:53:0x01ef, B:14:0x0035] A[DONT_GENERATE, DONT_INLINE]
  0x01f2: PHI (r5v9 long) = (r5v7 long), (r5v10 long) binds: [B:53:0x01ef, B:14:0x0035] A[DONT_GENERATE, DONT_INLINE]
  0x01f2: PHI (r7v9 long) = (r7v7 long), (r7v10 long) binds: [B:53:0x01ef, B:14:0x0035] A[DONT_GENERATE, DONT_INLINE]
  0x01f2: PHI (r9v13 a.oa20) = (r9v11 a.oa20), (r9v14 a.oa20) binds: [B:53:0x01ef, B:14:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0213, code lost:
    
        if (r1.s.J(r0, r13, r10) == r12) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object E(a.oa20 r21, long r22, long r24, boolean r26, java.lang.String r27, long r28, a.zje r30) {
        /*
            Method dump skipped, instruction units count: 556
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.xxj0.E(a.oa20, long, long, boolean, java.lang.String, long, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object F(ql5 ql5Var, zje zjeVar) {
        gxj0 gxj0Var;
        if (zjeVar instanceof gxj0) {
            gxj0Var = (gxj0) zjeVar;
            int i = gxj0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                gxj0Var.k = i - Integer.MIN_VALUE;
            } else {
                gxj0Var = new gxj0(this, zjeVar);
            }
        } else {
            gxj0Var = new gxj0(this, zjeVar);
        }
        Object objA = gxj0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = gxj0Var.k;
        p7m0 p7m0Var = this.G0;
        if (i2 == 0) {
            z1x.P(objA);
            if (Intrinsics.d(p7m0Var.getValue(), this.F0)) {
                gxj0Var.k = 1;
                objA = this.k.f28119a.a(ql5Var, gxj0Var);
                if (objA == wneVar) {
                    return wneVar;
                }
            }
            return Unit.f46060a;
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(objA);
        ctj ctjVar = new ctj(((c3j0) objA).b, this.j.k());
        p7m0Var.getClass();
        p7m0Var.o(null, ctjVar);
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object H(m97 m97Var, zje zjeVar) {
        ixj0 ixj0Var;
        if (zjeVar instanceof ixj0) {
            ixj0Var = (ixj0) zjeVar;
            int i = ixj0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                ixj0Var.l = i - Integer.MIN_VALUE;
            } else {
                ixj0Var = new ixj0(this, zjeVar);
            }
        } else {
            ixj0Var = new ixj0(this, zjeVar);
        }
        Object objX = ixj0Var.j;
        Object obj = wne.f39444a;
        int i2 = ixj0Var.l;
        if (i2 == 0) {
            z1x.P(objX);
            ixj0Var.i = m97Var;
            ixj0Var.l = 1;
            objX = x(ixj0Var);
            if (objX != obj) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                z1x.P(objX);
                return objX;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        m97Var = ixj0Var.i;
        z1x.P(objX);
        if (((Boolean) objX).booleanValue()) {
            return Boolean.FALSE;
        }
        long j = m97Var.h;
        ixj0Var.i = null;
        ixj0Var.l = 2;
        Object objE = this.h0.e(j, ixj0Var);
        return objE == obj ? obj : objE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object I(int i, long j, long j2, zje zjeVar, String str) {
        kxj0 kxj0Var;
        long j3;
        long j4;
        String str2;
        int i2;
        if (zjeVar instanceof kxj0) {
            kxj0Var = (kxj0) zjeVar;
            int i3 = kxj0Var.o;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                kxj0Var.o = i3 - Integer.MIN_VALUE;
            } else {
                kxj0Var = new kxj0(this, zjeVar);
            }
        } else {
            kxj0Var = new kxj0(this, zjeVar);
        }
        Object obj = kxj0Var.m;
        wne wneVar = wne.f39444a;
        int i4 = kxj0Var.o;
        Object obj2 = null;
        if (i4 == 0) {
            z1x.P(obj);
            kxj0Var.i = str;
            j3 = j;
            kxj0Var.j = j3;
            kxj0Var.l = i;
            j4 = j2;
            kxj0Var.k = j4;
            kxj0Var.o = 1;
            Object objB = this.g0.b(kxj0Var);
            if (objB == wneVar) {
                return wneVar;
            }
            str2 = str;
            obj = objB;
            i2 = i;
        } else {
            if (i4 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            long j5 = kxj0Var.k;
            int i5 = kxj0Var.l;
            j3 = kxj0Var.j;
            String str3 = kxj0Var.i;
            z1x.P(obj);
            str2 = str3;
            j4 = j5;
            i2 = i5;
        }
        long j6 = j3;
        for (Object obj3 : (Iterable) obj) {
            if (((xco) obj3).f40655a == j6) {
                obj2 = obj3;
                break;
            }
        }
        xco xcoVar = (xco) obj2;
        String strValueOf = (!(xcoVar != null ? xcoVar.e : false) || j4 == 0) ? "" : String.valueOf(j4);
        ms2 ms2Var = this.O;
        int i6 = ms2Var instanceof ds2 ? ((ds2) ms2Var).f6590a : -1;
        m0k0 m0k0Var = this.b;
        this.Y.q(m0k0Var.f20959a, m0k0Var.B, ms2Var, j6, str2, i2, this.f0.a(), i6, strValueOf);
        ms2 ms2Var2 = this.O;
        this.X.w(m0k0Var.f20959a, m0k0Var.B, i6, ms2Var2 instanceof ds2 ? g1x.v((ds2) ms2Var2) : kpb.v0(ms2Var2), j6, str2, i2, strValueOf);
        return Unit.f46060a;
    }

    public final void J() {
        c4m0 c4m0Var = this.n0;
        if (c4m0Var != null) {
            v3c.N(c4m0Var);
        }
        this.n0 = sac.T(new p6d(this.J.h(), this.t.b(), new sxj0(this, null), (byte) 1), d5c.S(jiu0.a(this), this.d.b), new jbh0(2, this, xxj0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 4, (byte) 15));
    }

    public final void K() {
        ms2 ms2Var = this.O;
        ms2Var.getClass();
        boolean z = ms2Var instanceof vq2;
        this.V.f(z ? k7k.PlayerDuel : k7k.PlacementBet);
        this.W.b((z ? y1p.PLAYER_DUEL : y1p.PLACEMENT_BET).f41868a, this.i0.g());
        sac.V(jiu0.a(this), new iwj0(this, (byte) 0), null, this.d.f22085a, new zmj0(this, null), 10);
    }

    public final void L(String str) {
        String str2 = this.O instanceof vq2 ? "duel" : "regular_bet";
        this.U.c(str2);
        this.T.i(str2);
        this.p0.f(mvj0.f22459a);
    }

    public final void M(String str, double d) {
        p7m0 p7m0Var;
        Object value;
        do {
            p7m0Var = this.C0;
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, StepInputUiModel.a((StepInputUiModel) value, d, 0.0d, 0.0d, 0.0d, 0.0d, null, false, false, null, false, false, false, false, false, false, 129022)));
        N(str, false, false, true);
    }

    public final void N(String str, boolean z, boolean z2, boolean z3) {
        sac.V(jiu0.a(this), new gvj0(1, this, xxj0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 5), null, this.d.b, new txj0(this, z2, z, z3, str, null), 10);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object O(long j, ms2 ms2Var, long j2, long j3, long j4, zje zjeVar) {
        uxj0 uxj0Var;
        j1g j1gVar;
        if (zjeVar instanceof uxj0) {
            uxj0Var = (uxj0) zjeVar;
            int i = uxj0Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                uxj0Var.p = i - Integer.MIN_VALUE;
            } else {
                uxj0Var = new uxj0(this, zjeVar);
            }
        } else {
            uxj0Var = new uxj0(this, zjeVar);
        }
        Object objB = uxj0Var.n;
        wne wneVar = wne.f39444a;
        int i2 = uxj0Var.p;
        if (i2 == 0) {
            z1x.P(objB);
            uxj0Var.m = ms2Var;
            uxj0Var.i = j;
            uxj0Var.j = j2;
            uxj0Var.k = j3;
            uxj0Var.l = j4;
            uxj0Var.p = 1;
            objB = this.c0.b(j2, uxj0Var);
            if (objB == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j4 = uxj0Var.l;
            j3 = uxj0Var.k;
            j2 = uxj0Var.j;
            j = uxj0Var.i;
            ms2Var = uxj0Var.m;
            z1x.P(objB);
        }
        boolean zBooleanValue = ((Boolean) objB).booleanValue();
        if (j2 == 40) {
            j2 = j3;
        }
        l1g l1gVar = l1g.OPEN_SCREEN;
        if (j2 == 40) {
            j1gVar = j1g.REAL;
        } else {
            j1gVar = zBooleanValue ? j1g.SYNTHETIC : j1g.CYBER;
        }
        if (ms2Var != null) {
            boolean z = ms2Var instanceof lq2;
            vqc vqcVar = this.Z;
            if (z || (ms2Var instanceof rq2) || (ms2Var instanceof uq2) || (ms2Var instanceof sq2) || (ms2Var instanceof jq2) || (ms2Var instanceof kq2) || (ms2Var instanceof mq2) || (ms2Var instanceof nq2) || (ms2Var instanceof tq2)) {
                vqcVar.k(pzb.C(new gi20(j, ms2Var, j2, j1gVar, j4, (byte) 2)));
            } else {
                long j5 = j4;
                if ((ms2Var instanceof kr2) || (ms2Var instanceof lr2) || (ms2Var instanceof jr2) || (ms2Var instanceof fr2)) {
                    if (zBooleanValue) {
                        vqcVar.k(pzb.C(new gi20(j, ms2Var, j2, j1gVar, j5, (byte) 3)));
                    }
                }
            }
            return Unit.f46060a;
        }
        return Unit.f46060a;
    }

    public final void P(qnb0 qnb0Var) {
        p7m0 p7m0Var = this.B0;
        p7m0Var.getClass();
        p7m0Var.o(null, qnb0Var);
    }

    public final void Q(gwo0 gwo0Var) {
        bby bbyVar;
        if (!(gwo0Var instanceof bwo0) && (bbyVar = this.k0) != null) {
            v3c.N(bbyVar);
        }
        p7m0 p7m0Var = this.z0;
        p7m0Var.getClass();
        p7m0Var.o(null, gwo0Var);
    }

    public final void R() {
        pek0 pek0Var = pek0.f26859a;
        ctf0 ctf0Var = this.m;
        this.q0.f(new tuj0(new xdk0(pek0Var, ctf0Var.b.a(R.string.no_connection_title_with_hyphen, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.no_connection_description, Arrays.copyOf(new Object[0], 0)), null, null, null, 120)));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r13v8 a.gnb0, still in use, count: 2, list:
          (r13v8 a.gnb0) from 0x012d: MOVE (r33v1 a.gnb0) = (r13v8 a.gnb0) (LINE:302)
          (r13v8 a.gnb0) from 0x0126: MOVE (r33v3 a.gnb0) = (r13v8 a.gnb0) (LINE:295)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:59)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    public final java.lang.Object S(a.oa20 r33, a.zje r34) {
        /*
            Method dump skipped, instruction units count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.xxj0.S(a.oa20, a.zje):java.lang.Object");
    }

    public final void U() {
        p7m0 p7m0Var;
        Object value;
        StepInputUiModel stepInputUiModel;
        do {
            p7m0Var = this.C0;
            value = p7m0Var.getValue();
            stepInputUiModel = (StepInputUiModel) value;
        } while (!p7m0Var.m(value, StepInputUiModel.a(stepInputUiModel, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, null, false, false, AutoMaxUiModel.a(stepInputUiModel.i, this.l.j(), 0.0d, 2), false, false, false, false, false, false, 130815)));
    }

    public final void V(Function1 function1) {
        sac.V(jiu0.a(this), new gvj0(1, this, xxj0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 7), new x6h0(this, function1, (byte) 25), this.d.b, new yng0(this, null, (byte) 17), 8);
    }

    public final double w(double d, double d2, double d3) {
        boolean z = this.K.g().T && this.e0.f17841a.b() == jvn.f;
        q4f q4fVar = q4f.c;
        this.d0.getClass();
        return cl5.t(d, d2, d3, z, 0, q4fVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object x(zje zjeVar) {
        lwj0 lwj0Var;
        if (zjeVar instanceof lwj0) {
            lwj0Var = (lwj0) zjeVar;
            int i = lwj0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                lwj0Var.k = i - Integer.MIN_VALUE;
            } else {
                lwj0Var = new lwj0(this, zjeVar);
            }
        } else {
            lwj0Var = new lwj0(this, zjeVar);
        }
        Object objA = lwj0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = lwj0Var.k;
        if (i2 == 0) {
            z1x.P(objA);
            lwj0Var.k = 1;
            objA = this.C.a(lwj0Var);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        return Boolean.valueOf(((m97) objA).w instanceof xfa0);
    }

    public final void y(hxu hxuVar, StepInputUiModel stepInputUiModel, double d, txu txuVar, double d2) {
        double d3 = stepInputUiModel.f46773a;
        double d4 = stepInputUiModel.d;
        double dB = stepInputUiModel.b();
        boolean z = stepInputUiModel.g;
        boolean z2 = stepInputUiModel.n;
        double d5 = stepInputUiModel.b;
        this.P.getClass();
        if (fl70.c(d, d3, d4, dB, z, z2, d5)) {
            q4f q4fVar = q4f.c;
            this.Q.getClass();
            if (bst.g(q4fVar)) {
                sac.V(jiu0.a(this), new iwj0(this, (byte) 5), null, this.d.b, new pwj0(this, hxuVar, stepInputUiModel, d, txuVar, d2, null), 10);
                return;
            }
        }
        P(onb0.f25539a);
    }

    public final pnb0 z(boolean z) {
        ArrayList arrayList = new ArrayList();
        bnk0 bnk0Var = new bnk0();
        pzw.E(bnk0Var, efx.s(this.m, z, ((StepInputUiModel) this.C0.getValue()).q), 0, 0, 0, 0, 62);
        return new pnb0(w6x.l(arrayList, bnk0Var.f2888a, arrayList));
    }
}
