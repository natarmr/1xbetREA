package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class u0t implements w0t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34871a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final w3w0 e;
    public final boolean f;

    public u0t(String str, String str2, boolean z, boolean z2, w3w0 w3w0Var, boolean z3) {
        this.f34871a = str;
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
        if (!(obj instanceof u0t)) {
            return false;
        }
        u0t u0tVar = (u0t) obj;
        return this.f34871a.equals(u0tVar.f34871a) && this.b.equals(u0tVar.b) && this.c == u0tVar.c && this.d == u0tVar.d && this.e == u0tVar.e && this.f == u0tVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + brm0.e(brm0.e(ua80.b(this.f34871a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("BroadcastingManage(playZoneJavaScriptCommand=", this.f34871a, ", changeZoneFormatJavaScriptCommand=", this.b, ", isBroadcastingRun=");
        ua80.u(", isControlPanelVisible=", ", zoneFormatType=", sbN, this.c, this.d);
        sbN.append(this.e);
        sbN.append(", zoneFormatVisible=");
        sbN.append(this.f);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
