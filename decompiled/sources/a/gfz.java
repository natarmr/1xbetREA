package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class gfz implements qfz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11228a;

    public gfz(long j) {
        this.f11228a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gfz) && this.f11228a == ((gfz) obj).f11228a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f11228a);
    }

    public final String toString() {
        return axq.h(this.f11228a, "OnChipClick(id=", Separators.RPAREN);
    }
}
