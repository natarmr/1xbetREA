package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class d6s implements f6s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5566a;

    public final boolean equals(Object obj) {
        if (obj instanceof d6s) {
            return this.f5566a == ((d6s) obj).f5566a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f5566a);
    }

    public final String toString() {
        return ua80.e(this.f5566a, "Count(value=", Separators.RPAREN);
    }
}
