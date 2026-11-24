package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ijh extends jjh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f14873a;

    public ijh(mdm mdmVar) {
        this.f14873a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ijh) && this.f14873a.equals(((ijh) obj).f14873a);
    }

    public final int hashCode() {
        return this.f14873a.hashCode();
    }

    public final String toString() {
        return b1j.j("Loading(loadingConfig=", this.f14873a, Separators.RPAREN);
    }
}
