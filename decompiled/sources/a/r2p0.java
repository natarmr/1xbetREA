package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class r2p0 implements t2p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f29748a;

    public r2p0(mdm mdmVar) {
        this.f29748a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r2p0) && this.f29748a.equals(((r2p0) obj).f29748a);
    }

    public final int hashCode() {
        return this.f29748a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(lottieConfig=", this.f29748a, Separators.RPAREN);
    }
}
