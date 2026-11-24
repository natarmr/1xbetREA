package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class xq10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yq10 f41293a;
    public final boolean b;
    public final boolean c;

    public xq10(yq10 yq10Var, boolean z, boolean z2) {
        this.f41293a = yq10Var;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xq10)) {
            return false;
        }
        xq10 xq10Var = (xq10) obj;
        return this.f41293a == xq10Var.f41293a && this.b == xq10Var.b && this.c == xq10Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + brm0.e(this.f41293a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MailingSettingsModel(mailingSettingsTypeModel=");
        sb.append(this.f41293a);
        sb.append(", enabled=");
        sb.append(this.b);
        sb.append(", checked=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
