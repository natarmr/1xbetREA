package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class qqf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f29163a;
    public final int b;

    public qqf(int i, int i2) {
        this.f29163a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qqf)) {
            return false;
        }
        qqf qqfVar = (qqf) obj;
        return this.f29163a == qqfVar.f29163a && this.b == qqfVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.f29163a) * 31);
    }

    public final String toString() {
        return ohs0.m("Cs2PositionModel(xPosition=", this.f29163a, ", yPosition=", Separators.RPAREN, this.b);
    }
}
