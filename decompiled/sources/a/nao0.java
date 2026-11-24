package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class nao0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f23201a;
    public final boolean b;
    public final boolean c;
    public final pao0 d;
    public final boolean e;

    public nao0(lc00 lc00Var, boolean z, boolean z2, pao0 pao0Var, boolean z3) {
        lc00Var.getClass();
        this.f23201a = lc00Var;
        this.b = z;
        this.c = z2;
        this.d = pao0Var;
        this.e = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nao0)) {
            return false;
        }
        nao0 nao0Var = (nao0) obj;
        return Intrinsics.d(this.f23201a, nao0Var.f23201a) && this.b == nao0Var.b && this.c == nao0Var.c && this.d == nao0Var.d && this.e == nao0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + brm0.e(brm0.e(this.f23201a.hashCode() * 31, 31, this.b), 31, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TabBarStateModel(tabs=");
        sb.append(this.f23201a);
        sb.append(", promoSupported=");
        sb.append(this.b);
        sb.append(", providersSupported=");
        sb.append(this.c);
        sb.append(", tabBarType=");
        sb.append(this.d);
        sb.append(", isVirtual=");
        return rw2.p(sb, this.e, Separators.RPAREN);
    }
}
