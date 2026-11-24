package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ctj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f4939a;
    public final boolean b;

    public ctj(double d, boolean z) {
        this.f4939a = d;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ctj)) {
            return false;
        }
        ctj ctjVar = (ctj) obj;
        return Double.compare(this.f4939a, ctjVar.f4939a) == 0 && this.b == ctjVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Double.hashCode(this.f4939a) * 31);
    }

    public final String toString() {
        return "DefaultBetSumParamsModel(defaultSum=" + this.f4939a + ", isEnabled=" + this.b + Separators.RPAREN;
    }
}
