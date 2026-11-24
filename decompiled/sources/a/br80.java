package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class br80 implements lr80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f3067a;

    public br80(long j) {
        this.f3067a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof br80) && this.f3067a == ((br80) obj).f3067a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f3067a);
    }

    public final String toString() {
        return axq.h(this.f3067a, "OnChipClick(chipId=", Separators.RPAREN);
    }
}
