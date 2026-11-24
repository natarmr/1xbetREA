package a;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class wj30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39244a;
    public final List b;
    public final long c;
    public final Object d;
    public final yx7 e;
    public final k6z f;
    public final boolean g;
    public final int h;
    public final int[] i;
    public int j;
    public int k;

    public wj30(int i, int i2, List list, long j, Object obj, yx7 yx7Var, k6z k6zVar) {
        ma80 ma80Var = ma80.f21447a;
        this.f39244a = i;
        this.b = list;
        this.c = j;
        this.d = obj;
        this.e = yx7Var;
        this.f = k6zVar;
        ma80 ma80Var2 = ma80.f21447a;
        this.g = false;
        int size = list.size();
        int iMax = 0;
        for (int i3 = 0; i3 < size; i3++) {
            pu90 pu90Var = (pu90) list.get(i3);
            iMax = Math.max(iMax, !this.g ? pu90Var.b : pu90Var.f27604a);
        }
        this.h = iMax;
        this.i = new int[this.b.size() * 2];
        this.k = Integer.MIN_VALUE;
    }

    public final void a(int i) {
        this.j += i;
        int[] iArr = this.i;
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            boolean z = this.g;
            if ((z && i2 % 2 == 1) || (!z && i2 % 2 == 0)) {
                iArr[i2] = iArr[i2] + i;
            }
        }
    }

    public final void b(int i, int i2, int i3) {
        int i4;
        this.j = i;
        boolean z = this.g;
        this.k = z ? i3 : i2;
        List list = this.b;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            pu90 pu90Var = (pu90) list.get(i5);
            int i6 = i5 * 2;
            int[] iArr = this.i;
            if (z) {
                iArr[i6] = Math.round((1.0f + (this.f != k6z.f17794a ? 0.0f * (-1.0f) : 0.0f)) * ((i2 - pu90Var.f27604a) / 2.0f));
                iArr[i6 + 1] = i;
                i4 = pu90Var.b;
            } else {
                iArr[i6] = i;
                int i7 = i6 + 1;
                yx7 yx7Var = this.e;
                if (yx7Var == null) {
                    throw w6x.i("null verticalAlignment");
                }
                iArr[i7] = yx7Var.a(pu90Var.b, i3);
                i4 = pu90Var.f27604a;
            }
            i += i4;
        }
    }
}
