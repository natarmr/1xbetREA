package a;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.gov.nist.core.Separators;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import android.util.Log;
import android.view.View;
import android.view.Window;
import com.huawei.hms.framework.common.BundleUtil;
import java.math.BigDecimal;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.xbet.client1.R;
import org.xplatform.bet_history.core.presentation.BetHistoryScreenModel;
import org.xplatform.bet_history.history.domain.model.HistoryMenuItem;
import org.xplatform.bet_history.history.domain.model.HistoryTypeModel;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class bcm0 {
    public static final String A(qbs0 qbs0Var) {
        qbs0Var.getClass();
        Long lValueOf = Long.valueOf(qbs0Var.f28453a.f2368a);
        mbs0 mbs0Var = qbs0Var.b;
        return CollectionsKt.b0(q3d.j(lValueOf, Long.valueOf(mbs0Var.i), Long.valueOf(mbs0Var.h), Long.valueOf(mbs0Var.f), mbs0Var.j, Double.valueOf(mbs0Var.k)), BundleUtil.UNDERLINE_TAG, null, null, null, 62);
    }

    public static boolean B(Context context, int i, String str) {
        try {
            AppOpsManager appOpsManager = (AppOpsManager) grv0.a(context).f24675a.getSystemService("appops");
            if (appOpsManager == null) {
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            }
            appOpsManager.checkPackage(i, str);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }

    public static int C(hbb hbbVar) throws GeneralSecurityException {
        if (hbbVar == hbb.i) {
            return 1;
        }
        if (hbbVar == hbb.j) {
            return 2;
        }
        if (hbbVar == hbb.k) {
            return 3;
        }
        if (hbbVar == hbb.l) {
            return 4;
        }
        if (hbbVar == hbb.m) {
            return 5;
        }
        throw new GeneralSecurityException("Unknown KeyMaterialType: ".concat(String.valueOf(hbbVar)));
    }

    public static int D(lpw0 lpw0Var) throws GeneralSecurityException {
        if (lpw0Var.equals(lpw0.b)) {
            return 1;
        }
        if (lpw0Var == lpw0.c) {
            return 2;
        }
        if (lpw0Var == lpw0.d) {
            return 3;
        }
        if (lpw0Var == lpw0.e) {
            return 4;
        }
        if (lpw0Var == lpw0.f) {
            return 5;
        }
        if (lpw0Var == lpw0.g) {
            return 6;
        }
        throw new GeneralSecurityException("Unknown OutputPrefixType: ".concat(String.valueOf(lpw0Var)));
    }

    public static hbb E(int i) throws GeneralSecurityException {
        switch (p7x0.f26528a[hne.E(i)]) {
            case 1:
                return hbb.i;
            case 2:
                return hbb.j;
            case 3:
                return hbb.k;
            case 4:
                return hbb.l;
            case 5:
                return hbb.m;
            case 6:
                throw new GeneralSecurityException("Unknown KeyMaterialType: ".concat(esw0.n(i)));
            default:
                throw new GeneralSecurityException("Unknown KeyMaterialType: ".concat(esw0.n(i)));
        }
    }

    public static icw0 F(lpw0 lpw0Var, Integer num) throws GeneralSecurityException {
        if (lpw0Var == lpw0.e) {
            if (num == null) {
                return q6x0.f28222a;
            }
            hny.o("RAW output prefix type cannot have an id requirement");
            return null;
        }
        if (num == null) {
            throw new GeneralSecurityException(kng0.l("idRequirement must be non-null for ", String.valueOf(lpw0Var), " type"));
        }
        if (lpw0Var == lpw0.c) {
            return q6x0.b(num.intValue());
        }
        if (lpw0Var == lpw0.d || lpw0Var == lpw0.f) {
            return q6x0.a(num.intValue());
        }
        throw new GeneralSecurityException("Unknown OutputPrefixType: ".concat(String.valueOf(lpw0Var)));
    }

    public static lpw0 G(int i) throws GeneralSecurityException {
        switch (p7x0.b[hne.E(i)]) {
            case 1:
                return lpw0.b;
            case 2:
                return lpw0.c;
            case 3:
                return lpw0.d;
            case 4:
                return lpw0.e;
            case 5:
                return lpw0.f;
            case 6:
                return lpw0.g;
            case 7:
                throw new GeneralSecurityException("Unknown OutputPrefixType: ".concat(esw0.o(i)));
            default:
                throw new GeneralSecurityException("Unknown OutputPrefixType: ".concat(esw0.o(i)));
        }
    }

    public static final void a(ArrayList arrayList, Function1 function1, fet fetVar, int i) {
        fetVar.g0(407728926);
        int i2 = (fetVar.g(arrayList) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            lh80 lh80VarU = s5x0.u(0.0f, 12.0f, 0.0f, 0.0f, 13);
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new td8(arrayList, function1, (byte) 5);
                fetVar.o0(objP);
            }
            b8k0.e(null, null, lh80VarU, null, null, null, false, null, (Function1) objP, fetVar, 0, 507);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new qpc0(arrayList, function1, i, b);
        }
    }

    public static final void b(int i, fet fetVar, mm40 mm40Var, l7m0 l7m0Var, Function1 function1) {
        mm40 mm40Var2;
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(-90283267);
        int i2 = i | 6 | (fetVar.g(l7m0Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            f9m0 f9m0Var = new f9m0(R.string.statistic_info_champ_stat, fmm.f9790a, 0L, false, false, null, null, false, 252);
            zdm0 zdm0VarC = ((jcm0) l7m0Var.getValue()).c();
            j9m0 j9m0VarD = ((jcm0) l7m0Var.getValue()).d();
            boolean zA = ((jcm0) l7m0Var.getValue()).a();
            boolean z = (i2 & 896) == 256;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new yhl0(function1, (byte) 26);
                fetVar.o0(objP);
            }
            ffb0.D(null, f9m0Var, zdm0VarC, j9m0VarD, zA, (Function0) objP, null, null, u1c.M(-1679982581, new dqz(l7m0Var, function1), fetVar), fetVar, 100663296, 193);
            mm40Var2 = jm40.b;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mpb0(mm40Var2, l7m0Var, function1, i, (byte) 8);
        }
    }

    public static final void c(String str, String str2, mm40 mm40Var, xdr xdrVar, fet fetVar, int i) {
        fet fetVar2;
        mm40 mm40Var2;
        str.getClass();
        fetVar.g0(-358231403);
        int i2 = i | (fetVar.g(str) ? 4 : 2) | (fetVar.g(str2) ? 32 : 16) | 384;
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarA = o7k0.A(o7k0.e(jm40Var, 44.0f), null, 3);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarA);
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
            rsm0.g((i2 >> 3) & 14, fetVar, o7k0.n(jm40Var, 24.0f), str2);
            if (xdrVar == null) {
                fetVar.e0(-1729250660);
            } else {
                fetVar.e0(359859717);
                xdrVar.F(zhg0.f44392a, fetVar, 54);
            }
            fetVar.r(false);
            v8q0.a(str, s5x0.L(o7k0.y(jm40Var, null, 3), 6.0f, 0.0f, 2), 0L, new n05(qmk.q, g1t0.m().f42262a.b, qmk.n), 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 2, 0, null, ibm0.t(g1t0.m(), fetVar), fetVar, i2 & 14, 24960, 109556);
            fetVar2 = fetVar;
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new stl0((byte) 13, i, str, str2, mm40Var2, xdrVar);
        }
    }

    public static final void d(mm40 mm40Var, d280 d280Var, String str, j83 j83Var, fet fetVar, int i, int i2) {
        mm40 mm40Var2;
        int i3;
        mm40 mm40Var3;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1220055036);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            mm40Var2 = mm40Var;
        } else {
            mm40Var2 = mm40Var;
            i3 = i | (fetVar2.g(mm40Var2) ? 4 : 2);
        }
        int i5 = i3 | (fetVar2.g(d280Var) ? 32 : 16) | (fetVar2.g(str) ? 256 : 128) | (fetVar2.g(j83Var) ? 2048 : 1024);
        if (fetVar2.U(i5 & 1, (i5 & 1171) != 1170)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40Var4 = i4 != 0 ? jm40Var : mm40Var2;
            yx7 yx7Var = gqw0.k;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40Var4, 16.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, yx7Var, fetVar2, 48);
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
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            boolean z = (i5 & 112) == 32;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new u6n(d4d.SECONDARY60, w6n.l, d280Var);
                fetVar2.o0(objP);
            }
            u6n u6nVar = (u6n) objP;
            boolean zG = fetVar2.g(u6nVar);
            Object objP2 = fetVar2.P();
            if (zG || objP2 == cl5Var) {
                objP2 = new d1n(u6nVar, (byte) 1);
                fetVar2.o0(objP2);
            }
            kkb.p(1, fetVar2, null, (Function0) objP2);
            y9q0 y9q0VarD = g1t0.d();
            zfn zfnVar = zaq0.b;
            v8q0.a(str, dw9.h(1.0f, s5x0.N(jm40Var, 6.0f, 0.0f, 0.0f, 0.0f, 14), true), ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0VarD, fetVar2, (i5 >> 6) & 14, 24960, 110584);
            v8q0.b(j83Var, s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary(), null, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, null, g1t0.a(), fetVar2, (i5 >> 9) & 14, 24960, 241656);
            fetVar2 = fetVar2;
            fetVar2.r(true);
            mm40Var3 = mm40Var4;
        } else {
            fetVar2.X();
            mm40Var3 = mm40Var2;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new brc0(mm40Var3, d280Var, str, j83Var, i, i2, (byte) 5);
        }
    }

    public static final void e(String str, fet fetVar, int i) {
        str.getClass();
        fetVar.g0(-735021175);
        int i2 = i | (fetVar.g(str) ? 4 : 2);
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            v8q0.a(str, o7k0.y(jm40.b, null, 3), 0L, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, ibm0.t(new y9q0(0L, qmk.o, null, j1t0.f15753a, 0L, null, 0, 0, qmk.B, 16646109), fetVar), fetVar, (i2 & 14) | 48, 24960, 109564);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new f5n0((byte) 6, i, str);
        }
    }

    public static final void f(mm40 mm40Var, nws0 nws0Var, fet fetVar, int i) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1870906898);
        int i2 = i | 6 | (fetVar2.g(nws0Var) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = s5x0.J(mm40VarD, 8.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
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
            d(null, nws0Var.d, nws0Var.f24251a, nws0Var.b, fetVar2, 0, 1);
            d(s5x0.N(jm40Var, 0.0f, 4.0f, 0.0f, 0.0f, 13), nws0Var.e, nws0Var.f, nws0Var.c, fetVar, 0, 0);
            v8q0.a(nws0Var.g, s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, ibm0.n(new y9q0(0L, qmk.p, null, j1t0.c, 0L, null, 0, 0, qmk.C, 16646109), fetVar), fetVar, 0, 24960, 110588);
            fetVar2 = fetVar;
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new htr0(mm40Var2, nws0Var, i, (byte) 15);
        }
    }

    public static final ArrayList g(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            k6w0 k6w0Var = (k6w0) it.next();
            Bundle bundle = new Bundle();
            bundle.putInt("event_type", k6w0Var.f17791a);
            bundle.putLong("event_timestamp", k6w0Var.b);
            arrayList2.add(bundle);
        }
        return arrayList2;
    }

    public static final void h(lc00 lc00Var, ljg ljgVar, int i, ctf0 ctf0Var, boolean z, boolean z2) {
        ljgVar.getClass();
        ctf0Var.getClass();
        List list = ljgVar.e;
        f2h f2hVar = ljgVar.c;
        f2h f2hVar2 = ljgVar.b;
        le90 le90Var = (le90) CollectionsKt.W(i, list);
        if (le90Var == null || !idm0.u(le90Var) || f2hVar2.c.length() == 0 || f2hVar.c.length() == 0) {
            return;
        }
        String strT = vsm0.t(f2hVar2.d);
        String str = f2hVar2.c;
        String str2 = le90Var.f19891a;
        zf90 zf90Var = le90Var.h;
        fp20 fp20Var = new fp20(zf90Var == zf90.f44292a ? ijg.U : StaticColors.INSTANCE.m123getWhite0d7_KjU(), strT, str, str2);
        fp20 fp20Var2 = new fp20(zf90Var == zf90.b ? ijg.U : StaticColors.INSTANCE.m123getWhite0d7_KjU(), vsm0.t(f2hVar.d), f2hVar.c, le90Var.b);
        String str3 = le90Var.g;
        String str4 = z ? "tablet" : "mob";
        StringBuilder sb = new StringBuilder(ujn.h);
        String strK = b1j.k("/static/img/ImgDefault/Esports/Valorant/Last/", str4, Separators.SLASH, str3, ".png");
        if (strK.length() == 0) {
            sb.setLength(0);
        } else if (StringsKt.O(strK, ujn.h, false) || kotlin.text.c.x(strK, "https://", false)) {
            sb.setLength(0);
            sb.append(strK);
        } else {
            if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                sb.append('/');
            }
            sb.append(StringsKt.y0(strK, '/'));
        }
        wls wlsVar = new wls(fp20Var, fp20Var2, str3, sb.toString(), ctf0Var.b.a(R.string.cs2_statistic_map_finish, Arrays.copyOf(new Object[0], 0)), false, Integer.valueOf(z ? R.drawable.valorant_winrate_tablet_placeholder : R.drawable.valorant_winrate_placeholder), z2);
        lc00Var.add(new psv("ABOUT_MAP", R.string.cyber_about_map));
        lc00Var.add(new tnb0(dyb.g0(wlsVar)));
    }

    public static String i(boolean z) {
        bzu bzuVar = new bzu((byte) 23);
        bzuVar.g("static");
        bzuVar.g("img");
        bzuVar.g("android");
        bzuVar.g("BottomBet");
        bzuVar.g("backgrounds");
        bzuVar.g("toto");
        bzuVar.g("en");
        bzuVar.g("01-" + (z ? "l" : "d") + ".png");
        return ((StringBuilder) bzuVar.b).toString();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006c  */
    public static final ylp0 j(v310 v310Var, List list, ctf0 ctf0Var, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        list.getClass();
        ctf0Var.getClass();
        n410 n410Var = z ? v310Var.b : v310Var.f36713a;
        List list2 = v310Var.h;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            w310 w310Var = (w310) obj;
            if (w310Var.f38477a == n410Var.f22877a && w310Var.b == a410.b) {
                arrayList.add(obj);
            }
        }
        String strConcat = "TEAM_STAT".concat(n410Var.f);
        String strD = tfx.D(n410Var, list);
        String str = "";
        if (!kotlin.text.c.x(strD, ujn.h, false)) {
            if (strD.length() == 0) {
                strD = "";
            } else {
                List list3 = u0d.f34849a;
                if (u0d.c(strD)) {
                    strD = "";
                } else {
                    strD = String.format(Locale.ENGLISH, StringsKt.O(strD, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, strD}, 2));
                }
            }
        }
        rep0 rep0Var = new rep0(strD, n410Var.c, ctf0Var.b.a(z ? R.string.lol_title_red_side : R.string.lol_title_blue_side, Arrays.copyOf(new Object[0], 0)), z ? R.drawable.ic_cyber_lol_red_side : R.drawable.ic_cyber_lol_blue_side);
        List list4 = n410Var.r;
        list4.getClass();
        lc00 lc00VarB = kotlin.collections.a.b();
        Iterator it = new IntRange(0, 4, 1).iterator();
        while (((kkx) it).c) {
            s410 s410Var = (s410) CollectionsKt.W(((bkx) it).nextInt(), list4);
            String str2 = null;
            String str3 = s410Var != null ? s410Var.e : null;
            if (str3 == null) {
                str3 = str;
            }
            if (s410Var != null) {
                str2 = s410Var.f;
            }
            lc00VarB.add(new uvv(str3, 0L, fbc.c0(str2)));
            str = str;
        }
        i4 i4VarR0 = dyb.r0(kotlin.collections.a.a(lc00VarB));
        int i = n410Var.p;
        boolean z5 = i >= 0 || z2;
        boolean z6 = i < 0 && z2;
        dep0 dep0Var = new dep0(z5, msm0.l(i / 1000.0f, ctf0Var), z6 ? 0.6f : 1.0f, z6 ? kkg.g : kkg.f, z ? kkg.f18437a : kkg.b);
        lc00 lc00VarB2 = kotlin.collections.a.b();
        Iterator it2 = new IntRange(0, 3, 1).iterator();
        while (true) {
            boolean z7 = ((kkx) it2).c;
            int i2 = R.drawable.ic_cyber_lol_dragon_placeholder;
            if (!z7) {
                break;
            }
            w310 w310Var2 = (w310) CollectionsKt.W(((bkx) it2).nextInt(), arrayList);
            if (w310Var2 != null) {
                int iOrdinal = w310Var2.c.ordinal();
                if (iOrdinal == 0) {
                    i2 = R.drawable.ic_lol_dragon_chemtech;
                } else if (iOrdinal == 1) {
                    i2 = R.drawable.ic_lol_dragon_infernal;
                } else if (iOrdinal == 2) {
                    i2 = R.drawable.ic_lol_dragon_mountain;
                } else if (iOrdinal == 3) {
                    i2 = R.drawable.ic_lol_dragon_ocean;
                } else if (iOrdinal == 4) {
                    i2 = R.drawable.ic_lol_dragon_cloud;
                } else if (iOrdinal == 5) {
                    i2 = R.drawable.ic_lol_dragon_hextech;
                }
            }
            lc00VarB2.add(Integer.valueOf(i2));
        }
        i4 i4VarR1 = dyb.r0(CollectionsKt.A0(kotlin.collections.a.a(lc00VarB2), new tgo0((byte) 14)));
        if (i4VarR1 == null || !i4VarR1.isEmpty()) {
            z3 = false;
            ListIterator listIterator = i4VarR1.listIterator(0);
            while (true) {
                if (!listIterator.hasNext()) {
                    z4 = true;
                    break;
                }
                if (((Number) listIterator.next()).intValue() != R.drawable.ic_cyber_lol_dragon_placeholder) {
                    z4 = false;
                    break;
                }
            }
        } else {
            z4 = true;
            z3 = false;
        }
        if (!z4 || z2) {
            z3 = true;
        }
        if (z2 && z4) {
            i4VarR1 = lak0.c;
        }
        ybp0 ybp0Var = new ybp0(i4VarR1, z3);
        lc00 lc00VarB3 = kotlin.collections.a.b();
        ibm0.f(lc00VarB3, R.drawable.ic_cyber_lol_tower, n410Var.k, z2);
        ibm0.f(lc00VarB3, R.drawable.ic_cyber_lol_voidgrub, -1, z2);
        ibm0.f(lc00VarB3, R.drawable.ic_cyber_lol_baron, n410Var.n, z2);
        ibm0.f(lc00VarB3, R.drawable.ic_cyber_lol_gerald, -1, z2);
        ibm0.f(lc00VarB3, R.drawable.ic_cyber_lol_inhibitor, n410Var.l, z2);
        ibm0.f(lc00VarB3, R.drawable.ic_cyber_lol_dragon, n410Var.j, z2);
        i4 i4VarR2 = dyb.r0(kotlin.collections.a.a(lc00VarB3));
        return new ylp0(strConcat, rep0Var, i4VarR0, dep0Var, ybp0Var, new llp0(i4VarR2, !i4VarR2.isEmpty()));
    }

    /* JADX WARN: Failed to calculate best type for var: r0v11 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v11 ??, new type: java.lang.String
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
    /* JADX WARN: Failed to calculate best type for var: r0v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v12 ??, new type: java.lang.String
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
    /* JADX WARN: Failed to calculate best type for var: r0v15 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v15 ??, new type: java.lang.String
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
    /* JADX WARN: Failed to calculate best type for var: r19v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r19v2 ??, new type: java.lang.Object
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r19v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r19v2 ??, new type: java.lang.Object
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
    /* JADX WARN: Failed to calculate best type for var: r19v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r19v4 ??, new type: java.lang.Object
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
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r19v3 ??, new type: java.lang.Object
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    public static final a.ylp0 k(a.o310 r25, a.y3h r26, a.m9s r27, a.ctf0 r28, boolean r29, boolean r30) {
        /*
            Method dump skipped, instruction units count: 676
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.bcm0.k(a.o310, a.y3h, a.m9s, a.ctf0, boolean, boolean):a.ylp0");
    }

    public static final String l(ctf0 ctf0Var, bcs0 bcs0Var) {
        rdj rdjVar = rdj.f30294a;
        boolean zH = ctf0Var.h();
        long j = bcs0Var.i;
        return rdj.g(new znq0(j), efj.UNIVERSAL, Boolean.valueOf(zH), false, 56);
    }

    public static final String m(ctf0 ctf0Var, bcs0 bcs0Var) {
        String str = bcs0Var.h;
        String str2 = bcs0Var.u;
        if (str.length() != 0 || str2.length() <= 0) {
            return str.length() > 0 ? str : ctf0Var.b.a(R.string.main_game, Arrays.copyOf(new Object[0], 0));
        }
        return str2;
    }

    public static final n0x n(qbs0 qbs0Var, wcb wcbVar) {
        bcs0 bcs0Var = qbs0Var.f28453a;
        return new n0x(wcbVar.a(bcs0Var.b, bcs0Var.c));
    }

    public static final chl0 o(qbs0 qbs0Var) {
        k0d k0dVar;
        mbs0 mbs0Var = qbs0Var.b;
        String str = mbs0Var.p;
        String strQ = mbs0Var.o;
        if (str.length() != 0) {
            strQ = w6x.q(str, ": ", strQ);
        }
        mbs0 mbs0Var2 = qbs0Var.b;
        String str2 = strQ;
        String str3 = mbs0Var2.n;
        if (mbs0Var2.d) {
            k0dVar = k0d.b;
        } else {
            izc izcVar = mbs0Var2.c;
            if (izcVar == izc.d) {
                k0dVar = k0d.f17460a;
            } else if (izcVar == izc.b) {
                k0dVar = k0d.c;
            } else {
                k0dVar = izcVar == izc.c ? k0d.d : k0d.f17460a;
            }
        }
        return new chl0(str2, str3, k0dVar, a65.f301a, false, mbs0Var2.r, false, false, new xgl0(-1L, 0.0d, 0.0d, "", 1, mbs0Var2.i, mbs0Var2.b.f36034a, qbs0Var.f28453a.f2368a, false));
    }

    public static final zia p(fho fhoVar, ctf0 ctf0Var) {
        int iOrdinal = fhoVar.ordinal();
        if (iOrdinal == 0) {
            return wia.f39205a;
        }
        if (iOrdinal == 1) {
            return new via(ctf0Var.b.a(R.string.auto_sub_label, Arrays.copyOf(new Object[0], 0)));
        }
        if (iOrdinal == 2) {
            return new xia(ctf0Var.b.a(R.string.option_bet, Arrays.copyOf(new Object[0], 0)));
        }
        if (iOrdinal == 3) {
            return new yia(ctf0Var.b.a(R.string.each_way, Arrays.copyOf(new Object[0], 0)));
        }
        t9f.b();
        return null;
    }

    public static boolean q(int i, Context context) {
        if (B(context, i, "com.google.android.gms")) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                fbv fbvVarB = fbv.b(context);
                if (packageInfo != null) {
                    if (!fbv.f(packageInfo, false)) {
                        if (fbv.f(packageInfo, true)) {
                            if (!bbv.a((Context) fbvVarB.f9280a)) {
                                Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                                return false;
                            }
                        }
                    }
                    return true;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                if (Log.isLoggable("UidVerifier", 3)) {
                    Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
                }
            }
        }
        return false;
    }

    public static final boolean r(f0r0 f0r0Var) {
        return ((f0r0Var.a() instanceof i1r0) || (f0r0Var.a() instanceof d1r0) || (f0r0Var.a() instanceof e1r0) || (f0r0Var.a() instanceof c1r0)) ? false : true;
    }

    public static final void s(View view, int i, int i2) {
        view.getClass();
        view.layout(i, i2, view.getMeasuredWidth() + i, view.getMeasuredHeight() + i2);
    }

    public static final void t(View view, int i, int i2) {
        view.getClass();
        view.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(i2, 1073741824));
    }

    public static final void u(View view) {
        view.getClass();
        view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    public static void v(btf btfVar) {
        btfVar.k = -3.4028235E38f;
        btfVar.j = Integer.MIN_VALUE;
        CharSequence charSequenceValueOf = btfVar.f3180a;
        if (charSequenceValueOf instanceof Spanned) {
            if (!(charSequenceValueOf instanceof Spannable)) {
                charSequenceValueOf = SpannableString.valueOf(charSequenceValueOf);
                btfVar.f3180a = charSequenceValueOf;
                btfVar.b = null;
            }
            charSequenceValueOf.getClass();
            Spannable spannable = (Spannable) charSequenceValueOf;
            for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                if ((obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan)) {
                    spannable.removeSpan(obj);
                }
            }
        }
    }

    public static float w(float f, int i, int i2, int i3) {
        float f2;
        if (f == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i == 0) {
            f2 = i3;
        } else {
            if (i != 1) {
                if (i != 2) {
                    return -3.4028235E38f;
                }
                return f;
            }
            f2 = i2;
        }
        return f * f2;
    }

    public static void x(Window window, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            e7.l(window, z);
        } else {
            if (i >= 30) {
                e7.k(window, z);
                return;
            }
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0370  */
    /* JADX WARN: Code duplicated, block: B:102:0x0374  */
    /* JADX WARN: Code duplicated, block: B:103:0x037d  */
    /* JADX WARN: Code duplicated, block: B:107:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:108:0x03df  */
    /* JADX WARN: Code duplicated, block: B:118:0x0409  */
    /* JADX WARN: Code duplicated, block: B:121:0x0418  */
    /* JADX WARN: Code duplicated, block: B:128:0x042d  */
    /* JADX WARN: Code duplicated, block: B:131:0x0432  */
    /* JADX WARN: Code duplicated, block: B:501:0x0189 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:503:0x0178 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x017e  */
    /* JADX WARN: Code duplicated, block: B:65:0x020a  */
    /* JADX WARN: Code duplicated, block: B:67:0x0217  */
    /* JADX WARN: Code duplicated, block: B:69:0x021c  */
    /* JADX WARN: Code duplicated, block: B:73:0x0240  */
    /* JADX WARN: Code duplicated, block: B:74:0x0242  */
    /* JADX WARN: Code duplicated, block: B:77:0x0247  */
    /* JADX WARN: Code duplicated, block: B:78:0x0258  */
    /* JADX WARN: Code duplicated, block: B:80:0x026a  */
    /* JADX WARN: Code duplicated, block: B:82:0x0270  */
    /* JADX WARN: Code duplicated, block: B:83:0x0273  */
    /* JADX WARN: Code duplicated, block: B:85:0x0277  */
    /* JADX WARN: Code duplicated, block: B:86:0x027a  */
    /* JADX WARN: Code duplicated, block: B:88:0x027e  */
    /* JADX WARN: Code duplicated, block: B:89:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:92:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:93:0x0326  */
    /* JADX WARN: Code duplicated, block: B:96:0x032d  */
    /* JADX WARN: Code duplicated, block: B:97:0x0330  */
    /* JADX WARN: Code duplicated, block: B:99:0x0367  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final qp30 y(a5w a5wVar, ctf0 ctf0Var, HistoryTypeModel historyTypeModel, String str, List list, List list2, List list3, List list4, List list5, BetHistoryScreenModel betHistoryScreenModel, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, int i) {
        hom0 hom0Var;
        x680 x680Var;
        buy wtyVar;
        lc00 lc00VarA;
        Object next;
        kzv kzvVar;
        Object obj;
        kzv kzvVar2;
        String str2;
        String strA;
        hxu hxuVar;
        double d;
        x680 x680Var2;
        x680 x680Var3;
        lc00 lc00VarA2;
        long jM98getGreen0d7_KjU;
        x680 x680Var4;
        y3d y3dVar;
        String strA2;
        x680 x680Var5;
        double d2;
        Object next2;
        long j;
        Object next3;
        kzv kzvVar3;
        String strA3;
        ArrayList arrayList;
        lsm0 lsm0Var;
        Object obj2;
        tvw tvwVarV;
        boolean z9;
        lc00 lc00VarB;
        int i2;
        boolean z10;
        i0w i0wVar;
        int i3;
        boolean z11;
        hxu hxuVar2;
        tvw tvwVar;
        boolean z12;
        double d3;
        String str3;
        x680 x680Var6;
        p3u0 p3u0Var;
        x680 x680Var7;
        double dDoubleValue;
        long textPrimary;
        x680 x680Var8;
        String strD;
        int i4;
        String strA4;
        boolean z13;
        Object objT;
        int i5;
        i7u i7uVar = i7u.b;
        i7u i7uVar2 = i7u.c;
        pn40 pn40Var = pn40.f27267a;
        ctf0Var.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        list5.getClass();
        boolean z14 = a5wVar instanceof kzv;
        if (z14 && historyTypeModel == HistoryTypeModel.SALE) {
            kzv kzvVar4 = (kzv) a5wVar;
            String str4 = kzvVar4.f19169a;
            double d4 = kzvVar4.f;
            Long lT0 = StringsKt.t0(str4);
            boolean zContains = list.contains(Long.valueOf(lT0 != null ? lT0.longValue() : 0L));
            Set set = kvg0.f18955a;
            Iterator it = list3.iterator();
            while (true) {
                if (!it.hasNext()) {
                    d2 = d4;
                    next2 = null;
                    break;
                }
                next2 = it.next();
                Iterator it2 = it;
                d2 = d4;
                if (((xco) next2).f40655a == kzvVar4.T) {
                    break;
                }
                it = it2;
                d4 = d2;
            }
            xco xcoVar = (xco) next2;
            i0w i0wVar2 = kzvVar4.g;
            double d5 = kzvVar4.m;
            hxu hxuVar3 = kzvVar4.O;
            long j2 = kzvVar4.h;
            int i6 = kzvVar4.t;
            q4f q4fVar = kzvVar4.b;
            List list6 = kzvVar4.Y;
            ArrayList arrayListG = hew0.G(historyTypeModel, i0wVar2, list4);
            ArrayList arrayList2 = new ArrayList(r3d.q(arrayListG, 10));
            Iterator it3 = arrayListG.iterator();
            while (it3.hasNext()) {
                arrayList2.add(eeq.X((HistoryMenuItem) it3.next(), zContains));
            }
            Iterator it4 = list5.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    j = j2;
                    next3 = null;
                    break;
                }
                next3 = it4.next();
                ueo ueoVar = (ueo) next3;
                Iterator it5 = it4;
                z0w z0wVar = (z0w) CollectionsKt.firstOrNull(list6);
                if (z0wVar != null) {
                    j = j2;
                    if (ueoVar.f35538a == z0wVar.v) {
                        break;
                    }
                } else {
                    j = j2;
                }
                it4 = it5;
                j2 = j;
            }
            ueo ueoVar2 = (ueo) next3;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : list5) {
                if (((ueo) obj3).d == 2) {
                    arrayList3.add(obj3);
                }
            }
            boolean zA = i7uVar2.a(list6, arrayList3);
            boolean zA2 = i7uVar.a(list6, list5);
            if (q4fVar != q4f.d) {
                i0w i0wVar3 = i0w.i;
                if (i0wVar2 == i0wVar3 || !z2) {
                    kzvVar3 = kzvVar4;
                    if (i0wVar2 == i0wVar3 && z2) {
                        strA3 = ctf0Var.b.a(R.string.sell_coefficient_no_dots, Arrays.copyOf(new Object[0], 0));
                    }
                } else {
                    String str5 = xcoVar != null ? xcoVar.b : null;
                    kzvVar3 = kzvVar4;
                    strA3 = f7k.R(kzvVar4, z, z3, ueoVar2, str5 == null ? "" : str5, z6, z8);
                }
                arrayList = new ArrayList();
                for (Object obj4 : list3) {
                    if (((xco) obj4).e) {
                        arrayList.add(obj4);
                    }
                }
                boolean zK = lmc.K(arrayList, list6);
                String strR = bfb.R(kzvVar3.d, ctf0Var);
                lsm0Var = ctf0Var.b;
                String strQ = w6x.q(strR, " · \u200e", lsm0Var.a(R.string.history_coupon_number, Arrays.copyOf(new Object[]{str4}, 1)));
                nom0 nom0Var = new nom0(aac.Z(i0wVar2, ctf0Var), iom0.n(i0wVar2));
                String str6 = strA3;
                obj2 = "";
                i4 i4VarT = idx.t(kzvVar3.G, kzvVar3.x, zK, ctf0Var, jwb.J(kzvVar3, ctf0Var, list2), kzvVar3.V, zA, zA2);
                String str7 = kzvVar3.B;
                so30 so30Var = (so30) CollectionsKt.W(0, arrayList2);
                so30 so30Var2 = (so30) CollectionsKt.W(1, arrayList2);
                long j3 = j;
                tvwVarV = uvw.v(i6, j3, q4fVar);
                z9 = kzvVar3.q;
                String str8 = kzvVar3.i;
                lc00VarB = kotlin.collections.a.b();
                double d6 = kzvVar3.L;
                lc00VarB.add(ahy.Z(i6, kzvVar3.v, ctf0Var));
                if (!z2) {
                    if (j0w.f15701a[i0wVar2.ordinal()] == 1) {
                        i5 = R.string.sell_coefficient_no_dots;
                    } else {
                        i5 = R.string.coefficient;
                    }
                    String strA5 = lsm0Var.a(i5, Arrays.copyOf(new Object[0], 0));
                    String str9 = kzvVar3.i;
                    str9.getClass();
                    lc00VarB.add(new x680("COEF_ID", strA5, new auy(str9)));
                }
                i2 = (d6 > d2 ? 1 : (d6 == d2 ? 0 : -1));
                if (i2 < 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                i0wVar = i0w.i;
                if (i0wVar2 == i0wVar) {
                    i3 = i2;
                    z11 = z10;
                    z12 = z9;
                    hxuVar2 = hxuVar3;
                    tvwVar = tvwVarV;
                    d3 = kzvVar3.M;
                } else {
                    i3 = i2;
                    z11 = z10;
                    hxuVar2 = hxuVar3;
                    tvwVar = tvwVarV;
                    z12 = z9;
                    d3 = hxuVar2.f.b;
                    if (d3 == 0.0d) {
                        if (plc.H(i0wVar2)) {
                            d3 = kzvVar3.r;
                        } else if (i0wVar2 == i0w.d) {
                            d3 = kzvVar3.c;
                        } else {
                            d3 = kzvVar3.o;
                        }
                    }
                }
                if (z11) {
                    String strA6 = lsm0Var.a(plc.I(i0wVar2, true), Arrays.copyOf(new Object[0], 0));
                    str3 = str;
                    m60 m60Var = new m60(str3, (byte) 4);
                    pn40 pn40Var2 = pn40.f27267a;
                    p3u0Var = p3u0.c;
                    x680Var6 = new x680("BET_SUM_ID", strA6, m60Var.a(kzvVar3, d3, pn40.c(d2, p3u0Var)));
                } else {
                    str3 = str;
                    String strA7 = lsm0Var.a(R.string.pf_bet, Arrays.copyOf(new Object[0], 0));
                    pn40 pn40Var3 = pn40.f27267a;
                    p3u0Var = p3u0.c;
                    String strC = pn40.c(d2, p3u0Var);
                    pz40 pz40Var = s6t0.f31722a;
                    x680Var6 = new x680("BET_SUM_ID", strA7, new wty(strC, str3, s6t0.b().f33626a.getTextPrimary()));
                }
                lc00VarB.add(x680Var6);
                if (kzvVar3.x) {
                    String strA8 = lsm0Var.a(R.string.history_auto_sale, Arrays.copyOf(new Object[0], 0));
                    String strC2 = pn40.c(kzvVar3.y, p3u0Var);
                    pz40 pz40Var2 = s6t0.f31722a;
                    x680Var7 = new x680("AUTO_SALE_ID", strA8, new wty(strC2, str3, s6t0.b().f33626a.getTextPrimary()));
                } else {
                    x680Var7 = null;
                }
                lc00VarB.add(x680Var7);
                if (i3 < 0) {
                    x680Var8 = null;
                } else {
                    BigDecimal bigDecimalSubtract = new BigDecimal(String.valueOf(d2)).subtract(new BigDecimal(String.valueOf(kzvVar3.E)));
                    bigDecimalSubtract.getClass();
                    BigDecimal bigDecimalSubtract2 = new BigDecimal(String.valueOf(d5)).subtract(bigDecimalSubtract);
                    bigDecimalSubtract2.getClass();
                    dDoubleValue = bigDecimalSubtract2.doubleValue();
                    String strO = ntb.O(str3, dDoubleValue);
                    if (dDoubleValue > 0.0d) {
                        pz40 pz40Var3 = s6t0.f31722a;
                        textPrimary = StaticColors.INSTANCE.m98getGreen0d7_KjU();
                    } else if (dDoubleValue < 0.0d) {
                        pz40 pz40Var4 = s6t0.f31722a;
                        textPrimary = StaticColors.INSTANCE.m113getRed0d7_KjU();
                    } else {
                        pz40 pz40Var5 = s6t0.f31722a;
                        textPrimary = s6t0.b().f33626a.getTextPrimary();
                    }
                    x680Var8 = new x680("PROFIT_ID", lsm0Var.a(R.string.history_your_profit_no_colon, Arrays.copyOf(new Object[0], 0)), new wty(strO, str3, textPrimary));
                }
                lc00VarB.add(x680Var8);
                i4 i4VarR0 = dyb.r0(CollectionsKt.S(kotlin.collections.a.a(lc00VarB)));
                strD = pn40.d(d5, str3, p3u0Var);
                if (cy7.c()) {
                    i4 = 1;
                    strA4 = ua80.i("\u200e", strD, Separators.SP, StringsKt.v0(lsm0Var.a(R.string.history_sale_for_v2, Arrays.copyOf(new Object[]{obj2}, 1))).toString());
                } else {
                    i4 = 1;
                    strA4 = lsm0Var.a(R.string.history_sale_for_v2, Arrays.copyOf(new Object[]{strD}, 1));
                }
                if (list6.size() != i4 || (!Intrinsics.d(hxuVar2, hxu.h) && kvg0.f18955a.contains(i0wVar2))) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                ec ecVar = new ec(z2, z13);
                kb30 kb30VarA = zvw.A(kzvVar3, z2, j3);
                if (q4fVar == q4f.d && i0wVar2 != i0wVar && z2) {
                    objT = wvb.T(kzvVar3, betHistoryScreenModel);
                } else {
                    objT = obj2;
                }
                Object obj5 = str6.length() > 0 ? objT : null;
                return new qp30(str4, str4, strQ, tvwVar, str7, z12, i4VarT, ecVar, kb30VarA, obj5 != null ? obj5 : "", str6, str8, i4VarR0, null, nom0Var, strA4, so30Var, so30Var2);
            }
            kzvVar3 = kzvVar4;
            strA3 = "";
            arrayList = new ArrayList();
            while (r2.hasNext()) {
                if (((xco) obj4).e) {
                    arrayList.add(obj4);
                }
            }
            boolean zK2 = lmc.K(arrayList, list6);
            String strR2 = bfb.R(kzvVar3.d, ctf0Var);
            lsm0Var = ctf0Var.b;
            String strQ2 = w6x.q(strR2, " · \u200e", lsm0Var.a(R.string.history_coupon_number, Arrays.copyOf(new Object[]{str4}, 1)));
            nom0 nom0Var2 = new nom0(aac.Z(i0wVar2, ctf0Var), iom0.n(i0wVar2));
            String str10 = strA3;
            obj2 = "";
            i4 i4VarT2 = idx.t(kzvVar3.G, kzvVar3.x, zK2, ctf0Var, jwb.J(kzvVar3, ctf0Var, list2), kzvVar3.V, zA, zA2);
            String str11 = kzvVar3.B;
            so30 so30Var3 = (so30) CollectionsKt.W(0, arrayList2);
            so30 so30Var4 = (so30) CollectionsKt.W(1, arrayList2);
            long j4 = j;
            tvwVarV = uvw.v(i6, j4, q4fVar);
            z9 = kzvVar3.q;
            String str12 = kzvVar3.i;
            lc00VarB = kotlin.collections.a.b();
            double d7 = kzvVar3.L;
            lc00VarB.add(ahy.Z(i6, kzvVar3.v, ctf0Var));
            if (!z2) {
                if (j0w.f15701a[i0wVar2.ordinal()] == 1) {
                    i5 = R.string.sell_coefficient_no_dots;
                } else {
                    i5 = R.string.coefficient;
                }
                String strA9 = lsm0Var.a(i5, Arrays.copyOf(new Object[0], 0));
                String str13 = kzvVar3.i;
                str13.getClass();
                lc00VarB.add(new x680("COEF_ID", strA9, new auy(str13)));
            }
            i2 = (d7 > d2 ? 1 : (d7 == d2 ? 0 : -1));
            if (i2 < 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            i0wVar = i0w.i;
            if (i0wVar2 == i0wVar) {
                i3 = i2;
                z11 = z10;
                z12 = z9;
                hxuVar2 = hxuVar3;
                tvwVar = tvwVarV;
                d3 = kzvVar3.M;
            } else {
                i3 = i2;
                z11 = z10;
                hxuVar2 = hxuVar3;
                tvwVar = tvwVarV;
                z12 = z9;
                d3 = hxuVar2.f.b;
                if (d3 == 0.0d) {
                    if (plc.H(i0wVar2)) {
                        d3 = kzvVar3.r;
                    } else if (i0wVar2 == i0w.d) {
                        d3 = kzvVar3.c;
                    } else {
                        d3 = kzvVar3.o;
                    }
                }
            }
            if (z11) {
                String strA10 = lsm0Var.a(plc.I(i0wVar2, true), Arrays.copyOf(new Object[0], 0));
                str3 = str;
                m60 m60Var2 = new m60(str3, (byte) 4);
                pn40 pn40Var4 = pn40.f27267a;
                p3u0Var = p3u0.c;
                x680Var6 = new x680("BET_SUM_ID", strA10, m60Var2.a(kzvVar3, d3, pn40.c(d2, p3u0Var)));
            } else {
                str3 = str;
                String strA11 = lsm0Var.a(R.string.pf_bet, Arrays.copyOf(new Object[0], 0));
                pn40 pn40Var5 = pn40.f27267a;
                p3u0Var = p3u0.c;
                String strC3 = pn40.c(d2, p3u0Var);
                pz40 pz40Var6 = s6t0.f31722a;
                x680Var6 = new x680("BET_SUM_ID", strA11, new wty(strC3, str3, s6t0.b().f33626a.getTextPrimary()));
            }
            lc00VarB.add(x680Var6);
            if (kzvVar3.x) {
                String strA12 = lsm0Var.a(R.string.history_auto_sale, Arrays.copyOf(new Object[0], 0));
                String strC4 = pn40.c(kzvVar3.y, p3u0Var);
                pz40 pz40Var7 = s6t0.f31722a;
                x680Var7 = new x680("AUTO_SALE_ID", strA12, new wty(strC4, str3, s6t0.b().f33626a.getTextPrimary()));
            } else {
                x680Var7 = null;
            }
            lc00VarB.add(x680Var7);
            if (i3 < 0) {
                x680Var8 = null;
            } else {
                BigDecimal bigDecimalSubtract3 = new BigDecimal(String.valueOf(d2)).subtract(new BigDecimal(String.valueOf(kzvVar3.E)));
                bigDecimalSubtract3.getClass();
                BigDecimal bigDecimalSubtract4 = new BigDecimal(String.valueOf(d5)).subtract(bigDecimalSubtract3);
                bigDecimalSubtract4.getClass();
                dDoubleValue = bigDecimalSubtract4.doubleValue();
                String strO2 = ntb.O(str3, dDoubleValue);
                if (dDoubleValue > 0.0d) {
                    pz40 pz40Var8 = s6t0.f31722a;
                    textPrimary = StaticColors.INSTANCE.m98getGreen0d7_KjU();
                } else if (dDoubleValue < 0.0d) {
                    pz40 pz40Var9 = s6t0.f31722a;
                    textPrimary = StaticColors.INSTANCE.m113getRed0d7_KjU();
                } else {
                    pz40 pz40Var10 = s6t0.f31722a;
                    textPrimary = s6t0.b().f33626a.getTextPrimary();
                }
                x680Var8 = new x680("PROFIT_ID", lsm0Var.a(R.string.history_your_profit_no_colon, Arrays.copyOf(new Object[0], 0)), new wty(strO2, str3, textPrimary));
            }
            lc00VarB.add(x680Var8);
            i4 i4VarR1 = dyb.r0(CollectionsKt.S(kotlin.collections.a.a(lc00VarB)));
            strD = pn40.d(d5, str3, p3u0Var);
            if (cy7.c()) {
                i4 = 1;
                strA4 = ua80.i("\u200e", strD, Separators.SP, StringsKt.v0(lsm0Var.a(R.string.history_sale_for_v2, Arrays.copyOf(new Object[]{obj2}, 1))).toString());
            } else {
                i4 = 1;
                strA4 = lsm0Var.a(R.string.history_sale_for_v2, Arrays.copyOf(new Object[]{strD}, 1));
            }
            if (list6.size() != i4) {
                z13 = true;
            } else {
                z13 = true;
            }
            ec ecVar2 = new ec(z2, z13);
            kb30 kb30VarA2 = zvw.A(kzvVar3, z2, j4);
            if (q4fVar == q4f.d) {
                objT = obj2;
            } else {
                objT = wvb.T(kzvVar3, betHistoryScreenModel);
            }
            if (str10.length() > 0) {
            }
            return new qp30(str4, str4, strQ2, tvwVar, str11, z12, i4VarT2, ecVar2, kb30VarA2, obj5 != null ? obj5 : "", str10, str12, i4VarR1, null, nom0Var2, strA4, so30Var3, so30Var4);
        }
        String str14 = "";
        if (!z14) {
            boolean z15 = a5wVar instanceof for0;
            hb30 hb30Var = hb30.f12752a;
            if (!z15) {
                if (a5wVar instanceof vw4) {
                    return xf0.R((vw4) a5wVar, ctf0Var, historyTypeModel, str, list3, z2, betHistoryScreenModel, z, z3, list5, z6, z8, list2);
                }
                if (a5wVar instanceof z7y) {
                    return a8y.a((z7y) a5wVar, ctf0Var, str, list4, historyTypeModel);
                }
                if (!(a5wVar instanceof nc10)) {
                    String strD2 = a5wVar.d();
                    String strD3 = a5wVar.d();
                    lak0 lak0Var = lak0.c;
                    return new qp30(strD2, strD3, "", qvw.f29409a, "", false, lak0Var, new ec(false, false), hb30Var, "", "", "", lak0Var, null, new nom0(str14, hom0.b), "", null, null);
                }
                nc10 nc10Var = (nc10) a5wVar;
                String str15 = nc10Var.d;
                String strK = ctf0Var.k(R.string.history_coupon_number, str15);
                String strH = rz4.h(i, str15);
                String str16 = nc10Var.d;
                String strQ3 = w6x.q(bfb.R(nc10Var.e, ctf0Var), " · \u200e", strK);
                svw svwVar = new svw(R.drawable.glyph_loto);
                String str17 = nc10Var.b;
                lak0 lak0Var2 = lak0.c;
                ec ecVar3 = new ec(false, false);
                i4 i4VarG0 = dyb.g0(pzw.U(nc10Var, ctf0Var, str, false));
                rc10 rc10Var = nc10Var.c;
                String strK2 = ctf0Var.k(pzw.e0(rc10Var), new Object[0]);
                int iOrdinal = rc10Var.ordinal();
                if (iOrdinal == 0) {
                    hom0Var = hom0.f13401a;
                } else if (iOrdinal == 1) {
                    hom0Var = hom0.b;
                } else {
                    if (iOrdinal != 2) {
                        t9f.b();
                        return null;
                    }
                    hom0Var = hom0.d;
                }
                nom0 nom0Var3 = new nom0(strK2, hom0Var);
                HistoryMenuItem historyMenuItem = HistoryMenuItem.c;
                Parcelable.Creator<HistoryMenuItem> creator = HistoryMenuItem.CREATOR;
                return new qp30(strH, str16, strQ3, svwVar, str17, false, lak0Var2, ecVar3, hb30Var, "", "", "", i4VarG0, null, nom0Var3, "", new so30(kkb.N(historyMenuItem), historyMenuItem), null);
            }
            for0 for0Var = (for0) a5wVar;
            double d8 = for0Var.c;
            double d9 = for0Var.f;
            List list7 = uor0.f36028a;
            String str18 = for0Var.f9896a;
            q4f q4fVar2 = for0Var.b;
            boolean z16 = for0Var.j;
            hxu hxuVar4 = for0Var.l;
            String strK3 = ctf0Var.k(R.string.history_coupon_number, str18);
            i0w i0wVar4 = for0Var.g;
            ArrayList arrayListG2 = hew0.G(historyTypeModel, i0wVar4, list4);
            ArrayList arrayList4 = new ArrayList(r3d.q(arrayListG2, 10));
            Iterator it6 = arrayListG2.iterator();
            while (it6.hasNext()) {
                arrayList4.add(eeq.X((HistoryMenuItem) it6.next(), false));
            }
            boolean z17 = for0Var.o == a6w.b;
            String str19 = for0Var.f9896a;
            String strQ4 = w6x.q(bfb.R(for0Var.d, ctf0Var), " · \u200e", strK3);
            String strZ = aac.Z(i0wVar4, ctf0Var);
            String strL = z16 ? kng0.l(Separators.LPAREN, ctf0Var.k(R.string.confirmed, new Object[0]), Separators.RPAREN) : kng0.l(Separators.LPAREN, ctf0Var.k(R.string.not_confirmed, new Object[0]), Separators.RPAREN);
            lc00 lc00VarB2 = kotlin.collections.a.b();
            lc00VarB2.add(strZ);
            if (z17 != 0) {
                lc00VarB2.add(strL);
            }
            nom0 nom0Var4 = new nom0(CollectionsKt.b0(kotlin.collections.a.a(lc00VarB2), Separators.SP, null, null, null, 62), iom0.n(i0wVar4));
            boolean z18 = for0Var.k;
            lc00 lc00VarB3 = kotlin.collections.a.b();
            if (z18) {
                lc00VarB3.add(new tso0("PROMO_ID", ctf0Var.k(R.string.promo, new Object[0]), tqo0.f34390a));
            }
            if (z17 != 0) {
                lc00VarB3.add(new tso0("FREE_BET_ID", ctf0Var.k(R.string.toto_free_tag, new Object[0]), dqo0.f6527a));
            }
            i4 i4VarR2 = dyb.r0(kotlin.collections.a.a(lc00VarB3));
            so30 so30Var5 = (so30) CollectionsKt.W(0, arrayList4);
            so30 so30Var6 = (so30) CollectionsKt.W(1, arrayList4);
            int iY = lgb.Y(q4fVar2);
            String str20 = for0Var.i;
            String strConcat = "\u200e".concat(for0Var.h);
            List list8 = uor0.f36028a;
            if (z2) {
                lc00 lc00VarB4 = kotlin.collections.a.b();
                lc00VarB4.add(uor0.a(for0Var, ctf0Var));
                String strK4 = ctf0Var.k(R.string.pf_bet, new Object[0]);
                pn40 pn40Var6 = pn40.f27267a;
                String strC5 = pn40.c(d9, p3u0.c);
                String strK5 = z17 ? ctf0Var.k(R.string.pts, new Object[0]) : str;
                pz40 pz40Var11 = s6t0.f31722a;
                lc00VarB4.add(new x680("BET_SUM_ID", strK4, new wty(strC5, strK5, s6t0.b().f33626a.getTextPrimary())));
                if (list8.contains(i0wVar4)) {
                    lc00VarB4.addAll(bdx.i0(hxuVar4, i0wVar4, str));
                    lc00VarB4.add(new x680("POSSIBLE_PAYOUT_ID", ctf0Var.k(R.string.history_your_win, new Object[0]), new wty(pn40.c(hxuVar4.f.b, p3u0.c), str, StaticColors.INSTANCE.m98getGreen0d7_KjU())));
                }
                lc00VarA = kotlin.collections.a.a(lc00VarB4);
            } else {
                so30Var5 = so30Var5;
                str20 = str20;
                lc00 lc00VarB5 = kotlin.collections.a.b();
                lc00VarB5.add(uor0.a(for0Var, ctf0Var));
                String strK6 = z17 != 0 ? ctf0Var.k(R.string.pts, new Object[0]) : str;
                q4f q4fVar3 = q4f.u;
                if (!(q4fVar2 == q4fVar3 || z17 == 0) || (q4fVar2 == q4fVar3 && !list8.contains(i0wVar4))) {
                    x680Var = null;
                } else if (q4fVar2 == q4fVar3 && list8.contains(i0wVar4)) {
                    int iOrdinal2 = i0wVar4.ordinal();
                    String strK7 = (iOrdinal2 == 3 || iOrdinal2 == 4) ? ctf0Var.k(R.string.history_your_win, new Object[0]) : ctf0Var.k(R.string.pf_bet, new Object[0]);
                    pn40 pn40Var7 = pn40.f27267a;
                    String strC6 = pn40.c(d8, p3u0.c);
                    pz40 pz40Var12 = s6t0.f31722a;
                    x680Var = new x680("POSSIBLE_PAYOUT_ID", strK7, new wty(strC6, strK6, s6t0.b().f33626a.getCommerce()));
                } else {
                    pn40 pn40Var8 = pn40.f27267a;
                    double d10 = hxuVar4.f.b;
                    String strC7 = pn40.c(d10 == 0.0d ? d8 : d10, p3u0.c);
                    String strC8 = pn40.c(d9, p3u0.c);
                    int iOrdinal3 = i0wVar4.ordinal();
                    String strK8 = (iOrdinal3 == 3 || iOrdinal3 == 4) ? ctf0Var.k(R.string.history_your_win, new Object[0]) : ctf0Var.k(R.string.pf_bet, new Object[0]);
                    switch (i0wVar4.ordinal()) {
                        case 0:
                        case 2:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                            pz40 pz40Var13 = s6t0.f31722a;
                            wtyVar = new wty(strC8, strK6, s6t0.b().f33626a.getTextPrimary());
                            break;
                        case 1:
                            String strC9 = pn40.c(d9, p3u0.c);
                            pz40 pz40Var14 = s6t0.f31722a;
                            wtyVar = new wty(strC9, strK6, s6t0.b().f33626a.getTextPrimary());
                            break;
                        case 3:
                        case 4:
                            pz40 pz40Var15 = s6t0.f31722a;
                            wtyVar = new xty(StaticColors.INSTANCE.m98getGreen0d7_KjU(), strC7, strC8, strK6);
                            break;
                        default:
                            t9f.b();
                            return null;
                    }
                    x680Var = new x680("POSSIBLE_PAYOUT_ID", strK8, wtyVar);
                }
                lc00VarB5.add(x680Var);
                lc00VarA = kotlin.collections.a.a(lc00VarB5);
            }
            i4 i4VarR3 = dyb.r0(CollectionsKt.S(lc00VarA));
            ec ecVar4 = new ec(z2, !Intrinsics.d(hxuVar4, hxu.h) && list8.contains(i0wVar4));
            long j5 = for0Var.n;
            return new qp30(str19, str19, strQ4, new svw(iY), str20, false, i4VarR2, ecVar4, hb30Var, "", "", strConcat, i4VarR3, (z16 || j5 > 0) ? new l3w(ctf0Var.k(R.string.bet_info_approved_by_bet_v2, Long.valueOf(j5)), str14, i8x.f14362a) : null, nom0Var4, "", so30Var5, so30Var6);
        }
        kzv kzvVar5 = (kzv) a5wVar;
        int i7 = kzvVar5.v;
        String str21 = kzvVar5.f19169a;
        int i8 = kzvVar5.t;
        Long lT1 = StringsKt.t0(str21);
        boolean zContains2 = list.contains(Long.valueOf(lT1 != null ? lT1.longValue() : 0L));
        Set set2 = nzv.f24390a;
        Iterator it7 = list3.iterator();
        while (true) {
            if (!it7.hasNext()) {
                next = null;
                break;
            }
            next = it7.next();
            Iterator it8 = it7;
            if (((xco) next).f40655a == kzvVar5.T) {
                break;
            }
            it7 = it8;
        }
        xco xcoVar2 = (xco) next;
        i0w i0wVar5 = kzvVar5.g;
        double d11 = kzvVar5.o;
        double d12 = kzvVar5.c;
        double d13 = kzvVar5.r;
        double d14 = kzvVar5.L;
        double d15 = kzvVar5.E;
        double d16 = kzvVar5.M;
        double d17 = kzvVar5.C;
        double d18 = kzvVar5.f;
        long j6 = kzvVar5.h;
        hxu hxuVar5 = kzvVar5.O;
        q4f q4fVar4 = kzvVar5.b;
        List list9 = kzvVar5.Y;
        ArrayList arrayListG3 = hew0.G(historyTypeModel, i0wVar5, list4);
        ArrayList arrayList5 = new ArrayList(r3d.q(arrayListG3, 10));
        Iterator it9 = arrayListG3.iterator();
        while (it9.hasNext()) {
            arrayList5.add(eeq.X((HistoryMenuItem) it9.next(), zContains2));
        }
        Iterator it10 = list5.iterator();
        while (true) {
            if (!it10.hasNext()) {
                kzvVar = kzvVar5;
                obj = null;
                break;
            }
            Object next4 = it10.next();
            ueo ueoVar3 = (ueo) next4;
            Iterator it11 = it10;
            z0w z0wVar2 = (z0w) CollectionsKt.firstOrNull(list9);
            if (z0wVar2 != null) {
                kzvVar = kzvVar5;
                if (ueoVar3.f35538a == z0wVar2.v) {
                    obj = next4;
                    break;
                }
            } else {
                kzvVar = kzvVar5;
            }
            it10 = it11;
            kzvVar5 = kzvVar;
        }
        ueo ueoVar4 = (ueo) obj;
        boolean zA3 = i7uVar2.a(list9, list5);
        boolean zA4 = i7uVar.a(list9, list5);
        if (q4fVar4 == q4f.d) {
            str2 = str14;
            kzvVar2 = kzvVar;
        } else {
            i0w i0wVar6 = i0w.i;
            if (i0wVar5 == i0wVar6 || !z2) {
                kzvVar2 = kzvVar;
                if (i0wVar5 == i0wVar6 && z2) {
                    strA = ctf0Var.b.a(R.string.sell_coefficient_no_dots, Arrays.copyOf(new Object[0], 0));
                } else {
                    str2 = str14;
                }
            } else {
                String str22 = xcoVar2 != null ? xcoVar2.b : null;
                strA = f7k.R(kzvVar, z, z3, ueoVar4, str22 == null ? str14 : str22, z6, z8);
                kzvVar2 = kzvVar;
            }
            str2 = strA;
        }
        ArrayList arrayList6 = new ArrayList();
        for (Object obj6 : list3) {
            if (((xco) obj6).e) {
                arrayList6.add(obj6);
            }
        }
        boolean zK3 = lmc.K(arrayList6, list9);
        String strT = (q4fVar4 == q4f.d || i0wVar5 == i0w.i || !z2) ? str14 : wvb.T(kzvVar2, betHistoryScreenModel);
        if (str2.length() <= 0) {
            strT = null;
        }
        str14 = strT != null ? strT : "";
        String strR3 = bfb.R(kzvVar2.d, ctf0Var);
        lsm0 lsm0Var2 = ctf0Var.b;
        String strQ5 = w6x.q(strR3, " · \u200e", lsm0Var2.a(R.string.history_coupon_number, Arrays.copyOf(new Object[]{str21}, 1)));
        nom0 nom0Var5 = new nom0(aac.Z(i0wVar5, ctf0Var), iom0.n(i0wVar5));
        i4 i4VarT3 = idx.t(kzvVar2.G, kzvVar2.x, zK3, ctf0Var, jwb.J(kzvVar2, ctf0Var, list2), kzvVar2.V, zA3, zA4);
        String str23 = kzvVar2.B;
        so30 so30Var7 = (so30) CollectionsKt.W(0, arrayList5);
        so30 so30Var8 = (so30) CollectionsKt.W(1, arrayList5);
        long j7 = j6;
        tvw tvwVarV2 = uvw.v(i8, j7, q4fVar4);
        boolean z19 = kzvVar2.q;
        String strK9 = kng0.k("\u200e", sj3.b0(kzvVar2));
        ctf0Var.getClass();
        xex xexVar = new xex();
        xexVar.f40764a = ctf0Var;
        String str24 = str2;
        xexVar.b = str;
        boolean z20 = str24.length() > 0;
        if (z2) {
            lc00 lc00VarB6 = kotlin.collections.a.b();
            lc00VarB6.add(ahy.Z(i8, i7, ctf0Var));
            if (!z20) {
                lc00VarB6.add(xexVar.B(kzvVar2, zA3));
            }
            lc00VarB6.add(xexVar.E(kzvVar2, zA3));
            lc00VarB6.add(xex.G(kzvVar2, ctf0Var, z7));
            if (q4fVar4 == q4f.h) {
                x680Var4 = null;
            } else {
                pn40 pn40Var9 = pn40.f27267a;
                String strC10 = pn40.c(d17 > 0.0d ? d17 : i0wVar5 == i0w.i ? d16 : d18 - d15, p3u0.c);
                String strA13 = lsm0Var2.a(plc.I(i0wVar5, d14 < d18), Arrays.copyOf(new Object[0], 0));
                pz40 pz40Var16 = s6t0.f31722a;
                x680Var4 = new x680("BET_SUM_ID", strA13, new wty(strC10, str, s6t0.b().f33626a.getTextPrimary()));
            }
            lc00VarB6.add(x680Var4);
            lc00VarB6.add(xexVar.w(kzvVar2));
            lc00VarB6.add(xexVar.x(kzvVar2));
            lc00VarB6.add(xexVar.y(kzvVar2));
            lc00VarB6.add(xexVar.z(kzvVar2));
            i0w i0wVar7 = i0w.b;
            if (i0wVar5 == i0wVar7 || i0wVar5 == i0w.d || i0wVar5 == i0w.e) {
                hxuVar = hxuVar5;
                lc00VarB6.addAll(bdx.i0(hxuVar, i0wVar5, str));
            } else {
                hxuVar = hxuVar5;
            }
            int iOrdinal4 = i0wVar5.ordinal();
            if (iOrdinal4 == 0 || iOrdinal4 == 1) {
                pz40 pz40Var17 = s6t0.f31722a;
                y3dVar = new y3d(s6t0.b().f33626a.getTextPrimary());
            } else if (iOrdinal4 == 3 || iOrdinal4 == 4) {
                pz40 pz40Var18 = s6t0.f31722a;
                y3dVar = new y3d(StaticColors.INSTANCE.m98getGreen0d7_KjU());
            } else {
                y3dVar = null;
            }
            ivo0 ivo0Var = hxuVar.f;
            String str25 = ivo0Var.f15455a;
            double d19 = ivo0Var.b;
            if (str25.length() > 0 && i0wVar5 == i0wVar7) {
                strA2 = ivo0Var.f15455a;
            } else if (q3d.j(q4f.e, q4f.g).contains(q4fVar4) && i0wVar5 != i0w.e) {
                strA2 = lsm0Var2.a(R.string.history_min_payout_no_colon, Arrays.copyOf(new Object[0], 0));
            } else if (kzvVar2.e == 0.0d) {
                strA2 = null;
            } else if (plc.H(i0wVar5)) {
                strA2 = lsm0Var2.a(kzvVar2.s ? R.string.max_win_possible : R.string.bet_possible_win, Arrays.copyOf(new Object[0], 0));
            } else {
                strA2 = lsm0Var2.a(R.string.history_your_win, Arrays.copyOf(new Object[0], 0));
            }
            if (d19 == 0.0d || (i0wVar5 != i0wVar7 && i0wVar5 != i0w.d && i0wVar5 != i0w.e)) {
                d19 = plc.H(i0wVar5) ? d13 : i0wVar5 == i0w.d ? d12 : d11;
            }
            if (!z4 || strA2 == null || d19 == 0.0d || y3dVar == null) {
                x680Var5 = null;
            } else {
                pn40 pn40Var10 = pn40.f27267a;
                x680Var5 = new x680("WIN_ID", strA2, new wty(pn40.c(d19, p3u0.c), str, y3dVar.f41946a));
            }
            lc00VarB6.add(x680Var5);
            lc00VarB6.add(new g090(ctf0Var, str).d(kzvVar2, z5));
            lc00VarA2 = kotlin.collections.a.a(lc00VarB6);
            list9 = list9;
        } else {
            j7 = j7;
            strK9 = strK9;
            hxuVar = hxuVar5;
            z19 = z19;
            lc00 lc00VarB7 = kotlin.collections.a.b();
            lc00VarB7.add(ahy.Z(i8, i7, ctf0Var));
            lc00VarB7.add(xexVar.B(kzvVar2, zA3));
            lc00VarB7.add(xex.G(kzvVar2, ctf0Var, z7));
            String str26 = kzvVar2.k;
            lc00VarB7.add((str26.length() > 0 && zA3 && q4fVar4 == q4f.c) ? new x680("MAX_OPTION_COEF_ID", lsm0Var2.a(R.string.maximum_coef, Arrays.copyOf(new Object[0], 0)), new auy(str26)) : null);
            lc00VarB7.add(xexVar.E(kzvVar2, zA3));
            if (q4fVar4 != q4f.h) {
                if (i0wVar5 == i0w.i) {
                    d = d16;
                } else {
                    double d20 = hxuVar.f.b;
                    if (d20 != 0.0d) {
                        d = d20;
                    } else if (plc.H(i0wVar5)) {
                        d = d13;
                    } else {
                        d = i0wVar5 == i0w.d ? d12 : d11;
                    }
                }
                pn40 pn40Var11 = pn40.f27267a;
                if (d17 <= 0.0d) {
                    d17 = d18 - d15;
                }
                x680Var2 = new x680("BET_SUM_ID", ctf0Var.k(plc.I(i0wVar5, d14 < d18), new Object[0]), new m60(str, (byte) 4).a(kzvVar2, d, pn40.c(d17, p3u0.c)));
            } else if (plc.H(i0wVar5) || i0wVar5 == i0w.d || i0wVar5 == i0w.e) {
                double d21 = hxuVar.f.b;
                if (d21 == 0.0d) {
                    d21 = plc.H(i0wVar5) ? kzvVar2.p : d11;
                }
                String strA14 = plc.H(i0wVar5) ? lsm0Var2.a(R.string.bet_possible_win, Arrays.copyOf(new Object[0], 0)) : ctf0Var.k(R.string.history_your_win, new Object[0]);
                pn40 pn40Var12 = pn40.f27267a;
                String strC11 = pn40.c(d21, p3u0.c);
                int iOrdinal5 = i0wVar5.ordinal();
                if (iOrdinal5 == 3 || iOrdinal5 == 4) {
                    pz40 pz40Var19 = s6t0.f31722a;
                    jM98getGreen0d7_KjU = StaticColors.INSTANCE.m98getGreen0d7_KjU();
                } else {
                    pz40 pz40Var20 = s6t0.f31722a;
                    jM98getGreen0d7_KjU = s6t0.b().f33626a.getSecondary();
                }
                x680Var2 = new x680("POSSIBLE_PAYOUT_ID", strA14, new wty(strC11, str, jM98getGreen0d7_KjU));
            } else {
                x680Var2 = null;
            }
            lc00VarB7.add(x680Var2);
            if (i0wVar5 == i0w.b && q3d.j(q4f.e, q4f.g).contains(q4fVar4)) {
                ivo0 ivo0Var2 = hxuVar.f;
                double d22 = ivo0Var2.b;
                double d23 = d22 == 0.0d ? d13 : d22;
                String strK10 = ivo0Var2.f15455a.length() > 0 ? hxuVar.f.f15455a : ctf0Var.k(R.string.history_min_payout_no_colon, new Object[0]);
                pn40 pn40Var13 = pn40.f27267a;
                String strC12 = pn40.c(d23, p3u0.c);
                pz40 pz40Var21 = s6t0.f31722a;
                x680Var3 = new x680("MINIMUM_BET_ID", strK10, new wty(strC12, str, s6t0.b().f33626a.getTextPrimary()));
            } else {
                x680Var3 = null;
            }
            lc00VarB7.add(x680Var3);
            lc00VarB7.add(xexVar.w(kzvVar2));
            lc00VarB7.add(xexVar.x(kzvVar2));
            lc00VarB7.add(xexVar.y(kzvVar2));
            lc00VarB7.add(new g090(ctf0Var, str).d(kzvVar2, z5));
            lc00VarB7.add(xexVar.z(kzvVar2));
            lc00VarA2 = kotlin.collections.a.a(lc00VarB7);
        }
        return new qp30(str21, str21, strQ5, tvwVarV2, str23, z19, i4VarT3, new ec(z2, list9.size() == 1 || (!Intrinsics.d(hxuVar, hxu.h) && nzv.f24390a.contains(i0wVar5))), zvw.A(kzvVar2, z2, j7), str14, str24, strK9, dyb.r0(CollectionsKt.S(lc00VarA2)), null, nom0Var5, "", so30Var7, so30Var8);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:35:0x0144  */
    /* JADX WARN: Code duplicated, block: B:37:0x014a  */
    /* JADX WARN: Code duplicated, block: B:38:0x014e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0168  */
    /* JADX WARN: Code duplicated, block: B:43:0x016b  */
    /* JADX WARN: Code duplicated, block: B:45:0x016e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0171  */
    /* JADX WARN: Code duplicated, block: B:48:0x0184  */
    /* JADX WARN: Code duplicated, block: B:50:0x0188  */
    /* JADX WARN: Code duplicated, block: B:51:0x019b  */
    /* JADX WARN: Code duplicated, block: B:52:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:55:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:56:0x01b6  */
    public static final sbs0 z(qbs0 qbs0Var, Map map, wcb wcbVar, ctf0 ctf0Var, xte xteVar, boolean z) {
        lsm0 lsm0Var;
        StringBuilder sb;
        String str;
        int iOrdinal;
        zia viaVar;
        boolean z2;
        boolean z3;
        r7p p7pVar;
        y7p w7pVar;
        qbs0Var.getClass();
        map.getClass();
        wcbVar.getClass();
        ctf0Var.getClass();
        xteVar.getClass();
        String strA = A(qbs0Var);
        mbs0 mbs0Var = qbs0Var.b;
        bcs0 bcs0Var = qbs0Var.f28453a;
        String str2 = bcs0Var.l;
        String str3 = bcs0Var.p;
        fho fhoVar = (fho) map.getOrDefault(Long.valueOf(mbs0Var.h), fho.f9552a);
        int iOrdinal2 = xteVar.ordinal();
        if (iOrdinal2 == 0) {
            String str4 = bcs0Var.f;
            n0x n0xVarN = n(qbs0Var, wcbVar);
            String str5 = bcs0Var.g;
            rdj rdjVar = rdj.f30294a;
            lsm0Var = ctf0Var.b;
            boolean zH = ctf0Var.h();
            long j = bcs0Var.i;
            String str6 = bcs0Var.u;
            sb = new StringBuilder(ohs0.n(rdj.g(new znq0(j), efj.UNIVERSAL, Boolean.valueOf(zH), false, 56), Separators.SP));
            str = bcs0Var.h;
            if (str.length() != 0 && str6.length() > 0) {
                sb.append(str6);
            } else if (str.length() > 0) {
                sb.append(str);
            } else {
                sb.append(lsm0Var.a(R.string.main_game, Arrays.copyOf(new Object[0], 0)));
            }
            String string = sb.toString();
            iOrdinal = fhoVar.ordinal();
            if (iOrdinal != 0) {
                viaVar = wia.f39205a;
            } else if (iOrdinal != 1) {
                viaVar = new via(lsm0Var.a(R.string.auto_sub_title, Arrays.copyOf(new Object[0], 0)));
            } else if (iOrdinal != 2) {
                viaVar = new xia(lsm0Var.a(R.string.option_bet, Arrays.copyOf(new Object[0], 0)));
            } else {
                if (iOrdinal == 3) {
                    t9f.b();
                    return null;
                }
                viaVar = new yia(lsm0Var.a(R.string.each_way, Arrays.copyOf(new Object[0], 0)));
            }
            z2 = mbs0Var.d;
            if (z) {
                z3 = false;
            } else {
                z3 = z2;
            }
            p7pVar = new p7p(str4, n0xVarN, str5, string, o(qbs0Var), false, z2, z3, viaVar);
        } else if (iOrdinal2 == 1 || iOrdinal2 == 2) {
            p7pVar = new o7p(bcs0Var.f, n(qbs0Var, wcbVar), bcs0Var.g, l(ctf0Var, bcs0Var), m(ctf0Var, bcs0Var), o(qbs0Var), mbs0Var.d, p(fhoVar, ctf0Var));
        } else if (iOrdinal2 == 3) {
            String str7 = bcs0Var.f;
            n0x n0xVarN2 = n(qbs0Var, wcbVar);
            String str8 = bcs0Var.g;
            rdj rdjVar2 = rdj.f30294a;
            lsm0Var = ctf0Var.b;
            boolean zH2 = ctf0Var.h();
            long j2 = bcs0Var.i;
            String str9 = bcs0Var.u;
            sb = new StringBuilder(ohs0.n(rdj.g(new znq0(j2), efj.UNIVERSAL, Boolean.valueOf(zH2), false, 56), Separators.SP));
            str = bcs0Var.h;
            if (str.length() != 0) {
                if (str.length() > 0) {
                    sb.append(str);
                } else {
                    sb.append(lsm0Var.a(R.string.main_game, Arrays.copyOf(new Object[0], 0)));
                }
            } else if (str.length() > 0) {
                sb.append(str);
            } else {
                sb.append(lsm0Var.a(R.string.main_game, Arrays.copyOf(new Object[0], 0)));
            }
            String string2 = sb.toString();
            iOrdinal = fhoVar.ordinal();
            if (iOrdinal != 0) {
                viaVar = wia.f39205a;
            } else if (iOrdinal != 1) {
                viaVar = new via(lsm0Var.a(R.string.auto_sub_title, Arrays.copyOf(new Object[0], 0)));
            } else if (iOrdinal != 2) {
                viaVar = new xia(lsm0Var.a(R.string.option_bet, Arrays.copyOf(new Object[0], 0)));
            } else {
                if (iOrdinal == 3) {
                    t9f.b();
                    return null;
                }
                viaVar = new yia(lsm0Var.a(R.string.each_way, Arrays.copyOf(new Object[0], 0)));
            }
            z2 = mbs0Var.d;
            if (z) {
                z3 = false;
            } else {
                z3 = z2;
            }
            p7pVar = new p7p(str7, n0xVarN2, str8, string2, o(qbs0Var), false, z2, z3, viaVar);
        } else {
            if (iOrdinal2 != 4) {
                t9f.b();
                return null;
            }
            String str10 = bcs0Var.f;
            n0x n0xVarN3 = n(qbs0Var, wcbVar);
            if (str3.length() == 0) {
                w7pVar = new v7p(str2);
            } else if (StringsKt__StringsKt.split$default(str2, new String[]{Separators.SLASH}, false, 0, 6, null).size() == 2 || StringsKt__StringsKt.split$default(str3, new String[]{Separators.SLASH}, false, 0, 6, null).size() == 2) {
                w7pVar = new w7p(str2, str3);
            } else {
                w7pVar = (StringsKt__StringsKt.split$default(str2, new String[]{Separators.SLASH}, false, 0, 6, null).size() > 2 || StringsKt__StringsKt.split$default(str3, new String[]{Separators.SLASH}, false, 0, 6, null).size() > 2) ? new u7p(str2, str3) : new x7p(str2, str3, feb.Y(bcs0Var, bcs0Var.m, true), feb.Y(bcs0Var, bcs0Var.q, false));
            }
            p7pVar = new q7p(str10, n0xVarN3, w7pVar, l(ctf0Var, bcs0Var), m(ctf0Var, bcs0Var), o(qbs0Var), mbs0Var.d, p(fhoVar, ctf0Var));
        }
        return new sbs0(qbs0Var, strA, p7pVar);
    }
}
