package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class g01 implements b11 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10437a;

    public g01(int i) {
        this.f10437a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g01) && this.f10437a == ((g01) obj).f10437a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f10437a);
    }

    public final String toString() {
        return ua80.e(this.f10437a, "OnDeleteBonusClick(giftId=", Separators.RPAREN);
    }
}
