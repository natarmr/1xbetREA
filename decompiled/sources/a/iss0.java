package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class iss0 implements jss0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f15321a;

    public iss0(long j) {
        this.f15321a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iss0) && this.f15321a == ((iss0) obj).f15321a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f15321a);
    }

    public final String toString() {
        return axq.h(this.f15321a, "OnSelectChip(id=", Separators.RPAREN);
    }
}
