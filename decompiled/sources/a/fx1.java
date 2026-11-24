package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class fx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f10287a;
    public static final float b;

    static {
        zcl zclVar = qmk.f28987a;
        f10287a = 28.0f;
        b = 18.0f;
    }

    public static final void a(mm40 mm40Var, asl aslVar, Function0 function0, fet fetVar, int i) {
        int i2;
        function0.getClass();
        fetVar.g0(1735112525);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(aslVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function0) ? 256 : 128;
        }
        if (!fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            fetVar.X();
        } else if (aslVar instanceof yrl) {
            fetVar.e0(995833317);
            e(mm40Var, (yrl) aslVar, function0, fetVar, i2 & 1022);
            fetVar.r(false);
        } else {
            if (!aslVar.equals(zrl.f44860a)) {
                throw b1j.f(995831121, fetVar, false);
            }
            fetVar.e0(995839826);
            f(i2 & 14, fetVar, mm40Var);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ax1(mm40Var, aslVar, function0, i, (byte) 0);
        }
    }

    public static final void b(String str, fet fetVar, int i) {
        fet fetVar2;
        boolean z;
        float f;
        String str2 = str;
        fetVar.g0(-1237951166);
        int i2 = i | (fetVar.g(str2) ? 4 : 2);
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = xf0.c(0.0f);
                fetVar.o0(objP);
            }
            t33 t33Var = (t33) objP;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = androidx.compose.runtime.e.e(str2);
                fetVar.o0(objP2);
            }
            pz40 pz40Var = (pz40) objP2;
            boolean zI = fetVar.i(t33Var) | ((i2 & 14) == 4);
            Object objP3 = fetVar.P();
            if (zI || objP3 == cl5Var) {
                ex1 ex1Var = new ex1((byte) 0, null, str, t33Var, pz40Var);
                str2 = str;
                fetVar.o0(ex1Var);
                objP3 = ex1Var;
            }
            m0x0.t(fetVar, str2, (Function2) objP3);
            zx7 zx7Var = gqw0.e;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar, jm40Var);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z2 = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z2) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            mm40 mm40VarB = jr8.f16991a.b(jm40Var, zx7Var);
            zcl zclVar = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(2.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarB);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            zx7 zx7Var2 = gqw0.f11754a;
            tj30 tj30VarC2 = zq8.c(zx7Var2, false);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, jm40Var);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC2, shdVar);
            jpm0.o(fetVar, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC2, shdVar4);
            vkq vkqVar = vkq.f37586a;
            int i3 = ((i2 << 3) & 112) | 384;
            fetVar2 = fetVar;
            c(null, str, vkqVar, fetVar2, i3, 1);
            float fFloatValue = ((Number) t33Var.d()).floatValue();
            if (0.0f > fFloatValue || fFloatValue > 0.5f) {
                z = false;
                f = 1.0f;
                fetVar2.e0(-397549918);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-398030015);
                f = 1.0f;
                c(i4w0.U(k7n0.H(jm40Var, 1.0f), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, ((Number) t33Var.d()).floatValue() * (-180.0f), 0.0f, osm0.e(0.5f, 1.0f), null, false, 0L, 0L, 0, null, 1047487), (String) pz40Var.getValue(), vkqVar, fetVar2, 384, 0);
                z = false;
                fetVar2.r(false);
            }
            fetVar2.r(true);
            tj30 tj30VarC3 = zq8.c(zx7Var2, z);
            int iHashCode4 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM4 = fetVar2.m();
            mm40 mm40VarC3 = kbc.c0(fetVar2, jm40Var);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC3, shdVar);
            jpm0.o(fetVar2, bh90VarM4, shdVar2);
            vqd.u(iHashCode4, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC3, shdVar4);
            String str3 = (String) pz40Var.getValue();
            vkq vkqVar2 = vkq.b;
            c(null, str3, vkqVar2, fetVar2, 384, 1);
            float fFloatValue2 = ((Number) r11.d()).floatValue();
            if (0.49f > fFloatValue2 || fFloatValue2 > f) {
                str2 = str;
                fetVar2.e0(-1717024647);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-1717498978);
                str2 = str;
                c(i4w0.U(k7n0.H(jm40Var, f), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, (f - ((Number) t33Var.d()).floatValue()) * 180.0f, 0.0f, osm0.e(0.5f, 0.0f), null, false, 0L, 0L, 0, null, 1047487), str2, vkqVar2, fetVar2, i3, 0);
                fetVar2.r(false);
            }
            ohs0.x(fetVar2, true, true, true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new g0((byte) 2, i, str2);
        }
    }

    public static final void c(mm40 mm40Var, String str, vkq vkqVar, fet fetVar, int i, int i2) {
        mm40 mm40Var2;
        int i3;
        mm40 mm40Var3;
        mm40 mm40VarM;
        float f;
        fet fetVar2 = fetVar;
        fetVar2.g0(-67428923);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            mm40Var2 = mm40Var;
        } else if ((i & 6) == 0) {
            mm40Var2 = mm40Var;
            i3 = (fetVar2.g(mm40Var2) ? 4 : 2) | i;
        } else {
            mm40Var2 = mm40Var;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= fetVar2.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= fetVar2.e(vkqVar.ordinal()) ? 256 : 128;
        }
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40Var4 = i4 != 0 ? jm40Var : mm40Var2;
            float f2 = f10287a;
            float f3 = b;
            mm40 mm40VarJ = o7k0.j(mm40Var4, f2, f3);
            int iOrdinal = vkqVar.ordinal();
            if (iOrdinal == 0) {
                zcl zclVar = qmk.f28987a;
                mm40VarM = rq8.M(jm40Var, new da40((byte) 10));
            } else if (iOrdinal != 1) {
                t9f.b();
                return;
            } else {
                zcl zclVar2 = qmk.f28987a;
                mm40VarM = rq8.M(jm40Var, new da40((byte) 9));
            }
            mm40 mm40VarE = mm40VarJ.e(mm40VarM);
            zfn zfnVar = zaq0.b;
            mm40 mm40VarQ = i120.Q(mm40VarE, ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundGroup(), jd8.n);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarQ);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            enx enxVar = enx.f8115a;
            mm40 mm40VarE2 = q8a.s0(jm40Var).e(new anx(enx.f8115a, false));
            int iOrdinal2 = vkqVar.ordinal();
            if (iOrdinal2 == 0) {
                f = (f3 / 2.0f) + 1.0f;
            } else {
                if (iOrdinal2 != 1) {
                    t9f.b();
                    return;
                }
                f = (-(f3 / 2.0f)) - 1.0f;
            }
            mm40 mm40VarR = ffb0.R(mm40VarE2, 0.0f, f, 1);
            long secondary = ((ThemeColors) fetVar2.k(zfnVar)).getSecondary();
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str, mm40VarR, secondary, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.w(), fetVar2, (i3 >> 3) & 14, 0, 131064);
            fetVar2 = fetVar2;
            fetVar2.r(true);
            mm40Var3 = mm40Var4;
        } else {
            fetVar2.X();
            mm40Var3 = mm40Var2;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rn1(mm40Var3, (Object) str, (Object) vkqVar, i, i2, (byte) 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v12, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r4v13, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r4v14, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r4v16, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r4v18, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v9, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r5v15, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v2, types: [int] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [int] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [int] */
    public static final void d(int i, long j, fet fetVar, String str, Function0 function0) {
        ?? r4;
        ?? r0;
        float f;
        float f2;
        jm40 jm40Var;
        ?? r5;
        ?? r6;
        ?? r7;
        fetVar.g0(1791950749);
        int i2 = i | (fetVar.g(str) ? 4 : 2) | (fetVar.f(j) ? 32 : 16) | (fetVar.h(true) ? 256 : 128) | (fetVar.i(function0) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            pz40 pz40VarD0 = uc9.d0(j, function0, fetVar, ((i2 >> 3) & 14) | ((i2 >> 6) & 112));
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(2.0f, true, new jf4((byte) 14)), gqw0.k, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar, jm40Var2);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            fetVar.e0(901753360);
            String str2 = ((xnq0) pz40VarD0.getValue()).f41181a;
            if (str2 == null) {
                fetVar.e0(-2110416911);
                fetVar.r(false);
            } else {
                fetVar.e0(-2110416910);
                for (int i3 = 0; i3 < str2.length(); i3++) {
                    b(String.valueOf(str2.charAt(i3)), fetVar, 0);
                }
                fetVar.r(false);
            }
            fetVar.r(false);
            String str3 = ((xnq0) pz40VarD0.getValue()).f41181a;
            if (str3 == null || str3.length() == 0) {
                fet fetVar2 = fetVar;
                r0 = 0;
                f = 0.0f;
                f2 = 2.0f;
                jm40Var = jm40Var2;
                fetVar2.e0(-2109655519);
                fetVar2.r(false);
                r5 = fetVar2;
            } else {
                fetVar.e0(-2110239156);
                zcl zclVar2 = qmk.f28987a;
                mm40 mm40VarL = s5x0.L(o7k0.u(jm40Var2, 0.0f, 18.0f, 1), 2.0f, 0.0f, 2);
                ((g1t0) fetVar.k(j1t0.e)).getClass();
                f = 0.0f;
                jm40Var = jm40Var2;
                f2 = 2.0f;
                r0 = 0;
                v8q0.a(str, mm40VarL, ((ThemeColors) fetVar.k(zaq0.b)).getSecondary(), new n05(qmk.o, qmk.p, qmk.n), 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 1, 0, null, g1t0.i(), fetVar, i2 & 14, 24576, 113648);
                fet fetVar3 = fetVar;
                fetVar3.r(false);
                r5 = fetVar3;
            }
            r5.e0(901778856);
            ?? r8 = ((xnq0) pz40VarD0.getValue()).b;
            for (?? r9 = r0; r9 < r8.length(); r9++) {
                b(String.valueOf(r8.charAt(r9)), r5, r0);
            }
            r5.r(r0);
            if (((xnq0) pz40VarD0.getValue()).b.length() > 0) {
                r5.e0(-2109491281);
                zcl zclVar3 = qmk.f28987a;
                mm40 mm40VarL2 = s5x0.L(jm40Var, f2, f, 2);
                ((g1t0) r5.k(j1t0.e)).getClass();
                v8q0.a(Separators.COLON, mm40VarL2, ((ThemeColors) r5.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, g1t0.u(), fetVar, 6, 24576, 114680);
                ?? r10 = fetVar;
                r10.r(r0);
                r6 = r10;
            } else {
                r5.e0(-2109218047);
                r5.r(r0);
                r6 = r5;
            }
            r6.e0(901793032);
            ?? r11 = ((xnq0) pz40VarD0.getValue()).c;
            for (?? r12 = r0; r12 < r11.length(); r12++) {
                b(String.valueOf(r11.charAt(r12)), r6, r0);
            }
            r6.r(r0);
            if (((xnq0) pz40VarD0.getValue()).c.length() > 0) {
                r6.e0(-2109049841);
                zcl zclVar4 = qmk.f28987a;
                mm40 mm40VarL3 = s5x0.L(jm40Var, f2, f, 2);
                ((g1t0) r6.k(j1t0.e)).getClass();
                v8q0.a(Separators.COLON, mm40VarL3, ((ThemeColors) r6.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, g1t0.i(), fetVar, 6, 24576, 114680);
                ?? r13 = fetVar;
                r13.r(r0);
                r7 = r13;
            } else {
                r6.e0(-2108776607);
                r6.r(r0);
                r7 = r6;
            }
            r7.e0(901807272);
            ?? r1 = ((xnq0) pz40VarD0.getValue()).d;
            for (?? r14 = r0; r14 < r1.length(); r14++) {
                b(String.valueOf(r1.charAt(r14)), r7, r0);
            }
            r7.r(r0);
            r7.r(true);
            r4 = r7;
        } else {
            fet fetVar4 = fetVar;
            fetVar4.X();
            r4 = fetVar4;
        }
        yfe0 yfe0VarU = r4.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dx1(str, j, function0, i, (byte) 0);
        }
    }

    public static final void e(mm40 mm40Var, yrl yrlVar, Function0 function0, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        fetVar.g0(-1289167935);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(yrlVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function0) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.n, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            String str = yrlVar.f43127a;
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            y9q0 y9q0VarG = g1t0.g();
            fetVar.e0(-938613130);
            long textPrimary = ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary();
            fetVar.r(false);
            v8q0.a(str, null, textPrimary, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 3, 0, null, y9q0VarG, fetVar, 0, 24960, 109562);
            fetVar2 = fetVar;
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(-302576821, new bx1(yrlVar, function0, (byte) 0), fetVar2), fetVar2, 56);
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cx1(mm40Var, yrlVar, function0, i, (byte) 0);
        }
    }

    public static final void f(int i, fet fetVar, mm40 mm40Var) {
        int i2;
        fetVar.g0(-1182411678);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            fqj0 fqj0VarD0 = vbc.d0(null, fetVar, 0, 1);
            zcl zclVar = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.n, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(o7k0.s(o7k0.e(jm40Var, 12.0f), 128.0f), 1.0f);
            zcl zclVar2 = qmk.f;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarD), fqj0VarD0));
            dw9.x(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, o7k0.d(o7k0.s(o7k0.e(jm40Var, 40.0f), 304.0f), 1.0f)), fqj0VarD0, fetVar, 0, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new y30(mm40Var, i, (byte) 5);
        }
    }
}
