package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class si4 implements uj4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f32245a;
    public final int b;

    public si4(int i, int i2) {
        this.f32245a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof si4)) {
            return false;
        }
        si4 si4Var = (si4) obj;
        return this.f32245a == si4Var.f32245a && this.b == si4Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.f32245a) * 31);
    }

    public final String toString() {
        return ohs0.m("AuthLoginVisualEntryPointUiModel(labelResId=", this.f32245a, ", typeByInt=", Separators.RPAREN, this.b);
    }
}
