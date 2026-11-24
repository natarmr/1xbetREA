package a;

import android.app.Activity;
import android.content.Context;
import android.gov.nist.core.Separators;
import android.javax.sip.message.Response;
import android.view.Window;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class vbw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ugd f37160a = new ugd(-1131826196, false, new qbd((byte) 11));
    public static final ugd b = new ugd(-2069274834, false, new bhd(8));
    public static final ugd c = new ugd(867812696, false, new fhd(13));
    public static final ugd d = new ugd(1486940604, false, new mhd(10));
    public static final ugd e = new ugd(792882948, false, new qhd(21));
    public static final char[] f = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', ' ', '$', '%', '*', '+', '-', '.', '/', ':'};
    public static final Object g = new Object();
    public static volatile c44 h;
    public static volatile c44 i;
    public static volatile ony j;

    public static final void A(String str, fet fetVar, int i2) {
        fet fetVar2 = fetVar;
        fetVar2.g0(1248245393);
        int i3 = i2 | (fetVar2.g(str) ? 4 : 2);
        if (fetVar2.U(i3 & 1, (i3 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(o7k0.s(jm40.b, 108.0f), 44.0f);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
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
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str, null, ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.d(), fetVar, i3 & 14, 24960, 110586);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new f5n0((byte) 10, i2, str);
        }
    }

    public static final void B(boolean z, Function1 function1, fet fetVar, int i2) {
        function1.getClass();
        fetVar.g0(454622382);
        int i3 = (fetVar.h(z) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        byte b2 = 0;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarD = o7k0.d(s5x0.K(jm40.b, 16.0f, 8.0f), 1.0f);
            wul wulVar = new wul(lul.e, oe9.f25112a, new ue9(rsm0.w(R.string.rating, 0, fetVar)), !z, false, true);
            boolean z2 = (i3 & 112) == 32;
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new n19(function1, (byte) 12);
                fetVar.o0(objP);
            }
            qzb.n(mm40VarD, wulVar, (Function0) objP, fetVar, 0, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rt9(z, function1, i2, b2);
        }
    }

    public static final void C(int i2, fet fetVar, a4x a4xVar, mm40 mm40Var, Function2 function2) {
        int i3;
        a4xVar.getClass();
        function2.getClass();
        fetVar.g0(1672084385);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? fetVar.g(a4xVar) : fetVar.i(a4xVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.i(function2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(mm40Var) ? 256 : 128;
        }
        int i4 = i3;
        if (fetVar.U(i4 & 1, (i4 & 147) != 146)) {
            mm40 mm40VarD = o7k0.d(q8a.k0(mm40Var, enx.b), 1.0f);
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.j, fetVar, 0);
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
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            Iterator itO = h97.o(fetVar, mm40VarC0, gqw0.v, -1328082890, a4xVar);
            while (itO.hasNext()) {
                qd80 qd80Var = (qd80) itO.next();
                String str = qd80Var.b;
                boolean z = qd80Var.d;
                boolean zI = ((i4 & 112) == 32) | fetVar.i(qd80Var);
                Object objP = fetVar.P();
                if (zI || objP == ukd.f35823a) {
                    objP = new a540((Object) function2, (Object) qd80Var, (byte) 29);
                    fetVar.o0(objP);
                }
                x0x.l(str, z, (Function0) objP, false, new x7z(1.0f, true).e(o7k0.c), fetVar, 3072);
            }
            fetVar.r(false);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new y53(a4xVar, function2, mm40Var, i2);
        }
    }

    public static final void D(mm40 mm40Var, yrc0 yrc0Var, Function0 function0, fet fetVar, int i2) {
        pcy pcyVar;
        shd shdVar;
        shd shdVar2;
        jr8 jr8Var;
        int i3;
        fet fetVar2;
        fet fetVar3 = fetVar;
        fetVar3.g0(-1178613482);
        int i4 = i2 | (fetVar3.g(mm40Var) ? 4 : 2) | (fetVar3.g(yrc0Var) ? 32 : 16) | (fetVar3.i(function0) ? 256 : 128);
        if (fetVar3.U(i4 & 1, (i4 & 147) != 146)) {
            zx7 zx7Var = gqw0.f11754a;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode = Long.hashCode(fetVar3.T);
            bh90 bh90VarM = fetVar3.m();
            mm40 mm40VarC0 = kbc.c0(fetVar3, mm40Var);
            mkd.c0.getClass();
            fetVar3.i0();
            boolean z = fetVar3.S;
            pcy pcyVar2 = e7z.u1;
            if (z) {
                fetVar3.l(pcyVar2);
            } else {
                fetVar3.r0();
            }
            shd shdVar3 = gqw0.x;
            jpm0.o(fetVar3, tj30VarC, shdVar3);
            shd shdVar4 = gqw0.w;
            jpm0.o(fetVar3, bh90VarM, shdVar4);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar5 = gqw0.y;
            jpm0.o(fetVar3, numValueOf, shdVar5);
            jpm0.n(fetVar3);
            shd shdVar6 = gqw0.v;
            jpm0.o(fetVar3, mm40VarC0, shdVar6);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zx7 zx7Var2 = gqw0.e;
            jr8 jr8Var2 = jr8.f16991a;
            mm40 mm40VarB = jr8Var2.b(mm40VarD, zx7Var2);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = lgb.J(mm40VarB, vgg0.a(16.0f));
            zfn zfnVar = zaq0.b;
            mm40 mm40VarF = phu0.F(i120.Q(mm40VarJ, ((ThemeColors) fetVar3.k(zfnVar)).getBackgroundContent(), jd8.n), null, null, false, null, function0, fetVar3, (i4 << 9) & 458752, 15);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar3, 0);
            int iHashCode2 = Long.hashCode(fetVar3.T);
            bh90 bh90VarM2 = fetVar3.m();
            mm40 mm40VarC1 = kbc.c0(fetVar3, mm40VarF);
            fetVar3.i0();
            if (fetVar3.S) {
                fetVar3.l(pcyVar2);
            } else {
                fetVar3.r0();
            }
            jpm0.o(fetVar3, thg0VarA, shdVar3);
            jpm0.o(fetVar3, bh90VarM2, shdVar4);
            vqd.u(iHashCode2, fetVar3, shdVar5, fetVar3);
            jpm0.o(fetVar3, mm40VarC1, shdVar6);
            if (yrc0Var instanceof wrc0) {
                fetVar3.e0(794303012);
                i3 = 0;
                shdVar = shdVar4;
                pcyVar = pcyVar2;
                shdVar2 = shdVar5;
                jr8Var = jr8Var2;
                k7x.b(((wrc0) yrc0Var).f39635a, null, lgb.J(o7k0.n(s5x0.J(mm40Var, 12.0f), 60.0f), vgg0.a(12.0f)), a8k0.F(R.drawable.promo_shop_default_small, 0, fetVar3), a8k0.F(R.drawable.promo_shop_default_small, 0, fetVar3), null, null, null, null, null, gqw0.A, null, fetVar, 36912, 24582, 15328);
                fetVar.r(false);
                fetVar2 = fetVar;
            } else {
                pcyVar = pcyVar2;
                shdVar = shdVar4;
                shdVar2 = shdVar5;
                jr8Var = jr8Var2;
                i3 = 0;
                if (!(yrc0Var instanceof xrc0)) {
                    throw b1j.f(302715818, fetVar3, false);
                }
                fetVar3.e0(795020290);
                hds hdsVar = ((xrc0) yrc0Var).f41363a;
                boolean zG = fetVar3.g(hdsVar);
                Object objP = fetVar3.P();
                cl5 cl5Var = ukd.f35823a;
                if (zG || objP == cl5Var) {
                    Pair pair = new Pair(new n0x(hdsVar.b), new n0x(azw.R(hdsVar.b)));
                    fetVar3.o0(pair);
                    objP = pair;
                }
                Pair pair2 = (Pair) objP;
                n0x n0xVar = (n0x) pair2.f46059a;
                n0x n0xVar2 = (n0x) pair2.b;
                Object objP2 = fetVar3.P();
                if (objP2 == cl5Var) {
                    objP2 = new m0x(R.drawable.promo_shop_default_small, null, 6);
                    fetVar3.o0(objP2);
                }
                fetVar2 = fetVar3;
                y9a.f(n0xVar, n0xVar2, (m0x) objP2, null, u1c.M(1587192446, new fp0(mm40Var, (byte) 5), fetVar3), fetVar2, 24960, 8);
                fetVar2.r(false);
            }
            mm40 mm40VarN = s5x0.N(s5x0.L(o7k0.c(jm40Var, 1.0f), 0.0f, 12.0f, 1), 0.0f, 0.0f, 12.0f, 0.0f, 11);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, i3);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarN);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, shdVar3);
            jpm0.o(fetVar2, bh90VarM3, shdVar);
            vqd.u(iHashCode3, fetVar2, shdVar2, fetVar2);
            jpm0.o(fetVar2, mm40VarC2, shdVar6);
            v8q0.a(yrc0Var.getName(), s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 4.0f, 7), ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 2, 0, null, g1t0.m(), fetVar, 0, 24960, 109560);
            v8q0.a(yrc0Var.A(), null, ((ThemeColors) fetVar.k(zfnVar)).getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 2, 0, null, g1t0.n(), fetVar, 0, 24960, 109562);
            fetVar3 = fetVar;
            fetVar3.r(true);
            fetVar3.r(true);
            if (yrc0Var.b()) {
                fetVar3.e0(-1251084401);
                F(yrc0Var.a(), 0, fetVar3, jr8Var.b(jm40Var, zx7Var));
                fetVar3.r(false);
            } else {
                fetVar3.e0(-1250939290);
                fetVar3.r(false);
            }
            fetVar3.r(true);
        } else {
            fetVar3.X();
        }
        yfe0 yfe0VarU = fetVar3.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o090(mm40Var, yrc0Var, function0, i2, (byte) 28);
        }
    }

    public static final void E(ArrayList arrayList, Function1 function1, fet fetVar, int i2) {
        fetVar.g0(146663154);
        byte b2 = 2;
        int i3 = (fetVar.g(arrayList) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        byte b3 = 0;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            ch80 ch80VarF = h97.f(xfn.a(fetVar).d, 12.0f, xfn.a(fetVar).d, 48.0f, fetVar);
            boolean z = ((i3 & 14) == 4) | ((i3 & 112) == 32);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new td8(arrayList, function1, b2);
                fetVar.o0(objP);
            }
            b8k0.e(jm40.b, null, ch80VarF, qw3Var, null, null, false, null, (Function1) objP, fetVar, 6, 490);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new qpc0(arrayList, function1, i2, b3);
        }
    }

    public static final void F(int i2, int i3, fet fetVar, mm40 mm40Var) {
        fet fetVar2 = fetVar;
        fetVar2.g0(2108889001);
        int i4 = i3 | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar2.e(i2) ? 32 : 16);
        if (fetVar2.U(i4 & 1, (i4 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarS = i120.S(mm40Var, 2.0f, ((ThemeColors) fetVar2.k(zaq0.b)).getBackground(), vgg0.a(360.0f));
            zfn zfnVar = m8m0.f21378a;
            mm40 mm40VarK = s5x0.K(i120.Q(mm40VarS, ((StaticColors) fetVar2.k(zfnVar)).m98getGreen0d7_KjU(), vgg0.a(360.0f)), 6.0f, 2.0f);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarK);
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
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, jm40.b);
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
            v8q0.a(String.valueOf(i2), null, ((StaticColors) fetVar2.k(zfnVar)).m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(6), 0L, 2, false, 2, 0, null, g1t0.b(), fetVar, 0, 24960, 109562);
            v8q0.a(rsm0.w(R.string.string_fs, 0, fetVar), null, ((StaticColors) fetVar.k(zfnVar)).m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(6), 0L, 2, false, 2, 0, null, g1t0.h(), fetVar, 0, 24960, 109562);
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new v2w(mm40Var, i2, i3, (byte) 16);
        }
    }

    public static final void G(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        boolean z;
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(2059419319);
        int i3 = i2 | (fetVar.g(l7m0Var) ? 4 : 2) | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            n0q n0qVar = o7k0.c;
            zfn zfnVar = zaq0.b;
            mm40 mm40VarQ = i120.Q(n0qVar, ((ThemeColors) fetVar.k(zfnVar)).getBackground(), jd8.n);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
            imm immVar = new imm(new ilm(((ThemeColors) fetVar.k(zfnVar)).getSecondary()), new plm(((vpc0) l7m0Var.getValue()).getTitle(), ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), fa50.f9191a), fmm.f9790a, ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), true, new y3d(((ThemeColors) fetVar.k(zfnVar)).getSeparator60()));
            int i4 = i3 & 112;
            boolean z2 = i4 == 32;
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new bac0(function1, (byte) 15);
                fetVar.o0(objP);
            }
            hlm.c(null, immVar, null, (Function0) objP, null, null, null, null, null, null, null, null, fetVar, 0, 0, 4085);
            vpc0 vpc0Var = (vpc0) l7m0Var.getValue();
            if (vpc0Var != null) {
                if (vpc0Var instanceof rpc0) {
                    fetVar.e0(515410369);
                    E(((rpc0) vpc0Var).f30881a, function1, fetVar, i4);
                    fetVar.r(false);
                } else {
                    z = false;
                    if (vpc0Var instanceof spc0) {
                        fetVar.e0(515414923);
                        q(function1, fetVar, (i3 >> 3) & 14);
                        fetVar.r(false);
                    } else if (vpc0Var instanceof tpc0) {
                        fetVar.e0(515417698);
                        r(((tpc0) vpc0Var).f34326a, function1, fetVar, i4);
                        fetVar.r(false);
                    } else if (vpc0Var instanceof upc0) {
                        fetVar.e0(515421213);
                        I(0, fetVar);
                        fetVar.r(false);
                    }
                }
                fetVar.r(true);
            } else {
                z = false;
            }
            throw b1j.f(515407893, fetVar, z);
        }
        fetVar.X();
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zs70(l7m0Var, function1, i2, (byte) 25);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003e  */
    /* JADX WARN: Code duplicated, block: B:24:0x0040  */
    /* JADX WARN: Code duplicated, block: B:27:0x0049 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x004b  */
    /* JADX WARN: Code duplicated, block: B:29:0x004d  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:39:0x0085  */
    /* JADX WARN: Code duplicated, block: B:42:0x008f  */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    public static final void H(int i2, int i3, fet fetVar, mm40 mm40Var, String str, boolean z) {
        boolean z2;
        boolean z3;
        yfe0 yfe0VarU;
        boolean z4;
        boolean z5;
        Object objP;
        byte b2;
        fetVar.g0(-296441647);
        int i4 = (fetVar.g(mm40Var) ? 4 : 2) | i2 | (fetVar.g(str) ? 32 : 16);
        int i5 = i3 & 4;
        if (i5 == 0) {
            if ((i2 & 384) == 0) {
                i4 |= fetVar.h(z) ? 256 : 128;
            }
            if ((i4 & 147) != 146) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (fetVar.U(i4 & 1, z2)) {
                if (i5 != 0) {
                    z4 = false;
                } else {
                    z4 = z;
                }
                mm40 mm40VarP = o7k0.p(mm40Var, tz7.b, tz7.c);
                z5 = (i4 & 896) == 256;
                objP = fetVar.P();
                b2 = 3;
                if (z5 || objP == ukd.f35823a) {
                    objP = new z(b2, z4);
                    fetVar.o0(objP);
                }
                k7x.a(str, null, i4w0.T(mm40VarP, (Function1) objP), null, null, fetVar, ((i4 >> 3) & 14) | 48, 2040);
                z3 = z4;
            } else {
                fetVar.X();
                z3 = z;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new h08(i2, i3, mm40Var, str, z3);
            }
        }
        i4 |= 384;
        if ((i4 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (fetVar.U(i4 & 1, z2)) {
            if (i5 != 0) {
                z4 = false;
            } else {
                z4 = z;
            }
            mm40 mm40VarP2 = o7k0.p(mm40Var, tz7.b, tz7.c);
            if ((i4 & 896) == 256) {
            }
            objP = fetVar.P();
            b2 = 3;
            if (z5) {
                objP = new z(b2, z4);
                fetVar.o0(objP);
            } else {
                objP = new z(b2, z4);
                fetVar.o0(objP);
            }
            k7x.a(str, null, i4w0.T(mm40VarP2, (Function1) objP), null, null, fetVar, ((i4 >> 3) & 14) | 48, 2040);
            z3 = z4;
        } else {
            fetVar.X();
            z3 = z;
        }
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new h08(i2, i3, mm40Var, str, z3);
        }
    }

    public static final void I(int i2, fet fetVar) {
        fetVar.g0(-556501852);
        if (fetVar.U(i2 & 1, i2 != 0)) {
            zcl zclVar = qmk.f28987a;
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            mm40 mm40VarM = s5x0.M(jm40.b, xfn.a(fetVar).d, 12.0f, xfn.a(fetVar).d, 48.0f);
            x5d x5dVarA = w5d.a(qw3Var, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarM);
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
            fetVar.e0(1132727949);
            for (int i3 = 0; i3 < 3; i3++) {
                J(0, fetVar);
            }
            fetVar.r(false);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t4c0(i2, (byte) 24);
        }
    }

    public static final void J(int i2, fet fetVar) {
        fetVar.g0(-1302531770);
        if (fetVar.U(i2 & 1, i2 != 0)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarQ = i120.Q(lgb.J(mm40VarD, vgg0.a(16.0f)), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), jd8.n);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
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
            mm40 mm40VarN = o7k0.n(s5x0.J(jm40Var, 12.0f), 60.0f);
            zcl zclVar2 = qmk.i;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarN), vbc.d0(null, fetVar, 0, 1)));
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, jm40Var);
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
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, o7k0.p(s5x0.N(jm40Var, 0.0f, 20.0f, 0.0f, 12.0f, 5), 168.0f, 16.0f)), vbc.d0(null, fetVar, 0, 1)));
            dw9.x(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, o7k0.p(jm40Var, 128.0f, 16.0f)), vbc.d0(null, fetVar, 0, 1), fetVar, 0, true);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t4c0(i2, (byte) 25);
        }
    }

    public static final void K(mm40 mm40Var, ueo0 ueo0Var, xcz xczVar, xcz xczVar2, rah0 rah0Var, Function1 function1, fet fetVar, int i2) {
        int i3;
        Function1 function2;
        ueo0 ueo0Var2;
        Object ah0Var;
        ueo0 ueo0Var3;
        fet fetVar2 = fetVar;
        function1.getClass();
        fetVar2.g0(2070738555);
        if ((i2 & 6) == 0) {
            i3 = (fetVar2.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.g(ueo0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar2.g(xczVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar2.g(xczVar2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar2.g(rah0Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar2.i(function1) ? 131072 : 65536;
        }
        int i4 = i3;
        if (fetVar2.U(i4 & 1, (74899 & i4) != 74898)) {
            fetVar2.Z();
            if ((i2 & 1) != 0 && !fetVar2.B()) {
                fetVar2.X();
            }
            fetVar2.s();
            WeakHashMap weakHashMap = djv0.w;
            boolean zBooleanValue = ((Boolean) ((hgk0) zcm0.i(fetVar2).c.d).getValue()).booleanValue();
            int i5 = ueo0Var.f35539a;
            p9r0 p9r0Var = ueo0Var.d;
            Integer numValueOf = Integer.valueOf(i5);
            Integer numValueOf2 = Integer.valueOf(ueo0Var.c);
            boolean z = ((i4 & 112) == 32) | ((((i4 & 896) ^ 384) > 256 && fetVar2.g(xczVar)) || (i4 & 384) == 256) | ((((i4 & 7168) ^ 3072) > 2048 && fetVar2.g(xczVar2)) || (i4 & 3072) == 2048);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            yje yjeVar = null;
            if (z || objP == cl5Var) {
                ueo0Var3 = ueo0Var;
                ah0Var = new ah0(ueo0Var3, xczVar, xczVar2, yjeVar, (byte) 23);
                fetVar2.o0(ah0Var);
            } else {
                ueo0Var3 = ueo0Var;
                ah0Var = objP;
            }
            m0x0.v(numValueOf, numValueOf2, (Function2) ah0Var, fetVar2);
            n0q n0qVar = o7k0.c;
            mm40 mm40VarG0 = l8x.G0(mm40Var.e(n0qVar));
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarG0);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z2 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z2) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar2, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf3 = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf3, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            a4x a4xVar = ueo0Var3.b;
            a4x a4xVar2 = ueo0Var3.e;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(n0qVar, 0.0f, 0.0f, 0.0f, r10 != 0 ? 40.0f : 0.0f, 7);
            mm40 mm40VarR = jm40.b;
            if (!zBooleanValue) {
                mm40VarR = knm0.r(mm40VarR);
            }
            mm40 mm40VarE = mm40VarN.e(mm40VarR);
            boolean z3 = (458752 & i4) == 131072;
            Object objP2 = fetVar2.P();
            if (z3 || objP2 == cl5Var) {
                objP2 = new zbm0(function1, (byte) 24);
                fetVar2.o0(objP2);
            }
            hew0.E(mm40VarE, a4xVar, a4xVar2, xczVar, xczVar2, rah0Var, (Function1) objP2, fetVar2, (i4 << 3) & 523264);
            fetVar2 = fetVar2;
            tj30 tj30VarC2 = zq8.c(gqw0.h, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, n0qVar);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC2, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            boolean z4 = p9r0Var != null;
            pzn pznVarD = kzn.d(null, 0.0f, 3);
            Object objP3 = fetVar2.P();
            byte b2 = 19;
            if (objP3 == cl5Var) {
                objP3 = new or3(b2);
                fetVar2.o0(objP3);
            }
            pzn pznVarA = pznVarD.a(kzn.k(null, (Function1) objP3, 1));
            alo aloVarE = kzn.e(null, 3);
            Object objP4 = fetVar2.P();
            if (objP4 == cl5Var) {
                objP4 = new or3(b2);
                fetVar2.o0(objP4);
            }
            ueo0Var2 = ueo0Var;
            function2 = function1;
            b34.h(z4, null, pznVarA, aloVarE.a(kzn.m((Function1) objP4)), null, u1c.M(292820631, new nhl0(ueo0Var2, function2, (byte) 14), fetVar2), fetVar2, 200064, 18);
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            function2 = function1;
            ueo0Var2 = ueo0Var;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cg0((Object) mm40Var, (Object) ueo0Var2, (Object) xczVar, (Object) xczVar2, (Object) rah0Var, (Object) function2, i2, (byte) 28);
        }
    }

    public static final void L(mm40 mm40Var, boolean z, mts0 mts0Var, fet fetVar, int i2) {
        mts0Var.getClass();
        fetVar.g0(575996183);
        int i3 = i2 | 6 | (fetVar.h(z) ? 32 : 16) | (fetVar.g(mts0Var) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            if (mts0Var instanceof jts0) {
                fetVar.e0(1108144432);
                M(z, (jts0) mts0Var, fetVar, i3 & 1022);
                fetVar.r(false);
            } else if (mts0Var.equals(lts0.f20641a)) {
                fetVar.e0(1108370577);
                O(6, fetVar);
                fetVar.r(false);
            } else {
                if (!(mts0Var instanceof kts0)) {
                    throw b1j.f(-518444498, fetVar, false);
                }
                fetVar.e0(1108473962);
                N((kts0) mts0Var, fetVar, ((i3 >> 3) & 112) | 6);
                fetVar.r(false);
            }
            mm40Var = jm40.b;
        } else {
            fetVar.X();
        }
        mm40 mm40Var2 = mm40Var;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new q2n((Object) mm40Var2, z, (Object) mts0Var, i2, (byte) 26);
        }
    }

    public static final void M(boolean z, jts0 jts0Var, fet fetVar, int i2) {
        int i3;
        ch80 ch80VarF;
        fetVar.g0(655295847);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(jm40.b) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.h(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(jts0Var) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            mm40 mm40VarQ = i120.Q(o7k0.c, ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), jd8.n);
            fetVar.e0(-1620871884);
            zcl zclVar = qmk.f28987a;
            lh80 lh80VarU = s5x0.u(0.0f, 0.0f, 0.0f, 24.0f, 7);
            if (z) {
                fetVar.e0(-944629172);
                ch80VarF = knm0.g(lh80VarU, fetVar);
                fetVar.r(false);
            } else {
                fetVar.e0(-944568443);
                ch80VarF = knm0.f(lh80VarU, fetVar);
                fetVar.r(false);
            }
            fetVar.r(false);
            boolean z2 = (i3 & 896) == 256;
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new lcr0(jts0Var, (byte) 22);
                fetVar.o0(objP);
            }
            b8k0.e(mm40VarQ, null, ch80VarF, null, null, null, false, null, (Function1) objP, fetVar, 0, 506);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ooh(z, jts0Var, i2);
        }
    }

    public static final void N(kts0 kts0Var, fet fetVar, int i2) {
        int i3;
        fet fetVar2;
        fetVar.g0(1237223363);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(jm40.b) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(kts0Var) ? 32 : 16;
        }
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
            fetVar2 = fetVar;
            jcb.l(null, kts0Var.f18882a, false, null, fetVar2, 0, 13);
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nb50(kts0Var, i2);
        }
    }

    public static final void O(int i2, fet fetVar) {
        int i3;
        fetVar.g0(-1274922472);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(jm40.b) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            fqj0 fqj0VarD0 = vbc.d0(null, fetVar, 0, 1);
            n0q n0qVar = o7k0.c;
            float f2 = xfn.a(fetVar).c;
            zcl zclVar = qmk.f28987a;
            lh80 lh80Var = new lh80(f2, 12.0f, f2, 12.0f);
            qw3 qw3Var = new qw3(24.0f, true, new jf4((byte) 14));
            boolean zG = fetVar.g(fqj0VarD0);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                objP = new yq5(fqj0VarD0, (byte) 6);
                fetVar.o0(objP);
            }
            b8k0.e(n0qVar, null, lh80Var, qw3Var, null, null, false, null, (Function1) objP, fetVar, 0, 490);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new bur0(i2, (byte) 3);
        }
    }

    public static final ArrayList P(String str, List list) {
        list.getClass();
        str.getClass();
        String lowerCase = str.toLowerCase(Locale.ROOT);
        ArrayList arrayListU = ohs0.u(lowerCase);
        Iterator it = list.iterator();
        odb odbVar = null;
        while (it.hasNext()) {
            odb odbVarC = (odb) it.next();
            if (odbVarC instanceof ndb) {
                odbVar = odbVarC;
            } else {
                String strB = odbVarC.b();
                Locale locale = Locale.ROOT;
                if (!vqd.A(strB, locale, lowerCase, false)) {
                    kdb kdbVar = odbVarC instanceof kdb ? (kdb) odbVarC : null;
                    List list2 = kdbVar != null ? kdbVar.g : null;
                    if (list2 == null) {
                        list2 = iun.f15405a;
                    }
                    if (list2 == null || !list2.isEmpty()) {
                        Iterator it2 = list2.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                String str2 = ((mdb) it2.next()).b;
                                Locale locale2 = Locale.ROOT;
                                if (vqd.A(str2, locale2, lowerCase, false)) {
                                    locale = locale2;
                                }
                            }
                        }
                    }
                }
                ndb ndbVar = (ndb) odbVar;
                if (ndbVar != null) {
                    arrayListU.add(ndbVar);
                    odbVar = null;
                }
                if (odbVarC instanceof kdb) {
                    kdb kdbVar2 = (kdb) odbVarC;
                    if (!vqd.A(kdbVar2.b, locale, lowerCase, false)) {
                        List list3 = kdbVar2.g;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : list3) {
                            if (vqd.A(((mdb) obj).b, Locale.ROOT, lowerCase, false)) {
                                arrayList.add(obj);
                            }
                        }
                        odbVarC = kdb.c(kdbVar2, 0L, 0L, null, arrayList, false, 191);
                    }
                }
                arrayListU.add(odbVarC);
            }
        }
        return arrayListU;
    }

    public static final vf8 Q(pf8 pf8Var) {
        nw80 nw80Var = pf8Var != null ? pf8Var.c : nw80.t;
        m7m0 m7m0Var = pf8Var != null ? pf8Var.d : m7m0.i;
        return new vf8(pf8Var != null ? pf8Var.e.f29104a : 0, pf8Var != null ? pf8Var.e.c : 0L, nw80Var, m7m0Var, pf8Var != null ? pf8Var.e.b : "");
    }

    public static final q7n R(ctf0 ctf0Var, Date date, Long l) {
        String strA = ctf0Var.b.a(R.string.before_disappearing_title, Arrays.copyOf(new Object[0], 0));
        lsm0 lsm0Var = ctf0Var.b;
        return new q7n(strA, date, l, new mnl(lsm0Var.a(R.string.day_short, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.hour_short, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.minute_short, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.second_short, Arrays.copyOf(new Object[0], 0))));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006a  */
    public static void S(t68 t68Var, StringBuilder sb, int i2, boolean z) throws bwq {
        while (i2 > 1) {
            if (t68Var.a() < 11) {
                throw bwq.a();
            }
            int iB = t68Var.b(11);
            sb.append(Z(iB / 45));
            sb.append(Z(iB % 45));
            i2 -= 2;
        }
        if (i2 == 1) {
            if (t68Var.a() < 6) {
                throw bwq.a();
            }
            sb.append(Z(t68Var.b(6)));
        }
        if (z) {
            for (int length = sb.length(); length < sb.length(); length++) {
                if (sb.charAt(length) == '%') {
                    if (length < sb.length() - 1) {
                        int i3 = length + 1;
                        if (sb.charAt(i3) == '%') {
                            sb.deleteCharAt(i3);
                        } else {
                            sb.setCharAt(length, (char) 29);
                        }
                    } else {
                        sb.setCharAt(length, (char) 29);
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:118:0x0147  */
    /* JADX WARN: Code duplicated, block: B:121:0x0153 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:123:0x0157  */
    /* JADX WARN: Code duplicated, block: B:125:0x015b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:127:0x0160  */
    /* JADX WARN: Code duplicated, block: B:129:0x0164 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:133:0x016d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:134:0x016f  */
    /* JADX WARN: Code duplicated, block: B:139:0x0178  */
    /* JADX WARN: Code duplicated, block: B:13:0x003c  */
    /* JADX WARN: Code duplicated, block: B:140:0x017b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:141:0x017d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:149:0x018c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:150:0x018e  */
    /* JADX WARN: Code duplicated, block: B:151:0x0191 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:153:0x0194 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:154:0x0196  */
    /* JADX WARN: Code duplicated, block: B:155:0x0199  */
    /* JADX WARN: Code duplicated, block: B:23:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0056  */
    /* JADX WARN: Code duplicated, block: B:25:0x0058  */
    /* JADX WARN: Code duplicated, block: B:28:0x005c  */
    /* JADX WARN: Code duplicated, block: B:35:0x0070  */
    /* JADX WARN: Code duplicated, block: B:38:0x0083 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:45:0x009c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x009e  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:60:0x00be  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:66:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f1 A[PHI: r17
  0x00f1: PHI (r17v2 int) = (r17v1 int), (r17v1 int), (r17v4 int), (r17v1 int) binds: [B:68:0x00d5, B:74:0x00e1, B:81:0x00ef, B:80:0x00ed] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:84:0x00f5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:93:0x0109 A[PHI: r28
  0x0109: PHI (r28v6 boolean) = (r28v5 boolean), (r28v5 boolean), (r28v5 boolean), (r28v7 boolean), (r28v7 boolean), (r28v7 boolean) binds: [B:95:0x010f, B:97:0x0113, B:99:0x0117, B:86:0x00fb, B:88:0x00ff, B:90:0x0103] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:94:0x010b  */
    /* JADX WARN: Code duplicated, block: B:96:0x0111  */
    public static void T(t68 t68Var, StringBuilder sb, int i2, uvb uvbVar, ArrayList arrayList, Map map) throws bwq {
        Charset charsetForName;
        boolean z;
        boolean z2;
        boolean z3;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z4;
        boolean z5;
        boolean z6;
        Charset charset;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        byte b2;
        int i10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i11;
        byte b3;
        if (i2 * 8 > t68Var.a()) {
            throw bwq.a();
        }
        byte[] bArr = new byte[i2];
        int i12 = 0;
        for (int i13 = 0; i13 < i2; i13++) {
            bArr[i13] = (byte) t68Var.b(8);
        }
        if (uvbVar == null) {
            Charset charset2 = ctm0.b;
            if (map != null) {
                gkj gkjVar = gkj.e;
                if (map.containsKey(gkjVar)) {
                    charsetForName = Charset.forName(map.get(gkjVar).toString());
                } else {
                    z = true;
                    if (i2 > 2 || !(((b3 = bArr[0]) == -2 && bArr[1] == -1) || (b3 == -1 && bArr[1] == -2))) {
                        if (charset2 != null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (i2 <= 3 && bArr[0] == -17 && bArr[1] == -69 && bArr[2] == -65) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        int i14 = 0;
                        int i15 = 0;
                        i3 = 0;
                        i4 = 0;
                        i5 = 0;
                        i6 = 0;
                        i7 = 0;
                        i8 = 0;
                        i9 = 0;
                        int i16 = 0;
                        int i17 = 0;
                        z4 = z2;
                        z5 = true;
                        while (i3 < i2 && (z || z4 || z5)) {
                            z10 = z;
                            b2 = bArr[i3];
                            Charset charset3 = charset2;
                            i10 = b2 & 255;
                            if (z5) {
                                if (i4 > 0) {
                                    if ((b2 & 128) != 0) {
                                        i4--;
                                    }
                                    if (!z10) {
                                        z12 = z10;
                                    } else if (i10 > 127 || i10 >= 160) {
                                        if (i10 > 159 && (i10 < 192 || i10 == 215 || i10 == 247)) {
                                            i9++;
                                        }
                                        z12 = z10;
                                    } else {
                                        z12 = false;
                                    }
                                    if (z4) {
                                        z13 = z12;
                                    } else if (i5 > 0) {
                                        z13 = z12;
                                        if (i10 >= 64 || i10 == 127 || i10 > 252) {
                                            z4 = false;
                                        } else {
                                            i5--;
                                        }
                                    } else {
                                        z13 = z12;
                                        if (i10 != 128 || i10 == 160 || i10 > 239) {
                                            z4 = false;
                                        } else if (i10 <= 160 || i10 >= 224) {
                                            if (i10 > 127) {
                                                i5++;
                                                int i18 = i16 + 1;
                                                if (i18 > i14) {
                                                    i14 = i18;
                                                    i16 = i14;
                                                } else {
                                                    i16 = i18;
                                                }
                                            } else {
                                                i16 = 0;
                                            }
                                            i17 = 0;
                                        } else {
                                            i15++;
                                            int i19 = i17 + 1;
                                            if (i19 > i12) {
                                                i12 = i19;
                                                i17 = i12;
                                            } else {
                                                i17 = i19;
                                            }
                                            i16 = 0;
                                        }
                                    }
                                    i3++;
                                    z = z13;
                                    charset2 = charset3;
                                } else {
                                    z11 = z5;
                                    if ((b2 & 128) != 0) {
                                        if ((b2 & 64) != 0) {
                                            i11 = i4 + 1;
                                            if ((b2 & 32) == 0) {
                                                i6++;
                                            } else {
                                                i11 = i4 + 2;
                                                if ((b2 & 16) == 0) {
                                                    i7++;
                                                } else {
                                                    i4 += 3;
                                                    if ((b2 & 8) == 0) {
                                                        i8++;
                                                    }
                                                    if (!z10) {
                                                        z12 = z10;
                                                    } else {
                                                        if (i10 > 127) {
                                                        }
                                                        if (i10 > 159) {
                                                            i9++;
                                                        }
                                                        z12 = z10;
                                                    }
                                                    if (z4) {
                                                        z13 = z12;
                                                    } else if (i5 > 0) {
                                                        z13 = z12;
                                                        if (i10 >= 64) {
                                                            z4 = false;
                                                        } else {
                                                            z4 = false;
                                                        }
                                                    } else {
                                                        z13 = z12;
                                                        if (i10 != 128) {
                                                            z4 = false;
                                                        } else {
                                                            z4 = false;
                                                        }
                                                    }
                                                    i3++;
                                                    z = z13;
                                                    charset2 = charset3;
                                                }
                                            }
                                            i4 = i11;
                                        }
                                    }
                                }
                                z5 = false;
                                if (!z10) {
                                    z12 = z10;
                                } else {
                                    if (i10 > 127) {
                                    }
                                    if (i10 > 159) {
                                        i9++;
                                    }
                                    z12 = z10;
                                }
                                if (z4) {
                                    z13 = z12;
                                } else if (i5 > 0) {
                                    z13 = z12;
                                    if (i10 >= 64) {
                                        z4 = false;
                                    } else {
                                        z4 = false;
                                    }
                                } else {
                                    z13 = z12;
                                    if (i10 != 128) {
                                        z4 = false;
                                    } else {
                                        z4 = false;
                                    }
                                }
                                i3++;
                                z = z13;
                                charset2 = charset3;
                            } else {
                                z11 = z5;
                            }
                            z5 = z11;
                            if (!z10) {
                                z12 = z10;
                            } else {
                                if (i10 > 127) {
                                }
                                if (i10 > 159) {
                                    i9++;
                                }
                                z12 = z10;
                            }
                            if (z4) {
                                z13 = z12;
                            } else if (i5 > 0) {
                                z13 = z12;
                                if (i10 >= 64) {
                                    z4 = false;
                                } else {
                                    z4 = false;
                                }
                            } else {
                                z13 = z12;
                                if (i10 != 128) {
                                    z4 = false;
                                } else {
                                    z4 = false;
                                }
                            }
                            i3++;
                            z = z13;
                            charset2 = charset3;
                        }
                        z6 = z;
                        charset = charset2;
                        z7 = z5;
                        if (z7 || i4 <= 0) {
                            z8 = z7;
                        } else {
                            z8 = false;
                        }
                        if (z4 || i5 <= 0) {
                            z9 = z4;
                        } else {
                            z9 = false;
                        }
                        if (!z8 && (z3 || i6 + i7 + i8 > 0)) {
                            charsetForName = StandardCharsets.UTF_8;
                        } else if (!z9 && (ctm0.d || i12 >= 3 || i14 >= 3)) {
                            charsetForName = charset;
                        } else if (z6 || !z9) {
                            if (z6) {
                                charsetForName = StandardCharsets.ISO_8859_1;
                            } else if (z9) {
                                charsetForName = charset;
                            } else if (z8) {
                                charsetForName = StandardCharsets.UTF_8;
                            } else {
                                charsetForName = ctm0.f4945a;
                            }
                        } else if (!(i12 == 2 && i15 == 2) && i9 * 10 < i2) {
                            charsetForName = StandardCharsets.ISO_8859_1;
                        } else {
                            charsetForName = charset;
                        }
                    } else {
                        charsetForName = StandardCharsets.UTF_16;
                    }
                }
            } else {
                z = true;
                if (i2 > 2) {
                    if (charset2 != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (i2 <= 3) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    int i110 = 0;
                    int i111 = 0;
                    i3 = 0;
                    i4 = 0;
                    i5 = 0;
                    i6 = 0;
                    i7 = 0;
                    i8 = 0;
                    i9 = 0;
                    int i112 = 0;
                    int i113 = 0;
                    z4 = z2;
                    z5 = true;
                    while (i3 < i2) {
                        z10 = z;
                        b2 = bArr[i3];
                        Charset charset4 = charset2;
                        i10 = b2 & 255;
                        if (z5) {
                            if (i4 > 0) {
                                if ((b2 & 128) != 0) {
                                    i4--;
                                }
                                if (!z10) {
                                    z12 = z10;
                                } else {
                                    if (i10 > 127) {
                                    }
                                    if (i10 > 159) {
                                        i9++;
                                    }
                                    z12 = z10;
                                }
                                if (z4) {
                                    z13 = z12;
                                } else if (i5 > 0) {
                                    z13 = z12;
                                    if (i10 >= 64) {
                                        z4 = false;
                                    } else {
                                        z4 = false;
                                    }
                                } else {
                                    z13 = z12;
                                    if (i10 != 128) {
                                        z4 = false;
                                    } else {
                                        z4 = false;
                                    }
                                }
                                i3++;
                                z = z13;
                                charset2 = charset4;
                            } else {
                                z11 = z5;
                                if ((b2 & 128) != 0) {
                                    if ((b2 & 64) != 0) {
                                        i11 = i4 + 1;
                                        if ((b2 & 32) == 0) {
                                            i6++;
                                        } else {
                                            i11 = i4 + 2;
                                            if ((b2 & 16) == 0) {
                                                i7++;
                                            } else {
                                                i4 += 3;
                                                if ((b2 & 8) == 0) {
                                                    i8++;
                                                }
                                                if (!z10) {
                                                    z12 = z10;
                                                } else {
                                                    if (i10 > 127) {
                                                    }
                                                    if (i10 > 159) {
                                                        i9++;
                                                    }
                                                    z12 = z10;
                                                }
                                                if (z4) {
                                                    z13 = z12;
                                                } else if (i5 > 0) {
                                                    z13 = z12;
                                                    if (i10 >= 64) {
                                                        z4 = false;
                                                    } else {
                                                        z4 = false;
                                                    }
                                                } else {
                                                    z13 = z12;
                                                    if (i10 != 128) {
                                                        z4 = false;
                                                    } else {
                                                        z4 = false;
                                                    }
                                                }
                                                i3++;
                                                z = z13;
                                                charset2 = charset4;
                                            }
                                        }
                                        i4 = i11;
                                    }
                                }
                            }
                            z5 = false;
                            if (!z10) {
                                z12 = z10;
                            } else {
                                if (i10 > 127) {
                                }
                                if (i10 > 159) {
                                    i9++;
                                }
                                z12 = z10;
                            }
                            if (z4) {
                                z13 = z12;
                            } else if (i5 > 0) {
                                z13 = z12;
                                if (i10 >= 64) {
                                    z4 = false;
                                } else {
                                    z4 = false;
                                }
                            } else {
                                z13 = z12;
                                if (i10 != 128) {
                                    z4 = false;
                                } else {
                                    z4 = false;
                                }
                            }
                            i3++;
                            z = z13;
                            charset2 = charset4;
                        } else {
                            z11 = z5;
                        }
                        z5 = z11;
                        if (!z10) {
                            z12 = z10;
                        } else {
                            if (i10 > 127) {
                            }
                            if (i10 > 159) {
                                i9++;
                            }
                            z12 = z10;
                        }
                        if (z4) {
                            z13 = z12;
                        } else if (i5 > 0) {
                            z13 = z12;
                            if (i10 >= 64) {
                                z4 = false;
                            } else {
                                z4 = false;
                            }
                        } else {
                            z13 = z12;
                            if (i10 != 128) {
                                z4 = false;
                            } else {
                                z4 = false;
                            }
                        }
                        i3++;
                        z = z13;
                        charset2 = charset4;
                    }
                    z6 = z;
                    charset = charset2;
                    z7 = z5;
                    if (z7) {
                        z8 = z7;
                    } else {
                        z8 = z7;
                    }
                    if (z4) {
                        z9 = z4;
                    } else {
                        z9 = z4;
                    }
                    if (!z8) {
                        if (!z9) {
                            if (z6) {
                                if (z6) {
                                    charsetForName = StandardCharsets.ISO_8859_1;
                                } else if (z9) {
                                    charsetForName = charset;
                                } else if (z8) {
                                    charsetForName = StandardCharsets.UTF_8;
                                } else {
                                    charsetForName = ctm0.f4945a;
                                }
                            } else if (z6) {
                                charsetForName = StandardCharsets.ISO_8859_1;
                            } else if (z9) {
                                charsetForName = charset;
                            } else if (z8) {
                                charsetForName = StandardCharsets.UTF_8;
                            } else {
                                charsetForName = ctm0.f4945a;
                            }
                        } else if (z6) {
                            if (z6) {
                                charsetForName = StandardCharsets.ISO_8859_1;
                            } else if (z9) {
                                charsetForName = charset;
                            } else if (z8) {
                                charsetForName = StandardCharsets.UTF_8;
                            } else {
                                charsetForName = ctm0.f4945a;
                            }
                        } else if (z6) {
                            charsetForName = StandardCharsets.ISO_8859_1;
                        } else if (z9) {
                            charsetForName = charset;
                        } else if (z8) {
                            charsetForName = StandardCharsets.UTF_8;
                        } else {
                            charsetForName = ctm0.f4945a;
                        }
                    } else if (!z9) {
                        if (z6) {
                            if (z6) {
                                charsetForName = StandardCharsets.ISO_8859_1;
                            } else if (z9) {
                                charsetForName = charset;
                            } else if (z8) {
                                charsetForName = StandardCharsets.UTF_8;
                            } else {
                                charsetForName = ctm0.f4945a;
                            }
                        } else if (z6) {
                            charsetForName = StandardCharsets.ISO_8859_1;
                        } else if (z9) {
                            charsetForName = charset;
                        } else if (z8) {
                            charsetForName = StandardCharsets.UTF_8;
                        } else {
                            charsetForName = ctm0.f4945a;
                        }
                    } else if (z6) {
                        if (z6) {
                            charsetForName = StandardCharsets.ISO_8859_1;
                        } else if (z9) {
                            charsetForName = charset;
                        } else if (z8) {
                            charsetForName = StandardCharsets.UTF_8;
                        } else {
                            charsetForName = ctm0.f4945a;
                        }
                    } else if (z6) {
                        charsetForName = StandardCharsets.ISO_8859_1;
                    } else if (z9) {
                        charsetForName = charset;
                    } else if (z8) {
                        charsetForName = StandardCharsets.UTF_8;
                    } else {
                        charsetForName = ctm0.f4945a;
                    }
                } else {
                    if (charset2 != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (i2 <= 3) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    int i114 = 0;
                    int i115 = 0;
                    i3 = 0;
                    i4 = 0;
                    i5 = 0;
                    i6 = 0;
                    i7 = 0;
                    i8 = 0;
                    i9 = 0;
                    int i116 = 0;
                    int i117 = 0;
                    z4 = z2;
                    z5 = true;
                    while (i3 < i2) {
                        z10 = z;
                        b2 = bArr[i3];
                        Charset charset5 = charset2;
                        i10 = b2 & 255;
                        if (z5) {
                            if (i4 > 0) {
                                if ((b2 & 128) != 0) {
                                    i4--;
                                }
                                if (!z10) {
                                    z12 = z10;
                                } else {
                                    if (i10 > 127) {
                                    }
                                    if (i10 > 159) {
                                        i9++;
                                    }
                                    z12 = z10;
                                }
                                if (z4) {
                                    z13 = z12;
                                } else if (i5 > 0) {
                                    z13 = z12;
                                    if (i10 >= 64) {
                                        z4 = false;
                                    } else {
                                        z4 = false;
                                    }
                                } else {
                                    z13 = z12;
                                    if (i10 != 128) {
                                        z4 = false;
                                    } else {
                                        z4 = false;
                                    }
                                }
                                i3++;
                                z = z13;
                                charset2 = charset5;
                            } else {
                                z11 = z5;
                                if ((b2 & 128) != 0) {
                                    if ((b2 & 64) != 0) {
                                        i11 = i4 + 1;
                                        if ((b2 & 32) == 0) {
                                            i6++;
                                        } else {
                                            i11 = i4 + 2;
                                            if ((b2 & 16) == 0) {
                                                i7++;
                                            } else {
                                                i4 += 3;
                                                if ((b2 & 8) == 0) {
                                                    i8++;
                                                }
                                                if (!z10) {
                                                    z12 = z10;
                                                } else {
                                                    if (i10 > 127) {
                                                    }
                                                    if (i10 > 159) {
                                                        i9++;
                                                    }
                                                    z12 = z10;
                                                }
                                                if (z4) {
                                                    z13 = z12;
                                                } else if (i5 > 0) {
                                                    z13 = z12;
                                                    if (i10 >= 64) {
                                                        z4 = false;
                                                    } else {
                                                        z4 = false;
                                                    }
                                                } else {
                                                    z13 = z12;
                                                    if (i10 != 128) {
                                                        z4 = false;
                                                    } else {
                                                        z4 = false;
                                                    }
                                                }
                                                i3++;
                                                z = z13;
                                                charset2 = charset5;
                                            }
                                        }
                                        i4 = i11;
                                    }
                                }
                            }
                            z5 = false;
                            if (!z10) {
                                z12 = z10;
                            } else {
                                if (i10 > 127) {
                                }
                                if (i10 > 159) {
                                    i9++;
                                }
                                z12 = z10;
                            }
                            if (z4) {
                                z13 = z12;
                            } else if (i5 > 0) {
                                z13 = z12;
                                if (i10 >= 64) {
                                    z4 = false;
                                } else {
                                    z4 = false;
                                }
                            } else {
                                z13 = z12;
                                if (i10 != 128) {
                                    z4 = false;
                                } else {
                                    z4 = false;
                                }
                            }
                            i3++;
                            z = z13;
                            charset2 = charset5;
                        } else {
                            z11 = z5;
                        }
                        z5 = z11;
                        if (!z10) {
                            z12 = z10;
                        } else {
                            if (i10 > 127) {
                            }
                            if (i10 > 159) {
                                i9++;
                            }
                            z12 = z10;
                        }
                        if (z4) {
                            z13 = z12;
                        } else if (i5 > 0) {
                            z13 = z12;
                            if (i10 >= 64) {
                                z4 = false;
                            } else {
                                z4 = false;
                            }
                        } else {
                            z13 = z12;
                            if (i10 != 128) {
                                z4 = false;
                            } else {
                                z4 = false;
                            }
                        }
                        i3++;
                        z = z13;
                        charset2 = charset5;
                    }
                    z6 = z;
                    charset = charset2;
                    z7 = z5;
                    if (z7) {
                        z8 = z7;
                    } else {
                        z8 = z7;
                    }
                    if (z4) {
                        z9 = z4;
                    } else {
                        z9 = z4;
                    }
                    if (!z8) {
                        if (!z9) {
                            if (z6) {
                                if (z6) {
                                    charsetForName = StandardCharsets.ISO_8859_1;
                                } else if (z9) {
                                    charsetForName = charset;
                                } else if (z8) {
                                    charsetForName = StandardCharsets.UTF_8;
                                } else {
                                    charsetForName = ctm0.f4945a;
                                }
                            } else if (z6) {
                                charsetForName = StandardCharsets.ISO_8859_1;
                            } else if (z9) {
                                charsetForName = charset;
                            } else if (z8) {
                                charsetForName = StandardCharsets.UTF_8;
                            } else {
                                charsetForName = ctm0.f4945a;
                            }
                        } else if (z6) {
                            if (z6) {
                                charsetForName = StandardCharsets.ISO_8859_1;
                            } else if (z9) {
                                charsetForName = charset;
                            } else if (z8) {
                                charsetForName = StandardCharsets.UTF_8;
                            } else {
                                charsetForName = ctm0.f4945a;
                            }
                        } else if (z6) {
                            charsetForName = StandardCharsets.ISO_8859_1;
                        } else if (z9) {
                            charsetForName = charset;
                        } else if (z8) {
                            charsetForName = StandardCharsets.UTF_8;
                        } else {
                            charsetForName = ctm0.f4945a;
                        }
                    } else if (!z9) {
                        if (z6) {
                            if (z6) {
                                charsetForName = StandardCharsets.ISO_8859_1;
                            } else if (z9) {
                                charsetForName = charset;
                            } else if (z8) {
                                charsetForName = StandardCharsets.UTF_8;
                            } else {
                                charsetForName = ctm0.f4945a;
                            }
                        } else if (z6) {
                            charsetForName = StandardCharsets.ISO_8859_1;
                        } else if (z9) {
                            charsetForName = charset;
                        } else if (z8) {
                            charsetForName = StandardCharsets.UTF_8;
                        } else {
                            charsetForName = ctm0.f4945a;
                        }
                    } else if (z6) {
                        if (z6) {
                            charsetForName = StandardCharsets.ISO_8859_1;
                        } else if (z9) {
                            charsetForName = charset;
                        } else if (z8) {
                            charsetForName = StandardCharsets.UTF_8;
                        } else {
                            charsetForName = ctm0.f4945a;
                        }
                    } else if (z6) {
                        charsetForName = StandardCharsets.ISO_8859_1;
                    } else if (z9) {
                        charsetForName = charset;
                    } else if (z8) {
                        charsetForName = StandardCharsets.UTF_8;
                    } else {
                        charsetForName = ctm0.f4945a;
                    }
                }
            }
        } else {
            charsetForName = Charset.forName(uvbVar.name());
        }
        sb.append(new String(bArr, charsetForName));
        arrayList.add(bArr);
    }

    public static void U(t68 t68Var, StringBuilder sb, int i2) throws bwq {
        if (ctm0.c == null) {
            throw bwq.a();
        }
        if (i2 * 13 > t68Var.a()) {
            throw bwq.a();
        }
        byte[] bArr = new byte[i2 * 2];
        int i3 = 0;
        while (i2 > 0) {
            int iB = t68Var.b(13);
            int i4 = (iB % 96) | ((iB / 96) << 8);
            int i5 = i4 + (i4 < 2560 ? 41377 : 42657);
            bArr[i3] = (byte) ((i5 >> 8) & 255);
            bArr[i3 + 1] = (byte) (i5 & 255);
            i3 += 2;
            i2--;
        }
        sb.append(new String(bArr, ctm0.c));
    }

    public static void V(t68 t68Var, StringBuilder sb, int i2) throws bwq {
        if (ctm0.b == null) {
            throw bwq.a();
        }
        if (i2 * 13 > t68Var.a()) {
            throw bwq.a();
        }
        byte[] bArr = new byte[i2 * 2];
        int i3 = 0;
        while (i2 > 0) {
            int iB = t68Var.b(13);
            int i4 = (iB % 192) | ((iB / 192) << 8);
            int i5 = i4 + (i4 < 7936 ? 33088 : 49472);
            bArr[i3] = (byte) (i5 >> 8);
            bArr[i3 + 1] = (byte) i5;
            i3 += 2;
            i2--;
        }
        sb.append(new String(bArr, ctm0.b));
    }

    public static void W(t68 t68Var, StringBuilder sb, int i2) throws bwq {
        while (i2 >= 3) {
            if (t68Var.a() < 10) {
                throw bwq.a();
            }
            int iB = t68Var.b(10);
            if (iB >= 1000) {
                throw bwq.a();
            }
            sb.append(Z(iB / 100));
            sb.append(Z((iB / 10) % 10));
            sb.append(Z(iB % 10));
            i2 -= 3;
        }
        if (i2 == 2) {
            if (t68Var.a() < 7) {
                throw bwq.a();
            }
            int iB2 = t68Var.b(7);
            if (iB2 >= 100) {
                throw bwq.a();
            }
            sb.append(Z(iB2 / 10));
            sb.append(Z(iB2 % 10));
            return;
        }
        if (i2 == 1) {
            if (t68Var.a() < 4) {
                throw bwq.a();
            }
            int iB3 = t68Var.b(4);
            if (iB3 >= 10) {
                throw bwq.a();
            }
            sb.append(Z(iB3));
        }
    }

    public static final hhv X(odb odbVar, odb odbVar2) {
        if ((odbVar == null || (odbVar instanceof ndb)) && (odbVar2 == null || (odbVar2 instanceof ndb))) {
            return hhv.d;
        }
        if (odbVar == null || (odbVar instanceof ndb)) {
            return hhv.f13084a;
        }
        return (odbVar2 == null || (odbVar2 instanceof ndb)) ? hhv.c : hhv.b;
    }

    public static final String Y(String str, String str2) {
        if (str == null || str.length() <= 0) {
            str = null;
        }
        if (str == null) {
            return str2 == null ? "" : str2;
        }
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
        return sb.toString();
    }

    public static char Z(int i2) throws bwq {
        if (i2 < 45) {
            return f[i2];
        }
        throw bwq.a();
    }

    public static final void a(mm40 mm40Var, ex exVar, boolean z, boolean z2, fet fetVar, int i2) {
        mm40 mm40Var2;
        exVar.getClass();
        fetVar.g0(-992691748);
        int i3 = i2 | 6 | (fetVar.g(exVar) ? 32 : 16) | (fetVar.h(z) ? 256 : 128) | (fetVar.h(z2) ? 2048 : 1024);
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            pz40 pz40Var = s6t0.f31722a;
            long backgroundContent = s6t0.b().f33626a.getBackgroundContent();
            zcl zclVar = qmk.f28987a;
            ugg0 ugg0VarA = vgg0.a(16.0f);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = s5x0.N(i120.Q(jm40Var, backgroundContent, ugg0VarA), 8.0f, 0.0f, 8.0f, 16.0f, 2);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            j5n0.n(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 14.0f, 7), exVar.b, fetVar, 0);
            k9x.j(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 16.0f, 7), exVar.c, z2, fetVar, (i3 >> 3) & 896);
            b(i3 & 896, fetVar, null, exVar.d, z);
            fetVar.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yw(mm40Var2, (Object) exVar, z, z2, i2, (byte) 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0120 A[PHI: r29
  0x0120: PHI (r29v9 a.rs5) = (r29v1 a.rs5), (r29v2 a.rs5), (r29v3 a.rs5), (r29v4 a.rs5), (r29v5 a.rs5), (r29v6 a.rs5), (r29v7 a.rs5), (r29v8 a.rs5) binds: [B:68:0x011e, B:71:0x0128, B:74:0x0130, B:77:0x0138, B:80:0x0140, B:83:0x0149, B:86:0x0152, B:89:0x015b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r23v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.ArrayList] */
    public static final kr5 a0(bs5 bs5Var, int i2) {
        List list;
        int i3;
        List list2;
        ?? arrayList;
        String str;
        Object next;
        List list3;
        bs5Var.getClass();
        List list4 = bs5Var.b;
        List list5 = bs5Var.E;
        if (list4 == null) {
            list4 = iun.f15405a;
        }
        List list6 = list4;
        Integer num = bs5Var.f3111a;
        int iIntValue = num != null ? num.intValue() : 0;
        Integer num2 = bs5Var.v;
        int iIntValue2 = num2 != null ? num2.intValue() : 0;
        String str2 = bs5Var.d;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = bs5Var.z;
        if (str3 == null) {
            str3 = "";
        }
        String strY = Y(bs5Var.f, bs5Var.e);
        String strY2 = Y(bs5Var.h, bs5Var.g);
        String strY3 = Y(bs5Var.n, bs5Var.m);
        String strY4 = Y(bs5Var.p, bs5Var.o);
        String strY5 = Y(bs5Var.j, bs5Var.i);
        String strY6 = Y(bs5Var.l, bs5Var.k);
        Boolean bool = bs5Var.r;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        Integer num3 = bs5Var.x;
        int iIntValue3 = num3 != null ? num3.intValue() : 0;
        bj5 bj5Var = oo5.b;
        String str4 = str2;
        Integer num4 = bs5Var.w;
        bj5Var.getClass();
        oo5 oo5VarC = bj5.c(num4);
        if (oo5VarC == null) {
            oo5VarC = oo5.ACTION_INFO;
        }
        oo5 oo5Var = oo5VarC;
        String str5 = bs5Var.C;
        String str6 = str5 == null ? "" : str5;
        String str7 = bs5Var.s;
        String str8 = str7 == null ? "" : str7;
        String str9 = bs5Var.D;
        String str10 = str9 == null ? "" : str9;
        List list7 = bs5Var.A;
        if (list7 == null) {
            list7 = iun.f15405a;
        }
        List list8 = list7;
        String str11 = null;
        if (list5 != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list5) {
                List list9 = list5;
                int i4 = iIntValue3;
                Integer num5 = ((efo0) obj).f7728a;
                if (num5 == null) {
                    list3 = list6;
                } else {
                    list3 = list6;
                    if (num5.intValue() != 6) {
                    }
                    list5 = list9;
                    iIntValue3 = i4;
                    list6 = list3;
                }
                arrayList2.add(obj);
                list5 = list9;
                iIntValue3 = i4;
                list6 = list3;
            }
            list = list5;
            i3 = iIntValue3;
            list2 = list6;
            arrayList = new ArrayList(r3d.q(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                efo0 efo0Var = (efo0) it.next();
                kl5 kl5Var = rs5.f31016a;
                Iterator it2 = it;
                Integer num6 = efo0Var.f7728a;
                int iIntValue4 = num6 != null ? num6.intValue() : 0;
                kl5Var.getClass();
                rs5 rs5Var = rs5.c;
                if (iIntValue4 != 0) {
                    rs5 rs5Var2 = rs5.d;
                    if (iIntValue4 == 1) {
                        rs5Var = rs5Var2;
                    } else {
                        rs5Var2 = rs5.e;
                        if (iIntValue4 == 2) {
                            rs5Var = rs5Var2;
                        } else {
                            rs5Var2 = rs5.f;
                            if (iIntValue4 == 3) {
                                rs5Var = rs5Var2;
                            } else {
                                rs5Var2 = rs5.g;
                                if (iIntValue4 == 4) {
                                    rs5Var = rs5Var2;
                                } else {
                                    rs5Var2 = rs5.h;
                                    if (iIntValue4 == 5) {
                                        rs5Var = rs5Var2;
                                    } else {
                                        rs5Var2 = rs5.i;
                                        if (iIntValue4 == 8) {
                                            rs5Var = rs5Var2;
                                        } else {
                                            rs5Var2 = rs5.j;
                                            if (iIntValue4 == 9) {
                                                rs5Var = rs5Var2;
                                            } else {
                                                rs5Var2 = rs5.k;
                                                if (iIntValue4 == 999) {
                                                    rs5Var = rs5Var2;
                                                } else {
                                                    rs5Var = rs5.b;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                String str12 = efo0Var.b;
                if (str12 == null) {
                    str12 = "";
                }
                arrayList.add(new Pair(rs5Var, str12));
                it = it2;
            }
        } else {
            list = list5;
            i3 = iIntValue3;
            list2 = list6;
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = iun.f15405a;
        }
        Integer num7 = bs5Var.y;
        int iIntValue5 = num7 != null ? num7.intValue() : 0;
        String str13 = bs5Var.F;
        String str14 = str13 == null ? "" : str13;
        String str15 = bs5Var.G;
        if (str15 == null) {
            str15 = "";
        }
        if (list != null) {
            Iterator it3 = list.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    str = str15;
                    next = null;
                    break;
                }
                next = it3.next();
                str = str15;
                Integer num8 = ((efo0) next).f7728a;
                if (num8 != null && num8.intValue() == 6) {
                    break;
                }
                it3 = it3;
                str15 = str;
            }
            efo0 efo0Var2 = (efo0) next;
            if (efo0Var2 != null) {
                str11 = efo0Var2.b;
            }
        } else {
            str = str15;
        }
        return new kr5(list2, iIntValue, iIntValue2, str4, str3, strY, strY2, strY3, strY4, strY5, strY6, zBooleanValue, i3, oo5Var, str6, str8, str10, "", list8, arrayList, iIntValue5, str14, str, i2, str11 != null ? str11 : "", "", "");
    }

    public static final void b(int i2, fet fetVar, mm40 mm40Var, String str, boolean z) {
        String str2;
        fet fetVar2;
        mm40 mm40Var2;
        fetVar.g0(1950884754);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            str2 = str;
            i3 |= fetVar.g(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.h(z) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            int length = str2.length();
            jm40 jm40Var = jm40.b;
            if (length <= 0 || !z) {
                fetVar2 = fetVar;
                fetVar2.e0(-689393872);
                fetVar2.r(false);
            } else {
                fetVar.e0(-689585297);
                v8q0.a(str2, o7k0.d(jm40Var, 1.0f), 0L, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, ibm0.n(new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar), fetVar, (i3 >> 3) & 14, 0, 130044);
                fetVar2 = fetVar;
                fetVar2.r(false);
            }
            mm40Var2 = jm40Var;
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zw(mm40Var2, str, z, i2, (byte) 0);
        }
    }

    public static final eja b0(dja djaVar, ctf0 ctf0Var, int i2, int i3, boolean z) {
        String strA;
        long secondary;
        wui0 wui0Var;
        djaVar.getClass();
        ctf0Var.getClass();
        switch (djaVar) {
            case PENALTY:
            case COMMON:
            case BROADCASTING:
                strA = "";
                break;
            case PERIODS:
                strA = ctf0Var.b.a(R.string.cards_info_periods, Arrays.copyOf(new Object[0], 0));
                break;
            case BROADCASTING_VIDEO:
                strA = ctf0Var.b.a(R.string.cards_info_broadcasting_video, Arrays.copyOf(new Object[0], 0));
                break;
            case BROADCASTING_ZONE:
                strA = ctf0Var.b.a(R.string.cards_info_play_zone, Arrays.copyOf(new Object[0], 0));
                break;
            case HOSTS_AND_GUESTS:
                strA = ctf0Var.b.a(R.string.cards_info_hosts_and_guests, Arrays.copyOf(new Object[0], 0));
                break;
            case LAST_GAMES:
                strA = ctf0Var.b.a(R.string.cards_info_last_games, Arrays.copyOf(new Object[0], 0));
                break;
            case SHORT_STATISTIC:
                strA = ctf0Var.b.a(R.string.cards_info_short_statistic, Arrays.copyOf(new Object[0], 0));
                break;
            case LIVE_EVENTS:
                strA = ctf0Var.b.a(R.string.cards_info_live_events, Arrays.copyOf(new Object[0], 0));
                break;
            case ACTIVE_ZONES:
                strA = ctf0Var.b.a(R.string.cards_info_active_zones, Arrays.copyOf(new Object[0], 0));
                break;
            case STADIUM:
                strA = ctf0Var.b.a(R.string.cards_info_stadium, Arrays.copyOf(new Object[0], 0));
                break;
            case WEATHER:
                strA = ctf0Var.b.a(R.string.cards_info_weather, Arrays.copyOf(new Object[0], 0));
                break;
            case STADIUM_WEATHER:
                strA = ctf0Var.b.a(R.string.cards_info_stadium_weather, Arrays.copyOf(new Object[0], 0));
                break;
            default:
                t9f.b();
                return null;
        }
        if (z) {
            pz40 pz40Var = s6t0.f31722a;
            secondary = s6t0.b().f33626a.getTextPrimary();
        } else {
            pz40 pz40Var2 = s6t0.f31722a;
            secondary = s6t0.b().f33626a.getSecondary();
        }
        tui0 tui0Var = new tui0(strA, new y3d(secondary));
        ivi0 ivi0Var = new ivi0();
        if (i3 == 1) {
            wui0Var = wui0.f39793a;
        } else if (i2 == 0) {
            wui0Var = wui0.b;
        } else {
            wui0Var = i2 == i3 - 1 ? wui0.d : wui0.c;
        }
        return new eja(djaVar, new rqm((vui0) tui0Var, (pui0) null, (pvi0) ivi0Var, (d4d) null, (tvi0) null, wui0Var, false, (e900) null, 442));
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:103:0x01de  */
    /* JADX WARN: Code duplicated, block: B:76:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:77:0x00de  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:89:0x0102  */
    /* JADX WARN: Code duplicated, block: B:92:0x0119  */
    /* JADX WARN: Code duplicated, block: B:93:0x0130  */
    /* JADX WARN: Code duplicated, block: B:95:0x0134  */
    /* JADX WARN: Code duplicated, block: B:96:0x0174  */
    /* JADX WARN: Code duplicated, block: B:98:0x017b  */
    /* JADX WARN: Code duplicated, block: B:99:0x01b6  */
    public static final void c(mm40 mm40Var, bdz bdzVar, bzl bzlVar, ol2 ol2Var, float f2, Function1 function1, fet fetVar, int i2, int i3) {
        mm40 mm40Var2;
        int i4;
        float f3;
        mm40 mm40Var3;
        mm40 mm40Var4;
        float f4;
        int i5;
        boolean z;
        Object objP;
        boolean z2;
        Object objP2;
        ode odeVar;
        float f5;
        mm40 mm40Var5;
        float f6;
        mm40 mm40Var6;
        fet fetVar2 = fetVar;
        bdzVar.getClass();
        function1.getClass();
        fetVar2.g0(-153145567);
        int i6 = i3 & 1;
        if (i6 != 0) {
            i4 = i2 | 6;
            mm40Var2 = mm40Var;
        } else if ((i2 & 6) == 0) {
            mm40Var2 = mm40Var;
            i4 = (fetVar2.g(mm40Var2) ? 4 : 2) | i2;
        } else {
            mm40Var2 = mm40Var;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= fetVar2.g(bdzVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= fetVar2.g(bzlVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= fetVar2.g(ol2Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            if ((i3 & 16) == 0) {
                f3 = f2;
                int i7 = fetVar2.d(f3) ? 16384 : 8192;
                i4 |= i7;
            } else {
                f3 = f2;
            }
            i4 |= i7;
        } else {
            f3 = f2;
        }
        if ((196608 & i2) == 0) {
            i4 |= fetVar2.i(function1) ? 131072 : 65536;
        }
        byte b2 = 1;
        if (fetVar2.U(i4 & 1, (74899 & i4) != 74898)) {
            fetVar2.Z();
            if ((i2 & 1) == 0 || fetVar2.B()) {
                mm40Var4 = i6 != 0 ? jm40.b : mm40Var2;
                if ((i3 & 16) != 0) {
                    zcl zclVar = qmk.f28987a;
                    i4 &= -57345;
                    f4 = 8.0f;
                }
                fetVar2.s();
                i5 = 458752 & i4;
                if (i5 == 131072) {
                    z = true;
                } else {
                    z = false;
                }
                objP = fetVar2.P();
                cl5 cl5Var = ukd.f35823a;
                if (z || objP == cl5Var) {
                    objP = new ja2(function1, (byte) 29);
                    fetVar2.o0(objP);
                }
                Function0 function0 = (Function0) objP;
                if (i5 == 131072) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objP2 = fetVar2.P();
                if (z2 || objP2 == cl5Var) {
                    objP2 = new zk2(function1, b2);
                    fetVar2.o0(objP2);
                }
                v3c.z(function0, (Function0) objP2, null, fetVar2, 0, 4);
                odeVar = ol2Var.b;
                if (odeVar instanceof yce) {
                    fetVar2.e0(-1103772481);
                    s(null, (yce) odeVar, function1, fetVar2, (i4 >> 9) & 896);
                    fetVar2.r(false);
                    mm40Var6 = mm40Var4;
                    f6 = f4;
                } else if (odeVar instanceof dde) {
                    fetVar2.e0(-1103587349);
                    dde ddeVar = (dde) odeVar;
                    int i8 = i4 << 3;
                    mm40Var6 = mm40Var4;
                    float f7 = f4;
                    w(mm40Var6, f7, bdzVar, bzlVar, ddeVar.f5893a, ddeVar.b, false, ol2Var.c, ol2Var.d, ddeVar.c, function1, fetVar2, (i4 & 14) | 1572864 | ((i4 >> 9) & 112) | (i8 & 896) | (i8 & 7168), (i4 >> 15) & 14);
                    fetVar2 = fetVar2;
                    fetVar2.r(false);
                    f6 = f7;
                } else {
                    f5 = f4;
                    mm40Var5 = mm40Var4;
                    if (odeVar instanceof ide) {
                        fetVar2.e0(-1102971007);
                        int i9 = i4 << 3;
                        mm40Var6 = mm40Var5;
                        w(mm40Var6, f5, bdzVar, bzlVar, ((ide) odeVar).f14580a, false, true, ol2Var.c, ol2Var.d, false, function1, fetVar2, (i4 & 14) | 806879232 | ((i4 >> 9) & 112) | (i9 & 896) | (i9 & 7168), (i4 >> 15) & 14);
                        f6 = f5;
                        fetVar2 = fetVar2;
                        fetVar2.r(false);
                    } else {
                        f6 = f5;
                        if (odeVar instanceof uce) {
                            throw b1j.f(-1143984298, fetVar2, false);
                        }
                        fetVar2.e0(-1102386719);
                        mm40Var6 = mm40Var5;
                        p(mm40Var6, bdzVar, bzlVar, ol2Var.c, (uce) odeVar, function1, fetVar, i4 & 459774);
                        fetVar2 = fetVar;
                        fetVar2.r(false);
                    }
                }
                mm40Var3 = mm40Var6;
                f3 = f6;
            } else {
                fetVar2.X();
                if ((i3 & 16) != 0) {
                    i4 &= -57345;
                }
                mm40Var4 = mm40Var2;
            }
            f4 = f3;
            fetVar2.s();
            i5 = 458752 & i4;
            if (i5 == 131072) {
                z = true;
            } else {
                z = false;
            }
            objP = fetVar2.P();
            cl5 cl5Var2 = ukd.f35823a;
            if (z) {
                objP = new ja2(function1, (byte) 29);
                fetVar2.o0(objP);
            } else {
                objP = new ja2(function1, (byte) 29);
                fetVar2.o0(objP);
            }
            Function0 function2 = (Function0) objP;
            if (i5 == 131072) {
                z2 = true;
            } else {
                z2 = false;
            }
            objP2 = fetVar2.P();
            if (z2) {
                objP2 = new zk2(function1, b2);
                fetVar2.o0(objP2);
            } else {
                objP2 = new zk2(function1, b2);
                fetVar2.o0(objP2);
            }
            v3c.z(function2, (Function0) objP2, null, fetVar2, 0, 4);
            odeVar = ol2Var.b;
            if (odeVar instanceof yce) {
                fetVar2.e0(-1103772481);
                s(null, (yce) odeVar, function1, fetVar2, (i4 >> 9) & 896);
                fetVar2.r(false);
                mm40Var6 = mm40Var4;
                f6 = f4;
            } else if (odeVar instanceof dde) {
                fetVar2.e0(-1103587349);
                dde ddeVar2 = (dde) odeVar;
                int i10 = i4 << 3;
                mm40Var6 = mm40Var4;
                float f8 = f4;
                w(mm40Var6, f8, bdzVar, bzlVar, ddeVar2.f5893a, ddeVar2.b, false, ol2Var.c, ol2Var.d, ddeVar2.c, function1, fetVar2, (i4 & 14) | 1572864 | ((i4 >> 9) & 112) | (i10 & 896) | (i10 & 7168), (i4 >> 15) & 14);
                fetVar2 = fetVar2;
                fetVar2.r(false);
                f6 = f8;
            } else {
                f5 = f4;
                mm40Var5 = mm40Var4;
                if (odeVar instanceof ide) {
                    fetVar2.e0(-1102971007);
                    int i11 = i4 << 3;
                    mm40Var6 = mm40Var5;
                    w(mm40Var6, f5, bdzVar, bzlVar, ((ide) odeVar).f14580a, false, true, ol2Var.c, ol2Var.d, false, function1, fetVar2, (i4 & 14) | 806879232 | ((i4 >> 9) & 112) | (i11 & 896) | (i11 & 7168), (i4 >> 15) & 14);
                    f6 = f5;
                    fetVar2 = fetVar2;
                    fetVar2.r(false);
                } else {
                    f6 = f5;
                    if (odeVar instanceof uce) {
                        throw b1j.f(-1143984298, fetVar2, false);
                    }
                    fetVar2.e0(-1102386719);
                    mm40Var6 = mm40Var5;
                    p(mm40Var6, bdzVar, bzlVar, ol2Var.c, (uce) odeVar, function1, fetVar, i4 & 459774);
                    fetVar2 = fetVar;
                    fetVar2.r(false);
                }
            }
            mm40Var3 = mm40Var6;
            f3 = f6;
        } else {
            fetVar2.X();
            mm40Var3 = mm40Var2;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new qt0(mm40Var3, bdzVar, bzlVar, (Object) ol2Var, f3, function1, i2, i3, (byte) 2);
        }
    }

    public static final void d(String str, String str2, fet fetVar, int i2) {
        fetVar.g0(-1908976733);
        int i3 = (fetVar.g(str) ? 4 : 2) | i2 | (fetVar.g(str2) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(587077731, new hw6(str, str2, (byte) 25), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hw6((byte) 26, i2, str, str2);
        }
    }

    public static final void e(mm40 mm40Var, ao4 ao4Var, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        long background;
        long primary;
        ao4Var.getClass();
        int i3 = ao4Var.b;
        function1.getClass();
        fetVar.g0(-1745489444);
        int i4 = i2 | 6 | (fetVar.g(ao4Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i4 & 1, (i4 & 147) != 146)) {
            String str = ao4Var.d;
            boolean z = ao4Var.c;
            zfn zfnVar = zaq0.b;
            uui0 uui0Var = new uui0(str, new y3d(((ThemeColors) fetVar.k(zfnVar)).getTextPrimary()), ao4Var.f, null, null, 56);
            if (z) {
                fetVar.e0(-706245123);
                background = ((ThemeColors) fetVar.k(zfnVar)).getPrimary();
                fetVar.r(false);
            } else {
                fetVar.e0(-706166662);
                background = ((ThemeColors) fetVar.k(zfnVar)).getBackground();
                fetVar.r(false);
            }
            pc5 pc5Var = new pc5(new y3d(background));
            if (z) {
                fetVar.e0(-706008159);
                primary = ((StaticColors) fetVar.k(m8m0.f21378a)).m123getWhite0d7_KjU();
                fetVar.r(false);
            } else {
                fetVar.e0(-705933883);
                primary = ((ThemeColors) fetVar.k(zfnVar)).getPrimary();
                fetVar.r(false);
            }
            rqm rqmVar = new rqm((vui0) uui0Var, (pui0) new nui0(Integer.valueOf(i3), null, new m0x(i3, null, 6), new y3d(primary), null, pc5Var, 0.0f, 210), (pvi0) new dvi0(new m0x(R.drawable.ic_glyph_cancel, null, 6), new y3d(((ThemeColors) fetVar.k(zfnVar)).getPrimary()), 0), (d4d) null, (tvi0) null, ao4Var.e, false, (e900) null, 440);
            boolean z2 = ((i4 & 896) == 256) | ((i4 & 112) == 32);
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new gj4(function1, ao4Var, (byte) 3);
                fetVar.o0(objP);
            }
            jm40 jm40Var = jm40.b;
            obc.q(jm40Var, rqmVar, false, null, null, null, (Function0) objP, null, fetVar, 6, 188);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ry2((Object) mm40Var2, (Object) ao4Var, (Object) function1, i2, (byte) 11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r11v1, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v2, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r11v4, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v5 */
    public static final void f(mm40 mm40Var, nui0 nui0Var, long j2, fet fetVar, int i2) {
        ?? r11;
        ?? r1;
        jm40 jm40Var;
        y3d y3dVar;
        int i3;
        String str;
        ?? r12;
        m78 m78Var;
        oil oilVar;
        m78 m78Var2;
        Object obj;
        oil oilVarT;
        long background;
        ?? r13 = fetVar;
        r13.g0(-188628840);
        int i4 = i2 | (r13.g(mm40Var) ? 4 : 2) | (r13.g(nui0Var) ? 32 : 16) | (r13.f(j2) ? 256 : 128);
        ?? r8 = 0;
        if (r13.U(i4 & 1, (i4 & 147) != 146)) {
            r13.e0(-883680914);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = o7k0.n(mm40Var, 40.0f);
            rc5 rc5Var = nui0Var.f;
            y3d y3dVar2 = nui0Var.e;
            float f2 = nui0Var.g;
            if (rc5Var instanceof pc5) {
                r13.e0(-1032855645);
                y3d y3dVar3 = ((pc5) rc5Var).f26741a;
                if (y3dVar3 == null) {
                    r13.e0(-1003145955);
                    background = ((ThemeColors) r13.k(zaq0.b)).getBackground();
                    r13.r(false);
                } else {
                    r13.e0(-1003147319);
                    r13.r(false);
                    background = y3dVar3.f41946a;
                }
                mm40VarN = i120.Q(mm40VarN, background, vgg0.a(f2));
                r13.r(false);
            } else {
                r13.e0(-1003141737);
                r13.r(false);
            }
            r13.r(false);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(r13.T);
            bh90 bh90VarM = r13.m();
            mm40 mm40VarC0 = kbc.c0(r13, mm40VarN);
            mkd.c0.getClass();
            r13.i0();
            if (r13.S) {
                r13.l(e7z.u1);
            } else {
                r13.r0();
            }
            jpm0.o(r13, tj30VarC, gqw0.x);
            jpm0.o(r13, bh90VarM, gqw0.w);
            jpm0.o(r13, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(r13);
            jpm0.o(r13, mm40VarC0, gqw0.v);
            qc5 qc5Var = rc5Var instanceof qc5 ? (qc5) rc5Var : null;
            jm40 jm40Var2 = jm40.b;
            if (qc5Var != null) {
                r13.e0(-1763836720);
                Integer num = qc5Var.f28470a;
                if (num == null) {
                    r13.e0(-1763788857);
                    r13.r(false);
                    oilVarT = null;
                    obj = null;
                } else {
                    r13.e0(-1763788856);
                    int iIntValue = num.intValue();
                    y3d y3dVar4 = qc5Var.c;
                    if (y3dVar4 != null) {
                        m78Var2 = new m78(y3dVar4.f41946a, 5);
                        r8 = 0;
                    } else {
                        m78Var2 = null;
                    }
                    obj = null;
                    oilVarT = ju70.T(a8k0.F(iIntValue, r8, r13), m78Var2, null, 10);
                    r13.r(r8);
                }
                oil oilVar2 = oilVarT;
                oil oilVar3 = oilVarT;
                i3 = 5;
                str = "SETTING_CELL_LEFT_IMAGE";
                r1 = 0;
                jm40Var = jm40Var2;
                y3dVar = y3dVar2;
                k7x.b(qc5Var.b.a(), null, o2e.e0(lgb.J(o7k0.n(jm40Var2, 40.0f), vgg0.a(f2)), "SETTING_CELL_LEFT_IMAGE"), oilVar3, oilVar2, null, null, null, null, null, gqw0.h1, null, fetVar, 36912, 6, 31712);
                fet fetVar2 = fetVar;
                fetVar2.r(false);
                r12 = fetVar2;
            } else {
                r1 = 0;
                jm40Var = jm40Var2;
                y3dVar = y3dVar2;
                i3 = 5;
                str = "SETTING_CELL_LEFT_IMAGE";
                r13.e0(-1762925692);
                r13.r(false);
                r12 = r13;
            }
            if (qc5Var != null) {
                m78Var = new m78(j2, i3);
            } else {
                y3d y3dVar5 = nui0Var.d;
                m78Var = y3dVar5 != null ? new m78(y3dVar5.f41946a, i3) : null;
            }
            Integer num2 = nui0Var.f24149a;
            if (num2 == null || num2.intValue() == 0) {
                r12.e0(-1762266136);
                r12.r(r1);
                oilVar = null;
            } else {
                r12.e0(-1762569254);
                y3d y3dVar6 = nui0Var.b;
                oil oilVarT2 = ju70.T(a8k0.F(num2.intValue(), r1, r12), y3dVar6 != null ? new m78(y3dVar6.f41946a, i3) : null, null, 10);
                r12.r(r1);
                oilVar = oilVarT2;
            }
            mm40 mm40VarN2 = o7k0.n(jm40Var, 24.0f);
            ?? r9 = (i4 & 112) == 32 ? 1 : r1;
            Object objP = r12.P();
            if (r9 != 0 || objP == ukd.f35823a) {
                objP = new rai0(nui0Var, (byte) 8);
                r12.o0(objP);
            }
            k7x.b(nui0Var.c.a(), null, o2e.e0(pai0.a(mm40VarN2, r1, (Function1) objP), str), oilVar, oilVar, null, null, null, null, null, gqw0.A, m78Var, fetVar, 36912, 6, 27616);
            ?? r14 = fetVar;
            if (y3dVar != null) {
                r14.e0(-1761552206);
                v(o7k0.c, y3dVar.f41946a, nui0Var.g, r14, 6);
                r14.r(r1);
            } else {
                r14.e0(-1761350396);
                r14.r(r1);
            }
            r14.e0(-1761314716);
            r14.r(r1);
            r14.r(true);
            r11 = r14;
        } else {
            r13.X();
            r11 = r13;
        }
        yfe0 yfe0VarU = r11.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new my2((byte) 9, i2, j2, mm40Var, (Object) nui0Var);
        }
    }

    public static final void g(mm40 mm40Var, uf5 uf5Var, fet fetVar, int i2) {
        fetVar.g0(518068145);
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2 | (fetVar.g(uf5Var) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = o7k0.n(mm40Var, 18.0f);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
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
            thb.f(null, uf5Var, fetVar, i3 & 112, 1);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kqh0((Object) mm40Var, (Object) uf5Var, i2, (byte) 8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0043  */
    /* JADX WARN: Code duplicated, block: B:26:0x0046  */
    /* JADX WARN: Code duplicated, block: B:30:0x004d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0052  */
    /* JADX WARN: Code duplicated, block: B:34:0x0056  */
    /* JADX WARN: Code duplicated, block: B:36:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0061  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x006e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0077  */
    /* JADX WARN: Code duplicated, block: B:47:0x007a  */
    /* JADX WARN: Code duplicated, block: B:49:0x007d  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:53:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:56:0x00de  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:60:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:61:0x0105  */
    /* JADX WARN: Code duplicated, block: B:63:0x0119  */
    /* JADX WARN: Code duplicated, block: B:65:0x0123  */
    /* JADX WARN: Code duplicated, block: B:68:0x013b  */
    /* JADX WARN: Code duplicated, block: B:71:0x0145  */
    /* JADX WARN: Code duplicated, block: B:73:? A[RETURN, SYNTHETIC] */
    public static final void h(xdr xdrVar, xdr xdrVar2, xdr xdrVar3, fet fetVar, int i2, int i3) {
        int i4;
        xdr xdrVar4;
        int i5;
        xdr xdrVar5;
        int i6;
        boolean z;
        xdr xdrVar6;
        xdr xdrVar7;
        yfe0 yfe0VarU;
        y5d y5dVar;
        int i7;
        fetVar.g0(2054173400);
        int i8 = i2 & 6;
        jm40 jm40Var = jm40.b;
        if (i8 == 0) {
            i4 = (fetVar.g(jm40Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i9 = i3 & 2;
        if (i9 == 0) {
            if ((i2 & 48) == 0) {
                xdrVar4 = xdrVar;
                i4 |= fetVar.i(xdrVar4) ? 32 : 16;
            }
            if ((i2 & 384) == 0) {
                if (fetVar.i(xdrVar2)) {
                    i7 = 256;
                } else {
                    i7 = 128;
                }
                i4 |= i7;
            }
            i5 = i3 & 8;
            if (i5 != 0) {
                if ((i2 & 3072) == 0) {
                    xdrVar5 = xdrVar3;
                    if (fetVar.i(xdrVar5)) {
                        i6 = 2048;
                    } else {
                        i6 = 1024;
                    }
                    i4 |= i6;
                }
                if ((i4 & 1171) != 1170) {
                    z = true;
                } else {
                    z = false;
                }
                if (fetVar.U(i4 & 1, z)) {
                    if (i9 != 0) {
                        xdrVar4 = null;
                    }
                    if (i5 != 0) {
                        xdrVar5 = null;
                    }
                    mm40 mm40VarW = o7k0.w(jm40Var, null, false, 3);
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarN = s5x0.N(mm40VarW, 16.0f, 20.0f, 16.0f, 0.0f, 8);
                    x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
                    jpm0.o(fetVar, x5dVarA, gqw0.x);
                    jpm0.o(fetVar, bh90VarM, gqw0.w);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC0, gqw0.v);
                    y5dVar = y5d.f42040a;
                    if (xdrVar4 == null) {
                        fetVar.e0(2119145267);
                    } else {
                        fetVar.e0(1453832846);
                        xdrVar4.F(y5dVar, fetVar, Integer.valueOf((i4 & 112) | 6));
                    }
                    fetVar.r(false);
                    if (xdrVar2 == null) {
                        fetVar.e0(2119185505);
                        fetVar.r(false);
                    } else {
                        fetVar.e0(2119185506);
                        xdrVar2.F(y5dVar, fetVar, 6);
                        rz4.t(jm40Var, 6.0f, fetVar, false);
                    }
                    if (xdrVar5 == null) {
                        fetVar.e0(2119331763);
                    } else {
                        fetVar.e0(1453838862);
                        xdrVar5.F(y5dVar, fetVar, Integer.valueOf(((i4 >> 6) & 112) | 6));
                    }
                    fetVar.r(false);
                    fetVar.r(true);
                } else {
                    fetVar.X();
                }
                xdrVar6 = xdrVar4;
                xdrVar7 = xdrVar5;
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new z23(xdrVar6, xdrVar2, xdrVar7, i2, i3);
                }
            }
            i4 |= 3072;
            xdrVar5 = xdrVar3;
            if ((i4 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar.U(i4 & 1, z)) {
                if (i9 != 0) {
                    xdrVar4 = null;
                }
                if (i5 != 0) {
                    xdrVar5 = null;
                }
                mm40 mm40VarW2 = o7k0.w(jm40Var, null, false, 3);
                zcl zclVar2 = qmk.f28987a;
                mm40 mm40VarN2 = s5x0.N(mm40VarW2, 16.0f, 20.0f, 16.0f, 0.0f, 8);
                x5d x5dVarA2 = w5d.a(uc9.c, gqw0.m, fetVar, 0);
                int iHashCode2 = Long.hashCode(fetVar.T);
                bh90 bh90VarM2 = fetVar.m();
                mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarN2);
                mkd.c0.getClass();
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(e7z.u1);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, x5dVarA2, gqw0.x);
                jpm0.o(fetVar, bh90VarM2, gqw0.w);
                jpm0.o(fetVar, Integer.valueOf(iHashCode2), gqw0.y);
                jpm0.n(fetVar);
                jpm0.o(fetVar, mm40VarC1, gqw0.v);
                y5dVar = y5d.f42040a;
                if (xdrVar4 == null) {
                    fetVar.e0(2119145267);
                } else {
                    fetVar.e0(1453832846);
                    xdrVar4.F(y5dVar, fetVar, Integer.valueOf((i4 & 112) | 6));
                }
                fetVar.r(false);
                if (xdrVar2 == null) {
                    fetVar.e0(2119185505);
                    fetVar.r(false);
                } else {
                    fetVar.e0(2119185506);
                    xdrVar2.F(y5dVar, fetVar, 6);
                    rz4.t(jm40Var, 6.0f, fetVar, false);
                }
                if (xdrVar5 == null) {
                    fetVar.e0(2119331763);
                } else {
                    fetVar.e0(1453838862);
                    xdrVar5.F(y5dVar, fetVar, Integer.valueOf(((i4 >> 6) & 112) | 6));
                }
                fetVar.r(false);
                fetVar.r(true);
            } else {
                fetVar.X();
            }
            xdrVar6 = xdrVar4;
            xdrVar7 = xdrVar5;
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new z23(xdrVar6, xdrVar2, xdrVar7, i2, i3);
            }
        }
        i4 |= 48;
        xdrVar4 = xdrVar;
        if ((i2 & 384) == 0) {
            if (fetVar.i(xdrVar2)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i4 |= i7;
        }
        i5 = i3 & 8;
        if (i5 != 0) {
            if ((i2 & 3072) == 0) {
                xdrVar5 = xdrVar3;
                if (fetVar.i(xdrVar5)) {
                    i6 = 2048;
                } else {
                    i6 = 1024;
                }
                i4 |= i6;
            }
            if ((i4 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar.U(i4 & 1, z)) {
                if (i9 != 0) {
                    xdrVar4 = null;
                }
                if (i5 != 0) {
                    xdrVar5 = null;
                }
                mm40 mm40VarW3 = o7k0.w(jm40Var, null, false, 3);
                zcl zclVar3 = qmk.f28987a;
                mm40 mm40VarN3 = s5x0.N(mm40VarW3, 16.0f, 20.0f, 16.0f, 0.0f, 8);
                x5d x5dVarA3 = w5d.a(uc9.c, gqw0.m, fetVar, 0);
                int iHashCode3 = Long.hashCode(fetVar.T);
                bh90 bh90VarM3 = fetVar.m();
                mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarN3);
                mkd.c0.getClass();
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(e7z.u1);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, x5dVarA3, gqw0.x);
                jpm0.o(fetVar, bh90VarM3, gqw0.w);
                jpm0.o(fetVar, Integer.valueOf(iHashCode3), gqw0.y);
                jpm0.n(fetVar);
                jpm0.o(fetVar, mm40VarC2, gqw0.v);
                y5dVar = y5d.f42040a;
                if (xdrVar4 == null) {
                    fetVar.e0(2119145267);
                } else {
                    fetVar.e0(1453832846);
                    xdrVar4.F(y5dVar, fetVar, Integer.valueOf((i4 & 112) | 6));
                }
                fetVar.r(false);
                if (xdrVar2 == null) {
                    fetVar.e0(2119185505);
                    fetVar.r(false);
                } else {
                    fetVar.e0(2119185506);
                    xdrVar2.F(y5dVar, fetVar, 6);
                    rz4.t(jm40Var, 6.0f, fetVar, false);
                }
                if (xdrVar5 == null) {
                    fetVar.e0(2119331763);
                } else {
                    fetVar.e0(1453838862);
                    xdrVar5.F(y5dVar, fetVar, Integer.valueOf(((i4 >> 6) & 112) | 6));
                }
                fetVar.r(false);
                fetVar.r(true);
            } else {
                fetVar.X();
            }
            xdrVar6 = xdrVar4;
            xdrVar7 = xdrVar5;
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new z23(xdrVar6, xdrVar2, xdrVar7, i2, i3);
            }
        }
        i4 |= 3072;
        xdrVar5 = xdrVar3;
        if ((i4 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (fetVar.U(i4 & 1, z)) {
            if (i9 != 0) {
                xdrVar4 = null;
            }
            if (i5 != 0) {
                xdrVar5 = null;
            }
            mm40 mm40VarW4 = o7k0.w(jm40Var, null, false, 3);
            zcl zclVar4 = qmk.f28987a;
            mm40 mm40VarN4 = s5x0.N(mm40VarW4, 16.0f, 20.0f, 16.0f, 0.0f, 8);
            x5d x5dVarA4 = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode4 = Long.hashCode(fetVar.T);
            bh90 bh90VarM4 = fetVar.m();
            mm40 mm40VarC3 = kbc.c0(fetVar, mm40VarN4);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA4, gqw0.x);
            jpm0.o(fetVar, bh90VarM4, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode4), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC3, gqw0.v);
            y5dVar = y5d.f42040a;
            if (xdrVar4 == null) {
                fetVar.e0(2119145267);
            } else {
                fetVar.e0(1453832846);
                xdrVar4.F(y5dVar, fetVar, Integer.valueOf((i4 & 112) | 6));
            }
            fetVar.r(false);
            if (xdrVar2 == null) {
                fetVar.e0(2119185505);
                fetVar.r(false);
            } else {
                fetVar.e0(2119185506);
                xdrVar2.F(y5dVar, fetVar, 6);
                rz4.t(jm40Var, 6.0f, fetVar, false);
            }
            if (xdrVar5 == null) {
                fetVar.e0(2119331763);
            } else {
                fetVar.e0(1453838862);
                xdrVar5.F(y5dVar, fetVar, Integer.valueOf(((i4 >> 6) & 112) | 6));
            }
            fetVar.r(false);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        xdrVar6 = xdrVar4;
        xdrVar7 = xdrVar5;
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new z23(xdrVar6, xdrVar2, xdrVar7, i2, i3);
        }
    }

    public static final void i(int i2, fet fetVar, a4x a4xVar, mm40 mm40Var) {
        byte b2;
        fet fetVar2 = fetVar;
        mm40Var.getClass();
        a4xVar.getClass();
        fetVar2.g0(1341527477);
        int i3 = i2 | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar.g(a4xVar) ? 32 : 16);
        boolean z = false;
        boolean z2 = true;
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarW = o7k0.w(o7k0.d(s5x0.L(mm40Var, 16.0f, 0.0f, 2), 1.0f), null, false, 3);
            pz40 pz40Var = s6t0.f31722a;
            long background = s6t0.b().f33626a.getBackground();
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarJ = s5x0.J(i120.Q(mm40VarW, background, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 8.0f);
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.m, fetVar2, 0);
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
            Iterator itO = h97.o(fetVar2, mm40VarC0, gqw0.v, 221405763, a4xVar);
            while (itO.hasNext()) {
                String str = (String) itO.next();
                boolean zG = fetVar2.g(str);
                Object objP = fetVar2.P();
                if (zG || objP == ukd.f35823a) {
                    objP = "•\t" + str;
                    fetVar2.o0(objP);
                }
                pz40 pz40Var2 = s6t0.f31722a;
                v8q0.a((String) objP, jm40.b, s6t0.b().f33626a.getSecondary(), null, 0L, null, null, null, 0L, new f2q0(5), 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar, 48, 0, 130040);
                z = z;
                fetVar2 = fetVar;
                z2 = true;
            }
            fetVar2.r(z);
            b2 = 1;
            fetVar2.r(true);
        } else {
            b2 = 1;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zw1(mm40Var, a4xVar, i2, b2);
        }
    }

    public static final void j(mm40 mm40Var, mdm mdmVar, boolean z, Function0 function0, fet fetVar, int i2, int i3) {
        int i4;
        fetVar.g0(1919765693);
        if ((i2 & 6) == 0) {
            i4 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= fetVar.g(mdmVar) ? 32 : 16;
        }
        int i5 = i3 & 8;
        if (i5 != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i4 |= fetVar.i(function0) ? 2048 : 1024;
        }
        if (fetVar.U(i4 & 1, (i4 & 1043) != 1042)) {
            if (i5 != 0) {
                Object objP = fetVar.P();
                if (objP == ukd.f35823a) {
                    objP = new ej8((byte) 3);
                    fetVar.o0(objP);
                }
                function0 = (Function0) objP;
            }
            Function0 function1 = function0;
            mm40 mm40VarE = tfx.E(mm40Var.e(o7k0.c));
            tj30 tj30VarC = zq8.c(gqw0.e, false);
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
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            jcb.l(null, mdmVar, false, function1, fetVar, i4 & 7280, 5);
            fetVar.r(true);
            function0 = function1;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ut8(mm40Var, mdmVar, z, function0, i2, i3, (byte) 0);
        }
    }

    public static final void k(mm40 mm40Var, ey8 ey8Var, d9z d9zVar, boolean z, Function1 function1, fet fetVar, int i2) {
        jm40 jm40Var;
        float f2;
        float f3;
        av8 av8Var;
        float f4;
        boolean z2;
        boolean z3;
        ch80 ch80VarF;
        Object objA;
        fet fetVar2 = fetVar;
        hyl hylVar = ey8Var.f;
        fetVar2.g0(139686392);
        int i3 = i2 | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(ey8Var) ? 32 : 16) | (fetVar2.g(d9zVar) ? 256 : 128) | (fetVar2.h(z) ? 2048 : 1024) | (fetVar2.i(function1) ? 16384 : 8192);
        byte b2 = 0;
        if (fetVar2.U(i3 & 1, (i3 & 9363) != 9362)) {
            Context context = (Context) fetVar2.k(dy2.b);
            Activity activity = context instanceof Activity ? (Activity) context : null;
            Window window = activity != null ? activity.getWindow() : null;
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zI = fetVar2.i(window) | ((i3 & 7168) == 2048);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (zI || objP == cl5Var) {
                objP = new vt8(window, z, b2);
                fetVar2.o0(objP);
            }
            s0x.d(boolValueOf, null, (Function1) objP, fetVar2, (i3 >> 9) & 14);
            zfn zfnVar = zaq0.b;
            long background = ((ThemeColors) fetVar2.k(zfnVar)).getBackground();
            ljc ljcVar = jd8.n;
            mm40 mm40VarE0 = o2e.e0(i120.Q(mm40Var, background, ljcVar), "BRAND_GAMES_SIMPLE_COLUMN");
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
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
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            imm immVar = ey8Var.c;
            av8 av8Var2 = ey8Var.e;
            int i4 = 57344 & i3;
            boolean z4 = i4 == 16384;
            Object objP2 = fetVar2.P();
            if (z4 || objP2 == cl5Var) {
                objP2 = new tk8(function1, (byte) 18);
                fetVar2.o0(objP2);
            }
            Function0 function0 = (Function0) objP2;
            boolean z5 = i4 == 16384;
            Object objP3 = fetVar2.P();
            if (z5 || objP3 == cl5Var) {
                objP3 = new uo6(function1, (byte) 20);
                fetVar2.o0(objP3);
            }
            Function1 function2 = (Function1) objP3;
            boolean z6 = i4 == 16384;
            Object objP4 = fetVar2.P();
            if (z6 || objP4 == cl5Var) {
                objP4 = new uo6(function1, (byte) 21);
                fetVar2.o0(objP4);
            }
            Function1 function3 = (Function1) objP4;
            boolean z7 = i4 == 16384;
            Object objP5 = fetVar2.P();
            if (z7 || objP5 == cl5Var) {
                objP5 = new tk8(function1, (byte) 11);
                fetVar2.o0(objP5);
            }
            hlm.c(null, immVar, null, function0, null, function2, function3, null, (Function0) objP5, null, null, null, fetVar, 0, 0, 3733);
            vu8 vu8Var = ey8Var.d;
            if (vu8Var != null) {
                boolean z8 = vu8Var instanceof tu8;
                jm40 jm40Var2 = jm40.b;
                if (z8) {
                    fetVar.e0(-635512087);
                    tu8 tu8Var = (tu8) vu8Var;
                    ijl ijlVar = tu8Var.b;
                    jjl jjlVar = tu8Var.f34538a;
                    boolean z9 = i4 == 16384;
                    Object objP6 = fetVar.P();
                    if (z9 || objP6 == cl5Var) {
                        objP6 = new tk8(function1, (byte) 12);
                        fetVar.o0(objP6);
                    }
                    Function0 function4 = (Function0) objP6;
                    boolean z10 = i4 == 16384;
                    Object objP7 = fetVar.P();
                    if (z10 || objP7 == cl5Var) {
                        objP7 = new tk8(function1, (byte) 13);
                        fetVar.o0(objP7);
                    }
                    Function0 function5 = (Function0) objP7;
                    boolean z11 = i4 == 16384;
                    Object objP8 = fetVar.P();
                    if (z11 || objP8 == cl5Var) {
                        objP8 = new tk8(function1, (byte) 14);
                        fetVar.o0(objP8);
                    }
                    f3 = 1.0f;
                    jm40Var = jm40Var2;
                    feb.k(ijlVar, jjlVar, null, function4, function5, (Function0) objP8, fetVar, 0, 4);
                    fetVar.r(false);
                    f2 = 8.0f;
                } else if (vu8Var instanceof uu8) {
                    fetVar.e0(-634799614);
                    mm40 mm40VarQ = i120.Q(o7k0.d(jm40Var2, 1.0f), ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), ljcVar);
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarK = s5x0.K(mm40VarQ, 12.0f, 8.0f);
                    uu8 uu8Var = (uu8) vu8Var;
                    String str = uu8Var.f36287a;
                    String str2 = uu8Var.b;
                    boolean z12 = i4 == 16384;
                    Object objP9 = fetVar.P();
                    if (z12 || objP9 == cl5Var) {
                        objP9 = new tk8(function1, (byte) 10);
                        fetVar.o0(objP9);
                    }
                    Function0 function6 = (Function0) objP9;
                    boolean z13 = i4 == 16384;
                    Object objP10 = fetVar.P();
                    if (z13 || objP10 == cl5Var) {
                        objP10 = new tk8(function1, (byte) 15);
                        fetVar.o0(objP10);
                    }
                    jm40Var = jm40Var2;
                    f2 = 8.0f;
                    f3 = 1.0f;
                    pzb.g(mm40VarK, str, str2, function6, (Function0) objP10, fetVar, 0);
                    fetVar.r(false);
                }
                mbc.o(zfi0.f44303a, null, false, fetVar, 6, 6);
                fetVar2 = fetVar;
                if ((av8Var2 instanceof zu8) || ((!(hylVar instanceof fyl) || ((fyl) hylVar).f10362a.isEmpty()) && !(hylVar instanceof gyl))) {
                    av8Var = av8Var2;
                    f4 = 0.0f;
                    z2 = true;
                    fetVar2.e0(-632246764);
                    fetVar2.r(false);
                } else {
                    fetVar2.e0(-633702679);
                    zcl zclVar2 = qmk.f28987a;
                    float f5 = qmk.a(fetVar2).c;
                    boolean zG = fetVar2.g(hylVar);
                    Object objP11 = fetVar2.P();
                    if (zG || objP11 == cl5Var) {
                        if (hylVar != null) {
                            if (hylVar instanceof fyl) {
                                objP11 = s5x0.t(f5, 0.0f, 2);
                            } else if (hylVar instanceof gyl) {
                                objP11 = new lh80(f5, f2, f5, f2);
                            }
                            fetVar2.o0(objP11);
                        }
                        t9f.b();
                        return;
                    }
                    hh80 hh80Var = (hh80) objP11;
                    boolean zG2 = fetVar2.g(hylVar) | fetVar2.g(hh80Var);
                    Object objP12 = fetVar2.P();
                    if (zG2 || objP12 == cl5Var) {
                        if (hylVar != null) {
                            if (hylVar instanceof fyl) {
                                objA = fyl.a((fyl) hylVar, hh80Var);
                            } else if (hylVar instanceof gyl) {
                                objA = gyl.a((gyl) hylVar, hh80Var);
                            }
                            objP12 = objA;
                            fetVar2.o0(objP12);
                        }
                        t9f.b();
                        return;
                    }
                    hyl hylVar2 = (hyl) objP12;
                    mm40 mm40VarE1 = o2e.e0(s5x0.L(o7k0.d(jm40Var, f3), 0.0f, 4.0f, 1), "DS_CHIPS");
                    boolean z14 = i4 == 16384;
                    Object objP13 = fetVar2.P();
                    if (z14 || objP13 == cl5Var) {
                        objP13 = new uo6(function1, (byte) 22);
                        fetVar2.o0(objP13);
                    }
                    f4 = 0.0f;
                    av8Var = av8Var2;
                    z2 = true;
                    ebc.r(mm40VarE1, hylVar2, null, (Function1) objP13, null, fetVar, 0, 44);
                    fetVar2 = fetVar;
                    fetVar2.r(false);
                }
                if (av8Var != null) {
                    if (av8Var instanceof xu8) {
                        x7z x7zVarF = rz4.f(fetVar2, -632100165, f3, z2);
                        bml bmlVar = ((xu8) av8Var).f41497a;
                        fetVar2.e0(-1128750173);
                        zcl zclVar3 = qmk.f28987a;
                        lh80 lh80Var = new lh80(qmk.a(fetVar2).c, ((!(hylVar instanceof fyl) || ((fyl) hylVar).f10362a.isEmpty()) && !(hylVar instanceof gyl)) ? f2 : f4, qmk.a(fetVar2).c, 24.0f);
                        if (z) {
                            fetVar2.e0(299048767);
                            ch80VarF = knm0.g(lh80Var, fetVar2);
                            z3 = false;
                            fetVar2.r(false);
                        } else {
                            z3 = false;
                            fetVar2.e0(299133304);
                            ch80VarF = knm0.f(lh80Var, fetVar2);
                            fetVar2.r(false);
                        }
                        ch80 ch80Var = ch80VarF;
                        fetVar2.r(z3);
                        boolean z15 = i4 == 16384 ? z2 : false;
                        Object objP14 = fetVar2.P();
                        if (z15 || objP14 == cl5Var) {
                            objP14 = new tk8(function1, (byte) 16);
                            fetVar2.o0(objP14);
                        }
                        Function0 function7 = (Function0) objP14;
                        boolean z16 = i4 == 16384 ? z2 : false;
                        Object objP15 = fetVar2.P();
                        if (z16 || objP15 == cl5Var) {
                            objP15 = new uo6(function1, (byte) 23);
                            fetVar2.o0(objP15);
                        }
                        Function1 function8 = (Function1) objP15;
                        boolean z17 = i4 == 16384 ? z2 : false;
                        Object objP16 = fetVar2.P();
                        if (z17 || objP16 == cl5Var) {
                            objP16 = new uo6(function1, (byte) 24);
                            fetVar2.o0(objP16);
                        }
                        fet fetVar3 = fetVar2;
                        ckb.f(x7zVarF, bmlVar, d9zVar, ch80Var, function7, null, function8, (Function1) objP16, fetVar3, i3 & 896, 32);
                        fetVar2 = fetVar3;
                        fetVar2.r(false);
                    } else if (av8Var instanceof yu8) {
                        j(rz4.f(fetVar2, -630757090, f3, z2), ((yu8) av8Var).f43255a, z, null, fetVar2, (i3 >> 3) & 896, 8);
                        fetVar2.r(false);
                    } else if (av8Var instanceof zu8) {
                        x7z x7zVarF2 = rz4.f(fetVar2, -630421887, f3, z2);
                        mdm mdmVar = ((zu8) av8Var).f44997a;
                        boolean z18 = i4 == 16384 ? z2 : false;
                        Object objP17 = fetVar2.P();
                        if (z18 || objP17 == cl5Var) {
                            objP17 = new tk8(function1, (byte) 17);
                            fetVar2.o0(objP17);
                        }
                        j(x7zVarF2, mdmVar, z, (Function0) objP17, fetVar2, (i3 >> 3) & 896, 0);
                        fetVar2.r(false);
                    }
                    fetVar2.r(z2);
                }
                throw b1j.f(-1128771212, fetVar2, false);
            }
            throw b1j.f(-1128881970, fetVar, false);
        }
        fetVar2.X();
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ip0((byte) 3, i2, (wdr) function1, (Object) mm40Var, (Object) ey8Var, (Object) d9zVar, z);
        }
    }

    public static final void l(mm40 mm40Var, w6b w6bVar, xcz xczVar, Function1 function1, ugd ugdVar, fet fetVar, int i2) {
        int i3;
        w6b w6bVar2;
        Function1 function2;
        xczVar.getClass();
        function1.getClass();
        fetVar.g0(-2093445518);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            w6bVar2 = w6bVar;
            i3 |= fetVar.g(w6bVar2) ? 32 : 16;
        } else {
            w6bVar2 = w6bVar;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(xczVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.i(ugdVar) ? 16384 : 8192;
        }
        int i4 = i3;
        byte b2 = 1;
        if (fetVar.U(i4 & 1, (i4 & 9363) != 9362)) {
            long backgroundContent = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
            zcl zclVar = qmk.f28987a;
            function2 = function1;
            tke.o(mm40Var, w6bVar, xczVar, knm0.g(s5x0.u(0.0f, 0.0f, 0.0f, 24.0f, 7), fetVar), ugdVar, u1c.M(-1276994421, new gn(function1, (byte) 9), fetVar), u1c.M(-821509388, new f6b(backgroundContent, w6bVar2, function1, (byte) 2), fetVar), u1c.M(-492900700, new i6b(b2, backgroundContent), fetVar), u1c.M(880437108, new j6b(b2, backgroundContent, function2), fetVar), mrv.e, mrv.f, fetVar, (i4 & 14) | 920322048 | (i4 & 112) | (i4 & 896) | (57344 & i4));
        } else {
            function2 = function1;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new g6b(mm40Var, w6bVar, xczVar, function2, ugdVar, i2, (byte) 2);
        }
    }

    public static final void m(String str, fet fetVar, int i2) {
        fet fetVar2 = fetVar;
        fetVar2.g0(703952884);
        int i3 = i2 | (fetVar2.g(str) ? 4 : 2);
        if (fetVar2.U(i3 & 1, (i3 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(o7k0.s(jm40.b, 80.0f), 44.0f);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
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
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str, null, ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.d(), fetVar, i3 & 14, 24960, 110586);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new f5n0((byte) 9, i2, str);
        }
    }

    public static final void n(mm40 mm40Var, Function1 function1, fet fetVar, int i2) {
        fet fetVar2;
        function1.getClass();
        fetVar.g0(-1337073805);
        int i3 = i2 | 6 | (fetVar.i(function1) ? 32 : 16);
        byte b2 = 1;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            n0q n0qVar = o7k0.c;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = ib10.f14464a;
                fetVar.o0(objP);
            }
            xdr xdrVar = (xdr) ((jhy) objP);
            boolean z = (i3 & 112) == 32;
            Object objP2 = fetVar.P();
            if (z || objP2 == cl5Var) {
                objP2 = new lj00(function1, (byte) 9);
                fetVar.o0(objP2);
            }
            fetVar2 = fetVar;
            y860.f(xdrVar, n0qVar, (Function1) objP2, fetVar2, 6, 0);
            mm40Var = jm40.b;
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wbc(mm40Var, function1, i2, b2);
        }
    }

    public static final void o(mm40 mm40Var, wim wimVar, w2v0 w2v0Var, gy40 gy40Var, Function0 function0, Function1 function1, fet fetVar, int i2) {
        fet fetVar2;
        mm40 mm40Var2;
        mm40 mm40VarW;
        long j2;
        boolean z;
        fetVar.g0(1944782612);
        int i3 = i2 | 6 | (fetVar.g(wimVar) ? 32 : 16) | (fetVar.g(w2v0Var) ? 256 : 128) | (fetVar.g(gy40Var) ? 2048 : 1024) | (fetVar.i(function0) ? 16384 : 8192) | (fetVar.i(function1) ? 131072 : 65536);
        if (fetVar.U(i3 & 1, (74899 & i3) != 74898)) {
            pz40 pz40VarF = androidx.compose.runtime.e.f(function0, fetVar);
            jm40 jm40Var = jm40.b;
            if (function0 != null) {
                fetVar.e0(-2089576501);
                ucg0 ucg0Var = new ucg0(0);
                boolean zG = fetVar.g(pz40VarF);
                Object objP = fetVar.P();
                if (zG || objP == ukd.f35823a) {
                    objP = new cml(pz40VarF, (byte) 24);
                    fetVar.o0(objP);
                }
                mm40VarW = y860.W(jm40Var, gy40Var, null, false, ucg0Var, (Function0) objP, 12);
                fetVar.r(false);
            } else {
                fetVar.e0(625336220);
                fetVar.r(false);
                mm40VarW = jm40Var;
            }
            mm40 mm40VarE = o7k0.o(lna.f20335a, jm40Var).e(mm40VarW);
            zx7 zx7Var = gqw0.f11754a;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE);
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
            z(null, wimVar, w2v0Var, function1, fetVar, (i3 & 1008) | ((i3 >> 6) & 7168));
            mm40 mm40VarG = o7k0.g(ua80.d(jm40Var, lna.h, fetVar, jm40Var, 1.0f), lna.i, 0.0f, 2);
            zx7 zx7Var2 = gqw0.h;
            jr8 jr8Var = jr8.f16991a;
            mm40 mm40VarB = jr8Var.b(mm40VarG, zx7Var2);
            tj30 tj30VarC2 = zq8.c(zx7Var, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarB);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC2, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            String str = wimVar.c;
            if (str == null) {
                fetVar.e0(566217423);
                fetVar.r(false);
                fetVar2 = fetVar;
                mm40Var2 = jm40Var;
                z = true;
            } else {
                fetVar.e0(566217424);
                ((g1t0) fetVar.k(j1t0.e)).getClass();
                y9q0 y9q0VarE = g1t0.e();
                bjm bjmVar = wimVar.b;
                if (bjmVar instanceof zim) {
                    j2 = w2v0Var.f38470a.d;
                } else if (bjmVar instanceof yim) {
                    j2 = w2v0Var.b.c;
                } else {
                    if (!(bjmVar instanceof ajm)) {
                        t9f.b();
                        return;
                    }
                    j2 = w2v0Var.c.f;
                }
                mm40Var2 = jm40Var;
                z = true;
                v8q0.a(str, jr8Var.b(o7k0.d(jm40Var, 1.0f), gqw0.e), j2, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, y9q0VarE, fetVar, 0, 24960, 109560);
                fetVar2 = fetVar;
                fetVar2.r(false);
            }
            fetVar2.r(z);
            fetVar2.r(z);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new tan(mm40Var2, wimVar, w2v0Var, gy40Var, function0, function1, i2, (byte) 3);
        }
    }

    public static final void p(mm40 mm40Var, bdz bdzVar, bzl bzlVar, boolean z, uce uceVar, Function1 function1, fet fetVar, int i2) {
        int i3;
        boolean z2;
        fetVar.g0(-704834350);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(bdzVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(bzlVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            z2 = z;
            i3 |= fetVar.h(z2) ? 2048 : 1024;
        } else {
            z2 = z;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.g(uceVar) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar.i(function1) ? 131072 : 65536;
        }
        if (fetVar.U(i3 & 1, (74899 & i3) != 74898)) {
            xcz xczVarB = bdzVar.b("KEY_LAZY_LIST_TRACKED", fetVar);
            mm40 mm40VarV = bzlVar == null ? mm40Var : cjx.V(mm40Var, bzlVar.a(new j6g0((byte) 17)), null);
            wom womVarF = mom.f(fetVar);
            mm40 mm40VarN = s5x0.N(mm40Var.e(o7k0.c), 0.0f, 0.0f, 0.0f, knm0.t(1, fetVar, false), 7);
            boolean z3 = (i3 & 458752) == 131072;
            Object objP = fetVar.P();
            if (z3 || objP == ukd.f35823a) {
                objP = new zk2(function1, (byte) 2);
                fetVar.o0(objP);
            }
            mom.c(mm40VarN, z2, womVarF, null, false, null, (Function0) objP, null, u1c.M(-1485967779, new qb((Object) mm40VarV, (Object) xczVarB, (Object) uceVar, false, (byte) 3), fetVar), fetVar, ((i3 >> 6) & 112) | 100663296, 184);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ig2((Object) mm40Var, (Object) bdzVar, (Object) bzlVar, z, (Object) uceVar, (wdr) function1, i2, (byte) 3);
        }
    }

    public static final void q(Function1 function1, fet fetVar, int i2) {
        int i3;
        fetVar.g0(-962880868);
        byte b2 = 4;
        if ((i2 & 6) == 0) {
            i3 = (fetVar.i(function1) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            xuz xuzVar = pb10.c;
            mdm mdmVar = new mdm(R.string.lottie_main_error, null, null, 0, 0, R.string.data_retrieval_error, 0, R.string.try_again_text, 0L, 0L, Response.SESSION_NOT_ACCEPTABLE);
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
            boolean z = (i3 & 14) == 4;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new bac0(function1, (byte) 17);
                fetVar.o0(objP);
            }
            jcb.l(null, mdmVar, false, (Function0) objP, fetVar, 0, 5);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wt9(function1, i2, b2);
        }
    }

    public static final void r(boolean z, Function1 function1, fet fetVar, int i2) {
        fetVar.g0(1137787049);
        byte b2 = 16;
        int i3 = (fetVar.h(z) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            xuz xuzVar = pb10.c;
            long j2 = z ? 9000L : 0L;
            mdm mdmVar = new mdm(R.string.lottie_main_error, null, null, 0, 0, R.string.data_retrieval_error, 0, R.string.try_again_text, j2, 0L, Response.SESSION_NOT_ACCEPTABLE);
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
            boolean z2 = (i3 & 112) == 32;
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new bac0(function1, b2);
                fetVar.o0(objP);
            }
            jcb.l(null, mdmVar, false, (Function0) objP, fetVar, 0, 5);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rt9(z, function1, i2, (byte) 7);
        }
    }

    public static final void s(mm40 mm40Var, yce yceVar, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        fetVar.g0(1510764245);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(yceVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            float fT = knm0.t(1, fetVar, false);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, fT, 7);
            mdm mdmVar = yceVar.f42381a;
            boolean z = (i3 & 896) == 256;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new zk2(function1, (byte) 3);
                fetVar.o0(objP);
            }
            jcb.l(mm40VarN, mdmVar, false, (Function0) objP, fetVar, 0, 4);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ca00((Object) mm40Var2, (Object) yceVar, (Object) function1, i2, (byte) 23);
        }
    }

    public static final void t(pz40 pz40Var, l7m0 l7m0Var, xcz xczVar, qdz qdzVar, Function1 function1, Function1 function2, fet fetVar, int i2) {
        int i3;
        Function1 function3;
        l7m0Var.getClass();
        xczVar.getClass();
        qdzVar.getClass();
        function1.getClass();
        function2.getClass();
        fetVar.g0(-1077267867);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(pz40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(l7m0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(xczVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.g(qdzVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            function3 = function1;
            i3 |= fetVar.i(function3) ? 16384 : 8192;
        } else {
            function3 = function1;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar.i(function2) ? 131072 : 65536;
        }
        if (fetVar.U(i3 & 1, (74899 & i3) != 74898)) {
            mm40 mm40VarU = vtb.U(cjx.V(o7k0.c, x0x.a0(fetVar), null), ((Boolean) l7m0Var.getValue()).booleanValue());
            float f2 = xfn.a(fetVar).c;
            float f3 = xfn.a(fetVar).c;
            zcl zclVar = qmk.f28987a;
            ch80 ch80VarF = h97.f(f2, 8.0f, f3, 28.0f, fetVar);
            qw3 qw3Var = new qw3(12.0f, true, new jf4((byte) 14));
            boolean z = ((i3 & 14) == 4) | ((i3 & 7168) == 2048) | ((458752 & i3) == 131072) | ((57344 & i3) == 16384);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                enm enmVar = new enm((Object) pz40Var, (Object) qdzVar, function2, function3, (byte) 10);
                fetVar.o0(enmVar);
                objP = enmVar;
            }
            b8k0.e(mm40VarU, xczVar, ch80VarF, qw3Var, null, null, false, null, (Function1) objP, fetVar, (i3 >> 3) & 112, Response.NOT_ACCEPTABLE_HERE);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new uwj(pz40Var, l7m0Var, xczVar, qdzVar, function1, function2, i2, (byte) 1);
        }
    }

    public static final void u(mm40 mm40Var, oui0 oui0Var, fet fetVar, int i2) {
        fetVar.g0(-1733735694);
        int i3 = i2 | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(oui0Var) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = o7k0.n(mm40Var, 24.0f);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
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
            y3d y3dVar = oui0Var.d;
            oil oilVarT = null;
            m78 m78Var = y3dVar != null ? new m78(y3dVar.f41946a, 5) : null;
            Integer num = oui0Var.f25879a;
            if (num == null) {
                fetVar.e0(1711118117);
                fetVar.r(false);
            } else {
                fetVar.e0(1711118118);
                int iIntValue = num.intValue();
                y3d y3dVar2 = oui0Var.b;
                oilVarT = ju70.T(a8k0.F(iIntValue, 0, fetVar), y3dVar2 != null ? new m78(y3dVar2.f41946a, 5) : null, null, 10);
                fetVar.r(false);
            }
            jm40 jm40Var = jm40.b;
            oil oilVar = oilVarT;
            k7x.b(oui0Var.c.a(), null, o2e.e0(o7k0.n(jm40Var, 24.0f), "SETTING_CELL_LEFT_IMAGE"), oilVar, oilVar, null, null, null, null, null, gqw0.A, m78Var, fetVar, 36912, 6, 27616);
            uf5 uf5Var = oui0Var.e;
            if (uf5Var == null) {
                fetVar.e0(1711865930);
                fetVar.r(false);
            } else {
                fetVar.e0(1711865931);
                g(ffb0.Q(jr8.f16991a.b(jm40Var, gqw0.i), 6.0f, 6.0f), uf5Var, fetVar, 0);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kqh0((Object) mm40Var, (Object) oui0Var, i2, (byte) 7);
        }
    }

    public static final void v(final mm40 mm40Var, final long j2, final float f2, fet fetVar, final int i2) {
        fetVar.g0(181113416);
        int i3 = (fetVar.f(j2) ? 32 : 16) | i2 | (fetVar.d(f2) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            zq8.a(0, fetVar, i120.S(o7k0.n(mm40Var, 40.0f), 1.0f, j2, vgg0.a(f2)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2(j2, f2, i2) { // from class: a.mui0
                public final /* synthetic */ long b;
                public final /* synthetic */ float c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = x8x.L(7);
                    vbw0.v(this.f22414a, this.b, this.c, (fet) obj, iL);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void w(final mm40 mm40Var, final float f2, final bdz bdzVar, final bzl bzlVar, final a4x a4xVar, final boolean z, final boolean z2, final boolean z3, final boolean z4, final boolean z5, final Function1 function1, fet fetVar, final int i2, final int i3) {
        int i4;
        final float f3;
        int i5;
        d9z d9zVarA;
        mm40 mm40VarV;
        byte b2;
        fetVar.g0(1929686218);
        if ((i2 & 6) == 0) {
            i4 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            f3 = f2;
            i4 |= fetVar.d(f3) ? 32 : 16;
        } else {
            f3 = f2;
        }
        if ((i2 & 384) == 0) {
            i4 |= fetVar.g(bdzVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= fetVar.g(bzlVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= fetVar.g(a4xVar) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i4 |= fetVar.h(z) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i4 |= fetVar.h(z2) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i4 |= fetVar.h(z3) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= fetVar.h(z4) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= fetVar.h(z5) ? 536870912 : 268435456;
        }
        int i6 = i4;
        if ((i3 & 6) == 0) {
            i5 = i3 | (fetVar.i(function1) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if (fetVar.U(i6 & 1, ((i6 & 306783379) == 306783378 && (i5 & 3) == 2) ? false : true)) {
            if (z2) {
                fetVar.e0(-854703791);
                d9zVarA = f9z.a(fetVar);
                fetVar.r(false);
            } else {
                fetVar.e0(-854658035);
                d9zVarA = bdzVar.a("KEY_LAZY_LIST_TRACKED", fetVar);
                fetVar.r(false);
            }
            cl5 cl5Var = ukd.f35823a;
            if (bzlVar == null) {
                fetVar.e0(-854532640);
                fetVar.r(false);
                mm40VarV = mm40Var;
            } else {
                fetVar.e0(-854499749);
                boolean z6 = (i6 & 3670016) == 1048576;
                Object objP = fetVar.P();
                if (z6 || objP == cl5Var) {
                    objP = new kg2((byte) 3, z2);
                    fetVar.o0(objP);
                }
                mm40VarV = cjx.V(mm40Var, bzlVar.a((Function0) objP), null);
                fetVar.r(false);
            }
            final pz40 pz40VarF = androidx.compose.runtime.e.f(a4xVar, fetVar);
            wom womVarF = mom.f(fetVar);
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = jgk0.b(new md0(d9zVarA, (byte) 2));
                fetVar.o0(objP2);
            }
            l7m0 l7m0Var = (l7m0) objP2;
            int i7 = i5 & 14;
            boolean z7 = i7 == 4;
            final mm40 mm40Var2 = mm40VarV;
            Object objP3 = fetVar.P();
            if (z7 || objP3 == cl5Var) {
                objP3 = new dl2((byte) 0, null, l7m0Var, function1);
                fetVar.o0(objP3);
            }
            m0x0.t(fetVar, d9zVarA, (Function2) objP3);
            Boolean boolValueOf = Boolean.valueOf(z4);
            boolean zG = fetVar.g(d9zVarA) | ((i6 & 234881024) == 67108864);
            Object objP4 = fetVar.P();
            if (zG || objP4 == cl5Var) {
                b2 = 1;
                objP4 = new mg2(z4, d9zVarA, null, b2);
                fetVar.o0(objP4);
            } else {
                b2 = 1;
            }
            m0x0.t(fetVar, boolValueOf, (Function2) objP4);
            if (z4) {
                function1.invoke(uk2.f35806a);
            }
            n0q n0qVar = o7k0.c;
            if (i7 != 4) {
                b2 = 0;
            }
            Object objP5 = fetVar.P();
            if (b2 != 0 || objP5 == cl5Var) {
                objP5 = new zk2(function1, (byte) 0);
                fetVar.o0(objP5);
            }
            final d9z d9zVar = d9zVarA;
            mom.c(n0qVar, z3, womVarF, null, false, null, (Function0) objP5, null, u1c.M(1464035935, new xdr() { // from class: a.al2
                @Override // a.xdr
                public final Object F(Object obj, Object obj2, Object obj3) {
                    fet fetVar2 = (fet) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((ir8) obj).getClass();
                    if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                        int i8 = z ? 2 : 1;
                        mm40 mm40VarE = mm40Var2.e(o7k0.c);
                        boolean z8 = !z2;
                        ngv ngvVar = new ngv(i8);
                        zcl zclVar = qmk.f28987a;
                        qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
                        ch80 ch80VarF = h97.f(xfn.a(fetVar2).d, f3, xfn.a(fetVar2).d, 24.0f, fetVar2);
                        pz40 pz40Var = pz40VarF;
                        boolean zG2 = fetVar2.g(pz40Var) | fetVar2.e(i8);
                        boolean z9 = z5;
                        boolean zH = zG2 | fetVar2.h(z9);
                        Function1 function2 = function1;
                        boolean zG3 = zH | fetVar2.g(function2);
                        Object objP6 = fetVar2.P();
                        if (zG3 || objP6 == ukd.f35823a) {
                            gc0 gc0Var = new gc0((Object) pz40Var, (Object) function2, z9, i8, (byte) 1);
                            fetVar2.o0(gc0Var);
                            objP6 = gc0Var;
                        }
                        g8x.i(ngvVar, mm40VarE, d9zVar, ch80VarF, null, qw3Var, null, z8, null, (Function1) objP6, fetVar2, 0, 688);
                    } else {
                        fetVar2.X();
                    }
                    return Unit.f46060a;
                }
            }, fetVar), fetVar, ((i6 >> 18) & 112) | 100663302, 184);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.bl2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = x8x.L(i2 | 1);
                    int iL2 = x8x.L(i3);
                    vbw0.w(mm40Var, f2, bdzVar, bzlVar, a4xVar, z, z2, z3, z4, z5, function1, (fet) obj, iL, iL2);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void x(int i2, fet fetVar, mm40 mm40Var, String str) {
        fet fetVar2 = fetVar;
        String str2 = str;
        fetVar2.g0(215419241);
        int i3 = i2 | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar2.g(str2) ? 32 : 16);
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            tj30 tj30VarC = zq8.c(gqw0.e, false);
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
            jpm0.o(fetVar2, tj30VarC, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str, mm40VarD, ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.m(), fetVar2, ((i3 >> 3) & 14) | 48, 24960, 109560);
            str2 = str;
            fetVar2 = fetVar2;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cgp0(mm40Var, str2, i2, (byte) 11);
        }
    }

    public static final void y(int i2, int i3, fet fetVar, mm40 mm40Var, Function1 function1) {
        int i4;
        mm40 mm40Var2;
        function1.getClass();
        fetVar.g0(1266455766);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= fetVar.i(function1) ? 32 : 16;
        }
        if (fetVar.U(i4 & 1, (i4 & 19) != 18)) {
            mm40 mm40Var3 = i5 != 0 ? jm40.b : mm40Var;
            mm40 mm40VarE = mm40Var3.e(o7k0.c);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = jb10.f16216a;
                fetVar.o0(objP);
            }
            xdr xdrVar = (xdr) ((jhy) objP);
            boolean z = (i4 & 112) == 32;
            Object objP2 = fetVar.P();
            if (z || objP2 == cl5Var) {
                objP2 = new lj00(function1, (byte) 8);
                fetVar.o0(objP2);
            }
            y860.f(xdrVar, mm40VarE, (Function1) objP2, fetVar, 6, 0);
            mm40Var2 = mm40Var3;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yzx(mm40Var2, (Object) function1, i2, i3, (byte) 3);
        }
    }

    public static final void z(mm40 mm40Var, wim wimVar, w2v0 w2v0Var, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        boolean z;
        u2v0 u2v0Var = w2v0Var.b;
        zx7 zx7Var = gqw0.e;
        fetVar.g0(-444188190);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(wimVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(w2v0Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            float f2 = lna.e;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarJ = lgb.J(o7k0.n(jm40Var, f2), lna.b);
            zx7 zx7Var2 = gqw0.f11754a;
            tj30 tj30VarC = zq8.c(zx7Var2, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarJ);
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
            bjm bjmVar = wimVar.b;
            byte b2 = 6;
            if (bjmVar instanceof zim) {
                fetVar.e0(893488923);
                zim zimVar = (zim) bjmVar;
                ibm0.e(zimVar.f44446a, zimVar.b, function1, ny9.b, u1c.M(1281564658, new uan(bjmVar, w2v0Var, b2), fetVar), fetVar, ((i3 >> 3) & 896) | 27648);
                fetVar.r(false);
                mm40Var2 = jm40Var;
            } else {
                int i4 = i3;
                boolean z3 = bjmVar instanceof yim;
                jr8 jr8Var = jr8.f16991a;
                if (z3) {
                    fetVar.e0(894681245);
                    mm40 mm40VarP = i120.P(o7k0.c, u2v0Var.f34965a, null, 6);
                    tj30 tj30VarC2 = zq8.c(zx7Var2, false);
                    int iHashCode2 = Long.hashCode(fetVar.T);
                    bh90 bh90VarM2 = fetVar.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarP);
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, tj30VarC2, shdVar);
                    jpm0.o(fetVar, bh90VarM2, shdVar2);
                    vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
                    jpm0.o(fetVar, mm40VarC1, shdVar4);
                    mm40Var2 = jm40Var;
                    dww.c(a8k0.F(((yim) bjmVar).f42699a, 0, fetVar), null, o7k0.n(jr8Var.b(mm40Var2, zx7Var), lna.d), u2v0Var.b, fetVar, 56, 0);
                    fetVar.r(true);
                    fetVar.r(false);
                } else {
                    mm40Var2 = jm40Var;
                    if (!(bjmVar instanceof ajm)) {
                        throw b1j.f(-248272060, fetVar, false);
                    }
                    fetVar.e0(895402243);
                    ajm ajmVar = (ajm) bjmVar;
                    ibm0.e(ajmVar.f983a, ajmVar.b, function1, ny9.c, u1c.M(-333722326, new uan(bjmVar, w2v0Var, (byte) 7), fetVar), fetVar, ((i4 >> 3) & 896) | 27648);
                    mm40 mm40VarE = jr8Var.b(mm40Var2, zx7Var).e(o7k0.c);
                    g3v0 g3v0Var = w2v0Var.c;
                    long j2 = g3v0Var.f10631a;
                    ljc ljcVar = jd8.n;
                    mm40 mm40VarQ = i120.Q(mm40VarE, j2, ljcVar);
                    tj30 tj30VarC3 = zq8.c(zx7Var, false);
                    int iHashCode3 = Long.hashCode(fetVar.T);
                    bh90 bh90VarM3 = fetVar.m();
                    mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarQ);
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, tj30VarC3, shdVar);
                    jpm0.o(fetVar, bh90VarM3, shdVar2);
                    vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
                    jpm0.o(fetVar, mm40VarC2, shdVar4);
                    mm40 mm40VarQ2 = i120.Q(lgb.J(o7k0.n(mm40Var2, lna.f), vgg0.f37379a), g3v0Var.c, ljcVar);
                    tj30 tj30VarC4 = zq8.c(zx7Var, false);
                    int iHashCode4 = Long.hashCode(fetVar.T);
                    bh90 bh90VarM4 = fetVar.m();
                    mm40 mm40VarC3 = kbc.c0(fetVar, mm40VarQ2);
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, tj30VarC4, shdVar);
                    jpm0.o(fetVar, bh90VarM4, shdVar2);
                    vqd.u(iHashCode4, fetVar, shdVar3, fetVar);
                    jpm0.o(fetVar, mm40VarC3, shdVar4);
                    dww.c(a8k0.F(R.drawable.ic_glyph_technical_works, 0, fetVar), null, o7k0.n(mm40Var2, lna.g), g3v0Var.b, fetVar, 440, 0);
                    z = true;
                    ohs0.x(fetVar, true, true, false);
                }
                fetVar.r(z);
            }
            z = true;
            fetVar.r(z);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new van(mm40Var2, wimVar, w2v0Var, function1, i2, (byte) 2);
        }
    }
}
