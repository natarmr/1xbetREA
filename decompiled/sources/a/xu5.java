package a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class xu5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f41494a = new HashMap();

    public final int[] a() {
        ArrayList arrayList = new ArrayList();
        int iIntValue = -1;
        for (Map.Entry entry : this.f41494a.entrySet()) {
            if (((Integer) entry.getValue()).intValue() > iIntValue) {
                iIntValue = ((Integer) entry.getValue()).intValue();
                arrayList.clear();
                arrayList.add((Integer) entry.getKey());
            } else if (((Integer) entry.getValue()).intValue() == iIntValue) {
                arrayList.add((Integer) entry.getKey());
            }
        }
        return y0x0.N(arrayList);
    }

    public final void b(int i) {
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.f41494a;
        int i2 = (Integer) map.get(numValueOf);
        if (i2 == null) {
            i2 = 0;
        }
        map.put(Integer.valueOf(i), kng0.e(1, i2));
    }
}
