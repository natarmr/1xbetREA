package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class f8p0 implements m8p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f9119a;

    public f8p0(long j) {
        this.f9119a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f8p0) && this.f9119a == ((f8p0) obj).f9119a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f9119a);
    }

    public final String toString() {
        return axq.h(this.f9119a, "OnOtherSquadClick(id=", Separators.RPAREN);
    }
}
