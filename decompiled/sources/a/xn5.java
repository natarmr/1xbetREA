package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class xn5 implements zn5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f41156a;
    public final boolean b;

    public xn5(int i, boolean z) {
        this.f41156a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xn5)) {
            return false;
        }
        xn5 xn5Var = (xn5) obj;
        return this.f41156a == xn5Var.f41156a && this.b == xn5Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.f41156a) * 31);
    }

    public final String toString() {
        return rz4.i(this.f41156a, "ImageRes(value=", ", isAnimating=", Separators.RPAREN, this.b);
    }
}
