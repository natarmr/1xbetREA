package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class mqp0 implements qqp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f22236a;

    public mqp0(Throwable th) {
        this.f22236a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mqp0) && this.f22236a.equals(((mqp0) obj).f22236a);
    }

    public final int hashCode() {
        return this.f22236a.hashCode();
    }

    public final String toString() {
        return ohs0.q("Failure(throwable=", Separators.RPAREN, this.f22236a);
    }
}
