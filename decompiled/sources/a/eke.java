package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class eke {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f7947a;
    public final boolean b;
    public final boolean c;

    public eke(boolean z, boolean z2, boolean z3) {
        this.f7947a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eke)) {
            return false;
        }
        eke ekeVar = (eke) obj;
        return this.f7947a == ekeVar.f7947a && this.b == ekeVar.b && this.c == ekeVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + brm0.e(Boolean.hashCode(this.f7947a) * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.p(f140.q("ControlPanelUiModel(isVisible=", ", isSoundEnable=", ", isBroadcastingRun=", this.f7947a, this.b), this.c, Separators.RPAREN);
    }
}
