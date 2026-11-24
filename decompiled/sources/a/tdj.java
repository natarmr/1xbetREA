package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class tdj implements wdj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f33771a;

    public tdj(long j) {
        this.f33771a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tdj) && this.f33771a == ((tdj) obj).f33771a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f33771a);
    }

    public final String toString() {
        return axq.h(this.f33771a, "Day(startDate=", Separators.RPAREN);
    }
}
