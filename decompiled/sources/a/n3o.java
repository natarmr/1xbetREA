package a;

import android.gov.nist.core.Separators;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes4.dex */
public final class n3o implements p3o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f22859a;
    public final boolean b;
    public final boolean c;
    public final CyberGamesPage d;

    public n3o(boolean z, boolean z2, boolean z3, CyberGamesPage cyberGamesPage) {
        this.f22859a = z;
        this.b = z2;
        this.c = z3;
        this.d = cyberGamesPage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n3o)) {
            return false;
        }
        n3o n3oVar = (n3o) obj;
        return this.f22859a == n3oVar.f22859a && this.b == n3oVar.b && this.c == n3oVar.c && this.d.equals(n3oVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + brm0.e(brm0.e(Boolean.hashCode(this.f22859a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("Content(live=", ", supportRtl=", ", shimmers=", this.f22859a, this.b);
        sbQ.append(this.c);
        sbQ.append(", cyberGamesPage=");
        sbQ.append(this.d);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
