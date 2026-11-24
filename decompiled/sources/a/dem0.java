package a;

import android.content.res.Configuration;
import android.javax.sip.message.Response;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.CustomColors;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes2.dex */
public abstract class dem0 {
    public static void A(int i, int i2) {
        if (i < 0 || i > i2) {
            v4i0.m(z(i, i2, "index"));
        }
    }

    public static final void a(int i, fet fetVar, mm40 mm40Var, String str, String str2) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-630929196);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(str2) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            StaticColors staticColors = StaticColors.INSTANCE;
            v8q0.a(str, null, staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.d(), fetVar2, (i2 >> 3) & 14, 24960, 109562);
            fetVar2 = fetVar2;
            if (str2.length() > 0) {
                fetVar2.e0(1657943825);
                v8q0.a(str2, null, staticColors.m130getWhite600d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.f(), fetVar2, (i2 >> 6) & 14, 24960, 109562);
                fetVar2 = fetVar2;
                fetVar2.r(false);
            } else {
                fetVar2.e0(1658218020);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new man(mm40Var, str, str2, i, (byte) 21);
        }
    }

    public static final void b(String str, fet fetVar, int i) {
        String str2;
        fet fetVar2;
        fetVar.g0(1859092791);
        int i2 = (fetVar.g(str) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            StaticColors staticColors = StaticColors.INSTANCE;
            long jM126getWhite200d7_KjU = staticColors.m126getWhite200d7_KjU();
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = o7k0.n(jm40Var, 32.0f);
            zcl zclVar2 = qmk.e;
            ugg0 ugg0Var = vgg0.f37379a;
            fetVar2 = fetVar;
            str2 = str;
            lgb.v(i120.Q(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarN), staticColors.m73getBlack400d7_KjU(), new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), s5x0.J(i120.Q(o7k0.n(jm40Var, 32.0f), staticColors.m73getBlack400d7_KjU(), new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 6.0f), str2, R.drawable.ic_sport_valorant_27, jM126getWhite200d7_KjU, gqw0.A, fetVar2, ((i2 << 6) & 896) | 196608, 0);
        } else {
            str2 = str;
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yh20((byte) 29, i, str2);
        }
    }

    public static final void c(int i, fet fetVar, mm40 mm40Var, String str) {
        mm40 mm40Var2;
        fetVar.g0(-1357458850);
        int i2 = i | 6 | (fetVar.g(str) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40Var2 = jm40.b;
            mm40 mm40VarN = s5x0.N(o7k0.e(mm40Var2, 16.0f), 4.0f, 0.0f, 0.0f, 0.0f, 14);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarN);
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
            j6n.h(str, kpo0.f18685a, jr8.f16991a.b(mm40Var2, gqw0.e), 0, 0, fetVar, ((i2 >> 3) & 14) | 48, 24);
            fetVar.r(true);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new n040(mm40Var2, str, i, (byte) 24);
        }
    }

    public static final void d(ogm0 ogm0Var, fet fetVar, int i) {
        fetVar.g0(1109296983);
        int i2 = (fetVar.g(ogm0Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            lw3 lw3Var = uc9.f35418a;
            thg0 thg0VarA = shg0.a(lw3Var, gqw0.j, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar, jm40Var);
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
            jpm0.o(fetVar, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            String str = ogm0Var.c;
            String str2 = ogm0Var.d;
            b(str, fetVar, 0);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(o7k0.d(s5x0.N(jm40Var, 6.0f, 0.0f, 0.0f, 0.0f, 14), 1.0f), 32.0f);
            long jM73getBlack400d7_KjU = StaticColors.INSTANCE.m73getBlack400d7_KjU();
            zcl zclVar2 = qmk.e;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarN = s5x0.N(i120.Q(mm40VarE, jM73getBlack400d7_KjU, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 4.0f, 0.0f, 8.0f, 0.0f, 10);
            thg0 thg0VarA2 = shg0.a(lw3Var, gqw0.k, fetVar, 48);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarN);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA2, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            a(0, fetVar, s5x0.N(jm40Var, 6.0f, 0.0f, 0.0f, 0.0f, 14), ogm0Var.f25228a, ogm0Var.b);
            qxw.o(fetVar, new x7z(1.0f, true));
            if (str2.length() > 0) {
                fetVar.e0(-212291230);
                c(0, fetVar, null, str2);
                fetVar.r(false);
            } else {
                fetVar.e0(-212228765);
                fetVar.r(false);
            }
            fetVar.r(true);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new edk0(ogm0Var, i, (byte) 24);
        }
    }

    public static final void e(taq0 taq0Var, boolean z, ugd ugdVar, fet fetVar, int i, int i2) {
        int i3;
        boolean z2;
        int i4;
        ugd ugdVar2;
        taq0Var.getClass();
        fetVar.g0(1755438154);
        if ((i & 6) == 0) {
            i3 = i | (fetVar.g(taq0Var) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i4 = i3 | 48;
            z2 = z;
        } else {
            z2 = z;
            i4 = i3 | (fetVar.h(z2) ? 32 : 16);
        }
        if (fetVar.U(i4 & 1, (i4 & 147) != 146)) {
            if (i5 != 0) {
                z2 = false;
            }
            pz40 pz40Var = s6t0.f31722a;
            s6t0.d(taq0Var, z2);
            l5d0 l5d0VarA = xf80.f40779a.a(null);
            l5d0 l5d0VarA2 = zaq0.f44080a.a(Boolean.valueOf(z2));
            l5d0 l5d0VarA3 = zaq0.b.a(taq0Var.f33626a);
            l5d0 l5d0VarA4 = j7x.f16059a.a(taq0Var.b);
            l5d0 l5d0VarA5 = m8m0.f21378a.a(StaticColors.INSTANCE);
            l5d0 l5d0VarA6 = gxf.f12075a.a(CustomColors.INSTANCE);
            l5d0 l5d0VarA7 = jdv0.f16348a.a(taq0Var.c);
            l5d0 l5d0VarA8 = jjg.f16616a.a(ijg.f14872a);
            l5d0 l5d0VarA9 = ii0.f14805a.a(hi0.f13089a);
            l5d0 l5d0VarA10 = j1t0.e.a(g1t0.f10533a);
            l5d0 l5d0VarA11 = xfn.f40798a.a(xfn.a(fetVar));
            zfn zfnVar = jgn.f16489a;
            androidx.compose.runtime.d dVar = dy2.f6873a;
            l5d0 l5d0VarA12 = zfnVar.a(((Configuration) fetVar.k(dVar)).smallestScreenWidthDp < 600 ? ign.b : ign.c);
            zfn zfnVar2 = jr00.b;
            Configuration configuration = (Configuration) fetVar.k(dVar);
            boolean zG = fetVar.g(configuration);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                zhk zhkVar = configuration.smallestScreenWidthDp >= 600 ? xhk.f40896a : vhk.f37434a;
                int i6 = configuration.screenWidthDp;
                int i7 = configuration.screenHeightDp;
                la80 la80Var = i6 > i7 ? la80.b : la80.f19694a;
                float f = configuration.densityDpi / 160.0f;
                float f2 = configuration.fontScale;
                objP = new n8m0(new bwk(zhkVar, la80Var, i6, i7, new z6k(f, f2), f2, null, new t9o0(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f), new sly(0.0f, 0.0f, false), 56.0f));
                fetVar.o0(objP);
            }
            ugdVar2 = ugdVar;
            obc.e(new l5d0[]{l5d0VarA, l5d0VarA2, l5d0VarA3, l5d0VarA4, l5d0VarA5, l5d0VarA6, l5d0VarA7, l5d0VarA8, l5d0VarA9, l5d0VarA10, l5d0VarA11, l5d0VarA12, zfnVar2.a((cwk) objP)}, ugdVar2, fetVar, 48);
        } else {
            ugdVar2 = ugdVar;
            fetVar.X();
        }
        boolean z3 = z2;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new h08(taq0Var, z3, ugdVar2, i, i2);
        }
    }

    public static final void f(mm40 mm40Var, f4r0 f4r0Var, Function1 function1, fet fetVar, int i) {
        boolean z;
        fet fetVar2 = fetVar;
        f4r0Var.getClass();
        function1.getClass();
        fetVar2.g0(-936671018);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(f4r0Var) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            boolean z2 = f4r0Var instanceof e4r0;
            cl5 cl5Var = ukd.f35823a;
            if (z2) {
                fetVar2.e0(1802290043);
                mm40 mm40VarD = o7k0.d(s5x0.L(mm40Var, xfn.a(fetVar2).c, 0.0f, 2), 1.0f);
                a4x a4xVar = ((e4r0) f4r0Var).f7198a;
                zcl zclVar = qmk.f28987a;
                qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
                z = (i2 & 896) == 256;
                Object objP = fetVar2.P();
                if (z || objP == cl5Var) {
                    objP = new ru80(function1, (byte) 15);
                    fetVar2.o0(objP);
                }
                z1x.l(mm40VarD, a4xVar, qw3Var, (Function2) objP, fetVar2, 0);
                fetVar2 = fetVar2;
                fetVar2.r(false);
            } else {
                if (!(f4r0Var instanceof d4r0)) {
                    throw b1j.f(1802289056, fetVar2, false);
                }
                fetVar2.e0(36877736);
                mm40 mm40VarD2 = o7k0.d(mm40Var, 1.0f);
                zcl zclVar2 = qmk.f28987a;
                mm40 mm40VarE = o7k0.e(mm40VarD2, 200.0f);
                lh80 lh80VarT = s5x0.t(xfn.a(fetVar2).c, 0.0f, 2);
                qw3 qw3Var2 = new qw3(8.0f, true, new jf4((byte) 14));
                pvj pvjVar = new pvj(3);
                mcz mczVar = ddz.f5921a;
                Object[] objArr = {pvjVar};
                v0h0 v0h0Var = xcz.y;
                v0h0 v0h0VarL = qxw.L(new ebz(pvjVar, (byte) 5), new hvy((byte) 13));
                boolean zE = fetVar2.e(0) | fetVar2.e(0) | fetVar2.i(pvjVar);
                Object objP2 = fetVar2.P();
                if (zE || objP2 == cl5Var) {
                    objP2 = new rcz(pvjVar, (byte) 1);
                    fetVar2.o0(objP2);
                }
                xcz xczVar = (xcz) e9x.R(objArr, v0h0VarL, (Function0) objP2, fetVar2, 0);
                a4x a4xVar2 = ((d4r0) f4r0Var).f5469a;
                z = (i2 & 896) == 256;
                Object objP3 = fetVar2.P();
                if (z || objP3 == cl5Var) {
                    objP3 = new ru80(function1, (byte) 16);
                    fetVar2.o0(objP3);
                }
                r7x.d(0, qw3Var2, fetVar2, a4xVar2, xczVar, mm40VarE, lh80VarT, (Function2) objP3);
                fetVar2.r(false);
            }
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cgm0(mm40Var, f4r0Var, function1, i, (byte) 20);
        }
    }

    public static final void g(int i, fet fetVar, mm40 mm40Var, l7m0 l7m0Var, Function0 function0, Function0 function1) {
        int i2;
        l7m0 l7m0Var2;
        l7m0Var.getClass();
        function0.getClass();
        function1.getClass();
        fetVar.g0(675062921);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            l7m0Var2 = l7m0Var;
            i2 |= fetVar.g(l7m0Var2) ? 32 : 16;
        } else {
            l7m0Var2 = l7m0Var;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            StaticColors staticColors = StaticColors.INSTANCE;
            imm immVar = new imm(new ilm(staticColors.m123getWhite0d7_KjU()), new olm(((mtr0) l7m0Var2.getValue()).b, ((mtr0) l7m0Var2.getValue()).f22383a, staticColors.m123getWhite0d7_KjU(), staticColors.m123getWhite0d7_KjU(), new ea50(staticColors.m123getWhite0d7_KjU())), fmm.f9790a, staticColors.m121getTransparent0d7_KjU(), false, null);
            boolean z = (i2 & 7168) == 2048;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new xhl0(function1, (byte) 27);
                fetVar.o0(objP);
            }
            Function0 function2 = (Function0) objP;
            boolean z2 = (i2 & 896) == 256;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new xhl0(function0, (byte) 28);
                fetVar.o0(objP2);
            }
            hlm.c(mm40Var, immVar, null, function2, (Function0) objP2, null, null, null, null, null, null, null, fetVar, i2 & 14, 0, 4068);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new qmr0(mm40Var, l7m0Var2, function0, function1, i);
        }
    }

    public static final void h(mm40 mm40Var, z2k0 z2k0Var, fet fetVar, int i) {
        fetVar.g0(664634622);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(z2k0Var) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarJ = lgb.J(o7k0.d(mm40Var, 1.0f), fem0.k(z2k0Var.f, fetVar, 0));
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarQ = i120.Q(mm40VarJ, s6t0.b().f33626a.getBackgroundContent(), jd8.n);
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = mu90.o;
                fetVar.o0(objP);
            }
            tj30 tj30Var = (tj30) objP;
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
            jpm0.o(fetVar, tj30Var, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            i(z2k0Var, fetVar, (i2 >> 3) & 14);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new htr0(mm40Var, z2k0Var, i, (byte) 7);
        }
    }

    public static final void i(z2k0 z2k0Var, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        fetVar2.g0(949236530);
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? fetVar2.g(z2k0Var) : fetVar2.i(z2k0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (fetVar2.U(i2 & 1, (i2 & 3) != 2)) {
            xds0 xds0Var = z2k0Var.f;
            boolean z = xds0Var == xds0.b || xds0Var == xds0.c;
            jm40 jm40Var = jm40.b;
            v8q0.a(z2k0Var.b, o2e.e0(mrv.k0(jm40Var, CrashHianalyticsData.TIME), "TRANSACTION_CELL_TIME"), 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ibm0.n(g1t0.g(), fetVar2), fetVar, 48, 0, 131068);
            zcl zclVar = qmk.f28987a;
            j0x.b(a8k0.F(z2k0Var.c, 0, fetVar), null, o2e.e0(mrv.k0(o7k0.n(jm40Var, 16.0f), "icon"), "TRANSACTION_CELL_ICON"), null, null, 0.0f, null, fetVar, 56, 120);
            v8q0.a(z2k0Var.d, o2e.e0(mrv.k0(jm40Var, "description"), "TRANSACTION_CELL_DESCRIPTION"), 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ibm0.t(g1t0.g(), fetVar), fetVar, 48, 0, 131068);
            v8q0.b(z2k0Var.e, o2e.e0(mrv.k0(jm40Var, "amount"), "TRANSACTION_CELL_AMOUNT"), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, g1t0.d(), fetVar, 48, 0, 262140);
            fetVar2 = fetVar;
            if (z) {
                fetVar2.e0(642037885);
                mbc.o(zfi0.f44303a, o2e.e0(mrv.k0(jm40Var, "separator"), "TRANSACTION_CELL_SEPARATOR"), false, fetVar2, 54, 4);
                fetVar2.r(false);
            } else {
                fetVar2.e0(642246608);
                fetVar2.r(false);
            }
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nb50(z2k0Var, i, (byte) 27);
        }
    }

    public static final void j(jpu0 jpu0Var, d930 d930Var, Function1 function1, fet fetVar, int i) {
        int i2;
        Object otp0Var;
        Object obj;
        d930Var.getClass();
        function1.getClass();
        fetVar.g0(-4002585);
        int i3 = i & 6;
        jm40 jm40Var = jm40.b;
        if (i3 == 0) {
            i2 = (fetVar.g(jm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(jpu0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(d930Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            Object objP = fetVar.P();
            yje yjeVar = null;
            Object obj2 = ukd.f35823a;
            if (objP == obj2) {
                objP = androidx.compose.runtime.e.e(null);
                fetVar.o0(objP);
            }
            pz40 pz40Var = (pz40) objP;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 8.0f, 7);
            boolean z = (i2 & 7168) == 2048;
            Object objP2 = fetVar.P();
            if (z || objP2 == obj2) {
                objP2 = new jg2(pz40Var, function1, (byte) 24);
                fetVar.o0(objP2);
            }
            Function1 function2 = (Function1) objP2;
            int i4 = i2 & 112;
            int i5 = i2 & 896;
            boolean z2 = (i5 == 256) | (i4 == 32);
            Object objP3 = fetVar.P();
            if (z2 || objP3 == obj2) {
                objP3 = new xis0((Object) jpu0Var, (Object) d930Var, (byte) 21);
                fetVar.o0(objP3);
            }
            dwi0.b(function2, mm40VarN, (Function1) objP3, fetVar, 0, 0);
            Unit unit = Unit.f46060a;
            boolean z3 = (i5 == 256) | (i4 == 32);
            Object objP4 = fetVar.P();
            if (z3 || objP4 == obj2) {
                obj = obj2;
                otp0Var = new otp0(pz40Var, d930Var, jpu0Var, yjeVar, (byte) 9);
                fetVar.o0(otp0Var);
            } else {
                obj = obj2;
                otp0Var = objP4;
            }
            m0x0.t(fetVar, unit, (Function2) otp0Var);
            boolean z4 = (i5 == 256) | (i4 == 32);
            Object objP5 = fetVar.P();
            if (z4 || objP5 == obj) {
                objP5 = new m8s0(pz40Var, d930Var, jpu0Var);
                fetVar.o0(objP5);
            }
            m0x0.o(unit, (Function1) objP5, fetVar);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new s0n0(jpu0Var, d930Var, function1, i);
        }
    }

    public static final void k(lc00 lc00Var, qrh qrhVar, o4i0 o4i0Var, ctf0 ctf0Var, List list) {
        Object obj;
        Object next;
        qrhVar.getClass();
        ctf0Var.getClass();
        list.getClass();
        boolean zQ = ofm0.q(qrhVar);
        vrh vrhVar = qrhVar.b;
        String str = vrhVar.f37897a;
        vrh vrhVar2 = qrhVar.f29209a;
        String str2 = vrhVar2.f37897a;
        if (zQ) {
            return;
        }
        ArrayList arrayListP = p(vrhVar2.c);
        ArrayList arrayListP2 = p(vrhVar.c);
        String strO = o(o4i0Var.f24637a, arrayListP);
        String strO2 = o(o4i0Var.b, arrayListP2);
        ArrayList arrayListQ0 = CollectionsKt.q0(arrayListP, arrayListP2);
        if (strO.length() == 0 || strO2.length() == 0) {
            return;
        }
        lc00Var.add(new psv("PLAYERS_COMPOSITION_HEADER", R.string.composition));
        String strK = vrhVar2.b;
        if (strK.length() == 0) {
            strK = zsm0.k(str2, list, iun.f15405a);
        }
        gfa0 gfa0Var = new gfa0(str2, strK, "");
        String strK2 = vrhVar.b;
        if (strK2.length() == 0) {
            strK2 = zsm0.k(str, list, iun.f15405a);
        }
        gfa0 gfa0Var2 = new gfa0(str, strK2, "");
        i4 i4VarO = cem0.o(strO, arrayListP);
        i4 i4VarO2 = cem0.o(strO2, arrayListP2);
        Iterator it = arrayListQ0.iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((rrh) next).f30983a.equals(strO));
        rrh rrhVar = (rrh) next;
        if (rrhVar == null) {
            rrhVar = new rrh("", "", "", 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, "");
        }
        for (Object obj2 : arrayListQ0) {
            if (((rrh) obj2).f30983a.equals(strO2)) {
                obj = obj2;
                break;
            }
        }
        rrh rrhVar2 = (rrh) obj;
        if (rrhVar2 == null) {
            rrhVar2 = new rrh("", "", "", 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, "");
        }
        dfa0 dfa0VarO = aem0.o(rrhVar, rrhVar2);
        dfa0 dfa0VarO2 = aem0.o(rrhVar2, rrhVar);
        lsm0 lsm0Var = ctf0Var.b;
        lc00Var.add(new ifa0("PLAYERS_COMPOSITION", gfa0Var, gfa0Var2, i4VarO, i4VarO2, new efa0(dfa0VarO, dfa0VarO2, dyb.g0(uvw.u(lsm0Var.a(R.string.valorant_combat_score, Arrays.copyOf(new Object[0], 0))), uvw.u(lsm0Var.a(R.string.valorant_kills, Arrays.copyOf(new Object[0], 0))), uvw.u(lsm0Var.a(R.string.valorant_deaths, Arrays.copyOf(new Object[0], 0))), uvw.u(lsm0Var.a(R.string.valorant_open_kills, Arrays.copyOf(new Object[0], 0))), uvw.u(lsm0Var.a(R.string.valorant_headshots, Arrays.copyOf(new Object[0], 0)))), lsm0Var.a(R.string.statistic, Arrays.copyOf(new Object[0], 0)))));
    }

    public static final List l(boolean z, List list, Map map, List list2, y78 y78Var, boolean z2, boolean z3, ctf0 ctf0Var, v5l0 v5l0Var, boolean z4) {
        Object next;
        m5l0 m5l0Var;
        lel0 lel0Var;
        list.getClass();
        list2.getClass();
        ctf0Var.getClass();
        if (list.isEmpty()) {
            return iun.f15405a;
        }
        Pair pair = z ? new Pair("HEADER_LIVE_GAMES", "LIVE_GAMES") : new Pair("HEADER_LINE_GAMES", "LINE_GAMES");
        String str = (String) pair.f46059a;
        String str2 = (String) pair.b;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            d0t d0tVar = (d0t) it.next();
            Iterator it2 = list2.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (((lok0) next).f20396a != d0tVar.O);
            lok0 lok0Var = (lok0) next;
            long j = d0tVar.v;
            if (j == 40) {
                j = d0tVar.u;
            }
            ypl0 ypl0Var = (ypl0) map.get(Long.valueOf(j));
            String str3 = (ypl0Var == null || (lel0Var = ypl0Var.c) == null) ? null : lel0Var.j;
            String str4 = str3 == null ? "" : str3;
            ArrayList arrayList2 = new ArrayList(r3d.q(list2, 10));
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                arrayList2.add(Integer.valueOf(((lok0) it3.next()).f20396a));
            }
            boolean z5 = lok0Var != null ? lok0Var.n : false;
            boolean z6 = lok0Var != null ? lok0Var.p : false;
            String str5 = lok0Var != null ? lok0Var.u : null;
            String str6 = str5 == null ? "" : str5;
            if (d0tVar.K.isEmpty()) {
                List list3 = d0tVar.k;
                if (list3 == null || !list3.isEmpty()) {
                    Iterator it4 = list3.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            if (!((d0t) it4.next()).K.isEmpty()) {
                                m5l0Var = l5l0.f19463a;
                            }
                        }
                    }
                }
                m5l0Var = i5l0.f14197a;
            } else {
                m5l0Var = l5l0.f19463a;
            }
            arrayList.add(wwb.V(d0tVar, ctf0Var, y78Var, z2, z3, str4, false, arrayList2, z5, z6, false, v5l0Var, m5l0Var, str6, z4));
        }
        return q3d.j(new m9p0(str, new hjm(ctf0Var.b.a(z ? R.string.cyber_champ_live : R.string.line, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, z, null, null, false, null, null, 8126)), new j9p0(str2, new vb90(q0s.f27918a, dyb.o0(arrayList), true, z4)));
    }

    public static final gat0 m(String str) {
        str.getClass();
        pz40 pz40Var = s6t0.f31722a;
        return new gat0(new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(str, s6t0.b().f33626a.getSecondary(), fa50.f9191a), fmm.f9790a, s6t0.b().f33626a.getBackgroundContent(), true, null));
    }

    public static final float n(ujv0 ujv0Var) {
        ujv0Var.getClass();
        boolean zA = ujv0Var.a(Response.BUSY_EVERYWHERE);
        int i = ujv0Var.f35801a;
        if (zA) {
            return ((ycl) idd.e(new ycl(i * 0.9f), new ycl(400.0f))).f42389a;
        }
        return ujv0Var.a(360) ? ((ycl) idd.e(new ycl(i * 0.9f), new ycl(370.0f))).f42389a : ((ycl) idd.e(new ycl(i * 0.9f), new ycl(324.0f))).f42389a;
    }

    public static final String o(String str, ArrayList arrayList) {
        Object next;
        Object next2;
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((rrh) next).f30983a.equals(str));
        rrh rrhVar = (rrh) next;
        String str2 = rrhVar != null ? rrhVar.f30983a : null;
        Iterator it2 = arrayList.iterator();
        do {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
        } while (Intrinsics.d((rrh) next2, new rrh("", "", "", 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, "")));
        rrh rrhVar2 = (rrh) next2;
        String str3 = rrhVar2 != null ? rrhVar2.f30983a : null;
        if (str3 == null) {
            str3 = "";
        }
        return sj3.j0(str2, str3);
    }

    public static final ArrayList p(List list) {
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            rrh rrhVar = (rrh) it.next();
            if (rrhVar.b.length() == 0) {
                rrhVar = new rrh("", "", "", 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, "");
            }
            arrayList.add(rrhVar);
        }
        return arrayList;
    }

    public static final void q(v1r v1rVar, ghn0 ghn0Var, hv10 hv10Var, Function2 function2) {
        String strK = kng0.k("REQUEST_SUCCESS_BET_KEY", ghn0Var.name());
        v1rVar.u0(strK, hv10Var, new hi(strK, ghn0Var, function2, (byte) 17));
    }

    public static final gy30 r(nw30 nw30Var) {
        int i;
        wx30 ux30Var;
        if (nw30Var instanceof pv30) {
            return ((pv30) nw30Var).b;
        }
        boolean z = nw30Var instanceof ew30;
        ey30 ey30Var = ey30.f8608a;
        miz kizVar = liz.f20129a;
        if (z) {
            ew30 ew30Var = (ew30) nw30Var;
            ux30 ux30Var2 = new ux30(10, 0L, ew30Var.e, ew30Var.f);
            int i2 = ew30Var.d;
            m0x m0xVar = new m0x(i2, null, 6);
            if (ew30Var.b) {
                kizVar = new kiz(new rf5(3, null));
            }
            return new gy30(ux30Var2, new rx30(m0xVar, 0L, kizVar, i2, 0L, null, 498), ey30Var, 0L, null, null, 248);
        }
        if (nw30Var instanceof mw30) {
            mw30 mw30Var = (mw30) nw30Var;
            ux30 ux30Var3 = new ux30(10, 0L, mw30Var.e, mw30Var.f);
            int i3 = mw30Var.d;
            m0x m0xVar2 = new m0x(i3, null, 6);
            if (mw30Var.f22484a) {
                kizVar = new kiz(new rf5(3, null));
            }
            return new gy30(ux30Var3, new rx30(m0xVar2, 0L, kizVar, i3, 0L, null, 498), new by30(mw30Var.g), 0L, null, null, 248);
        }
        if (nw30Var instanceof fw30) {
            fw30 fw30Var = (fw30) nw30Var;
            ux30 ux30Var4 = new ux30(10, 0L, fw30Var.h, "");
            pz40 pz40Var = s6t0.f31722a;
            qc5 qc5Var = new qc5(null, new n0x(fw30Var.f), new y3d(s6t0.b().f33626a.getBackground()));
            n0x n0xVar = new n0x(fw30Var.e);
            if (fw30Var.f10240a) {
                kizVar = new kiz(new rf5(3, null));
            }
            return new gy30(ux30Var4, new rx30(n0xVar, 0L, kizVar, R.drawable.sport_new, 0L, qc5Var, 434), new zx30(new n0x(fw30Var.i), 3), 0L, null, null, 248);
        }
        if (nw30Var instanceof iw30) {
            iw30 iw30Var = (iw30) nw30Var;
            ux30 ux30Var5 = new ux30(10, 0L, iw30Var.e, iw30Var.f);
            int i4 = iw30Var.d;
            m0x m0xVar3 = new m0x(i4, null, 6);
            if (iw30Var.b) {
                kizVar = new kiz(new rf5(3, null));
            }
            rx30 rx30Var = new rx30(m0xVar3, 0L, kizVar, i4, 0L, null, 498);
            rpe rpeVar = new rpe(iw30Var.g);
            pz40 pz40Var2 = s6t0.f31722a;
            StaticColors staticColors = StaticColors.INSTANCE;
            return new gy30(ux30Var5, rx30Var, new dy30(rpeVar, new kpe(staticColors.m113getRed0d7_KjU(), staticColors.m123getWhite0d7_KjU())), 0L, null, null, 248);
        }
        if (nw30Var instanceof qv30) {
            qv30 qv30Var = (qv30) nw30Var;
            ux30 ux30Var6 = new ux30(10, 0L, qv30Var.e, qv30Var.f);
            int i5 = qv30Var.d;
            m0x m0xVar4 = new m0x(i5, null, 6);
            if (qv30Var.b) {
                kizVar = new kiz(new rf5(3, null));
            }
            return new gy30(ux30Var6, new rx30(m0xVar4, 0L, kizVar, i5, 0L, null, 498), new zx30(new n0x(qv30Var.g), 3), 0L, null, null, 248);
        }
        if (nw30Var instanceof jw30) {
            jw30 jw30Var = (jw30) nw30Var;
            ux30 ux30Var7 = new ux30(10, 0L, jw30Var.e, jw30Var.f);
            int i6 = jw30Var.d;
            m0x m0xVar5 = new m0x(i6, null, 6);
            if (jw30Var.b) {
                kizVar = new kiz(new rf5(3, null));
            }
            return new gy30(ux30Var7, new rx30(m0xVar5, 0L, kizVar, i6, 0L, null, 498), new zx30(new n0x(jw30Var.g), 3), 0L, null, null, 248);
        }
        if (nw30Var instanceof dw30) {
            dw30 dw30Var = (dw30) nw30Var;
            ux30 ux30Var8 = new ux30(10, 0L, dw30Var.e, dw30Var.f);
            int i7 = dw30Var.d;
            m0x m0xVar6 = new m0x(i7, null, 6);
            if (dw30Var.b) {
                kizVar = new kiz(new rf5(3, null));
            }
            return new gy30(ux30Var8, new rx30(m0xVar6, 0L, kizVar, i7, 0L, null, 498), new zx30(new n0x(dw30Var.g), 3), 0L, null, null, 248);
        }
        if (nw30Var instanceof uv30) {
            uv30 uv30Var = (uv30) nw30Var;
            ux30 ux30Var9 = new ux30(10, 0L, uv30Var.e, uv30Var.f);
            int i8 = uv30Var.d;
            m0x m0xVar7 = new m0x(i8, null, 6);
            if (uv30Var.b) {
                kizVar = new kiz(new rf5(3, null));
            }
            return new gy30(ux30Var9, new rx30(m0xVar7, 0L, kizVar, i8, 0L, null, 498), new zx30(new m0x(uv30Var.g, null, 6), 3), 0L, null, null, 248);
        }
        if (nw30Var instanceof ov30) {
            ov30 ov30Var = (ov30) nw30Var;
            ux30 ux30Var10 = new ux30(10, 0L, ov30Var.i, ov30Var.j);
            pc5 pc5Var = new pc5(new y3d(ov30Var.f));
            long j = ov30Var.e;
            long j2 = ov30Var.h;
            int i9 = ov30Var.g;
            n0x n0xVar2 = new n0x(ov30Var.d);
            if (ov30Var.f25907a) {
                kizVar = new kiz(new rf5(3, null));
            }
            return new gy30(ux30Var10, new rx30(n0xVar2, j, kizVar, i9, j2, pc5Var, Response.UNSUPPORTED_URI_SCHEME), ey30Var, 0L, null, null, 248);
        }
        if (nw30Var instanceof rv30) {
            rv30 rv30Var = (rv30) nw30Var;
            List list = rv30Var.k;
            String str = rv30Var.h;
            pz40 pz40Var3 = s6t0.f31722a;
            StaticColors staticColors2 = StaticColors.INSTANCE;
            ux30 ux30Var11 = new ux30(staticColors2.m123getWhite0d7_KjU(), staticColors2.m131getWhite800d7_KjU(), str, rv30Var.i);
            pc5 pc5Var2 = new pc5(new y3d(rv30Var.g));
            int i10 = rv30Var.e;
            long j3 = rv30Var.f;
            m0x m0xVar8 = new m0x(i10, null, 6);
            if (rv30Var.b) {
                kizVar = new kiz(new rf5(3, null));
            }
            return new gy30(ux30Var11, new rx30(m0xVar8, j3, kizVar, i10, 0L, pc5Var2, 432), new zx30(new m0x(rv30Var.j, rv30Var.l, 4), 3), 0L, list, null, 216);
        }
        if (nw30Var instanceof sv30) {
            sv30 sv30Var = (sv30) nw30Var;
            long j4 = sv30Var.j;
            String str2 = sv30Var.g;
            pz40 pz40Var4 = s6t0.f31722a;
            StaticColors staticColors3 = StaticColors.INSTANCE;
            ux30 ux30Var12 = new ux30(staticColors3.m123getWhite0d7_KjU(), staticColors3.m131getWhite800d7_KjU(), str2, sv30Var.h);
            int i11 = sv30Var.d;
            m0x m0xVar9 = new m0x(i11, null, 6);
            pc5 pc5Var3 = new pc5(new y3d(sv30Var.f));
            if (sv30Var.b) {
                kizVar = new kiz(new rf5(3, null));
            }
            return new gy30(ux30Var12, new rx30(m0xVar9, 0L, kizVar, i11, 0L, pc5Var3, 434), new zx30(new m0x(sv30Var.i, null, 6), 3), j4, null, null, 240);
        }
        if (nw30Var instanceof nv30) {
            nv30 nv30Var = (nv30) nw30Var;
            boolean z2 = nv30Var.g;
            String str3 = nv30Var.e;
            wx30 vx30Var = z2 ? new vx30(str3, nv30Var.f, new m0x(R.drawable.ic_status_green_check_circle, null, 6)) : new ux30(10, 0L, str3, nv30Var.f);
            int i12 = nv30Var.d;
            m0x m0xVar10 = new m0x(i12, null, 6);
            if (nv30Var.b) {
                kizVar = new kiz(new rf5(3, null));
            }
            return new gy30(vx30Var, new rx30(m0xVar10, 0L, kizVar, i12, 0L, null, 498), ey30Var, 0L, null, null, 248);
        }
        if (nw30Var instanceof tv30) {
            tv30 tv30Var = (tv30) nw30Var;
            long j5 = tv30Var.i;
            String str4 = tv30Var.f;
            pz40 pz40Var5 = s6t0.f31722a;
            StaticColors staticColors4 = StaticColors.INSTANCE;
            ux30 ux30Var13 = new ux30(staticColors4.m123getWhite0d7_KjU(), staticColors4.m131getWhite800d7_KjU(), str4, tv30Var.g);
            int i13 = tv30Var.c;
            long j6 = tv30Var.d;
            m0x m0xVar11 = new m0x(i13, null, 6);
            pc5 pc5Var4 = new pc5(new y3d(tv30Var.e));
            if (tv30Var.f34580a) {
                kizVar = new kiz(new rf5(3, null));
            }
            return new gy30(ux30Var13, new rx30(m0xVar11, j6, kizVar, i13, 0L, pc5Var4, 432), new zx30(new m0x(tv30Var.h, null, 6), 3), j5, null, null, 240);
        }
        if (nw30Var instanceof lw30) {
            lw30 lw30Var = (lw30) nw30Var;
            ux30 ux30Var14 = new ux30(14, 0L, lw30Var.g, (String) null);
            n0x n0xVar3 = new n0x(lw30Var.f);
            if (lw30Var.f20744a) {
                kizVar = new kiz(new rf5(3, null));
            }
            return new gy30(ux30Var14, new rx30(n0xVar3, 0L, kizVar, R.drawable.ic_glyph_language, 0L, null, 498), ey30Var, 0L, null, null, 248);
        }
        if (nw30Var instanceof vv30) {
            vv30 vv30Var = (vv30) nw30Var;
            boolean z3 = vv30Var.g;
            String str5 = vv30Var.e;
            if (z3) {
                i = 6;
                ux30Var = new vx30(str5, vv30Var.f, new m0x(R.drawable.ic_status_green_check_circle, null, 6));
            } else {
                i = 6;
                ux30Var = new ux30(10, 0L, str5, vv30Var.f);
            }
            int i14 = vv30Var.d;
            m0x m0xVar12 = new m0x(i14, null, i);
            if (vv30Var.b) {
                kizVar = new kiz(new rf5(3, null));
            }
            return new gy30(ux30Var, new rx30(m0xVar12, 0L, kizVar, i14, 0L, null, 498), ey30Var, 0L, null, null, 248);
        }
        if (nw30Var instanceof wv30) {
            wv30 wv30Var = (wv30) nw30Var;
            ux30 ux30Var15 = new ux30(10, 0L, wv30Var.f, wv30Var.g);
            int i15 = wv30Var.e;
            n0x n0xVar4 = new n0x(wv30Var.d);
            if (wv30Var.f39822a) {
                kizVar = new kiz(new rf5(3, null));
            }
            return new gy30(ux30Var15, new rx30(n0xVar4, 0L, kizVar, i15, 0L, null, 498), ey30Var, 0L, null, null, 248);
        }
        if (nw30Var instanceof xv30) {
            xv30 xv30Var = (xv30) nw30Var;
            List list2 = xv30Var.k;
            String str6 = xv30Var.h;
            pz40 pz40Var6 = s6t0.f31722a;
            StaticColors staticColors5 = StaticColors.INSTANCE;
            ux30 ux30Var16 = new ux30(staticColors5.m123getWhite0d7_KjU(), staticColors5.m131getWhite800d7_KjU(), str6, xv30Var.i);
            pc5 pc5Var5 = new pc5(new y3d(xv30Var.g));
            int i16 = xv30Var.e;
            long j7 = xv30Var.f;
            m0x m0xVar13 = new m0x(i16, null, 6);
            if (xv30Var.b) {
                kizVar = new kiz(new rf5(3, null));
            }
            return new gy30(ux30Var16, new rx30(m0xVar13, j7, kizVar, i16, 0L, pc5Var5, 432), new zx30(new m0x(xv30Var.j, xv30Var.l, 4), 3), 0L, list2, null, 216);
        }
        if (nw30Var instanceof yv30) {
            yv30 yv30Var = (yv30) nw30Var;
            long j8 = yv30Var.j;
            String str7 = yv30Var.g;
            pz40 pz40Var7 = s6t0.f31722a;
            StaticColors staticColors6 = StaticColors.INSTANCE;
            ux30 ux30Var17 = new ux30(staticColors6.m123getWhite0d7_KjU(), staticColors6.m131getWhite800d7_KjU(), str7, yv30Var.h);
            int i17 = yv30Var.d;
            long j9 = yv30Var.e;
            m0x m0xVar14 = new m0x(i17, null, 6);
            pc5 pc5Var6 = new pc5(new y3d(yv30Var.f));
            if (yv30Var.b) {
                kizVar = new kiz(new rf5(3, null));
            }
            return new gy30(ux30Var17, new rx30(m0xVar14, j9, kizVar, i17, 0L, pc5Var6, 432), new zx30(new m0x(yv30Var.i, null, 6), 3), j8, null, null, 240);
        }
        if (nw30Var instanceof zv30) {
            zv30 zv30Var = (zv30) nw30Var;
            ux30 ux30Var18 = new ux30(10, 0L, zv30Var.e, zv30Var.f);
            int i18 = zv30Var.d;
            m0x m0xVar15 = new m0x(i18, null, 6);
            if (zv30Var.b) {
                kizVar = new kiz(new rf5(3, null));
            }
            return new gy30(ux30Var18, new rx30(m0xVar15, 0L, kizVar, i18, 0L, null, 498), new zx30(new m0x(zv30Var.g, null, 6), 3), 0L, null, null, 248);
        }
        if (nw30Var instanceof aw30) {
            aw30 aw30Var = (aw30) nw30Var;
            ux30 ux30Var19 = new ux30(10, 0L, aw30Var.e, aw30Var.f);
            int i19 = aw30Var.d;
            m0x m0xVar16 = new m0x(i19, null, 6);
            if (aw30Var.b) {
                kizVar = new kiz(new rf5(3, null));
            }
            return new gy30(ux30Var19, new rx30(m0xVar16, 0L, kizVar, i19, 0L, null, 498), ey30Var, 0L, null, null, 248);
        }
        if (nw30Var instanceof bw30) {
            bw30 bw30Var = (bw30) nw30Var;
            ux30 ux30Var20 = new ux30(14, 0L, bw30Var.g, (String) null);
            n0x n0xVar5 = new n0x(bw30Var.f);
            if (bw30Var.f3307a) {
                kizVar = new kiz(new rf5(3, null));
            }
            return new gy30(ux30Var20, new rx30(n0xVar5, 0L, kizVar, R.drawable.ic_glyph_language, 0L, null, 498), ey30Var, 0L, null, null, 248);
        }
        if (nw30Var instanceof cw30) {
            cw30 cw30Var = (cw30) nw30Var;
            ux30 ux30Var21 = new ux30(10, 0L, cw30Var.e, cw30Var.f);
            int i20 = cw30Var.d;
            m0x m0xVar17 = new m0x(i20, null, 6);
            if (cw30Var.f5062a) {
                kizVar = new kiz(new rf5(3, null));
            }
            return new gy30(ux30Var21, new rx30(m0xVar17, 0L, kizVar, i20, 0L, null, 498), new by30(cw30Var.g), 0L, null, null, 248);
        }
        if (!(nw30Var instanceof gw30)) {
            ux30 ux30Var22 = new ux30(10, 0L, "", "");
            zcl zclVar = qmk.f28987a;
            m0x m0xVar18 = new m0x(0, null, 6);
            pz40 pz40Var8 = s6t0.f31722a;
            return new gy30(ux30Var22, new qx30(m0xVar18, s6t0.b().f33626a.getPrimary(), kizVar, R.drawable.ic_glyph_language, 40.0f, 16), ey30Var, 0L, null, null, 248);
        }
        gw30 gw30Var = (gw30) nw30Var;
        ux30 ux30Var23 = new ux30(10, 0L, gw30Var.h, "");
        pz40 pz40Var9 = s6t0.f31722a;
        qc5 qc5Var2 = new qc5(null, new n0x(gw30Var.f), new y3d(s6t0.b().f33626a.getBackground()));
        n0x n0xVar6 = new n0x(gw30Var.e);
        if (gw30Var.f12006a) {
            kizVar = new kiz(new rf5(3, null));
        }
        return new gy30(ux30Var23, new rx30(n0xVar6, 0L, kizVar, R.drawable.sport_new, 0L, qc5Var2, 434), new zx30(new n0x(gw30Var.i), 3), 0L, null, null, 248);
    }

    public static final yno0 s(d140 d140Var, ctf0 ctf0Var, qho qhoVar, String str) {
        List list;
        my30 my30VarV;
        ctf0Var.getClass();
        str.getClass();
        Map map = d140Var.q;
        List<r040> listL0 = CollectionsKt.L0(map.keySet());
        int i = 10;
        ArrayList arrayList = new ArrayList(r3d.q(listL0, 10));
        Iterator it = listL0.iterator();
        while (it.hasNext()) {
            arrayList.add(hic.F((r040) it.next(), ctf0Var, qhoVar, d140Var.u));
        }
        a4x a4xVarO0 = dyb.o0(arrayList);
        ArrayList arrayList2 = new ArrayList(r3d.q(listL0, 10));
        for (r040 r040Var : listL0) {
            List list2 = (List) map.get(r040Var);
            if (list2 != null) {
                ArrayList arrayList3 = new ArrayList(r3d.q(list2, i));
                Iterator it2 = list2.iterator();
                ArrayList arrayList4 = arrayList3;
                while (it2.hasNext()) {
                    ArrayList arrayList5 = arrayList4;
                    nw30 nw30VarK0 = yyw.k0((yx10) it2.next(), ctf0Var, qhoVar, d140Var.x, r040Var, d140Var.w, d140Var.y, str);
                    boolean z = (nw30VarK0 instanceof z140) || (nw30VarK0 instanceof aw30) || (nw30VarK0 instanceof vv30) || (nw30VarK0 instanceof zv30) || (nw30VarK0 instanceof xv30) || (nw30VarK0 instanceof yv30) || (nw30VarK0 instanceof cw30) || (nw30VarK0 instanceof wv30) || (nw30VarK0 instanceof bw30);
                    if (nw30VarK0 instanceof mw30) {
                        mw30 mw30Var = (mw30) nw30VarK0;
                        my30VarV = new ly30(mw30Var.b, mw30Var.c, z, yyw.g0(nw30VarK0), yyw.h0(nw30VarK0), r(nw30VarK0), kkb.T(mw30Var.h));
                    } else if (nw30VarK0 instanceof cw30) {
                        cw30 cw30Var = (cw30) nw30VarK0;
                        my30VarV = new ly30(cw30Var.b, cw30Var.c, z, yyw.g0(nw30VarK0), yyw.h0(nw30VarK0), r(nw30VarK0), kkb.T(cw30Var.h));
                    } else {
                        boolean z2 = z;
                        my30VarV = nw30VarK0 instanceof kw30 ? xww.V((kw30) nw30VarK0, z2) : new ky30(nw30VarK0.m(), nw30VarK0.n(), r(nw30VarK0), z2, yyw.g0(nw30VarK0), yyw.h0(nw30VarK0));
                    }
                    arrayList5.add(my30VarV);
                    ctf0Var = ctf0Var;
                    qhoVar = qhoVar;
                    arrayList4 = arrayList5;
                }
                list = arrayList4;
            } else {
                list = null;
            }
            if (list == null) {
                list = iun.f15405a;
            }
            arrayList2.add(dyb.o0(list));
            i = 10;
        }
        a4x a4xVarO1 = dyb.o0(arrayList2);
        int iIndexOf = listL0.indexOf(d140Var.s);
        return new yno0(a4xVarO0, iIndexOf < 0 ? 0 : iIndexOf, d140Var.l, d140Var.t, a4xVarO1, fem0.l(d140Var.v));
    }

    public static final znp0 t(vfp0 vfp0Var) {
        String str = vfp0Var.f37345a;
        String str2 = vfp0Var.b;
        String str3 = vfp0Var.c;
        return new znp0(str, str2, vsm0.t(str3), vsm0.t(str3), vsm0.t(vfp0Var.d), vfp0Var.e);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:46:0x01af  */
    /* JADX WARN: Code duplicated, block: B:49:0x01bc  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r54v6, types: [a.p0n] */
    /* JADX WARN: Type inference failed for: r59v1, types: [a.f2i] */
    public static final cml0 u(d0t d0tVar, String str, ArrayList arrayList, y78 y78Var, v5l0 v5l0Var, ctf0 ctf0Var, boolean z, boolean z2, boolean z3, boolean z4, String str2, boolean z5) {
        p0n p0nVar;
        r0n r0nVar;
        Object p0nVar2;
        p0n p0nVar3;
        xem xemVar;
        e4i e4iVar;
        e4i e4iVar2;
        int iIntValue;
        Integer intOrNull;
        int iIntValue2;
        Integer intOrNull2;
        p0n p0nVar4;
        rqs rqsVar = d0tVar.p;
        long j = d0tVar.f5282a;
        Date date = d0tVar.P;
        ctf0Var.getClass();
        int iOrdinal = v5l0Var.ordinal();
        r0n r0nVar2 = o0n.f24435a;
        q0n q0nVar = q0n.f27908a;
        if (iOrdinal == 0) {
            int iIntValue3 = 0;
            fol0 fol0VarP = wdx.P(d0tVar, str, arrayList, z2, z3, str2, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z), kpb.a0(d0tVar, z, z4), kpb.f0(d0tVar, z));
            z6m0 z6m0Var = z6m0.f43877a;
            Integer intOrNull3 = StringsKt.toIntOrNull(qzb.U(d0tVar).b);
            int iIntValue4 = intOrNull3 != null ? intOrNull3.intValue() : 0;
            Integer intOrNull4 = StringsKt.toIntOrNull(qzb.U(d0tVar).c);
            if (intOrNull4 != null) {
                iIntValue3 = intOrNull4.intValue();
            }
            y0n y0nVar = new y0n(iIntValue4, kpb.D(d0tVar), qzb.c0(d0tVar));
            y0n y0nVar2 = new y0n(iIntValue3, kpb.U(d0tVar), qzb.r0(d0tVar));
            kpm kpmVarS = kpb.S(d0tVar);
            String strH = kpb.H(d0tVar, y78Var, z5);
            if (kpb.e0(d0tVar)) {
                r0nVar = q0nVar;
            } else {
                if (dub.m0(d0tVar)) {
                    p0nVar = new p0n(kpb.u0(d0tVar), fgm.b, date.getTime(), true, 16);
                } else {
                    if (qzb.H0(d0tVar)) {
                        p0nVar = new p0n(kpb.r0(d0tVar), fgm.b, date.getTime(), false, 24);
                    }
                    r0nVar = r0nVar2;
                }
                r0nVar2 = p0nVar;
                r0nVar = r0nVar2;
            }
            return new xll0(j, fol0VarP, new pml0(y0nVar, y0nVar2, kpmVarS, strH, r0nVar));
        }
        Object obj = null;
        if (iOrdinal == 1) {
            pz40 pz40Var = s6t0.f31722a;
            jol0 jol0VarT = wdx.T(d0tVar, str, arrayList, z2, z3, new y3d(StaticColors.INSTANCE.m113getRed0d7_KjU()), str2, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z));
            z6m0 z6m0Var2 = z6m0.f43877a;
            Integer intOrNull5 = StringsKt.toIntOrNull(qzb.U(d0tVar).b);
            int iIntValue5 = intOrNull5 != null ? intOrNull5.intValue() : 0;
            Integer intOrNull6 = StringsKt.toIntOrNull(qzb.U(d0tVar).c);
            int iIntValue6 = intOrNull6 != null ? intOrNull6.intValue() : 0;
            z0n z0nVar = new z0n(qzb.c0(d0tVar), iIntValue5, "", kpb.E(d0tVar), cem0.r(d0tVar), rqsVar.t, false, rqsVar.r);
            z0n z0nVar2 = new z0n(qzb.r0(d0tVar), iIntValue6, "", kpb.V(d0tVar), cem0.s(d0tVar), rqsVar.u, false, rqsVar.s);
            if (!dub.m0(d0tVar)) {
                if (qzb.H0(d0tVar)) {
                    p0nVar2 = new p0n(kpb.r0(d0tVar), fgm.b, date.getTime(), false, 24);
                }
                return new bml0(j, jol0VarT, new vnl0(z0nVar, z0nVar2, kpb.H(d0tVar, y78Var, z5), obj, kpb.M(d0tVar), ctf0Var.b.a(R.string.total_count, Arrays.copyOf(new Object[0], 0)), uem.f35536a));
            }
            p0nVar2 = new p0n(kpb.u0(d0tVar), fgm.b, date.getTime(), true, 16);
            obj = p0nVar2;
            return new bml0(j, jol0VarT, new vnl0(z0nVar, z0nVar2, kpb.H(d0tVar, y78Var, z5), obj, kpb.M(d0tVar), ctf0Var.b.a(R.string.total_count, Arrays.copyOf(new Object[0], 0)), uem.f35536a));
        }
        if (iOrdinal == 2) {
            boolean z6 = true;
            iol0 iol0VarS = wdx.S(d0tVar, str, arrayList, z2, z3, str2, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z));
            z6m0 z6m0Var3 = z6m0.f43877a;
            Integer intOrNull7 = StringsKt.toIntOrNull(qzb.U(d0tVar).b);
            int iIntValue7 = intOrNull7 != null ? intOrNull7.intValue() : 0;
            Integer intOrNull8 = StringsKt.toIntOrNull(qzb.U(d0tVar).c);
            int iIntValue8 = intOrNull8 != null ? intOrNull8.intValue() : 0;
            boolean z7 = d0tVar.G;
            boolean z8 = z7 && !z && z4;
            boolean z9 = (!d0tVar.H || z7 || z) ? false : true;
            int i = gql0.f11739a;
            int i2 = rqsVar.g;
            boolean z10 = i2 > 0;
            boolean z11 = i2 == 1;
            boolean z12 = z10 && z11;
            if (!z10 || z11) {
                z6 = false;
            }
            a1n a1nVar = new a1n(qzb.c0(d0tVar), kpb.D(d0tVar), iIntValue7, "", kpb.E(d0tVar), cem0.r(d0tVar), rqsVar.t, false, rqsVar.r);
            a1n a1nVar2 = new a1n(qzb.r0(d0tVar), kpb.U(d0tVar), iIntValue8, "", kpb.V(d0tVar), cem0.s(d0tVar), rqsVar.u, false, rqsVar.s);
            if (kpb.e0(d0tVar)) {
                r0nVar2 = q0nVar;
            } else {
                if (dub.m0(d0tVar)) {
                    p0nVar3 = new p0n(kpb.u0(d0tVar), fgm.b, date.getTime(), true, 16);
                } else if (qzb.H0(d0tVar)) {
                    p0nVar3 = new p0n(kpb.r0(d0tVar), fgm.b, date.getTime(), false, 24);
                }
                r0nVar2 = p0nVar3;
            }
            String strH2 = kpb.H(d0tVar, y78Var, z5);
            String strM = kpb.M(d0tVar);
            lsm0 lsm0Var = ctf0Var.b;
            String strA = lsm0Var.a(R.string.total_count, Arrays.copyOf(new Object[0], 0));
            if (z8) {
                obj = c2i.f3624a;
            } else if (z9) {
                obj = e2i.f7087a;
            }
            String strA2 = lsm0Var.a(R.string.live_new, Arrays.copyOf(new Object[0], 0));
            if (z12) {
                xemVar = vem.f37292a;
            } else {
                xemVar = z6 ? wem.f39025a : tem.f33827a;
            }
            return new aml0(j, iol0VarS, new nnl0(a1nVar, a1nVar2, strM, strA, r0nVar2, strH2, xemVar, strA2, obj));
        }
        if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                t9f.b();
                return null;
            }
            gol0 gol0VarQ = wdx.Q(d0tVar, str, arrayList, z2, z3, str2, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z), kpb.a0(d0tVar, z, z4), kpb.f0(d0tVar, z));
            z6m0 z6m0Var4 = z6m0.f43877a;
            Integer intOrNull9 = StringsKt.toIntOrNull(qzb.U(d0tVar).b);
            int iIntValue9 = intOrNull9 != null ? intOrNull9.intValue() : 0;
            Integer intOrNull10 = StringsKt.toIntOrNull(qzb.U(d0tVar).c);
            int iIntValue10 = intOrNull10 != null ? intOrNull10.intValue() : 0;
            c1n c1nVar = new c1n(iIntValue9, kpb.D(d0tVar), qzb.c0(d0tVar));
            c1n c1nVar2 = new c1n(iIntValue10, kpb.U(d0tVar), qzb.r0(d0tVar));
            y1m y1mVarC = kpb.C(d0tVar);
            String strH3 = kpb.H(d0tVar, y78Var, z5);
            String strA3 = ctf0Var.b.a(R.string.live_new, Arrays.copyOf(new Object[0], 0));
            if (kpb.e0(d0tVar)) {
                r0nVar2 = q0nVar;
            } else {
                if (dub.m0(d0tVar)) {
                    p0nVar4 = new p0n(kpb.u0(d0tVar), fgm.b, date.getTime(), true, 16);
                } else if (qzb.H0(d0tVar)) {
                    p0nVar4 = new p0n(kpb.r0(d0tVar), fgm.b, date.getTime(), false, 24);
                }
                r0nVar2 = p0nVar4;
            }
            return new yll0(j, gol0VarQ, new xml0(strA3, c1nVar, c1nVar2, y1mVarC, strH3, r0nVar2));
        }
        long j2 = d0tVar.f5282a;
        n0x n0xVar = new n0x(dtb.F(str));
        String strH4 = kpb.H(d0tVar, y78Var, z5);
        boolean zE0 = kpb.e0(d0tVar);
        String strA4 = ctf0Var.b.a(R.string.live_new, Arrays.copyOf(new Object[0], 0));
        boolean zB0 = kpb.b0(d0tVar, z);
        boolean zD0 = kpb.d0(d0tVar, z);
        boolean zA0 = kpb.a0(d0tVar, z, z4);
        boolean zF0 = kpb.f0(d0tVar, z);
        if (!dub.m0(d0tVar)) {
            if (qzb.H0(d0tVar)) {
                long jR0 = kpb.r0(d0tVar);
                fgm fgmVar = fgm.f9498a;
                e4iVar2 = new e4i(24, jR0, date.getTime(), false);
            } else {
                e4iVar = null;
            }
            iIntValue = 0;
            hol0 hol0VarR = wdx.R(d0tVar, str, arrayList, z2, strH4, e4iVar, z3, strA4, zE0, str2, zB0, zD0, zA0, zF0);
            z6m0 z6m0Var5 = z6m0.f43877a;
            intOrNull = StringsKt.toIntOrNull(qzb.U(d0tVar).b);
            if (intOrNull != null) {
                iIntValue2 = intOrNull.intValue();
            } else {
                iIntValue2 = 0;
            }
            intOrNull2 = StringsKt.toIntOrNull(qzb.U(d0tVar).c);
            if (intOrNull2 != null) {
                iIntValue = intOrNull2.intValue();
            }
            return new zll0(j2, n0xVar, hol0VarR, new fnl0(new b1n(iIntValue2, kpb.D(d0tVar), qzb.c0(d0tVar)), new b1n(iIntValue, kpb.U(d0tVar), qzb.r0(d0tVar)), kpb.C(d0tVar)));
        }
        long jU0 = kpb.u0(d0tVar);
        fgm fgmVar2 = fgm.f9498a;
        e4iVar2 = new e4i(8, jU0, date.getTime(), true);
        e4iVar = e4iVar2;
        iIntValue = 0;
        hol0 hol0VarR2 = wdx.R(d0tVar, str, arrayList, z2, strH4, e4iVar, z3, strA4, zE0, str2, zB0, zD0, zA0, zF0);
        z6m0 z6m0Var6 = z6m0.f43877a;
        intOrNull = StringsKt.toIntOrNull(qzb.U(d0tVar).b);
        if (intOrNull != null) {
            iIntValue2 = intOrNull.intValue();
        } else {
            iIntValue2 = 0;
        }
        intOrNull2 = StringsKt.toIntOrNull(qzb.U(d0tVar).c);
        if (intOrNull2 != null) {
            iIntValue = intOrNull2.intValue();
        }
        return new zll0(j2, n0xVar, hol0VarR2, new fnl0(new b1n(iIntValue2, kpb.D(d0tVar), qzb.c0(d0tVar)), new b1n(iIntValue, kpb.U(d0tVar), qzb.r0(d0tVar)), kpb.C(d0tVar)));
    }

    public static void v(int i, int i2) {
        String strW;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strW = qem0.w("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    jf4.o(twn.m(i2, "negative size: "));
                    return;
                }
                strW = qem0.w("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strW);
        }
    }

    public static void w(int i, int i2, int i3) {
        String strZ;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strZ = z(i, i3, "start index");
            } else {
                strZ = (i2 < 0 || i2 > i3) ? z(i2, i3, "end index") : qem0.w("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strZ);
        }
    }

    public static byte[] x(byte[] bArr) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("Private key must have 32 bytes.");
        }
        byte[] bArr2 = new byte[32];
        bArr2[0] = 9;
        return y(bArr, bArr2);
    }

    public static byte[] y(byte[] bArr, byte[] bArr2) throws InvalidKeyException {
        int i = 32;
        if (bArr.length != 32) {
            throw new InvalidKeyException("Private key must have 32 bytes.");
        }
        long[] jArr = new long[11];
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 32);
        int i2 = 0;
        bArrCopyOf[0] = (byte) (bArrCopyOf[0] & 248);
        byte b = (byte) (bArrCopyOf[31] & 127);
        bArrCopyOf[31] = b;
        bArrCopyOf[31] = (byte) (b | 64);
        if (bArr2.length != 32) {
            throw new InvalidKeyException("Public key length is not 32-byte");
        }
        byte[] bArrCopyOf2 = Arrays.copyOf(bArr2, bArr2.length);
        bArrCopyOf2[31] = (byte) (bArrCopyOf2[31] & 127);
        int i3 = 0;
        while (true) {
            byte[][] bArr3 = hmw0.h;
            if (i3 >= 7) {
                int i4 = 10;
                long[] jArr2 = new long[10];
                for (int i5 = 0; i5 < 10; i5++) {
                    int i6 = nnw0.m[i5];
                    jArr2[i5] = (((((long) (bArrCopyOf2[i6 + 3] & 255)) << 24) | ((((long) (bArrCopyOf2[i6] & 255)) | (((long) (bArrCopyOf2[i6 + 1] & 255)) << 8)) | (((long) (bArrCopyOf2[i6 + 2] & 255)) << 16))) >> nnw0.n[i5]) & ((long) nnw0.o[i5 & 1]);
                }
                long[] jArr3 = new long[19];
                long[] jArr4 = new long[19];
                jArr4[0] = 1;
                long[] jArr5 = new long[19];
                jArr5[0] = 1;
                long[] jArr6 = new long[19];
                long[] jArr7 = new long[19];
                long[] jArr8 = new long[19];
                jArr8[0] = 1;
                long[] jArr9 = new long[19];
                long[] jArr10 = new long[19];
                jArr10[0] = 1;
                System.arraycopy(jArr2, 0, jArr3, 0, 10);
                while (i2 < i) {
                    int i7 = bArrCopyOf[31 - i2] & 255;
                    int i8 = 0;
                    while (i8 < 8) {
                        int i9 = (i7 >> (7 - i8)) & 1;
                        hmw0.l0(jArr5, jArr3, i9);
                        hmw0.l0(jArr6, jArr4, i9);
                        byte[] bArr4 = bArrCopyOf;
                        long[] jArrCopyOf = Arrays.copyOf(jArr5, 10);
                        int i10 = i7;
                        long[] jArr11 = new long[19];
                        int i11 = i2;
                        long[] jArr12 = new long[19];
                        int i12 = i8;
                        long[] jArr13 = new long[19];
                        long[] jArr14 = jArr;
                        long[] jArr15 = new long[19];
                        long[] jArr16 = new long[19];
                        long[] jArr17 = jArr10;
                        long[] jArr18 = new long[19];
                        long[] jArr19 = new long[19];
                        nnw0.U(jArr5, jArr5, jArr6);
                        nnw0.S(jArr6, jArrCopyOf, jArr6);
                        long[] jArrCopyOf2 = Arrays.copyOf(jArr3, 10);
                        nnw0.U(jArr3, jArr3, jArr4);
                        nnw0.S(jArr4, jArrCopyOf2, jArr4);
                        nnw0.R(jArr15, jArr3, jArr6);
                        nnw0.R(jArr16, jArr5, jArr4);
                        nnw0.P(jArr15);
                        nnw0.N(jArr15);
                        nnw0.P(jArr16);
                        nnw0.N(jArr16);
                        long[] jArr20 = jArr3;
                        System.arraycopy(jArr15, 0, jArrCopyOf2, 0, 10);
                        nnw0.U(jArr15, jArr15, jArr16);
                        nnw0.S(jArr16, jArrCopyOf2, jArr16);
                        nnw0.Q(jArr19, jArr15);
                        nnw0.Q(jArr18, jArr16);
                        nnw0.R(jArr16, jArr18, jArr2);
                        nnw0.P(jArr16);
                        nnw0.N(jArr16);
                        System.arraycopy(jArr19, 0, jArr7, 0, 10);
                        System.arraycopy(jArr16, 0, jArr8, 0, 10);
                        nnw0.Q(jArr12, jArr5);
                        nnw0.Q(jArr13, jArr6);
                        nnw0.R(jArr9, jArr12, jArr13);
                        nnw0.P(jArr9);
                        nnw0.N(jArr9);
                        nnw0.S(jArr13, jArr12, jArr13);
                        Arrays.fill(jArr11, 10, 18, 0L);
                        int i13 = 0;
                        for (int i14 = 10; i13 < i14; i14 = 10) {
                            jArr11[i13] = jArr13[i13] * 121665;
                            i13++;
                        }
                        nnw0.N(jArr11);
                        nnw0.U(jArr11, jArr11, jArr12);
                        nnw0.R(jArr17, jArr13, jArr11);
                        nnw0.P(jArr17);
                        nnw0.N(jArr17);
                        hmw0.l0(jArr9, jArr7, i9);
                        hmw0.l0(jArr17, jArr8, i9);
                        i8 = i12 + 1;
                        long[] jArr21 = jArr5;
                        jArr5 = jArr9;
                        jArr9 = jArr21;
                        long[] jArr22 = jArr6;
                        jArr6 = jArr17;
                        jArr10 = jArr22;
                        long[] jArr23 = jArr8;
                        jArr8 = jArr4;
                        jArr4 = jArr23;
                        i7 = i10;
                        jArr3 = jArr7;
                        bArrCopyOf = bArr4;
                        i2 = i11;
                        jArr = jArr14;
                        jArr7 = jArr20;
                    }
                    i2++;
                    i = 32;
                    i4 = 10;
                }
                long[] jArr24 = jArr;
                int i15 = i4;
                long[] jArr25 = new long[i15];
                long[] jArr26 = new long[i15];
                long[] jArr27 = new long[i15];
                long[] jArr28 = new long[i15];
                long[] jArr29 = new long[i15];
                long[] jArr30 = new long[i15];
                long[] jArr31 = new long[i15];
                long[] jArr32 = new long[i15];
                long[] jArr33 = new long[i15];
                long[] jArr34 = new long[i15];
                long[] jArr35 = jArr3;
                long[] jArr36 = new long[i15];
                nnw0.Q(jArr26, jArr6);
                nnw0.Q(jArr36, jArr26);
                nnw0.Q(jArr34, jArr36);
                nnw0.O(jArr27, jArr34, jArr6);
                nnw0.O(jArr28, jArr27, jArr26);
                nnw0.Q(jArr34, jArr28);
                nnw0.O(jArr29, jArr34, jArr27);
                nnw0.Q(jArr34, jArr29);
                nnw0.Q(jArr36, jArr34);
                nnw0.Q(jArr34, jArr36);
                nnw0.Q(jArr36, jArr34);
                nnw0.Q(jArr34, jArr36);
                nnw0.O(jArr30, jArr34, jArr29);
                nnw0.Q(jArr34, jArr30);
                nnw0.Q(jArr36, jArr34);
                for (int i16 = 2; i16 < 10; i16 += 2) {
                    nnw0.Q(jArr34, jArr36);
                    nnw0.Q(jArr36, jArr34);
                }
                nnw0.O(jArr31, jArr36, jArr30);
                nnw0.Q(jArr34, jArr31);
                nnw0.Q(jArr36, jArr34);
                for (int i17 = 2; i17 < 20; i17 += 2) {
                    nnw0.Q(jArr34, jArr36);
                    nnw0.Q(jArr36, jArr34);
                }
                nnw0.O(jArr34, jArr36, jArr31);
                nnw0.Q(jArr36, jArr34);
                nnw0.Q(jArr34, jArr36);
                for (int i18 = 2; i18 < 10; i18 += 2) {
                    nnw0.Q(jArr36, jArr34);
                    nnw0.Q(jArr34, jArr36);
                }
                nnw0.O(jArr32, jArr34, jArr30);
                nnw0.Q(jArr34, jArr32);
                nnw0.Q(jArr36, jArr34);
                for (int i19 = 2; i19 < 50; i19 += 2) {
                    nnw0.Q(jArr34, jArr36);
                    nnw0.Q(jArr36, jArr34);
                }
                nnw0.O(jArr33, jArr36, jArr32);
                nnw0.Q(jArr36, jArr33);
                nnw0.Q(jArr34, jArr36);
                for (int i20 = 2; i20 < 100; i20 += 2) {
                    nnw0.Q(jArr36, jArr34);
                    nnw0.Q(jArr34, jArr36);
                }
                nnw0.O(jArr36, jArr34, jArr33);
                nnw0.Q(jArr34, jArr36);
                nnw0.Q(jArr36, jArr34);
                for (int i21 = 2; i21 < 50; i21 += 2) {
                    nnw0.Q(jArr34, jArr36);
                    nnw0.Q(jArr36, jArr34);
                }
                nnw0.O(jArr34, jArr36, jArr32);
                nnw0.Q(jArr36, jArr34);
                nnw0.Q(jArr34, jArr36);
                nnw0.Q(jArr36, jArr34);
                nnw0.Q(jArr34, jArr36);
                nnw0.Q(jArr36, jArr34);
                nnw0.O(jArr25, jArr36, jArr28);
                nnw0.O(jArr24, jArr5, jArr25);
                long[] jArr37 = new long[10];
                long[] jArr38 = new long[10];
                long[] jArr39 = new long[11];
                long[] jArr40 = new long[11];
                long[] jArr41 = new long[11];
                nnw0.O(jArr37, jArr2, jArr24);
                nnw0.U(jArr38, jArr2, jArr24);
                long[] jArr42 = new long[10];
                jArr42[0] = 486662;
                nnw0.U(jArr40, jArr38, jArr42);
                nnw0.O(jArr40, jArr40, jArr4);
                nnw0.U(jArr40, jArr40, jArr35);
                nnw0.O(jArr40, jArr40, jArr37);
                nnw0.O(jArr40, jArr40, jArr35);
                for (int i22 = 0; i22 < 10; i22++) {
                    jArr39[i22] = jArr40[i22] * 4;
                }
                nnw0.N(jArr39);
                nnw0.O(jArr40, jArr37, jArr4);
                nnw0.S(jArr40, jArr40, jArr4);
                nnw0.O(jArr41, jArr38, jArr35);
                nnw0.U(jArr40, jArr40, jArr41);
                nnw0.Q(jArr40, jArr40);
                if (MessageDigest.isEqual(nnw0.T(jArr39), nnw0.T(jArr40))) {
                    return nnw0.T(jArr24);
                }
                jf4.n("Arithmetic error in curve multiplication with the public key: ".concat(zcm0.s(bArr2)));
                return null;
            }
            if (MessageDigest.isEqual(bArr3[i3], bArrCopyOf2)) {
                throw new InvalidKeyException("Banned public key: ".concat(zcm0.s(bArr3[i3])));
            }
            i3++;
        }
    }

    public static String z(int i, int i2, String str) {
        if (i < 0) {
            return qem0.w("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return qem0.w("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        jf4.o(twn.m(i2, "negative size: "));
        return null;
    }
}
