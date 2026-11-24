package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class n2f implements o2f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22796a;

    public n2f(String str) {
        this.f22796a = str;
    }

    @Override // a.o2f
    public final String a() {
        return this.f22796a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n2f) && this.f22796a.equals(((n2f) obj).f22796a);
    }

    public final int hashCode() {
        return this.f22796a.hashCode();
    }

    public final String toString() {
        return kng0.l("TotoBet(segmentTitle=", this.f22796a, Separators.RPAREN);
    }
}
