package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class l420 implements l520 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19384a;

    public final boolean equals(Object obj) {
        if (obj instanceof l420) {
            return this.f19384a.equals(((l420) obj).f19384a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f19384a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnPromoCodeValueChanged(promoCode=", this.f19384a, Separators.RPAREN);
    }
}
