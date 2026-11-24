package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class anz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1176a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public anz(String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f1176a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof anz)) {
            return false;
        }
        anz anzVar = (anz) obj;
        return this.f1176a.equals(anzVar.f1176a) && this.b.equals(anzVar.b) && this.c.equals(anzVar.c) && this.d == anzVar.d && this.e == anzVar.e && this.f == anzVar.f && this.g == anzVar.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + brm0.e(brm0.e(brm0.e(ua80.b(ua80.b(this.f1176a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("LimitBottomSheetUiModel(initialLimitValue=", this.f1176a, ", limitValue=", this.b, ", currency=");
        brm0.C(this.c, ", hasFreeValue=", ", isVisible=", sbN, this.d);
        ua80.u(", isSaveButtonEnabled=", ", isLoading=", sbN, this.e, this.f);
        return rw2.p(sbN, this.g, Separators.RPAREN);
    }
}
