package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class x5d implements tj30, lhg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sw3 f40310a;
    public final xx7 b;

    public x5d(sw3 sw3Var, xx7 xx7Var) {
        this.f40310a = sw3Var;
        this.b = xx7Var;
    }

    @Override // a.tj30
    public final int a(cnx cnxVar, List list, int i) {
        int iT = cnxVar.T(this.f40310a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            pj30 pj30Var = (pj30) list.get(i3);
            float fO = vdx.O(vdx.K(pj30Var));
            int iD = pj30Var.D(i);
            if (fO == 0.0f) {
                i2 += iD;
            } else if (fO > 0.0f) {
                f += fO;
                iMax = Math.max(iMax, Math.round(iD / fO));
            }
        }
        return ((list.size() - 1) * iT) + Math.round(iMax * f) + i2;
    }

    @Override // a.tj30
    public final uj30 b(vj30 vj30Var, List list, long j) {
        return wdx.b0(this, p4e.j(j), p4e.k(j), p4e.h(j), p4e.i(j), vj30Var.T(this.f40310a.a()), vj30Var, list, new pu90[list.size()], 0, list.size(), null, 0);
    }

    @Override // a.tj30
    public final int c(cnx cnxVar, List list, int i) {
        int iT = cnxVar.T(this.f40310a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            pj30 pj30Var = (pj30) list.get(i3);
            float fO = vdx.O(vdx.K(pj30Var));
            int iB = pj30Var.b(i);
            if (fO == 0.0f) {
                i2 += iB;
            } else if (fO > 0.0f) {
                f += fO;
                iMax = Math.max(iMax, Math.round(iB / fO));
            }
        }
        return ((list.size() - 1) * iT) + Math.round(iMax * f) + i2;
    }

    @Override // a.tj30
    public final int d(cnx cnxVar, List list, int i) {
        int iT = cnxVar.T(this.f40310a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iT, i);
        int size = list.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i2 = 0; i2 < size; i2++) {
            pj30 pj30Var = (pj30) list.get(i2);
            float fO = vdx.O(vdx.K(pj30Var));
            if (fO == 0.0f) {
                int iMin2 = Math.min(pj30Var.b(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, pj30Var.L(iMin2));
            } else if (fO > 0.0f) {
                f += fO;
            }
        }
        int iRound = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - iMin, 0) / f);
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            pj30 pj30Var2 = (pj30) list.get(i3);
            float fO2 = vdx.O(vdx.K(pj30Var2));
            if (fO2 > 0.0f) {
                iMax = Math.max(iMax, pj30Var2.L(iRound != Integer.MAX_VALUE ? Math.round(iRound * fO2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // a.tj30
    public final int e(cnx cnxVar, List list, int i) {
        int iT = cnxVar.T(this.f40310a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iT, i);
        int size = list.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i2 = 0; i2 < size; i2++) {
            pj30 pj30Var = (pj30) list.get(i2);
            float fO = vdx.O(vdx.K(pj30Var));
            if (fO == 0.0f) {
                int iMin2 = Math.min(pj30Var.b(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, pj30Var.P(iMin2));
            } else if (fO > 0.0f) {
                f += fO;
            }
        }
        int iRound = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - iMin, 0) / f);
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            pj30 pj30Var2 = (pj30) list.get(i3);
            float fO2 = vdx.O(vdx.K(pj30Var2));
            if (fO2 > 0.0f) {
                iMax = Math.max(iMax, pj30Var2.P(iRound != Integer.MAX_VALUE ? Math.round(iRound * fO2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x5d)) {
            return false;
        }
        x5d x5dVar = (x5d) obj;
        return Intrinsics.d(this.f40310a, x5dVar.f40310a) && Intrinsics.d(this.b, x5dVar.b);
    }

    @Override // a.lhg0
    public final int f(pu90 pu90Var) {
        return pu90Var.b;
    }

    @Override // a.lhg0
    public final void g(int i, int[] iArr, int[] iArr2, vj30 vj30Var) {
        this.f40310a.c(vj30Var, i, iArr, iArr2);
    }

    @Override // a.lhg0
    public final uj30 h(pu90[] pu90VarArr, vj30 vj30Var, int i, int[] iArr, int i2, int i3, int[] iArr2, int i4, int i5, int i6) {
        return vj30.x(vj30Var, i3, i2, new zc6((byte) 2, i3, i, pu90VarArr, this, vj30Var, iArr));
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f40310a.hashCode() * 31);
    }

    @Override // a.lhg0
    public final long i(int i, int i2, int i3, boolean z) {
        return !z ? r4e.a(0, i3, i, i2) : lgb.N(0, i3, i, i2);
    }

    @Override // a.lhg0
    public final int j(pu90 pu90Var) {
        return pu90Var.f27604a;
    }

    public final String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.f40310a + ", horizontalAlignment=" + this.b + Separators.RPAREN;
    }
}
