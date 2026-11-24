package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class bc90 extends lc90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2345a;
    public final int b;
    public final String c;

    public bc90(int i, int i2, String str) {
        str.getClass();
        this.f2345a = i;
        this.b = i2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bc90)) {
            return false;
        }
        bc90 bc90Var = (bc90) obj;
        return this.f2345a == bc90Var.f2345a && this.b == bc90Var.b && Intrinsics.d(this.c, bc90Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + twn.a(this.b, Integer.hashCode(this.f2345a) * 31, 31);
    }

    public final String toString() {
        return axq.n(dw9.t("PenaltyExpected(drawableRes=", this.f2345a, ", textColor=", ", penaltyNumber=", this.b), this.c, Separators.RPAREN);
    }
}
