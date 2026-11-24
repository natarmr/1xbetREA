package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class fze0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f10404a;
    public final int b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final String f;

    public fze0(long j, int i, String str, boolean z, boolean z2, String str2) {
        str.getClass();
        this.f10404a = j;
        this.b = i;
        this.c = str;
        this.d = z;
        this.e = z2;
        this.f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fze0)) {
            return false;
        }
        fze0 fze0Var = (fze0) obj;
        return this.f10404a == fze0Var.f10404a && this.b == fze0Var.b && Intrinsics.d(this.c, fze0Var.c) && this.d == fze0Var.d && this.e == fze0Var.e && Intrinsics.d(this.f, fze0Var.f);
    }

    public final int hashCode() {
        int iE = brm0.e(brm0.e(ua80.b(twn.a(this.b, Long.hashCode(this.f10404a) * 31, 31), 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        return iE + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbQ = brm0.q(this.b, this.f10404a, "RegistrationEntity(id=", ", regTypeId=");
        w6x.z(", fieldName=", this.c, ", isRequired=", sbQ, this.d);
        hne.u(", isHidden=", ", minAge=", this.f, sbQ, this.e);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
