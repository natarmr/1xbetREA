package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class x6j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f40367a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final boolean e;
    public final boolean f;

    public x6j0(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f40367a = z;
        this.b = z2;
        this.c = z3;
        this.d = str;
        this.e = z4;
        this.f = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x6j0)) {
            return false;
        }
        x6j0 x6j0Var = (x6j0) obj;
        return this.f40367a == x6j0Var.f40367a && this.b == x6j0Var.b && this.c == x6j0Var.c && this.d.equals(x6j0Var.d) && this.e == x6j0Var.e && this.f == x6j0Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + brm0.e(ua80.b(brm0.e(brm0.e(Boolean.hashCode(this.f40367a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("SettingsRemoteConfigModel(hasAppSharingByLink=", ", hasAppSharingByQr=", ", hasRateApp=", this.f40367a, this.b);
        f140.s(", linkToRateApp=", this.d, ", hasSectionSecurity=", sbQ, this.c);
        return ohs0.p(", hasShakeSection=", Separators.RPAREN, sbQ, this.e, this.f);
    }
}
