package a;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class txx extends b3 {
    public final int b;
    public final int c;
    public final ArrayList d;

    public txx(ArrayList arrayList, int i, int i2) {
        this.b = i;
        this.c = i2;
        this.d = arrayList;
    }

    @Override // a.u1
    public final int b() {
        return this.d.size() + this.b + this.c;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.b;
        if (i < 0 || i >= i2) {
            ArrayList arrayList = this.d;
            if (i < arrayList.size() + i2 && i2 <= i) {
                return arrayList.get(i - i2);
            }
            int size = arrayList.size() + i2;
            if (i >= b() || size > i) {
                hny.k(b(), b1j.m(i, "Illegal attempt to access index ", " in ItemSnapshotList of size "));
                return null;
            }
        }
        return null;
    }
}
