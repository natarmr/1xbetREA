package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class vbr0 implements xbr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rbr0 f37153a;
    public final boolean b;
    public final mdm c;

    public vbr0(rbr0 rbr0Var, boolean z, mdm mdmVar) {
        this.f37153a = rbr0Var;
        this.b = z;
        this.c = mdmVar;
    }

    @Override // a.xbr0
    public final boolean a() {
        return this.b;
    }

    @Override // a.xbr0
    public final rbr0 b() {
        return this.f37153a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vbr0)) {
            return false;
        }
        vbr0 vbr0Var = (vbr0) obj;
        return this.f37153a.equals(vbr0Var.f37153a) && this.b == vbr0Var.b && this.c.equals(vbr0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.e(this.f37153a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Error(headerUiState=");
        sb.append(this.f37153a);
        sb.append(", rtlSupport=");
        sb.append(this.b);
        sb.append(", lottieConfig=");
        return cs0.m(sb, this.c, Separators.RPAREN);
    }
}
