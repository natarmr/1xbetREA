package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class m6e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21266a;
    public final ArrayList b;

    public m6e0(int i, ArrayList arrayList) {
        this.f21266a = i;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m6e0)) {
            return false;
        }
        m6e0 m6e0Var = (m6e0) obj;
        return this.f21266a == m6e0Var.f21266a && this.b.equals(m6e0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f21266a) * 31);
    }

    public final String toString() {
        return "RatingRowModel(rowPosition=" + this.f21266a + ", rowCells=" + this.b + Separators.RPAREN;
    }
}
