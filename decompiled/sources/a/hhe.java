package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class hhe implements gie {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f13059a;

    public hhe(Throwable th) {
        this.f13059a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hhe) && this.f13059a.equals(((hhe) obj).f13059a);
    }

    public final int hashCode() {
        return this.f13059a.hashCode();
    }

    public final String toString() {
        return ohs0.q("Error(error=", Separators.RPAREN, this.f13059a);
    }
}
