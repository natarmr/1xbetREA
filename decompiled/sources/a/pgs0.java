package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class pgs0 implements sgs0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f26966a;

    public pgs0(mdm mdmVar) {
        this.f26966a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pgs0) && this.f26966a.equals(((pgs0) obj).f26966a);
    }

    public final int hashCode() {
        return this.f26966a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(lottieConfigurator=", this.f26966a, Separators.RPAREN);
    }
}
