package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ae7 implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f714a;

    public final boolean equals(Object obj) {
        if (obj instanceof ae7) {
            return this.f714a == ((ae7) obj).f714a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f714a);
    }

    public final String toString() {
        return ua80.e(this.f714a, "IsBlockedIcon(value=", Separators.RPAREN);
    }
}
