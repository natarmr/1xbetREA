package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class z3l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f43724a;
    public final int b;
    public final int c;
    public final String d;
    public final List e;
    public final String f;

    public z3l(int i, int i2, long j, String str, String str2, List list) {
        list.getClass();
        this.f43724a = j;
        this.b = i;
        this.c = i2;
        this.d = str;
        this.e = list;
        this.f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z3l)) {
            return false;
        }
        z3l z3lVar = (z3l) obj;
        return this.f43724a == z3lVar.f43724a && this.b == z3lVar.b && this.c == z3lVar.c && this.d.equals(z3lVar.d) && Intrinsics.d(this.e, z3lVar.e) && this.f.equals(z3lVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + dw9.a(ua80.b(twn.a(this.c, twn.a(this.b, Long.hashCode(this.f43724a) * 31, 31), 31), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbQ = brm0.q(this.b, this.f43724a, "DotaHeroAbilityModel(id=", ", level=");
        w6x.w(this.c, ", maxLevel=", ", name=", this.d, sbQ);
        sbQ.append(", build=");
        sbQ.append(this.e);
        sbQ.append(", abilityImage=");
        sbQ.append(this.f);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
