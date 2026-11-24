package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class nz6 extends xz6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24358a;

    public nz6(String str) {
        this.f24358a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nz6) && this.f24358a.equals(((nz6) obj).f24358a);
    }

    public final int hashCode() {
        return this.f24358a.hashCode();
    }

    public final String toString() {
        return kng0.l("ChangePurchaseText(text=", this.f24358a, Separators.RPAREN);
    }
}
