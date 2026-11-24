package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g1k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j1k0 f10517a;
    public final boolean b;
    public final boolean c;
    public final String d;

    public g1k0(j1k0 j1k0Var, boolean z, boolean z2, String str) {
        j1k0Var.getClass();
        str.getClass();
        this.f10517a = j1k0Var;
        this.b = z;
        this.c = z2;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1k0)) {
            return false;
        }
        g1k0 g1k0Var = (g1k0) obj;
        return Intrinsics.d(this.f10517a, g1k0Var.f10517a) && this.b == g1k0Var.b && this.c == g1k0Var.c && Intrinsics.d(this.d, g1k0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + brm0.e(brm0.e(this.f10517a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SingleMatchContainer(singleMatchModel=");
        sb.append(this.f10517a);
        sb.append(", subscribed=");
        sb.append(this.b);
        sb.append(", canSubscribe=");
        return twn.q(", currencySymbol=", this.d, Separators.RPAREN, sb, this.c);
    }
}
