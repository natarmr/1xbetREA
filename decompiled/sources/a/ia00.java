package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ia00 implements ka00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14414a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;

    public ia00(String str, String str2, String str3, boolean z, String str4) {
        this.f14414a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ia00)) {
            return false;
        }
        ia00 ia00Var = (ia00) obj;
        return this.f14414a.equals(ia00Var.f14414a) && this.b.equals(ia00Var.b) && this.c.equals(ia00Var.c) && this.d.equals(ia00Var.d) && this.e == ia00Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ua80.b(ua80.b(ua80.b(this.f14414a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("PlayerItem(id=", this.f14414a, ", playerId=", this.b, ", title=");
        f140.v(sbN, this.c, ", logo=", this.d, ", isLast=");
        return rw2.p(sbN, this.e, Separators.RPAREN);
    }
}
