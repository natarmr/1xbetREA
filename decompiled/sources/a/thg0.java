package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class thg0 implements tj30, lhg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ow3 f33961a;
    public final yx7 b;

    public thg0(ow3 ow3Var, yx7 yx7Var) {
        this.f33961a = ow3Var;
        this.b = yx7Var;
    }

    @Override // a.tj30
    public final int a(cnx cnxVar, List list, int i) {
        int iT = cnxVar.T(this.f33961a.a());
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
                int iMin2 = Math.min(pj30Var.P(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, pj30Var.D(iMin2));
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
                iMax = Math.max(iMax, pj30Var2.D(iRound != Integer.MAX_VALUE ? Math.round(iRound * fO2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // a.tj30
    public final uj30 b(vj30 vj30Var, List list, long j) {
        return wdx.b0(this, p4e.k(j), p4e.j(j), p4e.i(j), p4e.h(j), vj30Var.T(this.f33961a.a()), vj30Var, list, new pu90[list.size()], 0, list.size(), null, 0);
    }

    @Override // a.tj30
    public final int c(cnx cnxVar, List list, int i) {
        int iT = cnxVar.T(this.f33961a.a());
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
                int iMin2 = Math.min(pj30Var.P(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, pj30Var.b(iMin2));
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
                iMax = Math.max(iMax, pj30Var2.b(iRound != Integer.MAX_VALUE ? Math.round(iRound * fO2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // a.tj30
    public final int d(cnx cnxVar, List list, int i) {
        int iT = cnxVar.T(this.f33961a.a());
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
            int iL = pj30Var.L(i);
            if (fO == 0.0f) {
                i2 += iL;
            } else if (fO > 0.0f) {
                f += fO;
                iMax = Math.max(iMax, Math.round(iL / fO));
            }
        }
        return ((list.size() - 1) * iT) + Math.round(iMax * f) + i2;
    }

    @Override // a.tj30
    public final int e(cnx cnxVar, List list, int i) {
        int iT = cnxVar.T(this.f33961a.a());
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
            int iP = pj30Var.P(i);
            if (fO == 0.0f) {
                i2 += iP;
            } else if (fO > 0.0f) {
                f += fO;
                iMax = Math.max(iMax, Math.round(iP / fO));
            }
        }
        return ((list.size() - 1) * iT) + Math.round(iMax * f) + i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof thg0)) {
            return false;
        }
        thg0 thg0Var = (thg0) obj;
        return Intrinsics.d(this.f33961a, thg0Var.f33961a) && Intrinsics.d(this.b, thg0Var.b);
    }

    @Override // a.lhg0
    public final int f(pu90 pu90Var) {
        return pu90Var.f27604a;
    }

    @Override // a.lhg0
    public final void g(int i, int[] iArr, int[] iArr2, vj30 vj30Var) {
        this.f33961a.b(vj30Var, i, iArr, vj30Var.getLayoutDirection(), iArr2);
    }

    @Override // a.lhg0
    public final uj30 h(pu90[] pu90VarArr, vj30 vj30Var, int i, int[] iArr, int i2, int i3, int[] iArr2, int i4, int i5, int i6) {
        return vj30.x(vj30Var, i2, i3, new yc6(pu90VarArr, this, i3, i, iArr));
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f33961a.hashCode() * 31);
    }

    @Override // a.lhg0
    public final long i(int i, int i2, int i3, boolean z) {
        return !z ? r4e.a(i, i2, 0, i3) : lgb.O(i, i2, 0, i3);
    }

    @Override // a.lhg0
    public final int j(pu90 pu90Var) {
        return pu90Var.b;
    }

    public final String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.f33961a + ", verticalAlignment=" + this.b + Separators.RPAREN;
    }
}
