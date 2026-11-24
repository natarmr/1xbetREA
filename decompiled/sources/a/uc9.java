package a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.javax.sip.message.Response;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidComposeView;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class uc9 implements vke {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final lw3 f35418a = new lw3((byte) 4);
    public static final lw3 b = new lw3((byte) 3);
    public static final mw3 c = new mw3((byte) 1);
    public static final mw3 d = new mw3((byte) 0);
    public static final nw3 e = new nw3((byte) 0);
    public static final nw3 f = new nw3((byte) 3);
    public static final nw3 g = new nw3((byte) 2);
    public static final nw3 h = new nw3((byte) 1);
    public static final ugd i = new ugd(-1301237484, false, new i5b(18));
    public static final ugd j = new ugd(868089168, false, new ahd(8));
    public static final ugd k = new ugd(1948485832, false, new ahd(9));
    public static final ugd l = new ugd(-1384118803, false, new jhd(2));
    public static final ugd m = new ugd(847064273, false, new mhd(23));
    public static final zzc0 n = new zzc0("list-item-type");
    public static final zzc0 o = new zzc0("bullet-list-item-level");
    public static final zzc0 p = new zzc0("ordered-list-item-number");
    public static final zzc0 q = new zzc0("heading-level");
    public static final zzc0 r = new zzc0("link-destination");
    public static final zzc0 s = new zzc0("paragraph-is-in-tight-list");
    public static final zzc0 t = new zzc0("code-block-info");
    public static final mzx u = new mzx();

    public static final void A(alp alpVar, boolean z, boolean z2, Function1 function1, fet fetVar, int i2) {
        ugg0 ugg0Var;
        byte b2;
        fetVar.g0(-183998277);
        int i3 = i2 | (fetVar.g(alpVar) ? 4 : 2) | (fetVar.h(z) ? 32 : 16) | (fetVar.h(z2) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            boolean z3 = alpVar.c;
            boolean z4 = alpVar.d;
            pf5 pf5Var = z3 ? new pf5(3, null) : null;
            if (z && z2) {
                zcl zclVar = qmk.i;
                ugg0 ugg0Var2 = vgg0.f37379a;
                ugg0Var = new ugg0(zclVar, zclVar, zclVar, zclVar);
            } else if (z) {
                zcl zclVar2 = qmk.i;
                zcl zclVar3 = qmk.f28987a;
                ugg0Var = new ugg0(zclVar2, zclVar2, zclVar3, zclVar3);
            } else if (!z2 || z4) {
                zcl zclVar4 = qmk.f28987a;
                ugg0 ugg0Var3 = vgg0.f37379a;
                ugg0Var = new ugg0(zclVar4, zclVar4, zclVar4, zclVar4);
            } else {
                zcl zclVar5 = qmk.i;
                zcl zclVar6 = qmk.f28987a;
                ugg0Var = new ugg0(zclVar6, zclVar6, zclVar5, zclVar5);
            }
            jm40 jm40Var = jm40.b;
            mm40 mm40VarJ = lgb.J(jm40Var, ugg0Var);
            zfn zfnVar = zaq0.b;
            mm40 mm40VarQ = i120.Q(mm40VarJ, ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), jd8.n);
            x5d x5dVarA = w5d.a(c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
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
            mm40 mm40VarM = s5x0.M(jm40Var, 4.0f, z ? 8.0f : 0.0f, 4.0f, (!z2 || z4) ? 0.0f : 8.0f);
            k7l0 k7l0Var = new k7l0(new a2l0(alpVar.f1079a, ((ThemeColors) fetVar.k(zfnVar)).getTextPrimary()), alpVar.b, null, Integer.valueOf(R.drawable.ic_glyph_express), pf5Var, alpVar.d, null, 148);
            int i4 = i3 & 7168;
            int i5 = i3 & 14;
            boolean z5 = (i4 == 2048) | (i5 == 4);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z5 || objP == cl5Var) {
                objP = new wvy(function1, alpVar, (byte) 2);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z6 = (i5 == 4) | (i4 == 2048);
            Object objP2 = fetVar.P();
            if (z6 || objP2 == cl5Var) {
                b2 = 2;
                objP2 = new xvy(function1, alpVar, b2);
                fetVar.o0(objP2);
            } else {
                b2 = 2;
            }
            xbc.o(mm40VarM, k7l0Var, null, null, false, function0, null, null, (Function1) objP2, fetVar, 0, 220);
            if (z4 || z2) {
                fetVar.e0(1998773713);
                fetVar.r(false);
            } else {
                fetVar.e0(1998555256);
                mbc.o(zfi0.f44303a, s5x0.L(o7k0.d(jm40Var, 1.0f), 16.0f, 0.0f, 2), false, fetVar, 6, 4);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new sp30(alpVar, z, z2, function1, i2, (byte) 0);
        }
    }

    public static final void B(fcx fcxVar, Function1 function1, fet fetVar, int i2) {
        byte b2;
        Function1 function2;
        boolean z;
        Function1 function3 = function1;
        fcxVar.getClass();
        function3.getClass();
        fetVar.g0(-1214514545);
        int i3 = i2 | (fetVar.g(fcxVar) ? 4 : 2) | (fetVar.i(function3) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            n0q n0qVar = o7k0.c;
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarR = knm0.r(i120.Q(n0qVar, s6t0.b().f33626a.getBackground(), jd8.n));
            xx7 xx7Var = gqw0.m;
            mw3 mw3Var = c;
            x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarR);
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
            jpm0.o(fetVar, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            imm immVar = new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(rsm0.w(R.string.injuries, 0, fetVar), ha50.TWO_LINES, s6t0.b().f33626a.getSecondary(), fa50.f9191a), fmm.f9790a, s6t0.b().f33626a.getBackgroundContent(), false, null);
            int i4 = i3 & 112;
            boolean z3 = i4 == 32;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z3 || objP == cl5Var) {
                b2 = 1;
                objP = new u9x(function3, b2);
                fetVar.o0(objP);
            } else {
                b2 = 1;
            }
            hlm.c(null, immVar, null, (Function0) objP, null, null, null, null, null, null, null, null, fetVar, 0, 0, 4085);
            if (fcxVar instanceof ecx) {
                fetVar.e0(1697468779);
                x5d x5dVarA2 = w5d.a(mw3Var, xx7Var, fetVar, 0);
                int iHashCode2 = Long.hashCode(fetVar.T);
                bh90 bh90VarM2 = fetVar.m();
                mm40 mm40VarC1 = kbc.c0(fetVar, n0qVar);
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(pcyVar);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, x5dVarA2, shdVar);
                jpm0.o(fetVar, bh90VarM2, shdVar2);
                vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
                jpm0.o(fetVar, mm40VarC1, shdVar4);
                fetVar.e0(-1876481607);
                for (qcx qcxVar : ((ecx) fcxVar).f7588a) {
                    H(0, fetVar);
                }
                z = true;
                ohs0.x(fetVar, false, true, false);
                function3 = function1;
            } else {
                if (fcxVar instanceof dcx) {
                    fetVar.e0(1697746694);
                    function2 = function1;
                    w(((dcx) fcxVar).f5867a, function2, fetVar, i4);
                    fetVar.r(false);
                } else {
                    function2 = function1;
                    if (fcxVar instanceof ccx) {
                        fetVar.e0(1855887404);
                        r(((ccx) fcxVar).f4133a, fetVar, 0);
                        fetVar.r(false);
                    } else {
                        if (!(fcxVar instanceof bcx)) {
                            throw b1j.f(1855872577, fetVar, false);
                        }
                        fetVar.e0(1698097459);
                        zcl zclVar = qmk.f28987a;
                        lh80 lh80VarU = s5x0.u(0.0f, 0.0f, 0.0f, 24.0f, 7);
                        boolean z4 = (i3 & 14) == 4;
                        Object objP2 = fetVar.P();
                        if (z4 || objP2 == cl5Var) {
                            objP2 = new adw(fcxVar, (byte) 13);
                            fetVar.o0(objP2);
                        }
                        function3 = function2;
                        b8k0.e(n0qVar, xczVarA, lh80VarU, null, null, null, false, null, (Function1) objP2, fetVar, 6, Response.SERVER_TIMEOUT);
                        fetVar.r(false);
                    }
                    z = true;
                }
                function3 = function2;
                z = true;
            }
            fetVar.r(z);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new sjs(fcxVar, function3, i2, (byte) 21);
        }
    }

    public static final void C(int i2, fet fetVar) {
        fetVar.g0(-1604681216);
        byte b2 = 0;
        if (fetVar.U(i2 & 1, i2 != 0)) {
            n0q n0qVar = o7k0.c;
            zfn zfnVar = m8m0.f21378a;
            mm40 mm40VarQ = i120.Q(n0qVar, ((StaticColors) fetVar.k(zfnVar)).m109getOverlayBackground400d7_KjU(), jd8.n);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
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
            kpb.j(null, new dkm((ycl) null, new y3d(((StaticColors) fetVar.k(zfnVar)).m131getWhite800d7_KjU()), 3), fetVar, 0, 1);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new g20(i2, b2);
        }
    }

    public static final void D(int i2, fet fetVar) {
        fetVar.g0(1332399296);
        if (fetVar.U(i2 & 1, i2 != 0)) {
            fqj0 fqj0VarD0 = vbc.d0(null, fetVar, 0, 1);
            n0q n0qVar = o7k0.c;
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarQ = i120.Q(n0qVar, s6t0.b().f33626a.getBackgroundContent(), jd8.n);
            x5d x5dVarA = w5d.a(c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
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
            zfn zfnVar = zaq0.b;
            I(((ThemeColors) fetVar.k(zfnVar)).getBackground(), fqj0VarD0, fetVar, 0);
            I(((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), fqj0VarD0, fetVar, 0);
            I(((ThemeColors) fetVar.k(zfnVar)).getBackground(), fqj0VarD0, fetVar, 0);
            I(((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), fqj0VarD0, fetVar, 0);
            I(((ThemeColors) fetVar.k(zfnVar)).getBackground(), fqj0VarD0, fetVar, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new k8e0(i2, (byte) 11);
        }
    }

    public static final void E(int i2, fet fetVar) {
        fetVar.g0(-783303277);
        byte b2 = 0;
        if (fetVar.U(i2 & 1, i2 != 0)) {
            n0q n0qVar = o7k0.c;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(n0qVar, 12.0f, 0.0f, 2);
            x5d x5dVarA = w5d.a(c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarL);
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
            mm40 mm40VarD = o7k0.d(s5x0.N(jm40Var, 0.0f, 12.0f, 0.0f, 0.0f, 13), 1.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(o7k0.e(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarD), 108.0f), vbc.d0(null, fetVar, 0, 1)));
            dw9.x(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, s5x0.N(jm40Var, 0.0f, 12.0f, 0.0f, 24.0f, 5)).e(n0qVar), vbc.d0(null, fetVar, 0, 1), fetVar, 0, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zgp0(i2, b2);
        }
    }

    public static final void F(slp slpVar, boolean z, j700 j700Var, zcz zczVar, Function1 function1, fet fetVar, int i2) {
        int i3;
        zczVar.getClass();
        function1.getClass();
        fetVar.g0(1364282421);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(jm40.b) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(slpVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.h(z) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.e(j700Var.ordinal()) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.g(zczVar) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar.i(function1) ? 131072 : 65536;
        }
        if (fetVar.U(i3 & 1, (74899 & i3) != 74898)) {
            mm40 mm40VarQ = i120.Q(o7k0.c, ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), jd8.n);
            float f2 = slpVar.e;
            float f3 = xfn.a(fetVar).d;
            float f4 = xfn.a(fetVar).d;
            zcl zclVar = qmk.f28987a;
            int i4 = i3;
            lh80 lh80Var = new lh80(f3, f2, f4, z ? 12.0f : 24.0f);
            boolean z2 = ((i4 & 112) == 32) | ((i4 & 458752) == 131072);
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new bw20((Object) slpVar, (Object) function1, (byte) 11);
                fetVar.o0(objP);
            }
            bfb.e(mm40VarQ, slpVar, lh80Var, j700Var, zczVar, function1, (Function1) objP, fetVar, i4 & 523376);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yvy(slpVar, z, j700Var, zczVar, function1, i2, (byte) 2);
        }
    }

    public static final void G(dme0 dme0Var, Function1 function1, fet fetVar, int i2) {
        Function1 function2;
        dme0Var.getClass();
        function1.getClass();
        fetVar.g0(2068950367);
        int i3 = i2 | (fetVar.g(dme0Var) ? 4 : 2) | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            mm40 mm40VarE = knm0.r(jm40.b).e(o7k0.c);
            x5d x5dVarA = w5d.a(c, gqw0.m, fetVar, 6);
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
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            imm immVar = dme0Var.f6319a;
            int i4 = i3 & 112;
            boolean z = i4 == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new evd0(function1, (byte) 28);
                fetVar.o0(objP);
            }
            hlm.c(null, immVar, null, (Function0) objP, null, null, null, null, null, null, null, null, fetVar, 0, 0, 4085);
            fle0 fle0Var = dme0Var.b;
            if (fle0Var instanceof ele0) {
                fetVar.e0(171004555);
                D(0, fetVar);
                fetVar.r(false);
                function2 = function1;
            } else if (fle0Var instanceof dle0) {
                fetVar.e0(171104220);
                function2 = function1;
                x(((dle0) fle0Var).f6277a, function2, fetVar, i4);
                fetVar.r(false);
            } else {
                function2 = function1;
                if (fle0Var instanceof cle0) {
                    fetVar.e0(171309285);
                    s(((cle0) fle0Var).f4554a, fetVar, 0);
                    fetVar.r(false);
                } else {
                    if (!(fle0Var instanceof ble0)) {
                        throw b1j.f(-964318068, fetVar, false);
                    }
                    fetVar.e0(171475724);
                    i(((ble0) fle0Var).f2791a, fetVar, 0);
                    fetVar.r(false);
                }
            }
            fetVar.r(true);
        } else {
            function2 = function1;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new j5d0(dme0Var, function2, i2, (byte) 10);
        }
    }

    public static final void H(int i2, fet fetVar) {
        fetVar.g0(-1097758378);
        if (fetVar.U(i2 & 1, i2 != 0)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(o7k0.d(s5x0.N(jm40.b, xfn.a(fetVar).d, 8.0f, xfn.a(fetVar).d, 0.0f, 8), 1.0f), 64.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            qxw.o(fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new v1x(i2, (byte) 14);
        }
    }

    public static final void I(long j2, fqj0 fqj0Var, fet fetVar, int i2) {
        fqj0Var.getClass();
        fetVar.g0(701063571);
        int i3 = i2 | (fetVar.f(j2) ? 4 : 2) | (fetVar.g(fqj0Var) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarQ = i120.Q(o7k0.d(jm40Var, 1.0f), j2, jd8.n);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarK = s5x0.K(mm40VarQ, 8.0f, 18.0f);
            thg0 thg0VarA = shg0.a(f35418a, gqw0.j, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarK);
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
            mm40 mm40VarE = o7k0.e(o7k0.s(jm40Var, 70.0f), 16.0f);
            zcl zclVar2 = qmk.f;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), fqj0Var));
            dw9.x(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, o7k0.e(o7k0.d(s5x0.N(jm40Var, 16.0f, 0.0f, 0.0f, 0.0f, 14), 1.0f), 16.0f)), fqj0Var, fetVar, 0, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yxh(j2, fqj0Var, i2, (byte) 7);
        }
    }

    public static final void J(bzl bzlVar, the theVar, fet fetVar, int i2) {
        int i3;
        fetVar.g0(777272421);
        int i4 = i2 & 6;
        jm40 jm40Var = jm40.b;
        if (i4 == 0) {
            i3 = (fetVar.g(jm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(bzlVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(theVar) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            d9z d9zVarA = f9z.a(fetVar);
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new ago((byte) 28);
                fetVar.o0(objP);
            }
            mm40 mm40VarV = cjx.V(jm40Var, bzlVar.a((Function0) objP), null);
            zcl zclVar = qmk.f28987a;
            float f2 = xfn.a(fetVar).d;
            ckb.f(mm40VarV, theVar.f33957a, d9zVarA, new lh80(f2, 12.0f, f2, 12.0f), null, null, null, null, fetVar, 0, 240);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new n0n(bzlVar, theVar, i2);
        }
    }

    public static final void K(ilp ilpVar, boolean z, boolean z2, Function1 function1, fet fetVar, int i2) {
        uf5 of5Var;
        ugg0 ugg0Var;
        byte b2;
        fetVar.g0(-67010079);
        int i3 = i2 | (fetVar.g(ilpVar) ? 4 : 2) | (fetVar.h(z) ? 32 : 16) | (fetVar.h(z2) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            if (ilpVar.h) {
                of5Var = new pf5(3, null);
            } else {
                of5Var = ilpVar.i ? new of5() : null;
            }
            if (z && z2) {
                zcl zclVar = qmk.i;
                ugg0 ugg0Var2 = vgg0.f37379a;
                ugg0Var = new ugg0(zclVar, zclVar, zclVar, zclVar);
            } else if (z) {
                zcl zclVar2 = qmk.i;
                zcl zclVar3 = qmk.f28987a;
                ugg0Var = new ugg0(zclVar2, zclVar2, zclVar3, zclVar3);
            } else if (z2) {
                zcl zclVar4 = qmk.i;
                zcl zclVar5 = qmk.f28987a;
                ugg0Var = new ugg0(zclVar5, zclVar5, zclVar4, zclVar4);
            } else {
                zcl zclVar6 = qmk.f28987a;
                ugg0 ugg0Var3 = vgg0.f37379a;
                ugg0Var = new ugg0(zclVar6, zclVar6, zclVar6, zclVar6);
            }
            String str = ilpVar.b;
            zfn zfnVar = zaq0.b;
            a2l0 a2l0Var = new a2l0(str, ((ThemeColors) fetVar.k(zfnVar)).getTextPrimary());
            boolean z3 = ilpVar.o;
            int i4 = ilpVar.g;
            b8l0 m7l0Var = z3 ? new m7l0(a2l0Var, i4, ilpVar.f, of5Var, ilpVar.p, ilpVar.q, 24) : new l7l0(a2l0Var, i4, ilpVar.m.b, ilpVar.f, of5Var, 48);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarQ = i120.Q(lgb.J(jm40Var, ugg0Var), ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), jd8.n);
            x5d x5dVarA = w5d.a(c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
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
            mm40 mm40VarM = s5x0.M(jm40Var, 4.0f, z ? 8.0f : 0.0f, 4.0f, z2 ? 8.0f : 0.0f);
            int i5 = i3 & 7168;
            int i6 = i3 & 14;
            boolean z4 = (i5 == 2048) | (i6 == 4);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z4 || objP == cl5Var) {
                b2 = 4;
                objP = new zvy(function1, ilpVar, b2);
                fetVar.o0(objP);
            } else {
                b2 = 4;
            }
            Function0 function0 = (Function0) objP;
            boolean z5 = (i5 == 2048) | (i6 == b2);
            Object objP2 = fetVar.P();
            if (z5 || objP2 == cl5Var) {
                objP2 = new zvy(function1, ilpVar, (byte) 5);
                fetVar.o0(objP2);
            }
            Function0 function2 = (Function0) objP2;
            boolean z6 = (i6 == 4) | (i5 == 2048);
            Object objP3 = fetVar.P();
            if (z6 || objP3 == cl5Var) {
                objP3 = new awy(function1, ilpVar, (byte) 2);
                fetVar.o0(objP3);
            }
            xbc.o(mm40VarM, m7l0Var, null, null, false, function0, function2, null, (Function1) objP3, fetVar, 0, 156);
            if (z2) {
                fetVar.e0(653727787);
                fetVar.r(false);
            } else {
                fetVar.e0(653509330);
                mbc.o(zfi0.f44303a, s5x0.L(o7k0.d(jm40Var, 1.0f), 16.0f, 0.0f, 2), false, fetVar, 6, 4);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new up30(ilpVar, z, z2, function1, i2, (byte) 0);
        }
    }

    public static final void L(mm40 mm40Var, jp00 jp00Var, fet fetVar, int i2) {
        fet fetVar2;
        pge pgeVar = gqw0.A;
        fetVar.g0(-385773151);
        int i3 = (fetVar.g(jp00Var) ? 32 : 16) | i2;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
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
            xyw xywVar = jp00Var.b;
            if (xywVar != null) {
                if (xywVar instanceof vyw) {
                    fetVar.e0(-1837715638);
                    zq8.a(0, fetVar, i120.Q(o7k0.c, fbc.d(((vyw) xywVar).f38269a), jd8.n));
                    fetVar.r(false);
                    fetVar2 = fetVar;
                } else if (xywVar instanceof wyw) {
                    fetVar.e0(-1134398446);
                    fetVar2 = fetVar;
                    j0x.b(a8k0.F(((wyw) xywVar).f39993a, 0, fetVar), null, o7k0.c, null, pgeVar, 0.0f, null, fetVar2, 25016, 104);
                    fetVar2.r(false);
                }
                fetVar2.e0(-1837699955);
                Iterator it = jp00Var.c.iterator();
                while (it.hasNext()) {
                    int iIntValue = ((Number) it.next()).intValue();
                    fetVar2.b0(-1525377831, Integer.valueOf(iIntValue));
                    j0x.b(a8k0.F(iIntValue, 0, fetVar2), null, o7k0.c, null, pgeVar, 0.0f, null, fetVar2, 25016, 104);
                    fetVar2.r(false);
                }
                fetVar2.r(false);
                fetVar2.r(true);
            }
            throw b1j.f(-1837718819, fetVar, false);
        }
        fetVar2 = fetVar;
        fetVar2.X();
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new a5k0(mm40Var, jp00Var, i2, (byte) 10);
        }
    }

    public static final void M(olp olpVar, boolean z, boolean z2, Function1 function1, fet fetVar, int i2) {
        uf5 of5Var;
        ugg0 ugg0Var;
        byte b2;
        fetVar.g0(-2138458889);
        int i3 = i2 | (fetVar.g(olpVar) ? 4 : 2) | (fetVar.h(z) ? 32 : 16) | (fetVar.h(z2) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            if (olpVar.g) {
                of5Var = new pf5(3, null);
            } else {
                of5Var = olpVar.h ? new of5() : null;
            }
            if (z) {
                zcl zclVar = qmk.i;
                zcl zclVar2 = qmk.f28987a;
                ugg0Var = new ugg0(zclVar2, zclVar2, zclVar, zclVar);
            } else {
                zcl zclVar3 = qmk.f28987a;
                ugg0 ugg0Var2 = vgg0.f37379a;
                ugg0Var = new ugg0(zclVar3, zclVar3, zclVar3, zclVar3);
            }
            String str = olpVar.b;
            zfn zfnVar = zaq0.b;
            a2l0 a2l0Var = new a2l0(str, ((ThemeColors) fetVar.k(zfnVar)).getTextPrimary());
            boolean z3 = olpVar.n;
            int i4 = olpVar.f;
            b8l0 m7l0Var = z3 ? new m7l0(a2l0Var, i4, olpVar.e, of5Var, olpVar.o, olpVar.r, 24) : new l7l0(a2l0Var, i4, olpVar.j.b, olpVar.e, of5Var, 48);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarQ = i120.Q(lgb.J(jm40Var, ugg0Var), ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), jd8.n);
            x5d x5dVarA = w5d.a(c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
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
            mm40 mm40VarM = s5x0.M(jm40Var, 24.0f, 0.0f, 4.0f, z ? 8.0f : 0.0f);
            int i5 = i3 & 7168;
            int i6 = i3 & 14;
            boolean z4 = (i5 == 2048) | (i6 == 4);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z4 || objP == cl5Var) {
                b2 = 4;
                objP = new bwy(function1, olpVar, b2);
                fetVar.o0(objP);
            } else {
                b2 = 4;
            }
            Function0 function0 = (Function0) objP;
            boolean z5 = (i6 == b2) | (i5 == 2048);
            Object objP2 = fetVar.P();
            if (z5 || objP2 == cl5Var) {
                objP2 = new bwy(function1, olpVar, (byte) 5);
                fetVar.o0(objP2);
            }
            Function0 function2 = (Function0) objP2;
            boolean z6 = (i6 == 4) | (i5 == 2048);
            Object objP3 = fetVar.P();
            if (z6 || objP3 == cl5Var) {
                objP3 = new cwy(function1, olpVar, (byte) 2);
                fetVar.o0(objP3);
            }
            xbc.o(mm40VarM, m7l0Var, null, null, false, function0, function2, null, (Function1) objP3, fetVar, 0, 156);
            if (z) {
                fetVar.e0(-1519848683);
                fetVar.r(false);
            } else {
                fetVar.e0(-1520190148);
                mbc.o(zfi0.f44303a, s5x0.N(o7k0.d(jm40Var, 1.0f), !z2 ? 70.0f : 16.0f, 0.0f, 12.0f, 0.0f, 10), false, fetVar, 6, 4);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yo30(olpVar, z, z2, function1, i2, (byte) 1);
        }
    }

    public static final void N(clp clpVar, boolean z, boolean z2, Function1 function1, fet fetVar, int i2) {
        ugg0 ugg0Var;
        fetVar.g0(1634598427);
        int i3 = i2 | (fetVar.g(clpVar) ? 4 : 2) | (fetVar.h(z) ? 32 : 16) | (fetVar.h(z2) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            if (z) {
                zcl zclVar = qmk.i;
                zcl zclVar2 = qmk.f28987a;
                ugg0Var = new ugg0(zclVar2, zclVar2, zclVar, zclVar);
            } else {
                zcl zclVar3 = qmk.f28987a;
                ugg0 ugg0Var2 = vgg0.f37379a;
                ugg0Var = new ugg0(zclVar3, zclVar3, zclVar3, zclVar3);
            }
            jm40 jm40Var = jm40.b;
            mm40 mm40VarJ = lgb.J(jm40Var, ugg0Var);
            zfn zfnVar = zaq0.b;
            mm40 mm40VarQ = i120.Q(mm40VarJ, ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), jd8.n);
            x5d x5dVarA = w5d.a(c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
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
            mm40 mm40VarM = s5x0.M(jm40Var, 24.0f, 0.0f, 4.0f, z ? 8.0f : 0.0f);
            o7l0 o7l0Var = new o7l0(new a2l0(clpVar.f4571a, ((ThemeColors) fetVar.k(zfnVar)).getTextPrimary()), clpVar.c, Integer.valueOf(clpVar.f));
            boolean z3 = ((i3 & 14) == 4) | ((i3 & 7168) == 2048);
            Object objP = fetVar.P();
            if (z3 || objP == ukd.f35823a) {
                objP = new vvy(function1, clpVar, (byte) 2);
                fetVar.o0(objP);
            }
            xbc.o(mm40VarM, o7l0Var, null, null, false, (Function0) objP, null, null, null, fetVar, 0, 476);
            if (z) {
                fetVar.e0(221230705);
                fetVar.r(false);
            } else {
                fetVar.e0(220889240);
                mbc.o(zfi0.f44303a, s5x0.N(o7k0.d(jm40Var, 1.0f), !z2 ? 70.0f : 16.0f, 0.0f, 12.0f, 0.0f, 10), false, fetVar, 6, 4);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zo30(clpVar, z, z2, function1, i2, (byte) 1);
        }
    }

    public static final void O(int i2, fet fetVar, mm40 mm40Var, l7m0 l7m0Var, Function1 function1) {
        Function1 function2;
        mm40 mm40Var2;
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(2050391721);
        int i3 = i2 | 6 | (fetVar.g(l7m0Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            n0q n0qVar = o7k0.c;
            zfn zfnVar = zaq0.b;
            mm40 mm40VarR = knm0.r(i120.Q(n0qVar, ((ThemeColors) fetVar.k(zfnVar)).getBackground(), jd8.n));
            x5d x5dVarA = w5d.a(c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarR);
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
            imm immVar = new imm(new ilm(((ThemeColors) fetVar.k(zfnVar)).getSecondary()), new plm(rsm0.w(R.string.statistic_info_rating, 0, fetVar), ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), fa50.f9191a), fmm.f9790a, ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), false, null);
            int i4 = i3 & 896;
            boolean z = i4 == 256;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new g4p0(function1, (byte) 8);
                fetVar.o0(objP);
            }
            hlm.c(null, immVar, null, (Function0) objP, null, null, null, null, null, null, null, null, fetVar, 0, 0, 4085);
            lhp0 lhp0Var = (lhp0) l7m0Var.getValue();
            if (lhp0Var instanceof ihp0) {
                fetVar.e0(-1206757460);
                k(((ihp0) lhp0Var).f14791a, fetVar, 0);
                fetVar.r(false);
                function2 = function1;
            } else if (lhp0Var instanceof jhp0) {
                fetVar.e0(-1206640528);
                mdm mdmVar = ((jhp0) lhp0Var).f16539a;
                boolean z2 = i4 == 256;
                Object objP2 = fetVar.P();
                if (z2 || objP2 == cl5Var) {
                    function2 = function1;
                    objP2 = new g4p0(function2, (byte) 9);
                    fetVar.o0(objP2);
                } else {
                    function2 = function1;
                }
                v(mdmVar, (Function0) objP2, fetVar, 0);
                fetVar.r(false);
            } else {
                function2 = function1;
                if (!Intrinsics.d(lhp0Var, khp0.f18304a)) {
                    throw b1j.f(-2117139936, fetVar, false);
                }
                fetVar.e0(-1206439679);
                E(0, fetVar);
                fetVar.r(false);
            }
            fetVar.r(true);
            mm40Var2 = jm40.b;
        } else {
            function2 = function1;
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mpb0(mm40Var2, l7m0Var, function2, i2, (byte) 11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void P(mm40 mm40Var, bkl bklVar, fet fetVar, int i2) {
        int i3;
        bkl bklVar2;
        byte b2;
        fet fetVar2;
        boolean z;
        jm40 jm40Var;
        fet fetVar3;
        fet fetVar4;
        fet fetVar5 = fetVar;
        fetVar5.g0(1146615658);
        if ((i2 & 6) == 0) {
            i3 = i2 | (fetVar5.g(mm40Var) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? fetVar5.g(bklVar) : fetVar5.i(bklVar) ? 32 : 16;
        }
        if (fetVar5.U(i3 & 1, (i3 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(0.0f, false, new gne(gqw0.k, (byte) 11)), gqw0.m, fetVar5, 0);
            int iHashCode = Long.hashCode(fetVar5.T);
            bh90 bh90VarM = fetVar5.m();
            mm40 mm40VarC0 = kbc.c0(fetVar5, mm40Var);
            mkd.c0.getClass();
            fetVar5.i0();
            if (fetVar5.S) {
                fetVar5.l(e7z.u1);
            } else {
                fetVar5.r0();
            }
            jpm0.o(fetVar5, x5dVarA, gqw0.x);
            jpm0.o(fetVar5, bh90VarM, gqw0.w);
            jpm0.o(fetVar5, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar5);
            jpm0.o(fetVar5, mm40VarC0, gqw0.v);
            String str = bklVar.c;
            String str2 = bklVar.d;
            int length = str.length();
            jm40 jm40Var2 = jm40.b;
            if (length > 0) {
                fetVar5.e0(-1280530981);
                mm40 mm40VarE0 = o2e.e0(o7k0.g(jm40Var2, 18.0f, 0.0f, 2), "DS_BANNER_TITLE");
                int i4 = str2.length() > 0 ? 1 : 2;
                String str3 = bklVar.c;
                ((g1t0) fetVar5.k(j1t0.e)).getClass();
                z = false;
                jm40Var = jm40Var2;
                v8q0.a(str3, mm40VarE0, ((StaticColors) fetVar5.k(m8m0.f21378a)).m123getWhite0d7_KjU(), new n05(qmk.q, qmk.r, qmk.n), 0L, null, null, null, 0L, null, 0L, 2, false, i4, 0, null, g1t0.m(), fetVar, 0, 384, 110576);
                fet fetVar6 = fetVar;
                fetVar6.r(false);
                fetVar3 = fetVar6;
            } else {
                z = false;
                jm40Var = jm40Var2;
                fetVar5.e0(-1279949266);
                fetVar5.r(false);
                fetVar3 = fetVar5;
            }
            if (str2.length() > 0) {
                fetVar3.e0(-1279879795);
                mm40 mm40VarE1 = o2e.e0(o7k0.g(jm40Var, 14.0f, 0.0f, 2), "DS_BANNER_SUBTITLE");
                bklVar2 = bklVar;
                String str4 = bklVar2.d;
                ((g1t0) fetVar3.k(j1t0.e)).getClass();
                v8q0.a(str4, mm40VarE1, ((StaticColors) fetVar3.k(m8m0.f21378a)).m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, g1t0.g(), fetVar, 0, 24960, 110584);
                fet fetVar7 = fetVar;
                fetVar7.r(z);
                fetVar4 = fetVar7;
            } else {
                bklVar2 = bklVar;
                fetVar3.e0(-1279530642);
                fetVar3.r(z);
                fetVar4 = fetVar3;
            }
            fetVar4.r(true);
            b2 = z;
            fetVar2 = fetVar4;
        } else {
            bklVar2 = bklVar;
            b2 = 0;
            fetVar5.X();
            fetVar2 = fetVar5;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new tjl(mm40Var, bklVar2, i2, b2);
        }
    }

    public static final void Q(pnu0 pnu0Var, Function1 function1, fet fetVar, int i2) {
        fet fetVar2 = fetVar;
        function1.getClass();
        fetVar2.g0(1428349730);
        byte b2 = 2;
        int i3 = i2 | (fetVar2.g(pnu0Var) ? 4 : 2) | (fetVar2.i(function1) ? 32 : 16);
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 184.0f);
            zcl zclVar2 = qmk.l;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE2 = h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE);
            boolean z = ((i3 & 14) == 4) | ((i3 & 112) == 32);
            Object objP = fetVar2.P();
            if (z || objP == ukd.f35823a) {
                objP = new ugu0(function1, pnu0Var, b2);
                fetVar2.o0(objP);
            }
            mm40 mm40VarY = y860.Y(mm40VarE2, false, null, null, (Function0) objP, 15);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarY);
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
            mm40 mm40VarJ = lgb.J(o7k0.c, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2));
            String str = pnu0Var.b;
            int i4 = pnu0Var.c;
            k7x.b(str, null, mm40VarJ, a8k0.F(i4, 0, fetVar2), a8k0.F(i4, 0, fetVar2), null, null, null, null, null, gqw0.A, null, fetVar2, 36912, 6, 31712);
            v8q0.a(pnu0Var.d, jr8.f16991a.b(s5x0.N(jm40Var, 16.0f, 0.0f, 0.0f, 16.0f, 6), gqw0.g), y3d.c, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.w, null, j1t0.f15753a, 0L, null, 0, 0, qmk.I, 16646109), fetVar, 384, 0, 131064);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new onu0(pnu0Var, function1, i2, (byte) 0);
        }
    }

    public static byte[] R(byte[] bArr) {
        if (bArr.length != 16) {
            jf4.o("value must be a block.");
            return null;
        }
        byte[] bArr2 = new byte[16];
        for (int i2 = 0; i2 < 16; i2++) {
            byte b2 = (byte) ((bArr[i2] << 1) & 254);
            bArr2[i2] = b2;
            if (i2 < 15) {
                bArr2[i2] = (byte) (((byte) ((bArr[i2 + 1] >> 7) & 1)) | b2);
            }
        }
        bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
        return bArr2;
    }

    public static View S(View view, int i2) throws NoSuchMethodException {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = AndroidComposeView.p2;
            if (declaredMethod == null) {
                declaredMethod = Class.forName("android.view.View").getDeclaredMethod("getAccessibilityViewId", null);
                AndroidComposeView.p2 = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            if (Intrinsics.d(declaredMethod.invoke(view, null), Integer.valueOf(i2))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View viewS = S(viewGroup.getChildAt(i3), i2);
                    if (viewS != null) {
                        return viewS;
                    }
                }
            }
        }
        return null;
    }

    public static final fc6 T(String str, List list) {
        ArrayList<c4h> arrayList = new ArrayList();
        for (Object obj : list) {
            if (((c4h) obj).b.length() > 0) {
                arrayList.add(obj);
            }
        }
        int i2 = 10;
        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
        for (c4h c4hVar : arrayList) {
            String str2 = c4hVar.f3725a;
            String str3 = c4hVar.c;
            String str4 = c4hVar.b;
            List list2 = c4hVar.j;
            ArrayList<q3h> arrayList3 = new ArrayList();
            for (Object obj2 : list2) {
                q3h q3hVar = (q3h) obj2;
                if (q3hVar.c.length() != 0 || q3hVar.b.length() != 0) {
                    arrayList3.add(obj2);
                }
            }
            ArrayList arrayList4 = new ArrayList(r3d.q(arrayList3, i2));
            for (q3h q3hVar2 : arrayList3) {
                arrayList4.add(new xb6(q3hVar2.f28052a, q3hVar2.c, q3hVar2.b, String.valueOf(q3hVar2.e), String.valueOf(q3hVar2.d), String.valueOf(q3hVar2.f)));
                c4hVar = c4hVar;
            }
            arrayList2.add(new bc6(str2, str3, str4, c4hVar.d, 0, arrayList4));
            i2 = 10;
        }
        ArrayList arrayList5 = new ArrayList();
        for (Object obj3 : arrayList2) {
            if (!((bc6) obj3).f.isEmpty()) {
                arrayList5.add(obj3);
            }
        }
        return new fc6(str, arrayList5);
    }

    public static final String U(u1w u1wVar, ctf0 ctf0Var) {
        u1wVar.getClass();
        ctf0Var.getClass();
        rdj rdjVar = rdj.f30294a;
        boolean zH = ctf0Var.h();
        long j2 = u1wVar.l;
        return rdj.g(new znq0(j2), efj.UNIVERSAL, Boolean.valueOf(zH), false, 56);
    }

    public static final String V(u1w u1wVar, boolean z) {
        if (cy7.c() && z) {
            return "";
        }
        String str = u1wVar.q;
        return str.length() == 0 ? u1wVar.j : str;
    }

    public static boolean W() {
        try {
            if (AndroidComposeView.j2 == null) {
                AndroidComposeView.j2 = Class.forName("android.os.SystemProperties");
            }
            Method declaredMethod = AndroidComposeView.k2;
            if (declaredMethod == null) {
                Class cls = AndroidComposeView.j2;
                declaredMethod = cls != null ? cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE) : null;
                AndroidComposeView.k2 = declaredMethod;
            }
            Object objInvoke = declaredMethod != null ? declaredMethod.invoke(null, "debug.layout", Boolean.FALSE) : null;
            return Intrinsics.d(objInvoke instanceof Boolean ? (Boolean) objInvoke : null, Boolean.TRUE);
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean X(gys0 gys0Var, dcg0 dcg0Var, xnm0 xnm0Var) {
        fys0 fys0Var = fys0.c;
        gys0Var.getClass();
        dcg0Var.getClass();
        yzs0 yzs0Var = gys0Var.c;
        if ((yzs0Var.s0(dcg0Var) && !yzs0Var.l0(dcg0Var)) || yzs0Var.v(dcg0Var)) {
            return true;
        }
        gys0Var.b();
        ArrayDeque arrayDeque = gys0Var.g;
        arrayDeque.getClass();
        nbk0 nbk0Var = gys0Var.h;
        nbk0Var.getClass();
        arrayDeque.push(dcg0Var);
        while (!arrayDeque.isEmpty()) {
            dcg0 dcg0Var2 = (dcg0) arrayDeque.pop();
            dcg0Var2.getClass();
            if (nbk0Var.add(dcg0Var2)) {
                xnm0 xnm0Var2 = yzs0Var.l0(dcg0Var2) ? fys0Var : xnm0Var;
                if (xnm0Var2.equals(fys0Var)) {
                    xnm0Var2 = null;
                }
                if (xnm0Var2 == null) {
                    continue;
                } else {
                    Iterator it = yzs0Var.s(yzs0Var.N(dcg0Var2)).iterator();
                    while (it.hasNext()) {
                        dcg0 dcg0VarN = xnm0Var2.n(gys0Var, (aty) it.next());
                        if ((yzs0Var.s0(dcg0VarN) && !yzs0Var.l0(dcg0VarN)) || yzs0Var.v(dcg0VarN)) {
                            gys0Var.a();
                            return true;
                        }
                        arrayDeque.add(dcg0VarN);
                    }
                }
            }
        }
        gys0Var.a();
        return false;
    }

    public static boolean Y(gys0 gys0Var, dcg0 dcg0Var, jys0 jys0Var) {
        yzs0 yzs0Var = gys0Var.c;
        if (yzs0Var.l(dcg0Var)) {
            return true;
        }
        if (yzs0Var.l0(dcg0Var)) {
            return false;
        }
        if (gys0Var.b) {
            yzs0Var.v0(dcg0Var);
        }
        return yzs0Var.Q(yzs0Var.N(dcg0Var), jys0Var);
    }

    public static void Z(int i2, int[] iArr, int[] iArr2, boolean z) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        float f2 = (i2 - i4) / 2.0f;
        if (!z) {
            int length = iArr.length;
            int i6 = 0;
            while (i3 < length) {
                int i7 = iArr[i3];
                iArr2[i6] = Math.round(f2);
                f2 += i7;
                i3++;
                i6++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i8 = iArr[length2];
            iArr2[length2] = Math.round(f2);
            f2 += i8;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    public static final void a(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        ?? r0;
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(-495079766);
        int i3 = i2 | (fetVar.g(l7m0Var) ? 4 : 2) | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            mm40 mm40VarQ = i120.Q(o7k0.c, ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), jd8.n);
            x5d x5dVarA = w5d.a(c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
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
            if (((l20) l7m0Var.getValue()).c) {
                fetVar.e0(1070772096);
                mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
                imm immVar = ((l20) l7m0Var.getValue()).f19284a;
                boolean z = (i3 & 112) == 32;
                Object objP = fetVar.P();
                if (z || objP == ukd.f35823a) {
                    objP = new dn(function1, (byte) 11);
                    fetVar.o0(objP);
                }
                r0 = 0;
                hlm.c(mm40VarD, immVar, null, (Function0) objP, null, null, null, null, null, null, null, null, fetVar, 6, 0, 4084);
                fetVar.r(false);
            } else {
                r0 = 0;
                fetVar.e0(1071093070);
                fetVar.r(false);
            }
            i10 i10Var = ((l20) l7m0Var.getValue()).b;
            if (i10Var instanceof g10) {
                fetVar.e0(-1350917736);
                u((g10) i10Var, function1, fetVar, i3 & 112);
                fetVar.r(r0);
            } else if (i10Var instanceof f10) {
                fetVar.e0(-1350912294);
                j((f10) i10Var, function1, fetVar, ((i3 << 3) & 896) | 6);
                fetVar.r(r0);
            } else {
                if (!i10Var.equals(h10.f12257a)) {
                    throw b1j.f(-1350921167, fetVar, r0);
                }
                fetVar.e0(-1350906979);
                C(r0, fetVar);
                fetVar.r(r0);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o71(l7m0Var, function1, i2, (byte) 2);
        }
    }

    public static void a0(int i2, int[] iArr, int[] iArr2, boolean z) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        float length = iArr.length == 0 ? 0.0f : (i2 - i4) / iArr.length;
        float f2 = length / 2.0f;
        if (!z) {
            int length2 = iArr.length;
            int i6 = 0;
            while (i3 < length2) {
                int i7 = iArr[i3];
                iArr2[i6] = Math.round(f2);
                f2 += i7 + length;
                i3++;
                i6++;
            }
            return;
        }
        int length3 = iArr.length;
        while (true) {
            length3--;
            if (-1 >= length3) {
                return;
            }
            int i8 = iArr[length3];
            iArr2[length3] = Math.round(f2);
            f2 += i8 + length;
        }
    }

    public static final void b(boolean z, bdz bdzVar, bzl bzlVar, lhe lheVar, Function1 function1, fet fetVar, int i2) {
        int i3;
        Object obj;
        fetVar.g0(-901562990);
        int i4 = i2 & 6;
        jm40 jm40Var = jm40.b;
        if (i4 == 0) {
            i3 = (fetVar.g(jm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.h(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(bdzVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.g(bzlVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            obj = lheVar;
            i3 |= fetVar.g(obj) ? 16384 : 8192;
        } else {
            obj = lheVar;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar.i(function1) ? 131072 : 65536;
        }
        if (fetVar.U(i3 & 1, (74899 & i3) != 74898)) {
            d9z d9zVarA = bdzVar.a("FavoriteAggregatorList", fetVar);
            byte b2 = 17;
            mm40 mm40VarV = cjx.V(jm40Var, bzlVar.a(new j6g0(b2)), null);
            wom womVarF = mom.f(fetVar);
            n0q n0qVar = o7k0.c;
            boolean z2 = (458752 & i3) == 131072;
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new s8o(function1, b2);
                fetVar.o0(objP);
            }
            mom.c(n0qVar, z, womVarF, null, false, null, (Function0) objP, null, u1c.M(1790266215, new x2g((Object) mm40VarV, obj, (Object) d9zVarA, (Object) function1, (byte) 2), fetVar), fetVar, (i3 & 112) | 100663296, 184);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mg(z, bdzVar, bzlVar, lheVar, function1, i2);
        }
    }

    public static void b0(int i2, int[] iArr, int[] iArr2, boolean z) {
        if (iArr.length == 0) {
            return;
        }
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        float fMax = (i2 - i4) / Math.max(iArr.length - 1, 1);
        float f2 = (z && iArr.length == 1) ? fMax : 0.0f;
        if (z) {
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i6 = iArr[length];
                iArr2[length] = Math.round(f2);
                f2 += i6 + fMax;
            }
            return;
        }
        int length2 = iArr.length;
        int i7 = 0;
        while (i3 < length2) {
            int i8 = iArr[i3];
            iArr2[i7] = Math.round(f2);
            f2 += i8 + fMax;
            i3++;
            i7++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0114 A[PHI: r2 r4 r7 r10 r13
  0x0114: PHI (r2v23 int) = (r2v18 int), (r2v15 int), (r2v24 int) binds: [B:112:0x012e, B:98:0x0110, B:99:0x0112] A[DONT_GENERATE, DONT_INLINE]
  0x0114: PHI (r4v20 a.mm40) = (r4v4 a.mm40), (r4v2 a.mm40), (r4v2 a.mm40) binds: [B:112:0x012e, B:98:0x0110, B:99:0x0112] A[DONT_GENERATE, DONT_INLINE]
  0x0114: PHI (r7v21 a.y3d) = (r7v4 a.y3d), (r7v2 a.y3d), (r7v2 a.y3d) binds: [B:112:0x012e, B:98:0x0110, B:99:0x0112] A[DONT_GENERATE, DONT_INLINE]
  0x0114: PHI (r10v21 a.y3d) = (r10v6 a.y3d), (r10v3 a.y3d), (r10v3 a.y3d) binds: [B:112:0x012e, B:98:0x0110, B:99:0x0112] A[DONT_GENERATE, DONT_INLINE]
  0x0114: PHI (r13v11 a.u12) = (r13v5 a.u12), (r13v3 a.u12), (r13v3 a.u12) binds: [B:112:0x012e, B:98:0x0110, B:99:0x0112] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:102:0x011b  */
    /* JADX WARN: Code duplicated, block: B:104:0x011f  */
    /* JADX WARN: Code duplicated, block: B:107:0x0125  */
    /* JADX WARN: Code duplicated, block: B:109:0x0128  */
    /* JADX WARN: Code duplicated, block: B:111:0x012b  */
    /* JADX WARN: Code duplicated, block: B:113:0x0130  */
    /* JADX WARN: Code duplicated, block: B:116:0x013d  */
    /* JADX WARN: Code duplicated, block: B:118:0x014a  */
    /* JADX WARN: Code duplicated, block: B:119:0x0155  */
    /* JADX WARN: Code duplicated, block: B:121:0x0160  */
    /* JADX WARN: Code duplicated, block: B:124:0x016b  */
    /* JADX WARN: Code duplicated, block: B:125:0x016e  */
    /* JADX WARN: Code duplicated, block: B:129:0x018c  */
    /* JADX WARN: Code duplicated, block: B:131:0x0191  */
    /* JADX WARN: Code duplicated, block: B:133:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:134:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:136:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:138:0x01be  */
    /* JADX WARN: Code duplicated, block: B:141:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:143:0x0200  */
    /* JADX WARN: Code duplicated, block: B:146:0x020e  */
    /* JADX WARN: Code duplicated, block: B:148:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x0081  */
    /* JADX WARN: Code duplicated, block: B:50:0x0085  */
    /* JADX WARN: Code duplicated, block: B:52:0x0088  */
    /* JADX WARN: Code duplicated, block: B:54:0x0090  */
    /* JADX WARN: Code duplicated, block: B:55:0x0093  */
    /* JADX WARN: Code duplicated, block: B:59:0x009c  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:72:0x00be  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:78:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:83:0x00de  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:92:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:94:0x0104  */
    public static final void c(final mm40 mm40Var, mm40 mm40Var2, final o0x o0xVar, final Integer num, y3d y3dVar, y3d y3dVar2, u12 u12Var, final qge qgeVar, a4x a4xVar, fet fetVar, final int i2, final int i3) {
        int i4;
        mm40 mm40Var3;
        y3d y3dVar3;
        int i5;
        y3d y3dVar4;
        int i6;
        int i7;
        u12 u12Var2;
        int i8;
        qge qgeVar2;
        int i9;
        int i10;
        boolean z;
        final a4x a4xVar2;
        final mm40 mm40Var4;
        final y3d y3dVar5;
        final y3d y3dVar6;
        final u12 u12Var3;
        yfe0 yfe0VarU;
        a4x a4xVar3;
        mm40 mm40Var5;
        y3d y3dVar7;
        int i11;
        y3d y3dVar8;
        mm40 mm40Var6;
        y3d y3dVar9;
        long j2;
        Drawable drawable;
        Object objP;
        long j3;
        boolean z2;
        int i12;
        o0xVar.getClass();
        fetVar.g0(592958967);
        if ((i2 & 6) == 0) {
            i4 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            if ((i3 & 2) == 0) {
                mm40Var3 = mm40Var2;
                int i13 = fetVar.g(mm40Var3) ? 32 : 16;
                i4 |= i13;
            } else {
                mm40Var3 = mm40Var2;
            }
            i4 |= i13;
        } else {
            mm40Var3 = mm40Var2;
        }
        if ((i2 & 384) == 0) {
            i4 |= fetVar.g(o0xVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= fetVar.g(num) ? 2048 : 1024;
        }
        int i14 = i3 & 16;
        if (i14 == 0) {
            if ((i2 & 24576) == 0) {
                y3dVar3 = y3dVar;
                i4 |= fetVar.g(y3dVar3) ? 16384 : 8192;
            }
            i5 = i3 & 32;
            if (i5 != 0) {
                if ((196608 & i2) == 0) {
                    y3dVar4 = y3dVar2;
                    if (fetVar.g(y3dVar4)) {
                        i6 = 131072;
                    } else {
                        i6 = 65536;
                    }
                    i4 |= i6;
                }
                i7 = i3 & 64;
                if (i7 != 0) {
                    if ((1572864 & i2) == 0) {
                        u12Var2 = u12Var;
                        if (fetVar.g(u12Var2)) {
                            i8 = 1048576;
                        } else {
                            i8 = 524288;
                        }
                        i4 |= i8;
                    }
                    if ((12582912 & i2) == 0) {
                        qgeVar2 = qgeVar;
                        if (fetVar.g(qgeVar2)) {
                            i12 = 8388608;
                        } else {
                            i12 = 4194304;
                        }
                        i4 |= i12;
                    } else {
                        qgeVar2 = qgeVar;
                    }
                    i9 = i3 & 256;
                    if (i9 != 0) {
                        i4 |= 100663296;
                    } else if ((i2 & 100663296) == 0) {
                        if (fetVar.i(a4xVar)) {
                            i10 = 67108864;
                        } else {
                            i10 = 33554432;
                        }
                        i4 |= i10;
                    }
                    if ((i4 & 38347923) != 38347922) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (fetVar.U(i4 & 1, z)) {
                        fetVar.Z();
                        if ((i2 & 1) != 0 || fetVar.B()) {
                            if ((i3 & 2) != 0) {
                                i4 &= -113;
                                mm40Var3 = mm40Var;
                            }
                            if (i14 != 0) {
                                y3dVar3 = null;
                            }
                            if (i5 != 0) {
                                y3dVar4 = null;
                            }
                            if (i7 != 0) {
                                u12Var2 = gqw0.e;
                            }
                            if (i9 != 0) {
                                a4xVar3 = lak0.c;
                            }
                            mm40Var5 = mm40Var3;
                            y3dVar7 = y3dVar3;
                            i11 = i4;
                            y3dVar8 = y3dVar4;
                            fetVar.s();
                            if (o0xVar instanceof l0x) {
                                fetVar.e0(-359361630);
                                drawable = ((l0x) o0xVar).f19222a;
                                if (drawable == null) {
                                    fetVar.e0(-359361631);
                                    fetVar.r(false);
                                    z2 = false;
                                } else {
                                    fetVar.e0(-359361630);
                                    objP = fetVar.P();
                                    if (objP == ukd.f35823a) {
                                        objP = u7x.v(drawable);
                                        fetVar.o0(objP);
                                    }
                                    pm80 pm80Var = (pm80) objP;
                                    if (y3dVar8 != null) {
                                        j3 = y3dVar8.f41946a;
                                    } else {
                                        j3 = y3d.g;
                                    }
                                    z2 = false;
                                    dww.c(pm80Var, null, mm40Var, j3, fetVar, ((i11 << 6) & 896) | 56, 0);
                                    fetVar.r(false);
                                }
                                fetVar.r(z2);
                            } else {
                                if (o0xVar instanceof m0x) {
                                    fetVar.e0(-358986003);
                                    pm80 pm80VarF = a8k0.F(((m0x) o0xVar).f20977a, 0, fetVar);
                                    if (y3dVar8 != null) {
                                        j2 = y3dVar8.f41946a;
                                    } else {
                                        j2 = y3d.g;
                                    }
                                    dww.c(pm80VarF, null, mm40Var, j2, fetVar, 56 | ((i11 << 6) & 896), 0);
                                    fetVar.r(false);
                                } else {
                                    if (!(o0xVar instanceof n0x)) {
                                        throw b1j.f(-1397067588, fetVar, false);
                                    }
                                    fetVar.e0(-358704895);
                                    int i15 = 523390 & i11;
                                    int i16 = i11 << 3;
                                    int i17 = (i16 & 1879048192) | i15 | (29360128 & i16) | (234881024 & i16);
                                    mm40Var6 = mm40Var5;
                                    y3dVar9 = y3dVar7;
                                    u12 u12Var4 = u12Var2;
                                    d(mm40Var, mm40Var6, ((n0x) o0xVar).f22722a, num, y3dVar9, y3dVar8, u12Var4, qgeVar2, a4xVar3, fetVar, i17);
                                    y3dVar4 = y3dVar8;
                                    u12Var2 = u12Var4;
                                    fetVar.r(false);
                                }
                                mm40Var4 = mm40Var6;
                                y3dVar5 = y3dVar9;
                                a4xVar2 = a4xVar3;
                            }
                            mm40Var6 = mm40Var5;
                            y3dVar9 = y3dVar7;
                            y3dVar4 = y3dVar8;
                            mm40Var4 = mm40Var6;
                            y3dVar5 = y3dVar9;
                            a4xVar2 = a4xVar3;
                        } else {
                            fetVar.X();
                            if ((i3 & 2) != 0) {
                                i4 &= -113;
                            }
                        }
                        a4xVar3 = a4xVar;
                        mm40Var5 = mm40Var3;
                        y3dVar7 = y3dVar3;
                        i11 = i4;
                        y3dVar8 = y3dVar4;
                        fetVar.s();
                        if (o0xVar instanceof l0x) {
                            fetVar.e0(-359361630);
                            drawable = ((l0x) o0xVar).f19222a;
                            if (drawable == null) {
                                fetVar.e0(-359361631);
                                fetVar.r(false);
                                z2 = false;
                            } else {
                                fetVar.e0(-359361630);
                                objP = fetVar.P();
                                if (objP == ukd.f35823a) {
                                    objP = u7x.v(drawable);
                                    fetVar.o0(objP);
                                }
                                pm80 pm80Var2 = (pm80) objP;
                                if (y3dVar8 != null) {
                                    j3 = y3dVar8.f41946a;
                                } else {
                                    j3 = y3d.g;
                                }
                                z2 = false;
                                dww.c(pm80Var2, null, mm40Var, j3, fetVar, ((i11 << 6) & 896) | 56, 0);
                                fetVar.r(false);
                            }
                            fetVar.r(z2);
                        } else {
                            if (o0xVar instanceof m0x) {
                                fetVar.e0(-358986003);
                                pm80 pm80VarF2 = a8k0.F(((m0x) o0xVar).f20977a, 0, fetVar);
                                if (y3dVar8 != null) {
                                    j2 = y3dVar8.f41946a;
                                } else {
                                    j2 = y3d.g;
                                }
                                dww.c(pm80VarF2, null, mm40Var, j2, fetVar, 56 | ((i11 << 6) & 896), 0);
                                fetVar.r(false);
                            } else {
                                if (!(o0xVar instanceof n0x)) {
                                    throw b1j.f(-1397067588, fetVar, false);
                                }
                                fetVar.e0(-358704895);
                                int i18 = 523390 & i11;
                                int i19 = i11 << 3;
                                int i110 = (i19 & 1879048192) | i18 | (29360128 & i19) | (234881024 & i19);
                                mm40Var6 = mm40Var5;
                                y3dVar9 = y3dVar7;
                                u12 u12Var5 = u12Var2;
                                d(mm40Var, mm40Var6, ((n0x) o0xVar).f22722a, num, y3dVar9, y3dVar8, u12Var5, qgeVar2, a4xVar3, fetVar, i110);
                                y3dVar4 = y3dVar8;
                                u12Var2 = u12Var5;
                                fetVar.r(false);
                            }
                            mm40Var4 = mm40Var6;
                            y3dVar5 = y3dVar9;
                            a4xVar2 = a4xVar3;
                        }
                        mm40Var6 = mm40Var5;
                        y3dVar9 = y3dVar7;
                        y3dVar4 = y3dVar8;
                        mm40Var4 = mm40Var6;
                        y3dVar5 = y3dVar9;
                        a4xVar2 = a4xVar3;
                    } else {
                        fetVar.X();
                        a4xVar2 = a4xVar;
                        mm40Var4 = mm40Var3;
                        y3dVar5 = y3dVar3;
                    }
                    y3dVar6 = y3dVar4;
                    u12Var3 = u12Var2;
                    yfe0VarU = fetVar.u();
                    if (yfe0VarU != null) {
                        yfe0VarU.d = new Function2() { // from class: a.cz3
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                uc9.c(mm40Var, mm40Var4, o0xVar, num, y3dVar5, y3dVar6, u12Var3, qgeVar, a4xVar2, (fet) obj, x8x.L(i2 | 1), i3);
                                return Unit.f46060a;
                            }
                        };
                    }
                }
                i4 |= 1572864;
                u12Var2 = u12Var;
                if ((12582912 & i2) == 0) {
                    qgeVar2 = qgeVar;
                    if (fetVar.g(qgeVar2)) {
                        i12 = 8388608;
                    } else {
                        i12 = 4194304;
                    }
                    i4 |= i12;
                } else {
                    qgeVar2 = qgeVar;
                }
                i9 = i3 & 256;
                if (i9 != 0) {
                    i4 |= 100663296;
                } else if ((i2 & 100663296) == 0) {
                    if (fetVar.i(a4xVar)) {
                        i10 = 67108864;
                    } else {
                        i10 = 33554432;
                    }
                    i4 |= i10;
                }
                if ((i4 & 38347923) != 38347922) {
                    z = true;
                } else {
                    z = false;
                }
                if (fetVar.U(i4 & 1, z)) {
                    fetVar.Z();
                    if ((i2 & 1) != 0) {
                        if ((i3 & 2) != 0) {
                            i4 &= -113;
                            mm40Var3 = mm40Var;
                        }
                        if (i14 != 0) {
                            y3dVar3 = null;
                        }
                        if (i5 != 0) {
                            y3dVar4 = null;
                        }
                        if (i7 != 0) {
                            u12Var2 = gqw0.e;
                        }
                        if (i9 != 0) {
                            a4xVar3 = lak0.c;
                        } else {
                            a4xVar3 = a4xVar;
                        }
                    } else {
                        if ((i3 & 2) != 0) {
                            i4 &= -113;
                            mm40Var3 = mm40Var;
                        }
                        if (i14 != 0) {
                            y3dVar3 = null;
                        }
                        if (i5 != 0) {
                            y3dVar4 = null;
                        }
                        if (i7 != 0) {
                            u12Var2 = gqw0.e;
                        }
                        if (i9 != 0) {
                            a4xVar3 = lak0.c;
                        } else {
                            a4xVar3 = a4xVar;
                        }
                    }
                    mm40Var5 = mm40Var3;
                    y3dVar7 = y3dVar3;
                    i11 = i4;
                    y3dVar8 = y3dVar4;
                    fetVar.s();
                    if (o0xVar instanceof l0x) {
                        fetVar.e0(-359361630);
                        drawable = ((l0x) o0xVar).f19222a;
                        if (drawable == null) {
                            fetVar.e0(-359361631);
                            fetVar.r(false);
                            z2 = false;
                        } else {
                            fetVar.e0(-359361630);
                            objP = fetVar.P();
                            if (objP == ukd.f35823a) {
                                objP = u7x.v(drawable);
                                fetVar.o0(objP);
                            }
                            pm80 pm80Var3 = (pm80) objP;
                            if (y3dVar8 != null) {
                                j3 = y3dVar8.f41946a;
                            } else {
                                j3 = y3d.g;
                            }
                            z2 = false;
                            dww.c(pm80Var3, null, mm40Var, j3, fetVar, ((i11 << 6) & 896) | 56, 0);
                            fetVar.r(false);
                        }
                        fetVar.r(z2);
                    } else {
                        if (o0xVar instanceof m0x) {
                            fetVar.e0(-358986003);
                            pm80 pm80VarF3 = a8k0.F(((m0x) o0xVar).f20977a, 0, fetVar);
                            if (y3dVar8 != null) {
                                j2 = y3dVar8.f41946a;
                            } else {
                                j2 = y3d.g;
                            }
                            dww.c(pm80VarF3, null, mm40Var, j2, fetVar, 56 | ((i11 << 6) & 896), 0);
                            fetVar.r(false);
                        } else {
                            if (!(o0xVar instanceof n0x)) {
                                throw b1j.f(-1397067588, fetVar, false);
                            }
                            fetVar.e0(-358704895);
                            int i111 = 523390 & i11;
                            int i112 = i11 << 3;
                            int i113 = (i112 & 1879048192) | i111 | (29360128 & i112) | (234881024 & i112);
                            mm40Var6 = mm40Var5;
                            y3dVar9 = y3dVar7;
                            u12 u12Var6 = u12Var2;
                            d(mm40Var, mm40Var6, ((n0x) o0xVar).f22722a, num, y3dVar9, y3dVar8, u12Var6, qgeVar2, a4xVar3, fetVar, i113);
                            y3dVar4 = y3dVar8;
                            u12Var2 = u12Var6;
                            fetVar.r(false);
                        }
                        mm40Var4 = mm40Var6;
                        y3dVar5 = y3dVar9;
                        a4xVar2 = a4xVar3;
                    }
                    mm40Var6 = mm40Var5;
                    y3dVar9 = y3dVar7;
                    y3dVar4 = y3dVar8;
                    mm40Var4 = mm40Var6;
                    y3dVar5 = y3dVar9;
                    a4xVar2 = a4xVar3;
                } else {
                    fetVar.X();
                    a4xVar2 = a4xVar;
                    mm40Var4 = mm40Var3;
                    y3dVar5 = y3dVar3;
                }
                y3dVar6 = y3dVar4;
                u12Var3 = u12Var2;
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new Function2() { // from class: a.cz3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            uc9.c(mm40Var, mm40Var4, o0xVar, num, y3dVar5, y3dVar6, u12Var3, qgeVar, a4xVar2, (fet) obj, x8x.L(i2 | 1), i3);
                            return Unit.f46060a;
                        }
                    };
                }
            }
            i4 |= 196608;
            y3dVar4 = y3dVar2;
            i7 = i3 & 64;
            if (i7 != 0) {
                if ((1572864 & i2) == 0) {
                    u12Var2 = u12Var;
                    if (fetVar.g(u12Var2)) {
                        i8 = 1048576;
                    } else {
                        i8 = 524288;
                    }
                    i4 |= i8;
                }
                if ((12582912 & i2) == 0) {
                    qgeVar2 = qgeVar;
                    if (fetVar.g(qgeVar2)) {
                        i12 = 8388608;
                    } else {
                        i12 = 4194304;
                    }
                    i4 |= i12;
                } else {
                    qgeVar2 = qgeVar;
                }
                i9 = i3 & 256;
                if (i9 != 0) {
                    i4 |= 100663296;
                } else if ((i2 & 100663296) == 0) {
                    if (fetVar.i(a4xVar)) {
                        i10 = 67108864;
                    } else {
                        i10 = 33554432;
                    }
                    i4 |= i10;
                }
                if ((i4 & 38347923) != 38347922) {
                    z = true;
                } else {
                    z = false;
                }
                if (fetVar.U(i4 & 1, z)) {
                    fetVar.Z();
                    if ((i2 & 1) != 0) {
                        if ((i3 & 2) != 0) {
                            i4 &= -113;
                            mm40Var3 = mm40Var;
                        }
                        if (i14 != 0) {
                            y3dVar3 = null;
                        }
                        if (i5 != 0) {
                            y3dVar4 = null;
                        }
                        if (i7 != 0) {
                            u12Var2 = gqw0.e;
                        }
                        if (i9 != 0) {
                            a4xVar3 = lak0.c;
                        } else {
                            a4xVar3 = a4xVar;
                        }
                    } else {
                        if ((i3 & 2) != 0) {
                            i4 &= -113;
                            mm40Var3 = mm40Var;
                        }
                        if (i14 != 0) {
                            y3dVar3 = null;
                        }
                        if (i5 != 0) {
                            y3dVar4 = null;
                        }
                        if (i7 != 0) {
                            u12Var2 = gqw0.e;
                        }
                        if (i9 != 0) {
                            a4xVar3 = lak0.c;
                        } else {
                            a4xVar3 = a4xVar;
                        }
                    }
                    mm40Var5 = mm40Var3;
                    y3dVar7 = y3dVar3;
                    i11 = i4;
                    y3dVar8 = y3dVar4;
                    fetVar.s();
                    if (o0xVar instanceof l0x) {
                        fetVar.e0(-359361630);
                        drawable = ((l0x) o0xVar).f19222a;
                        if (drawable == null) {
                            fetVar.e0(-359361631);
                            fetVar.r(false);
                            z2 = false;
                        } else {
                            fetVar.e0(-359361630);
                            objP = fetVar.P();
                            if (objP == ukd.f35823a) {
                                objP = u7x.v(drawable);
                                fetVar.o0(objP);
                            }
                            pm80 pm80Var4 = (pm80) objP;
                            if (y3dVar8 != null) {
                                j3 = y3dVar8.f41946a;
                            } else {
                                j3 = y3d.g;
                            }
                            z2 = false;
                            dww.c(pm80Var4, null, mm40Var, j3, fetVar, ((i11 << 6) & 896) | 56, 0);
                            fetVar.r(false);
                        }
                        fetVar.r(z2);
                    } else {
                        if (o0xVar instanceof m0x) {
                            fetVar.e0(-358986003);
                            pm80 pm80VarF4 = a8k0.F(((m0x) o0xVar).f20977a, 0, fetVar);
                            if (y3dVar8 != null) {
                                j2 = y3dVar8.f41946a;
                            } else {
                                j2 = y3d.g;
                            }
                            dww.c(pm80VarF4, null, mm40Var, j2, fetVar, 56 | ((i11 << 6) & 896), 0);
                            fetVar.r(false);
                        } else {
                            if (!(o0xVar instanceof n0x)) {
                                throw b1j.f(-1397067588, fetVar, false);
                            }
                            fetVar.e0(-358704895);
                            int i114 = 523390 & i11;
                            int i115 = i11 << 3;
                            int i116 = (i115 & 1879048192) | i114 | (29360128 & i115) | (234881024 & i115);
                            mm40Var6 = mm40Var5;
                            y3dVar9 = y3dVar7;
                            u12 u12Var7 = u12Var2;
                            d(mm40Var, mm40Var6, ((n0x) o0xVar).f22722a, num, y3dVar9, y3dVar8, u12Var7, qgeVar2, a4xVar3, fetVar, i116);
                            y3dVar4 = y3dVar8;
                            u12Var2 = u12Var7;
                            fetVar.r(false);
                        }
                        mm40Var4 = mm40Var6;
                        y3dVar5 = y3dVar9;
                        a4xVar2 = a4xVar3;
                    }
                    mm40Var6 = mm40Var5;
                    y3dVar9 = y3dVar7;
                    y3dVar4 = y3dVar8;
                    mm40Var4 = mm40Var6;
                    y3dVar5 = y3dVar9;
                    a4xVar2 = a4xVar3;
                } else {
                    fetVar.X();
                    a4xVar2 = a4xVar;
                    mm40Var4 = mm40Var3;
                    y3dVar5 = y3dVar3;
                }
                y3dVar6 = y3dVar4;
                u12Var3 = u12Var2;
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new Function2() { // from class: a.cz3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            uc9.c(mm40Var, mm40Var4, o0xVar, num, y3dVar5, y3dVar6, u12Var3, qgeVar, a4xVar2, (fet) obj, x8x.L(i2 | 1), i3);
                            return Unit.f46060a;
                        }
                    };
                }
            }
            i4 |= 1572864;
            u12Var2 = u12Var;
            if ((12582912 & i2) == 0) {
                qgeVar2 = qgeVar;
                if (fetVar.g(qgeVar2)) {
                    i12 = 8388608;
                } else {
                    i12 = 4194304;
                }
                i4 |= i12;
            } else {
                qgeVar2 = qgeVar;
            }
            i9 = i3 & 256;
            if (i9 != 0) {
                i4 |= 100663296;
            } else if ((i2 & 100663296) == 0) {
                if (fetVar.i(a4xVar)) {
                    i10 = 67108864;
                } else {
                    i10 = 33554432;
                }
                i4 |= i10;
            }
            if ((i4 & 38347923) != 38347922) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar.U(i4 & 1, z)) {
                fetVar.Z();
                if ((i2 & 1) != 0) {
                    if ((i3 & 2) != 0) {
                        i4 &= -113;
                        mm40Var3 = mm40Var;
                    }
                    if (i14 != 0) {
                        y3dVar3 = null;
                    }
                    if (i5 != 0) {
                        y3dVar4 = null;
                    }
                    if (i7 != 0) {
                        u12Var2 = gqw0.e;
                    }
                    if (i9 != 0) {
                        a4xVar3 = lak0.c;
                    } else {
                        a4xVar3 = a4xVar;
                    }
                } else {
                    if ((i3 & 2) != 0) {
                        i4 &= -113;
                        mm40Var3 = mm40Var;
                    }
                    if (i14 != 0) {
                        y3dVar3 = null;
                    }
                    if (i5 != 0) {
                        y3dVar4 = null;
                    }
                    if (i7 != 0) {
                        u12Var2 = gqw0.e;
                    }
                    if (i9 != 0) {
                        a4xVar3 = lak0.c;
                    } else {
                        a4xVar3 = a4xVar;
                    }
                }
                mm40Var5 = mm40Var3;
                y3dVar7 = y3dVar3;
                i11 = i4;
                y3dVar8 = y3dVar4;
                fetVar.s();
                if (o0xVar instanceof l0x) {
                    fetVar.e0(-359361630);
                    drawable = ((l0x) o0xVar).f19222a;
                    if (drawable == null) {
                        fetVar.e0(-359361631);
                        fetVar.r(false);
                        z2 = false;
                    } else {
                        fetVar.e0(-359361630);
                        objP = fetVar.P();
                        if (objP == ukd.f35823a) {
                            objP = u7x.v(drawable);
                            fetVar.o0(objP);
                        }
                        pm80 pm80Var5 = (pm80) objP;
                        if (y3dVar8 != null) {
                            j3 = y3dVar8.f41946a;
                        } else {
                            j3 = y3d.g;
                        }
                        z2 = false;
                        dww.c(pm80Var5, null, mm40Var, j3, fetVar, ((i11 << 6) & 896) | 56, 0);
                        fetVar.r(false);
                    }
                    fetVar.r(z2);
                } else {
                    if (o0xVar instanceof m0x) {
                        fetVar.e0(-358986003);
                        pm80 pm80VarF5 = a8k0.F(((m0x) o0xVar).f20977a, 0, fetVar);
                        if (y3dVar8 != null) {
                            j2 = y3dVar8.f41946a;
                        } else {
                            j2 = y3d.g;
                        }
                        dww.c(pm80VarF5, null, mm40Var, j2, fetVar, 56 | ((i11 << 6) & 896), 0);
                        fetVar.r(false);
                    } else {
                        if (!(o0xVar instanceof n0x)) {
                            throw b1j.f(-1397067588, fetVar, false);
                        }
                        fetVar.e0(-358704895);
                        int i117 = 523390 & i11;
                        int i118 = i11 << 3;
                        int i119 = (i118 & 1879048192) | i117 | (29360128 & i118) | (234881024 & i118);
                        mm40Var6 = mm40Var5;
                        y3dVar9 = y3dVar7;
                        u12 u12Var8 = u12Var2;
                        d(mm40Var, mm40Var6, ((n0x) o0xVar).f22722a, num, y3dVar9, y3dVar8, u12Var8, qgeVar2, a4xVar3, fetVar, i119);
                        y3dVar4 = y3dVar8;
                        u12Var2 = u12Var8;
                        fetVar.r(false);
                    }
                    mm40Var4 = mm40Var6;
                    y3dVar5 = y3dVar9;
                    a4xVar2 = a4xVar3;
                }
                mm40Var6 = mm40Var5;
                y3dVar9 = y3dVar7;
                y3dVar4 = y3dVar8;
                mm40Var4 = mm40Var6;
                y3dVar5 = y3dVar9;
                a4xVar2 = a4xVar3;
            } else {
                fetVar.X();
                a4xVar2 = a4xVar;
                mm40Var4 = mm40Var3;
                y3dVar5 = y3dVar3;
            }
            y3dVar6 = y3dVar4;
            u12Var3 = u12Var2;
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new Function2() { // from class: a.cz3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        uc9.c(mm40Var, mm40Var4, o0xVar, num, y3dVar5, y3dVar6, u12Var3, qgeVar, a4xVar2, (fet) obj, x8x.L(i2 | 1), i3);
                        return Unit.f46060a;
                    }
                };
            }
        }
        i4 |= 24576;
        y3dVar3 = y3dVar;
        i5 = i3 & 32;
        if (i5 != 0) {
            if ((196608 & i2) == 0) {
                y3dVar4 = y3dVar2;
                if (fetVar.g(y3dVar4)) {
                    i6 = 131072;
                } else {
                    i6 = 65536;
                }
                i4 |= i6;
            }
            i7 = i3 & 64;
            if (i7 != 0) {
                if ((1572864 & i2) == 0) {
                    u12Var2 = u12Var;
                    if (fetVar.g(u12Var2)) {
                        i8 = 1048576;
                    } else {
                        i8 = 524288;
                    }
                    i4 |= i8;
                }
                if ((12582912 & i2) == 0) {
                    qgeVar2 = qgeVar;
                    if (fetVar.g(qgeVar2)) {
                        i12 = 8388608;
                    } else {
                        i12 = 4194304;
                    }
                    i4 |= i12;
                } else {
                    qgeVar2 = qgeVar;
                }
                i9 = i3 & 256;
                if (i9 != 0) {
                    i4 |= 100663296;
                } else if ((i2 & 100663296) == 0) {
                    if (fetVar.i(a4xVar)) {
                        i10 = 67108864;
                    } else {
                        i10 = 33554432;
                    }
                    i4 |= i10;
                }
                if ((i4 & 38347923) != 38347922) {
                    z = true;
                } else {
                    z = false;
                }
                if (fetVar.U(i4 & 1, z)) {
                    fetVar.Z();
                    if ((i2 & 1) != 0) {
                        if ((i3 & 2) != 0) {
                            i4 &= -113;
                            mm40Var3 = mm40Var;
                        }
                        if (i14 != 0) {
                            y3dVar3 = null;
                        }
                        if (i5 != 0) {
                            y3dVar4 = null;
                        }
                        if (i7 != 0) {
                            u12Var2 = gqw0.e;
                        }
                        if (i9 != 0) {
                            a4xVar3 = lak0.c;
                        } else {
                            a4xVar3 = a4xVar;
                        }
                    } else {
                        if ((i3 & 2) != 0) {
                            i4 &= -113;
                            mm40Var3 = mm40Var;
                        }
                        if (i14 != 0) {
                            y3dVar3 = null;
                        }
                        if (i5 != 0) {
                            y3dVar4 = null;
                        }
                        if (i7 != 0) {
                            u12Var2 = gqw0.e;
                        }
                        if (i9 != 0) {
                            a4xVar3 = lak0.c;
                        } else {
                            a4xVar3 = a4xVar;
                        }
                    }
                    mm40Var5 = mm40Var3;
                    y3dVar7 = y3dVar3;
                    i11 = i4;
                    y3dVar8 = y3dVar4;
                    fetVar.s();
                    if (o0xVar instanceof l0x) {
                        fetVar.e0(-359361630);
                        drawable = ((l0x) o0xVar).f19222a;
                        if (drawable == null) {
                            fetVar.e0(-359361631);
                            fetVar.r(false);
                            z2 = false;
                        } else {
                            fetVar.e0(-359361630);
                            objP = fetVar.P();
                            if (objP == ukd.f35823a) {
                                objP = u7x.v(drawable);
                                fetVar.o0(objP);
                            }
                            pm80 pm80Var6 = (pm80) objP;
                            if (y3dVar8 != null) {
                                j3 = y3dVar8.f41946a;
                            } else {
                                j3 = y3d.g;
                            }
                            z2 = false;
                            dww.c(pm80Var6, null, mm40Var, j3, fetVar, ((i11 << 6) & 896) | 56, 0);
                            fetVar.r(false);
                        }
                        fetVar.r(z2);
                    } else {
                        if (o0xVar instanceof m0x) {
                            fetVar.e0(-358986003);
                            pm80 pm80VarF6 = a8k0.F(((m0x) o0xVar).f20977a, 0, fetVar);
                            if (y3dVar8 != null) {
                                j2 = y3dVar8.f41946a;
                            } else {
                                j2 = y3d.g;
                            }
                            dww.c(pm80VarF6, null, mm40Var, j2, fetVar, 56 | ((i11 << 6) & 896), 0);
                            fetVar.r(false);
                        } else {
                            if (!(o0xVar instanceof n0x)) {
                                throw b1j.f(-1397067588, fetVar, false);
                            }
                            fetVar.e0(-358704895);
                            int i1110 = 523390 & i11;
                            int i1111 = i11 << 3;
                            int i1112 = (i1111 & 1879048192) | i1110 | (29360128 & i1111) | (234881024 & i1111);
                            mm40Var6 = mm40Var5;
                            y3dVar9 = y3dVar7;
                            u12 u12Var9 = u12Var2;
                            d(mm40Var, mm40Var6, ((n0x) o0xVar).f22722a, num, y3dVar9, y3dVar8, u12Var9, qgeVar2, a4xVar3, fetVar, i1112);
                            y3dVar4 = y3dVar8;
                            u12Var2 = u12Var9;
                            fetVar.r(false);
                        }
                        mm40Var4 = mm40Var6;
                        y3dVar5 = y3dVar9;
                        a4xVar2 = a4xVar3;
                    }
                    mm40Var6 = mm40Var5;
                    y3dVar9 = y3dVar7;
                    y3dVar4 = y3dVar8;
                    mm40Var4 = mm40Var6;
                    y3dVar5 = y3dVar9;
                    a4xVar2 = a4xVar3;
                } else {
                    fetVar.X();
                    a4xVar2 = a4xVar;
                    mm40Var4 = mm40Var3;
                    y3dVar5 = y3dVar3;
                }
                y3dVar6 = y3dVar4;
                u12Var3 = u12Var2;
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new Function2() { // from class: a.cz3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            uc9.c(mm40Var, mm40Var4, o0xVar, num, y3dVar5, y3dVar6, u12Var3, qgeVar, a4xVar2, (fet) obj, x8x.L(i2 | 1), i3);
                            return Unit.f46060a;
                        }
                    };
                }
            }
            i4 |= 1572864;
            u12Var2 = u12Var;
            if ((12582912 & i2) == 0) {
                qgeVar2 = qgeVar;
                if (fetVar.g(qgeVar2)) {
                    i12 = 8388608;
                } else {
                    i12 = 4194304;
                }
                i4 |= i12;
            } else {
                qgeVar2 = qgeVar;
            }
            i9 = i3 & 256;
            if (i9 != 0) {
                i4 |= 100663296;
            } else if ((i2 & 100663296) == 0) {
                if (fetVar.i(a4xVar)) {
                    i10 = 67108864;
                } else {
                    i10 = 33554432;
                }
                i4 |= i10;
            }
            if ((i4 & 38347923) != 38347922) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar.U(i4 & 1, z)) {
                fetVar.Z();
                if ((i2 & 1) != 0) {
                    if ((i3 & 2) != 0) {
                        i4 &= -113;
                        mm40Var3 = mm40Var;
                    }
                    if (i14 != 0) {
                        y3dVar3 = null;
                    }
                    if (i5 != 0) {
                        y3dVar4 = null;
                    }
                    if (i7 != 0) {
                        u12Var2 = gqw0.e;
                    }
                    if (i9 != 0) {
                        a4xVar3 = lak0.c;
                    } else {
                        a4xVar3 = a4xVar;
                    }
                } else {
                    if ((i3 & 2) != 0) {
                        i4 &= -113;
                        mm40Var3 = mm40Var;
                    }
                    if (i14 != 0) {
                        y3dVar3 = null;
                    }
                    if (i5 != 0) {
                        y3dVar4 = null;
                    }
                    if (i7 != 0) {
                        u12Var2 = gqw0.e;
                    }
                    if (i9 != 0) {
                        a4xVar3 = lak0.c;
                    } else {
                        a4xVar3 = a4xVar;
                    }
                }
                mm40Var5 = mm40Var3;
                y3dVar7 = y3dVar3;
                i11 = i4;
                y3dVar8 = y3dVar4;
                fetVar.s();
                if (o0xVar instanceof l0x) {
                    fetVar.e0(-359361630);
                    drawable = ((l0x) o0xVar).f19222a;
                    if (drawable == null) {
                        fetVar.e0(-359361631);
                        fetVar.r(false);
                        z2 = false;
                    } else {
                        fetVar.e0(-359361630);
                        objP = fetVar.P();
                        if (objP == ukd.f35823a) {
                            objP = u7x.v(drawable);
                            fetVar.o0(objP);
                        }
                        pm80 pm80Var7 = (pm80) objP;
                        if (y3dVar8 != null) {
                            j3 = y3dVar8.f41946a;
                        } else {
                            j3 = y3d.g;
                        }
                        z2 = false;
                        dww.c(pm80Var7, null, mm40Var, j3, fetVar, ((i11 << 6) & 896) | 56, 0);
                        fetVar.r(false);
                    }
                    fetVar.r(z2);
                } else {
                    if (o0xVar instanceof m0x) {
                        fetVar.e0(-358986003);
                        pm80 pm80VarF7 = a8k0.F(((m0x) o0xVar).f20977a, 0, fetVar);
                        if (y3dVar8 != null) {
                            j2 = y3dVar8.f41946a;
                        } else {
                            j2 = y3d.g;
                        }
                        dww.c(pm80VarF7, null, mm40Var, j2, fetVar, 56 | ((i11 << 6) & 896), 0);
                        fetVar.r(false);
                    } else {
                        if (!(o0xVar instanceof n0x)) {
                            throw b1j.f(-1397067588, fetVar, false);
                        }
                        fetVar.e0(-358704895);
                        int i1113 = 523390 & i11;
                        int i1114 = i11 << 3;
                        int i1115 = (i1114 & 1879048192) | i1113 | (29360128 & i1114) | (234881024 & i1114);
                        mm40Var6 = mm40Var5;
                        y3dVar9 = y3dVar7;
                        u12 u12Var10 = u12Var2;
                        d(mm40Var, mm40Var6, ((n0x) o0xVar).f22722a, num, y3dVar9, y3dVar8, u12Var10, qgeVar2, a4xVar3, fetVar, i1115);
                        y3dVar4 = y3dVar8;
                        u12Var2 = u12Var10;
                        fetVar.r(false);
                    }
                    mm40Var4 = mm40Var6;
                    y3dVar5 = y3dVar9;
                    a4xVar2 = a4xVar3;
                }
                mm40Var6 = mm40Var5;
                y3dVar9 = y3dVar7;
                y3dVar4 = y3dVar8;
                mm40Var4 = mm40Var6;
                y3dVar5 = y3dVar9;
                a4xVar2 = a4xVar3;
            } else {
                fetVar.X();
                a4xVar2 = a4xVar;
                mm40Var4 = mm40Var3;
                y3dVar5 = y3dVar3;
            }
            y3dVar6 = y3dVar4;
            u12Var3 = u12Var2;
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new Function2() { // from class: a.cz3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        uc9.c(mm40Var, mm40Var4, o0xVar, num, y3dVar5, y3dVar6, u12Var3, qgeVar, a4xVar2, (fet) obj, x8x.L(i2 | 1), i3);
                        return Unit.f46060a;
                    }
                };
            }
        }
        i4 |= 196608;
        y3dVar4 = y3dVar2;
        i7 = i3 & 64;
        if (i7 != 0) {
            if ((1572864 & i2) == 0) {
                u12Var2 = u12Var;
                if (fetVar.g(u12Var2)) {
                    i8 = 1048576;
                } else {
                    i8 = 524288;
                }
                i4 |= i8;
            }
            if ((12582912 & i2) == 0) {
                qgeVar2 = qgeVar;
                if (fetVar.g(qgeVar2)) {
                    i12 = 8388608;
                } else {
                    i12 = 4194304;
                }
                i4 |= i12;
            } else {
                qgeVar2 = qgeVar;
            }
            i9 = i3 & 256;
            if (i9 != 0) {
                i4 |= 100663296;
            } else if ((i2 & 100663296) == 0) {
                if (fetVar.i(a4xVar)) {
                    i10 = 67108864;
                } else {
                    i10 = 33554432;
                }
                i4 |= i10;
            }
            if ((i4 & 38347923) != 38347922) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar.U(i4 & 1, z)) {
                fetVar.Z();
                if ((i2 & 1) != 0) {
                    if ((i3 & 2) != 0) {
                        i4 &= -113;
                        mm40Var3 = mm40Var;
                    }
                    if (i14 != 0) {
                        y3dVar3 = null;
                    }
                    if (i5 != 0) {
                        y3dVar4 = null;
                    }
                    if (i7 != 0) {
                        u12Var2 = gqw0.e;
                    }
                    if (i9 != 0) {
                        a4xVar3 = lak0.c;
                    } else {
                        a4xVar3 = a4xVar;
                    }
                } else {
                    if ((i3 & 2) != 0) {
                        i4 &= -113;
                        mm40Var3 = mm40Var;
                    }
                    if (i14 != 0) {
                        y3dVar3 = null;
                    }
                    if (i5 != 0) {
                        y3dVar4 = null;
                    }
                    if (i7 != 0) {
                        u12Var2 = gqw0.e;
                    }
                    if (i9 != 0) {
                        a4xVar3 = lak0.c;
                    } else {
                        a4xVar3 = a4xVar;
                    }
                }
                mm40Var5 = mm40Var3;
                y3dVar7 = y3dVar3;
                i11 = i4;
                y3dVar8 = y3dVar4;
                fetVar.s();
                if (o0xVar instanceof l0x) {
                    fetVar.e0(-359361630);
                    drawable = ((l0x) o0xVar).f19222a;
                    if (drawable == null) {
                        fetVar.e0(-359361631);
                        fetVar.r(false);
                        z2 = false;
                    } else {
                        fetVar.e0(-359361630);
                        objP = fetVar.P();
                        if (objP == ukd.f35823a) {
                            objP = u7x.v(drawable);
                            fetVar.o0(objP);
                        }
                        pm80 pm80Var8 = (pm80) objP;
                        if (y3dVar8 != null) {
                            j3 = y3dVar8.f41946a;
                        } else {
                            j3 = y3d.g;
                        }
                        z2 = false;
                        dww.c(pm80Var8, null, mm40Var, j3, fetVar, ((i11 << 6) & 896) | 56, 0);
                        fetVar.r(false);
                    }
                    fetVar.r(z2);
                } else {
                    if (o0xVar instanceof m0x) {
                        fetVar.e0(-358986003);
                        pm80 pm80VarF8 = a8k0.F(((m0x) o0xVar).f20977a, 0, fetVar);
                        if (y3dVar8 != null) {
                            j2 = y3dVar8.f41946a;
                        } else {
                            j2 = y3d.g;
                        }
                        dww.c(pm80VarF8, null, mm40Var, j2, fetVar, 56 | ((i11 << 6) & 896), 0);
                        fetVar.r(false);
                    } else {
                        if (!(o0xVar instanceof n0x)) {
                            throw b1j.f(-1397067588, fetVar, false);
                        }
                        fetVar.e0(-358704895);
                        int i1116 = 523390 & i11;
                        int i1117 = i11 << 3;
                        int i1118 = (i1117 & 1879048192) | i1116 | (29360128 & i1117) | (234881024 & i1117);
                        mm40Var6 = mm40Var5;
                        y3dVar9 = y3dVar7;
                        u12 u12Var11 = u12Var2;
                        d(mm40Var, mm40Var6, ((n0x) o0xVar).f22722a, num, y3dVar9, y3dVar8, u12Var11, qgeVar2, a4xVar3, fetVar, i1118);
                        y3dVar4 = y3dVar8;
                        u12Var2 = u12Var11;
                        fetVar.r(false);
                    }
                    mm40Var4 = mm40Var6;
                    y3dVar5 = y3dVar9;
                    a4xVar2 = a4xVar3;
                }
                mm40Var6 = mm40Var5;
                y3dVar9 = y3dVar7;
                y3dVar4 = y3dVar8;
                mm40Var4 = mm40Var6;
                y3dVar5 = y3dVar9;
                a4xVar2 = a4xVar3;
            } else {
                fetVar.X();
                a4xVar2 = a4xVar;
                mm40Var4 = mm40Var3;
                y3dVar5 = y3dVar3;
            }
            y3dVar6 = y3dVar4;
            u12Var3 = u12Var2;
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new Function2() { // from class: a.cz3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        uc9.c(mm40Var, mm40Var4, o0xVar, num, y3dVar5, y3dVar6, u12Var3, qgeVar, a4xVar2, (fet) obj, x8x.L(i2 | 1), i3);
                        return Unit.f46060a;
                    }
                };
            }
        }
        i4 |= 1572864;
        u12Var2 = u12Var;
        if ((12582912 & i2) == 0) {
            qgeVar2 = qgeVar;
            if (fetVar.g(qgeVar2)) {
                i12 = 8388608;
            } else {
                i12 = 4194304;
            }
            i4 |= i12;
        } else {
            qgeVar2 = qgeVar;
        }
        i9 = i3 & 256;
        if (i9 != 0) {
            i4 |= 100663296;
        } else if ((i2 & 100663296) == 0) {
            if (fetVar.i(a4xVar)) {
                i10 = 67108864;
            } else {
                i10 = 33554432;
            }
            i4 |= i10;
        }
        if ((i4 & 38347923) != 38347922) {
            z = true;
        } else {
            z = false;
        }
        if (fetVar.U(i4 & 1, z)) {
            fetVar.Z();
            if ((i2 & 1) != 0) {
                if ((i3 & 2) != 0) {
                    i4 &= -113;
                    mm40Var3 = mm40Var;
                }
                if (i14 != 0) {
                    y3dVar3 = null;
                }
                if (i5 != 0) {
                    y3dVar4 = null;
                }
                if (i7 != 0) {
                    u12Var2 = gqw0.e;
                }
                if (i9 != 0) {
                    a4xVar3 = lak0.c;
                } else {
                    a4xVar3 = a4xVar;
                }
            } else {
                if ((i3 & 2) != 0) {
                    i4 &= -113;
                    mm40Var3 = mm40Var;
                }
                if (i14 != 0) {
                    y3dVar3 = null;
                }
                if (i5 != 0) {
                    y3dVar4 = null;
                }
                if (i7 != 0) {
                    u12Var2 = gqw0.e;
                }
                if (i9 != 0) {
                    a4xVar3 = lak0.c;
                } else {
                    a4xVar3 = a4xVar;
                }
            }
            mm40Var5 = mm40Var3;
            y3dVar7 = y3dVar3;
            i11 = i4;
            y3dVar8 = y3dVar4;
            fetVar.s();
            if (o0xVar instanceof l0x) {
                fetVar.e0(-359361630);
                drawable = ((l0x) o0xVar).f19222a;
                if (drawable == null) {
                    fetVar.e0(-359361631);
                    fetVar.r(false);
                    z2 = false;
                } else {
                    fetVar.e0(-359361630);
                    objP = fetVar.P();
                    if (objP == ukd.f35823a) {
                        objP = u7x.v(drawable);
                        fetVar.o0(objP);
                    }
                    pm80 pm80Var9 = (pm80) objP;
                    if (y3dVar8 != null) {
                        j3 = y3dVar8.f41946a;
                    } else {
                        j3 = y3d.g;
                    }
                    z2 = false;
                    dww.c(pm80Var9, null, mm40Var, j3, fetVar, ((i11 << 6) & 896) | 56, 0);
                    fetVar.r(false);
                }
                fetVar.r(z2);
            } else {
                if (o0xVar instanceof m0x) {
                    fetVar.e0(-358986003);
                    pm80 pm80VarF9 = a8k0.F(((m0x) o0xVar).f20977a, 0, fetVar);
                    if (y3dVar8 != null) {
                        j2 = y3dVar8.f41946a;
                    } else {
                        j2 = y3d.g;
                    }
                    dww.c(pm80VarF9, null, mm40Var, j2, fetVar, 56 | ((i11 << 6) & 896), 0);
                    fetVar.r(false);
                } else {
                    if (!(o0xVar instanceof n0x)) {
                        throw b1j.f(-1397067588, fetVar, false);
                    }
                    fetVar.e0(-358704895);
                    int i1119 = 523390 & i11;
                    int i11110 = i11 << 3;
                    int i11111 = (i11110 & 1879048192) | i1119 | (29360128 & i11110) | (234881024 & i11110);
                    mm40Var6 = mm40Var5;
                    y3dVar9 = y3dVar7;
                    u12 u12Var12 = u12Var2;
                    d(mm40Var, mm40Var6, ((n0x) o0xVar).f22722a, num, y3dVar9, y3dVar8, u12Var12, qgeVar2, a4xVar3, fetVar, i11111);
                    y3dVar4 = y3dVar8;
                    u12Var2 = u12Var12;
                    fetVar.r(false);
                }
                mm40Var4 = mm40Var6;
                y3dVar5 = y3dVar9;
                a4xVar2 = a4xVar3;
            }
            mm40Var6 = mm40Var5;
            y3dVar9 = y3dVar7;
            y3dVar4 = y3dVar8;
            mm40Var4 = mm40Var6;
            y3dVar5 = y3dVar9;
            a4xVar2 = a4xVar3;
        } else {
            fetVar.X();
            a4xVar2 = a4xVar;
            mm40Var4 = mm40Var3;
            y3dVar5 = y3dVar3;
        }
        y3dVar6 = y3dVar4;
        u12Var3 = u12Var2;
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.cz3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    uc9.c(mm40Var, mm40Var4, o0xVar, num, y3dVar5, y3dVar6, u12Var3, qgeVar, a4xVar2, (fet) obj, x8x.L(i2 | 1), i3);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static void c0(int i2, int[] iArr, int[] iArr2, boolean z) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        float length = (i2 - i4) / (iArr.length + 1);
        if (z) {
            float f2 = length;
            for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                int i6 = iArr[length2];
                iArr2[length2] = Math.round(f2);
                f2 += i6 + length;
            }
            return;
        }
        int length3 = iArr.length;
        float f3 = length;
        int i7 = 0;
        while (i3 < length3) {
            int i8 = iArr[i3];
            iArr2[i7] = Math.round(f3);
            f3 += i8 + length;
            i3++;
            i7++;
        }
    }

    public static final void d(mm40 mm40Var, mm40 mm40Var2, String str, Integer num, y3d y3dVar, y3d y3dVar2, u12 u12Var, qge qgeVar, a4x a4xVar, fet fetVar, int i2) {
        mm40 mm40Var3;
        int i3;
        mm40 mm40Var4;
        u12 u12Var2;
        long j2;
        fet fetVar2 = fetVar;
        str.getClass();
        fetVar2.g0(41498346);
        if ((i2 & 6) == 0) {
            mm40Var3 = mm40Var;
            i3 = (fetVar2.g(mm40Var3) ? 4 : 2) | i2;
        } else {
            mm40Var3 = mm40Var;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            mm40Var4 = mm40Var2;
            i3 |= fetVar2.g(mm40Var4) ? 32 : 16;
        } else {
            mm40Var4 = mm40Var2;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar2.g(str) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar2.g(num) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar2.g(y3dVar) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar2.g(y3dVar2) ? 131072 : 65536;
        }
        int i4 = i3 | 1572864;
        if ((12582912 & i2) == 0) {
            u12Var2 = u12Var;
            i4 |= fetVar2.g(u12Var2) ? 8388608 : 4194304;
        } else {
            u12Var2 = u12Var;
        }
        if ((100663296 & i2) == 0) {
            i4 |= fetVar2.g(qgeVar) ? 67108864 : 33554432;
        }
        if ((805306368 & i2) == 0) {
            i4 |= fetVar2.i(a4xVar) ? 536870912 : 268435456;
        }
        if (fetVar2.U(i4 & 1, (306783379 & i4) != 306783378)) {
            fetVar2.Z();
            if ((i2 & 1) != 0 && !fetVar2.B()) {
                fetVar2.X();
            }
            fetVar2.s();
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.e(hz3.f13888a);
                fetVar2.o0(objP);
            }
            pz40 pz40Var = (pz40) objP;
            k1x k1xVar = new k1x((Context) fetVar2.k(dy2.b));
            k1xVar.c = str;
            q1x.b(k1xVar, a4xVar);
            o1x o1xVarA = k1xVar.a();
            Object objP2 = fetVar2.P();
            if (objP2 == cl5Var) {
                objP2 = new we(pz40Var, (byte) 17);
                fetVar2.o0(objP2);
            }
            mz3 mz3VarX = l7x.X(o1xVarA, (Function1) objP2, qgeVar, fetVar2, ((i4 >> 15) & 7168) | 384, 18);
            lz3 lz3Var = (lz3) pz40Var.getValue();
            if (lz3Var != null) {
                if ((lz3Var instanceof kz3) || (lz3Var instanceof hz3)) {
                    fetVar2.e0(-672330979);
                    int i5 = ((i4 << 6) & 896) | 48;
                    int i6 = i4 >> 12;
                    j0x.b(mz3VarX, null, mm40Var3, u12Var2, qgeVar, 0.0f, y3dVar2 != null ? new m78(y3dVar2.f41946a, 5) : null, fetVar2, i5 | (i6 & 7168) | (i6 & 57344), 32);
                    fetVar2 = fetVar2;
                    fetVar2.r(false);
                } else if ((lz3Var instanceof iz3) || (lz3Var instanceof jz3)) {
                    fetVar2.e0(-671796446);
                    if (num != null) {
                        fetVar2.e0(-671756394);
                        pm80 pm80VarF = a8k0.F(num.intValue(), (i4 >> 9) & 14, fetVar2);
                        if (y3dVar == null) {
                            fetVar2.e0(1225264145);
                            j2 = ((y3d) fetVar2.k(yde.f42431a)).f41946a;
                            fetVar2.r(false);
                        } else {
                            fetVar2.e0(1225262998);
                            fetVar2.r(false);
                            j2 = y3dVar.f41946a;
                        }
                        dww.c(pm80VarF, null, mm40Var4, j2, fetVar, 56 | ((i4 << 3) & 896), 0);
                        fetVar2 = fetVar;
                        fetVar2.r(false);
                    } else {
                        fetVar2.e0(-671477704);
                        fetVar2.r(false);
                    }
                    fetVar2.r(false);
                }
            }
            throw b1j.f(1225234496, fetVar2, false);
        }
        fetVar2.X();
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ez3(mm40Var, (Object) mm40Var2, (Object) str, (Object) num, (Object) y3dVar, (Object) y3dVar2, (Object) u12Var, (Object) qgeVar, (Object) a4xVar, i2, (byte) 0);
        }
    }

    public static final pz40 d0(long j2, Function0 function0, fet fetVar, int i2) {
        boolean z = true;
        boolean z2 = (((i2 & 14) ^ 6) > 4 && fetVar.f(j2)) || (i2 & 6) == 4;
        Object objP = fetVar.P();
        Object obj = ukd.f35823a;
        if (z2 || objP == obj) {
            objP = androidx.compose.runtime.e.c(j2);
            fetVar.o0(objP);
        }
        egk0 egk0Var = (egk0) objP;
        boolean zG = fetVar.g(egk0Var);
        if ((((i2 & 112) ^ 48) <= 32 || !fetVar.g(function0)) && (i2 & 48) != 32) {
            z = false;
        }
        boolean z3 = zG | z;
        Object objP2 = fetVar.P();
        if (z3 || objP2 == obj) {
            objP2 = new l1(egk0Var, function0, null, (byte) 28);
            fetVar.o0(objP2);
        }
        m0x0.t(fetVar, egk0Var, (Function2) objP2);
        boolean zF = fetVar.f(egk0Var.l());
        Object objP3 = fetVar.P();
        if (zF || objP3 == obj) {
            objP3 = androidx.compose.runtime.e.e(StringsKt.b0(2, String.valueOf(egk0Var.l() / 86400000)));
            fetVar.o0(objP3);
        }
        pz40 pz40Var = (pz40) objP3;
        boolean zF2 = fetVar.f(egk0Var.l());
        Object objP4 = fetVar.P();
        if (zF2 || objP4 == obj) {
            objP4 = androidx.compose.runtime.e.e(StringsKt.b0(2, String.valueOf((egk0Var.l() / 3600000) % 24)));
            fetVar.o0(objP4);
        }
        pz40 pz40Var2 = (pz40) objP4;
        boolean zF3 = fetVar.f(egk0Var.l());
        Object objP5 = fetVar.P();
        if (zF3 || objP5 == obj) {
            objP5 = androidx.compose.runtime.e.e(StringsKt.b0(2, String.valueOf((egk0Var.l() / 60000) % 60)));
            fetVar.o0(objP5);
        }
        pz40 pz40Var3 = (pz40) objP5;
        boolean zF4 = fetVar.f(egk0Var.l());
        Object objP6 = fetVar.P();
        if (zF4 || objP6 == obj) {
            objP6 = androidx.compose.runtime.e.e(StringsKt.b0(2, String.valueOf((egk0Var.l() / 1000) % 60)));
            fetVar.o0(objP6);
        }
        pz40 pz40Var4 = (pz40) objP6;
        boolean zG2 = fetVar.g((String) pz40Var.getValue()) | fetVar.g((String) pz40Var2.getValue()) | fetVar.g((String) pz40Var3.getValue()) | fetVar.g((String) pz40Var4.getValue());
        Object objP7 = fetVar.P();
        if (zG2 || objP7 == obj) {
            objP7 = androidx.compose.runtime.e.e(new xnq0((String) pz40Var.getValue(), (String) pz40Var2.getValue(), (String) pz40Var3.getValue(), (String) pz40Var4.getValue()));
            fetVar.o0(objP7);
        }
        return (pz40) objP7;
    }

    public static final void e(mm40 mm40Var, String str, String str2, long j2, long j3, fet fetVar, int i2) {
        str2.getClass();
        if (fetVar.k(bmd.n) == k6z.f17794a) {
            fetVar.e0(1178399912);
            ny9.b(mm40Var, str, str2, j2, j3, fetVar, i2 & 4194302);
            fetVar.r(false);
        } else {
            fetVar.e0(1178708424);
            p8a.g(mm40Var, str, str2, j2, j3, fetVar, i2 & 4194302);
            fetVar.r(false);
        }
    }

    public static final void e0(Function2 function2, a2 a2Var, a2 a2Var2) throws Throwable {
        try {
            yje yjeVarB = pnx.b(pnx.a(a2Var, a2Var2, function2));
            e0g0 e0g0Var = j0g0.b;
            ovk.a(yjeVarB, Unit.f46060a);
        } catch (Throwable th) {
            th = th;
            if (th instanceof mvk) {
                th = ((mvk) th).f22460a;
            }
            e0g0 e0g0Var2 = j0g0.b;
            a2Var2.resumeWith(new g0g0(th));
            throw th;
        }
    }

    public static final void f(int i2, fet fetVar, mm40 mm40Var) {
        fetVar.g0(-607519933);
        int i3 = i2 | 6;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            float f2 = xfn.a(fetVar).d;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarL = s5x0.L(jm40Var, f2, 0.0f, 2);
            x5d x5dVarA = w5d.a(c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarL);
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
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 16.0f, 0.0f, 0.0f, 13);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE = o7k0.e(o7k0.s(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarN), 128.0f), 18.0f);
            vqm vqmVar = vqm.f37862a;
            zq8.a(0, fetVar, xbc.c0(mm40VarE, vbc.d0(vqmVar, fetVar, 6, 0)));
            zq8.a(0, fetVar, xbc.c0(o7k0.e(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, o7k0.d(s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), 1.0f)), 216.0f), vbc.d0(vqmVar, fetVar, 6, 0)));
            dw9.x(o7k0.e(o7k0.s(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13)), 128.0f), 18.0f), vbc.d0(vqmVar, fetVar, 6, 0), fetVar, 0, true);
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eg(mm40Var, i2, (byte) 26);
        }
    }

    public static final m97 f0(hao haoVar) {
        Double dI;
        haoVar.getClass();
        String str = haoVar.k;
        long j2 = haoVar.c;
        double dDoubleValue = haoVar.f;
        byte b2 = haoVar.q.f36034a;
        rh7 rh7Var = haoVar.m;
        String str2 = rh7Var.b;
        long j3 = rh7Var.f30476a;
        long j4 = haoVar.b;
        long j5 = haoVar.e;
        String str3 = haoVar.g;
        if (str3.length() != 0 && (dI = kotlin.text.b.i(str3)) != null) {
            dDoubleValue = dI.doubleValue();
        }
        return new m97(j2, (int) b2, (izc) null, false, false, j3, str2, j4, j5, dDoubleValue, haoVar.f, haoVar.d, haoVar.i, StringsKt.W(str) ? haoVar.l : str, haoVar.l, str, false, false, false, 0L, false, (zfa0) null, false, 0.0d, (String) null, 67043356);
    }

    public static final void g(int i2, fet fetVar, mm40 mm40Var, String str) {
        int i3;
        fet fetVar2 = fetVar;
        String str2 = str;
        str2.getClass();
        fetVar2.g0(1909224519);
        if ((i2 & 6) == 0) {
            i3 = i2 | (fetVar.g(mm40Var) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.g(str2) ? 32 : 16;
        }
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            StaticColors staticColors = StaticColors.INSTANCE;
            mm40 mm40VarQ = i120.Q(mm40Var, staticColors.m73getBlack400d7_KjU(), jd8.n);
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
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str, null, staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, g1t0.n(), fetVar2, (i3 >> 3) & 14, 0, 130042);
            str2 = str;
            fetVar2 = fetVar2;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cx(mm40Var, str2, i2, (byte) 5);
        }
    }

    public static final void h(mm40 mm40Var, ugd ugdVar, ugd ugdVar2, ugd ugdVar3, fet fetVar, int i2, int i3) {
        sw3 sw3Var = (i3 & 2) != 0 ? g : c;
        if ((i3 & 4) != 0) {
            ugdVar = null;
        }
        mm40 mm40VarE = mm40Var.e(o7k0.c);
        x5d x5dVarA = w5d.a(sw3Var, gqw0.m, fetVar, ((i2 & 112) >> 3) & 14);
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
        jpm0.o(fetVar, x5dVarA, gqw0.x);
        jpm0.o(fetVar, bh90VarM, gqw0.w);
        jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
        jpm0.n(fetVar);
        jpm0.o(fetVar, mm40VarC0, gqw0.v);
        mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
        Object obj = y5d.f42040a;
        if (ugdVar == null) {
            fetVar.e0(55279199);
        } else {
            fetVar.e0(-2076426782);
            ugdVar.j(obj, mm40VarD, fetVar, Integer.valueOf((i2 & 896) | 54));
        }
        fetVar.r(false);
        kr00.a(u1c.M(365456488, new fb8(ugdVar2, mm40VarD, (byte) 2), fetVar), fetVar, 6);
        ugdVar3.j(obj, mm40VarD, fetVar, Integer.valueOf(((i2 >> 6) & 896) | 54));
        fetVar.r(true);
    }

    public static final void i(ame0 ame0Var, fet fetVar, int i2) {
        fetVar.g0(695182685);
        int i3 = (fetVar.g(ame0Var) ? 4 : 2) | i2;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(1801726493, new xle0(ame0Var), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xle0(ame0Var, i2);
        }
    }

    public static final void j(f10 f10Var, Function1 function1, fet fetVar, int i2) {
        int i3;
        Function1 function2;
        int i4;
        boolean z;
        fet fetVar2;
        fet fetVar3 = fetVar;
        fetVar3.g0(660496138);
        int i5 = i2 & 6;
        y5d y5dVar = y5d.f42040a;
        if (i5 == 0) {
            i3 = (fetVar3.g(y5dVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar3.g(f10Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar3.i(function1) ? 256 : 128;
        }
        int i6 = i3;
        if (fetVar3.U(i6 & 1, (i6 & 147) != 146)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarB = y5dVar.b(s5x0.L(mm40VarD, qmk.a(fetVar3).e, 0.0f, 2), true);
            x5d x5dVarA = w5d.a(e, gqw0.n, fetVar3, 54);
            int iHashCode = Long.hashCode(fetVar3.T);
            bh90 bh90VarM = fetVar3.m();
            mm40 mm40VarC0 = kbc.c0(fetVar3, mm40VarB);
            mkd.c0.getClass();
            fetVar3.i0();
            if (fetVar3.S) {
                fetVar3.l(e7z.u1);
            } else {
                fetVar3.r0();
            }
            jpm0.o(fetVar3, x5dVarA, gqw0.x);
            jpm0.o(fetVar3, bh90VarM, gqw0.w);
            jpm0.o(fetVar3, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar3);
            jpm0.o(fetVar3, mm40VarC0, gqw0.v);
            j0x.b(iom0.r(jpm0.t(f10Var.f8740a, 6, fetVar3), fetVar3), null, o7k0.n(jm40Var, 100.0f), null, gqw0.h1, 0.0f, null, fetVar, 24632, 104);
            if (f10Var.b == null) {
                fetVar.e0(1626075786);
                fetVar.r(false);
                fetVar2 = fetVar;
                z = false;
                i4 = i6;
            } else {
                fetVar.e0(1626075787);
                mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 20.0f, 0.0f, 0.0f, 13);
                String str = f10Var.b;
                pz40 pz40Var = s6t0.f31722a;
                i4 = i6;
                z = false;
                v8q0.a(str, mm40VarN, s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.u, null, j1t0.b, 0L, null, 0, 0, qmk.H, 16646109), fetVar, 0, 0, 130040);
                fetVar2 = fetVar;
                fetVar2.r(false);
            }
            if (f10Var.c == null) {
                fetVar2.e0(1626426148);
                fetVar2.r(z);
                fetVar3 = fetVar2;
            } else {
                fetVar2.e0(1626426149);
                mm40 mm40VarN2 = s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13);
                String str2 = f10Var.c;
                pz40 pz40Var2 = s6t0.f31722a;
                v8q0.a(str2, mm40VarN2, s6t0.b().f33626a.getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.s, null, j1t0.c, 0L, null, 0, 0, qmk.G, 16646109), fetVar, 0, 0, 130040);
                fetVar3 = fetVar;
                fetVar3.r(z);
            }
            fetVar3.r(true);
            if (f10Var.d == null) {
                fetVar3.e0(1596741860);
                fetVar3.r(z);
                function2 = function1;
            } else {
                fetVar3.e0(1596741861);
                mtl mtlVar = f10Var.d;
                boolean z2 = (i4 & 896) == 256 ? true : z;
                Object objP = fetVar3.P();
                if (z2 || objP == ukd.f35823a) {
                    function2 = function1;
                    objP = new y7(function2, (byte) 14);
                    fetVar3.o0(objP);
                } else {
                    function2 = function1;
                }
                bkb.f(null, mtlVar, null, false, null, (Function1) objP, fetVar3, 0, 29);
                fetVar3.r(z);
            }
        } else {
            function2 = function1;
            fetVar3.X();
        }
        yfe0 yfe0VarU = fetVar3.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new x((Object) f10Var, (Object) function2, i2, (byte) 2);
        }
    }

    public static final void k(hhp0 hhp0Var, fet fetVar, int i2) {
        fetVar.g0(1694616289);
        int i3 = i2 | (fetVar.g(hhp0Var) ? 4 : 2);
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            n0q n0qVar = o7k0.c;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(n0qVar, 12.0f, 0.0f, 2);
            x5d x5dVarA = w5d.a(c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarL);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 12.0f, 0.0f, 0.0f, 13);
            wui0 wui0Var = wui0.b;
            String strW = rsm0.w(R.string.current_rating_chart_title, 0, fetVar);
            zfn zfnVar = zaq0.b;
            obc.q(mm40VarN, new rqm((vui0) new tui0(strW, new y3d(((ThemeColors) fetVar.k(zfnVar)).getTextPrimary())), (pui0) null, (pvi0) new mvi0(hhp0Var.f13077a, new y3d(((ThemeColors) fetVar.k(zfnVar)).getPrimary())), (d4d) null, (tvi0) null, wui0Var, false, (e900) null, 442), false, null, null, null, null, null, fetVar, 0, 252);
            obc.q(null, new rqm((vui0) new tui0(rsm0.w(R.string.average_rating_chart_title, 0, fetVar), new y3d(((ThemeColors) fetVar.k(zfnVar)).getTextPrimary())), (pui0) null, (pvi0) new mvi0(hhp0Var.b, new y3d(((ThemeColors) fetVar.k(zfnVar)).getPrimary())), (d4d) null, (tvi0) null, wui0.d, false, (e900) null, 442), false, null, null, null, null, null, fetVar, 0, 253);
            mm40 mm40VarN2 = s5x0.N(jm40Var, 0.0f, 12.0f, 0.0f, 24.0f, 5);
            long backgroundContent = ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent();
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarL2 = s5x0.L(i120.Q(mm40VarN2, backgroundContent, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 16.0f, 0.0f, 2);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarL2);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(710957853, new ygp0(hhp0Var), fetVar), fetVar, 56);
            fetVar.r(true);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ygp0(hhp0Var, i2);
        }
    }

    public static final void l(mm40 mm40Var, akl aklVar, Function1 function1, fet fetVar, int i2) {
        int i3;
        function1.getClass();
        fetVar.g0(1170801668);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(aklVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        if (!fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            fetVar.X();
        } else if (aklVar instanceof yjl) {
            fetVar.e0(-76641356);
            m(mm40Var, (yjl) aklVar, function1, fetVar, i3 & 1022);
            fetVar.r(false);
        } else {
            if (!(aklVar instanceof zjl)) {
                throw b1j.f(-141021769, fetVar, false);
            }
            fetVar.e0(-76384831);
            n(i3 & 14, fetVar, mm40Var);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ljl(mm40Var, aklVar, function1, i2, (byte) 1);
        }
    }

    public static final void m(mm40 mm40Var, yjl yjlVar, Function1 function1, fet fetVar, int i2) {
        int i3;
        String str;
        fet fetVar2 = fetVar;
        function1.getClass();
        fetVar2.g0(76049301);
        if ((i2 & 6) == 0) {
            i3 = (fetVar2.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.g(yjlVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar2.i(function1) ? 256 : 128;
        }
        int i4 = i3;
        if (fetVar2.U(i4 & 1, (i4 & 147) != 146)) {
            a4x a4xVar = yjlVar.f42744a;
            bkl bklVar = (bkl) CollectionsKt.firstOrNull(a4xVar);
            String str2 = bklVar != null ? bklVar.e : null;
            if (str2 == null) {
                str2 = "";
            }
            boolean zG = fetVar2.g(str2);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                objP = new hjm(str2, null, null, null, null, null, false, null, null, false, null, null, 8190);
                fetVar2.o0(objP);
            }
            hjm hjmVar = (hjm) objP;
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE = h97.e(zclVar, zclVar, zclVar, zclVar, mm40VarD);
            zfn zfnVar = zaq0.b;
            mm40 mm40VarM = s5x0.M(i120.Q(mm40VarE, ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent(), jd8.n), 16.0f, 8.0f, 16.0f, 16.0f);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarM);
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
            jpm0.o(fetVar2, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(qw3Var, xx7Var, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC1 = kbc.c0(fetVar2, jm40Var);
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
            mm40 mm40VarN = s5x0.N(o7k0.d(jm40Var, 1.0f), 0.0f, 0.0f, 0.0f, 8.0f, 7);
            x5d x5dVarA2 = w5d.a(c, xx7Var, fetVar2, 0);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarN);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA2, shdVar);
            jpm0.o(fetVar2, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC2, shdVar4);
            mm40 mm40VarG = o7k0.g(o7k0.d(jm40Var, 1.0f), 40.0f, 0.0f, 2);
            kjm kjmVar = kjm.f18392a;
            Object objP2 = fetVar2.P();
            if (objP2 == cl5Var) {
                objP2 = new xal((byte) 17);
                fetVar2.o0(objP2);
            }
            nkb.h(mm40VarG, hjmVar, kjmVar, (Function0) objP2, null, null, fetVar2, 3456, 48);
            mm40 mm40VarG2 = o7k0.g(o7k0.d(jm40Var, 1.0f), 14.0f, 0.0f, 2);
            bkl bklVar2 = (bkl) CollectionsKt.firstOrNull(a4xVar);
            String str3 = (bklVar2 == null || (str = bklVar2.f) == null) ? "" : str;
            long secondary = ((ThemeColors) fetVar2.k(zfnVar)).getSecondary();
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str3, mm40VarG2, secondary, null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 1, 0, null, g1t0.g(), fetVar, 0, 24960, 109560);
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.e0(-1357948712);
            Iterator<E> it = a4xVar.iterator();
            while (it.hasNext()) {
                p(null, (bkl) it.next(), function1, fetVar2, i4 & 896);
            }
            ohs0.x(fetVar2, false, true, true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new njl(mm40Var, yjlVar, function1, i2, (byte) 1);
        }
    }

    public static final void n(int i2, fet fetVar, mm40 mm40Var) {
        int i3;
        fetVar.g0(-969610733);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        byte b2 = 0;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 360.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            qxw.o(fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ujl(mm40Var, i2, b2);
        }
    }

    public static final void p(mm40 mm40Var, bkl bklVar, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(1597102250);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? fetVar2.g(bklVar) : fetVar2.i(bklVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar2.i(function1) ? 256 : 128;
        }
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            long jM95getGray0d7_KjU = ((StaticColors) fetVar2.k(m8m0.f21378a)).m95getGray0d7_KjU();
            Object[] objArr = new Object[0];
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = new j2l((byte) 9);
                fetVar2.o0(objP);
            }
            Function2 function2 = (Function2) objP;
            Object objP2 = fetVar2.P();
            if (objP2 == cl5Var) {
                objP2 = new n2l((byte) 29);
                fetVar2.o0(objP2);
            }
            v0h0 v0h0VarT = x8x.t((Function1) objP2, function2);
            Object objP3 = fetVar2.P();
            if (objP3 == cl5Var) {
                objP3 = new xal((byte) 18);
                fetVar2.o0(objP3);
            }
            Map map = (Map) e9x.R(objArr, v0h0VarT, (Function0) objP3, fetVar2, 384);
            boolean zG = fetVar2.g(map);
            Object objP4 = fetVar2.P();
            if (zG || objP4 == cl5Var) {
                y3d y3dVar = (y3d) map.get(Long.valueOf(bklVar.f2754a));
                if (y3dVar != null) {
                    jM95getGray0d7_KjU = y3dVar.f41946a;
                }
                objP4 = androidx.compose.runtime.e.e(new y3d(jM95getGray0d7_KjU));
                fetVar2.o0(objP4);
            }
            pz40 pz40Var = (pz40) objP4;
            Context context = (Context) fetVar2.k(dy2.b);
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = o7k0.e(jm40Var, 64.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE2 = h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE);
            int i4 = i3 & 112;
            boolean z = ((i3 & 896) == 256) | (i4 == 32 || ((i3 & 64) != 0 && fetVar2.i(bklVar)));
            Object objP5 = fetVar2.P();
            if (z || objP5 == cl5Var) {
                objP5 = new ojl(function1, bklVar, (byte) 1);
                fetVar2.o0(objP5);
            }
            mm40 mm40VarE0 = o2e.e0(i120.Q(y860.W(mm40VarE2, null, null, false, null, (Function0) objP5, 28), ((y3d) pz40Var.getValue()).f41946a, jd8.n), "DS_BANNER_BOX");
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE0);
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
            Object objA = bklVar.b.a();
            boolean z2 = false;
            mm40 mm40VarE1 = o2e.e0(ny9.O(3.25f, jr8.f16991a.b(o7k0.e(jm40Var, 64.0f), gqw0.c), false), "DS_BANNER_IMAGE");
            pge pgeVar = gqw0.A;
            boolean zI = fetVar2.i(map);
            if (i4 == 32 || ((i3 & 64) != 0 && fetVar2.i(bklVar))) {
                z2 = true;
            }
            boolean zG2 = zI | z2 | fetVar2.g(pz40Var) | fetVar2.i(context);
            Object objP6 = fetVar2.P();
            if (zG2 || objP6 == cl5Var) {
                vjl vjlVar = new vjl(map, bklVar, context, pz40Var, (byte) 0);
                fetVar2.o0(vjlVar);
                objP6 = vjlVar;
            }
            k7x.b(objA, null, mm40VarE1, null, null, null, null, (Function1) objP6, null, null, pgeVar, null, fetVar, 48, 6, 31608);
            fetVar2 = fetVar;
            P(s5x0.N(o7k0.c, 12.0f, 0.0f, 144.0f, 0.0f, 10), bklVar, fetVar2, i4);
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wjl(mm40Var2, bklVar, function1, i2, (byte) 0);
        }
    }

    public static final void q(mm40 mm40Var, mdm mdmVar, Function1 function1, fet fetVar, int i2) {
        mdm mdmVar2;
        mm40 mm40Var2;
        fetVar.g0(-1072801491);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            mdmVar2 = mdmVar;
            i3 |= fetVar.g(mdmVar2) ? 32 : 16;
        } else {
            mdmVar2 = mdmVar;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            float fT = knm0.t(1, fetVar, false);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, fT, 7);
            boolean z = (i3 & 896) == 256;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new s8o(function1, (byte) 15);
                fetVar.o0(objP);
            }
            jcb.l(mm40VarN, mdmVar2, false, (Function0) objP, fetVar, i3 & 112, 4);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wy0(mm40Var2, mdmVar, function1, i2, (byte) 11);
        }
    }

    public static final void r(mdm mdmVar, fet fetVar, int i2) {
        mdm mdmVar2;
        fet fetVar2;
        fetVar.g0(-1783356703);
        int i3 = (fetVar.g(mdmVar) ? 4 : 2) | i2;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC = o7k0.c(jm40Var, 1.0f);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarC);
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
            mm40 mm40VarB = jr8.f16991a.b(jm40Var, gqw0.e);
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new kdw((byte) 28);
                fetVar.o0(objP);
            }
            mdmVar2 = mdmVar;
            fetVar2 = fetVar;
            jcb.l(mm40VarB, mdmVar2, false, (Function0) objP, fetVar2, ((i3 << 3) & 112) | 3072, 4);
            fetVar2.r(true);
        } else {
            mdmVar2 = mdmVar;
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vl0(mdmVar2, i2, (byte) 8);
        }
    }

    public static final void s(mdm mdmVar, fet fetVar, int i2) {
        mdm mdmVar2;
        fet fetVar2;
        fetVar.g0(2135541029);
        int i3 = (fetVar.g(mdmVar) ? 4 : 2) | i2;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC = o7k0.c(jm40Var, 1.0f);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarC);
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
            mm40 mm40VarB = jr8.f16991a.b(jm40Var, gqw0.e);
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new o6e0((byte) 19);
                fetVar.o0(objP);
            }
            mdmVar2 = mdmVar;
            fetVar2 = fetVar;
            jcb.l(mm40VarB, mdmVar2, false, (Function0) objP, fetVar2, ((i3 << 3) & 112) | 3072, 4);
            fetVar2.r(true);
        } else {
            mdmVar2 = mdmVar;
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vl0(mdmVar2, i2, (byte) 12);
        }
    }

    public static final void t(bzl bzlVar, a4x a4xVar, boolean z, boolean z2, bdz bdzVar, Function1 function1, fet fetVar, int i2) {
        int i3;
        Object obj;
        boolean z3;
        Object c2pVar;
        int i4;
        fetVar.g0(619712958);
        int i5 = i2 & 6;
        jm40 jm40Var = jm40.b;
        if (i5 == 0) {
            i3 = (fetVar.g(jm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(bzlVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            obj = a4xVar;
            i3 |= fetVar.g(obj) ? 256 : 128;
        } else {
            obj = a4xVar;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.h(z) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            z3 = z2;
            i3 |= fetVar.h(z3) ? 16384 : 8192;
        } else {
            z3 = z2;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar.g(bdzVar) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= fetVar.i(function1) ? 1048576 : 524288;
        }
        if (fetVar.U(i3 & 1, (599187 & i3) != 599186)) {
            xcz xczVarB = bdzVar.b("FavoriteAggregatorList", fetVar);
            mm40 mm40VarV = cjx.V(jm40Var, bzlVar.a(new j6g0((byte) 17)), null);
            wom womVarF = mom.f(fetVar);
            Boolean boolValueOf = Boolean.valueOf(z3);
            int i6 = 3670016 & i3;
            boolean zG = ((i3 & 57344) == 16384) | fetVar.g(xczVarB) | (i6 == 1048576);
            Object objP = fetVar.P();
            Object obj2 = ukd.f35823a;
            if (zG || objP == obj2) {
                i4 = i6;
                c2pVar = new c2p(z2, xczVarB, function1, null, (byte) 0);
                fetVar.o0(c2pVar);
            } else {
                i4 = i6;
                c2pVar = objP;
            }
            m0x0.t(fetVar, boolValueOf, (Function2) c2pVar);
            n0q n0qVar = o7k0.c;
            boolean z4 = i4 == 1048576;
            Object objP2 = fetVar.P();
            if (z4 || objP2 == obj2) {
                objP2 = new s8o(function1, (byte) 18);
                fetVar.o0(objP2);
            }
            mom.c(n0qVar, z, womVarF, null, false, null, (Function0) objP2, null, u1c.M(2039733257, new x2g((Object) mm40VarV, (Object) xczVarB, obj, (Object) function1, (byte) 18), fetVar), fetVar, ((i3 >> 6) & 112) | 100663296, 184);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new b2p(bzlVar, a4xVar, z, z2, bdzVar, function1, i2, (byte) 0);
        }
    }

    public static final void u(g10 g10Var, Function1 function1, fet fetVar, int i2) {
        fetVar.g0(-132298822);
        int i3 = (fetVar.g(g10Var) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            n0q n0qVar = o7k0.c;
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, n0qVar);
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
            mdm mdmVar = g10Var.f10485a;
            boolean z = (i3 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new dn(function1, (byte) 12);
                fetVar.o0(objP);
            }
            jcb.l(null, mdmVar, false, (Function0) objP, fetVar, 0, 5);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mz7(g10Var, function1, i2, (byte) 20);
        }
    }

    public static final void v(mdm mdmVar, Function0 function0, fet fetVar, int i2) {
        fetVar.g0(1766430121);
        byte b2 = 4;
        int i3 = (fetVar.g(mdmVar) ? 4 : 2) | i2 | (fetVar.i(function0) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            n0q n0qVar = o7k0.c;
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, n0qVar);
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
            jcb.l(null, mdmVar, false, function0, fetVar, ((i3 << 3) & 112) | ((i3 << 6) & 7168), 5);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eu60(mdmVar, function0, i2, b2);
        }
    }

    public static final void w(mdm mdmVar, Function1 function1, fet fetVar, int i2) {
        fetVar.g0(-952174865);
        byte b2 = 2;
        int i3 = (fetVar.g(mdmVar) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC = o7k0.c(jm40Var, 1.0f);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarC);
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
            mm40 mm40VarB = jr8.f16991a.b(jm40Var, gqw0.e);
            boolean z = (i3 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new u9x(function1, b2);
                fetVar.o0(objP);
            }
            jcb.l(mm40VarB, mdmVar, false, (Function0) objP, fetVar, (i3 << 3) & 112, 4);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t48(mdmVar, function1, i2, (byte) 10);
        }
    }

    public static final void x(mdm mdmVar, Function1 function1, fet fetVar, int i2) {
        fetVar.g0(-907751849);
        int i3 = (fetVar.g(mdmVar) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC = o7k0.c(jm40Var, 1.0f);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarC);
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
            mm40 mm40VarB = jr8.f16991a.b(jm40Var, gqw0.e);
            boolean z = (i3 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new evd0(function1, (byte) 29);
                fetVar.o0(objP);
            }
            jcb.l(mm40VarB, mdmVar, false, (Function0) objP, fetVar, (i3 << 3) & 112, 4);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t48(mdmVar, function1, i2, (byte) 25);
        }
    }

    public static final void y(mm40 mm40Var, bzl bzlVar, bdz bdzVar, f2p f2pVar, Function1 function1, fet fetVar, int i2) {
        bdz bdzVar2;
        mm40 mm40Var2;
        bzl bzlVar2 = bzlVar;
        bdzVar.getClass();
        function1.getClass();
        fetVar.g0(1826531003);
        int i3 = i2 | 6;
        byte b2 = 16;
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(bzlVar2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            bdzVar2 = bdzVar;
            i3 |= fetVar.g(bdzVar2) ? 256 : 128;
        } else {
            bdzVar2 = bdzVar;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.g(f2pVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.i(function1) ? 16384 : 8192;
        }
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            int i4 = 57344 & i3;
            boolean z = i4 == 16384;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new s8o(function1, (byte) 14);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z2 = i4 == 16384;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new s8o(function1, b2);
                fetVar.o0(objP2);
            }
            v3c.z(function0, (Function0) objP2, null, fetVar, 0, 4);
            cie cieVar = f2pVar.f8823a;
            if (cieVar instanceof tge) {
                fetVar.e0(-1345313549);
                q(null, ((tge) cieVar).f33906a, function1, fetVar, (i3 >> 6) & 896);
                fetVar.r(false);
            } else if (cieVar instanceof zge) {
                fetVar.e0(-1345309645);
                q(null, ((zge) cieVar).f44342a, function1, fetVar, (i3 >> 6) & 896);
                fetVar.r(false);
            } else if (cieVar instanceof ehe) {
                fetVar.e0(1245211607);
                t(bzlVar, ((ehe) cieVar).f7803a, f2pVar.c, f2pVar.d, bdzVar2, function1, fetVar, (458752 & (i3 << 9)) | (i3 & 126) | ((i3 << 6) & 3670016));
                fetVar.r(false);
                bzlVar2 = bzlVar;
            } else if (cieVar instanceof lhe) {
                fetVar.e0(1245587172);
                bzlVar2 = bzlVar;
                b(f2pVar.c, bdzVar, bzlVar2, (lhe) cieVar, function1, fetVar, (i3 & 910) | ((i3 << 6) & 7168) | ((i3 << 3) & 458752));
                fetVar.r(false);
            } else {
                bzlVar2 = bzlVar;
                if (cieVar instanceof the) {
                    fetVar.e0(-1345282735);
                    J(bzlVar2, (the) cieVar, fetVar, i3 & 126);
                    fetVar.r(false);
                } else {
                    fetVar.e0(1246058279);
                    fetVar.r(false);
                }
            }
            mm40Var2 = jm40.b;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zf(mm40Var2, (Object) bzlVar2, (Object) bdzVar, (Object) f2pVar, (Object) function1, i2, (byte) 28);
        }
    }

    public static final void z(xkp xkpVar, boolean z, boolean z2, Function1 function1, fet fetVar, int i2) {
        uf5 of5Var;
        ugg0 ugg0Var;
        fetVar.g0(90821079);
        int i3 = i2 | (fetVar.g(xkpVar) ? 4 : 2) | (fetVar.h(z) ? 32 : 16) | (fetVar.h(z2) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            boolean z3 = xkpVar.h;
            boolean z4 = xkpVar.j;
            if (z3) {
                of5Var = new pf5(3, null);
            } else {
                of5Var = xkpVar.i ? new of5() : null;
            }
            if (z && z2) {
                zcl zclVar = qmk.i;
                ugg0 ugg0Var2 = vgg0.f37379a;
                ugg0Var = new ugg0(zclVar, zclVar, zclVar, zclVar);
            } else if (z) {
                zcl zclVar2 = qmk.i;
                zcl zclVar3 = qmk.f28987a;
                ugg0Var = new ugg0(zclVar2, zclVar2, zclVar3, zclVar3);
            } else if (!z2 || z4) {
                zcl zclVar4 = qmk.f28987a;
                ugg0 ugg0Var3 = vgg0.f37379a;
                ugg0Var = new ugg0(zclVar4, zclVar4, zclVar4, zclVar4);
            } else {
                zcl zclVar5 = qmk.i;
                zcl zclVar6 = qmk.f28987a;
                ugg0Var = new ugg0(zclVar6, zclVar6, zclVar5, zclVar5);
            }
            jm40 jm40Var = jm40.b;
            mm40 mm40VarJ = lgb.J(jm40Var, ugg0Var);
            zfn zfnVar = zaq0.b;
            mm40 mm40VarQ = i120.Q(mm40VarJ, ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), jd8.n);
            x5d x5dVarA = w5d.a(c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
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
            mm40 mm40VarM = s5x0.M(o2e.e0(jm40Var, "SPORT_CELL"), 4.0f, z ? 8.0f : 0.0f, 4.0f, (!z2 || z4) ? 0.0f : 8.0f);
            k7l0 k7l0Var = new k7l0(new a2l0(xkpVar.b, ((ThemeColors) fetVar.k(zfnVar)).getTextPrimary()), xkpVar.f, xkpVar.e, null, of5Var, xkpVar.j, Integer.valueOf(xkpVar.g.size()), 24);
            int i4 = i3 & 7168;
            int i5 = i3 & 14;
            boolean z5 = (i4 == 2048) | (i5 == 4);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z5 || objP == cl5Var) {
                objP = new tvy(function1, xkpVar, (byte) 2);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z6 = (i5 == 4) | (i4 == 2048);
            Object objP2 = fetVar.P();
            if (z6 || objP2 == cl5Var) {
                objP2 = new uvy(function1, xkpVar, (byte) 2);
                fetVar.o0(objP2);
            }
            xbc.o(mm40VarM, k7l0Var, null, null, false, function0, null, null, (Function1) objP2, fetVar, 0, 220);
            if (z4 || z2) {
                fetVar.e0(-110138571);
                fetVar.r(false);
            } else {
                fetVar.e0(-110357028);
                mbc.o(zfi0.f44303a, s5x0.L(o7k0.d(jm40Var, 1.0f), 16.0f, 0.0f, 2), false, fetVar, 6, 4);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new tp30(xkpVar, z, z2, function1, i2, (byte) 0);
        }
    }
}
