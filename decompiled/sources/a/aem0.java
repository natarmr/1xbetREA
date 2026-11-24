package a;

import android.graphics.Paint;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class aem0 {
    public static ActionMode.Callback A(ActionMode.Callback callback, TextView textView) {
        int i = Build.VERSION.SDK_INT;
        return (i < 26 || i > 27 || (callback instanceof haq0) || callback == null) ? callback : new haq0(callback, textView);
    }

    public static String B(String str) {
        if (str.length() > 23) {
            int i = -1;
            for (int length = str.length() - 1; length >= 0; length--) {
                char cCharAt = str.charAt(length);
                if (cCharAt == '.' || cCharAt == '$') {
                    i = length;
                    break;
                }
            }
            str = str.substring(i + 1);
        }
        String strConcat = "".concat(str);
        return strConcat.substring(0, Math.min(strConcat.length(), 23));
    }

    public static void C(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static int D(Level level) {
        int iIntValue = level.intValue();
        if (iIntValue >= Level.SEVERE.intValue()) {
            return 6;
        }
        if (iIntValue >= Level.WARNING.intValue()) {
            return 5;
        }
        if (iIntValue >= Level.INFO.intValue()) {
            return 4;
        }
        return iIntValue >= Level.FINE.intValue() ? 3 : 2;
    }

    public static final void a(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(1639816907);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40Var, 174.0f);
            long jM75getBlack600d7_KjU = StaticColors.INSTANCE.m75getBlack600d7_KjU();
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, i120.Q(mm40VarE, jM75getBlack600d7_KjU, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cpl0(mm40Var, i, (byte) 25);
        }
    }

    public static final void b(mm40 mm40Var, dhn0 dhn0Var, Function0 function0, fet fetVar, int i, int i2) {
        int i3;
        mm40 mm40Var2;
        function0.getClass();
        fetVar.g0(883392493);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = i | (fetVar.g(mm40Var) ? 4 : 2);
        }
        int i5 = i3 | (fetVar.g(dhn0Var) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128);
        if (fetVar.U(i5 & 1, (i5 & 147) != 146)) {
            mm40Var2 = i4 != 0 ? jm40.b : mm40Var;
            mm40 mm40VarD = o7k0.d(mm40Var2, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(mm40VarD, 16.0f, 0.0f, 2);
            x5d x5dVarA = w5d.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
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
            ugn0 ugn0Var = dhn0Var.f6100a;
            a4x a4xVar = dhn0Var.b;
            if (ugn0Var == null) {
                fetVar.e0(-772383031);
                fetVar.r(false);
            } else {
                fetVar.e0(-772383030);
                if (ugn0Var.c.length() > 0) {
                    fetVar.e0(-1240398197);
                    g(ugn0Var, function0, fetVar, (i5 >> 3) & 112);
                    fetVar.r(false);
                } else {
                    fetVar.e0(-1240291123);
                    e(ugn0Var, fetVar, 0);
                    fetVar.r(false);
                }
                fetVar.r(false);
            }
            if (a4xVar.isEmpty()) {
                fetVar.e0(-771844405);
                fetVar.r(false);
            } else {
                fetVar.e0(-772075355);
                int iOrdinal = dhn0Var.c.ordinal();
                if (iOrdinal == 0) {
                    fetVar.e0(1776211877);
                    d(a4xVar, fetVar, 0);
                    fetVar.r(false);
                } else {
                    if (iOrdinal != 1) {
                        throw b1j.f(1776209661, fetVar, false);
                    }
                    fetVar.e0(1776214979);
                    c(a4xVar, fetVar, 0);
                    fetVar.r(false);
                }
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new lfc0(mm40Var2, (Object) dhn0Var, (Object) function0, i, i2, (byte) 15);
        }
    }

    public static final void c(a4x a4xVar, fet fetVar, int i) {
        fetVar.g0(-1069103179);
        int i2 = (fetVar.g(a4xVar) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
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
            Iterator itO = h97.o(fetVar, mm40VarC0, gqw0.v, 495598308, a4xVar);
            while (itO.hasNext()) {
                xgn0 xgn0Var = (xgn0) itO.next();
                ((g1t0) fetVar.k(j1t0.e)).getClass();
                f(jm40Var, xgn0Var, g1t0.n(), fetVar, 6);
            }
            fetVar.r(false);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eup(a4xVar, i, (byte) 24);
        }
    }

    public static final void d(a4x a4xVar, fet fetVar, int i) {
        fet fetVar2;
        fet fetVar3;
        fetVar.g0(-440086894);
        int i2 = (fetVar.g(a4xVar) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            long background = ((ThemeColors) fetVar.k(zaq0.b)).getBackground();
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = s5x0.J(i120.Q(mm40VarD, background, vgg0.a(10.0f)), 12.0f);
            x5d x5dVarA = w5d.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarJ);
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
            Iterator itO = h97.o(fetVar, mm40VarC0, gqw0.v, 1076278429, a4xVar);
            int i3 = 0;
            while (itO.hasNext()) {
                Object next = itO.next();
                int i4 = i3 + 1;
                if (i3 < 0) {
                    q3d.p();
                    throw null;
                }
                xgn0 xgn0Var = (xgn0) next;
                if (i3 > 0) {
                    fetVar.e0(1367062382);
                    fetVar3 = fetVar;
                    mbc.o(zfi0.f44303a, null, false, fetVar3, 6, 6);
                    fetVar3.r(false);
                } else {
                    fetVar3 = fetVar;
                    fetVar3.e0(1367146950);
                    fetVar3.r(false);
                }
                zcl zclVar2 = qmk.f28987a;
                mm40 mm40VarE = o7k0.e(jm40Var, 20.0f);
                ((g1t0) fetVar3.k(j1t0.e)).getClass();
                f(mm40VarE, xgn0Var, g1t0.g(), fetVar3, 0);
                i3 = i4;
                fetVar = fetVar3;
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
            yfe0VarU.d = new eup(a4xVar, i, (byte) 25);
        }
    }

    public static final void e(ugn0 ugn0Var, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(988934080);
        int i2 = i | (fetVar2.g(ugn0Var) ? 4 : 2);
        if (fetVar2.U(i2 & 1, (i2 & 3) != 2)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            byte b = 14;
            qw3 qw3Var = new qw3(8.0f, true, new jf4(b));
            yx7 yx7Var = gqw0.k;
            thg0 thg0VarA = shg0.a(qw3Var, yx7Var, fetVar2, 48);
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
            x7z x7zVarI = ohs0.i(fetVar2, mm40VarC0, shdVar4, 1.0f, true);
            thg0 thg0VarA2 = shg0.a(new qw3(4.0f, true, new jf4(b)), yx7Var, fetVar2, 48);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, x7zVarI);
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
            mm40 mm40VarE0 = o2e.e0(o7k0.n(jm40Var, 16.0f), "SUCCESS_BET_INFO_IMG");
            pm80 pm80VarF = a8k0.F(R.drawable.ic_glyph_coupon, 0, fetVar2);
            zfn zfnVar = zaq0.b;
            j0x.b(pm80VarF, null, mm40VarE0, null, null, 0.0f, new m78(((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), 5), fetVar2, 56, 56);
            mm40 mm40VarE1 = o2e.e0(jm40Var, "SUCCESS_BET_INFO_BET_TYPE");
            String str = ugn0Var.f35634a;
            zfn zfnVar2 = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar2)).getClass();
            v8q0.a(str, mm40VarE1, ((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.b(), fetVar, 48, 24960, 110584);
            fetVar.r(true);
            mm40 mm40VarE2 = o2e.e0(jm40Var, "SUCCESS_BET_INFO_BET_NUMBER");
            String str2 = ugn0Var.b;
            ((g1t0) fetVar.k(zfnVar2)).getClass();
            v8q0.a(str2, mm40VarE2, ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.b(), fetVar, 48, 24960, 110584);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new abn0(ugn0Var, i, (byte) 7);
        }
    }

    public static final void f(mm40 mm40Var, xgn0 xgn0Var, y9q0 y9q0Var, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        fetVar.g0(-1679401969);
        if ((i & 6) == 0) {
            i2 = i | (fetVar.g(mm40Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = i2 | (fetVar.g(xgn0Var) ? 32 : 16) | (fetVar.g(y9q0Var) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.k, fetVar, 48);
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
            v8q0.a(xgn0Var.f40848a, o2e.e0(ohs0.i(fetVar, mm40VarC0, gqw0.v, 1.0f, true), "SUCCESS_BET_INFO_ROW_TITLE"), ((ThemeColors) fetVar.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0Var, fetVar, 0, ((i3 << 15) & 29360128) | 24960, 110584);
            fetVar2 = fetVar;
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(-1069594261, new abn0(xgn0Var, (byte) 6), fetVar2), fetVar2, 56);
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new l51((Object) mm40Var, (Object) xgn0Var, (Object) y9q0Var, i, (byte) 17);
        }
    }

    public static final void g(ugn0 ugn0Var, Function0 function0, fet fetVar, int i) {
        int i2;
        Function0 function1 = function0;
        fet fetVar2 = fetVar;
        fetVar2.g0(544967913);
        if ((i & 6) == 0) {
            i2 = i | (fetVar2.g(ugn0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.i(function1) ? 32 : 16;
        }
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 32.0f);
            byte b = 14;
            qw3 qw3Var = new qw3(6.0f, true, new jf4(b));
            yx7 yx7Var = gqw0.k;
            thg0 thg0VarA = shg0.a(qw3Var, yx7Var, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE);
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
            thg0 thg0VarA2 = shg0.a(new qw3(4.0f, true, new jf4(b)), yx7Var, fetVar2, 48);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, x7zVarI);
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
            mm40 mm40VarE0 = o2e.e0(o7k0.n(jm40Var, 24.0f), "SUCCESS_BET_INFO_SHARE_HEADER_ICON");
            pm80 pm80VarF = a8k0.F(R.drawable.ic_glyph_coupon, 0, fetVar2);
            zfn zfnVar = zaq0.b;
            int i3 = i2;
            j0x.b(pm80VarF, null, mm40VarE0, null, null, 0.0f, new m78(((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), 5), fetVar, 56, 56);
            x5d x5dVarA = w5d.a(new qw3(2.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, jm40Var);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, shdVar);
            jpm0.o(fetVar, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC2, shdVar4);
            mm40 mm40VarE1 = o2e.e0(jm40Var, "SUCCESS_BET_INFO_BET_TYPE");
            String str = ugn0Var.f35634a;
            zfn zfnVar2 = j1t0.e;
            ((g1t0) fetVar.k(zfnVar2)).getClass();
            v8q0.a(str, mm40VarE1, ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.b(), fetVar, 48, 24960, 110584);
            mm40 mm40VarE2 = o2e.e0(jm40Var, "SUCCESS_BET_INFO_BET_NUMBER");
            String str2 = ugn0Var.b;
            ((g1t0) fetVar.k(zfnVar2)).getClass();
            v8q0.a(str2, mm40VarE2, ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.g(), fetVar, 48, 24960, 110584);
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.r(true);
            function1 = function0;
            qzb.n(phu0.H(jm40Var, new ktc(ymx.INTERVAL_1000, 2), 0), new wul(nul.e, oe9.c, new ve9(ugn0Var.c, R.drawable.ic_glyph_share), true, false, false), function1, fetVar2, (i3 << 3) & 896, 0);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o1l0((Object) ugn0Var, (Object) function1, i, (byte) 17);
        }
    }

    public static final void h(mm40 mm40Var, pl7 pl7Var, Function1 function1, fet fetVar, int i) {
        Object acdVar;
        w2d w2dVar;
        xcz xczVar;
        pl7Var.getClass();
        function1.getClass();
        fetVar.g0(-824359756);
        int i2 = i | (fetVar.g(pl7Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            w2d w2dVarW0 = uzb.w0(0, fetVar);
            wom womVarF = mom.f(fetVar);
            androidx.compose.runtime.d dVar = zaq0.b;
            long secondary = ((ThemeColors) fetVar.k(dVar)).getSecondary();
            long backgroundContent = ((ThemeColors) fetVar.k(dVar)).getBackgroundContent();
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            Boolean boolValueOf = Boolean.valueOf(pl7Var.e());
            boolean zI = ((i2 & 112) == 32) | fetVar.i(w2dVarW0) | fetVar.g(xczVarA) | ((i2 & 896) == 256);
            Object objP = fetVar.P();
            if (zI || objP == ukd.f35823a) {
                w2dVar = w2dVarW0;
                acdVar = new acd(pl7Var, w2dVar, xczVarA, function1, null, (byte) 3);
                xczVar = xczVarA;
                fetVar.o0(acdVar);
            } else {
                xczVar = xczVarA;
                acdVar = objP;
                w2dVar = w2dVarW0;
            }
            m0x0.t(fetVar, boolValueOf, (Function2) acdVar);
            v2n0.b(knm0.r(mm40Var), w2dVar, ((ThemeColors) fetVar.k(dVar)).getBackground(), 0.0f, u1c.M(748121823, new mxn(w2dVar, backgroundContent, pl7Var, function1, secondary), fetVar), u1c.M(632679067, new vbd(pl7Var, womVarF, w2dVar, function1, xczVar, (byte) 2), fetVar), fetVar, 224320, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wbd(mm40Var, pl7Var, function1, i, (byte) 3);
        }
    }

    public static final void i(int i, int i2, fet fetVar, mm40 mm40Var) {
        int i3;
        fetVar.g0(-735931895);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        }
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            if (i4 != 0) {
                mm40Var = jm40.b;
            }
            zcl zclVar = qmk.f28987a;
            ibc.A(mm40Var, 4.0f, rsr0.e, fetVar, (i3 & 14) | 384);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new i00(mm40Var, i, i2, (byte) 19);
        }
    }

    public static final void j(mm40 mm40Var, aor0 aor0Var, fet fetVar, int i) {
        int i2;
        aor0Var.getClass();
        fetVar.g0(-835818101);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(aor0Var) ? 32 : 16;
        }
        byte b = 1;
        if (!fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            fetVar.X();
        } else if (aor0Var instanceof ynr0) {
            fetVar.e0(-1931408374);
            etm0.f((ynr0) aor0Var, o7k0.d(mm40Var, 1.0f), fetVar, (i2 >> 3) & 14);
            fetVar.r(false);
        } else if (aor0Var instanceof znr0) {
            fetVar.e0(-62296972);
            k5n0.k(o7k0.d(mm40Var, 1.0f), (znr0) aor0Var, fetVar, i2 & 112);
            fetVar.r(false);
        } else if (aor0Var.equals(wnr0.f39462a)) {
            fetVar.e0(-62290494);
            a(0, fetVar, o7k0.d(mm40Var, 1.0f));
            fetVar.r(false);
        } else {
            if (!aor0Var.equals(xnr0.f41183a)) {
                throw b1j.f(-62305974, fetVar, false);
            }
            fetVar.e0(-62286636);
            zcl zclVar = qmk.f28987a;
            qxw.o(fetVar, o7k0.d(o7k0.e(mm40Var, 174.0f), 1.0f));
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nur0(mm40Var, aor0Var, i, b);
        }
    }

    public static final void k(mm40 mm40Var, gy40 gy40Var, gk5 gk5Var, boolean z, Function0 function0, Function0 function1, Function0 function2, fet fetVar, int i) {
        long secondary20;
        long secondary10;
        long secondary21;
        long secondary11;
        fet fetVar2 = fetVar;
        gy40Var.getClass();
        gk5Var.getClass();
        function0.getClass();
        function1.getClass();
        function2.getClass();
        fetVar2.g0(871202552);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(gk5Var) ? 256 : 128) | (fetVar2.h(z) ? 2048 : 1024) | (fetVar2.i(function0) ? 16384 : 8192) | (fetVar2.i(function1) ? 131072 : 65536) | (fetVar2.i(function2) ? 1048576 : 524288);
        if (fetVar2.U(i2 & 1, (599187 & i2) != 599186)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40Var);
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
            jpm0.o(fetVar2, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            long backgroundContent = afn0.m(fetVar2).getBackgroundContent();
            ljc ljcVar = jd8.n;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarQ = i120.Q(jm40Var, backgroundContent, ljcVar);
            zcl zclVar = qmk.f28987a;
            zq8.a(0, fetVar2, o7k0.d(o7k0.e(mm40VarQ, 12.0f), 1.0f));
            mm40 mm40VarE0 = o2e.e0(i120.Q(o7k0.d(jm40Var, 1.0f), afn0.m(fetVar2).getBackgroundContent(), vgg0.c(0.0f, 0.0f, 16.0f, 16.0f, 3)), "TransactionButtonBox");
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarE0);
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
            mm40 mm40VarN = s5x0.N(o7k0.d(jm40Var, 1.0f), 2.0f, 0.0f, 2.0f, 12.0f, 2);
            thg0 thg0VarA = shg0.a(uc9.f, gqw0.j, fetVar2, 6);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarN);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, shdVar);
            jpm0.o(fetVar2, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC2, shdVar4);
            zhg0 zhg0Var = zhg0.f44392a;
            mm40 mm40VarA = zhg0Var.a(1.0f, jm40Var, true);
            boolean z3 = gk5Var.f11429a;
            boolean z4 = gk5Var.b;
            mm40 mm40VarW = y860.W(mm40VarA, gy40Var, null, z3 && z, null, function0, 24);
            if (z3) {
                fetVar2.e0(-661496311);
                secondary20 = afn0.m(fetVar2).getCommerce();
                fetVar2.r(false);
            } else {
                fetVar2.e0(-661416858);
                secondary20 = afn0.m(fetVar2).getSecondary20();
                fetVar2.r(false);
            }
            long j = secondary20;
            if (z3) {
                fetVar2.e0(-661257115);
                secondary10 = afn0.m(fetVar2).getCommerceTint();
                fetVar2.r(false);
            } else {
                fetVar2.e0(-661173818);
                secondary10 = afn0.m(fetVar2).getSecondary10();
                fetVar2.r(false);
            }
            idm0.h(R.string.top_up, R.drawable.ic_glyph_replenish_account, 0, j, secondary10, fetVar2, mm40VarW);
            mm40 mm40VarW2 = y860.W(zhg0Var.a(1.0f, jm40Var, true), gy40Var, null, z4 && z, null, function1, 24);
            if (z4) {
                secondary21 = cs0.e(fetVar2, -298398634, fetVar2, false);
            } else {
                fetVar2.e0(-298397638);
                secondary21 = afn0.m(fetVar2).getSecondary20();
                fetVar2.r(false);
            }
            long j2 = secondary21;
            if (z4) {
                fetVar2.e0(-298393984);
                secondary11 = afn0.m(fetVar2).getBackgroundLight60();
            } else {
                fetVar2.e0(-298392678);
                secondary11 = afn0.m(fetVar2).getSecondary10();
            }
            fetVar2.r(false);
            idm0.h(R.string.withdraw_money, R.drawable.ic_glyph_withdraw_account, 0, j2, secondary11, fetVar2, mm40VarW2);
            idm0.h(R.string.all_balances, R.drawable.ic_glyph_wallet_alt, 0, afn0.m(fetVar).getPrimary(), afn0.m(fetVar).getBackgroundLight60(), fetVar, y860.W(zhg0Var.a(1.0f, jm40Var, true), gy40Var, null, z, null, function2, 24));
            fetVar2 = fetVar;
            ohs0.x(fetVar2, true, true, true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ecc(mm40Var, (Object) gy40Var, (Object) gk5Var, z, (Object) function0, (Object) function1, (Object) function2, i, (byte) 17);
        }
    }

    public static final void l(mm40 mm40Var, a480 a480Var, fet fetVar, int i) {
        int i2;
        k6z k6zVar;
        fetVar.g0(-1244384085);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        byte b = 16;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(a480Var) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            if (a480Var.c) {
                fetVar.e0(-1852191598);
                k6zVar = (k6z) fetVar.k(bmd.n);
                fetVar.r(false);
            } else {
                fetVar.e0(-1852190674);
                fetVar.r(false);
                k6zVar = k6z.f17794a;
            }
            obc.d(bmd.n.a(k6zVar), u1c.M(2016823275, new htr0(mm40Var, a480Var, b), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nur0((Object) mm40Var, (Object) a480Var, i, (byte) 12);
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0125  */
    public static final bbp0 m(e9p0 e9p0Var, g2v g2vVar, v5l0 v5l0Var, boolean z, long j, a4x a4xVar) {
        l0l0 l0l0Var;
        a4xVar.getClass();
        if (e9p0Var == null && !z) {
            return new bbp0(new t8p0(ozb.Q(j, g2vVar)), (a4x) null, 6);
        }
        s8p0 s8p0Var = s8p0.f31814a;
        if (e9p0Var != null) {
            Object obj = e9p0Var.b;
            Object obj2 = e9p0Var.f7433a;
            Object obj3 = e9p0Var.d;
            e0g0 e0g0Var = j0g0.b;
            if (!(obj3 instanceof g0g0)) {
                Object objA = j0g0.a(obj2);
                if (objA == null) {
                    objA = obj2;
                }
                if (objA instanceof ri9) {
                    Object objA2 = j0g0.a(obj);
                    if (objA2 == null) {
                        objA2 = obj;
                    }
                    if (objA2 instanceof ri9) {
                        if (obj instanceof g0g0) {
                            return new bbp0(new t8p0(ozb.Q(j, g2vVar)), (a4x) null, 6);
                        }
                    }
                }
            } else if ((obj instanceof g0g0) && (obj2 instanceof g0g0)) {
                return new bbp0(new t8p0(ozb.Q(j, g2vVar)), (a4x) null, 6);
            }
            return a4xVar.isEmpty() ? new bbp0(new t8p0(ozb.P(j, g2vVar)), (a4x) null, 6) : new bbp0(s8p0Var, a4xVar, 4);
        }
        int iOrdinal = v5l0Var.ordinal();
        if (iOrdinal == 0) {
            l0l0Var = g0l0.f10465a;
        } else if (iOrdinal == 1) {
            l0l0Var = k0l0.f17474a;
        } else if (iOrdinal == 2) {
            l0l0Var = j0l0.f15687a;
        } else if (iOrdinal == 3) {
            l0l0Var = i0l0.f13953a;
        } else {
            if (iOrdinal != 4) {
                t9f.b();
                return null;
            }
            l0l0Var = h0l0.f12241a;
        }
        m9p0 m9p0Var = new m9p0("LIVE_CARD_HEADER_SHIMMER_KEY", new ijm());
        q0s q0sVar = q0s.f27918a;
        j9p0 j9p0Var = new j9p0("LIVE_CARD_SHIMMER_KEY", new vb90(q0sVar, dyb.g0(new x56(l0l0Var), new x56(l0l0Var), new x56(l0l0Var)), false, true));
        m9p0 m9p0Var2 = new m9p0("LINE_CARD_HEADER_SHIMMER_KEY", new ijm());
        j9p0 j9p0Var2 = new j9p0("LINE_CARD_SHIMMER_KEY", new vb90(q0sVar, dyb.g0(new x56(l0l0Var), new x56(l0l0Var), new x56(l0l0Var)), false, true));
        m9p0 m9p0Var3 = new m9p0("RESULT_CARD_HEADER_SHIMMER_KEY", new ijm());
        vcg0 vcg0Var = vcg0.f37186a;
        return new bbp0((u8p0) s8p0Var, (a4x) dyb.g0(m9p0Var, j9p0Var, m9p0Var2, j9p0Var2, m9p0Var3, new r8p0("RESULT_CARD_CALENDAR_SHIMMER_KEY", new bpm()), new dap0("RESULT_CARD_SHIMMER_KEY", new vb90(q0s.b, dyb.g0(pzw.I(v5l0Var), pzw.I(v5l0Var)), false, true))), true);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00ae  */
    public static final z8t0 n(Object obj, Date date, Locale locale) {
        a4x a4xVarO0;
        e0g0 e0g0Var = j0g0.b;
        Object obj2 = obj;
        boolean z = obj2 instanceof g0g0;
        if (z) {
            return y8t0.f42211a;
        }
        List list = (List) (z ? null : obj2);
        Integer numValueOf = list != null ? Integer.valueOf(list.indexOf(date)) : null;
        if (numValueOf != null && numValueOf.intValue() == -1) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
        if (z) {
            obj2 = null;
        }
        List list2 = (List) obj2;
        if (list2 != null) {
            ArrayList arrayList = new ArrayList(r3d.q(list2, 10));
            int i = 0;
            for (Object obj3 : list2) {
                int i2 = i + 1;
                if (i < 0) {
                    q3d.p();
                    throw null;
                }
                Date date2 = (Date) obj3;
                String str = new SimpleDateFormat("dd", locale).format(date2);
                String str2 = new SimpleDateFormat("MMMM", locale).format(date2);
                String str3 = !ntb.U(date2) ? new SimpleDateFormat("yyyy", locale).format(date2) : null;
                str.getClass();
                str2.getClass();
                arrayList.add(new cdg0(str, str2, str3, ntb.W(date2), iIntValue == i));
                i = i2;
            }
            a4xVarO0 = dyb.o0(arrayList);
            if (a4xVarO0 == null) {
                a4xVarO0 = lak0.c;
            }
        } else {
            a4xVarO0 = lak0.c;
        }
        return new x8t0(rdj.c(rdj.f30294a, sdj.UNIVERSAL, date, null, 60), new apm(a4xVarO0, vcg0.f37186a, iIntValue, true));
    }

    public static final dfa0 o(rrh rrhVar, rrh rrhVar2) {
        return new dfa0(dyb.r0(q3d.j(uvw.E(Float.valueOf(rrhVar.d), Float.valueOf(rrhVar2.d), ""), uvw.E(Float.valueOf(rrhVar.e), Float.valueOf(rrhVar2.e), ""), uvw.G(Float.valueOf(rrhVar.f), Float.valueOf(rrhVar2.f)), uvw.E(Float.valueOf(rrhVar.g), Float.valueOf(rrhVar2.g), ""), uvw.E(Float.valueOf(rrhVar.h), Float.valueOf(rrhVar2.h), ""))), rrhVar.c);
    }

    public static bsb0 p(AppCompatTextView appCompatTextView) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return new bsb0(ia3.z(appCompatTextView));
        }
        TextPaint textPaint = new TextPaint(appCompatTextView.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int breakStrategy = appCompatTextView.getBreakStrategy();
        int hyphenationFrequency = appCompatTextView.getHyphenationFrequency();
        if (appCompatTextView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else if (i < 28 || (appCompatTextView.getInputType() & 15) != 3) {
            boolean z = appCompatTextView.getLayoutDirection() == 1;
            switch (appCompatTextView.getTextDirection()) {
                case 2:
                    textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                    break;
                case 3:
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                    break;
                case 4:
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                    break;
                case 5:
                    textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                    break;
                case 6:
                    break;
                case 7:
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    break;
                default:
                    if (z) {
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    }
                    break;
            }
        } else {
            byte directionality = Character.getDirectionality(ia3.l(DecimalFormatSymbols.getInstance(appCompatTextView.getTextLocale()))[0].codePointAt(0));
            textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        return new bsb0(textPaint, textDirectionHeuristic, breakStrategy, hyphenationFrequency);
    }

    public static final snu0 q(long j, boolean z, long j2) {
        mqu0 mqu0Var;
        if (j == 304) {
            if (j2 == 2721879) {
                mqu0Var = mqu0.h;
            } else {
                mqu0Var = j2 == 2669842 ? mqu0.g : mqu0.f22241a;
            }
        } else if (j == 320) {
            mqu0Var = mqu0.b;
        } else if (j == 287) {
            mqu0Var = mqu0.i;
        } else if (j == 311) {
            mqu0Var = mqu0.j;
        } else if (j == 312) {
            mqu0Var = mqu0.c;
        } else if (j == 301) {
            if (j2 == 2736841) {
                mqu0Var = mqu0.k;
            } else {
                mqu0Var = j2 == 2747687 ? mqu0.l : mqu0.f22241a;
            }
        } else if (j == 284) {
            if (j2 == 2752929) {
                mqu0Var = mqu0.m;
            } else {
                mqu0Var = j2 == 2385705 ? mqu0.n : mqu0.f22241a;
            }
        } else if (j == 198) {
            mqu0Var = mqu0.d;
        } else if (j == 235 && z) {
            mqu0Var = mqu0.e;
        } else {
            mqu0Var = j == 326 ? mqu0.f : mqu0.f22241a;
        }
        return mqu0Var == mqu0.f22241a ? rnu0.f30806a : new qnu0(mqu0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void r(TextView textView, int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 27) {
            ga3.t(textView, i, i2, i3, i4);
        } else if (textView instanceof v05) {
            ((v05) textView).setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void s(int i, TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            ga3.u(i, textView);
        } else if (textView instanceof v05) {
            ((v05) textView).setAutoSizeTextTypeWithDefaults(i);
        }
    }

    public static void t(int i, TextView textView) {
        z1x.w(i);
        if (Build.VERSION.SDK_INT >= 28) {
            ia3.D(i, textView);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void u(int i, TextView textView) {
        z1x.w(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    public static void v(int i, TextView textView) {
        z1x.w(i);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i != fontMetricsInt) {
            textView.setLineSpacing(i - fontMetricsInt, 1.0f);
        }
    }

    public static final dgx w(pfx pfxVar) {
        return new dgx(pfxVar.f26926a, pfxVar.b, pfxVar.c, pfxVar.d);
    }

    public static final zdm0 x(hdm0 hdm0Var, eme emeVar, ctf0 ctf0Var) {
        mom0 lom0Var;
        vdm0 udm0Var;
        hdm0Var.getClass();
        emeVar.getClass();
        ctf0Var.getClass();
        if (hdm0Var instanceof edm0) {
            return new wdm0(emeVar);
        }
        if (hdm0Var instanceof fdm0) {
            return new xdm0(emeVar);
        }
        if (!(hdm0Var instanceof gdm0)) {
            t9f.b();
            return null;
        }
        odm0 odm0Var = ((gdm0) hdm0Var).b;
        odm0Var.getClass();
        bom0 bom0VarA = odm0Var.a();
        bom0VarA.getClass();
        if (bom0VarA instanceof ynm0) {
            aoq0 aoq0Var = ((ynm0) bom0VarA).f42948a;
            rdj rdjVar = rdj.f30294a;
            lom0Var = new jom0(rdj.g(aoq0Var, efj.UNIVERSAL, Boolean.valueOf(ctf0Var.h()), false, 48));
        } else if (bom0VarA instanceof znm0) {
            lom0Var = new kom0(((znm0) bom0VarA).f44684a);
        } else {
            if (!(bom0VarA instanceof aom0)) {
                t9f.b();
                return null;
            }
            aom0 aom0Var = (aom0) bom0VarA;
            aoq0 aoq0Var2 = aom0Var.f1209a;
            rdj rdjVar2 = rdj.f30294a;
            lom0Var = new lom0(rdj.g(aoq0Var2, efj.UNIVERSAL, Boolean.valueOf(ctf0Var.h()), false, 48), aom0Var.b);
        }
        mom0 mom0Var = lom0Var;
        if (odm0Var instanceof jdm0) {
            jdm0 jdm0Var = (jdm0) odm0Var;
            udm0Var = new pdm0(jdm0Var.f16336a, dem0.t(jdm0Var.b), dem0.t(jdm0Var.c), gfx.U(jdm0Var.d), mom0Var);
        } else if (odm0Var instanceof kdm0) {
            kdm0 kdm0Var = (kdm0) odm0Var;
            udm0Var = new qdm0(kdm0Var.f18114a, kdm0Var.b, mom0Var);
        } else if (odm0Var instanceof ldm0) {
            ldm0 ldm0Var = (ldm0) odm0Var;
            udm0Var = new sdm0(ldm0Var.f19858a, ldm0Var.b, ldm0Var.c, mom0Var);
        } else if (odm0Var instanceof mdm0) {
            mdm0 mdm0Var = (mdm0) odm0Var;
            udm0Var = new tdm0(mdm0Var.f21604a, gfx.U(mdm0Var.b), dem0.t(mdm0Var.c), dem0.t(mdm0Var.d), mdm0Var.e, mdm0Var.f, mom0Var);
        } else {
            if (!(odm0Var instanceof ndm0)) {
                t9f.b();
                return null;
            }
            ndm0 ndm0Var = (ndm0) odm0Var;
            udm0Var = new udm0(ndm0Var.f23342a, ndm0Var.b, ndm0Var.c, mom0Var);
        }
        return new ydm0(emeVar, udm0Var);
    }

    public static final smp0 y(bnp0 bnp0Var, String str, ArrayList arrayList, ArrayList arrayList2) throws rp20 {
        Object next;
        Object next2;
        bnp0Var.getClass();
        str.getClass();
        Object obj = null;
        if (arrayList.isEmpty() || arrayList2.isEmpty()) {
            jf4.k(null);
            return null;
        }
        Boolean bool = bnp0Var.f2896a;
        if (bool == null) {
            throw new rp20("isIncoming is null");
        }
        ymp0 ymp0Var = bool.booleanValue() ? ymp0.f42902a : ymp0.b;
        Long l = bnp0Var.b;
        if (l == null) {
            throw new rp20("dateInSecondsUnixTime is null");
        }
        znq0 znq0Var = new znq0(l.longValue());
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.d(((ufp0) next).f35586a, bnp0Var.d));
        ufp0 ufp0Var = (ufp0) next;
        ufp0 ufp0Var2 = ufp0Var == null ? new ufp0(0, "", "", "", iun.f15405a) : ufp0Var;
        Iterator it2 = arrayList.iterator();
        do {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
        } while (!Intrinsics.d(((ufp0) next2).f35586a, str));
        ufp0 ufp0Var3 = (ufp0) next2;
        if (ufp0Var3 == null) {
            throw new rp20("hostTeamModel is null");
        }
        for (Object obj2 : arrayList2) {
            if (((b9a0) obj2).f2199a.equals(bnp0Var.c)) {
                obj = obj2;
                break;
            }
        }
        b9a0 b9a0Var = (b9a0) obj;
        if (b9a0Var == null) {
            throw new rp20("playerModel is null");
        }
        String str2 = bnp0Var.e;
        if (str2 == null) {
            str2 = "";
        }
        return new smp0(ymp0Var, znq0Var, ufp0Var2, ufp0Var3, b9a0Var, str2);
    }

    public static ActionMode.Callback z(ActionMode.Callback callback) {
        return (!(callback instanceof haq0) || Build.VERSION.SDK_INT < 26) ? callback : ((haq0) callback).f12737a;
    }
}
