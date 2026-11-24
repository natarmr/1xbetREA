package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class eqv implements lqv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fza0 f8254a;
    public final long b;

    public eqv(long j, fza0 fza0Var) {
        this.f8254a = fza0Var;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eqv)) {
            return false;
        }
        eqv eqvVar = (eqv) obj;
        return this.f8254a == eqvVar.f8254a && this.b == eqvVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.f8254a.hashCode() * 31);
    }

    public final String toString() {
        return "GamesCarousel(popularCategory=" + this.f8254a + ", partitionId=" + this.b + Separators.RPAREN;
    }
}
