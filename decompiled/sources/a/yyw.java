package a;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.View;
import com.appsflyer.share.attribution.RequestError;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.CustomColors;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes2.dex */
public abstract class yyw {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Iterable, java.util.List] */
    public static final void A(lc00 lc00Var, String str, String str2, g0e0 g0e0Var, long j, ctf0 ctf0Var, boolean z, boolean z2) {
        lep0 lep0Var;
        ?? arrayList;
        fbm0 fbm0Var;
        int i;
        char c;
        gbm0 gbm0Var;
        int i2;
        char c2;
        g0e0Var.getClass();
        ctf0Var.getClass();
        boolean zX = x2x.X(g0e0Var);
        syd0 syd0Var = g0e0Var.g;
        ezd0 ezd0Var = syd0Var.b;
        ezd0 ezd0Var2 = syd0Var.f33020a;
        if (zX) {
            return;
        }
        ArrayList arrayListS = ewm0.s(v0e0.f36578a, new v6d0(g0e0Var, (byte) 13));
        long j2 = j;
        aco0 aco0VarT = ewm0.t(j2, arrayListS);
        boo0 boo0VarK = qem0.k("STATISTIC_BANS_TABS", aco0VarT, arrayListS, ijg.k1, pno0.f27299a, z, new iv80(ctf0Var, (byte) 12));
        lep0 lep0Var2 = new lep0(new jep0(new iep0(str, g0e0Var.d.c), new iep0(str2, g0e0Var.e.c)));
        if (aco0VarT != null) {
            j2 = aco0VarT.f639a;
        }
        u0e0[] u0e0VarArr = u0e0.f34850a;
        String strValueOf = "-";
        if (j2 == 1) {
            List list = ezd0Var2.e;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                if (((wyd0) obj).f39970a.length() > 0) {
                    arrayList2.add(obj);
                }
            }
            List list2 = ezd0Var.e;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list2) {
                if (((wyd0) obj2).f39970a.length() > 0) {
                    arrayList3.add(obj2);
                }
            }
            int iA = wp20.a(r3d.q(arrayList2, 10));
            if (iA < 16) {
                iA = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
            for (Object obj3 : arrayList2) {
                linkedHashMap.put(((wyd0) obj3).f39970a, obj3);
            }
            int iA2 = wp20.a(r3d.q(arrayList3, 10));
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(iA2 >= 16 ? iA2 : 16);
            for (Object obj4 : arrayList3) {
                linkedHashMap2.put(((wyd0) obj4).f39970a, obj4);
            }
            LinkedHashSet linkedHashSetG = eui0.g(linkedHashMap.keySet(), linkedHashMap2.keySet());
            arrayList = new ArrayList();
            Iterator it = linkedHashSetG.iterator();
            while (it.hasNext()) {
                String str3 = (String) it.next();
                wyd0 wyd0Var = (wyd0) linkedHashMap.get(str3);
                wyd0 wyd0Var2 = (wyd0) linkedHashMap2.get(str3);
                int i3 = wyd0Var != null ? wyd0Var.b : -1;
                int i4 = wyd0Var2 != null ? wyd0Var2.b : -1;
                if (i3 > 0 || i4 > 0) {
                    dbm0 dbm0Var = new dbm0(ohs0.n(i3 < 0 ? strValueOf : String.valueOf(i3), TokenNames.X), i3 > i4 ? h3h0.f12386a : h3h0.b);
                    h3h0 h3h0Var = h3h0.b;
                    dbm0 dbm0Var2 = new dbm0(str3, h3h0Var);
                    if (i4 >= 0) {
                        strValueOf = String.valueOf(i4);
                    }
                    dbm0 dbm0Var3 = new dbm0(ohs0.n(strValueOf, TokenNames.X), i4 > i3 ? h3h0.f12386a : h3h0Var);
                    String str4 = z ? "Tablet" : "Mobile";
                    StringBuilder sb = new StringBuilder(ujn.h);
                    String lowerCase = str3.toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    String str5 = "/static/img/ImgDefault/Esports/Real/Rainbow/Maps/" + str4 + "/Centre/" + lowerCase + ".png";
                    if (str5.length() == 0) {
                        sb.setLength(0);
                    } else {
                        if (StringsKt.O(str5, ujn.h, false)) {
                            i2 = 0;
                        } else if (kotlin.text.c.x(str5, "https://", false)) {
                            i2 = 0;
                        } else {
                            if (sb.length() <= 0 || StringsKt.S(sb, Separators.SLASH)) {
                                c2 = '/';
                            } else {
                                c2 = '/';
                                sb.append('/');
                            }
                            sb.append(StringsKt.y0(str5, c2));
                        }
                        sb.setLength(i2);
                        sb.append(str5);
                    }
                    gbm0Var = new gbm0(dbm0Var, dbm0Var2, dbm0Var3, sb.toString());
                } else {
                    it = it;
                    strValueOf = strValueOf;
                    gbm0Var = null;
                }
                if (gbm0Var != null) {
                    arrayList.add(gbm0Var);
                }
                linkedHashMap2 = linkedHashMap2;
                it = it;
                lep0Var2 = lep0Var2;
                linkedHashMap = linkedHashMap;
                strValueOf = strValueOf;
            }
            lep0Var = lep0Var2;
        } else {
            lep0Var = lep0Var2;
            if (j2 == 2) {
                List list3 = ezd0Var2.f;
                ArrayList arrayList4 = new ArrayList();
                for (Object obj5 : list3) {
                    if (((azd0) obj5).f1712a != -1) {
                        arrayList4.add(obj5);
                    }
                }
                List list4 = ezd0Var.f;
                ArrayList arrayList5 = new ArrayList();
                for (Object obj6 : list4) {
                    if (((azd0) obj6).f1712a != -1) {
                        arrayList5.add(obj6);
                    }
                }
                int i5 = -1;
                int iA3 = wp20.a(r3d.q(arrayList4, 10));
                if (iA3 < 16) {
                    iA3 = 16;
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(iA3);
                for (Object obj7 : arrayList4) {
                    linkedHashMap3.put(((azd0) obj7).b, obj7);
                }
                int iA4 = wp20.a(r3d.q(arrayList5, 10));
                LinkedHashMap linkedHashMap4 = new LinkedHashMap(iA4 >= 16 ? iA4 : 16);
                for (Object obj8 : arrayList5) {
                    linkedHashMap4.put(((azd0) obj8).b, obj8);
                }
                LinkedHashSet linkedHashSetG2 = eui0.g(linkedHashMap3.keySet(), linkedHashMap4.keySet());
                arrayList = new ArrayList();
                Iterator it2 = linkedHashSetG2.iterator();
                while (it2.hasNext()) {
                    String str6 = (String) it2.next();
                    azd0 azd0Var = (azd0) linkedHashMap3.get(str6);
                    azd0 azd0Var2 = (azd0) linkedHashMap4.get(str6);
                    int i6 = azd0Var != null ? azd0Var.c : i5;
                    int i7 = azd0Var2 != null ? azd0Var2.c : i5;
                    if (i6 > 0 || i7 > 0) {
                        dbm0 dbm0Var4 = new dbm0(ohs0.n(i6 < 0 ? "-" : String.valueOf(i6), TokenNames.X), i6 > i7 ? h3h0.f12386a : h3h0.b);
                        StringBuilder sb2 = new StringBuilder(ujn.h);
                        String lowerCase2 = str6.toLowerCase(Locale.ROOT);
                        lowerCase2.getClass();
                        String str7 = "/static/img/ImgDefault/Esports/Real/Rainbow/Operators/" + lowerCase2 + ".png";
                        if (str7.length() == 0) {
                            sb2.setLength(0);
                        } else {
                            if (StringsKt.O(str7, ujn.h, false)) {
                                i = 0;
                            } else if (kotlin.text.c.x(str7, "https://", false)) {
                                i = 0;
                            } else {
                                if (sb2.length() <= 0 || StringsKt.S(sb2, Separators.SLASH)) {
                                    c = '/';
                                } else {
                                    sb2.append('/');
                                    c = '/';
                                }
                                sb2.append(StringsKt.y0(str7, c));
                            }
                            sb2.setLength(i);
                            sb2.append(str7);
                        }
                        fbm0Var = new fbm0(dbm0Var4, new cbm0(sb2.toString(), str6), new dbm0(ohs0.n(i7 < 0 ? "-" : String.valueOf(i7), TokenNames.X), i7 > i6 ? h3h0.f12386a : h3h0.b));
                    } else {
                        fbm0Var = null;
                    }
                    if (fbm0Var != null) {
                        arrayList.add(fbm0Var);
                    }
                    linkedHashMap4 = linkedHashMap4;
                    it2 = it2;
                    linkedHashMap3 = linkedHashMap3;
                    i5 = -1;
                }
            } else {
                arrayList = iun.f15405a;
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        lc00Var.add(new psv("STATISTIC_BANS_HEADER", R.string.ban_statistics));
        lc00Var.add(boo0VarK);
        lc00Var.add(new kbm0(lep0Var, dyb.r0(arrayList), z2));
    }

    public static final void B(lc00 lc00Var, List list, ctf0 ctf0Var) {
        Pair pair;
        String strValueOf;
        String strValueOf2;
        StaticColors staticColors;
        long jM123getWhite0d7_KjU;
        list.getClass();
        ctf0Var.getClass();
        if (Q(list)) {
            return;
        }
        boolean z = false;
        ypf ypfVar = (ypf) CollectionsKt.W(0, list);
        ypf ypfVar2 = (ypf) CollectionsKt.W(1, list);
        Pair pair2 = (ypfVar == null || ypfVar2 == null) ? null : new Pair(ypfVar, ypfVar2);
        if (pair2 == null) {
            return;
        }
        ypf ypfVar3 = (ypf) pair2.f46059a;
        ypf ypfVar4 = (ypf) pair2.b;
        StaticColors staticColors2 = StaticColors.INSTANCE;
        f2a0 f2a0Var = new f2a0(staticColors2.m82getDarkBlue100d7_KjU(), staticColors2.m81getDarkBlue0d7_KjU(), ypfVar3.c, ypfVar3.b, ypfVar3.h, ypfVar3.g, ypfVar3.f);
        f2a0 f2a0Var2 = new f2a0(staticColors2.m99getGreen100d7_KjU(), staticColors2.m98getGreen0d7_KjU(), ypfVar4.c, ypfVar4.b, ypfVar4.h, ypfVar4.g, ypfVar4.f);
        long jM81getDarkBlue0d7_KjU = staticColors2.m81getDarkBlue0d7_KjU();
        long jM98getGreen0d7_KjU = staticColors2.m98getGreen0d7_KjU();
        long jM84getDarkBlue300d7_KjU = staticColors2.m84getDarkBlue300d7_KjU();
        long jM101getGreen300d7_KjU = staticColors2.m101getGreen300d7_KjU();
        List list2 = ypfVar3.i;
        List list3 = ypfVar4.i;
        ArrayList arrayList = new ArrayList(r3d.q(list2, 10));
        Iterator it = list2.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            cqf cqfVar = (cqf) next;
            dqf dqfVar = cqfVar.b;
            float f = cqfVar.f4792a;
            dqf dqfVar2 = dqf.e;
            boolean z2 = dqfVar == dqfVar2 ? true : z;
            Float fValueOf = Float.valueOf(100.0f);
            Float fValueOf2 = Float.valueOf(1.0f);
            if (dqfVar == dqf.c) {
                pair = new Pair(ctf0Var.b.a(R.string.cs2_kills_per_round, Arrays.copyOf(new Object[0], 0)), fValueOf2);
            } else if (dqfVar == dqfVar2) {
                pair = new Pair(ctf0Var.b.a(R.string.cs2_death_per_round, Arrays.copyOf(new Object[0], 0)), fValueOf2);
            } else if (dqfVar == dqf.f) {
                pair = new Pair(ctf0Var.b.a(R.string.cs2_kast_caps, Arrays.copyOf(new Object[0], 0)), fValueOf);
            } else if (dqfVar == dqf.b) {
                pair = new Pair(ctf0Var.b.a(R.string.cs2_impact, Arrays.copyOf(new Object[0], 0)), Float.valueOf(3.0f));
            } else if (dqfVar == dqf.f6512a) {
                pair = new Pair(ctf0Var.b.a(R.string.cs2_adr, Arrays.copyOf(new Object[0], 0)), fValueOf);
            } else {
                pair = dqfVar == dqf.d ? new Pair(ctf0Var.b.a(R.string.cs2_rating, Arrays.copyOf(new Object[0], 0)), Float.valueOf(1.5f)) : new Pair("", Float.valueOf(0.0f));
            }
            float f2 = cqfVar.f4792a;
            float f3 = ((cqf) list3.get(i)).f4792a;
            dqf dqfVar3 = cqfVar.b;
            dqf dqfVar4 = dqf.f;
            if (dqfVar3 == dqfVar4) {
                strValueOf = f + Separators.PERCENT;
            } else {
                strValueOf = String.valueOf(f);
            }
            String str = strValueOf;
            float f4 = ((cqf) list3.get(i)).f4792a;
            Iterator it2 = it;
            if (((cqf) list3.get(i)).b == dqfVar4) {
                strValueOf2 = f4 + Separators.PERCENT;
            } else {
                strValueOf2 = String.valueOf(f4);
            }
            String str2 = strValueOf2;
            float f5 = ((cqf) list3.get(i)).f4792a;
            if (!z2 ? f >= f5 : f <= f5) {
                staticColors = StaticColors.INSTANCE;
                jM123getWhite0d7_KjU = staticColors.m129getWhite400d7_KjU();
            } else {
                staticColors = StaticColors.INSTANCE;
                jM123getWhite0d7_KjU = staticColors.m123getWhite0d7_KjU();
            }
            long j = jM123getWhite0d7_KjU;
            float f6 = ((cqf) list3.get(i)).f4792a;
            arrayList.add(new o2a0(f2, f3, str, str2, j, (!z2 ? f6 >= f : f6 <= f) ? staticColors.m129getWhite400d7_KjU() : staticColors.m123getWhite0d7_KjU(), ((Number) pair.b).floatValue(), z2, (String) pair.f46059a));
            i = i2;
            it = it2;
            z = false;
        }
        lc00Var.add(new hga0(f2a0Var, f2a0Var2, new q2a0(dyb.r0(arrayList), jM81getDarkBlue0d7_KjU, jM98getGreen0d7_KjU, jM84getDarkBlue300d7_KjU, jM101getGreen300d7_KjU), dyb.g0(bga0.f2545a, aga0.f816a)));
    }

    public static int C(the0 the0Var, pa80 pa80Var, View view, View view2, androidx.recyclerview.widget.b bVar, boolean z) {
        if (bVar.I() == 0 || the0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(androidx.recyclerview.widget.b.T(view) - androidx.recyclerview.widget.b.T(view2)) + 1;
        }
        return Math.min(pa80Var.n(), pa80Var.d(view2) - pa80Var.g(view));
    }

    public static int D(the0 the0Var, pa80 pa80Var, View view, View view2, androidx.recyclerview.widget.b bVar, boolean z, boolean z2) {
        if (bVar.I() == 0 || the0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z2 ? Math.max(0, (the0Var.b() - Math.max(androidx.recyclerview.widget.b.T(view), androidx.recyclerview.widget.b.T(view2))) - 1) : Math.max(0, Math.min(androidx.recyclerview.widget.b.T(view), androidx.recyclerview.widget.b.T(view2)));
        if (z) {
            return Math.round((iMax * (Math.abs(pa80Var.d(view2) - pa80Var.g(view)) / (Math.abs(androidx.recyclerview.widget.b.T(view) - androidx.recyclerview.widget.b.T(view2)) + 1))) + (pa80Var.m() - pa80Var.g(view)));
        }
        return iMax;
    }

    public static int E(the0 the0Var, pa80 pa80Var, View view, View view2, androidx.recyclerview.widget.b bVar, boolean z) {
        if (bVar.I() == 0 || the0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return the0Var.b();
        }
        return (int) (((pa80Var.d(view2) - pa80Var.g(view)) / (Math.abs(androidx.recyclerview.widget.b.T(view) - androidx.recyclerview.widget.b.T(view2)) + 1)) * the0Var.b());
    }

    public static final boolean F(jge0 jge0Var, float f, float f2) {
        float f3 = jge0Var.f16474a;
        if (f > jge0Var.c || f3 > f) {
            return false;
        }
        return f2 <= jge0Var.d && jge0Var.b <= f2;
    }

    public static final Object G(q16 q16Var) throws vkk0, mm90, zhi0, dox, nqt0 {
        vvq vvqVar;
        List<svq> list;
        u0f0 u0f0Var;
        Object qrpVar;
        Object obj;
        vvq vvqVar2;
        q16Var.getClass();
        String str = q16Var.f27936a;
        Object obj2 = q16Var.d;
        boolean z = q16Var.b;
        kuw kuwVar = q16Var.c;
        if (kuwVar == i2o.PhoneWasActivated && str != null && str.length() != 0) {
            throw new mm90();
        }
        if (kuwVar == i2o.UserAlreadyExist && str != null && str.length() != 0) {
            throw new nqt0();
        }
        if (kuwVar == i2o.SomethingWrong && str != null && str.length() != 0) {
            throw new vkk0(str);
        }
        if (kuwVar == i2o.NotFound && str != null && str.length() != 0) {
            throw new orv0();
        }
        if (str != null && str.length() != 0) {
            throw new zhi0(str, kuwVar, (Integer) null, 12);
        }
        if (obj2 == null) {
            jf4.k(null);
            return null;
        }
        if (!z) {
            jf4.k(null);
            return null;
        }
        boolean z2 = obj2 instanceof dn4;
        dn4 dn4Var = z2 ? (dn4) obj2 : null;
        List list2 = (dn4Var == null || (vvqVar2 = dn4Var.d) == null) ? null : vvqVar2.f38114a;
        if (list2 == null || list2.isEmpty()) {
            return obj2;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        dn4 dn4Var2 = z2 ? (dn4) obj2 : null;
        if (dn4Var2 != null && (vvqVar = dn4Var2.d) != null && (list = vvqVar.f38114a) != null) {
            for (svq svqVar : list) {
                w0f0 w0f0Var = svqVar.f32881a;
                if (w0f0Var != null) {
                    switch (w0f0Var.ordinal()) {
                        case 0:
                            u0f0Var = u0f0.f34852a;
                            break;
                        case 1:
                            u0f0Var = u0f0.b;
                            break;
                        case 2:
                            u0f0Var = u0f0.c;
                            break;
                        case 3:
                            u0f0Var = u0f0.d;
                            break;
                        case 4:
                            u0f0Var = u0f0.e;
                            break;
                        case 5:
                            u0f0Var = u0f0.f;
                            break;
                        case 6:
                            u0f0Var = u0f0.g;
                            break;
                        case 7:
                            u0f0Var = u0f0.h;
                            break;
                        case 8:
                            u0f0Var = u0f0.i;
                            break;
                        case 9:
                            u0f0Var = u0f0.j;
                            break;
                        case 10:
                            u0f0Var = u0f0.k;
                            break;
                        case 11:
                            u0f0Var = u0f0.l;
                            break;
                        case 12:
                            u0f0Var = u0f0.n;
                            break;
                        case 13:
                            u0f0Var = u0f0.o;
                            break;
                        case 14:
                            u0f0Var = u0f0.p;
                            break;
                        case 15:
                            u0f0Var = u0f0.q;
                            break;
                        case 16:
                            u0f0Var = u0f0.r;
                            break;
                        case 17:
                            u0f0Var = u0f0.s;
                            break;
                        case 18:
                            u0f0Var = u0f0.t;
                            break;
                        case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                            u0f0Var = u0f0.u;
                            break;
                        case 20:
                            u0f0Var = u0f0.v;
                            break;
                        case 21:
                            u0f0Var = u0f0.w;
                            break;
                        case 22:
                            u0f0Var = u0f0.x;
                            break;
                        case 23:
                            u0f0Var = u0f0.o1;
                            break;
                        case 24:
                            u0f0Var = u0f0.p1;
                            break;
                        case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                            u0f0Var = u0f0.n1;
                            break;
                        case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                            u0f0Var = u0f0.y;
                            break;
                        case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                            u0f0Var = u0f0.z;
                            break;
                        case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                            u0f0Var = u0f0.A;
                            break;
                        case AvailableCode.HMS_IS_SPOOF /* 29 */:
                            u0f0Var = u0f0.B;
                            break;
                        case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                            u0f0Var = u0f0.s1;
                            break;
                        case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                            u0f0Var = u0f0.Y;
                            break;
                        case 32:
                            u0f0Var = u0f0.Z;
                            break;
                        case 33:
                            u0f0Var = u0f0.q1;
                            break;
                        case 34:
                            u0f0Var = u0f0.l1;
                            break;
                        case 35:
                            u0f0Var = u0f0.m1;
                            break;
                        case 36:
                            u0f0Var = u0f0.r1;
                            break;
                        default:
                            t9f.b();
                            return null;
                    }
                    String str2 = svqVar.b;
                    if (str2 == null) {
                        str2 = "";
                    }
                    switch (u0f0Var.ordinal()) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 12:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                        case 20:
                        case 21:
                        case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 43:
                            qrpVar = new qrp(str2);
                            obj = qrpVar;
                            linkedHashMap.put(u0f0Var, obj);
                            break;
                        case 11:
                            qrpVar = new mrp(str2);
                            obj = qrpVar;
                            linkedHashMap.put(u0f0Var, obj);
                            break;
                        case 13:
                            qrpVar = new mrp(str2);
                            obj = qrpVar;
                            linkedHashMap.put(u0f0Var, obj);
                            break;
                        case 22:
                        case 23:
                        case 24:
                        case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                        case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                        case AvailableCode.HMS_IS_SPOOF /* 29 */:
                        case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                        case 32:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                            obj = lrp.f20544a;
                            linkedHashMap.put(u0f0Var, obj);
                            break;
                        default:
                            t9f.b();
                            return null;
                    }
                }
            }
        }
        throw new dox(linkedHashMap);
    }

    public static final xyw H(bb6 bb6Var, ctf0 ctf0Var, int i) {
        ctf0Var.getClass();
        int iA = bb6Var.a(ctf0Var.b.a(i, Arrays.copyOf(new Object[0], 0)), dkq.DRAWABLE);
        return iA != 0 ? new wyw(iA) : new vyw(ctf0.b(R.attr.uikitSplashBackground, ctf0Var));
    }

    public static final xzm I(String str, List list) {
        StringBuilder sb = new StringBuilder(ujn.h);
        String str2 = (String) CollectionsKt.firstOrNull(list);
        if (str2 == null) {
            str2 = "";
        }
        if (str2.length() == 0) {
            sb.setLength(0);
        } else if (StringsKt.O(str2, ujn.h, false) || kotlin.text.c.x(str2, "https://", false)) {
            sb.setLength(0);
            sb.append(str2);
        } else {
            if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                sb.append('/');
            }
            sb.append(StringsKt.y0(str2, '/'));
        }
        return new xzm(str, new c280(sb.toString(), R.drawable.no_photo_new));
    }

    public static final e900 J(fet fetVar) {
        x7x x7xVarR = b8k0.r(b8k0.V("", fetVar, 0), -500.0f, 500.0f, ro4.b0(ro4.m0(1000, 0, ihn.d, 2), kkf0.f18436a, 0L, 4), "", fetVar, 29064, 0);
        zfn zfnVar = zaq0.b;
        return new e900(q3d.j(new y3d(((ThemeColors) fetVar.k(zfnVar)).getSecondary20()), new y3d(((ThemeColors) fetVar.k(zfnVar)).getBackground()), new y3d(((ThemeColors) fetVar.k(zfnVar)).getSecondary20())), null, (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (Float.floatToRawIntBits(((Number) x7xVarR.getValue()).floatValue()) << 32), (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (Float.floatToRawIntBits(((Number) x7xVarR.getValue()).floatValue() + 500.0f) << 32));
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0039  */
    public static final ArrayList K(List list) {
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = ((y3n0) it.next()).b;
            str.getClass();
            if (!kotlin.text.c.x(str, ujn.h, false)) {
                if (str.length() == 0) {
                    str = "";
                } else {
                    List list2 = u0d.f34849a;
                    if (u0d.c(str)) {
                        str = "";
                    } else {
                        str = String.format(Locale.ENGLISH, StringsKt.O(str, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str}, 2));
                    }
                }
            }
            arrayList.add(str);
        }
        return arrayList;
    }

    public static final String L(long j) {
        return String.format(Locale.ENGLISH, "%02d", Arrays.copyOf(new Object[]{Long.valueOf(j)}, 1));
    }

    public static mdm M(g2v g2vVar) {
        ldm ldmVar = ldm.f19857a;
        g2vVar.getClass();
        return g2v.b(g2vVar, pb10.r, null, ldmVar, 0, 0, R.string.currently_no_events, 0, R.string.try_again_text, 10000L, 0L, 602);
    }

    public static final mdm N(g2v g2vVar, ldm ldmVar) {
        g2vVar.getClass();
        return g2v.b(g2vVar, pb10.r, null, ldmVar, 0, 0, R.string.data_retrieval_error, 0, R.string.try_again_text, 10000L, 0L, 602);
    }

    public static final mdm O(g2v g2vVar) {
        return g2v.b(g2vVar, pb10.q, null, ldm.b, 0, 0, 0, 0, 0, 0L, 0L, 1018);
    }

    public static final boolean P(List list, vr20 vr20Var, long j) {
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ru6 ru6Var = (ru6) it.next();
            if (ru6Var.d == j && ru6Var.h == vr20Var.b && ru6Var.g == vr20Var.m.f30476a && ru6Var.f == vr20Var.f) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0070  */
    /* JADX WARN: Code duplicated, block: B:40:0x007a  */
    /* JADX WARN: Code duplicated, block: B:46:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:? A[LOOP:0: B:38:0x0074->B:47:?, LOOP_END, SYNTHETIC] */
    public static final boolean Q(List list) {
        List list2;
        List list3;
        Iterator it;
        list.getClass();
        if (list.size() == 2) {
            ypf ypfVar = (ypf) CollectionsKt.W(0, list);
            ypf ypfVar2 = (ypf) CollectionsKt.W(1, list);
            if (ypfVar != null && (list2 = ypfVar.i) != null && list2.size() == 6 && ypfVar2 != null && (list3 = ypfVar2.i) != null && list3.size() == 6 && ypfVar.b.length() != 0 && ypfVar2.b.length() != 0) {
                if (list2 != null && list2.isEmpty()) {
                    if (list3 != null) {
                        it = list3.iterator();
                        while (it.hasNext()) {
                            if (((cqf) it.next()).f4792a == -1.0f) {
                            }
                        }
                    } else {
                        it = list3.iterator();
                        while (it.hasNext()) {
                            if (((cqf) it.next()).f4792a == -1.0f) {
                            }
                        }
                    }
                    return false;
                }
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    if (((cqf) it2.next()).f4792a == -1.0f) {
                    }
                }
                if (list3 != null || !list3.isEmpty()) {
                    it = list3.iterator();
                    while (it.hasNext()) {
                        if (((cqf) it.next()).f4792a == -1.0f) {
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    public static final boolean R(zg50 zg50Var) {
        zg50Var.getClass();
        return zg50Var.e == 1;
    }

    public static final boolean S(String str, String str2, n3q n3qVar, long j) {
        str.getClass();
        str2.getClass();
        return (tx3.l0(new Long[]{189L, 56L, 9L, 182L}).contains(Long.valueOf(j)) && str.equals("0") && str2.equals("0")) || n3qVar == n3q.b;
    }

    public static final boolean T(ctf0 ctf0Var) {
        return ctf0Var.c() <= 380;
    }

    public static final mm40 U(mm40 mm40Var, float f) {
        mm40Var.getClass();
        return mm40Var.e(knx.Q(jm40.b, new k82(f, (byte) 4)));
    }

    public static final mm40 V(mm40 mm40Var, boolean z) {
        mm40Var.getClass();
        return z ? r8x.X(mm40Var, -1.0f, 1.0f) : mm40Var;
    }

    public static final mm40 W(int i, int i2, fet fetVar, mm40 mm40Var, Function0 function0, boolean z) {
        mm40Var.getClass();
        function0.getClass();
        boolean z2 = true;
        if ((i2 & 1) != 0) {
            z = true;
        }
        mm40 mm40VarW = jm40.b;
        if (z) {
            fetVar.e0(-1119303414);
            if ((((i & 896) ^ 384) <= 256 || !fetVar.g(function0)) && (i & 384) != 256) {
                z2 = false;
            }
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                o0t o0tVar = new o0t(0, function0, Function0.class, "invoke", "invoke()Ljava/lang/Object;", 0, (byte) 29);
                fetVar.o0(o0tVar);
                objP = o0tVar;
            }
            mm40VarW = y860.W(mm40VarW, null, null, false, null, (Function0) ((jhy) objP), 28);
            fetVar.r(false);
        } else {
            fetVar.e0(-1119126373);
            fetVar.r(false);
        }
        return mm40Var.e(mm40VarW);
    }

    public static final mm40 X(mm40 mm40Var, Function1 function1, fet fetVar, int i) {
        mm40Var.getClass();
        if ((i & 1) != 0) {
            function1 = null;
        }
        WeakHashMap weakHashMap = djv0.w;
        return mm40Var.e(new np80(zcm0.i(fetVar).f, function1));
    }

    public static final Object Y(Function2 function2) {
        Thread.interrupted();
        return eeq.U(kotlin.coroutines.g.f46065a, new tye0(function2, null, (byte) 18));
    }

    public static final void Z(SpannableString spannableString, int i, int i2, int i3) {
        spannableString.setSpan(new StyleSpan(i), i2, i3, 33);
    }

    public static final void a(a4x a4xVar, Function1 function1, fet fetVar, int i) {
        fetVar.g0(-612201073);
        char c = 2;
        int i2 = i | (fetVar.g(a4xVar) ? 4 : 2) | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarQ = i120.Q(s5x0.L(mm40VarD, qmk.a(fetVar).c, 0.0f, 2), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), vgg0.a(16.0f));
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
            mm40 mm40VarL = s5x0.L(o7k0.d(jm40Var, 1.0f), 0.0f, 8.0f, 1);
            fyl fylVar = new fyl(a4xVar, tyl.b, syl.b, null, null, 24);
            vxl vxlVar = vxl.b;
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new i160(function1, (byte) 9);
                fetVar.o0(objP);
            }
            ebc.r(mm40VarL, fylVar, vxlVar, (Function1) objP, null, fetVar, 384, 40);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new q0h(c, i, a4xVar, function1);
        }
    }

    public static final String a0(Object obj) {
        return kng0.l(obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName(), Separators.AT, String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1)));
    }

    public static final void b(mm40 mm40Var, fqj0 fqj0Var, fet fetVar, int i) {
        int i2;
        mm40Var.getClass();
        fqj0Var.getClass();
        fetVar.g0(1980906513);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(fqj0Var) ? 32 : 16;
        }
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(o7k0.s(mm40Var, 84.0f), 32.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), fqj0Var));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gc30(mm40Var, fqj0Var, i, b);
        }
    }

    public static final j83 b0(String str, ng50 ng50Var, boolean z, zi50 zi50Var) {
        long jM123getWhite0d7_KjU;
        ng50Var.getClass();
        h83 h83Var = new h83();
        h83 h83Var2 = new h83();
        String strI = str == null ? "" : str;
        if (z) {
            String str2 = ng50Var.d;
            if (str2.length() > 0) {
                strI = ua80.i(strI, " (", str2, " ov)");
            }
        }
        String strConcat = "\u200e".concat(strI);
        long j = y3d.g;
        long j2 = daq0.c;
        if (y9l0.f42254a[zi50Var.ordinal()] == 1) {
            pz40 pz40Var = s6t0.f31722a;
            jM123getWhite0d7_KjU = StaticColors.INSTANCE.m98getGreen0d7_KjU();
        } else {
            pz40 pz40Var2 = s6t0.f31722a;
            jM123getWhite0d7_KjU = StaticColors.INSTANCE.m123getWhite0d7_KjU();
        }
        smk0 smk0Var = new smk0(jM123getWhite0d7_KjU, j2, null, null, null, null, null, j2, new j56(0.0f), null, null, j, k5q0.b, null, null, 17424);
        h83Var2.c(strConcat);
        StringBuilder sb = h83Var2.f12607a;
        h83Var2.a(smk0Var, 0, sb.length());
        sb.length();
        h83Var.b(h83Var2.h());
        return h83Var.h();
    }

    public static final void c(a4x a4xVar, Function1 function1, fet fetVar, int i) {
        boolean z;
        boolean z2;
        fetVar.g0(-60392268);
        int i2 = 32;
        int i3 = (fetVar.g(a4xVar) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarQ = i120.Q(s5x0.N(mm40VarD, qmk.a(fetVar).c, 0.0f, qmk.a(fetVar).c, 24.0f, 2), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), vgg0.a(16.0f));
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z3 = fetVar.S;
            Function0 function0 = e7z.u1;
            if (z3) {
                fetVar.l(function0);
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
            mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarD2);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(function0);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            Iterator itO = h97.o(fetVar, mm40VarC1, shdVar4, -1954359199, a4xVar);
            while (itO.hasNext()) {
                uvi0 uvi0Var = (uvi0) itO.next();
                rqm rqmVar = uvi0Var.b;
                int i4 = i3 & 112;
                boolean zI = (i4 == i2) | fetVar.i(uvi0Var);
                Object objP = fetVar.P();
                Object obj = ukd.f35823a;
                if (zI || objP == obj) {
                    z = false;
                    objP = new ry60(function1, uvi0Var, (byte) 0);
                    fetVar.o0(objP);
                } else {
                    z = false;
                }
                Function0 function2 = (Function0) objP;
                boolean zI2 = (i4 == i2 ? true : z) | fetVar.i(uvi0Var);
                Object objP2 = fetVar.P();
                if (zI2 || objP2 == obj) {
                    z2 = true;
                    objP2 = new ry60(function1, uvi0Var, (byte) 1);
                    fetVar.o0(objP2);
                } else {
                    z2 = true;
                }
                obc.q(null, rqmVar, false, null, function2, null, (Function0) objP2, null, fetVar, 0, 173);
                i3 = i3;
                i2 = 32;
            }
            ohs0.x(fetVar, false, true, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new q0h((byte) 3, i, a4xVar, function1);
        }
    }

    public static final eml c0(jic0 jic0Var, boolean z, List list, nw80 nw80Var, ctf0 ctf0Var) {
        long j = jic0Var.d;
        String str = jic0Var.e;
        String strA = y4i0.f42004a[nw80Var.ordinal()] == 1 ? ctf0Var.b.a(R.string.slot_game_of_the_week, Arrays.copyOf(new Object[0], 0)) : ctf0Var.b.a(R.string.livecasino_game_of_the_week, Arrays.copyOf(new Object[0], 0));
        StringBuilder sb = new StringBuilder(ujn.h);
        String str2 = jic0Var.c;
        if (str2.length() == 0) {
            sb.setLength(0);
        } else if (StringsKt.O(str2, ujn.h, false) || kotlin.text.c.x(str2, "https://", false)) {
            sb.setLength(0);
            sb.append(str2);
        } else {
            if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                sb.append('/');
            }
            sb.append(StringsKt.y0(str2, '/'));
        }
        return new eml(j, str, strA, new n0x(sb.toString()), new m0x(R.drawable.ic_aggregator_placeholder_vertical, null, 6), z, new m0x(R.drawable.ic_glyph_favourite_active, null, 6), new m0x(R.drawable.ic_glyph_favourite_inactive, null, 6), list.contains(Long.valueOf(jic0Var.d)), ctf0Var.b.a(R.string.aggregator_play, Arrays.copyOf(new Object[0], 0)), false);
    }

    public static final void d(pdm0 pdm0Var, fet fetVar, int i) {
        int i2;
        fetVar.g0(-439390760);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(pdm0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar, 48);
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
            h(pdm0Var.f26815a, fetVar, 0);
            e(null, pdm0Var, fetVar, (i2 << 3) & 112);
            x4d0.k(pdm0Var.e, o7k0.d(jm40Var, 1.0f), fetVar, 48);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o6o(pdm0Var, i, (byte) 23);
        }
    }

    public static final i3n d0(vf50 vf50Var, ctf0 ctf0Var, List list, boolean z, dj50 dj50Var) {
        return new i3n(n6x.t0(vf50Var), q5x.U(vf50Var, ctf0Var, dj50Var), xww.X(vf50Var, ctf0Var), x2x.u0(vf50Var.m, list, z, cap.b, null), x2x.u0(vf50Var.n, list, z, cap.f4022a, null), new w9l0(x1x.V(vf50Var, null)));
    }

    public static final void e(mm40 mm40Var, pdm0 pdm0Var, fet fetVar, int i) {
        String str;
        String str2;
        fetVar.g0(1588467145);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(pdm0Var) ? 32 : 16;
        }
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 12.0f, 0.0f, 0.0f, 13);
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
            znp0 znp0Var = pdm0Var.b;
            p5h0 p5h0Var = pdm0Var.d;
            boolean z = p5h0Var instanceof n5h0;
            n5h0 n5h0Var = z ? (n5h0) p5h0Var : null;
            String str3 = "0";
            if (n5h0Var == null || (str = n5h0Var.f22944a) == null) {
                str = "0";
            }
            n(znp0Var, str, fetVar, 0);
            znp0 znp0Var2 = pdm0Var.c;
            n5h0 n5h0Var2 = z ? (n5h0) p5h0Var : null;
            if (n5h0Var2 != null && (str2 = n5h0Var2.b) != null) {
                str3 = str2;
            }
            n(znp0Var2, str3, fetVar, 0);
            fetVar.r(true);
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new jdf(mm40Var, pdm0Var, i, b);
        }
    }

    public static final ial0 e0(eh50 eh50Var, List list, boolean z) {
        cap capVar = cap.f4022a;
        eh50Var.getClass();
        ah50 ah50Var = (ah50) CollectionsKt.firstOrNull(eh50Var.d);
        return new ial0(eh50Var.b, ah50Var != null ? x2x.r0(ah50Var, list, z, capVar) : new e5a0(new c280("", R.drawable.ic_glyph_placeholder_player)));
    }

    public static final void f(qdm0 qdm0Var, boolean z, fet fetVar, int i) {
        int i2;
        k6z k6zVar;
        fetVar.g0(-961381924);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(qdm0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.h(z) ? 32 : 16;
        }
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            if (z) {
                fetVar.e0(-470054749);
                k6zVar = (k6z) fetVar.k(bmd.n);
                fetVar.r(false);
            } else {
                fetVar.e0(-470053825);
                fetVar.r(false);
                k6zVar = k6z.f17794a;
            }
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
            obc.d(bmd.n.a(k6zVar), u1c.M(-1371808110, new xf00(qdm0Var, b), fetVar), fetVar, 56);
            x4d0.k(qdm0Var.c, o7k0.d(jm40Var, 1.0f), fetVar, 48);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yf00(qdm0Var, z, i, b);
        }
    }

    public static final a0z f0(qk80 qk80Var, jam0 jam0Var, boolean z, ctf0 ctf0Var, long j, v5l0 v5l0Var) {
        n3q n3qVar;
        String str;
        int i;
        int i2;
        n3q n3qVar2;
        qk80Var.getClass();
        String str2 = qk80Var.f28874a;
        String str3 = qk80Var.e;
        String str4 = qk80Var.d;
        ctf0Var.getClass();
        List list = qk80Var.n;
        String str5 = qk80Var.g;
        String str6 = qk80Var.f;
        cys0 cys0Var = qk80Var.p;
        List list2 = qk80Var.o;
        String str7 = qk80Var.i;
        String str8 = qk80Var.h;
        y3n0 y3n0Var = (y3n0) CollectionsKt.f0(list);
        String str9 = y3n0Var != null ? y3n0Var.b : null;
        if (str9 == null) {
            str9 = "";
        }
        String strT = vsm0.t(str9);
        y3n0 y3n0Var2 = (y3n0) CollectionsKt.f0(list2);
        String str10 = y3n0Var2 != null ? y3n0Var2.b : null;
        if (str10 == null) {
            str10 = "";
        }
        String strT2 = vsm0.t(str10);
        String strW = a8k0.w(str6, list, cys0Var);
        String strW2 = a8k0.w(str5, list2, cys0Var);
        int iOrdinal = jam0Var.ordinal();
        if (iOrdinal != 4) {
            n3qVar = (iOrdinal == 5 || iOrdinal != 6) ? n3q.b : n3q.c;
        } else {
            n3qVar = n3q.f22862a;
        }
        boolean zS = S(str8, str7, n3qVar, j);
        kbo kboVar = new kbo(str4, strW, str3, strW2, strT, strT2, zS ? "" : str8, zS ? "" : str7, zS, "", "", 0L, qk80Var.k, ctf0Var.h(), kotlin.collections.a.c(new Pair(str8, str7)));
        jam0 jam0Var2 = jam0.f;
        long j2 = qk80Var.l;
        nim0 nim0Var = nim0.f23597a;
        mim0 mim0VarS = jam0Var != jam0Var2 ? wwb.S(j2, cys0Var, kboVar, v5l0Var, ctf0Var, nim0Var) : ntb.c0(j2, cys0Var, kboVar, v5l0Var, nim0Var);
        String strT3 = vsm0.t(str6);
        String str11 = (String) CollectionsKt.firstOrNull(K(list));
        if (str11 == null) {
            str11 = "";
        }
        String str12 = (String) CollectionsKt.f0(K(list));
        String str13 = str11;
        if (str12 == null) {
            str = "";
            i = 6;
            i2 = 5;
        } else {
            str = str12;
            i = 6;
            i2 = 5;
        }
        znp0 znp0Var = new znp0(r24, str4, strT3, str13, str, z);
        String strT4 = vsm0.t(str5);
        String str14 = (String) CollectionsKt.firstOrNull(K(list2));
        String str15 = str14 == null ? "" : str14;
        String str16 = (String) CollectionsKt.f0(K(list2));
        znp0 znp0Var2 = new znp0(r24, str3, strT4, str15, str16 == null ? "" : str16, z);
        rdj rdjVar = rdj.f30294a;
        String strG = rdj.g(new znq0(qk80Var.j), efj.UNIVERSAL, Boolean.FALSE, false, 56);
        int iOrdinal2 = jam0Var.ordinal();
        if (iOrdinal2 != 4) {
            n3qVar2 = (iOrdinal2 == i2 || iOrdinal2 != i) ? n3q.b : n3q.c;
        } else {
            n3qVar2 = n3q.f22862a;
        }
        return new a0z(str2, qk80Var.l, qk80Var.m, znp0Var, znp0Var2, strG, qk80Var.j, S(r29, str7, n3qVar2, j), str8, str7, mim0VarS);
    }

    public static final void g(fqj0 fqj0Var, fet fetVar, int i) {
        fqj0Var.getClass();
        fetVar.g0(974508729);
        int i2 = (fetVar.g(fqj0Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(o7k0.d(s5x0.N(jm40.b, 0.0f, 8.0f, 0.0f, 8.0f, 5), 1.0f), 62.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), fqj0Var));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new on7((byte) 5, i, fqj0Var);
        }
    }

    public static final wy30 g0(nw30 nw30Var) {
        nw30Var.getClass();
        if (nw30Var instanceof fw30) {
            fw30 fw30Var = (fw30) nw30Var;
            htz htzVar = iz30.f15618a;
            return new sy30(fw30Var.c, fw30Var.h);
        }
        if (nw30Var instanceof lw30) {
            lw30 lw30Var = (lw30) nw30Var;
            return new uy30(lw30Var.b, lw30Var.d, lw30Var.e);
        }
        if (nw30Var instanceof bw30) {
            bw30 bw30Var = (bw30) nw30Var;
            return new uy30(bw30Var.b, bw30Var.d, bw30Var.e);
        }
        if (nw30Var instanceof kw30) {
            kw30 kw30Var = (kw30) nw30Var;
            return new ty30(kw30Var.b, kw30Var.d, kw30Var.e);
        }
        iz30 iz30VarM = nw30Var.m();
        iz30VarM.getClass();
        return new ry30(iz30VarM);
    }

    public static final void h(String str, fet fetVar, int i) {
        fetVar.g0(176423995);
        int i2 = i | (fetVar.g(str) ? 4 : 2);
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            long j = qmk.p;
            long j2 = qmk.q;
            v8q0.a(str, mm40VarD, 0L, new n05(j, j2, qmk.n), 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, ibm0.n(new y9q0(0L, j2, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar), fetVar, (i2 & 14) | 48, 24960, 109556);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hxk((byte) 27, i, str);
        }
    }

    public static final qy30 h0(nw30 nw30Var) {
        if (!(nw30Var instanceof pv30)) {
            return null;
        }
        htz htzVar = iz30.f15618a;
        return new qy30();
    }

    public static final void i(mm40 mm40Var, ygx ygxVar, Function0 function0, ugd ugdVar, ugd ugdVar2, ugd ugdVar3, ugd ugdVar4, fet fetVar, int i) {
        int i2;
        ugd ugdVar5;
        function0.getClass();
        fetVar.g0(1824765954);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar.g(ygxVar) : fetVar.i(ygxVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(ugdVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(ugdVar2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.i(ugdVar3) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= fetVar.i(ugdVar4) ? 1048576 : 524288;
        }
        if (fetVar.U(i2 & 1, (599187 & i2) != 599186)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
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
            jpm0.o(fetVar, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            int i3 = i2;
            mm40 mm40VarW = y860.W(jm40.b, null, null, false, null, function0, 28);
            yx7 yx7Var = gqw0.k;
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), yx7Var, fetVar, 48);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarW);
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
            Object objValueOf = Integer.valueOf(((i3 >> 12) & 112) | 6);
            zhg0 zhg0Var = zhg0.f44392a;
            ugdVar3.F(zhg0Var, fetVar, objValueOf);
            if (ygxVar.e) {
                fetVar.e0(1471687494);
                fetVar.r(false);
            } else {
                fetVar.e0(1471632717);
                h97.p(((i3 >> 9) & 112) | 6, ugdVar2, zhg0Var, fetVar, false);
            }
            h97.p(((i3 >> 15) & 112) | 6, ugdVar4, zhg0Var, fetVar, true);
            ugdVar5 = ugdVar;
            vqd.t(((i3 >> 6) & 112) | 6, ugdVar5, y5d.f42040a, fetVar, true);
        } else {
            ugdVar5 = ugdVar;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t49((Object) mm40Var, (Object) ygxVar, (Object) function0, (Object) ugdVar5, (Object) ugdVar2, (Object) ugdVar3, (Object) ugdVar4, i, (byte) 17);
        }
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0810  */
    /* JADX WARN: Code duplicated, block: B:64:0x0818  */
    public static final nw30 i0(sx10 sx10Var, ctf0 ctf0Var, i240 i240Var, List list, r040 r040Var, String str, boolean z) {
        boolean z2;
        prs0 prs0Var;
        prs0 prs0Var2;
        Integer numValueOf = Integer.valueOf(R.drawable.ic_glyph_cashback);
        Integer numValueOf2 = Integer.valueOf(R.drawable.ic_glyph_slots);
        Integer numValueOf3 = Integer.valueOf(R.drawable.ic_glyph_peak);
        if (list != null && list.isEmpty()) {
            z2 = false;
            break;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                z2 = false;
                break;
            }
            if (((iz30) it.next()) == sx10Var.f32951a) {
                z2 = true;
                break;
            }
        }
        switch (sx10Var.f32951a.ordinal()) {
            case 1:
                prs0Var = new prs0(i240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_live)), ctf0Var.b.a(R.string.live_new, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.menu_live_description, Arrays.copyOf(new Object[0], 0)));
                int iIntValue = ((Number) prs0Var.f27482a).intValue();
                String str2 = (String) prs0Var.b;
                String str3 = (String) prs0Var.c;
                iz30 iz30Var = sx10Var.f32951a;
                return z ? new aw30(iz30Var, z2, r040Var, iIntValue, str2, str3) : new ew30(iz30Var, z2, r040Var, iIntValue, str2, str3);
            case 2:
                prs0Var = new prs0(i240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_line)), ctf0Var.b.a(R.string.line, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.menu_line_description, Arrays.copyOf(new Object[0], 0)));
                int iIntValue2 = ((Number) prs0Var.f27482a).intValue();
                String str4 = (String) prs0Var.b;
                String str5 = (String) prs0Var.c;
                iz30 iz30Var2 = sx10Var.f32951a;
                if (z) {
                }
            case 3:
                prs0Var = new prs0(i240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_express)), ctf0Var.b.a(R.string.day_express, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.menu_day_express_description, Arrays.copyOf(new Object[0], 0)));
                int iIntValue3 = ((Number) prs0Var.f27482a).intValue();
                String str6 = (String) prs0Var.b;
                String str7 = (String) prs0Var.c;
                iz30 iz30Var3 = sx10Var.f32951a;
                if (z) {
                }
            case 4:
                prs0Var = new prs0(i240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_stream)), ctf0Var.b.a(R.string.stream_title, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.menu_stream_description, Arrays.copyOf(new Object[0], 0)));
                int iIntValue4 = ((Number) prs0Var.f27482a).intValue();
                String str8 = (String) prs0Var.b;
                String str9 = (String) prs0Var.c;
                iz30 iz30Var4 = sx10Var.f32951a;
                if (z) {
                }
            case 5:
            case 13:
            case 14:
            case 15:
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
            case 21:
            case 23:
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
            case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
            case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
            case 39:
            case 40:
            case 46:
            case 47:
            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
            case 52:
            case 53:
            case 54:
            case 61:
            default:
                return new ew30(iz30.b, false, r040.SPORTS, 0, "", "");
            case 6:
                prs0Var = new prs0(i240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_results)), ctf0Var.b.a(R.string.results, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.menu_results_description, Arrays.copyOf(new Object[0], 0)));
                int iIntValue5 = ((Number) prs0Var.f27482a).intValue();
                String str10 = (String) prs0Var.b;
                String str11 = (String) prs0Var.c;
                iz30 iz30Var5 = sx10Var.f32951a;
                if (z) {
                }
            case 7:
                prs0Var = new prs0(i240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_bets_on_yours)), ctf0Var.b.a(R.string.bets_on_yours, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.menu_bet_on_favorites_description, Arrays.copyOf(new Object[0], 0)));
                int iIntValue6 = ((Number) prs0Var.f27482a).intValue();
                String str12 = (String) prs0Var.b;
                String str13 = (String) prs0Var.c;
                iz30 iz30Var6 = sx10Var.f32951a;
                if (z) {
                }
            case 8:
                prs0Var = new prs0(i240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_tv_bet)), ctf0Var.b.a(R.string.tv_bet_casino_title, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.menu_tvbet_description_item, Arrays.copyOf(new Object[0], 0)));
                int iIntValue7 = ((Number) prs0Var.f27482a).intValue();
                String str14 = (String) prs0Var.b;
                String str15 = (String) prs0Var.c;
                iz30 iz30Var7 = sx10Var.f32951a;
                if (z) {
                }
            case 9:
                prs0Var = new prs0(i240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_games)), ctf0Var.b.a(R.string.all_games, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.menu_one_x_games_description, Arrays.copyOf(new Object[0], 0)));
                int iIntValue8 = ((Number) prs0Var.f27482a).intValue();
                String str16 = (String) prs0Var.b;
                String str17 = (String) prs0Var.c;
                iz30 iz30Var8 = sx10Var.f32951a;
                if (z) {
                }
            case 10:
                prs0Var = new prs0(i240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_promo_games)), ctf0Var.b.a(R.string.bonuses, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.menu_one_x_games_promo_description, Arrays.copyOf(new Object[0], 0)));
                int iIntValue9 = ((Number) prs0Var.f27482a).intValue();
                String str18 = (String) prs0Var.b;
                String str19 = (String) prs0Var.c;
                iz30 iz30Var9 = sx10Var.f32951a;
                if (z) {
                }
            case 11:
                prs0Var2 = new prs0(i240Var.invoke(numValueOf), ctf0Var.b.a(R.string.cashback, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.menu_one_x_games_item_cashback_description, Arrays.copyOf(new Object[0], 0)));
                prs0Var = prs0Var2;
                int iIntValue10 = ((Number) prs0Var.f27482a).intValue();
                String str110 = (String) prs0Var.b;
                String str111 = (String) prs0Var.c;
                iz30 iz30Var10 = sx10Var.f32951a;
                if (z) {
                }
            case 12:
                prs0Var = new prs0(i240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_favourite_active)), ctf0Var.b.a(R.string.favorites_name, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.menu_one_x_games_favorites_description, Arrays.copyOf(new Object[0], 0)));
                int iIntValue11 = ((Number) prs0Var.f27482a).intValue();
                String str112 = (String) prs0Var.b;
                String str113 = (String) prs0Var.c;
                iz30 iz30Var11 = sx10Var.f32951a;
                if (z) {
                }
            case 16:
                prs0Var = new prs0(i240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_financial)), ctf0Var.b.a(R.string.finance_bets, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.menu_finbets_description, Arrays.copyOf(new Object[0], 0)));
                int iIntValue12 = ((Number) prs0Var.f27482a).intValue();
                String str114 = (String) prs0Var.b;
                String str115 = (String) prs0Var.c;
                iz30 iz30Var12 = sx10Var.f32951a;
                if (z) {
                }
            case 17:
                prs0Var = new prs0(i240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_betconstructor)), ctf0Var.b.a(R.string.betconstructor, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.menu_betconstructor_description, Arrays.copyOf(new Object[0], 0)));
                int iIntValue13 = ((Number) prs0Var.f27482a).intValue();
                String str116 = (String) prs0Var.b;
                String str117 = (String) prs0Var.c;
                iz30 iz30Var13 = sx10Var.f32951a;
                if (z) {
                }
            case 18:
                prs0Var = new prs0(i240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_qr_scanning)), ctf0Var.b.a(R.string.scanner, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.menu_coupon_scanner_description, Arrays.copyOf(new Object[0], 0)));
                int iIntValue14 = ((Number) prs0Var.f27482a).intValue();
                String str118 = (String) prs0Var.b;
                String str119 = (String) prs0Var.c;
                iz30 iz30Var14 = sx10Var.f32951a;
                if (z) {
                }
            case 20:
                prs0Var = new prs0(i240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_notification_active)), ctf0Var.b.a(R.string.notifications_title, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.menu_notifications_description, Arrays.copyOf(new Object[0], 0)));
                int iIntValue15 = ((Number) prs0Var.f27482a).intValue();
                String str1110 = (String) prs0Var.b;
                String str1111 = (String) prs0Var.c;
                iz30 iz30Var15 = sx10Var.f32951a;
                if (z) {
                }
            case 22:
                prs0Var = new prs0(i240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_info)), ctf0Var.b.a(R.string.info, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.menu_info_description, Arrays.copyOf(new Object[0], 0)));
                int iIntValue16 = ((Number) prs0Var.f27482a).intValue();
                String str1112 = (String) prs0Var.b;
                String str1113 = (String) prs0Var.c;
                iz30 iz30Var16 = sx10Var.f32951a;
                if (z) {
                }
            case 24:
                prs0Var = new prs0(i240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_authenticator)), ctf0Var.b.a(R.string.authenticator, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.authenticator_description, Arrays.copyOf(new Object[0], 0)));
                int iIntValue17 = ((Number) prs0Var.f27482a).intValue();
                String str1114 = (String) prs0Var.b;
                String str1115 = (String) prs0Var.c;
                iz30 iz30Var17 = sx10Var.f32951a;
                if (z) {
                }
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                prs0Var = new prs0(i240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_telegram)), ctf0Var.b.a(R.string.menu_telegram_bot_title, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.menu_telegram_bot_description_v2, Arrays.copyOf(new Object[]{str}, 1)));
                int iIntValue18 = ((Number) prs0Var.f27482a).intValue();
                String str1116 = (String) prs0Var.b;
                String str1117 = (String) prs0Var.c;
                iz30 iz30Var18 = sx10Var.f32951a;
                if (z) {
                }
            case 32:
                prs0Var = new prs0(i240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_cyber_gamepad)), ctf0Var.b.a(R.string.cyber_sport, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.menu_cyber_description, Arrays.copyOf(new Object[0], 0)));
                int iIntValue19 = ((Number) prs0Var.f27482a).intValue();
                String str1118 = (String) prs0Var.b;
                String str1119 = (String) prs0Var.c;
                iz30 iz30Var19 = sx10Var.f32951a;
                if (z) {
                }
            case 33:
                prs0Var = new prs0(i240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_ufc)), ctf0Var.b.a(R.string.ufc_title, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.menu_ufc_description, Arrays.copyOf(new Object[0], 0)));
                int iIntValue110 = ((Number) prs0Var.f27482a).intValue();
                String str11110 = (String) prs0Var.b;
                String str11111 = (String) prs0Var.c;
                iz30 iz30Var110 = sx10Var.f32951a;
                if (z) {
                }
            case 34:
                prs0Var = new prs0(i240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_cards)), ctf0Var.b.a(R.string.my_casino, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.casino_my_description, Arrays.copyOf(new Object[0], 0)));
                int iIntValue111 = ((Number) prs0Var.f27482a).intValue();
                String str11112 = (String) prs0Var.b;
                String str11113 = (String) prs0Var.c;
                iz30 iz30Var111 = sx10Var.f32951a;
                if (z) {
                }
            case 35:
                prs0Var = new prs0(i240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_categories)), ctf0Var.b.a(R.string.casino_category_title, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.casino_category_description, Arrays.copyOf(new Object[0], 0)));
                int iIntValue112 = ((Number) prs0Var.f27482a).intValue();
                String str11114 = (String) prs0Var.b;
                String str11115 = (String) prs0Var.c;
                iz30 iz30Var112 = sx10Var.f32951a;
                if (z) {
                }
            case 36:
                prs0Var = new prs0(i240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_tournaments)), ctf0Var.b.a(R.string.casino_tour_title, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.casino_tour_description, Arrays.copyOf(new Object[0], 0)));
                int iIntValue113 = ((Number) prs0Var.f27482a).intValue();
                String str11116 = (String) prs0Var.b;
                String str11117 = (String) prs0Var.c;
                iz30 iz30Var113 = sx10Var.f32951a;
                if (z) {
                }
            case 37:
                prs0Var = new prs0(i240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_promo_aggregator)), ctf0Var.b.a(R.string.casino_promo_title, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.casino_promo_description, Arrays.copyOf(new Object[0], 0)));
                int iIntValue114 = ((Number) prs0Var.f27482a).intValue();
                String str11118 = (String) prs0Var.b;
                String str11119 = (String) prs0Var.c;
                iz30 iz30Var114 = sx10Var.f32951a;
                if (z) {
                }
            case 38:
                prs0Var = new prs0(i240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_shopping_bag)), ctf0Var.b.a(R.string.promo_shop_name, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.promo_settings_subtitle, Arrays.copyOf(new Object[0], 0)));
                int iIntValue115 = ((Number) prs0Var.f27482a).intValue();
                String str111110 = (String) prs0Var.b;
                String str111111 = (String) prs0Var.c;
                iz30 iz30Var115 = sx10Var.f32951a;
                if (z) {
                }
            case 41:
                prs0Var = new prs0(i240Var.invoke(Integer.valueOf(R.drawable.ic_fast_games)), ctf0Var.b.a(R.string.fast_games_title, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.fast_games_description, Arrays.copyOf(new Object[0], 0)));
                int iIntValue116 = ((Number) prs0Var.f27482a).intValue();
                String str111112 = (String) prs0Var.b;
                String str111113 = (String) prs0Var.c;
                iz30 iz30Var116 = sx10Var.f32951a;
                if (z) {
                }
            case 42:
                prs0Var = new prs0(i240Var.invoke(numValueOf2), ctf0Var.b.a(R.string.cases_slots, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.menu_slots_description, Arrays.copyOf(new Object[0], 0)));
                int iIntValue117 = ((Number) prs0Var.f27482a).intValue();
                String str111114 = (String) prs0Var.b;
                String str111115 = (String) prs0Var.c;
                iz30 iz30Var117 = sx10Var.f32951a;
                if (z) {
                }
            case 43:
                prs0Var = new prs0(i240Var.invoke(numValueOf3), ctf0Var.b.a(R.string.live_casino_title, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.menu_live_casino_description, Arrays.copyOf(new Object[0], 0)));
                int iIntValue118 = ((Number) prs0Var.f27482a).intValue();
                String str111116 = (String) prs0Var.b;
                String str111117 = (String) prs0Var.c;
                iz30 iz30Var118 = sx10Var.f32951a;
                if (z) {
                }
            case 44:
                prs0Var = new prs0(i240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_virtual)), ctf0Var.b.a(R.string.my_virtual, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.casino_my_virtual_description, Arrays.copyOf(new Object[0], 0)));
                int iIntValue119 = ((Number) prs0Var.f27482a).intValue();
                String str111118 = (String) prs0Var.b;
                String str111119 = (String) prs0Var.c;
                iz30 iz30Var119 = sx10Var.f32951a;
                if (z) {
                }
            case 45:
                prs0Var = new prs0(i240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_providers)), ctf0Var.b.a(R.string.providers, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.casino_providers_menu_desription, Arrays.copyOf(new Object[0], 0)));
                int iIntValue1110 = ((Number) prs0Var.f27482a).intValue();
                String str1111110 = (String) prs0Var.b;
                String str1111111 = (String) prs0Var.c;
                iz30 iz30Var1110 = sx10Var.f32951a;
                if (z) {
                }
            case 48:
                prs0Var2 = new prs0(i240Var.invoke(numValueOf), ctf0Var.b.a(R.string.sport_cashback, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.sport_cashback_subtitle, Arrays.copyOf(new Object[0], 0)));
                prs0Var = prs0Var2;
                int iIntValue1111 = ((Number) prs0Var.f27482a).intValue();
                String str1111112 = (String) prs0Var.b;
                String str1111113 = (String) prs0Var.c;
                iz30 iz30Var1111 = sx10Var.f32951a;
                if (z) {
                }
            case 49:
                prs0Var = new prs0(i240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_bingo)), ctf0Var.b.a(R.string.bingo_top_title, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.bingo_top_body, Arrays.copyOf(new Object[0], 0)));
                int iIntValue1112 = ((Number) prs0Var.f27482a).intValue();
                String str1111114 = (String) prs0Var.b;
                String str1111115 = (String) prs0Var.c;
                iz30 iz30Var1112 = sx10Var.f32951a;
                if (z) {
                }
            case 51:
                prs0Var = new prs0(i240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_toto)), ctf0Var.b.a(R.string.toto_jackpot_title, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.menu_toto_description, Arrays.copyOf(new Object[0], 0)));
                int iIntValue1113 = ((Number) prs0Var.f27482a).intValue();
                String str1111116 = (String) prs0Var.b;
                String str1111117 = (String) prs0Var.c;
                iz30 iz30Var1113 = sx10Var.f32951a;
                if (z) {
                }
            case 55:
                prs0Var = new prs0(i240Var.invoke(numValueOf2), ctf0Var.b.a(R.string.cases_slots, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.menu_casino_slots_description, Arrays.copyOf(new Object[0], 0)));
                int iIntValue1114 = ((Number) prs0Var.f27482a).intValue();
                String str1111118 = (String) prs0Var.b;
                String str1111119 = (String) prs0Var.c;
                iz30 iz30Var1114 = sx10Var.f32951a;
                if (z) {
                }
            case 56:
                prs0Var = new prs0(i240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_responsible_gambling)), ctf0Var.b.a(R.string.responsible_game, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.menu_responsible_gaming_description, Arrays.copyOf(new Object[0], 0)));
                int iIntValue1115 = ((Number) prs0Var.f27482a).intValue();
                String str11111110 = (String) prs0Var.b;
                String str11111111 = (String) prs0Var.c;
                iz30 iz30Var1115 = sx10Var.f32951a;
                if (z) {
                }
            case 57:
                prs0Var = new prs0(i240Var.invoke(numValueOf3), ctf0Var.b.a(R.string.live_casino_title, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.menu_casino_live_description, Arrays.copyOf(new Object[0], 0)));
                int iIntValue1116 = ((Number) prs0Var.f27482a).intValue();
                String str11111112 = (String) prs0Var.b;
                String str11111113 = (String) prs0Var.c;
                iz30 iz30Var1116 = sx10Var.f32951a;
                if (z) {
                }
            case 58:
                prs0Var = new prs0(i240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_1xlive)), ctf0Var.b.a(R.string.aggregator_one_x_live, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.menu_aggregator_brand_live_description, Arrays.copyOf(new Object[0], 0)));
                int iIntValue1117 = ((Number) prs0Var.f27482a).intValue();
                String str11111114 = (String) prs0Var.b;
                String str11111115 = (String) prs0Var.c;
                iz30 iz30Var1117 = sx10Var.f32951a;
                if (z) {
                }
            case 59:
                prs0Var = new prs0(i240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_aviator)), ctf0Var.b.a(R.string.menu_aviator_title, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.menu_aviator_description, Arrays.copyOf(new Object[0], 0)));
                int iIntValue1118 = ((Number) prs0Var.f27482a).intValue();
                String str11111116 = (String) prs0Var.b;
                String str11111117 = (String) prs0Var.c;
                iz30 iz30Var1118 = sx10Var.f32951a;
                if (z) {
                }
            case 60:
                prs0Var = new prs0(i240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_quest)), ctf0Var.b.a(R.string.daily_task_title, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.daily_task_description, Arrays.copyOf(new Object[0], 0)));
                int iIntValue1119 = ((Number) prs0Var.f27482a).intValue();
                String str11111118 = (String) prs0Var.b;
                String str11111119 = (String) prs0Var.c;
                iz30 iz30Var1119 = sx10Var.f32951a;
                if (z) {
                }
            case 62:
                prs0Var = new prs0(i240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_loto)), ctf0Var.b.a(R.string.menu_lotto_title, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.menu_lotto_description, Arrays.copyOf(new Object[0], 0)));
                int iIntValue11110 = ((Number) prs0Var.f27482a).intValue();
                String str111111110 = (String) prs0Var.b;
                String str111111111 = (String) prs0Var.c;
                iz30 iz30Var11110 = sx10Var.f32951a;
                if (z) {
                }
            case 63:
                prs0Var = new prs0(i240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_partners)), ctf0Var.b.a(R.string.info_partner_programm, Arrays.copyOf(new Object[0], 0)), "");
                int iIntValue11111 = ((Number) prs0Var.f27482a).intValue();
                String str111111112 = (String) prs0Var.b;
                String str111111113 = (String) prs0Var.c;
                iz30 iz30Var11111 = sx10Var.f32951a;
                if (z) {
                }
            case 64:
                prs0Var = new prs0(i240Var.invoke(Integer.valueOf(R.drawable.ic_info_agent)), ctf0Var.b.a(R.string.info_agent_programm, Arrays.copyOf(new Object[0], 0)), "");
                int iIntValue11112 = ((Number) prs0Var.f27482a).intValue();
                String str111111114 = (String) prs0Var.b;
                String str111111115 = (String) prs0Var.c;
                iz30 iz30Var11112 = sx10Var.f32951a;
                if (z) {
                }
        }
    }

    public static final void j(mm40 mm40Var, zdm0 zdm0Var, boolean z, fet fetVar, int i) {
        mm40 mm40Var2;
        zdm0Var.getClass();
        fetVar.g0(-861408218);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(zdm0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.h(z) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            if ((zdm0Var instanceof wdm0) || (zdm0Var instanceof xdm0)) {
                fetVar.e0(577680393);
                zcl zclVar = qmk.f28987a;
                l(0, fetVar, s5x0.N(jm40Var, 16.0f, 0.0f, 16.0f, 16.0f, 2));
                fetVar.r(false);
            } else {
                if (!(zdm0Var instanceof ydm0)) {
                    throw b1j.f(577676738, fetVar, false);
                }
                fetVar.e0(728377505);
                k(((ydm0) zdm0Var).b, z, fetVar, (i2 >> 3) & 112);
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
            yfe0VarU.d = new sf00(mm40Var2, zdm0Var, z, i, (byte) 0);
        }
    }

    public static final nw30 j0(vx10 vx10Var, ctf0 ctf0Var, i240 i240Var, List list, r040 r040Var, boolean z, boolean z2) {
        Integer numValueOf = Integer.valueOf(R.drawable.ic_glyph_team);
        pz40 pz40Var = s6t0.f31722a;
        List listJ = q3d.j(new y3d(s6t0.b().b.getTeamBetGradientStart()), new y3d(s6t0.b().b.getTeamBetGradientEnd()));
        boolean z3 = true;
        if (z2) {
            iz30 iz30Var = vx10Var.f38180a;
            if (list != null && list.isEmpty()) {
                z3 = false;
                break;
            }
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    z3 = false;
                    break;
                }
            } while (((iz30) it.next()) != vx10Var.f38180a);
            int iIntValue = ((Number) i240Var.invoke(numValueOf)).intValue();
            pz40 pz40Var2 = s6t0.f31722a;
            StaticColors staticColors = StaticColors.INSTANCE;
            return new xv30(iz30Var, z3, r040Var, staticColors.m123getWhite0d7_KjU(), iIntValue, staticColors.m123getWhite0d7_KjU(), staticColors.m126getWhite200d7_KjU(), ctf0Var.b.a(R.string.team_bet_title, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.menu_team_bet_description, Arrays.copyOf(new Object[0], 0)), !z ? R.drawable.teambet_menu_banner : 0, listJ, bzw.b);
        }
        iz30 iz30Var2 = vx10Var.f38180a;
        if (list != null && list.isEmpty()) {
            z3 = false;
            break;
        }
        Iterator it2 = list.iterator();
        do {
            if (!it2.hasNext()) {
                z3 = false;
                break;
            }
        } while (((iz30) it2.next()) != vx10Var.f38180a);
        int iIntValue2 = ((Number) i240Var.invoke(numValueOf)).intValue();
        pz40 pz40Var3 = s6t0.f31722a;
        StaticColors staticColors2 = StaticColors.INSTANCE;
        return new rv30(iz30Var2, z3, r040Var, staticColors2.m123getWhite0d7_KjU(), iIntValue2, staticColors2.m123getWhite0d7_KjU(), staticColors2.m126getWhite200d7_KjU(), ctf0Var.b.a(R.string.team_bet_title, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.menu_team_bet_description, Arrays.copyOf(new Object[0], 0)), !z ? R.drawable.teambet_menu_banner : 0, listJ, bzw.b);
    }

    public static final void k(vdm0 vdm0Var, boolean z, fet fetVar, int i) {
        int i2;
        fetVar.g0(-1948688834);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(vdm0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.h(z) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            xx7 xx7Var = gqw0.n;
            float f = xfn.a(fetVar).e;
            float f2 = xfn.a(fetVar).e;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(jm40.b, f, 0.0f, f2, 12.0f, 2);
            x5d x5dVarA = w5d.a(uc9.c, xx7Var, fetVar, 48);
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
            if (vdm0Var instanceof tdm0) {
                fetVar.e0(-1139655576);
                t((tdm0) vdm0Var, z, fetVar, i2 & 126);
                fetVar.r(false);
            } else if (vdm0Var instanceof qdm0) {
                fetVar.e0(-1139651614);
                f((qdm0) vdm0Var, z, fetVar, i2 & 126);
                fetVar.r(false);
            } else if (vdm0Var instanceof sdm0) {
                fetVar.e0(-1139646039);
                w((sdm0) vdm0Var, z, fetVar, i2 & 126);
                fetVar.r(false);
            } else if (vdm0Var instanceof udm0) {
                fetVar.e0(-1139642019);
                z((udm0) vdm0Var, z, fetVar, i2 & 126);
                fetVar.r(false);
            } else {
                if (!(vdm0Var instanceof pdm0)) {
                    throw b1j.f(-1139657164, fetVar, false);
                }
                fetVar.e0(-1139636590);
                d((pdm0) vdm0Var, fetVar, i2 & 14);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ooh(vdm0Var, z, i, (byte) 5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:196:0x05e8 A[PHI: r20
  0x05e8: PHI (r20v2 boolean) = (r20v1 boolean), (r20v5 boolean) binds: [B:198:0x05ef, B:194:0x05d6] A[DONT_GENERATE, DONT_INLINE]] */
    public static final nw30 k0(yx10 yx10Var, ctf0 ctf0Var, qho qhoVar, List list, r040 r040Var, List list2, String str, String str2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        char c;
        char c2;
        char c3;
        boolean z9;
        boolean z10;
        boolean z11;
        char c4;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        String string;
        boolean z16;
        boolean z17;
        Object obj;
        int i;
        char c5;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        boolean z23;
        boolean z24;
        Pair pair;
        Integer numValueOf = Integer.valueOf(R.drawable.ic_glyph_games);
        yx10Var.getClass();
        ctf0Var.getClass();
        list.getClass();
        r040Var.getClass();
        list2.getClass();
        str2.getClass();
        int iOrdinal = r040Var.ordinal();
        boolean z25 = true;
        if (iOrdinal != 1 && iOrdinal != 3 && iOrdinal != 5 && iOrdinal != 7 && iOrdinal != 9 && iOrdinal != 11) {
            z25 = false;
        }
        if (yx10Var instanceof sx10) {
            return i0((sx10) yx10Var, ctf0Var, new i240(1, qhoVar, qho.class, "getEventStyledDrawableResId", "getEventStyledDrawableResId(I)I", 0, (byte) 16), list, r040Var, str, z25);
        }
        boolean z26 = z25;
        if (yx10Var instanceof lx10) {
            lx10 lx10Var = (lx10) yx10Var;
            iz30 iz30Var = lx10Var.f20792a;
            i240 i240Var = new i240(1, qhoVar, qho.class, "getEventStyledDrawableResId", "getEventStyledDrawableResId(I)I", 0, (byte) 17);
            if (list.isEmpty()) {
                z24 = false;
                break;
            }
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z24 = false;
                    break;
                }
                if (((iz30) it.next()) == iz30Var) {
                    z24 = true;
                    break;
                }
            }
            int iOrdinal2 = iz30Var.ordinal();
            if (iOrdinal2 == 9) {
                pair = new Pair(i240Var.invoke(numValueOf), ctf0Var.b.a(R.string.menu_one_x_games_description, Arrays.copyOf(new Object[0], 0)));
            } else {
                if (iOrdinal2 != 15) {
                    return new ew30(iz30.b, false, r040.SPORTS, 0, "", "");
                }
                pair = new Pair(i240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_toto)), ctf0Var.b.a(R.string.menu_toto_description, Arrays.copyOf(new Object[0], 0)));
            }
            int iIntValue = ((Number) pair.f46059a).intValue();
            String str3 = (String) pair.b;
            String str4 = lx10Var.b;
            return z26 ? new aw30(iz30Var, z24, r040Var, iIntValue, str4, str3) : new ew30(iz30Var, z24, r040Var, iIntValue, str4, str3);
        }
        String string2 = "";
        if (yx10Var instanceof px10) {
            px10 px10Var = (px10) yx10Var;
            i240 i240Var2 = new i240(1, qhoVar, qho.class, "getEventStyledDrawableResId", "getEventStyledDrawableResId(I)I", 0, (byte) 18);
            boolean zT = T(ctf0Var);
            Integer numValueOf2 = Integer.valueOf(R.drawable.ic_glyph_cart);
            boolean z27 = px10Var.c;
            iz30 iz30Var2 = px10Var.f27734a;
            if (z27) {
                Locale locale = Locale.ENGLISH;
                lsm0 lsm0Var = ctf0Var.b;
                lsm0 lsm0Var2 = ctf0Var.b;
                string2 = String.format(locale, lsm0Var.a(R.string.placeholder_variant_5, Arrays.copyOf(new Object[0], 0)), Arrays.copyOf(new Object[]{lsm0Var2.a(R.string.menu_promo_subtitle, Arrays.copyOf(new Object[0], 0)), String.valueOf(px10Var.b), lsm0Var2.a(R.string.pts_symbol, Arrays.copyOf(new Object[0], 0))}, 3));
            }
            String str5 = string2;
            if (z26) {
                if (list != null && list.isEmpty()) {
                    z23 = false;
                    break;
                }
                Iterator it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z23 = false;
                        break;
                    }
                    if (((iz30) it2.next()) == iz30Var2) {
                        z23 = true;
                        break;
                    }
                }
                int iIntValue2 = ((Number) i240Var2.invoke(numValueOf2)).intValue();
                pz40 pz40Var = s6t0.f31722a;
                StaticColors staticColors = StaticColors.INSTANCE;
                long jM123getWhite0d7_KjU = staticColors.m123getWhite0d7_KjU();
                long jM126getWhite200d7_KjU = staticColors.m126getWhite200d7_KjU();
                String strA = ctf0Var.b.a(R.string.promo_codes_title, Arrays.copyOf(new Object[0], 0));
                int i2 = !zT ? R.drawable.banner_promo : 0;
                CustomColors customColors = CustomColors.INSTANCE;
                return new xv30(iz30Var2, z23, r040Var, staticColors.m123getWhite0d7_KjU(), iIntValue2, jM123getWhite0d7_KjU, jM126getWhite200d7_KjU, strA, str5, i2, q3d.j(new y3d(customColors.m45getPromoGradientEnd0d7_KjU()), new y3d(customColors.m46getPromoGradientStart0d7_KjU())), null);
            }
            if (list != null && list.isEmpty()) {
                z22 = false;
                break;
            }
            Iterator it3 = list.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    z22 = false;
                    break;
                }
                if (((iz30) it3.next()) == iz30Var2) {
                    z22 = true;
                    break;
                }
            }
            int iIntValue3 = ((Number) i240Var2.invoke(numValueOf2)).intValue();
            pz40 pz40Var2 = s6t0.f31722a;
            StaticColors staticColors2 = StaticColors.INSTANCE;
            long jM123getWhite0d7_KjU2 = staticColors2.m123getWhite0d7_KjU();
            long jM126getWhite200d7_KjU2 = staticColors2.m126getWhite200d7_KjU();
            String strA2 = ctf0Var.b.a(R.string.promo_codes_title, Arrays.copyOf(new Object[0], 0));
            int i3 = !zT ? R.drawable.banner_promo : 0;
            long jM123getWhite0d7_KjU3 = staticColors2.m123getWhite0d7_KjU();
            CustomColors customColors2 = CustomColors.INSTANCE;
            return new rv30(iz30Var2, z22, r040Var, jM123getWhite0d7_KjU3, iIntValue3, jM123getWhite0d7_KjU2, jM126getWhite200d7_KjU2, strA2, str5, i3, q3d.j(new y3d(customColors2.m45getPromoGradientEnd0d7_KjU()), new y3d(customColors2.m46getPromoGradientStart0d7_KjU())), null);
        }
        if (yx10Var instanceof qx10) {
            qx10 qx10Var = (qx10) yx10Var;
            i240 i240Var3 = new i240(1, qhoVar, qho.class, "getEventStyledDrawableResId", "getEventStyledDrawableResId(I)I", 0, (byte) 19);
            boolean zT2 = T(ctf0Var);
            Integer numValueOf3 = Integer.valueOf(R.drawable.ic_glyph_balloons);
            if (z26) {
                iz30 iz30Var3 = qx10Var.f29460a;
                if (list != null && list.isEmpty()) {
                    z21 = false;
                    break;
                }
                Iterator it4 = list.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        z21 = false;
                        break;
                    }
                    if (((iz30) it4.next()) == qx10Var.f29460a) {
                        z21 = true;
                        break;
                    }
                }
                int iIntValue4 = ((Number) i240Var3.invoke(numValueOf3)).intValue();
                pz40 pz40Var3 = s6t0.f31722a;
                StaticColors staticColors3 = StaticColors.INSTANCE;
                return new xv30(iz30Var3, z21, r040Var, staticColors3.m123getWhite0d7_KjU(), iIntValue4, staticColors3.m87getDarkOrange0d7_KjU(), staticColors3.m123getWhite0d7_KjU(), ctf0Var.b.a(R.string.news_promo, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.menu_promo_description, Arrays.copyOf(new Object[0], 0)), zT2 ? 0 : R.drawable.ic_banner_events, q3d.j(new y3d(staticColors3.m87getDarkOrange0d7_KjU()), new y3d(staticColors3.m132getYellow0d7_KjU())), null);
            }
            iz30 iz30Var4 = qx10Var.f29460a;
            if (list != null && list.isEmpty()) {
                z20 = false;
                break;
            }
            Iterator it5 = list.iterator();
            while (true) {
                if (!it5.hasNext()) {
                    z20 = false;
                    break;
                }
                if (((iz30) it5.next()) == qx10Var.f29460a) {
                    z20 = true;
                    break;
                }
            }
            int iIntValue5 = ((Number) i240Var3.invoke(numValueOf3)).intValue();
            pz40 pz40Var4 = s6t0.f31722a;
            StaticColors staticColors4 = StaticColors.INSTANCE;
            return new rv30(iz30Var4, z20, r040Var, staticColors4.m123getWhite0d7_KjU(), iIntValue5, staticColors4.m87getDarkOrange0d7_KjU(), staticColors4.m123getWhite0d7_KjU(), ctf0Var.b.a(R.string.news_promo, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.menu_promo_description, Arrays.copyOf(new Object[0], 0)), zT2 ? 0 : R.drawable.ic_banner_events, q3d.j(new y3d(staticColors4.m87getDarkOrange0d7_KjU()), new y3d(staticColors4.m132getYellow0d7_KjU())), null);
        }
        if (yx10Var instanceof vx10) {
            return j0((vx10) yx10Var, ctf0Var, new i240(1, qhoVar, qho.class, "getEventStyledDrawableResId", "getEventStyledDrawableResId(I)I", 0, (byte) 20), list, r040Var, T(ctf0Var), z26);
        }
        if (yx10Var instanceof nx10) {
            nx10 nx10Var = (nx10) yx10Var;
            iz30 iz30Var5 = nx10Var.f24262a;
            i240 i240Var4 = new i240(1, qhoVar, qho.class, "getEventStyledDrawableResId", "getEventStyledDrawableResId(I)I", 0, (byte) 21);
            lsm0 lsm0Var3 = ctf0Var.b;
            String strA3 = lsm0Var3.a(R.string.all_games, Arrays.copyOf(new Object[0], 0));
            String strA4 = lsm0Var3.a(R.string.menu_one_x_games_description, Arrays.copyOf(new Object[0], 0));
            int iIntValue6 = ((Number) i240Var4.invoke(numValueOf)).intValue();
            List<mz60> list3 = nx10Var.b;
            ArrayList arrayList = new ArrayList(r3d.q(list3, 10));
            for (mz60 mz60Var : list3) {
                a570 a570Var = mz60Var.b;
                hds hdsVar = mz60Var.d;
                Pair pair2 = x1x.G(a570Var) ? new Pair(mz60Var.e ? v4s.c : v4s.f36795a, mz60Var.f22638a) : new Pair(v4s.b, lsm0Var3.a(R.string.all_games, Arrays.copyOf(new Object[0], 0)));
                v4s v4sVar = (v4s) pair2.f46059a;
                String str6 = (String) pair2.b;
                long jD = x1x.D(mz60Var.b);
                String str7 = hdsVar.b;
                String str8 = hdsVar.f12884a;
                arrayList.add(new u4s(jD, v4sVar, new n0x(str7), new n0x(azw.R(hdsVar.b)), new n0x(str8), new n0x(azw.R(str8)), str6));
            }
            if (z26) {
                if (list.isEmpty()) {
                    z19 = false;
                } else {
                    Iterator it6 = list.iterator();
                    while (it6.hasNext()) {
                        if (((iz30) it6.next()) == iz30Var5) {
                            z19 = true;
                        }
                    }
                    z19 = false;
                }
                return new cw30(z19, iz30Var5, r040Var, iIntValue6, strA3, strA4, lsm0Var3.a(R.string.all, Arrays.copyOf(new Object[0], 0)), arrayList);
            }
            if (list.isEmpty()) {
                z18 = false;
            } else {
                Iterator it7 = list.iterator();
                while (it7.hasNext()) {
                    if (((iz30) it7.next()) == iz30Var5) {
                        z18 = true;
                    }
                }
                z18 = false;
            }
            return new mw30(z18, iz30Var5, r040Var, iIntValue6, strA3, strA4, lsm0Var3.a(R.string.all, Arrays.copyOf(new Object[0], 0)), arrayList);
        }
        if (yx10Var instanceof tx10) {
            lok0 lok0Var = ((tx10) yx10Var).f34677a;
            long j = lok0Var.g;
            long j2 = lok0Var.f;
            String strValueOf = lok0Var.u;
            if (j != 0) {
                Iterator it8 = list2.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        z15 = z26;
                        obj = null;
                        break;
                    }
                    Object next = it8.next();
                    z15 = z26;
                    if (((f3n0) next).f8872a == lok0Var.g) {
                        obj = next;
                        break;
                    }
                    z26 = z15;
                }
                f3n0 f3n0Var = (f3n0) obj;
                if (f3n0Var != null) {
                    StringBuilder sb = new StringBuilder(ujn.h);
                    String str9 = f3n0Var.c.j;
                    str9.getClass();
                    if (str9.length() == 0) {
                        sb.setLength(0);
                    } else {
                        if (StringsKt.O(str9, ujn.h, false)) {
                            i = 0;
                        } else if (kotlin.text.c.x(str9, "https://", false)) {
                            i = 0;
                        } else {
                            if (sb.length() <= 0 || StringsKt.S(sb, Separators.SLASH)) {
                                c5 = '/';
                            } else {
                                c5 = '/';
                                sb.append('/');
                            }
                            sb.append(StringsKt.y0(str9, c5));
                        }
                        sb.setLength(i);
                        sb.append(str9);
                    }
                    string = sb.toString();
                } else if (j2 != 0) {
                    bzu bzuVarD = rz4.d("static", "svg", "sports_v2");
                    rz4.s(j2, ".svg", bzuVarD);
                    string = ((StringBuilder) bzuVarD.b).toString();
                } else {
                    string = "";
                }
            } else {
                z15 = z26;
                if (j2 != 0) {
                    bzu bzuVarD2 = rz4.d("static", "svg", "sports_v2");
                    rz4.s(j2, ".svg", bzuVarD2);
                    string = ((StringBuilder) bzuVarD2.b).toString();
                } else {
                    string = "";
                }
            }
            String str10 = string;
            if (!T(ctf0Var)) {
                int i4 = lok0Var.f20396a;
                strValueOf.getClass();
                bzu bzuVar = new bzu((byte) 23);
                bzuVar.g("static");
                bzuVar.g("img");
                bzuVar.g("android");
                bzuVar.g("TopChamps");
                axq.u(bzuVar, strValueOf.length() == 0 ? String.valueOf(i4) : strValueOf, "backgrounds", "Menu_Illustration.png");
                string2 = ((StringBuilder) bzuVar.b).toString();
            }
            String str11 = string2;
            if (z15) {
                htz htzVar = iz30.f15618a;
                if (list.isEmpty()) {
                    z17 = false;
                    break;
                }
                Iterator it9 = list.iterator();
                while (true) {
                    if (!it9.hasNext()) {
                        z17 = false;
                        break;
                    }
                    if (((iz30) it9.next()) == iz30.c) {
                        z17 = true;
                        break;
                    }
                }
                int i5 = lok0Var.f20396a;
                long j3 = y3d.c;
                strValueOf.getClass();
                bzu bzuVar2 = new bzu((byte) 23);
                bzuVar2.g("static");
                bzuVar2.g("img");
                bzuVar2.g("android");
                bzuVar2.g("TopChamps");
                if (strValueOf.length() == 0) {
                    strValueOf = String.valueOf(i5);
                }
                axq.u(bzuVar2, strValueOf, "backgrounds", "Menu_Icon.webp");
                String string3 = ((StringBuilder) bzuVar2.b).toString();
                pz40 pz40Var5 = s6t0.f31722a;
                return new gw30(z17, r040Var, i5, j3, str10, string3, s6t0.b().f33626a.getPrimary(), lok0Var.b, str11);
            }
            String strValueOf2 = strValueOf;
            htz htzVar2 = iz30.f15618a;
            if (list.isEmpty()) {
                z16 = false;
                break;
            }
            Iterator it10 = list.iterator();
            while (true) {
                if (!it10.hasNext()) {
                    z16 = false;
                    break;
                }
                if (((iz30) it10.next()) == iz30.c) {
                    z16 = true;
                    break;
                }
            }
            int i6 = lok0Var.f20396a;
            long j4 = y3d.c;
            strValueOf2.getClass();
            bzu bzuVar3 = new bzu((byte) 23);
            bzuVar3.g("static");
            bzuVar3.g("img");
            bzuVar3.g("android");
            bzuVar3.g("TopChamps");
            if (strValueOf2.length() == 0) {
                strValueOf2 = String.valueOf(i6);
            }
            axq.u(bzuVar3, strValueOf2, "backgrounds", "Menu_Icon.webp");
            String string4 = ((StringBuilder) bzuVar3.b).toString();
            pz40 pz40Var6 = s6t0.f31722a;
            return new fw30(z16, r040Var, i6, j4, str10, string4, s6t0.b().f33626a.getPrimary(), lok0Var.b, str11);
        }
        if (yx10Var instanceof hx10) {
            hx10 hx10Var = (hx10) yx10Var;
            iz30 iz30Var6 = hx10Var.f13792a;
            i240 i240Var5 = new i240(1, qhoVar, qho.class, "getEventStyledDrawableResId", "getEventStyledDrawableResId(I)I", 0, (byte) 22);
            if (list.isEmpty()) {
                z14 = false;
                break;
            }
            Iterator it11 = list.iterator();
            while (true) {
                if (!it11.hasNext()) {
                    z14 = false;
                    break;
                }
                if (((iz30) it11.next()) == iz30Var6) {
                    z14 = true;
                    break;
                }
            }
            lsm0 lsm0Var4 = ctf0Var.b;
            String strA5 = lsm0Var4.a(R.string.authenticator, Arrays.copyOf(new Object[0], 0));
            String strA6 = lsm0Var4.a(hx10Var.b ? R.string.account_secured : R.string.authenticator_description, Arrays.copyOf(new Object[0], 0));
            int iIntValue7 = ((Number) i240Var5.invoke(Integer.valueOf(R.drawable.ic_glyph_authenticator))).intValue();
            boolean z28 = hx10Var.b;
            return z26 ? new vv30(iz30Var6, z14, r040Var, iIntValue7, strA5, strA6, z28) : new nv30(iz30Var6, z14, r040Var, iIntValue7, strA5, strA6, z28);
        }
        if (yx10Var instanceof ix10) {
            ix10 ix10Var = (ix10) yx10Var;
            iz30 iz30Var7 = ix10Var.f15519a;
            i240 i240Var6 = new i240(1, qhoVar, qho.class, "getEventStyledDrawableResId", "getEventStyledDrawableResId(I)I", 0, (byte) 23);
            lsm0 lsm0Var5 = ctf0Var.b;
            String strA7 = lsm0Var5.a(R.string.balance_management_title, Arrays.copyOf(new Object[0], 0));
            String strA8 = lsm0Var5.a(R.string.balance_managment_description, Arrays.copyOf(new Object[0], 0));
            StringBuilder sb2 = new StringBuilder(ujn.h);
            String str12 = String.format(Locale.ENGLISH, "static/img/android/icons_currency/v2/%d.svg", Arrays.copyOf(new Object[]{Long.valueOf(ix10Var.b)}, 1));
            if (str12.length() == 0) {
                sb2.setLength(0);
            } else {
                int i7 = 0;
                if (StringsKt.O(str12, ujn.h, false)) {
                    sb2.setLength(i7);
                    sb2.append(str12);
                } else if (kotlin.text.c.x(str12, "https://", false)) {
                    i7 = 0;
                    sb2.setLength(i7);
                    sb2.append(str12);
                } else {
                    if (sb2.length() <= 0 || StringsKt.S(sb2, Separators.SLASH)) {
                        c4 = '/';
                    } else {
                        c4 = '/';
                        sb2.append('/');
                    }
                    sb2.append(StringsKt.y0(str12, c4));
                }
            }
            String string5 = sb2.toString();
            int iIntValue8 = ((Number) i240Var6.invoke(Integer.valueOf(R.drawable.ic_glyph_currency_placeholder))).intValue();
            if (z26) {
                if (list.isEmpty()) {
                    z13 = false;
                } else {
                    Iterator it12 = list.iterator();
                    while (it12.hasNext()) {
                        if (((iz30) it12.next()) == iz30Var7) {
                            z13 = true;
                        }
                    }
                    z13 = false;
                }
                return new wv30(iIntValue8, iz30Var7, r040Var, string5, strA7, strA8, z13);
            }
            if (list.isEmpty()) {
                z12 = false;
            } else {
                Iterator it13 = list.iterator();
                while (it13.hasNext()) {
                    if (((iz30) it13.next()) == iz30Var7) {
                        z12 = true;
                    }
                }
                z12 = false;
            }
            pz40 pz40Var7 = s6t0.f31722a;
            StaticColors staticColors5 = StaticColors.INSTANCE;
            return new ov30(z12, iz30Var7, r040Var, string5, staticColors5.m123getWhite0d7_KjU(), s6t0.b().f33626a.getPrimary(), iIntValue8, staticColors5.m123getWhite0d7_KjU(), strA7, strA8);
        }
        if (yx10Var instanceof rx10) {
            iz30 iz30Var8 = ((rx10) yx10Var).f31242a;
            i240 i240Var7 = new i240(1, qhoVar, qho.class, "getEventStyledDrawableResId", "getEventStyledDrawableResId(I)I", 0, (byte) 24);
            boolean zT3 = T(ctf0Var);
            lsm0 lsm0Var6 = ctf0Var.b;
            String strA9 = lsm0Var6.a(R.string.increase_security, Arrays.copyOf(new Object[0], 0));
            String strA10 = lsm0Var6.a(R.string.menu_increase_security_description, Arrays.copyOf(new Object[0], 0));
            int iIntValue9 = ((Number) i240Var7.invoke(Integer.valueOf(R.drawable.ic_glyph_lock))).intValue();
            int i8 = !zT3 ? R.drawable.banner_security : 0;
            if (z26) {
                if (list.isEmpty()) {
                    z11 = false;
                } else {
                    Iterator it14 = list.iterator();
                    while (it14.hasNext()) {
                        if (((iz30) it14.next()) == iz30Var8) {
                            z11 = true;
                        }
                    }
                    z11 = false;
                }
                pz40 pz40Var8 = s6t0.f31722a;
                return new yv30(iz30Var8, z11, r040Var, iIntValue9, s6t0.b().f33626a.getPrimary(), StaticColors.INSTANCE.m123getWhite0d7_KjU(), strA9, strA10, i8, s6t0.b().f33626a.getPrimary());
            }
            if (list.isEmpty()) {
                z10 = false;
            } else {
                Iterator it15 = list.iterator();
                while (it15.hasNext()) {
                    if (((iz30) it15.next()) == iz30Var8) {
                        z10 = true;
                    }
                }
                z10 = false;
            }
            pz40 pz40Var9 = s6t0.f31722a;
            return new sv30(iz30Var8, z10, r040Var, iIntValue9, s6t0.b().f33626a.getPrimary(), StaticColors.INSTANCE.m123getWhite0d7_KjU(), strA9, strA10, i8, s6t0.b().f33626a.getPrimary());
        }
        if (yx10Var instanceof gx10) {
            gx10 gx10Var = (gx10) yx10Var;
            iz30 iz30Var9 = gx10Var.f12055a;
            i240 i240Var8 = new i240(1, qhoVar, qho.class, "getEventStyledDrawableResId", "getEventStyledDrawableResId(I)I", 0, (byte) 8);
            vh0 vh0Var = gx10Var.b;
            if (k240.f17557a[iz30Var9.ordinal()] == 44) {
                lsm0 lsm0Var7 = ctf0Var.b;
                String strA11 = lsm0Var7.a(R.string.fast_bet_title, Arrays.copyOf(new Object[0], 0));
                String strA12 = lsm0Var7.a(R.string.fast_bet_description, Arrays.copyOf(new Object[0], 0));
                int iIntValue10 = ((Number) i240Var8.invoke(Integer.valueOf(R.drawable.ic_glyph_fast_bet))).intValue();
                if (list.isEmpty()) {
                    z9 = false;
                } else {
                    Iterator it16 = list.iterator();
                    while (it16.hasNext()) {
                        if (((iz30) it16.next()) == iz30Var9) {
                            z9 = true;
                        }
                    }
                    z9 = false;
                }
                return z26 ? new aw30(iz30Var9, z9, r040Var, iIntValue10, strA11, strA12) : new ew30(iz30Var9, z9, r040Var, iIntValue10, strA11, strA12);
            }
            if (list.isEmpty()) {
                z8 = false;
                break;
            }
            Iterator it17 = list.iterator();
            while (true) {
                if (!it17.hasNext()) {
                    z8 = false;
                    break;
                }
                if (((iz30) it17.next()) == iz30Var9) {
                    z8 = true;
                    break;
                }
            }
            if (z26) {
                long j5 = vh0Var.f37408a;
                StringBuilder sb3 = new StringBuilder(ujn.h);
                String str13 = String.format(Locale.ENGLISH, "static/img/android/agregator/category/%d.svg", Arrays.copyOf(new Object[]{Long.valueOf(vh0Var.f37408a)}, 1));
                if (str13.length() == 0) {
                    sb3.setLength(0);
                } else {
                    int i9 = 0;
                    if (StringsKt.O(str13, ujn.h, false)) {
                        sb3.setLength(i9);
                        sb3.append(str13);
                    } else if (kotlin.text.c.x(str13, "https://", false)) {
                        i9 = 0;
                        sb3.setLength(i9);
                        sb3.append(str13);
                    } else {
                        if (sb3.length() <= 0 || StringsKt.S(sb3, Separators.SLASH)) {
                            c3 = '/';
                        } else {
                            c3 = '/';
                            sb3.append('/');
                        }
                        sb3.append(StringsKt.y0(str13, c3));
                    }
                }
                return new bw30(z8, iz30Var9, r040Var, j5, vh0Var.g, sb3.toString(), vh0Var.b, vh0Var.f);
            }
            boolean z29 = z8;
            int length = vh0Var.d.length();
            long j6 = vh0Var.f37408a;
            if (length > 0) {
                StringBuilder sb4 = new StringBuilder(ujn.h);
                String str14 = vh0Var.d;
                if (str14.length() == 0) {
                    sb4.setLength(0);
                } else if (StringsKt.O(str14, ujn.h, false) || kotlin.text.c.x(str14, "https://", false)) {
                    qtm0.e(sb4);
                    sb4.append(str14);
                } else {
                    if (sb4.length() <= 0 || StringsKt.S(sb4, Separators.SLASH)) {
                        c2 = '/';
                    } else {
                        c2 = '/';
                        sb4.append('/');
                    }
                    sb4.append(StringsKt.y0(str14, c2));
                }
                return new kw30(z29, iz30Var9, r040Var, j6, vh0Var.g, sb4.toString(), vh0Var.b, vh0Var.k, vh0Var.f);
            }
            StringBuilder sb5 = new StringBuilder(ujn.h);
            String str15 = String.format(Locale.ENGLISH, "static/img/android/agregator/category/%d.svg", Arrays.copyOf(new Object[]{Long.valueOf(vh0Var.f37408a)}, 1));
            if (str15.length() == 0) {
                qtm0.e(sb5);
            } else if (StringsKt.O(str15, ujn.h, false) || kotlin.text.c.x(str15, "https://", false)) {
                qtm0.e(sb5);
                sb5.append(str15);
            } else {
                if (sb5.length() <= 0 || StringsKt.S(sb5, Separators.SLASH)) {
                    c = '/';
                } else {
                    c = '/';
                    sb5.append('/');
                }
                sb5.append(StringsKt.y0(str15, c));
            }
            return new lw30(z29, iz30Var9, r040Var, j6, vh0Var.g, sb5.toString(), vh0Var.b, vh0Var.f);
        }
        if (yx10Var instanceof fx10) {
            i240 i240Var9 = new i240(1, qhoVar, qho.class, "getEventStyledDrawableResId", "getEventStyledDrawableResId(I)I", 0, (byte) 9);
            boolean zT4 = T(ctf0Var);
            String strK = ctf0Var.k(R.string.my_virtual, new Object[0]);
            String strK2 = ctf0Var.k(R.string.casino_my_virtual_description, new Object[0]);
            int i10 = !zT4 ? R.drawable.my_aggregator_banner : 0;
            int iIntValue11 = ((Number) i240Var9.invoke(Integer.valueOf(R.drawable.ic_glyph_virtual))).intValue();
            if (list.isEmpty()) {
                z7 = false;
                break;
            }
            Iterator it18 = list.iterator();
            while (true) {
                if (!it18.hasNext()) {
                    z7 = false;
                    break;
                }
                if (((iz30) it18.next()) == iz30.t) {
                    z7 = true;
                    break;
                }
            }
            if (!z26) {
                htz htzVar3 = iz30.f15618a;
                pz40 pz40Var10 = s6t0.f31722a;
                long j7 = hi0.r;
                return new tv30(z7, r040Var, iIntValue11, j7, StaticColors.INSTANCE.m123getWhite0d7_KjU(), strK, strK2, i10, j7);
            }
            boolean z30 = z7;
            iz30 iz30Var10 = iz30.t;
            pz40 pz40Var11 = s6t0.f31722a;
            long j8 = hi0.r;
            return new yv30(iz30Var10, z30, r040Var, iIntValue11, j8, StaticColors.INSTANCE.m123getWhite0d7_KjU(), strK, strK2, i10, j8);
        }
        if (yx10Var instanceof mx10) {
            mx10 mx10Var = (mx10) yx10Var;
            iz30 iz30Var11 = mx10Var.f22532a;
            i240 i240Var10 = new i240(1, qhoVar, qho.class, "getEventStyledDrawableResId", "getEventStyledDrawableResId(I)I", 0, (byte) 10);
            String strK3 = ctf0Var.k(R.string.cyber_sport, new Object[0]);
            String strK4 = ctf0Var.k(R.string.menu_cyber_description, new Object[0]);
            int iIntValue12 = ((Number) i240Var10.invoke(Integer.valueOf(R.drawable.ic_glyph_cyber_gamepad))).intValue();
            if (list.isEmpty()) {
                z6 = false;
                break;
            }
            Iterator it19 = list.iterator();
            while (true) {
                if (!it19.hasNext()) {
                    z6 = false;
                    break;
                }
                if (((iz30) it19.next()) == iz30Var11) {
                    z6 = true;
                    break;
                }
            }
            return new qv30(iIntValue12, iz30Var11, r040Var, strK3, strK4, T(ctf0Var) ? "" : mx10Var.b, z6);
        }
        if (yx10Var instanceof wx10) {
            wx10 wx10Var = (wx10) yx10Var;
            iz30 iz30Var12 = wx10Var.f39910a;
            i240 i240Var11 = new i240(1, qhoVar, qho.class, "getEventStyledDrawableResId", "getEventStyledDrawableResId(I)I", 0, (byte) 11);
            String strK5 = ctf0Var.k(R.string.ufc_title, new Object[0]);
            String strK6 = ctf0Var.k(R.string.menu_ufc_description, new Object[0]);
            int iIntValue13 = ((Number) i240Var11.invoke(Integer.valueOf(R.drawable.ic_glyph_ufc))).intValue();
            if (list.isEmpty()) {
                z5 = false;
                break;
            }
            Iterator it20 = list.iterator();
            while (true) {
                if (!it20.hasNext()) {
                    z5 = false;
                    break;
                }
                if (((iz30) it20.next()) == iz30Var12) {
                    z5 = true;
                    break;
                }
            }
            return new jw30(iIntValue13, iz30Var12, r040Var, strK5, strK6, T(ctf0Var) ? "" : wx10Var.b, z5);
        }
        if (yx10Var instanceof ox10) {
            ox10 ox10Var = (ox10) yx10Var;
            i240 i240Var12 = new i240(1, qhoVar, qho.class, "getEventStyledDrawableResId", "getEventStyledDrawableResId(I)I", 0, (byte) 12);
            iz30 iz30Var13 = ox10Var.f25991a;
            if (list.isEmpty()) {
                z4 = false;
                break;
            }
            Iterator it21 = list.iterator();
            while (true) {
                if (!it21.hasNext()) {
                    z4 = false;
                    break;
                }
                if (((iz30) it21.next()) == ox10Var.f25991a) {
                    z4 = true;
                    break;
                }
            }
            int iIntValue14 = ((Number) i240Var12.invoke(Integer.valueOf(R.drawable.ic_glyph_polybet))).intValue();
            String strK7 = ctf0Var.k(R.string.polybet, new Object[0]);
            String strK8 = ctf0Var.k(R.string.menu_polybet_description, new Object[0]);
            if ((r040Var == r040.TOP || r040Var == r040.SINGLE_TOP || r040Var == r040.SPORTS || r040Var == r040.SINGLE_SPORTS) && !T(ctf0Var)) {
                string2 = ox10Var.b;
            }
            return new dw30(iIntValue14, iz30Var13, r040Var, strK7, strK8, string2, z4);
        }
        if (yx10Var instanceof xx10) {
            xx10 xx10Var = (xx10) yx10Var;
            i240 i240Var13 = new i240(1, qhoVar, qho.class, "getEventStyledDrawableResId", "getEventStyledDrawableResId(I)I", 0, (byte) 13);
            if (list.isEmpty()) {
                z3 = false;
            } else {
                Iterator it22 = list.iterator();
                while (it22.hasNext()) {
                    if (((iz30) it22.next()) == xx10Var.f41637a) {
                        z3 = true;
                    }
                }
                z3 = false;
            }
            return new iw30(xx10Var.f41637a, z3, r040Var, ((Number) i240Var13.invoke(Integer.valueOf(R.drawable.ic_glyph_support))).intValue(), ctf0Var.k(R.string.support, new Object[0]), ctf0Var.k(R.string.menu_support_description, new Object[0]), xx10Var.b);
        }
        if (yx10Var instanceof ux10) {
            ux10 ux10Var = (ux10) yx10Var;
            i240 i240Var14 = new i240(1, qhoVar, qho.class, "getEventStyledDrawableResId", "getEventStyledDrawableResId(I)I", 0, (byte) 14);
            String strK9 = ctf0Var.k(R.string.swipex, new Object[0]);
            String strK10 = ctf0Var.k(R.string.bet_with_one_swipe, new Object[0]);
            int iIntValue15 = ((Number) i240Var14.invoke(Integer.valueOf(R.drawable.ic_glyph_swipex))).intValue();
            int i11 = !T(ctf0Var) ? R.drawable.swipex_banner : 0;
            if (list.isEmpty()) {
                z2 = false;
                break;
            }
            Iterator it23 = list.iterator();
            while (true) {
                if (!it23.hasNext()) {
                    z2 = false;
                    break;
                }
                if (((iz30) it23.next()) == ux10Var.f36419a) {
                    z2 = true;
                    break;
                }
            }
            iz30 iz30Var14 = ux10Var.f36419a;
            return z26 ? new zv30(iz30Var14, z2, r040Var, iIntValue15, strK9, strK10, i11) : new uv30(iz30Var14, z2, r040Var, iIntValue15, strK9, strK10, i11);
        }
        if (yx10Var instanceof jx10) {
            String str16 = ((jx10) yx10Var).f17280a;
            str16.getClass();
            htz htzVar4 = iz30.f15618a;
            ux30 ux30Var = new ux30(10, 0L, ctf0Var.k(R.string.online_call, new Object[0]), str16);
            zcl zclVar = qmk.f28987a;
            return new pv30(r040Var, new gy30(ux30Var, new qx30(new m0x(R.drawable.ic_glyph_call_circle, null, 6), 0L, liz.f20129a, R.drawable.ic_glyph_call_circle, 40.0f, 18), new ay30(new m0x(R.drawable.ic_glyph_call_end, null, 6)), 0L, null, null, 248));
        }
        if (!(yx10Var instanceof kx10)) {
            t9f.b();
            return null;
        }
        kx10 kx10Var = (kx10) yx10Var;
        i240 i240Var15 = new i240(1, qhoVar, qho.class, "getEventStyledDrawableResId", "getEventStyledDrawableResId(I)I", 0, (byte) 15);
        iz30 iz30Var15 = kx10Var.f19030a;
        if (list.isEmpty()) {
            z = false;
            break;
        }
        Iterator it24 = list.iterator();
        while (true) {
            if (!it24.hasNext()) {
                z = false;
                break;
            }
            if (((iz30) it24.next()) == kx10Var.f19030a) {
                z = true;
                break;
            }
        }
        return new qv30(((Number) i240Var15.invoke(Integer.valueOf(R.drawable.ic_glyph_champions_club))).intValue(), iz30Var15, r040Var, str2, ctf0Var.k(R.string.promo_menu_champions_club_subtitle, new Object[0]), T(ctf0Var) ? "" : thb.t(), z);
    }

    public static final void l(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(-1749760474);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
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
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            zq8.a(0, fetVar, xbc.c0(lgb.J(s5x0.L(o7k0.e(mm40VarD, 14.0f), xfn.a(fetVar).e, 0.0f, 2), vgg0.a(8.0f)), vbc.d0(null, fetVar, 0, 1)));
            zq8.a(0, fetVar, xbc.c0(lgb.J(o7k0.e(s5x0.L(o7k0.d(jm40Var, 1.0f), 0.0f, 12.0f, 1), 66.0f), vgg0.a(12.0f)), vbc.d0(null, fetVar, 0, 1)));
            dw9.x(lgb.J(o7k0.e(s5x0.L(o7k0.d(jm40Var, 1.0f), xfn.a(fetVar).e, 0.0f, 2), 14.0f), vgg0.a(8.0f)), vbc.d0(null, fetVar, 0, 1), fetVar, 0, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wqr(mm40Var, i, (byte) 18);
        }
    }

    public static final uf50 l0(zg50 zg50Var) {
        zg50Var.getClass();
        rg50 rg50Var = zg50Var.g;
        String str = zg50Var.m;
        String str2 = zg50Var.l;
        List list = zg50Var.o;
        eh50 eh50Var = zg50Var.h;
        xh50 xh50Var = zg50Var.f;
        long j = xh50Var.e;
        rh50 rh50Var = zg50Var.n;
        eh50 eh50Var2 = zg50Var.i;
        if (eh50Var2 == null) {
            return new yf50(R(zg50Var), zg50Var.f44328a, zg50Var.d, zg50Var.k, str2, str, zg50Var.j, xh50Var, rg50Var, zg50Var.q, rh50Var != null ? j0x.O(rh50Var) : null, zg50Var.o, eh50Var.b);
        }
        if (j == 66) {
            return new vf50(R(zg50Var), zg50Var.f44328a, zg50Var.d, zg50Var.k, str2, str, zg50Var.j, xh50Var, rg50Var, zg50Var.q, rh50Var != null ? j0x.O(rh50Var) : null, zg50Var.o, eh50Var, eh50Var2);
        }
        if (gql0.d().contains(Long.valueOf(j))) {
            return new zf50(R(zg50Var), zg50Var.f44328a, zg50Var.d, zg50Var.k, str2, str, zg50Var.j, xh50Var, rg50Var, zg50Var.q, rh50Var != null ? j0x.O(rh50Var) : null, zg50Var.o, zg50Var.p, eh50Var, eh50Var2);
        }
        if (eh50Var.d.size() > 2 || eh50Var2.d.size() > 2) {
            return new xf50(R(zg50Var), zg50Var.f44328a, zg50Var.d, zg50Var.k, str2, str, zg50Var.j, xh50Var, rg50Var, zg50Var.q, rh50Var != null ? j0x.O(rh50Var) : null, zg50Var.o, eh50Var, eh50Var2);
        }
        boolean zR = R(zg50Var);
        long j2 = zg50Var.f44328a;
        long j3 = zg50Var.d;
        boolean z = zg50Var.k;
        vg50 vg50Var = zg50Var.j;
        fi50 fi50Var = zg50Var.q;
        aj50 aj50VarO = rh50Var != null ? j0x.O(rh50Var) : null;
        list.getClass();
        return new wf50(zR, j2, j3, z, str2, str, vg50Var, xh50Var, rg50Var, fi50Var, aj50VarO, list, eh50Var, eh50Var2, s0x.K(list, cj50.RED_CARDS), s0x.K(list, cj50.YELLOW_CARDS), s0x.K(list, cj50.CORNERS));
    }

    public static final void m(uy60 uy60Var, Function1 function1, fet fetVar, int i) {
        uy60Var.getClass();
        function1.getClass();
        fetVar.g0(1823956804);
        int i2 = i | (fetVar.g(uy60Var) ? 4 : 2) | (fetVar.i(function1) ? 32 : 16);
        byte b = 0;
        byte b2 = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            m8x.y(null, u1c.M(1918889472, new qy60(uy60Var, function1, b), fetVar), u1c.M(1573973727, new qy60(uy60Var, function1, b2), fetVar), null, null, 0, ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), 0L, null, u1c.M(565680853, new ngz(uy60Var, function1, (byte) 24), fetVar), fetVar, 805306800, 441);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new qy60(uy60Var, function1, i);
        }
    }

    public static final oc90 m0(sc90 sc90Var, long j, int i) {
        sc90Var.getClass();
        if (sc90Var.equals(rc90.f30227a)) {
            return new jc90(i, bww.H(j));
        }
        if (sc90Var.equals(rc90.b)) {
            return new jc90(i, azw.O(j));
        }
        if (sc90Var instanceof qc90) {
            return new ec90(i, ((qc90) sc90Var).f28475a ? d4d.STATIC_WHITE : d4d.STATIC_WHITE40, String.valueOf(i + 1));
        }
        t9f.b();
        return null;
    }

    public static final void n(znp0 znp0Var, String str, fet fetVar, int i) {
        byte b;
        fet fetVar2 = fetVar;
        fetVar2.g0(-673833611);
        int i2 = i | (fetVar2.g(znp0Var) ? 4 : 2) | (fetVar2.g(str) ? 32 : 16);
        byte b2 = 1;
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = r71.y;
                fetVar2.o0(objP);
            }
            tj30 tj30Var = (tj30) objP;
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
            jpm0.o(fetVar2, tj30Var, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            mm40 mm40VarK0 = mrv.k0(jm40Var, "IMAGE_ID");
            boolean z = (i2 & 14) == 4;
            Object objP2 = fetVar2.P();
            if (z || objP2 == cl5Var) {
                objP2 = new kdf(znp0Var, b2);
                fetVar2.o0(objP2);
            }
            kkb.p(0, fetVar2, mm40VarK0, (Function0) objP2);
            mm40 mm40VarK1 = mrv.k0(jm40Var, "TITLE_ID");
            String str2 = znp0Var.b;
            y9q0 y9q0VarT = ibm0.t(g1t0.m(), fetVar2);
            long j = qmk.q;
            long j2 = qmk.r;
            long j3 = qmk.n;
            v8q0.a(str2, mm40VarK1, 0L, new n05(j, j2, j3), 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, y9q0VarT, fetVar, 48, 24960, 110580);
            v8q0.a(str, mrv.k0(jm40Var, "SCORE_ID"), 0L, new n05(qmk.p, j2, j3), 0L, null, null, null, 0L, new f2q0(6), 0L, 2, false, 1, 0, null, ibm0.t(g1t0.m(), fetVar), fetVar, ((i2 >> 3) & 14) | 48, 24960, 109556);
            fetVar2 = fetVar;
            b = 1;
            fetVar2.r(true);
        } else {
            b = 1;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ldf(znp0Var, str, i, b);
        }
    }

    public static final ArrayList n0(pz10 pz10Var) {
        List<te90> listD = pz10Var.d();
        if (listD == null) {
            listD = iun.f15405a;
        }
        ArrayList arrayList = new ArrayList(r3d.q(listD, 10));
        for (te90 te90Var : listD) {
            arrayList.add(new wd90(qzb.v0(te90Var), qzb.x0(te90Var), te90Var.f33809a));
        }
        return arrayList;
    }

    public static final void o(mm40 mm40Var, zd80 zd80Var, Function2 function2, fet fetVar, int i) {
        int i2;
        zd80Var.getClass();
        function2.getClass();
        fetVar.g0(-1177491129);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(zd80Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function2) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            long backgroundContent = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarJ = s5x0.J(i120.Q(mm40VarD, backgroundContent, new ugg0(zclVar, zclVar, zclVar, zclVar)), 12.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            jm40 jm40Var = jm40.b;
            piz.n(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 8.0f, 7), zd80Var.f44201a, fetVar, 0);
            azw.k(s5x0.N(o7k0.d(jm40Var, 1.0f), 0.0f, 0.0f, 0.0f, 8.0f, 7), zd80Var.b, fetVar, 0);
            i4w0.D(null, zd80Var.c, function2, fetVar, i2 & 896);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new la70(mm40Var, zd80Var, function2, i, (byte) 4);
        }
    }

    public static final s2a0 o0(tdn tdnVar, boolean z) {
        tdnVar.getClass();
        long j = tdnVar.f33777a;
        d4d d4dVar = d4d.SECONDARY60;
        w6n w6nVar = w6n.j;
        String str = tdnVar.b;
        List list = u0d.f34849a;
        return new s2a0(j, new u6n(d4dVar, w6nVar, new c280(u0d.c(str) ? "" : ohs0.n(ujn.h, str), R.drawable.ic_glyph_placeholder_player)), tdnVar.c, z);
    }

    public static final void p(znp0 znp0Var, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(397005474);
        int i2 = i | (fetVar2.g(znp0Var) ? 4 : 2);
        if (fetVar2.U(i2 & 1, (i2 & 3) != 2)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar2, jm40Var);
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
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
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
            String str = znp0Var.d;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = o7k0.n(s5x0.N(jm40Var, 0.0f, 0.0f, 8.0f, 0.0f, 11), 40.0f);
            zfn zfnVar = m8m0.f21378a;
            mm40 mm40VarJ = lgb.J(i120.Q(mm40VarN, ((StaticColors) fetVar2.k(zfnVar)).m121getTransparent0d7_KjU(), vgg0.a(10.0f)), vgg0.a(10.0f));
            pge pgeVar = gqw0.A;
            pm80 pm80VarF = a8k0.F(R.drawable.ic_glyph_placeholder_player, 0, fetVar2);
            zfn zfnVar2 = zaq0.b;
            p8a.e(mm40VarJ, str, new gfm0(pm80VarF, new m78(((ThemeColors) fetVar2.k(zfnVar2)).getSecondary60(), 5)), new gfm0(a8k0.F(R.drawable.ic_glyph_placeholder_player, 0, fetVar2), new m78(((ThemeColors) fetVar2.k(zfnVar2)).getSecondary60(), 5)), pgeVar, fetVar2, 196608, 4);
            p8a.e(lgb.J(i120.Q(o7k0.n(jm40Var, 40.0f), ((StaticColors) fetVar2.k(zfnVar)).m121getTransparent0d7_KjU(), vgg0.a(10.0f)), vgg0.a(10.0f)), znp0Var.e, new gfm0(a8k0.F(R.drawable.ic_glyph_placeholder_player, 0, fetVar2), new m78(((ThemeColors) fetVar2.k(zfnVar2)).getSecondary60(), 5)), new gfm0(a8k0.F(R.drawable.ic_glyph_placeholder_player, 0, fetVar2), new m78(((ThemeColors) fetVar2.k(zfnVar2)).getSecondary60(), 5)), pgeVar, fetVar2, 196608, 4);
            fetVar2.r(true);
            mm40 mm40VarN2 = s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13);
            String str2 = znp0Var.b;
            long j = qmk.p;
            long j2 = qmk.r;
            v8q0.a(str2, mm40VarN2, 0L, new n05(j, j2, qmk.n), 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, ibm0.t(new y9q0(0L, j2, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar2), fetVar, 0, 24960, 109556);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wf00(znp0Var, i, (byte) 0);
        }
    }

    public static final r5h0 p0(lz10 lz10Var, ctf0 ctf0Var) {
        ctf0Var.getClass();
        return new r5h0(qzb.h0(ydx.U(lz10Var)), n0(lz10Var), new ggr0(qzb.u0(lz10Var), qzb.w0(lz10Var), ctf0Var.b.a(R.string.total_count, Arrays.copyOf(new Object[0], 0))), null, null);
    }

    public static final void q(mm40 mm40Var, Function1 function1, fet fetVar, int i) {
        function1.getClass();
        fetVar.g0(-1402192493);
        byte b = 16;
        int i2 = i | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zfn zfnVar = zaq0.b;
            imm immVar = new imm(new ilm(((ThemeColors) fetVar.k(zfnVar)).getSecondary()), new plm(rsm0.w(R.string.power_bet, 0, fetVar), ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), fa50.f9191a), fmm.f9790a, ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), false, null);
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new wta0(function1, b);
                fetVar.o0(objP);
            }
            hlm.c(mm40VarD, immVar, null, (Function0) objP, null, null, null, null, null, null, null, null, fetVar, 0, 0, 4084);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wbc(mm40Var, function1, i, (byte) 2);
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public static final a.r5h0 q0(a.nz10 r37, a.ctf0 r38) {
        /*
            Method dump skipped, instruction units count: 547
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.yyw.q0(a.nz10, a.ctf0):a.r5h0");
    }

    public static final void r(int i, fet fetVar, a4x a4xVar, mm40 mm40Var) {
        a4xVar.getClass();
        fetVar.g0(-1128703775);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(a4xVar) ? 32 : 16);
        byte b = 18;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE = h97.e(zclVar, zclVar, zclVar, zclVar, mm40Var);
            zfn zfnVar = zaq0.b;
            mm40 mm40VarK = s5x0.K(i120.Q(i120.S(mm40VarE, 1.0f, ((ThemeColors) fetVar.k(zfnVar)).getSecondary10(), new ugg0(zclVar, zclVar, zclVar, zclVar)), ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), jd8.n), 12.0f, 10.0f);
            x5d x5dVarA = w5d.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
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
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            Iterator itO = h97.o(fetVar, mm40VarC0, gqw0.v, -1542772423, a4xVar);
            while (itO.hasNext()) {
                s((mlc0) itO.next(), fetVar, 0);
            }
            fetVar.r(false);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zw1(mm40Var, a4xVar, i, b);
        }
    }

    public static final void s(mlc0 mlc0Var, fet fetVar, int i) {
        long commerce;
        fet fetVar2 = fetVar;
        fetVar2.g0(1865520331);
        int i2 = i | (fetVar2.g(mlc0Var) ? 4 : 2);
        if (fetVar2.U(i2 & 1, (i2 & 3) != 2)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
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
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 0.0f, 6.0f, 0.0f, 11);
            if (0.6f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            v8q0.a(mlc0Var.f21983a, mm40VarN.e(new x7z(0.6f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.6f, true)), 0L, null, 0L, null, null, null, 0L, new f2q0(5), 0L, 0, false, 0, 0, null, ibm0.n(g1t0.n(), fetVar2), fetVar, 0, 0, 130044);
            mm40 mm40VarN2 = s5x0.N(jm40Var, 6.0f, 0.0f, 0.0f, 0.0f, 14);
            if (0.4f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            mm40 mm40VarE = mm40VarN2.e(new x7z(0.4f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.4f, true));
            String str = mlc0Var.b;
            if (mlc0Var.c) {
                fetVar.e0(-361624391);
                commerce = ((ThemeColors) fetVar.k(zaq0.b)).getCommerce();
                fetVar.r(false);
            } else {
                fetVar.e0(-361690762);
                commerce = ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary();
                fetVar.r(false);
            }
            v8q0.a(str, mm40VarE, commerce, null, 0L, null, null, null, 0L, new f2q0(fetVar.k(bmd.n) == k6z.f17794a ? 6 : 5), 0L, 0, false, 0, 0, null, y9q0.a(g1t0.m(), 0L, 0L, null, null, null, 0L, null, null, 0, 1, 0L, null, null, 16711679), fetVar, 0, 0, 130040);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new lma0(mlc0Var, i, (byte) 24);
        }
    }

    public static final void t(tdm0 tdm0Var, boolean z, fet fetVar, int i) {
        int i2;
        k6z k6zVar;
        fetVar.g0(2023349596);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(tdm0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.h(z) ? 32 : 16;
        }
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            if (z) {
                fetVar.e0(-1181218333);
                k6zVar = (k6z) fetVar.k(bmd.n);
                fetVar.r(false);
            } else {
                fetVar.e0(-1181217409);
                fetVar.r(false);
                k6zVar = k6z.f17794a;
            }
            boolean z2 = tdm0Var.c.f && tdm0Var.d.f;
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
            obc.d(bmd.n.a(k6zVar), u1c.M(1631331090, new bg00(tdm0Var, z2, b), fetVar), fetVar, 56);
            fetVar.r(true);
            x4d0.k(tdm0Var.g, o7k0.d(jm40Var, 1.0f), fetVar, 48);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cg00(tdm0Var, z, i, b);
        }
    }

    public static final void u(int i, fet fetVar, mm40 mm40Var, String str) {
        fetVar.g0(-1163198048);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(str) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarA = o7k0.A(mm40Var, null, 3);
            zcl zclVar = qmk.f28987a;
            nkb.h(s5x0.L(o7k0.e(mm40VarA, 36.0f), qmk.a(fetVar).e, 0.0f, 2), new hjm(str, null, new y3d(((ThemeColors) fetVar.k(zaq0.b)).getSecondary()), null, null, null, false, null, null, false, null, null, 8186), kjm.b, null, null, null, fetVar, 384, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new n040(mm40Var, str, i, (byte) 10);
        }
    }

    public static final void v(fqj0 fqj0Var, fet fetVar, int i) {
        fqj0Var.getClass();
        fetVar.g0(-922216047);
        int i2 = (fetVar.g(fqj0Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            float f = qmk.a(fetVar).d;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarL = s5x0.L(jm40Var, f, 0.0f, 2);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar, 48);
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
            jpm0.o(fetVar, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarD);
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
            int i3 = (i2 << 3) & 112;
            b(s5x0.N(jm40Var, 8.0f, 16.0f, 0.0f, 16.0f, 4), fqj0Var, fetVar, i3);
            b(s5x0.N(jm40Var, 8.0f, 16.0f, 0.0f, 16.0f, 4), fqj0Var, fetVar, i3);
            fetVar.r(true);
            int i4 = i2 & 14;
            g(fqj0Var, fetVar, i4);
            g(fqj0Var, fetVar, i4);
            g(fqj0Var, fetVar, i4);
            g(fqj0Var, fetVar, i4);
            g(fqj0Var, fetVar, i4);
            g(fqj0Var, fetVar, i4);
            g(fqj0Var, fetVar, i4);
            g(fqj0Var, fetVar, i4);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new on7((byte) 4, i, fqj0Var);
        }
    }

    public static final void w(sdm0 sdm0Var, boolean z, fet fetVar, int i) {
        int i2;
        k6z k6zVar;
        fetVar.g0(1488529748);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(sdm0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.h(z) ? 32 : 16;
        }
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            if (z) {
                fetVar.e0(252983355);
                k6zVar = (k6z) fetVar.k(bmd.n);
                fetVar.r(false);
            } else {
                fetVar.e0(252984279);
                fetVar.r(false);
                k6zVar = k6z.f17794a;
            }
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar, 48);
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
            obc.d(bmd.n.a(k6zVar), u1c.M(-2074109346, new tf00(sdm0Var, b), fetVar), fetVar, 56);
            x4d0.k(sdm0Var.d, o7k0.d(jm40Var, 1.0f), fetVar, 48);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new uf00(sdm0Var, z, i, b);
        }
    }

    public static final void x(a4x a4xVar, Function1 function1, fet fetVar, int i) {
        fetVar.g0(-323990791);
        int i2 = 32;
        int i3 = (fetVar.g(a4xVar) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        boolean z = false;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarQ = i120.Q(s5x0.L(mm40VarD, qmk.a(fetVar).c, 0.0f, 2), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), vgg0.a(16.0f));
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z2 = fetVar.S;
            Function0 function0 = e7z.u1;
            if (z2) {
                fetVar.l(function0);
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
            mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarD2);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(function0);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            for (Iterator itO = h97.o(fetVar, mm40VarC1, shdVar4, 123478766, a4xVar); itO.hasNext(); itO = itO) {
                uvi0 uvi0Var = (uvi0) itO.next();
                rqm rqmVar = uvi0Var.b;
                int i4 = i3 & 112;
                boolean zI = (i4 == i2 ? true : z) | fetVar.i(uvi0Var);
                Object objP = fetVar.P();
                Object obj = ukd.f35823a;
                if (zI || objP == obj) {
                    objP = new ry60(function1, uvi0Var, (byte) 2);
                    fetVar.o0(objP);
                }
                Function0 function2 = (Function0) objP;
                boolean zI2 = (i4 == i2 ? true : z) | fetVar.i(uvi0Var);
                Object objP2 = fetVar.P();
                if (zI2 || objP2 == obj) {
                    objP2 = new ry60(function1, uvi0Var, (byte) 3);
                    fetVar.o0(objP2);
                }
                obc.q(null, rqmVar, false, null, function2, null, (Function0) objP2, null, fetVar, 0, 173);
                z = z;
                i2 = i2;
            }
            ohs0.x(fetVar, z, true, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new q0h((byte) 4, i, a4xVar, function1);
        }
    }

    public static final void y(String str, String str2, int i, zx7 zx7Var, int i2, fet fetVar, int i3) {
        zx7 zx7Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(158642557);
        int i4 = (fetVar2.g(str) ? 4 : 2) | i3 | (fetVar2.g(str2) ? 32 : 16);
        if ((i3 & 384) == 0) {
            i4 |= fetVar2.e(i) ? 256 : 128;
        }
        if (fetVar2.U(i4 & 1, (i4 & 9363) != 9362)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar2, jm40Var);
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
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, jm40Var);
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
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = lgb.J(i120.Q(o7k0.n(jm40Var, 40.0f), ((StaticColors) fetVar2.k(m8m0.f21378a)).m121getTransparent0d7_KjU(), vgg0.a(10.0f)), vgg0.a(10.0f));
            pge pgeVar = gqw0.A;
            pm80 pm80VarF = a8k0.F(R.drawable.ic_glyph_placeholder_player, 0, fetVar2);
            zfn zfnVar = zaq0.b;
            p8a.e(mm40VarJ, str, new gfm0(pm80VarF, new m78(((ThemeColors) fetVar2.k(zfnVar)).getSecondary60(), 5)), new gfm0(a8k0.F(R.drawable.ic_glyph_placeholder_player, 0, fetVar2), new m78(((ThemeColors) fetVar2.k(zfnVar)).getSecondary60(), 5)), pgeVar, fetVar2, ((i4 << 3) & 112) | 196608, 4);
            if (i > 0) {
                fetVar2.e0(1200155191);
                zx7Var2 = zx7Var;
                tdc.e(new rpe(i), ipe.f15159a, o7k0.n(jr8.f16991a.b(jm40Var, zx7Var2), 16.0f), fetVar, 48, 0);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                zx7Var2 = zx7Var;
                fetVar2.e0(1200449257);
                fetVar2.r(false);
            }
            fetVar2.r(true);
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13);
            long j = qmk.p;
            long j2 = qmk.r;
            v8q0.a(str2, mm40VarN, 0L, new n05(j, j2, qmk.n), 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, i2, 0, null, ibm0.t(new y9q0(0L, j2, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar2), fetVar, (i4 >> 3) & 14, 24960, 109556);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            zx7Var2 = zx7Var;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vf00(str, str2, i, zx7Var2, i2, i3, (byte) 0);
        }
    }

    public static final void z(udm0 udm0Var, boolean z, fet fetVar, int i) {
        int i2;
        k6z k6zVar;
        fetVar.g0(-1190285062);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(udm0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.h(z) ? 32 : 16;
        }
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            if (z) {
                fetVar.e0(-1402638399);
                k6zVar = (k6z) fetVar.k(bmd.n);
                fetVar.r(false);
            } else {
                fetVar.e0(-1402637475);
                fetVar.r(false);
                k6zVar = k6z.f17794a;
            }
            obc.d(bmd.n.a(k6zVar), u1c.M(-1695234630, new zf00(udm0Var, b), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ag00(udm0Var, z, i, b);
        }
    }
}
