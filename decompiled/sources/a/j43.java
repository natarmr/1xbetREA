package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class j43 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15865a;
    public final String b;
    public final c0d c;
    public final boolean d;

    public j43(String str, String str2, c0d c0dVar, boolean z) {
        str.getClass();
        str2.getClass();
        this.f15865a = str;
        this.b = str2;
        this.c = c0dVar;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j43)) {
            return false;
        }
        j43 j43Var = (j43) obj;
        return Intrinsics.d(this.f15865a, j43Var.f15865a) && Intrinsics.d(this.b, j43Var.b) && this.c == j43Var.c && this.d == j43Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + ua80.b(this.f15865a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("AnimatedCoefficientModel(curCoef=", this.f15865a, ", oldCoef=", this.b, ", coefficientChangeState=");
        sbN.append(this.c);
        sbN.append(", isLoading=");
        sbN.append(this.d);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
