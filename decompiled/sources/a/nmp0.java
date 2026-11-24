package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class nmp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f23784a;
    public final String b;
    public final long c;
    public final List d;
    public final boolean e;
    public final boolean f;

    public nmp0(long j, String str, long j2, List list, boolean z, boolean z2) {
        list.getClass();
        this.f23784a = j;
        this.b = str;
        this.c = j2;
        this.d = list;
        this.e = z;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nmp0)) {
            return false;
        }
        nmp0 nmp0Var = (nmp0) obj;
        return this.f23784a == nmp0Var.f23784a && this.b.equals(nmp0Var.b) && this.c == nmp0Var.c && Intrinsics.d(this.d, nmp0Var.d) && this.e == nmp0Var.e && this.f == nmp0Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + brm0.e(dw9.a(rw2.b(rw2.b(ua80.b(Long.hashCode(this.f23784a) * 31, 31, this.b), 31, this.c), 31, 0L), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f23784a, "TeamSubscriptionScreenModel(id=", ", name=", this.b);
        kng0.A(sbO, ", sportId=", this.c, ", subSportId=0, images=");
        rz4.z(sbO, ", favorite=", this.d, ", subscribed=", this.e);
        return rw2.p(sbO, this.f, Separators.RPAREN);
    }
}
