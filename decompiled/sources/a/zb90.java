package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class zb90 implements cc90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44105a;

    public /* synthetic */ zb90(String str) {
        this.f44105a = str;
    }

    @Override // a.cc90
    public final String a() {
        return this.f44105a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zb90) {
            return this.f44105a.equals(((zb90) obj).f44105a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f44105a.hashCode();
    }

    public final String toString() {
        return kng0.l("Inactive(penaltyNumber=", this.f44105a, Separators.RPAREN);
    }
}
