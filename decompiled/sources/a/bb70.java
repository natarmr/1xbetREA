package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class bb70 implements wb70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2295a;
    public final String b;
    public final boolean c;

    public bb70(String str, String str2, boolean z) {
        this.f2295a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bb70)) {
            return false;
        }
        bb70 bb70Var = (bb70) obj;
        return this.f2295a.equals(bb70Var.f2295a) && this.b.equals(bb70Var.b) && this.c == bb70Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ua80.b(this.f2295a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.p(b1j.n("Authorized(balance=", this.f2295a, ", totalWinSum=", this.b, ", exitButtonEnable="), this.c, Separators.RPAREN);
    }
}
