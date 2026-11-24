package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class bhp implements dhp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2619a;

    public bhp(int i) {
        this.f2619a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bhp) && this.f2619a == ((bhp) obj).f2619a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f2619a);
    }

    public final String toString() {
        return ua80.e(this.f2619a, "OnItemClick(type=", Separators.RPAREN);
    }
}
