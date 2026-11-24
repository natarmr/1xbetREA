package a;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.javax.sip.message.Response;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class etm0 {
    public static final void a(int i, fet fetVar, mm40 mm40Var, String str) {
        String str2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-648501407);
        int i2 = i | (fetVar2.g(str) ? 4 : 2) | (fetVar.g(mm40Var) ? 32 : 16);
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
            v8q0.a(rsm0.w(R.string.toto_tiraj, 0, fetVar2), o7k0.d(o7k0.w(jm40Var, null, false, 3), 1.0f), StaticColors.INSTANCE.m131getWhite800d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.g(), fetVar, 48, 28032, 102392);
            aad.e(str, s5x0.N(jm40Var, 0.0f, 2.0f, 0.0f, 0.0f, 13), ibm0.s(g1t0.j(), fetVar), null, 0, false, 1, 0, null, new n05(idm0.t(12), idm0.t(16), idm0.t(1)), fetVar, (i2 & 14) | 1572864, 440);
            str2 = str;
            fetVar2 = fetVar;
            fetVar2.r(true);
            j6n.h(rsm0.w(R.string.toto_free_tag, 0, fetVar2), bqo0.f3042a, twn.l(gqw0.k, o7k0.y(s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), null, 3)), 1, 2, fetVar2, 27696, 0);
            fetVar2.r(true);
        } else {
            str2 = str;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cgp0(str2, mm40Var, i, (byte) 8);
        }
    }

    public static final void b(mm40 mm40Var, String str, String str2, tn7 tn7Var, bxo0 bxo0Var, xdr xdrVar, fet fetVar, int i) {
        mm40 mm40Var2;
        xdr xdrVar2;
        fet fetVar2 = fetVar;
        str.getClass();
        str2.getClass();
        fetVar2.g0(366257161);
        int i2 = i | 6 | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(str2) ? 256 : 128) | (fetVar2.g(tn7Var) ? 2048 : 1024) | (fetVar2.g(bxo0Var) ? 16384 : 8192) | 196608;
        byte b = 1;
        if (fetVar2.U(i2 & 1, (74899 & i2) != 74898)) {
            ugd ugdVarM = u1c.M(1090026797, new gcn0(bxo0Var, (byte) 5), fetVar2);
            boolean z = (i2 & 57344) == 16384;
            Object objP = fetVar2.P();
            if (z || objP == ukd.f35823a) {
                objP = androidx.compose.runtime.e.b(!Intrinsics.d(bxo0Var, xwo0.f41619a) ? 2 : 1);
                fetVar2.o0(objP);
            }
            cgk0 cgk0Var = (cgk0) objP;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(mm40VarD, 16.0f, 0.0f, 2);
            zfn zfnVar = zaq0.b;
            long background = ((ThemeColors) fetVar2.k(zfnVar)).getBackground();
            zcl zclVar2 = qmk.f;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarR = i120.R(i120.S(mm40VarL, 1.0f, background, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), str2, tn7Var, fetVar2);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarR);
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
            jwb.p(dw9.h(1.0f, s5x0.N(jm40Var, 12.0f, 8.0f, 0.0f, 8.0f, 4), true), null, null, null, 0, cgk0Var.l(), u1c.M(716808338, new fxo0(str, ugdVarM, b), fetVar2), fetVar2, 1572864, 30);
            mm40 mm40VarN = o7k0.n(s5x0.N(jm40Var, 8.0f, 0.0f, 10.0f, 0.0f, 10), 16.0f);
            pm80 pm80VarF = a8k0.F(R.drawable.ic_glyph_info_circle_filled, 0, fetVar2);
            long secondary = ((ThemeColors) fetVar2.k(zfnVar)).getSecondary();
            fetVar2 = fetVar2;
            dww.c(pm80VarF, null, mm40VarN, secondary, fetVar2, 56, 0);
            fetVar2.r(true);
            xdrVar2 = ugdVarM;
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
            xdrVar2 = xdrVar;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vdl0(mm40Var2, str, str2, tn7Var, bxo0Var, xdrVar2, i, (byte) 5);
        }
    }

    public static final void c(mm40 mm40Var, lrq0 lrq0Var, y9q0 y9q0Var, y9q0 y9q0Var2, fet fetVar, int i, int i2) {
        int i3;
        mm40 mm40Var2;
        fetVar.g0(1150357399);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= fetVar.g(lrq0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= fetVar.g(y9q0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= fetVar.g(y9q0Var2) ? 2048 : 1024;
        }
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            mm40 mm40Var3 = i4 != 0 ? jm40.b : mm40Var;
            if (lrq0Var instanceof jrq0) {
                fetVar.e0(1686872881);
                e(mm40Var3, (jrq0) lrq0Var, y9q0Var, y9q0Var2, fetVar, i3 & 8190);
                fetVar.r(false);
            } else {
                if (!(lrq0Var instanceof krq0)) {
                    throw b1j.f(1686871037, fetVar, false);
                }
                fetVar.e0(1686880207);
                g(mm40Var3, (krq0) lrq0Var, y9q0Var, y9q0Var2, fetVar, i3 & 8190);
                fetVar.r(false);
            }
            mm40Var2 = mm40Var3;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ztc0(mm40Var2, (Object) lrq0Var, (Object) y9q0Var, (Object) y9q0Var2, i, i2, (byte) 10);
        }
    }

    public static final void d(mm40 mm40Var, String str, String str2, y9q0 y9q0Var, y9q0 y9q0Var2, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        fetVar.g0(41610344);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(y9q0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.g(y9q0Var2) ? 16384 : 8192;
        }
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
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
            x7z x7zVar = new x7z(1.0f, true);
            zcl zclVar = qmk.f28987a;
            int i3 = i2;
            v8q0.a(str, s5x0.N(x7zVar, 0.0f, 0.0f, 12.0f, 0.0f, 11), 0L, null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 1, 0, null, y9q0Var, fetVar, (i2 >> 3) & 14, ((i2 << 12) & 29360128) | 24960, 109564);
            v8q0.a(str2, o7k0.A(jm40.b, null, 3), 0L, null, 0L, null, null, null, 0L, new f2q0(6), 0L, 0, false, 1, 0, null, y9q0Var2, fetVar, ((i3 >> 6) & 14) | 48, ((i3 << 9) & 29360128) | 24576, 113660);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wjp((Object) mm40Var, (Object) str, (Object) str2, (Object) y9q0Var, (Object) y9q0Var2, i, (byte) 27);
        }
    }

    public static final void e(mm40 mm40Var, jrq0 jrq0Var, y9q0 y9q0Var, y9q0 y9q0Var2, fet fetVar, int i) {
        int i2;
        fetVar.g0(-712348896);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(jrq0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(y9q0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(y9q0Var2) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
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
            jm40 jm40Var = jm40.b;
            int i3 = i2 << 3;
            int i4 = (i3 & 7168) | 6 | (i3 & 57344);
            d(o7k0.d(jm40Var, 1.0f), rsm0.w(R.string.bets_count_, 0, fetVar), jrq0Var.f17016a, y9q0Var, y9q0Var2, fetVar, i4);
            zcl zclVar = qmk.f28987a;
            d(ua80.d(jm40Var, 4.0f, fetVar, jm40Var, 1.0f), rsm0.w(R.string.confirmed_, 0, fetVar), jrq0Var.b, y9q0Var, y9q0Var2, fetVar, i4);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ku90((byte) 12, i, (Object) mm40Var, (Object) jrq0Var, (Object) y9q0Var, (Object) y9q0Var2);
        }
    }

    public static final void f(ynr0 ynr0Var, mm40 mm40Var, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-230913668);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(ynr0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(mm40Var) ? 32 : 16;
        }
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
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
            a(0, fetVar2, s5x0.N(jm40Var, 12.0f, 12.0f, 16.0f, 0.0f, 8), ynr0Var.f42954a);
            mbc.o(wfi0.f39073a, o7k0.e(s5x0.N(jm40Var, 0.0f, 12.0f, 0.0f, 0.0f, 13), 1.0f), false, fetVar2, 6, 4);
            mbc.k(rsm0.w(R.string.toto_accept_bets_to, 0, fetVar2), ynr0Var.b, 5, o7k0.w(o7k0.d(s5x0.N(jm40Var, 12.0f, 12.0f, 12.0f, 0.0f, 8), 1.0f), null, false, 3), null, null, 0L, fetVar, 0);
            fetVar2 = fetVar;
            h(0, fetVar2, s5x0.L(jm40Var, 0.0f, 12.0f, 1), ynr0Var.c);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o1l0((byte) 27, i, mm40Var, (Object) ynr0Var);
        }
    }

    public static final void g(mm40 mm40Var, krq0 krq0Var, y9q0 y9q0Var, y9q0 y9q0Var2, fet fetVar, int i) {
        int i2;
        fetVar.g0(-495080594);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(krq0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(y9q0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(y9q0Var2) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
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
            jm40 jm40Var = jm40.b;
            int i3 = i2 << 3;
            int i4 = (i3 & 7168) | 6 | (i3 & 57344);
            d(o7k0.d(jm40Var, 1.0f), rsm0.w(R.string.pool_, 0, fetVar), krq0Var.b, y9q0Var, y9q0Var2, fetVar, i4);
            zcl zclVar = qmk.f28987a;
            d(ua80.d(jm40Var, 4.0f, fetVar, jm40Var, 1.0f), rsm0.w(R.string.prize_fund, 0, fetVar), krq0Var.c, y9q0Var, y9q0Var2, fetVar, i4);
            d(ua80.d(jm40Var, 4.0f, fetVar, jm40Var, 1.0f), rsm0.w(R.string.cards_, 0, fetVar), krq0Var.d, y9q0Var, y9q0Var2, fetVar, i4);
            d(ua80.d(jm40Var, 4.0f, fetVar, jm40Var, 1.0f), rsm0.w(R.string.variants_, 0, fetVar), krq0Var.e, y9q0Var, y9q0Var2, fetVar, i4);
            d(ua80.d(jm40Var, 4.0f, fetVar, jm40Var, 1.0f), rsm0.w(R.string.unique_, 0, fetVar), krq0Var.f, y9q0Var, y9q0Var2, fetVar, i4);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ku90((byte) 11, i, (Object) mm40Var, (Object) krq0Var, (Object) y9q0Var, (Object) y9q0Var2);
        }
    }

    public static final void h(int i, fet fetVar, mm40 mm40Var, String str) {
        fetVar.g0(-1990552784);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(str) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mbc.k(rsm0.w(R.string.toto_till_end, 0, fetVar), str, 5, o7k0.w(o7k0.d(s5x0.L(mm40Var, 12.0f, 0.0f, 2), 1.0f), null, false, 3), null, null, 0L, fetVar, i2 & 112);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cgp0(mm40Var, str, i, (byte) 7);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0055  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Iterable] */
    public static final wep0 i(e8h e8hVar, boolean z, List list) {
        List list2 = e8hVar.e;
        Iterator it = list2.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            Iterator it2 = ((f8h) it.next()).j.iterator();
            int i3 = 0;
            while (it2.hasNext()) {
                int i4 = ((uny) it2.next()).d;
                if (i4 <= 0) {
                    i4 = 0;
                }
                i3 += i4;
            }
            i2 += i3;
        }
        String strL = tnq0.l(e8hVar, list);
        if (!kotlin.text.c.x(strL, ujn.h, false)) {
            if (strL.length() == 0) {
                strL = "";
            } else {
                List list3 = u0d.f34849a;
                if (u0d.c(strL)) {
                    strL = "";
                } else {
                    strL = String.format(Locale.ENGLISH, StringsKt.O(strL, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, strL}, 2));
                }
            }
        }
        xnp0 xnp0Var = new xnp0(strL, e8hVar.b, z, e8hVar.d);
        String strValueOf = String.valueOf(i2);
        strValueOf.getClass();
        int i5 = 10;
        ArrayList arrayList = new ArrayList(r3d.q(list2, 10));
        int i6 = 0;
        for (Object obj : list2) {
            int i7 = i6 + 1;
            if (i6 < 0) {
                q3d.p();
                throw null;
            }
            f8h f8hVar = (f8h) obj;
            f8hVar.getClass();
            long j = i6;
            String str = f8hVar.b;
            vvv vvvVar = f8hVar.d;
            String upperCase = vvvVar.c.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            String str2 = vvvVar.b;
            List list4 = f8hVar.j;
            ?? arrayList2 = list4.isEmpty() ? 0 : list4;
            if (arrayList2 == 0) {
                uny unyVar = new uny(-1, -1L, "", "");
                arrayList2 = new ArrayList(5);
                while (i < 5) {
                    arrayList2.add(unyVar);
                    i++;
                }
            }
            ArrayList arrayList3 = new ArrayList(r3d.q(arrayList2, i5));
            for (uny unyVar2 : arrayList2) {
                unyVar2.getClass();
                String str3 = str2;
                long j2 = unyVar2.f35984a;
                int i8 = unyVar2.d;
                String str4 = i8 < 0 ? "" : unyVar2.c;
                String strValueOf2 = i8 < 0 ? "-" : String.valueOf(i8);
                strValueOf2.getClass();
                arrayList3.add(new boy(i8 > 0 ? R.color.static_white : R.color.static_white_40, j2, str4, strValueOf2));
                str2 = str3;
            }
            arrayList.add(new n4a0(j, str, upperCase, str2, arrayList3));
            i6 = i7;
            i = 0;
            i5 = 10;
        }
        return new wep0(xnp0Var, strValueOf, arrayList);
    }

    public static final void j(int i, Fragment fragment) {
        fragment.getClass();
        List listP = fragment.n0().r().c.p();
        ArrayList arrayListU = twn.u(listP);
        for (Object obj : listP) {
            if (obj instanceof d9o0) {
                arrayListU.add(obj);
            }
        }
        d9o0 d9o0Var = (d9o0) CollectionsKt.f0(arrayListU);
        if (d9o0Var != null) {
            d9o0Var.m(i);
        }
    }

    public static final u4q0 k(yzj yzjVar) {
        f5q0 f5q0Var;
        s4q0 s4q0Var = new s4q0();
        t(yzjVar, w4q0.f38554a, new nop0(new nop0((Object) s4q0Var, (byte) 12), new g0p0(1, s4q0Var, s4q0.class, "addFilter", "addFilter$foundation(Lkotlin/jvm/functions/Function1;)V", 0, (byte) 29)));
        vy40 vy40Var = new vy40();
        vy40 vy40Var2 = s4q0Var.f31620a;
        Object[] objArr = vy40Var2.f38232a;
        int i = vy40Var2.b;
        byte b = 0;
        int i2 = 0;
        boolean z = true;
        t4q0 t4q0Var = null;
        while (true) {
            f5q0Var = f5q0.b;
            if (i2 >= i) {
                break;
            }
            t4q0 t4q0Var2 = (t4q0) objArr[i2];
            if (!z || t4q0Var2 != f5q0Var) {
                if (t4q0Var2 == f5q0Var && t4q0Var == f5q0Var) {
                    z = false;
                } else {
                    if (t4q0Var2 != f5q0Var) {
                        vy40 vy40Var3 = s4q0Var.b;
                        Object[] objArr2 = vy40Var3.f38232a;
                        int i3 = vy40Var3.b;
                        int i4 = 0;
                        while (true) {
                            if (i4 < i3) {
                                if (((Boolean) ((Function1) objArr2[i4]).invoke(t4q0Var2)).booleanValue()) {
                                    i4++;
                                } else {
                                    z = false;
                                }
                            }
                        }
                    }
                    vy40Var.a(t4q0Var2);
                    z = false;
                    t4q0Var = t4q0Var2;
                }
            }
            i2++;
        }
        if (((t4q0) (vy40Var.i() ? null : vy40Var.f38232a[vy40Var.b - 1])) == f5q0Var) {
            vy40Var.l(vy40Var.b - 1);
        }
        ty40 ty40Var = vy40Var.c;
        if (ty40Var == null) {
            ty40Var = new ty40(vy40Var, b);
            vy40Var.c = ty40Var;
        }
        return new u4q0(ty40Var);
    }

    public static final Window l(View view) {
        view.getClass();
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof agd) {
                return ((agd) context).getWindow();
            }
        }
        return null;
    }

    public static final SpannableStringBuilder m(String str, String str2) {
        str2.getClass();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int iV = StringsKt.V(str2, str, 0, false, 6);
        spannableStringBuilder.append((CharSequence) str2).setSpan(new StyleSpan(1), iV, str.length() + iV, 33);
        return spannableStringBuilder;
    }

    public static final u6n n(f280 f280Var, w6n w6nVar) {
        return new u6n(d4d.SECONDARY60, w6nVar, new c280(ohs0.n(ujn.h, f280Var.c), R.drawable.ic_glyph_placeholder_team));
    }

    public static boolean o(byte b) {
        return b > -65;
    }

    public static Typeface p(Configuration configuration, Typeface typeface) {
        if (Build.VERSION.SDK_INT < 31 || configuration.fontWeightAdjustment == Integer.MAX_VALUE || configuration.fontWeightAdjustment == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, r7x.u(configuration.fontWeightAdjustment + typeface.getWeight(), 1, 1000), typeface.isItalic());
    }

    public static final o1s0 q(ctf0 ctf0Var, v12 v12Var) {
        ctf0Var.getClass();
        lsm0 lsm0Var = ctf0Var.b;
        uui0 uui0Var = new uui0(lsm0Var.a(R.string.statistic_item_net_title, Arrays.copyOf(new Object[0], 0)), null, lsm0Var.a(R.string.follow_the_final_stage, Arrays.copyOf(new Object[0], 0)), null, null, 58);
        Integer numValueOf = Integer.valueOf(R.drawable.ic_info_grid);
        m0x m0xVar = new m0x(R.drawable.ic_info_grid, null, 6);
        pz40 pz40Var = s6t0.f31722a;
        return new o1s0(new rqm((vui0) uui0Var, (pui0) new nui0(numValueOf, null, m0xVar, new y3d(s6t0.b().f33626a.getPrimary()), null, null, 0.0f, 242), (pvi0) null, (d4d) null, (tvi0) null, (wui0) null, true, (e900) null, Response.ALTERNATIVE_SERVICE), v12Var);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:39:0x0063  */
    public static final gdu0 r(jdu0 jdu0Var) {
        ydu0 ydu0Var;
        jdu0Var.getClass();
        List list = jdu0Var.f16346a;
        if (list == null) {
            list = iun.f15405a;
        }
        List list2 = jdu0Var.b;
        if (list2 == null) {
            list2 = iun.f15405a;
        }
        String str = jdu0Var.c;
        if (str == null) {
            str = "";
        }
        String str2 = jdu0Var.d;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = jdu0Var.e;
        switch (str3 != null ? str3 : "") {
            case "Prematch":
                ydu0Var = ydu0.f42458a;
                break;
            case "Draw":
                ydu0Var = ydu0.e;
                break;
            case "Live":
                ydu0Var = ydu0.b;
                break;
            case "Win1":
                ydu0Var = ydu0.c;
                break;
            case "Win2":
                ydu0Var = ydu0.d;
                break;
            default:
                ydu0Var = ydu0.f;
                break;
        }
        Long l = jdu0Var.f;
        return new gdu0(list, list2, str, str2, ydu0Var, l != null ? l.longValue() : 0L);
    }

    public static final hcv0 s(List list, ctf0 ctf0Var, String str) {
        ctf0Var.getClass();
        lc00 lc00VarB = kotlin.collections.a.b();
        f280 f280Var = (f280) CollectionsKt.W(4, list);
        if (f280Var != null) {
            lc00VarB.add(n(f280Var, w6n.g));
        }
        f280 f280Var2 = (f280) CollectionsKt.W(5, list);
        if (f280Var2 != null) {
            lc00VarB.add(n(f280Var2, w6n.h));
        }
        f280 f280Var3 = (f280) CollectionsKt.W(6, list);
        if (f280Var3 != null) {
            lc00VarB.add(n(f280Var3, w6n.j));
        }
        return new hcv0(dyb.r0(kotlin.collections.a.a(lc00VarB)), str, ctf0Var.b.a(R.string.special_events_who_win_all_opponents_v2, Arrays.copyOf(new Object[]{Integer.valueOf(list.size())}, 1)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [a.lm40] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [a.lm40] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [a.xz40] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [a.xz40] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v6 */
    public static final void t(yzj yzjVar, Object obj, Function1 function1) {
        tzi tziVar;
        if (!((lm40) yzjVar).f20279a.n) {
            xcx.b("visitAncestors called on an unattached node");
        }
        lm40 lm40Var = ((lm40) yzjVar).f20279a.e;
        e7z e7zVarZ = vcc.Z(yzjVar);
        while (e7zVarZ != null) {
            if ((((lm40) e7zVarZ.h1.g).d & 262144) != 0) {
                while (lm40Var != null) {
                    if ((lm40Var.c & 262144) != 0) {
                        ?? V = lm40Var;
                        ?? xz40Var = 0;
                        while (V != 0) {
                            if (V instanceof hps0) {
                                hps0 hps0Var = (hps0) V;
                                if (!(obj.equals(hps0Var.j()) ? ((Boolean) function1.invoke(hps0Var)).booleanValue() : true)) {
                                    return;
                                }
                            } else if ((V.c & 262144) != 0 && (V instanceof f3k)) {
                                lm40 lm40Var2 = ((f3k) V).p;
                                int i = 0;
                                V = V;
                                xz40Var = xz40Var;
                                while (lm40Var2 != null) {
                                    if ((lm40Var2.c & 262144) != 0) {
                                        i++;
                                        xz40Var = xz40Var;
                                        if (i == 1) {
                                            V = lm40Var2;
                                        } else {
                                            if (xz40Var == 0) {
                                                xz40Var = new xz40(new lm40[16]);
                                            }
                                            if (V != 0) {
                                                xz40Var.b(V);
                                                V = 0;
                                            }
                                            xz40Var.b(lm40Var2);
                                        }
                                    }
                                    lm40Var2 = lm40Var2.f;
                                    V = V;
                                    xz40Var = xz40Var;
                                }
                                if (i == 1) {
                                }
                            }
                            V = vcc.V(xz40Var);
                        }
                    }
                    lm40Var = lm40Var.e;
                }
            }
            e7zVarZ = e7zVarZ.v();
            lm40Var = (e7zVarZ == null || (tziVar = e7zVarZ.h1) == null) ? null : (wso0) tziVar.f;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [a.hps0, a.yzj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v0, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [a.lm40] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [a.lm40] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [a.xz40] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [a.xz40] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v7 */
    public static final void u(hps0 hps0Var, Function1 function1) {
        tzi tziVar;
        lm40 lm40Var = (lm40) hps0Var;
        if (!lm40Var.f20279a.n) {
            xcx.b("visitAncestors called on an unattached node");
        }
        lm40 lm40Var2 = lm40Var.f20279a.e;
        e7z e7zVarZ = vcc.Z(hps0Var);
        while (e7zVarZ != null) {
            if ((((lm40) e7zVarZ.h1.g).d & 262144) != 0) {
                while (lm40Var2 != null) {
                    if ((lm40Var2.c & 262144) != 0) {
                        ?? V = lm40Var2;
                        ?? xz40Var = 0;
                        while (V != 0) {
                            boolean zBooleanValue = true;
                            if (V instanceof hps0) {
                                hps0 hps0Var2 = (hps0) V;
                                if (Intrinsics.d(hps0Var.j(), hps0Var2.j()) && hps0Var.getClass() == hps0Var2.getClass()) {
                                    zBooleanValue = ((Boolean) function1.invoke(hps0Var2)).booleanValue();
                                }
                                if (!zBooleanValue) {
                                    return;
                                }
                            } else if ((V.c & 262144) != 0 && (V instanceof f3k)) {
                                lm40 lm40Var3 = ((f3k) V).p;
                                int i = 0;
                                V = V;
                                xz40Var = xz40Var;
                                while (lm40Var3 != null) {
                                    if ((lm40Var3.c & 262144) != 0) {
                                        i++;
                                        xz40Var = xz40Var;
                                        if (i == 1) {
                                            V = lm40Var3;
                                        } else {
                                            if (xz40Var == 0) {
                                                xz40Var = new xz40(new lm40[16]);
                                            }
                                            if (V != 0) {
                                                xz40Var.b(V);
                                                V = 0;
                                            }
                                            xz40Var.b(lm40Var3);
                                        }
                                    }
                                    lm40Var3 = lm40Var3.f;
                                    V = V;
                                    xz40Var = xz40Var;
                                }
                                if (i == 1) {
                                }
                            }
                            V = vcc.V(xz40Var);
                        }
                    }
                    lm40Var2 = lm40Var2.e;
                }
            }
            e7zVarZ = e7zVarZ.v();
            lm40Var2 = (e7zVarZ == null || (tziVar = e7zVarZ.h1) == null) ? null : (wso0) tziVar.f;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [a.lm40] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [a.lm40] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [a.xz40] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [a.xz40] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v8 */
    public static final void v(lm40 lm40Var, String str, Function1 function1) {
        if (!lm40Var.f20279a.n) {
            xcx.b("visitSubtreeIf called on an unattached node");
        }
        xz40 xz40Var = new xz40(new lm40[16]);
        lm40 lm40Var2 = lm40Var.f20279a;
        lm40 lm40Var3 = lm40Var2.f;
        if (lm40Var3 == null) {
            vcc.v(xz40Var, lm40Var2);
        } else {
            xz40Var.b(lm40Var3);
        }
        while (true) {
            int i = xz40Var.c;
            if (i == 0) {
                return;
            }
            lm40 lm40Var4 = (lm40) xz40Var.k(i - 1);
            if ((lm40Var4.d & 262144) != 0) {
                lm40 lm40Var5 = lm40Var4;
                while (true) {
                    if (lm40Var5 != null && lm40Var5.n) {
                        if ((lm40Var5.c & 262144) != 0) {
                            ?? V = lm40Var5;
                            ?? xz40Var2 = 0;
                            while (V != 0) {
                                if (V instanceof hps0) {
                                    hps0 hps0Var = (hps0) V;
                                    gps0 gps0Var = str.equals(hps0Var.j()) ? (gps0) function1.invoke(hps0Var) : gps0.f11699a;
                                    if (gps0Var != gps0.c) {
                                        if (gps0Var == gps0.b) {
                                            break;
                                        }
                                    } else {
                                        return;
                                    }
                                } else if ((V.c & 262144) != 0 && (V instanceof f3k)) {
                                    lm40 lm40Var6 = ((f3k) V).p;
                                    int i2 = 0;
                                    V = V;
                                    xz40Var2 = xz40Var2;
                                    while (lm40Var6 != null) {
                                        if ((lm40Var6.c & 262144) != 0) {
                                            i2++;
                                            xz40Var2 = xz40Var2;
                                            if (i2 == 1) {
                                                V = lm40Var6;
                                            } else {
                                                if (xz40Var2 == 0) {
                                                    xz40Var2 = new xz40(new lm40[16]);
                                                }
                                                if (V != 0) {
                                                    xz40Var2.b(V);
                                                    V = 0;
                                                }
                                                xz40Var2.b(lm40Var6);
                                            }
                                        }
                                        lm40Var6 = lm40Var6.f;
                                        V = V;
                                        xz40Var2 = xz40Var2;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                V = vcc.V(xz40Var2);
                            }
                        }
                        lm40Var5 = lm40Var5.f;
                    }
                }
            }
            vcc.v(xz40Var, lm40Var4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [a.hps0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v0, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [a.lm40] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [a.lm40] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [a.xz40] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [a.xz40] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public static final void w(hps0 hps0Var, Function1 function1) {
        lm40 lm40Var = (lm40) hps0Var;
        if (!lm40Var.f20279a.n) {
            xcx.b("visitSubtreeIf called on an unattached node");
        }
        xz40 xz40Var = new xz40(new lm40[16]);
        lm40 lm40Var2 = lm40Var.f20279a;
        lm40 lm40Var3 = lm40Var2.f;
        if (lm40Var3 == null) {
            vcc.v(xz40Var, lm40Var2);
        } else {
            xz40Var.b(lm40Var3);
        }
        while (true) {
            int i = xz40Var.c;
            if (i == 0) {
                return;
            }
            lm40 lm40Var4 = (lm40) xz40Var.k(i - 1);
            if ((lm40Var4.d & 262144) != 0) {
                lm40 lm40Var5 = lm40Var4;
                while (true) {
                    if (lm40Var5 != null && lm40Var5.n) {
                        if ((lm40Var5.c & 262144) != 0) {
                            ?? V = lm40Var5;
                            ?? xz40Var2 = 0;
                            while (V != 0) {
                                if (V instanceof hps0) {
                                    hps0 hps0Var2 = (hps0) V;
                                    gps0 gps0Var = (Intrinsics.d(hps0Var.j(), hps0Var2.j()) && hps0Var.getClass() == hps0Var2.getClass()) ? (gps0) function1.invoke(hps0Var2) : gps0.f11699a;
                                    if (gps0Var != gps0.c) {
                                        if (gps0Var == gps0.b) {
                                            break;
                                        }
                                    } else {
                                        return;
                                    }
                                } else if ((V.c & 262144) != 0 && (V instanceof f3k)) {
                                    lm40 lm40Var6 = ((f3k) V).p;
                                    int i2 = 0;
                                    V = V;
                                    xz40Var2 = xz40Var2;
                                    while (lm40Var6 != null) {
                                        if ((lm40Var6.c & 262144) != 0) {
                                            i2++;
                                            xz40Var2 = xz40Var2;
                                            if (i2 == 1) {
                                                V = lm40Var6;
                                            } else {
                                                if (xz40Var2 == 0) {
                                                    xz40Var2 = new xz40(new lm40[16]);
                                                }
                                                if (V != 0) {
                                                    xz40Var2.b(V);
                                                    V = 0;
                                                }
                                                xz40Var2.b(lm40Var6);
                                            }
                                        }
                                        lm40Var6 = lm40Var6.f;
                                        V = V;
                                        xz40Var2 = xz40Var2;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                V = vcc.V(xz40Var2);
                            }
                        }
                        lm40Var5 = lm40Var5.f;
                    }
                }
            }
            vcc.v(xz40Var, lm40Var4);
        }
    }

    public static int x(int i) {
        int[] iArr = {1, 2, 3};
        for (int i2 = 0; i2 < 3; i2++) {
            int i3 = iArr[i2];
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i4 == i) {
                return i3;
            }
        }
        return 1;
    }
}
