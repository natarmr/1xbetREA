package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ej7 implements mj7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7893a;

    public final boolean equals(Object obj) {
        if (obj instanceof ej7) {
            return this.f7893a.equals(((ej7) obj).f7893a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7893a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnSaleConfirmed(betId=", this.f7893a, Separators.RPAREN);
    }
}
