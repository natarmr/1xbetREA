package a;

import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class dui0 extends cui0 {
    public static Set c(Object... objArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(wp20.a(objArr.length));
        tx3.Z(objArr, linkedHashSet);
        return linkedHashSet;
    }

    public static Set d(Object... objArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : objArr) {
            if (obj != null) {
                linkedHashSet.add(obj);
            }
        }
        return linkedHashSet;
    }
}
