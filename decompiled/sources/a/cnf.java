package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class cnf implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4651a;

    public final boolean equals(Object obj) {
        if (obj instanceof cnf) {
            return this.f4651a == ((cnf) obj).f4651a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f4651a);
    }

    public final String toString() {
        return ua80.e(this.f4651a, "RoleBackground(value=", Separators.RPAREN);
    }
}
