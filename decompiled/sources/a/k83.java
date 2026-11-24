package a;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class k83 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j83 f17854a = new j83("");

    public static final List a(j83 j83Var, int i, int i2, sy2 sy2Var) {
        List list;
        if (i == i2 || (list = j83Var.f16067a) == null) {
            return null;
        }
        int i3 = 0;
        if (i == 0 && i2 >= j83Var.b.length()) {
            if (sy2Var == null) {
                return list;
            }
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            while (i3 < size) {
                Object obj = list.get(i3);
                if (((Boolean) sy2Var.invoke(((i83) obj).f14321a)).booleanValue()) {
                    arrayList.add(obj);
                }
                i3++;
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        int size2 = list.size();
        while (i3 < size2) {
            i83 i83Var = (i83) list.get(i3);
            if (sy2Var != null ? ((Boolean) sy2Var.invoke(i83Var.f14321a)).booleanValue() : true) {
                int i4 = i83Var.b;
                int i5 = i83Var.c;
                if (b(i, i2, i4, i5)) {
                    arrayList2.add(new i83(l1e0.d(i83Var.b, i, i2) - i, l1e0.d(i5, i, i2) - i, (f83) i83Var.f14321a, i83Var.d));
                }
            }
            i3++;
        }
        return arrayList2;
    }

    public static final boolean b(int i, int i2, int i3, int i4) {
        return ((i < i4) & (i3 < i2)) | (((i == i2) | (i3 == i4)) & (i == i3));
    }
}
