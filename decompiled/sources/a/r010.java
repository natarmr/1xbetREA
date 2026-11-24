package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class r010 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f29606a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;
    public final int g;
    public final int h;
    public final List i;
    public final q010 j;

    public r010(long j, int i, String str, String str2, String str3, long j2, int i2, int i3, List list, q010 q010Var) {
        list.getClass();
        this.f29606a = j;
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = j2;
        this.g = i2;
        this.h = i3;
        this.i = list;
        this.j = q010Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r010)) {
            return false;
        }
        r010 r010Var = (r010) obj;
        return this.f29606a == r010Var.f29606a && this.b == r010Var.b && this.c.equals(r010Var.c) && this.d.equals(r010Var.d) && this.e.equals(r010Var.e) && this.f == r010Var.f && this.g == r010Var.g && this.h == r010Var.h && Intrinsics.d(this.i, r010Var.i) && this.j.equals(r010Var.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + dw9.a(twn.a(this.h, twn.a(this.g, rw2.b(ua80.b(ua80.b(ua80.b(twn.a(this.b, Long.hashCode(this.f29606a) * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31), 31), 31, this.i);
    }

    public final String toString() {
        StringBuilder sbQ = brm0.q(this.b, this.f29606a, "LolHeroesStatisticModel(heroId=", ", heroLevel=");
        f140.v(sbQ, ", heroName=", this.c, ", heroImage=", this.d);
        hne.B(sbQ, ", playerName=", this.e, ", respawnTimer=");
        ua80.v(sbQ, this.f, ", positionX=", this.g);
        sbQ.append(", positionY=");
        sbQ.append(this.h);
        sbQ.append(", items=");
        sbQ.append(this.i);
        sbQ.append(", heroStatisticInfo=");
        sbQ.append(this.j);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
