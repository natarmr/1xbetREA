package a;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.gov.nist.core.Separators;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class btm0 {
    public static final void a(mm40 mm40Var, final jtv0 jtv0Var, final long j, final long j2, fet fetVar, final int i, final int i2) {
        final mm40 mm40Var2;
        int i3;
        jtv0Var.getClass();
        fetVar.g0(-75782229);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            mm40Var2 = mm40Var;
        } else if ((i & 6) == 0) {
            mm40Var2 = mm40Var;
            i3 = i | (fetVar.g(mm40Var2) ? 4 : 2);
        } else {
            mm40Var2 = mm40Var;
            i3 = i;
        }
        int i5 = i3 | (fetVar.g(jtv0Var) ? 32 : 16) | (fetVar.f(j) ? 256 : 128) | (fetVar.f(j2) ? 2048 : 1024);
        if (fetVar.U(i5 & 1, (i5 & 1171) != 1170)) {
            mm40 mm40Var3 = i4 != 0 ? jm40.b : mm40Var2;
            mm40 mm40VarE = o7k0.e(o7k0.d(mm40Var3, 1.0f), jtv0Var.d);
            if (j2 != 16) {
                mm40VarE = i120.Q(mm40VarE, j2, jd8.n);
            }
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
            atm0.a(null, j, jtv0Var.e, fetVar, (i5 >> 3) & 112);
            fetVar.r(true);
            mm40Var2 = mm40Var3;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.rtv0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    btm0.a(mm40Var2, jtv0Var, j, j2, (fet) obj, x8x.L(i | 1), i2 ? 1 : 0);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void b(int i, fet fetVar, mm40 mm40Var, String str) {
        fet fetVar2 = fetVar;
        String str2 = str;
        fetVar2.g0(-1526112657);
        int i2 = i | (fetVar2.g(str2) ? 4 : 2) | (fetVar.g(mm40Var) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(o7k0.w(mm40Var, null, false, 3), 1.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar2, 0);
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
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarH = dw9.h(1.0f, o7k0.w(o7k0.d(s5x0.N(jm40Var, 0.0f, 0.0f, 8.0f, 0.0f, 11), 1.0f), null, false, 3), true);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarH);
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
            mm40 mm40VarD2 = o7k0.d(o7k0.w(jm40Var, null, false, 3), 1.0f);
            y9q0 y9q0VarG = g1t0.g();
            StaticColors staticColors = StaticColors.INSTANCE;
            v8q0.a(rsm0.w(R.string.toto_tiraj, 0, fetVar2), mm40VarD2, 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0.a(y9q0VarG, staticColors.m131getWhite800d7_KjU(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214), fetVar, 48, 28032, 102396);
            qxw.o(fetVar, o7k0.e(jm40Var, 2.0f));
            kc5.N(str, null, 0L, null, null, 0L, qmk.q, g1t0.j().f42262a.b, null, null, 0L, gqw0.d, 0, false, 1, 0, false, null, y9q0.a(g1t0.j(), staticColors.m123getWhite0d7_KjU(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214), 0.0f, fetVar, i2 & 14, 1575936, 0, 3071806);
            str2 = str;
            fetVar2 = fetVar;
            fetVar2.r(true);
            qxw.o(fetVar2, o7k0.s(jm40Var, 8.0f));
            kpb.l(R.style.Widget_DSTag_RectangularL_Filled_Green, 0, fetVar2, twn.l(gqw0.k, o7k0.y(jm40Var, null, 3)), rsm0.w(R.string.toto_free_tag, 0, fetVar2));
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cgp0(str2, mm40Var, i, (byte) 6);
        }
    }

    public static final void c(int i, fet fetVar, mm40 mm40Var, String str, String str2) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-1754230610);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(str2) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarD = o7k0.d(o7k0.w(mm40Var, null, false, 3), 1.0f);
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
            pm80 pm80VarF = a8k0.F(R.drawable.ic_glyph_cyber_cs2_cup, 0, fetVar2);
            StaticColors staticColors = StaticColors.INSTANCE;
            long jM130getWhite600d7_KjU = staticColors.m130getWhite600d7_KjU();
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            dww.c(pm80VarF, null, o7k0.n(jm40Var, 32.0f), jM130getWhite600d7_KjU, fetVar2, 56, 0);
            qxw.o(fetVar2, o7k0.s(jm40Var, 8.0f));
            mm40 mm40VarW = o7k0.w(new x7z(1.0f, true), null, false, 3);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarW);
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
            v8q0.a(xsm0.s(R.string.toto_jackpot_title, fetVar2), o7k0.d(o7k0.w(jm40Var, null, false, 3), 1.0f), staticColors.m131getWhite800d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.g(), fetVar, 48, 28032, 102392);
            qxw.o(fetVar, o7k0.e(jm40Var, 2.0f));
            kc5.N(str, null, staticColors.m123getWhite0d7_KjU(), null, null, 0L, qmk.q, g1t0.j().f42262a.b, null, null, 0L, gqw0.d, 0, false, 1, 0, false, null, g1t0.j(), 0.0f, fetVar, (i2 >> 3) & 14, 1575936, 0, 3071802);
            fetVar2 = fetVar;
            fetVar2.r(true);
            j6n.h(str2, rqo0.f30941a, null, 0, 0, fetVar2, ((i2 >> 6) & 14) | 48, 28);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new man(mm40Var, str, str2, i, (byte) 26);
        }
    }

    public static final void d(mm40 mm40Var, String str, String str2, tn7 tn7Var, axo0 axo0Var, xdr xdrVar, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        str.getClass();
        str2.getClass();
        fetVar2.g0(-202625886);
        byte b = 4;
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(str2) ? 256 : 128) | (fetVar2.g(tn7Var) ? 2048 : 1024) | (fetVar2.g(axo0Var) ? 16384 : 8192) | 196608;
        if (fetVar2.U(i2 & 1, (74899 & i2) != 74898)) {
            ugd ugdVarM = u1c.M(163515704, new gcn0(axo0Var, b), fetVar2);
            boolean z = (i2 & 57344) == 16384;
            Object objP = fetVar2.P();
            if (z || objP == ukd.f35823a) {
                objP = androidx.compose.runtime.e.b(Intrinsics.d(axo0Var, wwo0.f39894a) ? 1 : 2);
                fetVar2.o0(objP);
            }
            cgk0 cgk0Var = (cgk0) objP;
            mm40 mm40VarR = i120.R(o7k0.d(mm40Var, 1.0f), str2, tn7Var, fetVar2);
            zfn zfnVar = zaq0.b;
            long background = ((ThemeColors) fetVar2.k(zfnVar)).getBackground();
            zcl zclVar = qmk.f;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(mm40VarR, background, new ugg0(zclVar, zclVar, zclVar, zclVar));
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
            xdrVar = ugdVarM;
            jwb.p(dw9.h(1.0f, s5x0.N(jm40Var, 12.0f, 8.0f, 0.0f, 8.0f, 4), true), null, null, null, 0, cgk0Var.l(), u1c.M(1901437867, new fxo0(str, ugdVarM, (byte) 0), fetVar2), fetVar, 1572864, 30);
            fetVar2 = fetVar;
            dww.c(a8k0.F(R.drawable.ic_glyph_info_circle_filled, 0, fetVar2), null, o7k0.n(s5x0.N(jm40Var, 8.0f, 0.0f, 10.0f, 0.0f, 10), 16.0f), ((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), fetVar2, 56, 0);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        xdr xdrVar2 = xdrVar;
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vdl0(mm40Var, str, str2, tn7Var, axo0Var, xdrVar2, i, (byte) 4);
        }
    }

    public static final void e(znp0 znp0Var, fet fetVar, int i) {
        fet fetVar2;
        fetVar.g0(-1024275098);
        byte b = 2;
        int i2 = (fetVar.g(znp0Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            fetVar2 = fetVar;
            bcm0.c(znp0Var.b, znp0Var.d, null, u1c.M(1772731964, new gcn0(znp0Var, (byte) 7), fetVar), fetVar2, 3072);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wf00(znp0Var, i, b);
        }
    }

    public static final void f(mm40 mm40Var, frq0 frq0Var, fet fetVar, int i) {
        fetVar.g0(-2136321622);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(frq0Var) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            StaticColors staticColors = StaticColors.INSTANCE;
            long jM75getBlack600d7_KjU = staticColors.m75getBlack600d7_KjU();
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            ugg0 ugg0Var2 = new ugg0(zclVar, zclVar, zclVar, zclVar);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarQ = i120.Q(jm40Var, jM75getBlack600d7_KjU, ugg0Var2);
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
            c(0, fetVar, s5x0.M(jm40Var, 12.0f, 12.0f, 16.0f, 12.0f), frq0Var.f10032a, frq0Var.c);
            mm40 mm40VarE = o7k0.e(jm40Var, 1.0f);
            wfi0 wfi0Var = wfi0.f39073a;
            mbc.o(wfi0Var, mm40VarE, false, fetVar, 6, 4);
            qxw.o(fetVar, o7k0.e(jm40Var, 12.0f));
            g(0, fetVar, o7k0.w(o7k0.d(s5x0.L(jm40Var, 16.0f, 0.0f, 2), 1.0f), null, false, 3), frq0Var.b, frq0Var.d);
            qxw.o(fetVar, o7k0.e(jm40Var, 12.0f));
            mbc.o(wfi0Var, o7k0.e(jm40Var, 1.0f), false, fetVar, 6, 4);
            q8x.w(s5x0.M(jm40Var, 16.0f, 12.0f, 16.0f, 12.0f), frq0Var.e, staticColors.m131getWhite800d7_KjU(), staticColors.m123getWhite0d7_KjU(), fetVar, 0, 0);
            fetVar.r(true);
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o1l0((Object) mm40Var, (Object) frq0Var, i, (byte) 26);
        }
    }

    public static final void g(int i, fet fetVar, mm40 mm40Var, String str, String str2) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-166381082);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(str2) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar2, 0);
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
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            x7z x7zVar = new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            mw3 mw3Var = uc9.c;
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar2, 0);
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
            mm40 mm40VarD = o7k0.d(o7k0.w(jm40Var, null, false, 3), 1.0f);
            y9q0 y9q0VarG = g1t0.g();
            StaticColors staticColors = StaticColors.INSTANCE;
            v8q0.a(xsm0.s(R.string.toto_tiraj, fetVar2), mm40VarD, staticColors.m131getWhite800d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 1, 0, null, y9q0VarG, fetVar, 48, 24960, 109560);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarD2 = ua80.d(jm40Var, 2.0f, fetVar, jm40Var, 1.0f);
            y9q0 y9q0VarM = g1t0.m();
            long jM123getWhite0d7_KjU = staticColors.m123getWhite0d7_KjU();
            long j = qmk.o;
            kc5.N(str, mm40VarD2, jM123getWhite0d7_KjU, null, null, 0L, j, g1t0.m().f42262a.b, null, null, 0L, gqw0.d, 2, false, 1, 0, false, null, y9q0VarM, 0.0f, fetVar, ((i2 >> 3) & 14) | 48, 1600512, 0, 3055416);
            fetVar.r(true);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            x7z x7zVar2 = new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            x5d x5dVarA2 = w5d.a(mw3Var, xx7Var, fetVar, 0);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, x7zVar2);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA2, shdVar);
            jpm0.o(fetVar, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC2, shdVar4);
            v8q0.a(xsm0.s(R.string.toto_accept_bets_to, fetVar), o7k0.d(o7k0.w(jm40Var, null, false, 3), 1.0f), staticColors.m131getWhite800d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(6), 0L, 2, false, 1, 0, null, g1t0.g(), fetVar, 48, 24960, 109560);
            kc5.N(str2, ua80.d(jm40Var, 2.0f, fetVar, jm40Var, 1.0f), staticColors.m123getWhite0d7_KjU(), null, null, 0L, j, g1t0.m().f42262a.b, null, null, 0L, gqw0.f, 2, false, 1, 0, false, null, g1t0.m(), 0.0f, fetVar, ((i2 >> 6) & 14) | 48, 1600512, 0, 3055416);
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new man(mm40Var, str, str2, i, (byte) 27);
        }
    }

    public static final void h(snr0 snr0Var, mm40 mm40Var, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-2018796881);
        int i2 = (fetVar2.g(snr0Var) ? 4 : 2) | i | (fetVar2.g(mm40Var) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            pz40 pz40VarE = ydx.E(snr0Var.c, "", null, fetVar2, 48, 2);
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarD = o7k0.d(o7k0.w(i120.Q(h97.e(zclVar, zclVar, zclVar, zclVar, mm40Var), StaticColors.INSTANCE.m75getBlack600d7_KjU(), jd8.n), null, false, 3), 1.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
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
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            jm40 jm40Var = jm40.b;
            qxw.o(fetVar2, o7k0.e(jm40Var, 12.0f));
            b(0, fetVar2, s5x0.N(jm40Var, 12.0f, 0.0f, 16.0f, 0.0f, 10), snr0Var.f32509a);
            qxw.o(fetVar2, o7k0.e(jm40Var, 12.0f));
            mbc.o(wfi0.f39073a, o7k0.e(jm40Var, 1.0f), false, fetVar2, 6, 4);
            qxw.o(fetVar2, o7k0.e(jm40Var, 12.0f));
            mbc.k(rsm0.w(R.string.toto_accept_bets_to, 0, fetVar2), snr0Var.b, 5, o7k0.w(o7k0.d(s5x0.L(jm40Var, 12.0f, 0.0f, 2), 1.0f), null, false, 3), null, null, 0L, fetVar, 0);
            fetVar2 = fetVar;
            qxw.o(fetVar2, o7k0.e(jm40Var, 12.0f));
            j(0, fetVar2, null, pz40VarE);
            rz4.t(jm40Var, 12.0f, fetVar2, true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new a6p0((byte) 22, i, mm40Var, (Object) snr0Var);
        }
    }

    public static final void i(mm40 mm40Var, o1s0 o1s0Var, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        o1s0Var.getClass();
        function1.getClass();
        fetVar.g0(-1664605707);
        int i2 = i | 6 | (fetVar.g(o1s0Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            float f = qmk.a(fetVar).c;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(s5x0.L(jm40Var, f, 0.0f, 2), 1.0f);
            int iOrdinal = o1s0Var.b.ordinal();
            mm40 mm40VarN = s5x0.N(mm40VarD, 0.0f, (iOrdinal == 0 || iOrdinal == 3) ? 8.0f : 0.0f, 0.0f, 8.0f, 5);
            rqm rqmVar = o1s0Var.f24498a;
            int i3 = i2 & 896;
            boolean z = i3 == 256;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new sbr0(function1, (byte) 20);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z2 = i3 == 256;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new sbr0(function1, (byte) 21);
                fetVar.o0(objP2);
            }
            obc.q(mm40VarN, rqmVar, false, null, function0, null, (Function0) objP2, null, fetVar, 384, 168);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gdr0(mm40Var2, o1s0Var, function1, i, (byte) 9);
        }
    }

    public static final void j(int i, fet fetVar, mm40 mm40Var, l7m0 l7m0Var) {
        mm40 mm40Var2;
        fetVar.g0(1468486574);
        int i2 = i | 6 | (fetVar.g(l7m0Var) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40Var2 = jm40.b;
            mbc.k(rsm0.w(R.string.toto_till_end, 0, fetVar), (String) l7m0Var.getValue(), 5, o7k0.w(o7k0.d(s5x0.L(mm40Var2, 12.0f, 0.0f, 2), 1.0f), null, false, 3), null, null, 0L, fetVar, 0);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new e2s(mm40Var2, l7m0Var, i, (byte) 8);
        }
    }

    public static final void k(mm40 mm40Var, ugd ugdVar, fet fetVar, int i, int i2) {
        int i3;
        mm40 mm40Var2;
        fetVar.g0(457647246);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= fetVar.d(8.0f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= fetVar.i(ugdVar) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            mm40Var2 = i4 != 0 ? jm40.b : mm40Var;
            mm40 mm40VarC = o7k0.c(mm40Var2, 1.0f);
            boolean z = (i3 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new mu90((byte) 17);
                fetVar.o0(objP);
            }
            tj30 tj30Var = (tj30) objP;
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarC);
            mkd.c0.getClass();
            int i5 = ((((i3 >> 6) & 14) << 6) & 896) | 6;
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
            twn.v((i5 >> 6) & 14, ugdVar, fetVar, true);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gu60(mm40Var2, ugdVar, i, i2, (byte) 2);
        }
    }

    public static final void l(mm40 mm40Var, pz40 pz40Var, fet fetVar, int i) {
        fetVar.g0(-1413762584);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(pz40Var) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            Object[] objArr = new Object[0];
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new jxr0(pz40Var, (byte) 9);
                fetVar.o0(objP);
            }
            l7m0 l7m0VarY = v3c.Y(objArr, (Function0) objP, fetVar);
            Object[] objArr2 = new Object[0];
            boolean z2 = i3 == 32;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new jxr0(pz40Var, (byte) 10);
                fetVar.o0(objP2);
            }
            z1x.m(mm40Var, null, null, u1c.M(310222173, new qjr0(l7m0VarY, (byte) 6), fetVar), u1c.M(1317144862, new qjr0(v3c.Y(objArr2, (Function0) objP2, fetVar), (byte) 7), fetVar), m0x0.h, fetVar, (i2 & 14) | 224256, 6);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new esw(mm40Var, pz40Var, i, (byte) 12);
        }
    }

    public static final void m(lc00 lc00Var, List list, ctf0 ctf0Var) {
        int i;
        list.getClass();
        ctf0Var.getClass();
        if (list.isEmpty()) {
            return;
        }
        lc00Var.add(new psv("UFC_HEADER_KEY", R.string.round_statistics));
        lsm0 lsm0Var = ctf0Var.b;
        lc00Var.add(new q8o0(lsm0Var.a(R.string.mortal_kombat_type_win, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.mortal_kombat_hero_win, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.time, Arrays.copyOf(new Object[0], 0))));
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                q3d.p();
                throw null;
            }
            e6t0 e6t0Var = (e6t0) obj;
            boolean z = list.size() - 1 == i2;
            String strM = twn.m(i2, "UFC_KEY");
            String strA = lsm0Var.a(R.string.synthetic_round_v2, Arrays.copyOf(new Object[]{String.valueOf(e6t0Var.f7305a)}, 1));
            rdj rdjVar = rdj.f30294a;
            String strH = rdj.h(new znq0(e6t0Var.d), ykq0.UNIQUE_2, Boolean.TRUE, null, 232);
            String str = e6t0Var.c;
            String str2 = e6t0Var.b;
            if (z && i2 % 2 == 0) {
                i = R.drawable.cybergame_synthetic_ufc_first_last_bg;
            } else if (z) {
                i = R.drawable.cybergame_synthetic_ufc_second_last_bg;
            } else {
                i = i2 % 2 == 0 ? R.drawable.cybergame_synthetic_ufc_first_bg : R.drawable.cybergame_synthetic_ufc_second_bg;
            }
            lc00Var.add(new s8o0(i, strM, strA, strH, str2, str));
            i2 = i3;
        }
    }

    public static boolean n(File file, Resources resources, int i) throws Throwable {
        InputStream inputStreamOpenRawResource;
        try {
            inputStreamOpenRawResource = resources.openRawResource(i);
            try {
                boolean zO = o(file, inputStreamOpenRawResource);
                if (inputStreamOpenRawResource != null) {
                    try {
                        inputStreamOpenRawResource.close();
                    } catch (IOException unused) {
                    }
                }
                return zO;
            } catch (Throwable th) {
                th = th;
                if (inputStreamOpenRawResource != null) {
                    try {
                        inputStreamOpenRawResource.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStreamOpenRawResource = null;
        }
    }

    public static boolean o(File file, InputStream inputStream) throws Throwable {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i = inputStream.read(bArr);
                        if (i != -1) {
                            fileOutputStream2.write(bArr, 0, i);
                        } else {
                            try {
                                break;
                            } catch (IOException unused) {
                            }
                        }
                    }
                    fileOutputStream2.close();
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return true;
                } catch (IOException e) {
                    e = e;
                    fileOutputStream = fileOutputStream2;
                    Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static final boolean p(yos0 yos0Var) {
        return (yos0Var instanceof sos0) || (yos0Var instanceof tos0);
    }

    public static final boolean q(yos0 yos0Var) {
        return (yos0Var instanceof ros0) || (yos0Var instanceof xos0);
    }

    public static File r(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i = 0; i < 100; i++) {
            File file = new File(cacheDir, twn.m(i, str));
            try {
                if (file.createNewFile()) {
                    return file;
                }
            } catch (IOException unused) {
            }
        }
        return null;
    }

    public static MappedByteBuffer s(Context context, Uri uri) {
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return null;
                }
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStream.close();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return map;
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                try {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        } catch (IOException unused) {
        }
    }

    public static String t(String str) {
        String strSubstring;
        String strSubstring2;
        str.getClass();
        if (str.length() <= 5) {
            return str;
        }
        if (StringsKt.P(str, '.') && cy7.c()) {
            List listSplit$default = StringsKt__StringsKt.split$default(str, new String[]{Separators.DOT}, false, 0, 6, null);
            String str2 = (String) CollectionsKt.f0(listSplit$default);
            if (str2 == null) {
                str2 = "";
            }
            String str3 = (String) CollectionsKt.firstOrNull(listSplit$default);
            return kng0.l(str2, "...", str3 != null ? str3 : "");
        }
        if (cy7.c()) {
            strSubstring = str.substring(str.length() - 2);
            strSubstring2 = str.substring(0, 3);
        } else {
            strSubstring = str.substring(0, 3);
            strSubstring2 = str.substring(str.length() - 2);
        }
        return kng0.l(strSubstring, "...", strSubstring2);
    }

    public static void u(PendingIntent pendingIntent) {
        int i = Build.VERSION.SDK_INT;
        if (i < 34) {
            pendingIntent.send();
            return;
        }
        try {
            ActivityOptions activityOptionsMakeBasic = ActivityOptions.makeBasic();
            if (i >= 36) {
                activityOptionsMakeBasic.setPendingIntentBackgroundActivityStartMode(4);
            } else {
                activityOptionsMakeBasic.setPendingIntentBackgroundActivityStartMode(1);
            }
            pendingIntent.send(activityOptionsMakeBasic.toBundle());
        } catch (PendingIntent.CanceledException e) {
            Log.e("TextClassification", "error sending pendingIntent: " + pendingIntent + " error: " + e);
        }
    }

    public static final Drawable v(yos0 yos0Var, Context context) {
        context.getClass();
        if ((yos0Var instanceof wos0) || (yos0Var instanceof vos0)) {
            return context.getDrawable(R.drawable.ic_message_document);
        }
        if ((yos0Var instanceof tos0) || (yos0Var instanceof sos0) || (yos0Var instanceof uos0)) {
            return context.getDrawable(R.drawable.ic_need_download);
        }
        return null;
    }

    public static final dtt0 w(xrt0 xrt0Var, nhf0 nhf0Var, ctf0 ctf0Var) {
        int i;
        String str;
        xrt0Var.getClass();
        nhf0Var.getClass();
        ctf0Var.getClass();
        String strB = j0x.B(xrt0Var, ctf0Var);
        if (xrt0Var instanceof vrt0) {
            i = ((pru) nhf0Var.b).a().U1 ? R.drawable.ic_placeholder_bot : R.drawable.ic_partners_only_bot;
        } else {
            i = R.drawable.ic_user_profile;
        }
        String str2 = "";
        if ((xrt0Var instanceof urt0) && (str = ((urt0) xrt0Var).d) != null) {
            str2 = str;
        }
        return new dtt0(xrt0Var, strB, i, str2);
    }

    public static void x(Object obj, Object obj2) {
        if (obj == null) {
            hny.u("null key in entry: null=".concat(String.valueOf(obj2)));
        } else {
            if (obj2 != null) {
                return;
            }
            hny.u(kng0.l("null value in entry: ", obj.toString(), "=null"));
        }
    }
}
