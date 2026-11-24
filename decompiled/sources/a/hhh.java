package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class hhh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13063a;
    public final String b;
    public final String c;

    public hhh(String str, String str2, String str3) {
        this.f13063a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hhh)) {
            return false;
        }
        hhh hhhVar = (hhh) obj;
        return this.f13063a.equals(hhhVar.f13063a) && this.b.equals(hhhVar.b) && this.c.equals(hhhVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f13063a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(b1j.n("CyberTeamModel(id=", this.f13063a, ", title=", this.b, ", image="), this.c, Separators.RPAREN);
    }
}
