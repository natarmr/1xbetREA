package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g9l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aac f10919a;
    public final long b;
    public final long c;
    public final jwb d;
    public final long e;
    public final long f;
    public final List g;

    public g9l(aac aacVar, long j, long j2, jwb jwbVar, long j3, long j4, List list) {
        list.getClass();
        this.f10919a = aacVar;
        this.b = j;
        this.c = j2;
        this.d = jwbVar;
        this.e = j3;
        this.f = j4;
        this.g = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g9l)) {
            return false;
        }
        g9l g9lVar = (g9l) obj;
        return this.f10919a.equals(g9lVar.f10919a) && znq0.e(this.b, g9lVar.b) && this.c == g9lVar.c && this.d.equals(g9lVar.d) && this.e == g9lVar.e && this.f == g9lVar.f && Intrinsics.d(this.g, g9lVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + rw2.b(rw2.b((this.d.hashCode() + rw2.b(rw2.b(this.f10919a.hashCode() * 31, 31, this.b), 31, this.c)) * 31, 31, this.e), 31, this.f);
    }

    public final String toString() {
        String strH = znq0.h(this.b);
        StringBuilder sb = new StringBuilder("DotaStatisticDetailsModel(gameStatus=");
        sb.append(this.f10919a);
        sb.append(", startGameTime=");
        sb.append(strH);
        sb.append(", roshanRespawnTimer=");
        sb.append(this.c);
        sb.append(", tormentorRespawnTimer=");
        sb.append(this.d);
        kng0.A(sb, ", towerState=", this.e, ", barrackState=");
        hne.x(sb, this.f, ", picksList=", this.g);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
