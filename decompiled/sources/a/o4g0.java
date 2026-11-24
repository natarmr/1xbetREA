package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class o4g0 implements x4g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f24634a;

    public o4g0(mdm mdmVar) {
        this.f24634a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o4g0) && this.f24634a.equals(((o4g0) obj).f24634a);
    }

    public final int hashCode() {
        return this.f24634a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(config=", this.f24634a, Separators.RPAREN);
    }
}
