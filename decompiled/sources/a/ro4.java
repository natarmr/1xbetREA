package a;

import android.gov.nist.core.Separators;
import android.graphics.Matrix;
import android.javax.sip.message.Response;
import android.net.Uri;
import android.view.View;
import com.google.android.gms.common.Feature;
import java.lang.ref.WeakReference;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public final class ro4 {
    public static final ugd c = new ugd(-1571120048, false, new dhd());
    public static final ugd d = new ugd(-1455401925, false, new bhd(1));
    public static final ugd e = new ugd(1842574031, false, new ehd(15));
    public static final ugd f = new ugd(-1202686374, false, new jhd(25));
    public static final ugd g = new ugd(2044863939, false, new qhd(11));
    public static final Feature h;
    public static final Feature i;
    public static final Feature[] j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30818a = 1;
    public final WeakReference b;

    static {
        Feature feature = new Feature(-1, 1L, "CLIENT_TELEMETRY", true);
        h = feature;
        Feature feature2 = new Feature(-1, 1L, "CLIENT_NOTIFICATION_TELEMETRY", true);
        i = feature2;
        j = new Feature[]{feature, feature2};
    }

    public ro4(uo4 uo4Var) {
        this.b = new WeakReference(uo4Var);
    }

    public static final void A(mm40 mm40Var, cbm cbmVar, fet fetVar, int i2) {
        int i3;
        byte b;
        fetVar.g0(667858577);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(cbmVar) ? 32 : 16;
        }
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            pz40 pz40Var = s6t0.f31722a;
            long jM73getBlack400d7_KjU = StaticColors.INSTANCE.m73getBlack400d7_KjU();
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarJ = s5x0.J(i120.Q(mm40Var, jM73getBlack400d7_KjU, new ugg0(zclVar, zclVar, zclVar, zclVar)), 8.0f);
            byte b2 = 14;
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4(b2)), gqw0.k, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarJ);
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
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            B(ny9.O(0.7222222f, new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), false), cbmVar.f4067a, fetVar, 0);
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4(b2)), gqw0.m, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, jm40.b);
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
            fetVar.e0(1539613279);
            Iterator it = CollectionsKt.D0(cbmVar.c, 6).iterator();
            while (it.hasNext()) {
                mbc.n((xam) it.next(), fetVar, 6);
            }
            fetVar.r(false);
            fetVar.r(true);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            b = 1;
            B(ny9.O(0.7222222f, new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), false), cbmVar.b, fetVar, 0);
            fetVar.r(true);
        } else {
            b = 1;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new bbm(mm40Var, cbmVar, i2, b);
        }
    }

    public static final void B(mm40 mm40Var, n0x n0xVar, fet fetVar, int i2) {
        fetVar.g0(-1750399444);
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2 | (fetVar.g(n0xVar) ? 32 : 16);
        byte b = 1;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            pz40 pz40Var = s6t0.f31722a;
            long jM128getWhite40d7_KjU = StaticColors.INSTANCE.m128getWhite40d7_KjU();
            zcl zclVar = qmk.f;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(mm40Var, jM128getWhite40d7_KjU, new ugg0(zclVar, zclVar, zclVar, zclVar));
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
            rq8.b(lgb.J(o7k0.c, new ugg0(zclVar, zclVar, zclVar, zclVar)), s5x0.L(o7k0.n(jm40.b, 40.0f), 0.0f, 0.0f, 3), n0xVar, R.drawable.ic_glyph_placeholder_player, new y3d(((StaticColors) fetVar.k(m8m0.f21378a)).m126getWhite200d7_KjU()), null, null, gqw0.A, dyb.g0(new mrs0(), new aef()), fetVar, ((i3 << 3) & 896) | 113246208, 96);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nwa(mm40Var, n0xVar, i2, b);
        }
    }

    public static final void C(mm40 mm40Var, cbm cbmVar, fet fetVar, int i2) {
        int i3;
        byte b;
        cbm cbmVar2 = cbmVar;
        fet fetVar2 = fetVar;
        fetVar2.g0(1821752661);
        if ((i2 & 6) == 0) {
            i3 = i2 | (fetVar2.g(mm40Var) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.g(cbmVar2) ? 32 : 16;
        }
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarS = o7k0.s(mm40Var, 316.0f);
            pz40 pz40Var = s6t0.f31722a;
            StaticColors staticColors = StaticColors.INSTANCE;
            long jM73getBlack400d7_KjU = staticColors.m73getBlack400d7_KjU();
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarJ = s5x0.J(i120.Q(mm40VarS, jM73getBlack400d7_KjU, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 16.0f);
            xx7 xx7Var = gqw0.n;
            yx7 yx7Var = gqw0.k;
            x5d x5dVarA = w5d.a(new qw3(24.0f, false, new gne(yx7Var, (byte) 11)), xx7Var, fetVar2, 48);
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
            thg0 thg0VarA = shg0.a(new qw3(16.0f, true, new jf4((byte) 14)), yx7Var, fetVar2, 48);
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
            jpm0.o(fetVar2, thg0VarA, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            B(o7k0.p(jm40Var, 96.0f, 132.0f), cbmVar2.f4067a, fetVar2, 0);
            v8q0.a("VS", null, staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.s, null, j1t0.f15753a, 0L, null, 0, 0, qmk.G, 16646109), fetVar, 6, 0, 130042);
            fetVar2 = fetVar;
            cbmVar2 = cbmVar;
            b = 0;
            B(o7k0.p(jm40Var, 96.0f, 132.0f), cbmVar2.b, fetVar2, 0);
            fetVar2.r(true);
            x5d x5dVarA2 = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.m, fetVar2, 0);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, jm40Var);
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
            fetVar2.e0(-1053700299);
            Iterator it = CollectionsKt.D0(cbmVar2.c, 6).iterator();
            while (it.hasNext()) {
                mbc.n((xam) it.next(), fetVar2, 6);
            }
            ohs0.x(fetVar2, false, true, true);
        } else {
            b = 0;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new bbm(mm40Var, cbmVar2, i2, b);
        }
    }

    public static final void D(int i2, fet fetVar, mm40 mm40Var, String str) {
        fetVar.g0(-161817169);
        int i3 = i2 | 6 | (fetVar.g(str) ? 32 : 16);
        byte b = 18;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            float f2 = xfn.a(fetVar).d;
            jm40 jm40Var = jm40.b;
            hkb.k(i3 & 112, 0, fetVar, s5x0.L(jm40Var, f2, 0.0f, 2), str);
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ndp(mm40Var, str, i2, b);
        }
    }

    public static final void E(String str, String str2, int i2, fet fetVar, int i3) {
        fet fetVar2;
        String str3;
        String str4;
        fetVar.g0(654087562);
        int i4 = i3 | (fetVar.g(str) ? 4 : 2) | (fetVar.g(str2) ? 32 : 16) | (fetVar.e(i2) ? 256 : 128);
        if (fetVar.U(i4 & 1, (i4 & 147) != 146)) {
            boolean z = (i4 & 896) == 256;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                zcl zclVar = qmk.f28987a;
                objP = twn.j(i2 == 0 ? 0.0f : 12.0f, fetVar);
            }
            float f2 = ((ycl) objP).f42389a;
            boolean zW = StringsKt.W(str2);
            jm40 jm40Var = jm40.b;
            if (zW) {
                fetVar.e0(-343052614);
                str4 = str2;
                str3 = str;
                fetVar2 = fetVar;
                nkb.h(s5x0.N(o7k0.d(jm40Var, 1.0f), xfn.a(fetVar).e, f2, xfn.a(fetVar).e, 0.0f, 8), new hjm(str, new ojm(127), new y3d(((ThemeColors) fetVar.k(zaq0.b)).getSecondary()), null, null, null, false, null, null, false, null, null, 8184), kjm.b, null, null, null, fetVar2, 384, 56);
                fetVar2.r(false);
            } else {
                fetVar.e0(-343848043);
                mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                zcl zclVar2 = qmk.f28987a;
                mm40 mm40VarL = s5x0.L(s5x0.M(mm40VarD, 12.0f, f2, 12.0f, 12.0f), xfn.a(fetVar).e, 0.0f, 2);
                x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
                zfn zfnVar = zaq0.b;
                nkb.h(jm40Var, new hjm(str, null, new y3d(((ThemeColors) fetVar.k(zfnVar)).getSecondary()), null, null, null, false, null, null, false, null, null, 8186), kjm.b, null, null, null, fetVar, 390, 56);
                ((g1t0) fetVar.k(j1t0.e)).getClass();
                v8q0.a(str2, null, ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.n(), fetVar, (i4 >> 3) & 14, 0, 131066);
                fetVar.r(true);
                fetVar.r(false);
                str3 = str;
                str4 = str2;
                fetVar2 = fetVar;
            }
        } else {
            fetVar2 = fetVar;
            str3 = str;
            str4 = str2;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new e3m(i2, str3, i3, str4);
        }
    }

    public static final void F(int i2, fet fetVar, mm40 mm40Var, String str) {
        String str2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-543317103);
        int i3 = i2 | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar2.g(str) ? 32 : 16);
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zfn zfnVar = zaq0.b;
            long background = ((ThemeColors) fetVar2.k(zfnVar)).getBackground();
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(mm40VarD, background, new ugg0(zclVar, zclVar, zclVar, zclVar));
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
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
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            jm40 jm40Var = jm40.b;
            dww.c(a8k0.F(R.drawable.ic_glyph_info_circle_filled, 0, fetVar2), null, s5x0.M(jm40Var, 12.0f, 12.0f, 8.0f, 12.0f), ((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), fetVar2, 56, 0);
            mm40 mm40VarM = s5x0.M(jm40Var, 4.0f, 10.0f, 16.0f, 10.0f);
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            str2 = str;
            v8q0.a(str2, mm40VarM, ((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.h(), fetVar, (i3 >> 3) & 14, 0, 131064);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            str2 = str;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ndp(mm40Var, str2, i2, (byte) 19);
        }
    }

    public static final void G(int i2, fet fetVar, mm40 mm40Var, String str, String str2, boolean z) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-1918327135);
        byte b = 4;
        int i3 = i2 | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(str2) ? 256 : 128) | (fetVar2.h(z) ? 2048 : 1024);
        if (fetVar2.U(i3 & 1, (i3 & 1171) != 1170)) {
            Object[] objArr = {Boolean.valueOf(z)};
            boolean z2 = (i3 & 7168) == 2048;
            Object objP = fetVar2.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new kg2(b, z);
                fetVar2.o0(objP);
            }
            l7m0 l7m0VarY = v3c.Y(objArr, (Function0) objP, fetVar2);
            yx7 yx7Var = gqw0.k;
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), yx7Var, fetVar2, 48);
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
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            mm40 mm40VarI = hne.i(1.0f, false, "CASHBACK_LEVEL");
            long textPrimary = ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary();
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str, mm40VarI, textPrimary, new n05(qmk.q, qmk.r, idm0.s(0.25d)), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.m(), fetVar, (i3 >> 3) & 14, 24960, 110576);
            fetVar2 = fetVar;
            j6n.h(str2, (sso0) l7m0VarY.getValue(), jm40.b, 0, 0, fetVar2, ((i3 >> 6) & 14) | 384, 24);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eza((byte) 0, i2, mm40Var, str, str2, z);
        }
    }

    public static final void H(int i2, fet fetVar, mm40 mm40Var, String str, String str2) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(1789435220);
        int i3 = i2 | 6 | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(str2) ? 256 : 128);
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            yx7 yx7Var = gqw0.k;
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(2.0f, true, new jf4((byte) 14)), yx7Var, fetVar2, 48);
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
            mm40 mm40VarE0 = o2e.e0(yyw.U(jm40Var, 0.5f), "CASHBACK_LEVEL_VALUE_TITLE");
            zfn zfnVar = zaq0.b;
            long secondary = ((ThemeColors) fetVar2.k(zfnVar)).getSecondary();
            zfn zfnVar2 = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar2)).getClass();
            v8q0.a(str, mm40VarE0, secondary, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.g(), fetVar2, (i3 >> 3) & 14, 24960, 110584);
            mm40 mm40VarI = hne.i(1.0f, false, "CASHBACK_LEVEL_VALUE_SUM");
            long textPrimary = ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary();
            ((g1t0) fetVar2.k(zfnVar2)).getClass();
            v8q0.a(str2, mm40VarI, textPrimary, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.d(), fetVar2, (i3 >> 6) & 14, 24960, 110584);
            fetVar2 = fetVar2;
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new g15(mm40Var2, str, str2, i2, (byte) 11);
        }
    }

    public static final void I(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(482004985);
        int i3 = (fetVar.g(l7m0Var) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        if (!fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            fetVar.X();
        } else if (((xwz) l7m0Var.getValue()).h) {
            fetVar.e0(1335063289);
            k(((xwz) l7m0Var.getValue()).j, ((xwz) l7m0Var.getValue()).i, function1, fetVar, (i3 << 3) & 896);
            fetVar.r(false);
        } else {
            fetVar.e0(1334990346);
            t(l7m0Var, function1, fetVar, i3 & 126);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p7y(l7m0Var, function1, i2, (byte) 24);
        }
    }

    public static final void J(int i2, fet fetVar) {
        fetVar.g0(-266995172);
        if (fetVar.U(i2 & 1, i2 != 0)) {
            mm40 mm40VarH = k7n0.H(o7k0.c, 2.0f);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = dw9.j(fetVar);
            }
            gy40 gy40Var = (gy40) objP;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new jtz((byte) 2);
                fetVar.o0(objP2);
            }
            mm40 mm40VarW = y860.W(mm40VarH, gy40Var, null, false, null, (Function0) objP2, 28);
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarQ = i120.Q(mm40VarW, StaticColors.INSTANCE.m109getOverlayBackground400d7_KjU(), jd8.n);
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
            kpb.j(jm40.b, new dkm((ycl) null, new y3d(((ThemeColors) fetVar.k(zaq0.b)).getPrimary()), 3), fetVar, 6, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hvy(i2, (byte) 29);
        }
    }

    public static final void K(mm40 mm40Var, ra10 ra10Var, fet fetVar, int i2) {
        fetVar.g0(1192227012);
        int i3 = i2 | 6 | (fetVar.g(ra10Var) ? 32 : 16);
        byte b = 1;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            boolean z = (i3 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new bvn(ra10Var, (byte) 4);
                fetVar.o0(objP);
            }
            jm40 jm40Var = jm40.b;
            vbw0.y(6, 0, fetVar, jm40Var, (Function1) objP);
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cvn(mm40Var, ra10Var, i2, b);
        }
    }

    public static final void L(dwz dwzVar, Function1 function1, fet fetVar, int i2) {
        boolean z;
        yjj0 yjj0VarA;
        ljc ljcVar = jd8.n;
        fetVar.g0(-1578210939);
        int i3 = (fetVar.g(dwzVar) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            ny nyVar = dwzVar.g;
            wui0 wui0Var = dwzVar.e;
            String str = dwzVar.d;
            jm40 jm40Var = jm40.b;
            cl5 cl5Var = ukd.f35823a;
            if (nyVar == null) {
                fetVar.e0(525071477);
                mm40 mm40VarL = s5x0.L(jm40Var, xfn.a(fetVar).d, 0.0f, 2);
                boolean zW = StringsKt.W(str);
                String str2 = dwzVar.c;
                String str3 = dwzVar.b;
                rqm rqmVar = new rqm(zW ? new rui0(str2, null, str3, null, 58) : new sui0(str2, str3, str), (pui0) null, (pvi0) null, (d4d) null, (tvi0) null, wui0Var, dwzVar.f, (e900) null, 318);
                boolean z2 = ((i3 & 112) == 32) | ((i3 & 14) == 4);
                Object objP = fetVar.P();
                if (z2 || objP == cl5Var) {
                    objP = new mbz(function1, dwzVar, (byte) 5);
                    fetVar.o0(objP);
                }
                obc.q(mm40VarL, rqmVar, true, null, (Function0) objP, null, null, null, fetVar, 384, 232);
                fetVar.r(false);
            } else {
                fetVar.e0(526028726);
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
                mm40 mm40VarL2 = s5x0.L(jm40Var, xfn.a(fetVar).d, 0.0f, 2);
                rqm rqmVar2 = new rqm((vui0) new rui0(dwzVar.c, null, dwzVar.b, null, 58), (pui0) null, (pvi0) null, (d4d) null, (tvi0) null, wui0Var, false, (e900) null, 446);
                Object objP2 = fetVar.P();
                byte b = 3;
                if (objP2 == cl5Var) {
                    objP2 = new jtz(b);
                    fetVar.o0(objP2);
                }
                obc.q(mm40VarL2, rqmVar2, false, null, (Function0) objP2, null, null, null, fetVar, 24960, 232);
                mm40 mm40VarL3 = s5x0.L(jm40Var, xfn.a(fetVar).d, 0.0f, 2);
                zfn zfnVar = zaq0.b;
                long backgroundContent = ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent();
                int iOrdinal = nyVar.b.ordinal();
                if (iOrdinal != 0) {
                    z = true;
                    if (iOrdinal == 1) {
                        zcl zclVar = qmk.f28987a;
                        yjj0VarA = vgg0.c(16.0f, 16.0f, 0.0f, 0.0f, 12);
                    } else if (iOrdinal == 2) {
                        yjj0VarA = ljcVar;
                    } else if (iOrdinal != 3) {
                        t9f.b();
                        return;
                    } else {
                        zcl zclVar2 = qmk.f28987a;
                        yjj0VarA = vgg0.c(0.0f, 0.0f, 16.0f, 16.0f, 3);
                    }
                } else {
                    z = true;
                    zcl zclVar3 = qmk.f28987a;
                    yjj0VarA = vgg0.a(16.0f);
                }
                mm40 mm40VarQ = i120.Q(mm40VarL3, backgroundContent, yjj0VarA);
                zcl zclVar4 = qmk.f28987a;
                F(0, fetVar, s5x0.N(mm40VarQ, 16.0f, 0.0f, 16.0f, 12.0f, 2), nyVar.f24307a);
                if (nyVar.b != wui0.d) {
                    fetVar.e0(-1987389181);
                    jcb.v(s5x0.N(i120.Q(s5x0.L(jm40Var, xfn.a(fetVar).d, 0.0f, 2), ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), ljcVar), 16.0f, 0.0f, 0.0f, 0.0f, 14), 1.0f, ((ThemeColors) fetVar.k(zfnVar)).getSeparator(), fetVar, 0, 0);
                    fetVar.r(false);
                } else {
                    fetVar.e0(-1986970185);
                    fetVar.r(false);
                }
                fetVar.r(z);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new r7y(dwzVar, function1, i2, (byte) 16);
        }
    }

    public static final void M(mm40 mm40Var, i4 i4Var, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        fetVar.g0(1262595708);
        int i3 = i2 | 6 | (fetVar.g(i4Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            n0q n0qVar = o7k0.c;
            zcl zclVar = qmk.f28987a;
            byte b = 5;
            lh80 lh80VarU = s5x0.u(0.0f, 8.0f, 0.0f, 24.0f, 5);
            boolean z = ((i3 & 112) == 32) | ((i3 & 896) == 256);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new ktz(i4Var, function1, b);
                fetVar.o0(objP);
            }
            b8k0.e(n0qVar, xczVarA, lh80VarU, null, null, null, false, null, (Function1) objP, fetVar, 0, Response.SERVER_TIMEOUT);
            mm40Var2 = jm40.b;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ltz(mm40Var2, i4Var, function1, i2, (byte) 5);
        }
    }

    public static final void N(z77 z77Var, Function1 function1, fet fetVar, int i2) {
        yx7 yx7Var;
        shd shdVar;
        shd shdVar2;
        boolean z;
        float f2;
        shd shdVar3;
        shd shdVar4;
        pcy pcyVar;
        fet fetVar2 = fetVar;
        fetVar2.g0(1073612477);
        int i3 = i2 | (fetVar2.g(z77Var) ? 4 : 2) | (fetVar2.i(function1) ? 32 : 16);
        byte b = 0;
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            n0q n0qVar = o7k0.c;
            boolean z2 = (i3 & 112) == 32;
            Object objP = fetVar2.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new opm0(function1, b);
                fetVar2.o0(objP);
            }
            mm40 mm40VarW = y860.W(n0qVar, null, null, false, null, (Function0) objP, 28);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(mm40VarW, 16.0f, 0.0f, 2);
            yx7 yx7Var2 = gqw0.k;
            x5d x5dVarA = w5d.a(new qw3(2.0f, false, new gne(yx7Var2, (byte) 11)), gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarL);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z3 = fetVar2.S;
            pcy pcyVar2 = e7z.u1;
            if (z3) {
                fetVar2.l(pcyVar2);
            } else {
                fetVar2.r0();
            }
            shd shdVar5 = gqw0.x;
            jpm0.o(fetVar2, x5dVarA, shdVar5);
            shd shdVar6 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar6);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar7 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar7);
            jpm0.n(fetVar2);
            shd shdVar8 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar8);
            if (z77Var.f().k.length() > 0) {
                fetVar2.e0(-1287819806);
                shdVar = shdVar6;
                shdVar2 = shdVar8;
                z = false;
                f2 = 2.0f;
                shdVar3 = shdVar7;
                pcyVar = pcyVar2;
                yx7Var = yx7Var2;
                shdVar4 = shdVar5;
                v8q0.a(z77Var.f().k, null, 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, ibm0.n(new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar2), fetVar, 0, 24960, 110590);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                yx7Var = yx7Var2;
                shdVar = shdVar6;
                shdVar2 = shdVar8;
                z = false;
                f2 = 2.0f;
                shdVar3 = shdVar7;
                shdVar4 = shdVar5;
                pcyVar = pcyVar2;
                fetVar2.e0(-1287582129);
                fetVar2.r(false);
            }
            qw3 qw3Var = new qw3(f2, true, new jf4((byte) 14));
            x7z x7zVar = new x7z(1.0f, z);
            thg0 thg0VarA = shg0.a(qw3Var, yx7Var, fetVar2, 48);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, x7zVar);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, shdVar4);
            jpm0.o(fetVar2, bh90VarM2, shdVar);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            x7z x7zVarI = ohs0.i(fetVar2, mm40VarC1, shdVar2, 1.0f, z);
            String str = z77Var.f().f38471a;
            qrq qrqVar = j1t0.b;
            long j2 = qmk.u;
            v8q0.a(str, x7zVarI, 0L, new n05(qmk.r, j2, qmk.n), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, ibm0.t(new y9q0(0L, j2, null, qrqVar, 0L, null, 0, 0, qmk.H, 16646109), fetVar2), fetVar, 0, 24960, 110580);
            fetVar2 = fetVar;
            if (z77Var.f().l) {
                fetVar2.e0(1179185861);
                dww.b(jpm0.t(R.drawable.ic_glyph_chevron_down_small, 6, fetVar2), null, o7k0.n(jm40.b, 16.0f), ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary80(), fetVar2, 48, 0);
                fetVar2.r(z);
            } else {
                fetVar2.e0(1179482283);
                fetVar2.r(z);
            }
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new k57(z77Var, function1, i2, (byte) 5);
        }
    }

    public static final void O(mm40 mm40Var, mtl mtlVar, Function0 function0, Function0 function1, fet fetVar, int i2) {
        fetVar.g0(419779390);
        int i3 = i2 | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(mtlVar) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            ma80 ma80Var = ma80.b;
            boolean z = ((i3 & 896) == 256) | ((i3 & 7168) == 2048);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new yhd(function0, function1, (byte) 7);
                fetVar.o0(objP);
            }
            bkb.f(mm40Var, mtlVar, ma80Var, false, null, (Function1) objP, fetVar, (i3 & 14) | 384 | (i3 & 112), 24);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new stl0((byte) 23, i2, mm40Var, mtlVar, function0, function1);
        }
    }

    public static final void P(mm40 mm40Var, ch80 ch80Var, he80 he80Var, a4x a4xVar, Function1 function1, Function2 function2, fet fetVar, int i2) {
        fetVar.g0(1621387205);
        int i3 = i2 | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(ch80Var) ? 32 : 16) | (fetVar.g(he80Var) ? 256 : 128) | (fetVar.g(a4xVar) ? 2048 : 1024) | (fetVar.i(function1) ? 16384 : 8192) | (fetVar.i(function2) ? 131072 : 65536);
        if (fetVar.U(i3 & 1, (74899 & i3) != 74898)) {
            boolean z = ((i3 & 896) == 256) | ((i3 & 7168) == 2048) | ((57344 & i3) == 16384) | ((458752 & i3) == 131072);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                l0i0 l0i0Var = new l0i0((Object) a4xVar, (Object) he80Var, function1, (Object) function2, (byte) 9);
                fetVar.o0(l0i0Var);
                objP = l0i0Var;
            }
            b8k0.e(mm40Var, null, ch80Var, null, null, null, false, null, (Function1) objP, fetVar, (i3 & 14) | ((i3 << 3) & 896), 506);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vdl0(mm40Var, ch80Var, he80Var, a4xVar, function1, function2, i2);
        }
    }

    public static final void Q(int i2, fet fetVar, mm40 mm40Var) {
        fetVar.g0(-1034312046);
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            fqj0 fqj0VarD0 = vbc.d0(null, fetVar, 0, 1);
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
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(o7k0.s(s5x0.K(jm40.b, 4.0f, 12.0f), 96.0f), 12.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), fqj0VarD0));
            dw9.x(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, s5x0.N(o7k0.c, 0.0f, 0.0f, 0.0f, 24.0f, 7)), fqj0VarD0, fetVar, 0, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ev90(mm40Var, i2, (byte) 8);
        }
    }

    public static final void R(mm40 mm40Var, hqq0 hqq0Var, vj50 vj50Var, float f2, xcz xczVar, fet fetVar, int i2) {
        mm40 mm40Var2;
        float f3;
        vj50Var.getClass();
        xczVar.getClass();
        fetVar.g0(574676039);
        int i3 = i2 | 6 | (fetVar.g(hqq0Var) ? 32 : 16) | (fetVar.g(vj50Var) ? 256 : 128) | (fetVar.d(f2) ? 2048 : 1024) | (fetVar.g(xczVar) ? 16384 : 8192);
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = Boolean.valueOf(!(hqq0Var instanceof gqq0));
                fetVar.o0(objP);
            }
            boolean zBooleanValue = ((Boolean) objP).booleanValue();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarV = cjx.V(jm40Var, vj50Var, null);
            if (zBooleanValue) {
                f3 = f2;
            } else {
                zcl zclVar = qmk.f28987a;
                f3 = 0.0f;
            }
            mm40 mm40VarE = s5x0.N(mm40VarV, 0.0f, f3, 0.0f, 0.0f, 13).e(o7k0.c);
            zcl zclVar2 = qmk.f28987a;
            mm40 mm40VarQ = i120.Q(lgb.J(mm40VarE, vgg0.c(24.0f, 24.0f, 0.0f, 0.0f, 12)), ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), jd8.n);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            if (hqq0Var.equals(fqq0.f9987a)) {
                fetVar.e0(991654625);
                knx.N(0, fetVar, null);
                fetVar.r(false);
            } else if (hqq0Var instanceof gqq0) {
                fetVar.e0(991656649);
                K(null, ((gqq0) hqq0Var).f11745a, fetVar, 0);
                fetVar.r(false);
            } else if (hqq0Var instanceof dqq0) {
                fetVar.e0(676687814);
                V(null, ((dqq0) hqq0Var).f6529a, xczVar, fetVar, (i3 >> 6) & 896);
                fetVar.r(false);
            } else {
                if (!hqq0Var.equals(eqq0.f8249a)) {
                    throw b1j.f(991652915, fetVar, false);
                }
                fetVar.e0(676801491);
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
            yfe0VarU.d = new en80(mm40Var2, hqq0Var, vj50Var, f2, xczVar, i2, (byte) 2);
        }
    }

    public static final void S(mm40 mm40Var, z77 z77Var, boolean z, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        ugd ugdVarM;
        z77Var.getClass();
        function1.getClass();
        fetVar.g0(1790878879);
        int i3 = i2 | 6 | (fetVar.g(z77Var) ? 32 : 16) | (fetVar.h(z) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        byte b = 1;
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            if (z77Var.f().j.equals(mlm.f21997a)) {
                fetVar.e0(-10692420);
                ugdVarM = u1c.M(416895143, new k57(z77Var, function1, (byte) 4), fetVar);
                fetVar.r(false);
            } else {
                fetVar.e0(-10555865);
                fetVar.r(false);
                ugdVarM = null;
            }
            ugd ugdVar = ugdVarM;
            imm immVar = new imm(z77Var.f().h, z77Var.f().j, z77Var.f().i, ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), z, null);
            int i4 = i3 & 7168;
            boolean z2 = i4 == 2048;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = new yhl0(function1, (byte) 28);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z3 = i4 == 2048;
            Object objP2 = fetVar.P();
            if (z3 || objP2 == cl5Var) {
                objP2 = new yhl0(function1, (byte) 29);
                fetVar.o0(objP2);
            }
            Function0 function2 = (Function0) objP2;
            boolean z4 = i4 == 2048;
            Object objP3 = fetVar.P();
            if (z4 || objP3 == cl5Var) {
                objP3 = new zbm0(function1, b);
                fetVar.o0(objP3);
            }
            hlm.c(mm40VarD, immVar, null, function0, function2, (Function1) objP3, null, null, null, null, ugdVar, null, fetVar, 0, 0, 3012);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new lfc0(mm40Var2, (Object) z77Var, z, (wdr) function1, i2, (byte) 14);
        }
    }

    public static final void T(mm40 mm40Var, vwz vwzVar, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        pvi0 jvi0Var;
        fetVar.g0(-1913352131);
        int i3 = i2 | 6 | (fetVar.g(vwzVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            float f2 = xfn.a(fetVar).d;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarL = s5x0.L(jm40Var, f2, 0.0f, 2);
            String str = vwzVar.b;
            String str2 = vwzVar.c;
            tui0 tui0Var = new tui0(str, null);
            if (vwzVar.e) {
                fetVar.e0(2133086489);
                zfn zfnVar = zaq0.b;
                jvi0Var = new kvi0(str2, new y3d(((ThemeColors) fetVar.k(zfnVar)).getPrimary()), new y3d(((ThemeColors) fetVar.k(zfnVar)).getPrimary()));
                fetVar.r(false);
            } else {
                fetVar.e0(2133307612);
                jvi0Var = new jvi0(str2, new y3d(((ThemeColors) fetVar.k(zaq0.b)).getSecondary()));
                fetVar.r(false);
            }
            rqm rqmVar = new rqm(tui0Var, (pui0) null, jvi0Var, (d4d) null, (tvi0) null, vwzVar.d, vwzVar.e, (e900) null, 314);
            boolean z = ((i3 & 896) == 256) | ((i3 & 112) == 32);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new mbz(function1, vwzVar, (byte) 4);
                fetVar.o0(objP);
            }
            obc.q(mm40VarL, rqmVar, true, null, (Function0) objP, null, null, null, fetVar, 384, 232);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mtz(mm40Var2, vwzVar, function1, i2, (byte) 2);
        }
    }

    public static final void U(mm40 mm40Var, i4 i4Var, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        fetVar.g0(414267379);
        int i3 = i2 | 6 | (fetVar.g(i4Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            n0q n0qVar = o7k0.c;
            zcl zclVar = qmk.f28987a;
            lh80 lh80VarU = s5x0.u(0.0f, 12.0f, 0.0f, 24.0f, 5);
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            boolean z = ((i3 & 112) == 32) | ((i3 & 896) == 256);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new ktz(i4Var, function1, (byte) 4);
                fetVar.o0(objP);
            }
            b8k0.e(n0qVar, xczVarA, lh80VarU, qw3Var, null, null, false, null, (Function1) objP, fetVar, 0, Response.NOT_ACCEPTABLE_HERE);
            mm40Var2 = jm40.b;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ltz(mm40Var2, i4Var, function1, i2, (byte) 4);
        }
    }

    public static final void V(mm40 mm40Var, a4x a4xVar, xcz xczVar, fet fetVar, int i2) {
        xczVar.getClass();
        fetVar.g0(1599993612);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(a4xVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(xczVar) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            n0q n0qVar = o7k0.c;
            float f2 = xfn.a(fetVar).d;
            float f3 = xfn.a(fetVar).d;
            zcl zclVar = qmk.f28987a;
            lh80 lh80VarU = s5x0.u(f2, 0.0f, f3, 12.0f, 2);
            boolean z = (i3 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new oea(a4xVar, (byte) 26);
                fetVar.o0(objP);
            }
            b8k0.e(n0qVar, xczVar, lh80VarU, null, null, null, false, null, (Function1) objP, fetVar, (i3 >> 3) & 112, Response.SERVER_TIMEOUT);
            mm40Var = jm40.b;
        } else {
            fetVar.X();
        }
        mm40 mm40Var2 = mm40Var;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t6m(mm40Var2, a4xVar, xczVar, i2, (byte) 5);
        }
    }

    public static final void W(mm40 mm40Var, aur0 aur0Var, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        aur0Var.getClass();
        function1.getClass();
        fetVar2.g0(2029978039);
        int i3 = i2 | 6 | (fetVar2.g(aur0Var) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128);
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            n0q n0qVar = o7k0.c;
            mm40 mm40VarQ = i120.Q(n0qVar, ((ThemeColors) fetVar2.k(zaq0.b)).getBackground(), jd8.n);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarQ);
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
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, n0qVar);
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
            mm40 mm40VarW = o7k0.w(jm40Var, null, false, 3);
            me80 me80Var = aur0Var.f1493a;
            int i4 = i3 & 896;
            boolean z2 = i4 == 256;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = new sbr0(function1, (byte) 16);
                fetVar2.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z3 = i4 == 256;
            Object objP2 = fetVar2.P();
            if (z3 || objP2 == cl5Var) {
                objP2 = new sbr0(function1, (byte) 17);
                fetVar2.o0(objP2);
            }
            ycm0.h(mm40VarW, me80Var, function0, (Function0) objP2, fetVar2, 6);
            mm40 mm40VarL = s5x0.L(new x7z(1.0f, true), xfn.a(fetVar2).d, 0.0f, 2);
            ch80 ch80VarF = knm0.f(s5x0.u(0.0f, 0.0f, 0.0f, 88.0f, 7), fetVar2);
            he80 he80Var = aur0Var.b;
            a4x a4xVar = aur0Var.c;
            boolean z4 = i4 == 256;
            Object objP3 = fetVar2.P();
            if (z4 || objP3 == cl5Var) {
                objP3 = new xar0(function1, (byte) 5);
                fetVar2.o0(objP3);
            }
            Function1 function2 = (Function1) objP3;
            boolean z5 = i4 == 256;
            Object objP4 = fetVar2.P();
            byte b = 18;
            if (z5 || objP4 == cl5Var) {
                objP4 = new ru80(function1, b);
                fetVar2.o0(objP4);
            }
            P(mm40VarL, ch80VarF, he80Var, a4xVar, function2, (Function2) objP4, fetVar2, 0);
            fetVar2 = fetVar2;
            fetVar2.r(true);
            mm40 mm40VarB = jr8.f16991a.b(jm40Var, gqw0.h);
            mtl mtlVar = aur0Var.d;
            boolean z6 = i4 == 256;
            Object objP5 = fetVar2.P();
            if (z6 || objP5 == cl5Var) {
                objP5 = new sbr0(function1, b);
                fetVar2.o0(objP5);
            }
            Function0 function3 = (Function0) objP5;
            boolean z7 = i4 == 256;
            Object objP6 = fetVar2.P();
            if (z7 || objP6 == cl5Var) {
                objP6 = new sbr0(function1, (byte) 19);
                fetVar2.o0(objP6);
            }
            O(mm40VarB, mtlVar, function3, (Function0) objP6, fetVar2, 0);
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gdr0(mm40Var2, aur0Var, function1, i2, (byte) 5);
        }
    }

    public static final gbn X(Function1 function1) {
        byte b = 3;
        return new gbn(new gh5((byte) 2), new lq4(b, b), new wc2(function1, (byte) 25), zx3.m);
    }

    public static Object Y(Future future) {
        z1x.y("Future was expected to be done, " + future, future.isDone());
        return Z(future);
    }

    public static Object Z(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static final void a(int i2, fet fetVar, mm40 mm40Var, Function1 function1, boolean z, boolean z2) {
        int i3;
        long secondary10;
        long secondary20;
        long secondary11;
        long secondary21;
        fet fetVar2 = fetVar;
        fetVar2.g0(743760113);
        if ((i2 & 6) == 0) {
            i3 = (fetVar2.h(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.h(z2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar2.i(function1) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.g(mm40Var) ? 2048 : 1024;
        }
        if (fetVar2.U(i3 & 1, (i3 & 1171) != 1170)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarS = o7k0.s(mm40Var, 104.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar2, 0);
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
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            if (z) {
                fetVar2.e0(1199194375);
                secondary10 = afn0.m(fetVar2).getCommerceTint();
                fetVar2.r(false);
            } else {
                fetVar2.e0(1199277672);
                secondary10 = afn0.m(fetVar2).getSecondary10();
                fetVar2.r(false);
            }
            ugg0 ugg0VarA = vgg0.a(12.0f);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarK = s5x0.K(i120.Q(jm40Var, secondary10, ugg0VarA), 12.0f, 6.0f);
            int i4 = i3 & 896;
            boolean z3 = i4 == 256;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z3 || objP == cl5Var) {
                objP = new e0(function1, (byte) 27);
                fetVar2.o0(objP);
            }
            mm40 mm40VarW = y860.W(mm40VarK, null, null, z, null, (Function0) objP, 24);
            pm80 pm80VarF = a8k0.F(R.drawable.ic_glyph_deposit_account, 0, fetVar2);
            if (z) {
                fetVar2.e0(1701273557);
                secondary20 = afn0.m(fetVar2).getCommerce();
            } else {
                fetVar2.e0(1701274584);
                secondary20 = afn0.m(fetVar2).getSecondary20();
            }
            fetVar2.r(false);
            dww.c(pm80VarF, null, mm40VarW, secondary20, fetVar2, 56, 0);
            qxw.o(fetVar2, o7k0.s(jm40Var, 8.0f));
            if (z2) {
                fetVar2.e0(1200136186);
                secondary11 = afn0.m(fetVar2).getSecondaryButtonBackground();
                fetVar2.r(false);
            } else {
                fetVar2.e0(1200231976);
                secondary11 = afn0.m(fetVar2).getSecondary10();
                fetVar2.r(false);
            }
            mm40 mm40VarK2 = s5x0.K(i120.Q(jm40Var, secondary11, vgg0.a(12.0f)), 12.0f, 6.0f);
            boolean z4 = i4 == 256;
            Object objP2 = fetVar2.P();
            if (z4 || objP2 == cl5Var) {
                objP2 = new e0(function1, (byte) 28);
                fetVar2.o0(objP2);
            }
            mm40 mm40VarW2 = y860.W(mm40VarK2, null, null, z2, null, (Function0) objP2, 24);
            pm80 pm80VarF2 = a8k0.F(R.drawable.ic_glyph_withdraw_account, 0, fetVar2);
            if (z2) {
                secondary21 = cs0.e(fetVar2, 1701304724, fetVar2, false);
            } else {
                fetVar2.e0(1701305720);
                secondary21 = afn0.m(fetVar2).getSecondary20();
                fetVar2.r(false);
            }
            fetVar2 = fetVar;
            dww.c(pm80VarF2, null, mm40VarW2, secondary21, fetVar2, 56, 0);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ng(z, z2, function1, mm40Var, i2);
        }
    }

    public static m3x a0(Object obj) {
        return obj == null ? m3x.c : new m3x(obj, (byte) 0);
    }

    public static final void b(mm40 mm40Var, boolean z, String str, String str2, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        fetVar.g0(174791128);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= fetVar.h(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(str) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.g(str2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.i(function1) ? 16384 : 8192;
        }
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = androidx.compose.runtime.e.e(Boolean.FALSE);
                fetVar.o0(objP);
            }
            pz40 pz40Var = (pz40) objP;
            Object objP2 = fetVar.P();
            if (objP2 == obj) {
                objP2 = Boolean.valueOf(cy7.c());
                fetVar.o0(objP2);
            }
            boolean zBooleanValue = ((Boolean) objP2).booleanValue();
            Object objP3 = fetVar.P();
            if (objP3 == obj) {
                objP3 = xf0.c(0.0f);
                fetVar.o0(objP3);
            }
            t33 t33Var = (t33) objP3;
            Object objP4 = fetVar.P();
            if (objP4 == obj) {
                objP4 = Float.valueOf(zBooleanValue ? -360.0f : 360.0f);
                fetVar.o0(objP4);
            }
            float fFloatValue = ((Number) objP4).floatValue();
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zI = ((i3 & 112) == 32) | fetVar.i(t33Var);
            Object objP5 = fetVar.P();
            if (zI || objP5 == obj) {
                objP5 = new og(z, t33Var, fFloatValue, null);
                fetVar.o0(objP5);
            }
            m0x0.t(fetVar, boolValueOf, (Function2) objP5);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar, jm40Var);
            mkd.c0.getClass();
            fetVar.i0();
            int i4 = i3;
            boolean z2 = fetVar.S;
            Function0 function0 = e7z.u1;
            if (z2) {
                fetVar.l(function0);
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
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(o7k0.s(jm40Var, 40.0f), 36.0f);
            boolean z3 = !z;
            boolean z4 = (i4 & 57344) == 16384;
            Object objP6 = fetVar.P();
            if (z4 || objP6 == obj) {
                objP6 = new e0(function1, (byte) 26);
                fetVar.o0(objP6);
            }
            mm40 mm40VarW = y860.W(mm40VarE, null, null, z3, null, (Function0) objP6, 24);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarW);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(function0);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            mm40 mm40VarB = jr8.f16991a.b(jm40Var, gqw0.e);
            pm80 pm80VarF = a8k0.F(zBooleanValue ? R.drawable.ic_glyph_wallet_alt_subtract_rtl : R.drawable.ic_glyph_wallet_alt_subtract, 0, fetVar);
            androidx.compose.runtime.d dVar = zaq0.b;
            dww.c(pm80VarF, "", mm40VarB, ((ThemeColors) fetVar.k(dVar)).getPrimary(), fetVar, 56, 0);
            dww.c(a8k0.F(zBooleanValue ? R.drawable.ic_glyph_update_rtl : R.drawable.ic_glyph_update, 0, fetVar), "", i120.Q(a8k0.I(s5x0.N(jm40Var, 20.0f, 16.0f, 0.0f, 4.0f, 4), ((Number) t33Var.d()).floatValue()), ((ThemeColors) fetVar.k(dVar)).getBackground(), vgg0.a(16.0f)), ((ThemeColors) fetVar.k(dVar)).getPrimary(), fetVar, 56, 0);
            fetVar.r(true);
            yx7 yx7Var = gqw0.k;
            zq8.a(0, fetVar, i120.Q(o7k0.e(o7k0.s(new ecu0(yx7Var), 1.0f), 20.0f), ((ThemeColors) fetVar.k(dVar)).getSeparator(), jd8.n));
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(-1049733068, new i4a0(zBooleanValue, pz40Var, str, str2), fetVar), fetVar, 56);
            dww.c(a8k0.F(R.drawable.ic_glyph_chevron_down_small, 0, fetVar), null, s5x0.N(twn.l(yx7Var, o7k0.n(jm40Var, 24.0f)), 0.0f, 0.0f, 8.0f, 0.0f, 11), ((ThemeColors) fetVar.k(dVar)).getSecondary(), fetVar, 56, 0);
            fetVar.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mg((byte) 0, i2, (wdr) function1, (Object) mm40Var2, (Object) str, (Object) str2, z);
        }
    }

    public static w7x b0(xen xenVar, kkf0 kkf0Var, long j2, int i2) {
        if ((i2 & 2) != 0) {
            kkf0Var = kkf0.f18436a;
        }
        if ((i2 & 4) != 0) {
            j2 = 0;
        }
        return new w7x(xenVar, kkf0Var, j2);
    }

    public static final void c(boolean z, boolean z2, Function1 function1, mm40 mm40Var, String str, String str2, boolean z3, fet fetVar, int i2) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        function1.getClass();
        fetVar2.g0(1687231722);
        int i3 = (fetVar2.h(z3) ? 1048576 : 524288) | i2 | (fetVar2.h(z) ? 4 : 2) | (fetVar2.h(z2) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128) | 3072 | (fetVar2.g(str) ? 16384 : 8192) | (fetVar2.g(str2) ? 131072 : 65536);
        if (fetVar2.U(i3 & 1, (599187 & i3) != 599186)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = o7k0.e(jm40Var, 52.0f);
            zfn zfnVar = zaq0.b;
            mm40 mm40VarK = s5x0.K(i120.Q(mm40VarE, ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent(), jd8.n), 12.0f, 8.0f);
            lw3 lw3Var = uc9.f35418a;
            yx7 yx7Var = gqw0.j;
            thg0 thg0VarA = shg0.a(lw3Var, yx7Var, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarK);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z4 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z4) {
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
            mm40 mm40VarQ = i120.Q(ohs0.i(fetVar2, mm40VarC0, shdVar4, 1.0f, true), ((ThemeColors) fetVar2.k(zfnVar)).getBackground(), vgg0.a(10.0f));
            boolean z5 = (i3 & 896) == 256;
            Object objP = fetVar2.P();
            if (z5 || objP == ukd.f35823a) {
                objP = new e0(function1, (byte) 25);
                fetVar2.o0(objP);
            }
            mm40 mm40VarW = y860.W(mm40VarQ, null, null, false, null, (Function0) objP, 28);
            thg0 thg0VarA2 = shg0.a(lw3Var, yx7Var, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarW);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA2, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            int i4 = i3 >> 6;
            b(null, z3, str, str2, function1, fetVar2, ((i3 >> 15) & 112) | (i4 & 896) | (i4 & 7168) | (57344 & (i3 << 6)));
            fetVar2 = fetVar2;
            fetVar2.r(true);
            a(i3 & 1022, fetVar2, s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), function1, z, z2);
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new lg(z, z2, function1, mm40Var2, str, str2, z3, i2);
        }
    }

    public static ig00 c0(ig00 ig00Var) {
        ig00Var.getClass();
        if (ig00Var.isDone()) {
            return ig00Var;
        }
        tu9 tu9Var = new tu9();
        tu9Var.c = new msf0();
        wu9 wu9Var = new wu9(tu9Var);
        tu9Var.b = wu9Var;
        tu9Var.f34540a = hne.class;
        try {
            e0(false, ig00Var, tu9Var, bnk.a());
            tu9Var.f34540a = "nonCancellationPropagating[" + ig00Var + "]";
        } catch (Exception e2) {
            wu9Var.b(e2);
        }
        return wu9Var;
    }

    public static final void d(mm40 mm40Var, pe0 pe0Var, float f2, Function1 function1, Function1 function2, Function1 function3, fet fetVar, int i2) {
        mm40 mm40Var2;
        mm40 mm40VarE;
        pe0Var.getClass();
        fetVar.g0(-1303521352);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? fetVar.g(pe0Var) : fetVar.i(pe0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.d(f2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.i(function2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar.i(function3) ? 131072 : 65536;
        }
        if (fetVar.U(i3 & 1, (74899 & i3) != 74898)) {
            zcl zclVar = qmk.f28987a;
            boolean zIsNaN = Float.isNaN(f2);
            cl5 cl5Var = ukd.f35823a;
            jm40 jm40Var = jm40.b;
            if (zIsNaN) {
                fetVar.e0(1890148826);
                boolean zD = fetVar.d(52.0f);
                Object objP = fetVar.P();
                if (zD || objP == cl5Var) {
                    objP = new ahd((byte) 19);
                    fetVar.o0(objP);
                }
                mm40VarE = knx.Q(jm40Var, (xdr) objP);
                fetVar.r(false);
            } else {
                fetVar.e0(1890727441);
                fetVar.r(false);
                mm40VarE = o7k0.e(o7k0.s(jm40Var, f2), (f2 / 1.6666666f) + 52.0f);
            }
            mm40 mm40Var3 = mm40VarE;
            if (pe0Var instanceof st0) {
                fetVar.e0(1890914743);
                f(mm40Var3, (st0) pe0Var, function1, function3, fetVar, (i3 & 112) | ((i3 >> 3) & 896) | ((i3 >> 6) & 7168));
                fetVar.r(false);
            } else if (pe0Var instanceof ra0) {
                fetVar.e0(1891202237);
                int i4 = i3 & 112;
                boolean z = (i4 == 32 || ((i3 & 64) != 0 && fetVar.i(pe0Var))) | ((57344 & i3) == 16384);
                Object objP2 = fetVar.P();
                if (z || objP2 == cl5Var) {
                    objP2 = new ct0(function2, pe0Var, (byte) 1);
                    fetVar.o0(objP2);
                }
                e(y860.W(mm40Var3, null, null, false, null, (Function0) objP2, 28), (ra0) pe0Var, fetVar, i4);
                fetVar.r(false);
            } else if (pe0Var instanceof fp1) {
                fetVar.e0(1891570486);
                g(0, fetVar, mm40Var3);
                fetVar.r(false);
            } else {
                fetVar.e0(1891687914);
                fetVar.r(false);
            }
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ht0(mm40Var2, pe0Var, f2, function1, function2, function3, i2, (byte) 1);
        }
    }

    public static final mm40 d0(mm40 mm40Var, Function1 function1) {
        return mm40Var.e(new gh60(function1));
    }

    public static final void e(mm40 mm40Var, ra0 ra0Var, fet fetVar, int i2) {
        int i3;
        byte b;
        fet fetVar2 = fetVar;
        fetVar2.g0(838037555);
        if ((i2 & 6) == 0) {
            i3 = i2 | (fetVar2.g(mm40Var) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? fetVar2.g(ra0Var) : fetVar2.i(ra0Var) ? 32 : 16;
        }
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = lgb.J(mm40Var, vgg0.a(16.0f));
            zfn zfnVar = zaq0.b;
            mm40 mm40VarQ = i120.Q(mm40VarJ, ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent(), jd8.n);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarQ);
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
            jm40 jm40Var = jm40.b;
            mm40 mm40VarB = jr8.f16991a.b(s5x0.J(o7k0.y(jm40Var, null, 3), 8.0f), gqw0.e);
            x5d x5dVarA = w5d.a(new qw3(12.0f, true, new jf4((byte) 14)), gqw0.n, fetVar2, 48);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarB);
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
            ra0Var.getClass();
            dww.c(a8k0.F(R.drawable.ic_glyph_plus_small, 0, fetVar2), null, null, ((ThemeColors) fetVar2.k(zfnVar)).getPrimary(), fetVar2, 56, 4);
            b = 1;
            v8q0.a(ra0Var.f30110a, o7k0.w(o7k0.d(jm40Var, 1.0f), null, false, 3), ((ThemeColors) fetVar2.k(zfnVar)).getPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar, 48, 24960, 109560);
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            b = 1;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new et0(mm40Var, ra0Var, i2, b);
        }
    }

    public static void e0(boolean z, ig00 ig00Var, tu9 tu9Var, bnk bnkVar) {
        ig00Var.getClass();
        tu9Var.getClass();
        bnkVar.getClass();
        byte b = 0;
        ig00Var.a(new mfr(ig00Var, new a7q(tu9Var), b), bnkVar);
        if (z) {
            tu9Var.a(new kfr(ig00Var, b), bnk.a());
        }
    }

    public static final void f(mm40 mm40Var, st0 st0Var, Function1 function1, Function1 function2, fet fetVar, int i2) {
        int i3;
        st0 st0Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(115165169);
        byte b = 2;
        if ((i2 & 6) == 0) {
            i3 = (fetVar2.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.g(st0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar2.i(function1) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar2.i(function2) ? 2048 : 1024;
        }
        int i4 = i3;
        if (fetVar2.U(i4 & 1, (i4 & 1171) != 1170)) {
            mtr mtrVar = st0Var.d;
            boolean z = mtrVar != null && mtrVar.f22382a > 0;
            zfn zfnVar = zaq0.b;
            long backgroundContent = ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent();
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarQ = i120.Q(mm40Var, backgroundContent, vgg0.a(16.0f));
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = dw9.j(fetVar2);
            }
            gy40 gy40Var = (gy40) objP;
            int i5 = i4 & 112;
            boolean z2 = ((i4 & 7168) == 2048) | (i5 == 32);
            Object objP2 = fetVar2.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new dt0(function2, st0Var, b);
                fetVar2.o0(objP2);
            }
            mm40 mm40VarW = y860.W(mm40VarQ, gy40Var, null, false, null, (Function0) objP2, 28);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarW);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z3 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z3) {
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
            jm40 jm40Var = jm40.b;
            mm40 mm40VarO = ny9.O(1.6666666f, o7k0.d(s5x0.N(jm40Var, 4.0f, 4.0f, 4.0f, 0.0f, 8), 1.0f), false);
            zx7 zx7Var = gqw0.b;
            jr8 jr8Var = jr8.f16991a;
            mm40 mm40VarJ = lgb.J(jr8Var.b(mm40VarO, zx7Var), vgg0.a(12.0f));
            boolean z4 = z;
            j0x.b(lv00.T(st0Var.e, st0Var.f, null, null, fetVar, 0, 12), null, mm40VarJ, null, gqw0.A, 0.0f, null, fetVar, 24624, 104);
            mm40 mm40VarB = jr8Var.b(s5x0.L(o7k0.e(jm40Var, 52.0f), 8.0f, 0.0f, 2), gqw0.h);
            x5d x5dVarA = w5d.a(new qw3(2.0f, false, new gne(gqw0.k, (byte) 11)), gqw0.m, fetVar, 0);
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
            byte b2 = 3;
            st0Var2 = st0Var;
            v8q0.a(st0Var.b, o7k0.w(o7k0.d(jm40Var, 1.0f), null, false, 3), ((ThemeColors) fetVar.k(zfnVar)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.m(), fetVar, 48, 24960, 110584);
            v8q0.a(st0Var2.c, o7k0.w(o7k0.d(jm40Var, 1.0f), null, false, 3), ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.g(), fetVar, 48, 24960, 110584);
            fetVar2 = fetVar;
            fetVar2.r(true);
            h(null, st0Var2.h, z4, fetVar2, 6);
            if (z4) {
                fetVar2.e0(-147434305);
                mm40 mm40VarQ2 = ffb0.Q(jr8Var.b(jm40Var, gqw0.c), -4.0f, 4.0f);
                boolean z5 = (i5 == 32) | ((i4 & 896) == 256);
                Object objP3 = fetVar2.P();
                if (z5 || objP3 == cl5Var) {
                    objP3 = new dt0(function1, st0Var2, b2);
                    fetVar2.o0(objP3);
                }
                mm40 mm40VarJ2 = s5x0.J(y860.W(mm40VarQ2, null, null, true, null, (Function0) objP3, 24), 4.0f);
                zcl zclVar2 = qmk.f;
                mm40 mm40VarE = h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarJ2);
                StaticColors staticColors = StaticColors.INSTANCE;
                dww.c(a8k0.F(st0Var2.d.f22382a, 0, fetVar2), null, s5x0.J(i120.Q(mm40VarE, staticColors.m75getBlack600d7_KjU(), jd8.n), 6.0f), staticColors.m123getWhite0d7_KjU(), fetVar2, 56, 0);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-146644053);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            st0Var2 = st0Var;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new it0(mm40Var, st0Var2, function1, function2, i2, (byte) 1);
        }
    }

    public static ukf0 f0(int i2, jmy jmyVar, kkf0 kkf0Var, int i3) {
        if ((i3 & 4) != 0) {
            kkf0Var = kkf0.f18436a;
        }
        return new ukf0(i2, jmyVar, kkf0Var, 0L);
    }

    public static final void g(int i2, fet fetVar, mm40 mm40Var) {
        fetVar.g0(-1017031226);
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            qxw.o(fetVar, xbc.c0(h97.e(zclVar, zclVar, zclVar, zclVar, mm40Var), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eg(mm40Var, i2, (byte) 6);
        }
    }

    public static nul0 g0(float f2, float f3, Object obj, int i2) {
        if ((i2 & 1) != 0) {
            f2 = 1.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 1500.0f;
        }
        if ((i2 & 4) != 0) {
            obj = null;
        }
        return new nul0(f2, f3, obj);
    }

    public static final void h(mm40 mm40Var, nur nurVar, boolean z, fet fetVar, int i2) {
        mm40 mm40Var2;
        fetVar.g0(1104767000);
        int i3 = i2 | 48 | (fetVar.g(nurVar) ? 256 : 128) | (fetVar.h(z) ? 2048 : 1024);
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            if (nurVar != null) {
                boolean z2 = nurVar instanceof mur;
                mm40Var2 = jm40.b;
                if (z2) {
                    fetVar.e0(-220445920);
                    mm40 mm40VarD = o7k0.d(jr8.f16991a.b(mm40Var2, gqw0.f11754a), 1.0f);
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarM = s5x0.M(mm40VarD, 8.0f, 8.0f, z ? 46.0f : 8.0f, 8.0f);
                    thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
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
                    jpm0.o(fetVar, thg0VarA, gqw0.x);
                    jpm0.o(fetVar, bh90VarM, gqw0.w);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar);
                    mm40 mm40VarE = ohs0.i(fetVar, mm40VarC0, gqw0.v, 1.0f, false).e(new dyj0(vgg0.a(8.0f), new kjj0(10.0f, 60, ((StaticColors) fetVar.k(m8m0.f21378a)).m75getBlack600d7_KjU(), 0L)));
                    mur murVar = (mur) nurVar;
                    j6n.h(murVar.f22425a, murVar.b, mm40VarE, 0, 0, fetVar, 0, 24);
                    fetVar.r(true);
                    fetVar.r(false);
                } else if (nurVar instanceof lur) {
                    fetVar.e0(-217701304);
                    fetVar.r(false);
                }
            }
            throw b1j.f(824172933, fetVar, false);
        }
        fetVar.X();
        mm40Var2 = mm40Var;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mt0(mm40Var2, nurVar, z, i2, (byte) 0);
        }
    }

    public static final boolean h0(b1u0 b1u0Var, o0u0 o0u0Var) {
        List list = o0u0Var.c;
        List<x0u0> list2 = b1u0Var.e;
        if (list2.size() != 5 || list.size() != 5) {
            return false;
        }
        if (list2 == null || !list2.isEmpty()) {
            for (x0u0 x0u0Var : list2) {
                if (x0u0Var.f40090a <= 0 || x0u0Var.b.length() <= 0) {
                    return false;
                }
            }
        }
        if (list == null || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((p0u0) it.next()).f26170a <= 0) {
                    return false;
                }
            }
        }
        return b1u0Var.c.length() > 0;
    }

    public static final void i(mm40 mm40Var, l7m0 l7m0Var, float f2, float f3, fu1 fu1Var, Function0 function0, fet fetVar, int i2) {
        int i3;
        fet fetVar2;
        a4x a4xVar;
        shd shdVar;
        l7m0 l7m0Var2;
        int i4;
        fet fetVar3;
        jr8 jr8Var;
        jm40 jm40Var;
        shd shdVar2;
        shd shdVar3;
        boolean z;
        boolean z2;
        boolean z3;
        pcy pcyVar;
        pge pgeVar = gqw0.A;
        Float fValueOf = Float.valueOf(0.0f);
        fu1Var.getClass();
        String str = fu1Var.c;
        String str2 = fu1Var.b;
        function0.getClass();
        fetVar.g0(-1252375445);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(l7m0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.d(f2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.d(f3) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.g(fu1Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar.i(function0) ? 131072 : 65536;
        }
        int i5 = i3;
        if (fetVar.U(i5 & 1, (i5 & 74899) != 74898)) {
            Object[] objArr = {l7m0Var.getValue()};
            int i6 = i5 & 112;
            boolean z4 = i6 == 32;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            byte b = 6;
            if (z4 || objP == cl5Var) {
                objP = new jb(l7m0Var, b);
                fetVar.o0(objP);
            }
            l7m0 l7m0VarY = v3c.Y(objArr, (Function0) objP, fetVar);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarK = lgb.K(o7k0.e(mm40Var, (((Number) l7m0Var.getValue()).floatValue() * (-172.0f)) + 228.0f + f2));
            zx7 zx7Var = gqw0.f11754a;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarK);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z5 = fetVar.S;
            pcy pcyVar2 = e7z.u1;
            if (z5) {
                fetVar.l(pcyVar2);
            } else {
                fetVar.r0();
            }
            shd shdVar4 = gqw0.x;
            jpm0.o(fetVar, tj30VarC, shdVar4);
            shd shdVar5 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar5);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar6 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar6);
            jpm0.n(fetVar);
            shd shdVar7 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar7);
            a4x a4xVar2 = fu1Var.d;
            if (str.length() == 0) {
                fetVar.e0(-90324120);
                i4 = i6;
                a4xVar = a4xVar2;
                l7m0Var2 = l7m0VarY;
                shdVar = shdVar5;
                j0x.b(a8k0.F(R.drawable.ic_tournament_banner, 0, fetVar), null, o7k0.c, null, pgeVar, 0.0f, null, fetVar, 25016, 104);
                fetVar3 = fetVar;
                fetVar3.r(false);
            } else {
                a4xVar = a4xVar2;
                shdVar = shdVar5;
                l7m0Var2 = l7m0VarY;
                i4 = i6;
                fetVar.e0(-90044500);
                k7x.b(Uri.parse(str), null, o7k0.c, a8k0.F(R.drawable.ic_tournament_banner, 0, fetVar), a8k0.F(R.drawable.ic_tournament_banner, 0, fetVar), a8k0.F(R.drawable.ic_tournament_banner, 0, fetVar), null, null, null, null, pgeVar, null, fetVar, 299440, 6, 31680);
                fetVar3 = fetVar;
                fetVar3.r(false);
            }
            zx7 zx7Var2 = gqw0.b;
            jr8 jr8Var2 = jr8.f16991a;
            jm40 jm40Var2 = jm40.b;
            pcy pcyVar3 = pcyVar2;
            zq8.a(0, fetVar3, i120.P(o7k0.e(o7k0.d(jr8Var2.b(jm40Var2, zx7Var2), 1.0f), 80.0f), yk5.o(new Pair[]{new Pair(fValueOf, new y3d(afn0.p(fetVar3).m71getBlack300d7_KjU())), new Pair(Float.valueOf(1.0f), new y3d(afn0.p(fetVar3).m121getTransparent0d7_KjU()))}), null, 6));
            zx7 zx7Var3 = gqw0.h;
            zq8.a(0, fetVar3, i120.P(o7k0.e(o7k0.d(jr8Var2.b(jm40Var2, zx7Var3), 1.0f), 152.0f), yk5.o(new Pair[]{new Pair(fValueOf, new y3d(afn0.p(fetVar3).m121getTransparent0d7_KjU())), new Pair(Float.valueOf(0.3f), new y3d(afn0.p(fetVar3).m71getBlack300d7_KjU())), new Pair(Float.valueOf(0.7f), new y3d(afn0.p(fetVar3).m78getBlack800d7_KjU()))}), null, 6));
            if (str2.length() > 0) {
                fetVar3.e0(-88436561);
                mm40 mm40VarB = jr8Var2.b(jm40Var2, gqw0.g);
                boolean z6 = i4 == 32;
                Object objP2 = fetVar3.P();
                if (z6 || objP2 == cl5Var) {
                    objP2 = new yd1(l7m0Var, (byte) 7);
                    fetVar3.o0(objP2);
                }
                mm40 mm40VarN = s5x0.N(s5x0.L(i4w0.T(mm40VarB, (Function1) objP2), 16.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, f3 + 12.0f, 7);
                x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar3, 0);
                int iHashCode2 = Long.hashCode(fetVar3.T);
                bh90 bh90VarM2 = fetVar3.m();
                mm40 mm40VarC1 = kbc.c0(fetVar3, mm40VarN);
                fetVar3.i0();
                if (fetVar3.S) {
                    pcyVar = pcyVar3;
                    fetVar3.l(pcyVar);
                } else {
                    pcyVar = pcyVar3;
                    fetVar3.r0();
                }
                jpm0.o(fetVar3, x5dVarA, shdVar4);
                jpm0.o(fetVar3, bh90VarM2, shdVar);
                vqd.u(iHashCode2, fetVar3, shdVar6, fetVar3);
                shdVar2 = shdVar7;
                jpm0.o(fetVar3, mm40VarC1, shdVar2);
                afn0.v(fetVar3).getClass();
                pcyVar3 = pcyVar;
                jm40Var = jm40Var2;
                jr8Var = jr8Var2;
                shdVar3 = shdVar4;
                v8q0.a(str2, null, afn0.p(fetVar3).m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, g1t0.s(), fetVar, 0, 24960, 110586);
                str2 = str2;
                fetVar3 = fetVar;
                if (a4xVar.isEmpty()) {
                    z2 = false;
                    fetVar3.e0(-1153561275);
                    fetVar3.r(false);
                } else {
                    fetVar3.e0(-1153838043);
                    z2 = false;
                    i120.e(0, fetVar3, a4xVar, s5x0.N(o7k0.d(jm40Var, 1.0f), 0.0f, 12.0f, 0.0f, 0.0f, 13));
                    fetVar3.r(false);
                }
                z = true;
                fetVar3.r(true);
                fetVar3.r(z2);
            } else {
                jr8Var = jr8Var2;
                jm40Var = jm40Var2;
                shdVar2 = shdVar7;
                shdVar3 = shdVar4;
                z = true;
                z2 = false;
                fetVar3.e0(-87408291);
                fetVar3.r(false);
            }
            mm40 mm40VarB2 = jr8Var.b(jm40Var, zx7Var);
            boolean z7 = i4 == 32 ? z : z2;
            Object objP3 = fetVar3.P();
            if (z7 || objP3 == cl5Var) {
                objP3 = new yd1(l7m0Var, (byte) 8);
                fetVar3.o0(objP3);
            }
            mm40 mm40VarT = i4w0.T(mm40VarB2, (Function1) objP3);
            jm40 jm40Var3 = jm40Var;
            jr8 jr8Var3 = jr8Var;
            shd shdVar8 = shdVar;
            mm40 mm40VarN2 = s5x0.N(mm40VarT, 0.0f, f2, 0.0f, 0.0f, 13);
            long jM121getTransparent0d7_KjU = afn0.p(fetVar3).m121getTransparent0d7_KjU();
            jlm jlmVar = jlm.f16723a;
            mlm mlmVar = mlm.f21997a;
            fmm fmmVar = fmm.f9790a;
            int i7 = (i5 >> 6) & 7168;
            pcy pcyVar4 = pcyVar3;
            fet fetVar4 = fetVar3;
            String str3 = str2;
            hlm.c(mm40VarN2, new imm(jlmVar, mlmVar, fmmVar, jM121getTransparent0d7_KjU, false, null), null, function0, null, null, null, null, null, null, null, null, fetVar4, i7, 0, 4084);
            fetVar2 = fetVar4;
            if (((Number) l7m0Var2.getValue()).floatValue() > 0.0f) {
                fetVar2.e0(-86588868);
                mm40 mm40VarB3 = jr8Var3.b(jm40Var3, zx7Var2);
                l7m0 l7m0Var3 = l7m0Var2;
                boolean zG = fetVar2.g(l7m0Var3);
                Object objP4 = fetVar2.P();
                if (zG || objP4 == cl5Var) {
                    objP4 = new yd1(l7m0Var3, (byte) 9);
                    fetVar2.o0(objP4);
                }
                mm40 mm40VarQ = i120.Q(o7k0.e(o7k0.d(i4w0.T(mm40VarB3, (Function1) objP4), 1.0f), f2 + 56.0f), afn0.m(fetVar2).getBackgroundContent(), jd8.n);
                tj30 tj30VarC2 = zq8.c(zx7Var, false);
                int iHashCode3 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM3 = fetVar2.m();
                mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarQ);
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar4);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, tj30VarC2, shdVar3);
                jpm0.o(fetVar2, bh90VarM3, shdVar8);
                vqd.u(iHashCode3, fetVar2, r22, fetVar2);
                jpm0.o(fetVar2, mm40VarC2, shdVar2);
                hlm.c(jr8Var3.b(jm40Var3, zx7Var3), new imm(new ilm(afn0.m(fetVar2).getSecondary()), new plm(str3, afn0.m(fetVar2).getSecondary(), fa50.f9191a), fmmVar, afn0.m(fetVar2).getBackgroundContent(), false, null), null, function0, null, null, null, null, null, null, null, null, fetVar2, i7, 0, 4084);
                fetVar2 = fetVar2;
                z3 = true;
                fetVar2.r(true);
                fetVar2.r(false);
            } else {
                z3 = true;
                fetVar2.e0(-85265571);
                fetVar2.r(false);
            }
            fetVar2.r(z3);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cu1(mm40Var, l7m0Var, f2, f3, fu1Var, function0, i2, (byte) 1);
        }
    }

    public static final edy i0(ru6 ru6Var) {
        ru6Var.getClass();
        bzu bzuVar = new bzu((byte) 19);
        cww.G(bzuVar, "Coef", ru6Var.b);
        cww.F(bzuVar, "GameId", Long.valueOf(ru6Var.d));
        cww.F(bzuVar, "Kind", Integer.valueOf(ru6Var.e.f36034a));
        cww.G(bzuVar, "Param", new BigDecimal(String.valueOf(ru6Var.f)).toPlainString());
        cww.F(bzuVar, "PlayerId", Long.valueOf(ru6Var.g));
        cww.F(bzuVar, "Type", Long.valueOf(ru6Var.h));
        zfa0 zfa0Var = ru6Var.i;
        xfa0 xfa0Var = zfa0Var instanceof xfa0 ? (xfa0) zfa0Var : null;
        if (xfa0Var != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            ArrayList arrayList = new ArrayList();
            Iterator it = xfa0Var.b.iterator();
            while (it.hasNext()) {
                jdy jdyVarB = ncy.b(Long.valueOf(((Number) it.next()).longValue()));
                jdyVarB.getClass();
                arrayList.add(jdyVarB);
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = xfa0Var.c.iterator();
            while (it2.hasNext()) {
                jdy jdyVarB2 = ncy.b(Long.valueOf(((Number) it2.next()).longValue()));
                jdyVarB2.getClass();
                arrayList2.add(jdyVarB2);
            }
            bzuVar.h(new edy(linkedHashMap), "PlayersDuel");
        }
        cww.F(bzuVar, "UiFeature", Integer.valueOf(ru6Var.j));
        Double d2 = ru6Var.k;
        if (d2 != null) {
            double dDoubleValue = d2.doubleValue();
            if (dDoubleValue != 0.0d) {
                cww.F(bzuVar, "OptionLowerCf", Double.valueOf(dDoubleValue));
            }
        }
        return bzuVar.a();
    }

    public static final void j(int i2, fet fetVar) {
        fet fetVar2;
        fetVar.g0(45143629);
        if (fetVar.U(i2 & 1, i2 != 0)) {
            mm40 mm40VarQ = i120.Q(o7k0.c, ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), jd8.n);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarQ, qmk.a(fetVar).c, 4.0f, qmk.a(fetVar).c, 0.0f, 8);
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
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
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = o7k0.e(o7k0.d(jm40Var, 1.0f), 230.0f);
            zcl zclVar2 = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), vbc.d0(null, fetVar, 0, 1)));
            fetVar.e0(-343231659);
            int iB = 0;
            while (iB < 3) {
                mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                zcl zclVar3 = qmk.f28987a;
                mm40 mm40VarE2 = o7k0.e(mm40VarD, 132.0f);
                zcl zclVar4 = qmk.g;
                iB = h97.b(h97.e(zclVar4, zclVar4, zclVar4, zclVar4, mm40VarE2), vbc.d0(null, fetVar, 0, 1), fetVar, 0, iB, 1);
            }
            fetVar2 = fetVar;
            fetVar2.r(false);
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new i87(i2, (byte) 16);
        }
    }

    public static final a4x j0(List list, long j2, boolean z, qil0 qil0Var, ovm0 ovm0Var) {
        Integer numValueOf;
        ArrayList arrayList;
        boolean z2 = qil0Var instanceof mil0;
        Iterator it = list.iterator();
        if (it.hasNext()) {
            numValueOf = Integer.valueOf(((List) it.next()).size());
            while (it.hasNext()) {
                Integer numValueOf2 = Integer.valueOf(((List) it.next()).size());
                if (numValueOf.compareTo(numValueOf2) < 0) {
                    numValueOf = numValueOf2;
                }
            }
        } else {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
        if (z2) {
            IntRange intRangeO = l1e0.o(0, iIntValue);
            arrayList = new ArrayList();
            Iterator it2 = intRangeO.iterator();
            while (((kkx) it2).c) {
                int iNextInt = ((bkx) it2).nextInt();
                ArrayList arrayList2 = new ArrayList();
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    hao haoVar = (hao) CollectionsKt.W(iNextInt, (List) it3.next());
                    iao iaoVarG0 = haoVar != null ? ulb.g0(haoVar, j2, z, ovm0Var) : null;
                    if (iaoVarG0 != null) {
                        arrayList2.add(iaoVarG0);
                    }
                }
                ArrayList arrayList3 = new ArrayList(r3d.q(arrayList2, 10));
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    arrayList3.add(kotlin.collections.a.c((kao) it4.next()));
                }
                w3d.u(arrayList, arrayList3);
            }
        } else {
            IntRange intRangeO2 = l1e0.o(0, iIntValue);
            arrayList = new ArrayList(r3d.q(intRangeO2, 10));
            Iterator it5 = intRangeO2.iterator();
            while (((kkx) it5).c) {
                int iNextInt2 = ((bkx) it5).nextInt();
                ArrayList arrayList4 = new ArrayList(r3d.q(list, 10));
                Iterator it6 = list.iterator();
                while (it6.hasNext()) {
                    hao haoVar2 = (hao) CollectionsKt.W(iNextInt2, (List) it6.next());
                    arrayList4.add(haoVar2 != null ? ulb.g0(haoVar2, j2, z, ovm0Var) : jao.f16199a);
                }
                arrayList.add(arrayList4);
            }
        }
        ArrayList arrayList5 = new ArrayList(r3d.q(arrayList, 10));
        Iterator it7 = arrayList.iterator();
        while (it7.hasNext()) {
            arrayList5.add(hic.G((List) it7.next(), qil0Var));
        }
        return dyb.o0(arrayList5);
    }

    public static final void k(imm immVar, mdm mdmVar, Function1 function1, fet fetVar, int i2) {
        imm immVar2;
        int i3;
        Function1 function2 = function1;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1060478224);
        if ((i2 & 6) == 0) {
            immVar2 = immVar;
            i3 = (fetVar2.g(immVar2) ? 4 : 2) | i2;
        } else {
            immVar2 = immVar;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.g(mdmVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar2.i(function2) ? 256 : 128;
        }
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            n0q n0qVar = o7k0.c;
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, n0qVar);
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
            mm40 mm40VarW = o050.W(jm40.b);
            int i4 = i3 & 896;
            boolean z2 = i4 == 256;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = new yqz(function2, (byte) 10);
                fetVar2.o0(objP);
            }
            int i5 = i3;
            hlm.c(mm40VarW, immVar2, null, (Function0) objP, null, null, null, null, null, null, null, null, fetVar, ((i3 << 3) & 112) | 805306368, 54, 500);
            fetVar2 = fetVar;
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarQ = i120.Q(n0qVar, s6t0.b().f33626a.getBackground(), jd8.n);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarQ);
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
            boolean z3 = i4 == 256;
            Object objP2 = fetVar2.P();
            if (z3 || objP2 == cl5Var) {
                function2 = function1;
                objP2 = new yqz(function2, (byte) 11);
                fetVar2.o0(objP2);
            } else {
                function2 = function1;
            }
            jcb.l(null, mdmVar, false, (Function0) objP2, fetVar2, i5 & 112, 5);
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cf7(immVar, mdmVar, function2, i2, (byte) 2);
        }
    }

    public static qbb k0(ig00 ig00Var, zy3 zy3Var, Executor executor) {
        qbb qbbVar = new qbb(zy3Var, ig00Var);
        ig00Var.a(qbbVar, executor);
        return qbbVar;
    }

    public static final void l(mom0 mom0Var, mm40 mm40Var, fet fetVar, int i2) {
        byte b;
        mm40 mm40Var2;
        String strQ;
        jm40 jm40Var;
        fet fetVar2 = fetVar;
        fetVar2.g0(-91783992);
        int i3 = i2 | (fetVar2.g(mom0Var) ? 4 : 2) | 48;
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            if (mom0Var instanceof kom0) {
                strQ = ((kom0) mom0Var).f18638a;
            } else if (mom0Var instanceof jom0) {
                strQ = ((jom0) mom0Var).f16866a;
            } else if (!(mom0Var instanceof lom0)) {
                t9f.b();
                return;
            } else {
                lom0 lom0Var = (lom0) mom0Var;
                strQ = w6x.q(lom0Var.f20400a, Separators.SP, lom0Var.b);
            }
            int length = strQ.length();
            jm40 jm40Var2 = jm40.b;
            if (length > 0) {
                fetVar2.e0(1557721984);
                mm40 mm40VarD = o7k0.d(jm40Var2, 1.0f);
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarN = s5x0.N(mm40VarD, 0.0f, 12.0f, 0.0f, 0.0f, 13);
                long j2 = qmk.p;
                long j3 = qmk.q;
                b = 0;
                jm40Var = jm40Var2;
                v8q0.a(strQ, mm40VarN, ((StaticColors) fetVar2.k(m8m0.f21378a)).m123getWhite0d7_KjU(), new n05(j2, j3, qmk.n), 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, new y9q0(0L, j3, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar, 0, 24960, 109552);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                jm40Var = jm40Var2;
                b = 0;
                fetVar2.e0(1558214202);
                fetVar2.r(false);
            }
            mm40Var2 = jm40Var;
        } else {
            b = 0;
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new un8(mom0Var, mm40Var2, i2, b);
        }
    }

    public static void l0(View view, float[] fArr, float[] fArr2, int[] iArr) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            l0((View) parent, fArr, fArr2, iArr);
            cy2.G(fArr, -view.getScrollX(), -view.getScrollY(), fArr2);
            cy2.G(fArr, view.getLeft(), view.getTop(), fArr2);
        } else {
            view.getLocationInWindow(iArr);
            cy2.G(fArr, -view.getScrollX(), -view.getScrollY(), fArr2);
            cy2.G(fArr, iArr[0], iArr[1], fArr2);
        }
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        tke.b0(matrix, fArr2);
        cy2.F(fArr, fArr2);
    }

    public static final void m(mm40 mm40Var, uh90 uh90Var, fet fetVar, int i2) {
        fetVar.g0(941248931);
        int i3 = i2 | 6 | (fetVar.g(uh90Var) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            zfn zfnVar = bmd.n;
            obc.d(zfnVar.a(k6z.f17794a), u1c.M(-219609501, new jv1(uh90Var, fetVar.k(zfnVar) == k6z.b), fetVar), fetVar, 56);
            mm40Var = jm40.b;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t87(mm40Var, uh90Var, i2, (byte) 29);
        }
    }

    public static uts0 m0(int i2, int i3, ghn ghnVar, int i4) {
        if ((i4 & 1) != 0) {
            i2 = 300;
        }
        if ((i4 & 2) != 0) {
            i3 = 0;
        }
        if ((i4 & 4) != 0) {
            ghnVar = ihn.f14788a;
        }
        return new uts0(i2, i3, ghnVar);
    }

    public static final void n(mm40 mm40Var, gea geaVar, boolean z, fet fetVar, int i2) {
        fet fetVar2 = fetVar;
        zx7 zx7Var = gqw0.d;
        zx7 zx7Var2 = gqw0.f;
        fetVar2.g0(31301114);
        int i3 = (i2 & 6) == 0 ? (fetVar2.g(mm40Var) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? fetVar2.g(geaVar) : fetVar2.i(geaVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar2.h(z) ? 256 : 128;
        }
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(s5x0.J(mm40Var, 4.0f), 48.0f);
            long jM125getWhite100d7_KjU = StaticColors.INSTANCE.m125getWhite100d7_KjU();
            zcl zclVar2 = qmk.c;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarN = s5x0.N(i120.Q(mm40VarE, jM125getWhite100d7_KjU, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 4.0f, 0.0f, 4.0f, 0.0f, 10);
            zx7 zx7Var3 = gqw0.f11754a;
            tj30 tj30VarC = zq8.c(zx7Var3, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarN);
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
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            zx7 zx7Var4 = z ? zx7Var2 : zx7Var;
            jr8 jr8Var = jr8.f16991a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarB = jr8Var.b(jm40Var, zx7Var4);
            tj30 tj30VarC2 = zq8.c(zx7Var3, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarB);
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
            fetVar2.e0(-461753244);
            int i4 = 0;
            for (Object obj : geaVar.f11143a) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    q3d.p();
                    throw null;
                }
                int i6 = ((una0) obj).f35951a;
                mm40 mm40VarE0 = o2e.e0(jm40Var, "CARD_CRICKET_COST_CARD_IMAGE");
                zcl zclVar3 = qmk.f28987a;
                j0x.b(a8k0.F(i6, 0, fetVar2), null, o7k0.s(o7k0.e(s5x0.N(mm40VarE0, 20.0f * i4, 4.0f, 0.0f, 0.0f, 12), 40.0f), 28.0f), null, gqw0.A, 0.0f, null, fetVar2, 24632, 104);
                i4 = i5;
                jr8Var = jr8Var;
            }
            jr8 jr8Var2 = jr8Var;
            fetVar2.r(false);
            fetVar2.r(true);
            mm40 mm40VarB2 = jr8Var2.b(o2e.e0(jm40Var, "CARD_CRICKET_COST_POINTS_TEXT"), z ? zx7Var : zx7Var2);
            StaticColors staticColors = StaticColors.INSTANCE;
            long jM81getDarkBlue0d7_KjU = staticColors.m81getDarkBlue0d7_KjU();
            zcl zclVar4 = qmk.d;
            v8q0.a(geaVar.b, s5x0.M(i120.Q(mm40VarB2, jM81getDarkBlue0d7_KjU, new ugg0(zclVar4, zclVar4, zclVar4, zclVar4)), 4.0f, 2.0f, 4.0f, 2.0f), staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, y9q0.a(new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109), 0L, 0L, null, null, null, 0L, null, null, 0, z ? 2 : 1, 0L, null, null, 16711679), fetVar, 0, 0, 131064);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new q02((byte) 2, i2, mm40Var, (Object) geaVar, z);
        }
    }

    public static final void o(mm40 mm40Var, int i2, uh90 uh90Var, boolean z, fet fetVar, int i3) {
        fetVar.g0(1259118838);
        int i4 = i3 | 6 | (fetVar.e(i2) ? 32 : 16) | (fetVar.g(uh90Var) ? 256 : 128) | (fetVar.h(z) ? 2048 : 1024);
        if (fetVar.U(i4 & 1, (i4 & 1171) != 1170)) {
            mm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
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
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            fetVar.e0(-86489786);
            fetVar.e0(-1942452643);
            int i5 = 0;
            while (true) {
                if (i5 >= 2) {
                    fetVar.r(false);
                    break;
                }
                gea geaVar = (gea) uh90Var.get(new Pair(Integer.valueOf(i2), Integer.valueOf(i5)));
                if (geaVar == null) {
                    fetVar.r(false);
                    break;
                }
                n(o2e.e0(new x7z(1.0f, true), "CARD_CRICKET_COST_CELL_" + ((i2 * 2) + i5)), geaVar, z, fetVar, (i4 >> 3) & 896);
                i5++;
            }
            fetVar.r(false);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        mm40 mm40Var2 = mm40Var;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new q02(mm40Var2, i2, uh90Var, z, i3);
        }
    }

    public static final void p(iza izaVar, fet fetVar, int i2) {
        fetVar.g0(112609780);
        int i3 = (fetVar.g(izaVar) ? 32 : 16) | i2;
        byte b = 6;
        if (!fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            fetVar.X();
        } else if (izaVar instanceof gza) {
            fetVar.e0(843821178);
            q((gza) izaVar, fetVar, i3 & 126);
            fetVar.r(false);
        } else {
            if (!(izaVar instanceof hza)) {
                throw b1j.f(843819131, fetVar, false);
            }
            fetVar.e0(843826162);
            r(6, fetVar);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new bna(izaVar, i2, b);
        }
    }

    public static final void q(gza gzaVar, fet fetVar, int i2) {
        gza gzaVar2;
        fet fetVar2 = fetVar;
        boolean z = gzaVar.c;
        fetVar2.g0(-1134471847);
        int i3 = i2 | (fetVar2.g(gzaVar) ? 32 : 16);
        byte b = 0;
        byte b2 = 1;
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            Object[] objArr = {Boolean.valueOf(z)};
            int i4 = i3 & 112;
            boolean z2 = i4 == 32;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = new fza(gzaVar, b);
                fetVar2.o0(objP);
            }
            l7m0 l7m0VarY = v3c.Y(objArr, (Function0) objP, fetVar2);
            Object[] objArr2 = {Boolean.valueOf(z)};
            boolean z3 = i4 == 32;
            Object objP2 = fetVar2.P();
            if (z3 || objP2 == cl5Var) {
                objP2 = new fza(gzaVar, b2);
                fetVar2.o0(objP2);
            }
            l7m0 l7m0VarY2 = v3c.Y(objArr2, (Function0) objP2, fetVar2);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            boolean zG = fetVar2.g(l7m0VarY);
            Object objP3 = fetVar2.P();
            if (zG || objP3 == cl5Var) {
                objP3 = new yd1(l7m0VarY, (byte) 27);
                fetVar2.o0(objP3);
            }
            mm40 mm40VarK = rq8.K(mm40VarD, (Function1) objP3);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = s5x0.J(mm40VarK, 12.0f);
            thg0 thg0VarA = shg0.a(new qw3(12.0f, true, new jf4((byte) 14)), gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarJ);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z4 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z4) {
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
            mm40 mm40VarJ2 = s5x0.J(i120.Q(jm40Var, ((y3d) l7m0VarY2.getValue()).f41946a, vgg0.f37379a), 6.0f);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarJ2);
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
            k7x.b(gzaVar.b.a(), null, o7k0.n(jm40Var, 40.0f), a8k0.F(R.drawable.ic_glyph_color_status_unknown, 0, fetVar2), a8k0.F(R.drawable.ic_glyph_color_status_unknown, 0, fetVar2), null, null, null, null, null, gqw0.A, null, fetVar2, 36912, 6, 31712);
            fetVar2.r(true);
            x5d x5dVarA = w5d.a(new qw3(2.0f, true, new jf4((byte) 14)), gqw0.m, fetVar2, 0);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, jm40Var);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, shdVar);
            jpm0.o(fetVar2, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC2, shdVar4);
            gzaVar2 = gzaVar;
            G(0, fetVar2, s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 4.0f, 7), gzaVar2.f12172a, gzaVar2.d, gzaVar2.c);
            fetVar2 = fetVar2;
            H(0, fetVar2, null, gzaVar2.e, gzaVar2.f);
            H(0, fetVar2, null, gzaVar2.g, gzaVar2.h);
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            gzaVar2 = gzaVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new bna(gzaVar2, i2, (byte) 7);
        }
    }

    public static final void r(int i2, fet fetVar) {
        fetVar.g0(1189117550);
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarD = o7k0.d(o7k0.e(jm40.b, 80.0f), 1.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarD), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new pua(i2, (byte) 3);
        }
    }

    public static final void s(int i2, fet fetVar) {
        fet fetVar2;
        fetVar.g0(-994691397);
        if (fetVar.U(i2 & 1, i2 != 0)) {
            n0q n0qVar = o7k0.c;
            zcl zclVar = qmk.f28987a;
            float f2 = qmk.a(fetVar).d;
            lh80 lh80Var = new lh80(f2, 12.0f, f2, 12.0f);
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new y2d((byte) 8);
                fetVar.o0(objP);
            }
            fetVar2 = fetVar;
            b8k0.e(n0qVar, null, lh80Var, qw3Var, null, null, false, null, (Function1) objP, fetVar2, 817889286, 362);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new qbd(i2);
        }
    }

    public static final void t(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        fetVar.g0(-806435530);
        byte b = 4;
        int i3 = i2 | (fetVar.g(l7m0Var) ? 4 : 2) | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            m8x.y(o7k0.c, u1c.M(692265466, new p7y(l7m0Var, function1, (byte) 25), fetVar), null, null, null, 0, ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), 0L, null, u1c.M(1765996229, new xs4(l7m0Var, function1, b), fetVar), fetVar, 805306422, 444);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p7y(l7m0Var, function1, i2, (byte) 26);
        }
    }

    public static final void u(mm40 mm40Var, h0i h0iVar, float f2, Function1 function1, fet fetVar) {
        if (h0iVar instanceof g0i) {
            fetVar.e0(-1898458872);
            w(mm40Var, f2, fetVar, 0);
            fetVar.r(false);
        } else {
            if (!(h0iVar instanceof f0i)) {
                throw b1j.f(-1898461198, fetVar, false);
            }
            fetVar.e0(-1898452214);
            v(mm40Var, (f0i) h0iVar, f2, function1, fetVar, 0);
            fetVar.r(false);
        }
    }

    public static final void v(mm40 mm40Var, f0i f0iVar, float f2, Function1 function1, fet fetVar, int i2) {
        i0i i0iVar = f0iVar.b;
        fetVar.g0(1211031196);
        int i3 = i2 | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(f0iVar) ? 32 : 16) | (fetVar.d(f2) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            mm40 mm40VarL = s5x0.L(o7k0.d(mm40Var, 1.0f), f2, 0.0f, 2);
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.j, fetVar, 0);
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
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            c0i c0iVar = i0iVar != null ? c0i.c : c0i.b;
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            int i4 = i3 & 7168;
            x(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), c0iVar, f0iVar.f8718a, function1, fetVar, i4);
            if (i0iVar == null) {
                fetVar.e0(1941927911);
                fetVar.r(false);
            } else {
                fetVar.e0(1941927912);
                if (1.0f <= 0.0d) {
                    vcx.a("invalid weight; must be greater than zero");
                }
                x(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), c0iVar, f0iVar.b, function1, fetVar, i4);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new a2d(mm40Var, (Object) f0iVar, f2, (wdr) function1, i2, (byte) 4);
        }
    }

    public static final void w(mm40 mm40Var, float f2, fet fetVar, int i2) {
        fetVar.g0(-502809068);
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        if ((i2 & 48) == 0) {
            i3 |= fetVar.d(f2) ? 32 : 16;
        }
        byte b = 0;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            mm40 mm40VarL = s5x0.L(o7k0.d(mm40Var, 1.0f), f2, 0.0f, 2);
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.j, fetVar, 0);
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
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            y(0, fetVar, new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            y(0, fetVar, new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new d0i(mm40Var, f2, i2, b);
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r11v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v0 ??, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v0 ??, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v0 ??, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v0 ??, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v1 ??, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v1 ??, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v1 ??, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v1 ??, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v10 ??, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v10 ??, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v10 ??, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v10 ??, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v11 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v11 ??, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v11 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v11 ??, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v11 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v11 ??, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v11 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v11 ??, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v12 ??, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v12 ??, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v12 ??, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v12 ??, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v13 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v13 ??, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v13 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v13 ??, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v14 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v14 ??, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v14 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v14 ??, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v15 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v15 ??, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v15 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v15 ??, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v16 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v16 ??, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v16 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v16 ??, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v17 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v17 ??, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v17 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v17 ??, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v7 ??, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v7 ??, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v7 ??, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v7 ??, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v8 ??, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v8 ??, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v8 ??, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v8 ??, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r42v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r42v0 ??, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r42v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r42v0 ??, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to set immutable type for var: r42v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r42v0 ??, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to set immutable type for var: r42v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r42v0 ??, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r42v0 a.fet, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.applyResolvedVars(TypeSearch.java:100)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:76)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.runMultiVariableSearch(FixTypesVisitor.java:119)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    public static final void x(mm40 mm40Var, c0i c0iVar, i0i i0iVar, Function1 function1, fet fetVar, int i2) {
        int i3;
        fet fetVar2;
        boolean z;
        fet fetVar3;
        fet fetVar4;
        fet fetVar5 = fetVar;
        fetVar5.g0(1488867635);
        if ((i2 & 6) == 0) {
            i3 = (fetVar5.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar5.e(c0iVar.ordinal()) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar5.g(i0iVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar5.i(function1) ? 2048 : 1024;
        }
        if (fetVar5.U(i3 & 1, (i3 & 1171) != 1170)) {
            mm40 mm40VarO = ny9.O(c0iVar.f3525a, mm40Var, false);
            long backgroundContent = ((ThemeColors) fetVar5.k(zaq0.b)).getBackgroundContent();
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarQ = i120.Q(mm40VarO, backgroundContent, vgg0.a(16.0f));
            boolean z2 = (i3 & 7168) == 2048;
            int i4 = i3 & 896;
            boolean z3 = z2 | (i4 == 256);
            Object objP = fetVar5.P();
            Object obj = ukd.f35823a;
            if (z3 || objP == obj) {
                objP = new vef(function1, i0iVar, (byte) 14);
                fetVar5.o0(objP);
            }
            mm40 mm40VarW = y860.W(mm40VarQ, null, null, false, null, (Function0) objP, 28);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar5.T);
            bh90 bh90VarM = fetVar5.m();
            mm40 mm40VarC0 = kbc.c0(fetVar5, mm40VarW);
            mkd.c0.getClass();
            fetVar5.i0();
            boolean z4 = fetVar5.S;
            pcy pcyVar = e7z.u1;
            if (z4) {
                fetVar5.l(pcyVar);
            } else {
                fetVar5.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar5, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar5, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar5, numValueOf, shdVar3);
            jpm0.n(fetVar5);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar5, mm40VarC0, shdVar4);
            mm40 mm40VarJ = lgb.J(o7k0.c, vgg0.a(16.0f));
            n0x n0xVar = i0iVar.d;
            String str = i0iVar.c;
            j0x.b(lv00.T(n0xVar, i0iVar.e, null, null, fetVar5, 0, 12), null, mm40VarJ, null, gqw0.A, 0.0f, null, fetVar, 24624, 104);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarJ2 = lgb.J(o7k0.w(o7k0.d(jm40Var, 1.0f), null, false, 3), vgg0.c(0.0f, 0.0f, 16.0f, 16.0f, 3));
            boolean z5 = i4 == 256;
            Object objP2 = fetVar.P();
            if (z5 || objP2 == obj) {
                objP2 = new hfg(i0iVar, (byte) 25);
                fetVar.o0(objP2);
            }
            mm40 mm40VarB = jr8.f16991a.b(s5x0.J(rq8.K(mm40VarJ2, (Function1) objP2), 8.0f), gqw0.h);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar, 48);
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
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, jm40Var);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, shdVar);
            jpm0.o(fetVar, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
            x7z x7zVarI = ohs0.i(fetVar, mm40VarC2, shdVar4, 1.0f, false);
            String str2 = i0iVar.b;
            StaticColors staticColors = StaticColors.INSTANCE;
            v8q0.a(str2, x7zVarI, staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.m(), fetVar, 0, 24960, 109560);
            if (str == null) {
                fetVar.e0(422644168);
                z = false;
                fetVar.r(false);
                fetVar3 = fetVar;
            } else {
                fetVar.e0(422644169);
                v8q0.a("+", s5x0.N(jm40Var, 4.0f, 0.0f, 0.0f, 0.0f, 14), staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.m(), fetVar, 6, 24960, 109560);
                fet fetVar6 = fetVar;
                z = false;
                fetVar6.r(false);
                fetVar3 = fetVar6;
            }
            fetVar3.r(true);
            if (str == null) {
                fetVar3.e0(-2041693964);
                fetVar3.r(z);
                fetVar4 = fetVar3;
            } else {
                fetVar3.e0(-2041693963);
                v8q0.a(i0iVar.c, jm40Var, staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.m(), fetVar, 48, 24960, 109560);
                fet fetVar7 = fetVar;
                fetVar7.r(false);
                fetVar4 = fetVar7;
            }
            fetVar4.r(r8);
            fetVar4.r(true);
            fetVar2 = fetVar4;
        } else {
            fetVar5.X();
            fetVar2 = fetVar5;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new e0i((byte) 0, i2, (Object) mm40Var, (Object) c0iVar, (Object) i0iVar, (Object) function1);
        }
    }

    public static final void y(int i2, fet fetVar, mm40 mm40Var) {
        fetVar.g0(-295956324);
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarG = o7k0.g(mm40Var, 76.0f, 0.0f, 2);
            c0i c0iVar = c0i.b;
            mm40 mm40VarO = ny9.O(0.75f, mm40VarG, false);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            qxw.o(fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarO), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dka(mm40Var, i2, (byte) 17);
        }
    }

    public static final void z(mm40 mm40Var, boolean z, cbm cbmVar, fet fetVar, int i2) {
        int i3;
        mm40Var.getClass();
        fetVar.g0(-1526495757);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i3 | (fetVar.g(cbmVar) ? 256 : 128);
        if (!fetVar.U(i4 & 1, (i4 & 147) != 146)) {
            fetVar.X();
        } else if (z) {
            fetVar.e0(-721230182);
            C(mm40Var, cbmVar, fetVar, ((i4 >> 3) & 112) | (i4 & 14));
            fetVar.r(false);
        } else {
            fetVar.e0(-721108166);
            A(mm40Var, cbmVar, fetVar, ((i4 >> 3) & 112) | (i4 & 14));
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new y13((byte) 3, i2, mm40Var, (Object) cbmVar, z);
        }
    }

    public ro4(t58 t58Var) {
        this.b = new WeakReference(t58Var);
    }
}
