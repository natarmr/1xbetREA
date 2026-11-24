package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class xcp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f40657a;
    public final tnp0 b;
    public final String c;
    public final String d;
    public final long e;
    public final List f;
    public final int g;
    public final boolean h;
    public final String i;

    public xcp(long j, tnp0 tnp0Var, String str, String str2, long j2, List list, int i, boolean z, String str3) {
        tnp0Var.getClass();
        list.getClass();
        this.f40657a = j;
        this.b = tnp0Var;
        this.c = str;
        this.d = str2;
        this.e = j2;
        this.f = list;
        this.g = i;
        this.h = z;
        this.i = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xcp)) {
            return false;
        }
        xcp xcpVar = (xcp) obj;
        return this.f40657a == xcpVar.f40657a && Intrinsics.d(this.b, xcpVar.b) && this.c.equals(xcpVar.c) && this.d.equals(xcpVar.d) && this.e == xcpVar.e && Intrinsics.d(this.f, xcpVar.f) && this.g == xcpVar.g && this.h == xcpVar.h && this.i.equals(xcpVar.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + brm0.e(twn.a(this.g, dw9.a(rw2.b(ua80.b(ua80.b((this.b.hashCode() + (Long.hashCode(this.f40657a) * 31)) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31), 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FavoriteTeamModel(id=");
        sb.append(this.f40657a);
        sb.append(", teamType=");
        sb.append(this.b);
        f140.v(sb, ", name=", this.c, ", sportName=", this.d);
        kng0.A(sb, ", sportId=", this.e, ", images=");
        brm0.v(this.g, ", gamesCount=", ", hasLiveGame=", sb, this.f);
        return twn.q(", statId=", this.i, Separators.RPAREN, sb, this.h);
    }
}
