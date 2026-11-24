package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class syw implements uyw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f33043a;

    public final boolean equals(Object obj) {
        if (obj instanceof syw) {
            return this.f33043a == ((syw) obj).f33043a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f33043a);
    }

    public final String toString() {
        return ua80.e(this.f33043a, "ResImage(imageRes=", Separators.RPAREN);
    }
}
