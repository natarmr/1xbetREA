package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class l1t implements n1t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19274a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final w3w0 e;
    public final boolean f;

    public l1t(String str, String str2, boolean z, boolean z2, w3w0 w3w0Var, boolean z3) {
        this.f19274a = str;
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
        if (!(obj instanceof l1t)) {
            return false;
        }
        l1t l1tVar = (l1t) obj;
        return this.f19274a.equals(l1tVar.f19274a) && this.b.equals(l1tVar.b) && this.c == l1tVar.c && this.d == l1tVar.d && this.e == l1tVar.e && this.f == l1tVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + brm0.e(brm0.e(ua80.b(this.f19274a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("BroadcastingManage(playZoneJavaScriptCommand=", this.f19274a, ", changeZoneFormatJavaScriptCommand=", this.b, ", isBroadcastingRun=");
        ua80.u(", isControlPanelVisible=", ", zoneFormatType=", sbN, this.c, this.d);
        sbN.append(this.e);
        sbN.append(", zoneFormatVisible=");
        sbN.append(this.f);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
