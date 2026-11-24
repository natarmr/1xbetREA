package a;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.hardware.Camera;
import android.util.Log;
import android.view.View;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.limits_ne.api.domain.LimitNeGroupEnum;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class g8x {
    public static rnh0 A(Collection collection) {
        collection.getClass();
        rnh0 rnh0Var = new rnh0();
        Collection collection2 = collection;
        String strN = axq.n(new StringBuilder(Separators.LPAREN), CollectionsKt.b0(collection2, HiAnalyticsConstant.REPORT_VAL_SEPARATOR, null, null, null, 62), ")=[a-zA-Z0-9._%-]+");
        nse0 nse0Var = nse0.IGNORE_CASE;
        rnh0Var.b(new Regex(strN, nse0Var), x4c0.B);
        rnh0Var.b(new Regex(axq.n(new StringBuilder(Separators.LPAREN), CollectionsKt.b0(collection2, HiAnalyticsConstant.REPORT_VAL_SEPARATOR, null, null, null, 62), "):[a-zA-Z0-9._%-]+"), nse0Var), x4c0.Y);
        rnh0Var.b(new Regex(axq.n(new StringBuilder("\"("), CollectionsKt.b0(collection2, HiAnalyticsConstant.REPORT_VAL_SEPARATOR, null, null, null, 62), ")\":\"[a-zA-Z0-9._%-]+\""), nse0Var), x4c0.Z);
        rnh0Var.b(new Regex(axq.n(new StringBuilder("\\{\"key\":\"("), CollectionsKt.b0(collection2, HiAnalyticsConstant.REPORT_VAL_SEPARATOR, null, null, null, 62), ")\",\"value\":\"[a-zA-Z0-9._%-]+\""), nse0Var), x4c0.f1);
        return rnh0Var;
    }

    public static int B(int i) {
        int numberOfCameras = Camera.getNumberOfCameras();
        if (numberOfCameras == 0) {
            Log.w("a.g8x", "No cameras!");
            return -1;
        }
        boolean z = i >= 0;
        if (!z) {
            i = 0;
            while (i < numberOfCameras) {
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                Camera.getCameraInfo(i, cameraInfo);
                if (cameraInfo.facing == 0) {
                    break;
                }
                i++;
            }
        }
        if (i < numberOfCameras) {
            return i;
        }
        return z ? -1 : 0;
    }

    public static final ArrayList C(cnx cnxVar) {
        cnxVar.getClass();
        e7z e7zVarL0 = ((c810) cnxVar).L0();
        boolean zN = N(e7zVarL0);
        ty40 ty40Var = (ty40) e7zVarL0.p();
        xz40 xz40Var = (xz40) ty40Var.b;
        ArrayList arrayList = new ArrayList(xz40Var.c);
        int i = xz40Var.c;
        for (int i2 = 0; i2 < i; i2++) {
            e7z e7zVar = (e7z) ty40Var.get(i2);
            arrayList.add(zN ? e7zVar.m() : e7zVar.n());
        }
        return arrayList;
    }

    public static Object D(AbstractSet abstractSet, String str) {
        Iterator it = abstractSet.iterator();
        return it.hasNext() ? it.next() : str;
    }

    public static final int E(LimitNeGroupEnum limitNeGroupEnum) {
        int iOrdinal = limitNeGroupEnum.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            return R.string.deposit_limits_requirements_new;
        }
        if (iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4) {
            return R.string.empty_str;
        }
        t9f.b();
        return 0;
    }

    public static final int F(LimitNeGroupEnum limitNeGroupEnum) {
        int iOrdinal = limitNeGroupEnum.ordinal();
        if (iOrdinal == 0) {
            return R.string.bet_limit_title;
        }
        if (iOrdinal == 1) {
            return R.string.deposit_limits_title;
        }
        if (iOrdinal == 2) {
            return R.string.limit_self_restraint;
        }
        if (iOrdinal == 3) {
            return R.string.limit_self_block;
        }
        if (iOrdinal == 4) {
            return R.string.empty_str;
        }
        t9f.b();
        return 0;
    }

    public static final List G(boolean z, ctf0 ctf0Var, LimitNeGroupEnum limitNeGroupEnum) {
        if (!z) {
            return kotlin.collections.a.c(new mzz(limitNeGroupEnum, false, ctf0Var.b.a(R.string.confirm, Arrays.copyOf(new Object[0], 0))));
        }
        String strA = ctf0Var.b.a(R.string.limit_accept_info, Arrays.copyOf(new Object[0], 0));
        d4d d4dVar = d4d.PRIMARY;
        d4d d4dVar2 = d4d.PRIMARY;
        return q3d.j(new nzz(strA), new mzz(limitNeGroupEnum, true, ctf0Var.b.a(R.string.confirm, Arrays.copyOf(new Object[0], 0))));
    }

    public static Object H(Iterable iterable) {
        Object next;
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (!list.isEmpty()) {
                return list.get(list.size() - 1);
            }
            itt0.a();
            return null;
        }
        if (iterable instanceof SortedSet) {
            return ((SortedSet) iterable).last();
        }
        Iterator it = iterable.iterator();
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static final wui0 I(int i, int i2, boolean z) {
        if (i2 == 0 && z) {
            return wui0.b;
        }
        if (i2 == 0) {
            return wui0.f39793a;
        }
        if (i == 0) {
            return wui0.b;
        }
        if (i == i2 && z) {
            return wui0.c;
        }
        return i == i2 ? wui0.d : wui0.c;
    }

    public static final int J(int i, int i2, int i3) {
        if (i3 > 0) {
            if (i < i2) {
                int i4 = i2 % i3;
                if (i4 < 0) {
                    i4 += i3;
                }
                int i5 = i % i3;
                if (i5 < 0) {
                    i5 += i3;
                }
                int i6 = (i4 - i5) % i3;
                if (i6 < 0) {
                    i6 += i3;
                }
                return i2 - i6;
            }
        } else {
            if (i3 >= 0) {
                jf4.o("Step is zero.");
                return 0;
            }
            if (i > i2) {
                int i7 = -i3;
                int i8 = i % i7;
                if (i8 < 0) {
                    i8 += i7;
                }
                int i9 = i2 % i7;
                if (i9 < 0) {
                    i9 += i7;
                }
                int i10 = (i8 - i9) % i7;
                if (i10 < 0) {
                    i10 += i7;
                }
                return i10 + i2;
            }
        }
        return i2;
    }

    public static final List K(g950 g950Var) {
        g950Var.getClass();
        String strB = g950Var.b();
        strB.getClass();
        swq swqVar = aey.f753a;
        if (kotlin.text.c.x(strB, "get", false) || kotlin.text.c.x(strB, "is", false)) {
            g950 g950VarR = R(g950Var, "get", null, 12);
            if (g950VarR == null) {
                g950VarR = R(g950Var, "is", null, 8);
            }
            return q3d.k(g950VarR);
        }
        if (kotlin.text.c.x(strB, "set", false)) {
            return tx3.z(new g950[]{R(g950Var, "set", null, 4), R(g950Var, "set", "is", 4)});
        }
        List list = (List) ld9.b.get(g950Var);
        return list == null ? iun.f15405a : list;
    }

    public static final int L(wrz wrzVar) {
        if (wrzVar == ge7.BET_LIMIT_1_DAY || wrzVar == o7k.DEPOSIT_LIMIT_1_DAY) {
            return R.string.limits_daily_limit_title;
        }
        if (wrzVar == oki0.SESSION_TIME_LIMIT_1_DAY) {
            return R.string.limit_session_day_in_hours;
        }
        if (wrzVar == ge7.BET_LIMIT_7_DAY || wrzVar == o7k.DEPOSIT_LIMIT_7_DAY) {
            return R.string.limits_weekly_limit_title;
        }
        if (wrzVar == oki0.SESSION_TIME_LIMIT_7_DAY) {
            return R.string.limit_session_week_in_days;
        }
        if (wrzVar == ge7.BET_LIMIT_30_DAY || wrzVar == o7k.DEPOSIT_LIMIT_30_DAY) {
            return R.string.limits_monthly_limit_title;
        }
        if (wrzVar == oki0.SESSION_TIME_LIMIT_30_DAY) {
            return R.string.limit_session_month_in_days;
        }
        if (wrzVar == g8i0.f10866a) {
            return R.string.limits_self_exclusion_desc;
        }
        if (wrzVar == asz.b) {
            return R.string.empty_str;
        }
        t9f.b();
        return 0;
    }

    public static final String M(gip0 gip0Var) {
        List list;
        o4n0 o4n0Var;
        String str = null;
        if ((gip0Var != null ? gip0Var.d : null) != null) {
            String str2 = gip0Var.d;
            return str2 == null ? "" : str2;
        }
        if (gip0Var != null && (list = gip0Var.e) != null && (o4n0Var = (o4n0) CollectionsKt.firstOrNull(list)) != null) {
            str = o4n0Var.b;
        }
        return str == null ? "" : str;
    }

    public static final boolean N(e7z e7zVar) {
        int iOrdinal = e7zVar.i1.d.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        if (iOrdinal != 4) {
                            t9f.b();
                            return false;
                        }
                        e7z e7zVarV = e7zVar.v();
                        if (e7zVarV != null) {
                            return N(e7zVarV);
                        }
                        jf4.o("no parent for idle node");
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static final void O(String str) {
        str.getClass();
        throw new IllegalArgumentException(kng0.l("No valid saved state was found for the key '", str, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
    }

    public static final String P(bm90 bm90Var) {
        return twn.p("\\d", bm90Var.f2826a, TokenNames.X);
    }

    public static final int Q(bm90 bm90Var) {
        String strP = P(bm90Var);
        int i = 0;
        for (int i2 = 0; i2 < strP.length(); i2++) {
            if (Intrinsics.d(String.valueOf(strP.charAt(i2)), TokenNames.X)) {
                i++;
            }
        }
        return i;
    }

    public static g950 R(g950 g950Var, String str, String str2, int i) {
        char cCharAt;
        char cCharAt2;
        Object next;
        boolean z = (i & 4) != 0;
        if ((i & 8) != 0) {
            str2 = null;
        }
        if (!g950Var.b) {
            String strC = g950Var.c();
            if (kotlin.text.c.x(strC, str, false) && strC.length() != str.length() && ('a' > (cCharAt = strC.charAt(str.length())) || cCharAt >= '{')) {
                if (str2 != null) {
                    return g950.e(str2.concat(StringsKt.d0(str, strC)));
                }
                if (!z) {
                    return g950Var;
                }
                String strD0 = StringsKt.d0(str, strC);
                if (strD0.length() != 0 && zgc.M(0, strD0)) {
                    if (strD0.length() != 1 && zgc.M(1, strD0)) {
                        Iterator it = new IntRange(0, strD0.length() - 1, 1).iterator();
                        do {
                            if (!((kkx) it).c) {
                                next = null;
                                break;
                            }
                            next = ((bkx) it).next();
                        } while (zgc.M(((Number) next).intValue(), strD0));
                        Integer num = (Integer) next;
                        if (num != null) {
                            int iIntValue = num.intValue() - 1;
                            strD0 = zgc.S(strD0.substring(0, iIntValue)).concat(strD0.substring(iIntValue));
                        } else {
                            strD0 = zgc.S(strD0);
                        }
                    } else if (strD0.length() != 0 && 'A' <= (cCharAt2 = strD0.charAt(0)) && cCharAt2 < '[') {
                        strD0 = Character.toLowerCase(cCharAt2) + strD0.substring(1);
                    }
                }
                if (g950.f(strD0)) {
                    return g950.e(strD0);
                }
            }
        }
        return null;
    }

    public static final a1m0 S(List list, k0m0 k0m0Var, long j) throws Throwable {
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        T(list, map, k0m0Var, 0, treeMap, j);
        Collection collectionValues = treeMap.values();
        collectionValues.getClass();
        List listT0 = CollectionsKt.t0(collectionValues);
        lun lunVar = lun.f20680a;
        lunVar.getClass();
        return new a1m0(listT0, map, lunVar, null, -1);
    }

    /* JADX WARN: Code duplicated, block: B:188:0x0281  */
    /* JADX WARN: Code duplicated, block: B:201:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:202:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:206:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:222:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:237:0x0315  */
    /* JADX WARN: Code duplicated, block: B:301:0x0246 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:308:0x0216 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:321:0x0294 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:325:0x0291 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r16v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r24v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r25v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v27, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r4v28, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v32, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r5v33, types: [java.util.ArrayList] */
    public static final void T(List list, HashMap map, k0m0 k0m0Var, int i, TreeMap treeMap, long j) throws Throwable {
        Object next;
        Object next2;
        Throwable th;
        ArrayList arrayList;
        cys0 cys0Var;
        boolean z;
        cys0 cys0Var2;
        int i2;
        Object obj;
        boolean z2;
        int i3;
        int i4;
        int i5;
        int iIntValue;
        int iIntValue2;
        String str;
        ?? arrayList2;
        ?? arrayList3;
        List list2;
        List list3;
        String str2 = "";
        if (!treeMap.containsKey(Integer.valueOf(i))) {
            Integer numValueOf = Integer.valueOf(i);
            String str3 = k0m0Var.f17476a;
            if (str3 == null) {
                str3 = "";
            }
            treeMap.put(numValueOf, str3);
        }
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.d(((gip0) next).f11360a, k0m0Var.c));
        gip0 gip0Var = (gip0) next;
        Iterator it2 = list.iterator();
        do {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
        } while (!Intrinsics.d(((gip0) next2).f11360a, k0m0Var.d));
        gip0 gip0Var2 = (gip0) next2;
        String str4 = k0m0Var.f17476a;
        List<x0m0> list4 = k0m0Var.e;
        String str5 = k0m0Var.c;
        String str6 = k0m0Var.d;
        if (str4 == null) {
            str4 = "";
        }
        if (!map.containsKey(str4)) {
            map.put(str4, new ArrayList());
        }
        String str7 = str5 == null ? "" : str5;
        String str8 = str6 == null ? "" : str6;
        if (list4 != null) {
            th = null;
            arrayList = new ArrayList(r3d.q(list4, 10));
            for (x0m0 x0m0Var : list4) {
                x0m0Var.getClass();
                String str9 = x0m0Var.f40077a;
                String str10 = str9 == null ? str2 : str9;
                String str11 = Intrinsics.d(x0m0Var.b, str7) ? str7 : str8;
                String str12 = Intrinsics.d(x0m0Var.c, str8) ? str8 : str7;
                Integer num = x0m0Var.d;
                int iIntValue3 = num != null ? num.intValue() : -1;
                String str13 = str2;
                Integer num2 = x0m0Var.e;
                int iIntValue4 = num2 != null ? num2.intValue() : -1;
                String str14 = x0m0Var.f;
                String str15 = str14 == null ? str13 : str14;
                String str16 = x0m0Var.g;
                String str17 = str16 == null ? str13 : str16;
                Long l = x0m0Var.h;
                long jLongValue = 0;
                long jLongValue2 = l != null ? l.longValue() : 0L;
                pek pekVar = lho.b;
                Integer num3 = x0m0Var.i;
                int iIntValue5 = num3 != null ? num3.intValue() : 0;
                pekVar.getClass();
                lho lhoVarG = pek.g(iIntValue5);
                Integer num4 = x0m0Var.j;
                int iIntValue6 = num4 != null ? num4.intValue() : -1;
                Long l2 = x0m0Var.k;
                if (l2 != null) {
                    jLongValue = l2.longValue();
                }
                arrayList.add(new u0m0(str10, str11, str12, iIntValue3, iIntValue4, str15, str17, jLongValue2, lhoVarG, iIntValue6, jLongValue));
                str2 = str13;
            }
        } else {
            th = null;
            arrayList = null;
        }
        String str18 = str2;
        Iterable iterable = arrayList;
        if (arrayList == null) {
            iterable = iun.f15405a;
        }
        List listA0 = CollectionsKt.A0(iterable, new mjf0((byte) 18));
        if (str5 == null && str6 == null) {
            cys0Var = cys0.g;
        } else if (str5 == null || str6 == null) {
            cys0Var = cys0.f;
        } else {
            if (list.isEmpty()) {
                z = false;
            } else {
                if (!list.isEmpty()) {
                    Iterator it3 = list.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            List list5 = ((gip0) it3.next()).e;
                            if ((list5 != null ? list5.size() : 0) <= 1) {
                                z = false;
                            }
                        }
                    }
                }
                z = true;
            }
            ArrayList arrayList4 = new ArrayList();
            for (Object obj2 : listA0) {
                if (((u0m0) obj2).i != lho.UNKNOWN) {
                    arrayList4.add(obj2);
                }
            }
            boolean z3 = j == 66;
            boolean z4 = j == 4;
            if (arrayList4.size() > 1) {
                cys0Var2 = cys0.b;
            } else if (z3) {
                cys0Var2 = cys0.d;
            } else if (z) {
                cys0Var2 = cys0.c;
            } else {
                cys0Var2 = z4 ? cys0.e : cys0.f5194a;
            }
            cys0Var = cys0Var2;
        }
        cys0 cys0Var3 = cys0Var;
        Object obj3 = gip0Var != null ? gip0Var.b : th;
        ?? r15 = obj3 == null ? str18 : obj3;
        Object obj4 = gip0Var2 != null ? gip0Var2.b : th;
        if (obj4 == null) {
            obj4 = str18;
        }
        if (list4 == null || list4.isEmpty()) {
            i2 = 0;
        } else {
            i2 = 0;
            for (x0m0 x0m0Var2 : list4) {
                boolean zD = Intrinsics.d(x0m0Var2.b, str5);
                Integer num5 = x0m0Var2.j;
                if (zD) {
                    if (num5 != null && num5.intValue() == 1) {
                        i2++;
                        if (i2 >= 0) {
                            q3d.o();
                            throw th;
                        }
                    }
                } else if (num5 != null && num5.intValue() == 2) {
                    i2++;
                    if (i2 >= 0) {
                        q3d.o();
                        throw th;
                    }
                }
            }
        }
        if (list4 != null) {
            if (list4.isEmpty()) {
                i3 = 0;
            } else {
                i3 = 0;
                for (x0m0 x0m0Var3 : list4) {
                    Object obj5 = obj4;
                    boolean zD2 = Intrinsics.d(x0m0Var3.c, str6);
                    Integer num6 = x0m0Var3.j;
                    if (zD2) {
                        if (num6 != null && num6.intValue() == 2) {
                            i3++;
                            if (i3 >= 0) {
                                q3d.o();
                                throw th;
                            }
                        }
                    } else if (num6 != null) {
                        if (num6.intValue() == 1) {
                            i3++;
                            if (i3 >= 0) {
                                q3d.o();
                                throw th;
                            }
                        } else {
                            continue;
                        }
                    }
                    obj4 = obj5;
                }
            }
            obj = obj4;
            z2 = true;
        } else {
            obj = obj4;
            z2 = true;
            i3 = 0;
        }
        if (i2 > i3) {
            if (str5 == null) {
                str = str18;
            } else {
                str = str5;
            }
        } else if (i2 >= i3) {
            if ((list4 != null ? list4.size() : 0) % 2 == 0) {
                if (list4 != null) {
                    i4 = 0;
                    for (x0m0 x0m0Var4 : list4) {
                        if (Intrinsics.d(x0m0Var4.b, str5)) {
                            Integer num7 = x0m0Var4.d;
                            if (num7 != null) {
                                iIntValue2 = num7.intValue();
                            } else {
                                iIntValue2 = 0;
                            }
                        } else {
                            Integer num8 = x0m0Var4.e;
                            if (num8 != null) {
                                iIntValue2 = num8.intValue();
                            } else {
                                iIntValue2 = 0;
                            }
                        }
                        i4 += iIntValue2;
                    }
                } else {
                    i4 = 0;
                }
                if (list4 != null) {
                    int i6 = 0;
                    for (x0m0 x0m0Var5 : list4) {
                        if (Intrinsics.d(x0m0Var5.c, str6)) {
                            Integer num9 = x0m0Var5.e;
                            if (num9 != null) {
                                iIntValue = num9.intValue();
                            } else {
                                iIntValue = 0;
                            }
                        } else {
                            Integer num10 = x0m0Var5.d;
                            if (num10 != null) {
                                iIntValue = num10.intValue();
                            } else {
                                iIntValue = 0;
                            }
                        }
                        i6 += iIntValue;
                    }
                    i5 = i6;
                } else {
                    i5 = 0;
                }
                if (i4 > i5) {
                    if (str5 != null) {
                        str = str5;
                    }
                } else if (i4 < i5 && str6 != null) {
                    str = str6;
                }
            }
            str = str18;
        } else if (str6 == null) {
            str = str18;
        } else {
            str = str6;
        }
        String strT = vsm0.t(M(gip0Var));
        String strT2 = vsm0.t(M(gip0Var2));
        if (gip0Var == null || (list3 = gip0Var.e) == null) {
            arrayList2 = th;
        } else {
            arrayList2 = new ArrayList(r3d.q(list3, 10));
            Iterator it4 = list3.iterator();
            while (it4.hasNext()) {
                arrayList2.add(a4n0.m((o4n0) it4.next()));
            }
        }
        if (arrayList2 == 0) {
            arrayList2 = iun.f15405a;
        }
        ?? r24 = arrayList2;
        if (gip0Var2 == null || (list2 = gip0Var2.e) == null) {
            arrayList3 = th;
        } else {
            arrayList3 = new ArrayList(r3d.q(list2, 10));
            Iterator it5 = list2.iterator();
            while (it5.hasNext()) {
                arrayList3.add(a4n0.m((o4n0) it5.next()));
            }
        }
        if (arrayList3 == 0) {
            arrayList3 = iun.f15405a;
        }
        ?? r25 = arrayList3;
        String str19 = k0m0Var.h;
        if (str19 == null) {
            str19 = str18;
        }
        String str20 = k0m0Var.i;
        if (str20 == null) {
            str20 = str18;
        }
        lk50 lk50Var = new lk50(j, r15, obj, str7, str8, str, strT, strT2, listA0, cys0Var3, r24, r25, new k1m0(str19, str20), i);
        List list6 = (List) map.get(str4);
        if (list6 != null) {
            list6.add(lk50Var);
        }
        k0m0 k0m0Var2 = k0m0Var.f;
        if (k0m0Var2 != null) {
            T(list, map, k0m0Var2, i + 1, treeMap, j);
        }
        k0m0 k0m0Var3 = k0m0Var.g;
        if (k0m0Var3 != null) {
            T(list, map, k0m0Var3, i + 1, treeMap, j);
        }
    }

    public static final pz40 U(View view, fet fetVar, int i) {
        if ((i & 1) != 0) {
            view = (View) fetVar.k(dy2.f);
        }
        boolean zG = fetVar.g(view);
        Object objP = fetVar.P();
        byte b = 0;
        boolean z = false;
        Object obj = ukd.f35823a;
        Object obj2 = objP;
        if (zG || objP == obj) {
            Object objE = androidx.compose.runtime.e.e(new tly(0.0f, z ? 1 : 0));
            fetVar.o0(objE);
            obj2 = objE;
        }
        pz40 pz40Var = (pz40) obj2;
        boolean zI = fetVar.i(view) | fetVar.g(pz40Var);
        Object objP2 = fetVar.P();
        Object obj3 = objP2;
        if (zI || objP2 == obj) {
            Object rlyVar = new rly(view, pz40Var, b);
            fetVar.o0(rlyVar);
            obj3 = rlyVar;
        }
        m0x0.o(view, (Function1) obj3, fetVar);
        return pz40Var;
    }

    public static void W(List list, lsb0 lsb0Var, int i, int i2) {
        for (int size = list.size() - 1; size > i2; size--) {
            if (lsb0Var.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            list.remove(i3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final r820 X(ly6 ly6Var, ctf0 ctf0Var) {
        String strQ;
        String str;
        j43 j43Var;
        String strA;
        kf9 kf9Var;
        ctf0Var.getClass();
        jur jurVar = ly6Var.d;
        g680 g680Var = ly6Var.f;
        vw20 vw20Var = jurVar.f17171a;
        if (vw20Var instanceof tw20) {
            strQ = ((tw20) vw20Var).f34628a;
        } else {
            if (!(vw20Var instanceof uw20)) {
                t9f.b();
                return null;
            }
            uw20 uw20Var = (uw20) vw20Var;
            strQ = w6x.q(uw20Var.f36375a, Separators.SP, uw20Var.b);
        }
        n5n0 n5n0Var = jurVar.b;
        wbs0 wbs0Var = jurVar.d;
        fho fhoVar = jurVar.e;
        if (n5n0Var instanceof l5n0) {
            str = "";
        } else {
            if (!(n5n0Var instanceof m5n0)) {
                t9f.b();
                return null;
            }
            str = ((m5n0) n5n0Var).f21229a;
        }
        if (fhoVar == fho.b) {
            j43Var = null;
            strA = ctf0Var.b.a(R.string.auto_sub_title, Arrays.copyOf(new Object[0], 0));
        } else {
            j43Var = null;
            strA = null;
        }
        vf40 vf40Var = new vf40(new lgs(strQ, str, strA), g680Var == null ? jurVar.c : j43Var);
        String strA2 = fhoVar == fho.c ? ctf0Var.b.a(R.string.options_bet_label, Arrays.copyOf(new Object[0], 0)) : j43Var;
        htv htvVar = ly6Var.b;
        if (wbs0Var == wbs0.IS_NOT_VISIBLE && htvVar.f == jye.INVISIBLE) {
            kf9Var = j43Var;
        } else {
            int[] iArr = v820.f36960a;
            tbs0 tbs0Var = iArr[wbs0Var.ordinal()] == 1 ? tbs0.UNTRACK : tbs0.TRACK;
            String strA3 = iArr[wbs0Var.ordinal()] == 1 ? ctf0Var.b.a(R.string.bet_stop_monitoring, Arrays.copyOf(new Object[0], 0)) : ctf0Var.b.a(R.string.bet_add_to_monitoring, Arrays.copyOf(new Object[0], 0));
            jye jyeVar = htvVar.f;
            int[] iArr2 = v820.b;
            kf9Var = new kf9(new ubs0(tbs0Var, strA3), new kye(iArr2[jyeVar.ordinal()] == 1 ? iye.ADD_TO_COUPON : iye.REMOVE_FROM_COUPON, iArr2[htvVar.f.ordinal()] == 1 ? ctf0Var.b.a(R.string.bet_add_to_coupon, Arrays.copyOf(new Object[0], 0)) : ctf0Var.b.a(R.string.bet_remove_from_coupon, Arrays.copyOf(new Object[0], 0))));
        }
        f0d f0dVar = ly6Var.e;
        return new r820(new sy6(vf40Var, strA2, kf9Var, !f0dVar.c ? j43Var : new fo8(f0dVar.f8711a, f0dVar.b, ctf0Var.b.a(R.string.settings, Arrays.copyOf(new Object[0], 0)))), g680Var != null ? new k680(g680Var.f10750a, g680Var.b) : j43Var);
    }

    public static final cdp0 Y(Pair pair, String str, boolean z, List list, List list2, Pair pair2) {
        Object obj = pair.b;
        Object obj2 = pair.f46059a;
        Object obj3 = pair2.b;
        Object obj4 = pair2.f46059a;
        str.getClass();
        list.getClass();
        if (str.length() > 0) {
            String str2 = (String) CollectionsKt.firstOrNull(list);
            if (str2 == null) {
                str2 = "";
            }
            k5a0 k5a0VarN = d7x.N(new c280(vsm0.s(((Number) obj2).longValue(), str2), R.drawable.ic_glyph_placeholder_player), ((Number) obj2).longValue(), list2, z, (dap) obj4);
            String str3 = (String) CollectionsKt.W(1, list);
            Number number = (Number) obj;
            return new zcp0(str, k5a0VarN, d7x.N(new c280(vsm0.s(number.longValue(), str3 != null ? str3 : ""), R.drawable.ic_glyph_placeholder_player), number.longValue(), list2, z, (dap) obj3));
        }
        String str4 = (String) CollectionsKt.firstOrNull(list);
        if (str4 == null) {
            str4 = "";
        }
        k5a0 k5a0VarN2 = d7x.N(new c280(vsm0.s(((Number) obj2).longValue(), str4), R.drawable.ic_glyph_placeholder_player), ((Number) obj2).longValue(), list2, z, (dap) obj4);
        String str5 = (String) CollectionsKt.W(1, list);
        Number number2 = (Number) obj;
        return new adp0(k5a0VarN2, d7x.N(new c280(vsm0.s(number2.longValue(), str5 != null ? str5 : ""), R.drawable.ic_glyph_placeholder_player), number2.longValue(), list2, z, (dap) obj3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v3, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r8v12, types: [a.g1m0] */
    /* JADX WARN: Type inference failed for: r8v3, types: [a.i1m0] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object] */
    public static final r1m0 Z(f1m0 f1m0Var) {
        List<k0m0> list;
        ?? i1m0Var;
        k0m0 k0m0Var;
        Long l = f1m0Var.b;
        n0m0 n0m0Var = f1m0Var.c;
        List list2 = f1m0Var.f8771a;
        long jLongValue = l != null ? l.longValue() : 0L;
        ?? arrayList = 0;
        arrayList = 0;
        String str = n0m0Var != null ? n0m0Var.f22706a : null;
        if (str == null) {
            str = "";
        }
        String str2 = n0m0Var != null ? n0m0Var.c : null;
        y0m0 y0m0Var = new y0m0(jLongValue, str, str2 != null ? str2 : "");
        if (n0m0Var != null && (list = n0m0Var.b) != null) {
            arrayList = new ArrayList(r3d.q(list, 10));
            for (k0m0 k0m0Var2 : list) {
                k0m0 k0m0Var3 = k0m0Var2.f;
                if (k0m0Var3 == null || (k0m0Var = k0m0Var2.g) == null || Intrinsics.d(k0m0Var3.f17476a, k0m0Var.f17476a)) {
                    i1m0Var = new i1m0(S(list2 == null ? iun.f15405a : list2, k0m0Var2, l != null ? l.longValue() : 0L));
                } else {
                    i1m0Var = new g1m0(S(list2 == null ? iun.f15405a : list2, k0m0.a(k0m0Var2, 447), l != null ? l.longValue() : 0L), S(list2 == null ? iun.f15405a : list2, k0m0.a(k0m0Var2, 479), l != null ? l.longValue() : 0L));
                }
                arrayList.add(i1m0Var);
            }
        }
        if (arrayList == 0) {
            arrayList = iun.f15405a;
        }
        return new r1m0(y0m0Var, arrayList);
    }

    public static final void a(mm40 mm40Var, q1l0 q1l0Var, Function0 function0, fet fetVar, int i) {
        int i2;
        fetVar.g0(998841234);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(q1l0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function0) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(o7k0.e(mm40Var, 40.0f), 8.0f, 0.0f, 2.0f, 0.0f, 10);
            boolean z = (i2 & 896) == 256;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new l3c0(function0, (byte) 16);
                fetVar.o0(objP);
            }
            mm40 mm40VarY = y860.Y(mm40VarN, false, null, null, (Function0) objP, 15);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarY);
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
            dww.c(a8k0.F(q1l0Var.f27960a, 0, fetVar), null, o7k0.n(jm40.b, 24.0f), ((ThemeColors) fetVar.k(zaq0.b)).getPrimary(), fetVar, 56, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wbg0((Object) mm40Var, (Object) q1l0Var, (Object) function0, i, (byte) 27);
        }
    }

    public static final y9q0 a0(sw20 sw20Var) {
        sw20Var.getClass();
        int iOrdinal = sw20Var.ordinal();
        if (iOrdinal == 0) {
            return new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109);
        }
        if (iOrdinal == 1) {
            return new y9q0(0L, qmk.r, null, j1t0.c, 0L, null, 0, 0, qmk.F, 16646109);
        }
        if (iOrdinal == 2) {
            return new y9q0(0L, qmk.s, null, j1t0.c, 0L, null, 0, 0, qmk.G, 16646109);
        }
        if (iOrdinal == 3) {
            return new y9q0(0L, qmk.t, null, j1t0.c, 0L, null, 0, 0, idm0.t(22), 16646109);
        }
        if (iOrdinal == 4) {
            return new y9q0(0L, qmk.u, null, j1t0.c, 0L, null, 0, 0, qmk.H, 16646109);
        }
        t9f.b();
        return null;
    }

    public static final void b(mm40 mm40Var, r1l0 r1l0Var, fet fetVar, int i) {
        int i2;
        byte b;
        shd shdVar;
        shd shdVar2;
        shd shdVar3;
        shd shdVar4;
        jm40 jm40Var;
        shd shdVar5;
        shd shdVar6;
        boolean z;
        fet fetVar2 = fetVar;
        fetVar2.g0(1945134110);
        if ((i & 6) == 0) {
            i2 = i | (fetVar2.g(mm40Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(r1l0Var) ? 32 : 16;
        }
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(o7k0.e(mm40Var, 64.0f), 8.0f, 0.0f, 0.0f, 0.0f, 14);
            zx7 zx7Var = gqw0.e;
            tj30 tj30VarC = zq8.c(zx7Var, false);
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
            shd shdVar7 = gqw0.x;
            jpm0.o(fetVar2, tj30VarC, shdVar7);
            shd shdVar8 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar8);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar9 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar9);
            jpm0.n(fetVar2);
            shd shdVar10 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar10);
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarJ = lgb.J(o7k0.n(jm40Var2, 40.0f), vgg0.f37379a);
            long j = r1l0Var.c;
            Integer num = r1l0Var.i;
            uf5 uf5Var = r1l0Var.g;
            p1l0 p1l0Var = r1l0Var.f29687a;
            mm40 mm40VarQ = i120.Q(mm40VarJ, j, jd8.n);
            tj30 tj30VarC2 = zq8.c(zx7Var, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarQ);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC2, shdVar7);
            jpm0.o(fetVar2, bh90VarM2, shdVar8);
            vqd.u(iHashCode2, fetVar2, shdVar9, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar10);
            String str = r1l0Var.d;
            if (str == null || str.length() == 0) {
                shdVar = shdVar8;
                shdVar2 = shdVar10;
                shdVar3 = shdVar9;
                shdVar4 = shdVar7;
                jm40Var = jm40Var2;
                fetVar2.e0(1534242664);
                Integer num2 = r1l0Var.e;
                y3d y3dVar = num2 != null ? r1l0Var.f : r1l0Var.b;
                dww.c(a8k0.F(num2 != null ? num2.intValue() : p1l0Var.f26208a, 0, fetVar2), null, o7k0.n(jm40Var, 24.0f), y3dVar != null ? y3dVar.f41946a : y3d.g, fetVar, 56, 0);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                fetVar2.e0(1534869887);
                shdVar3 = shdVar9;
                shdVar2 = shdVar10;
                shdVar4 = shdVar7;
                jm40Var = jm40Var2;
                f(o7k0.n(jm40Var2, 24.0f), r1l0Var.d, p1l0Var.f26208a, r1l0Var.f, r1l0Var.b, null, fetVar, 0, 32);
                fetVar2 = fetVar;
                fetVar2.r(false);
                shdVar = shdVar8;
            }
            fetVar2.r(true);
            jr8 jr8Var = jr8.f16991a;
            if (uf5Var != 0) {
                fetVar2.e0(-351132866);
                mm40 mm40VarQ2 = ffb0.Q(jr8Var.b(o7k0.n(jm40Var, 18.0f), gqw0.c), 4.0f, 6.0f);
                tj30 tj30VarC3 = zq8.c(zx7Var, false);
                int iHashCode3 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM3 = fetVar2.m();
                mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarQ2);
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, tj30VarC3, shdVar4);
                jpm0.o(fetVar2, bh90VarM3, shdVar);
                shdVar5 = shdVar3;
                vqd.u(iHashCode3, fetVar2, shdVar5, fetVar2);
                shdVar6 = shdVar2;
                jpm0.o(fetVar2, mm40VarC2, shdVar6);
                thb.f(null, uf5Var, fetVar2, 0, 1);
                fetVar2.r(true);
                fetVar2.r(false);
            } else {
                shdVar5 = shdVar3;
                shdVar6 = shdVar2;
                fetVar2.e0(-350783062);
                fetVar2.r(false);
            }
            if (r1l0Var.h == null || num == null) {
                z = true;
                b = 0;
                fetVar2.e0(-350150166);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-350668145);
                mm40 mm40VarQ3 = ffb0.Q(jr8Var.b(o7k0.r(jm40Var, 24.0f, 24.0f, 0.0f, 12), gqw0.i), 8.0f, -2.0f);
                tj30 tj30VarC4 = zq8.c(zx7Var, false);
                int iHashCode4 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM4 = fetVar2.m();
                mm40 mm40VarC3 = kbc.c0(fetVar2, mm40VarQ3);
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, tj30VarC4, shdVar4);
                jpm0.o(fetVar2, bh90VarM4, shdVar);
                vqd.u(iHashCode4, fetVar2, shdVar5, fetVar2);
                jpm0.o(fetVar2, mm40VarC3, shdVar6);
                tdc.e(new rpe(num.intValue()), r1l0Var.h, null, fetVar2, 0, 4);
                z = true;
                fetVar2.r(true);
                b = 0;
                fetVar2.r(false);
            }
            fetVar2.r(z);
        } else {
            b = 0;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o1l0(mm40Var, r1l0Var, i, b);
        }
    }

    public static final void c(s1l0 s1l0Var, mm40 mm40Var, fet fetVar, int i) {
        int i2;
        byte b;
        boolean z;
        fetVar.g0(1262706668);
        if ((i & 6) == 0) {
            i2 = i | (fetVar.g(s1l0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(mm40Var) ? 32 : 16;
        }
        int i3 = i2;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(o7k0.e(mm40Var, 66.0f), 8.0f, 0.0f, 2.0f, 0.0f, 10);
            zx7 zx7Var = gqw0.e;
            tj30 tj30VarC = zq8.c(zx7Var, false);
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
            jpm0.o(fetVar, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            String str = s1l0Var.d;
            uf5 uf5Var = s1l0Var.c;
            if (str == null) {
                str = "";
            }
            int i4 = s1l0Var.f31463a.f26208a;
            y3d y3dVar = s1l0Var.f;
            jm40 jm40Var = jm40.b;
            f(o2e.e0(lgb.J(o7k0.n(jm40Var, 32.0f), vgg0.f37379a), "IMAGE_LOADER"), str, i4, null, y3dVar, null, fetVar, 0, 32);
            zx7 zx7Var2 = gqw0.i;
            jr8 jr8Var = jr8.f16991a;
            q(s1l0Var, ffb0.Q(jr8Var.b(jm40Var, zx7Var2), 6.0f, -10.0f), fetVar, i3 & 14);
            if (uf5Var != null) {
                fetVar.e0(-1077952607);
                mm40 mm40VarQ = ffb0.Q(jr8Var.b(o7k0.n(jm40Var, 18.0f), gqw0.c), 6.0f, 10.0f);
                tj30 tj30VarC2 = zq8.c(zx7Var, false);
                int iHashCode2 = Long.hashCode(fetVar.T);
                bh90 bh90VarM2 = fetVar.m();
                mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarQ);
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
                z = true;
                b = 0;
                thb.f(null, uf5Var, fetVar, 0, 1);
                fetVar.r(true);
                fetVar.r(false);
            } else {
                z = true;
                b = 0;
                fetVar.e0(-1077496132);
                fetVar.r(false);
            }
            fetVar.r(z);
        } else {
            b = 0;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new n1l0(s1l0Var, mm40Var, i, b);
        }
    }

    public static final void d(fqj0 fqj0Var, fet fetVar, int i) {
        fqj0Var.getClass();
        fetVar.g0(480275140);
        int i2 = (fetVar.g(fqj0Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 52.0f);
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarQ = i120.Q(mm40VarE, s6t0.b().f33626a.getBackground(), jd8.n);
            yx7 yx7Var = gqw0.k;
            thg0 thg0VarA = shg0.a(uc9.f35418a, yx7Var, fetVar, 48);
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
            mm40 mm40VarE2 = o7k0.e(o7k0.s(s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), 70.0f), 16.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE2), fqj0Var));
            mm40 mm40VarE3 = o7k0.e(new x7z(1.0f, true), 52.0f);
            thg0 thg0VarA2 = shg0.a(uc9.b, yx7Var, fetVar, 54);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarE3);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA2, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, o7k0.n(s5x0.N(jm40Var, 0.0f, 0.0f, 18.0f, 0.0f, 11), 24.0f)), fqj0Var));
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, o7k0.n(s5x0.N(jm40Var, 0.0f, 0.0f, 18.0f, 0.0f, 11), 24.0f)), fqj0Var));
            dw9.x(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, o7k0.n(s5x0.N(jm40Var, 0.0f, 0.0f, 18.0f, 0.0f, 11), 24.0f)), fqj0Var, fetVar, 0, true);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new on7((byte) 13, i, fqj0Var);
        }
    }

    public static final void e(t1l0 t1l0Var, mm40 mm40Var, fet fetVar, int i) {
        int i2;
        t1l0 t1l0Var2;
        shd shdVar;
        shd shdVar2;
        Integer num;
        long secondary;
        shd shdVar3;
        shd shdVar4;
        boolean z;
        fet fetVar2 = fetVar;
        fetVar2.g0(1000638114);
        if ((i & 6) == 0) {
            i2 = i | (fetVar2.g(t1l0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(mm40Var) ? 32 : 16;
        }
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(o7k0.e(mm40Var, 40.0f), 8.0f, 0.0f, 2.0f, 0.0f, 10);
            zx7 zx7Var = gqw0.e;
            tj30 tj30VarC = zq8.c(zx7Var, false);
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
            shd shdVar5 = gqw0.x;
            jpm0.o(fetVar2, tj30VarC, shdVar5);
            shd shdVar6 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar6);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar7 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar7);
            jpm0.n(fetVar2);
            shd shdVar8 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar8);
            String str = t1l0Var.c;
            Integer num2 = t1l0Var.h;
            uf5 uf5Var = t1l0Var.f;
            p1l0 p1l0Var = t1l0Var.f33173a;
            jm40 jm40Var = jm40.b;
            if (str == null || str.length() == 0) {
                shdVar = shdVar8;
                shdVar2 = shdVar5;
                num = num2;
                fetVar2.e0(-750165282);
                Integer num3 = t1l0Var.d;
                pm80 pm80VarF = a8k0.F(num3 != null ? num3.intValue() : p1l0Var.f26208a, 0, fetVar2);
                y3d y3dVar = t1l0Var.e;
                if (y3dVar == null) {
                    fetVar2.e0(114356389);
                    secondary = ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary();
                    fetVar2.r(false);
                } else {
                    fetVar2.e0(114355118);
                    fetVar2.r(false);
                    secondary = y3dVar.f41946a;
                }
                shdVar3 = shdVar7;
                shdVar4 = shdVar6;
                dww.c(pm80VarF, null, o7k0.n(jm40Var, 24.0f), secondary, fetVar2, 56, 0);
                fetVar2 = fetVar2;
                fetVar2.r(false);
            } else {
                fetVar2.e0(-749778061);
                shdVar = shdVar8;
                num = num2;
                shdVar2 = shdVar5;
                f(o2e.e0(o7k0.n(jm40Var, 24.0f), "TOURNAMENT_ICON"), t1l0Var.c, p1l0Var.f26208a, t1l0Var.e, t1l0Var.b, null, fetVar, 0, 32);
                fetVar2 = fetVar;
                fetVar2.r(false);
                shdVar3 = shdVar7;
                shdVar4 = shdVar6;
            }
            jr8 jr8Var = jr8.f16991a;
            if (uf5Var != 0) {
                fetVar2.e0(-749356120);
                mm40 mm40VarE0 = o2e.e0(ffb0.R(jr8Var.b(o7k0.n(jm40Var, 18.0f), gqw0.c), 6.0f, 0.0f, 2), "BADGE_ICON");
                tj30 tj30VarC2 = zq8.c(zx7Var, false);
                int iHashCode2 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM2 = fetVar2.m();
                mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarE0);
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, tj30VarC2, shdVar2);
                jpm0.o(fetVar2, bh90VarM2, shdVar4);
                vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
                jpm0.o(fetVar2, mm40VarC1, shdVar);
                thb.f(null, uf5Var, fetVar2, 0, 1);
                fetVar2.r(true);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-748958266);
                fetVar2.r(false);
            }
            t1l0Var2 = t1l0Var;
            if (t1l0Var2.g == null || num == null) {
                z = true;
                fetVar2.e0(-748365050);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-748863809);
                mm40 mm40VarQ = ffb0.Q(jr8Var.b(o7k0.r(jm40Var, 24.0f, 24.0f, 0.0f, 12), gqw0.i), 10.0f, 2.0f);
                tj30 tj30VarC3 = zq8.c(zx7Var, false);
                int iHashCode3 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM3 = fetVar2.m();
                mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarQ);
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, tj30VarC3, shdVar2);
                jpm0.o(fetVar2, bh90VarM3, shdVar4);
                vqd.u(iHashCode3, fetVar2, shdVar3, fetVar2);
                jpm0.o(fetVar2, mm40VarC2, shdVar);
                tdc.e(new rpe(num.intValue()), t1l0Var2.g, null, fetVar2, 0, 4);
                z = true;
                fetVar2.r(true);
                fetVar2.r(false);
            }
            fetVar2.r(z);
        } else {
            t1l0Var2 = t1l0Var;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o680((byte) 29, i, mm40Var, (Object) t1l0Var2);
        }
    }

    public static final void f(mm40 mm40Var, String str, int i, y3d y3dVar, y3d y3dVar2, qge qgeVar, fet fetVar, int i2, int i3) {
        y3d y3dVar3;
        int i4;
        qge qgeVar2;
        y3d y3dVar4;
        pm80 pm80VarF;
        str.getClass();
        fetVar.g0(1575956048);
        int i5 = i2 | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(str) ? 32 : 16) | (fetVar.e(i) ? 256 : 128) | (fetVar.g(y3dVar) ? 2048 : 1024);
        int i6 = i3 & 16;
        if (i6 != 0) {
            i4 = i5 | 24576;
            y3dVar3 = y3dVar2;
        } else {
            y3dVar3 = y3dVar2;
            i4 = i5 | (fetVar.g(y3dVar3) ? 16384 : 8192);
        }
        int i7 = i4 | 196608;
        if (fetVar.U(i7 & 1, (74899 & i7) != 74898)) {
            y3d y3dVar5 = i6 != 0 ? null : y3dVar3;
            pge pgeVar = gqw0.B;
            if (y3dVar5 != null) {
                fetVar.e0(1019405166);
                pm80VarF = ju70.T(a8k0.F(i, (i7 >> 6) & 14, fetVar), new m78(y3dVar5.f41946a, 5), null, 10);
                fetVar.r(false);
            } else {
                fetVar.e0(1019570086);
                pm80VarF = a8k0.F(i, (i7 >> 6) & 14, fetVar);
                fetVar.r(false);
            }
            int i8 = i7 & 7168;
            boolean z = ((i7 & 112) == 32) | (i8 == 2048);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (z || objP == obj) {
                objP = androidx.compose.runtime.e.e(null);
                fetVar.o0(objP);
            }
            pz40 pz40Var = (pz40) objP;
            a4d a4dVar = (a4d) pz40Var.getValue();
            boolean zG = fetVar.g(pz40Var) | (i8 == 2048);
            Object objP2 = fetVar.P();
            if (zG || objP2 == obj) {
                objP2 = new huh0(y3dVar, pz40Var, (byte) 26);
                fetVar.o0(objP2);
            }
            k7x.b(str, null, mm40Var, pm80VarF, pm80VarF, pm80VarF, null, (Function1) objP2, null, null, pgeVar, a4dVar, fetVar, ((i7 << 6) & 896) | ((i7 >> 3) & 14) | 48 | 299008, 6, 27456);
            y3dVar4 = y3dVar5;
            qgeVar2 = pgeVar;
        } else {
            fetVar.X();
            qgeVar2 = qgeVar;
            y3dVar4 = y3dVar3;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new a33(mm40Var, str, i, y3dVar, y3dVar4, qgeVar2, i2, i3);
        }
    }

    public static final void g(mm40 mm40Var, String str, Function0 function0, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        mm40Var.getClass();
        str.getClass();
        function0.getClass();
        fetVar2.g0(704402375);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(str) ? 32 : 16) | (fetVar2.i(function0) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(q8a.k0(o7k0.d(o7k0.u(mm40Var, 0.0f, 448.0f, 1), 1.0f), enx.f8115a), 12.0f, 0.0f, 2);
            thg0 thg0VarA = shg0.a(new qw3(12.0f, true, new jf4((byte) 14)), gqw0.k, fetVar2, 48);
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
            jpm0.o(fetVar2, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            mm40 mm40VarN = s5x0.N(new x7z(1.0f, true), 0.0f, 2.0f, 0.0f, 4.0f, 5);
            long jM131getWhite800d7_KjU = ((StaticColors) fetVar2.k(m8m0.f21378a)).m131getWhite800d7_KjU();
            pz40 pz40Var = s6t0.f31722a;
            v8q0.a(str, mm40VarN, jM131getWhite800d7_KjU, null, 0L, null, null, null, 0L, new f2q0(5), 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109), fetVar, (i2 >> 3) & 14, 0, 130040);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarW = y860.W(o7k0.c(o7k0.g(o7k0.s(jm40Var, 48.0f), 48.0f, 0.0f, 2), 1.0f), null, null, false, null, function0, 28);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarW);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            mm40 mm40VarJ = lgb.J(o7k0.n(jm40Var, 24.0f), vgg0.f37379a);
            StaticColors staticColors = StaticColors.INSTANCE;
            fetVar2 = fetVar;
            dww.c(iom0.r(jpm0.t(R.drawable.ic_glyph_cancel, 6, fetVar), fetVar), null, s5x0.J(i120.Q(mm40VarJ, staticColors.m126getWhite200d7_KjU(), jd8.n), 6.0f), staticColors.m123getWhite0d7_KjU(), fetVar2, 56, 0);
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new f49(mm40Var, str, function0, i, (byte) 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0118  */
    /* JADX WARN: Code duplicated, block: B:102:0x011b  */
    /* JADX WARN: Code duplicated, block: B:104:0x0120  */
    /* JADX WARN: Code duplicated, block: B:111:0x0136  */
    /* JADX WARN: Code duplicated, block: B:114:0x0140  */
    /* JADX WARN: Code duplicated, block: B:128:0x016b A[PHI: r3 r8 r9 r11 r12
  0x016b: PHI (r3v25 int) = (r3v19 int), (r3v28 int), (r3v29 int) binds: [B:144:0x01ad, B:126:0x0167, B:127:0x0169] A[DONT_GENERATE, DONT_INLINE]
  0x016b: PHI (r8v6 boolean) = (r8v3 boolean), (r8v1 boolean), (r8v1 boolean) binds: [B:144:0x01ad, B:126:0x0167, B:127:0x0169] A[DONT_GENERATE, DONT_INLINE]
  0x016b: PHI (r9v9 a.d9z) = (r9v5 a.d9z), (r9v2 a.d9z), (r9v2 a.d9z) binds: [B:144:0x01ad, B:126:0x0167, B:127:0x0169] A[DONT_GENERATE, DONT_INLINE]
  0x016b: PHI (r11v8 a.hh80) = (r11v4 a.hh80), (r11v2 a.hh80), (r11v2 a.hh80) binds: [B:144:0x01ad, B:126:0x0167, B:127:0x0169] A[DONT_GENERATE, DONT_INLINE]
  0x016b: PHI (r12v37 a.qkq) = (r12v14 a.qkq), (r12v12 a.qkq), (r12v12 a.qkq) binds: [B:144:0x01ad, B:126:0x0167, B:127:0x0169] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:129:0x0171  */
    /* JADX WARN: Code duplicated, block: B:131:0x0175  */
    /* JADX WARN: Code duplicated, block: B:133:0x017e  */
    /* JADX WARN: Code duplicated, block: B:136:0x0189  */
    /* JADX WARN: Code duplicated, block: B:138:0x0197 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:139:0x0199  */
    /* JADX WARN: Code duplicated, block: B:142:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:145:0x01af  */
    /* JADX WARN: Code duplicated, block: B:148:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:150:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:156:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:158:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:164:0x01f8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:165:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:167:0x0245  */
    /* JADX WARN: Code duplicated, block: B:170:0x0252  */
    /* JADX WARN: Code duplicated, block: B:172:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x0070  */
    /* JADX WARN: Code duplicated, block: B:43:0x0073  */
    /* JADX WARN: Code duplicated, block: B:45:0x0077  */
    /* JADX WARN: Code duplicated, block: B:47:0x007d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0080  */
    /* JADX WARN: Code duplicated, block: B:52:0x0089  */
    /* JADX WARN: Code duplicated, block: B:54:0x0091  */
    /* JADX WARN: Code duplicated, block: B:55:0x0094  */
    /* JADX WARN: Code duplicated, block: B:57:0x0099  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:79:0x00db  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:92:0x0100  */
    /* JADX WARN: Code duplicated, block: B:93:0x0103  */
    /* JADX WARN: Code duplicated, block: B:96:0x010a  */
    /* JADX WARN: Code duplicated, block: B:99:0x0112  */
    public static final void h(final ngv ngvVar, final mm40 mm40Var, d9z d9zVar, hh80 hh80Var, final ow3 ow3Var, final sw3 sw3Var, qkq qkqVar, boolean z, vf80 vf80Var, final Function1 function1, fet fetVar, final int i, final int i2, final int i3) {
        int i4;
        d9z d9zVarA;
        hh80 lh80Var;
        int i5;
        ow3 ow3Var2;
        qkq qkqVar2;
        int i6;
        final boolean z2;
        int i7;
        vf80 vf80Var2;
        int i8;
        boolean z3;
        final d9z d9zVar2;
        final hh80 hh80Var2;
        final qkq qkqVar3;
        final vf80 vf80VarB;
        yfe0 yfe0VarU;
        int i9;
        int i10;
        hh80 hh80Var3;
        sjj sjjVarA;
        boolean zG;
        Object objP;
        boolean z4;
        Object objP2;
        int i11;
        int i12;
        int i13;
        fetVar.g0(635941664);
        if ((i & 6) == 0) {
            i4 = (fetVar.g(ngvVar) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= fetVar.g(mm40Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i3 & 4) == 0) {
                d9zVarA = d9zVar;
                int i14 = fetVar.g(d9zVarA) ? 256 : 128;
                i4 |= i14;
            } else {
                d9zVarA = d9zVar;
            }
            i4 |= i14;
        } else {
            d9zVarA = d9zVar;
        }
        int i15 = i3 & 8;
        if (i15 == 0) {
            if ((i & 3072) == 0) {
                lh80Var = hh80Var;
                i4 |= fetVar.g(lh80Var) ? 2048 : 1024;
            }
            if ((i3 & 16) != 0) {
                i4 |= 24576;
            } else if ((i & 24576) == 0) {
                if (fetVar.h(false)) {
                    i5 = 16384;
                } else {
                    i5 = 8192;
                }
                i4 |= i5;
            }
            if ((i & 196608) == 0) {
                ow3Var2 = ow3Var;
                if (fetVar.g(ow3Var2)) {
                    i13 = 131072;
                } else {
                    i13 = 65536;
                }
                i4 |= i13;
            } else {
                ow3Var2 = ow3Var;
            }
            if ((i & 1572864) == 0) {
                if (fetVar.g(sw3Var)) {
                    i12 = 1048576;
                } else {
                    i12 = 524288;
                }
                i4 |= i12;
            }
            if ((i & 12582912) == 0) {
                if ((i3 & 128) == 0) {
                    qkqVar2 = qkqVar;
                    int i16 = fetVar.g(qkqVar2) ? 8388608 : 4194304;
                    i4 |= i16;
                } else {
                    qkqVar2 = qkqVar;
                }
                i4 |= i16;
            } else {
                qkqVar2 = qkqVar;
            }
            i6 = i3 & 256;
            if (i6 != 0) {
                i4 |= 100663296;
                z2 = z;
            } else {
                z2 = z;
                if ((i & 100663296) == 0) {
                    if (fetVar.h(z2)) {
                        i7 = 67108864;
                    } else {
                        i7 = 33554432;
                    }
                    i4 |= i7;
                }
            }
            if ((i & 805306368) == 0) {
                if ((i3 & 512) == 0) {
                    vf80Var2 = vf80Var;
                    int i17 = fetVar.g(vf80Var2) ? 536870912 : 268435456;
                    i4 |= i17;
                } else {
                    vf80Var2 = vf80Var;
                }
                i4 |= i17;
            } else {
                vf80Var2 = vf80Var;
            }
            if ((i2 & 6) == 0) {
                if (fetVar.i(function1)) {
                    i11 = 4;
                } else {
                    i11 = 2;
                }
                i8 = i2 | i11;
            } else {
                i8 = i2;
            }
            if ((i4 & 306783379) == 306783378 || (i8 & 3) != 2) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (fetVar.U(i4 & 1, z3)) {
                fetVar.Z();
                i9 = i & 1;
                Object obj = ukd.f35823a;
                if (i9 != 0 || fetVar.B()) {
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                        d9zVarA = f9z.a(fetVar);
                    }
                    if (i15 != 0) {
                        lh80Var = new lh80(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if ((i3 & 128) != 0) {
                        sjjVarA = wzk0.a(fetVar);
                        zG = fetVar.g(sjjVarA);
                        objP = fetVar.P();
                        if (zG || objP == obj) {
                            objP = new iuj(sjjVarA);
                            fetVar.o0(objP);
                        }
                        i4 &= -29360129;
                        qkqVar2 = (iuj) objP;
                    }
                    if (i6 != 0) {
                        z2 = true;
                    }
                    if ((i3 & 512) != 0) {
                        d9z d9zVar3 = d9zVarA;
                        vf80VarB = xf80.b(fetVar);
                        i10 = i4 & (-1879048193);
                        d9zVar2 = d9zVar3;
                        hh80Var3 = lh80Var;
                        qkqVar3 = qkqVar2;
                    }
                    fetVar.s();
                    int i18 = i10 >> 15;
                    int i19 = (i10 & 14) | (i18 & 112);
                    z4 = ((((i19 & 14) ^ 6) <= 4 && fetVar.g(ngvVar)) || (i19 & 6) == 4) | ((((i19 & 112) ^ 48) <= 32 && fetVar.g(sw3Var)) || (i19 & 48) == 32);
                    objP2 = fetVar.P();
                    if (z4 || objP2 == obj) {
                        objP2 = new tgv(new r7y(ngvVar, sw3Var, (byte) 8));
                        fetVar.o0(objP2);
                    }
                    int i20 = i10 >> 3;
                    h8x.h(mm40Var, d9zVar2, (tgv) objP2, hh80Var3, false, qkqVar3, z2, vf80VarB, sw3Var, ow3Var2, function1, fetVar, (i20 & 234881024) | (i20 & 14) | 196608 | (i20 & 112) | (i10 & 7168) | (57344 & i10) | (3670016 & i20) | (29360128 & i20) | ((i10 << 9) & 1879048192), (i18 & 14) | ((i8 << 3) & 112));
                    hh80Var2 = hh80Var3;
                } else {
                    fetVar.X();
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                    }
                    if ((i3 & 128) != 0) {
                        i4 &= -29360129;
                    }
                    if ((i3 & 512) != 0) {
                        i4 &= -1879048193;
                    }
                }
                i10 = i4;
                d9zVar2 = d9zVarA;
                qkqVar3 = qkqVar2;
                vf80VarB = vf80Var2;
                hh80Var3 = lh80Var;
                fetVar.s();
                int i110 = i10 >> 15;
                int i111 = (i10 & 14) | (i110 & 112);
                z4 = ((((i111 & 14) ^ 6) <= 4 && fetVar.g(ngvVar)) || (i111 & 6) == 4) | ((((i111 & 112) ^ 48) <= 32 && fetVar.g(sw3Var)) || (i111 & 48) == 32);
                objP2 = fetVar.P();
                if (z4) {
                    objP2 = new tgv(new r7y(ngvVar, sw3Var, (byte) 8));
                    fetVar.o0(objP2);
                } else {
                    objP2 = new tgv(new r7y(ngvVar, sw3Var, (byte) 8));
                    fetVar.o0(objP2);
                }
                int i21 = i10 >> 3;
                h8x.h(mm40Var, d9zVar2, (tgv) objP2, hh80Var3, false, qkqVar3, z2, vf80VarB, sw3Var, ow3Var2, function1, fetVar, (i21 & 234881024) | (i21 & 14) | 196608 | (i21 & 112) | (i10 & 7168) | (57344 & i10) | (3670016 & i21) | (29360128 & i21) | ((i10 << 9) & 1879048192), (i110 & 14) | ((i8 << 3) & 112));
                hh80Var2 = hh80Var3;
            } else {
                fetVar.X();
                d9zVar2 = d9zVarA;
                hh80Var2 = lh80Var;
                qkqVar3 = qkqVar2;
                vf80VarB = vf80Var2;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new Function2() { // from class: a.g8z
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        int iL = x8x.L(i | 1);
                        int iL2 = x8x.L(i2);
                        g8x.h(ngvVar, mm40Var, d9zVar2, hh80Var2, ow3Var, sw3Var, qkqVar3, z2, vf80VarB, function1, (fet) obj2, iL, iL2, i3);
                        return Unit.f46060a;
                    }
                };
            }
        }
        i4 |= 3072;
        lh80Var = hh80Var;
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((i & 24576) == 0) {
            if (fetVar.h(false)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i4 |= i5;
        }
        if ((i & 196608) == 0) {
            ow3Var2 = ow3Var;
            if (fetVar.g(ow3Var2)) {
                i13 = 131072;
            } else {
                i13 = 65536;
            }
            i4 |= i13;
        } else {
            ow3Var2 = ow3Var;
        }
        if ((i & 1572864) == 0) {
            if (fetVar.g(sw3Var)) {
                i12 = 1048576;
            } else {
                i12 = 524288;
            }
            i4 |= i12;
        }
        if ((i & 12582912) == 0) {
            if ((i3 & 128) == 0) {
                qkqVar2 = qkqVar;
                if (fetVar.g(qkqVar2)) {
                }
                i4 |= i16;
            } else {
                qkqVar2 = qkqVar;
            }
            i4 |= i16;
        } else {
            qkqVar2 = qkqVar;
        }
        i6 = i3 & 256;
        if (i6 != 0) {
            i4 |= 100663296;
            z2 = z;
        } else {
            z2 = z;
            if ((i & 100663296) == 0) {
                if (fetVar.h(z2)) {
                    i7 = 67108864;
                } else {
                    i7 = 33554432;
                }
                i4 |= i7;
            }
        }
        if ((i & 805306368) == 0) {
            if ((i3 & 512) == 0) {
                vf80Var2 = vf80Var;
                if (fetVar.g(vf80Var2)) {
                }
                i4 |= i17;
            } else {
                vf80Var2 = vf80Var;
            }
            i4 |= i17;
        } else {
            vf80Var2 = vf80Var;
        }
        if ((i2 & 6) == 0) {
            if (fetVar.i(function1)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i8 = i2 | i11;
        } else {
            i8 = i2;
        }
        if ((i4 & 306783379) == 306783378) {
            z3 = true;
        } else {
            z3 = true;
        }
        if (fetVar.U(i4 & 1, z3)) {
            fetVar.Z();
            i9 = i & 1;
            Object obj2 = ukd.f35823a;
            if (i9 != 0) {
                if ((i3 & 4) != 0) {
                    i4 &= -897;
                    d9zVarA = f9z.a(fetVar);
                }
                if (i15 != 0) {
                    lh80Var = new lh80(0.0f, 0.0f, 0.0f, 0.0f);
                }
                if ((i3 & 128) != 0) {
                    sjjVarA = wzk0.a(fetVar);
                    zG = fetVar.g(sjjVarA);
                    objP = fetVar.P();
                    if (zG) {
                        objP = new iuj(sjjVarA);
                        fetVar.o0(objP);
                    } else {
                        objP = new iuj(sjjVarA);
                        fetVar.o0(objP);
                    }
                    i4 &= -29360129;
                    qkqVar2 = (iuj) objP;
                }
                if (i6 != 0) {
                    z2 = true;
                }
                if ((i3 & 512) != 0) {
                    d9z d9zVar4 = d9zVarA;
                    vf80VarB = xf80.b(fetVar);
                    i10 = i4 & (-1879048193);
                    d9zVar2 = d9zVar4;
                    hh80Var3 = lh80Var;
                    qkqVar3 = qkqVar2;
                } else {
                    i10 = i4;
                    d9zVar2 = d9zVarA;
                    qkqVar3 = qkqVar2;
                    vf80VarB = vf80Var2;
                    hh80Var3 = lh80Var;
                }
            } else {
                if ((i3 & 4) != 0) {
                    i4 &= -897;
                    d9zVarA = f9z.a(fetVar);
                }
                if (i15 != 0) {
                    lh80Var = new lh80(0.0f, 0.0f, 0.0f, 0.0f);
                }
                if ((i3 & 128) != 0) {
                    sjjVarA = wzk0.a(fetVar);
                    zG = fetVar.g(sjjVarA);
                    objP = fetVar.P();
                    if (zG) {
                        objP = new iuj(sjjVarA);
                        fetVar.o0(objP);
                    } else {
                        objP = new iuj(sjjVarA);
                        fetVar.o0(objP);
                    }
                    i4 &= -29360129;
                    qkqVar2 = (iuj) objP;
                }
                if (i6 != 0) {
                    z2 = true;
                }
                if ((i3 & 512) != 0) {
                    d9z d9zVar5 = d9zVarA;
                    vf80VarB = xf80.b(fetVar);
                    i10 = i4 & (-1879048193);
                    d9zVar2 = d9zVar5;
                    hh80Var3 = lh80Var;
                    qkqVar3 = qkqVar2;
                } else {
                    i10 = i4;
                    d9zVar2 = d9zVarA;
                    qkqVar3 = qkqVar2;
                    vf80VarB = vf80Var2;
                    hh80Var3 = lh80Var;
                }
            }
            fetVar.s();
            int i112 = i10 >> 15;
            int i113 = (i10 & 14) | (i112 & 112);
            z4 = ((((i113 & 14) ^ 6) <= 4 && fetVar.g(ngvVar)) || (i113 & 6) == 4) | ((((i113 & 112) ^ 48) <= 32 && fetVar.g(sw3Var)) || (i113 & 48) == 32);
            objP2 = fetVar.P();
            if (z4) {
                objP2 = new tgv(new r7y(ngvVar, sw3Var, (byte) 8));
                fetVar.o0(objP2);
            } else {
                objP2 = new tgv(new r7y(ngvVar, sw3Var, (byte) 8));
                fetVar.o0(objP2);
            }
            int i22 = i10 >> 3;
            h8x.h(mm40Var, d9zVar2, (tgv) objP2, hh80Var3, false, qkqVar3, z2, vf80VarB, sw3Var, ow3Var2, function1, fetVar, (i22 & 234881024) | (i22 & 14) | 196608 | (i22 & 112) | (i10 & 7168) | (57344 & i10) | (3670016 & i22) | (29360128 & i22) | ((i10 << 9) & 1879048192), (i112 & 14) | ((i8 << 3) & 112));
            hh80Var2 = hh80Var3;
        } else {
            fetVar.X();
            d9zVar2 = d9zVarA;
            hh80Var2 = lh80Var;
            qkqVar3 = qkqVar2;
            vf80VarB = vf80Var2;
        }
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.g8z
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int iL = x8x.L(i | 1);
                    int iL2 = x8x.L(i2);
                    g8x.h(ngvVar, mm40Var, d9zVar2, hh80Var2, ow3Var, sw3Var, qkqVar3, z2, vf80VarB, function1, (fet) obj3, iL, iL2, i3);
                    return Unit.f46060a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x013a  */
    /* JADX WARN: Code duplicated, block: B:105:0x013e  */
    /* JADX WARN: Code duplicated, block: B:106:0x0145  */
    /* JADX WARN: Code duplicated, block: B:108:0x0148  */
    /* JADX WARN: Code duplicated, block: B:109:0x014f  */
    /* JADX WARN: Code duplicated, block: B:112:0x0154  */
    /* JADX WARN: Code duplicated, block: B:113:0x0159  */
    /* JADX WARN: Code duplicated, block: B:115:0x015d  */
    /* JADX WARN: Code duplicated, block: B:116:0x0160  */
    /* JADX WARN: Code duplicated, block: B:119:0x016f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:120:0x0171  */
    /* JADX WARN: Code duplicated, block: B:123:0x017d  */
    /* JADX WARN: Code duplicated, block: B:127:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:129:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:135:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:137:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:143:0x01d6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:144:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:146:0x021d  */
    /* JADX WARN: Code duplicated, block: B:149:0x0230  */
    /* JADX WARN: Code duplicated, block: B:151:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x0071  */
    /* JADX WARN: Code duplicated, block: B:50:0x0086  */
    /* JADX WARN: Code duplicated, block: B:53:0x008e  */
    /* JADX WARN: Code duplicated, block: B:55:0x0092  */
    /* JADX WARN: Code duplicated, block: B:57:0x0095  */
    /* JADX WARN: Code duplicated, block: B:59:0x009d  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:91:0x0106  */
    /* JADX WARN: Code duplicated, block: B:93:0x0115  */
    public static final void i(ngv ngvVar, mm40 mm40Var, d9z d9zVar, hh80 hh80Var, sw3 sw3Var, ow3 ow3Var, qkq qkqVar, boolean z, vf80 vf80Var, Function1 function1, fet fetVar, int i, int i2) {
        int i3;
        d9z d9zVar2;
        hh80 hh80Var2;
        int i4;
        int i5;
        ow3 ow3Var2;
        int i6;
        int i7;
        boolean z2;
        int i8;
        int i9;
        boolean z3;
        boolean z4;
        sw3 sw3Var2;
        vf80 vf80VarB;
        d9z d9zVar3;
        hh80 hh80Var3;
        ow3 ow3Var3;
        boolean z5;
        qkq qkqVar2;
        yfe0 yfe0VarU;
        int i10;
        d9z d9zVarA;
        hh80 lh80Var;
        sw3 sw3Var3;
        ow3 ow3Var4;
        sjj sjjVarA;
        boolean zG;
        Object objP;
        boolean z6;
        int i11;
        sw3 sw3Var4;
        ow3 ow3Var5;
        int i12;
        boolean z7;
        Object objP2;
        fetVar.g0(-2072102870);
        if ((i & 6) == 0) {
            i3 = (fetVar.g(ngvVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= fetVar.g(mm40Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                d9zVar2 = d9zVar;
                int i13 = fetVar.g(d9zVar2) ? 256 : 128;
                i3 |= i13;
            } else {
                d9zVar2 = d9zVar;
            }
            i3 |= i13;
        } else {
            d9zVar2 = d9zVar;
        }
        int i14 = i2 & 8;
        if (i14 == 0) {
            if ((i & 3072) == 0) {
                hh80Var2 = hh80Var;
                i3 |= fetVar.g(hh80Var2) ? 2048 : 1024;
            }
            i4 = i3 | 24576;
            if ((i & 196608) != 0) {
                i4 |= ((i2 & 32) == 0 || !fetVar.g(sw3Var)) ? 65536 : 131072;
            }
            i5 = i2 & 64;
            if (i5 != 0) {
                if ((1572864 & i) == 0) {
                    ow3Var2 = ow3Var;
                    if (fetVar.g(ow3Var2)) {
                        i6 = 1048576;
                    } else {
                        i6 = 524288;
                    }
                    i4 |= i6;
                }
                if ((i & 12582912) == 0) {
                    i4 |= 4194304;
                }
                i7 = i2 & 256;
                if (i7 != 0) {
                    i4 |= 100663296;
                    z2 = z;
                } else {
                    z2 = z;
                    if ((i & 100663296) == 0) {
                        if (fetVar.h(z2)) {
                            i8 = 67108864;
                        } else {
                            i8 = 33554432;
                        }
                        i4 |= i8;
                    }
                }
                if ((i & 805306368) == 0) {
                    i4 |= 268435456;
                }
                if (fetVar.i(function1)) {
                    i9 = 4;
                } else {
                    i9 = 2;
                }
                z3 = true;
                if ((i4 & 306783379) == 306783378 || (i9 & 3) != 2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (fetVar.U(i4 & 1, z4)) {
                    fetVar.Z();
                    i10 = i & 1;
                    Object obj = ukd.f35823a;
                    if (i10 != 0 || fetVar.B()) {
                        if ((i2 & 4) != 0) {
                            d9zVarA = f9z.a(fetVar);
                            i4 &= -897;
                        } else {
                            d9zVarA = d9zVar2;
                        }
                        if (i14 != 0) {
                            lh80Var = new lh80(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            lh80Var = hh80Var2;
                        }
                        if ((i2 & 32) != 0) {
                            sw3Var3 = uc9.c;
                            i4 &= -458753;
                        } else {
                            sw3Var3 = sw3Var;
                        }
                        if (i5 != 0) {
                            ow3Var4 = uc9.f35418a;
                        } else {
                            ow3Var4 = ow3Var2;
                        }
                        sjjVarA = wzk0.a(fetVar);
                        zG = fetVar.g(sjjVarA);
                        objP = fetVar.P();
                        if (zG || objP == obj) {
                            objP = new iuj(sjjVarA);
                            fetVar.o0(objP);
                        }
                        iuj iujVar = (iuj) objP;
                        if (i7 != 0) {
                            z2 = true;
                        }
                        boolean z8 = z2;
                        qkqVar2 = iujVar;
                        z6 = z8;
                        d9z d9zVar4 = d9zVarA;
                        i11 = i4 & (-1908408321);
                        d9zVar3 = d9zVar4;
                        ow3 ow3Var6 = ow3Var4;
                        sw3Var4 = sw3Var3;
                        vf80VarB = xf80.b(fetVar);
                        ow3Var5 = ow3Var6;
                    } else {
                        fetVar.X();
                        if ((i2 & 4) != 0) {
                            i4 &= -897;
                        }
                        if ((i2 & 32) != 0) {
                            i4 &= -458753;
                        }
                        vf80VarB = vf80Var;
                        i11 = i4 & (-1908408321);
                        z6 = z2;
                        d9zVar3 = d9zVar2;
                        lh80Var = hh80Var2;
                        ow3Var5 = ow3Var2;
                        sw3Var4 = sw3Var;
                        qkqVar2 = qkqVar;
                    }
                    fetVar.s();
                    i12 = (i11 & 14) | ((i11 >> 15) & 112);
                    boolean z9 = z6;
                    boolean z10 = (((i12 & 14) ^ 6) <= 4 && fetVar.g(ngvVar)) || (i12 & 6) == 4;
                    if ((((i12 & 112) ^ 48) > 32 || !fetVar.g(ow3Var5)) && (i12 & 48) != 32) {
                    }
                    z7 = z10 | z3;
                    objP2 = fetVar.P();
                    if (z7 || objP2 == obj) {
                        objP2 = new tgv(new r7y(ngvVar, ow3Var5, (byte) 9));
                        fetVar.o0(objP2);
                    }
                    int i15 = i11 >> 3;
                    hh80 hh80Var4 = lh80Var;
                    z5 = z9;
                    h8x.h(mm40Var, d9zVar3, (tgv) objP2, hh80Var4, true, qkqVar2, z5, vf80VarB, sw3Var4, ow3Var5, function1, fetVar, (i15 & 29360128) | (i15 & 14) | 196608 | (i15 & 112) | (i11 & 7168) | (57344 & i11) | ((i11 << 12) & 1879048192), ((i11 >> 18) & 14) | ((i9 << 3) & 112));
                    hh80Var3 = hh80Var4;
                    sw3Var2 = sw3Var4;
                    ow3Var3 = ow3Var5;
                } else {
                    fetVar.X();
                    sw3Var2 = sw3Var;
                    vf80VarB = vf80Var;
                    d9zVar3 = d9zVar2;
                    hh80Var3 = hh80Var2;
                    ow3Var3 = ow3Var2;
                    z5 = z2;
                    qkqVar2 = qkqVar;
                }
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new zbc(ngvVar, mm40Var, d9zVar3, hh80Var3, sw3Var2, ow3Var3, qkqVar2, z5, vf80VarB, function1, i, i2);
                }
            }
            i4 |= 1572864;
            ow3Var2 = ow3Var;
            if ((i & 12582912) == 0) {
                i4 |= 4194304;
            }
            i7 = i2 & 256;
            if (i7 != 0) {
                i4 |= 100663296;
                z2 = z;
            } else {
                z2 = z;
                if ((i & 100663296) == 0) {
                    if (fetVar.h(z2)) {
                        i8 = 67108864;
                    } else {
                        i8 = 33554432;
                    }
                    i4 |= i8;
                }
            }
            if ((i & 805306368) == 0) {
                i4 |= 268435456;
            }
            if (fetVar.i(function1)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            z3 = true;
            if ((i4 & 306783379) == 306783378) {
                z4 = true;
            } else {
                z4 = true;
            }
            if (fetVar.U(i4 & 1, z4)) {
                fetVar.Z();
                i10 = i & 1;
                Object obj2 = ukd.f35823a;
                if (i10 != 0) {
                    if ((i2 & 4) != 0) {
                        d9zVarA = f9z.a(fetVar);
                        i4 &= -897;
                    } else {
                        d9zVarA = d9zVar2;
                    }
                    if (i14 != 0) {
                        lh80Var = new lh80(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        lh80Var = hh80Var2;
                    }
                    if ((i2 & 32) != 0) {
                        sw3Var3 = uc9.c;
                        i4 &= -458753;
                    } else {
                        sw3Var3 = sw3Var;
                    }
                    if (i5 != 0) {
                        ow3Var4 = uc9.f35418a;
                    } else {
                        ow3Var4 = ow3Var2;
                    }
                    sjjVarA = wzk0.a(fetVar);
                    zG = fetVar.g(sjjVarA);
                    objP = fetVar.P();
                    if (zG) {
                        objP = new iuj(sjjVarA);
                        fetVar.o0(objP);
                    } else {
                        objP = new iuj(sjjVarA);
                        fetVar.o0(objP);
                    }
                    iuj iujVar2 = (iuj) objP;
                    if (i7 != 0) {
                        z2 = true;
                    }
                    boolean z11 = z2;
                    qkqVar2 = iujVar2;
                    z6 = z11;
                    d9z d9zVar5 = d9zVarA;
                    i11 = i4 & (-1908408321);
                    d9zVar3 = d9zVar5;
                    ow3 ow3Var7 = ow3Var4;
                    sw3Var4 = sw3Var3;
                    vf80VarB = xf80.b(fetVar);
                    ow3Var5 = ow3Var7;
                } else {
                    if ((i2 & 4) != 0) {
                        d9zVarA = f9z.a(fetVar);
                        i4 &= -897;
                    } else {
                        d9zVarA = d9zVar2;
                    }
                    if (i14 != 0) {
                        lh80Var = new lh80(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        lh80Var = hh80Var2;
                    }
                    if ((i2 & 32) != 0) {
                        sw3Var3 = uc9.c;
                        i4 &= -458753;
                    } else {
                        sw3Var3 = sw3Var;
                    }
                    if (i5 != 0) {
                        ow3Var4 = uc9.f35418a;
                    } else {
                        ow3Var4 = ow3Var2;
                    }
                    sjjVarA = wzk0.a(fetVar);
                    zG = fetVar.g(sjjVarA);
                    objP = fetVar.P();
                    if (zG) {
                        objP = new iuj(sjjVarA);
                        fetVar.o0(objP);
                    } else {
                        objP = new iuj(sjjVarA);
                        fetVar.o0(objP);
                    }
                    iuj iujVar3 = (iuj) objP;
                    if (i7 != 0) {
                        z2 = true;
                    }
                    boolean z12 = z2;
                    qkqVar2 = iujVar3;
                    z6 = z12;
                    d9z d9zVar6 = d9zVarA;
                    i11 = i4 & (-1908408321);
                    d9zVar3 = d9zVar6;
                    ow3 ow3Var8 = ow3Var4;
                    sw3Var4 = sw3Var3;
                    vf80VarB = xf80.b(fetVar);
                    ow3Var5 = ow3Var8;
                }
                fetVar.s();
                i12 = (i11 & 14) | ((i11 >> 15) & 112);
                boolean z13 = z6;
                boolean z14 = (((i12 & 14) ^ 6) <= 4 && fetVar.g(ngvVar)) || (i12 & 6) == 4;
                z3 = ((i12 & 112) ^ 48) > 32 ? false : false;
                z7 = z14 | z3;
                objP2 = fetVar.P();
                if (z7) {
                    objP2 = new tgv(new r7y(ngvVar, ow3Var5, (byte) 9));
                    fetVar.o0(objP2);
                } else {
                    objP2 = new tgv(new r7y(ngvVar, ow3Var5, (byte) 9));
                    fetVar.o0(objP2);
                }
                int i16 = i11 >> 3;
                hh80 hh80Var5 = lh80Var;
                z5 = z13;
                h8x.h(mm40Var, d9zVar3, (tgv) objP2, hh80Var5, true, qkqVar2, z5, vf80VarB, sw3Var4, ow3Var5, function1, fetVar, (i16 & 29360128) | (i16 & 14) | 196608 | (i16 & 112) | (i11 & 7168) | (57344 & i11) | ((i11 << 12) & 1879048192), ((i11 >> 18) & 14) | ((i9 << 3) & 112));
                hh80Var3 = hh80Var5;
                sw3Var2 = sw3Var4;
                ow3Var3 = ow3Var5;
            } else {
                fetVar.X();
                sw3Var2 = sw3Var;
                vf80VarB = vf80Var;
                d9zVar3 = d9zVar2;
                hh80Var3 = hh80Var2;
                ow3Var3 = ow3Var2;
                z5 = z2;
                qkqVar2 = qkqVar;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new zbc(ngvVar, mm40Var, d9zVar3, hh80Var3, sw3Var2, ow3Var3, qkqVar2, z5, vf80VarB, function1, i, i2);
            }
        }
        i3 |= 3072;
        hh80Var2 = hh80Var;
        i4 = i3 | 24576;
        if ((i & 196608) != 0) {
            i4 |= ((i2 & 32) == 0 || !fetVar.g(sw3Var)) ? 65536 : 131072;
        }
        i5 = i2 & 64;
        if (i5 != 0) {
            if ((1572864 & i) == 0) {
                ow3Var2 = ow3Var;
                if (fetVar.g(ow3Var2)) {
                    i6 = 1048576;
                } else {
                    i6 = 524288;
                }
                i4 |= i6;
            }
            if ((i & 12582912) == 0) {
                i4 |= 4194304;
            }
            i7 = i2 & 256;
            if (i7 != 0) {
                i4 |= 100663296;
                z2 = z;
            } else {
                z2 = z;
                if ((i & 100663296) == 0) {
                    if (fetVar.h(z2)) {
                        i8 = 67108864;
                    } else {
                        i8 = 33554432;
                    }
                    i4 |= i8;
                }
            }
            if ((i & 805306368) == 0) {
                i4 |= 268435456;
            }
            if (fetVar.i(function1)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            z3 = true;
            if ((i4 & 306783379) == 306783378) {
                z4 = true;
            } else {
                z4 = true;
            }
            if (fetVar.U(i4 & 1, z4)) {
                fetVar.Z();
                i10 = i & 1;
                Object obj3 = ukd.f35823a;
                if (i10 != 0) {
                    if ((i2 & 4) != 0) {
                        d9zVarA = f9z.a(fetVar);
                        i4 &= -897;
                    } else {
                        d9zVarA = d9zVar2;
                    }
                    if (i14 != 0) {
                        lh80Var = new lh80(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        lh80Var = hh80Var2;
                    }
                    if ((i2 & 32) != 0) {
                        sw3Var3 = uc9.c;
                        i4 &= -458753;
                    } else {
                        sw3Var3 = sw3Var;
                    }
                    if (i5 != 0) {
                        ow3Var4 = uc9.f35418a;
                    } else {
                        ow3Var4 = ow3Var2;
                    }
                    sjjVarA = wzk0.a(fetVar);
                    zG = fetVar.g(sjjVarA);
                    objP = fetVar.P();
                    if (zG) {
                        objP = new iuj(sjjVarA);
                        fetVar.o0(objP);
                    } else {
                        objP = new iuj(sjjVarA);
                        fetVar.o0(objP);
                    }
                    iuj iujVar4 = (iuj) objP;
                    if (i7 != 0) {
                        z2 = true;
                    }
                    boolean z15 = z2;
                    qkqVar2 = iujVar4;
                    z6 = z15;
                    d9z d9zVar7 = d9zVarA;
                    i11 = i4 & (-1908408321);
                    d9zVar3 = d9zVar7;
                    ow3 ow3Var9 = ow3Var4;
                    sw3Var4 = sw3Var3;
                    vf80VarB = xf80.b(fetVar);
                    ow3Var5 = ow3Var9;
                } else {
                    if ((i2 & 4) != 0) {
                        d9zVarA = f9z.a(fetVar);
                        i4 &= -897;
                    } else {
                        d9zVarA = d9zVar2;
                    }
                    if (i14 != 0) {
                        lh80Var = new lh80(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        lh80Var = hh80Var2;
                    }
                    if ((i2 & 32) != 0) {
                        sw3Var3 = uc9.c;
                        i4 &= -458753;
                    } else {
                        sw3Var3 = sw3Var;
                    }
                    if (i5 != 0) {
                        ow3Var4 = uc9.f35418a;
                    } else {
                        ow3Var4 = ow3Var2;
                    }
                    sjjVarA = wzk0.a(fetVar);
                    zG = fetVar.g(sjjVarA);
                    objP = fetVar.P();
                    if (zG) {
                        objP = new iuj(sjjVarA);
                        fetVar.o0(objP);
                    } else {
                        objP = new iuj(sjjVarA);
                        fetVar.o0(objP);
                    }
                    iuj iujVar5 = (iuj) objP;
                    if (i7 != 0) {
                        z2 = true;
                    }
                    boolean z16 = z2;
                    qkqVar2 = iujVar5;
                    z6 = z16;
                    d9z d9zVar8 = d9zVarA;
                    i11 = i4 & (-1908408321);
                    d9zVar3 = d9zVar8;
                    ow3 ow3Var10 = ow3Var4;
                    sw3Var4 = sw3Var3;
                    vf80VarB = xf80.b(fetVar);
                    ow3Var5 = ow3Var10;
                }
                fetVar.s();
                i12 = (i11 & 14) | ((i11 >> 15) & 112);
                boolean z17 = z6;
                boolean z18 = (((i12 & 14) ^ 6) <= 4 && fetVar.g(ngvVar)) || (i12 & 6) == 4;
                if (((i12 & 112) ^ 48) > 32) {
                }
                z7 = z18 | z3;
                objP2 = fetVar.P();
                if (z7) {
                    objP2 = new tgv(new r7y(ngvVar, ow3Var5, (byte) 9));
                    fetVar.o0(objP2);
                } else {
                    objP2 = new tgv(new r7y(ngvVar, ow3Var5, (byte) 9));
                    fetVar.o0(objP2);
                }
                int i17 = i11 >> 3;
                hh80 hh80Var6 = lh80Var;
                z5 = z17;
                h8x.h(mm40Var, d9zVar3, (tgv) objP2, hh80Var6, true, qkqVar2, z5, vf80VarB, sw3Var4, ow3Var5, function1, fetVar, (i17 & 29360128) | (i17 & 14) | 196608 | (i17 & 112) | (i11 & 7168) | (57344 & i11) | ((i11 << 12) & 1879048192), ((i11 >> 18) & 14) | ((i9 << 3) & 112));
                hh80Var3 = hh80Var6;
                sw3Var2 = sw3Var4;
                ow3Var3 = ow3Var5;
            } else {
                fetVar.X();
                sw3Var2 = sw3Var;
                vf80VarB = vf80Var;
                d9zVar3 = d9zVar2;
                hh80Var3 = hh80Var2;
                ow3Var3 = ow3Var2;
                z5 = z2;
                qkqVar2 = qkqVar;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new zbc(ngvVar, mm40Var, d9zVar3, hh80Var3, sw3Var2, ow3Var3, qkqVar2, z5, vf80VarB, function1, i, i2);
            }
        }
        i4 |= 1572864;
        ow3Var2 = ow3Var;
        if ((i & 12582912) == 0) {
            i4 |= 4194304;
        }
        i7 = i2 & 256;
        if (i7 != 0) {
            i4 |= 100663296;
            z2 = z;
        } else {
            z2 = z;
            if ((i & 100663296) == 0) {
                if (fetVar.h(z2)) {
                    i8 = 67108864;
                } else {
                    i8 = 33554432;
                }
                i4 |= i8;
            }
        }
        if ((i & 805306368) == 0) {
            i4 |= 268435456;
        }
        if (fetVar.i(function1)) {
            i9 = 4;
        } else {
            i9 = 2;
        }
        z3 = true;
        if ((i4 & 306783379) == 306783378) {
            z4 = true;
        } else {
            z4 = true;
        }
        if (fetVar.U(i4 & 1, z4)) {
            fetVar.Z();
            i10 = i & 1;
            Object obj4 = ukd.f35823a;
            if (i10 != 0) {
                if ((i2 & 4) != 0) {
                    d9zVarA = f9z.a(fetVar);
                    i4 &= -897;
                } else {
                    d9zVarA = d9zVar2;
                }
                if (i14 != 0) {
                    lh80Var = new lh80(0.0f, 0.0f, 0.0f, 0.0f);
                } else {
                    lh80Var = hh80Var2;
                }
                if ((i2 & 32) != 0) {
                    sw3Var3 = uc9.c;
                    i4 &= -458753;
                } else {
                    sw3Var3 = sw3Var;
                }
                if (i5 != 0) {
                    ow3Var4 = uc9.f35418a;
                } else {
                    ow3Var4 = ow3Var2;
                }
                sjjVarA = wzk0.a(fetVar);
                zG = fetVar.g(sjjVarA);
                objP = fetVar.P();
                if (zG) {
                    objP = new iuj(sjjVarA);
                    fetVar.o0(objP);
                } else {
                    objP = new iuj(sjjVarA);
                    fetVar.o0(objP);
                }
                iuj iujVar6 = (iuj) objP;
                if (i7 != 0) {
                    z2 = true;
                }
                boolean z19 = z2;
                qkqVar2 = iujVar6;
                z6 = z19;
                d9z d9zVar9 = d9zVarA;
                i11 = i4 & (-1908408321);
                d9zVar3 = d9zVar9;
                ow3 ow3Var11 = ow3Var4;
                sw3Var4 = sw3Var3;
                vf80VarB = xf80.b(fetVar);
                ow3Var5 = ow3Var11;
            } else {
                if ((i2 & 4) != 0) {
                    d9zVarA = f9z.a(fetVar);
                    i4 &= -897;
                } else {
                    d9zVarA = d9zVar2;
                }
                if (i14 != 0) {
                    lh80Var = new lh80(0.0f, 0.0f, 0.0f, 0.0f);
                } else {
                    lh80Var = hh80Var2;
                }
                if ((i2 & 32) != 0) {
                    sw3Var3 = uc9.c;
                    i4 &= -458753;
                } else {
                    sw3Var3 = sw3Var;
                }
                if (i5 != 0) {
                    ow3Var4 = uc9.f35418a;
                } else {
                    ow3Var4 = ow3Var2;
                }
                sjjVarA = wzk0.a(fetVar);
                zG = fetVar.g(sjjVarA);
                objP = fetVar.P();
                if (zG) {
                    objP = new iuj(sjjVarA);
                    fetVar.o0(objP);
                } else {
                    objP = new iuj(sjjVarA);
                    fetVar.o0(objP);
                }
                iuj iujVar7 = (iuj) objP;
                if (i7 != 0) {
                    z2 = true;
                }
                boolean z110 = z2;
                qkqVar2 = iujVar7;
                z6 = z110;
                d9z d9zVar10 = d9zVarA;
                i11 = i4 & (-1908408321);
                d9zVar3 = d9zVar10;
                ow3 ow3Var12 = ow3Var4;
                sw3Var4 = sw3Var3;
                vf80VarB = xf80.b(fetVar);
                ow3Var5 = ow3Var12;
            }
            fetVar.s();
            i12 = (i11 & 14) | ((i11 >> 15) & 112);
            boolean z111 = z6;
            boolean z112 = (((i12 & 14) ^ 6) <= 4 && fetVar.g(ngvVar)) || (i12 & 6) == 4;
            if (((i12 & 112) ^ 48) > 32) {
            }
            z7 = z112 | z3;
            objP2 = fetVar.P();
            if (z7) {
                objP2 = new tgv(new r7y(ngvVar, ow3Var5, (byte) 9));
                fetVar.o0(objP2);
            } else {
                objP2 = new tgv(new r7y(ngvVar, ow3Var5, (byte) 9));
                fetVar.o0(objP2);
            }
            int i18 = i11 >> 3;
            hh80 hh80Var7 = lh80Var;
            z5 = z111;
            h8x.h(mm40Var, d9zVar3, (tgv) objP2, hh80Var7, true, qkqVar2, z5, vf80VarB, sw3Var4, ow3Var5, function1, fetVar, (i18 & 29360128) | (i18 & 14) | 196608 | (i18 & 112) | (i11 & 7168) | (57344 & i11) | ((i11 << 12) & 1879048192), ((i11 >> 18) & 14) | ((i9 << 3) & 112));
            hh80Var3 = hh80Var7;
            sw3Var2 = sw3Var4;
            ow3Var3 = ow3Var5;
        } else {
            fetVar.X();
            sw3Var2 = sw3Var;
            vf80VarB = vf80Var;
            d9zVar3 = d9zVar2;
            hh80Var3 = hh80Var2;
            ow3Var3 = ow3Var2;
            z5 = z2;
            qkqVar2 = qkqVar;
        }
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zbc(ngvVar, mm40Var, d9zVar3, hh80Var3, sw3Var2, ow3Var3, qkqVar2, z5, vf80VarB, function1, i, i2);
        }
    }

    public static final void j(int i, a1t a1tVar, Function1 function1, Function0 function0, fet fetVar, int i2) {
        fet fetVar2 = fetVar;
        function1.getClass();
        function0.getClass();
        fetVar2.g0(1524026980);
        int i3 = i2 | (fetVar2.e(i) ? 4 : 2) | (fetVar2.g(a1tVar) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128) | (fetVar2.i(function0) ? 2048 : 1024);
        if (fetVar2.U(i3 & 1, (i3 & 1171) != 1170)) {
            zcl zclVar = qmk.f28987a;
            wvb.o(null, 24.0f, 0L, fetVar2, 0, 5);
            wwb.i(null, xsm0.s(i, fetVar2), 0L, 0, 0L, fetVar2, 0, 29);
            wvb.o(null, 8.0f, 0L, fetVar, 0, 5);
            int i4 = i3 << 9;
            dtb.m(s5x0.K(jm40.b, 16.0f, 8.0f), null, xsm0.s(R.string.province, fetVar), 0L, function1, function0, fetVar, (458752 & i4) | 3072 | (i4 & 3670016), 18);
            vtb.t(null, qqm.b, zfi0.f44303a, 0L, fetVar, 432, 9);
            fetVar2 = fetVar;
            pkk0 pkk0Var = (pkk0) fetVar2.k(bmd.q);
            wpq wpqVar = (wpq) fetVar2.k(bmd.i);
            Unit unit = Unit.f46060a;
            boolean zG = ((i3 & 112) == 32) | fetVar2.g(pkk0Var) | fetVar2.i(wpqVar);
            Object objP = fetVar2.P();
            if (zG || objP == ukd.f35823a) {
                objP = new zd00(a1tVar, pkk0Var, wpqVar, (yje) null);
                fetVar2.o0(objP);
            }
            m0x0.t(fetVar2, unit, (Function2) objP);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new if00(i, a1tVar, function1, function0, i2);
        }
    }

    public static final void k(mm40 mm40Var, final k580 k580Var, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        k580Var.getClass();
        fetVar.g0(1132744292);
        final byte b = 2;
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(k580Var) ? 32 : 16;
        }
        final byte b2 = 0;
        final byte b3 = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            fetVar2 = fetVar;
            vdx.n(o7k0.e(mm40Var, 52.0f), u1c.M(-854491886, new Function2() { // from class: a.ax40
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    byte b4 = b2;
                    jm40 jm40Var = jm40.b;
                    k580 k580Var2 = k580Var;
                    switch (b4) {
                        case 0:
                            fet fetVar3 = (fet) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (fetVar3.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                                hxm0.h(o7k0.d(jm40Var, 1.0f), k580Var2.f17707a, gqw0.f, 0, fetVar3, 390, 8);
                            } else {
                                fetVar3.X();
                            }
                            break;
                        case 1:
                            fet fetVar4 = (fet) obj;
                            int iIntValue2 = ((Integer) obj2).intValue();
                            if (fetVar4.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                zcl zclVar2 = qmk.f28987a;
                                g8x.n(s5x0.L(jm40Var, 8.0f, 0.0f, 2), k580Var2.c, fetVar4, 0);
                            } else {
                                fetVar4.X();
                            }
                            break;
                        default:
                            fet fetVar5 = (fet) obj;
                            int iIntValue3 = ((Integer) obj2).intValue();
                            if (fetVar5.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                hxm0.h(o7k0.d(jm40Var, 1.0f), k580Var2.b, gqw0.d, 0, fetVar5, 390, 8);
                            } else {
                                fetVar5.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar), u1c.M(316716785, new Function2() { // from class: a.ax40
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    byte b4 = b3;
                    jm40 jm40Var = jm40.b;
                    k580 k580Var2 = k580Var;
                    switch (b4) {
                        case 0:
                            fet fetVar3 = (fet) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (fetVar3.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                                hxm0.h(o7k0.d(jm40Var, 1.0f), k580Var2.f17707a, gqw0.f, 0, fetVar3, 390, 8);
                            } else {
                                fetVar3.X();
                            }
                            break;
                        case 1:
                            fet fetVar4 = (fet) obj;
                            int iIntValue2 = ((Integer) obj2).intValue();
                            if (fetVar4.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                zcl zclVar2 = qmk.f28987a;
                                g8x.n(s5x0.L(jm40Var, 8.0f, 0.0f, 2), k580Var2.c, fetVar4, 0);
                            } else {
                                fetVar4.X();
                            }
                            break;
                        default:
                            fet fetVar5 = (fet) obj;
                            int iIntValue3 = ((Integer) obj2).intValue();
                            if (fetVar5.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                hxm0.h(o7k0.d(jm40Var, 1.0f), k580Var2.b, gqw0.d, 0, fetVar5, 390, 8);
                            } else {
                                fetVar5.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar), u1c.M(1487925456, new Function2() { // from class: a.ax40
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    byte b4 = b;
                    jm40 jm40Var = jm40.b;
                    k580 k580Var2 = k580Var;
                    switch (b4) {
                        case 0:
                            fet fetVar3 = (fet) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (fetVar3.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                                hxm0.h(o7k0.d(jm40Var, 1.0f), k580Var2.f17707a, gqw0.f, 0, fetVar3, 390, 8);
                            } else {
                                fetVar3.X();
                            }
                            break;
                        case 1:
                            fet fetVar4 = (fet) obj;
                            int iIntValue2 = ((Integer) obj2).intValue();
                            if (fetVar4.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                zcl zclVar2 = qmk.f28987a;
                                g8x.n(s5x0.L(jm40Var, 8.0f, 0.0f, 2), k580Var2.c, fetVar4, 0);
                            } else {
                                fetVar4.X();
                            }
                            break;
                        default:
                            fet fetVar5 = (fet) obj;
                            int iIntValue3 = ((Integer) obj2).intValue();
                            if (fetVar5.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                hxm0.h(o7k0.d(jm40Var, 1.0f), k580Var2.b, gqw0.d, 0, fetVar5, 390, 8);
                            } else {
                                fetVar5.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar), fetVar2, 3504);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dlw(mm40Var, k580Var, i, (byte) 22);
        }
    }

    public static final void l(final d5a0 d5a0Var, final d5a0 d5a0Var2, final w6n w6nVar, fet fetVar) {
        final byte b = 0;
        ugd ugdVarM = u1c.M(882835744, new Function2() { // from class: a.vm80
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                byte b2 = b;
                cl5 cl5Var = ukd.f35823a;
                jm40 jm40Var = jm40.b;
                w6n w6nVar2 = w6nVar;
                d5a0 d5a0Var3 = d5a0Var;
                fet fetVar2 = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                switch (b2) {
                    case 0:
                        if (fetVar2.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                            u6n u6nVarJ = n2x.J(d5a0Var3.f5497a, w6nVar2, fetVar2);
                            mm40 mm40VarK0 = mrv.k0(jm40Var, "LOGO");
                            boolean zG = fetVar2.g(u6nVarJ);
                            Object objP = fetVar2.P();
                            if (zG || objP == cl5Var) {
                                objP = new m2m(u6nVarJ, (byte) 1);
                                fetVar2.o0(objP);
                            }
                            kkb.p(0, fetVar2, mm40VarK0, (Function0) objP);
                        } else {
                            fetVar2.X();
                        }
                        break;
                    default:
                        if (fetVar2.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                            u6n u6nVarJ2 = n2x.J(d5a0Var3.f5497a, w6nVar2, fetVar2);
                            mm40 mm40VarK1 = mrv.k0(jm40Var, "LOGO");
                            boolean zG2 = fetVar2.g(u6nVarJ2);
                            Object objP2 = fetVar2.P();
                            if (zG2 || objP2 == cl5Var) {
                                objP2 = new m2m(u6nVarJ2, (byte) 1);
                                fetVar2.o0(objP2);
                            }
                            kkb.p(0, fetVar2, mm40VarK1, (Function0) objP2);
                        } else {
                            fetVar2.X();
                        }
                        break;
                }
                return Unit.f46060a;
            }
        }, fetVar);
        jm40 jm40Var = jm40.b;
        n2x.g(jm40Var, ugdVarM, null, fetVar, 48, 4);
        final byte b2 = 1;
        n2x.g(jm40Var, u1c.M(-1858773289, new Function2() { // from class: a.vm80
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                byte b3 = b2;
                cl5 cl5Var = ukd.f35823a;
                jm40 jm40Var2 = jm40.b;
                w6n w6nVar2 = w6nVar;
                d5a0 d5a0Var3 = d5a0Var2;
                fet fetVar2 = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                switch (b3) {
                    case 0:
                        if (fetVar2.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                            u6n u6nVarJ = n2x.J(d5a0Var3.f5497a, w6nVar2, fetVar2);
                            mm40 mm40VarK0 = mrv.k0(jm40Var2, "LOGO");
                            boolean zG = fetVar2.g(u6nVarJ);
                            Object objP = fetVar2.P();
                            if (zG || objP == cl5Var) {
                                objP = new m2m(u6nVarJ, (byte) 1);
                                fetVar2.o0(objP);
                            }
                            kkb.p(0, fetVar2, mm40VarK0, (Function0) objP);
                        } else {
                            fetVar2.X();
                        }
                        break;
                    default:
                        if (fetVar2.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                            u6n u6nVarJ2 = n2x.J(d5a0Var3.f5497a, w6nVar2, fetVar2);
                            mm40 mm40VarK1 = mrv.k0(jm40Var2, "LOGO");
                            boolean zG2 = fetVar2.g(u6nVarJ2);
                            Object objP2 = fetVar2.P();
                            if (zG2 || objP2 == cl5Var) {
                                objP2 = new m2m(u6nVarJ2, (byte) 1);
                                fetVar2.o0(objP2);
                            }
                            kkb.p(0, fetVar2, mm40VarK1, (Function0) objP2);
                        } else {
                            fetVar2.X();
                        }
                        break;
                }
                return Unit.f46060a;
            }
        }, fetVar), null, fetVar, 48, 4);
    }

    public static final void m(l7m0 l7m0Var, fet fetVar, int i) {
        l7m0Var.getClass();
        fetVar.g0(-36419959);
        int i2 = (fetVar.g(l7m0Var) ? 4 : 2) | i;
        byte b = 14;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            mm40 mm40VarV = cjx.V(o7k0.d(o7k0.w(jm40.b, null, false, 3), 1.0f), a8k0.G(xczVarA, fetVar), null);
            boolean z = (i2 & 14) == 4;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new ufp(l7m0Var, (byte) 20);
                fetVar.o0(objP);
            }
            b8k0.e(mm40VarV, xczVarA, null, null, null, null, false, null, (Function1) objP, fetVar, 0, 508);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cw0(l7m0Var, i, b);
        }
    }

    public static final void n(mm40 mm40Var, lpm lpmVar, fet fetVar, int i) {
        fetVar.g0(1858335908);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(lpmVar) ? 32 : 16);
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            n4c.l(mm40Var, lpmVar, false, fetVar, 4);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new bx40(mm40Var, lpmVar, i, b);
        }
    }

    public static final void o(long j, fqj0 fqj0Var, fet fetVar, int i) {
        fetVar.g0(-2023356120);
        int i2 = i | (fetVar.f(j) ? 4 : 2) | (fetVar.g(fqj0Var) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(i120.Q(o7k0.e(mm40VarD, 52.0f), j, jd8.n), 8.0f, 0.0f, 0.0f, 0.0f, 14);
            thg0 thg0VarA = shg0.a(uc9.b, gqw0.k, fetVar, 54);
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
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            mm40 mm40VarH = dw9.h(1.0f, o7k0.e(s5x0.N(jm40Var, 0.0f, 0.0f, 32.0f, 0.0f, 11), 16.0f), true);
            zcl zclVar2 = qmk.f;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarH), fqj0Var));
            dw9.x(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, o7k0.e(o7k0.s(s5x0.N(jm40Var, 0.0f, 0.0f, 8.0f, 0.0f, 11), 134.0f), 16.0f)), fqj0Var, fetVar, 0, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yxh(j, fqj0Var, i, (byte) 2);
        }
    }

    public static final void p(mm40 mm40Var, ugd ugdVar, ugd ugdVar2, fet fetVar, int i, int i2) {
        int i3;
        ugd ugdVar3;
        fetVar.g0(-170778217);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = i | (fetVar.g(mm40Var) ? 4 : 2);
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            if (i4 != 0) {
                mm40Var = jm40.b;
            }
            zcl zclVar = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(2.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
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
            ugdVar.invoke(fetVar, 6);
            ugdVar3 = ugdVar2;
            ugdVar3.invoke(fetVar, 6);
            fetVar.r(true);
        } else {
            ugdVar3 = ugdVar2;
            fetVar.X();
        }
        mm40 mm40Var2 = mm40Var;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gka(mm40Var2, ugdVar, ugdVar3, i, i2);
        }
    }

    public static final void q(s1l0 s1l0Var, mm40 mm40Var, fet fetVar, int i) {
        int i2;
        fetVar.g0(-155488078);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(s1l0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(mm40Var) ? 32 : 16;
        }
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            String str = s1l0Var.e;
            p1l0 p1l0Var = s1l0Var.b;
            Integer numValueOf = p1l0Var != null ? Integer.valueOf(p1l0Var.f26208a) : null;
            if (str == null || str.length() == 0 || numValueOf == null) {
                fetVar.e0(2125264560);
                fetVar.r(false);
            } else {
                fetVar.e0(2124745620);
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarN = o7k0.n(mm40Var, 18.0f);
                ugg0 ugg0Var = vgg0.f37379a;
                mm40 mm40VarJ = lgb.J(mm40VarN, ugg0Var);
                zfn zfnVar = zaq0.b;
                mm40 mm40VarQ = i120.Q(mm40VarJ, ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), jd8.n);
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
                f(lgb.J(o7k0.n(jm40.b, 14.0f), ugg0Var), str, numValueOf.intValue(), new y3d(((ThemeColors) fetVar.k(zfnVar)).getSecondary()), null, null, fetVar, 0, 48);
                fetVar.r(true);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new n1l0(s1l0Var, mm40Var, i, b);
        }
    }

    public static final void r(mm40 mm40Var, u1l0 u1l0Var, Function0 function0, fet fetVar, int i) {
        int i2;
        u1l0Var.getClass();
        fetVar.g0(-1274240734);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(u1l0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function0) ? 256 : 128;
        }
        if (!fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            fetVar.X();
        } else if (u1l0Var instanceof t1l0) {
            fetVar.e0(-1984525312);
            e((t1l0) u1l0Var, o2e.e0(mm40Var, "ICON_CONTAINER"), fetVar, (i2 >> 3) & 14);
            fetVar.r(false);
        } else if (u1l0Var instanceof r1l0) {
            fetVar.e0(-1984303879);
            b(o2e.e0(mm40Var, "BACKGROUND_ICON_CONTAINER"), (r1l0) u1l0Var, fetVar, i2 & 112);
            fetVar.r(false);
        } else if (u1l0Var instanceof s1l0) {
            fetVar.e0(-1984076773);
            c((s1l0) u1l0Var, o2e.e0(mm40Var, "CHAMPIONSHIP_ICON_CONTAINER"), fetVar, (i2 >> 3) & 14);
            fetVar.r(false);
        } else {
            if (!(u1l0Var instanceof q1l0)) {
                throw b1j.f(-479660215, fetVar, false);
            }
            fetVar.e0(-1983835562);
            a(o2e.e0(mm40Var, "ACTION_ICON_CONTAINER"), (q1l0) u1l0Var, function0, fetVar, i2 & 1008);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wbg0((Object) mm40Var, (Object) u1l0Var, (Object) function0, i, (byte) 26);
        }
    }

    public static final void s(qa00 qa00Var, float f, float f2, Function1 function1, fet fetVar, int i) {
        int i2;
        fetVar.g0(1863645122);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(qa00Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.d(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.d(f2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            mm40 mm40VarN = s5x0.N(o7k0.d(jm40.b, 1.0f), 0.0f, f, 0.0f, f2, 5);
            zcl zclVar = qmk.f28987a;
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
            kcx.f(qa00Var.c.b, function1, fetVar, (i2 >> 6) & 112);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new clb(qa00Var, f, f2, function1, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v1, types: [java.lang.Throwable] */
    public static final void u(lc00 lc00Var, xeg0 xeg0Var, ctf0 ctf0Var) {
        int i;
        y3d y3dVar;
        Object next;
        Object next2;
        ctf0Var.getClass();
        List list = xeg0Var.c;
        boolean zIsEmpty = list.isEmpty();
        kfg0 kfg0Var = xeg0Var.f40745a;
        int iOrdinal = kfg0Var.ordinal();
        int i2 = 0;
        int i3 = 2;
        if (iOrdinal == 0) {
            i = R.drawable.rouletteeu;
        } else if (iOrdinal == 1) {
            i = R.drawable.rouletteus;
        } else {
            if (iOrdinal != 2) {
                t9f.b();
                return;
            }
            i = 0;
        }
        lc00Var.add(new sfg0(i, xeg0Var.d, xeg0Var.b, kfg0Var));
        y3d y3dVar2 = null;
        lc00Var.add(new boo0("ROULETTE_TAB_KEY", new fyl(zIsEmpty ? lak0.c : dyb.g0(new lxl(1L, (dyl) new xxl(ctf0Var.b.a(R.string.statistic, Arrays.copyOf(new Object[0], 0))), false, uxl.b, (cwl) null, 108)), null, null, s5x0.t(8.0f, 0.0f, 2), new jyl(new y3d(ijg.L), y3dVar2, y3dVar2, 126), 6), pno0.f27299a));
        list.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            int i4 = i2 + 1;
            if (i2 < 0) {
                ?? r20 = y3dVar2;
                q3d.p();
                throw r20;
            }
            String str = (String) obj;
            long j = i2;
            String strM = i4 < 10 ? twn.m(i4, "0") : String.valueOf(i4);
            strM.getClass();
            str.getClass();
            int i5 = Integer.parseInt(str);
            int iOrdinal2 = kfg0Var.ordinal();
            int i6 = R.color.cyber_synthetic_roulette_black_sector;
            if (iOrdinal2 == 0) {
                y3dVar = y3dVar2;
                Iterator it = weg0.e.iterator();
                do {
                    if (!it.hasNext()) {
                        next = y3dVar;
                        break;
                    }
                    next = it.next();
                } while (((weg0) next).f39018a != i5);
                weg0 weg0Var = (weg0) next;
                if (weg0Var != null) {
                    i6 = weg0Var.c;
                }
            } else if (iOrdinal2 == 1) {
                Iterator it2 = tfg0.e.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        y3dVar = y3dVar2;
                        next2 = y3dVar;
                        break;
                    } else {
                        next2 = it2.next();
                        y3dVar = y3dVar2;
                        if (((tfg0) next2).f33864a == i5) {
                            break;
                        } else {
                            y3dVar2 = y3dVar;
                        }
                    }
                }
                tfg0 tfg0Var = (tfg0) next2;
                if (tfg0Var != null) {
                    i6 = tfg0Var.c;
                }
            } else {
                if (iOrdinal2 != i3) {
                    t9f.b();
                    return;
                }
                y3dVar = y3dVar2;
            }
            arrayList.add(new gfg0(i6, j, strM, str));
            y3dVar2 = y3dVar;
            i2 = i4;
            i3 = 2;
        }
        lc00Var.add(new ifg0(arrayList));
    }

    public static final void v(cp cpVar) {
        yfu0 yfu0Var = cpVar.u;
        Context context = cpVar.w;
        kxx kxxVar = (kxx) yfu0Var;
        if (((tzi0) cpVar.u()).b) {
            kxxVar.d.setText(R.string.update_app_button);
            kxxVar.d.setTextColor(m5d.b(R.attr.uikitPrimary, context));
        } else {
            kxxVar.d.setText(R.string.updated);
            kxxVar.d.setTextColor(m5d.b(R.attr.uikitSecondary, context));
        }
    }

    public static final void w(int i, StringBuilder sb) {
        if (i <= 0) {
            return;
        }
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(Separators.QUESTION);
        }
        sb.append(CollectionsKt.b0(arrayList, Separators.COMMA, null, null, null, 62));
    }

    public static final lc00 x(boolean z) {
        byx byxVar = byx.f3439a;
        if (z) {
            lc00 lc00VarB = kotlin.collections.a.b();
            lc00VarB.add(new ue40(byxVar));
            lc00VarB.add(new pe40(t4t.f33338a, byxVar));
            lc00VarB.add(new ne40(byxVar));
            return kotlin.collections.a.a(lc00VarB);
        }
        lc00 lc00VarB2 = kotlin.collections.a.b();
        lc00VarB2.add(new ue40(byxVar));
        lc00VarB2.add(new pe40(m4t.f21189a, byxVar));
        lc00VarB2.add(new pe40(j4t.f15900a, byxVar));
        lc00VarB2.add(new pe40(n4t.f22913a, byxVar));
        lc00VarB2.add(new pe40(k4t.f17683a, byxVar));
        lc00VarB2.add(new ne40(byxVar));
        lc00VarB2.add(new ve40(byxVar));
        return kotlin.collections.a.a(lc00VarB2);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0042 A[ADDED_TO_REGION] */
    public static veq z(tul0 tul0Var, ueq ueqVar, Function0 function0) {
        meq meqVar;
        bek bekVar = meq.b;
        ueqVar.getClass();
        function0.getClass();
        int iOrdinal = ueqVar.c.ordinal();
        if (iOrdinal == 0) {
            meqVar = ueqVar.f35541a;
            meq meqVar2 = ueqVar.b;
            if (5 >= meqVar.f21660a && (meqVar2 == null || 5 < meqVar2.f21660a)) {
                return (veq) function0.invoke();
            }
        } else if (iOrdinal == 1) {
            int iOrdinal2 = tul0Var.ordinal();
            if (iOrdinal2 != 0) {
                if (iOrdinal2 != 1 && iOrdinal2 != 2) {
                    t9f.b();
                    return null;
                }
                meqVar = ueqVar.f35541a;
                meq meqVar3 = ueqVar.b;
                if (5 >= meqVar.f21660a) {
                    return (veq) function0.invoke();
                }
            }
        } else {
            if (iOrdinal != 2) {
                t9f.b();
                return null;
            }
            int iOrdinal3 = tul0Var.ordinal();
            if (iOrdinal3 != 0 && iOrdinal3 != 1) {
                if (iOrdinal3 != 2) {
                    t9f.b();
                    return null;
                }
                meqVar = ueqVar.f35541a;
                meq meqVar4 = ueqVar.b;
                if (5 >= meqVar.f21660a) {
                    return (veq) function0.invoke();
                }
            }
        }
        return null;
    }

    public void V(mp9 mp9Var, Collection collection) {
        mp9Var.getClass();
        mp9Var.d0(collection);
    }

    public abstract void t(mp9 mp9Var);

    public void y(mp9 mp9Var, mp9 mp9Var2) {
    }
}
