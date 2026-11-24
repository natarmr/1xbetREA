package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class t1q extends j2q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f33179a;

    public t1q(long j) {
        this.f33179a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t1q) && this.f33179a == ((t1q) obj).f33179a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f33179a) + (Boolean.hashCode(true) * 31);
    }

    public final String toString() {
        return axq.h(this.f33179a, "PasswordTime(isRequired=true, time=", Separators.RPAREN);
    }
}
