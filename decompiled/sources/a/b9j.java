package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class b9j implements g9j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2212a;

    public final boolean equals(Object obj) {
        if (obj instanceof b9j) {
            return this.f2212a.equals(((b9j) obj).f2212a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2212a.hashCode();
    }

    public final String toString() {
        return kng0.l("SecondPlayerNumberOfThrow(value=", this.f2212a, Separators.RPAREN);
    }
}
