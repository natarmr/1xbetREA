package a;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class fxb {
    public static final m5l0 A(d0t d0tVar) {
        if (d0tVar.K.isEmpty()) {
            List list = d0tVar.k;
            if (list == null || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (!((d0t) it.next()).K.isEmpty()) {
                    }
                }
            }
            return i5l0.f14197a;
        }
        return l5l0.f19463a;
    }

    public static final int B(t2m0 t2m0Var) {
        switch (t2m0Var.ordinal()) {
            case 1:
                return R.attr.uikitStaticDarkBlue30;
            case 2:
                return R.attr.uikitStaticGreen40;
            case 3:
                return R.attr.uikitStaticGreen20;
            case 4:
                return R.attr.uikitStaticYellow40;
            case 5:
                return R.attr.uikitStaticYellow20;
            case 6:
                return R.attr.uikitStaticRed20;
            case 7:
                return R.attr.uikitStaticRed40;
            default:
                return -1;
        }
    }

    public static String C(int i, Context context) {
        if (context == null) {
            return "";
        }
        if (i == 1) {
            return context.getString(R.string.fingerprint_error_hw_not_available);
        }
        if (i != 7) {
            switch (i) {
                case 9:
                    break;
                case 10:
                    return context.getString(R.string.fingerprint_error_user_canceled);
                case 11:
                    return context.getString(R.string.fingerprint_error_no_fingerprints);
                case 12:
                    return context.getString(R.string.fingerprint_error_hw_not_present);
                default:
                    Log.e("BiometricUtils", "Unknown error code: " + i);
                    return context.getString(R.string.default_error_msg);
            }
        }
        return context.getString(R.string.fingerprint_error_lockout);
    }

    public static final bjj D(ymx ymxVar, Function0 function0) {
        ymxVar.getClass();
        return new bjj(ymxVar, true, function0);
    }

    public static final i4 E(hxu hxuVar, String str, i0w i0wVar, boolean z) {
        hxuVar.getClass();
        ivo0 ivo0Var = hxuVar.f13829a;
        i0wVar.getClass();
        if (hxuVar.equals(hxu.h) || !z || i0wVar == i0w.f13966a) {
            return null;
        }
        lc00 lc00VarB = kotlin.collections.a.b();
        ivo0 ivo0Var2 = hxuVar.e;
        ivo0 ivo0Var3 = hxuVar.d;
        ivo0 ivo0Var4 = hxuVar.c;
        ivo0 ivo0Var5 = hxuVar.b;
        if (ivo0Var.f15455a.length() > 0) {
            String str2 = ivo0Var.f15455a;
            pn40 pn40Var = pn40.f27267a;
            lc00VarB.add(new f3w(str2, str2, pn40.c(ivo0Var.b, p3u0.c), str, e3w.f7156a));
        }
        if (ivo0Var5.f15455a.length() > 0) {
            String str3 = ivo0Var5.f15455a;
            pn40 pn40Var2 = pn40.f27267a;
            lc00VarB.add(new f3w(str3, str3, pn40.c(ivo0Var5.b, p3u0.c), str, e3w.f7156a));
        }
        if (ivo0Var4.f15455a.length() > 0) {
            String str4 = ivo0Var4.f15455a;
            pn40 pn40Var3 = pn40.f27267a;
            lc00VarB.add(new f3w(str4, str4, pn40.c(ivo0Var4.b, p3u0.c), str, e3w.f7156a));
        }
        if (ivo0Var3.f15455a.length() > 0) {
            String str5 = ivo0Var3.f15455a;
            pn40 pn40Var4 = pn40.f27267a;
            lc00VarB.add(new f3w(str5, str5, pn40.c(ivo0Var3.b, p3u0.c), str, e3w.f7156a));
        }
        if (ivo0Var2.f15455a.length() > 0) {
            String str6 = ivo0Var2.f15455a;
            pn40 pn40Var5 = pn40.f27267a;
            lc00VarB.add(new f3w(str6, str6, pn40.c(ivo0Var2.b, p3u0.c), str, e3w.f7156a));
        }
        return dyb.r0(kotlin.collections.a.a(lc00VarB));
    }

    public static final c280 F(long j, String str) {
        return new c280(vsm0.s(j, str), R.drawable.ic_glyph_placeholder_player);
    }

    public static final boolean G(Long l, Long l2) {
        return l.longValue() == 99 || l2.longValue() == 99 || l.longValue() == 66 || l2.longValue() == 66;
    }

    public static final boolean H(Long l) {
        return l.longValue() == 4 || l.longValue() == 10 || l.longValue() == 6 || l.longValue() == 29 || l.longValue() == 5 || l.longValue() == 32 || l.longValue() == 239 || l.longValue() == 16 || l.longValue() == 30 || l.longValue() == 200 || l.longValue() == 282 || l.longValue() == 21 || l.longValue() == 286 || l.longValue() == 94;
    }

    public static final String I(String str) {
        return (str == null || str.length() == 0) ? "-" : str;
    }

    public static final eme J(llm0 llm0Var) {
        llm0Var.getClass();
        int iOrdinal = llm0Var.ordinal();
        if (iOrdinal == 0) {
            return eme.f8041a;
        }
        if (iOrdinal == 1) {
            return eme.b;
        }
        if (iOrdinal == 2) {
            return eme.c;
        }
        t9f.b();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v4, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v5, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v4, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.util.ArrayList] */
    public static final kgf K(ahf ahfVar) {
        mff mffVar;
        ?? arrayList;
        ?? arrayList2;
        List list;
        List list2;
        ahfVar.getClass();
        Integer num = ahfVar.f872a;
        agf agfVar = ahfVar.c;
        Integer num2 = ahfVar.e;
        if (num != null) {
            mffVar = (mff) mff.g.get(num.intValue());
        } else if (num2 != null && num2.intValue() == 1) {
            mffVar = mff.c;
        } else {
            mffVar = (num2 != null && num2.intValue() == 2) ? mff.d : mff.e;
        }
        mff mffVar2 = mffVar;
        List<jgf> list3 = ahfVar.d;
        ?? arrayList3 = 0;
        arrayList3 = 0;
        if (list3 != null) {
            arrayList = new ArrayList(r3d.q(list3, 10));
            for (jgf jgfVar : list3) {
                Integer num3 = jgfVar.f16475a;
                int iIntValue = num3 != null ? num3.intValue() : 0;
                Integer num4 = jgfVar.b;
                int iIntValue2 = num4 != null ? num4.intValue() : 0;
                Integer num5 = jgfVar.c;
                arrayList.add(new ggf(iIntValue, iIntValue2, num5 != null ? num5.intValue() : 0, jgfVar.d != null));
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = iun.f15405a;
        }
        if (agfVar == null || (list2 = agfVar.f821a) == null) {
            arrayList2 = 0;
        } else {
            arrayList2 = new ArrayList(r3d.q(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList2.add(L((qgf) it.next()));
            }
        }
        if (arrayList2 == 0) {
            arrayList2 = iun.f15405a;
        }
        ngf ngfVar = new ngf(arrayList2);
        if (agfVar != null && (list = agfVar.b) != null) {
            arrayList3 = new ArrayList(r3d.q(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList3.add(L((qgf) it2.next()));
            }
        }
        if (arrayList3 == 0) {
            arrayList3 = iun.f15405a;
        }
        ?? r6 = arrayList;
        ngf ngfVar2 = new ngf(arrayList3);
        Integer num6 = ahfVar.b;
        return new kgf(mffVar2, r6, ngfVar, ngfVar2, num6 != null ? num6.intValue() : 0, num2 != null ? num2.intValue() : 0);
    }

    public static final chf L(qgf qgfVar) {
        Integer num = qgfVar.f28681a;
        int iIntValue = num != null ? num.intValue() : 0;
        Integer num2 = qgfVar.b;
        int iIntValue2 = num2 != null ? num2.intValue() : 0;
        Integer num3 = qgfVar.c;
        int iIntValue3 = num3 != null ? num3.intValue() : 0;
        Integer num4 = qgfVar.d;
        int iIntValue4 = num4 != null ? num4.intValue() : 0;
        Integer num5 = qgfVar.e;
        return new chf(iIntValue, iIntValue2, iIntValue3, iIntValue4, num5 != null ? num5.intValue() : 0);
    }

    public static final ozh M(d3j d3jVar, ctf0 ctf0Var) {
        char c;
        char c2;
        String strA;
        char c3;
        char c4;
        char c5;
        char c6;
        mzb0 mzb0VarA;
        char c7;
        char c8;
        d3jVar.getClass();
        ctf0Var.getClass();
        if (d3jVar instanceof a3j) {
            lsm0 lsm0Var = ctf0Var.b;
            String strA2 = lsm0Var.a(R.string.daily_task_widget_no_task_available_title, Arrays.copyOf(new Object[0], 0));
            String strA3 = lsm0Var.a(R.string.daily_task_widget_task_available_title, Arrays.copyOf(new Object[0], 0));
            String strA4 = lsm0Var.a(R.string.daily_task_widget_no_task_available_title, Arrays.copyOf(new Object[0], 0));
            String strA5 = lsm0Var.a(R.string.daily_task_widget_task_available_subtitle, Arrays.copyOf(new Object[0], 0));
            String strA6 = lsm0Var.a(R.string.daily_task_widget_no_task_available, Arrays.copyOf(new Object[0], 0));
            String strA7 = lsm0Var.a(R.string.daily_task_button_text_game, Arrays.copyOf(new Object[0], 0));
            String strA8 = lsm0Var.a(R.string.daily_task_button_text_participate, Arrays.copyOf(new Object[0], 0));
            String strA9 = lsm0Var.a(R.string.daily_task_widget_open_tasks, Arrays.copyOf(new Object[0], 0));
            StringBuilder sb = new StringBuilder(ujn.h);
            if (StringsKt.O("/static/img/android/casino/daily_challenge/widget/daily_default.webp", ujn.h, false) || kotlin.text.c.x("/static/img/android/casino/daily_challenge/widget/daily_default.webp", "https://", false)) {
                sb.setLength(0);
                sb.append("/static/img/android/casino/daily_challenge/widget/daily_default.webp");
            } else {
                if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                    sb.append('/');
                }
                sb.append(StringsKt.y0("/static/img/android/casino/daily_challenge/widget/daily_default.webp", '/'));
            }
            n0x n0xVar = new n0x(sb.toString());
            StringBuilder sb2 = new StringBuilder(ujn.h);
            if (StringsKt.O("/static/img/android/casino/daily_challenge/widget/daily_calendar.webp", ujn.h, false) || kotlin.text.c.x("/static/img/android/casino/daily_challenge/widget/daily_calendar.webp", "https://", false)) {
                sb2.setLength(0);
                sb2.append("/static/img/android/casino/daily_challenge/widget/daily_calendar.webp");
            } else {
                if (sb2.length() > 0 && !StringsKt.S(sb2, Separators.SLASH)) {
                    sb2.append('/');
                }
                sb2.append(StringsKt.y0("/static/img/android/casino/daily_challenge/widget/daily_calendar.webp", '/'));
            }
            return new lzh(null, strA2, strA4, strA3, strA5, strA6, strA7, strA8, strA9, n0xVar, new n0x(sb2.toString()), lsm0Var.a(R.string.daily_task_done_tag, Arrays.copyOf(new Object[0], 0)), true, true);
        }
        if (d3jVar instanceof x2j) {
            n85 n85Var = ((x2j) d3jVar).f40170a;
            String strK = wpm0.k(ctf0Var, n85Var.l);
            lsm0 lsm0Var2 = ctf0Var.b;
            String strA10 = lsm0Var2.a(R.string.daily_task_title, Arrays.copyOf(new Object[0], 0));
            String strA11 = lsm0Var2.a(R.string.daily_task_widget_task_available_title, Arrays.copyOf(new Object[0], 0));
            String strA12 = lsm0Var2.a(R.string.daily_task_widget_no_task_available_title, Arrays.copyOf(new Object[0], 0));
            sba0 sba0Var = n85Var.h;
            huo0 huo0Var = n85Var.k;
            String strL = dnm0.l(ctf0Var, sba0Var, huo0Var, n85Var.l);
            String strA13 = lsm0Var2.a(R.string.daily_task_widget_task_available_subtitle, Arrays.copyOf(new Object[0], 0));
            String strA14 = lsm0Var2.a(R.string.daily_task_widget_no_task_available, Arrays.copyOf(new Object[0], 0));
            String strA15 = lsm0Var2.a(R.string.daily_task_button_text_game, Arrays.copyOf(new Object[0], 0));
            String strA16 = lsm0Var2.a(R.string.daily_task_button_text_participate, Arrays.copyOf(new Object[0], 0));
            String strA17 = lsm0Var2.a(R.string.daily_task_widget_open_tasks, Arrays.copyOf(new Object[0], 0));
            StringBuilder sb3 = new StringBuilder(ujn.h);
            if (StringsKt.O("/static/img/android/casino/daily_challenge/widget/daily_default.webp", ujn.h, false) || kotlin.text.c.x("/static/img/android/casino/daily_challenge/widget/daily_default.webp", "https://", false)) {
                sb3.setLength(0);
                sb3.append("/static/img/android/casino/daily_challenge/widget/daily_default.webp");
            } else {
                if (sb3.length() <= 0 || StringsKt.S(sb3, Separators.SLASH)) {
                    c8 = '/';
                } else {
                    c8 = '/';
                    sb3.append('/');
                }
                sb3.append(StringsKt.y0("/static/img/android/casino/daily_challenge/widget/daily_default.webp", c8));
            }
            n0x n0xVar2 = new n0x(sb3.toString());
            StringBuilder sb4 = new StringBuilder(ujn.h);
            if (StringsKt.O("/static/img/android/casino/daily_challenge/widget/daily_calendar.webp", ujn.h, false) || kotlin.text.c.x("/static/img/android/casino/daily_challenge/widget/daily_calendar.webp", "https://", false)) {
                sb4.setLength(0);
                sb4.append("/static/img/android/casino/daily_challenge/widget/daily_calendar.webp");
            } else {
                if (sb4.length() <= 0 || StringsKt.S(sb4, Separators.SLASH)) {
                    c7 = '/';
                } else {
                    c7 = '/';
                    sb4.append('/');
                }
                sb4.append(StringsKt.y0("/static/img/android/casino/daily_challenge/widget/daily_calendar.webp", c7));
            }
            n0x n0xVar3 = new n0x(sb4.toString());
            String strA18 = lsm0Var2.a(R.string.daily_task_done_tag, Arrays.copyOf(new Object[0], 0));
            String strB0 = bfb.b0(huo0Var);
            String strZ = bfb.Z(huo0Var);
            int i = (int) n85Var.j;
            String strA0 = bfb.a0(huo0Var);
            ddk ddkVar = qll.f28939a;
            Integer numValueOf = Integer.valueOf(sba0Var.f31923a);
            ddkVar.getClass();
            qll qllVarQ = ddk.q(numValueOf);
            aet aetVar = huo0Var instanceof aet ? (aet) huo0Var : null;
            return new izh(null, strK, strA10, strA12, strA11, strL, strA13, strA14, strA15, strA16, strA17, n0xVar2, n0xVar3, strA18, strB0, strZ, i, strA0, qllVarQ, (aetVar == null || (mzb0VarA = aetVar.a()) == null) ? 0L : mzb0VarA.f22646a);
        }
        if (d3jVar instanceof y2j) {
            n85 n85Var2 = ((y2j) d3jVar).f41906a;
            String strK2 = wpm0.k(ctf0Var, n85Var2.l);
            lsm0 lsm0Var3 = ctf0Var.b;
            String strA19 = lsm0Var3.a(R.string.daily_task_title, Arrays.copyOf(new Object[0], 0));
            String strA20 = lsm0Var3.a(R.string.daily_task_widget_task_available_title, Arrays.copyOf(new Object[0], 0));
            String strA21 = lsm0Var3.a(R.string.daily_task_widget_no_task_available_title, Arrays.copyOf(new Object[0], 0));
            String strL2 = dnm0.l(ctf0Var, n85Var2.h, n85Var2.k, n85Var2.l);
            String strA22 = lsm0Var3.a(R.string.daily_task_widget_task_available_subtitle, Arrays.copyOf(new Object[0], 0));
            String strA23 = lsm0Var3.a(R.string.daily_task_widget_no_task_available, Arrays.copyOf(new Object[0], 0));
            String strA24 = lsm0Var3.a(R.string.daily_task_button_text_game, Arrays.copyOf(new Object[0], 0));
            String strA25 = lsm0Var3.a(R.string.daily_task_button_text_participate, Arrays.copyOf(new Object[0], 0));
            String strA26 = lsm0Var3.a(R.string.daily_task_widget_open_tasks, Arrays.copyOf(new Object[0], 0));
            StringBuilder sb5 = new StringBuilder(ujn.h);
            if (StringsKt.O("/static/img/android/casino/daily_challenge/widget/daily_default.webp", ujn.h, false) || kotlin.text.c.x("/static/img/android/casino/daily_challenge/widget/daily_default.webp", "https://", false)) {
                sb5.setLength(0);
                sb5.append("/static/img/android/casino/daily_challenge/widget/daily_default.webp");
            } else {
                if (sb5.length() <= 0 || StringsKt.S(sb5, Separators.SLASH)) {
                    c6 = '/';
                } else {
                    c6 = '/';
                    sb5.append('/');
                }
                sb5.append(StringsKt.y0("/static/img/android/casino/daily_challenge/widget/daily_default.webp", c6));
            }
            n0x n0xVar4 = new n0x(sb5.toString());
            StringBuilder sb6 = new StringBuilder(ujn.h);
            if (StringsKt.O("/static/img/android/casino/daily_challenge/widget/daily_calendar.webp", ujn.h, false) || kotlin.text.c.x("/static/img/android/casino/daily_challenge/widget/daily_calendar.webp", "https://", false)) {
                sb6.setLength(0);
                sb6.append("/static/img/android/casino/daily_challenge/widget/daily_calendar.webp");
            } else {
                if (sb6.length() <= 0 || StringsKt.S(sb6, Separators.SLASH)) {
                    c5 = '/';
                } else {
                    c5 = '/';
                    sb6.append('/');
                }
                sb6.append(StringsKt.y0("/static/img/android/casino/daily_challenge/widget/daily_calendar.webp", c5));
            }
            return new kzh(null, strK2, strA19, strA21, strA20, strL2, strA22, strA23, strA24, strA25, strA26, n0xVar4, new n0x(sb6.toString()), lsm0Var3.a(R.string.daily_task_done_tag, Arrays.copyOf(new Object[0], 0)), n85Var2.e);
        }
        if (!(d3jVar instanceof z2j)) {
            if (!(d3jVar instanceof c3j)) {
                if (d3jVar instanceof b3j) {
                    return null;
                }
                t9f.b();
                return null;
            }
            lsm0 lsm0Var4 = ctf0Var.b;
            String strA27 = lsm0Var4.a(R.string.daily_task_widget_no_task_available_title, Arrays.copyOf(new Object[0], 0));
            String strA28 = lsm0Var4.a(R.string.daily_task_widget_task_available_title, Arrays.copyOf(new Object[0], 0));
            String strA29 = lsm0Var4.a(R.string.daily_task_widget_no_task_available_title, Arrays.copyOf(new Object[0], 0));
            String strA30 = lsm0Var4.a(R.string.daily_task_widget_task_available_subtitle, Arrays.copyOf(new Object[0], 0));
            String strA31 = lsm0Var4.a(R.string.daily_task_widget_no_task_available, Arrays.copyOf(new Object[0], 0));
            String strA32 = lsm0Var4.a(R.string.daily_task_button_text_game, Arrays.copyOf(new Object[0], 0));
            String strA33 = lsm0Var4.a(R.string.daily_task_button_text_participate, Arrays.copyOf(new Object[0], 0));
            String strA34 = lsm0Var4.a(R.string.daily_task_widget_open_tasks, Arrays.copyOf(new Object[0], 0));
            StringBuilder sb7 = new StringBuilder(ujn.h);
            if (StringsKt.O("/static/img/android/casino/daily_challenge/widget/daily_default.webp", ujn.h, false) || kotlin.text.c.x("/static/img/android/casino/daily_challenge/widget/daily_default.webp", "https://", false)) {
                sb7.setLength(0);
                sb7.append("/static/img/android/casino/daily_challenge/widget/daily_default.webp");
            } else {
                if (sb7.length() <= 0 || StringsKt.S(sb7, Separators.SLASH)) {
                    c2 = '/';
                } else {
                    c2 = '/';
                    sb7.append('/');
                }
                sb7.append(StringsKt.y0("/static/img/android/casino/daily_challenge/widget/daily_default.webp", c2));
            }
            n0x n0xVar5 = new n0x(sb7.toString());
            StringBuilder sb8 = new StringBuilder(ujn.h);
            if (StringsKt.O("/static/img/android/casino/daily_challenge/widget/daily_calendar.webp", ujn.h, false) || kotlin.text.c.x("/static/img/android/casino/daily_challenge/widget/daily_calendar.webp", "https://", false)) {
                sb8.setLength(0);
                sb8.append("/static/img/android/casino/daily_challenge/widget/daily_calendar.webp");
            } else {
                if (sb8.length() <= 0 || StringsKt.S(sb8, Separators.SLASH)) {
                    c = '/';
                } else {
                    c = '/';
                    sb8.append('/');
                }
                sb8.append(StringsKt.y0("/static/img/android/casino/daily_challenge/widget/daily_calendar.webp", c));
            }
            return new lzh(null, strA27, strA29, strA28, strA30, strA31, strA32, strA33, strA34, n0xVar5, new n0x(sb8.toString()), lsm0Var4.a(R.string.daily_task_done_tag, Arrays.copyOf(new Object[0], 0)), false, false);
        }
        z6w z6wVar = ((z2j) d3jVar).f43671a;
        suo0 suo0Var = z6wVar.c;
        huo0 huo0Var2 = z6wVar.b;
        String strK3 = wpm0.k(ctf0Var, suo0Var);
        lsm0 lsm0Var5 = ctf0Var.b;
        String strA35 = lsm0Var5.a(R.string.daily_task_title, Arrays.copyOf(new Object[0], 0));
        String strA36 = lsm0Var5.a(R.string.daily_task_widget_task_available_title, Arrays.copyOf(new Object[0], 0));
        String strA37 = lsm0Var5.a(R.string.daily_task_widget_no_task_available_title, Arrays.copyOf(new Object[0], 0));
        suo0 suo0Var2 = z6wVar.c;
        if (suo0Var2 instanceof ouo0) {
            pn40 pn40Var = pn40.f27267a;
            ouo0 ouo0Var = (ouo0) suo0Var2;
            strA = lsm0Var5.a(R.string.daily_task_prize_description_bonus, Arrays.copyOf(new Object[]{"\u200e".concat(pn40.i(ouo0Var.f25886a, 2)), ouo0Var.b}, 2));
        } else if (suo0Var2 instanceof puo0) {
            pn40 pn40Var2 = pn40.f27267a;
            strA = lsm0Var5.a(R.string.daily_task_prize_description_frsp, Arrays.copyOf(new Object[]{"\u200e".concat(pn40.i(((puo0) suo0Var2).f27627a, 0))}, 1));
        } else {
            strA = "";
        }
        String str = strA;
        String strA38 = lsm0Var5.a(R.string.daily_task_widget_task_available_subtitle, Arrays.copyOf(new Object[0], 0));
        String strA39 = lsm0Var5.a(R.string.daily_task_widget_no_task_available, Arrays.copyOf(new Object[0], 0));
        String strA40 = lsm0Var5.a(R.string.daily_task_button_text_game, Arrays.copyOf(new Object[0], 0));
        String strA41 = lsm0Var5.a(R.string.daily_task_button_text_participate, Arrays.copyOf(new Object[0], 0));
        String strA42 = lsm0Var5.a(R.string.daily_task_widget_open_tasks, Arrays.copyOf(new Object[0], 0));
        StringBuilder sb9 = new StringBuilder(ujn.h);
        if (StringsKt.O("/static/img/android/casino/daily_challenge/widget/daily_default.webp", ujn.h, false) || kotlin.text.c.x("/static/img/android/casino/daily_challenge/widget/daily_default.webp", "https://", false)) {
            sb9.setLength(0);
            sb9.append("/static/img/android/casino/daily_challenge/widget/daily_default.webp");
        } else {
            if (sb9.length() <= 0 || StringsKt.S(sb9, Separators.SLASH)) {
                c4 = '/';
            } else {
                c4 = '/';
                sb9.append('/');
            }
            sb9.append(StringsKt.y0("/static/img/android/casino/daily_challenge/widget/daily_default.webp", c4));
        }
        n0x n0xVar6 = new n0x(sb9.toString());
        StringBuilder sb10 = new StringBuilder(ujn.h);
        if (StringsKt.O("/static/img/android/casino/daily_challenge/widget/daily_calendar.webp", ujn.h, false) || kotlin.text.c.x("/static/img/android/casino/daily_challenge/widget/daily_calendar.webp", "https://", false)) {
            sb10.setLength(0);
            sb10.append("/static/img/android/casino/daily_challenge/widget/daily_calendar.webp");
        } else {
            if (sb10.length() <= 0 || StringsKt.S(sb10, Separators.SLASH)) {
                c3 = '/';
            } else {
                c3 = '/';
                sb10.append('/');
            }
            sb10.append(StringsKt.y0("/static/img/android/casino/daily_challenge/widget/daily_calendar.webp", c3));
        }
        return new jzh(null, strK3, strA35, strA37, strA36, str, strA38, strA39, strA40, strA41, strA42, n0xVar6, new n0x(sb10.toString()), lsm0Var5.a(R.string.daily_task_done_tag, Arrays.copyOf(new Object[0], 0)), bfb.b0(huo0Var2), bfb.Z(huo0Var2), (int) z6wVar.j, bfb.a0(huo0Var2));
    }

    public static final lnm N(b9a0 b9a0Var) {
        b9a0Var.getClass();
        String str = b9a0Var.f2199a;
        String str2 = b9a0Var.b;
        int i = b9a0Var.c;
        String str3 = b9a0Var.d;
        bre breVar = b9a0Var.e;
        breVar.getClass();
        return new lnm(str, str2, i, str3, new s0m(breVar.f3077a, breVar.b), b9a0Var.f);
    }

    public static final int O(w310 w310Var, long j) {
        if (w310Var.f38477a == j) {
            int iOrdinal = w310Var.b.ordinal();
            if (iOrdinal == 0) {
                return R.drawable.ic_lol_void_map;
            }
            if (iOrdinal == 1) {
                switch (w310Var.c.ordinal()) {
                    case 0:
                        return R.drawable.ic_lol_dragon_chemtech;
                    case 1:
                        return R.drawable.ic_lol_dragon_infernal;
                    case 2:
                        return R.drawable.ic_lol_dragon_mountain;
                    case 3:
                        return R.drawable.ic_lol_dragon_ocean;
                    case 4:
                        return R.drawable.ic_lol_dragon_cloud;
                    case 5:
                        return R.drawable.ic_lol_dragon_hextech;
                    case 6:
                        return R.drawable.ic_lol_elder_dragon_statistic;
                    default:
                        t9f.b();
                    case 7:
                        return 0;
                }
            } else {
                if (iOrdinal == 2) {
                    return R.drawable.ic_lol_gerald;
                }
                if (iOrdinal == 3) {
                    return R.drawable.ic_lol_baron;
                }
            }
        }
        return 0;
    }

    public static final String P(w310 w310Var, long j, ctf0 ctf0Var) {
        if (w310Var.f38477a != j) {
            return "";
        }
        int iOrdinal = w310Var.b.ordinal();
        if (iOrdinal == 0) {
            return ctf0Var.b.a(R.string.lol_event_type_horde, Arrays.copyOf(new Object[0], 0));
        }
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                return iOrdinal != 3 ? "" : ctf0Var.b.a(R.string.lol_event_type_baron_nashor, Arrays.copyOf(new Object[0], 0));
            }
            return ctf0Var.b.a(R.string.lol_event_type_rift_heralt, Arrays.copyOf(new Object[0], 0));
        }
        switch (w310Var.c.ordinal()) {
            case 0:
                return ctf0Var.b.a(R.string.lol_event_type_chemtech_drake, Arrays.copyOf(new Object[0], 0));
            case 1:
                return ctf0Var.b.a(R.string.lol_event_type_infernal_drake, Arrays.copyOf(new Object[0], 0));
            case 2:
                return ctf0Var.b.a(R.string.lol_event_type_mountain_drake, Arrays.copyOf(new Object[0], 0));
            case 3:
                return ctf0Var.b.a(R.string.lol_event_type_ocean_drake, Arrays.copyOf(new Object[0], 0));
            case 4:
                return ctf0Var.b.a(R.string.lol_event_type_cloud_drake, Arrays.copyOf(new Object[0], 0));
            case 5:
                return ctf0Var.b.a(R.string.lol_event_type_hextech_drake, Arrays.copyOf(new Object[0], 0));
            case 6:
                return ctf0Var.b.a(R.string.lol_event_type_elder_dragon, Arrays.copyOf(new Object[0], 0));
            case 7:
                return "";
            default:
                t9f.b();
                return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:109:0x0280 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:110:0x0282  */
    /* JADX WARN: Code duplicated, block: B:111:0x0286  */
    /* JADX WARN: Code duplicated, block: B:112:0x028a  */
    /* JADX WARN: Code duplicated, block: B:114:0x0290  */
    /* JADX WARN: Code duplicated, block: B:115:0x0294  */
    /* JADX WARN: Code duplicated, block: B:119:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:121:0x02a8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:123:0x02ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:124:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:128:0x02be  */
    /* JADX WARN: Code duplicated, block: B:130:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:159:0x0319 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:160:0x031b  */
    /* JADX WARN: Code duplicated, block: B:161:0x031e  */
    /* JADX WARN: Code duplicated, block: B:240:0x059c  */
    /* JADX WARN: Code duplicated, block: B:242:0x059f  */
    /* JADX WARN: Code duplicated, block: B:353:0x0a29  */
    /* JADX WARN: Code duplicated, block: B:354:0x0a2c  */
    /* JADX WARN: Code duplicated, block: B:356:0x0a2f  */
    /* JADX WARN: Code duplicated, block: B:359:0x0a35  */
    /* JADX WARN: Code duplicated, block: B:362:0x0a62  */
    /* JADX WARN: Code duplicated, block: B:366:0x0a79  */
    /* JADX WARN: Code duplicated, block: B:368:0x0a81  */
    /* JADX WARN: Code duplicated, block: B:369:0x0a84  */
    /* JADX WARN: Code duplicated, block: B:371:0x0a87  */
    /* JADX WARN: Code duplicated, block: B:375:0x0a91  */
    /* JADX WARN: Code duplicated, block: B:378:0x0a9a  */
    /* JADX WARN: Code duplicated, block: B:379:0x0a9d  */
    /* JADX WARN: Code duplicated, block: B:382:0x0aa6  */
    /* JADX WARN: Code duplicated, block: B:383:0x0aa9  */
    /* JADX WARN: Code duplicated, block: B:386:0x0ab2  */
    /* JADX WARN: Code duplicated, block: B:387:0x0ab5  */
    /* JADX WARN: Code duplicated, block: B:389:0x0abd  */
    /* JADX WARN: Code duplicated, block: B:390:0x0ac0  */
    /* JADX WARN: Code duplicated, block: B:392:0x0ac4  */
    /* JADX WARN: Code duplicated, block: B:393:0x0acd  */
    /* JADX WARN: Code duplicated, block: B:395:0x0ad0  */
    /* JADX WARN: Code duplicated, block: B:396:0x0ad2  */
    /* JADX WARN: Code duplicated, block: B:399:0x0ae4  */
    /* JADX WARN: Code duplicated, block: B:400:0x0ae7  */
    /* JADX WARN: Code duplicated, block: B:403:0x0af1  */
    /* JADX WARN: Code duplicated, block: B:404:0x0af3  */
    /* JADX WARN: Code duplicated, block: B:406:0x0af7  */
    /* JADX WARN: Code duplicated, block: B:410:0x0b19  */
    /* JADX WARN: Code duplicated, block: B:422:0x0b5b  */
    /* JADX WARN: Code duplicated, block: B:423:0x0b5e  */
    /* JADX WARN: Code duplicated, block: B:425:0x0b61  */
    /* JADX WARN: Code duplicated, block: B:428:0x0b66  */
    /* JADX WARN: Code duplicated, block: B:431:0x0b8f  */
    /* JADX WARN: Code duplicated, block: B:435:0x0ba6  */
    /* JADX WARN: Code duplicated, block: B:437:0x0bae  */
    /* JADX WARN: Code duplicated, block: B:438:0x0bb1  */
    /* JADX WARN: Code duplicated, block: B:441:0x0bbc  */
    /* JADX WARN: Code duplicated, block: B:442:0x0bbf  */
    /* JADX WARN: Code duplicated, block: B:445:0x0bcc  */
    /* JADX WARN: Code duplicated, block: B:446:0x0bcf  */
    /* JADX WARN: Code duplicated, block: B:449:0x0bd6  */
    /* JADX WARN: Code duplicated, block: B:450:0x0bd9  */
    /* JADX WARN: Code duplicated, block: B:452:0x0bdd  */
    /* JADX WARN: Code duplicated, block: B:453:0x0be0  */
    /* JADX WARN: Code duplicated, block: B:638:0x0af9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x01c4  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r17v6 java.lang.Object, still in use, count: 2, list:
          (r17v6 java.lang.Object) from 0x0a23: PHI (r17 I:??) = (r17v3 java.lang.Object), (r17v6 java.lang.Object) binds: [B:350:0x0a21, B:635:0x0a23] A[DONT_GENERATE, DONT_INLINE]
          (r17v6 java.lang.Object) from 0x0a15: CHECK_CAST (a.cmr) (r17v6 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public static final a.b0s Q(a.d0t r63, a.ctf0 r64, a.y78 r65, boolean r66, boolean r67, java.lang.String r68, java.util.ArrayList r69, boolean r70, boolean r71, java.lang.String r72) {
        /*
            Method dump skipped, instruction units count: 4486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.fxb.Q(a.d0t, a.ctf0, a.y78, boolean, boolean, java.lang.String, java.util.ArrayList, boolean, boolean, java.lang.String):a.b0s");
    }

    public static final tym R(d0t d0tVar, ctf0 ctf0Var) {
        d0tVar.getClass();
        ctf0Var.getClass();
        boolean z = false;
        String strA = ctf0Var.b.a(R.string.tennis_game_column, Arrays.copyOf(new Object[0], 0));
        rqs rqsVar = d0tVar.p;
        kts ktsVar = rqsVar.h;
        String str = ktsVar.f18881a;
        String str2 = ktsVar.b;
        if (str.length() > 0 && str2.length() > 0) {
            z = true;
        }
        kts ktsVar2 = rqsVar.h;
        boolean z2 = ktsVar2.c;
        boolean z3 = ktsVar2.d;
        if (!z) {
            return null;
        }
        long j = d0tVar.v;
        if (j == 4 || j == 21 || j == ixg.d.b || j == 282) {
            return new tym(strA, str, str2, z2, z3);
        }
        return null;
    }

    public static final tym S(d0t d0tVar) {
        Object next;
        tf90 tf90Var;
        tf90 tf90Var2;
        d0tVar.getClass();
        rqs rqsVar = d0tVar.p;
        if (rqsVar.d.isEmpty()) {
            List listI0 = StringsKt.i0(rqsVar.i, new char[]{','}, 6);
            String strValueOf = String.valueOf(listI0.size());
            String str = (String) CollectionsKt.f0(listI0);
            List listI1 = str != null ? StringsKt.i0(str, new char[]{'-'}, 6) : null;
            String str2 = listI1 != null ? (String) CollectionsKt.firstOrNull(listI1) : null;
            String str3 = str2 == null ? "" : str2;
            String str4 = listI1 != null ? (String) CollectionsKt.f0(listI1) : null;
            String str5 = str4 == null ? "" : str4;
            boolean z = rqsVar.r;
            boolean z2 = rqsVar.s;
            if (str3.length() > 0 && str5.length() > 0) {
                return new tym(strValueOf, str3, str5, z, z2);
            }
        } else {
            int i = rqsVar.b;
            Iterator it = rqsVar.d.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((df90) next).f5989a != i);
            df90 df90Var = (df90) next;
            String strValueOf2 = df90Var != null ? String.valueOf(df90Var.f5989a) : null;
            String str6 = strValueOf2 == null ? "" : strValueOf2;
            String strValueOf3 = (df90Var == null || (tf90Var2 = df90Var.b) == null) ? null : String.valueOf(tf90Var2.b);
            String str7 = strValueOf3 == null ? "" : strValueOf3;
            String strValueOf4 = (df90Var == null || (tf90Var = df90Var.b) == null) ? null : String.valueOf(tf90Var.c);
            String str8 = strValueOf4 == null ? "" : strValueOf4;
            boolean z3 = rqsVar.r;
            boolean z4 = rqsVar.s;
            if (str7.length() > 0 && str8.length() > 0) {
                return new tym(str6, str7, str8, z3, z4);
            }
        }
        return null;
    }

    public static final tym T(d0t d0tVar, ctf0 ctf0Var) {
        d0tVar.getClass();
        ctf0Var.getClass();
        String strA = ctf0Var.b.a(R.string.total_tennis_column, Arrays.copyOf(new Object[0], 0));
        rqs rqsVar = d0tVar.p;
        return new tym(strA, kpb.R(d0tVar).f33307a, kpb.R(d0tVar).b, rqsVar.t, rqsVar.u);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0072  */
    public static final String U(d0t d0tVar, ctf0 ctf0Var) {
        d0tVar.getClass();
        ctf0Var.getClass();
        rqs rqsVar = d0tVar.p;
        String str = rqsVar.f30947a;
        String strA = rqsVar.m;
        boolean z = d0tVar.C;
        String str2 = d0tVar.y.c;
        if (d0tVar.h) {
            strA = ctf0Var.b.a(R.string.game_end, Arrays.copyOf(new Object[0], 0));
        } else if (kpb.j0(d0tVar)) {
            if (strA.length() == 0) {
                strA = str2;
            }
        } else if (str.length() > 0) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            lsm0 lsm0Var = ctf0Var.b;
            strA = lsm0Var.a(R.string.set_live_v2, Arrays.copyOf(new Object[]{lowerCase}, 1));
            if (str2.length() > 0) {
                strA = lsm0Var.a(R.string.placeholder_variant_0, Arrays.copyOf(new Object[]{str2, strA}, 2));
            }
        } else if (str2.length() > 0) {
            strA = str2;
        } else if (!z || strA.length() <= 0) {
            strA = "";
        }
        return (strA.length() == 0 && z && str2.length() > 0 && d0tVar.v == 21) ? str2 : strA;
    }

    public static final void a(mm40 mm40Var, uum uumVar, uum uumVar2, a2m a2mVar, boolean z, fet fetVar, int i) {
        mm40 mm40Var2;
        fetVar.g0(1723732515);
        int i2 = i | (fetVar.g(uumVar) ? 32 : 16) | (fetVar.g(uumVar2) ? 256 : 128) | (fetVar.g(a2mVar) ? 2048 : 1024) | (fetVar.h(z) ? 16384 : 8192);
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            zcl zclVar = qmk.f28987a;
            mm40Var2 = mm40Var;
            mm40 mm40VarL = s5x0.L(o7k0.e(mm40Var2, 72.0f), 4.0f, 0.0f, 2);
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.k, fetVar, 48);
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
            int i3 = uumVar.c;
            int i4 = uumVar.d;
            jm40 jm40Var = jm40.b;
            cl5 cl5Var = ukd.f35823a;
            if (i3 > 0) {
                fetVar.e0(464942279);
                boolean zE = fetVar.e(i3) | fetVar.e(i4);
                Object objP = fetVar.P();
                if (zE || objP == cl5Var) {
                    objP = new j2m(i3, i4);
                    fetVar.o0(objP);
                }
                i2m.b(o2e.e0(jm40Var, "FIRST_DS_CUSTOM_VERTICAL_INDICATOR"), (j2m) objP, fetVar, 6);
                fetVar.r(false);
            } else {
                fetVar.e0(465430467);
                fetVar.r(false);
            }
            obb.q(null, a2mVar, z, fetVar, (i2 >> 6) & 1008, 1);
            int i5 = uumVar2.c;
            int i6 = uumVar2.d;
            if (i5 > 0) {
                fetVar.e0(465561442);
                boolean zE2 = fetVar.e(i5) | fetVar.e(i6);
                Object objP2 = fetVar.P();
                if (zE2 || objP2 == cl5Var) {
                    objP2 = new j2m(i5, i6);
                    fetVar.o0(objP2);
                }
                i2m.b(o2e.e0(jm40Var, "SECOND_DS_CUSTOM_VERTICAL_INDICATOR"), (j2m) objP2, fetVar, 6);
                fetVar.r(false);
            } else {
                fetVar.e0(466054435);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            mm40Var2 = mm40Var;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new tvm(mm40Var2, uumVar, uumVar2, a2mVar, z, i);
        }
    }

    public static final qoj0 b() {
        return roj0.a(0, 1, i99.b);
    }

    public static final void c(mm40 mm40Var, boolean z, f3d f3dVar, j73 j73Var, qkq qkqVar, float f, ugd ugdVar, xdr xdrVar, xdr xdrVar2, fet fetVar, int i) {
        ugd ugdVar2;
        j73 j73Var2;
        qkq qkqVar2;
        int i2;
        qkq qkqVar3;
        j73 j73Var3;
        boolean z2;
        fetVar.g0(-28692530);
        int i3 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(f3dVar) ? 256 : 128) | 11264 | (fetVar.d(f) ? 131072 : 65536);
        if (fetVar.U(i3 & 1, (38347923 & i3) != 38347922)) {
            fetVar.Z();
            if ((i & 1) == 0 || fetVar.B()) {
                nul0 nul0VarG0 = ro4.g0(0.0f, 280.0f, null, 5);
                uek0 uek0VarJ0 = dyb.j0(f3dVar, nul0VarG0, fetVar, (i3 >> 6) & 126);
                i2 = i3 & (-57345);
                qkqVar3 = uek0VarJ0;
                j73Var3 = nul0VarG0;
            } else {
                fetVar.X();
                i2 = i3 & (-57345);
                j73Var3 = j73Var;
                qkqVar3 = qkqVar;
            }
            fetVar.s();
            pz40 pz40VarA0 = v3c.a0(0, new Object[0], fetVar, 6);
            pz40 pz40VarA1 = v3c.a0(0, new Object[0], fetVar, 6);
            mm40 mm40VarA = fbh0.a(o7k0.d(lgb.K(mm40Var), 1.0f), f3dVar.e, ma80.f21447a, false, qkqVar3, 44);
            boolean zG = ((((i2 & 896) ^ 384) > 256 && fetVar.g(f3dVar)) || (i2 & 384) == 256) | ((i2 & 458752) == 131072) | fetVar.g(pz40VarA1) | fetVar.g(pz40VarA0);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                Object i2dVar = new i2d(f, f3dVar, pz40VarA1, pz40VarA0, z);
                fetVar.o0(i2dVar);
                objP = i2dVar;
            }
            tj30 tj30Var = (tj30) objP;
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
            jpm0.o(fetVar, tj30Var, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            jm40 jm40Var = jm40.b;
            if (xdrVar == null) {
                fetVar.e0(-1318465517);
                z2 = false;
            } else {
                z2 = false;
                fetVar.e0(-319625810);
                xdrVar.F(mrv.k0(jm40Var, "BACKGROUND_KEY"), fetVar, 54);
            }
            fetVar.r(z2);
            ugdVar2 = ugdVar;
            ugdVar2.F(mrv.k0(jm40Var, "TOOLBAR_KEY"), fetVar, 54);
            if (xdrVar2 == null) {
                fetVar.e0(-1318335348);
            } else {
                fetVar.e0(-319621611);
                xdrVar2.F(mrv.k0(jm40Var, "COLLAPSING_HEADER_KEY"), fetVar, 54);
            }
            fetVar.r(z2);
            fetVar.r(true);
            j73Var2 = j73Var3;
            qkqVar2 = qkqVar3;
        } else {
            ugdVar2 = ugdVar;
            fetVar.X();
            j73Var2 = j73Var;
            qkqVar2 = qkqVar;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new h2d(mm40Var, z, f3dVar, j73Var2, qkqVar2, f, ugdVar2, xdrVar, xdrVar2, i);
        }
    }

    public static final void d(mm40 mm40Var, String str, String str2, Function2 function2, Function2 function3, fet fetVar, int i) {
        fet fetVar2;
        mm40 mm40Var2;
        str.getClass();
        str2.getClass();
        fetVar.g0(1773009612);
        int i2 = i | 6 | (fetVar.g(str) ? 32 : 16) | (fetVar.g(str2) ? 256 : 128) | (fetVar.i(function2) ? 2048 : 1024) | (fetVar.i(function3) ? 16384 : 8192);
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarL = s5x0.L(jm40Var, 4.0f, 0.0f, 2);
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.k, fetVar, 48);
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
            jpm0.o(fetVar, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            if (function2 == null) {
                fetVar.e0(149114001);
                fetVar.r(false);
            } else {
                fetVar.e0(-1103568528);
                h97.q((i2 >> 9) & 14, fetVar, function2, false);
            }
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar, 48);
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
            StaticColors staticColors = StaticColors.INSTANCE;
            mm40Var2 = jm40Var;
            v8q0.a(str, null, staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.g(), fetVar, (i2 >> 3) & 14, 0, 131066);
            v8q0.a(str2, null, staticColors.m131getWhite800d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.h(), fetVar, (i2 >> 6) & 14, 0, 131066);
            fetVar2 = fetVar;
            fetVar2.r(true);
            if (function3 == null) {
                fetVar2.e0(149606033);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-1103552656);
                h97.q((i2 >> 12) & 14, fetVar2, function3, false);
            }
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new jdd(mm40Var2, str, str2, function2, function3, i, (byte) 0);
        }
    }

    public static final void e(r7m r7mVar, Function0 function0, fet fetVar, int i) {
        int i2;
        fetVar.g0(-1900614780);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? fetVar.g(r7mVar) : fetVar.i(r7mVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(function0) ? 32 : 16;
        }
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarW = y860.W(o7k0.e(o7k0.s(jm40Var, 40.0f), 32.0f), null, null, false, null, function0, 28);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarW);
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
            r2x r2xVarT = jpm0.t(R.drawable.ic_glyph_chevron_right_small, 6, fetVar);
            mm40 mm40VarE = o7k0.e(o7k0.s(jm40Var, 24.0f), 18.0f);
            long j = r7mVar.b;
            zcl zclVar2 = qmk.m;
            ugg0 ugg0Var = vgg0.f37379a;
            dww.b(r2xVarT, null, s5x0.J(i120.Q(mm40VarE, j, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 1.0f), r7mVar.c, fetVar, 48, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new u7m(r7mVar, function0, i, b);
        }
    }

    public static final void f(foh fohVar, Function1 function1, Function1 function2, fet fetVar, int i) {
        function1.getClass();
        function2.getClass();
        fetVar.g0(-1623793343);
        jm40 jm40Var = jm40.b;
        int i2 = (fetVar.g(jm40Var) ? 4 : 2) | i | (fetVar.g(fohVar) ? 32 : 16);
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function2) ? 2048 : 1024;
        }
        if (!fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            fetVar.X();
        } else if (fohVar instanceof doh) {
            fetVar.e0(-210536210);
            q7x.a(jm40Var, (doh) fohVar, function1, fetVar, i2 & 1022);
            fetVar.r(false);
        } else {
            if (!(fohVar instanceof eoh)) {
                throw b1j.f(-1392266530, fetVar, false);
            }
            fetVar.e0(-210298471);
            eoh eohVar = (eoh) fohVar;
            if (eohVar.f.size() >= 5) {
                fetVar.e0(-210230550);
                b5x.d(eohVar, function2, fetVar, ((i2 >> 3) & 896) | (i2 & 126));
                fetVar.r(false);
            } else {
                fetVar.e0(-210023935);
                fetVar.r(false);
            }
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new r93(fohVar, function1, function2, i);
        }
    }

    public static final void g(mm40 mm40Var, qdz qdzVar, dqk dqkVar, Function0 function0, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        qdzVar.getClass();
        dqkVar.getClass();
        function0.getClass();
        function1.getClass();
        fetVar2.g0(-1938603084);
        int i2 = i | 6 | (fetVar2.g(qdzVar) ? 32 : 16) | (fetVar2.g(dqkVar) ? 256 : 128) | (fetVar2.i(function0) ? 2048 : 1024) | (fetVar2.i(function1) ? 16384 : 8192);
        if (fetVar2.U(i2 & 1, (i2 & 9363) != 9362)) {
            int i3 = i2 << 3;
            xcz xczVarB = qdzVar.b(dqkVar.f6520a, new svj((byte) 15), fetVar2, i3 & 896);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 144.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE2 = h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE);
            zfn zfnVar = zaq0.b;
            mm40 mm40VarQ = i120.Q(mm40VarE2, ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent(), jd8.n);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
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
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            d5c.k(s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), dqkVar.b, xczVarB, ((ThemeColors) fetVar2.k(zfnVar)).getSecondary10(), function1, fetVar2, i3 & 458752, 0);
            e3c.b(null, dqkVar.c, function0, fetVar, (i2 >> 3) & 896, 1);
            fetVar2 = fetVar;
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cqk(mm40Var2, (Object) qdzVar, (Object) dqkVar, (Object) function0, (Object) function1, i, (byte) 0);
        }
    }

    public static final void h(lal lalVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(-1988989657);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(lalVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(jm40.b, 0.0f, 4.0f, 0.0f, 0.0f, 13);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = new n2l((byte) 5);
                fetVar.o0(objP);
            }
            Function1 function1 = (Function1) objP;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new n2l((byte) 6);
                fetVar.o0(objP2);
            }
            Function1 function2 = (Function1) objP2;
            Object objP3 = fetVar.P();
            if (objP3 == cl5Var) {
                objP3 = new n2l((byte) 7);
                fetVar.o0(objP3);
            }
            Function1 function3 = (Function1) objP3;
            boolean z = (i2 & 14) == 4;
            Object objP4 = fetVar.P();
            if (z || objP4 == cl5Var) {
                objP4 = new e3j(lalVar, (byte) 27);
                fetVar.o0(objP4);
            }
            dwi0.c(function1, mm40VarN, function2, function3, (Function1) objP4, fetVar, 3462, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o2l(lalVar, i, (byte) 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0115  */
    /* JADX WARN: Code duplicated, block: B:106:0x015d  */
    /* JADX WARN: Code duplicated, block: B:107:0x0160  */
    /* JADX WARN: Code duplicated, block: B:111:0x016b  */
    /* JADX WARN: Code duplicated, block: B:113:0x0177  */
    /* JADX WARN: Code duplicated, block: B:117:0x0188  */
    /* JADX WARN: Code duplicated, block: B:123:0x019a  */
    /* JADX WARN: Code duplicated, block: B:125:0x020b  */
    /* JADX WARN: Code duplicated, block: B:128:0x021a  */
    /* JADX WARN: Code duplicated, block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0058  */
    /* JADX WARN: Code duplicated, block: B:34:0x005b  */
    /* JADX WARN: Code duplicated, block: B:36:0x005f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x0061  */
    /* JADX WARN: Code duplicated, block: B:38:0x0063  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0070  */
    /* JADX WARN: Code duplicated, block: B:46:0x0077  */
    /* JADX WARN: Code duplicated, block: B:47:0x007a  */
    /* JADX WARN: Code duplicated, block: B:49:0x007e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x0081  */
    /* JADX WARN: Code duplicated, block: B:54:0x008b  */
    /* JADX WARN: Code duplicated, block: B:55:0x008e  */
    /* JADX WARN: Code duplicated, block: B:59:0x0096  */
    /* JADX WARN: Code duplicated, block: B:61:0x009a  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:73:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:78:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:82:0x00db  */
    /* JADX WARN: Code duplicated, block: B:91:0x00fd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:93:0x0102  */
    /* JADX WARN: Code duplicated, block: B:95:0x0105  */
    /* JADX WARN: Code duplicated, block: B:96:0x0108  */
    /* JADX WARN: Code duplicated, block: B:98:0x010c  */
    /* JADX WARN: Code duplicated, block: B:99:0x010f  */
    public static final void i(long j, qol qolVar, mm40 mm40Var, tol tolVar, sol solVar, iol iolVar, Function0 function0, fet fetVar, int i, int i2) {
        int i3;
        mm40 mm40Var2;
        int i4;
        int iOrdinal;
        int i5;
        int i6;
        int i7;
        iol iolVar2;
        Function0 function1;
        boolean z;
        tol tolVar2;
        mm40 mm40Var3;
        iol iolVar3;
        sol solVar2;
        yfe0 yfe0VarU;
        mm40 mm40Var4;
        tol tolVar3;
        sol solVar3;
        int i8;
        mm40 mm40Var5;
        iol iolVar4;
        int i9;
        boolean z2;
        Object objP;
        long jCurrentTimeMillis;
        long jLongValue;
        boolean zF;
        Object objP2;
        long j2;
        int i10;
        fetVar.g0(19601521);
        if ((i & 6) == 0) {
            i3 = (fetVar.f(j) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? fetVar.g(qolVar) : fetVar.i(qolVar) ? 32 : 16;
        }
        int i11 = i2 & 4;
        if (i11 == 0) {
            if ((i & 384) == 0) {
                mm40Var2 = mm40Var;
                i3 |= fetVar.g(mm40Var2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                if (tolVar == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = tolVar.ordinal();
                }
                if (fetVar.e(iOrdinal)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                if (fetVar.e(solVar != null ? solVar.ordinal() : -1)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    iolVar2 = iolVar;
                    int i12 = fetVar.g(iolVar2) ? 131072 : 65536;
                    i3 |= i12;
                } else {
                    iolVar2 = iolVar;
                }
                i3 |= i12;
            } else {
                iolVar2 = iolVar;
            }
            if ((1572864 & i) == 0) {
                function1 = function0;
                if (fetVar.i(function1)) {
                    i10 = 1048576;
                } else {
                    i10 = 524288;
                }
                i3 |= i10;
            } else {
                function1 = function0;
            }
            if ((599187 & i3) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar.U(i3 & 1, z)) {
                fetVar.Z();
                if ((i & 1) != 0 || fetVar.B()) {
                    if (i11 != 0) {
                        mm40Var4 = jm40.b;
                    } else {
                        mm40Var4 = mm40Var2;
                    }
                    if (i4 != 0) {
                        tolVar3 = tol.b;
                    } else {
                        tolVar3 = tolVar;
                    }
                    if (i6 != 0) {
                        solVar3 = sol.b;
                    } else {
                        solVar3 = solVar;
                    }
                    if ((i2 & 32) != 0) {
                        pz40 pz40Var = s6t0.f31722a;
                        i3 &= -458753;
                        iolVar2 = new iol(s6t0.b().f33626a.getTextPrimary(), s6t0.b().f33626a.getSecondary(), s6t0.b().f33626a.getTextPrimary(), dyb.h0(rol.f30844a, rol.b, rol.c, rol.d), jol.f16863a);
                    }
                    i8 = i3;
                    mm40Var5 = mm40Var4;
                    iolVar4 = iolVar2;
                } else {
                    fetVar.X();
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                    }
                    solVar3 = solVar;
                    i8 = i3;
                    mm40Var5 = mm40Var2;
                    iolVar4 = iolVar2;
                    tolVar3 = tolVar;
                }
                fetVar.s();
                i9 = i8 & 14;
                if (i9 == 4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objP = fetVar.P();
                cl5 cl5Var = ukd.f35823a;
                if (z2 || objP == cl5Var) {
                    jCurrentTimeMillis = j - System.currentTimeMillis();
                    if (jCurrentTimeMillis < 0) {
                        jCurrentTimeMillis = 0;
                    }
                    objP = Long.valueOf(jCurrentTimeMillis);
                    fetVar.o0(objP);
                }
                jLongValue = ((Number) objP).longValue();
                zF = fetVar.f(jLongValue) | (i9 == 4);
                objP2 = fetVar.P();
                if (!zF || objP2 == cl5Var) {
                    j2 = jLongValue;
                    objP2 = new vsg0(new boe(j2, function1, null, (byte) 1));
                    fetVar.o0(objP2);
                } else {
                    j2 = jLongValue;
                }
                Long lValueOf = Long.valueOf(j2);
                lkz lkzVar = lkz.f20223a;
                long jLongValue2 = ((Number) gkb.O((gmq) objP2, lValueOf, null, fetVar, 3072, 10).getValue()).longValue() / 1000;
                int i13 = i8 << 9;
                int i14 = ((i8 >> 6) & 14) | ((i8 << 12) & 458752) | (3670016 & i13) | (29360128 & i13) | (i13 & 234881024);
                tol tolVar4 = tolVar3;
                iol iolVar5 = iolVar4;
                sol solVar4 = solVar3;
                j(mm40Var5, (int) (jLongValue2 / 86400), (int) ((jLongValue2 % 86400) / 3600), (int) ((jLongValue2 % 3600) / 60), (int) (jLongValue2 % 60), qolVar, tolVar4, solVar4, iolVar5, fetVar, i14);
                mm40Var3 = mm40Var5;
                tolVar2 = tolVar4;
                solVar2 = solVar4;
                iolVar3 = iolVar5;
            } else {
                fetVar.X();
                tolVar2 = tolVar;
                mm40Var3 = mm40Var2;
                iolVar3 = iolVar2;
                solVar2 = solVar;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new ool(j, qolVar, mm40Var3, tolVar2, solVar2, iolVar3, function0, i, i2);
            }
        }
        i3 |= 384;
        mm40Var2 = mm40Var;
        i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            if (tolVar == null) {
                iOrdinal = -1;
            } else {
                iOrdinal = tolVar.ordinal();
            }
            if (fetVar.e(iOrdinal)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i3 |= i5;
        }
        i6 = i2 & 16;
        if (i6 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            if (fetVar.e(solVar != null ? solVar.ordinal() : -1)) {
                i7 = 16384;
            } else {
                i7 = 8192;
            }
            i3 |= i7;
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                iolVar2 = iolVar;
                if (fetVar.g(iolVar2)) {
                }
                i3 |= i12;
            } else {
                iolVar2 = iolVar;
            }
            i3 |= i12;
        } else {
            iolVar2 = iolVar;
        }
        if ((1572864 & i) == 0) {
            function1 = function0;
            if (fetVar.i(function1)) {
                i10 = 1048576;
            } else {
                i10 = 524288;
            }
            i3 |= i10;
        } else {
            function1 = function0;
        }
        if ((599187 & i3) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (fetVar.U(i3 & 1, z)) {
            fetVar.Z();
            if ((i & 1) != 0) {
                if (i11 != 0) {
                    mm40Var4 = jm40.b;
                } else {
                    mm40Var4 = mm40Var2;
                }
                if (i4 != 0) {
                    tolVar3 = tol.b;
                } else {
                    tolVar3 = tolVar;
                }
                if (i6 != 0) {
                    solVar3 = sol.b;
                } else {
                    solVar3 = solVar;
                }
                if ((i2 & 32) != 0) {
                    pz40 pz40Var2 = s6t0.f31722a;
                    i3 &= -458753;
                    iolVar2 = new iol(s6t0.b().f33626a.getTextPrimary(), s6t0.b().f33626a.getSecondary(), s6t0.b().f33626a.getTextPrimary(), dyb.h0(rol.f30844a, rol.b, rol.c, rol.d), jol.f16863a);
                }
                i8 = i3;
                mm40Var5 = mm40Var4;
                iolVar4 = iolVar2;
            } else {
                if (i11 != 0) {
                    mm40Var4 = jm40.b;
                } else {
                    mm40Var4 = mm40Var2;
                }
                if (i4 != 0) {
                    tolVar3 = tol.b;
                } else {
                    tolVar3 = tolVar;
                }
                if (i6 != 0) {
                    solVar3 = sol.b;
                } else {
                    solVar3 = solVar;
                }
                if ((i2 & 32) != 0) {
                    pz40 pz40Var3 = s6t0.f31722a;
                    i3 &= -458753;
                    iolVar2 = new iol(s6t0.b().f33626a.getTextPrimary(), s6t0.b().f33626a.getSecondary(), s6t0.b().f33626a.getTextPrimary(), dyb.h0(rol.f30844a, rol.b, rol.c, rol.d), jol.f16863a);
                }
                i8 = i3;
                mm40Var5 = mm40Var4;
                iolVar4 = iolVar2;
            }
            fetVar.s();
            i9 = i8 & 14;
            if (i9 == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            objP = fetVar.P();
            cl5 cl5Var2 = ukd.f35823a;
            if (z2) {
                jCurrentTimeMillis = j - System.currentTimeMillis();
                if (jCurrentTimeMillis < 0) {
                    jCurrentTimeMillis = 0;
                }
                objP = Long.valueOf(jCurrentTimeMillis);
                fetVar.o0(objP);
            } else {
                jCurrentTimeMillis = j - System.currentTimeMillis();
                if (jCurrentTimeMillis < 0) {
                    jCurrentTimeMillis = 0;
                }
                objP = Long.valueOf(jCurrentTimeMillis);
                fetVar.o0(objP);
            }
            jLongValue = ((Number) objP).longValue();
            zF = fetVar.f(jLongValue) | (i9 == 4);
            objP2 = fetVar.P();
            if (zF) {
                j2 = jLongValue;
                objP2 = new vsg0(new boe(j2, function1, null, (byte) 1));
                fetVar.o0(objP2);
            } else {
                j2 = jLongValue;
                objP2 = new vsg0(new boe(j2, function1, null, (byte) 1));
                fetVar.o0(objP2);
            }
            Long lValueOf2 = Long.valueOf(j2);
            lkz lkzVar2 = lkz.f20223a;
            long jLongValue3 = ((Number) gkb.O((gmq) objP2, lValueOf2, null, fetVar, 3072, 10).getValue()).longValue() / 1000;
            int i15 = i8 << 9;
            int i16 = ((i8 >> 6) & 14) | ((i8 << 12) & 458752) | (3670016 & i15) | (29360128 & i15) | (i15 & 234881024);
            tol tolVar5 = tolVar3;
            iol iolVar6 = iolVar4;
            sol solVar5 = solVar3;
            j(mm40Var5, (int) (jLongValue3 / 86400), (int) ((jLongValue3 % 86400) / 3600), (int) ((jLongValue3 % 3600) / 60), (int) (jLongValue3 % 60), qolVar, tolVar5, solVar5, iolVar6, fetVar, i16);
            mm40Var3 = mm40Var5;
            tolVar2 = tolVar5;
            solVar2 = solVar5;
            iolVar3 = iolVar6;
        } else {
            fetVar.X();
            tolVar2 = tolVar;
            mm40Var3 = mm40Var2;
            iolVar3 = iolVar2;
            solVar2 = solVar;
        }
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ool(j, qolVar, mm40Var3, tolVar2, solVar2, iolVar3, function0, i, i2);
        }
    }

    public static final void j(mm40 mm40Var, int i, int i2, int i3, int i4, qol qolVar, tol tolVar, sol solVar, iol iolVar, fet fetVar, int i5) {
        int iOrdinal = solVar.ordinal();
        if (iOrdinal == 0) {
            fetVar.e0(-1289021128);
            wwb.h(mm40Var, i, i2, i3, i4, qolVar, tolVar, iolVar, fetVar, (i5 & 4194302) | (29360128 & (i5 >> 3)));
            fetVar.r(false);
        } else {
            if (iOrdinal != 1) {
                throw b1j.f(789700687, fetVar, false);
            }
            fetVar.e0(-1288620422);
            dyb.o(mm40Var, i, i2, i3, i4, qolVar, tolVar, iolVar, fetVar, (i5 & 4194302) | (29360128 & (i5 >> 3)));
            fetVar.r(false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:85:0x0168  */
    /* JADX WARN: Code duplicated, block: B:88:0x0176  */
    /* JADX WARN: Code duplicated, block: B:90:? A[RETURN, SYNTHETIC] */
    public static final void k(Date date, qol qolVar, mm40 mm40Var, tol tolVar, iol iolVar, sol solVar, Function0 function0, fet fetVar, int i, int i2) {
        int i3;
        Function0 function1;
        boolean z;
        mm40 mm40Var2;
        Function0 function2;
        sol solVar2;
        yfe0 yfe0VarU;
        int i4;
        cl5 cl5Var;
        sol solVar3;
        Function0 function3;
        mm40 mm40Var3;
        Object objP;
        boolean zG;
        Object objP2;
        byte b;
        fetVar.g0(-852908069);
        if ((i & 6) == 0) {
            i3 = (fetVar.i(date) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? fetVar.g(qolVar) : fetVar.i(qolVar) ? 32 : 16;
        }
        int i5 = i3 | 384;
        if ((i & 3072) == 0) {
            i5 |= fetVar.e(tolVar.ordinal()) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i5 |= fetVar.g(iolVar) ? 16384 : 8192;
        }
        int i6 = i2 & 32;
        int i7 = 196608;
        if (i6 != 0) {
            i5 |= i7;
        } else if ((196608 & i) == 0) {
            i7 = fetVar.e(solVar == null ? -1 : solVar.ordinal()) ? 131072 : 65536;
            i5 |= i7;
        }
        int i8 = i2 & 64;
        if (i8 == 0) {
            if ((1572864 & i) == 0) {
                function1 = function0;
                i5 |= fetVar.i(function1) ? 1048576 : 524288;
            }
            if ((599187 & i5) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar.U(i5 & 1, z)) {
                fetVar.Z();
                i4 = i & 1;
                cl5Var = ukd.f35823a;
                if (i4 != 0 || fetVar.B()) {
                    if (i6 != 0) {
                        solVar3 = sol.b;
                    } else {
                        solVar3 = solVar;
                    }
                    jm40 jm40Var = jm40.b;
                    if (i8 != 0) {
                        objP = fetVar.P();
                        if (objP == cl5Var) {
                            objP = new knl((byte) 1);
                            fetVar.o0(objP);
                        }
                        function3 = (Function0) objP;
                    } else {
                        function3 = function1;
                    }
                    mm40Var3 = jm40Var;
                } else {
                    fetVar.X();
                    mm40Var3 = mm40Var;
                    solVar3 = solVar;
                    function3 = function1;
                }
                fetVar.s();
                zG = fetVar.g(date);
                objP2 = fetVar.P();
                b = 6;
                if (zG || objP2 == cl5Var) {
                    objP2 = new vsg0(new n1(date, function3, (yje) null, b));
                    fetVar.o0(objP2);
                }
                long jLongValue = ((Number) gkb.O((gmq) objP2, 0L, null, fetVar, 48, 14).getValue()).longValue() / 1000;
                int i9 = i5 << 12;
                int i10 = ((i5 << 6) & 29360128) | ((i5 >> 6) & 14) | (458752 & i9) | ((i5 << 9) & 3670016) | (234881024 & i9);
                mm40 mm40Var4 = mm40Var3;
                sol solVar4 = solVar3;
                j(mm40Var4, (int) (jLongValue / 86400), (int) ((jLongValue % 86400) / 3600), (int) ((jLongValue % 3600) / 60), (int) (jLongValue % 60), qolVar, tolVar, solVar4, iolVar, fetVar, i10);
                mm40Var2 = mm40Var4;
                solVar2 = solVar4;
                function2 = function3;
            } else {
                fetVar.X();
                mm40Var2 = mm40Var;
                function2 = function1;
                solVar2 = solVar;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new pol(date, qolVar, mm40Var2, tolVar, iolVar, solVar2, function2, i, i2);
            }
        }
        i5 |= 1572864;
        function1 = function0;
        if ((599187 & i5) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (fetVar.U(i5 & 1, z)) {
            fetVar.Z();
            i4 = i & 1;
            cl5Var = ukd.f35823a;
            if (i4 != 0) {
                if (i6 != 0) {
                    solVar3 = sol.b;
                } else {
                    solVar3 = solVar;
                }
                jm40 jm40Var2 = jm40.b;
                if (i8 != 0) {
                    objP = fetVar.P();
                    if (objP == cl5Var) {
                        objP = new knl((byte) 1);
                        fetVar.o0(objP);
                    }
                    function3 = (Function0) objP;
                } else {
                    function3 = function1;
                }
                mm40Var3 = jm40Var2;
            } else {
                if (i6 != 0) {
                    solVar3 = sol.b;
                } else {
                    solVar3 = solVar;
                }
                jm40 jm40Var3 = jm40.b;
                if (i8 != 0) {
                    objP = fetVar.P();
                    if (objP == cl5Var) {
                        objP = new knl((byte) 1);
                        fetVar.o0(objP);
                    }
                    function3 = (Function0) objP;
                } else {
                    function3 = function1;
                }
                mm40Var3 = jm40Var3;
            }
            fetVar.s();
            zG = fetVar.g(date);
            objP2 = fetVar.P();
            b = 6;
            if (zG) {
                objP2 = new vsg0(new n1(date, function3, (yje) null, b));
                fetVar.o0(objP2);
            } else {
                objP2 = new vsg0(new n1(date, function3, (yje) null, b));
                fetVar.o0(objP2);
            }
            long jLongValue2 = ((Number) gkb.O((gmq) objP2, 0L, null, fetVar, 48, 14).getValue()).longValue() / 1000;
            int i11 = i5 << 12;
            int i12 = ((i5 << 6) & 29360128) | ((i5 >> 6) & 14) | (458752 & i11) | ((i5 << 9) & 3670016) | (234881024 & i11);
            mm40 mm40Var5 = mm40Var3;
            sol solVar5 = solVar3;
            j(mm40Var5, (int) (jLongValue2 / 86400), (int) ((jLongValue2 % 86400) / 3600), (int) ((jLongValue2 % 3600) / 60), (int) (jLongValue2 % 60), qolVar, tolVar, solVar5, iolVar, fetVar, i12);
            mm40Var2 = mm40Var5;
            solVar2 = solVar5;
            function2 = function3;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
            function2 = function1;
            solVar2 = solVar;
        }
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new pol(date, qolVar, mm40Var2, tolVar, iolVar, solVar2, function2, i, i2);
        }
    }

    public static final void l(int i, fet fetVar, mm40 mm40Var, String str, String str2) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        str.getClass();
        str2.getClass();
        fetVar2.g0(-1160924669);
        int i2 = i | 6 | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(str2) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarL = s5x0.L(jm40Var, 16.0f, 0.0f, 2);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarL);
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
            zfn zfnVar = zaq0.b;
            long secondary = ((ThemeColors) fetVar2.k(zfnVar)).getSecondary();
            zfn zfnVar2 = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar2)).getClass();
            v8q0.a(str, null, secondary, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.n(), fetVar2, (i2 >> 3) & 14, 0, 131066);
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 4.0f, 0.0f, 0.0f, 13);
            long primary = ((ThemeColors) fetVar2.k(zfnVar)).getPrimary();
            ((g1t0) fetVar2.k(zfnVar2)).getClass();
            v8q0.a(str2, mm40VarN, primary, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.r(), fetVar2, (i2 >> 6) & 14, 0, 131064);
            fetVar2 = fetVar2;
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new g15(mm40Var2, str, str2, i, (byte) 20);
        }
    }

    public static final void m(mm40 mm40Var, x7m x7mVar, r7m r7mVar, float f, Function0 function0, Function0 function1, fet fetVar, int i) {
        int i2;
        x7mVar.getClass();
        r7mVar.getClass();
        function0.getClass();
        function1.getClass();
        fetVar.g0(-1498031449);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (fetVar.g(x7mVar) ? 32 : 16);
        if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? fetVar.g(r7mVar) : fetVar.i(r7mVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= fetVar.d(f) ? 2048 : 1024;
        }
        int i4 = i3 | (fetVar.i(function0) ? 16384 : 8192) | (fetVar.i(function1) ? 131072 : 65536);
        if (fetVar.U(i4 & 1, (74899 & i4) != 74898)) {
            mm40 mm40VarL = s5x0.L(mm40Var, f, 0.0f, 2);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarL, 40.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 54);
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
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            if (x7mVar instanceof v7m) {
                fetVar.e0(-829805183);
                c8m c8mVar = ((v7m) x7mVar).f36933a;
                t(c8mVar, r7mVar, function0, fetVar, (i4 & 896) | 6 | ((i4 >> 3) & 7168));
                if (c8mVar.b instanceof n7m) {
                    fetVar.e0(-829543264);
                    e(r7mVar, function1, fetVar, ((i4 >> 12) & 112) | ((i4 >> 6) & 14));
                    fetVar.r(false);
                } else {
                    fetVar.e0(-829367401);
                    fetVar.r(false);
                }
                fetVar.r(false);
            } else {
                if (!(x7mVar instanceof w7m)) {
                    throw b1j.f(-1966432500, fetVar, false);
                }
                fetVar.e0(-829299635);
                y(0, fetVar);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new s7m(mm40Var, x7mVar, r7mVar, f, function0, function1, i, (byte) 0);
        }
    }

    public static final void n(mm40 mm40Var, uum uumVar, uum uumVar2, a2m a2mVar, boolean z, fet fetVar, final int i) {
        int i2;
        boolean z2;
        final a2m a2mVar2;
        final uum uumVar3;
        final uum uumVar4;
        final mm40 mm40Var2;
        k6z k6zVar;
        fetVar.g0(-1433167266);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (fetVar.g(uumVar) ? 32 : 16) | (fetVar.g(uumVar2) ? 256 : 128) | (fetVar.g(a2mVar) ? 2048 : 1024) | (fetVar.h(z) ? 16384 : 8192);
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            if (z) {
                fetVar.e0(1410769989);
                k6zVar = (k6z) fetVar.k(bmd.n);
                fetVar.r(false);
            } else {
                fetVar.e0(1410770913);
                fetVar.r(false);
                k6zVar = k6z.f17794a;
            }
            l5d0 l5d0VarA = bmd.n.a(k6zVar);
            z2 = z;
            tvm tvmVar = new tvm(mm40Var, uumVar, uumVar2, a2mVar, z2);
            mm40Var2 = mm40Var;
            uumVar4 = uumVar;
            uumVar3 = uumVar2;
            a2mVar2 = a2mVar;
            obc.d(l5d0VarA, u1c.M(832093598, tvmVar, fetVar), fetVar, 56);
        } else {
            z2 = z;
            a2mVar2 = a2mVar;
            uumVar3 = uumVar2;
            uumVar4 = uumVar;
            mm40Var2 = mm40Var;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            final boolean z3 = z2;
            yfe0VarU.d = new Function2() { // from class: a.uvm
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    fxb.n(mm40Var2, uumVar4, uumVar3, a2mVar2, z3, (fet) obj, x8x.L(i | 1));
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void o(mm40 mm40Var, xzm xzmVar, xzm xzmVar2, a2m a2mVar, jwm jwmVar, jwm jwmVar2, jwm jwmVar3, boolean z, fet fetVar, int i) {
        int i2;
        k6z k6zVar;
        uso0 uso0Var = uso0.f36223a;
        fetVar.g0(-1730149876);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(xzmVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(xzmVar2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(a2mVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? fetVar.g(jwmVar) : fetVar.i(jwmVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= (262144 & i) == 0 ? fetVar.g(jwmVar2) : fetVar.i(jwmVar2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= (2097152 & i) == 0 ? fetVar.g(jwmVar3) : fetVar.i(jwmVar3) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= fetVar.h(z) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= fetVar.e(0) ? 67108864 : 33554432;
        }
        if (fetVar.U(i2 & 1, (38347923 & i2) != 38347922)) {
            if (z) {
                fetVar.e0(-521669069);
                k6zVar = (k6z) fetVar.k(bmd.n);
                fetVar.r(false);
            } else {
                fetVar.e0(-521668145);
                fetVar.r(false);
                k6zVar = k6z.f17794a;
            }
            obc.d(bmd.n.a(k6zVar), u1c.M(-62741172, new ntm(mm40Var, xzmVar, xzmVar2, a2mVar, z, jwmVar, jwmVar2, jwmVar3), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gw6(mm40Var, xzmVar, xzmVar2, a2mVar, jwmVar, jwmVar2, jwmVar3, z, i);
        }
    }

    public static final void p(mm40 mm40Var, y6q0 y6q0Var, Function1 function1, fet fetVar, int i) {
        int i2;
        Object obj = gfk0.f;
        function1.getClass();
        fetVar.g0(-1213930256);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(y6q0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        int i3 = i2;
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            boolean zH = fetVar.h(true);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zH || objP == cl5Var) {
                objP = Float.valueOf(1.0f);
                fetVar.o0(objP);
            }
            float fFloatValue = ((Number) objP).floatValue();
            boolean zG = fetVar.g(null);
            Object objP2 = fetVar.P();
            if (zG || objP2 == cl5Var) {
                objP2 = new bmy(0);
                fetVar.o0(objP2);
            }
            int i4 = ((bmy) objP2).f2857a;
            boolean zG2 = fetVar.g(null);
            Object objP3 = fetVar.P();
            if (zG2 || objP3 == cl5Var) {
                objP3 = false;
                fetVar.o0(objP3);
            }
            ((Boolean) objP3).booleanValue();
            boolean zG3 = fetVar.g(o6q0.f24750a);
            Object objP4 = fetVar.P();
            if (zG3 || objP4 == cl5Var) {
                objP4 = false;
                fetVar.o0(objP4);
            }
            Boolean bool = (Boolean) objP4;
            boolean zBooleanValue = bool.booleanValue();
            Object[] objArr = new Object[0];
            Object objP5 = fetVar.P();
            if (objP5 == cl5Var) {
                objP5 = new ndm((byte) 26);
                fetVar.o0(objP5);
            }
            pz40 pz40Var = (pz40) e9x.Q(objArr, (Function0) objP5, fetVar, 48);
            Boolean bool2 = (Boolean) pz40Var.getValue();
            bool2.booleanValue();
            Object[] objArrCopyOf = Arrays.copyOf(new Object[]{null, bool, bool2}, 3);
            boolean zE = fetVar.e(objArrCopyOf.length);
            int length = objArrCopyOf.length;
            int i5 = 0;
            while (i5 < length) {
                Object[] objArr2 = objArrCopyOf;
                zE |= fetVar.g(objArr2[i5]);
                i5++;
                objArrCopyOf = objArr2;
            }
            Object objP6 = fetVar.P();
            if (zE || objP6 == cl5Var) {
                fetVar.o0(obj);
            } else {
                obj = objP6;
            }
            vuu0 vuu0Var = (vuu0) obj;
            String str = y6q0Var.f42111a;
            String str2 = y6q0Var.d;
            String str3 = y6q0Var.e;
            boolean z = y6q0Var.c;
            boolean z2 = str2.length() == 0;
            long jO = jwb.O(y6q0Var.c, fetVar);
            zcl zclVar = qmk.f28987a;
            ugg0 ugg0VarA = vgg0.a(10.0f);
            lh80 lh80VarU = s5x0.u(0.0f, 12.0f, 0.0f, 12.0f, 5);
            a7n a7nVar = y6q0Var.f;
            lh80 lh80VarU2 = s5x0.u(8.0f, 0.0f, 12.0f, 0.0f, 10);
            Object objP7 = fetVar.P();
            if (objP7 == cl5Var) {
                objP7 = new aim((byte) 18);
                fetVar.o0(objP7);
            }
            h36.a(epv0.N(pai0.a(mm40Var, true, (Function1) objP7), fFloatValue), str, q7q0.f28265a, str2, str3, true, false, false, z, false, null, false, false, null, null, false, vuu0Var, z2, jO, null, ugg0VarA, i4, 0, null, 0.0f, 8.0f, 0.0f, lh80VarU, lh80VarU2, false, 0.0f, -1, a7nVar, null, function1, u1c.M(463951714, new elm(y6q0Var, (byte) 5), fetVar), u1c.M(-1272148315, new p2n((Object) y6q0Var, zBooleanValue, pz40Var, function1, (byte) 6), fetVar), u1c.M(-122316028, new mxm(y6q0Var, (byte) 21), fetVar), fetVar, 806879616, 48, 0, ((i3 << 9) & 458752) | 114819072, 1707663360, 9);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ikl((Object) mm40Var, (Object) y6q0Var, (Object) function1, i, (byte) 25);
        }
    }

    public static final void q(int i, fet fetVar, mm40 mm40Var, String str) {
        fet fetVar2;
        fetVar.g0(-466477529);
        int i2 = i | 6 | (fetVar.g(str) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            nw3 nw3Var = uc9.e;
            ugd ugdVarM = u1c.M(784296494, new vod(str, (byte) 2), fetVar);
            jm40 jm40Var = jm40.b;
            fetVar2 = fetVar;
            n4c.s(jm40Var, nw3Var, null, ugdVarM, null, fetVar2, 3126, 20);
            mm40Var = jm40Var;
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ndp(mm40Var, str, i, (byte) 5);
        }
    }

    public static final void r(mm40 mm40Var, py20 py20Var, l7m0 l7m0Var, int i, Function1 function1, ugd ugdVar, ugd ugdVar2, ugd ugdVar3, ugd ugdVar4, fet fetVar, int i2) {
        mm40 mm40Var2;
        ugd ugdVar5;
        ugd ugdVar6;
        ugd ugdVar7;
        float f;
        boolean z;
        Object obj;
        int i3;
        int i4;
        py20Var.getClass();
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(-1561862248);
        int i5 = i2 | (fetVar.e(py20Var.ordinal()) ? 32 : 16) | (fetVar.g(l7m0Var) ? 256 : 128) | (fetVar.e(i) ? 2048 : 1024) | (fetVar.i(function1) ? 16384 : 8192);
        if (fetVar.U(i5 & 1, (38347923 & i5) != 38347922)) {
            w6k w6kVar = (w6k) fetVar.k(bmd.h);
            WeakHashMap weakHashMap = djv0.w;
            int i6 = zcm0.i(fetVar).f.e().b;
            Object[] objArr = new Object[0];
            Object objP = fetVar.P();
            Object obj2 = ukd.f35823a;
            if (objP == obj2) {
                objP = new s9r((byte) 25);
                fetVar.o0(objP);
            }
            cgk0 cgk0Var = (cgk0) e9x.Q(objArr, (Function0) objP, fetVar, 48);
            if (cgk0Var.l() == 0) {
                cgk0Var.m(i6);
            }
            int iL = zcm0.i(fetVar).e.e().d;
            Object[] objArr2 = new Object[0];
            Object objP2 = fetVar.P();
            if (objP2 == obj2) {
                objP2 = new s9r((byte) 26);
                fetVar.o0(objP2);
            }
            cgk0 cgk0Var2 = (cgk0) e9x.Q(objArr2, (Function0) objP2, fetVar, 48);
            if (cgk0Var2.l() == 0) {
                cgk0Var2.m(iL);
            }
            if (iL <= 0) {
                iL = cgk0Var2.l();
            }
            zcl zclVar = qmk.f28987a;
            int iT = w6kVar.T(56.0f);
            int iT2 = w6kVar.T(360.0f);
            int iT3 = w6kVar.T(180.0f) + iL + iT;
            int iT4 = w6kVar.T(4.0f);
            int iT5 = w6kVar.T(640.0f);
            int iT6 = w6kVar.T(16.0f);
            Object[] objArr3 = new Object[0];
            Object objP3 = fetVar.P();
            byte b = 27;
            if (objP3 == obj2) {
                objP3 = new s9r(b);
                fetVar.o0(objP3);
            }
            cgk0 cgk0Var3 = (cgk0) e9x.Q(objArr3, (Function0) objP3, fetVar, 48);
            boolean zE = fetVar.e(cgk0Var.l()) | fetVar.e(iT3);
            Object objP4 = fetVar.P();
            if (zE || objP4 == obj2) {
                int iL2 = (cgk0Var3.l() - cgk0Var.l()) - iT;
                if (iL2 < iT3) {
                    iL2 = iT3;
                }
                objP4 = Integer.valueOf(iL2);
                fetVar.o0(objP4);
            }
            int iIntValue = ((Number) objP4).intValue();
            int i7 = i5 & 7168;
            boolean zE2 = fetVar.e(cgk0Var.l()) | fetVar.e(cgk0Var3.l()) | fetVar.e(iT) | (i7 == 2048) | fetVar.e(iT6) | fetVar.e(iT3);
            Object objP5 = fetVar.P();
            if (zE2 || objP5 == obj2) {
                int iL3 = (((cgk0Var3.l() - cgk0Var.l()) - iT) - i) - iT6;
                if (iL3 < iT3) {
                    iL3 = iT3;
                }
                objP5 = Integer.valueOf(iL3);
                fetVar.o0(objP5);
            }
            int iIntValue2 = ((Number) objP5).intValue();
            Object objP6 = fetVar.P();
            if (objP6 == obj2) {
                objP6 = androidx.compose.runtime.e.e(Boolean.FALSE);
                fetVar.o0(objP6);
            }
            pz40 pz40Var = (pz40) objP6;
            Object objP7 = fetVar.P();
            if (objP7 == obj2) {
                objP7 = androidx.compose.runtime.e.e(Boolean.FALSE);
                fetVar.o0(objP7);
            }
            pz40 pz40Var2 = (pz40) objP7;
            int iL4 = cgk0Var3.l();
            boolean z2 = true;
            if (1 > iL4 || iL4 > iT5) {
                z2 = false;
            }
            boolean zE3 = fetVar.e(cgk0Var3.l());
            Object objP8 = fetVar.P();
            if (zE3 || objP8 == obj2) {
                float f2 = iIntValue - iT3;
                if (f2 < 0.0f) {
                    f2 = 0.0f;
                }
                pel pelVar = new pel();
                if (z2) {
                    f = 0.0f;
                    pelVar.a(py20.c, 0.0f);
                } else {
                    f = 0.0f;
                }
                pelVar.a(py20.b, f);
                pelVar.a(py20.f27786a, f2);
                float[] fArr = pelVar.b;
                ArrayList arrayList = pelVar.f26860a;
                int size = arrayList.size();
                nx3.a(size, fArr.length);
                z = false;
                float[] fArrCopyOfRange = Arrays.copyOfRange(fArr, 0, size);
                fArrCopyOfRange.getClass();
                objP8 = new rv2(new vtj(arrayList, fArrCopyOfRange), py20Var);
                fetVar.o0(objP8);
            } else {
                i5 = i5;
                z = false;
            }
            rv2 rv2Var = (rv2) objP8;
            Object[] objArr4 = {rv2Var, py20Var, Integer.valueOf(i), Integer.valueOf(iIntValue2), Integer.valueOf(iT3)};
            boolean zE4 = fetVar.e(iIntValue) | fetVar.e(iIntValue2) | fetVar.g(rv2Var) | fetVar.h(z2) | fetVar.e(iT3) | ((i5 & 112) == 32 ? true : z) | (i7 == 2048 ? z2 : z);
            Object objP9 = fetVar.P();
            if (zE4 || objP9 == obj2) {
                obj = obj2;
                i3 = iIntValue;
                i4 = iT3;
                Object k7sVar = new k7s(i3, iIntValue2, rv2Var, z2, py20Var, i, i4, pz40Var, null);
                fetVar.o0(k7sVar);
                objP9 = k7sVar;
            } else {
                obj = obj2;
                i3 = iIntValue;
                i4 = iT3;
            }
            m0x0.w(objArr4, (Function2) objP9, fetVar);
            boolean zG = fetVar.g(rv2Var) | ((i5 & 57344) == 16384);
            Object objP10 = fetVar.P();
            yje yjeVar = null;
            if (zG || objP10 == obj) {
                objP10 = new cbq(rv2Var, function1, yjeVar, (byte) 13);
                fetVar.o0(objP10);
            }
            m0x0.t(fetVar, rv2Var, (Function2) objP10);
            uts0 uts0Var = nu2.f24127a;
            Object objP11 = fetVar.P();
            byte b2 = 19;
            if (objP11 == obj) {
                objP11 = new dcr(b2);
                fetVar.o0(objP11);
            }
            afk0 afk0VarA = nu2.a(rv2Var, (Function1) objP11, ro4.m0(300, 0, null, 6), fetVar, 3504);
            pz40 pz40Var3 = s6t0.f31722a;
            mm40Var2 = mm40Var;
            mm40 mm40VarQ = i120.Q(mm40Var2, s6t0.b().b.getWebGamesBackground(), jd8.n);
            boolean zG2 = fetVar.g(cgk0Var3);
            Object objP12 = fetVar.P();
            if (zG2 || objP12 == obj) {
                objP12 = new nw6(cgk0Var3, b2);
                fetVar.o0(objP12);
            }
            Function1 function2 = (Function1) objP12;
            boolean zG3 = fetVar.g(cgk0Var) | fetVar.g(rv2Var) | fetVar.e(i3) | fetVar.e(i4) | fetVar.e(iT4) | fetVar.e(r23) | fetVar.e(iT2);
            Object objP13 = fetVar.P();
            if (zG3 || objP13 == obj) {
                objP13 = new l7s(function2, rv2Var, i3, i4, iT, cgk0Var, iT2, iT4);
                fetVar.o0(objP13);
            }
            tj30 tj30Var = (tj30) objP13;
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
            ugdVar5 = ugdVar;
            ugdVar5.F(new iaj("BACKGROUND_ID"), fetVar, 48);
            ugdVar6 = ugdVar2;
            ugdVar6.F(new iaj("TOOLBAR_ID"), fetVar, 48);
            ugdVar7 = ugdVar3;
            ugdVar7.F(new iaj("CONTENT_ID"), fetVar, 48);
            iaj iajVar = new iaj("MARKETS_ID");
            ma80 ma80Var = ma80.f21447a;
            mm40 mm40VarA = dv2.a(iajVar, rv2Var, ((Boolean) l7m0Var.getValue()).booleanValue(), null, afk0VarA, 24);
            boolean zG4 = fetVar.g(rv2Var);
            Object objP14 = fetVar.P();
            if (zG4 || objP14 == obj) {
                objP14 = new mf4(rv2Var, (byte) 2);
                fetVar.o0(objP14);
            }
            mm40 mm40VarT = i4w0.T(mm40VarA, (Function1) objP14);
            Object objP15 = fetVar.P();
            if (objP15 == obj) {
                objP15 = new wil(pz40Var2, (byte) 27);
                fetVar.o0(objP15);
            }
            ugdVar4.O(mm40VarT, jm40.b, (Function1) objP15, fetVar, 3504);
            fetVar.r(true);
        } else {
            mm40Var2 = mm40Var;
            ugdVar5 = ugdVar;
            ugdVar6 = ugdVar2;
            ugdVar7 = ugdVar3;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ff4(mm40Var2, py20Var, l7m0Var, i, function1, ugdVar5, ugdVar6, ugdVar7, ugdVar4, i2);
        }
    }

    public static final void s(hrv hrvVar, qdz qdzVar, Function0 function0, Function1 function1, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        hrvVar.getClass();
        qdzVar.getClass();
        function0.getClass();
        function1.getClass();
        fetVar2.g0(-1381714064);
        byte b = 16;
        int i2 = i | (fetVar2.g(hrvVar) ? 4 : 2) | (fetVar2.g(qdzVar) ? 32 : 16) | (fetVar2.i(function0) ? 256 : 128) | (fetVar2.i(function1) ? 2048 : 1024);
        if (fetVar2.U(i2 & 1, (i2 & 1171) != 1170)) {
            d9z d9zVarA = qdzVar.a(hrvVar.f13551a, new s3t(b), fetVar2, (i2 << 3) & 896);
            zfn zfnVar = zaq0.b;
            long backgroundContent = ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent();
            zcl zclVar = qmk.l;
            ugg0 ugg0Var = vgg0.f37379a;
            ugg0 ugg0Var2 = new ugg0(zclVar, zclVar, zclVar, zclVar);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarA = pkd.a(i120.Q(jm40Var, backgroundContent, ugg0Var2), 24.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarA);
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
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13);
            b8m b8mVar = hrvVar.c;
            long textPrimary = ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary();
            ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent();
            r7m r7mVar = new r7m(textPrimary, ((ThemeColors) fetVar2.k(zfnVar)).getBackground(), ((ThemeColors) fetVar2.k(zfnVar)).getPrimary());
            boolean z = (i2 & 896) == 256;
            Object objP = fetVar2.P();
            if (z || objP == ukd.f35823a) {
                objP = new dbn(function0, b);
                fetVar2.o0(objP);
            }
            wwb.j(mm40VarN, b8mVar, 16.0f, r7mVar, (Function0) objP, fetVar, 0, 16);
            fetVar2 = fetVar;
            nkb.e(s5x0.N(jm40Var, 0.0f, 4.0f, 0.0f, 8.0f, 5), d9zVarA, hrvVar.d, function1, fetVar2, i2 & 7168);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cbr((byte) 5, i, (Object) hrvVar, (Object) qdzVar, (Object) function0, (Object) function1);
        }
    }

    public static final void t(c8m c8mVar, r7m r7mVar, Function0 function0, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        fetVar.g0(-577952076);
        int i3 = i & 6;
        zhg0 zhg0Var = zhg0.f44392a;
        if (i3 == 0) {
            i2 = (fetVar.g(zhg0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(c8mVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? fetVar.g(r7mVar) : fetVar.i(r7mVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function0) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            mm40 mm40VarW = y860.W(zhg0Var.a(1.0f, o7k0.c(jm40.b, 1.0f), false), null, null, false, null, function0, 28);
            tj30 tj30VarC = zq8.c(gqw0.d, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarW);
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
            String string = c8mVar.f3920a.toString();
            long j = r7mVar.f29983a;
            long j2 = qmk.p;
            long j3 = qmk.u;
            v8q0.a(string, null, j, new n05(j2, j3, qmk.n), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, j3, null, j1t0.f15753a, 0L, null, 0, 0, qmk.H, 16646109), fetVar, 0, 24960, 110578);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t7m(c8mVar, r7mVar, function0, i, (byte) 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x008d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0095  */
    /* JADX WARN: Code duplicated, block: B:53:0x0098  */
    /* JADX WARN: Code duplicated, block: B:55:0x009c  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:59:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:71:0x0111  */
    /* JADX WARN: Code duplicated, block: B:74:0x0124  */
    /* JADX WARN: Code duplicated, block: B:76:0x0165  */
    /* JADX WARN: Code duplicated, block: B:79:0x0170  */
    /* JADX WARN: Code duplicated, block: B:81:? A[RETURN, SYNTHETIC] */
    public static final void u(mm40 mm40Var, final l7m0 l7m0Var, final l7m0 l7m0Var2, final float f, final float f2, final float f3, Function1 function1, final Function0 function0, fet fetVar, final int i, final int i2) {
        final Function1 function2;
        Function0 function3;
        boolean z;
        final mm40 mm40Var2;
        yfe0 yfe0VarU;
        Object obj;
        Function1 function4;
        Object objP;
        Object objP2;
        Object obj2;
        Object objP3;
        int i3;
        l7m0Var.getClass();
        function0.getClass();
        fetVar.g0(-1757443938);
        int i4 = i | 6;
        if ((i & 48) == 0) {
            i4 |= fetVar.g(l7m0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= fetVar.g(l7m0Var2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= fetVar.d(f) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= fetVar.d(f2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i4 |= fetVar.d(f3) ? 131072 : 65536;
        }
        int i5 = i2 & 64;
        if (i5 == 0) {
            if ((1572864 & i) == 0) {
                function2 = function1;
                i4 |= fetVar.i(function2) ? 1048576 : 524288;
            }
            if ((12582912 & i) == 0) {
                function3 = function0;
                if (fetVar.i(function3)) {
                    i3 = 8388608;
                } else {
                    i3 = 4194304;
                }
                i4 |= i3;
            } else {
                function3 = function0;
            }
            if ((4793491 & i4) != 4793490) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar.U(i4 & 1, z)) {
                obj = ukd.f35823a;
                if (i5 != 0) {
                    objP3 = fetVar.P();
                    if (objP3 == obj) {
                        objP3 = new h7w((byte) 3);
                        fetVar.o0(objP3);
                    }
                    function4 = (Function1) objP3;
                } else {
                    function4 = function2;
                }
                pz40 pz40VarF = androidx.compose.runtime.e.f(Float.valueOf(1.0f - ((Number) l7m0Var2.getValue()).floatValue()), fetVar);
                jm40 jm40Var = jm40.b;
                mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                fbn fbnVar = new fbn(new za3(f, f3, (byte) 27));
                fbn fbnVar2 = new fbn(new za3(f2, f3, (byte) 26));
                float fFloatValue = ((Number) l7m0Var2.getValue()).floatValue();
                lwf lwfVar = lwf.o;
                objP = fetVar.P();
                if (objP == obj) {
                    objP = androidx.compose.runtime.e.d(Unit.f46060a, m2a.v);
                    fetVar.o0(objP);
                }
                pz40 pz40Var = (pz40) objP;
                objP2 = fetVar.P();
                obj2 = objP2;
                if (objP2 == obj) {
                    nie0 nie0Var = new nie0();
                    nie0Var.f23583a = cmd.f4598a;
                    fetVar.o0(nie0Var);
                    obj2 = nie0Var;
                }
                nie0 nie0Var2 = (nie0) obj2;
                n6x.b(fbnVar, fbnVar2, fFloatValue, false, false, false, mm40VarD, pz40Var, nie0Var2, lwfVar, u1c.M(284503157, new wew(pz40Var, lwfVar, nie0Var2, l7m0Var, function4, l7m0Var2, function3, pz40VarF), fetVar), fetVar, 24576);
                mm40Var2 = jm40Var;
                function2 = function4;
            } else {
                fetVar.X();
                mm40Var2 = mm40Var;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new Function2() { // from class: a.vew
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        ((Integer) obj4).getClass();
                        fxb.u(mm40Var2, l7m0Var, l7m0Var2, f, f2, f3, function2, function0, (fet) obj3, x8x.L(i | 1), i2);
                        return Unit.f46060a;
                    }
                };
            }
        }
        i4 |= 1572864;
        function2 = function1;
        if ((12582912 & i) == 0) {
            function3 = function0;
            if (fetVar.i(function3)) {
                i3 = 8388608;
            } else {
                i3 = 4194304;
            }
            i4 |= i3;
        } else {
            function3 = function0;
        }
        if ((4793491 & i4) != 4793490) {
            z = true;
        } else {
            z = false;
        }
        if (fetVar.U(i4 & 1, z)) {
            obj = ukd.f35823a;
            if (i5 != 0) {
                objP3 = fetVar.P();
                if (objP3 == obj) {
                    objP3 = new h7w((byte) 3);
                    fetVar.o0(objP3);
                }
                function4 = (Function1) objP3;
            } else {
                function4 = function2;
            }
            pz40 pz40VarF2 = androidx.compose.runtime.e.f(Float.valueOf(1.0f - ((Number) l7m0Var2.getValue()).floatValue()), fetVar);
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarD2 = o7k0.d(jm40Var2, 1.0f);
            fbn fbnVar3 = new fbn(new za3(f, f3, (byte) 27));
            fbn fbnVar4 = new fbn(new za3(f2, f3, (byte) 26));
            float fFloatValue2 = ((Number) l7m0Var2.getValue()).floatValue();
            lwf lwfVar2 = lwf.o;
            objP = fetVar.P();
            if (objP == obj) {
                objP = androidx.compose.runtime.e.d(Unit.f46060a, m2a.v);
                fetVar.o0(objP);
            }
            pz40 pz40Var2 = (pz40) objP;
            objP2 = fetVar.P();
            obj2 = objP2;
            if (objP2 == obj) {
                nie0 nie0Var3 = new nie0();
                nie0Var3.f23583a = cmd.f4598a;
                fetVar.o0(nie0Var3);
                obj2 = nie0Var3;
            }
            nie0 nie0Var4 = (nie0) obj2;
            n6x.b(fbnVar3, fbnVar4, fFloatValue2, false, false, false, mm40VarD2, pz40Var2, nie0Var4, lwfVar2, u1c.M(284503157, new wew(pz40Var2, lwfVar2, nie0Var4, l7m0Var, function4, l7m0Var2, function3, pz40VarF2), fetVar), fetVar, 24576);
            mm40Var2 = jm40Var2;
            function2 = function4;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.vew
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    fxb.u(mm40Var2, l7m0Var, l7m0Var2, f, f2, f3, function2, function0, (fet) obj3, x8x.L(i | 1), i2);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void v(mm40 mm40Var, uum uumVar, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        d280 d280Var = uumVar.b;
        fetVar2.g0(-1870367263);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(uumVar) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            xx7 xx7Var = gqw0.n;
            zcl zclVar = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(4.0f, false, new gne(gqw0.j, (byte) 11)), xx7Var, fetVar2, 48);
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
            jpm0.o(fetVar2, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            boolean zG = fetVar2.g(d280Var);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                objP = new u6n(d4d.SECONDARY60, w6n.f, d280Var);
                fetVar2.o0(objP);
            }
            u6n u6nVar = (u6n) objP;
            boolean zG2 = fetVar2.g(u6nVar);
            Object objP2 = fetVar2.P();
            if (zG2 || objP2 == cl5Var) {
                objP2 = new d1n(u6nVar, (byte) 1);
                fetVar2.o0(objP2);
            }
            kkb.p(1, fetVar2, null, (Function0) objP2);
            mm40 mm40VarD2 = o7k0.d(jm40.b, 1.0f);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarD2);
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
            v8q0.a(uumVar.f36308a, null, ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar, 0, 24960, 109562);
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p5m(mm40Var, uumVar, i, (byte) 29);
        }
    }

    public static final void w(mm40 mm40Var, xzm xzmVar, boolean z, boolean z2, fet fetVar, int i) {
        int i2;
        int i3;
        boolean z3;
        d280 d280Var = xzmVar.b;
        fetVar.g0(1164488835);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(xzmVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.h(z2) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            xx7 xx7Var = gqw0.n;
            zcl zclVar = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), xx7Var, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z4 = fetVar.S;
            Function0 function0 = e7z.u1;
            if (z4) {
                fetVar.l(function0);
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
            boolean zG = fetVar.g(d280Var);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (zG || objP == obj) {
                objP = new u6n(d4d.SECONDARY60, w6n.f, d280Var);
                fetVar.o0(objP);
            }
            u6n u6nVar = (u6n) objP;
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC1 = kbc.c0(fetVar, jm40Var);
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
            boolean zG2 = fetVar.g(u6nVar);
            Object objP2 = fetVar.P();
            if (zG2 || objP2 == obj) {
                i3 = 1;
                objP2 = new d1n(u6nVar, (byte) 1);
                fetVar.o0(objP2);
            } else {
                i3 = 1;
            }
            kkb.p(i3, fetVar, null, (Function0) objP2);
            fetVar.e0(1152402011);
            fetVar.r(false);
            if (z2) {
                fetVar.e0(1152474024);
                z3 = true;
                jcb.k(0, 0, fetVar, ffb0.R(jr8.f16991a.b(jm40Var, gqw0.h), 0.0f, 8.0f, 1));
                fetVar.r(false);
            } else {
                z3 = true;
                fetVar.e0(1152676795);
                fetVar.r(false);
            }
            fetVar.r(z3);
            mm40 mm40VarE = o7k0.e(jm40Var, 30.0f);
            tj30 tj30VarC2 = zq8.c(gqw0.e, false);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarE);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(function0);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC2, shdVar);
            jpm0.o(fetVar, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC2, shdVar4);
            boolean z5 = z3;
            v8q0.a(xzmVar.f41759a, null, ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), qmk.C, 2, false, 2, 0, null, new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar, 0, 24960, 107514);
            fetVar.r(z5);
            fetVar.r(z5);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new aw5((Object) mm40Var, (Object) xzmVar, z, z2, i, (byte) 4);
        }
    }

    public static final void x(mm40 mm40Var, xzm xzmVar, xzm xzmVar2, a2m a2mVar, boolean z, fet fetVar, int i) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        uso0 uso0Var = uso0.f36223a;
        fetVar2.g0(-1054567407);
        int i2 = i | 6 | (fetVar2.g(xzmVar) ? 32 : 16) | (fetVar2.g(xzmVar2) ? 256 : 128) | (fetVar2.g(a2mVar) ? 2048 : 1024) | (fetVar2.h(z) ? 16384 : 8192) | (fetVar2.e(0) ? 131072 : 65536);
        if (fetVar2.U(i2 & 1, (74899 & i2) != 74898)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(o7k0.e(mm40VarD, 80.0f), 0.0f, 0.0f, 0.0f, 6.0f, 7);
            thg0 thg0VarA = shg0.a(new qw3(16.0f, true, new gne(gqw0.n, (byte) 12)), gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarN);
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
            uso0 uso0Var2 = uso0.f36223a;
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            w(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), xzmVar, true, false, fetVar2, (i2 & 112) | 384);
            obb.q(null, a2mVar, z, fetVar, (i2 >> 6) & 1008, 1);
            uso0 uso0Var3 = uso0.f36223a;
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            fetVar2 = fetVar;
            w(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), xzmVar2, false, false, fetVar2, ((i2 >> 3) & 112) | 384);
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ip0(mm40Var2, xzmVar, xzmVar2, a2mVar, z, i);
        }
    }

    public static final void y(int i, fet fetVar) {
        fetVar.g0(1030109011);
        if (fetVar.U(i & 1, i != 0)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarS = o7k0.s(o7k0.e(jm40.b, 20.0f), 128.0f);
            zcl zclVar2 = qmk.m;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarS), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new f4m(i, (byte) 4);
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [int[], java.io.Serializable, java.lang.Object] */
    public static final zj2 z(aeg0 aeg0Var, String[] strArr, Function1 function1) {
        mox moxVarG = aeg0Var.g();
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        krs0 krs0Var = moxVarG.b;
        Pair pairK = krs0Var.k(strArr2);
        String[] strArr3 = (String[]) pairK.f46059a;
        ?? r4 = (int[]) pairK.b;
        strArr3.getClass();
        r4.getClass();
        return new zj2(ulb.D(new vsg0(new pnd0((byte) 17, null, r4, krs0Var, strArr3)), -1), aeg0Var, function1, (byte) 7);
    }
}
