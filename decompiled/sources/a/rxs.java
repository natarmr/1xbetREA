package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class rxs implements txs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f31280a;
    public final boolean b;
    public final boolean c;

    public rxs(boolean z, boolean z2, boolean z3) {
        this.f31280a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rxs)) {
            return false;
        }
        rxs rxsVar = (rxs) obj;
        return this.f31280a == rxsVar.f31280a && this.b == rxsVar.b && this.c == rxsVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + brm0.e(Boolean.hashCode(this.f31280a) * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.p(f140.q("BroadcastingManage(isBroadcastingRun=", ", isControlPanelVisible=", ", isSoundEnable=", this.f31280a, this.b), this.c, Separators.RPAREN);
    }
}
