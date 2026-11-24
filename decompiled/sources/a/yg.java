package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class yg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42562a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;

    public yg(String str, String str2, String str3, boolean z, boolean z2) {
        this.f42562a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yg)) {
            return false;
        }
        yg ygVar = (yg) obj;
        return this.f42562a.equals(ygVar.f42562a) && this.b.equals(ygVar.b) && this.c.equals(ygVar.c) && this.d == ygVar.d && this.e == ygVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + brm0.e(ua80.b(ua80.b(this.f42562a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("AccountWidget(accountDescription=", this.f42562a, ", sum=", this.b, ", currency=");
        brm0.C(this.c, ", payInEnabled=", ", payOutEnabled=", sbN, this.d);
        return rw2.p(sbN, this.e, Separators.RPAREN);
    }
}
