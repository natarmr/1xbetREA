package a;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.text.Spanned;
import com.huawei.hms.framework.common.BundleUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class q0x {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v7 */
    public static final void A(mm40 mm40Var, fr5 fr5Var, int i, Integer num, Function2 function2, fet fetVar, int i2) {
        mm40 mm40Var2;
        ?? r13;
        boolean z;
        fr5Var.getClass();
        function2.getClass();
        fetVar.g0(1320740918);
        int i3 = i2 | 6 | (fetVar.g(fr5Var) ? 32 : 16) | (fetVar.e(i) ? 256 : 128) | (fetVar.g(num) ? 2048 : 1024) | (fetVar.i(function2) ? 16384 : 8192);
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = androidx.compose.runtime.e.e(null);
                fetVar.o0(objP);
            }
            pz40 pz40Var = (pz40) objP;
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = o7k0.n(jm40Var, 96.0f);
            boolean z2 = ((i3 & 112) == 32) | ((i3 & 57344) == 16384);
            Object objP2 = fetVar.P();
            if (z2 || objP2 == obj) {
                objP2 = new pia(function2, fr5Var, pz40Var, (byte) 7);
                fetVar.o0(objP2);
            }
            mm40 mm40VarE0 = o2e.e0(y860.W(mm40VarN, null, null, false, null, (Function0) objP2, 28), "SquareSNoTitleBannerItem_Box");
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            jr8 jr8Var = jr8.f16991a;
            mm40 mm40VarE1 = o2e.e0(lgb.J(jr8Var.a(jm40Var), vgg0.a(24.0f)), "SquareSNoTitleBannerItem_BannerImage");
            o0x o0xVar = fr5Var.b;
            er5 er5Var = fr5Var.f;
            o0x o0xVar2 = fr5Var.g;
            o0x o0xVar3 = fr5Var.c;
            Object objP3 = fetVar.P();
            if (objP3 == obj) {
                objP3 = new ryc0(pz40Var, (byte) 20);
                fetVar.o0(objP3);
            }
            int i4 = i3 << 3;
            mm40Var2 = jm40Var;
            etl.a(mm40VarE1, o0xVar, o0xVar3, i, num, null, 0.0f, (Function1) objP3, fetVar, (i4 & 57344) | (i4 & 7168) | 12582912, 96);
            if (o0xVar2 != null) {
                fetVar.e0(1133512424);
                r13 = 0;
                etl.d(lgb.J(jr8Var.b(mm40Var2, gqw0.h), vgg0.c(0.0f, 0.0f, 24.0f, 24.0f, 3)), o0xVar2, fetVar, 0);
                fetVar.r(false);
            } else {
                r13 = 0;
                fetVar.e0(1133910278);
                fetVar.r(false);
            }
            if (er5Var != null) {
                fetVar.e0(1133959754);
                z = true;
                etl.c(o7k0.u(mm40Var2, 0.0f, 98.0f, 1), er5Var, fetVar, r13, r13);
                fetVar.r(r13);
            } else {
                z = true;
                fetVar.e0(1134088838);
                fetVar.r(r13);
            }
            fetVar.r(z);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new qia(mm40Var2, fr5Var, i, num, function2, i2, (byte) 7);
        }
    }

    public static final void B(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(-472357462);
        int i2 = i | 6;
        byte b = 2;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            etl.b(0, fetVar, o2e.e0(lgb.J(o7k0.n(jm40Var, 96.0f), vgg0.a(24.0f)), "SquareSNoTitleSkeleton_Box"));
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cpl0(mm40Var, i, b);
        }
    }

    public static final void C(mm40 mm40Var, cp5 cp5Var, fet fetVar, int i) {
        vqm vqmVar;
        cp5Var.getClass();
        fetVar.g0(-378879907);
        int i2 = i | 6 | (fetVar.e(cp5Var.ordinal()) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            int iOrdinal = cp5Var.ordinal();
            if (iOrdinal == 0) {
                vqmVar = vqm.f37862a;
            } else {
                if (iOrdinal != 1) {
                    t9f.b();
                    return;
                }
                vqmVar = vqm.b;
            }
            fqj0 fqj0VarD0 = vbc.d0(vqmVar, fetVar, 0, 0);
            xx7 xx7Var = gqw0.n;
            zcl zclVar = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), xx7Var, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar, jm40Var);
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
            zq8.a(0, fetVar, o2e.e0(xbc.c0(o7k0.n(lgb.J(jm40Var, vgg0.a(24.0f)), 96.0f), fqj0VarD0), "SquareSBannerItem_Skeleton"));
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(o7k0.p(lgb.J(jm40Var, ugg0Var), 80.0f, 12.0f), fqj0VarD0));
            zq8.a(0, fetVar, xbc.c0(o7k0.p(lgb.J(jm40Var, ugg0Var), 64.0f, 12.0f), fqj0VarD0));
            fetVar.r(true);
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new a5k0(mm40Var, cp5Var, i, (byte) 23);
        }
    }

    public static final void D(mm40 mm40Var, o0x o0xVar, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(1963929003);
        byte b = 2;
        int i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i | (fetVar2.g(o0xVar) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = o7k0.n(mm40Var, 38.0f);
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarQ = i120.Q(mm40VarN, s6t0.b().f33626a.getBackground(), vgg0.f37379a);
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
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.e(hz3.f13888a);
                fetVar2.o0(objP);
            }
            pz40 pz40Var2 = (pz40) objP;
            Object objA = o0xVar.a();
            pge pgeVar = gqw0.A;
            Object objP2 = fetVar2.P();
            if (objP2 == cl5Var) {
                objP2 = new y9v(pz40Var2, (byte) 11);
                fetVar2.o0(objP2);
            }
            mz3 mz3VarX = l7x.X(objA, (Function1) objP2, pgeVar, fetVar2, 3456, 18);
            lz3 lz3Var = (lz3) pz40Var2.getValue();
            if (lz3Var != null) {
                boolean z = lz3Var instanceof kz3;
                jm40 jm40Var = jm40.b;
                if (z) {
                    fetVar2.e0(531499442);
                    j0x.b(mz3VarX, null, o7k0.n(jm40Var, 28.0f), null, pgeVar, 0.0f, null, fetVar, 24624, 104);
                    fetVar2 = fetVar;
                    fetVar2.r(false);
                } else if ((lz3Var instanceof hz3) || (lz3Var instanceof iz3) || (lz3Var instanceof jz3)) {
                    fetVar2.e0(531927397);
                    dww.c(a8k0.F(R.drawable.ic_glyph_favourite_active, 0, fetVar2), null, o7k0.n(jm40Var, 28.0f), ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary(), fetVar2, 56, 0);
                    fetVar2 = fetVar2;
                    fetVar2.r(false);
                }
                fetVar2.r(true);
            }
            throw b1j.f(848426845, fetVar2, false);
        }
        fetVar2.X();
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zwa(mm40Var, o0xVar, i, b);
        }
    }

    public static final void E(a4x a4xVar, a4x a4xVar2, xcz xczVar, boolean z, Function1 function1, fet fetVar, int i) {
        fet fetVar2;
        k6z k6zVar;
        fetVar.g0(1476550101);
        int i2 = i | (fetVar.g(a4xVar) ? 4 : 2) | (fetVar.g(a4xVar2) ? 32 : 16) | (fetVar.g(xczVar) ? 256 : 128) | (fetVar.h(z) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                fetVar.o0(objP);
            }
            vne vneVar = (vne) objP;
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(o7k0.g(jm40Var, 0.0f, 4096.0f, 1), 1.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarD);
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
            mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
            lh80 lh80Var = new lh80(8.0f, 8.0f, 8.0f, 8.0f);
            yx7 yx7Var = gqw0.k;
            boolean zI = ((i2 & 112) == 32) | ((i2 & 896) == 256) | fetVar.i(vneVar);
            Object objP2 = fetVar.P();
            if (zI || objP2 == cl5Var) {
                objP2 = new enm(a4xVar2, xczVar, vneVar, function1);
                fetVar.o0(objP2);
            }
            b8k0.f(mm40VarD2, xczVar, lh80Var, false, null, yx7Var, null, false, null, (Function1) objP2, fetVar, ((i2 >> 3) & 112) | 196614, 472);
            fetVar2 = fetVar;
            if (z) {
                fetVar2.e0(-1697498766);
                k6zVar = (k6z) fetVar2.k(bmd.n);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-1697497842);
                fetVar2.r(false);
                k6zVar = k6z.f17794a;
            }
            obc.d(bmd.n.a(k6zVar), u1c.M(1996103563, new eup(a4xVar, (byte) 21), fetVar2), fetVar2, 56);
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ip0((byte) 29, i, (wdr) function1, (Object) a4xVar, (Object) a4xVar2, (Object) xczVar, z);
        }
    }

    public static final void F(mm40 mm40Var, cop0 cop0Var, fet fetVar, int i) {
        cop0 cop0Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(521475065);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(cop0Var) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarD);
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
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            x7z x7zVar = new x7z(1.0f, true);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, x7zVar);
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
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
            String str = cop0Var.f4714a;
            y9q0 y9q0VarM = g1t0.m();
            zfn zfnVar = zaq0.b;
            v8q0.a(str, mm40VarD2, 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0.a(y9q0VarM, ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214), fetVar, 48, 24960, 110588);
            cop0Var2 = cop0Var;
            v8q0.a(cop0Var.b, o7k0.d(jm40Var, 1.0f), 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0.a(g1t0.m(), ((ThemeColors) fetVar.k(zfnVar)).getTextPrimary(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214), fetVar, 48, 24960, 110588);
            fetVar2 = fetVar;
            fetVar2.r(true);
            b(3072, fetVar2, o7k0.y(jm40Var, null, 3), cop0Var2.c, cop0Var2.d, cop0Var2.e);
            fetVar2.r(true);
        } else {
            cop0Var2 = cop0Var;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new jt50(mm40Var, cop0Var2, i, (byte) 29);
        }
    }

    public static final void G(int i, fet fetVar, mm40 mm40Var, String str, String str2) {
        mm40 mm40Var2;
        float f;
        fet fetVar2 = fetVar;
        fetVar2.g0(-342377571);
        int i2 = i | 6 | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(str2) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            boolean zD = pkd.d(fetVar2);
            if (zD) {
                zcl zclVar = qmk.f28987a;
                f = 416.0f;
            } else {
                zcl zclVar2 = qmk.f28987a;
                f = 216.0f;
            }
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = o7k0.e(o7k0.d(jm40Var, 1.0f), f);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE);
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
            k7x.b(str2, null, o7k0.d(jm40Var, 1.0f), a8k0.F(R.drawable.promo_shop_default_large, 0, fetVar2), a8k0.F(R.drawable.promo_shop_default_large, 0, fetVar2), null, null, null, null, null, gqw0.A, null, fetVar2, ((i2 >> 6) & 14) | 37296, 6, 31712);
            mm40 mm40VarE2 = o7k0.e(o7k0.d(jm40Var, 1.0f), 128.0f);
            zx7 zx7Var = gqw0.h;
            jr8 jr8Var = jr8.f16991a;
            mm40 mm40VarB = jr8Var.b(mm40VarE2, zx7Var);
            pz40 pz40Var = s6t0.f31722a;
            StaticColors staticColors = StaticColors.INSTANCE;
            zq8.a(0, fetVar2, i120.P(mm40VarB, yk5.n(q3d.j(new y3d(staticColors.m63getBlack00d7_KjU()), new y3d(staticColors.m75getBlack600d7_KjU())), 0.0f, 0.0f, 14), null, 6));
            if (str.length() > 0) {
                fetVar2.e0(1247109253);
                v8q0.a(str, jr8Var.b(s5x0.N(jm40Var, 16.0f, 0.0f, 16.0f, zD ? 48.0f : 32.0f, 2), gqw0.g), staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.y, null, j1t0.f15753a, 0L, null, 0, 0, qmk.K, 16646109), fetVar2, (i2 >> 3) & 14, 0, 131064);
                fetVar2 = fetVar2;
                fetVar2.r(false);
            } else {
                fetVar2 = fetVar2;
                fetVar2.e0(1247534015);
                fetVar2.r(false);
            }
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new man(mm40Var2, str, str2, i, (byte) 16);
        }
    }

    public static pfd I(String str, String str2) {
        e45 e45Var = new e45(str, str2);
        ofd ofdVarB = pfd.b(e45.class);
        ofdVarB.e = true;
        ofdVarB.f = new nfd(e45Var, (byte) 0);
        return ofdVarB.b();
    }

    public static pfd J(String str, udk udkVar) {
        ofd ofdVarB = pfd.b(e45.class);
        ofdVarB.e = true;
        ofdVarB.a(c7k.c(Context.class));
        ofdVarB.f = new uq((Object) str, (Object) udkVar, (byte) 16);
        return ofdVarB.b();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object K(qpg0 qpg0Var, zje zjeVar) {
        rpg0 rpg0Var;
        if (zjeVar instanceof rpg0) {
            rpg0Var = (rpg0) zjeVar;
            int i = rpg0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                rpg0Var.k = i - Integer.MIN_VALUE;
            } else {
                rpg0Var = new rpg0(zjeVar);
            }
        } else {
            rpg0Var = new rpg0(zjeVar);
        }
        Object obj = rpg0Var.j;
        wne wneVar = wne.f39444a;
        int i2 = rpg0Var.k;
        if (i2 == 0) {
            z1x.P(obj);
            rpg0Var.i = qpg0Var;
            rpg0Var.k = 1;
            xpg0 xpg0VarZ0 = qpg0Var.Z0("SELECT changes()");
            try {
                xpg0VarZ0.W0();
                Integer num = new Integer((int) xpg0VarZ0.getLong(0));
                ay3.L(xpg0VarZ0, null);
                if (num == wneVar) {
                    return wneVar;
                }
                obj = num;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    ay3.L(xpg0VarZ0, th);
                    throw th2;
                }
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qpg0Var = rpg0Var.i;
            z1x.P(obj);
        }
        if (((Number) obj).intValue() == 0) {
            return new Long(-1L);
        }
        xpg0 xpg0VarZ1 = qpg0Var.Z0("SELECT last_insert_rowid()");
        try {
            xpg0VarZ1.W0();
            Long l = new Long(xpg0VarZ1.getLong(0));
            ay3.L(xpg0VarZ1, null);
            return l;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                ay3.L(xpg0VarZ1, th3);
                throw th4;
            }
        }
    }

    public static final Object L(nai0 nai0Var, zai0 zai0Var) {
        Object objG = nai0Var.f23193a.g(zai0Var);
        if (objG == null) {
            return null;
        }
        return objG;
    }

    public static final boolean M(Spanned spanned, Class cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    public static wu9 N(CoroutineContext coroutineContext, Function2 function2) {
        yne yneVar = yne.f42936a;
        coroutineContext.getClass();
        return y0x0.I(new hi(coroutineContext, yneVar, function2, (byte) 8));
    }

    public static final o0x O(ei10 ei10Var) {
        String str = ei10Var.b;
        if (str.length() > 0) {
            StringBuilder sb = new StringBuilder(ujn.h);
            if (str.length() == 0) {
                sb.setLength(0);
            } else if (StringsKt.O(str, ujn.h, false) || kotlin.text.c.x(str, "https://", false)) {
                sb.setLength(0);
                sb.append(str);
            } else {
                if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                    sb.append('/');
                }
                sb.append(StringsKt.y0(str, '/'));
            }
            return new n0x(sb.toString());
        }
        int i = ei10Var.f7836a;
        if (i == 1) {
            return new m0x(R.drawable.ic_glyph_color_status_copper, null, 6);
        }
        if (i == 2) {
            return new m0x(R.drawable.ic_glyph_color_status_bronze, null, 6);
        }
        if (i == 3) {
            return new m0x(R.drawable.ic_glyph_color_status_silver, null, 6);
        }
        if (i == 4) {
            return new m0x(R.drawable.ic_glyph_color_status_gold, null, 6);
        }
        if (i == 5) {
            return new m0x(R.drawable.ic_glyph_color_status_ruby, null, 6);
        }
        if (i == 6) {
            return new m0x(R.drawable.ic_glyph_color_status_sapfir, null, 6);
        }
        if (i == 7) {
            return new m0x(R.drawable.ic_glyph_color_status_brilliant, null, 6);
        }
        return i == 8 ? new m0x(R.drawable.ic_glyph_color_status_vip, null, 6) : new m0x(R.drawable.ic_glyph_color_status_unknown, null, 6);
    }

    public static final ArrayList P(List list, boolean z, String str, udl0 udl0Var, aw20 aw20Var) {
        list.getClass();
        str.getClass();
        aw20Var.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            nu20 nu20Var = (nu20) it.next();
            ArrayList arrayList2 = nu20Var.f24128a;
            ArrayList arrayList3 = nu20Var.f24128a;
            if (!arrayList2.isEmpty()) {
                y9q0 y9q0VarJ0 = uzb.J0(aw20Var);
                long j = nu20Var.b;
                String str2 = nu20Var.c;
                String str3 = nu20Var.f;
                if (str3.length() == 0) {
                    str3 = str;
                }
                String str4 = str2 + " (" + ((Object) str3) + Separators.RPAREN;
                String str5 = nu20Var.d;
                boolean z2 = nu20Var.e;
                Iterator it2 = arrayList3.iterator();
                int size = 0;
                while (it2.hasNext()) {
                    size += ((List) it2.next()).size();
                }
                arrayList.add(new zgx(new ygx(udl0Var, j, str4, str5, z2, size, y9q0VarJ0), ro4.j0(arrayList3, nu20Var.b, z, x8x.G(aw20Var), null), nu20Var.g + BundleUtil.UNDERLINE_TAG + nu20Var.b, udl0Var));
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r20v4 */
    /* JADX WARN: Type inference failed for: r20v5, types: [a.z540, java.lang.String] */
    /* JADX WARN: Type inference failed for: r20v7 */
    /* JADX WARN: Type inference failed for: r20v8 */
    public static final z540 Q(m640 m640Var) {
        ?? r20;
        prs0 prs0Var;
        t440 o440Var;
        Integer num;
        Long l;
        Long l2;
        prs0 prs0Var2;
        String str;
        Object obj;
        String str2;
        Long l3;
        Long l4;
        Long l5;
        Long l6;
        Long l7;
        Long l8;
        String str3;
        String str4;
        m640Var.getClass();
        Integer num2 = m640Var.f21250a;
        w440 w440Var = m640Var.h;
        boolean z = num2 != null;
        String str5 = m640Var.b;
        if (str5 == null) {
            str5 = "";
        }
        String str6 = m640Var.c;
        if (str6 == null) {
            str6 = "";
        }
        String str7 = m640Var.d;
        if (str7 == null) {
            str7 = "";
        }
        String str8 = m640Var.e;
        Object obj2 = null;
        String str9 = w440Var != null ? w440Var.c : null;
        String str10 = str9 != null ? str9 : "";
        Integer num3 = m640Var.f;
        if (num3 == null) {
            jf4.k(null);
            return null;
        }
        int iIntValue = num3.intValue();
        Boolean bool = m640Var.g;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        t440 n440Var = l440.f19387a;
        if (w440Var != null) {
            Long l9 = w440Var.f38528a;
            b440 b440Var = w440Var.d;
            Integer numValueOf = l9 != null ? Integer.valueOf((int) l9.longValue()) : null;
            if (numValueOf != null && numValueOf.intValue() == 1) {
                if (b440Var == null || (str4 = b440Var.f1940a) == null) {
                    jf4.k(null);
                    return null;
                }
                n440Var = new m440(str4);
            } else if (numValueOf != null && numValueOf.intValue() == 2) {
                wsz wszVar = j540.b;
                if (b440Var == null || (str3 = b440Var.b) == null) {
                    jf4.k(null);
                    return null;
                }
                wszVar.getClass();
                for (Object obj3 : j540.e) {
                    if (((j540) obj3).f15916a.equals(str3)) {
                        obj2 = obj3;
                        break;
                    }
                }
                j540 j540Var = (j540) obj2;
                if (j540Var == null) {
                    j540Var = j540.UNKNOWN;
                }
                n440Var = new p440(j540Var);
            } else {
                if (numValueOf != null && numValueOf.intValue() == 4) {
                    if (b440Var == null) {
                        jf4.k(null);
                        return null;
                    }
                    Long l10 = b440Var.d;
                    Long l11 = b440Var.h;
                    Long l12 = b440Var.f;
                    Long l13 = b440Var.i;
                    if (l10 != null && l10.longValue() == 0) {
                        r20 = 0;
                        Long lValueOf = Long.valueOf(l13 != null ? l13.longValue() : 0L);
                        if (l12 == null) {
                            jf4.k(null);
                            return null;
                        }
                        prs0Var = new prs0(lValueOf, l12, Long.valueOf(l11 != null ? l11.longValue() : 0L));
                    } else {
                        Object obj4 = null;
                        if (l10 != null && l10.longValue() == 1) {
                            Long lValueOf2 = Long.valueOf(l13 != null ? l13.longValue() : 0L);
                            Long lValueOf3 = Long.valueOf(l12 != null ? l12.longValue() : 0L);
                            if (l11 == null) {
                                jf4.k(null);
                                return null;
                            }
                            prs0Var = new prs0(lValueOf2, lValueOf3, l11);
                            r20 = obj4;
                        } else {
                            if (l13 == null) {
                                jf4.k(null);
                                return null;
                            }
                            if (l12 == null) {
                                jf4.k(null);
                                return null;
                            }
                            if (l11 == null) {
                                jf4.k(null);
                                return null;
                            }
                            prs0Var = new prs0(l13, l12, l11);
                            r20 = obj4;
                        }
                    }
                    long jLongValue = ((Number) prs0Var.f27482a).longValue();
                    long jLongValue2 = ((Number) prs0Var.b).longValue();
                    long jLongValue3 = ((Number) prs0Var.c).longValue();
                    Integer num4 = b440Var.c;
                    boolean z2 = num4 != null && num4.intValue() == 1;
                    g9m0 g9m0Var = yto0.b;
                    if (l10 == null) {
                        jf4.k(r20);
                        return r20;
                    }
                    long jLongValue4 = l10.longValue();
                    g9m0Var.getClass();
                    o440Var = new o440(jLongValue, jLongValue2, jLongValue3, z2, g9m0.c(jLongValue4));
                } else if (numValueOf != null && numValueOf.intValue() == 8) {
                    if (b440Var == null || (l8 = b440Var.i) == null) {
                        jf4.k(null);
                        return null;
                    }
                    n440Var = new r440(l8.longValue());
                } else if (numValueOf != null && numValueOf.intValue() == 16) {
                    if (b440Var == null || (l7 = b440Var.j) == null) {
                        jf4.k(null);
                        return null;
                    }
                    n440Var = new g440(l7.longValue());
                } else if (numValueOf != null && numValueOf.intValue() == 32) {
                    if (b440Var == null || (l6 = b440Var.k) == null) {
                        jf4.k(null);
                        return null;
                    }
                    n440Var = new h440(l6.longValue());
                } else if (numValueOf != null && numValueOf.intValue() == 64) {
                    if (b440Var == null || (l5 = b440Var.l) == null) {
                        jf4.k(null);
                        return null;
                    }
                    long jLongValue5 = l5.longValue();
                    Long l14 = b440Var.n;
                    if (l14 == null) {
                        jf4.k(null);
                        return null;
                    }
                    n440Var = new d440(jLongValue5, l14.longValue());
                } else if (numValueOf != null && numValueOf.intValue() == 1048576) {
                    if (b440Var == null || (l4 = b440Var.m) == null) {
                        jf4.k(null);
                        return null;
                    }
                    long jLongValue6 = l4.longValue();
                    Long l15 = b440Var.n;
                    if (l15 == null) {
                        jf4.k(null);
                        return null;
                    }
                    n440Var = new d440(jLongValue6, l15.longValue());
                } else if (numValueOf != null && numValueOf.intValue() == 2097152) {
                    if (b440Var == null || (l3 = b440Var.s) == null) {
                        jf4.k(null);
                        return null;
                    }
                    n440Var = new i440(l3.longValue());
                } else if (numValueOf != null && numValueOf.intValue() == 4096) {
                    if (b440Var == null || (str2 = b440Var.p) == null) {
                        jf4.k(null);
                        return null;
                    }
                    n440Var = new c440(str2);
                } else if (numValueOf != null && numValueOf.intValue() == 128) {
                    gfk0 gfk0Var = xz1.b;
                    if (b440Var == null || (str = b440Var.o) == null) {
                        jf4.k(null);
                        return null;
                    }
                    gfk0Var.getClass();
                    Iterator it = xz1.e.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        Object next = it.next();
                        if (((xz1) next).f41732a.equals(str)) {
                            obj = next;
                            break;
                        }
                    }
                    xz1 xz1Var = (xz1) obj;
                    if (xz1Var == null) {
                        xz1Var = xz1.UNKNOWN;
                    }
                    n440Var = new e440(xz1Var);
                } else if (numValueOf != null && numValueOf.intValue() == 65536) {
                    if (b440Var == null) {
                        jf4.k(null);
                        return null;
                    }
                    Long l16 = b440Var.d;
                    Long l17 = b440Var.h;
                    Long l18 = b440Var.f;
                    Long l19 = b440Var.i;
                    if (l16 != null && l16.longValue() == 0) {
                        Long lValueOf4 = Long.valueOf(l19 != null ? l19.longValue() : 0L);
                        if (l18 == null) {
                            jf4.k(null);
                            return null;
                        }
                        prs0Var2 = new prs0(lValueOf4, l18, Long.valueOf(l17 != null ? l17.longValue() : 0L));
                    } else if (l16 != null && l16.longValue() == 1) {
                        Long lValueOf5 = Long.valueOf(l19 != null ? l19.longValue() : 0L);
                        Long lValueOf6 = Long.valueOf(l18 != null ? l18.longValue() : 0L);
                        if (l17 == null) {
                            jf4.k(null);
                            return null;
                        }
                        prs0Var2 = new prs0(lValueOf5, lValueOf6, l17);
                    } else {
                        if (l19 == null) {
                            jf4.k(null);
                            return null;
                        }
                        if (l18 == null) {
                            jf4.k(null);
                            return null;
                        }
                        if (l17 == null) {
                            jf4.k(null);
                            return null;
                        }
                        prs0Var2 = new prs0(l19, l18, l17);
                    }
                    long jLongValue7 = ((Number) prs0Var2.f27482a).longValue();
                    long jLongValue8 = ((Number) prs0Var2.b).longValue();
                    long jLongValue9 = ((Number) prs0Var2.c).longValue();
                    Long l20 = b440Var.g;
                    long jLongValue10 = l20 != null ? l20.longValue() : -1L;
                    Integer num5 = b440Var.c;
                    boolean z3 = num5 != null && num5.intValue() == 1;
                    g9m0 g9m0Var2 = yto0.b;
                    if (l16 == null) {
                        jf4.k(null);
                        return null;
                    }
                    long jLongValue11 = l16.longValue();
                    g9m0Var2.getClass();
                    yto0 yto0VarC = g9m0.c(jLongValue11);
                    Integer num6 = b440Var.e;
                    o440Var = new j440(jLongValue7, jLongValue8, jLongValue10, jLongValue9, z3, yto0VarC, num6 != null ? num6.intValue() : -1);
                } else if (numValueOf != null && numValueOf.intValue() == 16384) {
                    if (b440Var == null || (l2 = b440Var.i) == null) {
                        jf4.k(null);
                        return null;
                    }
                    long jLongValue12 = l2.longValue();
                    Long l21 = b440Var.l;
                    if (l21 == null) {
                        jf4.k(null);
                        return null;
                    }
                    long jLongValue13 = l21.longValue();
                    Long l22 = b440Var.n;
                    if (l22 == null) {
                        jf4.k(null);
                        return null;
                    }
                    o440Var = new f440(jLongValue12, jLongValue13, l22.longValue());
                } else if (numValueOf != null && numValueOf.intValue() == 32768) {
                    if (b440Var == null || (l = b440Var.q) == null) {
                        jf4.k(null);
                        return null;
                    }
                    n440Var = new s440(l.longValue());
                } else if (numValueOf != null && numValueOf.intValue() == 4194304) {
                    n440Var = q440.f28081a;
                } else if (numValueOf != null && numValueOf.intValue() == 8192) {
                    n440Var = k440.f17650a;
                } else if (numValueOf != null && numValueOf.intValue() == 131072) {
                    if (b440Var == null || (num = b440Var.r) == null) {
                        jf4.k(null);
                        return null;
                    }
                    n440Var = new n440(num.intValue());
                }
                n440Var = o440Var;
            }
        }
        return new z540(z, str5, str6, str7, str8, str10, iIntValue, zBooleanValue, n440Var);
    }

    public static final ArrayList R(eh50 eh50Var, pep0 pep0Var) {
        eh50Var.getClass();
        List<ah50> list = eh50Var.d;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        for (ah50 ah50Var : list) {
            arrayList.add(new fal0(ah50Var.b, pep0Var, new e5a0(new c280(vsm0.s(ah50Var.f857a, ah50Var.c), R.drawable.ic_glyph_placeholder_player))));
        }
        return arrayList;
    }

    public static final b9a0 S(haa0 haa0Var) {
        bre breVar;
        String str;
        String str2;
        haa0Var.getClass();
        String str3 = haa0Var.f12715a;
        String str4 = "";
        if (str3 == null) {
            str3 = "";
        }
        String str5 = haa0Var.b;
        if (str5 == null) {
            str5 = "";
        }
        Integer num = haa0Var.c;
        int iIntValue = num != null ? num.intValue() : 0;
        String str6 = haa0Var.d;
        if (str6 == null) {
            str6 = "";
        }
        lre lreVar = haa0Var.e;
        if (lreVar != null) {
            String str7 = lreVar.f20527a;
            if (str7 == null) {
                str7 = "";
            }
            String str8 = lreVar.b;
            if (str8 == null) {
                str8 = "";
            }
            breVar = new bre(str7, str8);
        } else {
            breVar = bre.c;
        }
        String str9 = haa0Var.f;
        if (str9 == null) {
            str9 = "";
        }
        if (kotlin.text.c.x(str9, ujn.h, false)) {
            str2 = str6;
            str = str9;
        } else {
            if (str9.length() != 0) {
                List list = u0d.f34849a;
                if (!u0d.c(str9)) {
                    str4 = String.format(Locale.ENGLISH, StringsKt.O(str9, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str9}, 2));
                }
            }
            String str10 = str6;
            str = str4;
            str2 = str10;
        }
        return new b9a0(str3, str5, iIntValue, str2, breVar, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r16v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v0, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.ArrayList] */
    public static final ivd0 T(qvd0 qvd0Var, long j, String str, List list) {
        ?? arrayList;
        ?? arrayList2;
        qvd0Var.getClass();
        list.getClass();
        List<nvd0> list2 = qvd0Var.f29381a;
        if (list2 != null) {
            arrayList = new ArrayList(r3d.q(list2, 10));
            for (nvd0 nvd0Var : list2) {
                nvd0Var.getClass();
                String str2 = nvd0Var.f24185a;
                if (str2 == null) {
                    str2 = "";
                }
                Integer num = nvd0Var.b;
                int iIntValue = num != null ? num.intValue() : -1;
                Integer num2 = nvd0Var.c;
                int iIntValue2 = num2 != null ? num2.intValue() : -1;
                Integer num3 = nvd0Var.d;
                int iIntValue3 = num3 != null ? num3.intValue() : -1;
                Integer num4 = nvd0Var.e;
                int iIntValue4 = num4 != null ? num4.intValue() : -1;
                Float f = nvd0Var.f;
                float fFloatValue = f != null ? f.floatValue() : -1.0f;
                Integer num5 = nvd0Var.g;
                arrayList.add(new kvd0(str2, iIntValue, iIntValue2, iIntValue3, iIntValue4, fFloatValue, num5 != null ? num5.intValue() : -1));
            }
        } else {
            arrayList = iun.f15405a;
        }
        ?? r11 = arrayList;
        Integer num6 = qvd0Var.b;
        int iIntValue5 = num6 != null ? num6.intValue() : -1;
        Map map = qvd0Var.c;
        if (map == null) {
            map = lun.f20680a;
            map.getClass();
        }
        Map map2 = map;
        Map map3 = qvd0Var.d;
        if (map3 == null) {
            map3 = lun.f20680a;
            map3.getClass();
        }
        Map map4 = map3;
        tvd0 tvd0Var = qvd0Var.e;
        int i = tvd0Var != null ? jvd0.f17199a[tvd0Var.ordinal()] : -1;
        rvd0 rvd0Var = i != 1 ? i != 2 ? rvd0.c : rvd0.b : rvd0.f31162a;
        List<zud0> list3 = qvd0Var.f;
        if (list3 != null) {
            arrayList2 = new ArrayList(r3d.q(list3, 10));
            for (zud0 zud0Var : list3) {
                zud0Var.getClass();
                Integer num7 = zud0Var.b;
                int iIntValue6 = num7 != null ? num7.intValue() : 0;
                String str3 = zud0Var.f45006a;
                if (str3 == null) {
                    str3 = "";
                }
                arrayList2.add(new wud0(iIntValue6, str3));
            }
        } else {
            arrayList2 = 0;
        }
        if (arrayList2 == 0) {
            arrayList2 = iun.f15405a;
        }
        return new ivd0(j, str, list, r11, iIntValue5, map2, map4, rvd0Var, arrayList2);
    }

    public static final c2g0 U(bem bemVar) {
        if (bemVar instanceof zdm) {
            return new a2g0(((zdm) bemVar).f44219a);
        }
        if (bemVar instanceof xdm) {
            return new y1g0(((xdm) bemVar).f40700a);
        }
        if (bemVar instanceof rdm) {
            return new z1g0(((rdm) bemVar).f30297a);
        }
        boolean z = bemVar instanceof wdm;
        if (z) {
            return new b2g0(((wdm) bemVar).f38979a);
        }
        if ((bemVar instanceof sdm) || (bemVar instanceof tdm) || (bemVar instanceof udm) || (bemVar instanceof vdm) || z || (bemVar instanceof ydm) || (bemVar instanceof aem)) {
            return x1g0.f40121a;
        }
        t9f.b();
        return null;
    }

    public static final bj50 V(uf50 uf50Var) {
        fg50 fg50Var;
        bg50 bg50Var;
        fg50 fg50Var2;
        List list;
        uf50Var.getClass();
        aj50 aj50VarE = uf50Var.e();
        jg50 jg50Var = aj50VarE != null ? aj50VarE.d : null;
        bi50 bi50Var = aj50VarE != null ? aj50VarE.e : null;
        ih50 ih50Var = (aj50VarE == null || (list = aj50VarE.c) == null) ? null : (ih50) CollectionsKt.f0(list);
        ng50 ng50Var = (aj50VarE == null || (fg50Var2 = aj50VarE.b) == null) ? null : fg50Var2.f9477a;
        ri50 ri50Var = (aj50VarE == null || (fg50Var = aj50VarE.b) == null || (bg50Var = fg50Var.b) == null) ? null : bg50Var.f2538a;
        return new bj50(uf50Var.getId(), uf50Var.i(), uf50Var instanceof vf50, jg50Var != null ? jg50Var.f16464a : null, jg50Var != null ? jg50Var.b : null, bi50Var != null ? bi50Var.f2643a : null, bi50Var != null ? bi50Var.b : null, ih50Var != null ? Long.valueOf(ih50Var.b) : null, ih50Var != null ? Long.valueOf(ih50Var.c) : null, ng50Var != null ? Long.valueOf(ng50Var.f23469a) : null, ng50Var != null ? Double.valueOf(ng50Var.c) : null, ng50Var != null ? Long.valueOf(ng50Var.b) : null, ri50Var != null ? ri50Var.f30523a : null, ri50Var != null ? ri50Var.b : null);
    }

    public static final pdh0 W(ldh0 ldh0Var) {
        int i;
        ldh0Var.getClass();
        int i2 = ldh0Var.b;
        List list = ldh0Var.c;
        hdh0 hdh0Var = ldh0Var.f19851a;
        if (i2 == 2) {
            i = hdh0Var == hdh0.f12871a ? R.drawable.sea_battle_ship_destroyer_horizontal : R.drawable.sea_battle_ship_destroyer_vertical;
        } else if (i2 != 3) {
            i = hdh0Var == hdh0.f12871a ? R.drawable.sea_battle_ship_submarine_horizontal : R.drawable.sea_battle_ship_submarine_vertical;
        } else {
            i = hdh0Var == hdh0.f12871a ? R.drawable.sea_battle_ship_cruiser_horizontal : R.drawable.sea_battle_ship_cruiser_vertical;
        }
        zch0 zch0Var = (zch0) CollectionsKt.firstOrNull(list);
        int i3 = zch0Var != null ? zch0Var.f44167a : 0;
        zch0 zch0Var2 = (zch0) CollectionsKt.firstOrNull(list);
        edh0 edh0Var = new edh0(i3, zch0Var2 != null ? zch0Var2.b : 0);
        zch0 zch0Var3 = (zch0) CollectionsKt.f0(list);
        int i4 = zch0Var3 != null ? zch0Var3.f44167a : 0;
        zch0 zch0Var4 = (zch0) CollectionsKt.f0(list);
        return new pdh0(i, edh0Var, new edh0(i4, zch0Var4 != null ? zch0Var4.b : 0));
    }

    public static final m0k0 X(ygs ygsVar) {
        vas vasVar;
        vas vasVar2;
        Integer num;
        Integer num2;
        ygsVar.getClass();
        long j = ygsVar.d;
        List list = ygsVar.r;
        ehs ehsVar = ygsVar.i;
        String str = ygsVar.A;
        long j2 = ygsVar.j;
        String string = StringsKt.u0(ygsVar.n).toString();
        List list2 = ygsVar.q;
        String str2 = (String) CollectionsKt.firstOrNull(list2);
        if (str2 == null) {
            str2 = "";
        }
        String str3 = (String) CollectionsKt.W(1, list2);
        if (str3 == null) {
            str3 = "";
        }
        long j3 = ygsVar.k;
        String string2 = StringsKt.u0(ygsVar.o).toString();
        String str4 = (String) CollectionsKt.firstOrNull(list);
        if (str4 == null) {
            str4 = "";
        }
        String str5 = (String) CollectionsKt.W(1, list);
        if (str5 == null) {
            str5 = "";
        }
        int iMax = Math.max(ygsVar.l.size(), ygsVar.m.size());
        String str6 = ehsVar != null ? ehsVar.d : null;
        if (str6 == null) {
            str6 = "";
        }
        String str7 = ygsVar.e;
        String str8 = ehsVar != null ? ehsVar.f7822a : null;
        String str9 = str8 == null ? "" : str8;
        String str10 = ygsVar.h;
        long j4 = ygsVar.f42600a;
        boolean z = ygsVar.c;
        long j5 = ygsVar.z;
        long j6 = ygsVar.f;
        long j7 = ygsVar.B;
        boolean z2 = ygsVar.g;
        int iIntValue = (ehsVar == null || (num2 = ehsVar.f) == null) ? -1 : num2.intValue();
        int iIntValue2 = (ehsVar == null || (num = ehsVar.g) == null) ? -1 : num.intValue();
        String str11 = (ehsVar == null || (vasVar2 = ehsVar.h) == null) ? null : vasVar2.f37106a;
        if (str11 == null) {
            str11 = "";
        }
        String str12 = (ehsVar == null || (vasVar = ehsVar.h) == null) ? null : vasVar.b;
        if (str12 == null) {
            str12 = "";
        }
        return new m0k0(j, str, j2, string, str2, str3, j3, string2, str4, str5, iMax, str6, iIntValue, iIntValue2, str11, str12, 0, 0, str7, "", str9, str10, j4, z, j5, j6, z2, j7, 0L, "", false, ygsVar.t, false, 268435456, 0);
    }

    public static final m0k0 Y(d0t d0tVar) {
        d0tVar.getClass();
        long j = d0tVar.v;
        f0t f0tVar = d0tVar.r;
        List list = f0tVar.d;
        f0t f0tVar2 = d0tVar.q;
        String str = d0tVar.I;
        long j2 = f0tVar2.f8731a;
        String strC0 = qzb.c0(d0tVar);
        List list2 = f0tVar2.d;
        String str2 = (String) CollectionsKt.firstOrNull(list2);
        if (str2 == null) {
            str2 = "";
        }
        String str3 = (String) CollectionsKt.W(1, list2);
        if (str3 == null) {
            str3 = "";
        }
        long j3 = f0tVar.f8731a;
        String str4 = str2;
        String strR0 = qzb.r0(d0tVar);
        String str5 = (String) CollectionsKt.firstOrNull(list);
        if (str5 == null) {
            str5 = "";
        }
        String str6 = (String) CollectionsKt.W(1, list);
        String str7 = str6 != null ? str6 : "";
        int iMax = Math.max(f0tVar2.c.size(), f0tVar.c.size());
        String str8 = str7;
        String str9 = str5;
        String str10 = str3;
        String strF0 = qzb.F0(d0tVar);
        String str11 = d0tVar.o;
        String str12 = d0tVar.i;
        rqs rqsVar = d0tVar.p;
        String str13 = rqsVar.f30947a;
        String str14 = d0tVar.c;
        long j4 = d0tVar.f5282a;
        boolean z = d0tVar.C;
        long j5 = d0tVar.s;
        long j6 = d0tVar.n;
        long j7 = d0tVar.u;
        boolean z2 = d0tVar.h;
        String str15 = d0tVar.Q;
        int i = rqsVar.e;
        int i2 = rqsVar.f;
        kts ktsVar = rqsVar.h;
        return new m0k0(j, str, j2, strC0, str4, str10, j3, strR0, str9, str8, iMax, strF0, i, i2, ktsVar.f18881a, ktsVar.b, 0, 0, str11, str12, str13, str14, j4, z, j5, j6, z2, j7, 0L, str15, false, d0tVar.B, d0tVar.A != boh.UNKNOWN, 268435456, 0);
    }

    public static final m0k0 Z(acs0 acs0Var) {
        String str;
        long j = acs0Var.b;
        String str2 = acs0Var.j;
        long j2 = acs0Var.k;
        String str3 = acs0Var.l;
        String str4 = acs0Var.m;
        String str5 = acs0Var.v;
        if (str5 == null) {
            str5 = "";
            str = str5;
        } else {
            str = "";
        }
        long j3 = acs0Var.n;
        String str6 = str;
        String str7 = acs0Var.o;
        String str8 = str6;
        String str9 = acs0Var.p;
        String str10 = acs0Var.w;
        if (str10 != null) {
            str8 = str10;
        }
        return new m0k0(j, str2, j2, str3, str4, str5, j3, str7, str9, str8, 1, acs0Var.q, -1, -1, "", "", 0, 0, acs0Var.f, acs0Var.h, acs0Var.r, acs0Var.s, acs0Var.f644a, acs0Var.d, acs0Var.i, acs0Var.e, acs0Var.t, acs0Var.c, 0L, acs0Var.u, false, false, false, 268435456, 1);
    }

    public static final void a(mm40 mm40Var, xm6 xm6Var, fet fetVar, int i) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(2091055089);
        int i2 = i | 6 | (fetVar2.g(xm6Var) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            s4u0 s4u0VarR = iom0.r(jpm0.t(xm6Var.c, 6, fetVar2), fetVar2);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar2, jm40Var);
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
            mm40 mm40VarY = o7k0.y(jm40Var, null, 3);
            zfn zfnVar = zaq0.b;
            mm40 mm40VarQ = i120.Q(mm40VarY, ((ThemeColors) fetVar2.k(zfnVar)).getSecondary60(), vgg0.f37379a);
            zcl zclVar = qmk.f28987a;
            v8q0.a(xm6Var.f41107a, s5x0.K(mm40VarQ, 5.0f, 2.0f), 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, y9q0.a(g1t0.e(), StaticColors.INSTANCE.m123getWhite0d7_KjU(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214), fetVar, 0, 24576, 114684);
            k7x.b(xm6Var.b, null, o7k0.n(s5x0.N(jm40Var, 4.0f, 0.0f, 0.0f, 0.0f, 14), 16.0f), s4u0VarR, s4u0VarR, null, null, null, null, null, null, new m78(((ThemeColors) fetVar.k(zfnVar)).getSecondary(), 5), fetVar, 36912, 0, 28640);
            v8q0.a(xm6Var.d, o7k0.y(s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), null, 3), 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, y9q0.a(g1t0.g(), ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), 0L, null, null, null, 0L, null, null, 0, 1, 0L, null, null, 16711678), fetVar, 0, 24576, 114684);
            v8q0.a(xm6Var.e, dw9.h(1.0f, s5x0.N(jm40Var, 4.0f, 0.0f, 0.0f, 0.0f, 14), true), 0L, null, 0L, null, null, null, 0L, new f2q0(6), 0L, 2, false, 1, 0, null, y9q0.a(g1t0.g(), ((ThemeColors) fetVar.k(zfnVar)).getTextPrimary(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214), fetVar, 0, 28032, 101372);
            fetVar2 = fetVar;
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xd80(mm40Var2, xm6Var, i, (byte) 0);
        }
    }

    public static final void b(int i, fet fetVar, mm40 mm40Var, String str, String str2, String str3) {
        fetVar.g0(807144570);
        int i2 = (fetVar.g(str) ? 4 : 2) | i | (fetVar.g(str2) ? 32 : 16) | (fetVar.g(str3) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(302195002, new cm5(mm40Var, str, str2, str3), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cm5(str, str2, str3, mm40Var, i, (byte) 5);
        }
    }

    public static final void c(int i, fet fetVar, mm40 mm40Var, String str, String str2) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1391630720);
        int i2 = i | (fetVar2.g(str) ? 4 : 2) | (fetVar2.g(str2) ? 32 : 16) | 384;
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarS = o7k0.s(jm40Var, 36.0f);
            x5d x5dVarA = w5d.a(uc9.e, gqw0.m, fetVar2, 6);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarS);
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
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            n05 n05Var = new n05(idm0.t(8), idm0.t(10), idm0.t(1));
            y9q0 y9q0VarE = g1t0.e();
            zfn zfnVar = zaq0.b;
            aad.e(str, mm40VarD, y9q0.a(y9q0VarE, ((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), 0L, null, null, null, 0L, null, null, 3, 0, 0L, null, null, 16744446), null, 2, false, 1, 0, null, n05Var, fetVar2, (i2 & 14) | 1597488, 424);
            v8q0.a(str2, o7k0.d(s5x0.N(jm40Var, 0.0f, 2.0f, 0.0f, 0.0f, 13), 1.0f), 0L, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 1, 0, null, y9q0.a(g1t0.m(), ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214), fetVar, (i2 >> 3) & 14, 24576, 113660);
            fetVar2 = fetVar;
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new man(str, str2, mm40Var2, i, (byte) 12);
        }
    }

    public static final void d(mm40 mm40Var, String str, Function0 function0, fet fetVar, int i) {
        str.getClass();
        function0.getClass();
        fetVar.g0(1276985652);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(str) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarW = o7k0.w(o7k0.d(mm40Var, 1.0f), null, false, 3);
            pz40 pz40Var = s6t0.f31722a;
            hlm.c(mm40VarW, new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(str, s6t0.b().f33626a.getSecondary(), fa50.f9191a), fmm.f9790a, s6t0.b().f33626a.getBackgroundContent(), true, null), null, function0, null, null, null, null, null, null, null, null, fetVar, (i2 << 3) & 7168, 0, 4084);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new f49(mm40Var, str, function0, i, (byte) 7);
        }
    }

    public static final void e(w2d w2dVar, ugd ugdVar, ugd ugdVar2, fet fetVar, int i) {
        int i2;
        fetVar.g0(492886290);
        int i3 = i & 6;
        jm40 jm40Var = jm40.b;
        if (i3 == 0) {
            i2 = (fetVar.g(jm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar.g(w2dVar) : fetVar.i(w2dVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(ugdVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(ugdVar2) ? 2048 : 1024;
        }
        int i4 = i2;
        boolean z = true;
        if (fetVar.U(i4 & 1, (i4 & 1171) != 1170)) {
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = jgk0.b(new ok7(w2dVar, (byte) 7));
                fetVar.o0(objP);
            }
            l7m0 l7m0Var = (l7m0) objP;
            boolean z2 = ((i4 & 896) == 256) | ((i4 & 7168) == 2048);
            if ((i4 & 112) != 32 && ((i4 & 64) == 0 || !fetVar.i(w2dVar))) {
                z = false;
            }
            boolean z3 = z2 | z;
            Object objP2 = fetVar.P();
            if (z3 || objP2 == obj) {
                Object dfc0Var = new dfc0((Object) ugdVar2, (Object) ugdVar, (Object) w2dVar, (Object) l7m0Var, (byte) 5);
                fetVar.o0(dfc0Var);
                objP2 = dfc0Var;
            }
            x4n0.a(jm40Var, (Function2) objP2, fetVar, i4 & 14, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new la70(w2dVar, ugdVar, ugdVar2, i);
        }
    }

    public static final void f(int i, fet fetVar, mm40 mm40Var, Function0 function0) {
        fetVar.g0(-1021258553);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.i(function0) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            pz40 pz40Var = s6t0.f31722a;
            hlm.c(mm40Var, new imm(jlm.f16723a, mlm.f21997a, fmm.f9790a, StaticColors.INSTANCE.m121getTransparent0d7_KjU(), false, null), null, function0, null, null, null, null, null, null, null, null, fetVar, (i2 & 14) | ((i2 << 6) & 7168), 0, 4084);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new lw0(mm40Var, function0, i, (byte) 12);
        }
    }

    public static final void g(int i, fet fetVar, a4x a4xVar, mm40 mm40Var, Function1 function1) {
        a4x a4xVar2;
        a4xVar.getClass();
        function1.getClass();
        fetVar.g0(737666647);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(a4xVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.b(0);
                fetVar.o0(objP);
            }
            cgk0 cgk0Var = (cgk0) objP;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13);
            boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objP2 = fetVar.P();
            if (z || objP2 == cl5Var) {
                a4xVar2 = a4xVar;
                objP2 = new u0z(b, a4xVar2, cgk0Var, function1);
                fetVar.o0(objP2);
            } else {
                a4xVar2 = a4xVar;
            }
            b8k0.e(mm40VarN, null, null, null, null, null, false, null, (Function1) objP2, fetVar, 0, 510);
        } else {
            a4xVar2 = a4xVar;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new de9(mm40Var, a4xVar2, function1, i, (byte) 3);
        }
    }

    public static final void h(mm40 mm40Var, vf10 vf10Var, Function0 function0, fet fetVar, int i) {
        mm40Var.getClass();
        function0.getClass();
        fetVar.g0(101153941);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(vf10Var) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128);
        if (!fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            fetVar.X();
        } else if (vf10Var instanceof tf10) {
            fetVar.e0(-1575302796);
            i(mm40Var, (tf10) vf10Var, function0, fetVar, i2 & 1022);
            fetVar.r(false);
        } else {
            if (!(vf10Var instanceof uf10)) {
                throw b1j.f(-1575305458, fetVar, false);
            }
            fetVar.e0(-1575295451);
            j(i2 & 14, fetVar, mm40Var);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mtz(mm40Var, vf10Var, function0, i, (byte) 7);
        }
    }

    public static final void i(mm40 mm40Var, tf10 tf10Var, Function0 function0, fet fetVar, int i) {
        tf10 tf10Var2 = tf10Var;
        fet fetVar2 = fetVar;
        fetVar2.g0(-366918735);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(tf10Var2) ? 32 : 16) | (fetVar2.i(function0) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarW = y860.W(h97.e(zclVar, zclVar, zclVar, zclVar, mm40Var), null, null, false, null, function0, 28);
            zfn zfnVar = zaq0.b;
            mm40 mm40VarJ = s5x0.J(i120.Q(mm40VarW, ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent(), jd8.n), 16.0f);
            mw3 mw3Var = uc9.c;
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar2, 0);
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
            jpm0.o(fetVar2, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = s5x0.N(o7k0.d(jm40Var, 1.0f), 0.0f, 0.0f, 0.0f, 12.0f, 7);
            lw3 lw3Var = uc9.f35418a;
            yx7 yx7Var = gqw0.j;
            thg0 thg0VarA = shg0.a(lw3Var, yx7Var, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarN);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            yx7 yx7Var2 = gqw0.k;
            zhg0 zhg0Var = zhg0.f44392a;
            D(zhg0Var.b(yx7Var2, jm40Var), tf10Var2.c, fetVar2, 0);
            mm40 mm40VarA = zhg0Var.a(1.0f, zhg0Var.b(yx7Var2, s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14)), true);
            x5d x5dVarA2 = w5d.a(uc9.g, xx7Var, fetVar2, 6);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarA);
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
            zfn zfnVar2 = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar2)).getClass();
            v8q0.a(tf10Var2.f33846a, jm40Var, ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.j(), fetVar, 48, 24960, 110584);
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            ((g1t0) fetVar.k(zfnVar2)).getClass();
            v8q0.a(tf10Var2.b, mm40VarD, ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.g(), fetVar, 48, 24960, 110584);
            fetVar.r(true);
            j6n.h(tf10Var2.d, dqo0.f6527a, zhg0Var.b(yx7Var, s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14)), 0, 0, fetVar, 48, 24);
            fetVar.r(true);
            mm40 mm40VarN2 = s5x0.N(o7k0.w(o7k0.d(jm40Var, 1.0f), null, false, 3), 0.0f, 0.0f, 0.0f, 8.0f, 7);
            thg0 thg0VarA2 = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.l, fetVar, 48);
            int iHashCode4 = Long.hashCode(fetVar.T);
            bh90 bh90VarM4 = fetVar.m();
            mm40 mm40VarC3 = kbc.c0(fetVar, mm40VarN2);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA2, shdVar);
            jpm0.o(fetVar, bh90VarM4, shdVar2);
            vqd.u(iHashCode4, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC3, shdVar4);
            mm40 mm40VarA2 = zhg0Var.a(1.0f, o7k0.d(jm40Var, 1.0f), true);
            String str = tf10Var2.e;
            pz40 pz40Var = s6t0.f31722a;
            v8q0.a(str, mm40VarA2, s6t0.b().f33626a.getTextPrimary(), new n05(qmk.q, qmk.t, qmk.n), 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 1, 0, null, g1t0.r(), fetVar, 0, 24960, 109552);
            tf10Var2 = tf10Var;
            v8q0.a(tf10Var2.f, zhg0Var.a(1.0f, o7k0.d(jm40Var, 1.0f), true), s6t0.b().f33626a.getSecondary(), null, 0L, null, null, null, 0L, new f2q0(6), 0L, 2, false, 1, 0, null, g1t0.g(), fetVar, 0, 24960, 109560);
            fetVar2 = fetVar;
            fetVar2.r(true);
            mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
            tnm tnmVar = tnm.f34243a;
            StaticColors staticColors = StaticColors.INSTANCE;
            snm.b(mm40VarD2, new unm(tnmVar, staticColors.m132getYellow0d7_KjU(), staticColors.m132getYellow0d7_KjU(), s6t0.b().f33626a.getBackground(), 6.0f, 360.0f, tf10Var2.g, tf10Var2.h, true, 512), fetVar2, 6);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mtz(mm40Var, tf10Var2, function0, i, (byte) 8);
        }
    }

    public static final void j(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(29354578);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40Var, 118.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wqr(mm40Var, i, (byte) 21);
        }
    }

    public static final void k(mm40 mm40Var, uv20 uv20Var, xdr xdrVar, xdr xdrVar2, Function1 function1, fet fetVar, int i) {
        int i2;
        xdrVar.getClass();
        xdrVar2.getClass();
        function1.getClass();
        fetVar.g0(1764655350);
        byte b = 2;
        byte b2 = 4;
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar.g(uv20Var) : fetVar.i(uv20Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(xdrVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(xdrVar2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(function1) ? 16384 : 8192;
        }
        boolean z = false;
        byte b3 = 1;
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            boolean z2 = (i2 & 896) == 256;
            int i3 = i2 & 112;
            if (i3 == 32 || ((i2 & 64) != 0 && fetVar.i(uv20Var))) {
                z = true;
            }
            boolean z3 = z2 | z;
            Object objP = fetVar.P();
            if (z3 || objP == ukd.f35823a) {
                objP = new eu20(b, xdrVar, uv20Var);
                fetVar.o0(objP);
            }
            x0x.i(mm40Var, uv20Var, (Function0) objP, u1c.M(335579916, new fu20(uv20Var, b3), fetVar), u1c.M(75781164, new gu20(uv20Var, (byte) 3), fetVar), u1c.M(287148225, new hu20(uv20Var, function1, b3), fetVar), u1c.M(-196273430, new iu20(b3, xdrVar2, uv20Var), fetVar), u1c.M(-332300727, new gu20(uv20Var, b2), fetVar), u1c.M(-468328024, new gu20(uv20Var, (byte) 5), fetVar), fetVar, (i2 & 14) | 115043392 | i3);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ju20(mm40Var, uv20Var, xdrVar, xdrVar2, function1, i, (byte) 1);
        }
    }

    public static final void l(mm40 mm40Var, xf30 xf30Var, Function1 function1, Function1 function2, fet fetVar, int i) {
        pz40 pz40Var;
        fet fetVar2 = fetVar;
        imo imoVar = xf30Var.b;
        a4x a4xVar = xf30Var.f40773a;
        function1.getClass();
        function2.getClass();
        fetVar2.g0(1568260137);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(xf30Var) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128) | (fetVar2.i(function2) ? 2048 : 1024);
        byte b = 0;
        if (fetVar2.U(i2 & 1, (i2 & 1171) != 1170)) {
            xcz xczVarA = ddz.a(q3d.i(a4xVar), 0, fetVar2, 0, 2);
            pz40 pz40VarD = vcc.D(xczVarA.g, fetVar2);
            pz40 pz40VarA0 = v3c.a0(Integer.valueOf(a4xVar.size()), new Object[0], fetVar2, 0);
            pz40 pz40VarA1 = v3c.a0(Boolean.FALSE, new Object[0], fetVar2, 6);
            boolean z = imoVar.c;
            boolean zG = fetVar2.g(xczVarA) | fetVar2.g(pz40VarA1) | fetVar2.g(pz40VarD);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            yje yjeVar = null;
            if (zG || objP == cl5Var) {
                objP = new rua(xczVarA, pz40VarA1, pz40VarD, yjeVar, (byte) 2);
                pz40Var = pz40VarA1;
                fetVar2.o0(objP);
            } else {
                pz40Var = pz40VarA1;
            }
            m0x0.t(fetVar2, xczVarA, (Function2) objP);
            boolean zG2 = fetVar2.g(xczVarA) | fetVar2.g(pz40VarA0) | fetVar2.g(pz40Var);
            Object objP2 = fetVar2.P();
            if (zG2 || objP2 == cl5Var) {
                rf30 rf30Var = new rf30(xczVarA, pz40VarA0, pz40Var, yjeVar, (byte) 1);
                fetVar2.o0(rf30Var);
                objP2 = rf30Var;
            }
            m0x0.t(fetVar2, xczVarA, (Function2) objP2);
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zH = fetVar2.h(z) | fetVar2.g(xczVarA);
            Object objP3 = fetVar2.P();
            if (zH || objP3 == cl5Var) {
                objP3 = new uf30(z, xczVarA, yjeVar, b);
                fetVar2.o0(objP3);
            }
            m0x0.t(fetVar2, boolValueOf, (Function2) objP3);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40Var);
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
            a4x a4xVar2 = xf30Var.f40773a;
            mm40 mm40VarH = dw9.h(1.0f, o7k0.d(jm40.b, 1.0f), true);
            zcl zclVar = qmk.f28987a;
            tdc.m(s5x0.N(mm40VarH, 0.0f, 0.0f, 0.0f, 4.0f, 7), a4xVar2, s3n.f31566a, ((Boolean) fetVar2.k(kr00.f18743a)).booleanValue(), xczVarA, function1, fetVar, ((i2 << 9) & 458752) | 384, 0);
            fetVar2 = fetVar;
            jcb.s(null, imoVar, function2, fetVar2, (i2 >> 3) & 896, 1);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cbr((Object) mm40Var, (Object) xf30Var, function1, (wdr) function2, i, (byte) 24);
        }
    }

    public static final void m(xcz xczVar, x77 x77Var, Function1 function1, fet fetVar, int i) {
        int i2;
        xczVar.getClass();
        x77Var.getClass();
        function1.getClass();
        fetVar.g0(1965098861);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(xczVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(x77Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            pz40 pz40VarF = androidx.compose.runtime.e.f(function1, fetVar);
            pz40 pz40VarF2 = androidx.compose.runtime.e.f(x77Var, fetVar);
            boolean zG = fetVar.g(pz40VarF2) | ((i2 & 14) == 4) | fetVar.g(pz40VarF);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                Object rf30Var = new rf30(xczVar, pz40VarF2, pz40VarF, null, (byte) 4);
                fetVar.o0(rf30Var);
                objP = rf30Var;
            }
            m0x0.t(fetVar, xczVar, (Function2) objP);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kq40(xczVar, x77Var, function1, i, (byte) 0);
        }
    }

    public static final void n(xcz xczVar, ll7 ll7Var, Function1 function1, fet fetVar, int i) {
        xczVar.getClass();
        ll7Var.getClass();
        function1.getClass();
        fetVar.g0(-69489053);
        int i2 = (fetVar.g(xczVar) ? 4 : 2) | i | (fetVar.g(ll7Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            pz40 pz40VarF = androidx.compose.runtime.e.f(function1, fetVar);
            pz40 pz40VarF2 = androidx.compose.runtime.e.f(ll7Var, fetVar);
            boolean zG = fetVar.g(pz40VarF2) | ((i2 & 14) == 4) | fetVar.g(pz40VarF);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                Object rf30Var = new rf30(xczVar, pz40VarF2, pz40VarF, null, (byte) 5);
                fetVar.o0(rf30Var);
                objP = rf30Var;
            }
            m0x0.t(fetVar, xczVar, (Function2) objP);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mtz(xczVar, ll7Var, function1, i, (byte) 23);
        }
    }

    public static final void o(mm40 mm40Var, String str, hds hdsVar, fet fetVar, int i) {
        mm40 mm40Var2;
        float f;
        jm40 jm40Var;
        boolean z;
        fet fetVar2 = fetVar;
        String str2 = hdsVar.f12884a;
        fetVar2.g0(-1724711209);
        int i2 = i | 6 | (fetVar2.g(str) ? 32 : 16) | (fetVar2.i(hdsVar) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            boolean zD = pkd.d(fetVar2);
            if (zD) {
                zcl zclVar = qmk.f28987a;
                f = 416.0f;
            } else {
                zcl zclVar2 = qmk.f28987a;
                f = 216.0f;
            }
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarE = o7k0.e(o7k0.d(jm40Var2, 1.0f), f);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE);
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
            boolean zG = fetVar2.g(hdsVar);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                Pair pair = new Pair(new n0x(str2), new n0x(azw.R(str2)));
                fetVar2.o0(pair);
                objP = pair;
            }
            Pair pair2 = (Pair) objP;
            n0x n0xVar = (n0x) pair2.f46059a;
            n0x n0xVar2 = (n0x) pair2.b;
            Object objP2 = fetVar2.P();
            if (objP2 == cl5Var) {
                objP2 = new m0x(R.drawable.promo_shop_default_large, null, 6);
                fetVar2.o0(objP2);
            }
            y9a.f(n0xVar, n0xVar2, (m0x) objP2, null, jar0.e, fetVar2, 24960, 8);
            mm40 mm40VarE2 = o7k0.e(o7k0.d(jm40Var2, 1.0f), 128.0f);
            zx7 zx7Var = gqw0.h;
            jr8 jr8Var = jr8.f16991a;
            mm40 mm40VarB = jr8Var.b(mm40VarE2, zx7Var);
            pz40 pz40Var = s6t0.f31722a;
            StaticColors staticColors = StaticColors.INSTANCE;
            zq8.a(0, fetVar2, i120.P(mm40VarB, yk5.n(q3d.j(new y3d(staticColors.m63getBlack00d7_KjU()), new y3d(staticColors.m75getBlack600d7_KjU())), 0.0f, 0.0f, 14), null, 6));
            if (str.length() > 0) {
                fetVar2.e0(-575911145);
                jm40Var = jm40Var2;
                z = true;
                v8q0.a(str, jr8Var.b(s5x0.N(jm40Var2, 16.0f, 0.0f, 16.0f, zD ? 48.0f : 32.0f, 2), gqw0.g), staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.y, null, j1t0.f15753a, 0L, null, 0, 0, qmk.K, 16646109), fetVar2, (i2 >> 3) & 14, 0, 131064);
                fetVar2 = fetVar2;
                fetVar2.r(false);
            } else {
                fetVar2 = fetVar2;
                jm40Var = jm40Var2;
                z = true;
                fetVar2.e0(-575486383);
                fetVar2.r(false);
            }
            fetVar2.r(z);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o090(mm40Var2, str, hdsVar, i, (byte) 29);
        }
    }

    public static final void p(mm40 mm40Var, clo cloVar, ugd ugdVar, ugd ugdVar2, fet fetVar, int i) {
        mm40 mm40Var2;
        fetVar.g0(-671287756);
        int i2 = i | 6 | (fetVar.g(cloVar) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new ms60(ugdVar, ugdVar2, cloVar, (byte) 2);
                fetVar.o0(objP);
            }
            jm40 jm40Var = jm40.b;
            x4n0.a(jm40Var, (Function2) objP, fetVar, 6, 0);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nv60(mm40Var2, cloVar, ugdVar, ugdVar2, i, (byte) 1);
        }
    }

    public static final void q(ae80 ae80Var, Function2 function2, Function2 function3, mm40 mm40Var, fet fetVar, int i) {
        int i2;
        Function2 function4;
        float f;
        fet fetVar2 = fetVar;
        ae80Var.getClass();
        String str = ae80Var.d;
        function2.getClass();
        function3.getClass();
        fetVar2.g0(-1330632567);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(ae80Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            function4 = function2;
            i2 |= fetVar2.i(function4) ? 32 : 16;
        } else {
            function4 = function2;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.i(function3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar2.g(mm40Var) ? 2048 : 1024;
        }
        if (fetVar2.U(i2 & 1, (i2 & 1171) != 1170)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            long backgroundContent = ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent();
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarJ = s5x0.J(i120.Q(mm40VarD, backgroundContent, new ugg0(zclVar, zclVar, zclVar, zclVar)), 12.0f);
            mw3 mw3Var = uc9.c;
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarJ);
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
            a(null, ae80Var.b, fetVar2, 0);
            jm40 jm40Var = jm40.b;
            F(o7k0.d(s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), 1.0f), ae80Var.c, fetVar2, 0);
            if (str.length() > 0) {
                fetVar2.e0(-126375057);
                f = 1.0f;
                j6n.h(str, qro0.f29220a, s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13).e(new wkw(xx7Var)), 0, 0, fetVar2, 48, 24);
                fetVar2.r(false);
            } else {
                f = 1.0f;
                fetVar2.e0(-126099901);
                fetVar2.r(false);
            }
            r(ae80Var.e, function4, function3, o7k0.d(s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), f), fetVar2, i2 & 1008);
            fetVar2 = fetVar2;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vho((Object) ae80Var, function2, function3, mm40Var, i, (byte) 26);
        }
    }

    public static final void r(ee80 ee80Var, Function2 function2, Function2 function3, mm40 mm40Var, fet fetVar, int i) {
        int i2;
        fetVar.g0(1876049034);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(ee80Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(function2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(mm40Var) ? 2048 : 1024;
        }
        if (!fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            fetVar.X();
        } else if (ee80Var instanceof ce80) {
            fetVar.e0(-1032327219);
            vbw0.C(((i2 >> 3) & 896) | (i2 & 112), fetVar, ((ce80) ee80Var).f4199a, mm40Var, function2);
            fetVar.r(false);
        } else {
            if (!(ee80Var instanceof de80)) {
                throw b1j.f(-1003134911, fetVar, false);
            }
            fetVar.e0(-1003122145);
            ihm0.d((de80) ee80Var, function3, o7k0.d(mm40Var, 1.0f), fetVar, ((i2 >> 3) & 112) | (i2 & 14));
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vho((Object) ee80Var, function2, function3, mm40Var, i, (byte) 27);
        }
    }

    public static final void s(int i, fet fetVar, mm40 mm40Var, String str, String str2) {
        fet fetVar2 = fetVar;
        str2.getClass();
        fetVar2.g0(1405951297);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(str2) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarS = o7k0.s(mm40Var, 80.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarS);
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
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            pz40 pz40Var = s6t0.f31722a;
            v8q0.a(str, mm40VarD, s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 1, 0, null, g1t0.d(), fetVar2, ((i2 >> 3) & 14) | 48, 24576, 113656);
            v8q0.a(str2, o7k0.d(jm40Var, 1.0f), s6t0.b().f33626a.getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.h(), fetVar, ((i2 >> 6) & 14) | 48, 24960, 109560);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new man(mm40Var, str, str2, i, (byte) 13);
        }
    }

    public static final void t(int i, fet fetVar, mm40 mm40Var) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-1230081626);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2);
        if (fetVar2.U(i2 & 1, (i2 & 3) != 2)) {
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
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
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarS = o7k0.s(jm40Var, 30.0f);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarS);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            mm40 mm40VarN = o7k0.n(jm40Var, 16.0f);
            pm80 pm80VarF = a8k0.F(R.drawable.ic_glyph_placeholder_player, 0, fetVar2);
            pz40 pz40Var = s6t0.f31722a;
            dww.c(pm80VarF, null, mm40VarN, s6t0.b().f33626a.getSecondary(), fetVar2, 56, 0);
            fetVar2.r(true);
            mm40 mm40VarN2 = s5x0.N(new x7z(1.0f, true), 8.0f, 0.0f, 0.0f, 0.0f, 14);
            String strW = rsm0.w(R.string.player, 0, fetVar2);
            qrq qrqVar = j1t0.c;
            long j = qmk.r;
            v8q0.a(strW, mm40VarN2, s6t0.b().f33626a.getSecondary(), new n05(qmk.q, j, qmk.n), 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, new y9q0(0L, j, null, qrqVar, 0L, null, 0, 0, qmk.F, 16646109), fetVar, 0, 24960, 110576);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ev90(mm40Var, i, (byte) 3);
        }
    }

    public static final void u(Function1 function1, Function1 function2, ehm0 ehm0Var, boolean z, mm40 mm40Var, fet fetVar, int i) {
        function1.getClass();
        function2.getClass();
        fetVar.g0(1506510072);
        int i2 = i | (fetVar.i(function1) ? 4 : 2) | (fetVar.i(function2) ? 32 : 16) | (fetVar.g(ehm0Var) ? 256 : 128) | (fetVar.h(z) ? 2048 : 1024) | (fetVar.g(mm40Var) ? 16384 : 8192);
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            boolean z2 = ehm0Var.f7815a;
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new wta0(function1, (byte) 20);
                fetVar.o0(objP);
            }
            tfx.p(R.string.statistic_after_stat, R.drawable.ic_glyph_statistics, z2, (Function0) objP, mm40Var, u1c.M(2071973862, new odv((Object) ehm0Var, (Object) xczVarA, z, (Object) function2, (byte) 5), fetVar), fetVar, (i2 & 57344) | 199680);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ip0(function1, function2, ehm0Var, z, mm40Var, i);
        }
    }

    public static final void v(mm40 mm40Var, shc0 shc0Var, boolean z, w2d w2dVar, Function1 function1, fet fetVar, int i) {
        shc0Var.getClass();
        function1.getClass();
        fetVar.g0(38531547);
        byte b = 16;
        int i2 = i | 6 | (fetVar.g(shc0Var) ? 32 : 16) | (fetVar.h(z) ? 256 : 128) | (fetVar.i(w2dVar) ? 2048 : 1024) | (fetVar.i(function1) ? 16384 : 8192);
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = jgk0.b(new ok7(w2dVar, (byte) 6));
                fetVar.o0(objP);
            }
            e(w2dVar, u1c.M(-1971865249, new xh20(z, shc0Var, b), fetVar), u1c.M(-1721763970, new lfc0(z, shc0Var, function1, (l7m0) objP), fetVar), fetVar, ((i2 >> 6) & 112) | 3526);
            mm40Var = jm40.b;
        } else {
            fetVar.X();
        }
        mm40 mm40Var2 = mm40Var;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new brc0(mm40Var2, shc0Var, z, w2dVar, function1, i);
        }
    }

    public static final void w(mm40 mm40Var, final ng8 ng8Var, final Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        ng8Var.getClass();
        function1.getClass();
        fetVar.g0(-1000763870);
        int i2 = i | 6 | (fetVar.g(ng8Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        final byte b = 0;
        final byte b2 = 1;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarD);
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
            rqm rqmVar = ng8Var.d;
            int i3 = i2 & 896;
            int i4 = i2 & 112;
            boolean z = (i3 == 256) | (i4 == 32);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new Function0() { // from class: a.hue0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (b) {
                            case 0:
                                function1.invoke(ng8Var);
                                break;
                            default:
                                function1.invoke(ng8Var);
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z2 = (i4 == 32) | (i3 == 256);
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new Function0() { // from class: a.hue0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (b2) {
                            case 0:
                                function1.invoke(ng8Var);
                                break;
                            default:
                                function1.invoke(ng8Var);
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                fetVar.o0(objP2);
            }
            mm40Var2 = jm40Var;
            obc.q(null, rqmVar, false, null, function0, null, (Function0) objP2, null, fetVar, 384, 169);
            if (ng8Var.c) {
                fetVar.e0(-325987043);
                zcl zclVar = qmk.f28987a;
                mbc.o(zfi0.f44303a, s5x0.L(mm40Var2, 16.0f, 0.0f, 2), false, fetVar, 6, 4);
                fetVar.r(false);
            } else {
                fetVar.e0(-325809258);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rwc0(mm40Var2, ng8Var, function1, i, (byte) 14);
        }
    }

    public static final void x(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(1699303618);
        int i2 = i | 6;
        byte b = 2;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            zq8.a(0, fetVar, xbc.c0(lgb.J(o7k0.s(o7k0.e(jm40Var, 72.0f), 256.0f), vgg0.a(16.0f)), vbc.d0(null, fetVar, 0, 1)));
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eqj0(mm40Var, i, b);
        }
    }

    public static final void y(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(-866241643);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            qw3 qw3Var = new qw3(4.0f, true, new jf4((byte) 14));
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new thj0((byte) 6);
                fetVar.o0(objP);
            }
            b8k0.f(mm40Var, null, null, false, qw3Var, null, null, false, null, (Function1) objP, fetVar, (i2 & 14) | 817889280, 366);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eqj0(mm40Var, i, b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r11v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v9 */
    public static final void z(mm40 mm40Var, fr5 fr5Var, cp5 cp5Var, int i, Integer num, Function2 function2, fet fetVar, int i2) {
        mm40 mm40Var2;
        fet fetVar2;
        zx7 zx7Var;
        ?? r11;
        ?? r10;
        pz40 pz40Var;
        cgk0 cgk0Var;
        long jC;
        fr5 fr5Var2 = fr5Var;
        fet fetVar3 = fetVar;
        zx7 zx7Var2 = gqw0.h;
        fr5Var2.getClass();
        cp5Var.getClass();
        function2.getClass();
        fetVar3.g0(-866347079);
        int i3 = i2 | 6 | (fetVar3.g(fr5Var2) ? 32 : 16) | (fetVar3.e(cp5Var.ordinal()) ? 256 : 128) | (fetVar3.e(i) ? 2048 : 1024) | (fetVar3.g(num) ? 16384 : 8192) | (fetVar3.i(function2) ? 131072 : 65536);
        if (fetVar3.U(i3 & 1, (74899 & i3) != 74898)) {
            Object objP = fetVar3.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = androidx.compose.runtime.e.e(null);
                fetVar3.o0(objP);
            }
            pz40 pz40Var2 = (pz40) objP;
            Object objP2 = fetVar3.P();
            if (objP2 == obj) {
                objP2 = androidx.compose.runtime.e.b(0);
                fetVar3.o0(objP2);
            }
            cgk0 cgk0Var2 = (cgk0) objP2;
            Object objP3 = fetVar3.P();
            if (objP3 == obj) {
                objP3 = androidx.compose.runtime.e.e(Boolean.FALSE);
                fetVar3.o0(objP3);
            }
            pz40 pz40Var3 = (pz40) objP3;
            Object objP4 = fetVar3.P();
            if (objP4 == obj) {
                objP4 = m0x0.I(kotlin.coroutines.g.f46065a, fetVar3);
                fetVar3.o0(objP4);
            }
            vne vneVar = (vne) objP4;
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarP = o7k0.p(jm40Var, 96.0f, 128.0f);
            boolean z = ((i3 & 112) == 32) | ((i3 & 458752) == 131072);
            Object objP5 = fetVar3.P();
            if (z || objP5 == obj) {
                objP5 = new pia(function2, fr5Var2, pz40Var2, (byte) 8);
                fetVar3.o0(objP5);
            }
            mm40 mm40VarE0 = o2e.e0(y860.W(mm40VarP, null, null, false, null, (Function0) objP5, 28), "BANNER_ITEM_S");
            zx7 zx7Var3 = gqw0.f11754a;
            tj30 tj30VarC = zq8.c(zx7Var3, false);
            int iHashCode = Long.hashCode(fetVar3.T);
            bh90 bh90VarM = fetVar3.m();
            mm40 mm40VarC0 = kbc.c0(fetVar3, mm40VarE0);
            mkd.c0.getClass();
            fetVar3.i0();
            boolean z2 = fetVar3.S;
            pcy pcyVar = e7z.u1;
            if (z2) {
                fetVar3.l(pcyVar);
            } else {
                fetVar3.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar3, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar3, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar3, numValueOf, shdVar3);
            jpm0.n(fetVar3);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar3, mm40VarC0, shdVar4);
            zx7 zx7Var4 = gqw0.b;
            jr8 jr8Var = jr8.f16991a;
            mm40 mm40VarB = jr8Var.b(jm40Var, zx7Var4);
            tj30 tj30VarC2 = zq8.c(zx7Var3, false);
            int iHashCode2 = Long.hashCode(fetVar3.T);
            bh90 bh90VarM2 = fetVar3.m();
            mm40 mm40VarC1 = kbc.c0(fetVar3, mm40VarB);
            fetVar3.i0();
            if (fetVar3.S) {
                fetVar3.l(pcyVar);
            } else {
                fetVar3.r0();
            }
            jpm0.o(fetVar3, tj30VarC2, shdVar);
            jpm0.o(fetVar3, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar3, shdVar3, fetVar3);
            jpm0.o(fetVar3, mm40VarC1, shdVar4);
            mm40 mm40VarE1 = o2e.e0(lgb.J(o7k0.n(jm40Var, 96.0f), vgg0.a(24.0f)), "SQUARE_S_BANNER_IMAGE");
            o0x o0xVar = fr5Var2.b;
            er5 er5Var = fr5Var2.f;
            o0x o0xVar2 = fr5Var2.g;
            o0x o0xVar3 = fr5Var2.c;
            Object objP6 = fetVar3.P();
            if (objP6 == obj) {
                objP6 = new ryc0(pz40Var2, (byte) 21);
                fetVar3.o0(objP6);
            }
            int i4 = ((i3 << 9) & 458752) | (i3 & 7168) | 12582912 | (57344 & i3);
            mm40Var2 = jm40Var;
            etl.a(mm40VarE1, o0xVar, o0xVar3, i, num, cp5Var, 0.0f, (Function1) objP6, fetVar3, i4, 64);
            byte b = 3;
            if (o0xVar2 != null) {
                fetVar3.e0(-1212708465);
                zx7Var = zx7Var2;
                mm40 mm40VarJ = lgb.J(jr8Var.b(mm40Var2, zx7Var), vgg0.c(0.0f, 0.0f, 24.0f, 24.0f, 3));
                r11 = 0;
                etl.d(mm40VarJ, o0xVar2, fetVar3, 0);
                fetVar3.r(false);
            } else {
                zx7Var = zx7Var2;
                r11 = 0;
                fetVar3.e0(-1212264483);
                fetVar3.r(false);
            }
            if (er5Var != null) {
                fetVar3.e0(-1212206699);
                r10 = 1;
                etl.c(o7k0.u(mm40Var2, 0.0f, 98.0f, 1), er5Var, fetVar3, r11, r11);
                fetVar3.r(r11);
            } else {
                r10 = 1;
                fetVar3.e0(-1212062115);
                fetVar3.r(r11);
            }
            fetVar3.r(r10);
            mm40 mm40VarB2 = jr8Var.b(o7k0.g(mm40Var2, 28.0f, 0.0f, 2), zx7Var);
            tj30 tj30VarC3 = zq8.c(zx7Var3, r11);
            int iHashCode3 = Long.hashCode(fetVar3.T);
            bh90 bh90VarM3 = fetVar3.m();
            mm40 mm40VarC2 = kbc.c0(fetVar3, mm40VarB2);
            fetVar3.i0();
            if (fetVar3.S) {
                fetVar3.l(pcyVar);
            } else {
                fetVar3.r0();
            }
            jpm0.o(fetVar3, tj30VarC3, shdVar);
            jpm0.o(fetVar3, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar3, shdVar3, fetVar3);
            jpm0.o(fetVar3, mm40VarC2, shdVar4);
            mm40 mm40VarB3 = jr8Var.b(o7k0.d(o7k0.u(mm40Var2, 0.0f, 96.0f, r10), 1.0f), gqw0.e);
            Object objP7 = fetVar3.P();
            if (objP7 == obj) {
                pz40Var = pz40Var3;
                cgk0Var = cgk0Var2;
                objP7 = new jt0(pz40Var, cgk0Var, b);
                fetVar3.o0(objP7);
            } else {
                pz40Var = pz40Var3;
                cgk0Var = cgk0Var2;
            }
            mm40 mm40VarE2 = o2e.e0(pai0.a(mm40VarB3, r11, (Function1) objP7), "SQUARE_S_BANNER_TEXT");
            fr5Var2 = fr5Var;
            String str = fr5Var2.d;
            int iOrdinal = cp5Var.ordinal();
            if (iOrdinal == 0) {
                jC = rz4.c(fetVar3, 2135212007, fetVar3, r11);
            } else {
                if (iOrdinal != r10) {
                    throw b1j.f(2135209320, fetVar3, r11);
                }
                fetVar3.e0(2135214913);
                jC = afn0.p(fetVar3).m123getWhite0d7_KjU();
                fetVar3.r(r11);
            }
            afn0.v(fetVar3).getClass();
            y9q0 y9q0VarD = g1t0.d();
            f2q0 f2q0Var = new f2q0(3);
            boolean zI = fetVar3.i(vneVar);
            Object objP8 = fetVar3.P();
            if (zI || objP8 == obj) {
                objP8 = new kt0(vneVar, pz40Var, cgk0Var, b);
                fetVar3.o0(objP8);
            }
            boolean z3 = r10;
            v8q0.a(str, mm40VarE2, jC, null, 0L, null, null, null, 0L, f2q0Var, 0L, 2, false, 2, 0, (Function1) objP8, y9q0VarD, fetVar, 0, 24960, 44024);
            fet fetVar4 = fetVar;
            fetVar4.r(z3);
            fetVar4.r(z3);
            fetVar2 = fetVar4;
        } else {
            fetVar3.X();
            mm40Var2 = mm40Var;
            fetVar2 = fetVar3;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wjp(mm40Var2, fr5Var2, cp5Var, i, num, function2, i2, (byte) 24);
        }
    }

    public abstract String H();
}
