package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class q4g0 implements z4g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f28096a;

    public q4g0(mdm mdmVar) {
        this.f28096a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q4g0) && this.f28096a.equals(((q4g0) obj).f28096a);
    }

    public final int hashCode() {
        return this.f28096a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(config=", this.f28096a, Separators.RPAREN);
    }
}
