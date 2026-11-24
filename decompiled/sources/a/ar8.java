package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ar8 implements tj30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u12 f1333a;
    public final boolean b;

    public ar8(u12 u12Var, boolean z) {
        this.f1333a = u12Var;
        this.b = z;
    }

    @Override // a.tj30
    public final uj30 b(vj30 vj30Var, List list, long j) {
        int iK;
        int iJ;
        pu90 pu90VarS;
        if (list.isEmpty()) {
            return vj30.x(vj30Var, p4e.k(j), p4e.j(j), new cp8((byte) 3));
        }
        long j2 = this.b ? j : j & (-8589934589L);
        if (list.size() == 1) {
            pj30 pj30Var = (pj30) list.get(0);
            Object objN = pj30Var.n();
            yq8 yq8Var = objN instanceof yq8 ? (yq8) objN : null;
            if (yq8Var != null ? yq8Var.p : false) {
                iK = p4e.k(j);
                iJ = p4e.j(j);
                int iK2 = p4e.k(j);
                int iJ2 = p4e.j(j);
                if (!((iJ2 >= 0) & (iK2 >= 0))) {
                    zcx.a("width and height must be >= 0");
                }
                pu90VarS = pj30Var.S(r4e.h(iK2, iK2, iJ2, iJ2));
            } else {
                pu90VarS = pj30Var.S(j2);
                iK = Math.max(p4e.k(j), pu90VarS.f27604a);
                iJ = Math.max(p4e.j(j), pu90VarS.b);
            }
            int i = iJ;
            int i2 = iK;
            return vj30.x(vj30Var, i2, i, new zc6(pu90VarS, pj30Var, vj30Var, i2, i, this));
        }
        pu90[] pu90VarArr = new pu90[list.size()];
        kie0 kie0Var = new kie0();
        kie0Var.f18333a = p4e.k(j);
        kie0 kie0Var2 = new kie0();
        kie0Var2.f18333a = p4e.j(j);
        int size = list.size();
        boolean z = false;
        for (int i3 = 0; i3 < size; i3++) {
            pj30 pj30Var2 = (pj30) list.get(i3);
            Object objN2 = pj30Var2.n();
            yq8 yq8Var2 = objN2 instanceof yq8 ? (yq8) objN2 : null;
            if (yq8Var2 != null ? yq8Var2.p : false) {
                z = true;
            } else {
                pu90 pu90VarS2 = pj30Var2.S(j2);
                pu90VarArr[i3] = pu90VarS2;
                kie0Var.f18333a = Math.max(kie0Var.f18333a, pu90VarS2.f27604a);
                kie0Var2.f18333a = Math.max(kie0Var2.f18333a, pu90VarS2.b);
            }
        }
        if (z) {
            int i4 = kie0Var.f18333a;
            int i5 = i4 != Integer.MAX_VALUE ? i4 : 0;
            int i6 = kie0Var2.f18333a;
            long jA = r4e.a(i5, i4, i6 != Integer.MAX_VALUE ? i6 : 0, i6);
            int size2 = list.size();
            for (int i7 = 0; i7 < size2; i7++) {
                pj30 pj30Var3 = (pj30) list.get(i7);
                Object objN3 = pj30Var3.n();
                yq8 yq8Var3 = objN3 instanceof yq8 ? (yq8) objN3 : null;
                if (yq8Var3 != null ? yq8Var3.p : false) {
                    pu90VarArr[i7] = pj30Var3.S(jA);
                }
            }
        }
        return vj30.x(vj30Var, kie0Var.f18333a, kie0Var2.f18333a, new bg0(pu90VarArr, list, vj30Var, kie0Var, kie0Var2, this, (byte) 2));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ar8)) {
            return false;
        }
        ar8 ar8Var = (ar8) obj;
        return Intrinsics.d(this.f1333a, ar8Var.f1333a) && this.b == ar8Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f1333a.hashCode() * 31);
    }

    public final String toString() {
        return "BoxMeasurePolicy(alignment=" + this.f1333a + ", propagateMinConstraints=" + this.b + Separators.RPAREN;
    }
}
