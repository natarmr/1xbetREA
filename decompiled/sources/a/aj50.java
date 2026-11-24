package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class aj50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f958a;
    public final fg50 b;
    public final List c;
    public final jg50 d;
    public final bi50 e;
    public final long f;
    public final String g;
    public final boolean h;
    public final String i;

    public aj50(String str, fg50 fg50Var, List list, jg50 jg50Var, bi50 bi50Var, long j, String str2, boolean z, String str3) {
        list.getClass();
        this.f958a = str;
        this.b = fg50Var;
        this.c = list;
        this.d = jg50Var;
        this.e = bi50Var;
        this.f = j;
        this.g = str2;
        this.h = z;
        this.i = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aj50)) {
            return false;
        }
        aj50 aj50Var = (aj50) obj;
        return this.f958a.equals(aj50Var.f958a) && Intrinsics.d(this.b, aj50Var.b) && Intrinsics.d(this.c, aj50Var.c) && Intrinsics.d(this.d, aj50Var.d) && Intrinsics.d(this.e, aj50Var.e) && this.f == aj50Var.f && this.g.equals(aj50Var.g) && this.h == aj50Var.h && this.i.equals(aj50Var.i);
    }

    public final int hashCode() {
        int iHashCode = this.f958a.hashCode() * 31;
        fg50 fg50Var = this.b;
        int iA = dw9.a((iHashCode + (fg50Var == null ? 0 : fg50Var.hashCode())) * 31, 31, this.c);
        jg50 jg50Var = this.d;
        int iHashCode2 = (iA + (jg50Var == null ? 0 : jg50Var.hashCode())) * 31;
        bi50 bi50Var = this.e;
        return this.i.hashCode() + brm0.e(ua80.b(rw2.b((iHashCode2 + (bi50Var != null ? bi50Var.hashCode() : 0)) * 31, 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NearestGameScoreModel(fullScore=");
        sb.append(this.f958a);
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
        return rw2.o(sb, ", currentPeriodName=", this.i, Separators.RPAREN);
    }
}
