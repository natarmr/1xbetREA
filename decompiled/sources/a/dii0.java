package a;

import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public abstract class dii0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f6141a = q3d.j(21, 23, 25, 27, 29);
    public static final List b = kotlin.collections.a.c(1);

    public static final String a(String str, List list, List list2, Integer num, boolean z, BigDecimal bigDecimal, String str2, Long l, long j, nt20 nt20Var, boolean z2, boolean z3) {
        String string = str;
        string.getClass();
        list.getClass();
        list2.getClass();
        nt20Var.getClass();
        if (!z2 || (list.isEmpty() && list2.isEmpty() && !CollectionsKt.L(b, num))) {
            if (z2 && z3 && !CollectionsKt.L(b, num)) {
                StringBuilder sbP = axq.p(num, "entry: ", nt20Var.name(), " market type: ", ", market id: ");
                sbP.append(j);
                String string2 = sbP.toString();
                ony onyVar = vbw0.j;
                if (onyVar != null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("FAILED_EVENT_PARAMS", ncy.c(string2));
                    ((rny) onyVar).a("FAILED_EVENT_PARAMS", new tny("event", xp20.n(linkedHashMap)));
                }
            }
            String strK = zv20.k(num, string, bigDecimal, str2, l);
            if (!z) {
                return strK;
            }
            return "O: [" + num + "]: " + strK;
        }
        if (!CollectionsKt.L(b, num)) {
            boolean zL = CollectionsKt.L(f6141a, num);
            StringBuilder sb = new StringBuilder(string.length());
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (i < string.length()) {
                int iU = StringsKt.U('(', i, 4, string);
                int iU2 = StringsKt.U('[', i, 4, string);
                boolean z4 = iU != -1 && (iU2 == -1 || iU < iU2);
                boolean z5 = iU2 != -1 && (iU == -1 || iU2 < iU);
                if (!z4 && !z5) {
                    break;
                }
                if (!z4) {
                    iU = iU2;
                }
                int i4 = iU + 1;
                int iU3 = StringsKt.U(z4 ? ')' : ']', i4, 4, string);
                if (iU3 == -1) {
                    sb.append((CharSequence) string, i, i4);
                } else {
                    boolean z6 = iU3 != i4;
                    if (zL || !z6) {
                        sb.append((CharSequence) string, i, iU);
                        if (z4) {
                            if (i2 < list.size()) {
                                int i5 = i2 + 1;
                                sb.append("\u200e" + list.get(i2) + "\u200e");
                                i2 = i5;
                            }
                        } else if (i3 < list2.size()) {
                            sb.append((String) list2.get(i3));
                            i3++;
                        }
                        i = iU3 + 1;
                    } else {
                        sb.append((CharSequence) string, i, i4);
                    }
                }
                i = i4;
            }
            sb.append((CharSequence) string, i, string.length());
            string = sb.toString();
        }
        if (!z) {
            return string;
        }
        return "N: [" + num + "]: " + string;
    }
}
