package a;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class nog0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public hev0 f23865a;
    public ArrayList b;

    public static long a(i7k i7kVar, long j) {
        hev0 hev0Var = i7kVar.d;
        ArrayList arrayList = i7kVar.k;
        if (hev0Var instanceof ivv) {
            return j;
        }
        int size = arrayList.size();
        long jMin = j;
        for (int i = 0; i < size; i++) {
            d7k d7kVar = (d7k) arrayList.get(i);
            if (d7kVar instanceof i7k) {
                i7k i7kVar2 = (i7k) d7kVar;
                if (i7kVar2.d != hev0Var) {
                    jMin = Math.min(jMin, a(i7kVar2, ((long) i7kVar2.f) + j));
                }
            }
        }
        i7k i7kVar3 = hev0Var.i;
        i7k i7kVar4 = hev0Var.h;
        if (i7kVar != i7kVar3) {
            return jMin;
        }
        long j2 = j - hev0Var.j();
        return Math.min(Math.min(jMin, a(i7kVar4, j2)), j2 - ((long) i7kVar4.f));
    }

    public static long b(i7k i7kVar, long j) {
        hev0 hev0Var = i7kVar.d;
        ArrayList arrayList = i7kVar.k;
        if (hev0Var instanceof ivv) {
            return j;
        }
        int size = arrayList.size();
        long jMax = j;
        for (int i = 0; i < size; i++) {
            d7k d7kVar = (d7k) arrayList.get(i);
            if (d7kVar instanceof i7k) {
                i7k i7kVar2 = (i7k) d7kVar;
                if (i7kVar2.d != hev0Var) {
                    jMax = Math.max(jMax, b(i7kVar2, ((long) i7kVar2.f) + j));
                }
            }
        }
        i7k i7kVar3 = hev0Var.h;
        i7k i7kVar4 = hev0Var.i;
        if (i7kVar != i7kVar3) {
            return jMax;
        }
        long j2 = hev0Var.j() + j;
        return Math.max(Math.max(jMax, b(i7kVar4, j2)), j2 - ((long) i7kVar4.f));
    }
}
