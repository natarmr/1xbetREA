package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class rgb implements sgb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f30424a;

    public rgb(long j) {
        this.f30424a = j;
    }

    @Override // a.sgb
    public final long b() {
        return this.f30424a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rgb) && this.f30424a == ((rgb) obj).f30424a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f30424a);
    }

    public final String toString() {
        return axq.h(this.f30424a, "Sport(champId=", Separators.RPAREN);
    }
}
