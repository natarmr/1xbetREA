package a;

import android.gov.nist.core.Separators;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class rh50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30474a;
    public final fg50 b;
    public final List c;
    public final jg50 d;
    public final bi50 e;
    public final long f;
    public final String g;
    public final boolean h;
    public final String i;
    public final ni50 j;
    public final Map k;

    public rh50(String str, fg50 fg50Var, List list, jg50 jg50Var, bi50 bi50Var, long j, String str2, boolean z, String str3, ni50 ni50Var, Map map) {
        list.getClass();
        this.f30474a = str;
        this.b = fg50Var;
        this.c = list;
        this.d = jg50Var;
        this.e = bi50Var;
        this.f = j;
        this.g = str2;
        this.h = z;
        this.i = str3;
        this.j = ni50Var;
        this.k = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rh50)) {
            return false;
        }
        rh50 rh50Var = (rh50) obj;
        return this.f30474a.equals(rh50Var.f30474a) && Intrinsics.d(this.b, rh50Var.b) && Intrinsics.d(this.c, rh50Var.c) && Intrinsics.d(this.d, rh50Var.d) && Intrinsics.d(this.e, rh50Var.e) && this.f == rh50Var.f && this.g.equals(rh50Var.g) && this.h == rh50Var.h && this.i.equals(rh50Var.i) && Intrinsics.d(this.j, rh50Var.j) && this.k.equals(rh50Var.k);
    }

    public final int hashCode() {
        int iHashCode = this.f30474a.hashCode() * 31;
        fg50 fg50Var = this.b;
        int iA = dw9.a((iHashCode + (fg50Var == null ? 0 : fg50Var.hashCode())) * 31, 31, this.c);
        jg50 jg50Var = this.d;
        int iHashCode2 = (iA + (jg50Var == null ? 0 : jg50Var.hashCode())) * 31;
        bi50 bi50Var = this.e;
        int iB = ua80.b(brm0.e(ua80.b(rw2.b((iHashCode2 + (bi50Var == null ? 0 : bi50Var.hashCode())) * 31, 31, this.f), 31, this.g), 31, this.h), 31, this.i);
        ni50 ni50Var = this.j;
        return this.k.hashCode() + ((iB + (ni50Var != null ? ni50Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NearestGameDetailsScoresModel(fullScore=");
        sb.append(this.f30474a);
        sb.append(", extendedScore=");
        sb.append(this.b);
        sb.append(", periodScores=");
        sb.append(this.c);
        sb.append(", fullScoreDetail=");
        sb.append(this.d);
        sb.append(", subScore=");
        sb.append(this.e);
        sb.append(", serve=");
        sb.append(this.f);
        w6x.z(", info=", this.g, ", isBreak=", sb, this.h);
        sb.append(", currentPeriodName=");
        sb.append(this.i);
        sb.append(", timer=");
        sb.append(this.j);
        sb.append(", tableStats=");
        sb.append(this.k);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
