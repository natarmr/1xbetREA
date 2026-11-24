package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class c72 implements f72 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f3841a;

    public c72(Throwable th) {
        this.f3841a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c72) && this.f3841a.equals(((c72) obj).f3841a);
    }

    public final int hashCode() {
        return this.f3841a.hashCode();
    }

    public final String toString() {
        return ohs0.q("Error(error=", Separators.RPAREN, this.f3841a);
    }
}
