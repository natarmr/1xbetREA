package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes4.dex */
public final class kmb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CyberGamesPage f18531a;
    public final sip b;
    public final List c;
    public final hhq0 d;
    public final boolean e;
    public final int f;
    public final long g;

    public kmb(CyberGamesPage cyberGamesPage, sip sipVar, List list, hhq0 hhq0Var, boolean z, int i, long j) {
        cyberGamesPage.getClass();
        sipVar.getClass();
        hhq0Var.getClass();
        this.f18531a = cyberGamesPage;
        this.b = sipVar;
        this.c = list;
        this.d = hhq0Var;
        this.e = z;
        this.f = i;
        this.g = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kmb)) {
            return false;
        }
        kmb kmbVar = (kmb) obj;
        return Intrinsics.d(this.f18531a, kmbVar.f18531a) && this.b == kmbVar.b && this.c.equals(kmbVar.c) && Intrinsics.d(this.d, kmbVar.d) && this.e == kmbVar.e && this.f == kmbVar.f && this.g == kmbVar.g;
    }

    public final int hashCode() {
        return Long.hashCode(this.g) + twn.a(this.f, brm0.e((this.d.hashCode() + dw9.a((this.b.hashCode() + (this.f18531a.hashCode() * 31)) * 31, 31, this.c)) * 31, 31, this.e), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChampsQueryParams(cyberGamesPage=");
        sb.append(this.f18531a);
        sb.append(", feedKind=");
        sb.append(this.b);
        sb.append(", sportIds=");
        sb.append(this.c);
        sb.append(", timeFilterModel=");
        sb.append(this.d);
        sb.append(", stream=");
        ua80.q(this.f, ", countryId=", ", localTime=", sb, this.e);
        return brm0.k(this.g, Separators.RPAREN, sb);
    }
}
