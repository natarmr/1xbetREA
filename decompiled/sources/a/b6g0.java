package a;

import android.gov.nist.core.Separators;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes6.dex */
public abstract class b6g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Regex f2053a = new Regex("\\(\\s*([^)]*?)\\s*\\)");
    public static final Regex b = new Regex("[,\\.;:!?…\\s]+$");

    public static final HashMap a(Map map) {
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            gst gstVar = w1w.f38420a;
            String str = (String) entry.getKey();
            gstVar.getClass();
            w1w w1wVarD = gst.d(str);
            if (w1wVarD != null) {
                map2.put(w1wVarD, entry.getValue());
            }
        }
        return map2;
    }

    public static final String b(tbt tbtVar) {
        String strReplace;
        String str = tbtVar.m;
        String str2 = tbtVar.n;
        String strM = tbtVar.l;
        Regex regex = b;
        Regex regex2 = f2053a;
        String strReplace2 = null;
        if (str != null) {
            strReplace = !regex2.a(str) ? regex.replace(str, "") : regex2.h(str, new wtf0((byte) 6));
        } else {
            strReplace = null;
        }
        if (strM != null) {
            strReplace2 = !regex2.a(strM) ? regex.replace(strM, "") : regex2.h(strM, new wtf0((byte) 6));
        }
        if (strReplace != null && strReplace.length() != 0) {
            strM = kng0.m(strReplace2, " (", strReplace, Separators.RPAREN);
        } else if (strM == null || strM.length() == 0) {
            strM = "";
        }
        if (strM.length() == 0) {
            return str2 == null ? "" : str2;
        }
        return (str2 == null || str2.length() == 0) ? strM : kng0.l(strM, Separators.RETURN, str2);
    }

    public static final a2w c(String str, List list, List list2, boolean z, v1w v1wVar) {
        if (str == null) {
            str = "";
        }
        String str2 = str;
        v1w v1wVar2 = v1w.c;
        if (v1wVar != v1wVar2 || list == null) {
            list = iun.f15405a;
        }
        List list3 = list;
        if (list2 == null) {
            list2 = iun.f15405a;
        }
        return new a2w(str2, list3, list2, z, v1wVar2);
    }

    public static final d2w d(tbt tbtVar) {
        tbtVar.getClass();
        List list = tbtVar.k;
        String str = tbtVar.g;
        Integer num = tbtVar.q;
        Long l = tbtVar.s;
        Integer num2 = tbtVar.w;
        String str2 = tbtVar.e;
        Long l2 = tbtVar.d;
        String str3 = tbtVar.u;
        Boolean bool = tbtVar.v;
        List list2 = tbtVar.j;
        List list3 = tbtVar.h;
        List list4 = tbtVar.r;
        List list5 = tbtVar.o;
        Map map = tbtVar.t;
        String str4 = tbtVar.c;
        Long l3 = tbtVar.b;
        Long l4 = tbtVar.p;
        List list6 = tbtVar.i;
        String str5 = tbtVar.f;
        Long l5 = tbtVar.f33683a;
        if (str == null || str.length() == 0) {
            if (l5 == null || str4 == null || l3 == null || l4 == null) {
                return null;
            }
            long jLongValue = l5.longValue();
            String str6 = tbtVar.c;
            if (map == null) {
                map = lun.f20680a;
                map.getClass();
            }
            HashMap mapA = a(map);
            List list7 = list5;
            long jLongValue2 = l3.longValue();
            String str7 = tbtVar.n;
            if (str7 == null) {
                str7 = "";
            }
            if (list7 == null) {
                list7 = iun.f15405a;
            }
            List list8 = list7;
            long jLongValue3 = l4.longValue();
            int iIntValue = num != null ? num.intValue() : 0;
            List listA0 = q5x.a0(l5.longValue(), l3.longValue(), list4);
            a2w a2wVarC = c(str5, list3, list2, bool != null ? bool.booleanValue() : false, v1w.c);
            if (str3 == null) {
                str3 = "";
            }
            return new y1w(jLongValue, str6, " VS ", jLongValue2, num2 != null ? num2.intValue() : 0, l2 != null ? l2.longValue() : 0L, str2 == null ? "" : str2, l != null ? l.longValue() : 0L, mapA, str7, list8, jLongValue3, iIntValue, listA0, a2wVarC, str3);
        }
        if ((list6 != null ? list6.size() : 0) > 1) {
            if (l5 == 0 || str4 == null || l3 == null || l4 == null) {
                return null;
            }
            long jLongValue4 = l5.longValue();
            String str8 = tbtVar.c;
            long jLongValue5 = l3.longValue();
            int iIntValue2 = num2 != null ? num2.intValue() : 0;
            String str9 = str2 == null ? "" : str2;
            long jLongValue6 = l2 != null ? l2.longValue() : 0L;
            if (map == null) {
                map = lun.f20680a;
                map.getClass();
            }
            HashMap mapA2 = a(map);
            String strB = b(tbtVar);
            if (list5 == null) {
                list5 = iun.f15405a;
            }
            return new x1w(jLongValue4, str8, " VS ", jLongValue5, iIntValue2, str9, jLongValue6, l != null ? l.longValue() : 0L, mapA2, strB, list5, l4.longValue(), q5x.a0(l5.longValue(), l3.longValue(), list4), c(str5, list3, list2, bool != null ? bool.booleanValue() : false, bool != null ? v1w.f36652a : v1w.c), c(str, list6, list, bool != null ? bool.booleanValue() : false, bool != null ? v1w.b : v1w.c), str3 == null ? "" : str3, "", "");
        }
        if (str5 == null || str5.length() == 0 || str5.length() == 0 || l5 == 0 || str4 == null || l3 == null || l4 == null) {
            return null;
        }
        long jLongValue7 = l5.longValue();
        String str10 = tbtVar.c;
        long jLongValue8 = l3.longValue();
        int iIntValue3 = num2 != null ? num2.intValue() : 0;
        String str11 = str2 == null ? "" : str2;
        long jLongValue9 = l2 != null ? l2.longValue() : 0L;
        if (map == null) {
            map = lun.f20680a;
            map.getClass();
        }
        HashMap mapA3 = a(map);
        String strB2 = b(tbtVar);
        if (list5 == null) {
            list5 = iun.f15405a;
        }
        return new c2w(jLongValue7, str10, " VS ", jLongValue8, iIntValue3, str11, jLongValue9, l != null ? l.longValue() : 0L, mapA3, strB2, list5, l4.longValue(), num != null ? num.intValue() : 0, q5x.a0(l5.longValue(), l3.longValue(), list4), c(str5, list3, list2, bool != null ? bool.booleanValue() : false, bool != null ? v1w.f36652a : v1w.c), c(str, list6, list, bool != null ? bool.booleanValue() : false, bool != null ? v1w.b : v1w.c), str3 == null ? "" : str3, "", "");
    }
}
