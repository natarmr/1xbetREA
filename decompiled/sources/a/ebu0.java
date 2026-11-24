package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ebu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7536a;
    public final cau0 b;
    public final x9u0 c;
    public final boolean d;
    public final lxw e;
    public final boolean f;

    public ebu0(String str, cau0 cau0Var, x9u0 x9u0Var, boolean z, lxw lxwVar, boolean z2) {
        str.getClass();
        this.f7536a = str;
        this.b = cau0Var;
        this.c = x9u0Var;
        this.d = z;
        this.e = lxwVar;
        this.f = z2;
    }

    public static ebu0 a(ebu0 ebu0Var, cau0 cau0Var, x9u0 x9u0Var, int i) {
        String str = ebu0Var.f7536a;
        if ((i & 2) != 0) {
            cau0Var = ebu0Var.b;
        }
        cau0 cau0Var2 = cau0Var;
        if ((i & 4) != 0) {
            x9u0Var = ebu0Var.c;
        }
        boolean z = ebu0Var.d;
        lxw lxwVar = ebu0Var.e;
        boolean z2 = ebu0Var.f;
        ebu0Var.getClass();
        str.getClass();
        return new ebu0(str, cau0Var2, x9u0Var, z, lxwVar, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ebu0)) {
            return false;
        }
        ebu0 ebu0Var = (ebu0) obj;
        return Intrinsics.d(this.f7536a, ebu0Var.f7536a) && this.b == ebu0Var.b && this.c == ebu0Var.c && this.d == ebu0Var.d && this.e == ebu0Var.e && this.f == ebu0Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + brm0.e((this.c.hashCode() + ((this.b.hashCode() + (this.f7536a.hashCode() * 31)) * 31)) * 31, 31, this.d)) * 31);
    }

    public final String toString() {
        return "VerificationStatusState(title=" + this.f7536a + ", verificationStatus=" + this.b + ", contentState=" + this.c + ", hasBlockAuthVerification=" + this.d + ", identificationFlow=" + this.e + ", hasBonusIdentificationKZ=" + this.f + Separators.RPAREN;
    }
}
