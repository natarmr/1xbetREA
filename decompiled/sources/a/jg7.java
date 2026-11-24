package a;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class jg7 implements Serializable {
    public static final jg7 i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f16467a;
    public final long b;
    public final double c;
    public final boolean d;
    public final long e;
    public final String f;
    public final String g;
    public final cfo h;

    static {
        iun iunVar = iun.f15405a;
        i = new jg7(0.0d, 0L, 0.0d, false, 0L, "", "", new cfo(iunVar, iunVar));
    }

    public jg7(double d, long j, double d2, boolean z, long j2, String str, String str2, cfo cfoVar) {
        str.getClass();
        this.f16467a = d;
        this.b = j;
        this.c = d2;
        this.d = z;
        this.e = j2;
        this.f = str;
        this.g = str2;
        this.h = cfoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jg7)) {
            return false;
        }
        jg7 jg7Var = (jg7) obj;
        return Double.compare(this.f16467a, jg7Var.f16467a) == 0 && this.b == jg7Var.b && Double.compare(this.c, jg7Var.c) == 0 && this.d == jg7Var.d && this.e == jg7Var.e && Intrinsics.d(this.f, jg7Var.f) && this.g.equals(jg7Var.g) && this.h.equals(jg7Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ua80.b(ua80.b(rw2.b(brm0.e(brm0.d(this.c, rw2.b(Double.hashCode(this.f16467a) * 31, 31, this.b), 31), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sbP = brm0.p(this.f16467a, "BetModel(coef=", ", group=");
        sbP.append(this.b);
        ohs0.A(sbP, this.c, ", param=", ", suspended=");
        rw2.v(this.e, ", type=", sbP, this.d);
        f140.v(sbP, ", viewCoef=", this.f, ", displayName=", this.g);
        sbP.append(", eventParams=");
        sbP.append(this.h);
        sbP.append(Separators.RPAREN);
        return sbP.toString();
    }
}
