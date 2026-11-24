package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ytd0 implements mud0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f43213a;

    public final boolean equals(Object obj) {
        if (obj instanceof ytd0) {
            return this.f43213a == ((ytd0) obj).f43213a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f43213a);
    }

    public final String toString() {
        return ua80.e(this.f43213a, "OnDrawRoundStatisticCount(value=", Separators.RPAREN);
    }
}
