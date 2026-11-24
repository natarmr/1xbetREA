package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class jdw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f16349a;
    public final String b;
    public final long c;
    public final long d;
    public final String e;
    public final String f;
    public final List g;
    public final List h;

    public jdw(long j, String str, long j2, long j3, String str2, String str3, List list, List list2) {
        list.getClass();
        list2.getClass();
        this.f16349a = j;
        this.b = str;
        this.c = j2;
        this.d = j3;
        this.e = str2;
        this.f = str3;
        this.g = list;
        this.h = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jdw)) {
            return false;
        }
        jdw jdwVar = (jdw) obj;
        return this.f16349a == jdwVar.f16349a && this.b.equals(jdwVar.b) && this.c == jdwVar.c && this.d == jdwVar.d && this.e.equals(jdwVar.e) && this.f.equals(jdwVar.f) && Intrinsics.d(this.g, jdwVar.g) && Intrinsics.d(this.h, jdwVar.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + dw9.a(ua80.b(ua80.b(rw2.b(rw2.b(ua80.b(Long.hashCode(this.f16349a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f16349a, "HltvAwardsNominationModel(id=", ", title=", this.b);
        kng0.A(sbO, ", feedGameId=", this.c, ", marketId=");
        kng0.z(sbO, this.d, ", nominationLogo=", this.e);
        ua80.t(", nominationImage=", this.f, ", nominees=", sbO, this.g);
        return ohs0.s(sbO, ", previousWinners=", this.h, Separators.RPAREN);
    }
}
