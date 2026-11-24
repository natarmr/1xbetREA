package a;

import android.R;
import android.content.Context;
import android.gov.nist.core.Separators;
import android.graphics.Bitmap;
import android.javax.sip.message.Request;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.xplatform.betting.core.zip.model.zip.BetZip;
import org.xplatform.betting.core.zip.model.zip.bet.BetViewType;
import org.xplatform.betting.core.zip.model.zip.bet.ChildBets;
import org.xplatform.uikit.compose.color.CustomColors;
import org.xplatform.uikit.compose.color.IndividualColors;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class cy2 {
    public static final ugd t;
    public static final vt5 w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f5152a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, JosStatusCodes.RTN_CODE_COMMON_ERROR, 7350};
    public static final int[] b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};
    public static final int[] c = {R.attr.drawable};
    public static final int[] d = {R.attr.name, R.attr.animation};
    public static final int[] e = {R.attr.interpolator, R.attr.duration, R.attr.startOffset, R.attr.repeatCount, R.attr.repeatMode, R.attr.valueFrom, R.attr.valueTo, R.attr.valueType};
    public static final int[] f = {R.attr.ordering};
    public static final int[] g = {R.attr.valueFrom, R.attr.valueTo, R.attr.valueType, R.attr.propertyName};
    public static final int[] h = {R.attr.value, R.attr.interpolator, R.attr.valueType, R.attr.fraction};
    public static final int[] i = {R.attr.propertyName, R.attr.pathData, R.attr.propertyXName, R.attr.propertyYName};
    public static final int[] j = {R.attr.tension, R.attr.extraTension};
    public static final int[] k = {R.attr.factor};
    public static final int[] l = {R.attr.factor};
    public static final int[] m = {R.attr.cycles};
    public static final int[] n = {R.attr.tension};
    public static final int[] o = {R.attr.controlX1, R.attr.controlY1, R.attr.controlX2, R.attr.controlY2, R.attr.pathData};
    public static final ugd p = new ugd(-1332734753, false, new i5b(9));
    public static final ugd q = new ugd(1557947352, false, new bhd(16));
    public static final ugd r = new ugd(410976513, false, new bhd(17));
    public static final ugd s = new ugd(-493289418, false, new ehd(23));
    public static final ugd u = new ugd(-255901932, false, new qhd(29));
    public static final ugd v = new ugd(81466674, false, new thd((byte) 0));
    public static final ar20 x = new ar20("TEXT", true);
    public static final ar20 y = new ar20("CODE_LINE", true);
    public static final ar20 z = new ar20("BLOCK_QUOTE", true);
    public static final ar20 A = new ar20("HTML_BLOCK_CONTENT", true);
    public static final ar20 B = new ar20(Separators.QUOTE, true);
    public static final ar20 C = new ar20(Separators.DOUBLE_QUOTE, true);
    public static final ar20 D = new ar20(Separators.LPAREN, true);
    public static final ar20 E = new ar20(Separators.RPAREN, true);
    public static final ar20 F = new ar20("[", true);
    public static final ar20 G = new ar20("]", true);
    public static final ar20 H = new ar20(Separators.LESS_THAN, true);
    public static final ar20 I = new ar20(Separators.GREATER_THAN, true);
    public static final ar20 J = new ar20(Separators.COLON, true);
    public static final ar20 K = new ar20("!", true);
    public static final ar20 L = new ar20("BR", true);
    public static final ar20 M = new ar20("EOL", true);
    public static final ar20 N = new ar20("LINK_ID", true);
    public static final ar20 O = new ar20("ATX_HEADER", true);
    public static final ar20 P = new ar20("ATX_CONTENT", true);
    public static final ar20 Q = new ar20("SETEXT_1", true);
    public static final ar20 R = new ar20("SETEXT_2", true);
    public static final ar20 S = new ar20("SETEXT_CONTENT", true);
    public static final ar20 T = new ar20("EMPH", true);
    public static final ar20 U = new ar20("BACKTICK", true);
    public static final ar20 V = new ar20("ESCAPED_BACKTICKS", true);
    public static final ar20 W = new ar20("LIST_BULLET", true);
    public static final ar20 X = new ar20("URL", true);
    public static final ar20 Y = new ar20("HORIZONTAL_RULE", true);
    public static final ar20 Z = new ar20("LIST_NUMBER", true);
    public static final ar20 a0 = new ar20("FENCE_LANG", true);
    public static final ar20 b0 = new ar20("CODE_FENCE_START", true);
    public static final ar20 c0 = new ar20("CODE_FENCE_CONTENT", true);
    public static final ar20 d0 = new ar20("CODE_FENCE_END", true);
    public static final ar20 e0 = new ar20("LINK_TITLE", true);
    public static final ar20 f0 = new ar20("AUTOLINK", true);
    public static final ar20 g0 = new ar20("EMAIL_AUTOLINK", true);
    public static final ar20 h0 = new ar20("HTML_TAG", true);
    public static final ar20 i0 = new ar20("BAD_CHARACTER", true);
    public static final fr20 j0 = new fr20("WHITE_SPACE", true);

    static {
        byte b2 = 28;
        t = new ugd(260445719, false, new ihd(b2));
        w = new vt5(b2);
    }

    public static final List A(List list, BetViewType betViewType, int i2) {
        ArrayList arrayListU = twn.u(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BetZip betZip = (BetZip) it.next();
            if (j07.f15668a[betViewType.ordinal()] == 1) {
                if (betZip.z) {
                    return iun.f15405a;
                }
                if (arrayListU.isEmpty()) {
                    arrayListU.add(new ChildBets(0, 3));
                }
                ChildBets childBets = (ChildBets) CollectionsKt.firstOrNull(arrayListU);
                if (childBets != null) {
                    childBets.a(betZip);
                }
            } else if (arrayListU.isEmpty() || !((ChildBets) dw9.l(1, arrayListU)).a(betZip)) {
                ChildBets childBets2 = new ChildBets(i2, 2);
                childBets2.a(betZip);
                arrayListU.add(childBets2);
            }
        }
        return arrayListU;
    }

    public static int B(q8b q8bVar) throws kq80 {
        int iG = q8bVar.g(4);
        if (iG == 15) {
            if (q8bVar.b() >= 24) {
                return q8bVar.g(24);
            }
            throw kq80.a("AAC header insufficient data", null);
        }
        if (iG < 13) {
            return f5152a[iG];
        }
        throw kq80.a("AAC header wrong Sampling Frequency Index", null);
    }

    public static final boolean C(Bitmap.Config config) {
        return Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE;
    }

    public static go3 D(String str) {
        str.getClass();
        List listSplit$default = StringsKt__StringsKt.split$default(str, new String[]{Separators.DOT}, false, 0, 6, null);
        if (listSplit$default.size() != 3) {
            c99.s(kng0.l("Cannot parse version from '", str, Separators.QUOTE));
            return null;
        }
        String str2 = (String) listSplit$default.get(0);
        String str3 = (String) listSplit$default.get(1);
        String str4 = (String) listSplit$default.get(2);
        Integer intOrNull = StringsKt.toIntOrNull(str2);
        if (intOrNull == null) {
            c99.s(kng0.l("Cannot parse sprint version from '", str2, Separators.QUOTE));
            return null;
        }
        int iIntValue = intOrNull.intValue();
        Integer intOrNull2 = StringsKt.toIntOrNull(str3);
        if (intOrNull2 == null) {
            c99.s(kng0.l("Cannot parse patch version from '", str3, Separators.QUOTE));
            return null;
        }
        int iIntValue2 = intOrNull2.intValue();
        Integer intOrNull3 = StringsKt.toIntOrNull(str4);
        if (intOrNull3 != null) {
            return new go3(iIntValue, iIntValue2, intOrNull3.intValue());
        }
        c99.s(kng0.l("Cannot parse build number from '", str4, Separators.QUOTE));
        return null;
    }

    public static cf60 E(q8b q8bVar, boolean z2) throws kq80 {
        int iG = q8bVar.g(5);
        if (iG == 31) {
            iG = q8bVar.g(6) + 32;
        }
        int iB = B(q8bVar);
        int iG2 = q8bVar.g(4);
        String strM = twn.m(iG, "mp4a.40.");
        if (iG == 5 || iG == 29) {
            iB = B(q8bVar);
            int iG3 = q8bVar.g(5);
            if (iG3 == 31) {
                iG3 = q8bVar.g(6) + 32;
            }
            iG = iG3;
            if (iG == 22) {
                iG2 = q8bVar.g(4);
            }
        }
        byte b2 = 1;
        if (z2) {
            if (iG != 1 && iG != 2 && iG != 3 && iG != 4 && iG != 6 && iG != 7 && iG != 17) {
                switch (iG) {
                    case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw kq80.e("Unsupported audio object type: " + iG);
                }
            }
            if (q8bVar.f()) {
                f1t0.g0("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (q8bVar.f()) {
                q8bVar.o(14);
            }
            boolean zF = q8bVar.f();
            if (iG2 == 0) {
                e9d0.b();
                return null;
            }
            if (iG == 6 || iG == 20) {
                q8bVar.o(3);
            }
            if (zF) {
                if (iG == 22) {
                    q8bVar.o(16);
                }
                if (iG == 17 || iG == 19 || iG == 20 || iG == 23) {
                    q8bVar.o(3);
                }
                q8bVar.o(1);
            }
            switch (iG) {
                case 17:
                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                case 20:
                case 21:
                case 22:
                case 23:
                    int iG4 = q8bVar.g(2);
                    if (iG4 == 2 || iG4 == 3) {
                        throw kq80.e("Unsupported epConfig: " + iG4);
                    }
                    break;
            }
        }
        int i2 = b[iG2];
        if (i2 != -1) {
            return new cf60(b2, iB, i2, strM);
        }
        throw kq80.a(null, null);
    }

    public static final void F(float[] fArr, float[] fArr2) {
        float fZ = z(0, 0, fArr2, fArr);
        float fZ2 = z(0, 1, fArr2, fArr);
        float fZ3 = z(0, 2, fArr2, fArr);
        float fZ4 = z(0, 3, fArr2, fArr);
        float fZ5 = z(1, 0, fArr2, fArr);
        float fZ6 = z(1, 1, fArr2, fArr);
        float fZ7 = z(1, 2, fArr2, fArr);
        float fZ8 = z(1, 3, fArr2, fArr);
        float fZ9 = z(2, 0, fArr2, fArr);
        float fZ10 = z(2, 1, fArr2, fArr);
        float fZ11 = z(2, 2, fArr2, fArr);
        float fZ12 = z(2, 3, fArr2, fArr);
        float fZ13 = z(3, 0, fArr2, fArr);
        float fZ14 = z(3, 1, fArr2, fArr);
        float fZ15 = z(3, 2, fArr2, fArr);
        float fZ16 = z(3, 3, fArr2, fArr);
        fArr[0] = fZ;
        fArr[1] = fZ2;
        fArr[2] = fZ3;
        fArr[3] = fZ4;
        fArr[4] = fZ5;
        fArr[5] = fZ6;
        fArr[6] = fZ7;
        fArr[7] = fZ8;
        fArr[8] = fZ9;
        fArr[9] = fZ10;
        fArr[10] = fZ11;
        fArr[11] = fZ12;
        fArr[12] = fZ13;
        fArr[13] = fZ14;
        fArr[14] = fZ15;
        fArr[15] = fZ16;
    }

    public static final void G(float[] fArr, float f2, float f3, float[] fArr2) {
        ui30.d(fArr2);
        ui30.g(fArr2, f2, f3);
        F(fArr, fArr2);
    }

    public static final int H(int i2) {
        return ((i2 & 255) << 24) | (((-16777216) & i2) >>> 24) | ((16711680 & i2) >>> 8) | ((65280 & i2) << 8);
    }

    public static final rh1 I(th1 th1Var) {
        int iOrdinal = th1Var.ordinal();
        if (iOrdinal == 0) {
            return rh1.b;
        }
        if (iOrdinal == 1) {
            return rh1.c;
        }
        if (iOrdinal == 2) {
            return rh1.d;
        }
        if (iOrdinal == 3) {
            return rh1.e;
        }
        t9f.b();
        return null;
    }

    public static final String J(byte b2) {
        char[] cArr = wb.f38851a;
        return new String(new char[]{cArr[(b2 >> 4) & 15], cArr[b2 & 15]});
    }

    public static final String K(int i2) {
        if (i2 == 0) {
            return "0";
        }
        char[] cArr = wb.f38851a;
        int i3 = 0;
        char[] cArr2 = {cArr[(i2 >> 28) & 15], cArr[(i2 >> 24) & 15], cArr[(i2 >> 20) & 15], cArr[(i2 >> 16) & 15], cArr[(i2 >> 12) & 15], cArr[(i2 >> 8) & 15], cArr[(i2 >> 4) & 15], cArr[i2 & 15]};
        while (i3 < 8 && cArr2[i3] == '0') {
            i3++;
        }
        b3.f1878a.getClass();
        x2.a(i3, 8, 8);
        return new String(cArr2, i3, 8 - i3);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:28:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:30:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:31:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:46:0x00fe  */
    public static final px4 L(gx4 gx4Var, ctf0 ctf0Var, mnb0 mnb0Var, String str, boolean z2) {
        boolean z3;
        String strA;
        String strA2;
        boolean z4;
        fx6 fx6Var;
        boolean z5;
        gx4Var.getClass();
        ctf0Var.getClass();
        str.getClass();
        xyc xycVar = gx4Var.b;
        a8q0 a8q0Var = gx4Var.f12059a;
        dx6 dx6Var = gx4Var.c;
        boolean z6 = dx6Var.b.n || z2;
        pn40 pn40Var = pn40.f27267a;
        BigDecimal bigDecimal = xycVar.d;
        boolean z7 = xycVar.f;
        BigDecimal bigDecimal2 = xycVar.f41701a;
        BigDecimal bigDecimal3 = xycVar.e;
        boolean z8 = z6;
        Object[] objArr = {pn40.c(bigDecimal.doubleValue(), p3u0.c)};
        lsm0 lsm0Var = ctf0Var.b;
        mx6 mx6Var = new mx6(a8q0Var, lsm0Var.a(org.xbet.client1.R.string.bet_enter_coefficient_v2, Arrays.copyOf(objArr, 1)), false, false, false);
        if (!xycVar.g) {
            if (z7) {
                strA2 = lsm0Var.a(org.xbet.client1.R.string.max_coef_v2, Arrays.copyOf(new Object[]{pn40.g(bigDecimal3)}, 1));
            } else {
                z3 = false;
                strA = lsm0Var.a(org.xbet.client1.R.string.coupon_makebet_coef, Arrays.copyOf(new Object[0], 0));
            }
            oln0 oln0Var = new oln0(strA, true, z3);
            xnb0 xnb0Var = new xnb0("", "", z3);
            if (!z8 || bigDecimal2.compareTo(bigDecimal) <= 0) {
                z4 = z3;
            } else {
                z4 = true;
            }
            if (!z8 && bigDecimal2.compareTo(bigDecimal3) < 0) {
                z3 = true;
            }
            jke jkeVar = new jke(true, true, z4, z3);
            if (z8) {
                fx6Var = fx6.c;
            } else if (z8) {
                fx6Var = fx6.b;
            } else {
                if (bigDecimal2.compareTo(bigDecimal) >= 0 || bigDecimal2.compareTo(bigDecimal3) > 0) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                boolean z9 = bigDecimal2.compareTo(new BigDecimal(String.valueOf(-1.0d))) == 0;
                if ((z5 && !z9) || z7) {
                    fx6Var = fx6.b;
                }
            }
            return new px4(new yv6(mx6Var, oln0Var, xnb0Var, jkeVar, fx6Var, "", true), jiq0.z0(dx6Var, ctf0Var, mnb0Var, str, z2), yum0.n(gx4Var.d, str, z2));
        }
        strA2 = lsm0Var.a(org.xbet.client1.R.string.min_coef_v2, Arrays.copyOf(new Object[]{bigDecimal}, 1));
        strA = strA2;
        z3 = false;
        oln0 oln0Var2 = new oln0(strA, true, z3);
        xnb0 xnb0Var2 = new xnb0("", "", z3);
        if (z8) {
            z4 = z3;
        } else {
            z4 = z3;
        }
        if (!z8) {
            z3 = true;
        }
        jke jkeVar2 = new jke(true, true, z4, z3);
        if (z8) {
            fx6Var = fx6.c;
        } else if (z8) {
            fx6Var = fx6.b;
        } else {
            if (bigDecimal2.compareTo(bigDecimal) >= 0) {
                z5 = false;
            } else {
                z5 = false;
            }
            if (bigDecimal2.compareTo(new BigDecimal(String.valueOf(-1.0d))) == 0) {
            }
            fx6Var = z5 ? fx6.f10293a : fx6.f10293a;
        }
        return new px4(new yv6(mx6Var, oln0Var2, xnb0Var2, jkeVar2, fx6Var, "", true), jiq0.z0(dx6Var, ctf0Var, mnb0Var, str, z2), yum0.n(gx4Var.d, str, z2));
    }

    public static final void a(mm40 mm40Var, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        function1.getClass();
        fetVar.g0(420841183);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= fetVar.i(function1) ? 32 : 16;
        }
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zfn zfnVar = zaq0.b;
            imm immVar = new imm(new ilm(((ThemeColors) fetVar.k(zfnVar)).getSecondary()), new plm(rsm0.w(org.xbet.client1.R.string.additional_info, 0, fetVar), ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), fa50.f9191a), fmm.f9790a, ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), true, null);
            boolean z2 = (i3 & 112) == 32;
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new dn(function1, (byte) 10);
                fetVar.o0(objP);
            }
            hlm.c(mm40VarD, immVar, null, (Function0) objP, null, null, null, null, null, null, null, null, fetVar, 0, 0, 4084);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new sx(mm40Var2, function1, i2, (byte) 0);
        }
    }

    public static final void b(mm40 mm40Var, mtl mtlVar, Function1 function1, fet fetVar, int i2) {
        mtl mtlVar2;
        mm40 mm40Var2;
        mtlVar.getClass();
        fetVar.g0(1858216641);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            mtlVar2 = mtlVar;
            i3 |= fetVar.g(mtlVar2) ? 32 : 16;
        } else {
            mtlVar2 = mtlVar;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        byte b2 = 0;
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            w6k w6kVar = (w6k) fetVar.k(bmd.h);
            WeakHashMap weakHashMap = djv0.w;
            int i4 = zcm0.i(fetVar).c.e().d - zcm0.i(fetVar).e.e().d;
            if (i4 < 0) {
                i4 = 0;
            }
            float fR0 = w6kVar.r0(i4);
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 56.0f, 7);
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
            boolean z2 = (i3 & 896) == 256;
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new wc2(function1, b2);
                fetVar.o0(objP);
            }
            int i5 = i3 & 112;
            mm40Var2 = jm40Var;
            bkb.f(null, mtlVar2, null, false, null, (Function1) objP, fetVar, i5, 29);
            zq8.a(0, fetVar, i120.Q(o7k0.d(o7k0.e(mm40Var2, l7x.O(12.0f, 0.0f, l1e0.c((fR0 - 100.0f) / 100.0f, 0.0f, 1.0f))), 1.0f), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), jd8.n));
            fetVar.r(true);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vb2(mm40Var2, mtlVar, function1, i2, (byte) 1);
        }
    }

    public static final void c(int i2, fet fetVar, a4x a4xVar, mm40 mm40Var) {
        yfe0 yfe0VarU;
        zw1 zw1Var;
        a4xVar.getClass();
        fetVar.g0(1352958570);
        byte b2 = 2;
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2 | (fetVar.g(a4xVar) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            if (a4xVar.isEmpty()) {
                yfe0VarU = fetVar.u();
                if (yfe0VarU == null) {
                    return;
                } else {
                    zw1Var = new zw1(mm40Var, a4xVar, i2, b2);
                }
            } else {
                zfn zfnVar = bmd.h;
                w6k w6kVar = (w6k) fetVar.k(zfnVar);
                zcl zclVar = qmk.f28987a;
                float fW0 = w6kVar.w0(8.0f);
                float fW1 = ((w6k) fetVar.k(zfnVar)).w0(8.0f);
                float fW2 = ((w6k) fetVar.k(zfnVar)).w0(8.0f);
                g9q0 g9q0VarN = pym0.n(fetVar);
                boolean zG = fetVar.g(g9q0VarN) | ((i3 & 112) == 32) | fetVar.d(fW1) | fetVar.d(fW2) | fetVar.d(fW0);
                Object objP = fetVar.P();
                if (zG || objP == ukd.f35823a) {
                    lt8 lt8Var = new lt8(a4xVar, g9q0VarN, fW1, fW2, fW0, (byte) 0);
                    fetVar.o0(lt8Var);
                    objP = lt8Var;
                }
                zq8.a(0, fetVar, rq8.L(mm40Var, (Function1) objP));
            }
            yfe0VarU.d = zw1Var;
        }
        fetVar.X();
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            zw1Var = new zw1(mm40Var, a4xVar, i2, (byte) 3);
            yfe0VarU.d = zw1Var;
        }
    }

    public static final void d(mm40 mm40Var, Function0 function0, xdr xdrVar, xdr xdrVar2, xdr xdrVar3, fet fetVar, int i2) {
        mm40 mm40Var2;
        function0.getClass();
        fetVar.g0(895299464);
        int i3 = i2 | (fetVar.i(function0) ? 32 : 16) | (fetVar.i(xdrVar) ? 256 : 128) | (fetVar.i(xdrVar2) ? 2048 : 1024) | (fetVar.i(xdrVar3) ? 16384 : 8192);
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            mm40Var2 = mm40Var;
            mm40 mm40VarQ = i120.Q(mm40Var2, y3d.b, jd8.n);
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
            if (xdrVar == null) {
                fetVar.e0(-1220390591);
            } else {
                fetVar.e0(-1701935424);
                xdrVar.F(o7k0.c, fetVar, Integer.valueOf(((i3 >> 3) & 112) | 6));
            }
            fetVar.r(false);
            n0q n0qVar = o7k0.c;
            zq8.a(0, fetVar, y860.W(n0qVar, null, null, false, null, function0, 28));
            if (xdrVar2 == null) {
                fetVar.e0(-1220079785);
                fetVar.r(false);
            } else {
                fetVar.e0(-1701925398);
                w6x.v((i3 >> 6) & 112, xdrVar2, jr8.f16991a.b(jm40.b, gqw0.e), fetVar, false);
            }
            if (xdrVar3 == null) {
                fetVar.e0(-1220017599);
            } else {
                fetVar.e0(-1701923392);
                xdrVar3.F(n0qVar, fetVar, Integer.valueOf(((i3 >> 9) & 112) | 6));
            }
            fetVar.r(false);
            fetVar.r(true);
        } else {
            mm40Var2 = mm40Var;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new s59(mm40Var2, function0, xdrVar, xdrVar2, xdrVar3, i2, (byte) 1);
        }
    }

    public static final void e(int i2, ugd ugdVar, ugd ugdVar2, fet fetVar, mm40 mm40Var, boolean z2) {
        ugd ugdVar3;
        ugd ugdVar4;
        mm40 mm40Var2;
        boolean z3;
        fetVar.g0(1219525670);
        byte b2 = 2;
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2 | 16;
        boolean z4 = false;
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            fetVar.Z();
            if ((i2 & 1) != 0 && !fetVar.B()) {
                fetVar.X();
                z4 = z2;
            } else if (fetVar.k(bmd.n) == k6z.b) {
                z4 = true;
            }
            fetVar.s();
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = new d69((byte) 19);
                fetVar.o0(objP);
            }
            mm40Var2 = mm40Var;
            mm40 mm40VarK = rq8.K(mm40Var2, (Function1) objP);
            boolean zH = fetVar.h(z4);
            Object objP2 = fetVar.P();
            if (zH || objP2 == cl5Var) {
                objP2 = new kp2(b2, z4);
                fetVar.o0(objP2);
            }
            tj30 tj30Var = (tj30) objP2;
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
            jpm0.o(fetVar, tj30Var, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            jm40 jm40Var = jm40.b;
            ugdVar4 = ugdVar2;
            ugdVar4.F(mrv.k0(jm40Var, "SCORE"), fetVar, 54);
            ugdVar3 = ugdVar;
            ugdVar3.F(mrv.k0(jm40Var, Request.INFO), fetVar, 54);
            fetVar.r(true);
            z3 = z4;
        } else {
            ugdVar3 = ugdVar;
            ugdVar4 = ugdVar2;
            mm40Var2 = mm40Var;
            fetVar.X();
            z3 = z2;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gka(mm40Var2, z3, ugdVar3, ugdVar4, i2, (byte) 0);
        }
    }

    public static final void f(l7m0 l7m0Var, l7m0 l7m0Var2, g2v g2vVar, xcz xczVar, qdz qdzVar, Function1 function1, Function0 function0, fet fetVar, int i2) {
        int i3;
        xcz xczVar2;
        qdz qdzVar2;
        Function1 function2;
        fetVar.g0(1123404791);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(l7m0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(l7m0Var2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= (i2 & 512) == 0 ? fetVar.g(g2vVar) : fetVar.i(g2vVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            xczVar2 = xczVar;
            i3 |= fetVar.g(xczVar2) ? 2048 : 1024;
        } else {
            xczVar2 = xczVar;
        }
        if ((i2 & 24576) == 0) {
            qdzVar2 = qdzVar;
            i3 |= fetVar.g(qdzVar2) ? 16384 : 8192;
        } else {
            qdzVar2 = qdzVar;
        }
        if ((196608 & i2) == 0) {
            function2 = function1;
            i3 |= fetVar.i(function2) ? 131072 : 65536;
        } else {
            function2 = function1;
        }
        if ((1572864 & i2) == 0) {
            i3 |= fetVar.i(function0) ? 1048576 : 524288;
        }
        if (fetVar.U(i3 & 1, (599187 & i3) != 599186)) {
            n0q n0qVar = o7k0.c;
            mm40 mm40VarR = knm0.r(n0qVar);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            jpm0.o(fetVar, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            int i4 = i3 >> 3;
            j120.H(i4 & 14, fetVar, null, l7m0Var2);
            mm40 mm40VarE = o050.W(jm40.b).e(n0qVar);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarE);
            fetVar.i0();
            int i5 = i3;
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            boolean z3 = (i5 & 3670016) == 1048576;
            Object objP = fetVar.P();
            if (z3 || objP == ukd.f35823a) {
                objP = new l3c0(function0, (byte) 7);
                fetVar.o0(objP);
            }
            n4c.b((Function0) objP, fetVar);
            k(l7m0Var, g2vVar, xczVar2, qdzVar2, function2, fetVar, (i5 & 14) | (i4 & 112) | (i4 & 896) | (i4 & 7168) | (57344 & i4));
            fetVar.r(true);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o210(l7m0Var, l7m0Var2, g2vVar, xczVar, qdzVar, function1, function0, i2, (byte) 1);
        }
    }

    public static final void g(jkm jkmVar, mm40 mm40Var, fet fetVar, int i2) {
        mm40 mm40Var2;
        jkmVar.getClass();
        fetVar.g0(18714164);
        byte b2 = 2;
        int i3 = (fetVar.g(jkmVar) ? 4 : 2) | i2 | 48;
        byte b3 = 1;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            n0q n0qVar = o7k0.c;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = z0o.f43578a;
                fetVar.o0(objP);
            }
            xdr xdrVar = (xdr) ((jhy) objP);
            boolean z2 = (i3 & 14) == 4;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new kxf(jkmVar, b2);
                fetVar.o0(objP2);
            }
            y860.f(xdrVar, n0qVar, (Function1) objP2, fetVar, 6, 0);
            mm40Var2 = jm40.b;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new lxf(jkmVar, mm40Var2, i2, b3);
        }
    }

    public static final void h(mm40 mm40Var, c0p0 c0p0Var, Function0 function0, fet fetVar, int i2) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-797744638);
        int i3 = i2 | (fetVar2.g(c0p0Var) ? 32 : 16) | (fetVar2.i(function0) ? 256 : 128);
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            zfn zfnVar = zaq0.b;
            long backgroundContent = ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent();
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = s5x0.J(i120.Q(mm40Var, backgroundContent, vgg0.a(12.0f)), 16.0f);
            x5d x5dVarA = w5d.a(new qw3(16.0f, true, new jf4((byte) 14)), gqw0.n, fetVar2, 48);
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
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            String str = c0p0Var.f3535a;
            long secondary = ((ThemeColors) fetVar2.k(zfnVar)).getSecondary();
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str, mm40VarD, secondary, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, g1t0.n(), fetVar, 48, 0, 130040);
            fetVar2 = fetVar;
            qzb.n(o7k0.d(jm40Var, 1.0f), c0p0Var.b, function0, fetVar2, (i3 & 896) | 6, 0);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cgm0(mm40Var, c0p0Var, function0, i2, (byte) 9);
        }
    }

    public static final void i(mm40 mm40Var, final fkw fkwVar, final boolean z2, final l7m0 l7m0Var, final float f2, final float f3, final float f4, Function1 function1, fet fetVar, final int i2) {
        float f5;
        float f6;
        float f7;
        Function1 function2;
        fet fetVar2;
        mm40 mm40Var2;
        Object dkwVar;
        boolean z3;
        l7m0 l7m0Var2;
        boolean z4;
        fkwVar.getClass();
        function1.getClass();
        fetVar.g0(-1778233737);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(fkwVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.h(z2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.g(l7m0Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            f5 = f2;
            i3 |= fetVar.d(f5) ? 16384 : 8192;
        } else {
            f5 = f2;
        }
        if ((196608 & i2) == 0) {
            f6 = f3;
            i3 |= fetVar.d(f6) ? 131072 : 65536;
        } else {
            f6 = f3;
        }
        if ((1572864 & i2) == 0) {
            f7 = f4;
            i3 |= fetVar.d(f7) ? 1048576 : 524288;
        } else {
            f7 = f4;
        }
        if ((12582912 & i2) == 0) {
            i3 |= fetVar.i(function1) ? 8388608 : 4194304;
        }
        int i4 = i3;
        if (fetVar.U(i4 & 1, (4793491 & i4) != 4793490)) {
            float fH0 = lgb.h0(fetVar);
            Object[] objArr = {Boolean.valueOf(z2)};
            int i5 = i4 & 896;
            int i6 = i4 & 7168;
            boolean z5 = (i5 == 256) | (i6 == 2048);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z5 || objP == cl5Var) {
                objP = new bkw((byte) 0, l7m0Var, z2);
                fetVar.o0(objP);
            }
            l7m0 l7m0VarY = v3c.Y(objArr, (Function0) objP, fetVar);
            Object[] objArr2 = {Boolean.valueOf(z2)};
            boolean z6 = (i6 == 2048) | (i5 == 256);
            Object objP2 = fetVar.P();
            if (z6 || objP2 == cl5Var) {
                objP2 = new bkw((byte) 1, l7m0Var, z2);
                fetVar.o0(objP2);
            }
            l7m0 l7m0VarY2 = v3c.Y(objArr2, (Function0) objP2, fetVar);
            mm40Var2 = jm40.b;
            mm40 mm40VarK = lgb.K(o7k0.d(mm40Var2, 1.0f));
            boolean z7 = (i5 == 256) | (i6 == 2048) | ((i4 & 57344) == 16384) | ((458752 & i4) == 131072) | ((3670016 & i4) == 1048576);
            Object objP3 = fetVar.P();
            if (z7 || objP3 == cl5Var) {
                z3 = z2;
                l7m0Var2 = l7m0Var;
                dkwVar = new dkw(z3, l7m0Var2, f5, f6, f7);
                fetVar.o0(dkwVar);
            } else {
                dkwVar = objP3;
                z3 = z2;
                l7m0Var2 = l7m0Var;
            }
            tj30 tj30Var = (tj30) dkwVar;
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
            jpm0.o(fetVar, tj30Var, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            mm40 mm40VarE = mrv.k0(mm40Var2, jwq0.f17266a).e(o7k0.c);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE2 = o7k0.e(mm40VarE, 56.0f + fH0);
            boolean z8 = (i6 == 2048) | (i5 == 256);
            Object objP4 = fetVar.P();
            if (z8 || objP4 == cl5Var) {
                objP4 = new fg4((byte) 1, l7m0Var2, z3);
                fetVar.o0(objP4);
            }
            mm40 mm40VarT = i4w0.T(mm40VarE2, (Function1) objP4);
            ((ijg) fetVar.k(jjg.f16616a)).getClass();
            zq8.a(0, fetVar, i120.Q(mm40VarT, ijg.i, jd8.n));
            fetVar2 = fetVar;
            l7m0 l7m0Var3 = l7m0Var2;
            l(mrv.k0(mm40Var2, jwq0.b), fkwVar.f9713a, l7m0VarY, function1, fetVar2, ((i4 >> 12) & 7168) | 6);
            function2 = function1;
            if (((Boolean) l7m0VarY2.getValue()).booleanValue()) {
                fetVar2.e0(295430860);
                uiw uiwVar = fkwVar.b;
                grh grhVar = uiwVar != null ? uiwVar.f35753a : null;
                if (grhVar == null) {
                    fetVar2.e0(568422069);
                    z4 = false;
                    fetVar2.r(false);
                } else {
                    fetVar2.e0(568422070);
                    mm40 mm40VarH = o7k0.h(s5x0.L(mrv.k0(mm40Var2, jwq0.c), xfn.a(fetVar2).c, 0.0f, 2), 240.0f);
                    boolean z9 = i6 == 2048;
                    Object objP5 = fetVar2.P();
                    if (z9 || objP5 == cl5Var) {
                        objP5 = new ufp(l7m0Var3, (byte) 7);
                        fetVar2.o0(objP5);
                    }
                    mm40 mm40VarT2 = i4w0.T(mm40VarH, (Function1) objP5);
                    boolean z10 = fkwVar.c;
                    boolean z11 = (29360128 & i4) == 8388608;
                    Object objP6 = fetVar2.P();
                    if (z11 || objP6 == cl5Var) {
                        objP6 = new dht(function2, (byte) 22);
                        fetVar2.o0(objP6);
                    }
                    feb.h(mm40VarT2, grhVar, z10, (Function1) objP6, fetVar2, 0);
                    z4 = false;
                    fetVar2.r(false);
                }
                fetVar2.r(z4);
            } else {
                fetVar2.e0(569202836);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            function2 = function1;
            fetVar2 = fetVar;
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            final mm40 mm40Var3 = mm40Var2;
            final Function1 function3 = function2;
            yfe0VarU.d = new Function2() { // from class: a.ckw
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    cy2.i(mm40Var3, fkwVar, z2, l7m0Var, f2, f3, f4, function3, (fet) obj, x8x.L(i2 | 1));
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void j(mm40 mm40Var, bdz bdzVar, e2d e2dVar, a4x a4xVar, boolean z2, boolean z3, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        xcz xczVarB;
        fetVar.g0(-938900172);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(bdzVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(e2dVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.g(a4xVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.h(z2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar.h(z3) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= fetVar.i(function1) ? 1048576 : 524288;
        }
        byte b2 = 0;
        if (fetVar.U(i3 & 1, (599187 & i3) != 599186)) {
            if (z2) {
                fetVar.e0(-1947680793);
                xczVarB = ddz.a(0, 0, fetVar, 0, 3);
                fetVar.r(false);
            } else {
                fetVar.e0(-1947634789);
                xczVarB = bdzVar.b("KEY_LAZY_LIST_TEAM_BET_EVENTS", fetVar);
                fetVar.r(false);
            }
            Object[] objArr = new Object[0];
            boolean zG = fetVar.g(xczVarB) | ((i3 & 896) == 256);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (zG || objP == obj) {
                objP = new qzo0(xczVarB, e2dVar, b2);
                fetVar.o0(objP);
            }
            l7m0 l7m0VarY = v3c.Y(objArr, (Function0) objP, fetVar);
            boolean zG2 = ((57344 & i3) == 16384) | fetVar.g(l7m0VarY);
            Object objP2 = fetVar.P();
            if (zG2 || objP2 == obj) {
                objP2 = new bkw((byte) 2, l7m0VarY, z2);
                fetVar.o0(objP2);
            }
            azl azlVarB = e2d.b(e2dVar, (Function0) objP2);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarV = cjx.V(jm40Var, azlVarB, null);
            wom womVarF = mom.f(fetVar);
            n0q n0qVar = o7k0.c;
            boolean z4 = (3670016 & i3) == 1048576;
            Object objP3 = fetVar.P();
            if (z4 || objP3 == obj) {
                objP3 = new gno0(function1, (byte) 23);
                fetVar.o0(objP3);
            }
            int i4 = ((i3 >> 12) & 112) | 100663296;
            mm40Var2 = jm40Var;
            mom.c(n0qVar, z3, womVarF, null, false, null, (Function0) objP3, null, u1c.M(132056137, new rzo0(mm40VarV, z2, xczVarB, a4xVar, function1, (byte) 0), fetVar), fetVar, i4, 184);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ozo0(mm40Var2, bdzVar, e2dVar, a4xVar, z2, z3, function1, i2, (byte) 0);
        }
    }

    public static final void k(l7m0 l7m0Var, g2v g2vVar, xcz xczVar, qdz qdzVar, Function1 function1, fet fetVar, int i2) {
        int i3;
        boolean z2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-73745471);
        if ((i2 & 6) == 0) {
            i3 = (fetVar2.g(l7m0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? fetVar2.g(g2vVar) : fetVar2.i(g2vVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar2.g(xczVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar2.g(qdzVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar2.i(function1) ? 16384 : 8192;
        }
        if (fetVar2.U(i3 & 1, (i3 & 9363) != 9362)) {
            cxd0 cxd0Var = (cxd0) l7m0Var.getValue();
            if (cxd0Var == null) {
                z2 = false;
            } else if (cxd0Var instanceof axd0) {
                fetVar2.e0(2072269218);
                mdm mdmVar = ((axd0) cxd0Var).f1620a;
                boolean z3 = (i3 & 57344) == 16384;
                Object objP = fetVar2.P();
                if (z3 || objP == ukd.f35823a) {
                    objP = new evd0(function1, (byte) 6);
                    fetVar2.o0(objP);
                }
                jcb.l(null, mdmVar, false, (Function0) objP, fetVar2, 0, 5);
                fetVar2.r(false);
            } else if (cxd0Var instanceof bxd0) {
                fetVar2.e0(2072506151);
                jcb.l(null, g2v.b(g2vVar, pb10.y, null, ldm.b, 0, 0, 0, 0, 0, 0L, 0L, 1018), false, null, fetVar, 0, 13);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                fetVar2 = fetVar2;
                z2 = false;
                if (cxd0Var instanceof zwd0) {
                    fetVar2.e0(2072801643);
                    zwd0 zwd0Var = (zwd0) cxd0Var;
                    oja0.M(zwd0Var.f45101a, zwd0Var.b, xczVar, qdzVar, function1, fetVar2, i3 & 65408);
                    fetVar2.r(false);
                }
            }
            throw b1j.f(2145055492, fetVar2, z2);
        }
        fetVar2.X();
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p210(l7m0Var, g2vVar, xczVar, qdzVar, function1, i2, (byte) 1);
        }
    }

    public static final void l(mm40 mm40Var, n0x n0xVar, l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        int i3;
        l7m0 l7m0Var2;
        fetVar.g0(1536222846);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(n0xVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            l7m0Var2 = l7m0Var;
            i3 |= fetVar.g(l7m0Var2) ? 256 : 128;
        } else {
            l7m0Var2 = l7m0Var;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            zfn zfnVar = m8m0.f21378a;
            long jM123getWhite0d7_KjU = ((StaticColors) fetVar.k(zfnVar)).m123getWhite0d7_KjU();
            long jM121getTransparent0d7_KjU = ((StaticColors) fetVar.k(zfnVar)).m121getTransparent0d7_KjU();
            long jM128getWhite40d7_KjU = ((StaticColors) fetVar.k(zfnVar)).m128getWhite40d7_KjU();
            mm40 mm40VarX = yyw.X(o7k0.d(mm40Var, 1.0f), null, fetVar, 1);
            boolean zH = fetVar.h(((Boolean) l7m0Var2.getValue()).booleanValue());
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zH || objP == cl5Var) {
                imm immVar = new imm(new ilm(jM123getWhite0d7_KjU), mlm.f21997a, fmm.f9790a, jM121getTransparent0d7_KjU, ((Boolean) l7m0Var2.getValue()).booleanValue(), new y3d(jM128getWhite40d7_KjU));
                fetVar.o0(immVar);
                objP = immVar;
            }
            imm immVar2 = (imm) objP;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new vkm(1);
                fetVar.o0(objP2);
            }
            vkm vkmVar = (vkm) objP2;
            boolean z2 = (i3 & 7168) == 2048;
            Object objP3 = fetVar.P();
            if (z2 || objP3 == cl5Var) {
                objP3 = new i8v(function1, (byte) 21);
                fetVar.o0(objP3);
            }
            hlm.c(mm40VarX, immVar2, vkmVar, (Function0) objP3, null, null, null, null, null, null, u1c.M(899074028, new g0g(n0xVar), fetVar), null, fetVar, 384, 6, 3056);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vho((byte) 9, i2, (Object) mm40Var, (Object) n0xVar, (Object) l7m0Var2, (Object) function1);
        }
    }

    public static final void m(Map map, v9c v9cVar, l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        fetVar.g0(-1877443106);
        int i3 = i2 | (fetVar.g(map) ? 4 : 2) | (fetVar.g(v9cVar) ? 32 : 16) | (fetVar.g(l7m0Var) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        byte b2 = 0;
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            zcl zclVar = qmk.f28987a;
            m8x.y(null, u1c.M(173188514, new zs70(l7m0Var, function1, (byte) 3), fetVar), null, null, null, 0, 0L, 0L, i120.N(0.0f, 0.0f, 0.0f, 0.0f, 14), u1c.M(-701739859, new in80(map, v9cVar, b2), fetVar), fetVar, 805306416, 253);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new pd50((byte) 15, i2, (Object) map, (Object) v9cVar, (Object) l7m0Var, (Object) function1);
        }
    }

    public static final void n(Map map, List list, int i2, v9c v9cVar, fet fetVar, int i3) {
        int i4;
        fet fetVar2 = fetVar;
        fetVar2.g0(-637198509);
        if ((i3 & 6) == 0) {
            i4 = ((i3 & 8) == 0 ? fetVar2.g(map) : fetVar2.i(map) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= (i3 & 64) == 0 ? fetVar2.g(list) : fetVar2.i(list) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= fetVar2.e(i2) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= fetVar2.g(v9cVar) ? 2048 : 1024;
        }
        if (fetVar2.U(i4 & 1, (i4 & 1171) != 1170)) {
            List list2 = (List) map.get(CollectionsKt.W(i2, list));
            zcl zclVar = qmk.f28987a;
            float fT = ((w6k) fetVar2.k(bmd.h)).T(32.0f);
            long jY = ibc.Y(v9cVar.f37028a, fetVar2);
            long jY2 = ibc.Y(v9cVar.b, fetVar2);
            n0q n0qVar = o7k0.c;
            n0qVar.getClass();
            mm40 mm40VarK = rq8.K(n0qVar, new u9c(fT, jY, jY2));
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarK);
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
            if (list2 == null || list2.isEmpty()) {
                fetVar2.e0(-748726580);
                v8q0.a(xsm0.s(org.xbet.client1.R.string.test_palette_missing, fetVar2), jr8.f16991a.b(jm40.b, gqw0.e), 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, y9q0.a(new y9q0(0L, qmk.y, null, j1t0.f15753a, 0L, null, 0, 0, qmk.K, 16646109), ibc.Y(v9cVar.d, fetVar2), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214), fetVar, 0, 0, 131068);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                fetVar2.e0(-748447239);
                lh80 lh80VarU = s5x0.u(0.0f, 64.0f, 0.0f, 16.0f, 5);
                qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
                boolean zI = ((i4 & 7168) == 2048) | fetVar2.i(list2);
                Object objP = fetVar2.P();
                if (zI || objP == ukd.f35823a) {
                    objP = new ka70(list2, v9cVar, (byte) 6);
                    fetVar2.o0(objP);
                }
                b8k0.e(n0qVar, null, lh80VarU, qw3Var, null, null, false, null, (Function1) objP, fetVar2, 6, 490);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vo6((Object) map, (Object) list, i2, (Object) v9cVar, i3, (byte) 6);
        }
    }

    public static final void o(tn80 tn80Var, ln80 ln80Var, fet fetVar, int i2) {
        int i3;
        boolean z2;
        jo20 jo20Var;
        Iterator it;
        jo20 jo20Var2;
        Iterator it2;
        Object obj;
        i5d i5dVar;
        Object obj2;
        tn80 tn80Var2 = tn80Var;
        tn80Var2.getClass();
        ln80Var.getClass();
        fetVar.g0(1010084869);
        int i4 = (fetVar.i(tn80Var2) ? 4 : 2) | i2 | (fetVar.g(ln80Var) ? 32 : 16);
        if (fetVar.U(i4 & 1, (i4 & 19) != 18)) {
            pz40 pz40VarO = gkb.O(new m430(tn80Var2.i, tn80Var2, (byte) 20), new tc50(30, "", "", null), null, fetVar, 0, 14);
            Context context = (Context) fetVar.k(dy2.b);
            uaq0 uaq0Var = ln80Var.f20333a;
            int iO = fem0.o(uaq0Var);
            pz40 pz40VarQ = gkb.Q(tn80Var2.h, null, fetVar, 0, 7);
            boolean zE = fetVar.e(uaq0Var.ordinal());
            Object objP = fetVar.P();
            int i5 = 10;
            Object obj3 = ukd.f35823a;
            if (zE || objP == obj3) {
                Map map = (Map) pz40VarQ.getValue();
                LinkedHashMap linkedHashMap = new LinkedHashMap(wp20.a(map.size()));
                Iterator it3 = map.entrySet().iterator();
                while (it3.hasNext()) {
                    Map.Entry entry = (Map.Entry) it3.next();
                    Object key = entry.getKey();
                    List list = (List) entry.getValue();
                    int i6 = i4;
                    ArrayList arrayList = new ArrayList(r3d.q(list, i5));
                    Iterator it4 = list.iterator();
                    while (it4.hasNext()) {
                        p14 p14Var = (p14) it4.next();
                        p14Var.getClass();
                        context.getClass();
                        if (!(p14Var instanceof p14)) {
                            t9f.b();
                            return;
                        }
                        int i7 = p14Var.f26181a;
                        Iterator it5 = it4;
                        Iterator it6 = it3;
                        long jD = fbc.d(m5d.f(context, i7, false, m5d.e(iO, context)));
                        String resourceEntryName = context.getResources().getResourceEntryName(i7);
                        resourceEntryName.getClass();
                        arrayList.add(new i5d(jD, StringsKt.d0("uikit", resourceEntryName)));
                        key = key;
                        it4 = it5;
                        it3 = it6;
                    }
                    linkedHashMap.put(key, arrayList);
                    i4 = i6;
                    i5 = 10;
                }
                i3 = i4;
                fetVar.o0(linkedHashMap);
                objP = linkedHashMap;
            } else {
                i3 = i4;
            }
            Map map2 = (Map) objP;
            ThemeColors themeColors = (ThemeColors) fetVar.k(zaq0.b);
            IndividualColors individualColors = (IndividualColors) fetVar.k(j7x.f16059a);
            CustomColors customColors = (CustomColors) fetVar.k(gxf.f12075a);
            StaticColors staticColors = (StaticColors) fetVar.k(m8m0.f21378a);
            idv0 idv0Var = (idv0) fetVar.k(jdv0.f16348a);
            hi0 hi0Var = (hi0) fetVar.k(ii0.f14805a);
            boolean zE2 = fetVar.e(uaq0Var.ordinal());
            Object objP2 = fetVar.P();
            if (zE2 || objP2 == obj3) {
                themeColors.getClass();
                individualColors.getClass();
                customColors.getClass();
                staticColors.getClass();
                idv0Var.getClass();
                hi0Var.getClass();
                jo20 jo20Var3 = new jo20();
                jo20Var3.put(jn80.f16802a, d5c.M(themeColors));
                jo20Var3.put(jn80.b, d5c.M(individualColors));
                jo20Var3.put(jn80.c, d5c.M(customColors));
                jo20Var3.put(jn80.d, d5c.M(staticColors));
                jo20Var3.put(jn80.e, d5c.M(idv0Var));
                jo20Var3.put(jn80.f, d5c.M(hi0Var));
                jo20 jo20VarB = jo20Var3.b();
                map2.getClass();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                Iterator it7 = map2.entrySet().iterator();
                while (it7.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) it7.next();
                    jn80 jn80Var = (jn80) entry2.getKey();
                    List list2 = (List) entry2.getValue();
                    List list3 = (List) jo20VarB.get(jn80Var);
                    if (list3 != null) {
                        int iA = wp20.a(r3d.q(list3, 10));
                        if (iA < 16) {
                            iA = 16;
                        }
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap(iA);
                        for (Object obj4 : list3) {
                            linkedHashMap3.put(((i5d) obj4).b, obj4);
                        }
                        LinkedHashMap linkedHashMap4 = new LinkedHashMap(linkedHashMap3);
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it8 = list2.iterator();
                        while (it8.hasNext()) {
                            String str = ((i5d) it8.next()).b;
                            i5d i5dVar2 = (i5d) linkedHashMap4.get(str);
                            if (i5dVar2 != null) {
                                linkedHashMap4.remove(str);
                                jo20Var2 = jo20VarB;
                                it2 = it7;
                                i5dVar = i5dVar2;
                            } else {
                                Iterator it9 = linkedHashMap4.entrySet().iterator();
                                while (true) {
                                    if (!it9.hasNext()) {
                                        jo20Var2 = jo20VarB;
                                        it2 = it7;
                                        obj = null;
                                        break;
                                    }
                                    Object next = it9.next();
                                    jo20Var2 = jo20VarB;
                                    it2 = it7;
                                    if (StringsKt.O(str, ((i5d) ((Map.Entry) next).getValue()).b, true)) {
                                        obj = next;
                                        break;
                                    } else {
                                        it7 = it2;
                                        jo20VarB = jo20Var2;
                                    }
                                }
                                Map.Entry entry3 = (Map.Entry) obj;
                                if (entry3 != null) {
                                    linkedHashMap4.remove((String) entry3.getKey());
                                    i5dVar = (i5d) entry3.getValue();
                                } else {
                                    i5dVar = null;
                                }
                            }
                            if (i5dVar != null) {
                                arrayList2.add(i5dVar);
                            }
                            it7 = it2;
                            jo20VarB = jo20Var2;
                        }
                        jo20Var = jo20VarB;
                        it = it7;
                        linkedHashMap2.put(jn80Var, CollectionsKt.q0(arrayList2, linkedHashMap4.values()));
                    } else {
                        jo20Var = jo20VarB;
                        it = it7;
                    }
                    it7 = it;
                    jo20VarB = jo20Var;
                }
                z2 = true;
                fetVar.o0(linkedHashMap2);
                obj2 = linkedHashMap2;
            } else {
                z2 = true;
                obj2 = objP2;
            }
            Map map3 = (Map) obj2;
            if (!ln80Var.d) {
                map3 = map2;
            }
            v9c v9cVar = ln80Var.c;
            boolean z3 = ((i3 & 14) == 4 || fetVar.i(tn80Var2)) ? z2 : false;
            Object objP3 = fetVar.P();
            if (z3 || objP3 == obj3) {
                objP3 = new xj80(1, tn80Var2, tn80.class, "onUserAction", "onUserAction(Lorg/xplatform/feature/office/test_section/impl/presentation/palette/model/PaletteUserAction;)V", 0, (byte) 3);
                fetVar.o0(objP3);
            }
            m(map3, v9cVar, pz40VarO, (Function1) ((jhy) objP3), fetVar, 0);
        } else {
            tn80Var2 = tn80Var2;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xd80(tn80Var2, ln80Var, i2, (byte) 3);
        }
    }

    public static final void p(mm40 mm40Var, androidx.compose.runtime.d dVar, ugd ugdVar, fet fetVar, int i2) {
        int i3;
        ugd ugdVar2 = epv0.b;
        fetVar.g0(-714464401);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(dVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(ugdVar2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.i(ugdVar) ? 2048 : 1024;
        }
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = androidx.compose.runtime.e.d(null, m2a.v);
                fetVar.o0(objP);
            }
            v96 v96VarV = v(ugdVar2, fetVar, (i3 >> 6) & 14);
            obc.d(dVar.a(v96VarV), u1c.M(274270255, new iop(mm40Var, (pz40) objP, ugdVar, v96VarV, (byte) 25), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new sa5((Object) mm40Var, (Object) dVar, (Object) ugdVar, i2, (byte) 2);
        }
    }

    public static final void q(g2v g2vVar, qdz qdzVar, hxd0 hxd0Var, Function0 function0, fet fetVar, int i2) {
        g2vVar.getClass();
        qdzVar.getClass();
        hxd0Var.getClass();
        function0.getClass();
        fetVar.g0(-9240788);
        int i3 = i2 | (fetVar.g(g2vVar) ? 4 : 2) | (fetVar.g(qdzVar) ? 32 : 16) | (fetVar.g(hxd0Var) ? 256 : 128) | (fetVar.i(function0) ? 2048 : 1024);
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            pz40 pz40VarQ = gkb.Q(hxd0Var.D, null, fetVar, 0, 7);
            pz40 pz40VarQ2 = gkb.Q((n7m0) hxd0Var.N.getValue(), null, fetVar, 0, 7);
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            boolean z2 = (i3 & 896) == 256;
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new prc0(1, hxd0Var, hxd0.class, "onScreenEvent", "onScreenEvent(Lorg/xplatform/cyber/game/rainbow/impl/presentation/screen/post_game/model/RainbowPostGameAction;)V", 0, (byte) 19);
                fetVar.o0(objP);
            }
            int i4 = i3 << 9;
            f(pz40VarQ, pz40VarQ2, g2vVar, xczVarA, qdzVar, (Function1) ((jhy) objP), function0, fetVar, ((i3 << 6) & 896) | (57344 & i4) | (i4 & 3670016));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dfc0((byte) 9, i2, (Object) g2vVar, (Object) qdzVar, (Object) hxd0Var, (Object) function0);
        }
    }

    public static final void r(int i2, fet fetVar) {
        fetVar.g0(2087118244);
        if (fetVar.U(i2 & 1, i2 != 0)) {
            n0q n0qVar = o7k0.c;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(n0qVar, 0.0f, 8.0f, 0.0f, 0.0f, 13);
            byte b2 = 14;
            x5d x5dVarA = w5d.a(new qw3(8.0f, true, new jf4(b2)), gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarN);
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
            jm40 jm40Var = jm40.b;
            mm40 mm40VarL = s5x0.L(o7k0.d(jm40Var, 1.0f), qmk.a(fetVar).e, 0.0f, 2);
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4(b2)), gqw0.j, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarL);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            fetVar.e0(498938371);
            int iB = 0;
            while (iB < 3) {
                zcl zclVar2 = qmk.f28987a;
                iB = h97.b(lgb.J(o7k0.e(o7k0.s(jm40Var, 64.0f), 32.0f), vgg0.a(14.0f)), vbc.d0(null, fetVar, 0, 1), fetVar, 0, iB, 1);
            }
            fetVar.r(false);
            fetVar.r(true);
            fetVar.e0(-110027826);
            for (int i3 = 0; i3 < 3; i3++) {
                zcl zclVar3 = qmk.f28987a;
                mm40 mm40VarL2 = s5x0.L(jm40Var, qmk.a(fetVar).c, 0.0f, 2);
                float f2 = m0l0.f20961a;
                vfc.o(48, fetVar, mm40VarL2);
            }
            fetVar.r(false);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ogj0(i2, (byte) 13);
        }
    }

    public static final void s(mm40 mm40Var, bdz bdzVar, e2d e2dVar, l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        int i3;
        bdz bdzVar2;
        fet fetVar2;
        boolean z2;
        bdzVar.getClass();
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(-1946403468);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            bdzVar2 = bdzVar;
            i3 |= fetVar.g(bdzVar2) ? 32 : 16;
        } else {
            bdzVar2 = bdzVar;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(e2dVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.g(l7m0Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.i(function1) ? 16384 : 8192;
        }
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            int i4 = 57344 & i3;
            boolean z3 = i4 == 16384;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z3 || objP == cl5Var) {
                objP = new gno0(function1, (byte) 20);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z4 = i4 == 16384;
            Object objP2 = fetVar.P();
            if (z4 || objP2 == cl5Var) {
                objP2 = new gno0(function1, (byte) 21);
                fetVar.o0(objP2);
            }
            v3c.A(function0, (Function0) objP2, null, fetVar, 0, 4);
            fetVar2 = fetVar;
            Object[] objArr = new Object[0];
            int i5 = i3 & 7168;
            boolean z5 = i5 == 2048;
            Object objP3 = fetVar2.P();
            if (z5 || objP3 == cl5Var) {
                objP3 = new g7o0(l7m0Var, (byte) 5);
                fetVar2.o0(objP3);
            }
            l7m0 l7m0VarY = v3c.Y(objArr, (Function0) objP3, fetVar2);
            Object[] objArr2 = new Object[0];
            boolean z6 = i5 == 2048;
            Object objP4 = fetVar2.P();
            byte b2 = 6;
            if (z6 || objP4 == cl5Var) {
                objP4 = new g7o0(l7m0Var, b2);
                fetVar2.o0(objP4);
            }
            l7m0 l7m0VarY2 = v3c.Y(objArr2, (Function0) objP4, fetVar2);
            n0q n0qVar = o7k0.c;
            mm40 mm40VarE = mm40Var.e(n0qVar);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z7 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z7) {
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
            hzo0 hzo0Var = (hzo0) l7m0VarY.getValue();
            if (hzo0Var != null) {
                if (hzo0Var instanceof gzo0) {
                    fetVar2.e0(276798702);
                    j(null, bdzVar2, e2dVar, ((gzo0) hzo0Var).f12189a, true, ((Boolean) l7m0VarY2.getValue()).booleanValue(), function1, fetVar, (i3 & 112) | 24576 | (i3 & 896) | ((i3 << 6) & 3670016));
                    fetVar2 = fetVar;
                    fetVar2.r(false);
                    z2 = true;
                } else if (hzo0Var instanceof fzo0) {
                    fetVar2.e0(276809683);
                    mm40 mm40VarR = knm0.r(n0qVar);
                    tj30 tj30VarC2 = zq8.c(gqw0.e, false);
                    int iHashCode2 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM2 = fetVar2.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarR);
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
                    mdm mdmVar = ((fzo0) hzo0Var).f10417a;
                    boolean z8 = i4 == 16384;
                    Object objP5 = fetVar2.P();
                    if (z8 || objP5 == cl5Var) {
                        objP5 = new gno0(function1, (byte) 22);
                        fetVar2.o0(objP5);
                    }
                    jcb.l(null, mdmVar, false, (Function0) objP5, fetVar2, 0, 5);
                    z2 = true;
                    fetVar2.r(true);
                    fetVar2.r(false);
                } else {
                    z2 = true;
                    if (hzo0Var instanceof ezo0) {
                        fetVar2.e0(276822799);
                        j(null, bdzVar, e2dVar, ((ezo0) hzo0Var).f8681a, false, ((Boolean) l7m0VarY2.getValue()).booleanValue(), function1, fetVar, ((i3 << 6) & 3670016) | (i3 & 112) | 24576 | (i3 & 896));
                        fetVar2 = fetVar;
                        fetVar2.r(false);
                    }
                }
                fetVar2.r(z2);
            }
            throw b1j.f(276796521, fetVar2, false);
        }
        fetVar2 = fetVar;
        fetVar2.X();
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new pzo0(mm40Var, bdzVar, e2dVar, l7m0Var, function1, i2, (byte) 0);
        }
    }

    public static final void t(mm40 mm40Var, l7m0 l7m0Var, l7m0 l7m0Var2, xcz xczVar, qdz qdzVar, Function1 function1, Function1 function2, fet fetVar, int i2) {
        mm40 mm40Var2;
        l7m0Var.getClass();
        l7m0Var2.getClass();
        xczVar.getClass();
        qdzVar.getClass();
        function1.getClass();
        function2.getClass();
        fetVar.g0(1190496080);
        int i3 = i2 | 6 | (fetVar.g(xczVar) ? 2048 : 1024) | (fetVar.g(qdzVar) ? 16384 : 8192) | (fetVar.i(function1) ? 131072 : 65536) | (fetVar.i(function2) ? 1048576 : 524288);
        if (fetVar.U(i3 & 1, (599187 & i3) != 599186)) {
            mm40 mm40VarU = vtb.U(o7k0.c, ((Boolean) l7m0Var2.getValue()).booleanValue());
            zcl zclVar = qmk.f28987a;
            b8k0.d(mm40VarU, xczVar, l7m0Var, null, knm0.g(s5x0.u(0.0f, 0.0f, 0.0f, 20.0f, 7), fetVar), false, null, u1c.M(-962643886, new u8o(function1, qdzVar, function2, (byte) 2), fetVar), fetVar, ((i3 >> 6) & 112) | 113246592, 88);
            mm40Var2 = jm40.b;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cbp0(mm40Var2, l7m0Var, l7m0Var2, xczVar, qdzVar, function1, function2, i2, (byte) 1);
        }
    }

    public static final boolean u(byte[] bArr, int i2, byte[] bArr2, int i3, int i4) {
        bArr.getClass();
        bArr2.getClass();
        for (int i5 = 0; i5 < i4; i5++) {
            if (bArr[i5 + i2] != bArr2[i5 + i3]) {
                return false;
            }
        }
        return true;
    }

    public static final v96 v(ugd ugdVar, fet fetVar, int i2) {
        boolean z2 = (((i2 & 14) ^ 6) > 4 && fetVar.g(ugdVar)) || (i2 & 6) == 4;
        Object objP = fetVar.P();
        Object obj = ukd.f35823a;
        if (z2 || objP == obj) {
            objP = new v96(ugdVar);
            fetVar.o0(objP);
        }
        v96 v96Var = (v96) objP;
        boolean zG = fetVar.g(v96Var);
        Object objP2 = fetVar.P();
        if (zG || objP2 == obj) {
            objP2 = new os5(v96Var, (byte) 3);
            fetVar.o0(objP2);
        }
        m0x0.o(v96Var, (Function1) objP2, fetVar);
        return v96Var;
    }

    public static amk w(kpb kpbVar, boolean z2) {
        int[] iArr;
        int[] iArr2;
        int i2;
        dmk dmkVar;
        cmk cmkVar;
        zlk zlkVar;
        int i3;
        dmk dmkVar2;
        dmk dmkVar3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int iJ = kpbVar.J();
        int I2 = kpbVar.I();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        cmk cmkVar2 = new cmk();
        int i11 = 0;
        cmkVar2.f4608a = 0;
        cmkVar2.b = iJ;
        cmkVar2.c = 0;
        cmkVar2.d = I2;
        arrayList2.add(cmkVar2);
        int i12 = iJ + I2;
        int i13 = 1;
        int i14 = (((i12 + 1) / 2) * 2) + 1;
        int[] iArr3 = new int[i14];
        int i15 = i14 / 2;
        int[] iArr4 = new int[i14];
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            cmk cmkVar3 = (cmk) hne.k(i13, arrayList2);
            if (cmkVar3.b() >= i13 && cmkVar3.a() >= i13) {
                int iA = ((cmkVar3.a() + cmkVar3.b()) + i13) / 2;
                int i16 = i13 + i15;
                iArr3[i16] = cmkVar3.f4608a;
                iArr4[i16] = cmkVar3.b;
                int i17 = i11;
                while (true) {
                    if (i17 >= iA) {
                        iArr = iArr4;
                        iArr2 = iArr3;
                        i2 = i15;
                        dmkVar = null;
                        break;
                    }
                    int i18 = Math.abs(cmkVar3.b() - cmkVar3.a()) % 2 == i13 ? i13 : i11;
                    int iB = cmkVar3.b() - cmkVar3.a();
                    int i19 = -i17;
                    int i20 = i19;
                    while (true) {
                        if (i20 > i17) {
                            iArr = iArr4;
                            iArr2 = iArr3;
                            i3 = i11;
                            i2 = i15;
                            dmkVar2 = null;
                            break;
                        }
                        if (i20 == i19 || (i20 != i17 && iArr3[i20 + 1 + i15] > iArr3[(i20 - 1) + i15])) {
                            i8 = iArr3[i20 + 1 + i15];
                            i9 = i8;
                        } else {
                            i8 = iArr3[(i20 - 1) + i15];
                            i9 = i8 + 1;
                        }
                        iArr = iArr4;
                        int i21 = ((i9 - cmkVar3.f4608a) + cmkVar3.c) - i20;
                        if (i17 != 0 && i9 == i8) {
                            i21--;
                        }
                        iArr2 = iArr3;
                        int i22 = i9;
                        int i23 = i21;
                        i2 = i15;
                        while (i22 < cmkVar3.b && i23 < cmkVar3.d && kpbVar.t(i22, i23)) {
                            i22++;
                            i23++;
                        }
                        iArr2[i20 + i2] = i22;
                        if (i18 != 0) {
                            int i24 = iB - i20;
                            i10 = i20;
                            if (i24 >= i19 + 1 && i24 <= i17 - 1 && iArr[i24 + i2] <= i22) {
                                dmkVar2 = new dmk();
                                dmkVar2.f6324a = i8;
                                dmkVar2.b = i21;
                                dmkVar2.c = i22;
                                dmkVar2.d = i23;
                                i3 = 0;
                                dmkVar2.e = false;
                                break;
                            }
                        } else {
                            i10 = i20;
                        }
                        i20 = i10 + 2;
                        i11 = 0;
                        iArr4 = iArr;
                        iArr3 = iArr2;
                        i15 = i2;
                    }
                    if (dmkVar2 != null) {
                        dmkVar = dmkVar2;
                        break;
                    }
                    int i25 = (cmkVar3.b() - cmkVar3.a()) % 2 == 0 ? 1 : i3;
                    int iB2 = cmkVar3.b() - cmkVar3.a();
                    int i26 = i19;
                    while (true) {
                        if (i26 > i17) {
                            dmkVar3 = null;
                            break;
                        }
                        if (i26 == i19 || (i26 != i17 && iArr[i26 + 1 + i2] < iArr[(i26 - 1) + i2])) {
                            i4 = iArr[i26 + 1 + i2];
                            i5 = i4;
                        } else {
                            i4 = iArr[(i26 - 1) + i2];
                            i5 = i4 - 1;
                        }
                        int i27 = cmkVar3.d - ((cmkVar3.b - i5) - i26);
                        int i28 = (i17 == 0 || i5 != i4) ? i27 : i27 + 1;
                        while (true) {
                            if (i5 > cmkVar3.f4608a && i27 > cmkVar3.c) {
                                i6 = i25;
                                if (!kpbVar.t(i5 - 1, i27 - 1)) {
                                    break;
                                }
                                i5--;
                                i27--;
                                i25 = i6;
                            } else {
                                i6 = i25;
                                break;
                            }
                        }
                        iArr[i26 + i2] = i5;
                        if (i6 != 0 && (i7 = iB2 - i26) >= i19 && i7 <= i17 && iArr2[i7 + i2] >= i5) {
                            dmkVar3 = new dmk();
                            dmkVar3.f6324a = i5;
                            dmkVar3.b = i27;
                            dmkVar3.c = i4;
                            dmkVar3.d = i28;
                            dmkVar3.e = true;
                            break;
                        }
                        i26 += 2;
                        i25 = i6;
                    }
                    if (dmkVar3 != null) {
                        dmkVar = dmkVar3;
                        break;
                    }
                    i17++;
                    iArr4 = iArr;
                    iArr3 = iArr2;
                    i15 = i2;
                    i13 = 1;
                    i11 = 0;
                }
            } else {
                iArr = iArr4;
                iArr2 = iArr3;
                i2 = i15;
                dmkVar = null;
                break;
            }
            if (dmkVar != null) {
                if (dmkVar.a() > 0) {
                    int i29 = dmkVar.d;
                    int i30 = dmkVar.b;
                    int i31 = i29 - i30;
                    int i32 = dmkVar.c;
                    int i33 = dmkVar.f6324a;
                    int i34 = i32 - i33;
                    if (i31 == i34) {
                        zlkVar = new zlk(i33, i30, i34);
                    } else if (dmkVar.e) {
                        zlkVar = new zlk(i33, i30, dmkVar.a());
                    } else {
                        zlkVar = i31 > i34 ? new zlk(i33, i30 + 1, dmkVar.a()) : new zlk(i33 + 1, i30, dmkVar.a());
                    }
                    arrayList.add(zlkVar);
                }
                if (arrayList3.isEmpty()) {
                    cmkVar = new cmk();
                    i13 = 1;
                } else {
                    i13 = 1;
                    cmkVar = (cmk) hne.k(1, arrayList3);
                }
                cmkVar.f4608a = cmkVar3.f4608a;
                cmkVar.c = cmkVar3.c;
                cmkVar.b = dmkVar.f6324a;
                cmkVar.d = dmkVar.b;
                arrayList2.add(cmkVar);
                cmkVar3.b = cmkVar3.b;
                cmkVar3.d = cmkVar3.d;
                cmkVar3.f4608a = dmkVar.c;
                cmkVar3.c = dmkVar.d;
                arrayList2.add(cmkVar3);
            } else {
                i13 = 1;
                arrayList3.add(cmkVar3);
            }
            iArr4 = iArr;
            iArr3 = iArr2;
            i15 = i2;
            i11 = 0;
        }
        int[] iArr5 = iArr4;
        Collections.sort(arrayList, w);
        return new amk(kpbVar, arrayList, iArr3, iArr5, z2);
    }

    public static final void x(long j2, long j3, long j4) {
        if ((j3 | j4) < 0 || j3 > j2 || j2 - j3 < j4) {
            StringBuilder sbQ = kng0.q(j2, "size=", " offset=");
            sbQ.append(j3);
            sbQ.append(" byteCount=");
            sbQ.append(j4);
            throw new ArrayIndexOutOfBoundsException(sbQ.toString());
        }
    }

    public static final boolean y(View view, View view2) {
        if (view2.equals(view)) {
            return false;
        }
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view) {
                return true;
            }
        }
        return false;
    }

    public static final float z(int i2, int i3, float[] fArr, float[] fArr2) {
        int i4 = i2 * 4;
        return (fArr[i4 + 3] * fArr2[12 + i3]) + (fArr[i4 + 2] * fArr2[8 + i3]) + (fArr[i4 + 1] * fArr2[4 + i3]) + (fArr[i4] * fArr2[i3]);
    }
}
