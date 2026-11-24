package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ydm0 implements zdm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eme f42446a;
    public final vdm0 b;

    public ydm0(eme emeVar, vdm0 vdm0Var) {
        emeVar.getClass();
        this.f42446a = emeVar;
        this.b = vdm0Var;
    }

    @Override // a.zdm0
    public final eme a() {
        return this.f42446a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ydm0)) {
            return false;
        }
        ydm0 ydm0Var = (ydm0) obj;
        return this.f42446a == ydm0Var.f42446a && this.b.equals(ydm0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f42446a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(coreHeaderModel=" + this.f42446a + ", headerType=" + this.b + Separators.RPAREN;
    }
}
