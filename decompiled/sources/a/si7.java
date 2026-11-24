package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class si7 implements mj7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32249a;

    public final boolean equals(Object obj) {
        if (obj instanceof si7) {
            return this.f32249a.equals(((si7) obj).f32249a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f32249a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnHideHistoryAfterSale(betId=", this.f32249a, Separators.RPAREN);
    }
}
