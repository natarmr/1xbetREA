package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class jm60 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f16751a;
    public final String b;
    public final String c;
    public final int d;
    public final boolean e;

    /* JADX WARN: Multi-variable type inference failed */
    public jm60(int i, int i2, String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.f16751a = i;
        this.b = str;
        this.c = str2;
        this.d = i2;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jm60)) {
            return false;
        }
        jm60 jm60Var = (jm60) obj;
        return this.f16751a == jm60Var.f16751a && Intrinsics.d(this.b, jm60Var.b) && Intrinsics.d(this.c, jm60Var.c) && this.d == jm60Var.d && this.e == jm60Var.e;
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return (p6t0Var instanceof jm60) && (p6t0Var2 instanceof jm60) && ((jm60) p6t0Var).f16751a == ((jm60) p6t0Var2).f16751a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + twn.a(this.d, ua80.b(ua80.b(Integer.hashCode(this.f16751a) * 31, 31, this.b), 31, this.c), 31);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return iun.f15405a;
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f16751a, "OneXGameBannerUiModel(id=", ", title=", this.b, ", subtitle=");
        twn.w(this.d, this.c, ", drawableRes=", ", underMaintenance=", sbR);
        return rw2.p(sbR, this.e, Separators.RPAREN);
    }
}
