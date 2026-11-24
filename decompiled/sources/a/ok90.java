package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ok90 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f25397a;
    public final String b;
    public final long c;
    public final boolean d;
    public final boolean e;

    /* JADX WARN: Multi-variable type inference failed */
    public ok90(int i, long j, String str, boolean z, boolean z2) {
        str.getClass();
        this.f25397a = i;
        this.b = str;
        this.c = j;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ok90)) {
            return false;
        }
        ok90 ok90Var = (ok90) obj;
        if (this.f25397a != ok90Var.f25397a || !Intrinsics.d(this.b, ok90Var.b)) {
            return false;
        }
        long j = ok90Var.c;
        int i = y3d.h;
        return h2t0.a(this.c, j) && this.d == ok90Var.d && this.e == ok90Var.e;
    }

    public final int hashCode() {
        int iB = ua80.b(Integer.hashCode(this.f25397a) * 31, 31, this.b);
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Boolean.hashCode(this.e) + brm0.e(rw2.b(iB, 31, this.c), 31, this.d);
    }

    public final String toString() {
        String strI = y3d.i(this.c);
        StringBuilder sbR = vqd.r(this.f25397a, "PersonalGenderUiModel(id=", ", name=", this.b, ", textColor=");
        brm0.C(strI, ", selected=", ", lastElement=", sbR, this.d);
        return rw2.p(sbR, this.e, Separators.RPAREN);
    }
}
