package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class vi40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37459a;
    public final int b;

    public vi40(int i, int i2) {
        this.f37459a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vi40)) {
            return false;
        }
        vi40 vi40Var = (vi40) obj;
        return this.f37459a == vi40Var.f37459a && this.b == vi40Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.f37459a) * 31);
    }

    public final String toString() {
        return ohs0.m("MlbbGoldHistoryModel(value=", this.f37459a, ", seconds=", Separators.RPAREN, this.b);
    }
}
