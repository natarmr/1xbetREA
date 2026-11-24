package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class v2g0 implements z2g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f36680a;

    public v2g0(mdm mdmVar) {
        this.f36680a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v2g0) && this.f36680a.equals(((v2g0) obj).f36680a);
    }

    public final int hashCode() {
        return this.f36680a.hashCode();
    }

    public final String toString() {
        return b1j.j("Empty(config=", this.f36680a, Separators.RPAREN);
    }
}
