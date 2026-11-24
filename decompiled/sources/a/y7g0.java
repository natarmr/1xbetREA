package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class y7g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f42150a;
    public final ArrayList b;
    public final ArrayList c;
    public final n6g0 d;

    public y7g0(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, n6g0 n6g0Var) {
        this.f42150a = arrayList;
        this.b = arrayList2;
        this.c = arrayList3;
        this.d = n6g0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y7g0)) {
            return false;
        }
        y7g0 y7g0Var = (y7g0) obj;
        return this.f42150a.equals(y7g0Var.f42150a) && this.b.equals(y7g0Var.b) && this.c.equals(y7g0Var.c) && this.d.equals(y7g0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + twn.g(this.c, twn.g(this.b, this.f42150a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "ResultsGridTableUiModel(columnHeaderList=" + this.f42150a + ", cellList=" + this.b + ", rowHeaderList=" + this.c + ", cornerCell=" + this.d + Separators.RPAREN;
    }
}
