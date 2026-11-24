package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class fx30 implements kx30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10290a;

    public fx30(String str) {
        this.f10290a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fx30) && this.f10290a.equals(((fx30) obj).f10290a);
    }

    public final int hashCode() {
        return this.f10290a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowCouponReplaceDialog(betId=", this.f10290a, Separators.RPAREN);
    }
}
