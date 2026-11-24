package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class k420 implements l520 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jdc0 f17648a;

    public final boolean equals(Object obj) {
        if (obj instanceof k420) {
            return this.f17648a.equals(((k420) obj).f17648a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17648a.hashCode();
    }

    public final String toString() {
        return "OnPromoCodeSelected(promoCodeInfoModel=" + this.f17648a + Separators.RPAREN;
    }
}
