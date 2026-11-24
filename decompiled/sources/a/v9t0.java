package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class v9t0 implements w9t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f37051a;

    public v9t0(mdm mdmVar) {
        this.f37051a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v9t0) && this.f37051a.equals(((v9t0) obj).f37051a);
    }

    public final int hashCode() {
        return this.f37051a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(errorConfig=", this.f37051a, Separators.RPAREN);
    }
}
