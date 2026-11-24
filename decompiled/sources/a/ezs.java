package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ezs implements hzs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f8684a;
    public final boolean b;
    public final boolean c;

    public ezs(boolean z, boolean z2, boolean z3) {
        this.f8684a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ezs)) {
            return false;
        }
        ezs ezsVar = (ezs) obj;
        return this.f8684a == ezsVar.f8684a && this.b == ezsVar.b && this.c == ezsVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + brm0.e(Boolean.hashCode(this.f8684a) * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.p(f140.q("BroadcastingManage(isBroadcastingRun=", ", isControlPanelVisible=", ", isSoundEnabled=", this.f8684a, this.b), this.c, Separators.RPAREN);
    }
}
