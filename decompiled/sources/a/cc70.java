package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class cc70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4096a;
    public final boolean b;
    public final ac70 c;
    public final c5v0 d;
    public final long e;
    public final bc70 f;
    public final yb70 g;

    public cc70(long j, boolean z, ac70 ac70Var, c5v0 c5v0Var, long j2, bc70 bc70Var, yb70 yb70Var) {
        bc70Var.getClass();
        yb70Var.getClass();
        this.f4096a = j;
        this.b = z;
        this.c = ac70Var;
        this.d = c5v0Var;
        this.e = j2;
        this.f = bc70Var;
        this.g = yb70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cc70)) {
            return false;
        }
        cc70 cc70Var = (cc70) obj;
        long j = cc70Var.f4096a;
        int i = y3d.h;
        return h2t0.a(this.f4096a, j) && this.b == cc70Var.b && this.c.equals(cc70Var.c) && Intrinsics.d(this.d, cc70Var.d) && h2t0.a(this.e, cc70Var.e) && Intrinsics.d(this.f, cc70Var.f) && Intrinsics.d(this.g, cc70Var.g);
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        int iHashCode = (this.c.hashCode() + brm0.e(Long.hashCode(this.f4096a) * 31, 31, this.b)) * 31;
        c5v0 c5v0Var = this.d;
        return this.g.hashCode() + ((this.f.hashCode() + rw2.b((iHashCode + (c5v0Var == null ? 0 : c5v0Var.hashCode())) * 31, 31, this.e)) * 31);
    }

    public final String toString() {
        String strI = y3d.i(this.f4096a);
        String strI2 = y3d.i(this.e);
        StringBuilder sbU = brm0.u("OneXGamesWebGameUiState(systemBarsColor=", strI, ", fullScreen=", this.b, ", toolbarBarUiModel=");
        sbU.append(this.c);
        sbU.append(", webViewHolder=");
        sbU.append(this.d);
        sbU.append(", bgColor=");
        sbU.append(strI2);
        sbU.append(", loadingState=");
        sbU.append(this.f);
        sbU.append(", taxMessageUiModel=");
        sbU.append(this.g);
        sbU.append(Separators.RPAREN);
        return sbU.toString();
    }
}
