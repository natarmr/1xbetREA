package a;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.util.TypedValue;
import android.widget.ImageView;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.bet_history.core.presentation.BetHistoryScreenModel;
import org.xplatform.bet_history.history.domain.model.HistoryTypeModel;
import org.xplatform.uikit.components.timer.DsTimer;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;
import org.xplatform.uikit_sport.eventcard.info.EventCardInfoLine;

/* JADX INFO: loaded from: classes6.dex */
public abstract class vcc {
    public static final void A(EventCardInfoLine eventCardInfoLine, fus fusVar) {
        eventCardInfoLine.getClass();
        fusVar.getClass();
        boolean z = fusVar.b;
        boolean z2 = fusVar.f10180a;
        l7n l7nVar = z ? l7n.f19567a : l7n.b;
        eventCardInfoLine.setTimerVisibility(z2);
        eventCardInfoLine.setHideAfterFinished(true);
        eventCardInfoLine.setTimeDirection(l7nVar);
        eventCardInfoLine.setTime(TimeUnit.SECONDS.toMillis(dtb.T(fusVar)));
        dc3 dc3Var = eventCardInfoLine.q;
        if (z2) {
            ((DsTimer) dc3Var.d).d();
            eventCardInfoLine.v();
        } else {
            DsTimer dsTimer = (DsTimer) dc3Var.d;
            dsTimer.l = false;
            dsTimer.g.removeCallbacks(dsTimer.w);
            eventCardInfoLine.v();
        }
    }

    public static final int B(boolean z, boolean z2) {
        if (z && z2) {
            return R.drawable.cs2_statistic_first_last_item_bg;
        }
        if (z) {
            return R.drawable.cs2_statistic_first_item_bg;
        }
        return z2 ? R.drawable.cs2_statistic_last_item_bg : R.drawable.cs2_statistic_second_item_bg;
    }

    public static final void C(Fragment fragment, String str) {
        fragment.getClass();
        fragment.F().g(str);
    }

    public static final pz40 D(gy40 gy40Var, fet fetVar) {
        Object objP = fetVar.P();
        cl5 cl5Var = ukd.f35823a;
        if (objP == cl5Var) {
            objP = androidx.compose.runtime.e.e(Boolean.FALSE);
            fetVar.o0(objP);
        }
        pz40 pz40Var = (pz40) objP;
        boolean zG = fetVar.g(gy40Var);
        Object objP2 = fetVar.P();
        if (zG || objP2 == cl5Var) {
            objP2 = new ttf(gy40Var, pz40Var, null, (byte) 1);
            fetVar.o0(objP2);
        }
        m0x0.t(fetVar, gy40Var, (Function2) objP2);
        return pz40Var;
    }

    public static final String E(String str, String str2, ctf0 ctf0Var) {
        if (str.length() > 0 && str2.length() > 0) {
            return kng0.l(str, Separators.SP, str2);
        }
        if (str.length() <= 0 || str2.length() != 0) {
            return (str.length() != 0 || str2.length() <= 0) ? ctf0Var.b.a(R.string.main_game, Arrays.copyOf(new Object[0], 0)) : str2;
        }
        return str;
    }

    public static final f3w F(kzv kzvVar, ctf0 ctf0Var, String str) {
        ctf0Var.getClass();
        double d = kzvVar.V;
        if (d == 0.0d || kzvVar.U != 0.0d) {
            return null;
        }
        String strA = ctf0Var.b.a(R.string.advance_with_colon, Arrays.copyOf(new Object[0], 0));
        pn40 pn40Var = pn40.f27267a;
        return new f3w("", strA, pn40.c(d, p3u0.c), str, e3w.f7156a);
    }

    public static final f3w G(kzv kzvVar, ctf0 ctf0Var, String str) {
        ctf0Var.getClass();
        double d = kzvVar.w;
        if (d == -1.0d) {
            return null;
        }
        String strA = ctf0Var.b.a(R.string.advance_close_with_dots, Arrays.copyOf(new Object[0], 0));
        pn40 pn40Var = pn40.f27267a;
        return new f3w("", strA, pn40.c(d, p3u0.c), str, e3w.f7156a);
    }

    public static final f3w H(kzv kzvVar, ctf0 ctf0Var, String str) {
        ctf0Var.getClass();
        double d = kzvVar.U;
        if (d == 0.0d || kzvVar.g != i0w.e) {
            return null;
        }
        String strA = ctf0Var.b.a(R.string.advance_conf_bet_row, Arrays.copyOf(new Object[0], 0));
        pn40 pn40Var = pn40.f27267a;
        return new f3w("", strA, pn40.c(d, p3u0.c), str, e3w.f7156a);
    }

    public static final f3w I(kzv kzvVar, ctf0 ctf0Var, String str) {
        ctf0Var.getClass();
        if (!kzvVar.x) {
            return null;
        }
        String strA = ctf0Var.b.a(R.string.auto_sale_order_with_colon, Arrays.copyOf(new Object[0], 0));
        pn40 pn40Var = pn40.f27267a;
        return new f3w("", strA, pn40.c(kzvVar.y, p3u0.c), str, e3w.f7156a);
    }

    public static final i3w J(kzv kzvVar, ctf0 ctf0Var) {
        kzvVar.getClass();
        ctf0Var.getClass();
        lsm0 lsm0Var = ctf0Var.b;
        return new i3w(lsm0Var.a(R.string.feeds_sport_events_count_new, Arrays.copyOf(new Object[0], 0)), String.valueOf(kzvVar.u), lsm0Var.a(R.string.finished_bets, Arrays.copyOf(new Object[]{Integer.valueOf(kzvVar.v), Integer.valueOf(kzvVar.t)}, 2)));
    }

    public static final f3w K(kzv kzvVar, ctf0 ctf0Var, String str) {
        int i;
        i0w i0wVar = i0w.i;
        ctf0Var.getClass();
        q4f q4fVar = kzvVar.b;
        double d = kzvVar.f;
        i0w i0wVar2 = kzvVar.g;
        if (q4fVar == q4f.h) {
            return null;
        }
        if (kzvVar.L >= d || i0wVar2 == i0wVar) {
            i = i0wVar2 == i0wVar ? R.string.credited_to_account_with_colon : R.string.history_bet_rate;
        } else {
            i = R.string.history_bet_rate_partially_sold;
        }
        String strA = ctf0Var.b.a(i, Arrays.copyOf(new Object[0], 0));
        pn40 pn40Var = pn40.f27267a;
        double d2 = kzvVar.C;
        if (d2 <= 0.0d) {
            d2 = i0wVar2 == i0wVar ? kzvVar.M : d - kzvVar.E;
        }
        return new f3w("", strA, pn40.c(d2, p3u0.c), str, e3w.f7156a);
    }

    public static final iwo L(long j, jwo jwoVar) {
        int iOrdinal = jwoVar.ordinal();
        if (iOrdinal == 0) {
            return new iwo(0L, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)))) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L));
        }
        if (iOrdinal == 1) {
            return new iwo((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)))) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), 0L);
        }
        if (iOrdinal == 2) {
            return new iwo((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32), 0L);
        }
        if (iOrdinal != 3) {
            t9f.b();
            return null;
        }
        return new iwo(0L, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32));
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0033  */
    /* JADX WARN: Code duplicated, block: B:24:0x003f  */
    /* JADX WARN: Code duplicated, block: B:29:0x004d  */
    public static final f3w M(kzv kzvVar, ctf0 ctf0Var, String str, boolean z) {
        e3w e3wVar;
        e3w e3wVar2;
        int iOrdinal;
        int i;
        int iOrdinal2;
        double d;
        ctf0Var.getClass();
        lb90 lb90Var = kzvVar.n;
        i0w i0wVar = kzvVar.g;
        if (lb90Var == lb90.b && Intrinsics.d(kzvVar.O, hxu.h) && z) {
            int iOrdinal3 = i0wVar.ordinal();
            if (iOrdinal3 == 0 || iOrdinal3 == 1) {
                e3wVar = e3w.f7156a;
            } else {
                if (iOrdinal3 == 3 || iOrdinal3 == 4) {
                    e3wVar = e3w.b;
                } else {
                    e3wVar2 = null;
                }
                if (e3wVar2 != null) {
                    iOrdinal = i0wVar.ordinal();
                    if (iOrdinal != 0 || iOrdinal == 1) {
                        i = R.string.history_possible_payout_title;
                    } else {
                        i = R.string.history_payout_title;
                    }
                    iOrdinal2 = i0wVar.ordinal();
                    if (iOrdinal2 != 0 || iOrdinal2 == 1) {
                        d = kzvVar.p;
                    } else {
                        d = kzvVar.o;
                    }
                    String strA = ctf0Var.b.a(i, Arrays.copyOf(new Object[0], 0));
                    pn40 pn40Var = pn40.f27267a;
                    return new f3w("", strA, pn40.c(d, p3u0.c), str, e3wVar2);
                }
            }
            e3wVar2 = e3wVar;
            if (e3wVar2 != null) {
                iOrdinal = i0wVar.ordinal();
                if (iOrdinal != 0) {
                    i = R.string.history_possible_payout_title;
                } else {
                    i = R.string.history_possible_payout_title;
                }
                iOrdinal2 = i0wVar.ordinal();
                if (iOrdinal2 != 0) {
                    d = kzvVar.p;
                } else {
                    d = kzvVar.p;
                }
                String strA2 = ctf0Var.b.a(i, Arrays.copyOf(new Object[0], 0));
                pn40 pn40Var2 = pn40.f27267a;
                return new f3w("", strA2, pn40.c(d, p3u0.c), str, e3wVar2);
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x001f  */
    public static final f3w N(kzv kzvVar, ctf0 ctf0Var, String str, boolean z) {
        e3w e3wVar;
        String strA;
        double d;
        e3w e3wVar2;
        i0w i0wVar = kzvVar.g;
        ctf0Var.getClass();
        if (!z || i0wVar == i0w.g) {
            e3wVar = null;
        } else {
            if (i0wVar == i0w.f13966a || i0wVar == i0w.b) {
                e3wVar2 = e3w.f7156a;
            } else if (i0wVar == i0w.d || i0wVar == i0w.e) {
                e3wVar2 = e3w.b;
            } else {
                e3wVar = null;
            }
            e3wVar = e3wVar2;
        }
        if (e3wVar != null) {
            List listJ = q3d.j(q4f.e, q4f.g);
            q4f q4fVar = kzvVar.b;
            ozc ozcVar = kzvVar.a0;
            hxu hxuVar = kzvVar.O;
            boolean z2 = listJ.contains(q4fVar) && i0wVar != i0w.e;
            ivo0 ivo0Var = hxuVar.f;
            ivo0 ivo0Var2 = hxuVar.f;
            if (ivo0Var.f15455a.length() > 0 && kotlin.collections.a.c(i0w.b).contains(i0wVar)) {
                strA = ohs0.n(ivo0Var2.f15455a, Separators.COLON);
            } else if (z2 && ozcVar == ozc.MIN_PAYOUT) {
                strA = ctf0Var.b.a(R.string.history_min_payout, Arrays.copyOf(new Object[0], 0));
            } else if (z2 && ozcVar == ozc.MAX_PAYOUT) {
                strA = ctf0Var.b.a(R.string.max_payout, Arrays.copyOf(new Object[0], 0));
            } else if (kzvVar.e == 0.0d) {
                strA = "";
            } else if (i0wVar == i0w.f13966a || i0wVar == i0w.b) {
                strA = ctf0Var.b.a(kzvVar.s ? R.string.make_bet_max_possible_win : R.string.possible_win_with_dots, Arrays.copyOf(new Object[0], 0));
            } else {
                strA = ctf0Var.b.a(R.string.history_your_win_new, Arrays.copyOf(new Object[0], 0));
            }
            if (ivo0Var2.b != 0.0d && q3d.j(i0w.b, i0w.d).contains(i0wVar)) {
                d = ivo0Var2.b;
            } else if (i0wVar == i0w.f13966a || i0wVar == i0w.b) {
                d = kzvVar.r;
            } else {
                d = i0wVar == i0w.d ? kzvVar.c : kzvVar.o;
            }
            double d2 = d;
            pn40 pn40Var = pn40.f27267a;
            String str2 = strA;
            f3w f3wVar = new f3w("", str2, pn40.c(d2, p3u0.c), str, e3wVar);
            if (str2.length() > 0 && d2 != 0.0d) {
                return f3wVar;
            }
        }
        return null;
    }

    public static final m3w O(kzv kzvVar, ctf0 ctf0Var) {
        int i;
        long jM113getRed0d7_KjU;
        ctf0Var.getClass();
        i0w i0wVar = kzvVar.g;
        switch (i0wVar.ordinal()) {
            case 0:
                i = R.string.error;
                break;
            case 1:
                i = R.string.accepted;
                break;
            case 2:
                i = R.string.loosed;
                break;
            case 3:
                i = R.string.won;
                break;
            case 4:
                i = R.string.paid;
                break;
            case 5:
                i = R.string.removed;
                break;
            case 6:
                i = R.string.expired;
                break;
            case 7:
                i = R.string.blocked;
                break;
            case 8:
                i = R.string.bought;
                break;
            default:
                t9f.b();
                return null;
        }
        lsm0 lsm0Var = ctf0Var.b;
        String strA = lsm0Var.a(i, Arrays.copyOf(new Object[0], 0));
        switch (i0wVar.ordinal()) {
            case 0:
            case 2:
            case 5:
            case 6:
                pz40 pz40Var = s6t0.f31722a;
                jM113getRed0d7_KjU = StaticColors.INSTANCE.m113getRed0d7_KjU();
                break;
            case 1:
                pz40 pz40Var2 = s6t0.f31722a;
                jM113getRed0d7_KjU = s6t0.b().f33626a.getPrimary();
                break;
            case 3:
            case 4:
            case 8:
                pz40 pz40Var3 = s6t0.f31722a;
                jM113getRed0d7_KjU = StaticColors.INSTANCE.m98getGreen0d7_KjU();
                break;
            case 7:
                pz40 pz40Var4 = s6t0.f31722a;
                jM113getRed0d7_KjU = s6t0.b().f33626a.getSecondary();
                break;
            default:
                t9f.b();
                return null;
        }
        return new m3w(lsm0Var.a(R.string.promo_code_status_text, Arrays.copyOf(new Object[0], 0)), strA, jM113getRed0d7_KjU);
    }

    public static final o3w P(kzv kzvVar, ctf0 ctf0Var, String str) {
        ctf0Var.getClass();
        hxu hxuVar = kzvVar.O;
        if (Intrinsics.d(hxuVar, hxu.h) || kzvVar.g == i0w.f13966a) {
            return null;
        }
        return new o3w(dyb.r0(wwb.K(hxuVar, str)), String.valueOf(kzvVar.hashCode()), ctf0Var.b.a(R.string.tax_bonus_empty, Arrays.copyOf(new Object[0], 0)));
    }

    public static final efp0 Q(xte xteVar, ArrayList arrayList) {
        if (arrayList.size() < (rln.f30706a[xteVar.ordinal()] != 3 ? 2 : 3)) {
            if (arrayList.size() == 1) {
                String str = (String) CollectionsKt.firstOrNull(arrayList);
                return new dfp0(str != null ? str : "");
            }
            if (arrayList.size() == 2) {
                String str2 = (String) CollectionsKt.firstOrNull(arrayList);
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = (String) CollectionsKt.W(1, arrayList);
                return new cfp0(str2, str3 != null ? str3 : "");
            }
        }
        return bfp0.f2514a;
    }

    public static final kiq R(m9s m9sVar, boolean z) {
        m9sVar.getClass();
        String str = m9sVar.i;
        long j = z ? kkg.f18437a : kkg.b;
        String str2 = (String) CollectionsKt.firstOrNull(m9sVar.m);
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        if (kotlin.text.c.x(str2, ujn.h, false)) {
            str3 = str2;
        } else if (str2.length() != 0) {
            List list = u0d.f34849a;
            if (!u0d.c(str2)) {
                str3 = String.format(Locale.ENGLISH, StringsKt.O(str2, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str2}, 2));
            }
        }
        return new kiq(str, str3, j);
    }

    public static final kiq S(m9s m9sVar, boolean z) {
        m9sVar.getClass();
        String str = m9sVar.j;
        long j = z ? kkg.f18437a : kkg.b;
        String str2 = (String) CollectionsKt.firstOrNull(m9sVar.n);
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        if (kotlin.text.c.x(str2, ujn.h, false)) {
            str3 = str2;
        } else if (str2.length() != 0) {
            List list = u0d.f34849a;
            if (!u0d.c(str2)) {
                str3 = String.format(Locale.ENGLISH, StringsKt.O(str2, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str2}, 2));
            }
        }
        return new kiq(str, str3, j);
    }

    public static final boolean T(fof fofVar, List list) {
        fofVar.getClass();
        list.getClass();
        irf irfVar = fofVar.f9878a;
        List list2 = irfVar.h;
        ArrayList arrayList = new ArrayList(r3d.q(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((ppf) it.next()).f27373a);
        }
        String str = irfVar.c;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            jpf jpfVar = (jpf) obj;
            if (jpfVar.f || jpfVar.h || jpfVar.g || jpfVar.i) {
                arrayList2.add(obj);
            }
        }
        return (arrayList.isEmpty() && str.length() == 0) || arrayList2.isEmpty();
    }

    public static final ArrayList U(List list) {
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            StringBuilder sb = new StringBuilder(ujn.h);
            String strK = kng0.k("playerlogo/", str);
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
            arrayList.add(sb.toString());
        }
        return arrayList;
    }

    public static final lm40 V(xz40 xz40Var) {
        int i;
        if (xz40Var == null || (i = xz40Var.c) == 0) {
            return null;
        }
        return (lm40) xz40Var.k(i - 1);
    }

    public static final void W(yzj yzjVar) {
        jw2 autofillManager;
        e7z e7zVarZ = Z(yzjVar);
        if (e7zVarZ.u) {
            return;
        }
        AndroidComposeView androidComposeView = (AndroidComposeView) h7z.a(e7zVarZ);
        if (!AndroidComposeView.c() || (autofillManager = androidComposeView.getAutofillManager()) == null) {
            return;
        }
        Rect rect = autofillManager.f;
        oge0 oge0Var = autofillManager.d;
        e7z e7zVar = (e7z) oge0Var.f25215a.b(e7zVarZ.b);
        if (e7zVar == null || e7zVar.g == -4) {
            return;
        }
        zz2 zz2Var = oge0Var.c;
        int iD = oge0Var.d(e7zVar);
        long[] jArr = (long[]) zz2Var.b;
        long j = jArr[iD];
        long j2 = jArr[iD + 1];
        rect.set((int) (j >> 32), (int) j, (int) (j2 >> 32), (int) j2);
        autofillManager.f17231a.m().requestAutofill(autofillManager.c, e7zVarZ.b, rect);
    }

    public static final s460 X(yzj yzjVar, int i) {
        s460 s460Var = ((lm40) yzjVar).f20279a.h;
        s460Var.getClass();
        if (s460Var.g1() != yzjVar || !t460.g(i)) {
            return s460Var;
        }
        s460 s460Var2 = s460Var.v;
        s460Var2.getClass();
        return s460Var2;
    }

    public static final s460 Y(yzj yzjVar) {
        if (!((lm40) yzjVar).f20279a.n) {
            xcx.b("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        s460 s460VarX = X(yzjVar, 2);
        if (!s460VarX.g1().n) {
            xcx.b("LayoutCoordinates is not attached.");
        }
        return s460VarX;
    }

    public static final e7z Z(yzj yzjVar) {
        s460 s460Var = ((lm40) yzjVar).f20279a.h;
        if (s460Var != null) {
            return s460Var.u;
        }
        throw cs0.g("Cannot obtain node coordinator. Is the Modifier.Node attached?");
    }

    public static final void a(mm40 mm40Var, hh80 hh80Var, syl sylVar, vxl vxlVar, fet fetVar, int i) {
        lw3 lw3Var = uc9.f35418a;
        fetVar.g0(1141569082);
        int i2 = (i & 6) == 0 ? (fetVar.g(mm40Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(hh80Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.e(sylVar == null ? -1 : sylVar.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.e(vxlVar != null ? vxlVar.ordinal() : -1) ? 2048 : 1024;
        }
        final byte b = 0;
        final byte b2 = 1;
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            final vyl vylVar = ucc.f35422a[vxlVar.ordinal()] == 1 ? vyl.b : vyl.f38253a;
            final ArrayList arrayList = new ArrayList(6);
            for (int i3 = 0; i3 < 6; i3++) {
                arrayList.add(new gyl(sylVar, null, 2));
            }
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = l7x.Q(new ugd(-93899368, true, new Function2() { // from class: a.scc
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        vqm vqmVar;
                        vqm vqmVar2;
                        byte b3 = b;
                        vyl vylVar2 = vylVar;
                        ArrayList<gyl> arrayList2 = arrayList;
                        switch (b3) {
                            case 0:
                                fet fetVar2 = (fet) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                if (fetVar2.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    ArrayList arrayList3 = new ArrayList(r3d.q(arrayList2, 10));
                                    for (gyl gylVar : arrayList2) {
                                        int iOrdinal = vylVar2.ordinal();
                                        if (iOrdinal == 0) {
                                            vqmVar = vqm.f37862a;
                                        } else {
                                            if (iOrdinal != 1) {
                                                t9f.b();
                                                return null;
                                            }
                                            vqmVar = vqm.b;
                                        }
                                        zcl zclVar = qmk.f28987a;
                                        mm40 mm40VarP = o7k0.p(s5x0.N(jm40.b, 0.0f, 0.0f, 8.0f, 8.0f, 3), 64.0f, 32.0f);
                                        zcl zclVar2 = qmk.h;
                                        ugg0 ugg0Var = vgg0.f37379a;
                                        zq8.a(0, fetVar2, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarP), vbc.d0(vqmVar, fetVar2, 0, 0)));
                                        arrayList3.add(Unit.f46060a);
                                    }
                                } else {
                                    fetVar2.X();
                                }
                                return Unit.f46060a;
                            default:
                                fet fetVar3 = (fet) obj;
                                int iIntValue2 = ((Integer) obj2).intValue();
                                if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    ArrayList arrayList4 = new ArrayList(r3d.q(arrayList2, 10));
                                    for (gyl gylVar2 : arrayList2) {
                                        int iOrdinal2 = vylVar2.ordinal();
                                        if (iOrdinal2 == 0) {
                                            vqmVar2 = vqm.f37862a;
                                        } else {
                                            if (iOrdinal2 != 1) {
                                                t9f.b();
                                                return null;
                                            }
                                            vqmVar2 = vqm.b;
                                        }
                                        zcl zclVar3 = qmk.f28987a;
                                        mm40 mm40VarP2 = o7k0.p(s5x0.N(jm40.b, 0.0f, 0.0f, 8.0f, 0.0f, 11), 64.0f, 32.0f);
                                        zcl zclVar4 = qmk.i;
                                        ugg0 ugg0Var2 = vgg0.f37379a;
                                        zq8.a(0, fetVar3, xbc.c0(h97.e(zclVar4, zclVar4, zclVar4, zclVar4, mm40VarP2), vbc.d0(vqmVar2, fetVar3, 0, 0)));
                                        arrayList4.add(Unit.f46060a);
                                    }
                                } else {
                                    fetVar3.X();
                                }
                                return Unit.f46060a;
                        }
                    }
                }));
                fetVar.o0(objP);
            }
            Function2 function2 = (Function2) objP;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = l7x.Q(new ugd(-1013659222, true, new Function2() { // from class: a.scc
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        vqm vqmVar;
                        vqm vqmVar2;
                        byte b3 = b2;
                        vyl vylVar2 = vylVar;
                        ArrayList<gyl> arrayList2 = arrayList;
                        switch (b3) {
                            case 0:
                                fet fetVar2 = (fet) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                if (fetVar2.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    ArrayList arrayList3 = new ArrayList(r3d.q(arrayList2, 10));
                                    for (gyl gylVar : arrayList2) {
                                        int iOrdinal = vylVar2.ordinal();
                                        if (iOrdinal == 0) {
                                            vqmVar = vqm.f37862a;
                                        } else {
                                            if (iOrdinal != 1) {
                                                t9f.b();
                                                return null;
                                            }
                                            vqmVar = vqm.b;
                                        }
                                        zcl zclVar = qmk.f28987a;
                                        mm40 mm40VarP = o7k0.p(s5x0.N(jm40.b, 0.0f, 0.0f, 8.0f, 8.0f, 3), 64.0f, 32.0f);
                                        zcl zclVar2 = qmk.h;
                                        ugg0 ugg0Var = vgg0.f37379a;
                                        zq8.a(0, fetVar2, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarP), vbc.d0(vqmVar, fetVar2, 0, 0)));
                                        arrayList3.add(Unit.f46060a);
                                    }
                                } else {
                                    fetVar2.X();
                                }
                                return Unit.f46060a;
                            default:
                                fet fetVar3 = (fet) obj;
                                int iIntValue2 = ((Integer) obj2).intValue();
                                if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    ArrayList arrayList4 = new ArrayList(r3d.q(arrayList2, 10));
                                    for (gyl gylVar2 : arrayList2) {
                                        int iOrdinal2 = vylVar2.ordinal();
                                        if (iOrdinal2 == 0) {
                                            vqmVar2 = vqm.f37862a;
                                        } else {
                                            if (iOrdinal2 != 1) {
                                                t9f.b();
                                                return null;
                                            }
                                            vqmVar2 = vqm.b;
                                        }
                                        zcl zclVar3 = qmk.f28987a;
                                        mm40 mm40VarP2 = o7k0.p(s5x0.N(jm40.b, 0.0f, 0.0f, 8.0f, 0.0f, 11), 64.0f, 32.0f);
                                        zcl zclVar4 = qmk.i;
                                        ugg0 ugg0Var2 = vgg0.f37379a;
                                        zq8.a(0, fetVar3, xbc.c0(h97.e(zclVar4, zclVar4, zclVar4, zclVar4, mm40VarP2), vbc.d0(vqmVar2, fetVar3, 0, 0)));
                                        arrayList4.add(Unit.f46060a);
                                    }
                                } else {
                                    fetVar3.X();
                                }
                                return Unit.f46060a;
                        }
                    }
                }));
                fetVar.o0(objP2);
            }
            Function2 function3 = (Function2) objP2;
            if (sylVar == syl.f33027a) {
                fetVar.e0(935545261);
                mm40 mm40VarI = s5x0.I(wha0.P(mm40Var, wha0.T(fetVar), false, 14), hh80Var);
                thg0 thg0VarA = shg0.a(lw3Var, gqw0.j, fetVar, 6);
                int iHashCode = Long.hashCode(fetVar.T);
                bh90 bh90VarM = fetVar.m();
                mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarI);
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
                function3.invoke(fetVar, 6);
                fetVar.r(true);
                fetVar.r(false);
            } else {
                fetVar.e0(935831050);
                jwb.p(s5x0.I(mm40Var, hh80Var), lw3Var, uc9.c, null, 0, 0, u1c.M(-130357117, new tcc(function2, b), fetVar), fetVar, 1573296, 56);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dg0((byte) 12, i, (Object) mm40Var, (Object) hh80Var, (Object) sylVar, (Object) vxlVar);
        }
    }

    public static final cg80 a0(yzj yzjVar) {
        cg80 cg80Var = Z(yzjVar).o;
        if (cg80Var != null) {
            return cg80Var;
        }
        throw cs0.g("This node does not have an owner.");
    }

    public static final void b(mm40 mm40Var, xph xphVar, fet fetVar, int i) {
        xphVar.getClass();
        fetVar.g0(999691872);
        int i2 = i | 6 | (fetVar.g(xphVar) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            ugd ugdVarM = u1c.M(440587192, new sd8(xphVar, (byte) 22), fetVar);
            boolean z = xphVar instanceof uph;
            jm40 jm40Var = jm40.b;
            if (z) {
                fetVar.e0(-1368773519);
                vbc.o(jm40Var, ((uph) xphVar).f36064a, ugdVarM, fetVar, 390);
                fetVar.r(false);
            } else if (xphVar instanceof tph) {
                fetVar.e0(-1368766494);
                qbc.e(jm40Var, ((tph) xphVar).f34332a, ugdVarM, fetVar, 390);
                fetVar.r(false);
            } else if (xphVar instanceof wph) {
                fetVar.e0(-1368759305);
                qcc.c(jm40Var, ((wph) xphVar).f39545a, ugdVarM, fetVar, 390);
                fetVar.r(false);
            } else {
                if (!(xphVar instanceof vph)) {
                    throw b1j.f(-1368775055, fetVar, false);
                }
                fetVar.e0(-1368752028);
                xbc.i(((vph) xphVar).f37805a, ugdVarM, fetVar, 390);
                fetVar.r(false);
            }
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new chh(mm40Var, xphVar, i, (byte) 10);
        }
    }

    public static final void b0(Drawable drawable, int i) {
        b4d b4dVar = b4d.f1952a;
        if (Build.VERSION.SDK_INT < 29) {
            if (drawable != null) {
                drawable.setColorFilter(i, b4dVar.b());
            }
        } else if (drawable != null) {
            kw2.g();
            drawable.setColorFilter(kw2.c(i, b4dVar.a()));
        }
    }

    public static final void c(int i, fet fetVar, mm40 mm40Var, String str) {
        int i2;
        yfe0 yfe0VarU;
        cx cxVar;
        fetVar.g0(89567822);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(str) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            if (str == null) {
                yfe0VarU = fetVar.u();
                if (yfe0VarU == null) {
                    return;
                } else {
                    cxVar = new cx(mm40Var, str, i, (byte) 7);
                }
            } else {
                mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
                thg0 thg0VarA = shg0.a(uc9.b, gqw0.k, fetVar, 54);
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
                hic.f(i2 & 112, fetVar, null, str);
                fetVar.r(true);
            }
            yfe0VarU.d = cxVar;
        }
        fetVar.X();
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            cxVar = new cx(mm40Var, str, i, (byte) 8);
            yfe0VarU.d = cxVar;
        }
    }

    public static void c0(Drawable drawable, Context context, int i) {
        b4d b4dVar = b4d.f1952a;
        context.getClass();
        if (Build.VERSION.SDK_INT < 29) {
            if (drawable != null) {
                TypedValue typedValue = j5d.f15927a;
                drawable.setColorFilter(j5d.a(context, i, false), b4dVar.b());
                return;
            }
            return;
        }
        if (drawable != null) {
            kw2.g();
            TypedValue typedValue2 = j5d.f15927a;
            drawable.setColorFilter(kw2.c(j5d.a(context, i, false), b4dVar.a()));
        }
    }

    public static final void d(int i, fet fetVar, mm40 mm40Var) {
        int i2;
        fet fetVar2;
        fetVar.g0(950086906);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.h(false) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g("LIVE") ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarD = o7k0.d(o7k0.e(mm40Var, 24.0f), 1.0f);
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new gne(gqw0.n, (byte) 12)), gqw0.k, fetVar, 48);
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
            fetVar.e0(1000251918);
            fetVar2 = fetVar;
            j6n.h("LIVE", oro0.f25744a, null, 0, 0, fetVar2, ((i2 >> 6) & 14) | 48, 28);
            fetVar2.r(false);
            fetVar2.e0(1000565700);
            fetVar2.r(false);
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new y30(mm40Var, i, (byte) 26);
        }
    }

    public static void d0(ImageView imageView, int i) {
        b4d b4dVar = b4d.f1952a;
        TypedValue typedValue = j5d.f15927a;
        Context context = imageView.getContext();
        context.getClass();
        imageView.setColorFilter(j5d.a(context, i, false), b4dVar.b());
    }

    public static final void e(final ssk sskVar, final Function0 function0, fet fetVar, final int i) {
        final byte b;
        fet fetVar2 = fetVar;
        sskVar.getClass();
        a4x<xnh> a4xVar = sskVar.c;
        function0.getClass();
        fetVar2.g0(1557632665);
        int i2 = (fetVar2.g(sskVar) ? 4 : 2) | i | (fetVar2.i(function0) ? 32 : 16);
        final byte b2 = 0;
        if (!fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            b = 1;
            fetVar2.X();
        } else {
            if (a4xVar.isEmpty()) {
                yfe0 yfe0VarU = fetVar2.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new Function2(sskVar, function0, i, b2) { // from class: a.rsk

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ byte f31035a;
                        public final /* synthetic */ ssk b;
                        public final /* synthetic */ Function0 c;

                        {
                            this.f31035a = b2;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            byte b3 = this.f31035a;
                            fet fetVar3 = (fet) obj;
                            ((Integer) obj2).getClass();
                            switch (b3) {
                                case 0:
                                    vcc.e(this.b, this.c, fetVar3, x8x.L(1));
                                    break;
                                default:
                                    vcc.e(this.b, this.c, fetVar3, x8x.L(1));
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                    return;
                }
                return;
            }
            long backgroundContent = ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent();
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            ugg0 ugg0Var2 = new ugg0(zclVar, zclVar, zclVar, zclVar);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarQ = i120.Q(jm40Var, backgroundContent, ugg0Var2);
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
            wwb.j(s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), sskVar.b, 16.0f, null, null, fetVar, 0, 56);
            fetVar2 = fetVar;
            fetVar2.e0(-772704996);
            for (xnh xnhVar : a4xVar) {
                fetVar2.b0(-1611457690, xnhVar);
                zcl zclVar2 = qmk.f28987a;
                mm40 mm40VarM = s5x0.M(jm40Var, 8.0f, 4.0f, 8.0f, 4.0f);
                xnhVar.getClass();
                if (xnhVar instanceof wnh) {
                    fetVar2.e0(-717148188);
                    jwb.h(0, fetVar2);
                    fetVar2.r(false);
                } else {
                    if (!(xnhVar instanceof vnh)) {
                        throw b1j.f(-1547156261, fetVar2, false);
                    }
                    fetVar2.e0(-717047376);
                    wvb.i(mm40VarM, ((vnh) xnhVar).f37718a, fetVar2, 0);
                    fetVar2.r(false);
                }
                fetVar2.r(false);
            }
            fetVar2.r(false);
            zcl zclVar3 = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(jm40Var, 4.0f, 0.0f, 0.0f, 0.0f, 14);
            m3g m3gVar = sskVar.d;
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar2.P();
            if (z || objP == ukd.f35823a) {
                objP = new b1i(function0, (byte) 18);
                fetVar2.o0(objP);
            }
            e3c.b(mm40VarN, m3gVar, (Function0) objP, fetVar2, 0, 0);
            b = 1;
            fetVar2.r(true);
        }
        yfe0 yfe0VarU2 = fetVar2.u();
        if (yfe0VarU2 != null) {
            yfe0VarU2.d = new Function2(sskVar, function0, i, b) { // from class: a.rsk

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ byte f31035a;
                public final /* synthetic */ ssk b;
                public final /* synthetic */ Function0 c;

                {
                    this.f31035a = b;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    byte b3 = this.f31035a;
                    fet fetVar3 = (fet) obj;
                    ((Integer) obj2).getClass();
                    switch (b3) {
                        case 0:
                            vcc.e(this.b, this.c, fetVar3, x8x.L(1));
                            break;
                        default:
                            vcc.e(this.b, this.c, fetVar3, x8x.L(1));
                            break;
                    }
                    return Unit.f46060a;
                }
            };
        }
    }

    public static void e0(ImageView imageView, int i) {
        b4d b4dVar = b4d.f1952a;
        TypedValue typedValue = j5d.f15927a;
        Context context = imageView.getContext();
        context.getClass();
        imageView.setColorFilter(context.getColor(i), b4dVar.b());
    }

    public static final void f(mm40 mm40Var, yql yqlVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(-585494082);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(yqlVar) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
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
            nkb.h(s5x0.N(jm40.b, 8.0f, 0.0f, 0.0f, 0.0f, 14), new hjm(yqlVar.c, null, null, null, null, null, false, null, null, false, null, null, 8190), kjm.f18392a, null, null, null, fetVar, 384, 56);
            q(null, yqlVar.f43081a, fetVar, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nql(mm40Var, yqlVar, i, (byte) 3);
        }
    }

    public static final void f0(Bundle bundle, Fragment fragment, String str) {
        fragment.getClass();
        str.getClass();
        fragment.F().t0(bundle, str);
    }

    public static final void g(mm40 mm40Var, j0m j0mVar, fet fetVar, int i) {
        mm40 mm40Var2;
        jm40 jm40Var;
        boolean z;
        fet fetVar2 = fetVar;
        fetVar2.g0(-827456023);
        int i2 = i | 6 | (fetVar2.g(j0mVar) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            long j = j0mVar.d;
            fetVar2.e0(-1924821788);
            boolean zF = fetVar2.f(j);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (zF || objP == cl5Var) {
                y3d y3dVar = new y3d(j);
                if (h2t0.a(j, y3d.g)) {
                    y3dVar = null;
                }
                objP = y3dVar != null ? new m78(y3dVar.f41946a, 5) : null;
                fetVar2.o0(objP);
            }
            a4d a4dVar = (a4d) objP;
            pm80 pm80VarF = a8k0.F(j0mVar.e, 0, fetVar2);
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarE = o7k0.e(jm40Var2, 28.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE);
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
            jpm0.o(fetVar2, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            mm40 mm40VarE0 = o2e.e0(s5x0.N(jm40Var2, 0.0f, 0.0f, 8.0f, 0.0f, 11), "DS_CELL_ICON_BOX");
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
            mm40 mm40VarN = o7k0.n(jm40Var2, 24.0f);
            boolean z3 = (i2 & 112) == 32;
            Object objP2 = fetVar2.P();
            if (z3 || objP2 == cl5Var) {
                objP2 = new edl(j0mVar, (byte) 13);
                fetVar2.o0(objP2);
            }
            k7x.b(j0mVar.c.a(), null, pai0.a(mm40VarN, false, (Function1) objP2), pm80VarF, pm80VarF, null, null, null, null, null, gqw0.A, a4dVar, fetVar2, 36912, 6, 27616);
            i0m i0mVar = j0mVar.f;
            if (i0mVar instanceof g0m) {
                fetVar2.e0(-1542513989);
                jm40Var = jm40Var2;
                z = false;
                thb.f(knx.Q(jr8.f16991a.b(jm40Var, gqw0.i), new thd((byte) 18)), ((g0m) i0mVar).f10466a, fetVar2, 0, 0);
                fetVar2.r(false);
            } else {
                jm40Var = jm40Var2;
                z = false;
                if (!Intrinsics.d(i0mVar, h0m.f12242a)) {
                    throw b1j.f(-1296687581, fetVar2, false);
                }
                fetVar2.e0(-1542117995);
                fetVar2.r(false);
            }
            fetVar2.r(true);
            mm40 mm40VarE1 = o2e.e0(o7k0.d(jm40Var, 1.0f), "MENU_CELL_TITLE");
            String str = j0mVar.f15688a;
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str, mm40VarE1, j0mVar.b, null, 0L, null, null, null, 0L, null, qmk.C, 2, false, 2, 0, null, g1t0.d(), fetVar, 48, 24960, 108536);
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.r(false);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cxj(mm40Var2, j0mVar, i, (byte) 26);
        }
    }

    public static final void g0(Fragment fragment, String str, Function2 function2) {
        fragment.getClass();
        str.getClass();
        fragment.F().u0(str, fragment, new jk8(function2, (byte) 2));
    }

    public static final void h(ecm ecmVar, fet fetVar, int i) {
        fetVar.g0(-408891626);
        int i2 = i | (fetVar.g(ecmVar) ? 4 : 2);
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zfn zfnVar = j1t0.e;
            ((g1t0) fetVar.k(zfnVar)).getClass();
            y9q0 y9q0VarP = g1t0.p();
            g9q0 g9q0VarN = pym0.n(fetVar);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.e(new daq0(idm0.t(24)));
                fetVar.o0(objP);
            }
            pz40 pz40Var = (pz40) objP;
            mm40 mm40VarE0 = o2e.e0(o7k0.d(jm40.b, 1.0f), "DS_CYBER_TOP_INFO_TITLE");
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new wil(pz40Var, (byte) 8);
                fetVar.o0(objP2);
            }
            mm40 mm40VarA = pai0.a(mm40VarE0, false, (Function1) objP2);
            String str = ecmVar.f7573a;
            ((g1t0) fetVar.k(zfnVar)).getClass();
            y9q0 y9q0VarP2 = g1t0.p();
            long jM123getWhite0d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m123getWhite0d7_KjU();
            n05 n05Var = new n05(idm0.t(20), idm0.t(24), idm0.t(1));
            boolean zG = fetVar.g(g9q0VarN) | ((i2 & 14) == 4) | fetVar.g(y9q0VarP);
            Object objP3 = fetVar.P();
            if (zG || objP3 == cl5Var) {
                dc0 dc0Var = new dc0((Object) g9q0VarN, (Object) ecmVar, (Object) y9q0VarP, (Object) pz40Var, (byte) 29);
                fetVar.o0(dc0Var);
                objP3 = dc0Var;
            }
            v8q0.a(str, mm40VarA, jM123getWhite0d7_KjU, n05Var, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, (Function1) objP3, y9q0VarP2, fetVar, 0, 24960, 45040);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new i3l(ecmVar, i, (byte) 14);
        }
    }

    public static final god h0(nnd nndVar, ctf0 ctf0Var, qal0 qal0Var, znq0 znq0Var, boolean z, boolean z2) {
        d280 c280Var;
        d280 c280Var2;
        int i;
        String str;
        int i2;
        String str2;
        Object obj = 0L;
        ctf0Var.getClass();
        List list = nndVar.f23815a;
        List list2 = nndVar.f;
        List list3 = nndVar.e;
        boolean z3 = nndVar.l;
        List list4 = nndVar.b;
        if (list.size() != 2 || list4.size() != 2 || z3) {
            if (z3) {
                c280Var = new b280(R.drawable.ic_glyph_color_logo_home);
            } else {
                String str3 = (String) CollectionsKt.firstOrNull(list3);
                if (str3 == null) {
                    str3 = "";
                }
                Long l = (Long) CollectionsKt.firstOrNull(list);
                c280Var = new c280(vsm0.s(l != null ? l.longValue() : 0L, str3), R.drawable.ic_glyph_placeholder_player);
            }
            edp0 edp0Var = new edp0(new f5a0(c280Var));
            if (z3) {
                c280Var2 = new b280(R.drawable.ic_glyph_color_logo_away);
            } else {
                String str4 = (String) CollectionsKt.firstOrNull(list2);
                if (str4 == null) {
                    str4 = "";
                }
                Long l2 = (Long) CollectionsKt.firstOrNull(list4);
                c280Var2 = new c280(vsm0.s(l2 != null ? l2.longValue() : 0L, str4), R.drawable.ic_glyph_placeholder_player);
            }
            edp0 edp0Var2 = new edp0(new f5a0(c280Var2));
            boolean z4 = nndVar.g;
            if (znq0Var != null) {
                rdj rdjVar = rdj.f30294a;
                i = 0;
                String strG = rdj.g(znq0Var, efj.UNIVERSAL, Boolean.valueOf(z), false, 56);
                if (strG != null) {
                    str = strG;
                }
                return new god(edp0Var, edp0Var2, wzb.X(ctf0Var, qal0Var, nndVar.m, z4, null, "", str, z2), ctf0Var.b.a(R.string.vs, Arrays.copyOf(new Object[i], i)));
            }
            i = 0;
            str = "";
            return new god(edp0Var, edp0Var2, wzb.X(ctf0Var, qal0Var, nndVar.m, z4, null, "", str, z2), ctf0Var.b.a(R.string.vs, Arrays.copyOf(new Object[i], i)));
        }
        Long l3 = (Long) CollectionsKt.firstOrNull(list);
        long jLongValue = l3 != null ? l3.longValue() : 0L;
        long jLongValue2 = ((Number) (1 < list.size() ? list.get(1) : obj)).longValue();
        Long l4 = (Long) CollectionsKt.firstOrNull(list4);
        long jLongValue3 = l4 != null ? l4.longValue() : 0L;
        long jLongValue4 = ((Number) (1 < list4.size() ? list4.get(1) : 0L)).longValue();
        String str5 = (String) CollectionsKt.firstOrNull(list3);
        f5a0 f5a0Var = new f5a0(new c280(vsm0.s(jLongValue, str5 == null ? "" : str5), R.drawable.ic_glyph_placeholder_player));
        String str6 = (String) CollectionsKt.W(1, list3);
        if (str6 == null) {
            str6 = "";
        }
        adp0 adp0Var = new adp0(f5a0Var, new f5a0(new c280(vsm0.s(jLongValue2, str6), R.drawable.ic_glyph_placeholder_player)));
        String str7 = (String) CollectionsKt.firstOrNull(list2);
        if (str7 == null) {
            str7 = "";
        }
        f5a0 f5a0Var2 = new f5a0(new c280(vsm0.s(jLongValue3, str7), R.drawable.ic_glyph_placeholder_player));
        String str8 = (String) CollectionsKt.W(1, list2);
        if (str8 == null) {
            str8 = "";
        }
        adp0 adp0Var2 = new adp0(f5a0Var2, new f5a0(new c280(vsm0.s(jLongValue4, str8), R.drawable.ic_glyph_placeholder_player)));
        boolean z5 = nndVar.g;
        if (znq0Var != null) {
            rdj rdjVar2 = rdj.f30294a;
            i2 = 0;
            String strG2 = rdj.g(znq0Var, efj.UNIVERSAL, Boolean.valueOf(z), false, 56);
            if (strG2 != null) {
                str2 = strG2;
            }
            return new god(adp0Var, adp0Var2, wzb.X(ctf0Var, qal0Var, nndVar.m, z5, null, "", str2, z2), ctf0Var.b.a(R.string.vs, Arrays.copyOf(new Object[i2], i2)));
        }
        i2 = 0;
        str2 = "";
        return new god(adp0Var, adp0Var2, wzb.X(ctf0Var, qal0Var, nndVar.m, z5, null, "", str2, z2), ctf0Var.b.a(R.string.vs, Arrays.copyOf(new Object[i2], i2)));
    }

    public static final void i(mm40 mm40Var, y56 y56Var, boolean z, Function1 function1, Function1 function2, fet fetVar, int i, int i2) {
        y56Var.getClass();
        function1.getClass();
        if ((i2 & 1) != 0) {
            mm40Var = jm40.b;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        if ((i2 & 16) != 0) {
            function2 = null;
        }
        if (y56Var instanceof q56) {
            fetVar.e0(-1422303144);
            mm40 mm40Var2 = mm40Var;
            ahb.i(mm40Var2, (q56) y56Var, z, function1, function2, fetVar, i & 65534);
            fetVar.r(false);
            return;
        }
        mm40 mm40Var3 = mm40Var;
        Function1 function3 = function2;
        boolean z2 = z;
        if (y56Var instanceof w56) {
            fetVar.e0(-1422007528);
            thb.h(mm40Var3, (w56) y56Var, z2, function1, function3, fetVar, i & 65534);
            fetVar.r(false);
        } else {
            if (!(y56Var instanceof x56)) {
                throw b1j.f(646854435, fetVar, false);
            }
            fetVar.e0(-1421727412);
            tdc.k(mm40Var3, ((x56) y56Var).f40298a, fetVar, i & 14);
            fetVar.r(false);
        }
    }

    public static final gwe i0(ms2 ms2Var) {
        ms2Var.getClass();
        if (ms2Var != null) {
            if ((ms2Var instanceof hs2) || (ms2Var instanceof gs2) || (ms2Var instanceof fs2) || (ms2Var instanceof jq2)) {
                return gwe.CHAMPIONSHIP;
            }
            if ((ms2Var instanceof gq2) || (ms2Var instanceof hq2) || (ms2Var instanceof iq2)) {
                return gwe.EXPRESS_CRICKET;
            }
            if ((ms2Var instanceof rq2) || (ms2Var instanceof lq2) || (ms2Var instanceof tq2) || (ms2Var instanceof mq2) || (ms2Var instanceof nq2) || (ms2Var instanceof uq2)) {
                return gwe.CYBER;
            }
            if ((ms2Var instanceof wq2) || (ms2Var instanceof xq2) || (ms2Var instanceof aq2) || (ms2Var instanceof bq2) || (ms2Var instanceof fq2) || (ms2Var instanceof yq2) || (ms2Var instanceof cq2)) {
                return gwe.FAVORITE;
            }
            if ((ms2Var instanceof jr2) || (ms2Var instanceof kr2) || (ms2Var instanceof lr2)) {
                return gwe.NEW_POPULAR;
            }
            if (ms2Var instanceof br2) {
                return gwe.INSIGHTS;
            }
            if ((ms2Var instanceof zq2) || (ms2Var instanceof eq2) || (ms2Var instanceof vq2)) {
                return gwe.GAME;
            }
            if ((ms2Var instanceof pr2) || (ms2Var instanceof qr2)) {
                return gwe.SEARCH;
            }
            if (ms2Var instanceof is2) {
                return gwe.NOTIFICATIONS;
            }
            if (ms2Var instanceof js2) {
                return gwe.NOTIFICATIONS;
            }
            if ((ms2Var instanceof mr2) || (ms2Var instanceof ir2) || (ms2Var instanceof hr2) || (ms2Var instanceof gr2) || (ms2Var instanceof fr2)) {
                return gwe.OLD_POPULAR;
            }
            if (ms2Var instanceof dq2) {
                return gwe.HISTORY;
            }
            if (ms2Var instanceof nr2) {
                return gwe.RELATED;
            }
            if ((ms2Var instanceof dr2) || (ms2Var instanceof ls2) || (ms2Var instanceof ur2) || (ms2Var instanceof sr2) || (ms2Var instanceof vr2) || (ms2Var instanceof xr2) || (ms2Var instanceof zr2) || (ms2Var instanceof es2) || (ms2Var instanceof yr2) || (ms2Var instanceof as2) || (ms2Var instanceof bs2) || (ms2Var instanceof cs2) || (ms2Var instanceof tr2) || (ms2Var instanceof wr2) || (ms2Var instanceof kq2) || (ms2Var instanceof oq2) || (ms2Var instanceof qq2) || (ms2Var instanceof pq2) || (ms2Var instanceof sq2) || (ms2Var instanceof rr2) || (ms2Var instanceof ar2) || (ms2Var instanceof er2) || (ms2Var instanceof cr2) || (ms2Var instanceof ks2) || (ms2Var instanceof or2)) {
                return gwe.DEFAULT;
            }
        }
        t9f.b();
        return null;
    }

    public static final void j(mm40 mm40Var, lxm lxmVar, lxm lxmVar2, String str, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        str.getClass();
        fetVar2.g0(-2094287387);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(lxmVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.g(lxmVar2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar2.g(str) ? 2048 : 1024;
        }
        if (fetVar2.U(i2 & 1, (i2 & 1171) != 1170)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(mm40VarD, 8.0f, 0.0f, 2);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarL);
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
            xcz xczVarA = ddz.a(q3d.i(lxmVar.d), 0, fetVar2, 0, 2);
            xcz xczVarA2 = ddz.a(q3d.i(lxmVar2.d), 0, fetVar2, 0, 2);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = m0x0.I(kotlin.coroutines.g.f46065a, fetVar2);
                fetVar2.o0(objP);
            }
            vne vneVar = (vne) objP;
            boolean zI = fetVar2.i(vneVar) | fetVar2.g(xczVarA) | fetVar2.g(xczVarA2);
            Object objP2 = fetVar2.P();
            if (zI || objP2 == cl5Var) {
                objP2 = new gxm(vneVar, xczVarA, xczVarA2, (byte) 3);
                fetVar2.o0(objP2);
            }
            bch0 bch0VarP = piz.P((Function1) objP2, fetVar2);
            int i3 = i2;
            r(null, lxmVar, true, xczVarA, bch0VarP, fetVar2, (i2 & 112) | 384);
            mm40 mm40VarE = o7k0.e(o7k0.d(jm40.b, 1.0f), 4.0f);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarE);
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
            mbc.o(zfi0.f44303a, null, false, fetVar, 6, 6);
            fetVar2 = fetVar;
            fetVar2.r(true);
            r(null, lxmVar2, false, xczVarA2, bch0VarP, fetVar2, ((i3 >> 3) & 112) | 384);
            if (str.length() > 0) {
                fetVar2.e0(-142163756);
                sj3.p((i3 >> 6) & 112, 13, fetVar, null, str, null, null);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                fetVar2.e0(-142103213);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new e0i((byte) 20, i, (Object) mm40Var, (Object) lxmVar, (Object) lxmVar2, (Object) str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v14, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r4v5, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.ArrayList] */
    public static final vdg j0(ydg ydgVar, Date date) {
        ?? arrayList;
        Date date2;
        ydgVar.getClass();
        List list = ydgVar.f42435a;
        Calendar calendar = Calendar.getInstance(Locale.getDefault());
        ?? arrayList2 = 0;
        if (list != null) {
            arrayList = new ArrayList(r3d.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                long jLongValue = ((Number) it.next()).longValue();
                rdj rdjVar = rdj.f30294a;
                arrayList.add(rdj.k(jLongValue));
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = iun.f15405a;
        }
        ArrayList arrayList3 = new ArrayList(r3d.q(arrayList, 10));
        for (Date date3 : arrayList) {
            calendar.getClass();
            calendar.setTime(date3);
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            arrayList3.add(calendar.getTime());
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList4 = new ArrayList();
        for (Object obj : arrayList3) {
            if (hashSet.add(rdj.c(rdj.f30294a, sdj.UNIVERSAL, (Date) obj, null, 60))) {
                arrayList4.add(obj);
            }
        }
        List list2 = ydgVar.b;
        if (list2 != null) {
            arrayList2 = new ArrayList(r3d.q(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(qbc.X((mcg) it2.next()));
            }
        }
        if (arrayList2 == 0) {
            arrayList2 = iun.f15405a;
        }
        ArrayList arrayList5 = new ArrayList();
        for (Object obj2 : arrayList2) {
            rdj rdjVar2 = rdj.f30294a;
            Date dateK = rdj.k(((icg) obj2).f);
            if (date == null) {
                date2 = (Date) CollectionsKt.firstOrNull(arrayList4);
                if (date2 == null) {
                    date2 = new Date();
                }
            } else {
                date2 = date;
            }
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTime(dateK);
            Calendar calendar3 = Calendar.getInstance();
            calendar3.setTime(date2);
            Pair pair = new Pair(calendar2, calendar3);
            if (dtb.C(pair, 1) && dtb.C(pair, 2) && dtb.C(pair, 5)) {
                arrayList5.add(obj2);
            }
        }
        return new vdg(arrayList4, arrayList5);
    }

    public static final void k(mm40 mm40Var, h9l0 h9l0Var, fet fetVar, int i) {
        h9l0Var.getClass();
        fetVar.g0(-340460105);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(h9l0Var) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zq8.a(0, fetVar, xbc.c0(lgb.J(o7k0.e(o7k0.d(mm40Var, 1.0f), h9l0Var.a()), vgg0.a(h9l0Var.b())), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new d0n((byte) 6, i, mm40Var, h9l0Var);
        }
    }

    public static final g9q k0(ql5 ql5Var) {
        ql5Var.getClass();
        return new g9q(ql5Var.f28916a, ql5Var.b, ql5Var.c, ql5Var.d, ql5Var.e, ql5Var.f, ql5Var.g, ql5Var.h, ql5Var.i, ql5Var.j, ql5Var.k, ql5Var.l, ql5Var.m);
    }

    public static final void l(sfg0 sfg0Var, fet fetVar, int i) {
        int i2;
        fetVar.g0(1919183400);
        byte b = 2;
        if ((i & 6) == 0) {
            i2 = (fetVar.g(sfg0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            mm40 mm40Var = (mm40) fetVar.k(t0h.f33118a);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = y5o.f42057a;
                fetVar.o0(objP);
            }
            xdr xdrVar = (xdr) ((jhy) objP);
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object objP2 = fetVar.P();
            if (z || objP2 == cl5Var) {
                objP2 = new yhn((Object) sfg0Var, (byte) 16);
                fetVar.o0(objP2);
            }
            Function1 function1 = (Function1) objP2;
            boolean z2 = i3 == 4;
            Object objP3 = fetVar.P();
            if (z2 || objP3 == cl5Var) {
                objP3 = new f5o(sfg0Var, b);
                fetVar.o0(objP3);
            }
            idm0.j(mm40Var, sfg0Var, xdrVar, null, function1, (Function2) objP3, fetVar, ((i2 << 3) & 112) | 384, 8);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new z4o(sfg0Var, i, (byte) 17);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final p3w l0(kzv kzvVar, HistoryTypeModel historyTypeModel, ctf0 ctf0Var, BetHistoryScreenModel betHistoryScreenModel, List list, boolean z, boolean z2, String str, List list2, boolean z3, List list3, boolean z4, boolean z5, boolean z6, Map map, boolean z7, boolean z8) {
        String str2;
        String str3;
        Object next;
        String str4;
        xco xcoVar;
        Object next2;
        String str5;
        g3w g3wVar;
        loo0 loo0Var;
        boolean z9 = kzvVar.G;
        boolean z10 = kzvVar.q;
        String str6 = kzvVar.B;
        long j = kzvVar.d;
        List list4 = kzvVar.Y;
        int i = kzvVar.t;
        i0w i0wVar = kzvVar.g;
        String str7 = kzvVar.f19169a;
        i7u i7uVar = i7u.b;
        i7u i7uVar2 = i7u.c;
        ctf0Var.getClass();
        list3.getClass();
        boolean zY = u1c.y(kzvVar);
        wro0 wro0Var = wro0.f39654a;
        cpo0 cpo0Var = cpo0.f4759a;
        bro0 bro0Var = bro0.f3088a;
        opo0 opo0Var = opo0.f25653a;
        dqo0 dqo0Var = dqo0.f6527a;
        tqo0 tqo0Var = tqo0.f34390a;
        kro0 kro0Var = kro0.f18776a;
        String str8 = "TagLive";
        String str9 = "Counter";
        if (zY) {
            String strJ = jwb.J(kzvVar, ctf0Var, list);
            ArrayList arrayList = new ArrayList(r3d.q(list4, 10));
            Iterator it = list4.iterator();
            while (it.hasNext()) {
                arrayList.add(Long.valueOf(((z0w) it.next()).F));
                str8 = str8;
            }
            String str10 = str8;
            HashSet hashSetJ0 = CollectionsKt.J0(arrayList);
            boolean zA = i7uVar2.a(list4, list2);
            boolean zA2 = i7uVar.a(list4, list2);
            String strR = bfb.R(j, ctf0Var);
            lsm0 lsm0Var = ctf0Var.b;
            String strA = lsm0Var.a(R.string.history_coupon_number, Arrays.copyOf(new Object[]{str7}, 1));
            too0 too0Var = new too0("TagLines.Title".concat(str7), lsm0Var.a(R.string.history_coupon_number, Arrays.copyOf(new Object[]{str7}, 1)));
            joo0 joo0Var = new joo0(twn.m(i, "Counter"), i);
            if (i == 1) {
                joo0Var = null;
            }
            ooo0 ooo0Var = new ooo0(lsm0Var.a(R.string.live_new, Arrays.copyOf(new Object[0], 0)), str10, kro0Var);
            if (!z10) {
                ooo0Var = null;
            }
            qoo0 qoo0Var = new qoo0(lsm0Var.a(R.string.promo, Arrays.copyOf(new Object[0], 0)), "TagPromo", tqo0Var);
            if (!z9) {
                qoo0Var = null;
            }
            poo0 poo0Var = new poo0(lsm0Var.a(R.string.optionBet, Arrays.copyOf(new Object[0], 0)), "OptionBet", dqo0Var);
            if (!zA) {
                poo0Var = null;
            }
            moo0 moo0Var = new moo0(lsm0Var.a(R.string.each_way, Arrays.copyOf(new Object[0], 0)), "EachWay", opo0Var);
            if (!zA2) {
                moo0Var = null;
            }
            roo0 roo0Var = new roo0(strJ, "TopChampTag".concat(strJ), bro0Var);
            if (strJ.length() <= 0) {
                roo0Var = null;
            }
            koo0 koo0Var = kzvVar.V == 0.0d ? null : new koo0(lsm0Var.a(R.string.advance, Arrays.copyOf(new Object[0], 0)), "TagAdvance", cpo0Var);
            qoo0 qoo0Var2 = qoo0Var;
            loo0 loo0Var2 = new loo0(lsm0Var.a(R.string.history_auto_sale, Arrays.copyOf(new Object[0], 0)), "TagAutoSale", wro0Var);
            if (!kzvVar.x) {
                loo0Var2 = null;
            }
            ioo0 ioo0Var = new ioo0(lsm0Var.a(R.string.auto_sub_label, Arrays.copyOf(new Object[0], 0)));
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list3) {
                ooo0 ooo0Var2 = ooo0Var;
                koo0 koo0Var2 = koo0Var;
                if (((xco) obj).e) {
                    arrayList2.add(obj);
                }
                ooo0Var = ooo0Var2;
                koo0Var = koo0Var2;
            }
            ooo0 ooo0Var3 = ooo0Var;
            koo0 koo0Var3 = koo0Var;
            if (arrayList2.isEmpty()) {
                loo0Var = loo0Var2;
                ioo0Var = null;
            } else {
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        loo0Var = loo0Var2;
                        if (!hashSetJ0.contains(Long.valueOf(((xco) it2.next()).f40655a))) {
                            loo0Var2 = loo0Var;
                        }
                    } else {
                        loo0Var = loo0Var2;
                        ioo0Var = null;
                    }
                }
            }
            i4 i4VarR0 = dyb.r0(tx3.z(new uoo0[]{too0Var, joo0Var, ooo0Var3, qoo0Var2, poo0Var, moo0Var, roo0Var, koo0Var3, loo0Var, ioo0Var}));
            i3w i3wVarJ = J(kzvVar, ctf0Var);
            g3w g3wVarA0 = vdb.a0(kzvVar, ctf0Var, zA);
            String str11 = kzvVar.i;
            return new p3w(str7, str7, strR, str6, strA, i4VarR0, dyb.r0(tx3.z(new h3w[]{i3wVarJ, g3wVarA0, str11.length() > 0 ? new j3w(lsm0Var.a(lzv.f20923a[i0wVar.ordinal()] == 9 ? R.string.sell_coefficient_with_dots : R.string.coefficient_with_dots_new, Arrays.copyOf(new Object[0], 0)), kng0.k("\u200e", str11)) : null, K(kzvVar, ctf0Var, str), F(kzvVar, ctf0Var, str), G(kzvVar, ctf0Var, str), H(kzvVar, ctf0Var, str), I(kzvVar, ctf0Var, str), P(kzvVar, ctf0Var, str), N(kzvVar, ctf0Var, str, z4), M(kzvVar, ctf0Var, str, z5), O(kzvVar, ctf0Var)})), (i0wVar != i0w.b || historyTypeModel == HistoryTypeModel.TOTO || historyTypeModel == HistoryTypeModel.JACKPOT || historyTypeModel == HistoryTypeModel.AUTO) ? false : true, z2 ? R.drawable.ic_bell_on_new : R.drawable.ic_bell_off_new, z2, lmc.a0(kzvVar), false, "", false, true, false, vic.K(i0wVar), String.valueOf(kzvVar.u), "", "", "", "", false);
        }
        String strJ2 = jwb.J(kzvVar, ctf0Var, list);
        String str12 = kzvVar.l;
        String str13 = kzvVar.k;
        Iterator it3 = list3.iterator();
        while (true) {
            if (!it3.hasNext()) {
                str2 = str13;
                str3 = str8;
                next = null;
                break;
            }
            next = it3.next();
            str2 = str13;
            str3 = str8;
            if (((xco) next).f40655a == kzvVar.T) {
                break;
            }
            str13 = str2;
            str8 = str3;
        }
        xco xcoVar2 = (xco) next;
        Iterator it4 = list2.iterator();
        while (true) {
            if (!it4.hasNext()) {
                str4 = str9;
                xcoVar = xcoVar2;
                next2 = null;
                break;
            }
            next2 = it4.next();
            Iterator it5 = it4;
            ueo ueoVar = (ueo) next2;
            xcoVar = xcoVar2;
            z0w z0wVar = (z0w) CollectionsKt.firstOrNull(list4);
            if (z0wVar != null) {
                str4 = str9;
                if (ueoVar.f35538a == z0wVar.v) {
                    break;
                }
            } else {
                str4 = str9;
            }
            it4 = it5;
            str9 = str4;
            xcoVar2 = xcoVar;
        }
        ueo ueoVar2 = (ueo) next2;
        boolean zA3 = i7uVar2.a(list4, list2);
        boolean zA4 = i7uVar.a(list4, list2);
        String strR2 = bfb.R(j, ctf0Var);
        lsm0 lsm0Var2 = ctf0Var.b;
        String strA2 = lsm0Var2.a(R.string.history_coupon_number, Arrays.copyOf(new Object[]{str7}, 1));
        too0 too0Var2 = new too0("TagLines.Title".concat(str7), lsm0Var2.a(R.string.history_coupon_number, Arrays.copyOf(new Object[]{str7}, 1)));
        joo0 joo0Var2 = new joo0(twn.m(i, str4), i);
        if (i == 1) {
            joo0Var2 = null;
        }
        ooo0 ooo0Var4 = new ooo0(lsm0Var2.a(R.string.live_new, Arrays.copyOf(new Object[0], 0)), str3, kro0Var);
        if (!z10) {
            ooo0Var4 = null;
        }
        poo0 poo0Var2 = new poo0(lsm0Var2.a(R.string.optionBet, Arrays.copyOf(new Object[0], 0)), "OptionBet", dqo0Var);
        if (!zA3) {
            poo0Var2 = null;
        }
        moo0 moo0Var2 = new moo0(lsm0Var2.a(R.string.each_way, Arrays.copyOf(new Object[0], 0)), "EachWay", opo0Var);
        if (!zA4) {
            moo0Var2 = null;
        }
        qoo0 qoo0Var3 = new qoo0(lsm0Var2.a(R.string.promo, Arrays.copyOf(new Object[0], 0)), "TagPromo", tqo0Var);
        if (!z9) {
            qoo0Var3 = null;
        }
        joo0 joo0Var3 = joo0Var2;
        roo0 roo0Var2 = new roo0(strJ2, "TopChampTag".concat(strJ2), bro0Var);
        if (strJ2.length() <= 0) {
            roo0Var2 = null;
        }
        koo0 koo0Var4 = new koo0(lsm0Var2.a(R.string.advance, Arrays.copyOf(new Object[0], 0)), "TagAdvance", cpo0Var);
        ooo0 ooo0Var5 = ooo0Var4;
        if (kzvVar.V == 0.0d) {
            koo0Var4 = null;
        }
        koo0 koo0Var5 = koo0Var4;
        loo0 loo0Var3 = new loo0(lsm0Var2.a(R.string.history_auto_sale, Arrays.copyOf(new Object[0], 0)), "TagAutoSale", wro0Var);
        if (!kzvVar.x) {
            loo0Var3 = null;
        }
        xco xcoVar3 = xcoVar;
        i4 i4VarR1 = dyb.r0(tx3.z(new uoo0[]{too0Var2, joo0Var3, ooo0Var5, poo0Var2, moo0Var2, qoo0Var3, roo0Var2, koo0Var5, loo0Var3, xcoVar != null ? xcoVar3.e : false ? new ioo0(lsm0Var2.a(R.string.auto_sub_label, Arrays.copyOf(new Object[0], 0))) : null}));
        if (!zA3 || str2.length() == 0) {
            str5 = "\u200e";
            g3wVar = null;
        } else {
            str5 = "\u200e";
            g3wVar = new g3w(w6x.r(new Object[0], 0, lsm0Var2, R.string.maximum_coef, Separators.COLON), str5.concat(str2));
        }
        i4 i4VarR2 = dyb.r0(tx3.z(new h3w[]{g3wVar, vdb.a0(kzvVar, ctf0Var, zA3), (!zA3 || str12.length() == 0) ? null : new j3w(w6x.r(new Object[0], 0, lsm0Var2, R.string.optional_coef, Separators.COLON), str5.concat(str12)), e3c.D(kzvVar, ctf0Var, z6), K(kzvVar, ctf0Var, str), F(kzvVar, ctf0Var, str), G(kzvVar, ctf0Var, str), H(kzvVar, ctf0Var, str), I(kzvVar, ctf0Var, str), P(kzvVar, ctf0Var, str), N(kzvVar, ctf0Var, str, z4), M(kzvVar, ctf0Var, str, z5), O(kzvVar, ctf0Var)}));
        boolean z11 = (i0wVar != i0w.b || historyTypeModel == HistoryTypeModel.TOTO || historyTypeModel == HistoryTypeModel.JACKPOT || historyTypeModel == HistoryTypeModel.AUTO) ? false : true;
        int i2 = z2 ? R.drawable.ic_bell_on_new : R.drawable.ic_bell_off_new;
        tvw tvwVarA0 = lmc.a0(kzvVar);
        int iK = vic.K(i0wVar);
        String strK = kng0.k(str5, sj3.b0(kzvVar));
        String strD = thb.D(kzvVar, ctf0Var, map);
        String str14 = xcoVar3 != null ? xcoVar3.b : null;
        String strR3 = f7k.R(kzvVar, z, z3, ueoVar2, str14 == null ? "" : str14, z7, z8);
        i0w i0wVar2 = i0w.i;
        if (i0wVar == i0wVar2) {
            strR3 = null;
        }
        if (strR3 == null) {
            strR3 = kotlin.text.c.r(lsm0Var2.a(R.string.sell_coefficient_with_dots, Arrays.copyOf(new Object[0], 0)), Separators.COLON, "", false);
        }
        String str15 = strR3;
        Object objT = i0wVar != i0wVar2 ? wvb.T(kzvVar, betHistoryScreenModel) : null;
        return new p3w(str7, r14, strR2, str6, strA2, i4VarR1, i4VarR2, z11, i2, z2, tvwVarA0, false, "", false, true, true, iK, "", strD, strK, str15, objT == null ? "" : objT, false);
    }

    public static final void m(mm40 mm40Var, ArrayList arrayList, xcz xczVar, Function2 function2, fet fetVar, int i) {
        xczVar.getClass();
        function2.getClass();
        fetVar.g0(1760979718);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(arrayList) ? 32 : 16) | (fetVar.g(xczVar) ? 256 : 128) | (fetVar.i(function2) ? 2048 : 1024);
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            zcl zclVar = qmk.f28987a;
            qw3 qw3Var = new qw3(4.0f, true, new jf4((byte) 14));
            boolean z = ((i2 & 112) == 32) | ((i2 & 7168) == 2048);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new xho(arrayList, function2, b);
                fetVar.o0(objP);
            }
            b8k0.f(mm40Var, xczVar, null, false, qw3Var, null, null, false, null, (Function1) objP, fetVar, (i2 & 14) | ((i2 >> 3) & 112), 492);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eqk((byte) 23, i, (Object) mm40Var, (Object) arrayList, (Object) xczVar, (Object) function2);
        }
    }

    public static final void n(mm40 mm40Var, Function0 function0, ugd ugdVar, ugd ugdVar2, ugd ugdVar3, fet fetVar, int i) {
        int i2;
        function0.getClass();
        fetVar.g0(-2023274929);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(ugdVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(ugdVar2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(ugdVar3) ? 16384 : 8192;
        }
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            hlm.c(o7k0.d(mm40Var, 1.0f), new imm(klm.f18497a, mlm.f21997a, fmm.f9790a, StaticColors.INSTANCE.m121getTransparent0d7_KjU(), false, null), null, null, null, null, null, null, null, u1c.M(610039499, new wr4(function0, (byte) 6), fetVar), u1c.M(-806222403, new w(ugdVar3, (byte) 10), fetVar), u1c.M(-1694259940, new d0(ugdVar2, ugdVar, (byte) 3), fetVar), fetVar, 805306368, 54, 508);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rnr(mm40Var, function0, ugdVar, ugdVar2, ugdVar3, i, (byte) 1);
        }
    }

    public static final void o(mm40 mm40Var, fgt fgtVar, Function1 function1, fet fetVar, int i) {
        long secondary;
        fet fetVar2 = fetVar;
        fgtVar.getClass();
        function1.getClass();
        fetVar2.g0(-385918544);
        int i2 = i | (fetVar2.g(fgtVar) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
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
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(jm40.b, 12.0f, 0.0f, 0.0f, 0.0f, 14);
            y9q0 y9q0Var = new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109);
            String str = fgtVar.f9508a;
            if (fgtVar.c) {
                fetVar2.e0(-1606777235);
                secondary = ((ThemeColors) fetVar2.k(zaq0.b)).getWarning();
            } else {
                fetVar2.e0(-1606776241);
                secondary = ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary();
            }
            fetVar2.r(false);
            boolean z = false;
            v8q0.a(str, mm40VarN, secondary, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, y9q0Var, fetVar, 0, 0, 131064);
            fetVar2 = fetVar;
            fyl fylVar = fgtVar.b;
            vxl vxlVar = vxl.b;
            if ((i2 & 896) == 256) {
                z = true;
            }
            Object objP = fetVar2.P();
            if (z || objP == ukd.f35823a) {
                objP = new baq(function1, (byte) 29);
                fetVar2.o0(objP);
            }
            ebc.r(null, fylVar, vxlVar, (Function1) objP, null, fetVar2, 384, 41);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hpr(mm40Var, fgtVar, function1, i, (byte) 8);
        }
    }

    public static final void p(int i, fet fetVar, mm40 mm40Var, String str, String str2) {
        fet fetVar2 = fetVar;
        str.getClass();
        str2.getClass();
        fetVar2.g0(-542612457);
        int i2 = i | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(str2) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            long jM78getBlack800d7_KjU = ((StaticColors) fetVar2.k(m8m0.f21378a)).m78getBlack800d7_KjU();
            zcl zclVar = qmk.d;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarK = s5x0.K(i120.Q(mm40Var, jM78getBlack800d7_KjU, new ugg0(zclVar, zclVar, zclVar, zclVar)), 8.0f, 4.0f);
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.k, fetVar2, 48);
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
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            x7z x7zVar = new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            StaticColors staticColors = StaticColors.INSTANCE;
            v8q0.a(str, x7zVar, staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 1, 0, null, g1t0.g(), fetVar2, (i2 >> 3) & 14, 24960, 109560);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            v8q0.a(str2, new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(6), 0L, 2, false, 1, 0, null, g1t0.g(), fetVar, (i2 >> 6) & 14, 24960, 109560);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new man(mm40Var, str, str2, i, (byte) 7);
        }
    }

    public static final void q(mm40 mm40Var, sql sqlVar, fet fetVar, int i) {
        byte b;
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(1648708943);
        int i2 = i | 6 | (fetVar2.g(sqlVar) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarI = dw9.i(zclVar, zclVar, zclVar, zclVar, jm40Var);
            zfn zfnVar = zaq0.b;
            long backgroundContent = ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent();
            ljc ljcVar = jd8.n;
            mm40 mm40VarJ = s5x0.J(i120.Q(mm40VarI, backgroundContent, ljcVar), 12.0f);
            byte b2 = 14;
            thg0 thg0VarA = shg0.a(new qw3(12.0f, true, new jf4(b2)), gqw0.k, fetVar2, 48);
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
            jpm0.o(fetVar2, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            mm40 mm40VarN = o7k0.n(jm40Var, 56.0f);
            zcl zclVar2 = qmk.e;
            mm40 mm40VarQ = i120.Q(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarN), ((ThemeColors) fetVar2.k(zfnVar)).getBackground(), ljcVar);
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
            mm40 mm40VarN2 = o7k0.n(jm40Var, 40.0f);
            o0x o0xVar = sqlVar.f32635a;
            k7x.a(o0xVar != null ? o0xVar.a() : null, null, mm40VarN2, null, null, fetVar2, 48, 2040);
            fetVar2.r(true);
            x7z x7zVar = new x7z(1.0f, true);
            x5d x5dVarA = w5d.a(new qw3(2.0f, true, new jf4(b2)), gqw0.m, fetVar2, 0);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, x7zVar);
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
            mm40 mm40VarN3 = s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 4.0f, 7);
            String str = sqlVar.c;
            zfn zfnVar2 = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar2)).getClass();
            v8q0.a(str, mm40VarN3, ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary(), new n05(qmk.r, qmk.s, qmk.n), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.j(), fetVar, 0, 24960, 110576);
            String str2 = sqlVar.b;
            ((g1t0) fetVar.k(zfnVar2)).getClass();
            v8q0.a(str2, null, ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, g1t0.g(), fetVar, 0, 24960, 110586);
            fetVar2 = fetVar;
            b = 1;
            fetVar2.r(true);
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            b = 1;
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new qql(mm40Var2, sqlVar, i, b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v9, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v20 */
    public static final void r(mm40 mm40Var, lxm lxmVar, boolean z, xcz xczVar, bch0 bch0Var, fet fetVar, int i) {
        mm40 mm40Var2;
        ?? r11;
        ?? r6;
        ?? r3;
        int i2;
        boolean z2;
        float f;
        shd shdVar;
        shd shdVar2;
        shd shdVar3;
        cl5 cl5Var;
        shd shdVar4;
        xcz xczVar2 = xczVar;
        fet fetVar2 = fetVar;
        a4x a4xVar = lxmVar.d;
        c280 c280Var = lxmVar.b;
        fetVar2.g0(1220864630);
        int i3 = i | 6;
        if ((i & 48) == 0) {
            i3 |= fetVar2.g(lxmVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= fetVar2.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= fetVar2.g(xczVar2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= (32768 & i) == 0 ? fetVar2.g(bch0Var) : fetVar2.i(bch0Var) ? 16384 : 8192;
        }
        if (fetVar2.U(i3 & 1, (i3 & 9363) != 9362)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 32.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z3 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z3) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            shd shdVar5 = gqw0.x;
            jpm0.o(fetVar2, thg0VarA, shdVar5);
            shd shdVar6 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar6);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar7 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar7);
            jpm0.n(fetVar2);
            shd shdVar8 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar8);
            boolean zG = fetVar2.g(c280Var);
            Object objP = fetVar2.P();
            cl5 cl5Var2 = ukd.f35823a;
            if (zG || objP == cl5Var2) {
                objP = new u6n(d4d.SECONDARY60, w6n.j, c280Var);
                fetVar2.o0(objP);
            }
            u6n u6nVar = (u6n) objP;
            boolean zG2 = fetVar2.g(u6nVar);
            Object objP2 = fetVar2.P();
            if (zG2 || objP2 == cl5Var2) {
                r6 = 1;
                objP2 = new d1n(u6nVar, (byte) 1);
                fetVar2.o0(objP2);
            } else {
                r6 = 1;
            }
            kkb.p(r6, fetVar2, null, (Function0) objP2);
            s(0, fetVar2, new x7z(1.0f, r6), lxmVar.f20821a);
            if (lxmVar.c.length() > 0) {
                fetVar2.e0(-1644854611);
                ?? r9 = r6;
                String str = lxmVar.c;
                long textPrimary = ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary();
                y9q0 y9q0Var = new y9q0(0L, qmk.q, null, j1t0.f15753a, 0L, null, 0, 0, qmk.D, 16646109);
                mm40 mm40VarL = s5x0.L(jm40Var, 4.0f, 0.0f, 2);
                i2 = i3;
                f = 4.0f;
                shdVar2 = shdVar8;
                z2 = false;
                shdVar4 = shdVar5;
                r3 = r9 == true ? 1 : 0;
                shdVar = shdVar6;
                cl5Var = cl5Var2;
                shdVar3 = shdVar7;
                v8q0.a(str, mm40VarL, textPrimary, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, y9q0Var, fetVar, 0, 0, 131064);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                r3 = r6;
                i2 = i3;
                z2 = false;
                f = 4.0f;
                shdVar = shdVar6;
                shdVar2 = shdVar8;
                shdVar3 = shdVar7;
                cl5Var = cl5Var2;
                shdVar4 = shdVar5;
                fetVar2.e0(-1644595792);
                fetVar2.r(false);
            }
            jcb.H(s5x0.N(ffb0.R(jm40Var, 0.0f, z ? 6.0f : -6.0f, r3), 0.0f, z ? 0.0f : f, 0.0f, z ? f : 0.0f, 5), 1.0f, ((ThemeColors) fetVar2.k(zaq0.b)).getSeparator60(), fetVar2, 0, 0);
            ?? r12 = fetVar2;
            ma80 ma80Var = ma80.b;
            sjj sjjVarA = wzk0.a(r12);
            boolean zG3 = r12.g(sjjVarA);
            Object objP3 = r12.P();
            Object obj = objP3;
            if (zG3 || objP3 == cl5Var) {
                iuj iujVar = new iuj(sjjVarA);
                r12.o0(iujVar);
                obj = iujVar;
            }
            mm40 mm40VarA = fbh0.a(jm40Var, bch0Var, ma80Var, false, (iuj) obj, 44);
            zx7 zx7Var = gqw0.d;
            tj30 tj30VarC = zq8.c(zx7Var, z2);
            int iHashCode2 = Long.hashCode(r12.T);
            bh90 bh90VarM2 = r12.m();
            mm40 mm40VarC1 = kbc.c0(r12, mm40VarA);
            r12.i0();
            if (r12.S) {
                r12.l(pcyVar);
            } else {
                r12.r0();
            }
            jpm0.o(r12, tj30VarC, shdVar4);
            jpm0.o(r12, bh90VarM2, shdVar);
            vqd.u(iHashCode2, r12, shdVar3, r12);
            jpm0.o(r12, mm40VarC1, shdVar2);
            xczVar2 = xczVar;
            t(null, a4xVar, xczVar2, r12, (i2 >> 3) & 896);
            int size = a4xVar.size();
            jr8 jr8Var = jr8.f16991a;
            if (size > 3) {
                r12.e0(1695310445);
                qcc.q(jr8Var.b(jm40Var, zx7Var), xczVar2, r12, (i2 >> 6) & 112);
                r12.r(z2);
            } else {
                r12.e0(1695472854);
                r12.r(z2);
            }
            if (a4xVar.size() > 3) {
                r12.e0(1695548401);
                qcc.p(jr8Var.b(jm40Var, gqw0.f), xczVar2, r12, (i2 >> 6) & 112);
                r12.r(z2);
            } else {
                r12.e0(1695706966);
                r12.r(z2);
            }
            r12.r(r3);
            r12.r(r3);
            mm40Var2 = jm40Var;
            r11 = r12;
        } else {
            fet fetVar3 = fetVar2;
            fetVar3.X();
            mm40Var2 = mm40Var;
            r11 = fetVar3;
        }
        yfe0 yfe0VarU = r11.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mg((Object) mm40Var2, (Object) lxmVar, z, (Object) xczVar2, (Object) bch0Var, i, (byte) 13);
        }
    }

    public static final void s(int i, fet fetVar, mm40 mm40Var, String str) {
        String str2;
        fetVar.g0(1280181460);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(str) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            str2 = str;
            v8q0.a(str2, s5x0.N(mm40Var, 4.0f, 0.0f, 8.0f, 0.0f, 10), ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar, (i2 >> 3) & 14, 24960, 110584);
        } else {
            str2 = str;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gdm(mm40Var, str2, i, (byte) 19);
        }
    }

    public static final void t(mm40 mm40Var, a4x a4xVar, xcz xczVar, fet fetVar, int i) {
        mm40 mm40Var2;
        fetVar.g0(1088948814);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(a4xVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(xczVar) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarU = o7k0.u(jm40Var, 0.0f, 128.0f, 1);
            yx7 yx7Var = gqw0.k;
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new oea(a4xVar, (byte) 10);
                fetVar.o0(objP);
            }
            int i3 = ((i2 >> 3) & 112) | 12779520;
            mm40Var2 = jm40Var;
            b8k0.f(mm40VarU, xczVar, null, false, null, yx7Var, null, false, null, (Function1) objP, fetVar, i3, 348);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t6m(mm40Var2, a4xVar, xczVar, i, (byte) 4);
        }
    }

    public static final void u(int i, fet fetVar, mm40 mm40Var, String str) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        String str2 = str;
        fetVar2.g0(-1957989402);
        int i2 = i | 6 | (fetVar2.g(str2) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC = o7k0.c(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarS = o7k0.s(mm40VarC, 36.0f);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
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
            jpm0.o(fetVar2, tj30VarC, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            v8q0.a(str, null, ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar2, (i2 >> 3) & 14, 24576, 114682);
            str2 = str;
            fetVar2 = fetVar2;
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gdm(mm40Var2, str2, i, (byte) 20);
        }
    }

    public static final void v(xz40 xz40Var, lm40 lm40Var) {
        xz40 xz40VarA = Z(lm40Var).A();
        int i = xz40VarA.c - 1;
        Object[] objArr = xz40VarA.f41739a;
        if (i < objArr.length) {
            while (i >= 0) {
                xz40Var.b((lm40) ((e7z) objArr[i]).h1.g);
                i--;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final v6z w(lm40 lm40Var) {
        if ((lm40Var.c & 2) != 0) {
            if (lm40Var instanceof v6z) {
                return (v6z) lm40Var;
            }
            if (lm40Var instanceof f3k) {
                lm40 lm40Var2 = ((f3k) lm40Var).p;
                while (lm40Var2 != 0) {
                    if (lm40Var2 instanceof v6z) {
                        return (v6z) lm40Var2;
                    }
                    lm40Var2 = (!(lm40Var2 instanceof f3k) || (lm40Var2.c & 2) == 0) ? lm40Var2.f : ((f3k) lm40Var2).p;
                }
            }
        }
        return null;
    }

    public static final void x(EventCardInfoLine eventCardInfoLine, long j) {
        rdj rdjVar = rdj.f30294a;
        boolean zIs24HourFormat = DateFormat.is24HourFormat(eventCardInfoLine.getContext());
        eventCardInfoLine.setInfoText(rdj.g(new znq0(j), efj.UNIVERSAL, Boolean.valueOf(zIs24HourFormat), false, 56));
    }

    public static final void y(EventCardInfoLine eventCardInfoLine, CharSequence charSequence, long j) {
        charSequence.getClass();
        rdj rdjVar = rdj.f30294a;
        boolean zIs24HourFormat = DateFormat.is24HourFormat(eventCardInfoLine.getContext());
        String string = eventCardInfoLine.getResources().getString(R.string.placeholder_variant_3, charSequence, rdj.g(new znq0(j), efj.UNIVERSAL, Boolean.valueOf(zIs24HourFormat), false, 56));
        string.getClass();
        eventCardInfoLine.setInfoText(StringsKt.x0(string).toString());
    }

    public static final void z(cp cpVar) {
        List list = u0d.f34849a;
        ImageView imageView = ((pth) cpVar.u).b;
        String str = ((q4k0) cpVar.u()).f28101a.f24641a;
        u0d.n(imageView, str, R.drawable.icon_globe_empty, 3);
    }
}
