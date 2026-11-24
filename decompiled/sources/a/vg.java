package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class vg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37359a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public vg(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f37359a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vg)) {
            return false;
        }
        vg vgVar = (vg) obj;
        return this.f37359a.equals(vgVar.f37359a) && this.b.equals(vgVar.b) && this.c == vgVar.c && this.d == vgVar.d && this.e == vgVar.e && this.f == vgVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + brm0.e(brm0.e(brm0.e(ua80.b(this.f37359a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("AccountUiState(amount=", this.f37359a, ", currency=", this.b, ", showAccount=");
        ua80.u(", isPayEnable=", ", isWithdrawEnable=", sbN, this.c, this.d);
        return ohs0.p(", isShowLoadingBalance=", Separators.RPAREN, sbN, this.e, this.f);
    }
}
