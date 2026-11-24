package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g0r0 implements a1r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h1r0 f10473a;
    public final List b;

    public g0r0(h1r0 h1r0Var, List list) {
        list.getClass();
        this.f10473a = h1r0Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0r0)) {
            return false;
        }
        g0r0 g0r0Var = (g0r0) obj;
        return Intrinsics.d(this.f10473a, g0r0Var.f10473a) && Intrinsics.d(this.b, g0r0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f10473a.hashCode() * 31);
    }

    public final String toString() {
        return "AggregatorCategories(status=" + this.f10473a + ", value=" + this.b + Separators.RPAREN;
    }
}
