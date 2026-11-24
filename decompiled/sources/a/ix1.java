package a;

import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ix1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zsf f15518a = new zsf(0.0f, 0.0f, 0.58f, 0.0f);

    public static final void a(mm40 mm40Var, asl aslVar, Function0 function0, fet fetVar, int i) {
        int i2;
        function0.getClass();
        fetVar.g0(-88393831);
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
            fetVar.e0(952882492);
            c(mm40Var, (yrl) aslVar, function0, fetVar, i2 & 1022);
            fetVar.r(false);
        } else {
            if (!aslVar.equals(zrl.f44860a)) {
                throw b1j.f(952880312, fetVar, false);
            }
            fetVar.e0(952889358);
            d(i2 & 14, fetVar, mm40Var);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ax1(mm40Var, aslVar, function0, i, (byte) 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v19, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v1, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r8v2, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v2, types: [int] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [int] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [int] */
    public static final void b(int i, long j, fet fetVar, String str, Function0 function0) {
        ?? r8;
        int i2;
        ?? r0;
        float f;
        jm40 jm40Var;
        ?? r9;
        fet fetVar2 = fetVar;
        fetVar2.g0(201135491);
        int i3 = i | (fetVar.g(str) ? 4 : 2) | (fetVar2.f(j) ? 32 : 16) | (fetVar2.h(true) ? 256 : 128) | (fetVar2.i(function0) ? 2048 : 1024);
        if (fetVar2.U(i3 & 1, (i3 & 1171) != 1170)) {
            pz40 pz40VarD0 = uc9.d0(j, function0, fetVar2, ((i3 >> 6) & 112) | ((i3 >> 3) & 14));
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(2.0f, true, new jf4((byte) 14)), gqw0.l, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar2, jm40Var2);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            fetVar2.e0(-1154574704);
            String str2 = ((xnq0) pz40VarD0.getValue()).f41181a;
            if (str2 == null) {
                fetVar2.e0(-1432077455);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-1432077454);
                for (int i4 = 0; i4 < str2.length(); i4++) {
                    e(0, fetVar2, null, String.valueOf(str2.charAt(i4)));
                }
                fetVar2.r(false);
            }
            fetVar2.r(false);
            String str3 = ((xnq0) pz40VarD0.getValue()).f41181a;
            if (str3 == null || str3.length() == 0) {
                i2 = 2;
                r0 = 0;
                f = 0.0f;
                jm40Var = jm40Var2;
                fetVar2.e0(-1431176997);
                fetVar2.r(false);
                r9 = fetVar2;
            } else {
                fetVar2.e0(-1431871149);
                zcl zclVar2 = qmk.f28987a;
                mm40 mm40VarL = s5x0.L(o7k0.u(s5x0.N(jm40Var2, 0.0f, 0.0f, 0.0f, 6.0f, 7), 0.0f, 28.0f, 1), 2.0f, 0.0f, 2);
                String upperCase = str.toUpperCase(Locale.ROOT);
                upperCase.getClass();
                ((g1t0) fetVar2.k(j1t0.e)).getClass();
                i2 = 2;
                f = 0.0f;
                r0 = 0;
                jm40Var = jm40Var2;
                v8q0.a(upperCase, mm40VarL, ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary(), new n05(qmk.o, qmk.p, qmk.n), 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.b(), fetVar, 0, 24960, 109552);
                fet fetVar3 = fetVar;
                fetVar3.r(false);
                r9 = fetVar3;
            }
            String str4 = ((xnq0) pz40VarD0.getValue()).f41181a;
            if (str4 == null || str4.length() == 0) {
                r9.e0(-1430832773);
                r9.r(r0);
            } else {
                r9.e0(-1431095436);
                zcl zclVar3 = qmk.f28987a;
                jcb.H(o7k0.e(s5x0.L(jm40Var, 10.0f, f, i2), 40.0f), 2.0f, ((ThemeColors) r9.k(zaq0.b)).getSeparator60(), r9, 0, 0);
                r9.r(r0);
            }
            r9.e0(-1154533592);
            ?? r4 = ((xnq0) pz40VarD0.getValue()).b;
            for (?? r10 = r0; r10 < r4.length(); r10++) {
                e(r0, r9, null, String.valueOf(r4.charAt(r10)));
            }
            r9.r(r0);
            if (((xnq0) pz40VarD0.getValue()).b.length() > 0) {
                r9.e0(-1430643084);
                zcl zclVar4 = qmk.f28987a;
                jcb.H(o7k0.e(s5x0.L(jm40Var, 10.0f, f, i2), 40.0f), 2.0f, ((ThemeColors) r9.k(zaq0.b)).getSeparator60(), r9, 0, 0);
                r9.r(r0);
            } else {
                r9.e0(-1430380421);
                r9.r(r0);
            }
            r9.e0(-1154518936);
            ?? r5 = ((xnq0) pz40VarD0.getValue()).c;
            for (?? r11 = r0; r11 < r5.length(); r11++) {
                e(r0, r9, null, String.valueOf(r5.charAt(r11)));
            }
            r9.r(r0);
            if (((xnq0) pz40VarD0.getValue()).c.length() > 0) {
                r9.e0(-1430186764);
                zcl zclVar5 = qmk.f28987a;
                jcb.H(o7k0.e(s5x0.L(jm40Var, 10.0f, f, i2), 40.0f), 2.0f, ((ThemeColors) r9.k(zaq0.b)).getSeparator60(), r9, 0, 0);
                r9.r(r0);
            } else {
                r9.e0(-1429924101);
                r9.r(r0);
            }
            r9.e0(-1154504216);
            ?? r1 = ((xnq0) pz40VarD0.getValue()).d;
            for (?? r12 = r0; r12 < r1.length(); r12++) {
                e(r0, r9, null, String.valueOf(r1.charAt(r12)));
            }
            r9.r(r0);
            r9.r(true);
            r8 = r9;
        } else {
            fetVar2.X();
            r8 = fetVar2;
        }
        yfe0 yfe0VarU = r8.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dx1(str, j, function0, i, (byte) 2);
        }
    }

    public static final void c(mm40 mm40Var, yrl yrlVar, Function0 function0, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        fetVar.g0(-441826803);
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
            x5d x5dVarA = w5d.a(new qw3(10.0f, true, new jf4((byte) 14)), gqw0.n, fetVar, 48);
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
            fetVar.e0(-1184868370);
            long textPrimary = ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary();
            fetVar.r(false);
            v8q0.a(str, null, textPrimary, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 3, 0, null, y9q0VarG, fetVar, 0, 24960, 109562);
            fetVar2 = fetVar;
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(-1960530877, new bx1(yrlVar, function0, (byte) 2), fetVar2), fetVar2, 56);
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cx1(mm40Var, yrlVar, function0, i, (byte) 2);
        }
    }

    public static final void d(int i, fet fetVar, mm40 mm40Var) {
        int i2;
        fetVar.g0(-1366051538);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            fqj0 fqj0VarD0 = vbc.d0(null, fetVar, 0, 1);
            zcl zclVar = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(10.0f, true, new jf4((byte) 14)), gqw0.n, fetVar, 48);
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
            dw9.x(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, o7k0.d(o7k0.s(o7k0.e(jm40Var, 52.0f), 304.0f), 1.0f)), fqj0VarD0, fetVar, 0, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new y30(mm40Var, i, (byte) 7);
        }
    }

    public static final void e(int i, fet fetVar, mm40 mm40Var, String str) {
        mm40 mm40Var2;
        fetVar.g0(-1540808809);
        int i2 = i | 6 | (fetVar.g(str) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new dj1((byte) 10);
                fetVar.o0(objP);
            }
            ugd ugdVar = f1t0.f8782a;
            int i3 = ((i2 >> 3) & 14) | 1573296;
            mm40Var2 = jm40.b;
            ay3.f(str, mm40Var2, (Function1) objP, null, null, null, ugdVar, fetVar, i3, 56);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hx1(mm40Var2, str, i, (byte) 0);
        }
    }
}
