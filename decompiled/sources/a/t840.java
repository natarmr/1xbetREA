package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class t840 implements z840 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33496a;

    public t840(String str) {
        this.f33496a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t840) && this.f33496a.equals(((t840) obj).f33496a);
    }

    public final int hashCode() {
        return this.f33496a.hashCode();
    }

    public final String toString() {
        return kng0.l("CopyPromoCode(promoCode=", this.f33496a, Separators.RPAREN);
    }
}
