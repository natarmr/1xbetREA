package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class xvj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rvj0 f41563a;
    public final String b;
    public final boolean c;

    public xvj0(rvj0 rvj0Var, String str, boolean z) {
        str.getClass();
        this.f41563a = rvj0Var;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xvj0)) {
            return false;
        }
        xvj0 xvj0Var = (xvj0) obj;
        return this.f41563a.equals(xvj0Var.f41563a) && Intrinsics.d(this.b, xvj0Var.b) && this.c == xvj0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ua80.b(this.f41563a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimpleBetTabKeyModel(simpleBetState=");
        sb.append(this.f41563a);
        sb.append(", currencySymbol=");
        sb.append(this.b);
        sb.append(", forceLoading=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
