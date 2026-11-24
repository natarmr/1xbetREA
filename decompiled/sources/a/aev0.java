package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class aev0 implements cev0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zdv0 f748a;
    public final a4x b;
    public final a4x c;

    public aev0(zdv0 zdv0Var, i4 i4Var, i4 i4Var2) {
        i4Var.getClass();
        i4Var2.getClass();
        this.f748a = zdv0Var;
        this.b = i4Var;
        this.c = i4Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aev0)) {
            return false;
        }
        aev0 aev0Var = (aev0) obj;
        return this.f748a == aev0Var.f748a && Intrinsics.d(this.b, aev0Var.b) && Intrinsics.d(this.c, aev0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cs0.b(this.b, this.f748a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(style=");
        sb.append(this.f748a);
        sb.append(", buttons=");
        sb.append(this.b);
        sb.append(", events=");
        return cs0.n(sb, this.c, Separators.RPAREN);
    }
}
