package a;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class iet {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f14651a;
    public final int b;
    public int c;
    public final ArrayList d;
    public final ey40 e;
    public final n0o0 f;

    public iet(ArrayList arrayList, int i) {
        this.f14651a = arrayList;
        this.b = i;
        if (i < 0) {
            dsb0.a("Invalid start index");
        }
        this.d = new ArrayList();
        ey40 ey40Var = new ey40();
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            jky jkyVar = (jky) this.f14651a.get(i3);
            int i4 = jkyVar.c;
            int i5 = jkyVar.d;
            ey40Var.j(i4, new xgv(i3, i2, i5));
            i2 += i5;
        }
        this.e = ey40Var;
        this.f = maz.b(new t7t(this, (byte) 3));
    }

    public final boolean a(int i, int i2) {
        xgv xgvVar;
        int i3;
        int i4;
        ey40 ey40Var = this.e;
        xgv xgvVar2 = (xgv) ey40Var.b(i);
        if (xgvVar2 == null) {
            return false;
        }
        int i5 = xgvVar2.b;
        int i6 = i2 - xgvVar2.c;
        xgvVar2.c = i2;
        if (i6 == 0) {
            return true;
        }
        Object[] objArr = ey40Var.c;
        long[] jArr = ey40Var.f11466a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i7 = 0;
        while (true) {
            long j = jArr[i7];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i7 - length)) >>> 31);
                for (int i9 = 0; i9 < i8; i9++) {
                    if ((255 & j) < 128 && (i3 = (xgvVar = (xgv) objArr[(i7 << 3) + i9]).b) >= i5 && xgvVar != xgvVar2 && (i4 = i3 + i6) >= 0) {
                        xgvVar.b = i4;
                    }
                    j >>= 8;
                }
                if (i8 != 8) {
                    return true;
                }
            }
            if (i7 == length) {
                return true;
            }
            i7++;
        }
    }
}
