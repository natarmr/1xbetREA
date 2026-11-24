package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class rg implements tg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f30409a;

    public final boolean equals(Object obj) {
        if (obj instanceof rg) {
            return this.f30409a == ((rg) obj).f30409a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f30409a);
    }

    public final String toString() {
        return ua80.e(this.f30409a, "IconColorRes(value=", Separators.RPAREN);
    }
}
