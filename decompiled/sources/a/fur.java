package a;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes3.dex */
public abstract class fur {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zai0 f10178a = new zai0("TrackStateKey");

    public static final void a(mm40 mm40Var, c0s c0sVar, Function0 function0, Function0 function1, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        function0.getClass();
        function1.getClass();
        fetVar2.g0(-253692270);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(c0sVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.i(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar2.i(function1) ? 2048 : 1024;
        }
        if (fetVar2.U(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z = c0sVar.d != wbs0.IS_NOT_VISIBLE;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarG = o7k0.g(mm40Var, 44.0f, 0.0f, 2);
            long jM125getWhite100d7_KjU = StaticColors.INSTANCE.m125getWhite100d7_KjU();
            zcl zclVar2 = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarM = s5x0.M(i120.Q(mm40VarG, jM125getWhite100d7_KjU, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 8.0f, 6.0f, z ? 4.0f : 10.0f, 6.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarM);
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
            if (0.5f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            int i3 = i2 << 3;
            b(new x7z(0.5f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.5f, true), c0sVar.f3538a, c0sVar.b, c0sVar.e, function1, fetVar2, i3 & 57344);
            if (0.5f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            c(new x7z(0.5f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.5f, true), c0sVar.c, c0sVar.d, function0, fetVar, i3 & 7168);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vho((byte) 5, i, mm40Var, c0sVar, function0, function1);
        }
    }

    public static final void b(mm40 mm40Var, hy20 hy20Var, s5n0 s5n0Var, kho khoVar, Function0 function0, fet fetVar, int i) {
        int i2;
        fetVar.g0(-699187012);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(hy20Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(s5n0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(khoVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(function0) ? 16384 : 8192;
        }
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
            if (khoVar instanceof jho) {
                fetVar.e0(-823250486);
                zdx.h(null, ((jho) khoVar).f16538a, function0, fetVar, (i2 >> 6) & 896);
                fetVar.r(false);
            } else {
                fetVar.e0(-823079428);
                fetVar.r(false);
            }
            jm40 jm40Var = jm40.b;
            u7x.e(6, fetVar, o7k0.d(jm40Var, 1.0f), hy20Var.f13841a);
            zcl zclVar = qmk.f28987a;
            d(s5x0.N(jm40Var, 0.0f, 2.0f, 0.0f, 0.0f, 13), s5n0Var, fetVar, (i2 >> 3) & 112);
            if (khoVar instanceof hho) {
                fetVar.e0(-822695586);
                jd8.g(s5x0.N(jm40Var, 0.0f, 2.0f, 0.0f, 0.0f, 13), ((hho) khoVar).f13074a, b15.f1791a, fetVar, 384);
                fetVar.r(false);
            } else {
                fetVar.e0(-822451492);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wjp((Object) mm40Var, (Object) hy20Var, (Object) s5n0Var, (Object) khoVar, (wdr) function0, i, (byte) 2);
        }
    }

    public static final void c(mm40 mm40Var, j43 j43Var, wbs0 wbs0Var, Function0 function0, fet fetVar, int i) {
        int i2;
        fetVar.g0(-959669689);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(j43Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.e(wbs0Var.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function0) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
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
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            i4w0.g(new x7z(1.0f, true), j43Var, new cy6(null, 1023), fetVar, i2 & 112);
            if (wbs0Var != wbs0.IS_NOT_VISIBLE) {
                fetVar.e0(-168520990);
                int i3 = i2 >> 3;
                e(o7k0.y(jm40.b, null, 3), wbs0Var, function0, fetVar, (i3 & 896) | (i3 & 112) | 6);
                fetVar.r(false);
            } else {
                fetVar.e0(-168316297);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vho((byte) 6, i, mm40Var, j43Var, wbs0Var, function0);
        }
    }

    public static final void d(mm40 mm40Var, s5n0 s5n0Var, fet fetVar, int i) {
        int i2;
        fetVar.g0(-1955833364);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(s5n0Var) ? 32 : 16;
        }
        if (!fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            fetVar.X();
        } else if (s5n0Var instanceof r5n0) {
            fetVar.e0(-705236592);
            j5n0.h(mm40Var, androidx.compose.runtime.e.f(s5n0Var, fetVar), fetVar, i2 & 14);
            fetVar.r(false);
        } else if (s5n0Var instanceof q5n0) {
            fetVar.e0(-704919307);
            aad.e(((q5n0) s5n0Var).f28160a, mm40Var, y9q0.a(new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), StaticColors.INSTANCE.m131getWhite800d7_KjU(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214), null, 2, false, 5, 0, null, new n05(idm0.t(10), idm0.t(12), idm0.t(1)), fetVar, ((i2 << 3) & 112) | 1597440, 424);
            fetVar.r(false);
        } else {
            if (!s5n0Var.equals(p5n0.f26413a)) {
                throw b1j.f(1639816698, fetVar, false);
            }
            fetVar.e0(1639845584);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new n0n((Object) mm40Var, (Object) s5n0Var, i, (byte) 19);
        }
    }

    public static final void e(mm40 mm40Var, wbs0 wbs0Var, Function0 function0, fet fetVar, int i) {
        int i2;
        fetVar.g0(-443236114);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.e(wbs0Var.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function0) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = o7k0.n(mm40Var, 32.0f);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = dw9.j(fetVar);
            }
            gy40 gy40Var = (gy40) objP;
            boolean z = (i2 & 896) == 256;
            Object objP2 = fetVar.P();
            if (z || objP2 == cl5Var) {
                objP2 = new dbn(function0, (byte) 12);
                fetVar.o0(objP2);
            }
            mm40 mm40VarE0 = o2e.e0(s5x0.J(y860.W(mm40VarN, gy40Var, null, false, null, (Function0) objP2, 28), 6.0f), "TRACK_EYE_ICON_TAG");
            boolean z2 = (i2 & 112) == 32;
            Object objP3 = fetVar.P();
            if (z2 || objP3 == cl5Var) {
                objP3 = new g7p((Object) wbs0Var, (byte) 19);
                fetVar.o0(objP3);
            }
            dww.c(iom0.r(jpm0.t(wbs0Var.f38895a, 6, fetVar), fetVar), null, pai0.a(mm40VarE0, false, (Function1) objP3), StaticColors.INSTANCE.m123getWhite0d7_KjU(), fetVar, 56, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eur(mm40Var, wbs0Var, function0, i, (byte) 0);
        }
    }
}
