package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class djk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6191a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;

    public djk0(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.f6191a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djk0)) {
            return false;
        }
        djk0 djk0Var = (djk0) obj;
        return this.f6191a.equals(djk0Var.f6191a) && this.b == djk0Var.b && this.c.equals(djk0Var.c) && this.d.equals(djk0Var.d) && this.e.equals(djk0Var.e) && this.f.equals(djk0Var.f) && this.g.equals(djk0Var.g) && this.h.equals(djk0Var.h) && this.i.equals(djk0Var.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(twn.a(this.b, this.f6191a.hashCode() * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sbP = kng0.p(this.b, "SocialRegistrationModel(id=", this.f6191a, ", socialNetId=", ", tokenSecret=");
        f140.v(sbP, this.c, ", socialAppKey=", this.d, ", name=");
        f140.v(sbP, this.e, ", sureName=", this.f, ", email=");
        f140.v(sbP, this.g, ", phone=", this.h, ", token=");
        return axq.n(sbP, this.i, Separators.RPAREN);
    }
}
