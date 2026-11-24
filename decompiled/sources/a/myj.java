package a;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class myj extends rcs0 {
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final boolean D;
    public final boolean E;
    public final SparseArray F;
    public final SparseBooleanArray G;
    public final boolean y;
    public final boolean z;

    public myj(nyj nyjVar) {
        c(nyjVar);
        this.y = nyjVar.y;
        this.z = nyjVar.z;
        this.A = nyjVar.A;
        this.B = nyjVar.B;
        this.C = nyjVar.C;
        this.D = nyjVar.D;
        this.E = nyjVar.E;
        SparseArray sparseArray = nyjVar.F;
        SparseArray sparseArray2 = new SparseArray();
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArray2.put(sparseArray.keyAt(i), new HashMap((Map) sparseArray.valueAt(i)));
        }
        this.F = sparseArray2;
        this.G = nyjVar.G.clone();
    }

    @Override // a.rcs0
    public final scs0 a() {
        return new nyj(this);
    }

    @Override // a.rcs0
    public final rcs0 b(int i) {
        super.b(i);
        return this;
    }

    @Override // a.rcs0
    public final rcs0 d() {
        this.u = -3;
        return this;
    }

    @Override // a.rcs0
    public final rcs0 e(pcs0 pcs0Var) {
        super.e(pcs0Var);
        return this;
    }

    @Override // a.rcs0
    public final rcs0 f() {
        super.f();
        return this;
    }

    @Override // a.rcs0
    public final rcs0 g(String[] strArr) {
        super.g(strArr);
        return this;
    }

    @Override // a.rcs0
    public final rcs0 h() {
        this.s = false;
        return this;
    }

    @Override // a.rcs0
    public final rcs0 i(int i, boolean z) {
        super.i(i, z);
        return this;
    }

    public final void j(Set set) {
        this.x.clear();
        this.x.addAll(set);
    }

    public myj() {
        this.F = new SparseArray();
        this.G = new SparseBooleanArray();
        this.y = true;
        this.z = true;
        this.A = true;
        this.B = true;
        this.C = true;
        this.D = true;
        this.E = true;
    }
}
