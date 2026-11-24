package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class nq70 implements pq70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23947a;

    public final boolean equals(Object obj) {
        if (obj instanceof nq70) {
            return this.f23947a == ((nq70) obj).f23947a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f23947a);
    }

    public final String toString() {
        return ua80.e(this.f23947a, "SelectLanguage(id=", Separators.RPAREN);
    }
}
