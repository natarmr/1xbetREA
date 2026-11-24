package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class q170 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d270 f27939a;
    public final boolean b;
    public final String c;
    public final String d;

    public q170(d270 d270Var, boolean z, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f27939a = d270Var;
        this.b = z;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q170)) {
            return false;
        }
        q170 q170Var = (q170) obj;
        return this.f27939a == q170Var.f27939a && this.b == q170Var.b && Intrinsics.d(this.c, q170Var.c) && Intrinsics.d(this.d, q170Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(brm0.e(this.f27939a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OneXGamesPromoItemModel(type=");
        sb.append(this.f27939a);
        sb.append(", underMaintenance=");
        sb.append(this.b);
        sb.append(", name=");
        return ua80.m(sb, this.c, ", description=", this.d, Separators.RPAREN);
    }
}
