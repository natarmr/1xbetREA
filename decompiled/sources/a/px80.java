package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class px80 implements rx80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cx80 f27741a;
    public final uw80 b;
    public final zw80 c;

    public px80(cx80 cx80Var, uw80 uw80Var, zw80 zw80Var) {
        this.f27741a = cx80Var;
        this.b = uw80Var;
        this.c = zw80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof px80)) {
            return false;
        }
        px80 px80Var = (px80) obj;
        return this.f27741a.equals(px80Var.f27741a) && this.b.equals(px80Var.b) && this.c.equals(px80Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f27741a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Content(partnerTeamInfo=" + this.f27741a + ", partnerTeamAnnounce=" + this.b + ", disciplines=" + this.c + Separators.RPAREN;
    }
}
