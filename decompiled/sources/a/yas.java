package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class yas implements dbs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f42315a;

    public yas(long j) {
        this.f42315a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yas) && this.f42315a == ((yas) obj).f42315a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f42315a);
    }

    public final String toString() {
        return axq.h(this.f42315a, "OnChipSelected(id=", Separators.RPAREN);
    }
}
