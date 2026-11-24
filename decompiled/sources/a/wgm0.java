package a;

import android.gov.nist.core.Separators;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes4.dex */
public abstract class wgm0 {
    public static final void a(mm40 mm40Var, zct0 zct0Var, Function0 function0, fet fetVar, int i) {
        int i2;
        fetVar.g0(-1599222201);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(zct0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function0) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            jiq0.y(mm40Var, zct0Var.f44181a, function0, null, null, fetVar, i2 & 910, 24);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new s0n0(mm40Var, zct0Var, function0, i, (byte) 19);
        }
    }

    public static final void b(int i, fet fetVar, mm40 mm40Var, String str) {
        String str2;
        fetVar.g0(1162519565);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(str) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            str2 = str;
            v8q0.a(str2, mm40Var, 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, ibm0.n(g1t0.g(), fetVar), fetVar, ((i2 >> 3) & 14) | ((i2 << 3) & 112), 24960, 110588);
        } else {
            str2 = str;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cgp0(mm40Var, str2, i, (byte) 5);
        }
    }

    public static final void c(int i, fet fetVar, mm40 mm40Var, String str) {
        fet fetVar2;
        mm40 mm40Var2;
        String str2;
        fetVar.g0(-1110622078);
        byte b = 4;
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(str) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            fetVar2 = fetVar;
            mm40Var2 = mm40Var;
            str2 = str;
            j6n.h(str2, hro0.f13541a, mm40Var2, 0, 0, fetVar2, ((i2 >> 3) & 14) | 48 | ((i2 << 6) & 896), 24);
        } else {
            fetVar2 = fetVar;
            mm40Var2 = mm40Var;
            str2 = str;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cgp0(mm40Var2, str2, i, b);
        }
    }

    public static final void d(int i, fet fetVar, mm40 mm40Var) {
        int i2;
        fetVar.g0(1955528744);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 64.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            qxw.o(fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new v2w(mm40Var, i, (byte) 28);
        }
    }

    public static final void e(int i, int i2, fet fetVar, mm40 mm40Var, String str) {
        mm40 mm40Var2;
        fetVar.g0(-467115356);
        int i3 = i2 | 6 | (fetVar.g(str) ? 32 : 16) | (fetVar.e(i) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            int i4 = i3 >> 3;
            s4u0 s4u0VarR = iom0.r(jpm0.t(i, (i4 & 112) | 6, fetVar), fetVar);
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            int i5 = (i4 & 14) | 36912;
            mm40Var2 = jm40Var;
            k7x.b(str, null, o7k0.n(jm40Var, 16.0f), s4u0VarR, s4u0VarR, null, null, null, null, null, null, new m78(((ThemeColors) fetVar.k(zaq0.b)).getSecondary(), 5), fetVar, i5, 0, 28640);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cx(mm40Var2, str, i, i2, (byte) 23);
        }
    }

    public static final void f(mm40 mm40Var, ear0 ear0Var, fet fetVar, int i) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        ear0Var.getClass();
        fetVar2.g0(587854118);
        int i2 = i | 6 | (fetVar2.g(ear0Var) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarD);
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
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarU = o7k0.u(s5x0.N(jm40Var, 16.0f, 0.0f, 0.0f, 0.0f, 14), 44.0f, 0.0f, 2);
            String str = ear0Var.f7482a;
            pz40 pz40Var = s6t0.f31722a;
            v8q0.a(str, mm40VarU, s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.j(), fetVar, 0, 0, 131064);
            v8q0.a(ear0Var.b, s5x0.L(s5x0.N(new x7z(1.0f, true), 8.0f, 0.0f, 28.0f, 0.0f, 10), 0.0f, 14.0f, 1), s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.k(), fetVar, 0, 0, 131064);
            fetVar2 = fetVar;
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o3m0(mm40Var2, ear0Var, i, (byte) 8);
        }
    }

    public static final void g(mm40 mm40Var, String str, q7q0 q7q0Var, boolean z, int i, fet fetVar, int i2) {
        mm40 mm40Var2;
        int i3;
        long jM130getWhite600d7_KjU;
        long warning;
        fetVar.g0(130317818);
        if ((i2 & 6) == 0) {
            mm40Var2 = mm40Var;
            i3 = (fetVar.g(mm40Var2) ? 4 : 2) | i2;
        } else {
            mm40Var2 = mm40Var;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(q7q0Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.h(z) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.e(i) ? 16384 : 8192;
        }
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            boolean z2 = (i3 & 896) == 256;
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = Boolean.valueOf(Intrinsics.d(q7q0Var, q7q0.f28265a));
                fetVar.o0(objP);
            }
            if (((Boolean) objP).booleanValue()) {
                fetVar.e0(681383459);
                jM130getWhite600d7_KjU = afn0.m(fetVar).getSecondary();
            } else {
                fetVar.e0(681384705);
                jM130getWhite600d7_KjU = afn0.p(fetVar).m130getWhite600d7_KjU();
            }
            fetVar.r(false);
            l7m0 l7m0VarB = m5k0.b(jM130getWhite600d7_KjU, null, fetVar, 0, 14);
            if (z) {
                fetVar.e0(681387681);
                warning = afn0.m(fetVar).getWarning();
                fetVar.r(false);
            } else {
                fetVar.e0(681388104);
                fetVar.r(false);
                warning = ((y3d) l7m0VarB.getValue()).f41946a;
            }
            l7m0 l7m0VarB2 = m5k0.b(warning, null, fetVar, 0, 14);
            v8q0.a(str, o2e.e0(s5x0.N(mm40Var2, 4.0f, 4.0f, 0.0f, 0.0f, 12), "SUPPORTING_TEXT_TAG"), ((y3d) l7m0VarB2.getValue()).f41946a, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, y9q0.a(new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), 0L, 0L, null, null, null, 0L, null, null, 0, i, 0L, null, null, 16711679), fetVar, (i3 >> 3) & 14, 0, 131064);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hsh0(mm40Var, str, q7q0Var, z, i, i2);
        }
    }

    public static final void h(mm40 mm40Var, t7q0 t7q0Var, q7q0 q7q0Var, boolean z, a7n a7nVar, fet fetVar, int i) {
        t7q0Var.getClass();
        q7q0Var.getClass();
        fetVar.g0(1621672005);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(t7q0Var) ? 32 : 16);
        if ((i & 384) == 0) {
            i2 |= fetVar.g(q7q0Var) ? 256 : 128;
        }
        int i3 = i2 | (fetVar.h(false) ? 2048 : 1024) | (fetVar.h(z) ? 16384 : 8192) | (fetVar.e(a7nVar == null ? -1 : a7nVar.ordinal()) ? 131072 : 65536);
        if (fetVar.U(i3 & 1, (74899 & i3) != 74898)) {
            boolean z2 = (i3 & 896) == 256;
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = Boolean.valueOf(q7q0Var.equals(q7q0.f28265a));
                fetVar.o0(objP);
            }
            ((Boolean) objP).getClass();
            int iA = a7nVar.a((k6z) fetVar.k(bmd.n));
            fetVar.e0(1439479566);
            if (t7q0Var instanceof r7q0) {
                fetVar.e0(-646301047);
                fetVar.r(false);
            } else {
                if (!(t7q0Var instanceof s7q0)) {
                    throw b1j.f(-646301836, fetVar, false);
                }
                fetVar.e0(1439594328);
                g(mm40Var, ((s7q0) t7q0Var).f31763a, q7q0Var, z, iA, fetVar, (i3 & 910) | ((i3 >> 3) & 7168));
                fetVar.r(false);
            }
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new iln0((byte) 0, i, mm40Var, t7q0Var, q7q0Var, a7nVar, z);
        }
    }

    public static final void i(mm40 mm40Var, r020 r020Var, boolean z, Function1 function1, fet fetVar, int i) {
        function1.getClass();
        fetVar.g0(-32332416);
        int i2 = i | (fetVar.g(r020Var) ? 32 : 16) | (fetVar.h(z) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            nnw0.g(null, null, false, u1c.M(698629590, new gg00(r020Var, mm40Var, z, function1, (byte) 1), fetVar), fetVar, 3072, 7);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hg00(mm40Var, r020Var, z, function1, i, (byte) 1);
        }
    }

    public static final void j(dap0 dap0Var, qdz qdzVar, Function1 function1, fet fetVar, int i) {
        qdzVar.getClass();
        function1.getClass();
        zcl zclVar = qmk.f28987a;
        boolean z = true;
        mm40 mm40VarL = s5x0.L(jm40.b, 0.0f, 8.0f, 1);
        vb90 vb90Var = dap0Var.b;
        xcz xczVarB = qdzVar.b(dap0Var.f5762a, new ofo0((byte) 23), fetVar, i & 896);
        lh80 lh80VarT = s5x0.t(xfn.a(fetVar).c, 0.0f, 2);
        if ((((i & 7168) ^ 3072) <= 2048 || !fetVar.g(function1)) && (i & 3072) != 2048) {
            z = false;
        }
        Object objP = fetVar.P();
        if (z || objP == ukd.f35823a) {
            objP = new coo0(function1, (byte) 4);
            fetVar.o0(objP);
        }
        zvw.k(mm40VarL, vb90Var, false, xczVarB, lh80VarT, (Function1) objP, fetVar, 384, 0);
    }

    public static final void k(mm40 mm40Var, c280 c280Var, d280 d280Var, String str, fet fetVar, int i) {
        mm40 mm40Var2;
        fetVar.g0(1809493805);
        int i2 = i | 6 | (fetVar.g(c280Var) ? 32 : 16) | (fetVar.g(d280Var) ? 256 : 128) | (fetVar.g(str) ? 2048 : 1024);
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            yx7 yx7Var = gqw0.k;
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = o7k0.e(jm40Var, 16.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, yx7Var, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE);
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
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (z || objP == obj) {
                objP = new u6n(d4d.SECONDARY60, w6n.l, c280Var);
                fetVar.o0(objP);
            }
            u6n u6nVar = (u6n) objP;
            boolean zG = fetVar.g(u6nVar);
            Object objP2 = fetVar.P();
            if (zG || objP2 == obj) {
                objP2 = new d1n(u6nVar, b);
                fetVar.o0(objP2);
            }
            kkb.p(1, fetVar, null, (Function0) objP2);
            if (d280Var != null) {
                fetVar.e0(-1279557522);
                boolean z2 = (i2 & 896) == 256;
                Object objP3 = fetVar.P();
                if (z2 || objP3 == obj) {
                    objP3 = new u6n(d4d.SECONDARY60, w6n.l, d280Var);
                    fetVar.o0(objP3);
                }
                u6n u6nVar2 = (u6n) objP3;
                mm40 mm40VarN = s5x0.N(jm40Var, 2.0f, 0.0f, 0.0f, 0.0f, 14);
                boolean zG2 = fetVar.g(u6nVar2);
                Object objP4 = fetVar.P();
                if (zG2 || objP4 == obj) {
                    objP4 = new d1n(u6nVar2, b);
                    fetVar.o0(objP4);
                }
                kkb.p(0, fetVar, mm40VarN, (Function0) objP4);
                fetVar.r(false);
            } else {
                fetVar.e0(-1279147175);
                fetVar.r(false);
            }
            v8q0.a(str, dw9.h(1.0f, s5x0.N(jm40Var, 6.0f, 0.0f, 0.0f, 0.0f, 14), true), ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar, (i2 >> 9) & 14, 24960, 110584);
            fetVar.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new stl0((byte) 24, i, mm40Var2, c280Var, d280Var, str);
        }
    }

    public static final void l(int i, fet fetVar, a4x a4xVar, mm40 mm40Var) {
        a4xVar.getClass();
        fetVar.g0(-1432097442);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(a4xVar) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarE0 = o2e.e0(mm40Var, "TEAMS_COLUMN");
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE0);
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
            Iterator itO = h97.o(fetVar, mm40VarC0, gqw0.v, -462767346, a4xVar);
            while (itO.hasNext()) {
                m4m0 m4m0Var = (m4m0) itO.next();
                if (m4m0Var != null) {
                    if (m4m0Var instanceof k4m0) {
                        fetVar.e0(-1273404947);
                        o5n0.e((k4m0) m4m0Var, fetVar, 0);
                        fetVar.r(false);
                    } else if (m4m0Var instanceof l4m0) {
                        fetVar.e0(-1273402546);
                        dnm0.g((l4m0) m4m0Var, fetVar, 0);
                        fetVar.r(false);
                    }
                }
                throw b1j.f(-1273407151, fetVar, false);
            }
            fetVar.r(false);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zw1(mm40Var, a4xVar, i, (byte) 25);
        }
    }

    public static final void m(mm40 mm40Var, d8r0 d8r0Var, Function0 function0, fet fetVar, int i) {
        mm40 mm40Var2;
        wbs0 wbs0Var = d8r0Var.f;
        function0.getClass();
        fetVar.g0(550637732);
        int i2 = i | 6 | (fetVar.g(d8r0Var) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = o7k0.e(jm40Var, 30.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE);
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
            if (d8r0Var.b) {
                fetVar.e0(-809846457);
                c(0, fetVar, s5x0.N(jm40Var, 0.0f, 0.0f, 6.0f, 0.0f, 11), d8r0Var.d);
                fetVar.r(false);
            } else {
                fetVar.e0(-809735942);
                fetVar.r(false);
            }
            e(d8r0Var.g, 0, fetVar, null, d8r0Var.c);
            b(0, fetVar, dw9.h(1.0f, s5x0.N(jm40Var, 4.0f, 0.0f, 0.0f, 0.0f, 14), true), d8r0Var.e);
            if (wbs0Var != wbs0.IS_NOT_VISIBLE) {
                fetVar.e0(-809292332);
                n(s5x0.N(jm40Var, 6.0f, 0.0f, 0.0f, 0.0f, 14), wbs0Var, function0, fetVar, i2 & 896);
                fetVar.r(false);
            } else {
                fetVar.e0(-809040550);
                fetVar.r(false);
            }
            fetVar.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cgm0(mm40Var2, d8r0Var, function0, i, (byte) 24);
        }
    }

    public static final void n(mm40 mm40Var, wbs0 wbs0Var, Function0 function0, fet fetVar, int i) {
        int i2;
        wbs0 wbs0Var2;
        fetVar.g0(579163830);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        byte b = 16;
        if ((i & 48) == 0) {
            i2 |= fetVar.e(wbs0Var.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function0) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = o7k0.n(mm40Var, 20.0f);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = dw9.j(fetVar);
            }
            gy40 gy40Var = (gy40) objP;
            boolean z = (i2 & 896) == 256;
            Object objP2 = fetVar.P();
            if (z || objP2 == cl5Var) {
                objP2 = new xhl0(function0, b);
                fetVar.o0(objP2);
            }
            mm40 mm40VarW = y860.W(mm40VarN, gy40Var, null, false, null, (Function0) objP2, 28);
            wbs0Var2 = wbs0Var;
            dww.c(iom0.r(jpm0.t(wbs0Var2.f38895a, 6, fetVar), fetVar), null, mm40VarW, ((ThemeColors) fetVar.k(zaq0.b)).getPrimary(), fetVar, 56, 0);
        } else {
            wbs0Var2 = wbs0Var;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eur(mm40Var, wbs0Var2, function0, i, (byte) 1);
        }
    }

    public static final void o(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(-1018439770);
        int i2 = 2;
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            tj30 tj30VarC = zq8.c(gqw0.e, false);
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
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(jm40.b, 0.0f, 24.0f, 0.0f, 0.0f, 13);
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                ycl yclVar = new ycl(32.0f);
                pz40 pz40Var = s6t0.f31722a;
                objP = new dkm(yclVar, new y3d(s6t0.b().f33626a.getSecondary60()), i2);
                fetVar.o0(objP);
            }
            kpb.j(mm40VarN, (dkm) objP, fetVar, 48, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cpl0(mm40Var, i, (byte) 26);
        }
    }

    public static final void p(mm40 mm40Var, dxs0 dxs0Var, fet fetVar, int i) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(1260308193);
        int i2 = i | 6 | (fetVar2.g(dxs0Var) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = s5x0.J(mm40VarD, 8.0f);
            byte b = 14;
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4(b)), gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarJ);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar2, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            x7z x7zVarI = ohs0.i(fetVar2, mm40VarC0, shdVar4, 1.0f, true);
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4(b)), gqw0.m, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, x7zVarI);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            fxs0 fxs0Var = dxs0Var.f6862a;
            k(null, fxs0Var.b, fxs0Var.c, fxs0Var.f10326a, fetVar2, 0);
            fxs0 fxs0Var2 = dxs0Var.b;
            k(null, fxs0Var2.b, fxs0Var2.c, fxs0Var2.f10326a, fetVar, 0);
            fetVar.r(true);
            v8q0.a(dxs0Var.c, o7k0.u(jm40Var, 0.0f, 128.0f, 1), 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, ibm0.n(new y9q0(0L, qmk.p, null, j1t0.c, 0L, null, 0, 0, qmk.C, 16646109), fetVar), fetVar, 0, 24960, 110588);
            fetVar2 = fetVar;
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new htr0(mm40Var2, dxs0Var, i, (byte) 17);
        }
    }

    public static final void q(mm40 mm40Var, bdt0 bdt0Var, Function0 function0, fet fetVar, int i) {
        int i2;
        function0.getClass();
        fetVar.g0(1160466932);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(bdt0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function0) ? 256 : 128;
        }
        if (!fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            fetVar.X();
        } else if (bdt0Var instanceof zct0) {
            fetVar.e0(1278821997);
            a(mm40Var, (zct0) bdt0Var, function0, fetVar, i2 & 1022);
            fetVar.r(false);
        } else {
            if (!bdt0Var.equals(adt0.f697a)) {
                throw b1j.f(-1482770373, fetVar, false);
            }
            fetVar.e0(1279027589);
            d(i2 & 14, fetVar, mm40Var);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new s0n0(mm40Var, bdt0Var, function0, i, (byte) 18);
        }
    }

    public static final void r(View view, ViewGroup viewGroup, int i, int i2) {
        viewGroup.getClass();
        if (view.isAttachedToWindow()) {
            viewGroup.post(new iwr0(view, viewGroup, i, i2, (byte) 0));
        } else {
            view.addOnAttachStateChangeListener(new hwr0(view, viewGroup, view, i, i2, (byte) 0));
        }
    }

    public static final String s(Throwable th) {
        th.getClass();
        String stackTraceString = Log.getStackTraceString(th);
        stackTraceString.getClass();
        List listSplit$default = StringsKt__StringsKt.split$default(stackTraceString, new String[]{Separators.RETURN}, false, 0, 6, null);
        return listSplit$default.size() < 3 ? listSplit$default.toString() : listSplit$default.subList(0, 2).toString();
    }

    public static final void t(View view, ConstraintLayout constraintLayout, int i, int i2) {
        Object g0g0Var;
        Object g0g0Var2;
        Object obj = 0;
        view.getClass();
        constraintLayout.getClass();
        try {
            e0g0 e0g0Var = j0g0.b;
            g0g0Var = Integer.valueOf(view.getResources().getDimensionPixelOffset(i));
        } catch (Throwable th) {
            e0g0 e0g0Var2 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        if (j0g0.a(g0g0Var) != null) {
            g0g0Var = obj;
        }
        int iIntValue = ((Number) g0g0Var).intValue();
        try {
            g0g0Var2 = Integer.valueOf(view.getResources().getDimensionPixelOffset(i2));
        } catch (Throwable th2) {
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var2 = new g0g0(th2);
        }
        int iIntValue2 = ((Number) (j0g0.a(g0g0Var2) == null ? g0g0Var2 : 0)).intValue();
        if (view.isAttachedToWindow()) {
            constraintLayout.post(new iwr0(view, constraintLayout, iIntValue, iIntValue2, (byte) 1));
        } else {
            view.addOnAttachStateChangeListener(new hwr0(view, constraintLayout, view, iIntValue, iIntValue2, (byte) 1));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r15v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v9, types: [a.iun] */
    public static final w0u0 u(a1u0 a1u0Var) {
        ArrayList arrayList;
        ?? arrayList2;
        ?? arrayList3;
        Integer num = a1u0Var.f91a;
        int i = -1;
        int iIntValue = num != null ? num.intValue() : -1;
        Long l = a1u0Var.b;
        long jLongValue = l != null ? l.longValue() : -1L;
        Boolean bool = a1u0Var.c;
        boolean z = false;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        h1u0 h1u0Var = a1u0Var.d;
        b1u0 b1u0VarE = h1u0Var != null ? hhm0.E(h1u0Var) : new b1u0(-1, -1L, "", "", iun.f15405a);
        h1u0 h1u0Var2 = a1u0Var.e;
        b1u0 b1u0VarE2 = h1u0Var2 != null ? hhm0.E(h1u0Var2) : new b1u0(-1, -1L, "", "", iun.f15405a);
        List<n0u0> list = a1u0Var.j;
        if (list != null) {
            arrayList = new ArrayList(r3d.q(list, 10));
            for (n0u0 n0u0Var : list) {
                n0u0Var.getClass();
                String str = n0u0Var.f22719a;
                if (str == null) {
                    str = "";
                }
                v0u0 v0u0Var = n0u0Var.b;
                o0u0 o0u0VarU = v0u0Var != null ? ghm0.u(v0u0Var) : new o0u0(i, iun.f15405a, z);
                v0u0 v0u0Var2 = n0u0Var.c;
                o0u0 o0u0VarU2 = v0u0Var2 != null ? ghm0.u(v0u0Var2) : new o0u0(i, iun.f15405a, z);
                List<j0u0> list2 = n0u0Var.d;
                if (list2 != null) {
                    arrayList3 = new ArrayList(r3d.q(list2, 10));
                    for (j0u0 j0u0Var : list2) {
                        j0u0Var.getClass();
                        boolean z2 = zBooleanValue;
                        Integer num2 = j0u0Var.f15699a;
                        int iIntValue2 = num2 != null ? num2.intValue() : 0;
                        Integer num3 = j0u0Var.b;
                        arrayList3.add(new oxt0(iIntValue2, num3 != null ? num3.intValue() : 0));
                        zBooleanValue = z2;
                    }
                } else {
                    arrayList3 = 0;
                }
                boolean z3 = zBooleanValue;
                if (arrayList3 == 0) {
                    arrayList3 = iun.f15405a;
                }
                arrayList.add(new k0u0(str, o0u0VarU, o0u0VarU2, arrayList3));
                zBooleanValue = z3;
                i = -1;
                z = false;
            }
        } else {
            arrayList = null;
        }
        boolean z4 = zBooleanValue;
        List list3 = arrayList;
        if (arrayList == null) {
            list3 = iun.f15405a;
        }
        List<y1u0> list4 = a1u0Var.k;
        if (list4 != null) {
            arrayList2 = new ArrayList(r3d.q(list4, 10));
            for (y1u0 y1u0Var : list4) {
                y1u0Var.getClass();
                Long l2 = y1u0Var.f41878a;
                long jLongValue2 = l2 != null ? l2.longValue() : -1L;
                Integer num4 = y1u0Var.b;
                int iIntValue3 = num4 != null ? num4.intValue() : -1;
                Integer num5 = y1u0Var.c;
                int iIntValue4 = num5 != null ? num5.intValue() : -1;
                Integer num6 = y1u0Var.d;
                int iIntValue5 = num6 != null ? num6.intValue() : -1;
                Long l3 = y1u0Var.e;
                long jLongValue3 = l3 != null ? l3.longValue() : -1L;
                Float f = y1u0Var.f;
                arrayList2.add(new v1u0(jLongValue2, iIntValue3, iIntValue4, iIntValue5, jLongValue3, f != null ? f.floatValue() : -1.0f));
            }
        } else {
            arrayList2 = 0;
        }
        if (arrayList2 == 0) {
            arrayList2 = iun.f15405a;
        }
        return new w0u0(iIntValue, jLongValue, z4, b1u0VarE, b1u0VarE2, list3, arrayList2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.ArrayList] */
    public static final oru0 v(rru0 rru0Var) {
        ?? arrayList;
        rru0Var.getClass();
        Integer num = rru0Var.f31003a;
        int iIntValue = num != null ? num.intValue() : 0;
        String str = rru0Var.b;
        String str2 = str == null ? "" : str;
        String str3 = rru0Var.c;
        if (str3 != null) {
            str = str3;
        }
        if (str == null) {
            str = "";
        }
        List<lqu0> list = rru0Var.d;
        if (list != null) {
            arrayList = new ArrayList(r3d.q(list, 10));
            for (lqu0 lqu0Var : list) {
                Integer num2 = lqu0Var.f20501a;
                int iIntValue2 = num2 != null ? num2.intValue() : 0;
                String str4 = lqu0Var.b;
                if (str4 == null) {
                    str4 = "";
                }
                arrayList.add(new iqu0(iIntValue2, str4));
            }
        } else {
            arrayList = iun.f15405a;
        }
        return new oru0(iIntValue, str2, str, arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final b2o0 w(d0t d0tVar, ctf0 ctf0Var, m5l0 m5l0Var, v5l0 v5l0Var, String str, String str2, List list, boolean z, boolean z2, boolean z3, boolean z4) {
        b2o0 w1o0Var;
        boolean z5;
        d0tVar.getClass();
        Date date = d0tVar.P;
        String str3 = d0tVar.c;
        long j = d0tVar.v;
        ctf0Var.getClass();
        list.getClass();
        str.getClass();
        v5l0Var.getClass();
        str2.getClass();
        int iOrdinal = v5l0Var.ordinal();
        Object d2iVar = null;
        if (iOrdinal == 0) {
            w1o0Var = new w1o0(d0tVar.f5282a, ibm0.u(d0tVar, str, str2, list, z2, z3, z4, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z)), new e4o0(new pws0(qzb.c0(d0tVar), kbc.U(d0tVar)), new pws0(qzb.r0(d0tVar), kbc.V(d0tVar)), new lpm(opm.f25648a, new hpm(0L, 3)), qzb.B0(d0tVar) ? new p0n(kpb.q0(d0tVar), fgm.b, date.getTime(), false, 24) : null, j == 40 ? str3 : kpb.X(d0tVar)), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
        } else if (iOrdinal == 1) {
            w1o0Var = new a2o0(d0tVar.f5282a, ibm0.y(d0tVar, str, list, z2, z3, str2, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z)), new k5o0(new qws0(qzb.c0(d0tVar)), new qws0(qzb.r0(d0tVar)), qzb.B0(d0tVar) ? new p0n(kpb.q0(d0tVar), fgm.b, date.getTime(), false, 24) : null, j == 40 ? str3 : kpb.X(d0tVar), pem.f26861a), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
        } else if (iOrdinal != 2) {
            c2m c2mVar = c2m.f3631a;
            if (iOrdinal == 3) {
                String strX = str3;
                z5 = j == 40;
                long j2 = d0tVar.f5282a;
                n0x n0xVar = new n0x(dtb.F(str));
                if (!z5) {
                    strX = kpb.X(d0tVar);
                }
                w1o0Var = new y1o0(j2, ibm0.w(d0tVar, str, strX, list, z2, z3, qzb.B0(d0tVar), str2, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z)), new u4o0(new sws0(qzb.c0(d0tVar), kbc.U(d0tVar)), new sws0(qzb.r0(d0tVar), kbc.V(d0tVar)), new z1m(c2mVar)), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var), n0xVar);
            } else {
                if (iOrdinal != 4) {
                    t9f.b();
                    return null;
                }
                w1o0Var = new x1o0(d0tVar.f5282a, ibm0.v(d0tVar, str, str2, list, z2, z3, z4, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z)), new m4o0(new z1m(c2mVar), qzb.B0(d0tVar) ? new p0n(kpb.q0(d0tVar), fgm.b, date.getTime(), false, 24) : null, new tws0(qzb.c0(d0tVar), kbc.U(d0tVar)), new tws0(qzb.r0(d0tVar), kbc.V(d0tVar)), j == 40 ? str3 : kpb.X(d0tVar)), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
            }
        } else {
            long j3 = d0tVar.f5282a;
            k4i k4iVarX = ibm0.x(d0tVar, str, list, z2, z3, str2, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z));
            z5 = j == 40;
            rws0 rws0Var = new rws0(qzb.c0(d0tVar), kbc.U(d0tVar));
            rws0 rws0Var2 = new rws0(qzb.r0(d0tVar), kbc.V(d0tVar));
            p0n p0nVar = qzb.B0(d0tVar) ? new p0n(kpb.q0(d0tVar), fgm.b, date.getTime(), false, 24) : null;
            String strX2 = z5 ? str3 : kpb.X(d0tVar);
            if (d0tVar.S && z4) {
                d2iVar = new d2i();
            }
            w1o0Var = new z1o0(j3, k4iVarX, new c5o0(d2iVar, p0nVar, rws0Var, rws0Var2, strX2), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
        }
        return w1o0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void x(int i, View view, ViewParent viewParent) {
        view.getClass();
        viewParent.getClass();
        if (view.isAttachedToWindow()) {
            ((View) viewParent).post(new le3(i, view, viewParent));
        } else {
            view.addOnAttachStateChangeListener(new jwr0(view, viewParent, view, i));
        }
    }

    public static String z() {
        Locale locale = Locale.getDefault();
        StringBuilder sb = new StringBuilder();
        String language = locale.getLanguage();
        if (language != null) {
            sb.append(language);
            String country = locale.getCountry();
            if (country != null) {
                sb.append("-");
                sb.append(country);
            }
        }
        Locale locale2 = Locale.US;
        if (!locale.equals(locale2)) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            String language2 = locale2.getLanguage();
            if (language2 != null) {
                sb.append(language2);
                String country2 = locale2.getCountry();
                if (country2 != null) {
                    sb.append("-");
                    sb.append(country2);
                }
            }
        }
        return sb.toString();
    }

    public vgx0 A(int i) {
        throw new IndexOutOfBoundsException("cannot read from empty metadata");
    }

    public Object B(int i) {
        throw new IndexOutOfBoundsException("cannot read from empty metadata");
    }

    public Object C(vgx0 vgx0Var) {
        return null;
    }

    public int y() {
        return 0;
    }
}
