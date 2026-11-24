package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class fqh0 implements hqh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ssh0 f9974a;
    public final boolean b;
    public final String c;
    public final String d;
    public final boolean e;

    public fqh0(ssh0 ssh0Var, boolean z, String str, String str2, boolean z2) {
        this.f9974a = ssh0Var;
        this.b = z;
        this.c = str;
        this.d = str2;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fqh0)) {
            return false;
        }
        fqh0 fqh0Var = (fqh0) obj;
        return this.f9974a == fqh0Var.f9974a && this.b == fqh0Var.b && this.c.equals(fqh0Var.c) && this.d.equals(fqh0Var.d) && this.e == fqh0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ua80.b(ua80.b(brm0.e(this.f9974a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    @Override // a.hqh0
    public final boolean s() {
        return this.b;
    }

    @Override // a.hqh0
    public final ssh0 t() {
        return this.f9974a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Simple(settingType=");
        sb.append(this.f9974a);
        sb.append(", settingAchieved=");
        sb.append(this.b);
        sb.append(", title=");
        f140.v(sb, this.c, ", description=", this.d, ", showArrow=");
        return rw2.p(sb, this.e, Separators.RPAREN);
    }
}
