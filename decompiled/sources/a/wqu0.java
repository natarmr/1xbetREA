package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class wqu0 implements xqu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39610a;

    public final boolean equals(Object obj) {
        if (obj instanceof wqu0) {
            return this.f39610a.equals(((wqu0) obj).f39610a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f39610a.hashCode();
    }

    public final String toString() {
        return kng0.l("SearchTextChanged(searchText=", this.f39610a, Separators.RPAREN);
    }
}
