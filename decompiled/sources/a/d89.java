package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class d89 implements f89 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5635a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final w3w0 e;
    public final boolean f;

    public d89(String str, String str2, boolean z, boolean z2, w3w0 w3w0Var, boolean z3) {
        this.f5635a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
        this.e = w3w0Var;
        this.f = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d89)) {
            return false;
        }
        d89 d89Var = (d89) obj;
        return this.f5635a.equals(d89Var.f5635a) && this.b.equals(d89Var.b) && this.c == d89Var.c && this.d == d89Var.d && this.e == d89Var.e && this.f == d89Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + brm0.e(brm0.e(ua80.b(this.f5635a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("BroadcastingManage(playZoneJavaScriptCommand=", this.f5635a, ", changeZoneFormatJavaScriptCommand=", this.b, ", isBroadcastingRun=");
        ua80.u(", isControlPanelVisible=", ", zoneFormatType=", sbN, this.c, this.d);
        sbN.append(this.e);
        sbN.append(", zoneFormatVisible=");
        sbN.append(this.f);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
