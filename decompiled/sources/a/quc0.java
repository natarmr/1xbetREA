package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class quc0 implements suc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29340a;

    public quc0(String str) {
        this.f29340a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof quc0) && this.f29340a.equals(((quc0) obj).f29340a);
    }

    public final int hashCode() {
        return this.f29340a.hashCode();
    }

    public final String toString() {
        return kng0.l("PromoItem(promoItemDescription=", this.f29340a, Separators.RPAREN);
    }
}
