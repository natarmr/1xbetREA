package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ext0 implements lxt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8595a;

    public final boolean equals(Object obj) {
        if (obj instanceof ext0) {
            return this.f8595a == ((ext0) obj).f8595a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f8595a);
    }

    public final String toString() {
        return ua80.e(this.f8595a, "OnRoundStatisticCount(value=", Separators.RPAREN);
    }
}
