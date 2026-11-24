package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class rkx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f30670a;
    public final int b;

    public rkx(int i, int i2) {
        this.f30670a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rkx)) {
            return false;
        }
        rkx rkxVar = (rkx) obj;
        return this.f30670a == rkxVar.f30670a && this.b == rkxVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.f30670a) * 31);
    }

    public final String toString() {
        return ohs0.m("IntSizeModel(width=", this.f30670a, ", height=", Separators.RPAREN, this.b);
    }
}
