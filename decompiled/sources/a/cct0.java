package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class cct0 implements fct0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4129a;
    public final String b;
    public final String c;

    public cct0(String str, String str2, String str3) {
        this.f4129a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cct0)) {
            return false;
        }
        cct0 cct0Var = (cct0) obj;
        return this.f4129a.equals(cct0Var.f4129a) && this.b.equals(cct0Var.b) && this.c.equals(cct0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f4129a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(b1j.n("OpenSocialMedia(label=", this.f4129a, ", appPackage=", this.b, ", uri="), this.c, Separators.RPAREN);
    }
}
