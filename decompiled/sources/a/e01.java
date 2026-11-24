package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class e01 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6968a;
    public final String b;
    public final int c;

    public e01(int i, int i2, String str) {
        this.f6968a = i;
        this.b = str;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e01)) {
            return false;
        }
        e01 e01Var = (e01) obj;
        return this.f6968a == e01Var.f6968a && this.b.equals(e01Var.b) && this.c == e01Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ua80.b(Integer.hashCode(this.f6968a) * 31, 31, this.b);
    }

    public final String toString() {
        return rz4.j(this.c, Separators.RPAREN, vqd.r(this.f6968a, "AggregatorGiftExceptionModel(bonusId=", ", message=", this.b, ", errorCode="));
    }
}
