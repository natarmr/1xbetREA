package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class j1j0 implements o1j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15738a;

    public j1j0(String str) {
        this.f15738a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j1j0) && this.f15738a.equals(((j1j0) obj).f15738a);
    }

    public final int hashCode() {
        return this.f15738a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowServerException(message=", this.f15738a, Separators.RPAREN);
    }
}
