package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class o01 implements b11 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24398a;

    public o01(int i) {
        this.f24398a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o01) && this.f24398a == ((o01) obj).f24398a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f24398a);
    }

    public final String toString() {
        return ua80.e(this.f24398a, "OnBonusExpired(bonusId=", Separators.RPAREN);
    }
}
