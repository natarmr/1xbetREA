package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h6a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12521a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final boolean f;
    public final y9q0 g;

    public h6a0(long j, String str, boolean z, boolean z2, String str2, boolean z3, y9q0 y9q0Var) {
        str.getClass();
        this.f12521a = j;
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = str2;
        this.f = z3;
        this.g = y9q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h6a0)) {
            return false;
        }
        h6a0 h6a0Var = (h6a0) obj;
        return this.f12521a == h6a0Var.f12521a && Intrinsics.d(this.b, h6a0Var.b) && this.c == h6a0Var.c && this.d == h6a0Var.d && this.e.equals(h6a0Var.e) && this.f == h6a0Var.f && this.g.equals(h6a0Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + brm0.e(ua80.b(brm0.e(brm0.e(ua80.b(Long.hashCode(this.f12521a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f12521a, "PlayerMarketGroupHeaderUiModel(marketGroupId=", ", title=", this.b);
        w6x.A(", isPinned=", ", isExpanded=", sbO, this.c, this.d);
        w6x.z(", countMarkets=", this.e, ", isSpecialSignVisible=", sbO, this.f);
        sbO.append(", textStyle=");
        sbO.append(this.g);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
