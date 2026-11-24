package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class rb8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f30171a;
    public final int b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;

    public rb8(int i, int i2, String str, String str2, boolean z, boolean z2) {
        str.getClass();
        str2.getClass();
        this.f30171a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
        this.e = z;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rb8)) {
            return false;
        }
        rb8 rb8Var = (rb8) obj;
        return this.f30171a == rb8Var.f30171a && this.b == rb8Var.b && Intrinsics.d(this.c, rb8Var.c) && Intrinsics.d(this.d, rb8Var.d) && this.e == rb8Var.e && this.f == rb8Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + brm0.e(ua80.b(ua80.b(twn.a(this.b, Integer.hashCode(this.f30171a) * 31, 31), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbT = dw9.t("Bonus(id=", this.f30171a, ", groupId=", ", title=", this.b);
        f140.v(sbT, this.c, ", description=", this.d, ", isSelected=");
        return ohs0.p(", hasAggregator=", Separators.RPAREN, sbT, this.e, this.f);
    }
}
