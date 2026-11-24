package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class i7p0 implements j7p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f14303a;

    public i7p0(mdm mdmVar) {
        this.f14303a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i7p0) && this.f14303a.equals(((i7p0) obj).f14303a);
    }

    public final int hashCode() {
        return this.f14303a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(errorConfig=", this.f14303a, Separators.RPAREN);
    }
}
