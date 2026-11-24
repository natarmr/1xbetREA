package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class wmc implements xmc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39399a;

    public wmc(int i) {
        this.f39399a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wmc) && this.f39399a == ((wmc) obj).f39399a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f39399a);
    }

    public final String toString() {
        return ua80.e(this.f39399a, "OnSelectTab(index=", Separators.RPAREN);
    }
}
