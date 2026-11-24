package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class e180 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7027a;
    public final int b;

    public e180(int i, int i2) {
        this.f7027a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e180)) {
            return false;
        }
        e180 e180Var = (e180) obj;
        return this.f7027a == e180Var.f7027a && this.b == e180Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.f7027a) * 31);
    }

    public final String toString() {
        return ohs0.m("OperatorRatingStarUiModel(value=", this.f7027a, ", iconRes=", Separators.RPAREN, this.b);
    }
}
