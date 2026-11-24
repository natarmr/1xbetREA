package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class rj4 implements sj4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f30573a;

    public final boolean equals(Object obj) {
        if (obj instanceof rj4) {
            return this.f30573a == ((rj4) obj).f30573a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f30573a);
    }

    public final String toString() {
        return ua80.e(this.f30573a, "ShowLoginBySocialDialog(social=", Separators.RPAREN);
    }
}
