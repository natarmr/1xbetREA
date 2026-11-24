package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class n740 implements v740 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23024a;

    public n740(String str) {
        this.f23024a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n740) && this.f23024a.equals(((n740) obj).f23024a);
    }

    public final int hashCode() {
        return this.f23024a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnCopyPromoCodeClick(promoCode=", this.f23024a, Separators.RPAREN);
    }
}
