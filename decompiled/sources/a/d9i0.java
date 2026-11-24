package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class d9i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f5702a;
    public final String b;

    public d9i0(long j, String str) {
        this.f5702a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d9i0)) {
            return false;
        }
        d9i0 d9i0Var = (d9i0) obj;
        return this.f5702a == d9i0Var.f5702a && this.b.equals(d9i0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f5702a) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f5702a, "SelfExclusionSelectedValueModel(limitValue=", ", limitMeasure=", this.b);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
