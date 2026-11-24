package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class xno0 implements zno0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f41179a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final a4x e;
    public final aoo0 f;

    public xno0(a4x a4xVar, int i, boolean z, boolean z2, a4x a4xVar2, aoo0 aoo0Var) {
        a4xVar.getClass();
        a4xVar2.getClass();
        this.f41179a = a4xVar;
        this.b = i;
        this.c = z;
        this.d = z2;
        this.e = a4xVar2;
        this.f = aoo0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xno0)) {
            return false;
        }
        xno0 xno0Var = (xno0) obj;
        return Intrinsics.d(this.f41179a, xno0Var.f41179a) && this.b == xno0Var.b && this.c == xno0Var.c && this.d == xno0Var.d && Intrinsics.d(this.e, xno0Var.e) && this.f == xno0Var.f;
    }

    public final int hashCode() {
        return this.f.hashCode() + cs0.b(this.e, brm0.e(brm0.e(twn.a(this.b, this.f41179a.hashCode() * 31, 31), 31, this.c), 31, this.d), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TabsCardItems(tabs=");
        sb.append(this.f41179a);
        sb.append(", currentPosition=");
        sb.append(this.b);
        sb.append(", scrollToTop=");
        ua80.u(", changeTabWithoutAnimation=", ", allTabsItems=", sb, this.c, this.d);
        sb.append(this.e);
        sb.append(", tabStyle=");
        sb.append(this.f);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
