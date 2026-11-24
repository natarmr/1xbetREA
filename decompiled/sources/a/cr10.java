package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class cr10 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yq10 f4821a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public cr10(yq10 yq10Var, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f4821a = yq10Var;
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
    }

    public static cr10 c(cr10 cr10Var, boolean z, int i) {
        yq10 yq10Var = cr10Var.f4821a;
        String str = cr10Var.b;
        boolean z2 = (i & 4) != 0 ? cr10Var.c : false;
        if ((i & 8) != 0) {
            z = cr10Var.d;
        }
        return new cr10(yq10Var, str, z2, z, cr10Var.e, cr10Var.f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cr10)) {
            return false;
        }
        cr10 cr10Var = (cr10) obj;
        return this.f4821a == cr10Var.f4821a && this.b.equals(cr10Var.b) && this.c == cr10Var.c && this.d == cr10Var.d && this.e == cr10Var.e && this.f == cr10Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + brm0.e(brm0.e(brm0.e(ua80.b(this.f4821a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MailingSettingsUiModel(mailingSettingsTypeModel=");
        sb.append(this.f4821a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", enabled=");
        ua80.u(", checked=", ", isFirst=", sb, this.c, this.d);
        return ohs0.p(", isLast=", Separators.RPAREN, sb, this.e, this.f);
    }
}
