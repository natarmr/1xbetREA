package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class mmp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f22052a;
    public final String b;
    public final long c;
    public final List d;

    public mmp0(long j, long j2, String str, List list) {
        list.getClass();
        this.f22052a = j;
        this.b = str;
        this.c = j2;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mmp0)) {
            return false;
        }
        mmp0 mmp0Var = (mmp0) obj;
        return this.f22052a == mmp0Var.f22052a && this.b.equals(mmp0Var.b) && this.c == mmp0Var.c && Intrinsics.d(this.d, mmp0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + rw2.b(ua80.b(Long.hashCode(this.f22052a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f22052a, "TeamSubscriptionModel(id=", ", name=", this.b);
        kng0.A(sbO, ", sportId=", this.c, ", images=");
        return dw9.r(sbO, this.d, Separators.RPAREN);
    }
}
