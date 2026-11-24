package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class cua0 implements fua0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f4979a;

    public cua0(Throwable th) {
        this.f4979a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cua0) && this.f4979a.equals(((cua0) obj).f4979a);
    }

    public final int hashCode() {
        return this.f4979a.hashCode();
    }

    public final String toString() {
        return ohs0.q("Error(error=", Separators.RPAREN, this.f4979a);
    }
}
