package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ra4 implements nb4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f30115a;
    public final int b;

    public ra4(int i, int i2) {
        this.f30115a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ra4)) {
            return false;
        }
        ra4 ra4Var = (ra4) obj;
        return this.f30115a == ra4Var.f30115a && this.b == ra4Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.f30115a) * 31);
    }

    public final String toString() {
        return ohs0.m("AuthLoginDefaultEntryPointUiModel(labelResId=", this.f30115a, ", typeByInt=", Separators.RPAREN, this.b);
    }
}
