package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class tcb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f33712a;

    public final boolean equals(Object obj) {
        if (obj instanceof tcb) {
            return this.f33712a == ((tcb) obj).f33712a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f33712a);
    }

    public final String toString() {
        return axq.h(this.f33712a, "SportId(sportId=", Separators.RPAREN);
    }
}
