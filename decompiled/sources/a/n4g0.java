package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class n4g0 implements z4g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f22897a;

    public n4g0(mdm mdmVar) {
        this.f22897a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n4g0) && this.f22897a.equals(((n4g0) obj).f22897a);
    }

    public final int hashCode() {
        return this.f22897a.hashCode();
    }

    public final String toString() {
        return b1j.j("Empty(config=", this.f22897a, Separators.RPAREN);
    }
}
