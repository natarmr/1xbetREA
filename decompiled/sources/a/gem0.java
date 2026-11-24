package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class gem0 implements hvk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s6x f11163a;
    public final v12 b;
    public final String c;

    public gem0(s6x s6xVar, v12 v12Var) {
        this.f11163a = s6xVar;
        this.b = v12Var;
        this.c = s6xVar.f31725a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gem0)) {
            return false;
        }
        gem0 gem0Var = (gem0) obj;
        return this.f11163a.equals(gem0Var.f11163a) && this.b == gem0Var.b;
    }

    @Override // a.hvk0
    public final Object getKey() {
        return this.c;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f11163a.hashCode() * 31);
    }

    public final String toString() {
        return "StatisticIndicatorUiModel(indicatorUiModel=" + this.f11163a + ", alignmentInSection=" + this.b + Separators.RPAREN;
    }
}
