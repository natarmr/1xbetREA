package a;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class s8z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f31827a;
    public final r8z[] b;
    public final v8z c;
    public final List d;
    public final boolean e;
    public final int f;
    public final int g;
    public final int h;

    public s8z(int i, r8z[] r8zVarArr, v8z v8zVar, List list, boolean z, int i2) {
        this.f31827a = i;
        this.b = r8zVarArr;
        this.c = v8zVar;
        this.d = list;
        this.e = z;
        this.f = i2;
        int iMax = 0;
        for (r8z r8zVar : r8zVarArr) {
            iMax = Math.max(iMax, r8zVar.o);
        }
        this.g = iMax;
        int i3 = iMax + this.f;
        this.h = i3 >= 0 ? i3 : 0;
    }

    public final r8z[] a(int i, int i2, int i3) {
        r8z[] r8zVarArr = this.b;
        int length = r8zVarArr.length;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < length) {
            r8z r8zVar = r8zVarArr[i4];
            int i7 = i5 + 1;
            int i8 = (int) ((pgv) this.d.get(i5)).f26968a;
            int i9 = this.c.b[i6];
            int i10 = this.f31827a;
            boolean z = this.e;
            r8zVar.o(i, i9, i2, i3, z ? i10 : i6, z ? i6 : i10);
            i6 += i8;
            i4++;
            i5 = i7;
        }
        return r8zVarArr;
    }
}
