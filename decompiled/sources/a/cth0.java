package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class cth0 implements dth0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ssh0 f4936a;
    public final boolean b;
    public final int c;
    public final String d;
    public final String e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final i8m0 i;
    public final boolean j;
    public final boolean k;

    public cth0(ssh0 ssh0Var, boolean z, int i, String str, String str2, int i2, boolean z2, boolean z3, i8m0 i8m0Var, boolean z4, boolean z5) {
        str.getClass();
        this.f4936a = ssh0Var;
        this.b = z;
        this.c = i;
        this.d = str;
        this.e = str2;
        this.f = i2;
        this.g = z2;
        this.h = z3;
        this.i = i8m0Var;
        this.j = z4;
        this.k = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cth0)) {
            return false;
        }
        cth0 cth0Var = (cth0) obj;
        return this.f4936a == cth0Var.f4936a && this.b == cth0Var.b && this.c == cth0Var.c && Intrinsics.d(this.d, cth0Var.d) && this.e.equals(cth0Var.e) && this.f == cth0Var.f && this.g == cth0Var.g && this.h == cth0Var.h && this.i == cth0Var.i && this.j == cth0Var.j && this.k == cth0Var.k;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.k) + brm0.e(w6x.g(this.i, brm0.e(brm0.e(twn.a(this.f, ua80.b(ua80.b(twn.a(this.c, brm0.e(this.f4936a.hashCode() * 31, 31, this.b), 31), 31, this.d), 31, this.e), 31), 31, this.g), 31, this.h), 31), 31, this.j);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof cth0) || !(p6t0Var2 instanceof cth0)) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        cth0 cth0Var = (cth0) p6t0Var;
        cth0 cth0Var2 = (cth0) p6t0Var2;
        k9x.G(linkedHashSet, new xsh0(cth0Var.g), new xsh0(cth0Var2.g));
        k9x.G(linkedHashSet, new ysh0(cth0Var.e), new ysh0(cth0Var2.e));
        k9x.G(linkedHashSet, new ath0(cth0Var.i), new ath0(cth0Var2.i));
        k9x.G(linkedHashSet, new zsh0(cth0Var.h), new zsh0(cth0Var2.h));
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return linkedHashSet;
    }

    @Override // a.dth0
    public final boolean s() {
        return this.b;
    }

    @Override // a.dth0
    public final ssh0 t() {
        return this.f4936a;
    }

    public final String toString() {
        String strL = kng0.l("Description(value=", this.e, Separators.RPAREN);
        String strD = defpackage.c.d("Checked(value=", Separators.RPAREN, this.g);
        String strD2 = defpackage.c.d("Enabled(value=", Separators.RPAREN, this.h);
        String str = "Status(value=" + this.i + Separators.RPAREN;
        StringBuilder sb = new StringBuilder("SimpleSwitch(settingType=");
        sb.append(this.f4936a);
        sb.append(", settingAchieved=");
        sb.append(this.b);
        sb.append(", settingTypeIconId=");
        kng0.w(this.c, ", title=", this.d, ", description=", sb);
        twn.w(this.f, strL, ", descriptionColor=", ", checked=", sb);
        f140.v(sb, strD, ", checkEnable=", strD2, ", status=");
        brm0.C(str, ", isFirst=", ", isLast=", sb, this.j);
        return rw2.p(sb, this.k, Separators.RPAREN);
    }
}
