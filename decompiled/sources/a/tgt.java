package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class tgt implements vgt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f33929a;

    public final boolean equals(Object obj) {
        if (obj instanceof tgt) {
            return this.f33929a == ((tgt) obj).f33929a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f33929a);
    }

    public final String toString() {
        return axq.h(this.f33929a, "OnTypeSportChipClick(id=", Separators.RPAREN);
    }
}
