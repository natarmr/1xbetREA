package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class y3w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41973a;
    public final boolean b;
    public final String c;
    public final String d;
    public final w3w0 e;
    public final w3w0 f;

    public y3w0(String str, boolean z, String str2, String str3, w3w0 w3w0Var, w3w0 w3w0Var2) {
        str2.getClass();
        str3.getClass();
        this.f41973a = str;
        this.b = z;
        this.c = str2;
        this.d = str3;
        this.e = w3w0Var;
        this.f = w3w0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y3w0)) {
            return false;
        }
        y3w0 y3w0Var = (y3w0) obj;
        return this.f41973a.equals(y3w0Var.f41973a) && this.b == y3w0Var.b && Intrinsics.d(this.c, y3w0Var.c) && Intrinsics.d(this.d, y3w0Var.d) && this.e == y3w0Var.e && this.f == y3w0Var.f;
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ua80.b(ua80.b(brm0.e(this.f41973a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31);
    }

    public final String toString() {
        StringBuilder sbU = brm0.u("ZonePlayerUiModel(url=", this.f41973a, ", isPageLoaded=", this.b, ", playZoneJavaScriptCommand=");
        f140.v(sbU, this.c, ", changeZoneFormatJavaScriptCommand=", this.d, ", zoneFormatType=");
        sbU.append(this.e);
        sbU.append(", pageZoneFormatType=");
        sbU.append(this.f);
        sbU.append(Separators.RPAREN);
        return sbU.toString();
    }
}
