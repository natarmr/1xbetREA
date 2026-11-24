package a;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.huawei.hms.adapter.internal.CommonCode;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class nyj extends scs0 {
    public static final nyj H = new nyj(new myj());
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final boolean D;
    public final boolean E;
    public final SparseArray F;
    public final SparseBooleanArray G;
    public final boolean y;
    public final boolean z;

    static {
        hne.s(1000, 1001, CommonCode.BusInterceptor.PRIVACY_CANCEL, 1003, 1004);
        hne.s(1005, 1006, 1007, 1008, 1009);
        hne.s(1010, 1011, 1012, 1013, 1014);
        vtt0.H(1015);
        vtt0.H(1016);
        vtt0.H(1017);
        vtt0.H(1018);
    }

    public nyj(myj myjVar) {
        super(myjVar);
        this.y = myjVar.y;
        this.z = myjVar.z;
        this.A = myjVar.A;
        this.B = myjVar.B;
        this.C = myjVar.C;
        this.D = myjVar.D;
        this.E = myjVar.E;
        this.F = myjVar.F;
        this.G = myjVar.G;
    }

    @Override // a.scs0
    public final rcs0 a() {
        return new myj(this);
    }

    @Override // a.scs0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && nyj.class == obj.getClass()) {
            nyj nyjVar = (nyj) obj;
            if (super.equals(nyjVar) && this.y == nyjVar.y && this.z == nyjVar.z && this.A == nyjVar.A && this.B == nyjVar.B && this.C == nyjVar.C && this.D == nyjVar.D && this.E == nyjVar.E) {
                SparseBooleanArray sparseBooleanArray = nyjVar.G;
                SparseBooleanArray sparseBooleanArray2 = this.G;
                int size = sparseBooleanArray2.size();
                if (sparseBooleanArray.size() == size) {
                    for (int i = 0; i < size; i++) {
                        if (sparseBooleanArray.indexOfKey(sparseBooleanArray2.keyAt(i)) >= 0) {
                        }
                    }
                    SparseArray sparseArray = nyjVar.F;
                    SparseArray sparseArray2 = this.F;
                    int size2 = sparseArray2.size();
                    if (sparseArray.size() == size2) {
                        for (int i2 = 0; i2 < size2; i2++) {
                            int iIndexOfKey = sparseArray.indexOfKey(sparseArray2.keyAt(i2));
                            if (iIndexOfKey >= 0) {
                                Map map = (Map) sparseArray2.valueAt(i2);
                                Map map2 = (Map) sparseArray.valueAt(iIndexOfKey);
                                if (map2.size() == map.size()) {
                                    for (Map.Entry entry : map.entrySet()) {
                                        dcs0 dcs0Var = (dcs0) entry.getKey();
                                        if (!map2.containsKey(dcs0Var) || !Objects.equals(entry.getValue(), map2.get(dcs0Var))) {
                                        }
                                    }
                                }
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // a.scs0
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.y ? 1 : 0)) * 961) + (this.z ? 1 : 0)) * 961) + (this.A ? 1 : 0)) * 28629151) + (this.B ? 1 : 0)) * 31) + (this.C ? 1 : 0)) * 31) + (this.D ? 1 : 0)) * 961) + (this.E ? 1 : 0)) * 31;
    }
}
