package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class sz6 extends xz6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f33055a;

    public sz6(Throwable th) {
        this.f33055a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sz6) && this.f33055a.equals(((sz6) obj).f33055a);
    }

    public final int hashCode() {
        return this.f33055a.hashCode();
    }

    public final String toString() {
        return ohs0.q("ShowInsufficientError(throwable=", Separators.RPAREN, this.f33055a);
    }
}
