package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ddt implements odt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f5912a;

    public ddt(Throwable th) {
        this.f5912a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ddt) && this.f5912a.equals(((ddt) obj).f5912a);
    }

    public final int hashCode() {
        return this.f5912a.hashCode();
    }

    public final String toString() {
        return ohs0.q("Error(error=", Separators.RPAREN, this.f5912a);
    }
}
