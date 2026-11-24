package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class zeu implements cfu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f44269a;

    public zeu(Throwable th) {
        this.f44269a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zeu) && this.f44269a.equals(((zeu) obj).f44269a);
    }

    public final int hashCode() {
        return this.f44269a.hashCode();
    }

    public final String toString() {
        return ohs0.q("ClientError(error=", Separators.RPAREN, this.f44269a);
    }
}
