package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class x8o implements y8o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40472a;
    public final String b;
    public final String c;

    public x8o(String str, String str2, String str3) {
        this.f40472a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x8o)) {
            return false;
        }
        x8o x8oVar = (x8o) obj;
        return this.f40472a.equals(x8oVar.f40472a) && this.b.equals(x8oVar.b) && this.c.equals(x8oVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f40472a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(b1j.n("OpenSocialMedia(label=", this.f40472a, ", appPackage=", this.b, ", uri="), this.c, Separators.RPAREN);
    }
}
