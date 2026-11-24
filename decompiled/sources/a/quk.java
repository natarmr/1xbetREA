package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class quk extends ruk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jkm f29350a;

    public quk(jkm jkmVar) {
        this.f29350a = jkmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof quk) && this.f29350a.equals(((quk) obj).f29350a);
    }

    public final int hashCode() {
        return this.f29350a.hashCode();
    }

    public final String toString() {
        return twn.o("Empty(lottieConfig=", this.f29350a, Separators.RPAREN);
    }
}
