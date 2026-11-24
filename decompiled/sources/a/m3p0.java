package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class m3p0 implements n3p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zrm f21128a;
    public final xcp b;

    public m3p0(zrm zrmVar, xcp xcpVar) {
        this.f21128a = zrmVar;
        this.b = xcpVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m3p0)) {
            return false;
        }
        m3p0 m3p0Var = (m3p0) obj;
        return this.f21128a.equals(m3p0Var.f21128a) && this.b.equals(m3p0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f21128a.hashCode() * 31);
    }

    public final String toString() {
        return "Team(style=" + this.f21128a + ", teamModel=" + this.b + Separators.RPAREN;
    }
}
