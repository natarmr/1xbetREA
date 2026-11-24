package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class bo50 implements mo50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2915a;

    public bo50(int i) {
        this.f2915a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bo50) && this.f2915a == ((bo50) obj).f2915a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f2915a);
    }

    public final String toString() {
        return ua80.e(this.f2915a, "OnPagerInteractionFinish(newPageIndex=", Separators.RPAREN);
    }
}
