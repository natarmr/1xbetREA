package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class nk8 implements sk8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23669a;

    public nk8(int i) {
        this.f23669a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nk8) && this.f23669a == ((nk8) obj).f23669a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f23669a);
    }

    public final String toString() {
        return ua80.e(this.f23669a, "OnClaimBonus(bonusId=", Separators.RPAREN);
    }
}
