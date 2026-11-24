package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class x6r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qim f40378a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final zdo0 g;

    public x6r0(qim qimVar, boolean z, boolean z2, boolean z3, boolean z4, int i, zdo0 zdo0Var) {
        zdo0Var.getClass();
        this.f40378a = qimVar;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = i;
        this.g = zdo0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x6r0)) {
            return false;
        }
        x6r0 x6r0Var = (x6r0) obj;
        return this.f40378a.equals(x6r0Var.f40378a) && this.b == x6r0Var.b && this.c == x6r0Var.c && this.d == x6r0Var.d && this.e == x6r0Var.e && this.f == x6r0Var.f && Intrinsics.d(this.g, x6r0Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + twn.a(this.f, brm0.e(brm0.e(brm0.e(brm0.e(this.f40378a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TopGamesContainerUiState(headerModel=");
        sb.append(this.f40378a);
        sb.append(", alwaysLightStatusBar=");
        sb.append(this.b);
        sb.append(", refreshing=");
        ua80.u(", enableCollapse=", ", needScrollToTop=", sb, this.c, this.d);
        ua80.q(this.f, ", selectedSegmentPos=", ", tabState=", sb, this.e);
        sb.append(this.g);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
