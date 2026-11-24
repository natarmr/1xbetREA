package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class zqk0 implements ork0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f44812a;

    public zqk0(int i) {
        this.f44812a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zqk0) && this.f44812a == ((zqk0) obj).f44812a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f44812a);
    }

    public final String toString() {
        return ua80.e(this.f44812a, "OnPromotionClick(promotionId=", Separators.RPAREN);
    }
}
