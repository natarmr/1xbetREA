package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class cql {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4799a;
    public final String b;
    public final String c;
    public final hql d;
    public final String e;
    public final n0x f;
    public final wzr0 g;
    public final String h;

    public cql(long j, String str, String str2, hql hqlVar, String str3, n0x n0xVar, wzr0 wzr0Var, String str4) {
        str2.getClass();
        str3.getClass();
        this.f4799a = j;
        this.b = str;
        this.c = str2;
        this.d = hqlVar;
        this.e = str3;
        this.f = n0xVar;
        this.g = wzr0Var;
        this.h = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cql)) {
            return false;
        }
        cql cqlVar = (cql) obj;
        return this.f4799a == cqlVar.f4799a && this.b.equals(cqlVar.b) && Intrinsics.d(this.c, cqlVar.c) && this.d == cqlVar.d && Intrinsics.d(this.e, cqlVar.e) && this.f.equals(cqlVar.f) && Intrinsics.d(this.g, cqlVar.g) && Intrinsics.d(this.h, cqlVar.h);
    }

    public final int hashCode() {
        int iF = f140.f(this.f, ua80.b((this.d.hashCode() + ua80.b(ua80.b(Long.hashCode(this.f4799a) * 31, 31, this.b), 31, this.c)) * 31, 31, this.e), 31);
        wzr0 wzr0Var = this.g;
        int iHashCode = (iF + (wzr0Var == null ? 0 : wzr0Var.hashCode())) * 31;
        String str = this.h;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f4799a, "DsAggregatorTournamentCollectionPopularItemUiModel(tournamentId=", ", amount=", this.b);
        sbO.append(", title=");
        sbO.append(this.c);
        sbO.append(", tagType=");
        sbO.append(this.d);
        sbO.append(", tagLabel=");
        sbO.append(this.e);
        sbO.append(", picture=");
        sbO.append(this.f);
        sbO.append(", timerModel=");
        sbO.append(this.g);
        sbO.append(", additionalTagLabel=");
        sbO.append(this.h);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
