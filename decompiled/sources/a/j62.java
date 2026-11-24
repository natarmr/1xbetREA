package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class j62 implements s62 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f15963a;

    public j62(long j) {
        this.f15963a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j62) && this.f15963a == ((j62) obj).f15963a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f15963a);
    }

    public final String toString() {
        return axq.h(this.f15963a, "OnExpandedChamp(id=", Separators.RPAREN);
    }
}
