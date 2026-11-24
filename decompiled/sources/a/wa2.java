package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class wa2 implements za2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f38808a;

    public wa2(Throwable th) {
        this.f38808a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wa2) && this.f38808a.equals(((wa2) obj).f38808a);
    }

    public final int hashCode() {
        return this.f38808a.hashCode();
    }

    public final String toString() {
        return ohs0.q("Error(error=", Separators.RPAREN, this.f38808a);
    }
}
