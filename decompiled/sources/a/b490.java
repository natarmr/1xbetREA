package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class b490 implements q490 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1948a;
    public final String b;
    public final String c;

    public b490(String str, String str2, String str3) {
        this.f1948a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b490)) {
            return false;
        }
        b490 b490Var = (b490) obj;
        return this.f1948a.equals(b490Var.f1948a) && this.b.equals(b490Var.b) && this.c.equals(b490Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f1948a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(b1j.n("OnCorruptedFileUrl(url=", this.f1948a, ", message=", this.b, ", currentUrl="), this.c, Separators.RPAREN);
    }
}
