package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class gqh0 implements hqh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ssh0 f11733a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final boolean e;
    public final String f;

    public gqh0(ssh0 ssh0Var, boolean z, boolean z2, String str, boolean z3, String str2) {
        this.f11733a = ssh0Var;
        this.b = z;
        this.c = z2;
        this.d = str;
        this.e = z3;
        this.f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gqh0)) {
            return false;
        }
        gqh0 gqh0Var = (gqh0) obj;
        return this.f11733a == gqh0Var.f11733a && this.b == gqh0Var.b && this.c == gqh0Var.c && this.d.equals(gqh0Var.d) && this.e == gqh0Var.e && this.f.equals(gqh0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + brm0.e(ua80.b(brm0.e(brm0.e(this.f11733a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    @Override // a.hqh0
    public final boolean s() {
        return this.b;
    }

    @Override // a.hqh0
    public final ssh0 t() {
        return this.f11733a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimpleSwitch(settingType=");
        sb.append(this.f11733a);
        sb.append(", settingAchieved=");
        sb.append(this.b);
        sb.append(", enabled=");
        f140.s(", title=", this.d, ", checked=", sb, this.c);
        return twn.q(", description=", this.f, Separators.RPAREN, sb, this.e);
    }
}
