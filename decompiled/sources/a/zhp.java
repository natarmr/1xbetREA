package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class zhp implements dip {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f44405a;

    public zhp(Throwable th) {
        this.f44405a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zhp) && this.f44405a.equals(((zhp) obj).f44405a);
    }

    public final int hashCode() {
        return this.f44405a.hashCode();
    }

    public final String toString() {
        return ohs0.q("Error(error=", Separators.RPAREN, this.f44405a);
    }
}
