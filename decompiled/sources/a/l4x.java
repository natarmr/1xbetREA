package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class l4x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f19431a = new LinkedHashMap();
    public final LinkedHashMap b = new LinkedHashMap();

    public static void c(ArrayList arrayList, LinkedHashMap linkedHashMap) {
        linkedHashMap.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String str = (String) pair.f46059a;
            String strR = kotlin.text.c.r((String) pair.b, "\\n", Separators.RETURN, false);
            if (str.length() <= 5 || !kotlin.text.c.n(str, "_prod", false)) {
                Integer num = (Integer) psm0.f27522a.get(str);
                if (num != null) {
                    int iIntValue = num.intValue();
                    if (!linkedHashMap.containsKey(Integer.valueOf(iIntValue))) {
                        linkedHashMap.put(Integer.valueOf(iIntValue), strR);
                    }
                }
            } else {
                Integer num2 = (Integer) psm0.f27522a.get(vqd.k(5, 0, str));
                if (num2 != null) {
                    linkedHashMap.put(Integer.valueOf(num2.intValue()), strR);
                }
            }
        }
    }

    public final String a(int i) {
        return (String) this.f19431a.get(Integer.valueOf(i));
    }

    public final String b(int i) {
        return (String) this.b.get(Integer.valueOf(i));
    }
}
