package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class aec0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f721a;
    public final int b;
    public final int c;
    public final ydc0 d;
    public final String e;
    public final String f;
    public final ArrayList g;

    public aec0(long j, int i, int i2, ydc0 ydc0Var, String str, String str2, ArrayList arrayList) {
        str.getClass();
        this.f721a = j;
        this.b = i;
        this.c = i2;
        this.d = ydc0Var;
        this.e = str;
        this.f = str2;
        this.g = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aec0)) {
            return false;
        }
        aec0 aec0Var = (aec0) obj;
        return this.f721a == aec0Var.f721a && this.b == aec0Var.b && this.c == aec0Var.c && this.d == aec0Var.d && Intrinsics.d(this.e, aec0Var.e) && this.f.equals(aec0Var.f) && this.g.equals(aec0Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ua80.b(ua80.b((this.d.hashCode() + twn.a(this.c, twn.a(this.b, Long.hashCode(this.f721a) * 31, 31), 31)) * 31, 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbQ = brm0.q(this.b, this.f721a, "PromoCodeListInfoUiModel(id=", ", iconRes=");
        sbQ.append(", colorRes=");
        sbQ.append(this.c);
        sbQ.append(", type=");
        sbQ.append(this.d);
        f140.v(sbQ, ", promoCode=", this.e, ", description=", this.f);
        sbQ.append(", details=");
        sbQ.append(this.g);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
