package a;

import androidx.fragment.app.Fragment;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class ft6 extends f5r {
    public final /* synthetic */ byte m = 1;
    public final ArrayList n;

    public ft6(zp6 zp6Var, ArrayList arrayList) {
        super(zp6Var.C(), zp6Var.u1);
        this.n = arrayList;
    }

    @Override // a.f5r
    public final Fragment B(int i) {
        switch (this.m) {
            case 0:
                if (i == 0) {
                    st6.R1.getClass();
                    return new st6();
                }
                if (i == 1) {
                    kt6.Q1.getClass();
                    return new kt6();
                }
                e9d0.d(i, "Unknown position: ");
                return null;
            default:
                zzs0 zzs0Var = zzs0.SIMPLE;
                if (i == 0) {
                    oyj0.U1.getClass();
                    return new oyj0();
                }
                zzs0 zzs0Var2 = zzs0.SIMPLE;
                if (i == 1) {
                    hnc0.R1.getClass();
                    return new hnc0();
                }
                e9d0.d(i, "Unknown position: ");
                return null;
        }
    }

    @Override // a.yge0
    public final int d() {
        switch (this.m) {
            case 0:
                break;
        }
        return this.n.size();
    }

    public ft6(ikr0 ikr0Var, ArrayList arrayList) {
        super(ikr0Var.C(), ikr0Var.u1);
        this.n = arrayList;
    }
}
