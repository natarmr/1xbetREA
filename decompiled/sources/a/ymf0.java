package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ymf0 implements enf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f42886a;

    public ymf0(Throwable th) {
        this.f42886a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ymf0) && this.f42886a.equals(((ymf0) obj).f42886a);
    }

    public final int hashCode() {
        return this.f42886a.hashCode();
    }

    public final String toString() {
        return ohs0.q("Error(error=", Separators.RPAREN, this.f42886a);
    }
}
