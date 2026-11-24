package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class rgt implements vgt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f30454a;

    public final boolean equals(Object obj) {
        if (obj instanceof rgt) {
            return this.f30454a == ((rgt) obj).f30454a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f30454a);
    }

    public final String toString() {
        return axq.h(this.f30454a, "OnTypeOutcomeChipClick(id=", Separators.RPAREN);
    }
}
