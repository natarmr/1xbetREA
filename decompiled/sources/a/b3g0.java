package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b3g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f1903a;
    public final long b;
    public final boolean c;
    public final Object d;

    public b3g0(Object obj, long j, boolean z, List list) {
        this.f1903a = obj;
        this.b = j;
        this.c = z;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b3g0)) {
            return false;
        }
        b3g0 b3g0Var = (b3g0) obj;
        Object obj2 = b3g0Var.f1903a;
        e0g0 e0g0Var = j0g0.b;
        return Intrinsics.d(this.f1903a, obj2) && this.b == b3g0Var.b && this.c == b3g0Var.c && Intrinsics.d(this.d, b3g0Var.d);
    }

    public final int hashCode() {
        int iE = brm0.e(rw2.b(j0g0.b(this.f1903a) * 31, 31, this.b), 31, this.c);
        Object obj = this.d;
        return iE + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        StringBuilder sbO = f140.o(this.b, "ResultModel(result=", j0g0.d(this.f1903a), ", lastTimeUpdate=");
        sbO.append(", dataInitialized=");
        sbO.append(this.c);
        sbO.append(", cachedData=");
        sbO.append(this.d);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
