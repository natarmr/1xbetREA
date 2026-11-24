package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class khh0 implements whh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f18293a;

    public khh0(Throwable th) {
        this.f18293a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof khh0) && this.f18293a.equals(((khh0) obj).f18293a);
    }

    public final int hashCode() {
        return this.f18293a.hashCode();
    }

    public final String toString() {
        return ohs0.q("Error(error=", Separators.RPAREN, this.f18293a);
    }
}
