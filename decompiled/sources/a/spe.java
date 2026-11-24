package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class spe implements tpe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f32589a;
    public final int b;

    public spe(int i, int i2) {
        this.f32589a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof spe)) {
            return false;
        }
        spe speVar = (spe) obj;
        return this.f32589a == speVar.f32589a && this.b == speVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.f32589a) * 31);
    }

    public final String toString() {
        return ohs0.m("DigitFromDigit(countOne=", this.f32589a, ", countTwo=", Separators.RPAREN, this.b);
    }
}
