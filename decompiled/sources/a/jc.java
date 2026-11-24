package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class jc implements kc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hc f16253a;

    public jc(hc hcVar) {
        this.f16253a = hcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jc) && this.f16253a == ((jc) obj).f16253a;
    }

    public final int hashCode() {
        return this.f16253a.hashCode();
    }

    public final String toString() {
        return "OnActionClick(type=" + this.f16253a + Separators.RPAREN;
    }
}
