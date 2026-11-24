package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class xum0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41519a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;
    public final List f;

    public xum0(long j, long j2, long j3, String str, List list, boolean z) {
        list.getClass();
        this.f41519a = str;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = z;
        this.f = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xum0)) {
            return false;
        }
        xum0 xum0Var = (xum0) obj;
        return Intrinsics.d(this.f41519a, xum0Var.f41519a) && this.b == xum0Var.b && this.c == xum0Var.c && this.d == xum0Var.d && this.e == xum0Var.e && Intrinsics.d(this.f, xum0Var.f);
    }

    public final int hashCode() {
        String str = this.f41519a;
        return this.f.hashCode() + brm0.e(rw2.b(rw2.b(rw2.b((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbO = f140.o(this.b, "SubGame(fullName=", this.f41519a, ", id=");
        kng0.A(sbO, ", idMain=", this.c, ", sportId=");
        hne.t(this.d, ", hasMarkets=", sbO, this.e);
        return ohs0.s(sbO, ", marketGroup=", this.f, Separators.RPAREN);
    }
}
