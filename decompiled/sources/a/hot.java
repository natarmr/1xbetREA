package a;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class hot {
    public static double a(List list) {
        list.getClass();
        Iterator it = list.iterator();
        double dDoubleValue = 0.0d;
        while (it.hasNext()) {
            BigDecimal bigDecimalAdd = new BigDecimal(String.valueOf(dDoubleValue)).add(new BigDecimal(String.valueOf(((xxk0) it.next()).f41663a)));
            bigDecimalAdd.getClass();
            dDoubleValue = bigDecimalAdd.doubleValue();
        }
        return dDoubleValue;
    }
}
