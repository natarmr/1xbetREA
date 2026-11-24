package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class jnc implements nnc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16805a;

    public jnc(String str) {
        this.f16805a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jnc) && this.f16805a.equals(((jnc) obj).f16805a);
    }

    public final int hashCode() {
        return this.f16805a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnFavoriteSearchQuery(value=", this.f16805a, Separators.RPAREN);
    }
}
