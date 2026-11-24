package a;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ev40 extends syx {
    public final long e;
    public final ArrayList f;
    public final ArrayList g;

    public ev40(int i, long j) {
        super(i, (byte) 3);
        this.e = j;
        this.f = new ArrayList();
        this.g = new ArrayList();
    }

    @Override // a.syx
    public final String toString() {
        return syx.k(this.b) + " leaves: " + Arrays.toString(this.f.toArray()) + " containers: " + Arrays.toString(this.g.toArray());
    }

    public final ev40 v(int i) {
        ArrayList arrayList = this.g;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ev40 ev40Var = (ev40) arrayList.get(i2);
            if (ev40Var.b == i) {
                return ev40Var;
            }
        }
        return null;
    }

    public final fv40 w(int i) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            fv40 fv40Var = (fv40) arrayList.get(i2);
            if (fv40Var.b == i) {
                return fv40Var;
            }
        }
        return null;
    }
}
