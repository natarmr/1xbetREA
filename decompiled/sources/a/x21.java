package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class x21 implements t21 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f40145a;
    public final v21 b;

    public x21(boolean z, v21 v21Var) {
        this.f40145a = z;
        this.b = v21Var;
    }

    @Override // a.t21
    public final boolean a() {
        return this.f40145a;
    }

    @Override // a.t21
    public final int b() {
        return hew0.L(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x21)) {
            return false;
        }
        x21 x21Var = (x21) obj;
        return this.f40145a == x21Var.f40145a && this.b == x21Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.f40145a) * 31);
    }

    public final String toString() {
        return "AggregatorHistoryGameTypeUiModel(selected=" + this.f40145a + ", aggregatorHistoryGameTypeModel=" + this.b + Separators.RPAREN;
    }
}
