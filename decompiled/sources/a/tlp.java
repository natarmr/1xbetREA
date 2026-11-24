package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class tlp implements xlp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f34157a;

    public tlp(mdm mdmVar) {
        this.f34157a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tlp) && this.f34157a.equals(((tlp) obj).f34157a);
    }

    public final int hashCode() {
        return this.f34157a.hashCode();
    }

    public final String toString() {
        return b1j.j("EmptyView(lottieConfig=", this.f34157a, Separators.RPAREN);
    }
}
