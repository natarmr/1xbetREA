package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class yjd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42735a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public yjd0(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f42735a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
    }

    public static yjd0 a(yjd0 yjd0Var, String str, boolean z, int i) {
        if ((i & 1) != 0) {
            str = yjd0Var.f42735a;
        }
        String str2 = str;
        if ((i & 2) != 0) {
            z = yjd0Var.b;
        }
        boolean z2 = yjd0Var.c;
        boolean z3 = yjd0Var.d;
        boolean z4 = yjd0Var.e;
        boolean z5 = yjd0Var.f;
        yjd0Var.getClass();
        return new yjd0(str2, z, z2, z3, z4, z5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yjd0)) {
            return false;
        }
        yjd0 yjd0Var = (yjd0) obj;
        return this.f42735a.equals(yjd0Var.f42735a) && this.b == yjd0Var.b && this.c == yjd0Var.c && this.d == yjd0Var.d && this.e == yjd0Var.e && this.f == yjd0Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + brm0.e(brm0.e(brm0.e(brm0.e(this.f42735a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbU = brm0.u("UiState(phoneNumber=", this.f42735a, ", networkConnected=", this.b, ", enableSMS=");
        ua80.u(", enableVoiceSMS=", ", enableTelegram=", sbU, this.c, this.d);
        return ohs0.p(", enableFlashCall=", Separators.RPAREN, sbU, this.e, this.f);
    }
}
