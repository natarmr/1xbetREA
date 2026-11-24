package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class s350 implements j450 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31540a;

    public s350(String str) {
        this.f31540a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s350) && this.f31540a.equals(((s350) obj).f31540a);
    }

    public final int hashCode() {
        return this.f31540a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnClickPromoButton(id=", this.f31540a, Separators.RPAREN);
    }
}
