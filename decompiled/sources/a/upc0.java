package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class upc0 implements vpc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36059a;

    public upc0(String str) {
        this.f36059a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof upc0) && this.f36059a.equals(((upc0) obj).f36059a);
    }

    @Override // a.vpc0
    public final String getTitle() {
        return this.f36059a;
    }

    public final int hashCode() {
        return this.f36059a.hashCode();
    }

    public final String toString() {
        return kng0.l("Shimmer(title=", this.f36059a, Separators.RPAREN);
    }
}
