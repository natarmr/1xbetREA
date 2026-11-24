package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class d5c0 implements g5c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5499a;

    public final boolean equals(Object obj) {
        if (obj instanceof d5c0) {
            return this.f5499a.equals(((d5c0) obj).f5499a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5499a.hashCode();
    }

    public final String toString() {
        return kng0.l("PromoUnit(value=", this.f5499a, Separators.RPAREN);
    }
}
