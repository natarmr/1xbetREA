package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class z4c0 implements g5c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f43764a;

    public /* synthetic */ z4c0(int i) {
        this.f43764a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof z4c0) {
            return this.f43764a == ((z4c0) obj).f43764a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f43764a);
    }

    public final String toString() {
        return ua80.e(this.f43764a, "PromoBalance(value=", Separators.RPAREN);
    }
}
