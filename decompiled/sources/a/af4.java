package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class af4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f759a;
    public final int b;

    public af4(int i, int i2) {
        this.f759a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof af4)) {
            return false;
        }
        af4 af4Var = (af4) obj;
        return this.f759a == af4Var.f759a && this.b == af4Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.f759a) * 31);
    }

    public final String toString() {
        return ohs0.m("AuthLoginSimpleEntryPointUiModel(labelResId=", this.f759a, ", typeByInt=", Separators.RPAREN, this.b);
    }
}
