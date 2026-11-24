package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ax30 implements kx30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1605a;

    public ax30(String str) {
        this.f1605a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ax30) && this.f1605a.equals(((ax30) obj).f1605a);
    }

    public final int hashCode() {
        return this.f1605a.hashCode();
    }

    public final String toString() {
        return kng0.l("FullSale(betId=", this.f1605a, Separators.RPAREN);
    }
}
