package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class e9t {
    public static final e9t e = new e9t("", "", "", "");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7439a;
    public final String b;
    public final String c;
    public final String d;

    public e9t(String str, String str2, String str3, String str4) {
        this.f7439a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e9t)) {
            return false;
        }
        e9t e9tVar = (e9t) obj;
        return this.f7439a.equals(e9tVar.f7439a) && this.b.equals(e9tVar.b) && this.c.equals(e9tVar.c) && this.d.equals(e9tVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(ua80.b(this.f7439a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return ua80.m(b1j.n("GamesManiaJackpotModel(day=", this.f7439a, ", hour=", this.b, ", month="), this.c, ", week=", this.d, Separators.RPAREN);
    }
}
