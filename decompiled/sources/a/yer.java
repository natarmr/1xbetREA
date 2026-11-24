package a;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class yer {
    public static final yer c = new yer(q3d.j(ser.d, ver.d, ter.d, uer.d));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f42502a;
    public final LinkedHashMap b;

    public yer(List list) {
        list.getClass();
        this.f42502a = list;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            swq swqVar = ((wer) obj).f39032a;
            Object arrayList = linkedHashMap.get(swqVar);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(swqVar, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        this.b = linkedHashMap;
    }

    public final xer a(swq swqVar, String str) {
        Integer numValueOf;
        swqVar.getClass();
        str.getClass();
        List<wer> list = (List) this.b.get(swqVar);
        if (list == null) {
            return null;
        }
        for (wer werVar : list) {
            int i = 0;
            if (kotlin.text.c.x(str, werVar.b, false)) {
                String strSubstring = str.substring(werVar.b.length());
                if (strSubstring.length() == 0) {
                    numValueOf = null;
                    break;
                }
                int length = strSubstring.length();
                int i2 = 0;
                while (true) {
                    if (i >= length) {
                        numValueOf = Integer.valueOf(i2);
                        break;
                    }
                    int iCharAt = strSubstring.charAt(i) - '0';
                    if (iCharAt < 0 || iCharAt >= 10) {
                        numValueOf = null;
                        break;
                    }
                    i2 = (i2 * 10) + iCharAt;
                    i++;
                }
                if (numValueOf != null) {
                    return new xer(werVar, numValueOf.intValue());
                }
            }
        }
        return null;
    }
}
