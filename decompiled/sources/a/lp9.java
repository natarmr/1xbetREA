package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class lp9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final swq f20428a;
    public final g950 b;

    static {
        g950 g950Var = lxk0.f;
        swq swqVar = swq.c;
        mbc.g0(g950Var);
    }

    public lp9(swq swqVar, g950 g950Var) {
        swqVar.getClass();
        this.f20428a = swqVar;
        this.b = g950Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lp9)) {
            return false;
        }
        lp9 lp9Var = (lp9) obj;
        return Intrinsics.d(this.f20428a, lp9Var.f20428a) && this.b.equals(lp9Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.f20428a.hashCode() + 527) * 961);
    }

    public final String toString() {
        return kotlin.text.c.s(this.f20428a.f32934a.f34663a, '.', '/') + Separators.SLASH + this.b;
    }
}
