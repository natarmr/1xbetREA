package a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class sln0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f32409a = new ArrayList();

    public static void b(ArrayList arrayList, int i, int[] iArr, int i2) {
        if (i2 >= iArr.length) {
            arrayList.add((int[]) iArr.clone());
            return;
        }
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = 0;
            while (true) {
                if (i4 >= i2) {
                    iArr[i2] = i3;
                    b(arrayList, i, iArr, i2 + 1);
                    break;
                } else if (i3 == iArr[i4]) {
                    break;
                } else {
                    i4++;
                }
            }
        }
    }

    public final void a(wln0 wln0Var) {
        this.f32409a.add(wln0Var);
    }

    public final List c(ArrayList arrayList) {
        urm0 urm0Var;
        urm0 urm0Var2;
        urm0 urm0Var3;
        if (arrayList.isEmpty()) {
            return new ArrayList();
        }
        int size = arrayList.size();
        ArrayList arrayList2 = this.f32409a;
        if (size != arrayList2.size()) {
            return null;
        }
        int size2 = arrayList2.size();
        ArrayList<int[]> arrayList3 = new ArrayList();
        b(arrayList3, size2, new int[size2], 0);
        wln0[] wln0VarArr = new wln0[arrayList.size()];
        for (int[] iArr : arrayList3) {
            boolean z = true;
            for (int i = 0; i < arrayList2.size(); i++) {
                if (iArr[i] < arrayList.size()) {
                    wln0 wln0Var = (wln0) arrayList2.get(i);
                    wln0 wln0Var2 = (wln0) arrayList.get(iArr[i]);
                    wln0Var.getClass();
                    wln0Var2.getClass();
                    z &= wln0Var2.b.f34154a <= wln0Var.b.f34154a && wln0Var2.f39363a == wln0Var.f39363a && ((urm0Var = wln0Var.c) == (urm0Var2 = urm0.DEFAULT) || (urm0Var3 = wln0Var2.c) == urm0Var2 || urm0Var3 == urm0Var);
                    if (!z) {
                        break;
                    }
                    wln0VarArr[iArr[i]] = (wln0) arrayList2.get(i);
                }
            }
            if (z) {
                return Arrays.asList(wln0VarArr);
            }
        }
        return null;
    }
}
