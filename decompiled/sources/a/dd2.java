package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class dd2 implements fd2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ik00 f5874a;
    public final boolean b;

    public dd2(ik00 ik00Var, boolean z) {
        this.f5874a = ik00Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dd2)) {
            return false;
        }
        dd2 dd2Var = (dd2) obj;
        return this.f5874a.equals(dd2Var.f5874a) && this.b == dd2Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f5874a.hashCode() * 31);
    }

    public final String toString() {
        return "MediumItemsSpaceSeparator(liveResultUiState=" + this.f5874a + ", isRefreshing=" + this.b + Separators.RPAREN;
    }
}
