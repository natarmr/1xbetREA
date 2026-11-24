package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class wb90 implements dc90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38865a;

    @Override // a.dc90
    public final String a() {
        return this.f38865a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wb90) {
            return this.f38865a.equals(((wb90) obj).f38865a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f38865a.hashCode();
    }

    public final String toString() {
        return kng0.l("Active(penaltyNumber=", this.f38865a, Separators.RPAREN);
    }
}
