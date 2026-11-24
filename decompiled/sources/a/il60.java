package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class il60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14961a;
    public final int b;

    public il60(int i, int i2) {
        this.f14961a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof il60)) {
            return false;
        }
        il60 il60Var = (il60) obj;
        return this.f14961a == il60Var.f14961a && this.b == il60Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.f14961a) * 31);
    }

    public final String toString() {
        return ohs0.m("OneClickIconConfigUiModel(drawableResId=", this.f14961a, ", colorId=", Separators.RPAREN, this.b);
    }
}
