package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class a8b0 implements b8b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f419a;
    public final boolean b;

    public a8b0(int i, boolean z) {
        this.f419a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a8b0)) {
            return false;
        }
        a8b0 a8b0Var = (a8b0) obj;
        return this.f419a == a8b0Var.f419a && this.b == a8b0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.f419a) * 31);
    }

    public final String toString() {
        return rz4.i(this.f419a, "ShowClassicMinAgeAlertEvent(minAge=", ", sectionAggregator=", Separators.RPAREN, this.b);
    }
}
