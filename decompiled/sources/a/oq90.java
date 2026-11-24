package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class oq90 implements sq90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25677a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final int e;

    public oq90(int i, int i2, String str, boolean z, boolean z2) {
        str.getClass();
        this.f25677a = str;
        this.b = z;
        this.c = z2;
        this.d = i;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oq90)) {
            return false;
        }
        oq90 oq90Var = (oq90) obj;
        return Intrinsics.d(this.f25677a, oq90Var.f25677a) && this.b == oq90Var.b && this.c == oq90Var.c && this.d == oq90Var.d && this.e == oq90Var.e;
    }

    @Override // a.sq90
    public final int getId() {
        return this.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + twn.a(this.d, brm0.e(brm0.e(this.f25677a.hashCode() * 31, 31, this.b), 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder sbU = brm0.u("Currency(description=", this.f25677a, ", isLastItem=", this.b, ", selected=");
        ua80.q(this.d, ", id=", ", tintAttr=", sbU, this.c);
        return rz4.j(this.e, Separators.RPAREN, sbU);
    }
}
