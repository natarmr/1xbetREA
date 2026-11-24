package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class zlp0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44592a;
    public final xnp0 b;
    public final List c;
    public final ArrayList d;

    public zlp0(String str, xnp0 xnp0Var, List list, ArrayList arrayList) {
        this.f44592a = str;
        this.b = xnp0Var;
        this.c = list;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zlp0)) {
            return false;
        }
        zlp0 zlp0Var = (zlp0) obj;
        return this.f44592a.equals(zlp0Var.f44592a) && this.b.equals(zlp0Var.b) && this.c.equals(zlp0Var.c) && this.d.equals(zlp0Var.d);
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if ((p6t0Var instanceof zlp0) && (p6t0Var2 instanceof zlp0)) {
            return Intrinsics.d(((zlp0) p6t0Var).b.b, ((zlp0) p6t0Var2).b.b);
        }
        return false;
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f44592a;
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return this.d.hashCode() + dw9.a((this.b.hashCode() + (this.f44592a.hashCode() * 31)) * 31, 31, this.c);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof zlp0) || !(p6t0Var2 instanceof zlp0)) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        zlp0 zlp0Var = (zlp0) p6t0Var;
        zlp0 zlp0Var2 = (zlp0) p6t0Var2;
        k9x.G(linkedHashSet, new wlp0(zlp0Var.b), new wlp0(zlp0Var2.b));
        k9x.G(linkedHashSet, new vlp0(zlp0Var.c), new vlp0(zlp0Var2.c));
        k9x.G(linkedHashSet, new ulp0(zlp0Var.d), new ulp0(zlp0Var2.d));
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return linkedHashSet;
    }

    public final String toString() {
        return ua80.m(b1j.n("TeamStatisticUiModel(key=", this.f44592a, ", team=", "Team(value=" + this.b + Separators.RPAREN, ", statisticsCellHeaders="), twn.r(this.c, "StatisticsCellHeaders(value=", Separators.RPAREN), ", playerStatistics=", hne.o("PlayerStatistics(value=", Separators.RPAREN, this.d), Separators.RPAREN);
    }
}
