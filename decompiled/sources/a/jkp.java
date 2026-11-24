package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class jkp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f16682a;
    public final String b;
    public final long c;
    public final boolean d;
    public boolean e;
    public final List f;

    public jkp(int i, long j, long j2, String str, List list, boolean z) {
        j2 = (i & 4) != 0 ? 0L : j2;
        z = (i & 8) != 0 ? false : z;
        list = (i & 32) != 0 ? iun.f15405a : list;
        str.getClass();
        list.getClass();
        this.f16682a = j;
        this.b = str;
        this.c = j2;
        this.d = z;
        this.e = false;
        this.f = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jkp)) {
            return false;
        }
        jkp jkpVar = (jkp) obj;
        return this.f16682a == jkpVar.f16682a && Intrinsics.d(this.b, jkpVar.b) && this.c == jkpVar.c && this.d == jkpVar.d && this.e == jkpVar.e && this.f.equals(jkpVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + brm0.e(brm0.e(rw2.b(ua80.b(Long.hashCode(this.f16682a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        boolean z = this.e;
        StringBuilder sbO = axq.o(this.f16682a, "FeedSportModel(id=", ", name=", this.b);
        kng0.A(sbO, ", count=", this.c, ", isNew=");
        ua80.u(", checked=", ", tabs=", sbO, this.d, z);
        return dw9.r(sbO, this.f, Separators.RPAREN);
    }
}
