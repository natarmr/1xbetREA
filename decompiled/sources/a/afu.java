package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class afu implements cfu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f796a;

    public afu(Throwable th) {
        this.f796a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof afu) && this.f796a.equals(((afu) obj).f796a);
    }

    public final int hashCode() {
        return this.f796a.hashCode();
    }

    public final String toString() {
        return ohs0.q("Failure(error=", Separators.RPAREN, this.f796a);
    }
}
