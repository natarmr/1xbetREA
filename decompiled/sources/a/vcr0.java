package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class vcr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f37200a;
    public final List b;
    public final y9q0 c;
    public final w6k d;
    public final long e;
    public final float f;
    public final g9q0 g;

    public vcr0(a4x a4xVar, List list, y9q0 y9q0Var, w6k w6kVar, long j, float f, g9q0 g9q0Var) {
        a4xVar.getClass();
        list.getClass();
        w6kVar.getClass();
        g9q0Var.getClass();
        this.f37200a = a4xVar;
        this.b = list;
        this.c = y9q0Var;
        this.d = w6kVar;
        this.e = j;
        this.f = f;
        this.g = g9q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vcr0)) {
            return false;
        }
        vcr0 vcr0Var = (vcr0) obj;
        return Intrinsics.d(this.f37200a, vcr0Var.f37200a) && Intrinsics.d(this.b, vcr0Var.b) && this.c.equals(vcr0Var.c) && Intrinsics.d(this.d, vcr0Var.d) && qkx.a(this.e, vcr0Var.e) && ycl.b(this.f, vcr0Var.f) && Intrinsics.d(this.g, vcr0Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + defpackage.c.a(rw2.b((this.d.hashCode() + brm0.g(this.c, dw9.a(this.f37200a.hashCode() * 31, 31, this.b), 31)) * 31, 31, this.e), this.f, 31);
    }

    public final String toString() {
        String strB = qkx.b(this.e);
        String strC = ycl.c(this.f);
        StringBuilder sb = new StringBuilder("TopPlayersTableMetricsConfig(columns=");
        sb.append(this.f37200a);
        sb.append(", players=");
        sb.append(this.b);
        sb.append(", textStyle=");
        sb.append(this.c);
        sb.append(", density=");
        sb.append(this.d);
        sb.append(", containerSize=");
        f140.v(sb, strB, ", horizontalMargin=", strC, ", textMeasurer=");
        sb.append(this.g);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
