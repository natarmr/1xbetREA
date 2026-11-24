package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class aqb0 implements dqb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1290a;
    public final int b;

    public aqb0(int i, int i2) {
        this.f1290a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aqb0)) {
            return false;
        }
        aqb0 aqb0Var = (aqb0) obj;
        return this.f1290a == aqb0Var.f1290a && this.b == aqb0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.f1290a) * 31);
    }

    public final String toString() {
        return ohs0.m("Drawable(drawableRes=", this.f1290a, ", specialDrawableSize=", Separators.RPAREN, this.b);
    }
}
