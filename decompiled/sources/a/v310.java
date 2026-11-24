package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class v310 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n410 f36713a;
    public final n410 b;
    public final int c;
    public final String d;
    public final long e;
    public final List f;
    public final List g;
    public final List h;

    public v310(n410 n410Var, n410 n410Var2, int i, String str, long j, List list, List list2, List list3) {
        b1j.B(list, list2, list3);
        this.f36713a = n410Var;
        this.b = n410Var2;
        this.c = i;
        this.d = str;
        this.e = j;
        this.f = list;
        this.g = list2;
        this.h = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v310)) {
            return false;
        }
        v310 v310Var = (v310) obj;
        return this.f36713a.equals(v310Var.f36713a) && this.b.equals(v310Var.b) && this.c == v310Var.c && this.d.equals(v310Var.d) && this.e == v310Var.e && Intrinsics.d(this.f, v310Var.f) && Intrinsics.d(this.g, v310Var.g) && Intrinsics.d(this.h, v310Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + dw9.a(dw9.a(rw2.b(ua80.b(twn.a(this.c, (this.b.hashCode() + (this.f36713a.hashCode() * 31)) * 31, 31), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LolStatisticMatchesMatchModel(blueTeam=");
        sb.append(this.f36713a);
        sb.append(", redTeam=");
        sb.append(this.b);
        sb.append(", durationSeconds=");
        kng0.w(this.c, ", startedAt=", this.d, ", endTimestamp=", sb);
        hne.x(sb, this.e, ", netWorthGraph=", this.f);
        hne.v(", expGraph=", ", objectKills=", sb, this.g, this.h);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
