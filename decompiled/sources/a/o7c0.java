package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class o7c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24780a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;

    public o7c0(int i, int i2, int i3, int i4, String str) {
        this.f24780a = i;
        this.b = str;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o7c0)) {
            return false;
        }
        o7c0 o7c0Var = (o7c0) obj;
        return this.f24780a == o7c0Var.f24780a && this.b.equals(o7c0Var.b) && this.c == o7c0Var.c && this.d == o7c0Var.d && this.e == o7c0Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + twn.a(this.d, twn.a(this.c, ua80.b(Integer.hashCode(this.f24780a) * 31, 31, this.b), 31), 31);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f24780a, "PromoBonusModel(errorCode=", ", message=", this.b, ", summaPoints=");
        axq.r(this.c, this.d, ", xCoinsBalance=", ", xCoinsLeftDays=", sbR);
        return rz4.j(this.e, Separators.RPAREN, sbR);
    }
}
