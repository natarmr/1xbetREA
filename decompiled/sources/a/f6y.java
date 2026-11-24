package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class f6y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9035a;
    public final String b;
    public final String c;
    public final String d;

    public f6y(String str, String str2, String str3, String str4) {
        this.f9035a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f6y)) {
            return false;
        }
        f6y f6yVar = (f6y) obj;
        return this.f9035a.equals(f6yVar.f9035a) && this.b.equals(f6yVar.b) && this.c.equals(f6yVar.c) && this.d.equals(f6yVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(ua80.b(this.f9035a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return ua80.m(b1j.n("JackpotModel(hour=", this.f9035a, ", day=", this.b, ", week="), this.c, ", month=", this.d, Separators.RPAREN);
    }
}
