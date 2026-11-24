package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class unf implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35958a;

    public final boolean equals(Object obj) {
        if (obj instanceof unf) {
            return this.f35958a == ((unf) obj).f35958a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f35958a);
    }

    public final String toString() {
        return ua80.e(this.f35958a, "RoleBackground(value=", Separators.RPAREN);
    }
}
