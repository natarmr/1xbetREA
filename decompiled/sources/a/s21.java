package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class s21 implements t21 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f31480a;
    public final r21 b;

    public s21(boolean z, r21 r21Var) {
        this.f31480a = z;
        this.b = r21Var;
    }

    @Override // a.t21
    public final boolean a() {
        return this.f31480a;
    }

    @Override // a.t21
    public final int b() {
        return hew0.K(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s21)) {
            return false;
        }
        s21 s21Var = (s21) obj;
        return this.f31480a == s21Var.f31480a && this.b == s21Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.f31480a) * 31);
    }

    public final String toString() {
        return "AggregatorHistoryBetTypeUiModel(selected=" + this.f31480a + ", aggregatorHistoryBetTypeModel=" + this.b + Separators.RPAREN;
    }
}
