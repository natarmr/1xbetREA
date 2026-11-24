package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class e6p0 implements h6p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u5p0 f7297a;
    public final boolean b;
    public final mdm c;

    public e6p0(u5p0 u5p0Var, boolean z, mdm mdmVar) {
        this.f7297a = u5p0Var;
        this.b = z;
        this.c = mdmVar;
    }

    @Override // a.h6p0
    public final boolean a() {
        return this.b;
    }

    @Override // a.h6p0
    public final u5p0 b() {
        return this.f7297a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e6p0)) {
            return false;
        }
        e6p0 e6p0Var = (e6p0) obj;
        return this.f7297a.equals(e6p0Var.f7297a) && this.b == e6p0Var.b && this.c.equals(e6p0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.e(this.f7297a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Error(headerUiState=");
        sb.append(this.f7297a);
        sb.append(", rtlSupport=");
        sb.append(this.b);
        sb.append(", lottieConfig=");
        return cs0.m(sb, this.c, Separators.RPAREN);
    }
}
