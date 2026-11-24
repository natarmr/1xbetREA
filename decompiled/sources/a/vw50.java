package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class vw50 implements yw50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eu50 f38132a;
    public final boolean b;
    public final mdm c;

    public vw50(eu50 eu50Var, boolean z, mdm mdmVar) {
        this.f38132a = eu50Var;
        this.b = z;
        this.c = mdmVar;
    }

    @Override // a.yw50
    public final boolean a() {
        return this.b;
    }

    @Override // a.yw50
    public final eu50 b() {
        return this.f38132a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vw50)) {
            return false;
        }
        vw50 vw50Var = (vw50) obj;
        return this.f38132a.equals(vw50Var.f38132a) && this.b == vw50Var.b && this.c.equals(vw50Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.e(this.f38132a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Error(headerUiState=");
        sb.append(this.f38132a);
        sb.append(", rtlSupport=");
        sb.append(this.b);
        sb.append(", lottieConfig=");
        return cs0.m(sb, this.c, Separators.RPAREN);
    }
}
