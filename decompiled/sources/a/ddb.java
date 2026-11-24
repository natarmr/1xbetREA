package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes4.dex */
public final class ddb implements hdb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f5887a;
    public final long b;
    public final long c;
    public final sff0 d;
    public final List e;
    public final ypl0 f;
    public final CyberGamesPage g;
    public final int h;
    public final boolean i;
    public final String j;
    public final m9s k;

    public ddb(int i, long j, long j2, long j3, m9s m9sVar, sff0 sff0Var, ypl0 ypl0Var, String str, List list, CyberGamesPage cyberGamesPage, boolean z) {
        list.getClass();
        cyberGamesPage.getClass();
        this.f5887a = j;
        this.b = j2;
        this.c = j3;
        this.d = sff0Var;
        this.e = list;
        this.f = ypl0Var;
        this.g = cyberGamesPage;
        this.h = i;
        this.i = z;
        this.j = str;
        this.k = m9sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ddb)) {
            return false;
        }
        ddb ddbVar = (ddb) obj;
        return this.f5887a == ddbVar.f5887a && this.b == ddbVar.b && this.c == ddbVar.c && this.d.equals(ddbVar.d) && Intrinsics.d(this.e, ddbVar.e) && this.f.equals(ddbVar.f) && Intrinsics.d(this.g, ddbVar.g) && this.h == ddbVar.h && this.i == ddbVar.i && this.j.equals(ddbVar.j) && Intrinsics.d(this.k, ddbVar.k);
    }

    public final int hashCode() {
        int iB = ua80.b(brm0.e(twn.a(this.h, (this.g.hashCode() + ((this.f.hashCode() + dw9.a(cs0.c(this.d, rw2.b(rw2.b(Long.hashCode(this.f5887a) * 31, 31, this.b), 31, this.c), 31), 31, this.e)) * 31)) * 31, 31), 31, this.i), 31, this.j);
        m9s m9sVar = this.k;
        return iB + (m9sVar == null ? 0 : m9sVar.hashCode());
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f5887a, "OnSetParams(sportId=", ", subSportId=");
        sbQ.append(this.b);
        kng0.A(sbQ, ", champId=", this.c, ", remoteConfig=");
        sbQ.append(this.d);
        sbQ.append(", specialEvents=");
        sbQ.append(this.e);
        sbQ.append(", sportSimpleModel=");
        sbQ.append(this.f);
        sbQ.append(", cyberGamesPage=");
        sbQ.append(this.g);
        sbQ.append(", globalChampId=");
        brm0.w(this.h, ", live=", ", champName=", sbQ, this.i);
        sbQ.append(this.j);
        sbQ.append(", gameDetails=");
        sbQ.append(this.k);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
