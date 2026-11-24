package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class od30 implements rd30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bd30 f25059a;
    public final boolean b;
    public final mdm c;

    public od30(bd30 bd30Var, boolean z, mdm mdmVar) {
        this.f25059a = bd30Var;
        this.b = z;
        this.c = mdmVar;
    }

    @Override // a.rd30
    public final boolean a() {
        return this.b;
    }

    @Override // a.rd30
    public final bd30 b() {
        return this.f25059a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof od30)) {
            return false;
        }
        od30 od30Var = (od30) obj;
        return this.f25059a.equals(od30Var.f25059a) && this.b == od30Var.b && this.c.equals(od30Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.e(this.f25059a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Error(headerUiState=");
        sb.append(this.f25059a);
        sb.append(", rtlSupport=");
        sb.append(this.b);
        sb.append(", lottieConfig=");
        return cs0.m(sb, this.c, Separators.RPAREN);
    }
}
