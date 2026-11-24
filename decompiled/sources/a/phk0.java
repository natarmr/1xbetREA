package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class phk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27002a;
    public final String b;
    public final String c;

    public phk0(String str, String str2, String str3) {
        this.f27002a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof phk0)) {
            return false;
        }
        phk0 phk0Var = (phk0) obj;
        return this.f27002a.equals(phk0Var.f27002a) && this.b.equals(phk0Var.b) && this.c.equals(phk0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f27002a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(b1j.n("SocialMediaModel(title=", this.f27002a, ", image=", this.b, ", url="), this.c, Separators.RPAREN);
    }
}
