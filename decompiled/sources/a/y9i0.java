package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class y9i0 implements aai0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f9i0 f42248a;

    public y9i0(f9i0 f9i0Var) {
        f9i0Var.getClass();
        this.f42248a = f9i0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y9i0) && this.f42248a == ((y9i0) obj).f42248a;
    }

    public final int hashCode() {
        return this.f42248a.hashCode();
    }

    public final String toString() {
        return "Chosen(limitTypeValue=" + this.f42248a + Separators.RPAREN;
    }
}
