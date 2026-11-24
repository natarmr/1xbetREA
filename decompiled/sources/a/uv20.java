package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class uv20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f36327a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final tv20 f;
    public final boolean g;
    public final f07 h;
    public final y9q0 i;

    public uv20(long j, String str, boolean z, boolean z2, int i, tv20 tv20Var, boolean z3, f07 f07Var, y9q0 y9q0Var) {
        str.getClass();
        this.f36327a = j;
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = i;
        this.f = tv20Var;
        this.g = z3;
        this.h = f07Var;
        this.i = y9q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uv20)) {
            return false;
        }
        uv20 uv20Var = (uv20) obj;
        return this.f36327a == uv20Var.f36327a && Intrinsics.d(this.b, uv20Var.b) && this.c == uv20Var.c && this.d == uv20Var.d && this.e == uv20Var.e && this.f.equals(uv20Var.f) && this.g == uv20Var.g && this.h == uv20Var.h && this.i.equals(uv20Var.i);
    }

    public final int hashCode() {
        int iE = brm0.e((this.f.hashCode() + twn.a(this.e, brm0.e(brm0.e(ua80.b(Long.hashCode(this.f36327a) * 31, 31, this.b), 31, this.c), 31, this.d), 31)) * 31, 31, this.g);
        f07 f07Var = this.h;
        return this.i.hashCode() + ((iE + (f07Var == null ? 0 : f07Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f36327a, "MarketHeaderUiModel(marketGroupId=", ", title=", this.b);
        w6x.A(", isPinned=", ", isExpanded=", sbO, this.c, this.d);
        sbO.append(", countMarkets=");
        sbO.append(this.e);
        sbO.append(", signIcon=");
        sbO.append(this.f);
        sbO.append(", isPinVisible=");
        sbO.append(this.g);
        sbO.append(", infoButtonType=");
        sbO.append(this.h);
        sbO.append(", textStyle=");
        sbO.append(this.i);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
