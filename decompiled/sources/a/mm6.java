package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class mm6 implements r4f, t0m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pc9 f22022a;
    public final rse b;

    public mm6(pc9 pc9Var, rse rseVar) {
        this.f22022a = pc9Var;
        this.b = rseVar;
    }

    @Override // a.t0m
    public final rse c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mm6)) {
            return false;
        }
        mm6 mm6Var = (mm6) obj;
        return this.f22022a.equals(mm6Var.f22022a) && this.b == mm6Var.b;
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return p6t0Var2.getClass() == p6t0Var.getClass();
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if ((p6t0Var instanceof mm6) && (p6t0Var2 instanceof mm6)) {
            return p6t0Var.equals(p6t0Var2);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f22022a.hashCode() * 31);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof mm6) || !(p6t0Var2 instanceof mm6)) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        k9x.G(linkedHashSet, new km6(((mm6) p6t0Var).f22022a), new km6(((mm6) p6t0Var2).f22022a));
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return linkedHashSet;
    }

    public final String toString() {
        return "BetBuilderUiModel(betBuilder=" + ("BetBuilder(value=" + this.f22022a + Separators.RPAREN) + ", couponSeparatorStyle=" + this.b + Separators.RPAREN;
    }
}
