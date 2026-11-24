package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class j2m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15786a;
    public final int b;

    public j2m(int i, int i2) {
        this.f15786a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j2m)) {
            return false;
        }
        j2m j2mVar = (j2m) obj;
        return this.f15786a == j2mVar.f15786a && this.b == j2mVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.f15786a) * 31);
    }

    public final String toString() {
        return ohs0.m("DsCustomVerticalVictoryIndicatorUiModel(totalCount=", this.f15786a, ", winCount=", Separators.RPAREN, this.b);
    }
}
