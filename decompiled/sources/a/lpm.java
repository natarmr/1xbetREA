package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class lpm implements mpm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rpm f20449a;
    public final ipm b;

    public lpm(rpm rpmVar, ipm ipmVar) {
        this.f20449a = rpmVar;
        this.b = ipmVar;
    }

    @Override // a.mpm
    public final rpm a() {
        return this.f20449a;
    }

    @Override // a.mpm
    public final ipm b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lpm)) {
            return false;
        }
        lpm lpmVar = (lpm) obj;
        return this.f20449a.equals(lpmVar.f20449a) && this.b.equals(lpmVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f20449a.hashCode() * 31);
    }

    public final String toString() {
        return "VS(style=" + this.f20449a + ", colorStyle=" + this.b + Separators.RPAREN;
    }
}
