package a;

import android.gov.nist.core.Separators;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class rnj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f30790a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public rnj0(File file, boolean z, boolean z2, boolean z3) {
        this.f30790a = file;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    public static rnj0 a(rnj0 rnj0Var, File file, boolean z, boolean z2, boolean z3, int i) {
        if ((i & 1) != 0) {
            file = rnj0Var.f30790a;
        }
        if ((i & 2) != 0) {
            z = rnj0Var.b;
        }
        if ((i & 4) != 0) {
            z2 = rnj0Var.c;
        }
        if ((i & 8) != 0) {
            z3 = rnj0Var.d;
        }
        rnj0Var.getClass();
        return new rnj0(file, z, z2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rnj0)) {
            return false;
        }
        rnj0 rnj0Var = (rnj0) obj;
        return Intrinsics.d(this.f30790a, rnj0Var.f30790a) && this.b == rnj0Var.b && this.c == rnj0Var.c && this.d == rnj0Var.d;
    }

    public final int hashCode() {
        File file = this.f30790a;
        return Boolean.hashCode(this.d) + brm0.e(brm0.e((file == null ? 0 : file.hashCode()) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShareCouponState(couponFile=");
        sb.append(this.f30790a);
        sb.append(", isLoading=");
        sb.append(this.b);
        sb.append(", isError=");
        return ohs0.p(", isImageReloading=", Separators.RPAREN, sb, this.c, this.d);
    }
}
