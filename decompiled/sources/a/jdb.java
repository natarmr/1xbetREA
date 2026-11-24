package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes4.dex */
public final class jdb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f16320a;
    public final long b;
    public final long c;
    public final String d;
    public final int e;
    public final m9s f;
    public final sff0 g;
    public final List h;
    public final ypl0 i;
    public final CyberGamesPage j;
    public final boolean k;

    public jdb(int i, long j, long j2, long j3, m9s m9sVar, sff0 sff0Var, ypl0 ypl0Var, String str, List list, CyberGamesPage cyberGamesPage, boolean z) {
        list.getClass();
        cyberGamesPage.getClass();
        this.f16320a = j;
        this.b = j2;
        this.c = j3;
        this.d = str;
        this.e = i;
        this.f = m9sVar;
        this.g = sff0Var;
        this.h = list;
        this.i = ypl0Var;
        this.j = cyberGamesPage;
        this.k = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jdb)) {
            return false;
        }
        jdb jdbVar = (jdb) obj;
        return this.f16320a == jdbVar.f16320a && this.b == jdbVar.b && this.c == jdbVar.c && this.d.equals(jdbVar.d) && this.e == jdbVar.e && Intrinsics.d(this.f, jdbVar.f) && Intrinsics.d(this.g, jdbVar.g) && Intrinsics.d(this.h, jdbVar.h) && Intrinsics.d(this.i, jdbVar.i) && Intrinsics.d(this.j, jdbVar.j) && this.k == jdbVar.k;
    }

    public final int hashCode() {
        int iA = twn.a(this.e, ua80.b(rw2.b(rw2.b(Long.hashCode(this.f16320a) * 31, 31, this.b), 31, this.c), 31, this.d), 31);
        m9s m9sVar = this.f;
        int iHashCode = (iA + (m9sVar == null ? 0 : m9sVar.hashCode())) * 31;
        sff0 sff0Var = this.g;
        int iA2 = dw9.a((iHashCode + (sff0Var == null ? 0 : sff0Var.hashCode())) * 31, 31, this.h);
        ypl0 ypl0Var = this.i;
        return Boolean.hashCode(this.k) + ((this.j.hashCode() + ((iA2 + (ypl0Var != null ? ypl0Var.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f16320a, "ChampInfoState(sportId=", ", subSportId=");
        sbQ.append(this.b);
        kng0.A(sbQ, ", champIdFromParams=", this.c, ", champNameFromParams=");
        twn.w(this.e, this.d, ", globalChampId=", ", gameDetails=", sbQ);
        sbQ.append(this.f);
        sbQ.append(", remoteConfig=");
        sbQ.append(this.g);
        sbQ.append(", specialEvents=");
        sbQ.append(this.h);
        sbQ.append(", sportSimpleModel=");
        sbQ.append(this.i);
        sbQ.append(", cyberGamesPage=");
        sbQ.append(this.j);
        sbQ.append(", live=");
        sbQ.append(this.k);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
