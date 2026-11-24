package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class b940 implements d940 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f2189a;

    public b940(Throwable th) {
        this.f2189a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b940) && this.f2189a.equals(((b940) obj).f2189a);
    }

    public final int hashCode() {
        return this.f2189a.hashCode();
    }

    public final String toString() {
        return ohs0.q("Error(error=", Separators.RPAREN, this.f2189a);
    }
}
