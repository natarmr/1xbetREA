package a;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class qb00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f28423a;
    public final int[] b;
    public final n0o0 c;
    public final LinkedHashMap d;

    public qb00(dgu dguVar, List list) {
        list.getClass();
        ArrayList arrayList = new ArrayList();
        for (wvq0 xvq0Var = new xvq0(dguVar, list); xvq0Var.e() != null; xvq0Var = xvq0Var.a()) {
            arrayList.add(xvq0Var);
        }
        this.f28423a = arrayList;
        this.b = b(cy2.F, cy2.G);
        this.c = maz.b(new sz2(this, (byte) 14));
        List listJ = q3d.j(cy2.I, cy2.E, cy2.B, cy2.C);
        int iA = wp20.a(r3d.q(listJ, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA < 16 ? 16 : iA);
        for (Object obj : listJ) {
            linkedHashMap.put(obj, maz.b(new gs40(this, (ar20) obj, (byte) 2)));
        }
        this.d = linkedHashMap;
    }

    public final wvq0 a(wvq0 wvq0Var, int[] iArr, int i) {
        int i2;
        s43 s43Var = new s43(wvq0Var, (byte) 8);
        ArrayList arrayList = this.f28423a;
        int size = arrayList.size();
        arrayList.getClass();
        q3d.n(arrayList.size(), size);
        int i3 = size - 1;
        int i4 = 0;
        while (true) {
            if (i4 > i3) {
                i2 = -(i4 + 1);
                break;
            }
            i2 = (i4 + i3) >>> 1;
            int iIntValue = ((Number) s43Var.invoke(arrayList.get(i2))).intValue();
            if (iIntValue >= 0) {
                if (iIntValue <= 0) {
                    break;
                }
                i3 = i2 - 1;
            } else {
                i4 = i2 + 1;
            }
        }
        if (i2 < 0) {
            return null;
        }
        int i5 = i2 + i;
        return (wvq0) CollectionsKt.W((i5 < 0 || i5 >= iArr.length) ? -1 : iArr[i5], arrayList);
    }

    public final int[] b(ar20 ar20Var, ar20 ar20Var2) {
        ArrayList arrayList = this.f28423a;
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = -1;
        }
        xw3 xw3Var = new xw3();
        int size2 = arrayList.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ar20 ar20VarE = ((wvq0) arrayList.get(i2)).e();
            if (Intrinsics.d(ar20VarE, ar20Var)) {
                xw3Var.addLast(Integer.valueOf(i2));
            } else if (Intrinsics.d(ar20VarE, ar20Var2) && !xw3Var.isEmpty()) {
                iArr[((Number) xw3Var.removeLast()).intValue()] = i2;
            }
        }
        return iArr;
    }
}
