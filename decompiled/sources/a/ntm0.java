package a;

import android.gov.nist.core.Separators;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
public class ntm0 extends mtm0 {
    public static String b(String str) {
        return pgi0.n(pgi0.p(new sx3(str, (byte) 6), new ka6("    ", (byte) 15)), Separators.RETURN);
    }

    public static String c(String str) {
        int length;
        str.getClass();
        List listZ = StringsKt.Z(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listZ) {
            if (!StringsKt.W((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            length = 0;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            int length2 = str2.length();
            while (true) {
                if (length >= length2) {
                    length = -1;
                    break;
                }
                if (!CharsKt.d(str2.charAt(length))) {
                    break;
                }
                length++;
            }
            if (length == -1) {
                length = str2.length();
            }
            arrayList2.add(Integer.valueOf(length));
        }
        Integer num = (Integer) CollectionsKt.j0(arrayList2);
        int iIntValue = num != null ? num.intValue() : 0;
        int length3 = str.length();
        listZ.size();
        int size = listZ.size() - 1;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listZ) {
            int i = length + 1;
            String strSubstring = null;
            if (length < 0) {
                q3d.p();
                throw null;
            }
            String str3 = (String) obj2;
            if ((length != 0 && length != size) || !StringsKt.W(str3)) {
                str3.getClass();
                if (iIntValue < 0) {
                    c99.s(ua80.e(iIntValue, "Requested character count ", " is less than zero."));
                    return null;
                }
                int length4 = str3.length();
                if (iIntValue <= length4) {
                    length4 = iIntValue;
                }
                strSubstring = str3.substring(length4);
            }
            if (strSubstring != null) {
                arrayList3.add(strSubstring);
            }
            length = i;
        }
        StringBuilder sb = new StringBuilder(length3);
        CollectionsKt.a0(arrayList3, sb, Separators.RETURN, null, null, null, 124);
        return sb.toString();
    }

    public static String d(String str) {
        if (StringsKt.W(HiAnalyticsConstant.REPORT_VAL_SEPARATOR)) {
            jf4.o("marginPrefix must be non-blank string.");
            return null;
        }
        List listZ = StringsKt.Z(str);
        int length = str.length();
        listZ.size();
        int size = listZ.size() - 1;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : listZ) {
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            String str2 = (String) obj;
            if ((i == 0 || i == size) && StringsKt.W(str2)) {
                str2 = null;
            } else {
                int length2 = str2.length();
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        i3 = -1;
                        break;
                    }
                    if (!CharsKt.d(str2.charAt(i3))) {
                        break;
                    }
                    i3++;
                }
                String strSubstring = (i3 != -1 && kotlin.text.c.w(i3, str2, HiAnalyticsConstant.REPORT_VAL_SEPARATOR, false)) ? str2.substring(HiAnalyticsConstant.REPORT_VAL_SEPARATOR.length() + i3) : null;
                if (strSubstring != null) {
                    str2 = strSubstring;
                }
            }
            if (str2 != null) {
                arrayList.add(str2);
            }
            i = i2;
        }
        StringBuilder sb = new StringBuilder(length);
        CollectionsKt.a0(arrayList, sb, Separators.RETURN, null, null, null, 124);
        return sb.toString();
    }
}
