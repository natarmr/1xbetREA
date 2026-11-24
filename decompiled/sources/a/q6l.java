package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class q6l implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f28203a;

    public final boolean equals(Object obj) {
        if (obj instanceof q6l) {
            return this.f28203a == ((q6l) obj).f28203a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f28203a);
    }

    public final String toString() {
        return axq.h(this.f28203a, "AegisTime(value=", Separators.RPAREN);
    }
}
