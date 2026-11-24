package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class cd2 implements fd2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ik00 f4140a;
    public final boolean b;

    public cd2(ik00 ik00Var, boolean z) {
        this.f4140a = ik00Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cd2)) {
            return false;
        }
        cd2 cd2Var = (cd2) obj;
        return this.f4140a.equals(cd2Var.f4140a) && this.b == cd2Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f4140a.hashCode() * 31);
    }

    public final String toString() {
        return "MediumItemsLineSeparator(liveResultUiState=" + this.f4140a + ", isRefreshing=" + this.b + Separators.RPAREN;
    }
}
