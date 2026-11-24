package a;

import android.content.res.ColorStateList;
import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class pgv0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26969a;
    public final String b;
    public final String c;
    public final ColorStateList d;
    public final String e;

    public pgv0(String str, String str2, String str3, ColorStateList colorStateList, String str4) {
        colorStateList.getClass();
        this.f26969a = str;
        this.b = str2;
        this.c = str3;
        this.d = colorStateList;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pgv0)) {
            return false;
        }
        pgv0 pgv0Var = (pgv0) obj;
        return this.f26969a.equals(pgv0Var.f26969a) && this.b.equals(pgv0Var.b) && this.c.equals(pgv0Var.c) && Intrinsics.d(this.d, pgv0Var.d) && this.e.equals(pgv0Var.e);
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return (p6t0Var instanceof pgv0) && (p6t0Var2 instanceof pgv0);
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ua80.b(ua80.b(this.f26969a.hashCode() * 31, 31, this.b), 31, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("WinBackBannerUiModel(bannerTitle=", this.f26969a, ", bannerDescription=", this.b, ", bannerImage=");
        sbN.append(this.c);
        sbN.append(", background=");
        sbN.append(this.d);
        sbN.append(", winBackAnalytics=");
        return axq.n(sbN, this.e, Separators.RPAREN);
    }
}
