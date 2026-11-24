package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class tc2 implements uc2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f33698a;

    public final boolean equals(Object obj) {
        if (obj instanceof tc2) {
            return this.f33698a == ((tc2) obj).f33698a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f33698a);
    }

    public final String toString() {
        return axq.h(this.f33698a, "OnSelectSport(values=", Separators.RPAREN);
    }
}
