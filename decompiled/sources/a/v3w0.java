package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class v3w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f36751a;
    public final boolean b;
    public final w3w0 c;
    public final boolean d;

    public v3w0(boolean z, boolean z2, w3w0 w3w0Var, boolean z3) {
        this.f36751a = z;
        this.b = z2;
        this.c = w3w0Var;
        this.d = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v3w0)) {
            return false;
        }
        v3w0 v3w0Var = (v3w0) obj;
        return this.f36751a == v3w0Var.f36751a && this.b == v3w0Var.b && this.c == v3w0Var.c && this.d == v3w0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + brm0.e(Boolean.hashCode(this.f36751a) * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("ZoneControlPanelUiModel(isVisible=", ", isBroadcastingRun=", ", zoneFormatType=", this.f36751a, this.b);
        sbQ.append(this.c);
        sbQ.append(", zoneFormatVisible=");
        sbQ.append(this.d);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
