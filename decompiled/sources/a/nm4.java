package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class nm4 implements qm4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f23755a;

    public nm4(Throwable th) {
        this.f23755a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nm4) && this.f23755a.equals(((nm4) obj).f23755a);
    }

    public final int hashCode() {
        return this.f23755a.hashCode();
    }

    public final String toString() {
        return ohs0.q("Failure(throwable=", Separators.RPAREN, this.f23755a);
    }
}
