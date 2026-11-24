package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class eh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7786a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final boolean g;

    public eh(int i, String str, String str2, String str3, String str4, String str5, boolean z) {
        this.f7786a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = i;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eh)) {
            return false;
        }
        eh ehVar = (eh) obj;
        return this.f7786a.equals(ehVar.f7786a) && this.b.equals(ehVar.b) && this.c.equals(ehVar.c) && this.d.equals(ehVar.d) && this.e.equals(ehVar.e) && this.f == ehVar.f && this.g == ehVar.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + twn.a(this.f, ua80.b(ua80.b(ua80.b(ua80.b(this.f7786a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("AchievementModel(name=", this.f7786a, ", image=", this.b, ", date=");
        f140.v(sbN, this.c, ", tier=", this.d, ", place=");
        twn.w(this.f, this.e, ", prize=", ", isCurrencySymbolOnLeft=", sbN);
        return rw2.p(sbN, this.g, Separators.RPAREN);
    }
}
