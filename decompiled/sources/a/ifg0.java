package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
public final class ifg0 implements p6t0, s0h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f14685a;

    public ifg0(ArrayList arrayList) {
        this.f14685a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ifg0) && this.f14685a.equals(((ifg0) obj).f14685a);
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return (p6t0Var instanceof ifg0) && (p6t0Var2 instanceof ifg0);
    }

    @Override // a.p6t0
    public final String getKey() {
        return "ROULETTE_STATISTIC_KEY";
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return this.f14685a.hashCode() + 1890256891;
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return null;
    }

    public final String toString() {
        return hne.o("RouletteStatisticUiModel(key=ROULETTE_STATISTIC_KEY, listOfRound=", Separators.RPAREN, this.f14685a);
    }
}
