package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class qop0 implements sop0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mop0 f29082a;
    public final boolean b;
    public final mdm c;

    public qop0(mop0 mop0Var, boolean z, mdm mdmVar) {
        this.f29082a = mop0Var;
        this.b = z;
        this.c = mdmVar;
    }

    @Override // a.sop0
    public final boolean a() {
        return this.b;
    }

    @Override // a.sop0
    public final mop0 b() {
        return this.f29082a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qop0)) {
            return false;
        }
        qop0 qop0Var = (qop0) obj;
        return this.f29082a.equals(qop0Var.f29082a) && this.b == qop0Var.b && this.c.equals(qop0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.e(this.f29082a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Error(headerUiState=");
        sb.append(this.f29082a);
        sb.append(", rtlSupport=");
        sb.append(this.b);
        sb.append(", lottieConfig=");
        return cs0.m(sb, this.c, Separators.RPAREN);
    }
}
