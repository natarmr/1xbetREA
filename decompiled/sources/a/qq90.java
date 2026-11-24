package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class qq90 implements sq90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29155a;
    public final boolean b;
    public final String c;
    public final boolean d;
    public final int e;

    public qq90(int i, String str, String str2, boolean z, boolean z2) {
        str.getClass();
        this.f29155a = str;
        this.b = z;
        this.c = str2;
        this.d = z2;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qq90)) {
            return false;
        }
        qq90 qq90Var = (qq90) obj;
        return Intrinsics.d(this.f29155a, qq90Var.f29155a) && this.b == qq90Var.b && this.c.equals(qq90Var.c) && this.d == qq90Var.d && this.e == qq90Var.e;
    }

    @Override // a.sq90
    public final int getId() {
        return this.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + brm0.e(ua80.b(brm0.e(this.f29155a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbU = brm0.u("WithImage(description=", this.f29155a, ", isLastItem=", this.b, ", iconResUrl=");
        brm0.C(this.c, ", selected=", ", id=", sbU, this.d);
        return rz4.j(this.e, Separators.RPAREN, sbU);
    }
}
