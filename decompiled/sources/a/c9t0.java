package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class c9t0 implements d9t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f3978a;

    public c9t0(mdm mdmVar) {
        this.f3978a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c9t0) && this.f3978a.equals(((c9t0) obj).f3978a);
    }

    public final int hashCode() {
        return this.f3978a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(errorConfig=", this.f3978a, Separators.RPAREN);
    }
}
