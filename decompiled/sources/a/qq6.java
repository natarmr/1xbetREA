package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class qq6 implements sq6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f29151a;

    public qq6(long j) {
        this.f29151a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qq6) && this.f29151a == ((qq6) obj).f29151a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f29151a);
    }

    public final String toString() {
        return axq.h(this.f29151a, "OnTabSelected(position=", Separators.RPAREN);
    }
}
