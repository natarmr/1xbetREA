package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class giz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11372a;
    public final String b;
    public final String c;

    public giz(int i, String str, String str2) {
        this.f11372a = i;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof giz)) {
            return false;
        }
        giz gizVar = (giz) obj;
        return this.f11372a == gizVar.f11372a && this.b.equals(gizVar.b) && this.c.equals(gizVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(Integer.hashCode(this.f11372a) * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(vqd.r(this.f11372a, "LeagueModel(id=", ", name=", this.b, ", image="), this.c, Separators.RPAREN);
    }
}
