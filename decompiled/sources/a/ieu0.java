package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ieu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f14654a;
    public final int b;

    /* JADX WARN: Multi-variable type inference failed */
    public ieu0(int i, int i2) {
        this.f14654a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ieu0)) {
            return false;
        }
        ieu0 ieu0Var = (ieu0) obj;
        return this.f14654a == ieu0Var.f14654a && this.b == ieu0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.f14654a) * 31);
    }

    public final String toString() {
        return ohs0.m("VictoryIndicatorUiModel(totalCount=", this.f14654a, ", winCount=", Separators.RPAREN, this.b);
    }
}
