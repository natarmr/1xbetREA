package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class v52 implements y52 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f36808a;

    public v52(Throwable th) {
        this.f36808a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v52) && this.f36808a.equals(((v52) obj).f36808a);
    }

    public final int hashCode() {
        return this.f36808a.hashCode();
    }

    public final String toString() {
        return ohs0.q("Error(lastError=", Separators.RPAREN, this.f36808a);
    }
}
