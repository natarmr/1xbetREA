package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class x48 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f40252a;
    public final boolean b;
    public final boolean c;
    public final List d;
    public final List e;
    public final int f;

    public x48(boolean z, boolean z2, boolean z3, List list, List list2, int i) {
        list.getClass();
        list2.getClass();
        this.f40252a = z;
        this.b = z2;
        this.c = z3;
        this.d = list;
        this.e = list2;
        this.f = i;
    }

    public static x48 a(x48 x48Var, boolean z, boolean z2, boolean z3, int i, int i2) {
        if ((i2 & 1) != 0) {
            z = x48Var.f40252a;
        }
        boolean z4 = z;
        if ((i2 & 2) != 0) {
            z2 = x48Var.b;
        }
        boolean z5 = z2;
        if ((i2 & 4) != 0) {
            z3 = x48Var.c;
        }
        boolean z6 = z3;
        List list = x48Var.d;
        List list2 = x48Var.e;
        if ((i2 & 32) != 0) {
            i = x48Var.f;
        }
        x48Var.getClass();
        list.getClass();
        list2.getClass();
        return new x48(z4, z5, z6, list, list2, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x48)) {
            return false;
        }
        x48 x48Var = (x48) obj;
        return this.f40252a == x48Var.f40252a && this.b == x48Var.b && this.c == x48Var.c && Intrinsics.d(this.d, x48Var.d) && Intrinsics.d(this.e, x48Var.e) && this.f == x48Var.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + dw9.a(dw9.a(brm0.e(brm0.e(Boolean.hashCode(this.f40252a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("BiographyState(isLoading=", ", isError=", ", isEmpty=", this.f40252a, this.b);
        vqd.y(sbQ, ", photoItems=", this.d, ", biographyInfoItems=", this.c);
        sbQ.append(this.e);
        sbQ.append(", currentPhotoPosition=");
        sbQ.append(this.f);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
