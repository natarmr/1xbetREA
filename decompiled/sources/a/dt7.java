package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class dt7 implements r4f, t0m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final et7 f6647a;
    public final rse b;

    public dt7(et7 et7Var, rse rseVar) {
        this.f6647a = et7Var;
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
        if (!(obj instanceof dt7)) {
            return false;
        }
        dt7 dt7Var = (dt7) obj;
        return this.f6647a.equals(dt7Var.f6647a) && this.b == dt7Var.b;
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
        if ((p6t0Var instanceof dt7) && (p6t0Var2 instanceof dt7)) {
            return p6t0Var.equals(p6t0Var2);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f6647a.hashCode() * 31);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof dt7) || !(p6t0Var2 instanceof dt7)) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        k9x.G(linkedHashSet, new ct7(((dt7) p6t0Var).f6647a), new ct7(((dt7) p6t0Var2).f6647a));
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return linkedHashSet;
    }

    public final String toString() {
        return "BetsOnFavoriteEventsUiModel(betsOnFavoriteState=" + ("BetsOnFavoriteState(value=" + this.f6647a + Separators.RPAREN) + ", couponSeparatorStyle=" + this.b + Separators.RPAREN;
    }
}
