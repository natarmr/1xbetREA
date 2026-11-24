package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ngg implements ogg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f23484a;

    public ngg(mdm mdmVar) {
        this.f23484a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ngg) && this.f23484a.equals(((ngg) obj).f23484a);
    }

    public final int hashCode() {
        return this.f23484a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(config=", this.f23484a, Separators.RPAREN);
    }
}
