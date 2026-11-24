package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class b8g0 implements d8g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y6g0 f2155a;
    public final boolean b;
    public final mdm c;

    public b8g0(y6g0 y6g0Var, boolean z, mdm mdmVar) {
        this.f2155a = y6g0Var;
        this.b = z;
        this.c = mdmVar;
    }

    @Override // a.d8g0
    public final boolean a() {
        return this.b;
    }

    @Override // a.d8g0
    public final y6g0 b() {
        return this.f2155a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b8g0)) {
            return false;
        }
        b8g0 b8g0Var = (b8g0) obj;
        return this.f2155a.equals(b8g0Var.f2155a) && this.b == b8g0Var.b && this.c.equals(b8g0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.e(this.f2155a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Error(headerUiState=");
        sb.append(this.f2155a);
        sb.append(", rtlSupport=");
        sb.append(this.b);
        sb.append(", lottieConfig=");
        return cs0.m(sb, this.c, Separators.RPAREN);
    }
}
