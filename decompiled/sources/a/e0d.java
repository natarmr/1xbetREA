package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e0d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f6983a;
    public final double b;
    public final String c;
    public final String d;

    public e0d(double d, double d2, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f6983a = d;
        this.b = d2;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0d)) {
            return false;
        }
        e0d e0dVar = (e0d) obj;
        return Double.compare(this.f6983a, e0dVar.f6983a) == 0 && Double.compare(this.b, e0dVar.b) == 0 && Intrinsics.d(this.c, e0dVar.c) && Intrinsics.d(this.d, e0dVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(brm0.d(this.b, Double.hashCode(this.f6983a) * 31, 31), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbP = brm0.p(this.f6983a, "CoefficientParams(curCoefficientValue=", ", oldCoefficientValue=");
        hne.w(sbP, this.b, ", curCoefficientString=", this.c);
        return rw2.o(sbP, ", oldCoefficientString=", this.d, Separators.RPAREN);
    }
}
