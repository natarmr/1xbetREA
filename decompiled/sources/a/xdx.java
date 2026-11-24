package a;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.gov.nist.core.Separators;
import android.javax.sip.message.Response;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.widget.TextView;
import com.huawei.hms.framework.common.BundleUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class xdx {
    public static String A(g950 g950Var) {
        g950Var.getClass();
        String strB = g950Var.b();
        strB.getClass();
        if (!nny.f23846a.contains(strB)) {
            for (int i = 0; i < strB.length(); i++) {
                char cCharAt = strB.charAt(i);
                if (Character.isLetterOrDigit(cCharAt) || cCharAt == '_') {
                }
            }
            if (strB.length() != 0 && Character.isJavaIdentifierStart(strB.codePointAt(0))) {
                return strB;
            }
        }
        return "`".concat(strB).concat("`");
    }

    public static final String B(String str, String str2, Function0 function0, Function0 function1, Function1 function2) {
        str.getClass();
        str2.getClass();
        function2.getClass();
        String str3 = (String) function0.invoke();
        String strD = D(str, ohs0.n(str3, "Mutable"), str2, str3, ohs0.n(str3, "(Mutable)"));
        if (strD != null) {
            return strD;
        }
        String strD2 = D(str, str3.concat("MutableMap.MutableEntry"), str2, str3.concat("Map.Entry"), str3.concat("(Mutable)Map.(Mutable)Entry"));
        if (strD2 != null) {
            return strD2;
        }
        String str4 = (String) function1.invoke();
        StringBuilder sbR = brm0.r(str4);
        sbR.append((String) function2.invoke("Array<"));
        String string = sbR.toString();
        StringBuilder sbR2 = brm0.r(str4);
        sbR2.append((String) function2.invoke("Array<out "));
        String string2 = sbR2.toString();
        StringBuilder sbR3 = brm0.r(str4);
        sbR3.append((String) function2.invoke("Array<(out) "));
        String strD3 = D(str, string, str2, string2, sbR3.toString());
        if (strD3 != null) {
            return strD3;
        }
        return null;
    }

    public static final String C(List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            g950 g950Var = (g950) it.next();
            if (sb.length() > 0) {
                sb.append(Separators.DOT);
            }
            sb.append(A(g950Var));
        }
        return sb.toString();
    }

    public static final String D(String str, String str2, String str3, String str4, String str5) {
        brm0.B(str, str3, str4);
        if (!kotlin.text.c.x(str, str2, false) || !kotlin.text.c.x(str3, str4, false)) {
            return null;
        }
        String strSubstring = str.substring(str2.length());
        String strSubstring2 = str3.substring(str4.length());
        String strConcat = str5.concat(strSubstring);
        if (strSubstring.equals(strSubstring2)) {
            return strConcat;
        }
        if (Q(strSubstring, strSubstring2)) {
            return strConcat.concat("!");
        }
        return null;
    }

    public static final List E(List list, Function1 function1) {
        list.getClass();
        HashMap map = new HashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object objInvoke = function1.invoke(list.get(i));
            if (objInvoke == null) {
                objInvoke = Integer.valueOf(i);
            }
            String string = objInvoke.toString();
            if (!linkedHashSet.add(string)) {
                Object obj = map.get(string);
                if (obj == null) {
                    obj = 2;
                    map.put(string, obj);
                }
                int iIntValue = ((Number) obj).intValue();
                map.put(string, Integer.valueOf(iIntValue + 1));
                linkedHashSet.add(string + "_duplicate_" + iIntValue);
            }
        }
        return CollectionsKt.L0(linkedHashSet);
    }

    public static final void F(zdj0 zdj0Var, Function1 function1) {
        if (!(zdj0Var instanceof xdj0)) {
            zdj0Var.getClass();
            function1.invoke(new hbj0(zdj0Var));
            return;
        }
        xdj0 xdj0Var = (xdj0) zdj0Var;
        boolean z = !xdj0Var.c;
        String str = xdj0Var.f40696a;
        int i = xdj0Var.b;
        boolean z2 = xdj0Var.d;
        str.getClass();
        function1.invoke(new hbj0(new xdj0(z, z2, str, i)));
    }

    public static final StaticLayout G(CharSequence charSequence, TextPaint textPaint, int i, int i2, int i3, boolean z, TextUtils.TruncateAt truncateAt, Layout.Alignment alignment) {
        charSequence.getClass();
        textPaint.getClass();
        alignment.getClass();
        int iMax = Math.max(i, 0);
        StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(charSequence, 0, i3, textPaint, iMax).setAlignment(alignment).setLineSpacing(0.0f, 1.0f).setIncludePad(z).setEllipsize(truncateAt).setEllipsizedWidth(iMax).setMaxLines(i2).build();
        staticLayoutBuild.getClass();
        return staticLayoutBuild;
    }

    public static StaticLayout H(TextView textView, int i, int i2) {
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        int length = textView.getText().length();
        if ((i2 & 256) != 0) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        }
        Layout.Alignment alignment2 = alignment;
        textView.getClass();
        alignment2.getClass();
        CharSequence text = textView.getText();
        text.getClass();
        TextPaint paint = textView.getPaint();
        paint.getClass();
        return G(text, paint, i, textView.getMaxLines(), length, true, textView.getEllipsize(), alignment2);
    }

    public static /* synthetic */ StaticLayout I(CharSequence charSequence, TextPaint textPaint, int i, int i2, TextUtils.TruncateAt truncateAt, int i3, Layout.Alignment alignment, int i4) {
        TextUtils.TruncateAt truncateAt2 = truncateAt;
        int length = charSequence.length();
        boolean z = (i4 & 256) != 0;
        if ((i4 & 512) != 0) {
            truncateAt2 = null;
        }
        if ((i4 & 2048) != 0) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        }
        return G(charSequence, textPaint, i, i2, length, z, truncateAt2, alignment);
    }

    public static final String J(String str) {
        Double dI = kotlin.text.b.i(str);
        if (dI == null) {
            return str;
        }
        double dDoubleValue = dI.doubleValue();
        pn40 pn40Var = pn40.f27267a;
        return pn40.c(dDoubleValue, p3u0.c);
    }

    /* JADX WARN: Code duplicated, block: B:90:0x01f2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:92:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:94:0x01fb  */
    public static final ra00 K(d800 d800Var, long j, uaq0 uaq0Var, List list, long j2) {
        String str;
        String str2;
        long j3;
        d800Var.getClass();
        uaq0Var.getClass();
        list.getClass();
        int iA = wp20.a(r3d.q(list, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (Object obj : list) {
            linkedHashMap.put(((b9a0) obj).f2199a, obj);
        }
        uaq0.f35345a.getClass();
        String str3 = s9m0.j(uaq0Var) ? "light" : "dark";
        long j4 = 2;
        if (j == 1) {
            str = "Soccer";
        } else if (j == 2) {
            str = "Hockey";
        } else {
            str = j == 3 ? "Basketball" : "";
        }
        StringBuilder sb = new StringBuilder(ujn.h);
        String strK = b1j.k("static/img/android/Lineups/", str, BundleUtil.UNDERLINE_TAG, str3, ".webp");
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
        String string = sb.toString();
        int i = s9m0.k(uaq0Var) ? R.drawable.lineup_placeholder_night : s9m0.j(uaq0Var) ? R.drawable.lineup_placeholder_light : R.drawable.lineup_placeholder_dark;
        List list2 = d800Var.b;
        ArrayList<u800> arrayList = new ArrayList();
        for (Object obj2 : list2) {
            List list3 = ((u800) obj2).b;
            if (list3 == null || !list3.isEmpty()) {
                Iterator it = list3.iterator();
                while (true) {
                    if (it.hasNext()) {
                        j3 = j4;
                        m800 m800Var = (m800) it.next();
                        if (m800Var.b == 0 && m800Var.c == 0) {
                            j4 = j3;
                        } else {
                            arrayList.add(obj2);
                        }
                    } else {
                        j3 = j4;
                    }
                }
            } else {
                j3 = j4;
            }
            j4 = j3;
        }
        long j5 = j4;
        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
        for (u800 u800Var : arrayList) {
            u800Var.getClass();
            List list4 = u800Var.b;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj3 : list4) {
                Integer numValueOf = Integer.valueOf(((m800) obj3).b);
                Object obj4 = linkedHashMap2.get(numValueOf);
                if (obj4 == null) {
                    ArrayList arrayList3 = new ArrayList();
                    linkedHashMap2.put(numValueOf, arrayList3);
                    obj4 = arrayList3;
                }
                ((List) obj4).add(obj3);
            }
            Collection collectionValues = new TreeMap(linkedHashMap2).values();
            collectionValues.getClass();
            Collection collection = collectionValues;
            ArrayList arrayList4 = new ArrayList(r3d.q(collection, 10));
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                List list5 = (List) it2.next();
                list5.getClass();
                List listA0 = CollectionsKt.A0(list5, new mjf0((byte) 19));
                Iterator it3 = it2;
                ArrayList arrayList5 = new ArrayList(r3d.q(listA0, 10));
                Iterator it4 = listA0.iterator();
                while (it4.hasNext()) {
                    m800 m800Var2 = (m800) it4.next();
                    b9a0 b9a0Var = (b9a0) linkedHashMap.get(m800Var2.f21346a);
                    int i2 = m800Var2.d;
                    String strValueOf = i2 != 0 ? String.valueOf(i2) : "";
                    Iterator it5 = it4;
                    if (b9a0Var != null) {
                        str2 = b9a0Var.d;
                        if (StringsKt.W(str2)) {
                            str2 = null;
                        }
                        if (str2 == null) {
                            if (b9a0Var != null) {
                                str2 = b9a0Var.b;
                            } else {
                                str2 = null;
                            }
                            if (str2 == null) {
                                str2 = "";
                            }
                        }
                    } else {
                        if (b9a0Var != null) {
                            str2 = b9a0Var.b;
                        } else {
                            str2 = null;
                        }
                        if (str2 == null) {
                            str2 = "";
                        }
                    }
                    String str4 = string;
                    String str5 = b9a0Var != null ? b9a0Var.f2199a : null;
                    String str6 = str5 == null ? "" : str5;
                    String str7 = b9a0Var != null ? b9a0Var.f : null;
                    arrayList5.add(new nea0(strValueOf, str2, str7 == null ? "" : str7, str6, strValueOf.length() == 0 ? str2 : str2.length() == 0 ? strValueOf : kng0.l(strValueOf, ". ", str2)));
                    it4 = it5;
                    string = str4;
                }
                arrayList4.add(dyb.r0(arrayList5));
                it2 = it3;
            }
            arrayList2.add(new p6m0(dyb.r0(CollectionsKt.t0(arrayList4)), u800Var.f35212a));
            string = string;
        }
        String str8 = string;
        i4 i4VarR0 = dyb.r0(arrayList2);
        if (j != j5) {
            p6m0 p6m0Var = (p6m0) CollectionsKt.firstOrNull(i4VarR0);
            if (p6m0Var == null) {
                p6m0Var = new p6m0(lak0.c, "");
            }
            return new qa00(str8, i, p6m0Var);
        }
        ArrayList arrayList6 = new ArrayList(r3d.q(arrayList, 10));
        int i3 = 0;
        for (Object obj5 : arrayList) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                q3d.p();
                throw null;
            }
            u800 u800Var2 = (u800) obj5;
            u800Var2.getClass();
            long j6 = i3;
            arrayList6.add(new lxl(j6, (dyl) new xxl(u800Var2.f35212a), false, (j6 > j2 ? 1 : (j6 == j2 ? 0 : -1)) == 0 || ((j2 > 0L ? 1 : (j2 == 0L ? 0 : -1)) == 0 && i3 == 0) ? uxl.b : uxl.f36445a, (cwl) null, 104));
            i3 = i4;
        }
        return new pa00(str8, i, i4VarR0, dyb.r0(arrayList6), (int) j2, d800Var.f5620a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r42v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r43v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r47v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v28, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r4v29, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v15, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r6v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    public static final n410 L(n510 n510Var) {
        ?? arrayList;
        List list;
        ?? r6;
        ?? arrayList2;
        ?? arrayList3;
        h510 h510Var;
        n510Var.getClass();
        Long l = n510Var.f22921a;
        long jLongValue = l != null ? l.longValue() : -1L;
        Long l2 = n510Var.b;
        long jLongValue2 = l2 != null ? l2.longValue() : -1L;
        String str = n510Var.c;
        String str2 = str == null ? "" : str;
        String strE = lmc.E(n510Var.d);
        Boolean bool = n510Var.e;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        String str3 = n510Var.f;
        String str4 = str3 == null ? "" : str3;
        Integer num = n510Var.g;
        int iIntValue = num != null ? num.intValue() : -1;
        Integer num2 = n510Var.h;
        int iIntValue2 = num2 != null ? num2.intValue() : -1;
        Integer num3 = n510Var.i;
        int iIntValue3 = num3 != null ? num3.intValue() : -1;
        Integer num4 = n510Var.j;
        int iIntValue4 = num4 != null ? num4.intValue() : -1;
        Integer num5 = n510Var.k;
        int iIntValue5 = num5 != null ? num5.intValue() : -1;
        Integer num6 = n510Var.l;
        int iIntValue6 = num6 != null ? num6.intValue() : -1;
        Integer num7 = n510Var.m;
        int iIntValue7 = num7 != null ? num7.intValue() : -1;
        Integer num8 = n510Var.n;
        int iIntValue8 = num8 != null ? num8.intValue() : -1;
        Integer num9 = n510Var.o;
        int iIntValue9 = num9 != null ? num9.intValue() : -1;
        Integer num10 = n510Var.p;
        int iIntValue10 = num10 != null ? num10.intValue() : -1;
        List<m410> list2 = n510Var.q;
        if (list2 != null) {
            arrayList = new ArrayList(r3d.q(list2, 10));
            for (m410 m410Var : list2) {
                m410Var.getClass();
                String str5 = m410Var.f21144a;
                if (str5 == null) {
                    str5 = "";
                }
                String str6 = m410Var.b;
                if (str6 == null) {
                    str6 = "";
                }
                arrayList.add(new j410(str5, str6));
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = iun.f15405a;
        }
        List list3 = n510Var.r;
        if (list3 != null) {
            ArrayList arrayList4 = new ArrayList(r3d.q(list3, 10));
            Iterator it = list3.iterator();
            ?? r7 = arrayList;
            while (it.hasNext()) {
                v410 v410Var = (v410) it.next();
                v410Var.getClass();
                Long l3 = v410Var.f36757a;
                long jLongValue3 = l3 != null ? l3.longValue() : 0L;
                String str7 = v410Var.b;
                String str8 = str7 == null ? "" : str7;
                String strE2 = lmc.E(v410Var.c);
                String str9 = v410Var.d;
                String str10 = str9 == null ? "" : str9;
                String strE3 = lmc.E(v410Var.e);
                String str11 = v410Var.f;
                String str12 = str11 == null ? "" : str11;
                Integer num11 = v410Var.g;
                int iIntValue11 = num11 != null ? num11.intValue() : -1;
                Integer num12 = v410Var.h;
                int iIntValue12 = num12 != null ? num12.intValue() : -1;
                Integer num13 = v410Var.i;
                int iIntValue13 = num13 != null ? num13.intValue() : -1;
                Integer num14 = v410Var.j;
                int iIntValue14 = num14 != null ? num14.intValue() : -1;
                Integer num15 = v410Var.k;
                int iIntValue15 = num15 != null ? num15.intValue() : -1;
                Integer num16 = v410Var.l;
                int iIntValue16 = num16 != null ? num16.intValue() : -1;
                Integer num17 = v410Var.m;
                int iIntValue17 = num17 != null ? num17.intValue() : -1;
                List list4 = v410Var.n;
                if (list4 != null) {
                    arrayList2 = new ArrayList(r3d.q(list4, 10));
                    Iterator it2 = list4.iterator();
                    while (it2.hasNext()) {
                        g510 g510Var = (g510) it2.next();
                        g510Var.getClass();
                        Iterator it3 = it2;
                        String str13 = g510Var.f10695a;
                        if (str13 == null) {
                            str13 = "";
                        }
                        arrayList2.add(new d510(str13, lmc.E(g510Var.b)));
                        it2 = it3;
                    }
                } else {
                    arrayList2 = 0;
                }
                if (arrayList2 == 0) {
                    arrayList2 = iun.f15405a;
                }
                ?? r42 = arrayList2;
                List list5 = v410Var.o;
                if (list5 != null) {
                    arrayList3 = new ArrayList(r3d.q(list5, 10));
                    Iterator it4 = list5.iterator();
                    while (it4.hasNext()) {
                        r410 r410Var = (r410) it4.next();
                        r410Var.getClass();
                        Iterator it5 = it4;
                        String str14 = r410Var.f29813a;
                        if (str14 == null) {
                            str14 = "";
                        }
                        arrayList3.add(new o410(str14, lmc.E(r410Var.b)));
                        it4 = it5;
                    }
                } else {
                    arrayList3 = 0;
                }
                if (arrayList3 == 0) {
                    arrayList3 = iun.f15405a;
                }
                ?? r43 = arrayList3;
                k510 k510Var = v410Var.p;
                if (k510Var != null) {
                    String str15 = k510Var.f17697a;
                    if (str15 == null) {
                        str15 = "";
                    }
                    h510Var = new h510(str15, lmc.E(k510Var.b));
                } else {
                    h510Var = new h510("", "");
                }
                h510 h510Var2 = h510Var;
                c510 c510Var = v410Var.q;
                List listY = c510Var != null ? ydx.Y(c510Var) : null;
                if (listY == null) {
                    listY = iun.f15405a;
                }
                List list6 = listY;
                c510 c510Var2 = v410Var.r;
                List listY2 = c510Var2 != null ? ydx.Y(c510Var2) : null;
                if (listY2 == null) {
                    listY2 = iun.f15405a;
                }
                arrayList4.add(new s410(jLongValue3, str8, strE2, str10, strE3, str12, iIntValue11, iIntValue12, iIntValue13, iIntValue14, iIntValue15, iIntValue16, iIntValue17, r42, r43, h510Var2, list6, listY2));
                it = it;
                r7 = r7;
            }
            list = arrayList4;
            r6 = r7;
        } else {
            list = null;
            r6 = arrayList;
        }
        ?? r47 = r6;
        if (list == null) {
            list = iun.f15405a;
        }
        return new n410(jLongValue, jLongValue2, str2, strE, zBooleanValue, str4, iIntValue, iIntValue2, iIntValue3, iIntValue4, iIntValue5, iIntValue6, iIntValue7, iIntValue8, iIntValue9, iIntValue10, r47, list);
    }

    public static final vr20 M(ig7 ig7Var, int i, boolean z, long j, String str, long j2, List list, List list2, boolean z2, String str2, long j3, boolean z3, boolean z4) {
        Object next;
        String strA;
        long j4;
        ur20 ur20Var;
        Object next2;
        ig7Var.getClass();
        rh7 rh7Var = ig7Var.k;
        long j5 = ig7Var.b;
        list.getClass();
        list2.getClass();
        str2.getClass();
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((ueo) next).f35538a != j5);
        ueo ueoVar = (ueo) next;
        int i2 = ueoVar != null ? ueoVar.c : 0;
        double d = ig7Var.f;
        if (j5 == 707) {
            strA = str2;
        } else {
            String str3 = ueoVar != null ? ueoVar.b : null;
            if (str3 == null) {
                str3 = "";
            }
            String str4 = str3;
            afo afoVar = ig7Var.q;
            strA = dii0.a(str4, afoVar.f788a, afoVar.b, Integer.valueOf(i2), z2, kotlin.text.b.h(String.valueOf(d)), rh7Var.b, Long.valueOf(j2), ueoVar != null ? ueoVar.f35538a : 0L, nt20.c, z3, z4);
        }
        long j6 = ig7Var.b;
        double d2 = ig7Var.d;
        double d3 = ig7Var.f;
        String str5 = ig7Var.g;
        boolean z5 = ig7Var.h;
        String str6 = ig7Var.i;
        String str7 = ig7Var.j;
        if (list2.isEmpty()) {
            j4 = j6;
            ur20Var = ur20.f36144a;
        } else {
            Iterator it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    j4 = j6;
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                vr20 vr20Var = (vr20) next2;
                j4 = j6;
                if (vr20Var.c == ig7Var.c && vr20Var.b == j5 && vr20Var.m.f30476a == rh7Var.f30476a && vr20Var.f == d) {
                    break;
                }
                j6 = j4;
            }
            vr20 vr20Var2 = (vr20) next2;
            Double dValueOf = vr20Var2 != null ? Double.valueOf(vr20Var2.d) : null;
            if (dValueOf != null) {
                double dDoubleValue = dValueOf.doubleValue();
                double d4 = ig7Var.d;
                if (dDoubleValue > d4) {
                    ur20Var = ur20.c;
                } else {
                    ur20Var = dDoubleValue < d4 ? ur20.b : ur20.f36144a;
                }
            } else {
                ur20Var = ur20.f36144a;
            }
        }
        return new vr20(i, j4, j, d2, j3, d3, str5, z5, str6, str7, str, strA, rh7Var, ur20Var, z ? uoy.LIVE : uoy.LINE, ig7Var.m, i2, yfa0.INSTANCE, ig7Var.o, ig7Var.p);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x003f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0083  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v5 */
    public static final h8a0 N(k8a0 k8a0Var) {
        b9a0 b9a0VarS;
        ufp0 ufp0Var;
        List<h040> list;
        Integer num;
        Object next;
        Long l;
        Object next2;
        d8a0 d8a0Var = k8a0Var.d;
        ?? arrayList = 0;
        arrayList = 0;
        String str = d8a0Var != null ? d8a0Var.f5638a : null;
        String str2 = str == null ? "" : str;
        List list2 = k8a0Var.b;
        if (list2 != null) {
            Iterator it = list2.iterator();
            do {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it.next();
            } while (!Intrinsics.d(((haa0) next2).f12715a, d8a0Var != null ? d8a0Var.f5638a : null));
            haa0 haa0Var = (haa0) next2;
            if (haa0Var != null) {
                b9a0VarS = q0x.S(haa0Var);
            } else {
                b9a0VarS = b9a0.g;
            }
        } else {
            b9a0VarS = b9a0.g;
        }
        b9a0 b9a0Var = b9a0VarS;
        znq0 znq0Var = new znq0((d8a0Var == null || (l = d8a0Var.b) == null) ? -1L : l.longValue());
        List list3 = k8a0Var.f17864a;
        if (list3 != null) {
            Iterator it2 = list3.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!Intrinsics.d(((gip0) next).f11360a, d8a0Var != null ? d8a0Var.c : null));
            gip0 gip0Var = (gip0) next;
            if (gip0Var != null) {
                ufp0Var = dnm0.q(gip0Var);
            } else {
                ufp0Var = new ufp0(0, "", "", "", iun.f15405a);
            }
        } else {
            ufp0Var = new ufp0(0, "", "", "", iun.f15405a);
        }
        int iIntValue = (d8a0Var == null || (num = d8a0Var.d) == null) ? -1 : num.intValue();
        String str3 = d8a0Var != null ? d8a0Var.e : null;
        String str4 = str3 == null ? "" : str3;
        if (d8a0Var != null && (list = d8a0Var.f) != null) {
            arrayList = new ArrayList(r3d.q(list, 10));
            for (h040 h040Var : list) {
                h040Var.getClass();
                String str5 = h040Var.b;
                if (str5 == null) {
                    str5 = "";
                }
                Integer num2 = h040Var.f12215a;
                arrayList.add(new f8a0(str5, num2 != null ? num2.intValue() : 0));
            }
        }
        if (arrayList == 0) {
            arrayList = iun.f15405a;
        }
        return new h8a0(str2, b9a0Var, znq0Var, ufp0Var, iIntValue, str4, arrayList);
    }

    public static final dxh0 O(zvh0 zvh0Var) {
        zvh0Var.getClass();
        int iOrdinal = zvh0Var.ordinal();
        if (iOrdinal == 0) {
            return axh0.f1625a;
        }
        if (iOrdinal == 1) {
            return zwh0.f45106a;
        }
        if (iOrdinal == 2) {
            return cxh0.f5122a;
        }
        if (iOrdinal == 3) {
            return bxh0.f3376a;
        }
        t9f.b();
        return null;
    }

    public static final v5l0 P(oho ohoVar, sff0 sff0Var) {
        ohoVar.getClass();
        int iOrdinal = ohoVar.ordinal();
        if (iOrdinal == 0) {
            return v5l0.LARGE_CARD_LARGE_SPORT_ICON;
        }
        if (iOrdinal == 1) {
            return v5l0.LARGE_CARD_WATERMARK;
        }
        if (iOrdinal == 2) {
            return v5l0.LARGE_CARD_LARGE_TEAM_LOGO;
        }
        if (iOrdinal == 3) {
            return v5l0.MEDIUM_CARD_SMALL_TEAM_LOGO;
        }
        if (iOrdinal == 4) {
            return v5l0.SMALL_CARD_NO_TEAM_LOGO;
        }
        if (iOrdinal == 5) {
            return sff0Var.g.y;
        }
        t9f.b();
        return null;
    }

    public static final boolean Q(String str, String str2) {
        str.getClass();
        str2.getClass();
        if (str.equals(kotlin.text.c.r(str2, Separators.QUESTION, "", false))) {
            return true;
        }
        if (kotlin.text.c.n(str2, Separators.QUESTION, false) && str.concat(Separators.QUESTION).equals(str2)) {
            return true;
        }
        StringBuilder sb = new StringBuilder(Separators.LPAREN);
        sb.append(str);
        sb.append(")?");
        return sb.toString().equals(str2);
    }

    public static final void a(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(-167159034);
        int i2 = i | 6;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(o7k0.e(jm40Var, 36.0f), 1.0f);
            tj30 tj30VarC = zq8.c(gqw0.d, false);
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
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            mm40 mm40VarD2 = o7k0.d(o7k0.s(o7k0.e(s5x0.N(jm40Var, 16.0f, 0.0f, 0.0f, 0.0f, 14), 14.0f), 160.0f), 1.0f);
            zcl zclVar2 = qmk.m;
            ugg0 ugg0Var = vgg0.f37379a;
            dw9.x(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarD2), vbc.d0(null, fetVar, 0, 1), fetVar, 0, true);
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mp50(mm40Var, i, (byte) 29);
        }
    }

    public static final void b(int i, fet fetVar, mm40 mm40Var, l7m0 l7m0Var) {
        int i2;
        l7m0Var.getClass();
        fetVar.g0(-640137541);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (fetVar.g(l7m0Var) ? 32 : 16);
        byte b = 1;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            boolean z = (i3 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new ufp(l7m0Var, (byte) 10);
                fetVar.o0(objP);
            }
            p8a.k(mm40Var, (Function1) objP, fetVar, i3 & 14);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new udx(mm40Var, l7m0Var, i, b);
        }
    }

    public static final void c(mm40 mm40Var, m3w m3wVar, fet fetVar, int i) {
        m3wVar.getClass();
        fetVar.g0(-820277456);
        byte b = 2;
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(m3wVar) ? 32 : 16);
        byte b2 = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            boolean zG = fetVar.g(m3wVar.f21138a);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                objP = new ugd(-2142314336, true, new ebd(m3wVar, b));
                fetVar.o0(objP);
            }
            hmw0.j(mm40VarD, (Function2) objP, u1c.M(-922250049, new ebd(m3wVar, (byte) 3), fetVar), fetVar, 384);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fbd(mm40Var, m3wVar, i, b2);
        }
    }

    public static final void d(int i, ugd ugdVar, ugd ugdVar2, ugd ugdVar3, xdr xdrVar, fet fetVar, mm40 mm40Var) {
        fetVar.g0(-448002597);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.i(xdrVar) ? 2048 : 1024);
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            WeakHashMap weakHashMap = djv0.w;
            q33 q33Var = zcm0.i(fetVar).f;
            zfn zfnVar = bmd.h;
            int i3 = q33Var.e().b;
            w6k w6kVar = (w6k) fetVar.k(zfnVar);
            zcl zclVar = qmk.f28987a;
            int iT = w6kVar.T(8.0f);
            boolean zE = fetVar.e(i3);
            Object objP = fetVar.P();
            if (zE || objP == ukd.f35823a) {
                objP = new eam(i3, iT, b);
                fetVar.o0(objP);
            }
            tj30 tj30Var = (tj30) objP;
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
            jpm0.o(fetVar, tj30Var, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            jm40 jm40Var = jm40.b;
            ugdVar.F(mrv.k0(jm40Var, "TOOLBAR_ID"), fetVar, 54);
            ugdVar2.F(mrv.k0(jm40Var, "MARKETS_ID"), fetVar, 54);
            if (xdrVar == null) {
                fetVar.e0(2044452015);
                fetVar.r(false);
            } else {
                fetVar.e0(1174328722);
                w6x.v(((i2 >> 6) & 112) | 6, xdrVar, mrv.k0(jm40Var, "MARKETS_SETTINGS_ID"), fetVar, false);
            }
            ugdVar3.F(mrv.k0(jm40Var, "BOTTOM_BAR_ID"), fetVar, 54);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new a330(mm40Var, ugdVar, ugdVar2, xdrVar, ugdVar3, i);
        }
    }

    public static final void e(mm40 mm40Var, wj40 wj40Var, fet fetVar, int i) {
        fetVar.g0(-1609769069);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(wj40Var) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            r7x.C(fetVar).b(wj40Var.f39246a, u1c.M(-498458606, new pi40(wj40Var), fetVar), fetVar, 48);
            mm40Var = jm40.b;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dlw(mm40Var, wj40Var, i, (byte) 21);
        }
    }

    public static final void f(int i, fet fetVar) {
        fetVar.g0(-1758604339);
        final byte b = 1;
        final byte b2 = 0;
        if (fetVar.U(i & 1, i != 0)) {
            String name = kmi.class.getName();
            androidx.compose.runtime.d dVar = dy2.b;
            Context applicationContext = ((Context) fetVar.k(dVar)).getApplicationContext();
            Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
            if (application == null) {
                throw new ss3((byte) 0);
            }
            riu0 riu0VarA = ms00.a(fetVar);
            if (riu0VarA == null) {
                throw new tiu0();
            }
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = new yfc(application, b);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean zG = fetVar.g(riu0VarA) | fetVar.g(name);
            Object objP2 = fetVar.P();
            if (zG || objP2 == obj) {
                ojg ojgVar = new ojg((byte) 1);
                zfc zfcVar = new zfc(function0, (byte) 4);
                tre0 tre0Var = sre0.f32672a;
                ojgVar.a(tre0Var.b(kgd.class), zfcVar);
                qbx qbxVarB = ojgVar.b();
                piu0 piu0VarG = riu0VarA.g();
                vbf vbfVar = vbf.b;
                piu0VarG.getClass();
                vbfVar.getClass();
                objP2 = (kgd) new h0q0(piu0VarG, qbxVarB, vbfVar).t(tre0Var.b(kgd.class), name);
                fetVar.o0(objP2);
            }
            Object obj2 = ((kgd) objP2).b;
            if (obj2 == null) {
                hny.u("null cannot be cast to non-null type org.xplatform.feed.di.onboarding.OnboardingScreenComponent");
                return;
            }
            sgy sgyVarB = sre0.f32672a.b(gl60.class);
            q0h0 q0h0Var = new q0h0((jmi) ((kmi) obj2).l.get());
            int i2 = gl60.z;
            final i3t0 i3t0Var = (i3t0) n4c.X(sgyVarB, null, q0h0Var, fetVar, 14);
            pz40 pz40VarY = i3t0Var.y(fetVar);
            final xkb0 xkb0Var = ((vk60) pz40VarY.getValue()).f37559a;
            ak60 ak60Var = ((vk60) pz40VarY.getValue()).b;
            clz clzVar = (clz) fetVar.k(or00.f25714a);
            pz40 pz40VarF = ydx.F(vtb.N(clzVar.x().j), fetVar);
            if (xkb0Var == null || ak60Var == null) {
                yfe0 yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new rj50(i, (byte) 24);
                    return;
                }
                return;
            }
            Object obj3 = (Activity) fetVar.k(cr00.f4820a);
            Object obj4 = (Context) fetVar.k(dVar);
            boolean zI = fetVar.i(obj3) | fetVar.i(obj4) | fetVar.i(clzVar);
            Object objP3 = fetVar.P();
            if (zI || objP3 == obj) {
                objP3 = new jl40(obj3, (Object) clzVar, obj4, (byte) 12);
                fetVar.o0(objP3);
            }
            m0x0.o(obj3, (Function1) objP3, fetVar);
            boolean zG2 = fetVar.g(ak60Var) | fetVar.i(xkb0Var) | fetVar.i(i3t0Var);
            Object objP4 = fetVar.P();
            if (zG2 || objP4 == obj) {
                objP4 = new ck60(ak60Var, xkb0Var, i3t0Var, b2);
                fetVar.o0(objP4);
            }
            Function0 function1 = (Function0) objP4;
            boolean zI2 = fetVar.i(i3t0Var) | fetVar.i(xkb0Var);
            Object objP5 = fetVar.P();
            if (zI2 || objP5 == obj) {
                objP5 = new Function0() { // from class: a.dk60
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        byte b3 = b2;
                        xkb0 xkb0Var2 = xkb0Var;
                        i3t0 i3t0Var2 = i3t0Var;
                        switch (b3) {
                            case 0:
                                i3t0Var2.x(new uh60(new xu9(xkb0Var2.a())));
                                break;
                            default:
                                i3t0Var2.x(new uh60(new xu9(xkb0Var2.a())));
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                fetVar.o0(objP5);
            }
            Function0 function2 = (Function0) objP5;
            boolean zI3 = fetVar.i(i3t0Var) | fetVar.g(ak60Var);
            Object objP6 = fetVar.P();
            if (zI3 || objP6 == obj) {
                objP6 = new a540((Object) i3t0Var, (Object) ak60Var, (byte) 18);
                fetVar.o0(objP6);
            }
            ccq0.G(null, ak60Var, function1, function2, (Function0) objP6, fetVar, 0);
            fetVar.b0(-2096511567, (lkz) pz40VarF.getValue());
            if (((lkz) pz40VarF.getValue()).compareTo(lkz.e) >= 0) {
                fetVar.e0(-567267636);
                boolean zI4 = fetVar.i(i3t0Var) | fetVar.i(xkb0Var);
                Object objP7 = fetVar.P();
                if (zI4 || objP7 == obj) {
                    objP7 = new Function0() { // from class: a.dk60
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            byte b3 = b;
                            xkb0 xkb0Var2 = xkb0Var;
                            i3t0 i3t0Var2 = i3t0Var;
                            switch (b3) {
                                case 0:
                                    i3t0Var2.x(new uh60(new xu9(xkb0Var2.a())));
                                    break;
                                default:
                                    i3t0Var2.x(new uh60(new xu9(xkb0Var2.a())));
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                    fetVar.o0(objP7);
                }
                knx.i(false, (Function0) objP7, fetVar, 0, 1);
                fetVar.r(false);
            } else {
                fetVar.e0(-567012971);
                fetVar.r(false);
            }
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU2 = fetVar.u();
        if (yfe0VarU2 != null) {
            yfe0VarU2.d = new rj50(i, (byte) 25);
        }
    }

    public static final void g(mm40 mm40Var, p090 p090Var, Function1 function1, fet fetVar, int i) {
        p090Var.getClass();
        function1.getClass();
        fetVar.g0(-187183026);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(p090Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            String str = p090Var.f26138a;
            a4x a4xVar = p090Var.b;
            wmm wmmVar = new wmm();
            pz40 pz40VarF = androidx.compose.runtime.e.f(Boolean.valueOf(p090Var.c), fetVar);
            boolean z = (i2 & 896) == 256;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new qu80(function1, (byte) 7);
                fetVar.o0(objP);
            }
            vmm.b(mm40Var, str, a4xVar, wmmVar, pz40VarF, (Function0) objP, null, fetVar, i2 & 14);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o090(mm40Var, p090Var, function1, i, (byte) 0);
        }
    }

    public static final void h(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(2022989773);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            Object objP = fetVar.P();
            byte b = 3;
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = q3d.j(ju70.e, ju70.f, ju70.g);
                fetVar.o0(objP);
            }
            List list = (List) objP;
            boolean zI = fetVar.i(list);
            Object objP2 = fetVar.P();
            if (zI || objP2 == obj) {
                objP2 = new kv80(list, b);
                fetVar.o0(objP2);
            }
            x4n0.a(mm40Var, (Function2) objP2, fetVar, i2 & 14, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mp50(mm40Var, i, (byte) 17);
        }
    }

    public static final void i(String str, fet fetVar, int i) {
        str.getClass();
        fetVar.g0(-1554284633);
        int i2 = (fetVar.g(str) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            StaticColors staticColors = StaticColors.INSTANCE;
            long jM126getWhite200d7_KjU = staticColors.m126getWhite200d7_KjU();
            pge pgeVar = gqw0.A;
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = o7k0.e(o7k0.d(s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), 1.0f), 36.0f);
            long j = kkg.j;
            zcl zclVar2 = qmk.e;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarJ = s5x0.J(i120.Q(mm40VarE, j, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 4.0f);
            zcl zclVar3 = qmk.c;
            lgb.v(h97.e(zclVar3, zclVar3, zclVar3, zclVar3, mm40VarJ), s5x0.K(i120.Q(s5x0.J(i120.Q(o7k0.e(o7k0.d(s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), 1.0f), 36.0f), j, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 4.0f), staticColors.m73getBlack400d7_KjU(), new ugg0(zclVar3, zclVar3, zclVar3, zclVar3)), 18.0f, 6.0f), str, R.drawable.ic_sport_color_dota_97, jM126getWhite200d7_KjU, pgeVar, fetVar, 196608 | ((i2 << 6) & 896), 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yh20((byte) 12, i, str);
        }
    }

    public static final void j(a4x a4xVar, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        a4xVar.getClass();
        fetVar2.g0(-1393617008);
        int i2 = i | (fetVar2.g(a4xVar) ? 4 : 2);
        if (fetVar2.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarW = o7k0.w(o7k0.s(jm40.b, 60.0f), null, false, 3);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarW);
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
            v8q0.a(rsm0.w(R.string.the_international_hero, 0, fetVar2), o2e.e0(new wkw(gqw0.n), "PLAYERS_ABILITIES_HERO"), StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109), fetVar, 0, 24960, 109560);
            fetVar2 = fetVar;
            fetVar2.e0(-1751008615);
            Iterator<E> it = a4xVar.iterator();
            while (it.hasNext()) {
                i((String) it.next(), fetVar2, 0);
            }
            fetVar2.r(false);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eup(a4xVar, i, (byte) 19);
        }
    }

    public static final void k(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(370892347);
        int i2 = i | 6;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            zq8.a(0, fetVar, xbc.c0(lgb.J(o7k0.d(o7k0.e(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 12.0f, 7), 286.0f), 1.0f), vgg0.a(16.0f)), vbc.d0(null, fetVar, 0, 1)));
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mp50(mm40Var, i, (byte) 24);
        }
    }

    public static final void l(mm40 mm40Var, fqj0 fqj0Var, fet fetVar, int i) {
        fqj0Var.getClass();
        fetVar.g0(-910414183);
        int i2 = i | 6 | (fetVar.g(fqj0Var) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarD, 8.0f, 8.0f, 8.0f, 0.0f, 8);
            pz40 pz40Var = s6t0.f31722a;
            long backgroundContent = s6t0.b().f33626a.getBackgroundContent();
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarJ = s5x0.J(i120.Q(mm40VarN, backgroundContent, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 16.0f);
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
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, o7k0.e(o7k0.s(jm40Var, 214.0f), 16.0f)), fqj0Var));
            dw9.x(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, o7k0.e(o7k0.s(s5x0.N(jm40Var, 0.0f, 12.0f, 0.0f, 0.0f, 13), 124.0f), 16.0f)), fqj0Var, fetVar, 0, true);
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new buv(mm40Var, fqj0Var, i, (byte) 2);
        }
    }

    public static final void m(jjl jjlVar, gjl gjlVar, Function0 function0, Function0 function1, Function0 function2, fet fetVar, int i) {
        int i2;
        long backgroundContent;
        long jM75getBlack600d7_KjU;
        long jM123getWhite0d7_KjU;
        Object objE;
        long jM123getWhite0d7_KjU2;
        long jM123getWhite0d7_KjU3;
        fet fetVar2 = fetVar;
        jjlVar.getClass();
        y3d y3dVar = jjlVar.e;
        gjlVar.getClass();
        function0.getClass();
        function1.getClass();
        function2.getClass();
        fetVar2.g0(-2009927652);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(jjlVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.e(gjlVar.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.i(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar2.i(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar2.i(function2) ? 16384 : 8192;
        }
        if (fetVar2.U(i2 & 1, (i2 & 9363) != 9362)) {
            boolean z = fetVar2.k(bmd.n) == k6z.b;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.a(0.0f);
                fetVar2.o0(objP);
            }
            agk0 agk0Var = (agk0) objP;
            boolean z2 = z;
            l7m0 l7m0VarB = d43.b(agk0Var.l(), ro4.m0(Response.BAD_REQUEST, 0, new zsf(0.0f, 0.0f, 0.5f, 1.0f), 2), null, null, fetVar2, 48, 28);
            float fFloatValue = z2 ? -((Number) l7m0VarB.getValue()).floatValue() : ((Number) l7m0VarB.getValue()).floatValue();
            boolean zH = fetVar2.h(z2);
            Object objP2 = fetVar2.P();
            if (zH || objP2 == cl5Var) {
                objP2 = androidx.compose.runtime.e.b(z2 ? R.drawable.ic_glyph_reload_rtl : R.drawable.ic_glyph_reload);
                fetVar2.o0(objP2);
            }
            cgk0 cgk0Var = (cgk0) objP2;
            String str = jjlVar.c;
            boolean zG = fetVar2.g(y3dVar);
            Object objP3 = fetVar2.P();
            if (zG || objP3 == cl5Var) {
                if (y3dVar != null) {
                    backgroundContent = y3dVar.f41946a;
                } else {
                    pz40 pz40Var = s6t0.f31722a;
                    backgroundContent = s6t0.b().f33626a.getBackgroundContent();
                }
                objP3 = dw9.e(backgroundContent, fetVar2);
            }
            long j = ((y3d) objP3).f41946a;
            int i3 = i2 & 112;
            boolean z3 = i3 == 32;
            Object objP4 = fetVar2.P();
            if (z3 || objP4 == cl5Var) {
                if (gjlVar == gjl.f11403a) {
                    pz40 pz40Var2 = s6t0.f31722a;
                    jM75getBlack600d7_KjU = s6t0.b().f33626a.getBackground();
                } else {
                    pz40 pz40Var3 = s6t0.f31722a;
                    jM75getBlack600d7_KjU = StaticColors.INSTANCE.m75getBlack600d7_KjU();
                }
                objP4 = dw9.e(jM75getBlack600d7_KjU, fetVar2);
            }
            long j2 = ((y3d) objP4).f41946a;
            boolean z4 = i3 == 32;
            Object objP5 = fetVar2.P();
            if (z4 || objP5 == cl5Var) {
                if (gjlVar == gjl.f11403a) {
                    pz40 pz40Var4 = s6t0.f31722a;
                    jM123getWhite0d7_KjU = s6t0.b().f33626a.getPrimary();
                } else {
                    pz40 pz40Var5 = s6t0.f31722a;
                    jM123getWhite0d7_KjU = StaticColors.INSTANCE.m123getWhite0d7_KjU();
                }
                objE = dw9.e(jM123getWhite0d7_KjU, fetVar2);
            } else {
                objE = objP5;
            }
            long j3 = ((y3d) objE).f41946a;
            boolean z5 = i3 == 32;
            Object objP6 = fetVar2.P();
            if (z5 || objP6 == cl5Var) {
                if (gjlVar == gjl.f11403a) {
                    pz40 pz40Var6 = s6t0.f31722a;
                    jM123getWhite0d7_KjU2 = s6t0.b().f33626a.getSecondary();
                } else {
                    pz40 pz40Var7 = s6t0.f31722a;
                    jM123getWhite0d7_KjU2 = StaticColors.INSTANCE.m123getWhite0d7_KjU();
                }
                objP6 = dw9.e(jM123getWhite0d7_KjU2, fetVar2);
            }
            long j4 = ((y3d) objP6).f41946a;
            boolean z6 = i3 == 32;
            Object objP7 = fetVar2.P();
            if (z6 || objP7 == cl5Var) {
                if (gjlVar == gjl.f11403a) {
                    pz40 pz40Var8 = s6t0.f31722a;
                    jM123getWhite0d7_KjU3 = s6t0.b().f33626a.getTextPrimary();
                } else {
                    pz40 pz40Var9 = s6t0.f31722a;
                    jM123getWhite0d7_KjU3 = StaticColors.INSTANCE.m123getWhite0d7_KjU();
                }
                objP7 = dw9.e(jM123getWhite0d7_KjU3, fetVar2);
            }
            long j5 = ((y3d) objP7).f41946a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarQ = i120.Q(o7k0.d(jm40Var, 1.0f), j, jd8.n);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarK = s5x0.K(mm40VarQ, 16.0f, 8.0f);
            yx7 yx7Var = gqw0.k;
            lw3 lw3Var = uc9.f35418a;
            thg0 thg0VarA = shg0.a(lw3Var, yx7Var, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarK);
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
            mm40 mm40VarQ2 = i120.Q(s5x0.N(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 0.0f, 8.0f, 8.0f, 8.0f, 1), j2, vgg0.a(10.0f));
            thg0 thg0VarA2 = shg0.a(lw3Var, yx7Var, fetVar2, 48);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarQ2);
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
            w9x.l(48.0f, 60.0f, u1c.M(1823402174, new lkd0(function0, agk0Var, fFloatValue, j3, cgk0Var, (byte) 0), fetVar2), fetVar, 384, 0);
            fetVar2 = fetVar;
            w9x.l(48.0f, 0.0f, u1c.M(-1131511705, new mkd0(function1, jjlVar, j5, j4, (byte) 0), fetVar), fetVar2, 384, 2);
            fetVar2.r(true);
            if (str != null) {
                fetVar2.e0(-270804938);
                qzb.n(ig.a(fetVar2, o7k0.u(o7k0.e(jm40Var, 32.0f), 0.0f, 160.0f, 1)), new wul(iul.e, oe9.b, new ue9(str), true, false, false), function2, fetVar2, (i2 >> 6) & 896, 0);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-270170678);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yhq(jjlVar, gjlVar, function0, function1, function2, i, (byte) 2);
        }
    }

    public static final void n(mm40 mm40Var, Function2 function2, Function2 function3, fet fetVar, int i) {
        mm40 mm40Var2;
        function2.getClass();
        function3.getClass();
        fetVar.g0(690636066);
        int i2 = i | 6 | (fetVar.i(function2) ? 32 : 16) | (fetVar.i(function3) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = mu90.f;
                fetVar.o0(objP);
            }
            tj30 tj30Var = (tj30) objP;
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
            jpm0.o(fetVar, tj30Var, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            function2.invoke(fetVar, Integer.valueOf((i2 >> 3) & 14));
            h97.q((i2 >> 6) & 14, fetVar, function3, true);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rwc0(mm40Var2, function2, function3, i, (byte) 24);
        }
    }

    public static final void o(int i, fet fetVar, mm40 mm40Var, String str, String str2) {
        str.getClass();
        str2.getClass();
        fetVar.g0(-1330919650);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(str) ? 32 : 16) | (fetVar.g(str2) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            x5d x5dVarA = w5d.a(uc9.e, gqw0.o, fetVar, 54);
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
            u(i2 & 112, 0, fetVar, s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 8.0f, 7), str);
            u((i2 >> 3) & 112, 1, fetVar, null, str2);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new man(mm40Var, str, str2, i, (byte) 20);
        }
    }

    public static final void p(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(1240629909);
        int i2 = i | 6;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
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
            a(0, fetVar, null);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarD = o7k0.d(o7k0.e(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 12.0f, 7), 132.0f), 1.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            dw9.x(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarD), vbc.d0(null, fetVar, 0, 1), fetVar, 0, true);
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mp50(mm40Var, i, (byte) 27);
        }
    }

    public static final void q(int i, int i2, fet fetVar, mm40 mm40Var) {
        wui0 wui0Var;
        fetVar.g0(-1105824104);
        int i3 = (fetVar.e(i) ? 32 : 16) | i2;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar, 48);
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
            fetVar.e0(-198627085);
            int i4 = 0;
            while (i4 < i) {
                mm40 mm40VarD2 = o7k0.d(jm40.b, 1.0f);
                if (i4 == 0 && i == 1) {
                    wui0Var = wui0.f39793a;
                } else if (i4 == 0) {
                    wui0Var = wui0.b;
                } else {
                    wui0Var = i4 == i + (-1) ? wui0.d : wui0.c;
                }
                g7x.n(mm40VarD2, wui0Var, fetVar, 6);
                i4++;
            }
            fetVar.r(false);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new v2w(mm40Var, i, i2, (byte) 10);
        }
    }

    public static final void r(final zdj0 zdj0Var, final Function1 function1, fet fetVar, int i) {
        zdj0Var.getClass();
        function1.getClass();
        fetVar.g0(-899488615);
        int i2 = (fetVar.g(zdj0Var) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        final byte b = 0;
        final byte b2 = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(s5x0.N(jm40.b, 0.0f, 8.0f, 0.0f, 0.0f, 13), 60.0f);
            String title = zdj0Var.getTitle();
            zfn zfnVar = zaq0.b;
            rqm rqmVar = new rqm((vui0) new tui0(title, new y3d(((ThemeColors) fetVar.k(zfnVar)).getTextPrimary())), (pui0) new nui0(Integer.valueOf(zdj0Var.b()), null, new m0x(zdj0Var.b(), null, 6), new y3d(((ThemeColors) fetVar.k(zfnVar)).getPrimary()), null, null, 0.0f, 242), (pvi0) new ovi0(zdj0Var.x()), (d4d) null, (tvi0) null, (wui0) null, false, (e900) null, Response.SERVER_TIMEOUT);
            int i3 = i2 & 14;
            int i4 = i2 & 112;
            boolean z = (i3 == 4) | (i4 == 32);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new Function0() { // from class: a.aej0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (b) {
                            case 0:
                                xdx.F(zdj0Var, function1);
                                break;
                            default:
                                xdx.F(zdj0Var, function1);
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            int i5 = (i3 == 4 ? (byte) 1 : (byte) 0) | (i4 == 32 ? (byte) 1 : (byte) 0);
            Object objP2 = fetVar.P();
            if (i5 != 0 || objP2 == cl5Var) {
                objP2 = new Function0() { // from class: a.aej0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (b2) {
                            case 0:
                                xdx.F(zdj0Var, function1);
                                break;
                            default:
                                xdx.F(zdj0Var, function1);
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                fetVar.o0(objP2);
            }
            obc.q(mm40VarE, rqmVar, false, null, null, function0, (Function0) objP2, null, fetVar, 0, 156);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kqh0((Object) zdj0Var, function1, i, (byte) 18);
        }
    }

    public static final void s(int i, fet fetVar, mm40 mm40Var, boolean z, boolean z2) {
        fetVar.g0(1484443584);
        int i2 = (fetVar.h(z) ? 4 : 2) | i | (fetVar.h(z2) ? 32 : 16) | (fetVar.g(mm40Var) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarD, 12.0f, 0.0f, 0.0f, 0.0f, 14);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarN);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z3 = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z3) {
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
            mm40 mm40VarL = s5x0.L(jm40Var, 0.0f, 10.0f, 1);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
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
            mm40 mm40VarN2 = o7k0.n(s5x0.N(jm40Var, 0.0f, 0.0f, 12.0f, 0.0f, 11), 40.0f);
            zfn zfnVar = zaq0.b;
            long secondary20 = ((ThemeColors) fetVar.k(zfnVar)).getSecondary20();
            zcl zclVar2 = qmk.m;
            ugg0 ugg0Var = vgg0.f37379a;
            qxw.o(fetVar, pkd.l(mm40VarN2, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2), secondary20, fetVar, 0));
            mm40 mm40VarS = o7k0.s(o7k0.e(jm40Var, 16.0f), z2 ? 128.0f : 96.0f);
            long secondary21 = ((ThemeColors) fetVar.k(zfnVar)).getSecondary20();
            zcl zclVar3 = qmk.e;
            qxw.o(fetVar, pkd.l(mm40VarS, new ugg0(zclVar3, zclVar3, zclVar3, zclVar3), secondary21, fetVar, 0));
            fetVar.r(true);
            if (z) {
                fetVar.e0(-292454577);
                jcb.v(s5x0.N(jm40Var, 52.0f, 0.0f, 0.0f, 0.0f, 14), 1.0f, ((ThemeColors) fetVar.k(zfnVar)).getSeparator60(), fetVar, 0, 0);
                fetVar.r(false);
            } else {
                fetVar.e0(-292242196);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new z360(z, z2, mm40Var, i);
        }
    }

    public static final void t(mm40 mm40Var, n5h0 n5h0Var, int i, fet fetVar, int i2) {
        int i3;
        int i4;
        fetVar.g0(-426548530);
        int i5 = (fetVar.g(mm40Var) ? 4 : 2) | i2 | (fetVar.g(n5h0Var) ? 32 : 16) | 1408;
        if (fetVar.U(i5 & 1, (i5 & 1171) != 1170)) {
            fetVar.Z();
            if ((i2 & 1) == 0 || fetVar.B()) {
                i4 = i5 & (-7169);
                i3 = 2132019818;
            } else {
                fetVar.X();
                i4 = i5 & (-7169);
                i3 = i;
            }
            fetVar.s();
            boolean zE = fetVar.e(i3);
            Object objP = fetVar.P();
            byte b = 5;
            cl5 cl5Var = ukd.f35823a;
            if (zE || objP == cl5Var) {
                objP = new uli0(i3, b);
                fetVar.o0(objP);
            }
            Function1 function1 = (Function1) objP;
            boolean z = (i4 & 112) == 32;
            Object objP2 = fetVar.P();
            if (z || objP2 == cl5Var) {
                objP2 = new j1l0(n5h0Var, b);
                fetVar.o0(objP2);
            }
            dwi0.b(function1, mm40Var, (Function1) objP2, fetVar, (i4 << 3) & 112, 0);
        } else {
            fetVar.X();
            i3 = i;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o1l0(mm40Var, n5h0Var, i3, i2);
        }
    }

    public static final void u(int i, int i2, fet fetVar, mm40 mm40Var, String str) {
        int i3;
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(733801384);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | (fetVar.g(mm40Var) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= fetVar2.g(str) ? 32 : 16;
        }
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40Var3 = i4 != 0 ? jm40Var : mm40Var;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarP = o7k0.p(mm40Var3, 40.0f, 32.0f);
            StaticColors staticColors = StaticColors.INSTANCE;
            long jM73getBlack400d7_KjU = staticColors.m73getBlack400d7_KjU();
            zcl zclVar2 = qmk.e;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(mm40VarP, jM73getBlack400d7_KjU, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2));
            tj30 tj30VarC = zq8.c(gqw0.e, false);
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
            jpm0.o(fetVar2, tj30VarC, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            long j = qmk.u;
            v8q0.a(str, o2e.e0(jm40Var, "FifaTeamScoreTestTag"), staticColors.m123getWhite0d7_KjU(), null, j, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, new y9q0(0L, j, null, j1t0.f15753a, 0L, null, 0, 0, qmk.H, 16646109), fetVar2, ((i3 >> 3) & 14) | 48, 24960, 109544);
            fetVar2 = fetVar2;
            fetVar2.r(true);
            mm40Var2 = mm40Var3;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zw(mm40Var2, str, i, i2, (byte) 6);
        }
    }

    public static final int v(long[] jArr, long j) {
        int length = jArr.length - 1;
        int i = 0;
        while (i <= length) {
            int i2 = (i + length) >>> 1;
            long j2 = jArr[i2];
            if (j > j2) {
                i = i2 + 1;
            } else {
                if (j >= j2) {
                    return i2;
                }
                length = i2 - 1;
            }
        }
        return -(i + 1);
    }

    public static final String w(double d, String str, hxu hxuVar, txu txuVar) {
        double d2;
        ivo0 ivo0Var;
        str.getClass();
        hxuVar.getClass();
        int i = cy7.f5159a;
        pn40 pn40Var = pn40.f27267a;
        double d3 = 0.0d;
        if (txuVar != null && !hxuVar.equals(hxu.h) && txuVar.g.b > 0.0d) {
            d2 = txuVar.h.b;
        } else if (hxuVar.equals(hxu.h)) {
            if (txuVar != null && (ivo0Var = txuVar.g) != null) {
                d3 = ivo0Var.b;
            }
            d2 = d + d3;
        } else {
            d2 = hxuVar.f.b;
        }
        return cy7.e(pn40.p(str, d2));
    }

    public static final HashSet x(Iterable iterable) {
        iterable.getClass();
        HashSet hashSet = new HashSet();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Set setE = ((cr30) it.next()).e();
            if (setE == null) {
                return null;
            }
            w3d.u(hashSet, setE);
        }
        return hashSet;
    }

    public static final ArrayList y(List list, List list2) {
        Object next;
        k0d k0dVar;
        List list3 = list;
        ArrayList arrayList = new ArrayList(r3d.q(list3, 10));
        Iterator it = list3.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next2 = it.next();
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            f280 f280Var = (f280) next2;
            Iterator it2 = list2.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (((nms) next).f23786a != f280Var.d.i);
            nms nmsVar = (nms) next;
            Integer numValueOf = nmsVar != null ? Integer.valueOf(nmsVar.f23786a) : null;
            v12 v12VarI0 = unh0.i0(i, list3);
            f280Var.getClass();
            int i3 = f280Var.f8801a;
            seo seoVar = f280Var.d;
            String strN = w6x.n(i3, i, BundleUtil.UNDERLINE_TAG);
            int i4 = f280Var.f8801a;
            String str = f280Var.c;
            String strN2 = str != null ? ohs0.n(ujn.h, str) : "";
            String str2 = seoVar.m;
            Iterator it3 = it;
            double d = seoVar.e;
            Double d2 = seoVar.f;
            String str3 = seoVar.g;
            if (seoVar.h) {
                k0dVar = k0d.b;
            } else if (d2 == null) {
                k0dVar = k0d.f17460a;
            } else if (d > d2.doubleValue()) {
                k0dVar = k0d.c;
            } else {
                k0dVar = d < d2.doubleValue() ? k0d.d : k0d.f17460a;
            }
            arrayList.add(new q380(strN, i4, strN2, new chl0(str2, str3, k0dVar, a65.f301a, seoVar.j, seoVar.k, false, false, new xgl0(-1L, 0.0d, 0.0d, "", 0, 0L, 0, 0L, false)), numValueOf, v12VarI0));
            list3 = list;
            it = it3;
            i = i2;
        }
        return arrayList;
    }

    public static final String z(twq twqVar) {
        twqVar.getClass();
        List<g950> listF = twq.f(twqVar);
        StringBuilder sb = new StringBuilder();
        for (g950 g950Var : listF) {
            if (sb.length() > 0) {
                sb.append(Separators.DOT);
            }
            sb.append(A(g950Var));
        }
        return sb.toString();
    }
}
