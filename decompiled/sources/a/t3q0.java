package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class t3q0 implements w3q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k3q0 f33282a;
    public final boolean b;
    public final mdm c;

    public t3q0(k3q0 k3q0Var, boolean z, mdm mdmVar) {
        this.f33282a = k3q0Var;
        this.b = z;
        this.c = mdmVar;
    }

    @Override // a.w3q0
    public final boolean a() {
        return this.b;
    }

    @Override // a.w3q0
    public final k3q0 b() {
        return this.f33282a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t3q0)) {
            return false;
        }
        t3q0 t3q0Var = (t3q0) obj;
        return this.f33282a.equals(t3q0Var.f33282a) && this.b == t3q0Var.b && this.c.equals(t3q0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.e(this.f33282a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Error(headerUiState=");
        sb.append(this.f33282a);
        sb.append(", rtlSupport=");
        sb.append(this.b);
        sb.append(", lottieConfig=");
        return cs0.m(sb, this.c, Separators.RPAREN);
    }
}
