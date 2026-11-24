package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class is8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f15291a;
    public final os8 b;

    public is8(boolean z, os8 os8Var) {
        this.f15291a = z;
        this.b = os8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof is8)) {
            return false;
        }
        is8 is8Var = (is8) obj;
        return this.f15291a == is8Var.f15291a && this.b.equals(is8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.f15291a) * 31);
    }

    public final String toString() {
        return "ColumnConfiguration(isPaged=" + this.f15291a + ", horizontalPageOffset=" + this.b + Separators.RPAREN;
    }
}
