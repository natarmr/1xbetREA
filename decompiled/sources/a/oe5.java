package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class oe5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25108a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public oe5(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f25108a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oe5)) {
            return false;
        }
        oe5 oe5Var = (oe5) obj;
        return this.f25108a.equals(oe5Var.f25108a) && this.b.equals(oe5Var.b) && this.c.equals(oe5Var.c) && this.d.equals(oe5Var.d) && this.e.equals(oe5Var.e) && this.f.equals(oe5Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ua80.b(ua80.b(ua80.b(ua80.b(this.f25108a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("BackgroundVideoUrnsModel(smallVideo=", this.f25108a, ", smallPreview=", this.b, ", mediumVideo=");
        f140.v(sbN, this.c, ", mediumPreview=", this.d, ", largeVideo=");
        return ua80.m(sbN, this.e, ", largePreview=", this.f, Separators.RPAREN);
    }
}
