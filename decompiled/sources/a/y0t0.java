package a;

import android.gov.nist.core.Separators;
import android.javax.sip.header.PriorityHeader;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class y0t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nrq f41824a;
    public final psq b;
    public final int c;
    public final int d;
    public final Object e;

    public y0t0(nrq nrqVar, psq psqVar, int i, int i2, Object obj) {
        this.f41824a = nrqVar;
        this.b = psqVar;
        this.c = i;
        this.d = i2;
        this.e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0t0)) {
            return false;
        }
        y0t0 y0t0Var = (y0t0) obj;
        return Intrinsics.d(this.f41824a, y0t0Var.f41824a) && Intrinsics.d(this.b, y0t0Var.b) && this.c == y0t0Var.c && this.d == y0t0Var.d && Intrinsics.d(this.e, y0t0Var.e);
    }

    public final int hashCode() {
        nrq nrqVar = this.f41824a;
        int iA = twn.a(this.d, twn.a(this.c, (((nrqVar == null ? 0 : nrqVar.hashCode()) * 31) + this.b.f27526a) * 31, 31), 31);
        Object obj = this.e;
        return iA + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        String str;
        String str2 = "Invalid";
        int i = this.c;
        if (i == 0) {
            str = PriorityHeader.NORMAL;
        } else {
            str = i == 1 ? "Italic" : "Invalid";
        }
        int i2 = this.d;
        if (i2 == 0) {
            str2 = "None";
        } else if (i2 == 1) {
            str2 = "Weight";
        } else if (i2 == 2) {
            str2 = "Style";
        } else if (i2 == 65535) {
            str2 = "All";
        }
        StringBuilder sb = new StringBuilder("TypefaceRequest(fontFamily=");
        sb.append(this.f41824a);
        sb.append(", fontWeight=");
        sb.append(this.b);
        sb.append(", fontStyle=");
        f140.v(sb, str, ", fontSynthesis=", str2, ", resourceLoaderCacheKey=");
        sb.append(this.e);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
