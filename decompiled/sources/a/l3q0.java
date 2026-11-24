package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class l3q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19371a;
    public final String b;
    public final int c;
    public final String d;
    public final boolean e;

    public l3q0(int i, String str, String str2, String str3, boolean z) {
        this.f19371a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l3q0)) {
            return false;
        }
        l3q0 l3q0Var = (l3q0) obj;
        return this.f19371a.equals(l3q0Var.f19371a) && this.b.equals(l3q0Var.b) && this.c == l3q0Var.c && this.d.equals(l3q0Var.d) && this.e == l3q0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ua80.b(twn.a(this.c, ua80.b(this.f19371a.hashCode() * 31, 31, this.b), 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("TextBroadcastModel(text=", this.f19371a, ", time=", this.b, ", type=");
        kng0.w(this.c, ", image=", this.d, ", isImportant=", sbN);
        return rw2.p(sbN, this.e, Separators.RPAREN);
    }
}
