package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class u95 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f35266a;
    public final boolean b;

    public u95(boolean z, long j) {
        this.f35266a = j;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u95)) {
            return false;
        }
        u95 u95Var = (u95) obj;
        return this.f35266a == u95Var.f35266a && this.b == u95Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.f35266a) * 31);
    }

    public final String toString() {
        StringBuilder sbR = kng0.r(this.f35266a, "AvailableValueUiModel(value=", ", isSelected=", this.b);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
