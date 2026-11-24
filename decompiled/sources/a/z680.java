package a;

import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class z680 extends b3 implements RandomAccess {
    public static final /* synthetic */ int d = 0;
    public final qg9[] b;
    public final int[] c;

    public z680(qg9[] qg9VarArr, int[] iArr) {
        this.b = qg9VarArr;
        this.c = iArr;
    }

    @Override // a.u1
    public final int b() {
        return this.b.length;
    }

    @Override // a.u1, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof qg9) {
            return super.contains((qg9) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.b[i];
    }

    @Override // a.b3, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof qg9) {
            return super.indexOf((qg9) obj);
        }
        return -1;
    }

    @Override // a.b3, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof qg9) {
            return super.lastIndexOf((qg9) obj);
        }
        return -1;
    }
}
