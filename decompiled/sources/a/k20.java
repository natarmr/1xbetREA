package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class k20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17554a;
    public final cau0 b;
    public final e10 c;
    public final boolean d;
    public final lxw e;
    public final boolean f;

    public k20(String str, cau0 cau0Var, e10 e10Var, boolean z, lxw lxwVar, boolean z2) {
        str.getClass();
        this.f17554a = str;
        this.b = cau0Var;
        this.c = e10Var;
        this.d = z;
        this.e = lxwVar;
        this.f = z2;
    }

    public static k20 a(k20 k20Var, cau0 cau0Var, e10 e10Var, int i) {
        String str = k20Var.f17554a;
        if ((i & 2) != 0) {
            cau0Var = k20Var.b;
        }
        cau0 cau0Var2 = cau0Var;
        if ((i & 4) != 0) {
            e10Var = k20Var.c;
        }
        boolean z = k20Var.d;
        lxw lxwVar = k20Var.e;
        boolean z2 = k20Var.f;
        k20Var.getClass();
        str.getClass();
        cau0Var2.getClass();
        return new k20(str, cau0Var2, e10Var, z, lxwVar, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k20)) {
            return false;
        }
        k20 k20Var = (k20) obj;
        return Intrinsics.d(this.f17554a, k20Var.f17554a) && this.b == k20Var.b && this.c == k20Var.c && this.d == k20Var.d && this.e == k20Var.e && this.f == k20Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + brm0.e((this.c.hashCode() + ((this.b.hashCode() + (this.f17554a.hashCode() * 31)) * 31)) * 31, 31, this.d)) * 31);
    }

    public final String toString() {
        return "AdditionalVerificationStatusState(title=" + this.f17554a + ", verificationStatus=" + this.b + ", contentState=" + this.c + ", hasBlockAuthVerification=" + this.d + ", identificationFlow=" + this.e + ", hasBonusIdentificationKZ=" + this.f + Separators.RPAREN;
    }
}
