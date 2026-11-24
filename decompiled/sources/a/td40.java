package a;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes6.dex */
public final class td40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseArray f33748a;
    public u0t0 b;

    public td40(int i) {
        this.f33748a = new SparseArray(i);
    }

    public final void a(u0t0 u0t0Var, int i, int i2) {
        int iA = u0t0Var.a(i);
        SparseArray sparseArray = this.f33748a;
        td40 td40Var = (td40) sparseArray.get(iA);
        if (td40Var == null) {
            td40Var = new td40(1);
            sparseArray.put(u0t0Var.a(i), td40Var);
        }
        if (i2 > i) {
            td40Var.a(u0t0Var, i + 1, i2);
        } else {
            td40Var.b = u0t0Var;
        }
    }
}
